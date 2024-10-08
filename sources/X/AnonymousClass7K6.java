package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7K6  reason: invalid class name */
public final class AnonymousClass7K6 extends C329667Jt {
    public AnonymousClass7K7 A00 = null;
    public final Activity A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C254783t2 A05;
    public final String A06;
    public final C62320sa A07;
    public final C62320sa A08;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7K6(android.app.Activity r13, android.content.Context r14, X.AnonymousClass0iw r15, com.instagram.common.session.UserSession r16, X.C254783t2 r17, java.lang.String r18, X.C62320sa r19, X.C62320sa r20) {
        /*
            r12 = this;
            r3 = 0
            r8 = 2131958789(0x7f131c05, float:1.95542E38)
            r9 = 2131238628(0x7f081ee4, float:1.809354E38)
            X.7JT r4 = X.AnonymousClass7JT.IMAGINE
            r11 = 448(0x1c0, float:6.28E-43)
            r1 = r12
            r2 = r16
            r7 = r19
            r5 = r3
            r6 = r3
            r10 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r12.A04 = r2
            r12.A08 = r7
            r12.A01 = r13
            r12.A02 = r14
            r0 = r20
            r12.A07 = r0
            r0 = r17
            r12.A05 = r0
            r0 = r18
            r12.A06 = r0
            r12.A03 = r15
            r12.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7K6.<init>(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.3t2, java.lang.String, X.0sa, X.0sa):void");
    }

    public final void A05(C3260875i r12, AnonymousClass7K7 r13) {
        AnonymousClass7K7 r5;
        int length;
        if (r13 == null) {
            r5 = null;
        } else {
            String str = r13.A01;
            if (str == null) {
                str = "";
            }
            UserSession userSession = this.A04;
            if (r12 != null && r12.A01() == AnonymousClass7OS.IMAGINE && (length = str.length()) > 0) {
                String A052 = r12.A05();
                if (00l.A0d(str, A052, false) && AnonymousClass9B8.A08(userSession) && A052 != null) {
                    int A082 = 00l.A08(str, A052, 0, false) + A052.length();
                    if (A082 < length) {
                        str = str.substring(A082);
                        0qQ.A07(str);
                    } else {
                        str = null;
                    }
                }
            }
            r5 = new AnonymousClass7K7(str, r13.A00, r13.A03, r13.A02, r13.A04);
        }
        this.A00 = r5;
    }
}
