package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class FES {
    public static final FES A00 = new Object();
    public static final Pattern A01 = Pattern.compile("(?<!\\d)(\\d{3} \\d{3})(?!\\d)");
    public static final Pattern A02 = Pattern.compile("(?<!\\d)(\\d{6})(?!\\d)");
    public static final Pattern A03 = Pattern.compile("(?<!\\d)(\\d{3} \\d{3})(?!\\d)(?=.*?[\\s。]#ig([\\s。]+\\w{11})?$)");
    public static final Pattern A04 = Pattern.compile("(?<!\\d)(\\d{6})(?!\\d)(?=.*?[\\s。]#ig([\\s。]+\\w{11})?$)");
    public static final Pattern A05 = Pattern.compile("(?<!\\d)(\\d{8})(?!\\d)");
    public static final Pattern A06 = Pattern.compile("(?<!\\d)(\\d{8})(?!\\d)(?=.*?[\\s。]#ig([\\s。]+\\w{11})?$)");

    public static final String A00(String str, Pattern pattern) {
        String group;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null) {
            return null;
        }
        return new 11S("\\s").A00(group, "");
    }
}
