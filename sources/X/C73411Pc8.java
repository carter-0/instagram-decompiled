package X;

import android.app.Activity;
import android.os.Bundle;

/* renamed from: X.Pc8  reason: case insensitive filesystem */
public final class C73411Pc8 implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ C69358Njy A02;
    public final /* synthetic */ C69271NiX A03;
    public final /* synthetic */ OW5 A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ Integer A07;

    public C73411Pc8(Activity activity, Bundle bundle, C69358Njy njy, C69271NiX niX, OW5 ow5, Integer num, Integer num2, Integer num3) {
        this.A06 = num;
        this.A03 = niX;
        this.A02 = njy;
        this.A07 = num2;
        this.A05 = num3;
        this.A01 = bundle;
        this.A04 = ow5;
        this.A00 = activity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006c, code lost:
        if (r1 == null) goto L_0x006e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.Integer r0 = r12.A06
            java.lang.String r1 = X.C69894Ntw.A00(r0)
            java.lang.String r0 = "BUNDLE_ENTRY_POINT"
            r3.putString(r0, r1)
            X.NiX r5 = r12.A03
            java.lang.String r1 = r5.toString()
            java.lang.String r0 = "BUNDLE_SURFACE"
            r3.putString(r0, r1)
            X.Njy r1 = r12.A02
            java.lang.String r4 = r1.A00
            java.lang.String r0 = "BUNDLE_SCREEN"
            r3.putString(r0, r4)
            java.lang.Integer r0 = r12.A07
            java.lang.String r2 = X.C69893Ntv.A00(r0)
            java.lang.String r0 = "BUNDLE_ONBOARDING_PERIOD"
            r3.putString(r0, r2)
            java.lang.Integer r0 = r12.A05
            if (r0 == 0) goto L_0x003b
            int r2 = r0.intValue()
            java.lang.String r0 = "BUNDLE_CURRENT_INTERVAL"
            r3.putInt(r0, r2)
        L_0x003b:
            android.os.Bundle r0 = r12.A01
            r3.putAll(r0)
            X.NiX r0 = X.C69271NiX.BOTTOM_SHEET
            if (r5 != r0) goto L_0x00a9
            X.OW5 r0 = r12.A04
            com.instagram.common.session.UserSession r2 = r0.A00
            X.NJT r5 = X.C71073Oas.A01(r3, r2, r1)
            if (r5 == 0) goto L_0x00a2
            android.app.Activity r4 = r12.A00
            boolean r0 = r5 instanceof X.C273494mf
            if (r0 == 0) goto L_0x00a7
            r3 = r5
            X.4mf r3 = (X.C273494mf) r3
        L_0x0057:
            X.Oas r1 = X.C71073Oas.A00
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r4)
            X.7Pr r2 = r1.A02(r0, r5, r2)
            X.37D r0 = X.DbT.A0i(r4)
            if (r0 == 0) goto L_0x006e
            androidx.fragment.app.Fragment r1 = r0.A09()
            r0 = 0
            if (r1 != 0) goto L_0x006f
        L_0x006e:
            r0 = 1
        L_0x006f:
            r7 = 0
            r10 = 0
            java.lang.String r9 = ""
            X.7Ps r6 = new X.7Ps
            r8 = r7
            r11 = r10
            if (r0 == 0) goto L_0x00a3
            r6.<init>(r7, r8, r9, r10, r11)
            r0 = 2131239025(0x7f082071, float:1.8094345E38)
            r6.A02 = r0
            r1 = 8
            X.Ok6 r0 = new X.Ok6
            r0.<init>(r4, r1)
            r6.A05 = r0
            android.content.res.Resources r1 = r4.getResources()
            r0 = 2131954722(0x7f130c22, float:1.9545951E38)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r1, r0)
            r6.A07 = r0
        L_0x0097:
            X.7Pt r0 = r6.A00()
            r2.A0Q = r0
            r2.A0T = r3
            X.DbU.A0y(r4, r5, r2)
        L_0x00a2:
            return
        L_0x00a3:
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x0097
        L_0x00a7:
            r3 = 0
            goto L_0x0057
        L_0x00a9:
            X.NiX r0 = X.C69271NiX.FULLSCREEN_MODAL
            if (r5 != r0) goto L_0x00c5
            X.OW5 r0 = r12.A04
            android.app.Activity r4 = r12.A00
            java.lang.String r2 = "encrypted_backups_screen"
            com.instagram.common.session.UserSession r1 = r0.A00
            java.lang.Class<com.instagram.modal.ModalActivity> r0 = com.instagram.modal.ModalActivity.class
            X.6W8 r1 = X.AnonymousClass6W8.A03(r4, r3, r1, r0, r2)
            r1.A07()
            r0 = 1
            r1.A07 = r0
            r1.A0C(r4)
            return
        L_0x00c5:
            X.NiX r0 = X.C69271NiX.DIALOG
            if (r5 != r0) goto L_0x00a2
            X.OW5 r0 = r12.A04
            java.util.Set r0 = r0.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00a2
            android.app.Activity r2 = r12.A00
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x00a2
            androidx.fragment.app.FragmentActivity r2 = (androidx.fragment.app.FragmentActivity) r2
            X.0hq r0 = r2.getSupportFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.A0R(r4)
            if (r0 != 0) goto L_0x00a2
            int r1 = r1.ordinal()
            r0 = 11
            if (r1 == r0) goto L_0x0101
            r0 = 13
            if (r1 != r0) goto L_0x00a2
            X.NID r1 = new X.NID
            r1.<init>()
        L_0x00f6:
            r1.setArguments(r3)
            X.0hq r0 = r2.getSupportFragmentManager()
            r1.A0B(r0, r4)
            return
        L_0x0101:
            X.NIC r1 = new X.NIC
            r1.<init>()
            goto L_0x00f6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73411Pc8.run():void");
    }
}
