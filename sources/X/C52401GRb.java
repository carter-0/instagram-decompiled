package X;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.Modifier;

/* renamed from: X.GRb  reason: case insensitive filesystem */
public final class C52401GRb extends C287475aC implements C288845ca {
    public final C305376Hq A00;
    public final AndroidEdgeEffectOverscrollEffect A01;
    public final AnonymousClass6Ht A02;

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (r1 != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d7, code lost:
        if (r1 != false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        if (A00(r4, r8, 180.0f, X.C289325dP.A00(-X.C288025bF.A02(r6), (-X.C288025bF.A00(r6)) + r3)) == false) goto L_0x0117;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQM(X.AnonymousClass5Q4 r10) {
        /*
            r9 = this;
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r2 = r9.A01
            long r0 = r10.Bwg()
            r2.A06(r0)
            long r0 = r10.Bwg()
            boolean r0 = X.C288025bF.A04(r0)
            if (r0 == 0) goto L_0x0017
            r10.AQW()
        L_0x0016:
            return
        L_0x0017:
            r10.AQW()
            X.5Oz r5 = r2.A05
            r5.getValue()
            X.5QA r0 = X.G9t.A0r(r10)
            android.graphics.Canvas r4 = X.AnonymousClass5R4.A00(r0)
            X.6Ht r3 = r9.A02
            android.widget.EdgeEffect r0 = r3.A03
            if (r0 == 0) goto L_0x0126
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0126
            android.widget.EdgeEffect r7 = r3.A03
            if (r7 != 0) goto L_0x003f
            android.widget.EdgeEffect r7 = X.AnonymousClass6Ht.A00(r3)
            r3.A03 = r7
        L_0x003f:
            float r0 = X.C51969G9p.A01(r10)
            float r6 = -r0
            X.6Hq r0 = r9.A00
            X.6Fk r2 = r0.A01
            X.5Q8 r1 = r10.getLayoutDirection()
            X.6Fj r2 = (X.C304826Fj) r2
            X.5Q8 r0 = X.AnonymousClass5Q8.Ltr
            if (r1 != r0) goto L_0x0122
            float r0 = r2.A02
        L_0x0054:
            float r0 = r10.F06(r0)
            long r1 = X.C289325dP.A00(r6, r0)
            r0 = 1132920832(0x43870000, float:270.0)
            boolean r0 = A00(r4, r7, r0, r1)
        L_0x0062:
            android.widget.EdgeEffect r1 = r3.A07
            if (r1 == 0) goto L_0x0094
            boolean r1 = r1.isFinished()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0094
            android.widget.EdgeEffect r7 = r3.A07
            if (r7 != 0) goto L_0x0078
            android.widget.EdgeEffect r7 = X.AnonymousClass6Ht.A00(r3)
            r3.A07 = r7
        L_0x0078:
            X.6Hq r1 = r9.A00
            X.6Fk r1 = r1.A01
            X.6Fj r1 = (X.C304826Fj) r1
            float r1 = r1.A03
            float r1 = r10.F06(r1)
            r6 = 0
            long r1 = X.C289325dP.A00(r6, r1)
            boolean r1 = A00(r4, r7, r6, r1)
            if (r1 != 0) goto L_0x0093
            r1 = r0
            r0 = 0
            if (r1 == 0) goto L_0x0094
        L_0x0093:
            r0 = 1
        L_0x0094:
            android.widget.EdgeEffect r1 = r3.A05
            if (r1 == 0) goto L_0x00da
            boolean r1 = r1.isFinished()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00da
            android.widget.EdgeEffect r7 = r3.A05
            if (r7 != 0) goto L_0x00aa
            android.widget.EdgeEffect r7 = X.AnonymousClass6Ht.A00(r3)
            r3.A05 = r7
        L_0x00aa:
            float r1 = X.C51969G9p.A00(r10)
            int r8 = X.AnonymousClass1GB.A01(r1)
            X.6Hq r1 = r9.A00
            X.6Fk r6 = r1.A01
            X.5Q8 r2 = r10.getLayoutDirection()
            X.6Fj r6 = (X.C304826Fj) r6
            X.5Q8 r1 = X.AnonymousClass5Q8.Ltr
            if (r2 != r1) goto L_0x011f
            float r2 = r6.A01
        L_0x00c2:
            float r1 = (float) r8
            float r1 = -r1
            float r2 = X.C51966G9m.A00(r10, r2, r1)
            r1 = 0
            long r1 = X.C289325dP.A00(r1, r2)
            r6 = 1119092736(0x42b40000, float:90.0)
            boolean r1 = A00(r4, r7, r6, r1)
            if (r1 != 0) goto L_0x00d9
            r1 = r0
            r0 = 0
            if (r1 == 0) goto L_0x00da
        L_0x00d9:
            r0 = 1
        L_0x00da:
            android.widget.EdgeEffect r1 = r3.A01
            if (r1 == 0) goto L_0x0117
            boolean r1 = r1.isFinished()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0117
            android.widget.EdgeEffect r8 = r3.A01
            if (r8 != 0) goto L_0x00f0
            android.widget.EdgeEffect r8 = X.AnonymousClass6Ht.A00(r3)
            r3.A01 = r8
        L_0x00f0:
            X.6Hq r1 = r9.A00
            X.6Fk r1 = r1.A01
            X.6Fj r1 = (X.C304826Fj) r1
            float r1 = r1.A00
            float r3 = r10.F06(r1)
            long r6 = r10.Bwg()
            float r1 = X.C288025bF.A02(r6)
            float r2 = -r1
            float r1 = X.C288025bF.A00(r6)
            float r1 = -r1
            float r1 = r1 + r3
            long r1 = X.C289325dP.A00(r2, r1)
            r3 = 1127481344(0x43340000, float:180.0)
            boolean r1 = A00(r4, r8, r3, r1)
            if (r1 != 0) goto L_0x0119
        L_0x0117:
            if (r0 == 0) goto L_0x0016
        L_0x0119:
            X.0gF r0 = X.C60340gF.A00
            r5.Epw(r0)
            return
        L_0x011f:
            float r2 = r6.A02
            goto L_0x00c2
        L_0x0122:
            float r0 = r2.A01
            goto L_0x0054
        L_0x0126:
            r0 = 0
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52401GRb.AQM(X.5Q4):void");
    }

    public C52401GRb(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, AnonymousClass6Ht r2, C305376Hq r3, 0sP r4) {
        super(r4);
        this.A01 = androidEdgeEffectOverscrollEffect;
        this.A02 = r2;
        this.A00 = r3;
    }

    public static final boolean A00(Canvas canvas, EdgeEffect edgeEffect, float f, long j) {
        int save = canvas.save();
        canvas.rotate(f);
        canvas.translate(C289295dM.A01(j), C289295dM.A02(j));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }
}
