package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.2if  reason: invalid class name and case insensitive filesystem */
public final class C227112if {
    public final Activity A00;
    public final 1wn A01 = new C227132ih(this);
    public final 1wn A02 = new C227122ig(this);
    public final UserSession A03;
    public final AnonymousClass2Zm A04;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C227112if r6, X.0KP r7, boolean r8) {
        /*
            java.lang.String r5 = r7.A02
            r2 = 0
            if (r8 != 0) goto L_0x0088
            android.content.Intent r3 = r7.A00
        L_0x0007:
            r1 = 0
            r4 = 1
            if (r3 == 0) goto L_0x0014
            java.lang.String r0 = "SERVICE_INTENT"
            boolean r0 = r3.getBooleanExtra(r0, r1)
            if (r0 != r4) goto L_0x002d
            r2 = r3
        L_0x0014:
            if (r5 == 0) goto L_0x007c
            java.util.Set r0 = X.C226102fd.A01
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x007c
            X.14C r0 = X.AnonymousClass14B.A03
            X.14B r3 = r0.A00()
            android.app.Activity r1 = r6.A00
            r0 = 268468224(0x10008000, float:2.5342157E-29)
        L_0x0029:
            android.content.Intent r3 = r3.A03(r1, r0)
        L_0x002d:
            r0 = 2370(0x942, float:3.321E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.putExtra(r0, r4)
            java.lang.String r0 = "MainActivityAccountHelper.ACCOUNT_SWITCH_ENTRY_POINT"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "end_of_activity_feed"
            boolean r0 = r0.equals(r5)
            java.lang.String r1 = "MainActivityAccountHelper.STARTUP_TAB"
            if (r0 == 0) goto L_0x0079
            X.1QK r0 = X.1QK.A0D
        L_0x0047:
            java.lang.String r0 = r0.toString()
            r3.putExtra(r1, r0)
            java.lang.String r1 = "profile"
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L_0x0059
            r3.putExtra(r1, r4)
        L_0x0059:
            r0 = 0
            X.C71172bH.A00 = r0
            android.app.Activity r1 = r6.A00
            r1.finish()
            if (r8 == 0) goto L_0x006a
            java.lang.Runnable r0 = r7.A01
            if (r0 == 0) goto L_0x006a
            r0.run()
        L_0x006a:
            X.0kR.A0B(r1, r3)
            if (r2 == 0) goto L_0x0078
            X.0b6 r0 = X.0kR.A00
            X.0R3 r0 = r0.A07()
            r0.A05(r1, r2)
        L_0x0078:
            return
        L_0x0079:
            X.1QK r0 = X.1QK.A0C
            goto L_0x0047
        L_0x007c:
            X.14C r0 = X.AnonymousClass14B.A03
            X.14B r3 = r0.A00()
            android.app.Activity r1 = r6.A00
            r0 = 268533760(0x10018000, float:2.5539372E-29)
            goto L_0x0029
        L_0x0088:
            r3 = r2
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C227112if.A00(X.2if, X.0KP, boolean):void");
    }

    public C227112if(Activity activity, UserSession userSession, AnonymousClass2Zm r4) {
        this.A03 = userSession;
        this.A04 = r4;
        this.A00 = activity;
    }
}
