import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class LexicoGraphicOrder {
    public static void main(String args[] ) throws Exception {       
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String string = in.readLine();
		int K = Integer.parseInt(in.readLine());		        
		StringBuilder sb = new StringBuilder();		       
	    while(string.length()!=0){
		    String charvalue = Stream.of(string.split("")).parallel().limit(K).sorted().limit(1).collect(Collectors.joining());
		    sb.append(charvalue);
		    string = string.replaceFirst(charvalue, "");
	    }		        
	    System.out.println(sb.toString());
    }
}
