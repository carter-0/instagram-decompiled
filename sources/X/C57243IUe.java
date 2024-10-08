package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;

/* renamed from: X.IUe  reason: case insensitive filesystem */
public final class C57243IUe implements AnonymousClass2xU {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ColorDrawable A01;
    public final /* synthetic */ AnonymousClass3Y5 A02;
    public final /* synthetic */ 2V5 A03;
    public final /* synthetic */ 2V5 A04;
    public final /* synthetic */ 2V5 A05;
    public final /* synthetic */ 2V5 A06;
    public final /* synthetic */ 2V5 A07;
    public final /* synthetic */ AnonymousClass3z2 A08;
    public final /* synthetic */ C53791GuK A09;
    public final /* synthetic */ AnonymousClass3z3 A0A;
    public final /* synthetic */ 1Xj A0B;
    public final /* synthetic */ 0sP A0C;

    public C57243IUe(ColorDrawable colorDrawable, AnonymousClass3Y5 r2, 2V5 r3, 2V5 r4, 2V5 r5, 2V5 r6, 2V5 r7, AnonymousClass3z2 r8, C53791GuK guK, AnonymousClass3z3 r10, 1Xj r11, 0sP r12, int i) {
        this.A0C = r12;
        this.A0A = r10;
        this.A07 = r3;
        this.A06 = r4;
        this.A03 = r5;
        this.A05 = r6;
        this.A04 = r7;
        this.A08 = r8;
        this.A00 = i;
        this.A01 = colorDrawable;
        this.A02 = r2;
        this.A09 = guK;
        this.A0B = r11;
    }

    public final void DQp(AnonymousClass3W1 r14, int i) {
        AnonymousClass3z3 r10;
        int i2;
        int i3;
        int i4;
        int i5;
        0qQ.A0B(r14, 0);
        if (i == 5) {
            boolean z = r14.A29;
            int A0M = AnonymousClass7TE.A0M(C51968G9o.A0w(r14.A02, this.A0C));
            if (!r14.A2P) {
                float[] A1b = C51965G9l.A1b();
                if (z) {
                    // fill-array-data instruction
                    A1b[0] = 1065353216;
                    A1b[1] = 0;
                } else {
                    // fill-array-data instruction
                    A1b[0] = 0;
                    A1b[1] = 1065353216;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A1b);
                ValueAnimator duration = ofFloat.setDuration(200);
                2V5 r5 = this.A03;
                r10 = this.A0A;
                duration.addUpdateListener(new I81(r5, this.A07, this.A06, this.A04, this.A05, r10, A0M, this.A00));
                ofFloat.start();
            } else {
                r10 = this.A0A;
                AnonymousClass3z2 r3 = r10.A00;
                if (z) {
                    i2 = -1;
                } else {
                    i2 = r3.A09;
                }
                C51967G9n.A1A(this.A07, i2);
                2V5 r1 = this.A06;
                if (z) {
                    i3 = r3.A05;
                } else {
                    i3 = r3.A06;
                }
                C51967G9n.A1A(r1, i3);
                2V5 r12 = this.A03;
                int i6 = A0M;
                if (!z) {
                    i6 = r3.A01;
                }
                C51967G9n.A1A(r12, i6);
                2V5 r0 = this.A05;
                if (!z) {
                    A0M = r3.A04;
                }
                C51967G9n.A1A(r0, A0M);
                2V5 r13 = this.A04;
                if (z) {
                    i4 = this.A08.A02;
                } else {
                    i4 = this.A00;
                }
                C51967G9n.A1A(r13, i4);
            }
            ColorDrawable colorDrawable = this.A01;
            AnonymousClass3z2 r02 = r10.A00;
            if (z) {
                i5 = r02.A07;
            } else {
                i5 = r02.A08;
            }
            colorDrawable.setColor(i5);
        } else if (i == 14 && r14.A29) {
            ArgbEvaluator argbEvaluator = C258443z1.A00;
            0qQ.A07(this.A02.A05.A0C);
            AnonymousClass3z2 r32 = this.A08;
            1Xj r4 = this.A0B;
            int i7 = r14.A0S;
            int i8 = r14.A0B;
            C258443z1.A02(r32, r4, J6S.A00(this.A03, this.A05, 24), r14.A01, i7, i8);
        }
    }
}
