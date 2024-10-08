package X;

/* renamed from: X.Mqh  reason: case insensitive filesystem */
public final class C67609Mqh extends 0Yg implements 0sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67609Mqh(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(4);
        this.A00 = i;
        this.A08 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A05 = obj4;
        this.A04 = obj5;
        this.A07 = obj6;
        this.A06 = obj7;
        this.A01 = obj8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0373, code lost:
        if (((java.lang.Boolean) r1.A0O.getValue()).booleanValue() == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04af, code lost:
        if (r2 < r5) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a2, code lost:
        X.0fL.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a7, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0142, code lost:
        r3.Evl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0183, code lost:
        if (r19 == false) goto L_0x0185;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r23, java.lang.Object r24, java.lang.Object r25, java.lang.Object r26) {
        /*
            r22 = this;
            r1 = r22
            r13 = r23
            r5 = r26
            r3 = r25
            r9 = r24
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0147;
                case 1: goto L_0x00aa;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Number r9 = (java.lang.Number) r9
            int r6 = r9.intValue()
            X.5Wy r3 = (X.C286575Wy) r3
            java.lang.Number r5 = (java.lang.Number) r5
            int r2 = r5.intValue()
            r0 = r2 & 6
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r3.AGu(r13)
            r4 = 2
            if (r0 == 0) goto L_0x0029
            r4 = 4
        L_0x0029:
            r4 = r4 | r2
        L_0x002a:
            r0 = r2 & 48
            if (r0 != 0) goto L_0x0039
            boolean r2 = r3.AGs(r6)
            r0 = 16
            if (r2 == 0) goto L_0x0038
            r0 = 32
        L_0x0038:
            r4 = r4 | r0
        L_0x0039:
            r2 = r4 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r2 != r0) goto L_0x0045
            boolean r0 = r3.Bwn()
            if (r0 != 0) goto L_0x0142
        L_0x0045:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0053
            r2 = 889761798(0x3508b006, float:5.0920096E-7)
            java.lang.String r0 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
            X.0fL.A01(r2, r0)
        L_0x0053:
            java.lang.Object r0 = r1.A01
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r10 = r0.get(r6)
            r9 = r4 & 14
            X.JOY r10 = (X.JOY) r10
            r0 = 1093045418(0x41268caa, float:10.409342)
            r3.ExS(r0)
            java.lang.Object r8 = r1.A05
            X.0sL r8 = (X.0sL) r8
            java.lang.Object r7 = r1.A04
            X.JOX r7 = (X.JOX) r7
            java.lang.Object r6 = r1.A06
            X.JOX r6 = (X.JOX) r6
            java.lang.Object r5 = r1.A07
            X.JOX r5 = (X.JOX) r5
            java.lang.Object r4 = r1.A08
            X.0sL r4 = (X.0sL) r4
            java.lang.Object r2 = r1.A02
            X.0sP r2 = (X.0sP) r2
            java.lang.Object r1 = r1.A03
            com.instagram.settings2.core.viewmodel.SettingsScreenViewModel r1 = (com.instagram.settings2.core.viewmodel.SettingsScreenViewModel) r1
            int r0 = r9 >> 3
            r18 = r0 & 14
            r11 = r6
            r12 = r5
            r13 = r10
            r14 = r1
            r15 = r2
            r16 = r8
            r17 = r4
            r9 = r3
            r10 = r7
            X.C52744Gbw.A02(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            X.5Wx r3 = (X.C286565Wx) r3
            r0 = 0
            X.C286565Wx.A0L(r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00a5
            r0 = -678639415(0xffffffffd78cc8c9, float:-3.09587987E14)
        L_0x00a2:
            X.0fL.A00(r0)
        L_0x00a5:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00a8:
            r4 = r2
            goto L_0x002a
        L_0x00aa:
            java.lang.Number r9 = (java.lang.Number) r9
            int r6 = r9.intValue()
            X.5Wy r3 = (X.C286575Wy) r3
            java.lang.Number r5 = (java.lang.Number) r5
            int r2 = r5.intValue()
            r0 = r2 & 6
            if (r0 != 0) goto L_0x0140
            boolean r0 = r3.AGu(r13)
            r4 = 2
            if (r0 == 0) goto L_0x00c4
            r4 = 4
        L_0x00c4:
            r4 = r4 | r2
        L_0x00c5:
            r0 = r2 & 48
            if (r0 != 0) goto L_0x00d4
            boolean r2 = r3.AGs(r6)
            r0 = 16
            if (r2 == 0) goto L_0x00d3
            r0 = 32
        L_0x00d3:
            r4 = r4 | r0
        L_0x00d4:
            r2 = r4 & 147(0x93, float:2.06E-43)
            r0 = 146(0x92, float:2.05E-43)
            if (r2 != r0) goto L_0x00e0
            boolean r0 = r3.Bwn()
            if (r0 != 0) goto L_0x0142
        L_0x00e0:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00ee
            r2 = 1776736934(0x69e6daa6, float:3.4885685E25)
            java.lang.String r0 = "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)"
            X.0fL.A01(r2, r0)
        L_0x00ee:
            java.lang.Object r0 = r1.A02
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r10 = r0.get(r6)
            r9 = r4 & 14
            X.JPS r10 = (X.JPS) r10
            r0 = 1256426820(0x4ae38d44, float:7456418.0)
            r3.ExS(r0)
            java.lang.Object r8 = r1.A01
            X.F3p r8 = (X.C49725F3p) r8
            java.lang.Object r7 = r1.A05
            X.0sa r7 = (X.C62320sa) r7
            java.lang.Object r6 = r1.A08
            X.F2T r6 = (X.F2T) r6
            java.lang.Object r5 = r1.A04
            X.0sL r5 = (X.0sL) r5
            java.lang.Object r4 = r1.A06
            X.0sa r4 = (X.C62320sa) r4
            java.lang.Object r2 = r1.A03
            X.0sa r2 = (X.C62320sa) r2
            java.lang.Object r1 = r1.A07
            X.2qi r1 = (X.C231002qi) r1
            int r0 = r9 >> 3
            r16 = r0 & 14
            r0 = 4096(0x1000, float:5.74E-42)
            r16 = r16 | r0
            r9 = r10
            r10 = r6
            r11 = r1
            r12 = r7
            r13 = r4
            r14 = r2
            r15 = r5
            r7 = r3
            X.I7A.A05(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.5Wx r3 = (X.C286565Wx) r3
            r0 = 0
            X.C286565Wx.A0L(r3, r0)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x00a5
            r0 = 1263189785(0x4b4abf19, float:1.3287193E7)
            goto L_0x00a2
        L_0x0140:
            r4 = r2
            goto L_0x00c5
        L_0x0142:
            r3.Evl()
            goto L_0x00a5
        L_0x0147:
            X.Nj3 r13 = (X.C69302Nj3) r13
            X.Niv r3 = (X.C69295Niv) r3
            X.Niv r5 = (X.C69295Niv) r5
            r4 = 0
            X.0qQ.A0B(r13, r4)
            r2 = 1
            r12 = 2
            X.0qQ.A0B(r9, r2)
            r11 = 3
            X.0qQ.A0B(r3, r12)
            r20 = 4
            X.0qQ.A0B(r5, r11)
            java.lang.Object r6 = r1.A08
            X.MoE r6 = (X.C67459MoE) r6
            boolean r7 = r6.A00
            java.lang.String r0 = "EncryptedBackupsInboxLauncher"
            if (r7 != 0) goto L_0x0170
            java.lang.String r1 = "maybeShowNux not showing nux because inbox not visible"
            X.0KC.A0D(r0, r1)
            goto L_0x00a5
        L_0x0170:
            java.lang.Object r7 = r1.A02
            X.3HH r7 = (X.AnonymousClass3HH) r7
            X.0xa r7 = r7.A00
            r21 = r7
            java.lang.String r10 = "EB_FORCE_RESTORE"
            boolean r19 = r7.getBoolean(r10, r4)
            X.Nj3 r7 = X.C69302Nj3.DeviceNotOnboarded
            if (r13 != r7) goto L_0x0185
            r8 = 1
            if (r19 != 0) goto L_0x0186
        L_0x0185:
            r8 = 0
        L_0x0186:
            X.Niu r7 = X.C69294Niu.OptedOut
            if (r9 != r7) goto L_0x01fe
            if (r8 != 0) goto L_0x01fe
            X.MoD r2 = r6.A02
            long r2 = r2.A05()
            double r11 = (double) r2
            X.MoF r2 = r6.A03
            boolean r2 = r2.A00()
            if (r2 == 0) goto L_0x01b2
            X.0eM r2 = r6.A04
            java.lang.Object r7 = r2.getValue()
            X.ONk r7 = (X.C70838ONk) r7
            java.lang.Object r8 = r1.A03
            androidx.fragment.app.Fragment r8 = (androidx.fragment.app.Fragment) r8
            java.lang.Object r9 = r1.A05
            X.Pso r9 = (X.C74312Pso) r9
            java.lang.Object r10 = r1.A04
            java.lang.Integer r10 = (java.lang.Integer) r10
            r7.A02(r8, r9, r10, r11)
        L_0x01b2:
            X.0eM r3 = r6.A07
            java.lang.Object r2 = r3.getValue()
            X.ONh r2 = (X.C70835ONh) r2
            boolean r2 = r2.A02()
            if (r2 == 0) goto L_0x01d1
            java.lang.Object r2 = r3.getValue()
            X.ONh r2 = (X.C70835ONh) r2
            X.NUT r4 = r2.A02
            boolean r3 = r2.A02()
            java.lang.String r2 = "TRIGGER_MESSAGE_EXPIRATION_ELIGIBILITY"
            r4.A0E(r2, r3)
        L_0x01d1:
            java.lang.String r3 = "maybeShowNux not showing nux because user opted out"
            X.0KC.A0D(r0, r3)
            java.lang.Object r2 = r1.A07
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r0 = r1.A03
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            if (r0 == 0) goto L_0x01fc
            android.app.Application r0 = r0.getApplication()
        L_0x01e8:
            X.C69902Nu4.A00(r2, r0, r3)
            X.0eM r0 = r6.A06
            java.lang.Object r2 = r0.getValue()
            X.NUX r2 = (X.NUX) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r0 = "OPT_OUT"
        L_0x01f7:
            r2.A0H(r0, r1)
            goto L_0x00a5
        L_0x01fc:
            r0 = 0
            goto L_0x01e8
        L_0x01fe:
            java.lang.Object r8 = r1.A06
            X.OyT r8 = (X.C72203OyT) r8
            boolean r7 = r8.A02
            if (r7 == 0) goto L_0x0218
            java.lang.String r1 = "Pin api still running, not showing nux"
            X.0KC.A0D(r0, r1)
            X.0eM r0 = r6.A06
            java.lang.Object r2 = r0.getValue()
            X.NUX r2 = (X.NUX) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            java.lang.String r0 = "PIN_IS_RUNNING"
            goto L_0x01f7
        L_0x0218:
            java.lang.Object r0 = r1.A03
            r18 = r0
            r0 = r18
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r18 = r0
            androidx.fragment.app.FragmentActivity r17 = r18.getActivity()
            if (r17 == 0) goto L_0x00a5
            java.lang.Object r14 = r1.A07
            com.instagram.common.session.UserSession r14 = (com.instagram.common.session.UserSession) r14
            java.lang.Object r15 = r1.A01
            X.65E r15 = (X.AnonymousClass65E) r15
            java.lang.Object r7 = r1.A05
            X.Pso r7 = (X.C74312Pso) r7
            java.lang.Object r9 = r1.A04
            java.lang.Integer r9 = (java.lang.Integer) r9
            X.0qQ.A0B(r14, r4)
            java.lang.Class<X.Oy5> r16 = X.Oy5.class
            r0 = 15
            X.MYO r1 = new X.MYO
            r1.<init>(r14, r0)
            r0 = r16
            java.lang.Object r1 = r14.A01(r0, r1)
            X.Oy5 r1 = (X.Oy5) r1
            int r13 = r13.ordinal()
            if (r13 == r12) goto L_0x04db
            if (r13 == r11) goto L_0x0280
            r0 = r20
            if (r13 != r0) goto L_0x00a5
            X.0eM r10 = r1.A05
            java.lang.Object r0 = r10.getValue()
            X.3HH r0 = (X.AnonymousClass3HH) r0
            X.0xa r0 = r0.A00
            java.lang.String r8 = "EB_TABLE_DROPPED"
            boolean r0 = r0.getBoolean(r8, r4)
            if (r0 != 0) goto L_0x04b6
            X.0eM r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            X.ONk r0 = (X.C70838ONk) r0
            r10 = r0
            r11 = r18
            r12 = r7
            r13 = r3
            r14 = r5
            r15 = r9
            r16 = r2
            r10.A00(r11, r12, r13, r14, r15, r16)
            goto L_0x00a5
        L_0x0280:
            if (r19 == 0) goto L_0x028b
            android.app.Application r7 = r17.getApplication()
            java.lang.String r0 = "Force show restore"
            X.C69902Nu4.A00(r14, r7, r0)
        L_0x028b:
            X.0xY r0 = r21.AR4()
            r0.E5T(r10, r4)
            r0.apply()
            X.0eM r10 = r1.A05
            java.lang.Object r0 = r10.getValue()
            X.3HH r0 = (X.AnonymousClass3HH) r0
            X.0xa r0 = r0.A00
            java.lang.String r8 = "EB_TABLE_DROPPED"
            boolean r0 = r0.getBoolean(r8, r4)
            if (r0 != 0) goto L_0x04b6
            X.0eM r0 = r6.A08
            java.lang.Object r6 = r0.getValue()
            X.OTr r6 = (X.C70970OTr) r6
            androidx.fragment.app.FragmentActivity r8 = r18.getActivity()
            android.content.Context r7 = r18.getContext()
            X.0qQ.A0B(r9, r2)
            X.0eM r11 = r6.A0A
            java.lang.Object r0 = r11.getValue()
            X.65E r0 = (X.AnonymousClass65E) r0
            com.instagram.common.session.UserSession r10 = r0.A00
            r0 = 2342158959159283444(0x2081052a00300ef4, double:4.0621517776537455E-152)
            boolean r0 = X.AnonymousClass65A.A02(r10, r0)
            java.lang.String r10 = "EncryptedBackupsRestoreNuxManager"
            if (r0 != 0) goto L_0x02d8
            java.lang.String r0 = "not handling restore, restore gating disabled"
        L_0x02d3:
            X.0KC.A0D(r10, r0)
            goto L_0x00a5
        L_0x02d8:
            r12 = 0
            if (r8 == 0) goto L_0x0401
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0401
            java.lang.Object r0 = r11.getValue()
            X.65E r0 = (X.AnonymousClass65E) r0
            com.instagram.common.session.UserSession r12 = r0.A00
            r0 = 36315949950242602(0x81052a00770f2a, double:3.029691208901871E-306)
            boolean r0 = X.AnonymousClass65A.A02(r12, r0)
            if (r0 == 0) goto L_0x0454
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r9 != r0) goto L_0x00a5
            X.MoD r12 = r6.A06
            X.0xa r9 = r12.A00
            java.lang.String r1 = "EB_OVERRIDE_FIRST_RESTORE_ATTEMPT_DAYS"
            boolean r0 = r9.contains(r1)
            if (r0 == 0) goto L_0x03f7
            int r0 = r9.getInt(r1, r4)
            long r15 = java.lang.System.currentTimeMillis()
            long r0 = (long) r0
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r10
            long r15 = r15 - r0
        L_0x0310:
            X.0eM r12 = r12.A02
            java.lang.Object r0 = r12.getValue()
            X.65E r0 = (X.AnonymousClass65E) r0
            com.instagram.common.session.UserSession r10 = r0.A00
            r0 = 36315949944999660(0x81052a00270eec, double:3.0296912055862134E-306)
            boolean r10 = X.AnonymousClass65A.A02(r10, r0)
            if (r10 == 0) goto L_0x0377
            java.lang.String r11 = "EB_FORCE_SHOW_RESTORE_TOAST"
            boolean r10 = r9.getBoolean(r11, r4)
            if (r10 == 0) goto L_0x0377
            java.lang.Object r10 = r12.getValue()
            X.65E r10 = (X.AnonymousClass65E) r10
            com.instagram.common.session.UserSession r10 = r10.A00
            boolean r0 = X.AnonymousClass65A.A02(r10, r0)
            if (r0 == 0) goto L_0x0345
            X.0xY r0 = r9.AR4()
            r0.E5T(r11, r4)
            r0.apply()
        L_0x0345:
            com.instagram.common.session.UserSession r9 = r6.A01
            android.app.Application r1 = r8.getApplication()
            java.lang.String r0 = "force show restore toast"
            X.C69902Nu4.A00(r9, r1, r0)
            r10 = 0
        L_0x0351:
            X.Niv r0 = X.C69295Niv.DoesNotExist
            if (r3 != r0) goto L_0x0410
            if (r5 != r0) goto L_0x0410
            X.0eM r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            X.OyT r1 = (X.C72203OyT) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A1I
            X.0qQ.A0B(r0, r4)
            X.C72203OyT.A03(r1, r0)
            X.05G r0 = r1.A0O
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0410
            goto L_0x00a5
        L_0x0377:
            r10 = 0
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x04b1
            long r13 = java.lang.System.currentTimeMillis()
            long r13 = r13 - r15
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r13 / r0
            X.OTs r0 = r6.A05
            java.util.List r0 = r0.A06
            java.util.List r0 = X.00k.A0Y(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x0392:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r12.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r10 = r0.intValue()
            long r0 = (long) r10
            int r11 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x0392
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            if (r1 == 0) goto L_0x00a5
            java.lang.String r11 = "EB_RESTORE_INTERVALS_EXHAUSTED"
            r12 = 0
            java.lang.String r0 = r9.getString(r11, r12)
            if (r0 == 0) goto L_0x03f4
            java.util.Set r0 = X.C67458MoD.A02(r0)
        L_0x03ba:
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00a5
            com.instagram.common.session.UserSession r14 = r6.A01
            android.app.Application r13 = r8.getApplication()
            java.lang.String r0 = "show restore toast for interval "
            java.lang.String r0 = X.002.A0O(r0, r10)
            X.C69902Nu4.A00(r14, r13, r0)
            java.lang.String r0 = r9.getString(r11, r12)
            if (r0 == 0) goto L_0x03f1
            java.util.Set r0 = X.C67458MoD.A02(r0)
        L_0x03d9:
            java.util.LinkedHashSet r13 = X.094.A01(r1, r0)
            X.0xY r9 = r9.AR4()
            java.lang.String r1 = ","
            java.lang.String r0 = ""
            java.lang.String r0 = X.00k.A0P(r1, r0, r0, r13, r12)
            r9.E5g(r11, r0)
            r9.apply()
            goto L_0x0351
        L_0x03f1:
            X.0sl r0 = X.0sl.A00
            goto L_0x03d9
        L_0x03f4:
            X.0sl r0 = X.0sl.A00
            goto L_0x03ba
        L_0x03f7:
            r0 = 0
            java.lang.String r10 = "EB_FIRST_RESTORE_ATTEMPT_TIMESTAMP_MS"
            long r15 = r9.getLong(r10, r0)
            goto L_0x0310
        L_0x0401:
            java.lang.String r2 = "not handling restore, activity is null? "
            if (r8 != 0) goto L_0x0406
            r12 = 1
        L_0x0406:
            java.lang.String r1 = ", isSeamlessRestoreRunning? "
            boolean r0 = r6.A00
            java.lang.String r0 = X.002.A1C(r2, r1, r12, r0)
            goto L_0x02d3
        L_0x0410:
            r5 = 0
            if (r7 == 0) goto L_0x0452
            r0 = 2131972298(0x7f1350ca, float:1.95816E38)
            java.lang.String r3 = r7.getString(r0)
        L_0x041a:
            X.6ap r1 = new X.6ap
            r1.<init>()
            r1.A05()
            java.lang.String r0 = "eb_restore_missing_messages_sync"
            r1.A0H = r0
            r0 = 8000(0x1f40, float:1.121E-41)
            r1.A01 = r0
            if (r7 == 0) goto L_0x0433
            r0 = 2131972297(0x7f1350c9, float:1.9581598E38)
            java.lang.String r5 = r7.getString(r0)
        L_0x0433:
            r1.A0D = r5
            if (r3 == 0) goto L_0x0442
            r1.A0G = r3
            r1.A0L = r2
            X.IVT r0 = new X.IVT
            r0.<init>(r10, r4, r8, r6)
            r1.A0A = r0
        L_0x0442:
            X.1xC r2 = X.1xC.A01
            X.Dc2 r1 = r1.A00()
            X.3GP r0 = new X.3GP
            r0.<init>(r1)
            r2.A00(r0)
            goto L_0x00a5
        L_0x0452:
            r3 = r5
            goto L_0x041a
        L_0x0454:
            com.instagram.common.session.UserSession r5 = r6.A01
            java.lang.Object r0 = r11.getValue()
            X.65E r0 = (X.AnonymousClass65E) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            r0 = 2342158959159283444(0x2081052a00300ef4, double:4.0621517776537455E-152)
            boolean r3 = X.AnonymousClass65A.A02(r2, r0)
            X.1Av r0 = X.1Au.A00(r5)
            X.0xa r1 = r0.A01
            r0 = 3058(0xbf2, float:4.285E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r2 = r1.getInt(r0, r4)
            java.lang.Object r0 = r11.getValue()
            X.65E r0 = (X.AnonymousClass65E) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            r0 = 36597424921578285(0x82052a00250b2d, double:3.2076971141832926E-306)
            long r0 = X.AnonymousClass65A.A00(r5, r0)
            int r5 = (int) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "canShowRestoreNux restoreEnabled "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", restoreVisibilityCountSeen "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", restoreVisibilityCount "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            X.0KC.A0D(r10, r0)
            if (r3 == 0) goto L_0x00a5
            if (r2 >= r5) goto L_0x00a5
        L_0x04b1:
            X.C70970OTr.A00(r8, r6, r4)
            goto L_0x00a5
        L_0x04b6:
            X.0eM r0 = r6.A08
            java.lang.Object r1 = r0.getValue()
            X.OTr r1 = (X.C70970OTr) r1
            androidx.fragment.app.FragmentActivity r0 = r18.getActivity()
            if (r0 == 0) goto L_0x04c7
            X.C70970OTr.A00(r0, r1, r2)
        L_0x04c7:
            java.lang.Object r0 = r10.getValue()
            X.3HH r0 = (X.AnonymousClass3HH) r0
            X.0xa r0 = r0.A00
            X.0xY r0 = r0.AR4()
            r0.E5T(r8, r4)
            r0.commit()
            goto L_0x00a5
        L_0x04db:
            com.instagram.common.session.UserSession r10 = r15.A00
            r0 = 36315949950963509(0x81052a00820f35, double:3.0296912093577756E-306)
            boolean r0 = X.AnonymousClass65A.A02(r10, r0)
            if (r0 == 0) goto L_0x050a
            X.O6E r0 = new X.O6E
            r0.<init>(r14)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "eb_primary_device_onboarding_impression"
            boolean r0 = r1.getBoolean(r0, r4)
            if (r0 == 0) goto L_0x0520
            X.0eM r0 = r6.A06
            java.lang.Object r4 = r0.getValue()
            X.Mex r4 = (X.C66913Mex) r4
            java.lang.String r1 = "V3_PRIMARY_DEVICE_API_CACHED"
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x050a
            r4.A0B(r1)
        L_0x050a:
            X.0eM r0 = r6.A04
            java.lang.Object r0 = r0.getValue()
            X.ONk r0 = (X.C70838ONk) r0
            r10 = r0
            r11 = r18
            r12 = r7
            r13 = r3
            r14 = r5
            r15 = r9
            r16 = r2
            r10.A01(r11, r12, r13, r14, r15, r16)
            goto L_0x00a5
        L_0x0520:
            java.lang.Integer r10 = X.O4G.A00
            r12 = 9
            X.Ixk r11 = new X.Ixk
            r13 = r18
            r14 = r6
            r15 = r3
            r16 = r7
            r17 = r9
            r18 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.0qQ.A0B(r10, r4)
            java.lang.Boolean r0 = r8.A00
            if (r0 == 0) goto L_0x0560
            X.0eM r0 = r8.A0D
            java.lang.Object r2 = r0.getValue()
            X.Mex r2 = (X.C66913Mex) r2
            java.lang.String r1 = "V3_IS_PRIMARY_DEVICE_FLAG_CACHED"
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x054d
            r2.A0B(r1)
        L_0x054d:
            java.lang.Boolean r0 = r8.A00
            if (r0 == 0) goto L_0x055e
            boolean r0 = r0.booleanValue()
        L_0x0555:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r11.invoke(r0)
            goto L_0x00a5
        L_0x055e:
            r0 = 1
            goto L_0x0555
        L_0x0560:
            X.OUY r1 = X.OUY.A00
            com.instagram.common.session.UserSession r0 = r8.A08
            java.util.concurrent.CompletableFuture r4 = r1.A00(r0)
            X.PqU r3 = new X.PqU
            r3.<init>((int) r2, (java.lang.Object) r11, (java.lang.Object) r10, (java.lang.Object) r8)
            r1 = 13
            X.Pcu r0 = new X.Pcu
            r0.<init>((int) r1, (X.0sP) r3)
            r4.thenAccept(r0)
            goto L_0x00a5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67609Mqh.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
