package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.TransparentModalActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.DiU  reason: case insensitive filesystem */
public final class C46649DiU {
    public int A00 = 0;
    public long A01 = 0;
    public SparseArray A02;
    public C276544tV A03;
    public C276544tV A04;
    public String A05;
    public String A06;
    public Map A07;
    public final String A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final Map A0A = AnonymousClass7TE.A1E();
    public final Map A0B;

    public static C309516Yo A01(FragmentActivity fragmentActivity, IgBloksScreenConfig igBloksScreenConfig, C46649DiU diU, 0lg r6) {
        AnonymousClass3M3 A0C = diU.A0C(fragmentActivity, igBloksScreenConfig);
        C309516Yo r0 = new C309516Yo(fragmentActivity, r6);
        0qQ.A0A(A0C);
        r0.A0B((Bundle) null, A0C);
        return r0;
    }

    public static C46649DiU A05(String str, Map map, Map map2) {
        C46649DiU diU = new C46649DiU(C359608dC.A01(map), map2, str);
        diU.A00 = 719983200;
        diU.A05 = null;
        diU.A01 = 0;
        diU.A06 = null;
        return diU;
    }

    public static void A0B(C46649DiU diU, int i) {
        diU.A00 = i;
        diU.A05 = null;
        diU.A01 = 0;
        diU.A06 = null;
    }

    public final void A0G(Context context, IgBloksScreenConfig igBloksScreenConfig, X5O x5o, int i, boolean z) {
        C46645DiQ A002 = A00(context, igBloksScreenConfig, this);
        C64361Kj.A00().A02().A01(context, A002, igBloksScreenConfig, this.A03, x5o, i, z);
    }

    public static C46645DiQ A00(Context context, IgBloksScreenConfig igBloksScreenConfig, C46649DiU diU) {
        C46649DiU diU2 = diU;
        Map map = diU2.A07;
        new ArrayList();
        String str = diU2.A08;
        Map map2 = diU2.A0B;
        int i = diU2.A00;
        List list = diU2.A09;
        String str2 = diU2.A05;
        String str3 = diU2.A06;
        C276544tV r6 = diU2.A03;
        C46645DiQ diQ = new C46645DiQ(diU2.A02, r6, str, str2, str3, (HashMap) map, list, diU2.A0A, map2, map2, i, false);
        long j = diU2.A01;
        Context context2 = context;
        C359638dF.A02(context2, igBloksScreenConfig.A05(), str, diU2.A05, map, j);
        return diQ;
    }

    public static C46649DiU A06(String str, Map map, Map map2) {
        return new C46649DiU(map, map2, str);
    }

    public static void A07(Context context, IgBloksScreenConfig igBloksScreenConfig, C46649DiU diU) {
        igBloksScreenConfig.A0P = AnonymousClass05K.A01;
        diU.A0D(context, igBloksScreenConfig);
    }

    public static void A08(Context context, IgBloksScreenConfig igBloksScreenConfig, String str, Map map, Map map2) {
        C46649DiU diU = new C46649DiU(map, map2, str);
        diU.A00 = 719983200;
        diU.A0F(context, igBloksScreenConfig);
    }

    public static void A09(Context context, C46649DiU diU, 0lg r3) {
        diU.A0D(context, new IgBloksScreenConfig(r3));
    }

