package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;

/* renamed from: X.4tr  reason: invalid class name and case insensitive filesystem */
public abstract class C276764tr {
    public static final C276804tv A00 = C276804tv.A00;
    public static final C276774ts A01 = new Object();
    public static final C276794tu A02 = C276784tt.A00;

    public static final 16F A00(C307896Rx r2, String str) {
        0c9 A03;
        try {
            UserSession A0B = C308206Td.A0B(r2);
            if (A0B instanceof UserSession) {
                int i = 15p.A09;
                A03 = new 0bH(A0B).A0C(str);
            } else if (C308206Td.A06(r2).A00) {
                A03 = 0aS.A00.A03(str);
            } else {
                C375889Fq r0 = C375889Fq.A00;
                15p r02 = AnonymousClass15o.A00;
                0qQ.A08(r02);
                A03 = r02.A03(str);
            }
            A03.A1J();
            return A03;
        } catch (IOException e) {
            0KC.A0F("IgBloksInitializer", "Error building delegate parser", e);
            throw new RuntimeException(e);
        }
    }
}
