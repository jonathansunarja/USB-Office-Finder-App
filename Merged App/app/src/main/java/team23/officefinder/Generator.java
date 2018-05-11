package team23.officefinder;


import java.util.ArrayList;
import java.util.HashMap;

public class Generator {
	
	static protected ArrayList<Node> allNodes;
	static protected ArrayList<Edge> allEdges;
	static protected HashMap<String, Node> retrievalMap = new HashMap<String, Node>();
	
	private static int liftWeight = 999;
	private static int liftPermWeight = 999;

	private static int stairWeight = 2;
	
	public static void changeWeight (boolean takeLift){
		if(takeLift){
			liftWeight = 2;
			stairWeight = 999;
		}else{
			liftWeight = 999;
			stairWeight = 2;
		}

	}

	public static void generateData(boolean takeLift) {
		changeWeight(takeLift);
		if(allNodes != null && allEdges != null && retrievalMap != null ){
			allNodes.clear();
			allEdges.clear();
			retrievalMap.clear();
		}
		allNodes = new ArrayList<Node>();
		allEdges = new ArrayList<Edge>();
		
		ArrayList<Staff> staff2018 = new ArrayList<Staff>();
		ArrayList<Staff> staff2019 = new ArrayList<Staff>();
		ArrayList<Staff> staff3034 = new ArrayList<Staff>();
		ArrayList<Staff> staff3035 = new ArrayList<Staff>();
		ArrayList<Staff> staff3036 = new ArrayList<Staff>();
		ArrayList<Staff> staff3037 = new ArrayList<Staff>();
		ArrayList<Staff> staff3038 = new ArrayList<Staff>();
		ArrayList<Staff> staff4041 = new ArrayList<Staff>();
		ArrayList<Staff> staff4042 = new ArrayList<Staff>();
		
		//public Node(String roomNumber, String type, String location, ArrayList<Node> connectedTo,ArrayList<Staff> staff,int level,boolean hasPrivileges){
		
				// Ground floor
		
			// Entrance
		
		Node n0ent = new Node("0.ENT","Entrance","",null,null,0,false);
	
			// Stairs
	
		Node n0s01 = new Node("0.S01", "Stairs (bottom)", "C4", null, null, 0, false);

		Node n0s02 = new Node("0.S02", "Stairs (bottom)", "B1", null, null, 0, false);

		Node n0s03 = new Node("0.S03", "Stairs (bottom)", "F1", null, null, 0, false);

			// Elevators

		Node n0e01 = new Node("0.E01", "Elevator", "B3", null, null, 0, false);

		Node n0e02 = new Node("0.E02", "Elevator (staff)", "F2", null, null, 0, false);

				
		
		// ---------------------------------------------------------------------------

		// 1st floor

		Node n1006 = new Node("1.006", "Lecture theatre", "A5,A7", null, null, 1, false);

		Node n1019 = new Node("1.019", "Office", "A3", null, null, 1, true);

		Node n1025 = new Node("1.025", "Office", "A1", null, null, 1, true);

		Node n1025A = new Node("1.025A", "Office", "A1", null, null, 1, true);

		Node n1025B = new Node("1.025B", "Office", "A1", null, null, 1, true);

		Node n1043 = new Node("1.043", "Workspace", "B3,A5,D3,B2", null, null, 1, true);

		// Stairs

		Node n1s01 = new Node("1.S01", "Stairs (bottom)", "D3", null, null, 1, false);

		Node n1s02 = new Node("1.S02", "Stairs (top)", "D3", null, null, 1, false);

		Node n1s03 = new Node("1.S03", "Stairs (both)", "B1", null, null, 1, true);

		Node n1s04 = new Node("1.S04", "Stairs (both)", "F1", null, null, 1, false);

		Node n1s05 = new Node("1.S05", "Stairs (both)", "", null, null, 1, true);

		// Elevators

		Node n1e01 = new Node("1.E01", "Elevator", "B3", null, null, 1, false);

		Node n1e02 = new Node("1.E02", "Elevator(staff)", "F2", null, null, 1, true);

		// Dummy (path) nodes

		Node n1d01 = new Node("1.D01", "Dummy", "A2", null, null, 1, true);

		// ---------------------------------------------------------------------------

		// 2nd floor

		Node n2006 = new Node("2.006", "Lecture theatre", "A5,A7", null, null, 2, false);

		Node n2017 = new Node("2.017", "Office", "A4", null, null, 2, false);

		Node n2018 = new Node("2.018", "Office", "A4,", null, staff2018, 2, false);

		Node n2019 = new Node("2.019", "Office", "A2,A3", null, staff2019, 2, false);

		Node n2022 = new Node("2.022", "Teaching room", "A2", null, null, 2, false);

		Node n2026 = new Node("2.026", "Waiting room", "B2", null, null, 2, false);

		Node n2027 = new Node("2.027", "Waiting room", "B2", null, null, 2, false);

		Node n2038 = new Node("2.038", "Office", "D1", null, null, 2, false);

		Node n2039 = new Node("2.039", "Office", "D1", null, null, 2, false);

		Node n2040 = new Node("2.040", "Office", "D1", null, null, 2, false);

		Node n2041 = new Node("2.041", "Office", "D1", null, null, 2, false);

		Node n2042 = new Node("2.042", "Office", "D1", null, null, 2, false);

		Node n2043 = new Node("2.043", "Office", "D1", null, null, 2, false);

		Node n2044 = new Node("2.044", "Office", "D1", null, null, 2, false);

		Node n2045 = new Node("2.045", "Office", "D1", null, null, 2, false);

		Node n2046 = new Node("2.046", "Office", "D1", null, null, 2, false);

		Node n2047 = new Node("2.047", "Office", "D1", null, null, 2, false);

		Node n2048 = new Node("2.048", "Office", "D2", null, null, 2, false);

		Node n2060 = new Node("2.060", "Office", "G3", null, null, 2, false);
	

		// Stairs

		Node n2s01 = new Node("2.S01", "Stairs (both)", "B1", null, null, 2, false);

		Node n2s02 = new Node("2.S02", "Stairs (bottom)", "B3", null, null, 2, false);

		Node n2s03 = new Node("2.S03", "Stairs (both)", "C3", null, null, 2, false);

		Node n2s04 = new Node("2.S04", "Stairs (both)", "F1", null, null, 2, true);

		Node n2s05 = new Node("2.S05", "Stairs (top)", "", null, null, 2, false);

		// Elevators

		Node n2e01 = new Node("2.E01", "Elevator", "B3", null, null, 2, false);

		Node n2e02 = new Node("2.E02", "Elevator (staff)", "F2", null, null, 2, true);

		// Dummy nodes

		Node n2d01 = new Node("2.D01", "Dummy", "B2", null, null, 2, true);
		Node n2d02 = new Node("2.D02", "Dummy", "B4", null, null, 2, true);

		// ---------------------------------------------------------------------------

		// 3rd floor

		Node n3005 = new Node("3.005", "Teaching", "B6", null, null, 3, false);

		Node n3015 = new Node("3.015", "Teaching", "A2,A5", null, null, 3, false);

		Node n3018 = new Node("3.018", "Teaching", "A2", null, null, 3, false);

		Node n3031 = new Node("3.031", "Workspace", "C2", null, null, 3, false);

		Node n3032 = new Node("3.032", "Office", null, null, null, 3, false);

		Node n3033 = new Node("3.033", null, "D2,E2,G2", null, null, 3, false);

		Node n3034 = new Node("3.034", "Office", "C1", null, staff3034, 3, false);

		Node n3035 = new Node("3.035", "Office", "C1", null, staff3035, 3, false);

		Node n3036 = new Node("3.036", "Office", "D1", null, staff3036, 3, false);

		Node n3037 = new Node("3.037", "Office", "D1", null, staff3037, 3, true);

		Node n3038 = new Node("3.038", "Office", "D1", null, staff3038, 3, false);

		// Stairs

		Node n3s01 = new Node("3.S01", "Stairs (both)", "B1", null, null, 3, false);

		Node n3s02 = new Node("3.S02", "Stairs (top)", "B5", null, null, 3, false);

		Node n3s03 = new Node("3.S03", "Stairs (both)", "N/A", null, null, 3, false);

		Node n3s04 = new Node("3.S04", "Stairs (bottom)", "B2", null, null, 3, false);

		Node n3s05 = new Node("3.S05", "Stairs (both)", "F1", null, null, 3, true);

		// Elevators

		Node n3e01 = new Node("3.E01", "Elevator", "B3", null, null, 3, false);

		Node n3e02 = new Node("3.E02", "Elevator(staff)", "F2", null, null, 3, true);

		// Dummy nodes

		Node n3d01 = new Node("3.D01", "Dummy", "B2", null, null, 3, true);

		// ---------------------------------------------------------------------------

		// 4th floor

		Node n4005 = new Node("4.005", "Office", "A6", null, null, 4, false);

		Node n4015 = new Node("4.015", "Office", "A4,A6", null, null, 4, false);

		Node n4018 = new Node("4.018", "Office", "A3,A4", null, null, 4, false);

		Node n4020 = new Node("4.020", "Office", "A3", null, null, 4, false);

		Node n4021 = new Node("4.021", "Study room", "A3", null, null, 4, false);

		Node n4022 = new Node("4.022", "Teaching", "A2,A3", null, null, 4, false);
		
		Node n4036 = new Node("4.036","Meeting room","F2",null,null,4,false);
		
		Node n4037 = new Node("4.037", "Office", "F2", null, null, 4, false);

		Node n4038 = new Node("4.038", "Office", "C1", null, null, 4, false);

		Node n4039 = new Node("4.039", "Office", "C1", null, null, 4, false);

		Node n4040 = new Node("4.040", "Office", "D1", null, null, 4, false);

		Node n4041 = new Node("4.041", "Office", "D1", null, staff4041, 4, false);

		Node n4042 = new Node("4.042", "Office", "D1", null, staff4042, 4, false);

		Node n4053 = new Node("4.053", "Office", "F2", null, null, 4, false);

		// Terrace

		Node n4t01 = new Node("4.T01", "Terrace", "B4,B6", null, null, 4, false);

		// Stairs

		Node n4s01 = new Node("4.S01", "Stairs", "B1", null, null, 4, false);

		Node n4s02 = new Node("4.S02", "Stairs", "F1", null, null, 4, false);

		Node n4s03 = new Node("4.S03", "Stairs", "C2", null, null, 4, false);
		
		Node n4s04 = new Node("4.S04", "Stairs", "D2", null, null, 4, false);


		// Elevators

		Node n4e01 = new Node("4.E01", "Elevator", "B3", null, null, 4, false);

		Node n4e02 = new Node("4.E02", "Elevator(staff)", "F2", null, null, 4, true);

		// Dummy nodes

		Node n4d01 = new Node("4.D01", "Dummy", "B2", null, null, 4, true);

		Node n4d02 = new Node("4.D02", "Dummy", "B4", null, null, 4, true);

		// ---------------------------------------------------------------------------

		// 5th floor

		Node n5012 = new Node("5.012", "Office", "A2", null, null, 5, true);

		Node n5013 = new Node("5.013", "Office", "A2", null, null, 5, true);

		Node n5014 = new Node("5.014", "Office", "A2", null, null, 5, true);

		Node n5015 = new Node("5.015", "Office", "B2", null, null, 5, true);

		Node n5016 = new Node("5.016", "Office", "B2", null, null, 5, true);

		Node n5017 = new Node("5.017", "Office", "B2", null, null, 5, true);

		Node n5018 = new Node("5.018", "Office", "C1", null, null, 5, true);

		Node n5019 = new Node("5.019", "Office", "C1", null, null, 5, true);

		Node n5020 = new Node("5.020", "Office", "D1", null, null, 5, true);

		Node n5021 = new Node("5.021", "Office", "D1", null, null, 5, true);

		Node n5022 = new Node("5.022", "Office", "E2", null, null, 5, true);

		Node n5024 = new Node("5.024", "Office", "E2", null, null, 5, true);

		Node n5026 = new Node("5.026", "Office", "H1", null, null, 5, true);

		Node n5027 = new Node("5.027", "Office", "H1", null, null, 5, true);

		Node n5028 = new Node("5.028", "Office", "H2", null, null, 5, true);

		Node n5029 = new Node("5.029", "Office", "H2", null, null, 5, true);

		Node n5030 = new Node("5.030", "Office", "G2,H2", null, null, 5, true);

		Node n5031 = new Node("5.031", "Office", "G3", null, null, 5, true);

		Node n5031A = new Node("5.031", "Office", "G3", null, null, 5, true);

		// Stairs

		Node n5s01 = new Node("5.S01", "Stairs(both)", "E2", null, null, 5, true);

		Node n5s02 = new Node("5.S02", "Stairs(top)", "E2", null, null, 5, false);

		Node n5s03 = new Node("5.S03", "Stairs(both)", "B1", null, null, 5, true);
		
		Node n5s04 = new Node("5.S04", "Stairs(both)", "F1", null, null, 5, true);

		

		// Elevators

		Node n5e02 = new Node("5.E01", "Elevator(Staff", "F2", null, null, 5, true);

		// Dummy nodes

		Node n5d01 = new Node("5.D01", "Dummy", "D2", null, null, 5, true);

		Node n5d02 = new Node("5.D02", "Dummy", "G2", null, null, 5, true);

		// ---------------------------------------------------------------------------

		// 6th floor

		Node n6014 = new Node("6.014", "Office", "A2", null, null, 6, false);

		Node n6016 = new Node("6.016", "Office", "B2", null, null, 6, false);

		Node n6018 = new Node("6.018", "Office", "B2", null, null, 6, false);

		Node n6020 = new Node("6.020", "Office", "C2", null, null, 6, false);

		Node n6021 = new Node("6.021", "Office", "D2", null, null, 6, false);

		Node n6023 = new Node("6.023", "Office", "D2", null, null, 6, false);

		Node n6034 = new Node("6.034", "Office", "H2", null, null, 6, true);

		Node n6013 = new Node("6.013", "Office", "A2", null, null, 6, false);

		Node n6015 = new Node("6.015", "Office", "A2", null, null, 6, false);

		Node n6017 = new Node("6.017", "Office", "B2", null, null, 6, false);

		Node n6019 = new Node("6.019", "Office", "C2", null, null, 6, false);

		Node n6022 = new Node("6.022", "Office", "D2", null, null, 6, false);

		Node n6024 = new Node("6.024", "Office", "E2", null, null, 6, false);

		Node n6033 = new Node("6.033", "Office", "H1", null, null, 6, false);

		Node n6035 = new Node("6.035", "Office", "H2", null, null, 6, false);

		Node n6036 = new Node("6.036", "Office", "H2", null, null, 6, false);

		Node n6037 = new Node("6.037", "Office", "H2", null, null, 6, false);

		Node n6038 = new Node("6.038", "Office", "G2", null, null, 6, false);

		Node n6039 = new Node("6.039", "Office", "G3", null, null, 6, false);

		// Stairs

		Node n6s01 = new Node("6.S01", "Stairs (top)", "E2", null, null, 6, false);

		Node n6s02 = new Node("6.S02", "Stairs (both)", "B1", null, null, 6, false);

		Node n6s03 = new Node("6.S03", "Stairs (both)", "F1", null, null, 6, true);

		// Elevators

		Node n6e02 = new Node("6.E01", "Elevator (staff) ", "F2", null, null, 6, true);

		// Dummy nodes

		Node n6d01 = new Node("6.D01", "Dummy", "C2", null, null, 6, true);

		Node n6d02 = new Node("6.D02", "Dummy", "F2", null, null, 6, true);
		
		// ---------------------------------------------------------------------------

		
		// Staff 
		
       // Second floor staff
		Staff aBarfield = new Staff("Alex","Barfield",n2019);
		Staff sBellwood = new Staff("Sara","Bellwood",n2019);
		Staff jColquhoun = new Staff("John","Colquhoun",n2047);
		Staff jConn = new Staff("Jenny","Conn",n2019);
		Staff nCook = new Staff("Nick","Cook",n2044);
		Staff dCorbet = new Staff("Debbie","Corbet",n2019);
		Staff mDevlin = new Staff("Marie","Devlin",n2039);
		Staff nDolman = new Staff("Nicola","Dolman",n2019);
		Staff mDunnett = new Staff("Melanie","Dunnett",n2019);
		Staff jFitzgerald = new Staff("John","Fitzgerald",n2018);
		Staff aGibson = new Staff("Anthony","Gibson",n2019);
		Staff jGreen = new Staff("Jill","Green",n2019);
		Staff hGriffiths = new Staff("Helen","Griffiths",n2019);
		Staff kHardy = new Staff("Katie","Hardy",n2019);
		Staff lHeels = new Staff("Laura","Heels",n2040);
		Staff aKirtley = new Staff("Ann","Kirtley",n2019);
		Staff lMarshall = new Staff("Lindsay","Marshall",n2042);
		Staff cNapier = new Staff("Chris","Napier",n2038);
		Staff aNichol = new Staff("Amy","Nichol",n2019);
		Staff tNicholls = new Staff("Tracey","Nicholls",n2019);
		Staff cNicoll = new Staff("Claire","Nicoll",n2019);
		Staff cPhillips = new Staff("Chris","Phillips",n2038);
		Staff receptionist = new Staff(null,"Receptionist",n2019);
		Staff sRiddle = new Staff("Steve","Riddle",n2041);
		Staff cRitson = new Staff("Chris","Ritson",n2019);
		Staff jSnowdon = new Staff("John","Snowdon",n2019);
		Staff eSolaiman = new Staff("Ellis","Solaiman",n2043);
		Staff nSpeirs = new Staff("Neil","Speirs",n2045);
		Staff pSumner = new Staff("Paul","Sumner",n2019);
		Staff lTalbot = new Staff("Louise","Talbot",n2019);
		Staff aTully = new Staff("Alan","Tully",n2046);
		Staff jWarrender = new Staff("Jennifer","Warrender",n2038);
		Staff cWildsmith = new Staff("Carolyn","Wildsmith",n2019);

		// Staff in room 2,018
		
		staff2018.add(jFitzgerald);

		// Staff in room 2,019
		
		staff2019.add(aBarfield);
		staff2019.add(sBellwood);
		staff2019.add(jConn);
		staff2019.add(dCorbet);
		staff2019.add(nDolman);
		staff2019.add(mDunnett);
		staff2019.add(aGibson);
		staff2019.add(jGreen);
		staff2019.add(kHardy);
		staff2019.add(aKirtley);
		staff2019.add(aNichol);
		staff2019.add(tNicholls);
		staff2019.add(cNicoll);
		staff2019.add(receptionist);
		staff2019.add(cRitson);
		staff2019.add(jSnowdon);
		staff2019.add(pSumner);
		staff2019.add(lTalbot);
		staff2019.add(cWildsmith);

		// Third floor staff
		Staff cMcAndrew = new Staff("Catherine","McAndrew",n3037);
		Staff sMcGough = new Staff("Steve","McGough",n3037);
		Staff gMorgan = new Staff("Graham","Morgan",n3035);
		Staff rRanjan = new Staff("Rajiv","Ranjan",n3036);
		Staff nThomas = new Staff("Nigel","Thomas",n3038);
		Staff gUshaw = new Staff("Gary","Ushaw",n3034);

		// Staff in room 3,034
		staff3034.add(gUshaw);

		// Staff in room 3,035
		staff3035.add(gMorgan);

		// Staff in room 3,036
		staff3036.add(rRanjan);

		// Staff in room 3,037
		staff3037.add(cMcAndrew);
		staff3037.add(sMcGough);

		// Staff in room 3,038
		staff3038.add(nThomas);

		// Fourth floor staff
		Staff aCraggs = new Staff("Angela","Craggs",null);
		Staff sFernstad = new Staff("Sara Johansson","Fernstad",n4042);
		Staff mForshaw = new Staff("Matt","Forshaw",null);
		Staff bHodgson = new Staff("Barry","Hodgson",null);
		Staff nHolliman = new Staff("Nick","Holliman",null);
		Staff oMcGee = new Staff("Oonah","McGee",null);
		Staff pMissier = new Staff("Paolo","Missier",n4041);
		Staff eThompson = new Staff("Emma","Thompson",null);
		Staff pWatson = new Staff("Paul","Watson",null);

		// Staff in room 4,041
		staff4041.add(pMissier);

		// Staff in room 4,042
		staff4042.add(sFernstad);
		
		
		// Ground floor
		
		
		
		Edge e0001 = new Edge("E0001",n0ent,n0e01,"Go straight through double doors, then towards the elevator on your left");
           
        Edge e0002 = new Edge("E0002",n0ent,n0e02,"Turn right past reception, then towards the elevator on your left");
           
        Edge e0003 = new Edge("E0001",n0ent,n0s01,"Head straight, then towards the stairwell on your right");;
           
        Edge e0004 = new Edge("E0004",n0e01,n0s02,"head towards the stairwell");
           
        Edge e0005 = new Edge("E0005",n0e02,n0s03,"head towards the stairwell");
        
        Edge e0006 = new Edge("E0006",n0e01,n0ent,"Exit elevator, go to the entrance");
           
        Edge e0007 = new Edge("E0007",n0e02,n0ent,"Exit elevator, go to the entrance");
           
        Edge e0008 = new Edge("E0008",n0s01,n0ent,"Exit stairwell, go to the entrance");
           
        Edge e0009 = new Edge("E0009",n0s02,n0e01,"Exit stairwell, go towards the elevator"); // ? not sure about weight
           
        Edge e0010 = new Edge("E0010",n0s03,n0e02,"Exit stairwell, go towards the elevator"); // ? not sure about weight
        
        
        
        // Connecting edges
     
       
        Edge e0013 = new Edge("E0013",n0s01,n1s01, stairWeight, "Head upstairs to first floor"); // ?
       
        Edge e0014 = new Edge("E0014",n0s02,n1s03, stairWeight, "Head upstairs to first floor"); // ?
           
        Edge e0015 = new Edge("E0015",n0s03,n1s05, stairWeight, "Head upstairs to first floor"); // ?
        
            
		// 1st floor
		
        Edge e1001 = new Edge("E1001", n1006, n1019, "Turn left, go through two sets of double doors, then turn left");
        
        Edge e1002 = new Edge("E1002", n1006, n1e01, "Turn left, walk through double doors");
 
        Edge e1003 = new Edge("E1003", n1019, n1006, "Turn left,  walk through double doors, continue straight");
 
        Edge e1004 = new Edge("E1004", n1019, n1d01, "Exit the room");
 
        Edge e1005 = new Edge("E1005", n1025, n1d01,"Exit the room");
 
        Edge e1006 = new Edge("E1006", n1025A, n1d01,"Exit the room");
 
        Edge e1007 = new Edge("E1007", n1025B, n1d01,"Exit the room");
 
        Edge e1008 = new Edge("E1008", n1d01, n1019, "Enter 1.019");
 
        Edge e1009 = new Edge("E1009", n1d01, n1025, "Enter 1.025");
 
        Edge e1010 = new Edge("E1010", n1d01, n1025A, "Enter 1.025A");
 
        Edge e1011 = new Edge("E1011", n1d01, n1025B, "Enter 1.025B");
 
        Edge e1012 = new Edge("E1012", n1d01, n1s03, "Enter stairwell");
 
        Edge e1013 = new Edge("E1013", n1043, n1s05, "Exit the room");
 
        Edge e1014 = new Edge("E1014", n1043, n1e02, "Exit Open Lab, head to the elevator");
 
        Edge e1015 = new Edge("E1015", n1043, n1d01, "Exit Open Lab");
 
        Edge e1016 = new Edge("E1016", n1043, n1s03, "Exit Open Lab, head to the stairwell");
 
        Edge e1017 = new Edge("E1017", n1043, n1e01 , "Exit the Open Lab, turn left, then go through double doors");
 
        Edge e1018 = new Edge("E1018", n1s01, n1s02, "Head down the stairs");
 
        Edge e1019 = new Edge("E1019", n1s01, n1043, "Enter Open Lab");
 
        Edge e1020 = new Edge("E1020", n1s02, n1s01, "Head up the stairs");
 
        //Edge e1021 = new Edge("E1021", n1s02, n1e01, "Go past the stairs and around the corner to the right"); // Stairs to elevator??
 
        //Edge e1022 = new Edge("E1022", n1s03, n1e01, "Go straight through double doors"); // same
 
        Edge e1023 = new Edge("E1023", n1s03, n1d01, "Exit stairwell through double doors");
 
        Edge e1024 = new Edge("E1024", n1s03, n1043, "Turn left out of stairwell, then enter Open Lab");
 
        // Edge e1025 = new Edge("E1025",n1s04,null);
 
        Edge e1026 = new Edge("E1026", n1s05, n1043);
 
        // Edge e1027 = new Edge("E1027",n1d01,n1043,"Head towards Open Lab");
 
        Edge e1028 = new Edge("E1028", n1e01, n1s02, "Turn left, around the corner, head for the stairs to go down"); // same
 
        Edge e1029 = new Edge("E1029", n1e01, n1s03,"Turn right, go through double doors, enter the stairwell"); // same
 
        Edge e1030 = new Edge("E1030", n1e01, n1043,"Go through Double Doors, then turn right and enter Open Lab");
 
        Edge e1031 = new Edge("E1031", n1e01, n1006,"Turn left, go through double doors, continue straight on to 1.006");
 
        Edge e1032 = new Edge("E1032", n1e02, n1043, "Turn left, enter Open Lab");

		// Connecting edges.

		Edge e1035 = new Edge("E1035", n1s03, n2s01, stairWeight, "Go upstairs");

		Edge e1036 = new Edge("E1036", n1s01, n2s03, stairWeight, "Go upstairs");

		Edge e1037 = new Edge("E1037", n1s04, n2s04, stairWeight, "Go upstairs");
		
        Edge e1040 = new Edge("E1040",n1s01,n0s01, stairWeight, "Go downstairs");
       
        Edge e1041 = new Edge("E1041",n1s03,n0s02, stairWeight, "Go downstairs");
           
        Edge e1042 = new Edge("E1042",n1s05,n0s03, stairWeight, "Go downstairs");


		// 2nd floor

        Edge e2001 = new Edge("E2001", n2006, n2e01, "Turn left, go straight, through double doors");
        
        Edge e2010 = new Edge("E2010", n2022, n2d01, "Exit the room and turn left");
 
        Edge e2011 = new Edge("E2011", n2026, n2d01, "Exit the room and turn right");
 
        Edge e2012 = new Edge("E2012", n2027, n2d01, "Exit the room");
 
        Edge e2013 = new Edge("E2013", n2038, n2s01, "Exit room ,turn right, go straight until at stairwell");
 
        Edge e2014 = new Edge("E2014", n2039, n2038, "Exit the office");
 
        Edge e2015 = new Edge("E2015", n2040, n2038, "Exit the office");
 
        Edge e2016 = new Edge("E2016", n2041, n2038, "Exit the office");
 
        Edge e2017 = new Edge("E2017", n2042, n2038, "Exit the office");
 
        Edge e2018 = new Edge("E2018", n2044, n2038, "Exit the office");
 
        Edge e2019 = new Edge("E2019", n2045, n2038, "Exit the office");
 
        Edge e2020 = new Edge("E2020", n2046, n2038, "Exit the office");
 
        Edge e2021 = new Edge("E2021", n2047, n2038, "Exit the office");
 
        Edge e2022 = new Edge("E2022", n2048, n2e02, "Head for the elevator");
 
        Edge e2023 = new Edge("E2023", n2048, n2s04, "Head for the stairwell");
 
        Edge e2024 = new Edge("E2024", n2048, n2d01, "Exit through double doors, head forward, turn left, then go past reception");
 
        Edge e2025 = new Edge("E2025", n2060, n2048, "Exit the room");
 
        Edge e2026 = new Edge("E2026", n2s01, n2d01, "Head through double doors towards reception");
 
        Edge e2027 = new Edge("E2027", n2s02, n2d02, "Head towards reception");
 
        Edge e2028 = new Edge("E2028", n2s02, n2s03, "Head towards staircase to go down");
 
        Edge e2029 = new Edge("E2029", n2s03, n2s02, "Go around the corner and head towards reception");
 
        Edge e2030 = new Edge("E2030", n2s04, n2048, "Exit stairwell");
 
        // Edge e2031 = new Edge("E2031",null,null);
 
        Edge e2032 = new Edge("E2032", n2e01, n2d01, "Turn left out of double doors");
 
        Edge e2033 = new Edge("E2033", n2e01, n2d02, "Turn left out of double doors");
 
        Edge e2034 = new Edge("E2034", n2e02, n2048, "Turn left out of the elevator");
 
        Edge e2035 = new Edge("E2035", n2d01, n2027, "Head through double doors, 2.027 is on your right");
 
        Edge e2036 = new Edge("E2036", n2d01, n2026, "Head through double doors, 2.026 is on your right");
 
        Edge e2037 = new Edge("E2037", n2d01, n2e01, "Head through double doors towards elevator");
 
        Edge e2038 = new Edge("E2038", n2d01, n2s01, "Head through double doors and enter stairwell");
 
        Edge e2039 = new Edge("E2039", n2d01, n2022, "Head through double doors and turn left");
 
        Edge e2040 = new Edge("E2040", n2d01, n2038, "Head through double doors, turn right, 2.038 is on your left");
 
        Edge e2041 = new Edge("E2041", n2d01, n2048, "Head through double doors, turn right, go to end of corridor");
 
        Edge e2043 = new Edge("E2043", n2d02, n2006, "Turn left, go towards reception");
 
        Edge e2044 = new Edge("E2044", n2d02, n2e01, "Go through double doors for the elevator");
 
        Edge e2045 = new Edge("E2045", n2d02, n2s02, "Head to stairs by reception to go up");
 
        Edge e2046 = new Edge("E2046", n2038, n2039, "Enter office 2.039");
 
        Edge e2047 = new Edge("E2047", n2038, n2040, "Enter office 2.040");
 
        Edge e2048 = new Edge("E2048", n2038, n2041, "Enter office 2.041");
 
        Edge e2049 = new Edge("E2049", n2038, n2042, "Enter office 2.042");
 
        Edge e2050 = new Edge("E2050", n2038, n2043, "Enter office 2.043");
 
        Edge e2051 = new Edge("E2051", n2038, n2044, "Enter office 2.044");
 
        Edge e2052 = new Edge("E2052", n2038, n2045, "Enter office 2.045");
 
        Edge e2053 = new Edge("E2053", n2038, n2046, "Enter office 2.046");
 
        Edge e2054 = new Edge("E2054", n2038, n2047, "Enter office 2.047");
 
        Edge e2055 = new Edge("E2055", n2043, n2038, "");
 
        Edge e2056 = new Edge("E2056", n2038, n2d01, "Exit room, turn right, go forwards then left around the corner");
 
        Edge e2057 = new Edge("E2057", n2006, n2d02, "Turn left and head towards reception");
 
        Edge e2058 = new Edge("E2058", n2e01, n2006, "Turn left through double doors, continue straight on to 2.006");
 
        Edge e2060 = new Edge("E2060", n2048, n2e02, "Go around the corner towards the elevator");
 
        Edge e2061 = new Edge("E2061", n2048, n2060, "Go around the corner to find 2.060");
 
        Edge e2062 = new Edge("E2062", n2s01, n2038, "Turn left, go straight down the corridor, 2.038 is on your left");
 
        Edge e2063 = new Edge("E2063", n2048, n2s04, "Head for the stairwell");
        
		// Connecting Edges.

		Edge e2068 = new Edge("E2068", n2s01, n1s03, stairWeight, "Head down the stairs to floor 1");

		Edge e2069 = new Edge("E2069", n2s01, n3s01, stairWeight, "Head up the stairs to floor 3");

		Edge e2070 = new Edge("E2070", n2s02, n3s02, stairWeight, "Head up the stairs to floor 3");

		Edge e2071 = new Edge("E2071", n2s03, n1s01, stairWeight, "Head down the stairs to floor 1");

		Edge e2072 = new Edge("E2072", n2s04, n1s04, stairWeight, "Head down the stairs to floor 3");

		Edge e2073 = new Edge("E2073", n2s04, n3s05, stairWeight, "Head up the stairs to floor 3");

		// 3rd floor

		Edge e3001 = new Edge("E3001", n3005, n3s02, "Turn left and head for bottom of staircase");

		Edge e3002 = new Edge("E3002", n3015, n3s02, "Turn right and head for bottom of staircase");

		Edge e3003 = new Edge("E3003", n3015, n3d01, "Turn left and go through double doors");

		Edge e3004 = new Edge("E3004", n3018, n3d01, "Exit the room");

		Edge e3005 = new Edge("E3005", n3031, n3d01, "Head to end of corridor, turn left");

		Edge e3006 = new Edge("E3006", n3031, n3033, "Turn left, continue straight on");

		Edge e3007 = new Edge("E3007", n3032, n3d01, "Turn left out of room, continue down the corridor");

		Edge e3008 = new Edge("E3008", n3032, n3033, "Enter office 3.033");

		Edge e3009 = new Edge("E3009", n3033, n3034, "Enter office 3.034");

		Edge e3010 = new Edge("E3010", n3033, n3035, "Enter office 3.035");

		Edge e3011 = new Edge("E3011", n3033, n3036, "Enter office 3.036");

		Edge e3012 = new Edge("E3012", n3033, n3037, "Enter office 3.037");

		Edge e3013 = new Edge("E3013", n3033, n3038, "Enter office 3.038");

		Edge e3014 = new Edge("E3014", n3033, n3032, "Go down the corridor, 3.032 is on your right");

		Edge e3015 = new Edge("E3015", n3033, n3s05, "Go down the corridor, then enter the stairwell");

		Edge e3016 = new Edge("E3016", n3033, n3031, "Go down the corrdior");

		Edge e3017 = new Edge("E3017", n3034, n3033, "Exit the office");

		Edge e3018 = new Edge("E3018", n3035, n3033, "Exit the office");

		Edge e3019 = new Edge("E3019", n3036, n3033, "Exit the office");

		Edge e3020 = new Edge("E3020", n3037, n3033, "Exit the office");

		Edge e3021 = new Edge("E3021", n3038, n3033, "Exit the office");

		Edge e3022 = new Edge("E3022", n3e01, n3d01, "Turn right, go through double doors");

		Edge e3023 = new Edge("E3023", n3e01, n3s02, "Turn left, head for staircase");

		Edge e3024 = new Edge("E3024", n3e02, n3032, "Turn left, continue straight on, 3.005 is on the right");

		Edge e3025 = new Edge("E3025", n3s01, n3d01, "Exit the stairwell");

		Edge e3026 = new Edge("E3026", n3s02, n3e01, "Head throguh double doors");

		Edge e3027 = new Edge("E3027", n3s02, n3005, "Turn left, continue straight on, 3.005 is on your right");

		Edge e3028 = new Edge("E3028", n3s02, n3015, "Turn left, enter office 3.015");

		// Edge e3029 = new Edge("E3029",n3s03,null,0);

		Edge e3030 = new Edge("E3030", n3s04, n3d01);

		Edge e3031 = new Edge("E3031", n3s05, n3033, "Exit stairwell, continue straight down the corridor");

		Edge e3032 = new Edge("E3032", n3d01, n3018, "Enter office 3.018");

		Edge e3033 = new Edge("E3033", n3d01, n3015, "Go through double doors, enter office  3.015");

		Edge e3034 = new Edge("E3034", n3d01, n3e01, "Go through double doors towards the elevator");

		Edge e3035 = new Edge("E3035", n3d01, n3s01, "Enter stairwell");

		Edge e3036 = new Edge("E3036", n3d01, n3s04, "Head to the staircase");

		Edge e3037 = new Edge("E3037", n3d01, n3032, "Turn right, head down corridor, 3.032 is on your right");

		Edge e3038 = new Edge("E3038", n3d01, n3031, "Turn right, go down the corridor, go around the corner,3.031 is on your left");
		
		// Connected edges 

		Edge e3043 = new Edge("E3043", n3s01, n2s01, "Head down the stairs to floor 2");
		
		Edge e3044 = new Edge("E3044", n3s01, n4s01, "Head up the stairs to floor 4");
		
		Edge e3045 = new Edge("E3045", n3s02, n2s02, "Head down the stairs to floor 2");
		
		Edge e3046 = new Edge("E3046", n3s04, n4s03, "Head up the stairs to floor 4");
		
		Edge e3047 = new Edge("E3047", n3s05, n2s04, "Head down the stairs to floor 2");
		
		Edge e3048 = new Edge("E3048", n3s05, n4s02, "Head up the stairs to floor 4");

    	// 4th floor

		Edge e4001 = new Edge("E4001", n4005, n4d02, "Turn left, head alongside the terrace");

		Edge e4002 = new Edge("E4002", n4015, n4d02, "Turn left, head alongside the terrace");

		Edge e4003 = new Edge("E4003", n4018, n4d02, "Exit room, head through door");

		Edge e4004 = new Edge("E4004", n4020, n4d02, "Exit room, head through door on your left");

		Edge e4005 = new Edge("E4005", n4021, n4d02, "Exit room, head through door on your left");

		Edge e4006 = new Edge("E4006", n4022, n4d01, "Exit room");

		Edge e4007 = new Edge("E4007", n4037, n4038, "Fifth room on your right handside");

		Edge e4008 = new Edge("E4008", n4037, n4039, "Fourth room on your right handside");

		Edge e4009 = new Edge("E4009", n4037, n4040, "Third room on your right handside");

		Edge e4010 = new Edge("E4010", n4037, n4041, "Second room on your right handside");

		Edge e4011 = new Edge("E4011", n4037, n4042, "First room on your right handside");

		Edge e4012 = new Edge("E4012", n4037, n4053, "Exit room, turn left, head down the corridor");

		//Edge e4013 = new Edge("E4013", n4037, n4d01, "");

		Edge e4014 = new Edge("E4014", n4038, n4037, "Exit room");

		Edge e4015 = new Edge("E4015", n4039, n4037, "Exit room");

		Edge e4016 = new Edge("E4016", n4040, n4037, "Exit room");

		Edge e4017 = new Edge("E4017", n4041, n4037, "Exit room");

		Edge e4018 = new Edge("E4018", n4042, n4037, "Exit room");

		Edge e4019 = new Edge("E4019", n4053, n4037, "Exit room, head down the corridor, turn left, 4.037 is on your right");

		Edge e4020 = new Edge("E4020", n4053, n4s02, "Exit room ,head down the corridor, go towards the stairs on your right");

		Edge e4021 = new Edge("E4021", n4053, n4e02, "Exit room, go towards the elevator on your left");

		Edge e4022 = new Edge("E4022", n4e01, n4d01, "Exit elevator, turn right");

		Edge e4023 = new Edge("E4023", n4e01, n4d02, "Exit elevator, turn left");

		Edge e4024 = new Edge("E4024", n4e02, n4053, "Exit elevator, turn right");

		Edge e4025 = new Edge("E4025", n4e02, n4s04, "Exit elevator, turn left, head down the corridor, go towards stairs on your left");

		Edge e4026 = new Edge("E4026", n4s01, n4d01, "Head through door, go forward");

		Edge e4027 = new Edge("E4027", n4s02, n4053, "Head through door, turn left");

		Edge e4028 = new Edge("E4028", n4s03, n4d01, "Exit stairwell, turn backwards, head forward");

		Edge e4029 = new Edge("E4029", n4s04, n4053, "Exit stairwell, turn backwards, head down corridor, turn right, 4.053 is in front of you");

		Edge e4030 = new Edge("E4030", n4s04, n4e02, "Exit stairwell, turn backwards, head down corridor, turn right towards an elevator on your right);");

		Edge e4031 = new Edge("E4031", n4s04, n4d01, "Exit stairwell, go straight");

		Edge e4032 = new Edge("E4032", n4t01, n4d02, "Exit terrace");

		Edge e4033 = new Edge("E4033", n4d01, n4e01, "Turn left to elevator");

		Edge e4034 = new Edge("E4034", n4d01, n4022, "Enter office 4.022");

		Edge e4035 = new Edge("E4035", n4d01, n4s01, "Enter stairwell");

		Edge e4036 = new Edge("E4036", n4d01, n4s03, "Turn right and go towards the stairwell");

		Edge e4037 = new Edge("E4037", n4d01, n4s04, "Turn left and go towards the stairwell");

		//Edge e4038 = new Edge("E4038", n4d01, n4037);

		Edge e4039 = new Edge("E4039", n4d02, n4e01, "Go straight, towards the elevator on your right");

		Edge e4040 = new Edge("E4040", n4d02, n4018,"Turn left, go straight through two sets of doors");

		Edge e4041 = new Edge("E4041", n4d02, n4020,"Turn left, go through door, 4.020 is the second room on your right");

		Edge e4042 = new Edge("E4042", n4d02, n4021,"Turn right, go through door, 4.021 is the first room on your right");

		Edge e4043 = new Edge("E4043", n4d02, n4015,"Enter 4.015");

		Edge e4044 = new Edge("E4044", n4d02, n4t01,"Enter terrace");

		Edge e4045 = new Edge("E4045", n4d02, n4005,"Head past terrace, down the corridor, 4.005 is on your right");
		
		Edge e4055 = new Edge("E4055",n4053,n4s04);
		
		Edge e4056 = new Edge("E4056",n4037,n4036,"Exit room, turn right, 4.036 on your right");
		
		Edge e4057 = new Edge("E4057",n4036,n4037,"Exit room, turn left, 4.037 on your left");
		
		Edge e4058 = new Edge("E4058",n4036,n4d01,"Exit room, turn right");
		
		Edge e4059 = new Edge("E4059",n4d01,n4036,"Go straight past the stairwell, 4.036 on your left");
		
		// Connected edges 
		
		Edge e4049 = new Edge("E4045", n4s01, n3s01, "Head down the stairs to floor 3");

		Edge e4050 = new Edge("E4045", n4s01, n5s03, "Head up the stairs to floor 5");
		
		Edge e4051 = new Edge("E4045", n4s02, n3s05, "Head down the stairs to floor 3");
		
		Edge e4052 = new Edge("E4045", n4s02, n5s04, "Head up the stairs to floor 5");
		
		Edge e4053 = new Edge("E4045", n4s03, n3s04, "Head down the stairs to floor 3");
		
		Edge e4054 = new Edge("E4045", n4s04, n5s01, "Head up the stairs to floor 5");

		// 5th floor

		// Node n5d01 = new Node("5.D01","Dummy","D2",null,null,5,true);
		// Node n5d02 = new Node("5.D02","Dummy","G2",null,null,5,true);

		Edge e5001 = new Edge("E5001", n5012, n5d01,"Exit room, turn right");

		Edge e5002 = new Edge("E5002", n5013, n5d01,"Exit room, turn right");

		Edge e5003 = new Edge("E5003", n5014, n5d01,"Exit room, turn right");

		Edge e5004 = new Edge("E5004", n5015, n5d01,"Exit room, turn right");

		Edge e5005 = new Edge("E5005", n5016, n5d01,"Exit room, turn right");

		Edge e5006 = new Edge("E5006", n5017, n5d01,"Exit room ,turn right");

		Edge e5007 = new Edge("E5007", n5018, n5d01,"Exit room");

		Edge e5008 = new Edge("E5008", n5019, n5d01,"Exit room");

		Edge e5009 = new Edge("E5009", n5020, n5d01,"Exit room");

		Edge e5010 = new Edge("E5010", n5021, n5d01,"Exit room");

		Edge e5011 = new Edge("E5011", n5022, n5s01,"Exit room");

		Edge e5012 = new Edge("E5012", n5022, n5s01,"Exit room, go towards the stairwell");

		Edge e5013 = new Edge("E5013", n5024, n5s01,"Exit room, go towards the stairwell");

		Edge e5014 = new Edge("E5014", n5026, n5d02,"Exit room");

		Edge e5015 = new Edge("E5015", n5027, n5d02,"Exit room");

		Edge e5016 = new Edge("E5016", n5028, n5d02,"Exit room");

		Edge e5017 = new Edge("E5017", n5029, n5d02,"Exit room");

		Edge e5018 = new Edge("E5018", n5030, n5d02,"Exit room");

		Edge e5019 = new Edge("E5019", n5031, n5d02,"Exit room");

		Edge e5020 = new Edge("E5020", n5031A, n5d02,"Exit room");

		Edge e5021 = new Edge("E5021", n5e02, n5d02,"Exit elevator");

		//Edge e5022 = new Edge("E5022", n5s01, n5d02);

		Edge e5023 = new Edge("E5023", n5s01, n5022,"Turn left, 5.022 is on your left");

		Edge e5024 = new Edge("E5024", n5s01, n5024,"5.024 is on your far left corner");

		Edge e5025 = new Edge("E5025", n5s01, n5s02,"Go straight");

		Edge e5026 = new Edge("E5026", n5s02, n5s01,"Go straight");

		Edge e5027 = new Edge("E5027", n5s03, n5d01,"Exit stairwell, turn left");

		Edge e5028 = new Edge("E5028", n5s04, n5d02,"Exit stairwell");

		Edge e5029 = new Edge("E5029", n5d01, n5012,"Straight down the corridor, 5.012 is a room on your left");

		Edge e5030 = new Edge("E5030", n5d01, n5013,"Straight down the corridor, 5.013 is a room on your left");

		Edge e5031 = new Edge("E5031", n5d01, n5014,"Straight down the corridor, 5.014 is a room on your left");

		Edge e5032 = new Edge("E5032", n5d01, n5015,"Straight down the corridor, 5.015 is a room on your left");

		Edge e5033 = new Edge("E5033", n5d01, n5016,"Straight down the corridor, 5.016 is a room on your left");

		Edge e5034 = new Edge("E5034", n5d01, n5017,"Straight down the corridor, 5.017 is a room on your left");

		Edge e5035 = new Edge("E5035", n5d01, n5018,"5.018 is a room on your right");

		Edge e5036 = new Edge("E5036", n5d01, n5019,"5.019 is a room on your right");

		Edge e5037 = new Edge("E5037", n5d01, n5020,"5.020 is a room on your right");;

		Edge e5038 = new Edge("E5038", n5d01, n5021,"5.021 is a room on your right");

		Edge e5039 = new Edge("E5039", n5d01, n5022,"Enter room 5.022");

		Edge e5040 = new Edge("E5040", n5d01, n5s03,"Go straight down the corridor, towards the stairwell on your right");

		Edge e5041 = new Edge("E5041", n5d02, n5026,"Enter room 5.026");

		Edge e5042 = new Edge("E5042", n5d02, n5027,"Enter room 5.027");

		Edge e5043 = new Edge("E5043", n5d02, n5028,"Enter room 5.028");

		Edge e5044 = new Edge("E5044", n5d02, n5029,"Enter room 5.029");

		Edge e5045 = new Edge("E5045", n5d02, n5030,"Enter room 5.030");

		Edge e5046 = new Edge("E5046", n5d02, n5031,"Enter room 5.031");

		Edge e5047 = new Edge("E5047", n5d02, n5031A,"Enter room 5.031A");

		Edge e5048 = new Edge("E5048", n5d02, n5e02,"Go towards elevator");

		//Edge e5049 = new Edge("E5049", n5d02, n5s01);

		Edge e5050 = new Edge("E5050", n5d02, n5s04,"Go towards the stairwell");
		
		//Connectors

		Edge e5053 = new Edge("E5053", n5s01, n4s04,"Head down the stairs to floor 4");
 
		Edge e5054 = new Edge("E5054", n5s02, n6s01,"Head up the stairs to floor 6");

		Edge e5055 = new Edge("E5055", n5s03, n4s01,"Head down the stairs to floor 4");

		Edge e5056 = new Edge("E5056", n5s03, n6s02,"Head up the stairs to floor 6");

		Edge e5057 = new Edge("E5057", n5s04, n4s02,"Head down the stairs to floor 4");
 
		Edge e5058 = new Edge("E5058", n5s04, n6s03,"Head up the stairs to floor 6");

		// 6th floor

		// Node n6d01 = new Node("6.D01","Dummy","C2",null,null,6,true);
		// Node n6d02 = new Node("6.D02","Dummy","F2",null,null,6,true);/

		Edge e6001 = new Edge("E6001", n6013, n6d01,"Exit room, turn right, then head straight");

		Edge e6002 = new Edge("E6002", n6014, n6d01,"Exit room, turn right, then head straight");

		Edge e6003 = new Edge("E6003", n6015, n6d01,"Exit room, turn right, then head straight");

		Edge e6004 = new Edge("E6004", n6016, n6d01,"Exit room, turn right, then head straight");

		Edge e6005 = new Edge("E6005", n6017, n6d01,"Exit room, turn right, then head straight");

		Edge e6006 = new Edge("E6006", n6018, n6d01,"Exit room, turn right, then head straight");

		Edge e6007 = new Edge("E6007", n6019, n6d01,"Exit room, turn right");

		Edge e6008 = new Edge("E6008", n6020, n6d01,"Exit room");

		Edge e6009 = new Edge("E6009", n6021, n6d01,"Exit room");

		Edge e6010 = new Edge("E6010", n6022, n6d01,"Exit room");

		Edge e6011 = new Edge("E6011", n6024, n6s01,"Exit room, turn right");

		Edge e6012 = new Edge("E6012", n6033, n6d02,"Exit room");

		Edge e6013 = new Edge("E6013", n6034, n6d02,"Exit room");

		Edge e6014 = new Edge("E6014", n6035, n6d02,"Exit room");

		Edge e6015 = new Edge("E6015", n6036, n6d02,"Exit room");

		Edge e6016 = new Edge("E6016", n6037, n6d02,"Exit room");

		Edge e6017 = new Edge("E6017", n6038, n6d02,"Exit room");

		Edge e6018 = new Edge("E6018", n6039, n6d02,"Exit room");

		Edge e6019 = new Edge("E6019", n6e02, n6d02,"Exit elevator");

		Edge e6020 = new Edge("E6020", n6s01, n6024,"Turn left, 6.024 is on your left");

		Edge e6021 = new Edge("E6021", n6s01, n6d02,"Exit stairwell, go through door on your right");

		Edge e6022 = new Edge("E6022", n6s01, n6d01,"Exit stairwell, go through door on your left");

		Edge e6023 = new Edge("E6023", n6s02, n6d01,"Exit stairwell");

		Edge e6024 = new Edge("E6024", n6s03, n6d02,"Exit stairwell");

		Edge e6025 = new Edge("E6025", n6d01, n6013,"Room nearby");

		Edge e6026 = new Edge("E6026", n6d01, n6014,"Room nearby");

		Edge e6027 = new Edge("E6027", n6d01, n6015,"Room nearby");

		Edge e6028 = new Edge("E6028", n6d01, n6016,"Room nearby");

		Edge e6029 = new Edge("E6029", n6d01, n6017,"Room nearby");

		Edge e6030 = new Edge("E6030", n6d01, n6018,"Room nearby");

		Edge e6031 = new Edge("E6031", n6d01, n6019,"Room nearby");

		Edge e6032 = new Edge("E6032", n6d01, n6020,"Room nearby");

		Edge e6033 = new Edge("E6033", n6d01, n6021,"Room nearby");

		Edge e6034 = new Edge("E6034", n6d01, n6022,"Room nearby");

		Edge e6035 = new Edge("E6035", n6d01, n6023,"Room nearby");

		Edge e6036 = new Edge("E6036", n6d01, n6s01,"Room nearby");

		Edge e6037 = new Edge("E6037", n6d01, n6s01,"Room nearby");

		Edge e6038 = new Edge("E6038", n6d02, n6033,"Enter room 6.033");

		Edge e6039 = new Edge("E6039", n6d02, n6034,"Enter room 6.033");

		Edge e6040 = new Edge("E6040", n6d02, n6035,"Enter room 6.033");

		Edge e6041 = new Edge("E6041", n6d02, n6036,"Enter room 6.033");

		Edge e6042 = new Edge("E6042", n6d02, n6037,"Enter room 6.033");

		Edge e6043 = new Edge("E6043", n6d02, n6038,"Enter room 6.033");

		Edge e6044 = new Edge("E6044", n6d02, n6039,"Enter room 6.033");

		Edge e6045 = new Edge("E6045", n6d02, n6e02,"Enter the elevator");

		Edge e6046 = new Edge("E6046", n6d02, n6s01,"Exit through door, then go towards stairwell");

		Edge e6047 = new Edge("E6047", n6d02, n6s03,"Go towards the stairwell");
		
		//Connectors
		
		Edge e6049 = new Edge("E6048", n6s01, n5s02,"Head down the stairs to floor 5");
		
		Edge e6050 = new Edge("E6048", n6s02, n5s03,"Head down the stairs to floor 5");
		
		Edge e6051 = new Edge("E6048", n6s03, n5s04,"Head down the stairs to floor 5");
		
		// Lift Edges
		
		// Ground Floor
        Edge e0011 = new Edge("E0011", n0e01, n1e01, liftWeight, "Take the Elevator to the 1st-Floor");
        Edge e0012 = new Edge("E0012", n0e01, n2e01, liftWeight, "Take the Elevator to the 2nd-Floor");
        Edge e0016 = new Edge("E0016", n0e01, n3e01, liftWeight, "Take the Elevator to the 3rd-Floor");
        Edge e0017 = new Edge("E0017", n0e01, n4e01, liftWeight, "Take the Elevator to the 4th-Floor");
        
        Edge e0018 = new Edge("E0018", n0e02, n1e02, liftPermWeight, "Take the Staff Elevator to the 1st-Floor");
        Edge e0019 = new Edge("E0019", n0e02, n2e02, liftPermWeight, "Take the Staff Elevator to the 2nd-Floor");
        Edge e0020 = new Edge("E0020", n0e02, n3e02, liftPermWeight, "Take the Staff Elevator to the 3rd-Floor");
        Edge e0021 = new Edge("E0021", n0e02, n4e02, liftPermWeight, "Take the Staff Elevator to the 4th-Floor");
        Edge e0022 = new Edge("E0022", n0e02, n5e02, liftPermWeight, "Take the Staff Elevator to the 5th-Floor");
        Edge e0023 = new Edge("E0023", n0e02, n6e02, liftPermWeight, "Take the Staff Elevator to the 6th-Floor");
        
        //First Floor
        Edge e1043 = new Edge("E1043", n1e01, n0e01, liftWeight, "Take the Elevator to the Ground Floor");
        Edge e1044 = new Edge("E1044", n1e01, n2e01, liftWeight, "Take the Elevator to the 2nd-Floor");
        Edge e1045 = new Edge("E1045", n1e01, n3e01, liftWeight, "Take the Elevator to the 3rd-Floor");
        Edge e1046 = new Edge("E1046", n1e01, n4e01, liftWeight, "Take the Elevator to the 4th-Floor");
        
        Edge e1047 = new Edge("E1047", n1e02, n0e02, liftPermWeight, "Take the Staff Elevator to the Ground Floor");
        Edge e1048 = new Edge("E1048", n1e02, n2e02, liftPermWeight, "Take the Staff Elevator to the 2nd-Floor");
        Edge e1049 = new Edge("E1049", n1e02, n3e02, liftPermWeight, "Take the Staff Elevator to the 3rd-Floor");
        Edge e1050 = new Edge("E1050", n1e02, n4e02, liftPermWeight, "Take the Staff Elevator to the 4th-Floor");
        Edge e1051 = new Edge("E1051", n1e02, n5e02, liftPermWeight, "Take the Staff Elevator to the 5th-Floor");
        Edge e1052 = new Edge("E1052", n1e02, n6e02, liftPermWeight, "Take the Staff Elevator to the 6th-Floor");
        
        //Second Floor
        Edge e2074 = new Edge("E2074", n2e01, n0e01, liftWeight, "Take the Elevator to the Ground Floor");
        Edge e2075 = new Edge("E2075", n2e01, n1e01, liftWeight, "Take the Elevator to the 1st-Floor");
        Edge e2076 = new Edge("E2076", n2e01, n3e01, liftWeight, "Take the Elevator to the 3rd-Floor");
        Edge e2077 = new Edge("E2077", n2e01, n4e01, liftWeight, "Take the Elevator to the 4th-Floor");
        
        Edge e2078 = new Edge("E2078", n2e02, n0e02, liftPermWeight, "Take the Staff Elevator to the Ground Floor");
        Edge e2079 = new Edge("E2079", n2e02, n1e02, liftPermWeight, "Take the Staff Elevator to the 1st-Floor");
        Edge e2080 = new Edge("E2080", n2e02, n3e02, liftPermWeight, "Take the Staff Elevator to the 3rd-Floor");
        Edge e2081 = new Edge("E2081", n2e02, n4e02, liftPermWeight, "Take the Staff Elevator to the 4th-Floor");
        Edge e2082 = new Edge("E2082", n2e02, n5e02, liftPermWeight, "Take the Staff Elevator to the 5th-Floor");
        Edge e2083 = new Edge("E2083", n2e02, n6e02, liftPermWeight, "Take the Staff Elevator to the 6th-Floor");
        
        //Third Floor
        Edge e3049 = new Edge("Ee3049", n3e01, n0e01, liftWeight, "Take the Elevator to the Ground Floor");
        Edge e3050 = new Edge("Ee3050", n3e01, n1e01, liftWeight, "Take the Elevator to the 1st-Floor");
        Edge e3051 = new Edge("Ee3051", n3e01, n2e01, liftWeight, "Take the Elevator to the 2nd-Floor");
        Edge e3052 = new Edge("Ee3052", n3e01, n4e01, liftWeight, "Take the Elevator to the 4th-Floor");

        Edge e3053 = new Edge("E3053", n3e02, n0e02, liftPermWeight, "Take the Staff Elevator to the Ground Floor");
        Edge e3054 = new Edge("E3054", n3e02, n1e02, liftPermWeight, "Take the Staff Elevator to the 1st-Floor");
        Edge e3055 = new Edge("E3055", n3e02, n2e02, liftPermWeight, "Take the Staff Elevator to the 2nd-Floor");
        Edge e3056 = new Edge("E3056", n3e02, n4e02, liftPermWeight, "Take the Staff Elevator to the 4th-Floor");
        Edge e3057 = new Edge("E3057", n3e02, n5e02, liftPermWeight, "Take the Staff Elevator to the 5th-Floor");
        Edge e3058 = new Edge("E3058", n3e02, n6e02, liftPermWeight, "Take the Staff Elevator to the 6th-Floor");
        
        //Fourth Floor
        Edge e4060 = new Edge("E4060", n4e01, n0e01, liftWeight, "Take the Elevator to the Ground Floor");
        Edge e4061 = new Edge("E4061", n4e01, n1e01, liftWeight, "Take the Elevator to the 1st-Floor");
        Edge e4062 = new Edge("E4062", n4e01, n2e01, liftWeight, "Take the Elevator to the 2nd-Floor");
        Edge e4063 = new Edge("E4063", n4e01, n3e01, liftWeight, "Take the Elevator to the 3rd-Floor");
        
        Edge e4065 = new Edge("E4065", n4e02, n0e02, liftPermWeight, "Take the Staff Elevator to the Ground Floor");
        Edge e4066 = new Edge("E4066", n4e02, n1e02, liftPermWeight, "Take the Staff Elevator to the 1st-Floor");
        Edge e4067 = new Edge("E4067", n4e02, n2e02, liftPermWeight, "Take the Staff Elevator to the 2nd-Floor");
        Edge e4068 = new Edge("E4068", n4e02, n3e02, liftPermWeight, "Take the Staff Elevator to the 3rd-Floor");
        Edge e4069 = new Edge("E4069", n4e02, n5e02, liftPermWeight, "Take the Staff Elevator to the 5th-Floor");
        Edge e4064 = new Edge("E4060", n4e02, n6e02, liftPermWeight, "Take the Staff Elevator to the 6th-Floor");
        
        //Fifth Floor
        Edge e5061 = new Edge("E5061", n5e02, n0e02, liftPermWeight, "Take the Staff Elevator to the Ground Floor");
        Edge e5062 = new Edge("E5062", n5e02, n1e02, liftPermWeight, "Take the Staff Elevator to the 1st-Floor");
        Edge e5063 = new Edge("E5063", n5e02, n2e02, liftPermWeight, "Take the Staff Elevator to the 2nd-Floor");
        Edge e5064 = new Edge("E5064", n5e02, n3e02, liftPermWeight, "Take the Staff Elevator to the 3rd-Floor");
        Edge e5065 = new Edge("E5065", n5e02, n4e02, liftPermWeight, "Take the Staff Elevator to the 5th-Floor");
        Edge e5066 = new Edge("E5066", n5e02, n6e02, liftPermWeight, "Take the Staff Elevator to the 6th-Floor");
        
        //Sixth Floor
        Edge e6052 = new Edge("E6052", n6e02, n0e02, liftPermWeight, "Take the Staff Elevator to the Ground Floor");
        Edge e6053 = new Edge("E6053", n6e02, n1e02, liftPermWeight, "Take the Staff Elevator to the 1st-Floor");
        Edge e6054 = new Edge("E6054", n6e02, n2e02, liftPermWeight, "Take the Staff Elevator to the 2nd-Floor");
        Edge e6055 = new Edge("E6055", n6e02, n3e02, liftPermWeight, "Take the Staff Elevator to the 3rd-Floor");
        Edge e6056 = new Edge("E6056", n6e02, n4e02, liftPermWeight, "Take the Staff Elevator to the 5th-Floor");
        Edge e6057 = new Edge("E6057", n6e02, n5e02, liftPermWeight, "Take the Staff Elevator to the 6th-Floor");
        
        
		for (int i = 0; i < allNodes.size(); i++) {
			retrievalMap.put(allNodes.get(i).getRoomNumber(), allNodes.get(i));
		}

	}

	public ArrayList<Node> getAllNodes() {
		return allNodes;
	}

	public void setAllNodes(ArrayList<Node> allNodes) {
		this.allNodes = allNodes;
	}
	
	public static HashMap<String, Node> getMap(){
		return retrievalMap;
	}
	
	public ArrayList<Edge> getAllEdges() {
		return allEdges;
	}
	
}