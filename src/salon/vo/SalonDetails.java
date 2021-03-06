package salon.vo;

import java.util.ArrayList;

import designer.model.vo.Designer;
import salonReview.vo.SalonReview;

public class SalonDetails {
	private Salon affilate;
	private String ageNavi;
	private ArrayList<Designer> DesignerList;
	private ArrayList<SalonReview> ReviewList;
	private SalonReview satr;

	public SalonDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SalonDetails(Salon affilate, String ageNavi, ArrayList<Designer> designerList,
			ArrayList<SalonReview> reviewList,SalonReview star) {
		super();
		this.affilate = affilate;
		this.ageNavi = ageNavi;
		DesignerList = designerList;
		ReviewList = reviewList;
		this.satr = star;
	
	}
	
	
	public SalonReview getSatr() {
		return satr;
	}
	public void setSatr(SalonReview satr) {
		this.satr = satr;
	}
	public Salon getAffilate() {
		return affilate;
	}
	public void setAffilate(Salon affilate) {
		this.affilate = affilate;
	}
	public String getAgeNavi() {
		return ageNavi;
	}
	public void setAgeNavi(String ageNavi) {
		this.ageNavi = ageNavi;
	}
	public ArrayList<Designer> getDesignerList() {
		return DesignerList;
	}
	public void setDesignerList(ArrayList<Designer> designerList) {
		DesignerList = designerList;
	}
	public ArrayList<SalonReview> getReviewList() {
		return ReviewList;
	}
	public void setReviewList(ArrayList<SalonReview> reviewList) {
		ReviewList = reviewList;
	}
	
}
