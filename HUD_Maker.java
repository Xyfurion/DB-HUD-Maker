package db_hud;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
//import org.eclipse.swt.graphics.Image;

/**
 * 
 * @author Xyfurion
 * Licensed Under Creative Commons License (ND, NC)
 * You may NOT use this source code for any commercial use.
 * You may copy, use, and display if and only if credit is given to Author.
 * You may NOT alter and redistribute without explicit permission from Author.
 * 		Started work: 17th December 2015.
 * 		Dev Version 1.0 Completion: 29th January 2016.
 *
 */


public class HUD_Maker {
	
	//Declaring the Assets
	
	protected static Shell App_UI;
	
	public static Display d = new Display();
	public static Shell s = new Shell(d);
	
	public static Spinner pox;
	public static Spinner poy;
	public static Spinner sox;
	public static Spinner soy;
	public static Spinner value;
	
	public static Display display;
	
	public static Image icon = new Image(display, "bin/db_hud/images/HUD_Maker_ICON.ico");
	
	public static Composite HUD_MiniPreview;
	public static Composite colorPreview;
	
	public static String version = "(InDev 1.0.2)";
	public static String selection;
	
	public static int type;
	public static int compX = 640, compY = 360;
	public static int sizeX = 950, sizeY = 650;
	public static int plusX = 14;
	public static int plusY = 0;
	public static int mPlusX = 0;
	public static int mPlusY = 0;
	
	public static Combo HUD_Asset;
	public static Combo Attach_H;
	public static Combo Attach_V;
	public static Combo Align_H;
	public static Combo Align_V;
	public static Combo select_preset;
	public static Combo combo_relativeTo;
	
	public static Button btn_color;
	public static Button btn_load;
	public static Button btn_save;
	public static Button btn_updates;
	public static Button btnPreview;
	public static Button btn_changeRes;
	public static Button btn_modeInGame;
	public static Button btn_modeWarmup;
	public static Button btn_modeExe;
	public static Button btn_modeIncap;
	public static Button btn_modeSpectator;
	public static Button btn_reset;
	public static Button btn_resetAll;
	public static Button btn_editor;
	
	public static Scanner ShooterUI;
	
	public static String[] newShooterUI;
	
	public static Label line2;
	public static Label line3;
	public static Label line1;
	
	public static Asset cr; //Current Reference
	
	public static final String Top = "HA_TOP";
	public static final String Center = "HA_CENTER";
	public static final String Bottom = "HA_BOTTOM";
	public static final String Right = "HA_RIGHT";
	public static final String Left = "HA_LEFT";
	
	public static final String cTop = "Top";
	public static final String cCenter = "Center";
	public static final String cBottom = "Bottom";
	public static final String cRight = "Right";
	public static final String cLeft = "Left";
	
	//Declaring Assets
	
	//HUD
	
	public static Asset ScopeInfo = new Asset();
	public static Asset CnslMsgLog = new Asset();
	public static Asset SpcCnslMsgLog = new Asset();
	public static Asset ChatInput = new Asset();
	public static Asset SpcChatInput = new Asset();
	public static Asset IncapMenu = new Asset();
	public static Asset ObjPro = new Asset();
	public static Asset ObjProNtf = new Asset();
	public static Asset ObjClock = new Asset();
	public static Asset MiniMap = new Asset();
	public static Asset ObitMsg = new Asset();
	public static Asset IntFillBar = new Asset();
	public static Asset XpCounter = new Asset();
	public static Asset GameplayNtf = new Asset();
	public static Asset Subtitles = new Asset();
	public static Asset ObjNtf = new Asset();
	public static Asset GameInfo = new Asset();
	public static Asset SpcInfo = new Asset();
	public static Asset Detected = new Asset();
	public static Asset WeaponAmmo = new Asset();
	public static Asset AbilityCooldown = new Asset();
	public static Asset CarryBomb = new Asset();
	public static Asset PlayerHealth = new Asset();
	public static Asset ShieldBar = new Asset();
	public static Asset ReadyUp = new Asset();
	public static Asset BadgeNtf = new Asset();
	public static Asset DeathInfoCard = new Asset();
	public static Asset SpcGameWaveTimer = new Asset();
	public static Asset GameWaveTimer = new Asset();
	public static Asset ObjPos = new Asset();
	public static Asset SpcObjPos = new Asset();
	public static Asset ActionMenu = new Asset();
	public static Asset SpcActionMenu = new Asset();
	public static Asset CharSelect = new Asset();
	public static Asset SpcCard = new Asset();
	public static Asset ExeGameStat = new Asset();
	public static Asset ExeCountDown = new Asset();
	public static Asset ExeRoundNtf = new Asset();
	public static Asset ExeRoundIntro = new Asset();
	
	//Color
	
	public static Asset AllyColor = new Asset();
	public static Asset AllyColor2 = new Asset();
	public static Asset EnemyColor = new Asset();
	public static Asset NeutralColor = new Asset();
	public static Asset NeutralColor2 = new Asset();
	public static Asset AIColor = new Asset();
	public static Asset PrimaryObjColor = new Asset();
	public static Asset AmmoColor = new Asset();
	public static Asset LowAmmoColor = new Asset();
	public static Asset LowAmmoColor2 = new Asset();
	public static Asset NoAmmoColor = new Asset();
	public static Asset GrenadeBlinkColor = new Asset();
	public static Asset GrenadeBlinkColor2 = new Asset();
	public static Asset GrenadeOOVColor1 = new Asset();
	public static Asset GrenadeOOVColor2 = new Asset();
	public static Asset PrimaryPerformerColor = new Asset();
	public static Asset MapIconPrimaryColor = new Asset();
	public static Asset MapIconSecondaryColor = new Asset();
	public static Asset AlliedColor = new Asset();
	public static Asset EnemyColor2 = new Asset();
	public static Asset HighlightedBGColor = new Asset();
	public static Asset DefaultBGColor = new Asset();
	public static Asset BlinkColor = new Asset();
	
	
	//Other Values
	


	//Functions
	
	public static class Save implements SelectionListener {
	      public void widgetSelected(SelectionEvent event) {
	        FileDialog fd = new FileDialog(s, SWT.SAVE);
	        fd.setText("Save Preset");
	        fd.setFilterPath("C:/");
	        fd.setFileName("ShooterUI");
	        fd.setOverwrite(true);
	        String[] fileExt = {"*.ini"};
	        fd.setFilterExtensions(fileExt);
	        selection = fd.open();
	        System.out.println(selection);
	        }
	      
	      public void widgetDefaultSelected(SelectionEvent event) {
	    	  
	      }
	      
	    }
	
	
	
	
	
	/**
	 * Launch the application.
	 * @param args
	 * @throws FileNotFoundException 
	 * @throws IOException
	 */
	
