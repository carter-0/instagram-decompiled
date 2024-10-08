package X;

import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Llb  reason: case insensitive filesystem */
public final class C64998Llb implements C352898Fm {
    public final AnonymousClass82X A00;
    public final AnonymousClass80U A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    public C64998Llb(AnonymousClass4DH r19, UserSession userSession, A96 a96, C313666go r22) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        AnonymousClass4DH r6 = r19;
        C20704Wxb wxb = new C20704Wxb(37, r22, userSession2, r6);
        C66292MMb A012 = C66292MMb.A01(r6, 36);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = C66292MMb.A00(A012, r4, 40);
        this.A08 = DbS.A0I(C66292MMb.A01(A002, 41), wxb, new C20614Wvv(44, (Object) null, A002), DbS.A0z(C60216JhZ.class));
        C20614Wvv wvv = new C20614Wvv(38, r6, userSession2);
        AnonymousClass0eM A003 = C66292MMb.A00(C66292MMb.A01(r6, 42), r4, 43);
        this.A02 = DbS.A0I(C66292MMb.A01(A003, 44), wvv, new C20614Wvv(45, (Object) null, A003), DbS.A0z(C357638Yz.class));
        C20614Wvv wvv2 = new C20614Wvv(39, r6, userSession2);
        AnonymousClass0eM A004 = C66292MMb.A00(C66292MMb.A01(r6, 30), r4, 31);
        this.A04 = DbS.A0I(C66292MMb.A01(A004, 32), wvv2, new C20614Wvv(40, (Object) null, A004), DbS.A0z(C3495780x.class));
        AnonymousClass0eM A005 = C66292MMb.A00(C66292MMb.A01(r6, 33), r4, 34);
        0Yh A0z = DbS.A0z(AnonymousClass848.class);
        this.A06 = DbS.A0I(C66292MMb.A01(A005, 35), new C20614Wvv(42, A005, r6), new C20614Wvv(41, (Object) null, A005), A0z);
        C20704Wxb wxb2 = new C20704Wxb(36, this, userSession2, r6);
        AnonymousClass0eM A006 = C66292MMb.A00(C66292MMb.A01(r6, 37), r4, 38);
        this.A07 = DbS.A0I(C66292MMb.A01(A006, 39), wxb2, new C20614Wvv(43, (Object) null, A006), DbS.A0z(C3504884v.class));
        A96 a962 = a96;
        this.A00 = a962.A01;
        AnonymousClass80T r11 = new AnonymousClass80T();
        AnonymousClass80V r9 = AnonymousClass80V.HIDDEN;
        Class<C63147KsG> cls = C63147KsG.class;
        AnonymousClass80V r5 = AnonymousClass80V.CAPTURE;
        r11.A7x(r9, r5, cls);
        AnonymousClass80V r1 = AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY;
        r11.A7x(r1, r5, cls);
        Class<C63148KsH> cls2 = C63148KsH.class;
        r11.A7x(r9, r1, cls2);
        r11.A7x(r5, r1, cls2);
        Class<C63149KsI> cls3 = C63149KsI.class;
        r11.A7x(r1, r9, cls3);
        r11.A7x(r5, r9, cls3);
        this.A01 = r11;
        this.A05 = AnonymousClass0eN.A01(new C20704Wxb(35, this, userSession2, r6));
        this.A03 = AnonymousClass0eN.A01(new C20704Wxb(34, this, userSession2, r6));
        ((C357638Yz) this.A02.getValue()).A0D(28D.A4U, AnonymousClass80L.A00);
        A00(this);
        07U r92 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r6.getViewLifecycleOwner();
        AnonymousClass0xx A007 = AnonymousClass07a.A00(viewLifecycleOwner);
        MHL mhl = new MHL(viewLifecycleOwner, r92, r6, this, (AnonymousClass4D7) null, 37);
        19B r12 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(r6, r12, mhl, A007);
        1Eo.A05(r12, new C59845JaL(A0I, r92, this, (AnonymousClass4D7) null, 38), AnonymousClass07a.A00(A0I));
        if (a962.A00()) {
            A01();
        }
        ((AnonymousClass8DD) this.A05.getValue()).A0G(a962.A04);
    }

    public final void D8c(AnonymousClass87G r14, Map map) {
        C60216JhZ jhZ = (C60216JhZ) this.A08.getValue();
        CameraAREffect A002 = r14.A00();
        if (A002 != null) {
            27r r1 = jhZ.A01;
            String str = A002.A0K;
            r1.A13(C279294yP.LIVE, C59725JVj.LIVE, str, (String) null, A002.A0B, map, (Map) null, 1, 2, A002.CbC(), false);
        }
    }

    public final void D8e(AnonymousClass87G r1) {
    }

    public final void D8g(AnonymousClass87G r1) {
    }

    public final void DjU(boolean z) {
    }

    public final void Eu2() {
    }

    public static final void A00(C64998Llb llb) {
        C3503684j r3 = (C3503684j) llb.A03.getValue();
        r3.A0F.A01(r3.A0G, C359188c9.class);
        r3.A0E.A08(r3.A0D);
        JTR.A1W(((C3504884v) llb.A07.getValue()).A0e);
        AnonymousClass0eM r1 = llb.A05;
        ((AnonymousClass8DD) r1.getValue()).A05 = llb;
        AnonymousClass8DM r0 = ((AnonymousClass8DD) r1.getValue()).A0O;
        if (r0 != null) {
            r0.EeZ(llb);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A01() {
        C60216JhZ jhZ = (C60216JhZ) this.A08.getValue();
        AnonymousClass80V r4 = AnonymousClass80V.CAPTURE;
        05G r2 = jhZ.A06;
        r2.Epw(new JV5((CameraAREffect) ((JV5) r2.getValue()).A00, r4, true));
        MUS mus = jhZ.A02;
        if (mus != null) {
            mus.Cmy();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r6 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        r6 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r12 == null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r7 = r12.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r7 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r12 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r8 = r12.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r8 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r8 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r4.Ci3(r5, r6, r7, r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r1 != null) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Csu(com.instagram.camera.effect.models.CameraAREffect r11, com.instagram.camera.effect.models.CameraAREffect r12) {
        /*
            r10 = this;
            X.0eM r0 = r10.A08
            java.lang.Object r2 = r0.getValue()
            X.JhZ r2 = (X.C60216JhZ) r2
            X.05G r3 = r2.A06
            java.lang.Object r0 = r3.getValue()
            X.JV5 r0 = (X.JV5) r0
            java.lang.Object r1 = r0.A00
            com.instagram.camera.effect.models.CameraAREffect r1 = (com.instagram.camera.effect.models.CameraAREffect) r1
            boolean r0 = X.2PP.A00(r12, r1)
            if (r0 != 0) goto L_0x005f
            X.MUS r4 = r2.A02
            if (r4 == 0) goto L_0x0043
            boolean r9 = X.AnonymousClass7TF.A1V(r12)
            java.lang.String r0 = ""
            if (r1 == 0) goto L_0x002a
            java.lang.String r5 = r1.A0K
            if (r5 != 0) goto L_0x002d
        L_0x002a:
            r5 = r0
            if (r1 == 0) goto L_0x0031
        L_0x002d:
            java.lang.String r6 = r1.A0J
            if (r6 != 0) goto L_0x0032
        L_0x0031:
            r6 = r0
        L_0x0032:
            if (r12 == 0) goto L_0x0038
            java.lang.String r7 = r12.A0K
            if (r7 != 0) goto L_0x003b
        L_0x0038:
            r7 = r0
            if (r12 == 0) goto L_0x003f
        L_0x003b:
            java.lang.String r8 = r12.A0J
            if (r8 != 0) goto L_0x0040
        L_0x003f:
            r8 = r0
        L_0x0040:
            r4.Ci3(r5, r6, r7, r8, r9)
        L_0x0043:
            r2.A00 = r12
            java.lang.Object r0 = r3.getValue()
            X.JV5 r0 = (X.JV5) r0
            boolean r2 = r0.A01
            java.lang.Object r0 = r3.getValue()
            X.JV5 r0 = (X.JV5) r0
            java.lang.Object r1 = r0.A03
            X.80V r1 = (X.AnonymousClass80V) r1
            X.JV5 r0 = new X.JV5
            r0.<init>((com.instagram.camera.effect.models.CameraAREffect) r12, (X.AnonymousClass80V) r1, (boolean) r2)
            r3.Epw(r0)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64998Llb.Csu(com.instagram.camera.effect.models.CameraAREffect, com.instagram.camera.effect.models.CameraAREffect):void");
    }

    public final void CxH(String str) {
        ((C60216JhZ) this.A08.getValue()).A01.A1k(str);
    }
}
