package es.geekshubs.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Primos {

	/**
	 * Apply Method
	 * 
	 * @param input
	 * @return
	 */
	public List<Integer> apply(final Integer input) {
		List<Integer> output = new ArrayList<Integer>();
		
		for(int i=1; i<=input.intValue(); i++) {
			if(!(i%2 == 0 || i%3 == 0 || i%5 == 0))
				output.add(i);
		}
		
		return output;
	}

}
