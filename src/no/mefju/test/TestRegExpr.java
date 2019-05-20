/**
 * 
 */
package no.mefju.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author matth
 *
 */
public class TestRegExpr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("starting");
		String s2m="Output of \"hello\" session: not matched";
		Pattern pt = Pattern.compile("^Output of \"([\\w]+)\" session:( .*)$");
		Matcher m = pt.matcher(s2m);
		if(m.matches()) {
			System.out.println("got a match");
			System.out.println("got "+m.groupCount() +" groups");
			for(int i=0;i<=m.groupCount();++i) {
				System.out.println("group["+i+"]="+m.group(i));
			}
		}
		System.out.println("all ended");
	}

}