    /* JADX WARNING: type inference failed for: r0v21, types: [java.lang.Object, X.4bz, X.FTV] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0080, code lost:
        if (X.DbY.A1Y(X.0Tu.A05, r4.A0B, 36318853341125134L) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d4, code lost:
        if (r0 != null) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(android.content.Context r24, com.instagram.bloks.hosting.IgBloksScreenConfig r25) {
        /*
            r23 = this;
            r5 = r23
            java.util.Map r7 = r5.A07
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r13 = r5.A08
            r6 = r7
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.util.Map r4 = r5.A0B
            int r3 = r5.A00
            java.util.List r1 = r5.A09
            java.lang.String r14 = r5.A05
            java.lang.String r15 = r5.A06
            X.4tV r12 = r5.A03
            android.util.SparseArray r11 = r5.A02
            java.util.Map r0 = r5.A0A
            r2 = 0
            X.DiQ r10 = new X.DiQ
            r19 = r4
            r20 = r4
            r21 = r3
            r22 = r2
            r16 = r6
            r17 = r1
            r18 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6 = r24
            r4 = r25
            if (r25 == 0) goto L_0x0050
            java.lang.String r0 = "BKDataFetcher.fetch"
            X.1KZ.A01(r0)
            long r0 = r5.A01
            java.lang.String r3 = r5.A05
            X.8dD r12 = r4.A05()
            r11 = r6
            r14 = r3
            r15 = r7
            r16 = r0
            X.C359638dF.A02(r11, r12, r13, r14, r15, r16)
            X.1KZ.A00()
        L_0x0050:
            X.1Kj r0 = X.C64361Kj.A00()
            r0.A02()
            X.4tV r5 = r5.A03
            java.lang.Class<androidx.fragment.app.FragmentActivity> r0 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r8 = X.0mE.A00(r6, r0)
            androidx.fragment.app.FragmentActivity r8 = (androidx.fragment.app.FragmentActivity) r8
            if (r8 == 0) goto L_0x0147
            X.0hq r1 = X.C229102mq.A00(r8)
            boolean r0 = r1.A0G
            r7 = 1
            if (r0 != 0) goto L_0x0072
            boolean r0 = X.AnonymousClass06S.A01(r1)
            if (r0 != 0) goto L_0x0082
        L_0x0072:
            X.0lg r9 = r4.A0B
            X.0Tu r3 = X.0Tu.A05
            r0 = 36318853341125134(0x8107ce000c1a0e, double:3.031527324987001E-306)
            boolean r1 = X.DbY.A1Y(r3, r9, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            r3 = 3
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r8.isFinishing()
            if (r0 != 0) goto L_0x00f9
            boolean r0 = r8 instanceof X.AnonymousClass2ZV
            if (r0 == 0) goto L_0x00f4
            r0 = r8
            X.2ZV r0 = (X.AnonymousClass2ZV) r0
            boolean r0 = r0.CXf()
            if (r0 == 0) goto L_0x00f4
        L_0x0099:
            X.3M3 r1 = X.C49866FAj.A00(r10, r4)
            X.0lg r0 = r4.A0B
            X.6Yo r8 = X.DbV.A0N(r1, r8, r0)
            java.lang.Integer r6 = r4.A0P
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r6 == r0) goto L_0x00c4
            int r0 = r6.intValue()
            if (r0 == r7) goto L_0x00f1
            if (r0 == r3) goto L_0x00ee
            int r3 = X.C46644DiP.A00(r6)
            int r2 = X.C46644DiP.A01(r6)
            int r1 = X.C46644DiP.A02(r6)
            int r0 = X.C46644DiP.A03(r6)
            r8.A0A(r3, r2, r1, r0)
        L_0x00c4:
            java.lang.String r0 = r4.A0S
            if (r0 != 0) goto L_0x00d4
            if (r5 == 0) goto L_0x00eb
            boolean r0 = X.C46611Dhr.A0E(r5)
            if (r0 == 0) goto L_0x00eb
            java.lang.String r0 = X.C46611Dhr.A08(r5)
        L_0x00d4:
            if (r0 == 0) goto L_0x00da
        L_0x00d6:
            r8.A0A = r0
            r8.A0C = r0
        L_0x00da:
            java.util.Map r1 = r4.A0Y
            if (r1 == 0) goto L_0x00e7
            X.FTV r0 = new X.FTV
            r0.<init>()
            r0.A00 = r1
            r8.A07 = r0
        L_0x00e7:
            r8.A04()
            return
        L_0x00eb:
            java.lang.String r0 = "unspecified_screen_id"
            goto L_0x00d6
        L_0x00ee:
            r8.A0E = r7
            goto L_0x00c4
        L_0x00f1:
            r8.A0F = r7
            goto L_0x00c4
        L_0x00f4:
            boolean r0 = r8 instanceof X.C249493js
            if (r0 == 0) goto L_0x00f9
            goto L_0x0099
        L_0x00f9:
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            com.instagram.bloks.hosting.IgBloksScreenConfig.A04(r5, r4, r2)
            X.0lg r0 = r4.A0B
            java.lang.Boolean r0 = X.C46648DiT.A00(r0)
            boolean r0 = r0.booleanValue()
            X.C46645DiQ.A02(r5, r10, r0)
            X.0lg r2 = r4.A0B
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            java.lang.String r0 = "bloks"
            X.6W8 r5 = X.DbS.A0b(r8, r5, r2, r1, r0)
            java.lang.Integer r4 = r4.A0P
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r4 == r0) goto L_0x013b
            int r0 = r4.intValue()
            if (r0 == r7) goto L_0x0143
            if (r0 == r3) goto L_0x013f
            int r3 = X.C46644DiP.A00(r4)
            int r2 = X.C46644DiP.A01(r4)
            int r1 = X.C46644DiP.A02(r4)
            int r0 = X.C46644DiP.A03(r4)
            int[] r0 = new int[]{r3, r2, r1, r0}
            r5.A0J = r0
        L_0x013b:
            r5.A0C(r6)
            return
        L_0x013f:
            r5.A07()
            goto L_0x013b
        L_0x0143:
            r5.A08()
            goto L_0x013b
        L_0x0147:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46649DiU.A0D(android.content.Context, com.instagram.bloks.hosting.IgBloksScreenConfig):void");
    }

    public final void A0E(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        Map map = this.A07;
        new ArrayList();
        String str = this.A08;
        Map map2 = this.A0B;
        int i = this.A00;
        List list = this.A09;
        String str2 = this.A05;
        String str3 = this.A06;
        C276544tV r9 = this.A03;
        C46645DiQ diQ = new C46645DiQ(this.A02, r9, str, str2, str3, (HashMap) map, list, this.A0A, map2, map2, i, false);
        long j = this.A01;
        IgBloksScreenConfig igBloksScreenConfig2 = igBloksScreenConfig;
        Context context2 = context;
        Context context3 = context2;
        C359638dF.A02(context3, igBloksScreenConfig2.A05(), str, this.A05, map, j);
        C64361Kj.A00().A02();
        Activity activity = (Activity) 0mE.A00(context2, FragmentActivity.class);
        if (activity != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            DbW.A0w(A0a, igBloksScreenConfig2.A0B);
            A0a.putString("cds_platform", "Bloks");
            IgBloksScreenConfig.A04(A0a, igBloksScreenConfig2, false);
            C46645DiQ.A02(A0a, diQ, C46648DiT.A00(igBloksScreenConfig2.A0B).booleanValue());
            AnonymousClass37D A0i = DbT.A0i(activity);
            if (!(activity instanceof C249443jn) || ((A0i != null && ((AnonymousClass37F) A0i).A0g) || igBloksScreenConfig2.A0p)) {
                Bundle A0a2 = AnonymousClass7TE.A0a();
                A0a2.putString("bottom_sheet_content_fragment", "bloks");
                A0a2.putBundle("bloks_screen_config", A0a);
                DbU.A0w(activity, A0a2, igBloksScreenConfig2.A0B, TransparentModalActivity.class, "bottom_sheet");
                return;
            }
            C46622Di2 di2 = new C46622Di2();
            C331157Pu A002 = FH9.A09(activity, igBloksScreenConfig2, igBloksScreenConfig2.A0B, di2).A00();
            di2.A0C = A002;
            di2.setArguments(A0a);
            A002.A02(activity, di2);
            return;
        }
        throw new IllegalStateException();
    }

    public final void A0F(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        A0G(context, igBloksScreenConfig, (X5O) null, 32, false);
    }

    public final void A0H(Map map) {
        this.A0A.putAll(map);
    }

    public C46649DiU(Map map, Map map2, String str) {
        this.A08 = str;
        this.A07 = map;
        this.A0B = map2;
    }

    public static AnonymousClass3M3 A02(0lg r2, String str, Map map) {
        return C49891FBs.A02(new IgBloksScreenConfig(r2), A04(str, map));
    }

    public static C46649DiU A03(String str) {
        return A04(str, AnonymousClass7TE.A1E());
    }

    public static C46649DiU A04(String str, Map map) {
        return new C46649DiU(map, AnonymousClass7TE.A1E(), str);
    }

    public static void A0A(C309516Yo r2, 0lg r3, String str, String str2, Map map) {
        C46649DiU A042 = A04(str, map);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig(r3);
        igBloksScreenConfig.A0U = str2;
        r2.A0D(C49891FBs.A02(igBloksScreenConfig, A042));
    }

    public final AnonymousClass3M3 A0C(Context context, IgBloksScreenConfig igBloksScreenConfig) {
        C46645DiQ A002 = A00(context, igBloksScreenConfig, this);
        C64361Kj.A00().A02();
        return C49866FAj.A00(A002, igBloksScreenConfig);
    }
}
