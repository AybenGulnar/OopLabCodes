package labweeknine;

public class Research {
	private String researchId;
	private String researchTopic;
	private float fundingInformation;
	
	public Research(String researchId, String researchTopic, float fundingInformation) {
		super();
		this.researchId = researchId;
		this.researchTopic = researchTopic;
		this.fundingInformation = fundingInformation;
	}
	public String getResearchId() {
		return researchId;
	}
	public String getResearchTopic() {
		return researchTopic;
	}
	public float getFundingInformation() {
		return fundingInformation;
	}
	public void setResearchId(String researchId) {
		this.researchId = researchId;
	}
	public void setResearchTopic(String researchTopic) {
		this.researchTopic = researchTopic;
	}
	public void setFundingInformation(float fundingInformation) {
		this.fundingInformation = fundingInformation;
	}
	

}
