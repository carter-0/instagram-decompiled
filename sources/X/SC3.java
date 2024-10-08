package X;

import java.util.regex.Pattern;

public abstract class SC3 {
    public static final Pattern A00 = Pattern.compile(002.A11("[+-]?(?:NaN|Infinity|", "(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?", "|", "0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?", ")").replace("#", "+"));

    public static boolean A00(double d) {
        return Double.NEGATIVE_INFINITY < d && d < Double.POSITIVE_INFINITY;
    }
}
