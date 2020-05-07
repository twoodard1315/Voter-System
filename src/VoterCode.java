import java.util.ArrayList;

public class VoterCode {
	
	ArrayList<String> voterNames = new ArrayList<String>();	//stores names of voters so people can only vote once
	String[] candidates = {"Sterling Archer", "Hubert Farnsworth", "Rick Sanchez"};
	
	boolean checkName(String name)
	{	
		boolean check = true;
		if(voterNames.contains(name))
		{			
			check = false;
		}
		
		else
		{
			voterNames.add(name);
			
		}
		
		return check;
	}
	
	public static void main(String[] args) {		
		
		Voter1.main(args);
		
	}

}
