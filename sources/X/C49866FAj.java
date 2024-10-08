package X;

import android.os.Bundle;
import com.instagram.bloks.hosting.IgBloksScreenConfig;

/* renamed from: X.FAj  reason: case insensitive filesystem */
public final class C49866FAj {
    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, X.4bz, X.FTV] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Context r18, X.C46645DiQ r19, com.instagram.bloks.hosting.IgBloksScreenConfig r20, X.C276544tV r21, X.X5O r22, int r23, boolean r24) {
        /*
            r17 = this;
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            r1 = r18
            java.lang.Object r3 = X.0mE.A00(r1, r0)
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            if (r3 == 0) goto L_0x0117
            r1 = r20
            X.DfZ r12 = r1.A0C
            if (r12 != 0) goto L_0x0016
            X.DfZ r12 = X.C46628Di8.A04()
        L_0x0016:
            X.Di6 r0 = r12.A0E
            X.Di6 r6 = X.C46626Di6.FULL_SCREEN
            r16 = r19
            r10 = r22
            r9 = r23
            r8 = r24
            if (r0 == r6) goto L_0x0049
            X.0lg r2 = r1.A0B
            r0 = r16
            X.TyM r5 = X.C14557TyM.A02(r0, r1, r2, r12)
            if (r21 != 0) goto L_0x0044
            java.lang.String r11 = "unspecified_screen_id"
        L_0x0030:
            X.Tyi r2 = new X.Tyi
            r2.<init>(r10, r9, r8)
            X.8dD r9 = r1.A05()
            X.68u r0 = r1.A07
            r6 = r3
            r7 = r16
            r8 = r0
            r10 = r2
            X.C49954FGj.A05(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0044:
            java.lang.String r11 = X.C46611Dhr.A08(r21)
            goto L_0x0030
        L_0x0049:
            X.0lg r13 = r1.A0B
            java.util.Map r11 = r1.A0Y
            java.lang.String r14 = r1.A0S
            if (r14 != 0) goto L_0x005d
            if (r21 == 0) goto L_0x0112
            boolean r0 = X.C46611Dhr.A0E(r21)
            if (r0 == 0) goto L_0x0112
            java.lang.String r14 = X.C46611Dhr.A08(r21)
        L_0x005d:
            if (r14 != 0) goto L_0x0114
            java.lang.String r2 = "IgCdsBottomSheetFragment"
        L_0x0061:
            android.os.Bundle r15 = X.AnonymousClass7TE.A0a()
            r0 = 1614(0x64e, float:2.262E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7 = 1
            r15.putBoolean(r0, r7)
            X.DbW.A0w(r15, r13)
            java.lang.String r4 = "Bloks"
            java.lang.String r0 = "cds_platform"
            r15.putString(r0, r4)
            X.0Tu r0 = X.0Tu.A05
            r4 = 18310098418020472(0x410cf000023078, double:1.8969352198355736E-307)
            boolean r0 = X.1AW.A06(r0, r4)
            com.instagram.bloks.hosting.IgBloksScreenConfig.A04(r15, r1, r0)
            r0 = r16
            X.C49903FCg.A00(r15, r0)
            android.os.Bundle r4 = r12.A00()
            r0 = 542(0x21e, float:7.6E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r15.putBundle(r0, r4)
            java.lang.String r0 = "screen_id"
            r15.putString(r0, r14)
            r0 = 1459(0x5b3, float:2.044E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r15.putInt(r0, r9)
            if (r22 == 0) goto L_0x00b2
            int r4 = X.C14615TzM.A00(r10)
            java.lang.String r0 = "back_button_override"
            r15.putInt(r0, r4)
        L_0x00b2:
            java.lang.String r0 = "is_limited_theme"
            r15.putBoolean(r0, r8)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "cds_bloks"
            X.6W8 r8 = X.DbS.A0b(r3, r15, r13, r4, r0)
            r8.A0B = r7
            r8.A07()
            r8.A06 = r2
            if (r11 == 0) goto L_0x00d1
            X.FTV r0 = new X.FTV
            r0.<init>()
            r0.A00 = r11
            r8.A01 = r0
        L_0x00d1:
            X.DfZ r2 = r1.A0C
            if (r2 == 0) goto L_0x00f6
            X.Di6 r0 = r2.A0E
            if (r0 != r6) goto L_0x00f6
            boolean r0 = r2.A0L
            r6 = 3
            r5 = 2
            r4 = 0
            r2 = 4
            if (r0 == 0) goto L_0x00fa
            int[] r2 = new int[r2]
            r0 = 2130772005(0x7f010025, float:1.7147116E38)
            r1 = 2130772005(0x7f010025, float:1.7147116E38)
            r2[r4] = r0
            r0 = 2130772008(0x7f010028, float:1.7147122E38)
            r2[r7] = r0
            r2[r5] = r1
        L_0x00f2:
            r2[r6] = r0
            r8.A0J = r2
        L_0x00f6:
            r8.A0C(r3)
            return
        L_0x00fa:
            java.lang.Integer r1 = r1.A0P
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x00f6
            int[] r2 = new int[r2]
            r0 = 2130772002(0x7f010022, float:1.714711E38)
            r2[r4] = r0
            r0 = 2130772110(0x7f01008e, float:1.714733E38)
            r2[r7] = r0
            r2[r5] = r0
            r0 = 2130772109(0x7f01008d, float:1.7147327E38)
            goto L_0x00f2
        L_0x0112:
            java.lang.String r14 = "unspecified_screen_id"
        L_0x0114:
            r2 = r14
            goto L_0x0061
        L_0x0117:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49866FAj.A01(android.content.Context, X.DiQ, com.instagram.bloks.hosting.IgBloksScreenConfig, X.4tV, X.X5O, int, boolean):void");
    }

    public static AnonymousClass3M3 A00(C46645DiQ diQ, IgBloksScreenConfig igBloksScreenConfig) {
        Bundle A0a = AnonymousClass7TE.A0a();
        IgBloksScreenConfig.A04(A0a, igBloksScreenConfig, false);
        DbW.A0w(A0a, igBloksScreenConfig.A0B);
        A0a.putString("cds_platform", "Bloks");
        C46645DiQ.A02(A0a, diQ, C46648DiT.A00(igBloksScreenConfig.A0B).booleanValue());
        AnonymousClass3M3 r0 = new AnonymousClass3M3();
        r0.setArguments(A0a);
        return r0;
    }
}
