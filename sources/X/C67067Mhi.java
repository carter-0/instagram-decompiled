package X;

import java.util.regex.Pattern;

/* renamed from: X.Mhi  reason: case insensitive filesystem */
public final class C67067Mhi extends 0Yg implements C62320sa {
    public static final C67067Mhi A00 = new C67067Mhi();

    public C67067Mhi() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Integer num = AnonymousClass05K.A1F;
        Pattern compile = Pattern.compile("(^``` ?)((.|(\\r\\n)|\\r|\\n)*?\\S(.|(\\r\\n)|\\r|\\n)*?)(^```)\\s*?", 8);
        0qQ.A07(compile);
        return new C67071Mhm(C67071Mhm.A06, C67462MoH.A00, num, compile, false, true);
    }
}
