public class stringmath{
	
	public static String add(String a, String b){
		int temp;
		String out = "";
		if(a.length() != b.length()){
			int n = b.length() - a.length();
			if(n < 0){
				n = n * -1;
			}
			String tString;
			if(a.length() - b.length() < 0){
				tString = a;
			} else {
				tString = b;
			}
			String zeroString = "";
			for(int i = 0; i < n; i++){
				zeroString += "0";
			}
			tString = zeroString + tString;
			if(a.length() - b.length() < 0){
				a = tString;
			} else {
				b = tString;
			}
		} else {
			a = "0" + a;
			b = "0" + b;
		}
		
		int tempa, tempb, tempc, tempc2;
		int inpotemp = 0;
		int[] outputArray = new int[a.length() + 1];
		int element = outputArray.length - 1;
		boolean v = true;
		
		for(int i = outputArray.length - 2; i > -1; i--){
			tempa = Integer.parseInt(a.substring(i,i + 1)); 
			tempb = Integer.parseInt(b.substring(i,i + 1));
			tempc = tempa + tempb;
			if(inpotemp == 1 && v == false){ 
				tempc += 1;
				inpotemp = 0;
			}
			if(tempc > 9){
				tempc -= 10;
				inpotemp = 1;
			}
			outputArray[element] = tempc;
			element--;
			v = false;
		} if(inpotemp == 1){
			outputArray[element] = 1;
		}
		v = true;
		for(int i = 0; i < outputArray.length; i++){
			if(v == true){
				if(outputArray[i] == 0){
					
				}
				v = false;
			} else {
				out = out + String.valueOf(outputArray[i]);
			}
		}
		if(out.substring(0,1) == "0"){
			out = out.substring(1,out.length());
		}
		return out;
	}
}