	/* -- START MAIN -- */
	public static void main(String[] args) throws FileNotFoundException {
		
		
		//Open Res dialog
		Resolution.open();
		defaultVariables();
		System.out.println(System.getProperty("user.dir"));
		
		
		//Declare and initialize window
		try {
			HUD_Maker window = new HUD_Maker();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/* -- END MAIN -- */
	
	/*
	 * To Do List:
	 * 		 -- DEV VERSION 1--
	 * - Change posX and posY to absolute value (not relative coordinates)
	 * - Create Color Window
	 * - Add all Assets
	 * - Add Color Window and Color Stuff
	 * - Adjust values based on trial and error testing, and by math
	 * - Create Save Function
	 * - All Basic Stuff
	 * - Refine Resolution Window
	 * 
	 * 		--ANY TIME GAME HUD IS CHANGED DUE TO UPDATE, FIX DEFAULT TO MATCH GAME DEFAULT--
	 * 
	 * 		--MINIVERSION(S)--
	 * - Bug fixes
	 * - Minor changes
	 * - Reset Function, Reset All Function (?)
	 * - Other small functions
	 * 
	 * 		--VERSION 1--
	 * 
	 * - New Functions: Load Preset, Reset, Reset All, Presets, Change Resolution, Preview, Check for Updates...
	 * - Pimp GUI
	 * - Make Editor Window
	 * - Make Preview Window
	 * - Make MiniPreview functional
	 * - When Right Click on Asset in Editor, Menu should appear to change alignment, attachment, etc...
	 * 
	 * 		--MINIVERSION--
	 * - New modes (Spectator, incapacitated, Execution)
	 * 
	 * 		--VERSION 2--
	 * - GUI Update (Insert Custom Look and Feel?)
	 * - More Features To Be Determined
	 * - Bug fixes...
	 * - Additional Expansion (Colors, HUD Assets, Resolutions, Change up GUI)
	 * 
	 * 			--UPDATE AS THE GAME UPDATES--
	 * 
	 */

	 //Open the window
	public void open() {
		
		display = Display.getDefault();
		createContents();
		App_UI.open();
		App_UI.layout();
		while (!App_UI.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		
		
	}
	
	
	protected static void defaultVariables(){
		//Setting the Default variables
		
		//Type 1 has posX, posY, Align, Attach
		//Type 2 has posX, posY, sosX, sosY, Align, Attach
		//Type 3 has Other Value (blink speed, Amount, etc...)
		//Type 4 has Color (RGBa)
		
		ScopeInfo.Name = "ScopeInfoPosition"; ScopeInfo.posX = 0; ScopeInfo.posY = 500; ScopeInfo.AlignH = Center; ScopeInfo.AlignV = Top; ScopeInfo.AttachH = Center; ScopeInfo.AttachV = Top; 
		CnslMsgLog.Name = "ConsoleMessageLogPosition"; CnslMsgLog.posX = 0; CnslMsgLog.posY = 0; CnslMsgLog.AlignH = Left; CnslMsgLog.AlignV = Bottom; CnslMsgLog.AttachH = Left; CnslMsgLog.AttachV = Top;
		SpcCnslMsgLog.Name = "SpectatorConsoleMessageLog"; SpcCnslMsgLog.posX = 0; SpcCnslMsgLog.posY = 0; SpcCnslMsgLog.AlignH = Left; SpcCnslMsgLog.AlignV = Top; SpcCnslMsgLog.AttachH = Left; SpcCnslMsgLog.AttachV = Bottom;
		ChatInput.Name = "ChatInputPosition"; ChatInput.posX = 0; ChatInput.posY = -2; ChatInput.AlignH = Left; ChatInput.AlignV = Bottom; ChatInput.AttachH = Left; ChatInput.AttachV = Top;
		SpcChatInput.Name = "SpectatorChatInputPosition"; SpcChatInput.posX = 0; SpcChatInput.posY = -1; SpcChatInput.AlignH = Left; SpcChatInput.AlignV = Bottom; SpcChatInput.AttachH = Left; SpcChatInput.AttachV = Top;
		IncapMenu.Name = "IncapMenuPosition"; IncapMenu.posX = 0; IncapMenu.posY = 0; IncapMenu.AlignH = Center; IncapMenu.AlignV = Bottom; IncapMenu.AttachH = Center; IncapMenu.AttachV = Top;
		ObjPro.Name = "ObjectiveProgressionPosition"; ObjPro.posX = 25; ObjPro.posY = 100; ObjPro.AlignH = Left; ObjPro.AlignV = Top; ObjPro.AttachH = Left; ObjPro.AttachV = Top;
		ObjProNtf.Name = "ObjectivePorgressionNotificationPosition"; ObjProNtf.posX = 0; ObjProNtf.posY = -100; ObjProNtf.AlignH = Center; ObjProNtf.AlignV = Center; ObjProNtf.AttachH = Center; ObjProNtf.AttachV = Center; 
		ObjClock.Name = "ObjectiveClockPosition"; ObjClock.posX = 0; ObjClock.posY = 25; ObjClock.AlignH = Center; ObjClock.AlignV = Top; ObjClock.AttachH = Center; ObjClock.AttachV = Top;
		MiniMap.Name = "MinimapPosition"; MiniMap.posX = 39; MiniMap.posY = 13; MiniMap.AlignH = Left; MiniMap.AlignV = Bottom; MiniMap.AttachH = Left; MiniMap.AttachV = Bottom;
		ObitMsg.Name = "ObituaryMessageLogPosition"; ObitMsg.posX = 20; ObitMsg.posY = 60; ObitMsg.AlignH = Right; ObitMsg.AlignV = Top; ObitMsg.AttachH = Right; ObitMsg.AttachV = Top;
		IntFillBar.Name = "InteractionFillbarPosition"; IntFillBar.posX = 0; IntFillBar.posY = 0; IntFillBar.AlignH = Center; IntFillBar.AlignV = Center; IntFillBar.AttachH = Center; IntFillBar.AttachV = Center;
		XpCounter.Name = "ExpCounterPosition"; XpCounter.posX = 0; XpCounter.posY = 200; XpCounter.sosX = -1; XpCounter.sosY = -1; XpCounter.AlignH = Center; XpCounter.AlignV = Top; XpCounter.AttachH = Center; XpCounter.AttachV = Center;
		GameplayNtf.Name = "GameplayNotificationPosition"; GameplayNtf.posX = 0; GameplayNtf.posY = -20; GameplayNtf.sosX = -1; GameplayNtf.sosY = -1; GameplayNtf.AlignH = Center; GameplayNtf.AlignV = Top; GameplayNtf.AttachH = Center; GameplayNtf.AttachV = Top;
		Subtitles.Name = "SubtitlesPosition"; Subtitles.posX = 0; Subtitles.posY = 0; Subtitles.AlignH = Left; Subtitles.AlignV = Center; Subtitles.AttachH = Center; Subtitles.AttachV = Top;
		ObjNtf.Name = "ObjectiveProgressionNotification"; ObjNtf.posX = 0; ObjNtf.posY = 150; ObjNtf.sosX = -1; ObjNtf.sosY = -1; ObjNtf.AlignH = Center; ObjNtf.AlignV = Top; ObjNtf.AttachH = Center; ObjNtf.AttachV = Top;
		GameInfo.Name = "GameInfoPosition"; GameInfo.posX = 0; GameInfo.posY = 0; GameInfo.AlignH = Center; GameInfo.AlignV = Top; GameInfo.AttachH = Center; GameInfo.AttachV = Top;
		SpcInfo.Name = "SpectatorInfoPosition"; SpcInfo.posX = 0; SpcInfo.posY = 150; SpcInfo.sosX = -1; SpcInfo.sosY = -1; SpcInfo.AlignH = Center; SpcInfo.AlignV = Bottom; SpcInfo.AttachH = Center; SpcInfo.AttachV = Bottom;
		Detected.Name = "DetectedNotificationPosition"; Detected.posX = 0; Detected.posY = 100; Detected.AlignH = Center; Detected.AlignV = Center; Detected.AttachH = Center; Detected.AttachV = Bottom;
		WeaponAmmo.Name = "WeaponAmmoPosition"; WeaponAmmo.posX = 20; WeaponAmmo.posY = 57; WeaponAmmo.sosX = -1; WeaponAmmo.sosY = -1; WeaponAmmo.AlignH = Right; WeaponAmmo.AlignV = Bottom; WeaponAmmo.AttachH = Right; WeaponAmmo.AttachV = Bottom;
		AbilityCooldown.Name = "AbilityCooldownPosition"; AbilityCooldown.posX = 20; AbilityCooldown.posY = 93; AbilityCooldown.sosX = -1; AbilityCooldown.sosY = -1; AbilityCooldown.AlignH = Right; AbilityCooldown.AlignV = Bottom; AbilityCooldown.AttachH = Right; AbilityCooldown.AttachV = Bottom;
		CarryBomb.Name = "CarryBombPosition"; CarryBomb.posX = 20; CarryBomb.posY = 122; CarryBomb.sosX = -1; CarryBomb.sosY = -1; CarryBomb.AlignH = Right; CarryBomb.AlignV = Bottom; CarryBomb.AttachH = Right; CarryBomb.AttachV = Bottom;
		PlayerHealth.Name = "PlayerHealthPosition"; PlayerHealth.posX = 20; PlayerHealth.posY = 12; PlayerHealth.sosX = -1; PlayerHealth.sosY = -1; PlayerHealth.AlignH = Right; PlayerHealth.AlignV = Bottom; PlayerHealth.AttachH = Right; PlayerHealth.AttachV = Bottom;
		ShieldBar.Name = "ShieldBarPosition"; ShieldBar.posX = 0; ShieldBar.posY = 100; ShieldBar.sosX = -1; ShieldBar.sosY = -1; ShieldBar.AlignH = Center; ShieldBar.AlignV = Bottom; ShieldBar.AttachH = Center; ShieldBar.AttachV = Bottom;
		ReadyUp.Name = "ReadyUpPosition"; ReadyUp.posX = 0;  ReadyUp.posY = 0; ReadyUp.AlignH = Center; ReadyUp.AlignV = Top; ReadyUp.AttachH = Center; ReadyUp.AttachV = Top; 
		BadgeNtf.Name = "BadgeNotificationPosition"; BadgeNtf.posX = 0; BadgeNtf.posY = 0; BadgeNtf.AlignH = Center; BadgeNtf.AlignV = Center; BadgeNtf.AttachH = Center; BadgeNtf.AttachV = Top;
		DeathInfoCard.Name = "DeathInfoCardrd Position"; DeathInfoCard.posX = 0; DeathInfoCard.posY = 0; DeathInfoCard.AlignH = Center; DeathInfoCard.AlignV = Bottom; DeathInfoCard.AttachH = Center; DeathInfoCard.AttachV = Bottom;
		SpcGameWaveTimer.Name = "SpectatorGameWaveTimerPosition"; SpcGameWaveTimer.posX = 0; SpcGameWaveTimer.posY = 0; SpcGameWaveTimer.AlignH = Center; SpcGameWaveTimer.AlignV = Top; SpcGameWaveTimer.AttachH = Center; SpcGameWaveTimer.AttachV = Top;
		GameWaveTimer.Name = "GameWaveTimerPosition"; GameWaveTimer.posX = 0; GameWaveTimer.posY = 60; GameWaveTimer.AlignH = Left; GameWaveTimer.AlignV = Top; GameWaveTimer.AttachH = Left; GameWaveTimer.AttachV = Top;
		ObjPos.Name = "ObjectivePosition"; ObjPos.posX = 0; ObjPos.posY = 105; ObjPos.AlignH = Left; ObjPos.AlignV = Top; ObjPos.AttachH = Left; ObjPos.AttachV = Top;
		SpcObjPos.Name = "SpectatorObjectivePosition"; SpcObjPos.posX = 0; SpcObjPos.posY = 0; SpcObjPos.AlignH = Center; SpcObjPos.AlignV = Top; SpcObjPos.AttachH = Center; SpcObjPos.AttachV = Top;
		ActionMenu.Name = "ActionMenuPosition"; ActionMenu.posX = 0; ActionMenu.posY = -2; ActionMenu.AlignH = Left; ActionMenu.AlignV = Top; ActionMenu.AttachH = Left; ActionMenu.AttachV = Bottom;
		SpcActionMenu.Name = "SpectatorActionMenuPosition"; SpcActionMenu.posX = 0; SpcActionMenu.posY = -2; SpcActionMenu.AlignH = Left; SpcActionMenu.AlignV = Bottom; SpcActionMenu.AttachH = Left; SpcActionMenu.AttachV = Center;
		CharSelect.Name = "CharacterSelectionPosition"; CharSelect.posX = 0; CharSelect.posY = 0; CharSelect.AlignH = Center; CharSelect.AlignV = Center; CharSelect.AttachH = Center; CharSelect.AttachV = Bottom;
		SpcCard.Name = "SpectatorCardPosition"; SpcCard.posX = 0; SpcCard.posY = 0; SpcCard.AlignH = Center; SpcCard.AlignV = Bottom; SpcCard.AttachH = Center; SpcCard.AttachV = Bottom;
		ExeGameStat.Name = "ExecutionGameStatusPosition"; ExeGameStat.posX = 0; ExeGameStat.posY = 0; ExeGameStat.AlignH = Center; ExeGameStat.AlignV = Top; ExeGameStat.AttachH = Center; ExeGameStat.AttachV = Top;
		ExeCountDown.Name = "ExecutionCountdownPosition"; ExeCountDown.posX = 0; ExeCountDown.posY = 0; ExeCountDown.AlignH = Center; ExeCountDown.AlignV = Top; ExeCountDown.AttachH = Center; ExeCountDown.AttachV = Top;
		ExeRoundNtf.Name = "ExecutionRoundNotificationPosition"; ExeRoundNtf.posX = 0; ExeRoundNtf.posY = 0; ExeRoundNtf.AlignH = Center; ExeRoundNtf.AlignV = Center; ExeRoundNtf.AttachH = Center; ExeRoundNtf.AttachV = Center; 
		ExeRoundIntro.Name = "ExecutionRoundIntroPosition"; ExeRoundIntro.posX = 0; ExeRoundIntro.posY = 0; ExeRoundIntro.AlignH = Left; ExeRoundIntro.AlignV = Bottom; ExeRoundIntro.AttachH = Left; ExeRoundIntro.AttachV = Bottom;
	
		//Color
		
		AllyColor.ColorR = 0; AllyColor.ColorG = 150; AllyColor.ColorB = 200; AllyColor.ColorA = 255;
		AllyColor2.ColorR = 255; AllyColor2.ColorG = 255; AllyColor2.ColorB = 255; AllyColor2.ColorA = 255;
		AlliedColor.ColorR = 0; AlliedColor.ColorG = 150; AlliedColor.ColorB = 200; AlliedColor.ColorA = 255;
		EnemyColor.ColorR = 240; EnemyColor.ColorG = 95; EnemyColor.ColorB = 65; EnemyColor.ColorA = 255;
		NeutralColor.ColorR = 255; NeutralColor.ColorG = 255; NeutralColor.ColorB = 255; NeutralColor.ColorA = 255;
		NeutralColor2.ColorR = 122; NeutralColor2.ColorG = 122; NeutralColor2.ColorB = 122; NeutralColor2.ColorA = 255;
		AIColor.ColorR = 240; AIColor.ColorG = 95; AIColor.ColorB = 65; AIColor.ColorA = 255;
		PrimaryObjColor.ColorR = 220; PrimaryObjColor.ColorG = 220; PrimaryObjColor.ColorB = 30; PrimaryObjColor.ColorA = 255;
		AmmoColor.ColorR = 255; AmmoColor.ColorG = 255; AmmoColor.ColorB = 255; AmmoColor.ColorA = 255;
		LowAmmoColor.ColorR = 0; LowAmmoColor.ColorG = 181; LowAmmoColor.ColorB = 222; LowAmmoColor.ColorA = 255;
		LowAmmoColor2.ColorR = 0; LowAmmoColor2.ColorG = 40; LowAmmoColor2.ColorB = 49; LowAmmoColor2.ColorA = 255;
		NoAmmoColor.ColorR = 55; NoAmmoColor.ColorG = 55; NoAmmoColor.ColorB = 55; NoAmmoColor.ColorA = 255;
		GrenadeBlinkColor.ColorR = 255; GrenadeBlinkColor.ColorG = 0; GrenadeBlinkColor.ColorB = 0; GrenadeBlinkColor.ColorA = 255;
		GrenadeBlinkColor2.ColorR = 255; GrenadeBlinkColor2.ColorG = 0; GrenadeBlinkColor2.ColorB = 0; GrenadeBlinkColor2.ColorA = 0;
		GrenadeOOVColor1.ColorR = 55; GrenadeOOVColor1.ColorG = 55; GrenadeOOVColor1.ColorB = 55; GrenadeOOVColor1.ColorA = 255;
		GrenadeOOVColor2.ColorR = 55; GrenadeOOVColor2.ColorG = 55; GrenadeOOVColor2.ColorB = 55; GrenadeOOVColor2.ColorA = 0;
		PrimaryPerformerColor.ColorR = 220; PrimaryPerformerColor.ColorG = 220; PrimaryPerformerColor.ColorB = 30; PrimaryPerformerColor.ColorA = 255;
		MapIconPrimaryColor.ColorR = 252; MapIconPrimaryColor.ColorG = 238; MapIconPrimaryColor.ColorB = 33; MapIconPrimaryColor.ColorA = 255;
		MapIconSecondaryColor.ColorR = 255; MapIconSecondaryColor.ColorG = 255; MapIconSecondaryColor.ColorB = 255; MapIconSecondaryColor.ColorA = 255;
		AlliedColor.ColorR = 0; AlliedColor.ColorG = 182; AlliedColor.ColorB = 222; AlliedColor.ColorA = 255;
		EnemyColor2.ColorR = 255; EnemyColor2.ColorG = 73; EnemyColor2.ColorB = 33; EnemyColor2.ColorA = 255;
		HighlightedBGColor.ColorR = 241; HighlightedBGColor.ColorG = 71; HighlightedBGColor.ColorB = 0; HighlightedBGColor.ColorA = 255;
		DefaultBGColor.ColorR = 0; DefaultBGColor.ColorG = 0; DefaultBGColor.ColorB = 0; DefaultBGColor.ColorA = 255;
		BlinkColor.ColorR = 0; BlinkColor.ColorG = 0; BlinkColor.ColorB = 0; BlinkColor.ColorA = 255;
		
		//Other Values
		
	}
	
	 //Create contents of the window
		//color code (255,200,19) = Gold
	protected static void createContents() {
		
		App_UI = new Shell(SWT.DIALOG_TRIM | SWT.MIN | SWT.MAX);
		App_UI.setBackground(SWTResourceManager.getColor(255, 255, 255));
		App_UI.setSize(sizeX, sizeY);
		App_UI.setImage(icon);
		App_UI.setText("Dirty Bomb HUD Maker " + version);
		
		HUD_MiniPreview = new Composite(App_UI, SWT.NONE);
		HUD_MiniPreview.setBackground(SWTResourceManager.getColor(55, 55, 55));
		HUD_MiniPreview.setBounds(152 + mPlusX, 10 + mPlusY, compX, compY);
		
		Label lblMinipreview = new Label(HUD_MiniPreview, SWT.NONE);
		lblMinipreview.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblMinipreview.setBackground(SWTResourceManager.getColor(55, 55, 55));
		lblMinipreview.setFont(SWTResourceManager.getFont("Segoe UI", 11, SWT.BOLD));
		lblMinipreview.setBounds(10, 10, 226, 32);
		lblMinipreview.setText("MiniPreview - Work In Progress");
		
		colorPreview = new Composite(App_UI, SWT.BORDER);
		colorPreview.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		colorPreview.setBounds(500 + plusX, 478 + plusY, 82, 25);
		
		HUD_Asset = new Combo(App_UI, SWT.READ_ONLY);
		HUD_Asset.setItems(new String[] {"Scope Info","Console Message Log","Spectator Console Message Log","Chat Input","Spectator Input","Incap Menu","Objective Progression","Objective Progression Notification","Objective Clock","MiniMap","Obituary Message Log",
				"Interaction Fillbar","XP Counter","Gameplay Notification","Subtitles","Objective Notification","Game Info","Spectator Info","Detected","Weapon Ammo","Ability Cooldown","Bomb Carry","Health","Phantom Shield Bar","Ready Up","Badge Notification",
				"Death Info Card","Spectator Gamewave Timer","Gamewave Timer","Objective","Spectator Objective","Action Menu","Spectator Action Menu","Character Select","Spectator Card","Execution Game Status","Execution Countdown","Execution Round Notification","Execution Round Intro",
				"Ally Color 1","Ally Color 2","Enemy Color","Enemy Color 2","Neutral Color 1","Neutral Color 2","AI Color","Primary Objective Color","Ammo Color","Low Ammo Color 1","Low Ammo Color 2","No Ammo Color","Grenade Blink Color 1","Grenade Blink Color 2",
				"Grenade Out of View Color 1","Grenade Out of View Color 2","Primary Performer Color","Map Icon Color 1","Map Icon Color 2","Allied Color","Blink Color","Highlighted BG Color","Default BG Color"});
		HUD_Asset.setBounds(79 + plusX, 387 + plusY, 136, 23);
		HUD_Asset.setText("[HUD ASSET]");
		HUD_Asset.addSelectionListener(new SelectionAdapter(){
			//Checking for Selection and Changing field values
			public void widgetSelected(SelectionEvent e){
				
				//Getting Asset and setting Current Reference cr
				//Normal HUD Assets
				if (HUD_Asset.getText().equals("Scope Info")){cr = ScopeInfo; type = 1;}
				else if (HUD_Asset.getText().equals("Console Message Log")){cr = CnslMsgLog; type = 1;}
				else if (HUD_Asset.getText().equals("Spectator Console Message Log")){cr = SpcCnslMsgLog; type = 1;}
				else if (HUD_Asset.getText().equals("Chat Input")){cr = ChatInput; type = 1;}
				else if (HUD_Asset.getText().equals("Spectator Input")){cr = SpcChatInput; type = 1;}
				else if (HUD_Asset.getText().equals("Incap Menu")){cr = IncapMenu; type = 1;}
				else if (HUD_Asset.getText().equals("Objective Progression")){cr = ObjPro; type = 1;}
				else if (HUD_Asset.getText().equals("Objective Progression Notification")){cr = ObjProNtf; type = 1;}
				else if (HUD_Asset.getText().equals("Objective Clock")){cr = ObjClock; type = 1;}
				else if (HUD_Asset.getText().equals("MiniMap")){cr = MiniMap; type = 1;}
				else if (HUD_Asset.getText().equals("Obituary Message Log")){cr = ObitMsg; type = 1;}
				else if (HUD_Asset.getText().equals("Interaction Fillbar")){cr = IntFillBar; type = 1;}
				else if (HUD_Asset.getText().equals("XP Counter")){cr = XpCounter; type = 2;}
				else if (HUD_Asset.getText().equals("Gameplay Notification")){cr = GameplayNtf; type = 2;}
				else if (HUD_Asset.getText().equals("Subtitles")){cr = Subtitles; type = 1;}
				else if (HUD_Asset.getText().equals("Objective Notification")){cr = ObjNtf; type = 2;}
				else if (HUD_Asset.getText().equals("Spectator Info")){cr = SpcInfo; type = 2;}
				else if (HUD_Asset.getText().equals("Detected")){cr = Detected; type = 1;}
				else if (HUD_Asset.getText().equals("Weapon Ammo")){cr = WeaponAmmo; type = 2;}
				else if (HUD_Asset.getText().equals("Ability Cooldown")){cr = AbilityCooldown; type = 2;}
				else if (HUD_Asset.getText().equals("Bomb Carry")){cr = CarryBomb; type = 2;}
				else if (HUD_Asset.getText().equals("Health")){cr = PlayerHealth; type = 2;}
				else if (HUD_Asset.getText().equals("Phantom Shield Bar")){cr = ShieldBar; type = 2;}
				else if (HUD_Asset.getText().equals("Ready Up")){cr = ReadyUp; type = 1;}
				else if (HUD_Asset.getText().equals("Badge Notification")){cr = BadgeNtf; type = 1;}
				else if (HUD_Asset.getText().equals("Death Info Card")){cr = DeathInfoCard; type = 1;}
				else if (HUD_Asset.getText().equals("Spectator Gamewave Timer")){cr = SpcGameWaveTimer; type = 1;}
				else if (HUD_Asset.getText().equals("Gamewave Timer")){cr = GameWaveTimer; type = 1;}
				else if (HUD_Asset.getText().equals("Objective")){cr = ObjPos; type = 1;}
				else if (HUD_Asset.getText().equals("Spectator Objective")){cr = SpcObjPos; type = 1;}
				else if (HUD_Asset.getText().equals("Action Menu")){cr = ActionMenu; type = 1;}
				else if (HUD_Asset.getText().equals("Spectator Action Menu")){cr = SpcActionMenu; type = 1;}
				else if (HUD_Asset.getText().equals("Character Select")){cr = CharSelect; type = 1;}
				else if (HUD_Asset.getText().equals("Spectator Card")){cr = SpcCard; type = 1;}
				else if (HUD_Asset.getText().equals("Execution Game Status")){cr = ExeGameStat; type = 1;}
				else if (HUD_Asset.getText().equals("Execution Countdown")){cr = ExeCountDown; type = 1;}
				else if (HUD_Asset.getText().equals("Execution Round Notification")){cr = ExeRoundNtf; type = 1;}
				else if (HUD_Asset.getText().equals("Execution Round Intro")){cr = ExeRoundIntro; type = 1;}
				//Color
				else if (HUD_Asset.getText().equals("Ally Color 1")){cr = AllyColor; type = 4;}
				else if (HUD_Asset.getText().equals("Ally Color 2")){cr = AllyColor2; type = 4;}
				else if (HUD_Asset.getText().equals("Enemy Color")){cr = EnemyColor; type = 4;}
				else if (HUD_Asset.getText().equals("Enemy Color 2")){cr = EnemyColor2; type = 4;}
				else if (HUD_Asset.getText().equals("Neutral Color 1")){cr = NeutralColor; type = 4;}
				else if (HUD_Asset.getText().equals("Neutral Color 2")){cr = NeutralColor2; type = 4;}
				else if (HUD_Asset.getText().equals("AI Color")){cr = AIColor; type = 4;}
				else if (HUD_Asset.getText().equals("Primary Objective Color")){cr = PrimaryObjColor; type = 4;}
				else if (HUD_Asset.getText().equals("Ammo Color")){cr = AmmoColor; type = 4;}
				else if (HUD_Asset.getText().equals("Low Ammo Color 1")){cr = LowAmmoColor; type = 4;}
				else if (HUD_Asset.getText().equals("Low Ammo Color 2")){cr = LowAmmoColor2; type = 4;}
				else if (HUD_Asset.getText().equals("No Ammo Color")){cr = NoAmmoColor; type = 4;}
				else if (HUD_Asset.getText().equals("Grenade Blink Color 1")){cr = GrenadeBlinkColor; type = 4;}
				else if (HUD_Asset.getText().equals("Grenade Blink Color 2")){cr = GrenadeBlinkColor2; type = 4;}
				else if (HUD_Asset.getText().equals("Grenade Out of View Color 1")){cr = GrenadeOOVColor1; type = 4;}
				else if (HUD_Asset.getText().equals("Grenade Out of View Color 2")){cr = GrenadeOOVColor2; type = 4;}
				else if (HUD_Asset.getText().equals("Primary Performer Color")){cr = PrimaryPerformerColor; type = 4;}
				else if (HUD_Asset.getText().equals("Map Icon Color 1")){cr = MapIconPrimaryColor; type = 4;}
				else if (HUD_Asset.getText().equals("Map Icon Color 2")){cr = MapIconSecondaryColor; type = 4;}
				else if (HUD_Asset.getText().equals("Allied Color")){cr = AlliedColor; type = 4;}
				else if (HUD_Asset.getText().equals("Blink Color")){cr = BlinkColor; type = 4;}
				else if (HUD_Asset.getText().equals("Highlighted BG Color")){cr = HighlightedBGColor; type = 4;}
				else if (HUD_Asset.getText().equals("Default BG Color")){cr = DefaultBGColor; type = 4;}
				
				switch (type){
				case 1:
					System.out.println(cr.Name);
					if (cr.AlignH == Left){cr.cAlignH = cLeft;}
					else if (cr.AlignH == Center){cr.cAlignH = cCenter;}
					else if (cr.AlignH == Right){cr.cAlignH = cRight;}
					
					if (cr.AlignV == Top){cr.cAlignV = cTop;}
					else if (cr.AlignV == Center){cr.cAlignV = cCenter;}
					else if (cr.AlignV == Bottom){cr.cAlignV = cBottom;}
					
					if (cr.AttachH == Left){cr.cAttachH = cLeft;}
					else if (cr.AttachH == Center){cr.cAttachH = cCenter;}
					else if (cr.AttachH == Right){cr.cAttachH = cRight;}
					
					if (cr.AttachV == Top){cr.cAttachV = cTop;}
					else if (cr.AttachV == Center){cr.cAttachV = cCenter;}
					else if (cr.AttachV == Bottom){cr.cAttachV = cBottom;}
					
					System.out.println(cr.AlignH + ", " + cr.cAlignH);
					System.out.println(cr.AlignV + ", " + cr.cAlignV);
					System.out.println(cr.AttachH + ", " + cr.cAttachH);
					System.out.println(cr.AttachV + ", " + cr.cAttachV);
					
					pox.setSelection(cr.posX);
					poy.setSelection(cr.posY);
					Align_H.setText(cr.cAlignH);
					Align_V.setText(cr.cAlignV);
					Attach_H.setText(cr.cAttachH);
					Attach_V.setText(cr.cAttachV);
					colorPreview.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
					
					cr.OAttachH = cr.AttachH;
					cr.OAttachV = cr.AttachV;
					cr.OAlignH = cr.AlignH;
					cr.OAlignV = cr.AlignV;
					cr.OposX = cr.posX;
					cr.OposY = cr.posY;
					
					pox.setEnabled(true);
					poy.setEnabled(true);
					Attach_H.setEnabled(true);
					Attach_V.setEnabled(true);
					Align_H.setEnabled(true);
					Align_V.setEnabled(true);
					sox.setEnabled(false);
					soy.setEnabled(false);
					btn_color.setEnabled(false);
					value.setEnabled(false);
					
					
					break;
					
				case 2:
					System.out.println(cr.Name);
					if (cr.AlignH == Left){cr.cAlignH = cLeft;}
					else if (cr.AlignH == Center){cr.cAlignH = cCenter;}
					else if (cr.AlignH == Right){cr.cAlignH = cRight;}
					
					if (cr.AlignV == Top){cr.cAlignV = cTop;}
					else if (cr.AlignV == Center){cr.cAlignV = cCenter;}
					else if (cr.AlignV == Bottom){cr.cAlignV = cBottom;}
					
					if (cr.AttachH == Left){cr.cAttachH = cLeft;}
					else if (cr.AttachH == Center){cr.cAttachH = cCenter;}
					else if (cr.AttachH == Right){cr.cAttachH = cRight;}
					
					if (cr.AttachV == Top){cr.cAttachV = cTop;}
					else if (cr.AttachV == Center){cr.cAttachV = cCenter;}
					else if (cr.AttachV == Bottom){cr.cAttachV = cBottom;}
					
					pox.setSelection(cr.posX);
					poy.setSelection(cr.posY);
					sox.setSelection(cr.sosX);
					soy.setSelection(cr.sosY);
					Align_H.setText(cr.cAlignH);
					Align_V.setText(cr.cAlignV);
					Attach_H.setText(cr.cAttachH);
					Attach_V.setText(cr.cAttachV);
					colorPreview.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
					
					cr.OAttachH = cr.AttachH;
					cr.OAttachV = cr.AttachV;
					cr.OAlignH = cr.AlignH;
					cr.OAlignV = cr.AlignV;
					cr.OposX = cr.posX;
					cr.OposY = cr.posY;
					cr.OsosX = cr.sosX;
					cr.OsosY = cr.sosY;
					
					pox.setEnabled(true);
					poy.setEnabled(true);
					Attach_H.setEnabled(true);
					Attach_V.setEnabled(true);
					Align_H.setEnabled(true);
					Align_V.setEnabled(true);
					sox.setEnabled(true);
					soy.setEnabled(true);
					btn_color.setEnabled(false);
					value.setEnabled(false);
					
					break;
				case 3:
					value.setSelection(cr.Value);
					
					colorPreview.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
					
					pox.setEnabled(false);
					poy.setEnabled(false);
					Attach_H.setEnabled(false);
					Attach_V.setEnabled(false);
					Align_H.setEnabled(false);
					Align_V.setEnabled(false);
					sox.setEnabled(false);
					soy.setEnabled(false);
					btn_color.setEnabled(false);
					value.setEnabled(true);
					break;
				case 4:
					pox.setEnabled(false);
					poy.setEnabled(false);
					Attach_H.setEnabled(false);
					Attach_V.setEnabled(false);
					Align_H.setEnabled(false);
					Align_V.setEnabled(false);
					sox.setEnabled(false);
					soy.setEnabled(false);
					value.setEnabled(false);
					btn_color.setEnabled(true);
					
					colorPreview.setBackground(SWTResourceManager.getColor(cr.ColorR, cr.ColorG, cr.ColorB));
					ColorWindow.R = cr.ColorR;
					ColorWindow.G = cr.ColorG;
					ColorWindow.B = cr.ColorB;
					ColorWindow.A = cr.ColorA;
					
					break;
				
				}
				
			}
		});
		
		Attach_H = new Combo(App_UI, SWT.READ_ONLY);
		Attach_H.setEnabled(false);
		Attach_H.setItems(new String[] {"Left", "Center", "Right"});
		Attach_H.setBounds(79 + plusX, 449 + plusY, 136, 23);
		Attach_H.setText("[ATTACH HORIZONTAL]");
		Attach_H.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				if (Attach_H.getText().equals("Left")){cr.AttachH = Left;}
				else if (Attach_H.getText().equals("Center")){cr.AttachH = Center;}
				else if (Attach_H.getText().equals("Right")){cr.AttachH = Right;}
				//System.out.println(cr.AttachH);
				//System.out.println(cr.OAttachH);
			}
		});
		
		
		Attach_V = new Combo(App_UI, SWT.READ_ONLY);
		Attach_V.setEnabled(false);
		Attach_V.setItems(new String[] {"Top", "Center", "Bottom"});
		Attach_V.setBounds(79 + plusX, 489 + plusY, 136, 23);
		Attach_V.setText("[ATTACH VERTICAL]");
		Attach_V.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				if (Attach_V.getText().equals("Left")){cr.AttachV = Left;}
				else if (Attach_V.getText().equals("Center")){cr.AttachV = Center;}
				else if (Attach_V.getText().equals("Right")){cr.AttachV = Right;}
				//System.out.println(cr.AttachV);
			}
		});
		
		Align_H = new Combo(App_UI, SWT.READ_ONLY);
		Align_H.setEnabled(false);
		Align_H.setItems(new String[] {"Left", "Center", "Right"});
		Align_H.setBounds(79 + plusX, 550 + plusY, 136, 23);
		Align_H.setText("[ALIGN HORIZONTAL]");
		Align_H.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				if (Align_H.getText().equals("Left")){cr.AlignH = Left;}
				else if (Align_H.getText().equals("Center")){cr.AlignH = Center;}
				else if (Align_H.getText().equals("Right")){cr.AlignH = Right;}
				//System.out.println(cr.AlignH);
			}
		});
		
		
		Align_V = new Combo(App_UI, SWT.READ_ONLY);
		Align_V.setEnabled(false);
		Align_V.setItems(new String[] {"Top", "Center", "Bottom"});
		Align_V.setBounds(79 + plusX, 588 + plusY, 136, 23);
		Align_V.setText("[ALIGN VERTICAL]");
		Align_V.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
				if (Align_V.getText().equals("Left")){cr.AlignV = Left;}
				else if (Align_V.getText().equals("Center")){cr.AlignV = Center;}
				else if (Align_V.getText().equals("Right")){cr.AlignV = Right;}
				//System.out.println(cr.AlignV);
			}
		});
		
		select_preset = new Combo(App_UI, SWT.READ_ONLY);
		select_preset.setItems(new String[] {"Default"});
		select_preset.setBounds(730 + plusX, 414 + plusY, 165, 23);
		select_preset.setText("Default");
		select_preset.addSelectionListener(new SelectionAdapter(){
			public void widgetSelected(SelectionEvent e){
			}
		});
		
		combo_relativeTo = new Combo(App_UI, SWT.READ_ONLY);
		combo_relativeTo.setEnabled(false);
		combo_relativeTo.setBounds(508 + plusX, 414 + plusY, 136, 23);
		combo_relativeTo.setText("[HUD ASSET]");
		combo_relativeTo.setItems(new String[] {});
		combo_relativeTo.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent mod){
				Combo combo = (Combo) mod.widget;
				System.out.println(combo.getText());
			}
		});
		
		pox = new Spinner(App_UI, SWT.BORDER);
		pox.setEnabled(false);
		//pox.setEditable(true);
		pox.setSelection(0);
		pox.setMinimum(-9999);
		pox.setMaximum(9999);
		pox.setBounds(374 + plusX, 410 + plusY, 76, 21);
		pox.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent mod){
				Spinner text = (Spinner) mod.widget;
				System.out.println(text.getText());
				
				cr.posX=pox.getSelection();
				//if (pox.getText() == ""){pox.setSelection("0");}
			}
		});
		
		poy = new Spinner(App_UI, SWT.BORDER);
		poy.setEnabled(false);
		//poy.setEditable(true);
		poy.setSelection(0);
		poy.setMinimum(-9999);
		poy.setMaximum(9999);
		poy.setBounds(374 + plusX, 442 + plusY, 76, 21);
		poy.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent mod){
				Spinner text = (Spinner) mod.widget;
				System.out.println(text.getText());
				
				cr.posY=poy.getSelection();
				//if (poy.getText() == ""){poy.setSelection("0");}
			}
		});
		
		sox = new Spinner(App_UI, SWT.BORDER);
		sox.setEnabled(false);
		//poy.setEditable(true);
		sox.setSelection(0);
		sox.setMinimum(-9999);
		sox.setMaximum(9999);
		sox.setBounds(381 + plusX, 540 + plusY, 76, 21);
		sox.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent mod){
				Spinner text = (Spinner) mod.widget;
				System.out.println(text.getText());
				
				cr.sosX=sox.getSelection();
				//if (poy.getText() == ""){poy.setSelection("0");}
			}
		});
		
		soy = new Spinner(App_UI, SWT.BORDER);
		soy.setEnabled(false);
		//poy.setEditable(true);
		soy.setSelection(0);
		soy.setMinimum(-9999);
		soy.setMaximum(9999);
		soy.setBounds(381 + plusX, 572 + plusY, 76, 21);
		soy.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent mod){
				Spinner text = (Spinner) mod.widget;
				System.out.println(text.getText());
				
				cr.sosY=soy.getSelection();
				//if (poy.getText() == ""){poy.setSelection("0");}
			}
		});
		
		value = new Spinner(App_UI, SWT.BORDER);
		value.setEnabled(false);
		value.setMinimum(-9999);
		value.setMaximum(9999);
		value.setBounds(582 + plusX, 538 + plusY, 76, 21);
		value.addModifyListener(new ModifyListener(){
			public void modifyText(ModifyEvent mod){
				Spinner text = (Spinner) mod.widget;
				System.out.println(text.getText());
				
				cr.Value=value.getSelection();
				//if (poy.getText() == ""){poy.setSelection("0");}
			}
		});
		
		btn_modeInGame = new Button(App_UI, SWT.RADIO);
		btn_modeInGame.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btn_modeInGame.setSelection(true);
		btn_modeInGame.setBounds(18, 31, 105, 16);
		btn_modeInGame.setText("In Game");
		btn_modeInGame.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		btn_modeWarmup = new Button(App_UI, SWT.RADIO);
		btn_modeWarmup.setText("Warm Up");
		btn_modeWarmup.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btn_modeWarmup.setBounds(18, 53, 105, 16);
		
		btn_modeIncap = new Button(App_UI, SWT.RADIO);
		btn_modeIncap.setText("Incapitated");
		btn_modeIncap.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		btn_modeIncap.setBounds(18, 75, 105, 16);
		
		btn_modeExe = new Button(App_UI, SWT.RADIO);
		btn_modeExe.setBounds(18, 97, 105, 16);
		btn_modeExe.setText("Execution");
		btn_modeExe.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		btn_modeSpectator = new Button(App_UI, SWT.RADIO);
		btn_modeSpectator.setBounds(18, 119, 90, 16);
		btn_modeSpectator.setText("Spectator");
		btn_modeSpectator.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		btn_save = new Button(App_UI, SWT.PUSH);
		btn_save.setText("Save Preset");
		btn_save.setBounds(815 + plusX, 512 + plusY, 80, 25);
		btn_save.addSelectionListener(new Save());
		btn_save.addListener(SWT.Selection, new Listener(){
			public void handleEvent(Event e){
				
				//"bin/db_hud/assets/File.ini"
				
				
				
				switch(e.type){
					case SWT.Selection:
						//Read File and store in String[] ShooterUIini
						String iniString = "";
					try {
						ShooterUI = new Scanner(new File("bin/db_hud/assets/ShooterUI.ini"));
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
						
					}
						
						
						
					List<String> FShooterUI = new LinkedList<String>();
					while(ShooterUI.hasNext()){
						iniString = ShooterUI.nextLine().trim();
					    FShooterUI.add(iniString);
					}
					ShooterUI.close();
					newShooterUI = FShooterUI.toArray(new String[0]);
					    
					    
					//Prints String[] for ini file
					/*for(String s : ShooterUIini){
					    System.out.println(s);
					}*/
					//Modify Strings and Write to new File
					    
					for(int i = 0; i < newShooterUI.length; i++)
					  {
					      if(newShooterUI[i].contains("ScopeInfoPosition")){newShooterUI[i] = ScopeInfo.Name + "=" + "(Align=(H=" + ScopeInfo.AlignH + ", V=" + ScopeInfo.AlignV + "), Attach=(H=" + ScopeInfo.AttachH + ",V=" + ScopeInfo.AttachV + "), PixelOffset=(X=" + ScopeInfo.posX + ",Y=" + ScopeInfo.posY + "))";;}
					      else if (newShooterUI[i].contains("ConsoleMessageLogPosition")){newShooterUI[i] = CnslMsgLog.Name + "=" + "(Align=(H=" + CnslMsgLog.AlignH + ", V=" + CnslMsgLog.AlignV + "), Attach=(H=" + CnslMsgLog.AttachH + ",V=" + CnslMsgLog.AttachV + "), PixelOffset=(X=" + CnslMsgLog.posX + ",Y=" + CnslMsgLog.posY + "))";}
					      else if (newShooterUI[i].contains("SpectatorConsoleMessageLogPosition")){newShooterUI[i] = SpcCnslMsgLog.Name + "=" + "(Align=(H=" + SpcCnslMsgLog.AlignH + ", V=" + SpcCnslMsgLog.AlignV + "), Attach=(H=" + SpcCnslMsgLog.AttachH + ",V=" + SpcCnslMsgLog.AttachV + "), PixelOffset=(X=" + SpcCnslMsgLog.posX + ",Y=" + SpcCnslMsgLog.posY + "))";}
					      else if (newShooterUI[i].contains("ChatInputPosition")){newShooterUI[i] = ChatInput.Name + "=" + "(Align=(H=" + ChatInput.AlignH + ", V=" + ChatInput.AlignV + "), Attach=(H=" + ChatInput.AttachH + ",V=" + ChatInput.AttachV + "), PixelOffset=(X=" + ChatInput.posX + ",Y=" + ChatInput.posY + "))";}
					      else if (newShooterUI[i].contains("SpectatorChatInputPosition")){newShooterUI[i] = SpcChatInput.Name + "=" + "(Align=(H=" + SpcChatInput.AlignH + ", V=" + SpcChatInput.AlignV + "), Attach=(H=" + SpcChatInput.AttachH + ",V=" + SpcChatInput.AttachV + "), PixelOffset=(X=" + SpcChatInput.posX + ",Y=" + SpcChatInput.posY + "))";}
				          else if (newShooterUI[i].contains("IncapMenuPosition")){newShooterUI[i] = IncapMenu.Name + "=" + "(Align=(H=" + IncapMenu.AlignH + ", V=" + IncapMenu.AlignV + "), Attach=(H=" + IncapMenu.AttachH + ",V=" + IncapMenu.AttachV + "), PixelOffset=(X=" + IncapMenu.posX + ",Y=" + IncapMenu.posY + "))";}
				          else if (newShooterUI[i].contains("ObjectiveProgressionPosition")){newShooterUI[i] = ObjPro.Name + "=" + "(Align=(H=" + ObjPro.AlignH + ", V=" + ObjPro.AlignV + "), Attach=(H=" + ObjPro.AttachH + ",V=" + ObjPro.AttachV + "), PixelOffset=(X=" + ObjPro.posX + ",Y=" + ObjPro.posY + "))";}
				          else if (newShooterUI[i].contains("ObjectiveProgressionNotificationPosition")){newShooterUI[i] = ObjProNtf.Name + "=" + "(Align=(H=" + ObjProNtf.AlignH + ", V=" + ObjProNtf.AlignV + "), Attach=(H=" + ObjProNtf.AttachH + ",V=" + ObjProNtf.AttachV + "), PixelOffset=(X=" + ObjProNtf.posX + ",Y=" + ObjProNtf.posY + "))";}
				          else if (newShooterUI[i].contains("ObjectiveClockPosition")){newShooterUI[i] = ObjClock.Name + "=" + "(Align=(H=" + ObjClock.AlignH + ", V=" + ObjClock.AlignV + "), Attach=(H=" + ObjClock.AttachH + ",V=" + ObjClock.AttachV + "), PixelOffset=(X=" + ObjClock.posX + ",Y=" + ObjClock.posY + "))";}
				          else if (newShooterUI[i].contains("MinimapPosition")){newShooterUI[i] = MiniMap.Name + "=" + "(Align=(H=" + MiniMap.AlignH + ", V=" + MiniMap.AlignV + "), Attach=(H=" + MiniMap.AttachH + ",V=" + MiniMap.AttachV + "), PixelOffset=(X=" + MiniMap.posX + ",Y=" + MiniMap.posY + "))";}
				          else if (newShooterUI[i].contains("ObituaryMessageLogPosition")){newShooterUI[i] = ObitMsg.Name + "=" + "(Align=(H=" + ObitMsg.AlignH + ", V=" + ObitMsg.AlignV + "), Attach=(H=" + ObitMsg.AttachH + ",V=" + ObitMsg.AttachV + "), PixelOffset=(X=" + ObitMsg.posX + ",Y=" + ObitMsg.posY + "))";}
				          else if (newShooterUI[i].contains("InteractionFillbarPosition")){newShooterUI[i] = IntFillBar.Name + "=" + "(Align=(H=" + IntFillBar.AlignH + ", V=" + IntFillBar.AlignV + "), Attach=(H=" + IntFillBar.AttachH + ",V=" + IntFillBar.AttachV + "), PixelOffset=(X=" + IntFillBar.posX + ",Y=" + IntFillBar.posY + "))";}
				          else if (newShooterUI[i].contains("ExpCounter")){newShooterUI[i] = XpCounter.Name + "=" + "(Align=(H=" + XpCounter.AlignH + ", V=" + XpCounter.AlignV + "), Attach=(H=" + XpCounter.AttachH + ",V=" + XpCounter.AttachV + "), PixelOffset=(X=" + XpCounter.posX + ",Y=" + XpCounter.posY + "), ShadowOffset=(X=" + XpCounter.sosX + ", Y=" + XpCounter.sosY + "))";}
				          else if (newShooterUI[i].contains("GameplayNotificationPosition")){newShooterUI[i] = GameplayNtf.Name + "=" + "(Align=(H=" + GameplayNtf.AlignH + ", V=" + GameplayNtf.AlignV + "), Attach=(H=" + GameplayNtf.AttachH + ",V=" + GameplayNtf.AttachV + "), PixelOffset=(X=" + GameplayNtf.posX + ",Y=" + GameplayNtf.posY + "))";}
				          else if (newShooterUI[i].contains("SubtitlesPosition")){newShooterUI[i] = Subtitles.Name + "=" + "(Align=(H=" + Subtitles.AlignH + ", V=" + Subtitles.AlignV + "), Attach=(H=" + Subtitles.AttachH + ",V=" + Subtitles.AttachV + "), PixelOffset=(X=" + Subtitles.posX + ",Y=" + Subtitles.posY + "))";}
				          else if (newShooterUI[i].contains("ObjectiveNotificationPosition")){newShooterUI[i] = ObjNtf.Name + "=" + "(Align=(H=" + ObjNtf.AlignH + ", V=" + ObjNtf.AlignV + "), Attach=(H=" + ObjNtf.AttachH + ",V=" + ObjNtf.AttachV + "), PixelOffset=(X=" + ObjNtf.posX + ",Y=" + ObjNtf.posY + "), ShadowOffset=(X=" + ObjNtf.sosX + ", Y=" + ObjNtf.sosY + "))";}
				          else if (newShooterUI[i].contains("GameInfoPosition")){newShooterUI[i] = GameInfo.Name + "=" + "(Align=(H=" + GameInfo.AlignH + ", V=" + GameInfo.AlignV + "), Attach=(H=" + GameInfo.AttachH + ",V=" + GameInfo.AttachV + "), PixelOffset=(X=" + GameInfo.posX + ",Y=" + GameInfo.posY + "))";}
				          else if (newShooterUI[i].contains("SpectatorInfoPosition")){newShooterUI[i] = SpcInfo.Name + "=" + "(Align=(H=" + SpcInfo.AlignH + ", V=" + SpcInfo.AlignV + "), Attach=(H=" + SpcInfo.AttachH + ",V=" + SpcInfo.AttachV + "), PixelOffset=(X=" + SpcInfo.posX + ",Y=" + SpcInfo.posY + "), ShadowOffset=(X=" + SpcInfo.sosX + ", Y=" + SpcInfo.sosY + "))";}
				          else if (newShooterUI[i].contains("DetectedNotificationPosition")){newShooterUI[i] = Detected.Name + "=" + "(Align=(H=" + Detected.AlignH + ", V=" + Detected.AlignV + "), Attach=(H=" + Detected.AttachH + ",V=" + Detected.AttachV + "), PixelOffset=(X=" + Detected.posX + ",Y=" + Detected.posY + "))";}
				          else if (newShooterUI[i].contains("WeaponAmmoPosition")){newShooterUI[i] = WeaponAmmo.Name + "=" + "(Align=(H=" + WeaponAmmo.AlignH + ", V=" + WeaponAmmo.AlignV + "), Attach=(H=" + WeaponAmmo.AttachH + ",V=" + WeaponAmmo.AttachV + "), PixelOffset=(X=" + WeaponAmmo.posX + ",Y=" + WeaponAmmo.posY + "), ShadowOffset=(X=" + WeaponAmmo.sosX + ", Y=" + WeaponAmmo.sosY + "))";}
				          else if (newShooterUI[i].contains("AbilityCooldownPosition")){newShooterUI[i] = AbilityCooldown.Name + "=" + "(Align=(H=" + AbilityCooldown.AlignH + ", V=" + AbilityCooldown.AlignV + "), Attach=(H=" + AbilityCooldown.AttachH + ",V=" + AbilityCooldown.AttachV + "), PixelOffset=(X=" + AbilityCooldown.posX + ",Y=" + AbilityCooldown.posY + "), ShadowOffset=(X=" + AbilityCooldown.sosX + ", Y=" + AbilityCooldown.sosY + "))";}
				          else if (newShooterUI[i].contains("CarryBombPosition")){newShooterUI[i] = CarryBomb.Name + "=" + "(Align=(H=" + CarryBomb.AlignH + ", V=" + CarryBomb.AlignV + "), Attach=(H=" + CarryBomb.AttachH + ",V=" + CarryBomb.AttachV + "), PixelOffset=(X=" + CarryBomb.posX + ",Y=" + CarryBomb.posY + "), ShadowOffset=(X=" + CarryBomb.sosX + ", Y=" + CarryBomb.sosY + "))";}
				          else if (newShooterUI[i].contains("PlayerHealthPosition")){newShooterUI[i] = PlayerHealth.Name + "=" + "(Align=(H=" + PlayerHealth.AlignH + ", V=" + PlayerHealth.AlignV + "), Attach=(H=" + PlayerHealth.AttachH + ",V=" + PlayerHealth.AttachV + "), PixelOffset=(X=" + PlayerHealth.posX + ",Y=" + PlayerHealth.posY + "), ShadowOffset=(X=" + PlayerHealth.sosX + ", Y=" + PlayerHealth.sosY + "))";}
				          else if (newShooterUI[i].contains("ShieldBarPosition")){newShooterUI[i] = ShieldBar.Name + "=" + "(Align=(H=" + ShieldBar.AlignH + ", V=" + ShieldBar.AlignV + "), Attach=(H=" + ShieldBar.AttachH + ",V=" + ShieldBar.AttachV + "), PixelOffset=(X=" + ShieldBar.posX + ",Y=" + ShieldBar.posY + "), ShadowOffset=(X=" + ShieldBar.sosX + ", Y=" + ShieldBar.sosY + "))";}
				          else if (newShooterUI[i].contains("ReadyUpPosition")){newShooterUI[i] = ReadyUp.Name + "=" + "(Align=(H=" + ReadyUp.AlignH + ", V=" + ReadyUp.AlignV + "), Attach=(H=" + ReadyUp.AttachH + ",V=" + ReadyUp.AttachV + "), PixelOffset=(X=" + ReadyUp.posX + ",Y=" + ReadyUp.posY + "))";}
				          else if (newShooterUI[i].contains("BadgeNotificationPosition")){newShooterUI[i] = BadgeNtf.Name + "=" + "(Align=(H=" + BadgeNtf.AlignH + ", V=" + BadgeNtf.AlignV + "), Attach=(H=" + BadgeNtf.AttachH + ",V=" + BadgeNtf.AttachV + "), PixelOffset=(X=" + BadgeNtf.posX + ",Y=" + BadgeNtf.posY + "))";}
				          else if (newShooterUI[i].contains("DeathInfoCardPosition")){newShooterUI[i] = DeathInfoCard.Name + "=" + "(Align=(H=" + DeathInfoCard.AlignH + ", V=" + DeathInfoCard.AlignV + "), Attach=(H=" + DeathInfoCard.AttachH + ",V=" + DeathInfoCard.AttachV + "), PixelOffset=(X=" + DeathInfoCard.posX + ",Y=" + DeathInfoCard.posY + "))";}
				          else if (newShooterUI[i].contains("SpectatorGameWaveTimerPosition")){newShooterUI[i] = SpcGameWaveTimer.Name + "=" + "(Align=(H=" + SpcGameWaveTimer.AlignH + ", V=" + SpcGameWaveTimer.AlignV + "), Attach=(H=" + SpcGameWaveTimer.AttachH + ",V=" + SpcGameWaveTimer.AttachV + "), PixelOffset=(X=" + SpcGameWaveTimer.posX + ",Y=" + SpcGameWaveTimer.posY + "))";}
				          else if (newShooterUI[i].contains("GameWaveTimerPosition")){newShooterUI[i] = GameWaveTimer.Name + "=" + "(Align=(H=" + GameWaveTimer.AlignH + ", V=" + GameWaveTimer.AlignV + "), Attach=(H=" + GameWaveTimer.AttachH + ",V=" + GameWaveTimer.AttachV + "), PixelOffset=(X=" + GameWaveTimer.posX + ",Y=" + GameWaveTimer.posY + "))";}
				          else if (newShooterUI[i].contains("ObjectivePosition")){newShooterUI[i] = ObjPos.Name + "=" + "(Align=(H=" + ObjPos.AlignH + ", V=" + ObjPos.AlignV + "), Attach=(H=" + ObjPos.AttachH + ",V=" + ObjPos.AttachV + "), PixelOffset=(X=" + ObjPos.posX + ",Y=" + ObjPos.posY + "))";}
				          else if (newShooterUI[i].contains("SpectatorObjectivePosition")){newShooterUI[i] = SpcObjPos.Name + "=" + "(Align=(H=" + SpcObjPos.AlignH + ", V=" + SpcObjPos.AlignV + "), Attach=(H=" + SpcObjPos.AttachH + ",V=" + SpcObjPos.AttachV + "), PixelOffset=(X=" + SpcObjPos.posX + ",Y=" + SpcObjPos.posY + "))";}
				          else if (newShooterUI[i].contains("ActionMenuPosition")){newShooterUI[i] = ActionMenu.Name + "=" + "(Align=(H=" + ActionMenu.AlignH + ", V=" + ActionMenu.AlignV + "), Attach=(H=" + ActionMenu.AttachH + ",V=" + ActionMenu.AttachV + "), PixelOffset=(X=" + ActionMenu.posX + ",Y=" + ActionMenu.posY + "))";}
				          else if (newShooterUI[i].contains("SpectatorActionMenuPosition")){newShooterUI[i] = SpcActionMenu.Name + "=" + "(Align=(H=" + SpcActionMenu.AlignH + ", V=" + SpcActionMenu.AlignV + "), Attach=(H=" + SpcActionMenu.AttachH + ",V=" + SpcActionMenu.AttachV + "), PixelOffset=(X=" + SpcActionMenu.posX + ",Y=" + SpcActionMenu.posY + "))";}
				          else if (newShooterUI[i].contains("CharacterSelectPostion")){newShooterUI[i] = CharSelect.Name + "=" + "(Align=(H=" + CharSelect.AlignH + ", V=" + CharSelect.AlignV + "), Attach=(H=" + CharSelect.AttachH + ",V=" + CharSelect.AttachV + "), PixelOffset=(X=" + CharSelect.posX + ",Y=" + CharSelect.posY + "))";}
				          else if (newShooterUI[i].contains("SpectatorCardPosition")){newShooterUI[i] = SpcCard.Name + "=" + "(Align=(H=" + SpcCard.AlignH + ", V=" + SpcCard.AlignV + "), Attach=(H=" + SpcCard.AttachH + ",V=" + SpcCard.AttachV + "), PixelOffset=(X=" + SpcCard.posX + ",Y=" + SpcCard.posY + "))";}
				          else if (newShooterUI[i].contains("ExecutionGameStatusPosition")){newShooterUI[i] = ExeGameStat.Name + "=" + "(Align=(H=" + ExeGameStat.AlignH + ", V=" + ExeGameStat.AlignV + "), Attach=(H=" + ExeGameStat.AttachH + ",V=" + ExeGameStat.AttachV + "), PixelOffset=(X=" + ExeGameStat.posX + ",Y=" + ExeGameStat.posY + "))";}
				          else if (newShooterUI[i].contains("ExecutionCountdownPosition")){newShooterUI[i] = ExeCountDown.Name + "=" + "(Align=(H=" + ExeCountDown.AlignH + ", V=" + ExeCountDown.AlignV + "), Attach=(H=" + ExeCountDown.AttachH + ",V=" + ExeCountDown.AttachV + "), PixelOffset=(X=" + ExeCountDown.posX + ",Y=" + ExeCountDown.posY + "))";}
				          else if (newShooterUI[i].contains("ExecutionRoundNotificationPosition")){newShooterUI[i] = ExeRoundNtf.Name + "=" + "(Align=(H=" + ExeRoundNtf.AlignH + ", V=" + ExeRoundNtf.AlignV + "), Attach=(H=" + ExeRoundNtf.AttachH + ",V=" + ExeRoundNtf.AttachV + "), PixelOffset=(X=" + ExeRoundNtf.posX + ",Y=" + ExeRoundNtf.posY + "))";}
				          else if (newShooterUI[i].contains("ExecutionRoundIntroPosition")){newShooterUI[i] = ExeRoundIntro.Name + "=" + "(Align=(H=" + ExeRoundIntro.AlignH + ", V=" + ExeRoundIntro.AlignV + "), Attach=(H=" + ExeRoundIntro.AttachH + ",V=" + ExeRoundIntro.AttachV + "), PixelOffset=(X=" + ExeRoundIntro.posX + ",Y=" + ExeRoundIntro.posY + "))";}
					      //Color
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDIFFObjectAlly]")){newShooterUI[i+1] = "m_PrimaryColor=(R= " + AllyColor.ColorR + ", G= " + AllyColor.ColorG + ", B= " + AllyColor.ColorB + ", A= " + AllyColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDIFFObjectAlly]")){newShooterUI[i+2] = "m_SecondaryColour=(R= " + AllyColor2.ColorR + ", G= " + AllyColor2.ColorG + ", B= " + AllyColor2.ColorB + ", A= " + AllyColor2.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDIFFObjectEnemy]")){newShooterUI[i+1] = "m_PrimaryColor=(R= " + EnemyColor.ColorR + ", G= " + EnemyColor.ColorG + ", B= " + EnemyColor.ColorB + ", A= " + EnemyColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDConsoleMessageLog]")){newShooterUI[i+1] = "m_NeutralColor=(R= " + NeutralColor.ColorR + ", G= " + NeutralColor.ColorG + ", B= " + NeutralColor.ColorB + ", A= " + NeutralColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIMenuChatLog]")){newShooterUI[i+1] = "m_NeutralColor=(R= " + NeutralColor.ColorR + ", G= " + NeutralColor.ColorG + ", B= " + NeutralColor.ColorB + ", A= " + NeutralColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDGameInfoScore]")){newShooterUI[i+1] = "m_NeutralColor=(R= " + NeutralColor2.ColorR + ", G= " + NeutralColor2.ColorG + ", B= " + NeutralColor2.ColorB + ", A= " + NeutralColor2.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDIFFObjectAI]")){newShooterUI[i+8] = "m_PrimaryColor=(R= " + AIColor.ColorR + ", G= " + AIColor.ColorG + ", B= " + AIColor.ColorB + ", A= " + AIColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDIFFPrimaryObjective]")){newShooterUI[i+1] = "m_PrimaryColor=(R= " + PrimaryObjColor.ColorR + ", G= " + PrimaryObjColor.ColorG + ", B= " + PrimaryObjColor.ColorB + ", A= " + PrimaryObjColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDWeaponAmmo]")){newShooterUI[i+2] = "m_AmmoColor=(R= " +AmmoColor.ColorR + ", G= " + AmmoColor.ColorG + ", B= " + AmmoColor.ColorB + ", A= " + AmmoColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDWeaponAmmo]")){newShooterUI[i+3] = "m_LowAmmoColor=(R= " + LowAmmoColor.ColorR + ", G= " + LowAmmoColor.ColorG + ", B= " + LowAmmoColor.ColorB + ", A= " + LowAmmoColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDWeaponAmmo]")){newShooterUI[i+4] = "m_LowAmmoColor2=(R= " + LowAmmoColor2.ColorR + ", G= " + LowAmmoColor2.ColorG + ", B= " + LowAmmoColor2.ColorB + ", A= " + LowAmmoColor2.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDWeaponAmmo]")){newShooterUI[i+1] = "m_NoAmmoColor=(R= " + NoAmmoColor.ColorR + ", G= " + NoAmmoColor.ColorG + ", B= " + NoAmmoColor.ColorB + ", A= " + NoAmmoColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDGrenadeIndicator]")){newShooterUI[i+8] = "m_BlinkColor1=(R= " + GrenadeBlinkColor.ColorR + ", G= " + GrenadeBlinkColor.ColorG + ", B= " + GrenadeBlinkColor.ColorB + ", A= " + GrenadeBlinkColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDGrenadeIndicator]")){newShooterUI[i+9] = "m_BlinkColor2=(R= " + GrenadeBlinkColor2.ColorR + ", G= " + GrenadeBlinkColor2.ColorG + ", B= " + GrenadeBlinkColor2.ColorB + ", A= " + GrenadeBlinkColor2.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDGrenadeIndicator]")){newShooterUI[i+10] = "m_GrenadeOutOfView1=(R= " + GrenadeOOVColor1.ColorR + ", G= " + GrenadeOOVColor1.ColorG + ", B= " + GrenadeOOVColor1.ColorB + ", A= " + GrenadeOOVColor1.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDGrenadeIndicator]")){newShooterUI[i+11] = "m_GrenadeOutOfView2=(R= " + GrenadeOOVColor2.ColorR + ", G= " + GrenadeOOVColor2.ColorG + ", B= " + GrenadeOOVColor2.ColorB + ", A= " + GrenadeOOVColor2.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDIFFObjectPrimaryPerformer]")){newShooterUI[i+1] = "m_PrimaryColor=(R= " + PrimaryPerformerColor.ColorR + ", G= " + PrimaryPerformerColor.ColorG + ", B= " + PrimaryPerformerColor.ColorB + ", A= " + PrimaryPerformerColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDMinimapIcon]")){newShooterUI[i+8] = "m_PrimaryColor=(R= " + MapIconPrimaryColor.ColorR + ", G= " + MapIconPrimaryColor.ColorG + ", B= " + MapIconPrimaryColor.ColorB + ", A= " + MapIconPrimaryColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("[ShooterGame.SGUIHUDMinimapIcon]")){newShooterUI[i+8] = "m_SecondaryColor=(R= " + MapIconSecondaryColor.ColorR + ", G= " + MapIconSecondaryColor.ColorG + ", B= " + MapIconSecondaryColor.ColorB + ", A= " + MapIconSecondaryColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("m_AlliedColor")){newShooterUI[i] = "m_AlliedColor=(R= " + AlliedColor.ColorR + ", G= " + AlliedColor.ColorG + ", B= " + AlliedColor.ColorB + ", A= " + AlliedColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("m_EnemyColor")){newShooterUI[i] = "m_EnemyColor=(R= " + EnemyColor2.ColorR + ", G= " + EnemyColor2.ColorG + ", B= " + EnemyColor2.ColorB + ", A= " + EnemyColor2.ColorA + ")";}
				          else if (newShooterUI[i].contains("m_HighlightedBGColor")){newShooterUI[i] = "m_HighlightedBGColor=(R= " + HighlightedBGColor.ColorR + ", G= " + HighlightedBGColor.ColorG + ", B= " + HighlightedBGColor.ColorB + ", A= " + HighlightedBGColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("m_DeafultBGColor")){newShooterUI[i] = "m_DeafaultBGColor=(R= " + DefaultBGColor.ColorR + ", G= " + DefaultBGColor.ColorG + ", B= " + DefaultBGColor.ColorB + ", A= " + DefaultBGColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("m_BlinkColor")){newShooterUI[i] = "m_BlinkColor=(R= " + BlinkColor.ColorR + ", G= " + BlinkColor.ColorG + ", B= " + BlinkColor.ColorB + ", A= " + BlinkColor.ColorA + ")";}
				          else if (newShooterUI[i].contains("m_TeamColor")){newShooterUI[i] = "m_TeamColor=(R= " + AlliedColor.ColorR + ", G= " + AlliedColor.ColorG + ", B= " + AlliedColor.ColorB + ", A= " + AlliedColor.ColorA + ")";}

					      
					      else {}
				       }
				    
				    try {
				    	  
						File file = new File(selection);
							// if file doesn't exist, then create it
						if (!file.exists()) {
							file.createNewFile();
						}
						FileWriter fw = new FileWriter(file.getAbsoluteFile());
						BufferedWriter bw = new BufferedWriter(fw);
						for(String s : newShooterUI){
				    		System.out.println(s);
					    	bw.write(s);
					    	bw.newLine();
						}
						bw.close();
						file.setReadOnly();
						System.out.println("Done");
						
					} catch (Exception e2) {
						while (!s.isDisposed()) {
					          if (!d.readAndDispatch())
					            d.sleep();
					        }
					      d.dispose();
						e2.printStackTrace();
						
					}
					    
				}
			}
		});
		
		
		btn_load = new Button(App_UI, SWT.NONE);
		btn_load.setEnabled(false);
		btn_load.setBounds(730 + plusX, 512 + plusY, 80, 25);
		btn_load.setText("Load Preset");
		
		btn_color = new Button(App_UI, SWT.NONE);
		btn_color.setEnabled(false);
		btn_color.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				ColorWindow.open();
			}
		});
		btn_color.setBounds(597 + plusX, 478 + plusY, 82, 25);
		btn_color.setText("Color Options");
		
		btn_changeRes = new Button(App_UI, SWT.NONE);
		btn_changeRes.setEnabled(false);
		btn_changeRes.setBounds(526 + plusX, 579 + plusY, 128, 25);
		btn_changeRes.setText("Change Resolution");
		
		btnPreview = new Button(App_UI, SWT.NONE);
		btnPreview.setEnabled(false);
		btnPreview.setToolTipText("");
		btnPreview.setBounds(730 + plusX, 445 + plusY, 166, 25);
		btnPreview.setText("Preview"); //Will Open up preview window
		
		btn_updates = new Button(App_UI, SWT.NONE);
		btn_updates.setEnabled(false);
		btn_updates.setBounds(730 + plusX, 579 + plusY, 165, 25);
		btn_updates.setText("Check for Updates");
		
		btn_editor = new Button(App_UI, SWT.NONE);
		btn_editor.setEnabled(false);
		btn_editor.setText("Open Editor"); //Opens Up editor Window
		btn_editor.setBounds(730 + plusX, 545 + plusY, 165, 25);
		
		btn_reset = new Button(App_UI, SWT.NONE);
		btn_reset.setEnabled(false);
		btn_reset.setBounds(730 + plusX, 478 + plusY, 80, 25);
		btn_reset.setText("Reset");
		btn_reset.addListener(SWT.Selection, new Listener(){
			public void handleEvent (Event event){
				//if (cr.OAttachH == Right){cr.cAttachH = "Right"; Attach_H.setText("Right"); cr.AttachH = Right;}
				//else if (cr.OAttachH == Center){cr.cAttachH = "Center"; Attach_H.setText("Center"); cr.AttachH = Center;}
				//else if (cr.OAttachH == Left){cr.cAttachH = "Left"; Attach_H.setText("Left"); cr.AttachH = Left;}
			}
		});
		
		btn_resetAll = new Button(App_UI, SWT.NONE);
		btn_resetAll.setEnabled(false);
		btn_resetAll.setText("Reset All");
		btn_resetAll.setBounds(815 + plusX, 478 + plusY, 80, 25);
		
		line1 = new Label(App_UI, SWT.SEPARATOR | SWT.VERTICAL);
		line1.setBounds(240 + plusX, 387 + plusY, 2, 224);
		
		line2 = new Label(App_UI, SWT.SEPARATOR);
		line2.setBounds(470 + plusX, 387 + plusY, 2, 224);
		
		line3 = new Label(App_UI, SWT.SEPARATOR);
		line3.setBounds(684 + plusX, 387 + plusY, 2, 224);
		
		Label lbl_Attach = new Label(App_UI, SWT.NONE);
		lbl_Attach.setAlignment(SWT.CENTER);
		lbl_Attach.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_Attach.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_Attach.setBounds(88 + plusX, 417 + plusY, 89, 26);
		lbl_Attach.setText("Attachment");
		
		Label lbl_Align = new Label(App_UI, SWT.NONE);
		lbl_Align.setAlignment(SWT.CENTER);
		lbl_Align.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_Align.setText("Alignment");
		lbl_Align.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_Align.setBounds(80 + plusX, 519 + plusY, 95, 25);
		
		Label lbl_pixelOffset = new Label(App_UI, SWT.NONE);
		lbl_pixelOffset.setAlignment(SWT.CENTER);
		lbl_pixelOffset.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_pixelOffset.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_pixelOffset.setBounds(335 + plusX, 383 + plusY, 90, 19);
		lbl_pixelOffset.setText("Pixel Offset");
		
		Label lbl_pox = new Label(App_UI, SWT.NONE);
		lbl_pox.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_pox.setBounds(276 + plusX, 414 + plusY, 74, 15);
		lbl_pox.setText("Pixel Offset X");
		
		Label lbl_poy = new Label(App_UI, SWT.NONE);
		lbl_poy.setText("Pixel Offset Y");
		lbl_poy.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_poy.setBounds(276 + plusX, 444 + plusY, 74, 15);
		
		Label lbl_shadowOffset = new Label(App_UI, SWT.NONE);
		lbl_shadowOffset.setAlignment(SWT.CENTER);
		lbl_shadowOffset.setText("Shadow Offset");
		lbl_shadowOffset.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_shadowOffset.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_shadowOffset.setBounds(325 + plusX, 512 + plusY, 109, 25);
		
		Label lbl_sos = new Label(App_UI, SWT.NONE);
		lbl_sos.setText("Shadow Offset X");
		lbl_sos.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_sos.setBounds(283 + plusX, 544 + plusY, 97, 15);
		
		Label lbl_soy = new Label(App_UI, SWT.NONE);
		lbl_soy.setText("Shadow Offset Y");
		lbl_soy.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_soy.setBounds(283 + plusX, 574 + plusY, 89, 15);
		
		Label lbl_color = new Label(App_UI, SWT.NONE);
		lbl_color.setAlignment(SWT.CENTER);
		lbl_color.setText("Color");
		lbl_color.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_color.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_color.setBounds(564 + plusX, 450 + plusY, 54, 22);
		
		Label lbl_Presets = new Label(App_UI, SWT.NONE);
		lbl_Presets.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_Presets.setAlignment(SWT.CENTER);
		lbl_Presets.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_Presets.setBounds(784 + plusX, 387 + plusY, 76, 23);
		lbl_Presets.setText("Presets");
		
		Label lbl_HudAsset = new Label(App_UI, SWT.NONE);
		lbl_HudAsset.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_HudAsset.setBounds(18 + plusX, 391 + plusY, 55, 15);
		lbl_HudAsset.setText("HUD Asset");
		
		Label lbl_AtH = new Label(App_UI, SWT.NONE);
		lbl_AtH.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_AtH.setBounds(18 + plusX, 455 + plusY, 55, 15);
		lbl_AtH.setText("Horizontal");
		
		Label lbl_AtV = new Label(App_UI, SWT.NONE);
		lbl_AtV.setText("Vertical");
		lbl_AtV.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_AtV.setBounds(18 + plusX, 495 + plusY, 38, 15);
		
		Label lbl_AV = new Label(App_UI, SWT.NONE);
		lbl_AV.setText("Vertical");
		lbl_AV.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_AV.setBounds(18 + plusX, 593 + plusY, 38, 15);
		
		Label lbl_AH = new Label(App_UI, SWT.NONE);
		lbl_AH.setText("Horizontal");
		lbl_AH.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_AH.setBounds(18 + plusX, 554 + plusY, 55, 15);
		
		Label lbl_relativeTo = new Label(App_UI, SWT.NONE);
		lbl_relativeTo.setAlignment(SWT.CENTER);
		lbl_relativeTo.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_relativeTo.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_relativeTo.setBounds(552 + plusX, 388 + plusY, 88, 23);
		lbl_relativeTo.setText("Relative To");
		
		Label lblMode = new Label(App_UI, SWT.NONE);
		lblMode.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lblMode.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lblMode.setBounds(51, 10, 38, 15);
		lblMode.setText("Mode");
		
		Label lbl_Other = new Label(App_UI, SWT.NONE);
		lbl_Other.setAlignment(SWT.CENTER);
		lbl_Other.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD));
		lbl_Other.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_Other.setBounds(564 + plusX, 511 + plusY, 54, 21);
		lbl_Other.setText("Other");
		
		Label lbl_Value = new Label(App_UI, SWT.NONE);
		lbl_Value.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		lbl_Value.setBounds(522 + plusX, 540 + plusY, 55, 15);
		lbl_Value.setText("Value");
		
		
	}
}
