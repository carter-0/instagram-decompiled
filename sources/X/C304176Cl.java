package X;

import com.instagram.api.schemas.LineType;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Cl  reason: invalid class name and case insensitive filesystem */
public final class C304176Cl extends 0Yg implements 0sK {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LineType A01;
    public final /* synthetic */ C299665vd A02;
    public final /* synthetic */ C299575vQ A03;
    public final /* synthetic */ C299635va A04;
    public final /* synthetic */ C303846Ba A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ C62320sa A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C304176Cl(LineType lineType, C299665vd r3, C299575vQ r4, C299635va r5, C303846Ba r6, UserSession userSession, String str, String str2, String str3, C62320sa r11, long j, boolean z) {
        super(3);
        this.A03 = r4;
        this.A0A = r11;
        this.A06 = userSession;
        this.A01 = lineType;
        this.A0B = z;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A09 = str;
        this.A00 = j;
        this.A07 = str2;
        this.A08 = str3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.9Mo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: X.9Mo} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c0, code lost:
        if (((X.C55601HkL) r3.A01(X.C55601HkL.class, new X.C58707IwG((java.lang.Object) r3, 25))).A00.getBoolean("has_seen_permalink_education", false) == false) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0121, code lost:
        if (r3 == X.AnonymousClass5XT.A00) goto L_0x0123;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0221  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r48, java.lang.Object r49, java.lang.Object r50) {
        /*
            r47 = this;
            r0 = r50
            r10 = r49
            X.5Wy r10 = (X.C286575Wy) r10
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r9 = 0
            r1 = r48
            X.0qQ.A0B(r1, r9)
            r1 = r0 & 17
            r0 = 16
            if (r1 != r0) goto L_0x0024
            boolean r0 = r10.Bwn()
            if (r0 == 0) goto L_0x0024
            r10.Evl()
        L_0x0021:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0024:
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0032
            r1 = -557480292(0xffffffffdec5869c, float:-7.1166176E18)
            java.lang.String r0 = "com.instagram.barcelona.feed.post.ui.FeedPostRow.<anonymous> (FeedPostRow.kt:268)"
            X.0fL.A01(r1, r0)
        L_0x0032:
            r11 = r47
            X.5vQ r13 = r11.A03
            r1 = r13
            X.5vS r1 = (X.C299595vS) r1
            java.lang.String r0 = r1.A07
            r22 = r0
            X.5vJ r0 = r13.Be5()
            X.5vH r0 = r0.A01
            int r2 = r0.ordinal()
            if (r2 == r9) goto L_0x022f
            r0 = 1
            if (r2 != r0) goto L_0x0243
            X.5vJ r0 = r1.A04
            boolean r0 = r0.A0B
            if (r0 != 0) goto L_0x022f
            X.9IC r0 = r1.A02
            boolean r2 = r0.A01
            r5 = 1094713344(0x41400000, float:12.0)
            r0 = 8
            if (r2 == 0) goto L_0x005d
            r0 = 0
        L_0x005d:
            float r4 = (float) r0
            r3 = 1084227584(0x40a00000, float:5.0)
            r2 = 1105199104(0x41e00000, float:28.0)
            X.6Fj r0 = new X.6Fj
            r0.<init>(r5, r3, r2, r4)
        L_0x0067:
            X.6Cm r8 = new X.6Cm
            r8.<init>(r0)
            boolean r0 = r1.A0A
            r37 = r0
            int r0 = r1.A01
            r30 = r0
            X.5vk r0 = r1.A06
            r46 = r0
            X.4oN r0 = r1.A03
            r45 = r0
            X.5vR r0 = r1.A05
            r44 = r0
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x0221
            r0 = -1660937296(0xffffffff9d001bb0, float:-1.6954973E-21)
            r10.ExS(r0)
            X.5ZE r0 = X.AnonymousClass5aQ.A01(r10)
            X.5Z4 r15 = r0.A02
        L_0x0090:
            r7 = r10
            X.5Wx r7 = (X.C286565Wx) r7
            X.C286565Wx.A0L(r7, r9)
            boolean r0 = r1.A0B
            r38 = r0
            X.0sa r6 = r11.A0A
            if (r6 == 0) goto L_0x00c2
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x00c2
            com.instagram.common.session.UserSession r3 = r11.A06
            X.0qQ.A0B(r3, r9)
            r0 = 25
            X.IwG r2 = new X.IwG
            r2.<init>((java.lang.Object) r3, (int) r0)
            java.lang.Class<X.HkL> r0 = X.C55601HkL.class
            java.lang.Object r0 = r3.A01(r0, r2)
            X.HkL r0 = (X.C55601HkL) r0
            X.0xa r2 = r0.A00
            java.lang.String r0 = "has_seen_permalink_education"
            boolean r0 = r2.getBoolean(r0, r9)
            r39 = 1
            if (r0 == 0) goto L_0x00c4
        L_0x00c2:
            r39 = 0
        L_0x00c4:
            boolean r0 = r1.A08
            r40 = r0
            com.instagram.api.schemas.LineType r0 = r11.A01
            r43 = r0
            boolean r0 = r11.A0B
            r36 = r0
            X.6Ba r0 = r11.A05
            r42 = r0
            r0 = -1660968869(0xffffffff9cffa05b, float:-1.6915935E-21)
            r10.ExS(r0)
            X.5vd r12 = r11.A02
            boolean r1 = r10.AGu(r12)
            boolean r0 = r10.AGu(r13)
            r1 = r1 | r0
            java.lang.Object r5 = r10.ECw()
            if (r1 != 0) goto L_0x00ef
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r5 != r0) goto L_0x00f8
        L_0x00ef:
            r0 = 1
            X.9M2 r5 = new X.9M2
            r5.<init>(r0, r13, r12)
            r10.FLL(r5)
        L_0x00f8:
            X.0sK r5 = (X.0sK) r5
            X.C286565Wx.A0L(r7, r9)
            r0 = -1660963139(0xffffffff9cffb6bd, float:-1.6921721E-21)
            r10.ExS(r0)
            X.5va r4 = r11.A04
            boolean r16 = r10.AGu(r4)
            java.lang.String r14 = r11.A09
            boolean r0 = r10.AGu(r14)
            r16 = r16 | r0
            long r0 = r11.A00
            boolean r2 = r10.AGt(r0)
            r16 = r16 | r2
            java.lang.Object r3 = r10.ECw()
            if (r16 != 0) goto L_0x0123
            java.lang.Object r2 = X.AnonymousClass5XT.A00
            if (r3 != r2) goto L_0x0135
        L_0x0123:
            X.9Mo r3 = new X.9Mo
            r16 = r3
            r17 = r4
            r18 = r14
            r19 = r9
            r20 = r0
            r16.<init>(r17, r18, r19, r20)
            r10.FLL(r3)
        L_0x0135:
            X.0sP r3 = (X.0sP) r3
            X.C286565Wx.A0L(r7, r9)
            r0 = -1660953406(0xffffffff9cffdcc2, float:-1.6931549E-21)
            r10.ExS(r0)
            boolean r1 = r10.AGu(r12)
            java.lang.String r14 = r11.A07
            boolean r0 = r10.AGu(r14)
            r1 = r1 | r0
            java.lang.Object r2 = r10.ECw()
            if (r1 != 0) goto L_0x0155
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r2 != r0) goto L_0x015d
        L_0x0155:
            X.9Ml r2 = new X.9Ml
            r2.<init>(r14, r12, r9)
            r10.FLL(r2)
        L_0x015d:
            X.0sL r2 = (X.0sL) r2
            X.C286565Wx.A0L(r7, r9)
            r0 = -1660976263(0xffffffff9cff8379, float:-1.6908469E-21)
            r10.ExS(r0)
            boolean r16 = r10.AGu(r12)
            boolean r0 = r10.AGu(r14)
            r16 = r16 | r0
            boolean r0 = r10.AGu(r13)
            r16 = r16 | r0
            java.lang.Object r1 = r10.ECw()
            if (r16 != 0) goto L_0x0182
            java.lang.Object r0 = X.AnonymousClass5XT.A00
            if (r1 != r0) goto L_0x018b
        L_0x0182:
            r0 = 1
            X.9Mt r1 = new X.9Mt
            r1.<init>(r13, r12, r14, r0)
            r10.FLL(r1)
        L_0x018b:
            X.0sP r1 = (X.0sP) r1
            X.C286565Wx.A0L(r7, r9)
            r0 = -1660946542(0xffffffff9cfff792, float:-1.693848E-21)
            r10.ExS(r0)
            boolean r12 = r10.AGu(r4)
            boolean r0 = r10.AGu(r14)
            r12 = r12 | r0
            java.lang.String r13 = r11.A08
            boolean r0 = r10.AGu(r13)
            r12 = r12 | r0
            java.lang.Object r0 = r10.ECw()
            if (r12 != 0) goto L_0x01b0
            java.lang.Object r12 = X.AnonymousClass5XT.A00
            if (r0 != r12) goto L_0x01b8
        L_0x01b0:
            X.9N4 r0 = new X.9N4
            r0.<init>((java.lang.Object) r4, (java.lang.String) r14, (java.lang.String) r13, (int) r9)
            r10.FLL(r0)
        L_0x01b8:
            X.0sa r0 = (X.C62320sa) r0
            X.C286565Wx.A0L(r7, r9)
            r13 = 0
            r4 = -1660921794(0xffffffff9d00583e, float:-1.698628E-21)
            r10.ExS(r4)
            com.instagram.common.session.UserSession r12 = r11.A06
            boolean r11 = r10.AGw(r12)
            java.lang.Object r4 = r10.ECw()
            if (r11 != 0) goto L_0x01d4
            java.lang.Object r11 = X.AnonymousClass5XT.A00
            if (r4 != r11) goto L_0x01de
        L_0x01d4:
            r11 = 38
            X.9Kw r4 = new X.9Kw
            r4.<init>(r12, r11)
            r10.FLL(r4)
        L_0x01de:
            X.0sP r4 = (X.0sP) r4
            X.C286565Wx.A0L(r7, r9)
            r35 = 17049600(0x1042800, float:2.427327E-38)
            r21 = r22
            r22 = r0
            r23 = r6
            r24 = r3
            r25 = r1
            r26 = r13
            r27 = r4
            r28 = r2
            r29 = r5
            r31 = r9
            r32 = r9
            r33 = r9
            r34 = r9
            r41 = r9
            r12 = r10
            r14 = r15
            r15 = r43
            r16 = r45
            r17 = r44
            r18 = r8
            r19 = r42
            r20 = r46
            X.C304196Cn.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            boolean r0 = X.0fL.A02()
            if (r0 == 0) goto L_0x0021
            r0 = 334700659(0x13f32073, float:6.137382E-27)
            X.0fL.A00(r0)
            goto L_0x0021
        L_0x0221:
            r0 = -1660936336(0xffffffff9d001f70, float:-1.6956912E-21)
            r10.ExS(r0)
            X.5ZE r0 = X.AnonymousClass5aQ.A01(r10)
            X.5Z4 r15 = r0.A00
            goto L_0x0090
        L_0x022f:
            X.9IC r0 = r1.A02
            boolean r2 = r0.A01
            r4 = 1094713344(0x41400000, float:12.0)
            r0 = 8
            if (r2 == 0) goto L_0x023a
            r0 = 0
        L_0x023a:
            float r3 = (float) r0
            r2 = 0
            X.6Fj r0 = new X.6Fj
            r0.<init>(r4, r2, r4, r3)
            goto L_0x0067
        L_0x0243:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304176Cl.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
