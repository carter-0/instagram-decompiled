package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Ui  reason: invalid class name and case insensitive filesystem */
public final class C308456Ui extends C229902ob {
    public final C310666bQ A00;
    public final 1Bk A01;
    public final C229822oN A02;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.2n2] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C308456Ui(X.1Bk r12, com.instagram.common.session.UserSession r13, X.AnonymousClass4DU r14, X.C229842oQ r15, X.C229822oN r16, X.C310666bQ r17) {
        /*
            r11 = this;
            r0 = 6
            r6 = r15
            X.0qQ.A0B(r15, r0)
            X.6Uj r4 = new X.6Uj
            r4.<init>()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317470361392293(0x81068c000814a5, double:3.03065272303514E-306)
            r3 = r13
            boolean r0 = X.182.A06(r2, r13, r0)
            if (r0 == 0) goto L_0x0034
            boolean r0 = com.facebook.endtoend.EndToEnd.isRunningEndToEndTest()
            if (r0 == 0) goto L_0x0034
            r8 = 0
        L_0x0020:
            r10 = 0
            r7 = 912(0x390, float:1.278E-42)
            r1 = r11
            r2 = r12
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10)
            r11.A01 = r12
            r0 = r17
            r11.A00 = r0
            r0 = r16
            r11.A02 = r0
            return
        L_0x0034:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r0 = 1
            long r8 = r2.toMillis(r0)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308456Ui.<init>(X.1Bk, com.instagram.common.session.UserSession, X.4DU, X.2oQ, X.2oN, X.6bQ):void");
    }

    public final String A03() {
        return "";
    }

    public final /* bridge */ /* synthetic */ C254523sc A01(Object obj, Object obj2) {
        Long l;
        List C0K;
        List A002;
        AnonymousClass3HV r0;
        String str;
        C255773uh r10 = (C255773uh) obj;
        AnonymousClass6YY r11 = (AnonymousClass6YY) obj2;
        0qQ.A0B(r10, 0);
        AnonymousClass4DU r2 = this.A07;
        UserSession userSession = this.A04;
        C254523sc A022 = GTA.A02(userSession, r2, r10, "impression");
        A022.A02();
        boolean z = true;
        A022.A1u = true;
        if (r11 != null) {
            AnonymousClass3PI.A08(A022, r10, r11, this.A00);
            C250973mM r7 = r11.A00;
            if (r7.A06 || r11.A02.A00 < 0.25d) {
                z = false;
            } else {
                r7.A06 = true;
            }
            A022.A1l = Boolean.valueOf(z);
        }
        A022.A1B = Boolean.valueOf(r10.A10());
        String str2 = AnonymousClass1QI.A00.A02.A00;
        if (str2 != null) {
            A022.A65 = str2;
        }
        A022.A1X = Boolean.valueOf(r10.A1J());
        if (!(r11 == null || (r0 = r11.A00.A0H.A0M) == null || (str = r0.A0X) == null)) {
            A022.A6Z = str;
        }
        A022.A2H = Double.valueOf((double) TimeUnit.MILLISECONDS.toSeconds(1Au.A00(userSession).A01.getLong("last_stories_tray_request_timestamp", -1)));
        if (r11 != null) {
            C309426Yf r72 = r11.A02;
            A022.A1d = Boolean.valueOf(r72.A0l);
            A022.A2Z = Double.valueOf(r72.A03);
            float f = r72.A0A;
            A022.A2a = Double.valueOf((((double) f) / 1000.0d) - (((double) (r72.A0B * f)) / 1000.0d));
        }
        A022.A03();
        1Xj r02 = r10.A0b;
        if (r02 == null || (C0K = r02.A0C.C0K()) == null || (A002 = JZW.A00(C0K)) == null) {
            l = null;
        } else {
            l = Long.valueOf((long) A002.size());
        }
        A022.A3w = l;
        return A022;
    }

    public final String A02() {
        return null;
    }

    public final String A04() {
        return "story";
    }
}
