package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class HC7 extends C229902ob {
    public final Context A00;
    public final C309986aF A01;
    public final C310666bQ A02;
    public final 1Bk A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HC7(android.content.Context r13, X.1Bk r14, com.instagram.common.session.UserSession r15, X.AnonymousClass4DU r16, X.C229842oQ r17, X.C309986aF r18, X.C310666bQ r19) {
        /*
            r12 = this;
            r0 = 7
            r7 = r17
            X.0qQ.A0B(r7, r0)
            r1 = r19
            X.6bP r0 = r1.A04
            X.IP7 r5 = new X.IP7
            r4 = r15
            r5.<init>(r15, r0)
            r9 = 0
            r11 = 0
            r8 = 944(0x3b0, float:1.323E-42)
            r2 = r12
            r3 = r14
            r6 = r16
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11)
            r12.A00 = r13
            r12.A03 = r14
            r12.A02 = r1
            r0 = r18
            r12.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HC7.<init>(android.content.Context, X.1Bk, com.instagram.common.session.UserSession, X.4DU, X.2oQ, X.6aF, X.6bQ):void");
    }

    public final /* bridge */ /* synthetic */ C254523sc A01(Object obj, Object obj2) {
        C255773uh r8 = (C255773uh) obj;
        AnonymousClass6YY r10 = (AnonymousClass6YY) obj2;
        0qQ.A0B(r8, 0);
        if (r10 != null) {
            AnonymousClass4DU r1 = this.A07;
            C310666bQ r11 = this.A02;
            AnonymousClass3BQ r4 = r11.A03;
            C250973mM r3 = r10.A00;
            AnonymousClass6KG A002 = AnonymousClass6KF.A00(r1, r3.A0H, r4);
            UserSession userSession = this.A04;
            C254523sc A022 = GTA.A02(userSession, A002, r8, "impression");
            A022.A02();
            A022.A1u = AnonymousClass7TE.A0v();
            1Xj r0 = r8.A0b;
            if (r0 != null) {
                A022.A8B = C231122qu.A0R(userSession, r0);
            }
            G9w.A1M(userSession, A022);
            AnonymousClass3PI.A08(A022, r8, r10, r11);
            C309986aF r02 = this.A01;
            String str = r8.A0k;
            0qQ.A07(str);
            AnonymousClass6UP r9 = (AnonymousClass6UP) r02.A05.get(str);
            if (r9 != null) {
                AnonymousClass3PI.A00.A0B(this.A00, A022, r8, r9, r10, r11);
            }
            C309426Yf r6 = r10.A02;
            A022.A7U = AnonymousClass6Q2.A00(userSession, r8, r3, r4, r6);
            C233822wX.A0A(userSession, A022, r8.A09());
            A022.A1B = Boolean.valueOf(r8.A10());
            C51972G9s.A1A(A022);
            A022.A1X = Boolean.valueOf(r8.A1J());
            A022.A1d = Boolean.valueOf(r6.A0l);
            A022.A2Z = Double.valueOf(r6.A03);
            float f = r6.A0A;
            A022.A2a = Double.valueOf((((double) f) / 1000.0d) - (((double) (r6.A0B * f)) / 1000.0d));
            A022.A03();
            return A022;
        }
        throw AnonymousClass7TE.A11("Unexpected null mediaState");
    }

    public final String A02() {
        return null;
    }

    public final String A04() {
        return "ad_story";
    }
}
