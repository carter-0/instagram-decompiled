package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Space;
import com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout;
import java.util.List;

/* renamed from: X.7AS  reason: invalid class name */
public final class AnonymousClass7AS extends AnonymousClass7AT implements AnonymousClass7PM, AnonymousClass7PN, AnonymousClass7Pe {
    public final View A00;
    public final View A01;
    public final Space A02;
    public final ObservableVerticalOffsetConstraintLayout A03;
    public final AnonymousClass7EU A04;
    public final AnonymousClass7EL A05;
    public final AnonymousClass7AR A06;
    public final AnonymousClass7ER A07;
    public final AnonymousClass7EE A08 = new Object();
    public final AnonymousClass7ES A09;
    public final AnonymousClass7EJ A0A;
    public final AnonymousClass7EK A0B;
    public final AnonymousClass7EO A0C;
    public final C328137Dq A0D;
    public final AnonymousClass7EV A0E;
    public final C328127Do A0F;
    public final AnonymousClass7EM A0G;
    public final AnonymousClass7EG A0H;
    public final C328227Dz A0I;
    public final AnonymousClass7EA A0J;
    public final AnonymousClass7ED A0K;
    public final C328237Ea A0L;
    public final C328247Eb A0M;

    public final void APf(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A0L.APf(motionEvent);
    }

    public final void DAn(Canvas canvas, Integer num, float f) {
        0qQ.A0B(num, 2);
        this.A0M.DAn(canvas, num, f);
    }

    public final void Dq2(Integer num) {
        0qQ.A0B(num, 0);
        this.A0M.Dq2(num);
    }

    public final boolean EsS(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A0L.EsS(motionEvent);
    }

    public final boolean AFz() {
        return this.A0M.AFz();
    }

    public final boolean AG0(MotionEvent motionEvent) {
        return this.A0M.AFz();
    }

    public final AnonymousClass7EF Bjp() {
        return this.A08;
    }

    public final Integer C3V() {
        return this.A0M.C3V();
    }

    public final float C3X() {
        return this.A0M.C3X();
    }

    public final List CFS() {
        return this.A0M.CFS();
    }

    public final List CFT() {
        return this.A0M.CFT();
    }

    public final void DAV(float f, float f2) {
        this.A0L.DAV(f, f2);
    }

    public final boolean Esh() {
        return this.A0L.Esh();
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.7EE] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7AS(android.view.View r36, android.view.View r37, android.widget.Space r38, com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout r39, X.AnonymousClass7EU r40, X.AnonymousClass7EL r41, X.AnonymousClass7AR r42, X.AnonymousClass7ER r43, X.AnonymousClass7ES r44, X.AnonymousClass7EJ r45, X.AnonymousClass7EK r46, X.AnonymousClass7EO r47, X.C328137Dq r48, X.AnonymousClass7EV r49, X.C328127Do r50, X.AnonymousClass7EM r51, X.C328007Db r52, X.C328007Db r53, X.AnonymousClass7EG r54, X.C328227Dz r55, X.AnonymousClass7EA r56, X.AnonymousClass7ED r57) {
        /*
            r35 = this;
            r0 = 5
            r1 = r50
            X.0qQ.A0B(r1, r0)
            r0 = 19
            r15 = r38
            X.0qQ.A0B(r15, r0)
            r12 = r39
            r4 = r53
            r5 = r52
            r13 = r35
            r13.<init>(r12, r5, r4)
            r13.A03 = r12
            r8 = r48
            r13.A0D = r8
            r13.A0F = r1
            r2 = r55
            r13.A0I = r2
            r1 = r56
            r13.A0J = r1
            r0 = r57
            r13.A0K = r0
            r3 = r54
            r13.A0H = r3
            r11 = r45
            r13.A0A = r11
            r16 = r43
            r0 = r16
            r13.A07 = r0
            r9 = r47
            r13.A0C = r9
            r14 = r44
            r13.A09 = r14
            r10 = r46
            r13.A0B = r10
            r18 = r41
            r0 = r18
            r13.A05 = r0
            r6 = r51
            r13.A0G = r6
            r0 = r40
            r13.A04 = r0
            r7 = r49
            r13.A0E = r7
            r13.A02 = r15
            r17 = r42
            r0 = r17
            r13.A06 = r0
            r34 = r36
            r0 = r34
            r13.A00 = r0
            r0 = r37
            r13.A01 = r0
            X.7EE r0 = new X.7EE
            r0.<init>()
            r13.A08 = r0
            r0 = 0
            X.7Ea r15 = new X.7Ea
            r15.<init>(r12, r0, r8)
            r13.A0L = r15
            android.view.View r8 = r13.itemView
            android.content.Context r15 = r8.getContext()
            X.0qQ.A07(r15)
            X.7Eb r8 = new X.7Eb
            r30 = r9
            r31 = r14
            r32 = r7
            r33 = r0
            r24 = r11
            r25 = r16
            r26 = r10
            r27 = r18
            r28 = r6
            r29 = r0
            r18 = r5
            r19 = r4
            r20 = r17
            r21 = r1
            r22 = r2
            r23 = r3
            r14 = r8
            r16 = r12
            r17 = r34
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r13.A0M = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7AS.<init>(android.view.View, android.view.View, android.widget.Space, com.facebook.common.messagingui.observableverticaloffsetlayout.observableverticaloffsetconstraintlayout.ObservableVerticalOffsetConstraintLayout, X.7EU, X.7EL, X.7AR, X.7ER, X.7ES, X.7EJ, X.7EK, X.7EO, X.7Dq, X.7EV, X.7Do, X.7EM, X.7Db, X.7Db, X.7EG, X.7Dz, X.7EA, X.7ED):void");
    }
}
