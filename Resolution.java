package db_hud;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;

public class Resolution extends Dialog {

	public static Object result;
	public static Shell resDialog;
	public static Combo combo_ratio;
	public static Combo combo_res;
	public static Button btnOkay;
	

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */

	public Resolution(Shell parent) {
		super(parent);
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public static Object open() {
		createContents();
		resDialog.open();
		resDialog.layout();
		Display display = resDialog.getDisplay();
		while (!resDialog.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
		
	}

	/**
	 * Create contents of the dialog.
	 */
	private static void createContents() {
		resDialog = new Shell(resDialog);
		resDialog.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		resDialog.setSize(450, 260);
		resDialog.setText("Select Resolution");
		resDialog.setImage(HUD_Maker.icon);
		
		Label lbl_selectRes = new Label(resDialog, SWT.NONE);
		lbl_selectRes.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_selectRes.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_selectRes.setBounds(164, 23, 106, 15);
		lbl_selectRes.setText("Select Resolution");
		
		Label lbl_ratio = new Label(resDialog, SWT.NONE);
		lbl_ratio.setBounds(96, 63, 55, 15);
		lbl_ratio.setText("Ratio");
		lbl_ratio.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		Label lbl_res = new Label(resDialog, SWT.NONE);
		lbl_res.setText("Resolution");
		lbl_res.setBounds(96, 97, 66, 15);
		lbl_res.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		combo_res = new Combo(resDialog, SWT.DROP_DOWN | SWT.READ_ONLY);
		combo_res.setEnabled(false);
		combo_res.setBounds(168, 92, 169, 23);
		
		combo_ratio = new Combo(resDialog, SWT.DROP_DOWN | SWT.READ_ONLY);
		combo_ratio.setItems(new String[] {"4:3", "5:3", "5:4", "16:9", "16:10"});
		combo_ratio.setBounds(168, 60, 169, 23);
		combo_ratio.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				if (combo_ratio.getText().equals("4:3")){
					combo_res.setEnabled(true);
					combo_res.setItems(new String[] {"800 x 600", "1024 x 768", "1152 x 864", "1280 x 960", "1600 x 1200"});
				}
				
				else if (combo_ratio.getText().equals("5:3")){
					combo_res.setEnabled(true);
					combo_res.setItems(new String[] {"1280 x 768"});
				}
				
				else if (combo_ratio.getText().equals("5:4")){
					combo_res.setEnabled(true);
					combo_res.setItems(new String[] {"720 x 560", "1280 x 1024"});
				}
				else if (combo_ratio.getText().equals("16:9")){
					combo_res.setEnabled(true);
					combo_res.setItems(new String[] {"1280 x 720", "1360 x 768", "1366 x 768", "1536 x 864", "1600 x 900", "1920 x 1080", "2560 x 1440", "3840 x 2160"});
				}
				else if (combo_ratio.getText().equals("16:10")){
					combo_res.setEnabled(true);
					combo_res.setItems(new String[] {"1280 x 800", "1440 x 900", "1680 x 1050", "1920 x 1200", "2560 x 1600"});
				}
				else{
					combo_res.setEnabled(false);
				}
			}
		});
		
		btnOkay = new Button(resDialog, SWT.NONE);
		btnOkay.setBounds(182, 136, 75, 25);
		btnOkay.setText("Okay");
		
