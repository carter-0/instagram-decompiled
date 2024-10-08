package X;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SBF {
    public static final Pattern A00 = Pattern.compile("\\{([^{}]*)\\}");

    public static final String A00(String str, Map map) {
        if (str == null || map == null) {
            return str;
        }
        Matcher matcher = A00.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, "");
                stringBuffer.append(DbT.A11(group, map));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
