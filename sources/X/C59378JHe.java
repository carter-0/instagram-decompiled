package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.JHe  reason: case insensitive filesystem */
public final class C59378JHe extends 0Yg implements 0sK {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C55647Hl6 A01;
    public final /* synthetic */ C47183Dry A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ 0sK A0A;
    public final /* synthetic */ 0sK A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59378JHe(AnonymousClass0iw r2, C55647Hl6 hl6, C47183Dry dry, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9, 0sP r10, 0sP r11, 0sK r12, 0sK r13, boolean z, boolean z2) {
        super(3);
        this.A0D = z;
        this.A02 = dry;
        this.A06 = r5;
        this.A04 = r6;
        this.A03 = r7;
        this.A00 = r2;
        this.A09 = r10;
        this.A0A = r12;
        this.A0B = r13;
        this.A08 = r11;
        this.A07 = r8;
        this.A05 = r9;
        this.A01 = hl6;
        this.A0C = z2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        C286575Wy r6 = (C286575Wy) obj2;
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(modifier, 0);
        if ((A0M & 6) == 0) {
            A0M |= G9t.A0O(r6, modifier);
        }
        if ((A0M & 19) != 18 || !r6.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-1717546658, "com.instagram.opal.impl.ui.OpalProfile.<anonymous> (OpalContent.kt:460)");
            }
            boolean z = this.A0D;
            C47183Dry dry = this.A02;
            C62320sa r19 = this.A06;
            C62320sa r17 = this.A04;
            C62320sa r18 = this.A03;
            AnonymousClass0iw r26 = this.A00;
            0sP r16 = this.A09;
            0sK r12 = this.A0A;
            0sK r9 = this.A0B;
            0sP r7 = this.A08;
            C62320sa r4 = this.A07;
            C62320sa r3 = this.A05;
            C55647Hl6 hl6 = this.A01;
            boolean z2 = this.A0C;
            AnonymousClass5RD A0a = C51966G9m.A0a(false);
            int A002 = C287425a7.A00(r6);
            C286565Wx r1 = (C286565Wx) r6;
            AnonymousClass5RM A042 = C286565Wx.A04(r1);
            Modifier A012 = C287435a8.A01(r6, modifier);
            C51973G9u.A0y(r6, r1);
            C51971G9r.A12(r6, A0a, A042);
            0sL r15 = C287485aD.A02;
            if (r1.A0K || !C51972G9s.A1Q(r6, A002)) {
                C51971G9r.A13(r6, r15, A002);
            }
            C51965G9l.A18(r6, A012);
            if (z) {
                r6.ExS(-470600568);
                I7S.A04(r6, C51968G9o.A0O(), r26, dry.A05.A01, r19, r17, r18, 1572864, dry.A09);
            } else {
                r6.ExS(-470137707);
                0sK r21 = r12;
                0sK r22 = r9;
                boolean z3 = z2;
                C286575Wy r92 = r6;
                AnonymousClass0iw r11 = r26;
                C56592I2w.A01(r92, C51968G9o.A0O(), r11, hl6, dry, dry.A05.A05, r4, r3, r17, r18, r16, r7, r21, r22, 0, 3072, z3);
            }
            if (C51971G9r.A1S(r6, r1, false)) {
                0fL.A00(-308600724);
            }
        } else {
            r6.Evl();
        }
        return C60340gF.A00;
    }
}
