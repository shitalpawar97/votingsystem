package VotePro;

public class parties 
{
	private String voterid,party;

	public String getVoterid() {
		return voterid;
	}

	public void setVoterid(String voterid) {
		this.voterid = voterid;
	}

	public String getParty() {
		return party;
	}

	public void setParty(String party) {
		this.party = party;
	}

	@Override
	public String toString() {
		return "parties [voterid=" + voterid + ", party=" + party + "]";
	}
	

}
