package com.gspractice.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ApacheLogPattern {

	public static void main(String[] args) {
		String lines[] = new String[] { "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
				"10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
				"10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234" };
		String lines1[] = new String[] {
				"10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
				"10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
				"10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
				"10.0.0.2 - nancy [10/Dec/2000:12:34:59 -0500] \"GET /c.gif HTTP/1.0\" 200 234",
				"10.0.0.3 - logan [10/Dec/2000:12:34:59 -0500] \"GET /d.gif HTTP/1.0\" 200 234", };
		System.out.println(findTopIPAddress(lines));
		System.out.println(findTopIPAddress(lines1));
	}

	private static String findTopIPAddress(String[] lines) {
		StringBuilder builder = new StringBuilder();
		Map<String, Integer> ipMap = new HashMap<>();
		int max = 0;
		for (String str : lines) {
			String[] split = str.split("-");
			String ip = split[0];
			int res = ipMap.getOrDefault(ip, 0) + 1;
			ipMap.put(ip, res);
			max = Math.max(max, res);
		}

		for (Entry<String, Integer> entry : ipMap.entrySet()) {
			if (entry.getValue() == max) {
				builder.append(entry.getKey() + ",");
			}
		}

		return builder.deleteCharAt(builder.length() - 1).toString();
	}

}
