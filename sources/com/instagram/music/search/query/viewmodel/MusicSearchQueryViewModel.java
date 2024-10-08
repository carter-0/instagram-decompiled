package com.instagram.music.search.query.viewmodel;

import X.0Tu;
import X.0qQ;
import X.182;
import X.2Fk;
import X.2YL;
import X.AnonymousClass2Fj;
import X.AnonymousClass2gB;
import X.AnonymousClass7TE;
import X.C51973G9u;
import X.C60889Jt9;
import X.C62037KWw;
import X.C63736L4u;
import X.C63865L9u;
import X.C64318LZs;
import X.C65517Luf;
import X.CGO;
import X.JTO;
import X.JTS;
import X.JV5;
import X.L22;
import X.L23;
import X.L26;
import X.L9G;
import X.LDF;
import X.LFC;
import X.LFH;
import X.MP7;
import X.MU4;
import com.instagram.common.session.UserSession;

public final class MusicSearchQueryViewModel extends 2YL {
    public boolean A00;
    public 2Fk A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final 2Fk A04;
    public final 2Fk A05;
    public final 2Fk A06;
    public final AnonymousClass2gB A07;
    public final AnonymousClass2gB A08;
    public final AnonymousClass2gB A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2Fj A0B;
    public final AnonymousClass2Fj A0C;
    public final L22 A0D;
    public final L23 A0E;
    public final LFC A0F;
    public final C63865L9u A0G;
    public final LDF A0H;
    public final L9G A0I;
    public final C62037KWw A0J;
    public final boolean A0K;
    public final UserSession A0L;
    public final MU4 A0M;

