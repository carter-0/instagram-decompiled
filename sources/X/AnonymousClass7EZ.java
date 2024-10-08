package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;

/* renamed from: X.7EZ  reason: invalid class name */
public final class AnonymousClass7EZ extends C249703kE implements AnonymousClass7PM, AnonymousClass7PN, AnonymousClass7Pe {
    public final View A00;
    public final View A01;
    public final AnonymousClass7EY A02;
    public final AnonymousClass7EU A03;
    public final AnonymousClass7EL A04;
    public final AnonymousClass7EX A05;
    public final AnonymousClass7EN A06;
    public final C328217Dy A07;
    public final AnonymousClass7ER A08;
    public final AnonymousClass7EE A09 = new Object();
    public final AnonymousClass7ES A0A;
    public final AnonymousClass7EJ A0B;
    public final AnonymousClass7EK A0C;
    public final AnonymousClass7EI A0D;
    public final AnonymousClass7EO A0E;
    public final C328137Dq A0F;
    public final AnonymousClass7EV A0G;
    public final C328127Do A0H;
    public final AnonymousClass7EP A0I;
    public final AnonymousClass7EM A0J;
    public final AnonymousClass7EW A0K;
    public final AnonymousClass7EQ A0L;
    public final C328007Db A0M;
    public final AnonymousClass7EG A0N;
    public final C328227Dz A0O;
    public final AnonymousClass7EA A0P;
    public final AnonymousClass7ED A0Q;
    public final C328237Ea A0R;
    public final C328247Eb A0S;

    public final void APf(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A0R.APf(motionEvent);
    }

    public final void DAn(Canvas canvas, Integer num, float f) {
        0qQ.A0B(num, 2);
        this.A0S.DAn(canvas, num, f);
    }

    public final void Dq2(Integer num) {
        0qQ.A0B(num, 0);
        this.A0S.Dq2(num);
    }

    public final boolean EsS(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A0R.EsS(motionEvent);
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.7EE] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7EZ(android.view.View r35, android.view.View r36, X.AnonymousClass7EY r37, X.AnonymousClass7EU r38, X.AnonymousClass7EL r39, X.AnonymousClass7EX r40, X.AnonymousClass7EN r41, X.C328217Dy r42, X.AnonymousClass7ER r43, X.AnonymousClass7ES r44, X.AnonymousClass7EJ r45, X.AnonymousClass7EK r46, X.AnonymousClass7EI r47, X.AnonymousClass7EO r48, X.C328137Dq r49, X.AnonymousClass7EV r50, X.C328127Do r51, X.AnonymousClass7EP r52, X.AnonymousClass7EM r53, X.AnonymousClass7EW r54, X.AnonymousClass7EQ r55, X.C328007Db r56, X.AnonymousClass7EG r57, X.C328227Dz r58, X.AnonymousClass7EA r59, X.AnonymousClass7ED r60) {
        /*
            r34 = this;
            r0 = r42
            android.view.View r1 = r0.A00()
            r13 = r34
            r13.<init>(r1)
            r13.A07 = r0
            r5 = r56
            r13.A0M = r5
            r14 = r49
            r13.A0F = r14
            r0 = r51
            r13.A0H = r0
            r3 = r58
            r13.A0O = r3
            r2 = r59
            r13.A0P = r2
            r0 = r60
            r13.A0Q = r0
            r4 = r57
            r13.A0N = r4
            r9 = r47
            r13.A0D = r9
            r11 = r45
            r13.A0B = r11
            r10 = r46
            r13.A0C = r10
            r18 = r39
            r0 = r18
            r13.A04 = r0
            r6 = r53
            r13.A0J = r6
            r17 = r41
            r0 = r17
            r13.A06 = r0
            r8 = r48
            r13.A0E = r8
            r0 = r52
            r13.A0I = r0
            r0 = r55
            r13.A0L = r0
            r16 = r43
            r0 = r16
            r13.A08 = r0
            r12 = r44
            r13.A0A = r12
            r0 = r38
            r13.A03 = r0
            r7 = r50
            r13.A0G = r7
            r0 = r54
            r13.A0K = r0
            r0 = r40
            r13.A05 = r0
            r19 = r37
            r0 = r19
            r13.A02 = r0
            r0 = r35
            r13.A01 = r0
            r21 = r36
            r0 = r21
            r13.A00 = r0
            X.7EE r0 = new X.7EE
            r0.<init>()
            r13.A09 = r0
            boolean r0 = r5 instanceof X.AnonymousClass7PN
            if (r0 == 0) goto L_0x00c6
            r15 = r5
            X.7PN r15 = (X.AnonymousClass7PN) r15
        L_0x0089:
            X.7Ea r0 = new X.7Ea
            r0.<init>(r1, r15, r14)
            r13.A0R = r0
            android.view.View r0 = r13.itemView
            android.content.Context r15 = r0.getContext()
            X.0qQ.A07(r15)
            r20 = 0
            X.7Eb r0 = new X.7Eb
            r30 = r8
            r31 = r12
            r32 = r7
            r33 = r19
            r22 = r3
            r23 = r4
            r24 = r11
            r25 = r10
            r26 = r18
            r27 = r6
            r28 = r17
            r29 = r16
            r14 = r0
            r16 = r1
            r17 = r21
            r18 = r5
            r19 = r9
            r21 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r13.A0S = r0
            return
        L_0x00c6:
            r15 = 0
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7EZ.<init>(android.view.View, android.view.View, X.7EY, X.7EU, X.7EL, X.7EX, X.7EN, X.7Dy, X.7ER, X.7ES, X.7EJ, X.7EK, X.7EI, X.7EO, X.7Dq, X.7EV, X.7Do, X.7EP, X.7EM, X.7EW, X.7EQ, X.7Db, X.7EG, X.7Dz, X.7EA, X.7ED):void");
    }

    public final boolean AFz() {
        return this.A0S.AFz();
    }

    public final boolean AG0(MotionEvent motionEvent) {
        return this.A0S.AFz();
    }

    public final AnonymousClass7EF Bjp() {
        return this.A09;
    }

    public final Integer C3V() {
        return this.A0S.C3V();
    }

    public final float C3X() {
        return this.A0S.C3X();
    }

    public final List CFS() {
        return this.A0S.CFS();
    }

    public final List CFT() {
        return this.A0S.CFT();
    }

    public final void DAV(float f, float f2) {
        this.A0R.DAV(f, f2);
    }

    public final boolean Esh() {
        return this.A0R.Esh();
    }
}
