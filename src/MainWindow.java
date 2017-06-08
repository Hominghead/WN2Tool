import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private Core iCore;
	
	private String charname = "";
	private String skinname = "";
	private String flashlightname = "";
	private int Speed = 0;
	private int addSpeed = 0;
	private int Endurance = 0;
	private int addEndurance = 0;
	private int Exploration = 0;
	private int addExploration = 0;
	private int BatMan = 0;
	private int addBatMan = 0;
	private int Bravery = 0;
	private int addBravery = 0;
	private int Stealth = 0;
	private int addStealth = 0;
	private int Vitality = 0;
	private int addVitality = 0;
	private int fSpeed = 0;
	private int fRange = 0;
	private int fSpread = 0;
	private int fBatLife = 0;
	private int fEndurance = 0;
	private int fExploration = 0;
	private int fStealth = 0;
	
	private JLabel lblSpeed;
	private JLabel lblEndurance;
	private JLabel lblVitality;
	private JLabel lblExploration;
	private JLabel lblBravery;
	private JLabel lblStealth;
	private JLabel lblBatMan;
	private JLabel lblRange;
	private JLabel lblSpread;
	private JLabel lblBatLife;
	private JLabel lblC_Speed;
	private JLabel lblC_Endurance;
	private JLabel lblC_Vitality;
	private JLabel lblC_Exploration;
	private JLabel lblC_Bravery;
	private JLabel lblC_Stealth;
	private JLabel lblC_BatMan;
	private JLabel lblC_Range;
	private JLabel lblC_Spread;
	private JLabel lblC_BatLife;
	private JLabel lblF_Range;
	private JLabel lblF_BatLife;
	private JLabel lblF_Spread;
	private JLabel lblF_Endurance;
	private JLabel lblF_Stealth;
	private JLabel lblF_Speed;
	private JLabel lblF_Exploration;
	private JLabel lblE_Speed;
	private JLabel lblE_Endurance;
	private JLabel lblE_Exploration;
	private JLabel lblE_Bravery;
	private JLabel lblE_Stealth;
	private JLabel lblE_BatMan;
	private JLabel lblE_Range;
	private JLabel lblE_Spread;
	private JLabel lblE_BatLife;
	private JLabel lblE_Vitality;
	private JLabel lblCharacterStats;
	private JLabel lblFlashlightStats;
	private JLabel lblTotalStats;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setTitle("White Noise 2 Tool");
		setResizable(false);
		iCore = new Core(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox<String> cbox_Character = new JComboBox<>();
		cbox_Character.setBounds(10, 327, 210, 22);
		contentPane.add(cbox_Character);
		//Add Characters to Combobox
		String[] temp_array_chars = iCore.get_Chars();
		for(int i = 0; i < temp_array_chars.length; i++) {
	      cbox_Character.addItem(temp_array_chars[i]);
		}
		temp_array_chars = null;
		
		JComboBox<String> cbox_Skin = new JComboBox<>();
		cbox_Skin.setEnabled(false);
		cbox_Skin.setBounds(230, 327, 210, 22);
		contentPane.add(cbox_Skin);
		
		JComboBox<String> cbox_Equip = new JComboBox<>();
		cbox_Equip.setBounds(450, 327, 210, 22);
		contentPane.add(cbox_Equip);
		String[] temp_array_equips = iCore.get_Flashlights();
		for(int i = 0; i < temp_array_equips.length; i++) {
	      cbox_Equip.addItem(temp_array_equips[i]);
		}
		temp_array_equips = null;
		
		lblVitality = new JLabel("VITALITY");
		lblVitality.setBounds(10, 29, 210, 14);
		contentPane.add(lblVitality);
		
		lblSpeed = new JLabel("SPEED");
		lblSpeed.setBounds(10, 54, 210, 14);
		contentPane.add(lblSpeed);
		
		lblEndurance = new JLabel("ENDURANCE");
		lblEndurance.setBounds(10, 79, 210, 14);
		contentPane.add(lblEndurance);
		
		lblExploration = new JLabel("EXPLORATION");
		lblExploration.setBounds(10, 104, 210, 14);
		contentPane.add(lblExploration);
		
		lblBravery = new JLabel("BRAVERY");
		lblBravery.setBounds(10, 129, 210, 14);
		contentPane.add(lblBravery);
		
		lblStealth = new JLabel("STEALTH");
		lblStealth.setBounds(10, 154, 210, 14);
		contentPane.add(lblStealth);
		
		lblBatMan = new JLabel("BATTERY MANAGEMENT");
		lblBatMan.setBounds(10, 179, 210, 14);
		contentPane.add(lblBatMan);
		
		lblRange = new JLabel("RANGE");
		lblRange.setBounds(10, 204, 210, 14);
		contentPane.add(lblRange);
		
		lblSpread = new JLabel("SPREAD");
		lblSpread.setBounds(10, 229, 210, 14);
		contentPane.add(lblSpread);
		
		lblBatLife = new JLabel("BATTERY LIFE");
		lblBatLife.setBounds(10, 254, 210, 14);
		contentPane.add(lblBatLife);
		
		lblC_Vitality = new JLabel("");
		lblC_Vitality.setBounds(230, 29, 107, 14);
		contentPane.add(lblC_Vitality);
		
		lblC_Speed = new JLabel("");
		lblC_Speed.setBounds(230, 54, 107, 14);
		contentPane.add(lblC_Speed);
		
		lblC_Endurance = new JLabel("");
		lblC_Endurance.setBounds(230, 79, 107, 14);
		contentPane.add(lblC_Endurance);
		
		lblC_Exploration = new JLabel("");
		lblC_Exploration.setBounds(230, 104, 107, 14);
		contentPane.add(lblC_Exploration);
		
		lblC_Bravery = new JLabel("");
		lblC_Bravery.setBounds(230, 129, 107, 14);
		contentPane.add(lblC_Bravery);
		
		lblC_Stealth = new JLabel("");
		lblC_Stealth.setBounds(230, 154, 107, 14);
		contentPane.add(lblC_Stealth);
		
		lblC_BatMan = new JLabel("");
		lblC_BatMan.setBounds(230, 179, 107, 14);
		contentPane.add(lblC_BatMan);
		
		lblC_Range = new JLabel("");
		lblC_Range.setBounds(230, 204, 107, 14);
		contentPane.add(lblC_Range);
		
		lblC_Spread = new JLabel("");
		lblC_Spread.setBounds(230, 229, 107, 14);
		contentPane.add(lblC_Spread);
		
		lblC_BatLife = new JLabel("");
		lblC_BatLife.setBounds(230, 254, 107, 14);
		contentPane.add(lblC_BatLife);
		
		lblF_Range = new JLabel("");
		lblF_Range.setBounds(347, 204, 93, 14);
		contentPane.add(lblF_Range);
		
		lblF_BatLife = new JLabel("");
		lblF_BatLife.setBounds(347, 254, 93, 14);
		contentPane.add(lblF_BatLife);
		
		lblF_Spread = new JLabel("");
		lblF_Spread.setBounds(347, 229, 93, 14);
		contentPane.add(lblF_Spread);
		
		lblF_Endurance = new JLabel("");
		lblF_Endurance.setBounds(347, 79, 93, 14);
		contentPane.add(lblF_Endurance);
		
		lblF_Stealth = new JLabel("");
		lblF_Stealth.setBounds(347, 154, 93, 14);
		contentPane.add(lblF_Stealth);
		
		lblF_Speed = new JLabel("");
		lblF_Speed.setBounds(347, 54, 93, 14);
		contentPane.add(lblF_Speed);
		
		lblF_Exploration = new JLabel("");
		lblF_Exploration.setBounds(347, 104, 93, 14);
		contentPane.add(lblF_Exploration);
		
		lblE_Vitality = new JLabel("");
		lblE_Vitality.setBounds(450, 29, 107, 14);
		contentPane.add(lblE_Vitality);
		
		lblE_Speed = new JLabel("");
		lblE_Speed.setBounds(450, 54, 107, 14);
		contentPane.add(lblE_Speed);
		
		lblE_Endurance = new JLabel("");
		lblE_Endurance.setBounds(450, 79, 107, 14);
		contentPane.add(lblE_Endurance);
		
		lblE_Exploration = new JLabel("");
		lblE_Exploration.setBounds(450, 104, 107, 14);
		contentPane.add(lblE_Exploration);
		
		lblE_Bravery = new JLabel("");
		lblE_Bravery.setBounds(450, 129, 107, 14);
		contentPane.add(lblE_Bravery);
		
		lblE_Stealth = new JLabel("");
		lblE_Stealth.setBounds(450, 154, 107, 14);
		contentPane.add(lblE_Stealth);
		
		lblE_BatMan = new JLabel("");
		lblE_BatMan.setBounds(450, 179, 107, 14);
		contentPane.add(lblE_BatMan);
		
		lblE_Range = new JLabel("");
		lblE_Range.setBounds(450, 204, 107, 14);
		contentPane.add(lblE_Range);
		
		lblE_Spread = new JLabel("");
		lblE_Spread.setBounds(450, 229, 107, 14);
		contentPane.add(lblE_Spread);
		
		lblE_BatLife = new JLabel("");
		lblE_BatLife.setBounds(450, 254, 107, 14);
		contentPane.add(lblE_BatLife);
		
		JLabel lblCharacter = new JLabel("CHARACTER");
		lblCharacter.setBounds(10, 297, 210, 14);
		contentPane.add(lblCharacter);
		
		JLabel lblSkin = new JLabel("SKIN");
		lblSkin.setBounds(230, 297, 210, 14);
		contentPane.add(lblSkin);
		
		JLabel lblFlashlight = new JLabel("FLASHLIGHT");
		lblFlashlight.setBounds(450, 297, 210, 14);
		contentPane.add(lblFlashlight);
		
		lblNewLabel = new JLabel("Character Stats");
		lblNewLabel.setBounds(230, 11, 107, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Flashlight Stats");
		lblNewLabel_1.setBounds(347, 11, 93, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Total Stats");
		lblNewLabel_2.setBounds(450, 11, 107, 14);
		contentPane.add(lblNewLabel_2);
		
		//Load Stats when new Char is selected
		cbox_Character.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					charname = (String) e.getItem();
					String[] temp_array_chars = iCore.get_Stats(charname);
					for(int i = 0; i < temp_array_chars.length; i++) {
						switch (i){
						case 0:  Speed = Integer.parseInt(temp_array_chars[i]); break;
				    	case 1:  Endurance = Integer.parseInt(temp_array_chars[i]); break;
				    	case 2:  Exploration = Integer.parseInt(temp_array_chars[i]); break;
				    	case 3:  BatMan = Integer.parseInt(temp_array_chars[i]); break;
				    	case 4:  Bravery = Integer.parseInt(temp_array_chars[i]); break;
				    	case 5:  Stealth = Integer.parseInt(temp_array_chars[i]); break;
				    	case 6:  Vitality = Integer.parseInt(temp_array_chars[i]); break;
						}
					}
					temp_array_chars = null;
					String[] char_skin_stats = iCore.get_SkinStats(charname);
					cbox_Skin.setEnabled(true);
					cbox_Skin.removeAllItems();
					for (int i = 0; i < char_skin_stats.length; i++) {
						if (char_skin_stats[i].contains(":")){
						  String part[] = char_skin_stats[i].split(":");
						  cbox_Skin.addItem(part[0]);
						} else {
						  cbox_Skin.addItem(char_skin_stats[i]); // Adds Default Skin to the ComboBox List
						}
					}
				}
			}
		});
		cbox_Character.setSelectedIndex(1);
		cbox_Character.setSelectedIndex(0);
		cbox_Skin.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					skinname = (String) e.getItem();
					String[] char_skin_stats = iCore.get_SkinStats(charname);
					addSpeed = 0;
					addEndurance = 0;
					addExploration = 0;
					addBatMan = 0;
					addBravery = 0;
					addStealth = 0;
					addVitality = 0;
					for (int i = 0; i < char_skin_stats.length; i++) {
						if (char_skin_stats[i].contains(skinname) && char_skin_stats[i].contains(":")){
							String part[] = char_skin_stats[i].split(":");
							String stats[] = part[1].split(";");
							for (int j = 0; j < stats.length; j++){
								String split_stat[] = stats[j].split("=");
								if (split_stat[0].equals("Speed")) {addSpeed=Integer.parseInt(split_stat[1]);}
							  	if (split_stat[0].equals("Endurance")) {addEndurance=Integer.parseInt(split_stat[1]);}
							  	if (split_stat[0].equals("Exploration")) {addExploration=Integer.parseInt(split_stat[1]);}
							  	if (split_stat[0].equals("Battery Management")) {addBatMan=Integer.parseInt(split_stat[1]);}
							  	if (split_stat[0].equals("Bravery")) {addBravery=Integer.parseInt(split_stat[1]);}
							  	if (split_stat[0].equals("Stealth")) {addStealth=Integer.parseInt(split_stat[1]);}
							  	if (split_stat[0].equals("Vitality")) {addVitality=Integer.parseInt(split_stat[1]);}
							}
						}
					}
					setLabels();
				}
			}
		});
		cbox_Skin.setSelectedIndex(1);
		cbox_Skin.setSelectedIndex(0);
		cbox_Equip.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					flashlightname = (String) e.getItem();
					String[] temp_array_flashs = iCore.get_FlashStats(flashlightname);
					for(int i = 0; i < temp_array_flashs.length; i++) {
						switch (i){
						case 0:  fBatLife = Integer.parseInt(temp_array_flashs[i]); break;
				    	case 1:  fRange = Integer.parseInt(temp_array_flashs[i]); break;
				    	case 2:  fSpread = Integer.parseInt(temp_array_flashs[i]); break;
				    	case 3:  fSpeed = Integer.parseInt(temp_array_flashs[i]); break;
				    	case 4:  fEndurance = Integer.parseInt(temp_array_flashs[i]); break;
				    	case 5:  fExploration = Integer.parseInt(temp_array_flashs[i]); break;
				    	case 6:  fStealth = Integer.parseInt(temp_array_flashs[i]); break;
						}
					}
					temp_array_flashs = null;
					setLabels();
				}
			}
		});
		cbox_Equip.setSelectedIndex(1);
		cbox_Equip.setSelectedIndex(0);
	}
	public void setLabels(){
		lblC_Speed.setText(String.valueOf(Speed+addSpeed));
		lblC_Endurance.setText(String.valueOf(Endurance+addEndurance));
		lblC_Exploration.setText(String.valueOf(Exploration+addExploration));
		lblC_BatMan.setText(String.valueOf(BatMan+addBatMan));
		lblC_Bravery.setText(String.valueOf(Bravery+addBravery));
		lblC_Stealth.setText(String.valueOf(Stealth+addStealth));
		lblC_Vitality.setText(String.valueOf(Vitality+addVitality));
		lblF_BatLife.setText(String.valueOf(fBatLife));
		lblF_Range.setText(String.valueOf(fRange));
		lblF_Spread.setText(String.valueOf(fSpread));
		lblF_Speed.setText(String.valueOf(fSpeed));
		lblF_Endurance.setText(String.valueOf(fEndurance));
		lblF_Exploration.setText(String.valueOf(fExploration));
		lblF_Stealth.setText(String.valueOf(fStealth));

		float temp_calc = 0.0f;
		temp_calc = Vitality+addVitality-5.0f;
		lblE_Vitality.setText(String.valueOf(temp_calc));
		temp_calc = Speed+addSpeed-5.0f+((fSpeed-5.0f)/2.0f);
		lblE_Speed.setText(String.valueOf(temp_calc));
		temp_calc = Endurance+addEndurance-5.0f+((fEndurance-5.0f)/2.0f);
		lblE_Endurance.setText(String.valueOf(temp_calc));
		temp_calc = Exploration+addExploration-5.0f+((fExploration-5.0f)/2.0f);
		lblE_Exploration.setText(String.valueOf(temp_calc));
		temp_calc = Bravery+addBravery-5.0f;
		lblE_Bravery.setText(String.valueOf(temp_calc));
		temp_calc = Stealth+addStealth-5.0f+((fStealth-5.0f)/2.0f);
		lblE_Stealth.setText(String.valueOf(temp_calc));
		temp_calc = BatMan+addBatMan-5.0f;
		lblE_BatMan.setText(String.valueOf(temp_calc));
		temp_calc = (BatMan+addBatMan-5.0f)/2.0f+fRange-5.0f;
		lblE_Range.setText(String.valueOf(temp_calc));
		temp_calc = fSpread-5.0f;
		lblE_Spread.setText(String.valueOf(temp_calc));
		temp_calc = fBatLife-5.0f;
		lblE_BatLife.setText(String.valueOf(temp_calc));
		temp_calc = 0.0f;
	}
}
