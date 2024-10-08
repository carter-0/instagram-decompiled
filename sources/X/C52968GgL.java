package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.GgL  reason: case insensitive filesystem */
public final class C52968GgL extends C361478gI {
    public I12 A00;
    public C55616Hkb A01;
    public final C284945Oz A02;
    public final UserSession A03;
    public final C56040Hrn A04;
    public final C56605I4e A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;

    public static final void A01(C52968GgL ggL, int i, boolean z) {
        C61076JwE jwE;
        Object value;
        C52968GgL ggL2 = ggL;
        String A0q = C51971G9r.A0q(ggL.A02);
        if (A0q.length() != 0) {
            I12 A022 = ((C54436HDl) ggL.A07.getValue()).A02();
            if (A022 == null || (jwE = A022.A01) == null) {
                A02(ggL, HBW.A00);
                return;
            }
            05G r3 = ggL.A09;
            do {
                value = r3.getValue();
            } while (!r3.AIY(value, C53399GnW.A01((C53399GnW) value, (C59494JLs) null, (I12) null, HLZ.GENERATING, (AnonymousClass62O) null, 47, false)));
            ggL2.A01 = new C55616Hkb(C51966G9m.A1L(new MGP(jwE, ggL2, A0q, (AnonymousClass4D7) null, i, z), C318116oQ.A00(ggL2)), z);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C52968GgL(android.app.Application r22, com.instagram.common.session.UserSession r23, X.C56605I4e r24, java.lang.String r25) {
        /*
            r21 = this;
            X.8Ao r6 = new X.8Ao
            r1 = r22
            r7 = r23
            r6.<init>(r7, r1)
            X.8Ap r5 = new X.8Ap
            r5.<init>(r7)
            X.8Aq r4 = new X.8Aq
            r4.<init>(r1, r7)
            r10 = r24
            X.AnonymousClass7TG.A1U(r1, r7, r10)
            r0 = 4
            r2 = r21
            r2.<init>(r1)
            r2.A03 = r7
            r2.A05 = r10
            com.instagram.common.session.UserSession r1 = r6.A00
            X.8ZA r3 = new X.8ZA
            r3.<init>(r1)
            r1 = 29
            X.0t0 r1 = X.C58717IwQ.A00(r6, r3, r1)
            r2.A06 = r1
            com.instagram.common.session.UserSession r1 = r5.A00
            X.8ZA r3 = new X.8ZA
            r3.<init>(r1)
            r1 = 30
            X.0t0 r1 = X.C58717IwQ.A00(r5, r3, r1)
            r2.A07 = r1
            com.instagram.common.session.UserSession r1 = r4.A00
            X.8ZA r3 = new X.8ZA
            r3.<init>(r1)
            r1 = 31
            X.0t0 r1 = X.C58717IwQ.A00(r4, r3, r1)
            r2.A08 = r1
            X.8hK r11 = X.C55327Hfu.A00
            java.lang.Object r9 = r1.getValue()
            X.HDk r9 = (X.C54435HDk) r9
            X.0eM r1 = r2.A07
            java.lang.Object r8 = r1.getValue()
            X.HDl r8 = (X.C54436HDl) r8
            r12 = 0
            r13 = 0
            X.Hrn r6 = new X.Hrn
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.A04 = r6
            X.IQM r15 = X.IQM.A00
            X.HLZ r18 = X.HLZ.ENTER_PROMPT
            X.62M r19 = X.AnonymousClass62M.A01
            X.HLB r16 = X.C56278Hvm.A00(r7)
            X.GnW r14 = new X.GnW
            r17 = r12
            r20 = r13
            r14.<init>((X.C59494JLs) r15, (X.HLB) r16, (X.I12) r17, (X.HLZ) r18, (X.AnonymousClass62O) r19, (boolean) r20)
            X.02z r3 = X.DbS.A10(r14)
            r2.A09 = r3
            r2.A0A = r3
            java.lang.String r4 = ""
            r7 = r25
            r1 = r7
            if (r25 != 0) goto L_0x008b
            r1 = r4
        L_0x008b:
            X.5Tl r1 = X.C51967G9n.A0L(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = X.C51970G9q.A0S(r1)
            r2.A02 = r1
            X.0eM r1 = r2.A07
            java.lang.Object r5 = r1.getValue()
            X.HDl r5 = (X.C54436HDl) r5
            r5.A00 = r11
            X.Hzi r1 = X.C54436HDl.A00(r5)
            X.I12 r1 = r1.A01
            if (r1 == 0) goto L_0x00aa
            r5.A05(r1)
        L_0x00aa:
            r6.A01()
            X.6oS r9 = X.C318116oQ.A00(r2)
            r5 = 41
            X.MG6 r1 = new X.MG6
            r1.<init>(r2, r12, r5)
            X.19B r8 = X.19B.A00
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.1Eo.A03(r6, r8, r1, r9)
            X.6oS r9 = X.C318116oQ.A00(r2)
            r5 = 42
            X.MG6 r1 = new X.MG6
            r1.<init>(r2, r12, r5)
            X.1Eo.A03(r6, r8, r1, r9)
            X.0eM r1 = r2.A08
            java.lang.Object r11 = r1.getValue()
            X.HDk r11 = (X.C54435HDk) r11
            X.05G r10 = r11.A05
            X.05G r9 = r11.A06
            r5 = 18
            X.MHj r1 = new X.MHj
            r1.<init>(r5, r12)
            X.0pm r10 = X.AnonymousClass10H.A03(r1, r10, r9)
            X.4Cq r9 = r11.A03
            X.109 r5 = X.AnonymousClass10A.A01
            X.0sn r1 = X.0sn.A00
            X.05F r9 = X.10b.A02(r1, r9, r10, r5)
            X.0eM r1 = r2.A08
            java.lang.Object r1 = r1.getValue()
            X.HDk r1 = (X.C54435HDk) r1
            X.0Ud r5 = r1.A07
            X.MHi r1 = new X.MHi
            r1.<init>((java.lang.Object) r2, (X.AnonymousClass4D7) r12, (int) r0)
            X.0pm r1 = X.AnonymousClass10H.A03(r1, r9, r5)
            X.6oS r0 = X.C318116oQ.A00(r2)
            X.AnonymousClass11O.A03(r0, r1)
            X.6oS r5 = X.C318116oQ.A00(r2)
            r1 = 43
            X.MG6 r0 = new X.MG6
            r0.<init>(r2, r12, r1)
            X.1Eo.A03(r6, r8, r0, r5)
            if (r25 == 0) goto L_0x0138
            int r0 = r7.length()
            if (r0 <= 0) goto L_0x0138
            X.5Oz r3 = r2.A02
            X.5Tl r0 = X.C51973G9u.A0H(r3, r7)
            X.0qQ.A0B(r0, r13)
            r3.Epw(r0)
            X.I4e r1 = r2.A05
            java.lang.String r0 = X.C51971G9r.A0q(r3)
            r1.A08(r12, r6, r0)
            r0 = 2
            A01(r2, r0, r13)
        L_0x0137:
            return
        L_0x0138:
            X.0eM r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            X.HDl r0 = (X.C54436HDl) r0
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0137
            X.0eM r0 = r2.A07
            java.lang.Object r1 = r0.getValue()
            X.HDl r1 = (X.C54436HDl) r1
            X.Hzi r0 = X.C54436HDl.A00(r1)
            X.I12 r0 = r0.A01
            if (r0 != 0) goto L_0x015a
            X.I12 r0 = r1.A02()
        L_0x015a:
            if (r0 == 0) goto L_0x0161
            java.lang.String r0 = r0.A05
            if (r0 == 0) goto L_0x0161
            r4 = r0
        L_0x0161:
            X.5Oz r0 = r2.A02
            X.5Tl r1 = X.C51973G9u.A0H(r0, r4)
            X.0qQ.A0B(r1, r13)
            X.5Oz r0 = r2.A02
            r0.Epw(r1)
        L_0x016f:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.GnW r1 = (X.C53399GnW) r1
            X.HLZ r0 = X.HLZ.GENERATED_IMAGE_SELECTION
            X.GnW r0 = X.C53399GnW.A01(r1, (X.C59494JLs) null, (X.I12) null, r0, (X.AnonymousClass62O) null, 47, false)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x016f
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52968GgL.<init>(android.app.Application, com.instagram.common.session.UserSession, X.I4e, java.lang.String):void");
    }

    public static final C55718HmF A00(C52968GgL ggL) {
        I12 i12 = (I12) ((C53399GnW) ggL.A0A.getValue()).A02;
        if (i12 != null) {
            return i12.A03;
        }
        return null;
    }

    public static final void A02(C52968GgL ggL, C55509Hir hir) {
        String str;
        Object value;
        C53399GnW gnW;
        HLZ hlz;
        I12 i12;
        AnonymousClass0Ud r3 = ggL.A0A;
        boolean A1b = G9w.A1b(((C53399GnW) r3.getValue()).A01);
        Application A0D = ggL.A0D();
        0qQ.A0B(hir, 1);
        if (!(hir instanceof HBQ) || (str = ((HBQ) hir).A01) == null) {
            str = AnonymousClass7TE.A16(A0D, 2131965768);
        }
        C56278Hvm.A01(A0D, str, (String) null);
        05G r2 = ggL.A09;
        do {
            value = r2.getValue();
            gnW = (C53399GnW) value;
            if (A1b) {
                hlz = HLZ.GENERATED_IMAGE_SELECTION;
            } else {
                hlz = HLZ.ENTER_PROMPT;
            }
            i12 = ggL.A00;
            if (i12 == null) {
                i12 = (I12) ((C53399GnW) r3.getValue()).A02;
            }
        } while (!r2.AIY(value, C53399GnW.A01(gnW, (C59494JLs) null, i12, hlz, (AnonymousClass62O) null, 46, false)));
    }
}
