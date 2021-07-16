package com.gspractice.miscellaneous;

public class MagicPotion {
	public static void main(String[] args) {
		MagicPotion mp = new MagicPotion();
		System.out.println(mp.minimalSteps("ABABCABABCD"));
		//System.out.println(mp.minimalSteps("ABCDABCE"));
		//System.out.println(mp.minimalSteps("ABCABCE"));
	}

	private Integer minimalSteps(String ingredients) {
		String resultString = ingredients;
		for (int i = ingredients.length() - 1; i > 0; i--) {
			int prefixIndex = i;
			int suffix = i;
			String prefixString = ingredients.substring(0, prefixIndex);
			String suffixString = ingredients.charAt(i) + "";

			while (prefixIndex > 0 && suffix > 0) {
				if (prefixString.equals(suffixString)) {
					String prevSuffixResult = resultString.substring(i + 1);
					resultString = prefixString + "*" + prevSuffixResult;
					break;
				}
				prefixIndex--;
				suffix--;
				prefixString = ingredients.substring(0, prefixIndex);
				suffixString = ingredients.substring(suffix, i + 1);
			}
		}
		return resultString.length();
	}
}
