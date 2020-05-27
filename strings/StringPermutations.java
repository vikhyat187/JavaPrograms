package strings;
import java.util.*;

public class StringPermutations {
	public List<String>permute(char input[]){
		Map<Character,Integer>map = new HashMap<>();
		
		for (char ch:input) {
			map.compute(ch,(key,val)->{
				if(val==null)
					return 1;
				else
					return val+1;
			
		});
		}
		char str[]=new char[map.size()];
		int count[]=new int[map.size()];
		int index=0;
		for (Map.Entry<Character,Integer> entry:map.entrySet()) {
			str[index]=entry.getKey();
			count[index]=entry.getValue();
			index++;
		}
		List<String> resultList= new ArrayList<>();
		char result[] =new char[input.length];
		permuteUtil(str,count,result,0,resultList);
		return resultList;
	}
	public void permuteUtil(char str[],int count[],char result[],int level,List<String>resultList) {
		if (level==result.length) {
			resultList.add(new String(result));
			return;
		}
		
		for (int i =0;i<str.length;i++) {
			if (count[i]==0)
				continue;
			result[level]=str[i];
			count[i]--;
			permuteUtil(str,count,result,level+1,resultList);
			count[i]++;
		}
	}
	private void printArray(char input[]) {
		for(char ch:input) {
			System.out.print(ch+" ");
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String args[]) {
		StringPermutations sp =new StringPermutations();
		sp.permute("AABC".toCharArray()).forEach(s->System.out.print(s));
	}
	
	
	
}
