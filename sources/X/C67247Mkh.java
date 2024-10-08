package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mkh  reason: case insensitive filesystem */
public final class C67247Mkh implements C74395PuB {
    public final Activity A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final C46483Dfm A03;

    public final void Cqe(C67058MhZ mhZ, C254743sy r4, Integer num, Integer num2, String str, List list) {
        0qQ.A0B(r4, 0);
        A00(mhZ, this, r4, (Integer) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002e, code lost:
        if (X.182.A06(r5, r6, 36311569077109357L) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C67058MhZ r7, X.C67247Mkh r8, X.C254743sy r9, java.lang.Integer r10) {
        /*
            android.app.Activity r4 = r8.A00
            com.instagram.common.session.UserSession r6 = r8.A02
            X.4DH r3 = r8.A01
            java.lang.String r0 = "inbox"
            X.1pE r2 = X.1pE.A01(r4, r3, r6, r0)
            r2.A09(r9)
            int r0 = r7.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0G = r0
            X.0Tu r5 = X.0Tu.A05
            r0 = 36311569076126302(0x81012e0005025e, double:3.026920726470359E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 != 0) goto L_0x0030
            r0 = 36311569077109357(0x81012e0014026d, double:3.026920727092047E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            X.DbS.A1X(r4)
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.modal.fragment.intf.ModalListener"
            X.0qQ.A0C(r3, r0)
            r0 = r3
            X.30q r0 = (X.C2356430q) r0
            r2.A14 = r1
            r2.A00 = r3
            r2.A02 = r4
            r2.A0A = r0
            r0 = 1
            r2.A0v = r0
            r2.A05 = r3
            java.lang.String r0 = r7.A02
            r2.A0Y = r0
            r2.A0F = r10
            r2.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67247Mkh.A00(X.MhZ, X.Mkh, X.3sy, java.lang.Integer):void");
    }

    public C67247Mkh(Activity activity, AnonymousClass4DH r4, UserSession userSession, C46483Dfm dfm) {
        this.A02 = userSession;
        this.A00 = activity;
        this.A01 = r4;
        this.A03 = dfm;
        r4.registerLifecycleListener(new IO6(1));
    }

    public final void Cqi(C67058MhZ mhZ, C254743sy r2, Integer num, String str, int i) {
        A00(mhZ, this, r2, num);
    }
}
