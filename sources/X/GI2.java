package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class GI2 implements JRN {
    public long A00 = -1;
    public C267324bN A01;
    public C52058GDe A02;
    public C313306gE A03;
    public GVI A04;
    public C263754Nf A05;
    public AnonymousClass4M3 A06;
    public C52078GDy A07;
    public Integer A08 = AnonymousClass05K.A00;
    public Runnable A09;
    public final AnonymousClass4DH A0A;
    public final UserSession A0B;
    public final C252323ov A0C;
    public final C266384Yr A0D = new C266384Yr(this);
    public final String A0E;
    public final Set A0F = new CopyOnWriteArraySet();
    public final C55277Hf6 A0G;

    public final int E20(String str) {
        C313306gE r0 = this.A03;
        if (r0 != null) {
            r0.A01();
        }
        GVI gvi = this.A04;
        if (gvi != null) {
            gvi.A00();
        }
        AnonymousClass4M3 r2 = this.A06;
        if (r2 == null) {
            return 0;
        }
        if (BdI() == AnonymousClass3OB.PLAYING) {
            r2.E21(str);
        }
        return r2.getCurrentPositionMs();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010b, code lost:
        if (new X.GI8(r3.A0B, r10.getModuleName(), A00(r12)).A04() != false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x010d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x010e, code lost:
        r12.CcK();
        r10.getModuleName();
        A00(r12);
        r5 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0119, code lost:
        if (r5 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011b, code lost:
        r5 = (X.AnonymousClass4M1) r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011d, code lost:
        if (r1 == false) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x011f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0128, code lost:
        if (X.C263454Mb.A01(r5.A0m, r5.A0Q) == false) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x012a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012b, code lost:
        r5.A0a = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x012d, code lost:
        r1 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012f, code lost:
        if (r1 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0131, code lost:
        r1.EyP("unknown", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0136, code lost:
        r3.A08 = X.AnonymousClass05K.A00;
        r5 = r12.A0N;
        r14 = r3.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0149, code lost:
        if (X.182.A06(X.0Tu.A05, r14, 36319776759946897L) == false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014b, code lost:
        r0 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x014d, code lost:
        if (r0 == null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014f, code lost:
        r0 = r0.A0H;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0151, code lost:
        if (r0 == null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0153, code lost:
        r1 = r12.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0155, code lost:
        if (r1 == null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0157, code lost:
        r1 = X.DbZ.A0T(r1, r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0163, code lost:
        if (X.C52076GDw.A03(r12) == false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0165, code lost:
        if (r1 == null) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016b, code lost:
        if (r1.CeS() == false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016d, code lost:
        r0 = X.C295375o3.A02(r1);
        r5 = r1.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0173, code lost:
        r1 = new X.C263754Nf((java.lang.Object) r0, r4);
        r0 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017a, code lost:
        if (r0 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x017c, code lost:
        r13 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017e, code lost:
        if (r13 == null) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0180, code lost:
        r4 = null;
        r11 = new X.GI3(r12, r13, r14, r6.A03(), r1, r0, r10.getModuleName(), r5, r28, r30, r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019a, code lost:
        r3.A09 = r11;
        r3.A05 = r1;
        r0 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a0, code lost:
        if (r0 == null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a2, code lost:
        r1 = ((X.AnonymousClass4M1) r0).A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        if (r1 != X.AnonymousClass3OB.IDLE) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01aa, code lost:
        if (r11 == null) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ac, code lost:
        r11.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01af, code lost:
        r3.A09 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b9, code lost:
        if (X.DbT.A0h().A0Y() == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01bf, code lost:
        if (r12.CcK() == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c1, code lost:
        r0 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c3, code lost:
        if (r0 == null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c5, code lost:
        r5 = ((X.AnonymousClass4M1) r0).A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c9, code lost:
        if (r5 == null) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cb, code lost:
        r5.setExtraFeatureDebugInfo(X.002.A19("id=", r12.getId(), " isSensitive=", r12.A06().A11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01e0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01e1, code lost:
        r1 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e3, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e5, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e8, code lost:
        r0 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f9, code lost:
        if (X.AnonymousClass7TG.A1a(r7, r7.A1G, X.0tS.A4G, 13) != false) goto L_0x010d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean E4I(X.C229382nI r24, X.C267324bN r25, X.C52058GDe r26, X.C52078GDy r27, float r28, int r29, int r30, boolean r31, boolean r32) {
        /*
            r23 = this;
            r5 = 0
            r2 = 1
            r0 = r24
            r12 = r25
            X.DbW.A1O(r12, r2, r0)
            java.lang.Class<X.GI2> r3 = X.GI2.class
            r4 = r29
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r6 = r27
            java.lang.String r0 = r6.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Pos=%d holder=%s"
            X.0KC.A0A(r3, r0, r1)
            r3 = r23
            X.4DH r10 = r3.A0A
            boolean r0 = r10.isResumed()
            r11 = 0
            if (r0 == 0) goto L_0x0223
            X.4M3 r7 = r3.A06
            if (r7 == 0) goto L_0x0220
            r0 = r7
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r1 = r0.A0M
        L_0x0034:
            X.3OB r0 = X.AnonymousClass3OB.STOPPING
            if (r1 == r0) goto L_0x0223
            r3.A07 = r6
            r3.A01 = r12
            r0 = r26
            r3.A02 = r0
            if (r7 != 0) goto L_0x0080
            android.content.Context r8 = r10.requireContext()
            X.4Yr r7 = r3.A0D
            com.instagram.common.session.UserSession r9 = r3.A0B
            X.3ov r1 = r3.A0C
            java.lang.String r0 = r10.getModuleName()
            X.AnonymousClass7TF.A1D(r7, r2, r0)
            X.4M1 r8 = X.AnonymousClass4M0.A00(r8, r9, r1, r7, r0)
            X.4M7 r0 = X.AnonymousClass4M7.FILL
            r8.EjF(r0)
            r8.Ech(r2)
            r8.A0N = r7
            r8.A0Z = r2
            r0 = 100
            r8.A06 = r0
            X.4MM r0 = r8.A0K
            r0.getClass()
            X.4MM r0 = r8.A0K
            r0.A06 = r5
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319776759684749(0x8108a500151e8d, double:3.0321112986024096E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            r8.ERk(r0)
            r3.A06 = r8
        L_0x0080:
            X.6gE r0 = r3.A03
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r12.A0E()
            if (r0 == 0) goto L_0x00e0
            X.3OA r0 = r12.A06()
            X.3y4 r0 = r0.A0I
            if (r0 == 0) goto L_0x00e0
            X.XB5 r7 = r0.BUi()
            if (r7 == 0) goto L_0x00e0
            com.instagram.common.session.UserSession r15 = r3.A0B
            X.0Tu r8 = X.0Tu.A05
            r0 = 36320541262684744(0x81095700032248, double:3.032594773378013E-306)
            boolean r0 = X.182.A06(r8, r15, r0)
            if (r0 == 0) goto L_0x00e0
            X.IZA r9 = new X.IZA
            r9.<init>(r3)
            X.IW8 r8 = new X.IW8
            r8.<init>(r3, r2)
            java.lang.Long r0 = r7.AzI()
            if (r0 == 0) goto L_0x00bd
            long r0 = r0.longValue()
            r3.A00 = r0
        L_0x00bd:
            android.content.Context r14 = r10.requireContext()
            java.lang.String r0 = r3.A0E
            java.lang.String r18 = "clips_viewer_clips_tab_carousel"
            X.6gE r13 = new X.6gE
            r16 = r9
            r17 = r0
            r13.<init>(r14, r15, r16, r17, r18)
            r3.A03 = r13
            r13.A00 = r11
            java.lang.String r0 = X.C51966G9m.A1B(r12)
            r13.A07(r7, r8, r0, r5)
            X.GVI r0 = new X.GVI
            r0.<init>(r11, r5)
            r3.A04 = r0
        L_0x00e0:
            java.util.List r1 = r3.A00(r12)
            if (r1 == 0) goto L_0x00f0
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x01fd
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x01fd
        L_0x00f0:
            boolean r0 = r12.CcK()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ea
            com.instagram.common.session.UserSession r7 = r3.A0B
            java.util.List r5 = r3.A00(r12)
            java.lang.String r1 = r10.getModuleName()
            X.GI8 r0 = new X.GI8
            r0.<init>(r7, r1, r5)
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x01ea
        L_0x010d:
            r1 = 1
        L_0x010e:
            r12.CcK()
            r10.getModuleName()
            r3.A00(r12)
            X.4M3 r5 = r3.A06
            if (r5 == 0) goto L_0x012d
            X.4M1 r5 = (X.AnonymousClass4M1) r5
            if (r1 == 0) goto L_0x012a
            com.instagram.common.session.UserSession r1 = r5.A0m
            java.lang.String r0 = r5.A0Q
            boolean r1 = X.C263454Mb.A01(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            r5.A0a = r0
        L_0x012d:
            X.4M3 r1 = r3.A06
            if (r1 == 0) goto L_0x0136
            java.lang.String r0 = "unknown"
            r1.EyP(r0, r2)
        L_0x0136:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.A08 = r0
            java.lang.String r5 = r12.A0N
            com.instagram.common.session.UserSession r14 = r3.A0B
            X.0Tu r7 = X.0Tu.A05
            r0 = 36319776759946897(0x8108a500191e91, double:3.032111298768193E-306)
            boolean r0 = X.182.A06(r7, r14, r0)
            if (r0 == 0) goto L_0x01e8
            X.GDe r0 = r3.A02
            if (r0 == 0) goto L_0x01e5
            java.lang.Integer r0 = r0.A0H
            if (r0 == 0) goto L_0x01e5
            java.util.List r1 = r12.A0R
            if (r1 == 0) goto L_0x01e5
            int r0 = r0.intValue()
            X.1Xj r1 = X.DbZ.A0T(r1, r0)
        L_0x015f:
            boolean r0 = X.C52076GDw.A03(r12)
            if (r0 == 0) goto L_0x01e8
            if (r1 == 0) goto L_0x01e8
            boolean r0 = r1.CeS()
            if (r0 == 0) goto L_0x01e8
            X.4bN r0 = X.C295375o3.A02(r1)
            java.lang.String r5 = r1.A0M
        L_0x0173:
            X.4Nf r1 = new X.4Nf
            r1.<init>((java.lang.Object) r0, (int) r4)
            X.4M3 r0 = r3.A06
            if (r0 == 0) goto L_0x01e3
            X.GDe r13 = r3.A02
            if (r13 == 0) goto L_0x01e3
            com.instagram.ui.simplevideolayout.SimpleVideoLayout r15 = r6.A03()
            java.lang.String r18 = r10.getModuleName()
            r4 = r11
            X.GI3 r11 = new X.GI3
            r20 = r28
            r21 = r30
            r22 = r31
            r19 = r5
            r16 = r1
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x019a:
            r3.A09 = r11
            r3.A05 = r1
            X.4M3 r0 = r3.A06
            if (r0 == 0) goto L_0x01e1
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.3OB r1 = r0.A0M
        L_0x01a6:
            X.3OB r0 = X.AnonymousClass3OB.IDLE
            if (r1 != r0) goto L_0x01b1
            if (r11 == 0) goto L_0x01af
            r11.run()
        L_0x01af:
            r3.A09 = r4
        L_0x01b1:
            X.0tS r0 = X.DbT.A0h()
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x01e0
            boolean r0 = r12.CcK()
            if (r0 == 0) goto L_0x01e0
            X.4M3 r0 = r3.A06
            if (r0 == 0) goto L_0x01e0
            X.4M1 r0 = (X.AnonymousClass4M1) r0
            X.U4j r5 = r0.A0L
            if (r5 == 0) goto L_0x01e0
            java.lang.String r4 = "id="
            java.lang.String r3 = r12.getId()
            java.lang.String r1 = " isSensitive="
            X.3OA r0 = r12.A06()
            boolean r0 = r0.A11
            java.lang.String r0 = X.002.A19(r4, r3, r1, r0)
            r5.setExtraFeatureDebugInfo(r0)
        L_0x01e0:
            return r2
        L_0x01e1:
            r1 = r4
            goto L_0x01a6
        L_0x01e3:
            r4 = r11
            goto L_0x019a
        L_0x01e5:
            r1 = r11
            goto L_0x015f
        L_0x01e8:
            r0 = r12
            goto L_0x0173
        L_0x01ea:
            X.0tS r7 = X.DbT.A0h()
            X.0s0 r5 = r7.A1G
            X.0YZ[] r1 = X.0tS.A4G
            r0 = 13
            boolean r0 = X.AnonymousClass7TG.A1a(r7, r5, r1, r0)
            r1 = 0
            if (r0 == 0) goto L_0x010e
            goto L_0x010d
        L_0x01fd:
            java.util.Iterator r7 = r1.iterator()
        L_0x0201:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            X.0qQ.A07(r1)
            java.lang.String r0 = "vp09.02"
            boolean r0 = X.00p.A0k(r1, r0, r5)
            if (r0 == 0) goto L_0x0201
            goto L_0x00f0
        L_0x0220:
            r1 = r11
            goto L_0x0034
        L_0x0223:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GI2.E4I(X.2nI, X.4bN, X.GDe, X.GDy, float, int, int, boolean, boolean):boolean");
    }

    public final boolean EJ0(String str, boolean z) {
        String str2;
        C313306gE r1 = this.A03;
        if (!(r1 == null || (str2 = r1.A01) == null)) {
            C313306gE.A00(r1, str2);
        }
        GVI gvi = this.A04;
        if (gvi != null) {
            gvi.A01();
        }
        AnonymousClass3OB BdI = BdI();
        AnonymousClass4M3 r12 = this.A06;
        if (r12 == null) {
            return false;
        }
        if (BdI != AnonymousClass3OB.PAUSED && BdI != AnonymousClass3OB.PREPARED) {
            return false;
        }
        r12.E2q(str, z);
        return true;
    }

    public final void A95(C52016GBn gBn) {
        this.A0F.add(gBn);
    }

    public final void AHf() {
        this.A0F.clear();
    }

    public final C376689Iy Ato() {
        AnonymousClass4M3 r0 = this.A06;
        if (r0 != null) {
            return r0.Ato();
        }
        return null;
    }

    public final C267324bN Atp() {
        return this.A01;
    }

    public final AnonymousClass3OB BdI() {
        AnonymousClass3OB r0;
        AnonymousClass4M3 r02 = this.A06;
        if (r02 == null || (r0 = ((AnonymousClass4M1) r02).A0M) == null) {
            return AnonymousClass3OB.IDLE;
        }
        return r0;
    }

    public final C263754Nf CEB() {
        return this.A05;
    }

    public final C52078GDy CEb() {
        return this.A07;
    }

    public final boolean CJa() {
        AnonymousClass4M3 r0 = this.A06;
        if (r0 != null) {
            return r0.CJa();
        }
        return false;
    }

    public final boolean CeZ() {
        AnonymousClass4M3 r0 = this.A06;
        if (r0 == null || !r0.isPlaying()) {
            return false;
        }
        return true;
    }

    public final void ECP(String str) {
        C313306gE r0 = this.A03;
        if (r0 != null) {
            r0.A04();
        }
        this.A03 = null;
        AnonymousClass4M3 r02 = this.A06;
        if (r02 != null) {
            r02.E21(str);
        }
        AnonymousClass4M3 r03 = this.A06;
        if (r03 != null) {
            r03.ECP(str);
        }
        this.A06 = null;
        this.A07 = null;
    }

    public final void EDv(C52016GBn gBn) {
        this.A0F.remove(gBn);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = (X.AnonymousClass4M1) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EJE() {
        /*
            r2 = this;
            X.4M3 r1 = r2.A06
            if (r1 == 0) goto L_0x0012
            X.4M1 r1 = (X.AnonymousClass4M1) r1
            X.4MM r0 = r1.A0K
            if (r0 == 0) goto L_0x0012
            r0.EJE()
            X.4MM r0 = r1.A0K
            r0.start()
        L_0x0012:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GI2.EJE():void");
    }

    public final void EKy(int i, boolean z) {
        AnonymousClass4M3 r0 = this.A06;
        if (r0 != null) {
            r0.EKy(i, z);
        }
    }

    public final void EL3() {
        AnonymousClass4M3 r1 = this.A06;
        if (r1 != null) {
            r1.EKy(0, false);
        }
    }

    public final boolean EOZ() {
        AnonymousClass4M3 r0 = this.A06;
        if (r0 != null) {
            return r0.EOZ();
        }
        return false;
    }

    public final void EPC(boolean z) {
        AnonymousClass4M3 r0 = this.A06;
        if (r0 != null) {
            r0.EPC(z);
        }
    }

    public final void Eg1(float f) {
        AnonymousClass4MM r0;
        AnonymousClass4M3 r02 = this.A06;
        if (r02 != null && (r0 = ((AnonymousClass4M1) r02).A0K) != null) {
            r0.A06(f);
        }
    }

    public final void EgQ(String str) {
        AnonymousClass4M3 r0 = this.A06;
        if (r0 != null) {
            r0.EgQ(str);
        }
    }

    public final void EnT(boolean z, String str) {
        AnonymousClass4M3 r0 = this.A06;
        if (r0 != null) {
            r0.EnT(z, str);
        }
    }

    public final void Eqr(float f, int i) {
        C313306gE r0 = this.A03;
        if (r0 != null) {
            r0.A05(f);
        }
        AnonymousClass4M3 r02 = this.A06;
        if (r02 != null) {
            r02.Eqr(f, i);
        }
        C263754Nf r1 = this.A05;
        if (r1 != null) {
            r1.A00 = AnonymousClass7TF.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)));
        }
    }

    public GI2(AnonymousClass4DH r3, UserSession userSession, C252323ov r5, C55277Hf6 hf6, String str) {
        this.A0A = r3;
        this.A0B = userSession;
        this.A0C = r5;
        this.A0G = hf6;
        this.A0E = str;
    }

    private final List A00(C267324bN r7) {
        Integer num;
        C52058GDe gDe;
        if (!C52076GDw.A03(r7) || (gDe = this.A02) == null) {
            num = null;
        } else {
            num = gDe.A0H;
        }
        UserSession userSession = this.A0B;
        AnonymousClass3WR A092 = r7.A09(userSession, num);
        if (A092 == null) {
            return null;
        }
        if (182.A06(0Tu.A05, userSession, 36321988666468225L)) {
            return A092.A01(this.A0A.getContext());
        }
        String A042 = A092.A04();
        if (A042 != null) {
            return AnonymousClass7TE.A1I(A042);
        }
        return null;
    }

    public final boolean Cqv(C267324bN r4, C52078GDy gDy) {
        AnonymousClass3OB r2;
        AnonymousClass7TG.A1N(gDy, r4);
        C52078GDy gDy2 = this.A07;
        if (gDy2 != null && gDy2 == gDy && 2PP.A00(this.A01, r4)) {
            AnonymousClass4M3 r0 = this.A06;
            if (r0 != null) {
                r2 = ((AnonymousClass4M1) r0).A0M;
            } else {
                r2 = null;
            }
            if (r2 == AnonymousClass3OB.IDLE) {
                return true;
            }
            return false;
        }
        return true;
    }
}
