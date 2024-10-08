package X;

import java.util.regex.Pattern;

/* renamed from: X.Rk8  reason: case insensitive filesystem */
public abstract class C9953Rk8 {
    public static final Pattern A00;

    static {
        Pattern compile = Pattern.compile("(&|\\?)oe=([0-9a-fA-F]+)(&|#|$)");
        0qQ.A07(compile);
        A00 = compile;
    }
}
