import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CalculateAverage {

	public static void main(String[] args) {

		String str = "02:22:45 \n"
				+ " 02:19:42 \n"
				+ " 02:13:41 \n"
				+ " 02:13:14 \n"
				+ " 02:13:04 \n"
				+ " 02:10:25 \n"
				+ " 02:09:20 \n"
				+ " 02:08:37 \n"
				+ " 02:05:45 \n"
				+ " 02:05:35 \n"
				+ " 02:02:39 \n"
				+ " 02:02:00 \n"
				+ " 02:00:13 \n"
				+ " 01:58:29 \n"
				+ " 01:58:03 \n"
				+ " 01:57:16 \n"
				+ " 01:56:59 \n"
				+ " 01:56:57 \n"
				+ " 01:56:56 \n"
				+ " 01:56:05 \n"
				+ " 01:55:55 \n"
				+ " 01:55:15 \n"
				+ " 01:54:07 \n"
				+ " 01:53:32 \n"
				+ " 01:53:21 \n"
				+ " 01:52:47 \n"
				+ " 01:52:06 \n"
				+ " 01:51:04 \n"
				+ " 01:50:16 \n"
				+ " 01:49:53 \n"
				+ " 01:49:44 \n"
				+ " 01:49:39 \n"
				+ " 01:47:18 \n"
				+ " 01:46:54 \n"
				+ " 01:45:26 \n"
				+ " 01:44:40 \n"
				+ " 01:44:22 \n"
				+ " 01:44:12 \n"
				+ " 01:40:41 \n"
				+ " 01:40:33 \n"
				+ " 01:40:31 \n"
				+ " 01:40:26 \n"
				+ " 01:39:53 \n"
				+ " 01:39:42 \n"
				+ " 01:39:08 \n"
				+ " 01:38:29 \n"
				+ " 01:37:48 \n"
				+ " 01:37:38 \n"
				+ " 01:36:18 \n"
				+ " 01:36:09 \n"
				+ " 01:36:08 \n"
				+ " 01:35:36 \n"
				+ " 01:35:30 \n"
				+ " 01:35:08 \n"
				+ " 01:34:57 \n"
				+ " 01:34:53 \n"
				+ " 01:34:32 \n"
				+ " 01:34:32 \n"
				+ " 01:34:09 \n"
				+ " 01:33:12 \n"
				+ " 01:33:10 \n"
				+ " 01:32:34 \n"
				+ " 01:32:22 \n"
				+ " 01:32:19 \n"
				+ " 01:31:53 \n"
				+ " 01:31:49 \n"
				+ " 01:31:26 \n"
				+ " 01:31:19 \n"
				+ " 01:30:40 \n"
				+ " 01:30:32 \n"
				+ " 01:30:32 \n"
				+ " 01:30:23 \n"
				+ " 01:30:12 \n"
				+ " 01:29:59 \n"
				+ " 01:29:39 \n"
				+ " 01:29:21 \n"
				+ " 01:29:13 \n"
				+ " 01:28:55 \n"
				+ " 01:28:37 \n"
				+ " 01:28:01 \n"
				+ " 01:27:18 \n"
				+ " 01:26:51 \n"
				+ " 01:25:26 \n"
				+ " 01:24:59 \n"
				+ " 01:24:35 \n"
				+ " 01:24:19 \n"
				+ " 01:24:17 \n"
				+ " 01:24:13 \n"
				+ " 01:23:47 \n"
				+ " 01:23:44 \n"
				+ " 01:23:41 \n"
				+ " 01:22:49 \n"
				+ " 01:22:49 \n"
				+ " 01:22:32 \n"
				+ " 01:22:32 \n"
				+ " 01:22:15 \n"
				+ " 01:21:53 \n"
				+ " 01:21:48 \n"
				+ " 01:21:33 \n"
				+ " 01:21:30 \n"
				+ "";

		int l = str.split("\n").length;
		String arr[] = str.split("\n");
		int result = 0, minutes = 0;

		for (int i = 0; i < l; i++) {

			// result+= Integer.parseInt(arr[i].split(":")[1]);
			// System.out.println(arr[i].split(":")[1] +"->"+result);

			minutes += Integer.parseInt(arr[i].split(":")[1].trim());
			System.out.println(arr[i].split(":")[1].trim() + "->" + minutes);

			if (!arr[i].split(":")[0].trim().equals("00")) {
				minutes += Integer.parseInt(arr[i].split(":")[0].trim())* 60;
				System.out.println("->"+arr[i].split(":")[0].trim() + "->" + minutes);
			}

		}
		System.out.println("total : " + result);
		System.out.println("average : " + (result / l) + "minutes");
		System.out.println("minutes: " + minutes);
		System.out.println("average : " + (minutes / l) + "minutes");

	}

}
