package X;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.SCf  reason: case insensitive filesystem */
public abstract class C11150SCf {
    public static final Pattern A00 = Pattern.compile("\\\\.");
    public static final Pattern A01 = Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    public static String A00(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = A01.matcher(str);
        StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new StringBuffer();
            }
            char A002 = Pxe.A00(matcher.group());
            if (A002 == 12) {
                str2 = "\\\\f";
            } else if (A002 == 13) {
                str2 = "\\\\r";
            } else if (A002 == '\"') {
                str2 = "\\\\\\\"";
            } else if (A002 == '/') {
                str2 = "\\\\/";
            } else if (A002 != '\\') {
                switch (A002) {
                    case 8:
                        str2 = "\\\\b";
                        break;
                    case 9:
                        str2 = "\\\\t";
                        break;
                    case 10:
                        str2 = "\\\\n";
                        break;
                }
            } else {
                str2 = "\\\\\\\\";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
