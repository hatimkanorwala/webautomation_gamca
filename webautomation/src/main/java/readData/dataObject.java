package readData;

import java.sql.Date;

public class dataObject {
	private  long  Patient_Id;
	private  int Org_Id;
	private  String PassPort_No;
	private  String First_Name;
	private  String Last_Name;
	private  String PassPort_Place;
	private  Date Passport_IssueDt;
	private  String Mofa_No;
	private  Date Examine_Date;
	private  String Sex;
	private  long Amount;
	private  long Patient_MobileNo;
	private  Date Patient_ExpDt;
	private  String Marital_Status;
	private  String Religion_Name;
	private  String Nationality;
	private  String Possition_Name;
	private  String Country_Name;
	private  String Agent_Name;
	private  String Sub_Agent_Name;
	private  String Height;
	private  String Weight;
	private  Date Date_Of_Birth;
	private  int Age;
	private  String Visa_No;
	private  String Visa_Date;
	private  String Eye_Right;
	private  String Eye_Left;
	private  String Ear_Right;
	private  String Ear_Left;
	private  String Cardio_Vascular;
	private  String Blood_Group;
	private  String FBS;
	private  String Blood_Haemoglobin;
	private  String Blood_Thick;
	private  String Sysmetic_BP;
	private  String Sysmetic_Heart;
	private  String Respiratory_Lungs;
	private  String Chest_Xray;
	private  String Gastro_Abdomen;
	private  String Others_Harnia;
	private  String Others_Varicose_Veins;
	private  String Others_Extremites;
	private  String Others_Deformites;
	private  String Others_Skin;
	private  String Others_Clinical;
	private  String Others_Cns;
	private  String Others_psychiatry;
	private  String Lab_Urine_Sugar;
	private  String Lab_Urine_Albumin;
	private  String Lab_Urine_Bilharzsis;
	private  String Lab_Stool_Routine;
	private  String Lab_Stool_Helminthes;
	private  String Lab_Stool_Glardia;
	private  String Lab_Stool_Bilharziasis;
	private  String Lab_Stool_Culture;
	private  String Lab_Stool_Samonella;
	private  String Lab_Stool_Shigella;
	private  String Lab_stool_Cholera;
	private  String Maleria;
	private  String Micro_Filaria;
	private  String Serolgy_RBS;
	private  String Serolgy_Lfts;
	private  String Serolgy_Creatinine;
	private  String Elisa_HIV;
	private  String Elisa_HBS;
	private  String Elisa_AntiHCV;
	private  String VDRL;
	private  String TPHA;
	private  String SGOT;
	private  String SGPT;
	private  String ALBUMIN;
	private  String TPROTIEN;
	private  String TBILIRUBIN;
	private  String Dbilirubin;
	private  String GGTP;
	private  String ALKALINE;
	private  String Pregnancy_Test;
	private  String Vision;
	private  String Spleen;
	private  String Fluid;
	private  String Liver;
	private  String Reflexes;
	private  String Parasis;
	private  String Others;
	private  String PCV;
	private  String Microscopic;
	private  String Urine;
	private  String Medical_Remark;
	private  String Medical_Status;
	private  String Pathology_Remark;
	private  String Pathology_Status;
	private  String XRay_Remarks;
	private  String XRay_Status;
	private  String Final_Remarks;
	private  String Final_Status;
	private  String Serial_No;
	private  String Photo_Path;
	//private  Thumb_Impression;
	private  String Thumb_Path;
	//private  Thumb_Template;
	//private  Photo_Image;
	//private  BarCode;
	private  Date Innoculation_Dt;
	private  String Batch_No;
	private  String Mfg_Name;
	private  Date Mfg_date;
	private  Date Expiry_date;
	private  String Illness1;
	private  String Illness2;
	private  String Illness3;
	private  long Patient_Deleted;
	private  String Xray_check;
	private  int Pathology_check;
	private  int Medical_check;
	private  String SerialNo;
	private  Date Xray_VerifyDt;
	private  Date Pathology_VerifyDt;
	private  Date Medical_VerifyDt;
	private  String Receiption_Remarks;
	private  int Crt_User;
	private  Date Crt_Date;
	private  int Upd_User;
	private  Date Upd_Date;
	private  int Del_User;
	private  Date Del_Date;
	private  String SEARCH_TEXT;
	private  Date Mofa_Date;
	private  String Gamcaslip_No;
	private  Date Gamcaslip_date;
	private  String MOFA_REMARKS;
	private  Date PREVMOFA_DATE;
	private  String PREVMOFA_NO;
	private  String Batch_No2;
	private  String Batch_No3;
	private  String Mfg_Name2;
	private  String Mfg_Name3;
	private  Date Mfg_Date2;
	private  Date Mfg_Date3;
	private  Date Expiry_Date2;
	private  Date Expiry_Date3;
	private  String Sysmetic_RR;
	private  String DULtEye;
	private  String DURtEye;
	private  String DALtEye;
	private  String DARtEye;
	private  String NALtEye;
	private  String NARtEye;
	private  String NULtEye;
	private  String NURtEye;
	private  String Genitourinary;
	private  String Hydrocele;
	private  String Appearance;
	private  String Orientation;
	private  String Behaviour;
	private  String Memory;
	private  String Mood;
	private  String Thoughts;
	private  String Cognition;
	private  String Concentration;
	private  String Speech;
	private  String Back;
	private  String Pulse;
	private  boolean MMR1;
	private  boolean MMR2;
	private  boolean Meningococcal;
	private  String VaccRemarks;
	private  boolean MMR;
	private  boolean POLIO;
	private  String Temp;
	private  String oxy;
	private  Date DOSE1;
	private  Date DOSE2;
	private  String COVID;
	private  String hremarks;
	