		Label lblNoteThisIs = new Label(resDialog, SWT.NONE);
		lblNoteThisIs.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblNoteThisIs.setForeground(SWTResourceManager.getColor(SWT.COLOR_RED));
		lblNoteThisIs.setAlignment(SWT.CENTER);
		lblNoteThisIs.setBounds(10, 170, 424, 51);
		lblNoteThisIs.setText("Note: This is an INDEV Version. Some features are either incomplete or\r\nunimplemented. If any bugs are found, please report to the forums.\r\nThis tool is regularly updated, please check the forums often.");
		btnOkay.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				//			4:3 Ratio
				if (combo_res.getText().equals("800 x 600")){HUD_Maker.compX = 400; HUD_Maker.compY = 300; HUD_Maker.mPlusX = 112;}
				else if (combo_res.getText().equals("1024 x 768")){HUD_Maker.compX = 512; HUD_Maker.compY = 393; HUD_Maker.mPlusX = 65; HUD_Maker.plusY = 40; HUD_Maker.sizeY = 700;}
				else if (combo_res.getText().equals("1152 x 864")){HUD_Maker.compX = 576; HUD_Maker.compY = 432; HUD_Maker.mPlusX = 40; HUD_Maker.sizeY = 740; HUD_Maker.plusY = 80;}
				else if (combo_res.getText().equals("1280 x 960")){HUD_Maker.compX = 640; HUD_Maker.compY = 480; HUD_Maker.mPlusX = 5; HUD_Maker.sizeY = 780; HUD_Maker.plusY = 120;}
				else if (combo_res.getText().equals("1600 x 1200")){HUD_Maker.compX = 800; HUD_Maker.compY = 600; HUD_Maker.plusX = 100; HUD_Maker.plusY = 270; HUD_Maker.sizeY = 950; HUD_Maker.sizeX = 1100;}
				//			5:3 Ratio
				else if (combo_res.getText().equals("1280 x 768")){HUD_Maker.compX = 640; HUD_Maker.compY = 384; HUD_Maker.mPlusX = 5; HUD_Maker.mPlusY = 15; HUD_Maker.sizeY = 740; HUD_Maker.plusY = 80;}
				//			5:4 Ratio
				else if (combo_res.getText().equals("720 x 560")){HUD_Maker.compX = 360; HUD_Maker.compY = 280; HUD_Maker.mPlusX = 140; HUD_Maker.mPlusY = 30;}
				else if (combo_res.getText().equals("1280 x 1024")){HUD_Maker.compX = 640; HUD_Maker.compY = 512; HUD_Maker.mPlusX = 5; HUD_Maker.mPlusY = 15; HUD_Maker.sizeY = 840; HUD_Maker.plusY = 180;}
				//			16:9 Ratio
				else if (combo_res.getText().equals("1280 x 720")){HUD_Maker.compX = 640; HUD_Maker.compY = 360; HUD_Maker.plusX = 0; HUD_Maker.plusY = 0;}
				else if (combo_res.getText().equals("1360 x 768")){HUD_Maker.compX = 680; HUD_Maker.compY = 384; HUD_Maker.sizeX = 992; HUD_Maker.sizeY = 690; HUD_Maker.plusX = 27; HUD_Maker.plusY = 30;}
				else if (combo_res.getText().equals("1366 x 768")){HUD_Maker.compX = 683; HUD_Maker.compY = 384; HUD_Maker.sizeX = 995; HUD_Maker.sizeY = 690; HUD_Maker.plusX = 30; HUD_Maker.plusY = 30;}
				else if (combo_res.getText().equals("1536 x 864")){HUD_Maker.compX = 768; HUD_Maker.compY = 432; HUD_Maker.sizeX = 1050; HUD_Maker.sizeY = 760; HUD_Maker.plusX = 60; HUD_Maker.plusY = 80;}
				else if (combo_res.getText().equals("1600 x 900")){HUD_Maker.compX = 800; HUD_Maker.compY = 450; HUD_Maker.sizeX = 1100; HUD_Maker.sizeY = 800; HUD_Maker.plusX = 87; HUD_Maker.plusY = 120;}
				else if (combo_res.getText().equals("1920 x 1080")){HUD_Maker.compX = 960; HUD_Maker.compY = 540; HUD_Maker.sizeX = 1260; HUD_Maker.sizeY = 880; HUD_Maker.plusX = 170; HUD_Maker.plusY = 200;}
				else if (combo_res.getText().equals("2560 x 1440")){HUD_Maker.compX = 1280; HUD_Maker.compY = 720; HUD_Maker.sizeX = 1570; HUD_Maker.sizeY = 1100; HUD_Maker.plusX = 300; HUD_Maker.plusY = 370;}
				else if (combo_res.getText().equals("3840 x 2160")){HUD_Maker.compX = 1920; HUD_Maker.compY = 1080; HUD_Maker.sizeX = 2200; HUD_Maker.sizeY = 1600; HUD_Maker.plusX = 499; HUD_Maker.plusY = 800;}
				//			16:10 Ratio
				else if (combo_res.getText().equals("1280 x 800")){HUD_Maker.compX = 640; HUD_Maker.compY = 400; HUD_Maker.sizeY = 690; HUD_Maker.plusY = 40;}
				else if (combo_res.getText().equals("1440 x 900")){HUD_Maker.compX = 720; HUD_Maker.compY = 450; HUD_Maker.sizeX = 1050; HUD_Maker.sizeY = 770; HUD_Maker.plusX = 100; HUD_Maker.plusY = 115;}
				else if (combo_res.getText().equals("1680 x 1050")){HUD_Maker.compX = 840; HUD_Maker.compY = 525; HUD_Maker.sizeX = 1150; HUD_Maker.sizeY = 870; HUD_Maker.plusX = 115; HUD_Maker.plusY = 200;}
				else if (combo_res.getText().equals("1920 x 1200")){HUD_Maker.compX = 960; HUD_Maker.compY = 600; HUD_Maker.sizeX = 1260; HUD_Maker.sizeY = 950; HUD_Maker.plusX = 170; HUD_Maker.plusY = 270;}
				else if (combo_res.getText().equals("2560 x 1600")){HUD_Maker.compX = 1280; HUD_Maker.compY = 900; HUD_Maker.sizeX = 1600; HUD_Maker.sizeY = 1150; HUD_Maker.plusX = 300; HUD_Maker.plusY = 560;}
				
				else {HUD_Maker.compX = 640; HUD_Maker.compY = 360; HUD_Maker.plusX = 0; HUD_Maker.plusY = 0;}
				
				resDialog.close();
			}
		});

	}
}
