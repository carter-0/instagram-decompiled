package X;

import java.util.regex.Pattern;

/* renamed from: X.Rln  reason: case insensitive filesystem */
public abstract class C10050Rln {
    public static final Pattern A00 = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    public static final Pattern A01 = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
}