	public  long getPatient_Id() {
		return Patient_Id;
	}
	public  void setPatient_Id(long patient_Id) {
		Patient_Id = patient_Id;
	}
	public  int getOrg_Id() {
		return Org_Id;
	}
	public  void setOrg_Id(int org_Id) {
		Org_Id = org_Id;
	}
	public String getPassPort_No() {
		return PassPort_No;
	}
	public  void setPassPort_No(String passPort_No) {
		PassPort_No = passPort_No;
	}
	public  String getFirst_Name() {
		return First_Name;
	}
	public  void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public  String getLast_Name() {
		return Last_Name;
	}
	public  void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public  String getPassPort_Place() {
		return PassPort_Place;
	}
	public  void setPassPort_Place(String passPort_Place) {
		PassPort_Place = passPort_Place;
	}
	public  Date getPassport_IssueDt() {
		return Passport_IssueDt;
	}
	public  void setPassport_IssueDt(Date passport_IssueDt) {
		Passport_IssueDt = passport_IssueDt;
	}
	public  String getMofa_No() {
		return Mofa_No;
	}
	public  void setMofa_No(String mofa_No) {
		Mofa_No = mofa_No;
	}
	public  Date getExamine_Date() {
		return Examine_Date;
	}
	public  void setExamine_Date(Date examine_Date) {
		Examine_Date = examine_Date;
	}
	public  String getSex() {
		return Sex;
	}
	public  void setSex(String sex) {
		Sex = sex;
	}
	public  long getAmount() {
		return Amount;
	}
	public  void setAmount(long amount) {
		Amount = amount;
	}
	public  long getPatient_MobileNo() {
		return Patient_MobileNo;
	}
	public  void setPatient_MobileNo(long patient_MobileNo) {
		Patient_MobileNo = patient_MobileNo;
	}
	public  Date getPatient_ExpDt() {
		return Patient_ExpDt;
	}
	public  void setPatient_ExpDt(Date patient_ExpDt) {
		Patient_ExpDt = patient_ExpDt;
	}
	public  String getMarital_Status() {
		return Marital_Status;
	}
	public  void setMarital_Status(String marital_Status) {
		Marital_Status = marital_Status;
	}
	public  String getReligion_Name() {
		return Religion_Name;
	}
	public  void setReligion_Name(String religion_Name) {
		Religion_Name = religion_Name;
	}
	public  String getNationality() {
		return Nationality;
	}
	public  void setNationality(String nationality) {
		Nationality = nationality;
	}
	public  String getPossition_Name() {
		return Possition_Name;
	}
	public  void setPossition_Name(String possition_Name) {
		Possition_Name = possition_Name;
	}
	public  String getCountry_Name() {
		return Country_Name;
	}
	public  void setCountry_Name(String country_Name) {
		Country_Name = country_Name;
	}
	public  String getAgent_Name() {
		return Agent_Name;
	}
	public  void setAgent_Name(String agent_Name) {
		Agent_Name = agent_Name;
	}
	public  String getSub_Agent_Name() {
		return Sub_Agent_Name;
	}
	public  void setSub_Agent_Name(String sub_Agent_Name) {
		Sub_Agent_Name = sub_Agent_Name;
	}
	public  String getHeight() {
		return Height;
	}
	public  void setHeight(String height) {
		Height = height;
	}
	public  String getWeight() {
		return Weight;
	}
	public  void setWeight(String weight) {
		Weight = weight;
	}
	public  Date getDate_Of_Birth() {
		return Date_Of_Birth;
	}
	public  void setDate_Of_Birth(Date date_Of_Birth) {
		Date_Of_Birth = date_Of_Birth;
	}
	public  int getAge() {
		return Age;
	}
	public  void setAge(int age) {
		Age = age;
	}
	public  String getVisa_No() {
		return Visa_No;
	}
	public  void setVisa_No(String visa_No) {
		Visa_No = visa_No;
	}
	public  String getVisa_Date() {
		return Visa_Date;
	}
	public  void setVisa_Date(String visa_Date) {
		Visa_Date = visa_Date;
	}
	public  String getEye_Right() {
		return Eye_Right;
	}
	public  void setEye_Right(String eye_Right) {
		Eye_Right = eye_Right;
	}
	public  String getEye_Left() {
		return Eye_Left;
	}
	public  void setEye_Left(String eye_Left) {
		Eye_Left = eye_Left;
	}
	public  String getEar_Right() {
		return Ear_Right;
	}
	public  void setEar_Right(String ear_Right) {
		Ear_Right = ear_Right;
	}
	public  String getEar_Left() {
		return Ear_Left;
	}
	public  void setEar_Left(String ear_Left) {
		Ear_Left = ear_Left;
	}
	public  String getCardio_Vascular() {
		return Cardio_Vascular;
	}
	public  void setCardio_Vascular(String cardio_Vascular) {
		Cardio_Vascular = cardio_Vascular;
	}
	public  String getBlood_Group() {
		return Blood_Group;
	}
	public  void setBlood_Group(String blood_Group) {
		Blood_Group = blood_Group;
	}
	public  String getFBS() {
		return FBS;
	}
	public  void setFBS(String fBS) {
		FBS = fBS;
	}
	public  String getBlood_Haemoglobin() {
		return Blood_Haemoglobin;
	}
	public  void setBlood_Haemoglobin(String blood_Haemoglobin) {
		Blood_Haemoglobin = blood_Haemoglobin;
	}
	public  String getBlood_Thick() {
		return Blood_Thick;
	}
	public  void setBlood_Thick(String blood_Thick) {
		Blood_Thick = blood_Thick;
	}
	public  String getSysmetic_BP() {
		return Sysmetic_BP;
	}
	public  void setSysmetic_BP(String sysmetic_BP) {
		Sysmetic_BP = sysmetic_BP;
	}
	public  String getSysmetic_Heart() {
		return Sysmetic_Heart;
	}
	public  void setSysmetic_Heart(String sysmetic_Heart) {
		Sysmetic_Heart = sysmetic_Heart;
	}
	public  String getRespiratory_Lungs() {
		return Respiratory_Lungs;
	}
	public  void setRespiratory_Lungs(String respiratory_Lungs) {
		Respiratory_Lungs = respiratory_Lungs;
	}
	public  String getChest_Xray() {
		return Chest_Xray;
	}
	public  void setChest_Xray(String chest_Xray) {
		Chest_Xray = chest_Xray;
	}
	public  String getGastro_Abdomen() {
		return Gastro_Abdomen;
	}
	public  void setGastro_Abdomen(String gastro_Abdomen) {
		Gastro_Abdomen = gastro_Abdomen;
	}
	public  String getOthers_Harnia() {
		return Others_Harnia;
	}
	public  void setOthers_Harnia(String others_Harnia) {
		Others_Harnia = others_Harnia;
	}
	public  String getOthers_Varicose_Veins() {
		return Others_Varicose_Veins;
	}
	public  void setOthers_Varicose_Veins(String others_Varicose_Veins) {
		Others_Varicose_Veins = others_Varicose_Veins;
	}
	public  String getOthers_Extremites() {
		return Others_Extremites;
	}
	public  void setOthers_Extremites(String others_Extremites) {
		Others_Extremites = others_Extremites;
	}
	public  String getOthers_Deformites() {
		return Others_Deformites;
	}
	public  void setOthers_Deformites(String others_Deformites) {
		Others_Deformites = others_Deformites;
	}
	public  String getOthers_Skin() {
		return Others_Skin;
	}
	public  void setOthers_Skin(String others_Skin) {
		Others_Skin = others_Skin;
	}
	public  String getOthers_Clinical() {
		return Others_Clinical;
	}
	public  void setOthers_Clinical(String others_Clinical) {
		Others_Clinical = others_Clinical;
	}
	public  String getOthers_Cns() {
		return Others_Cns;
	}
	public  void setOthers_Cns(String others_Cns) {
		Others_Cns = others_Cns;
	}
	public  String getOthers_psychiatry() {
		return Others_psychiatry;
	}
	public  void setOthers_psychiatry(String others_psychiatry) {
		Others_psychiatry = others_psychiatry;
	}
	public  String getLab_Urine_Sugar() {
		return Lab_Urine_Sugar;
	}
	public  void setLab_Urine_Sugar(String lab_Urine_Sugar) {
		Lab_Urine_Sugar = lab_Urine_Sugar;
	}
	public  String getLab_Urine_Albumin() {
		return Lab_Urine_Albumin;
	}
	public  void setLab_Urine_Albumin(String lab_Urine_Albumin) {
		Lab_Urine_Albumin = lab_Urine_Albumin;
	}
	public  String getLab_Urine_Bilharzsis() {
		return Lab_Urine_Bilharzsis;
	}
	public  void setLab_Urine_Bilharzsis(String lab_Urine_Bilharzsis) {
		Lab_Urine_Bilharzsis = lab_Urine_Bilharzsis;
	}
	public  String getLab_Stool_Routine() {
		return Lab_Stool_Routine;
	}
	public  void setLab_Stool_Routine(String lab_Stool_Routine) {
		Lab_Stool_Routine = lab_Stool_Routine;
	}
	public  String getLab_Stool_Helminthes() {
		return Lab_Stool_Helminthes;
	}
	public  void setLab_Stool_Helminthes(String lab_Stool_Helminthes) {
		Lab_Stool_Helminthes = lab_Stool_Helminthes;
	}
	public  String getLab_Stool_Glardia() {
		return Lab_Stool_Glardia;
	}
	public  void setLab_Stool_Glardia(String lab_Stool_Glardia) {
		Lab_Stool_Glardia = lab_Stool_Glardia;
	}
	public  String getLab_Stool_Bilharziasis() {
		return Lab_Stool_Bilharziasis;
	}
	public  void setLab_Stool_Bilharziasis(String lab_Stool_Bilharziasis) {
		Lab_Stool_Bilharziasis = lab_Stool_Bilharziasis;
	}
	public  String getLab_Stool_Culture() {
		return Lab_Stool_Culture;
	}
	public  void setLab_Stool_Culture(String lab_Stool_Culture) {
		Lab_Stool_Culture = lab_Stool_Culture;
	}
	public  String getLab_Stool_Samonella() {
		return Lab_Stool_Samonella;
	}
	public  void setLab_Stool_Samonella(String lab_Stool_Samonella) {
		Lab_Stool_Samonella = lab_Stool_Samonella;
	}
	public  String getLab_Stool_Shigella() {
		return Lab_Stool_Shigella;
	}
	public  void setLab_Stool_Shigella(String lab_Stool_Shigella) {
		Lab_Stool_Shigella = lab_Stool_Shigella;
	}
	public  String getLab_stool_Cholera() {
		return Lab_stool_Cholera;
	}
	public  void setLab_stool_Cholera(String lab_stool_Cholera) {
		Lab_stool_Cholera = lab_stool_Cholera;
	}
	public  String getMaleria() {
		return Maleria;
	}
	public  void setMaleria(String maleria) {
		Maleria = maleria;
	}
	public  String getMicro_Filaria() {
		return Micro_Filaria;
	}
	public  void setMicro_Filaria(String micro_Filaria) {
		Micro_Filaria = micro_Filaria;
	}
	public  String getSerolgy_RBS() {
		return Serolgy_RBS;
	}
	public  void setSerolgy_RBS(String serolgy_RBS) {
		Serolgy_RBS = serolgy_RBS;
	}
	public  String getSerolgy_Lfts() {
		return Serolgy_Lfts;
	}
	public  void setSerolgy_Lfts(String serolgy_Lfts) {
		Serolgy_Lfts = serolgy_Lfts;
	}
	public  String getSerolgy_Creatinine() {
		return Serolgy_Creatinine;
	}
	public  void setSerolgy_Creatinine(String serolgy_Creatinine) {
		Serolgy_Creatinine = serolgy_Creatinine;
	}
	public  String getElisa_HIV() {
		return Elisa_HIV;
	}
	public  void setElisa_HIV(String elisa_HIV) {
		Elisa_HIV = elisa_HIV;
	}
	public  String getElisa_HBS() {
		return Elisa_HBS;
	}
	public  void setElisa_HBS(String elisa_HBS) {
		Elisa_HBS = elisa_HBS;
	}
	public  String getElisa_AntiHCV() {
		return Elisa_AntiHCV;
	}
	public  void setElisa_AntiHCV(String elisa_AntiHCV) {
		Elisa_AntiHCV = elisa_AntiHCV;
	}
	public  String getVDRL() {
		return VDRL;
	}
	public  void setVDRL(String vDRL) {
		VDRL = vDRL;
	}
	public  String getTPHA() {
		return TPHA;
	}
	public  void setTPHA(String tPHA) {
		TPHA = tPHA;
	}
	public  String getSGOT() {
		return SGOT;
	}
	public  void setSGOT(String sGOT) {
		SGOT = sGOT;
	}
	public  String getSGPT() {
		return SGPT;
	}
	public  void setSGPT(String sGPT) {
		SGPT = sGPT;
	}
	public  String getALBUMIN() {
		return ALBUMIN;
	}
	public  void setALBUMIN(String aLBUMIN) {
		ALBUMIN = aLBUMIN;
	}
	public  String getTPROTIEN() {
		return TPROTIEN;
	}
	public  void setTPROTIEN(String tPROTIEN) {
		TPROTIEN = tPROTIEN;
	}
	public  String getTBILIRUBIN() {
		return TBILIRUBIN;
	}
	public  void setTBILIRUBIN(String tBILIRUBIN) {
		TBILIRUBIN = tBILIRUBIN;
	}
	public  String getDbilirubin() {
		return Dbilirubin;
	}
	public  void setDbilirubin(String dbilirubin) {
		Dbilirubin = dbilirubin;
	}
	public  String getGGTP() {
		return GGTP;
	}
	public  void setGGTP(String gGTP) {
		GGTP = gGTP;
	}
	public  String getALKALINE() {
		return ALKALINE;
	}
	public  void setALKALINE(String aLKALINE) {
		ALKALINE = aLKALINE;
	}
	public  String getPregnancy_Test() {
		return Pregnancy_Test;
	}
	public  void setPregnancy_Test(String pregnancy_Test) {
		Pregnancy_Test = pregnancy_Test;
	}
	public  String getVision() {
		return Vision;
	}
	public  void setVision(String vision) {
		Vision = vision;
	}
	public  String getSpleen() {
		return Spleen;
	}
	public  void setSpleen(String spleen) {
		Spleen = spleen;
	}
	public  String getFluid() {
		return Fluid;
	}
	public  void setFluid(String fluid) {
		Fluid = fluid;
	}
	public  String getLiver() {
		return Liver;
	}
	public  void setLiver(String liver) {
		Liver = liver;
	}
	public  String getReflexes() {
		return Reflexes;
	}
	public  void setReflexes(String reflexes) {
		Reflexes = reflexes;
	}
	public  String getParasis() {
		return Parasis;
	}
	public  void setParasis(String parasis) {
		Parasis = parasis;
	}
	public  String getOthers() {
		return Others;
	}
	public  void setOthers(String others) {
		Others = others;
	}
	public  String getPCV() {
		return PCV;
	}
	public  void setPCV(String pCV) {
		PCV = pCV;
	}
	public  String getMicroscopic() {
		return Microscopic;
	}
	public  void setMicroscopic(String microscopic) {
		Microscopic = microscopic;
	}
	public  String getUrine() {
		return Urine;
	}
	public  void setUrine(String urine) {
		Urine = urine;
	}
	public  String getMedical_Remark() {
		return Medical_Remark;
	}
	public  void setMedical_Remark(String medical_Remark) {
		Medical_Remark = medical_Remark;
	}
	public  String getMedical_Status() {
		return Medical_Status;
	}
	public  void setMedical_Status(String medical_Status) {
		Medical_Status = medical_Status;
	}
	public  String getPathology_Remark() {
		return Pathology_Remark;
	}
	public  void setPathology_Remark(String pathology_Remark) {
		Pathology_Remark = pathology_Remark;
	}
	public  String getPathology_Status() {
		return Pathology_Status;
	}
	public  void setPathology_Status(String pathology_Status) {
		Pathology_Status = pathology_Status;
	}
	public  String getXRay_Remarks() {
		return XRay_Remarks;
	}
	public  void setXRay_Remarks(String xRay_Remarks) {
		XRay_Remarks = xRay_Remarks;
	}
	public  String getXRay_Status() {
		return XRay_Status;
	}
	public  void setXRay_Status(String xRay_Status) {
		XRay_Status = xRay_Status;
	}
	public  String getFinal_Remarks() {
		return Final_Remarks;
	}
	public  void setFinal_Remarks(String final_Remarks) {
		Final_Remarks = final_Remarks;
	}
	public  String getFinal_Status() {
		return Final_Status;
	}
	public  void setFinal_Status(String final_Status) {
		Final_Status = final_Status;
	}
	public  String getSerial_No() {
		return Serial_No;
	}
	public  void setSerial_No(String serial_No) {
		Serial_No = serial_No;
	}
	public  String getPhoto_Path() {
		return Photo_Path;
	}
	public  void setPhoto_Path(String photo_Path) {
		Photo_Path = photo_Path;
	}
	public  String getThumb_Path() {
		return Thumb_Path;
	}
	public  void setThumb_Path(String thumb_Path) {
		Thumb_Path = thumb_Path;
	}
	public  Date getInnoculation_Dt() {
		return Innoculation_Dt;
	}
	public  void setInnoculation_Dt(Date innoculation_Dt) {
		Innoculation_Dt = innoculation_Dt;
	}
	public  String getBatch_No() {
		return Batch_No;
	}
	public  void setBatch_No(String batch_No) {
		Batch_No = batch_No;
	}
	public  String getMfg_Name() {
		return Mfg_Name;
	}
	public  void setMfg_Name(String mfg_Name) {
		Mfg_Name = mfg_Name;
	}
	public  Date getMfg_date() {
		return Mfg_date;
	}
	public  void setMfg_date(Date mfg_date) {
		Mfg_date = mfg_date;
	}
	public  Date getExpiry_date() {
		return Expiry_date;
	}
	public  void setExpiry_date(Date expiry_date) {
		Expiry_date = expiry_date;
	}
	public  String getIllness1() {
		return Illness1;
	}
	public  void setIllness1(String illness1) {
		Illness1 = illness1;
	}
	public  String getIllness2() {
		return Illness2;
	}
	public  void setIllness2(String illness2) {
		Illness2 = illness2;
	}
	public  String getIllness3() {
		return Illness3;
	}
	public  void setIllness3(String illness3) {
		Illness3 = illness3;
	}
	public  long getPatient_Deleted() {
		return Patient_Deleted;
	}
	public  void setPatient_Deleted(long patient_Deleted) {
		Patient_Deleted = patient_Deleted;
	}
	public  String getXray_check() {
		return Xray_check;
	}
	public  void setXray_check(String xray_check) {
		Xray_check = xray_check;
	}
	public  int getPathology_check() {
		return Pathology_check;
	}
	public  void setPathology_check(int pathology_check) {
		Pathology_check = pathology_check;
	}
	public  int getMedical_check() {
		return Medical_check;
	}
	public  void setMedical_check(int medical_check) {
		Medical_check = medical_check;
	}
	public  String getSerialNo() {
		return SerialNo;
	}
	public  void setSerialNo(String serialNo) {
		SerialNo = serialNo;
	}
	public  Date getXray_VerifyDt() {
		return Xray_VerifyDt;
	}
	public  void setXray_VerifyDt(Date xray_VerifyDt) {
		Xray_VerifyDt = xray_VerifyDt;
	}
	public  Date getPathology_VerifyDt() {
		return Pathology_VerifyDt;
	}
	public  void setPathology_VerifyDt(Date pathology_VerifyDt) {
		Pathology_VerifyDt = pathology_VerifyDt;
	}
	public  Date getMedical_VerifyDt() {
		return Medical_VerifyDt;
	}
	public  void setMedical_VerifyDt(Date medical_VerifyDt) {
		Medical_VerifyDt = medical_VerifyDt;
	}
	public  String getReceiption_Remarks() {
		return Receiption_Remarks;
	}
	public  void setReceiption_Remarks(String receiption_Remarks) {
		Receiption_Remarks = receiption_Remarks;
	}
	public  int getCrt_User() {
		return Crt_User;
	}
	public  void setCrt_User(int crt_User) {
		Crt_User = crt_User;
	}
	public  Date getCrt_Date() {
		return Crt_Date;
	}
	public  void setCrt_Date(Date crt_Date) {
		Crt_Date = crt_Date;
	}
	public  int getUpd_User() {
		return Upd_User;
	}
	public  void setUpd_User(int upd_User) {
		Upd_User = upd_User;
	}
	public  Date getUpd_Date() {
		return Upd_Date;
	}
	public  void setUpd_Date(Date upd_Date) {
		Upd_Date = upd_Date;
	}
	public  int getDel_User() {
		return Del_User;
	}
	public  void setDel_User(int del_User) {
		Del_User = del_User;
	}
	public  Date getDel_Date() {
		return Del_Date;
	}
	public  void setDel_Date(Date del_Date) {
		Del_Date = del_Date;
	}
	public  String getSEARCH_TEXT() {
		return SEARCH_TEXT;
	}
	public  void setSEARCH_TEXT(String sEARCH_TEXT) {
		SEARCH_TEXT = sEARCH_TEXT;
	}
	public  Date getMofa_Date() {
		return Mofa_Date;
	}
	public  void setMofa_Date(Date mofa_Date) {
		Mofa_Date = mofa_Date;
	}
	public  String getGamcaslip_No() {
		return Gamcaslip_No;
	}
	public  void setGamcaslip_No(String gamcaslip_No) {
		Gamcaslip_No = gamcaslip_No;
	}
	public  Date getGamcaslip_date() {
		return Gamcaslip_date;
	}
	public  void setGamcaslip_date(Date gamcaslip_date) {
		Gamcaslip_date = gamcaslip_date;
	}
	public  String getMOFA_REMARKS() {
		return MOFA_REMARKS;
	}
	public  void setMOFA_REMARKS(String mOFA_REMARKS) {
		MOFA_REMARKS = mOFA_REMARKS;
	}
	public  Date getPREVMOFA_DATE() {
		return PREVMOFA_DATE;
	}
	public  void setPREVMOFA_DATE(Date pREVMOFA_DATE) {
		PREVMOFA_DATE = pREVMOFA_DATE;
	}
	public  String getPREVMOFA_NO() {
		return PREVMOFA_NO;
	}
	public  void setPREVMOFA_NO(String pREVMOFA_NO) {
		PREVMOFA_NO = pREVMOFA_NO;
	}
	public  String getBatch_No2() {
		return Batch_No2;
	}
	public  void setBatch_No2(String batch_No2) {
		Batch_No2 = batch_No2;
	}
	public  String getBatch_No3() {
		return Batch_No3;
	}
	public  void setBatch_No3(String batch_No3) {
		Batch_No3 = batch_No3;
	}
	public  String getMfg_Name2() {
		return Mfg_Name2;
	}
	public  void setMfg_Name2(String mfg_Name2) {
		Mfg_Name2 = mfg_Name2;
	}
	public  String getMfg_Name3() {
		return Mfg_Name3;
	}
	public  void setMfg_Name3(String mfg_Name3) {
		Mfg_Name3 = mfg_Name3;
	}
	public  Date getMfg_Date2() {
		return Mfg_Date2;
	}
	public  void setMfg_Date2(Date mfg_Date2) {
		Mfg_Date2 = mfg_Date2;
	}
	public  Date getMfg_Date3() {
		return Mfg_Date3;
	}
	public  void setMfg_Date3(Date mfg_Date3) {
		Mfg_Date3 = mfg_Date3;
	}
	public  Date getExpiry_Date2() {
		return Expiry_Date2;
	}
	public  void setExpiry_Date2(Date expiry_Date2) {
		Expiry_Date2 = expiry_Date2;
	}
	public  Date getExpiry_Date3() {
		return Expiry_Date3;
	}
	public  void setExpiry_Date3(Date expiry_Date3) {
		Expiry_Date3 = expiry_Date3;
	}
	public  String getSysmetic_RR() {
		return Sysmetic_RR;
	}
	public  void setSysmetic_RR(String sysmetic_RR) {
		Sysmetic_RR = sysmetic_RR;
	}
	public  String getDULtEye() {
		return DULtEye;
	}
	public  void setDULtEye(String dULtEye) {
		DULtEye = dULtEye;
	}
	public  String getDURtEye() {
		return DURtEye;
	}
	public  void setDURtEye(String dURtEye) {
		DURtEye = dURtEye;
	}
	public  String getDALtEye() {
		return DALtEye;
	}
	public  void setDALtEye(String dALtEye) {
		DALtEye = dALtEye;
	}
	public  String getDARtEye() {
		return DARtEye;
	}
	public  void setDARtEye(String dARtEye) {
		DARtEye = dARtEye;
	}
	public  String getNALtEye() {
		return NALtEye;
	}
	public  void setNALtEye(String nALtEye) {
		NALtEye = nALtEye;
	}
	public  String getNARtEye() {
		return NARtEye;
	}
	public  void setNARtEye(String nARtEye) {
		NARtEye = nARtEye;
	}
	public  String getNULtEye() {
		return NULtEye;
	}
	public  void setNULtEye(String nULtEye) {
		NULtEye = nULtEye;
	}
	public  String getNURtEye() {
		return NURtEye;
	}
	public  void setNURtEye(String nURtEye) {
		NURtEye = nURtEye;
	}
	public  String getGenitourinary() {
		return Genitourinary;
	}
	public  void setGenitourinary(String genitourinary) {
		Genitourinary = genitourinary;
	}
	public  String getHydrocele() {
		return Hydrocele;
	}
	public  void setHydrocele(String hydrocele) {
		Hydrocele = hydrocele;
	}
	public  String getAppearance() {
		return Appearance;
	}
	public  void setAppearance(String appearance) {
		Appearance = appearance;
	}
	public  String getOrientation() {
		return Orientation;
	}
	public  void setOrientation(String orientation) {
		Orientation = orientation;
	}
	public  String getBehaviour() {
		return Behaviour;
	}
	public  void setBehaviour(String behaviour) {
		Behaviour = behaviour;
	}
	public  String getMemory() {
		return Memory;
	}
	public  void setMemory(String memory) {
		Memory = memory;
	}
	public  String getMood() {
		return Mood;
	}
	public  void setMood(String mood) {
		Mood = mood;
	}
	public  String getThoughts() {
		return Thoughts;
	}
	public  void setThoughts(String thoughts) {
		Thoughts = thoughts;
	}
	public  String getCognition() {
		return Cognition;
	}
	public  void setCognition(String cognition) {
		Cognition = cognition;
	}
	public  String getConcentration() {
		return Concentration;
	}
	public  void setConcentration(String concentration) {
		Concentration = concentration;
	}
	public  String getSpeech() {
		return Speech;
	}
	public  void setSpeech(String speech) {
		Speech = speech;
	}
	public  String getBack() {
		return Back;
	}
	public  void setBack(String back) {
		Back = back;
	}
	public  String getPulse() {
		return Pulse;
	}
	public  void setPulse(String pulse) {
		Pulse = pulse;
	}
	public  String isMMR1() {
		return MMR1+"";
	}
	public  void setMMR1(boolean mMR1) {
		MMR1 = mMR1;
	}
	public  String isMMR2() {
		return MMR2+"";
	}
	public  void setMMR2(boolean mMR2) {
		MMR2 = mMR2;
	}
	public  String isMeningococcal() {
		return Meningococcal+"";
	}
	public  void setMeningococcal(boolean meningococcal) {
		Meningococcal = meningococcal;
	}
	public  String getVaccRemarks() {
		return VaccRemarks;
	}
	public  void setVaccRemarks(String vaccRemarks) {
		VaccRemarks = vaccRemarks;
	}
	public  boolean isMMR() {
		return MMR;
	}
	public  void setMMR(boolean mMR) {
		MMR = mMR;
	}
	public  boolean isPOLIO() {
		return POLIO;
	}
	public  void setPOLIO(boolean pOLIO) {
		POLIO = pOLIO;
	}
	public  String getTemp() {
		return Temp;
	}
	public  void setTemp(String temp) {
		Temp = temp;
	}
	public  String getOxy() {
		return oxy;
	}
	public  void setOxy(String oxy) {
		this.oxy = oxy;
	}
	public  Date getDOSE1() {
		return DOSE1;
	}
	public  void setDOSE1(Date dOSE1) {
		DOSE1 = dOSE1;
	}
	public  Date getDOSE2() {
		return DOSE2;
	}
	public  void setDOSE2(Date dOSE2) {
		DOSE2 = dOSE2;
	}
	public  String getCOVID() {
		return COVID;
	}
	public  void setCOVID(String cOVID) {
		COVID = cOVID;
	}
	public  String getHremarks() {
		return hremarks;
	}
	public  void setHremarks(String hremarks1) {
		hremarks = hremarks1;
	}
	@Override
	public String toString() {
		return "[Patient_Id=" + Patient_Id + ", Org_Id=" + Org_Id + ", PassPort_No=" + PassPort_No
				+ ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", PassPort_Place=" + PassPort_Place
				+ ", Passport_IssueDt=" + Passport_IssueDt + ", Mofa_No=" + Mofa_No + ", Examine_Date=" + Examine_Date
				+ ", Sex=" + Sex + ", Amount=" + Amount + ", Patient_MobileNo=" + Patient_MobileNo + ", Patient_ExpDt="
				+ Patient_ExpDt + ", Marital_Status=" + Marital_Status + ", Religion_Name=" + Religion_Name
				+ ", Nationality=" + Nationality + ", Possition_Name=" + Possition_Name + ", Country_Name="
				+ Country_Name + ", Agent_Name=" + Agent_Name + ", Sub_Agent_Name=" + Sub_Agent_Name + ", Height="
				+ Height + ", Weight=" + Weight + ", Date_Of_Birth=" + Date_Of_Birth + ", Age=" + Age + ", Visa_No="
				+ Visa_No + ", Visa_Date=" + Visa_Date + ", Eye_Right=" + Eye_Right + ", Eye_Left=" + Eye_Left
				+ ", Ear_Right=" + Ear_Right + ", Ear_Left=" + Ear_Left + ", Cardio_Vascular=" + Cardio_Vascular
				+ ", Blood_Group=" + Blood_Group + ", FBS=" + FBS + ", Blood_Haemoglobin=" + Blood_Haemoglobin
				+ ", Blood_Thick=" + Blood_Thick + ", Sysmetic_BP=" + Sysmetic_BP + ", Sysmetic_Heart=" + Sysmetic_Heart
				+ ", Respiratory_Lungs=" + Respiratory_Lungs + ", Chest_Xray=" + Chest_Xray + ", Gastro_Abdomen="
				+ Gastro_Abdomen + ", Others_Harnia=" + Others_Harnia + ", Others_Varicose_Veins="
				+ Others_Varicose_Veins + ", Others_Extremites=" + Others_Extremites + ", Others_Deformites="
				+ Others_Deformites + ", Others_Skin=" + Others_Skin + ", Others_Clinical=" + Others_Clinical
				+ ", Others_Cns=" + Others_Cns + ", Others_psychiatry=" + Others_psychiatry + ", Lab_Urine_Sugar="
				+ Lab_Urine_Sugar + ", Lab_Urine_Albumin=" + Lab_Urine_Albumin + ", Lab_Urine_Bilharzsis="
				+ Lab_Urine_Bilharzsis + ", Lab_Stool_Routine=" + Lab_Stool_Routine + ", Lab_Stool_Helminthes="
				+ Lab_Stool_Helminthes + ", Lab_Stool_Glardia=" + Lab_Stool_Glardia + ", Lab_Stool_Bilharziasis="
				+ Lab_Stool_Bilharziasis + ", Lab_Stool_Culture=" + Lab_Stool_Culture + ", Lab_Stool_Samonella="
				+ Lab_Stool_Samonella + ", Lab_Stool_Shigella=" + Lab_Stool_Shigella + ", Lab_stool_Cholera="
				+ Lab_stool_Cholera + ", Maleria=" + Maleria + ", Micro_Filaria=" + Micro_Filaria + ", Serolgy_RBS="
				+ Serolgy_RBS + ", Serolgy_Lfts=" + Serolgy_Lfts + ", Serolgy_Creatinine=" + Serolgy_Creatinine
				+ ", Elisa_HIV=" + Elisa_HIV + ", Elisa_HBS=" + Elisa_HBS + ", Elisa_AntiHCV=" + Elisa_AntiHCV
				+ ", VDRL=" + VDRL + ", TPHA=" + TPHA + ", SGOT=" + SGOT + ", SGPT=" + SGPT + ", ALBUMIN=" + ALBUMIN
				+ ", TPROTIEN=" + TPROTIEN + ", TBILIRUBIN=" + TBILIRUBIN + ", Dbilirubin=" + Dbilirubin + ", GGTP="
				+ GGTP + ", ALKALINE=" + ALKALINE + ", Pregnancy_Test=" + Pregnancy_Test + ", Vision=" + Vision
				+ ", Spleen=" + Spleen + ", Fluid=" + Fluid + ", Liver=" + Liver + ", Reflexes=" + Reflexes
				+ ", Parasis=" + Parasis + ", Others=" + Others + ", PCV=" + PCV + ", Microscopic=" + Microscopic
				+ ", Urine=" + Urine + ", Medical_Remark=" + Medical_Remark + ", Medical_Status=" + Medical_Status
				+ ", Pathology_Remark=" + Pathology_Remark + ", Pathology_Status=" + Pathology_Status
				+ ", XRay_Remarks=" + XRay_Remarks + ", XRay_Status=" + XRay_Status + ", Final_Remarks=" + Final_Remarks
				+ ", Final_Status=" + Final_Status + ", Serial_No=" + Serial_No + ", Photo_Path=" + Photo_Path
				+ ", Thumb_Path=" + Thumb_Path + ", Innoculation_Dt=" + Innoculation_Dt + ", Batch_No=" + Batch_No
				+ ", Mfg_Name=" + Mfg_Name + ", Mfg_date=" + Mfg_date + ", Expiry_date=" + Expiry_date + ", Illness1="
				+ Illness1 + ", Illness2=" + Illness2 + ", Illness3=" + Illness3 + ", Patient_Deleted="
				+ Patient_Deleted + ", Xray_check=" + Xray_check + ", Pathology_check=" + Pathology_check
				+ ", Medical_check=" + Medical_check + ", SerialNo=" + SerialNo + ", Xray_VerifyDt=" + Xray_VerifyDt
				+ ", Pathology_VerifyDt=" + Pathology_VerifyDt + ", Medical_VerifyDt=" + Medical_VerifyDt
				+ ", Receiption_Remarks=" + Receiption_Remarks + ", Crt_User=" + Crt_User + ", Crt_Date=" + Crt_Date
				+ ", Upd_User=" + Upd_User + ", Upd_Date=" + Upd_Date + ", Del_User=" + Del_User + ", Del_Date="
				+ Del_Date + ", SEARCH_TEXT=" + SEARCH_TEXT + ", Mofa_Date=" + Mofa_Date + ", Gamcaslip_No="
				+ Gamcaslip_No + ", Gamcaslip_date=" + Gamcaslip_date + ", MOFA_REMARKS=" + MOFA_REMARKS
				+ ", PREVMOFA_DATE=" + PREVMOFA_DATE + ", PREVMOFA_NO=" + PREVMOFA_NO + ", Batch_No2=" + Batch_No2
				+ ", Batch_No3=" + Batch_No3 + ", Mfg_Name2=" + Mfg_Name2 + ", Mfg_Name3=" + Mfg_Name3 + ", Mfg_Date2="
				+ Mfg_Date2 + ", Mfg_Date3=" + Mfg_Date3 + ", Expiry_Date2=" + Expiry_Date2 + ", Expiry_Date3="
				+ Expiry_Date3 + ", Sysmetic_RR=" + Sysmetic_RR + ", DULtEye=" + DULtEye + ", DURtEye=" + DURtEye
				+ ", DALtEye=" + DALtEye + ", DARtEye=" + DARtEye + ", NALtEye=" + NALtEye + ", NARtEye=" + NARtEye
				+ ", NULtEye=" + NULtEye + ", NURtEye=" + NURtEye + ", Genitourinary=" + Genitourinary + ", Hydrocele="
				+ Hydrocele + ", Appearance=" + Appearance + ", Orientation=" + Orientation + ", Behaviour=" + Behaviour
				+ ", Memory=" + Memory + ", Mood=" + Mood + ", Thoughts=" + Thoughts + ", Cognition=" + Cognition
				+ ", Concentration=" + Concentration + ", Speech=" + Speech + ", Back=" + Back + ", Pulse=" + Pulse
				+ ", MMR1=" + MMR1 + ", MMR2=" + MMR2 + ", Meningococcal=" + Meningococcal + ", VaccRemarks="
				+ VaccRemarks + ", MMR=" + MMR + ", POLIO=" + POLIO + ", Temp=" + Temp + ", oxy=" + oxy + ", DOSE1="
				+ DOSE1 + ", DOSE2=" + DOSE2 + ", COVID=" + COVID + ", hremarks=" + hremarks + "]\n";
	}
	

}