    public MusicSearchQueryViewModel(UserSession userSession, L22 l22, L23 l23, LFC lfc, C63865L9u l9u, LDF ldf, L9G l9g, C62037KWw kWw, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C62037KWw kWw2 = kWw;
        L23 l232 = l23;
        L22 l222 = l22;
        C51973G9u.A0t(5, kWw2, l222, l232);
        this.A0L = userSession2;
        C63865L9u l9u2 = l9u;
        this.A0G = l9u2;
        LDF ldf2 = ldf;
        this.A0H = ldf2;
        L9G l9g2 = l9g;
        this.A0I = l9g2;
        this.A0J = kWw2;
        LFC lfc2 = lfc;
        this.A0F = lfc2;
        this.A0K = z;
        this.A0D = l222;
        this.A0E = l232;
        C65517Luf luf = new C65517Luf(this);
        this.A0M = luf;
        AnonymousClass2gB r11 = new AnonymousClass2gB();
        this.A07 = r11;
        AnonymousClass2gB r9 = new AnonymousClass2gB();
        this.A09 = r9;
        AnonymousClass2gB r7 = new AnonymousClass2gB();
        this.A08 = r7;
        AnonymousClass2Fj A0K2 = JTO.A0K();
        this.A0C = A0K2;
        AnonymousClass2Fj A0K3 = JTO.A0K();
        this.A0B = A0K3;
        AnonymousClass2Fj A0K4 = JTO.A0K();
        this.A0A = A0K4;
        this.A04 = r11;
        this.A06 = r9;
        this.A05 = r7;
        this.A01 = A0K2;
        this.A03 = A0K3;
        this.A02 = A0K4;
        lfc2.A00 = luf;
        r9.A0B(new C63736L4u(0, (Object) null));
        r11.A0E(l9u2.A00, new C64318LZs(29, new MP7(this, 43)));
        MP7.A00(ldf2.A00, r9, this, 44, 29);
        MP7.A00(l9g2.A00, r7, this, 45, 29);
        if (z) {
            lfc2.A01(new LFH("", 0, false, false, false));
        }
        kWw2.A00 = new L26(this);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = 3
            boolean r0 = X.C66138MDq.A02(r7, r9)
            if (r0 == 0) goto L_0x005b
            r6 = r9
            X.MDq r6 = (X.C66138MDq) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0015:
            java.lang.Object r1 = r6.A02
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x0043
            if (r0 != r4) goto L_0x0061
            X.0eS.A00(r1)
        L_0x0027:
            X.0gF r5 = X.C60340gF.A00
            return r5
        L_0x002a:
            X.0eS.A00(r1)
            X.KWw r0 = r8.A0J
            r6.A01 = r8
            r6.A00 = r2
            com.instagram.common.session.UserSession r0 = r0.A02
            X.1OC r1 = X.C64027LJo.A00(r0, r3, r3)
            r0 = 1237494160(0x49c2a990, float:1594674.0)
            X.032 r1 = r1.A04(r0, r7)
            if (r1 != r5) goto L_0x0048
            return r5
        L_0x0043:
            java.lang.Object r8 = r6.A01
            X.0eS.A00(r1)
        L_0x0048:
            X.0r6 r1 = (X.AnonymousClass0r6) r1
            r0 = 64
            X.MCm r0 = X.MCm.A00(r8, r0)
            r6.A01 = r3
            r6.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r6)
            if (r0 != r5) goto L_0x0027
            return r5
        L_0x005b:
            X.MDq r6 = new X.MDq
            r6.<init>(r8, r9, r7)
            goto L_0x0015
        L_0x0061:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel.A00(com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 4
            boolean r0 = X.C66138MDq.A02(r3, r6)
            if (r0 == 0) goto L_0x003f
            r4 = r6
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0015:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002d
            if (r0 != r1) goto L_0x0045
            java.lang.Object r5 = r4.A01
            com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r5 = (com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel) r5
            X.0eS.A00(r3)
        L_0x0027:
            r0 = 0
            r5.A00 = r0
        L_0x002a:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x002d:
            X.0eS.A00(r3)
            boolean r0 = r5.A00
            if (r0 == 0) goto L_0x002a
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r0 = A00(r5, r4)
            if (r0 != r2) goto L_0x0027
            return r2
        L_0x003f:
            X.MDq r4 = new X.MDq
            r4.<init>(r5, r6, r3)
            goto L_0x0015
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel.A01(com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.Jt9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v3, types: [X.Jt9, java.lang.Object] */
    public final void A02() {
        LDF ldf;
        C60889Jt9 jt9;
        C63736L4u l4u = (C63736L4u) this.A09.A02();
        if (l4u != null) {
            Object obj = l4u.A01;
            if (obj != null) {
                JV5 jv5 = (JV5) obj;
                LFH lfh = (LFH) jv5.A03;
                CGO cgo = (CGO) jv5.A00;
                if (cgo == null) {
                    if (182.A06(0Tu.A05, this.A0L, 36329629413621988L)) {
                        ldf = this.A0H;
                        Object obj2 = this.A0F.A01.A01;
                        0qQ.A0A(obj2);
                        LFH lfh2 = (LFH) obj2;
                        String str = lfh2.A01;
                        boolean z = lfh2.A03;
                        int i = lfh2.A00;
                        boolean z2 = lfh2.A02;
                        boolean z3 = lfh2.A04;
                        0qQ.A0B(str, 1);
                        ? obj3 = new Object();
                        obj3.A01 = str;
                        obj3.A03 = z;
                        obj3.A00 = i;
                        obj3.A02 = z2;
                        obj3.A04 = z3;
                        obj3.A04 = true;
                        jt9 = obj3;
                    } else {
                        return;
                    }
                } else if (cgo.A00()) {
                    ldf = this.A0H;
                    String str2 = lfh.A01;
                    boolean z4 = lfh.A03;
                    int i2 = lfh.A00;
                    boolean z5 = lfh.A02;
                    boolean z6 = lfh.A04;
                    0qQ.A0B(str2, 1);
                    ? obj4 = new Object();
                    obj4.A01 = str2;
                    obj4.A03 = z4;
                    obj4.A00 = i2;
                    obj4.A02 = z5;
                    obj4.A04 = z6;
                    obj4.A03 = false;
                    obj4.A02 = false;
                    jt9 = obj4;
                } else {
                    return;
                }
                ldf.A00(new LFH(jt9.A01, jt9.A00, jt9.A03, jt9.A02, jt9.A04), JTS.A0K(this.A0E.A00.A0A).A07);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
