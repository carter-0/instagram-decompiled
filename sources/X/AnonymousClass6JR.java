package X;

import android.graphics.RenderNode;
import androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect;
import androidx.compose.ui.Modifier;

/* renamed from: X.6JR  reason: invalid class name */
public final class AnonymousClass6JR extends C287475aC implements C288845ca {
    public RenderNode A00;
    public final AnonymousClass6Ht A01;
    public final AndroidEdgeEffectOverscrollEffect A02;

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        if (X.AnonymousClass6Ht.A01(r4.A02) != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008d, code lost:
        if (X.AnonymousClass6Ht.A01(r4.A06) != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0182, code lost:
        if (r5 != false) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fa, code lost:
        if (r5 != false) goto L_0x01fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQM(X.AnonymousClass5Q4 r20) {
        /*
            r19 = this;
            r15 = r19
            androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect r3 = r15.A02
            r18 = r20
            long r0 = r18.Bwg()
            r3.A06(r0)
            long r0 = r18.Bwg()
            boolean r0 = X.C288025bF.A04(r0)
            if (r0 != 0) goto L_0x0352
            X.5Oz r2 = r3.A05
            r2.getValue()
            androidx.compose.ui.Modifier r0 = X.C305396Hu.A00
            r1 = 1106247680(0x41f00000, float:30.0)
            r0 = r18
            float r14 = r0.F06(r1)
            X.5QD r13 = r18.Ayw()
            r12 = r13
            X.5QC r12 = (X.AnonymousClass5QC) r12
            X.5Q5 r0 = r12.A02
            X.5QB r1 = r0.A02
            X.5QA r0 = r1.A01
            android.graphics.Canvas r11 = X.AnonymousClass5R4.A00(r0)
            X.6Ht r4 = r15.A01
            android.widget.EdgeEffect r0 = r4.A07
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0063
        L_0x0045:
            android.widget.EdgeEffect r0 = r4.A08
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 != 0) goto L_0x0063
            android.widget.EdgeEffect r0 = r4.A01
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0063
        L_0x0059:
            android.widget.EdgeEffect r0 = r4.A02
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            r17 = 0
            if (r0 == 0) goto L_0x0065
        L_0x0063:
            r17 = 1
        L_0x0065:
            android.widget.EdgeEffect r0 = r4.A03
            if (r0 == 0) goto L_0x0071
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x008f
        L_0x0071:
            android.widget.EdgeEffect r0 = r4.A04
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 != 0) goto L_0x008f
            android.widget.EdgeEffect r0 = r4.A05
            if (r0 == 0) goto L_0x0085
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x008f
        L_0x0085:
            android.widget.EdgeEffect r0 = r4.A06
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            r16 = 0
            if (r0 == 0) goto L_0x0091
        L_0x008f:
            r16 = 1
        L_0x0091:
            r7 = 0
            if (r17 == 0) goto L_0x02cf
            android.graphics.RenderNode r6 = r15.A00
            if (r6 != 0) goto L_0x00a1
            java.lang.String r0 = "AndroidEdgeEffectOverscrollEffect"
            android.graphics.RenderNode r6 = new android.graphics.RenderNode
            r6.<init>(r0)
            r15.A00 = r6
        L_0x00a1:
            int r8 = r11.getWidth()
            if (r16 != 0) goto L_0x00ae
            int r0 = X.AnonymousClass1GB.A01(r14)
            int r0 = r0 * 2
            int r8 = r8 + r0
        L_0x00ae:
            int r5 = r11.getHeight()
        L_0x00b2:
            r6.setPosition(r7, r7, r8, r5)
            android.graphics.RenderNode r5 = r15.A00
            if (r5 != 0) goto L_0x00c2
            java.lang.String r0 = "AndroidEdgeEffectOverscrollEffect"
            android.graphics.RenderNode r5 = new android.graphics.RenderNode
            r5.<init>(r0)
            r15.A00 = r5
        L_0x00c2:
            android.graphics.RecordingCanvas r8 = r5.beginRecording()
            android.widget.EdgeEffect r0 = r4.A04
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 == 0) goto L_0x00ed
            android.widget.EdgeEffect r9 = r4.A04
            if (r9 != 0) goto L_0x00d8
            android.widget.EdgeEffect r9 = X.AnonymousClass6Ht.A00(r4)
            r4.A04 = r9
        L_0x00d8:
            r6 = r8
            android.graphics.Canvas r6 = (android.graphics.Canvas) r6
            r5 = 1119092736(0x42b40000, float:90.0)
            int r0 = r6.save()
            r6.rotate(r5)
            r9.draw(r6)
            r6.restoreToCount(r0)
            r9.finish()
        L_0x00ed:
            android.widget.EdgeEffect r0 = r4.A03
            if (r0 == 0) goto L_0x02cc
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x02cc
            android.widget.EdgeEffect r0 = r4.A03
            if (r0 != 0) goto L_0x0103
            android.widget.EdgeEffect r0 = X.AnonymousClass6Ht.A00(r4)
            r4.A03 = r0
        L_0x0103:
            r9 = r8
            android.graphics.Canvas r9 = (android.graphics.Canvas) r9
            r6 = 1132920832(0x43870000, float:270.0)
            int r5 = r9.save()
            r9.rotate(r6)
            boolean r10 = r0.draw(r9)
            r9.restoreToCount(r5)
            android.widget.EdgeEffect r5 = r4.A03
            boolean r5 = X.AnonymousClass6Ht.A01(r5)
            if (r5 == 0) goto L_0x013a
            long r5 = r3.A05()
            float r9 = X.C289295dM.A02(r5)
            android.widget.EdgeEffect r6 = r4.A04
            if (r6 != 0) goto L_0x0130
            android.widget.EdgeEffect r6 = X.AnonymousClass6Ht.A00(r4)
            r4.A04 = r6
        L_0x0130:
            float r5 = X.XE2.A00(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r9
            X.XE2.A01(r6, r5, r0)
        L_0x013a:
            android.widget.EdgeEffect r0 = r4.A08
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 == 0) goto L_0x0161
            android.widget.EdgeEffect r9 = r4.A08
            if (r9 != 0) goto L_0x014c
            android.widget.EdgeEffect r9 = X.AnonymousClass6Ht.A00(r4)
            r4.A08 = r9
        L_0x014c:
            r6 = r8
            android.graphics.Canvas r6 = (android.graphics.Canvas) r6
            r5 = 1127481344(0x43340000, float:180.0)
            int r0 = r6.save()
            r6.rotate(r5)
            r9.draw(r6)
            r6.restoreToCount(r0)
            r9.finish()
        L_0x0161:
            android.widget.EdgeEffect r0 = r4.A07
            if (r0 == 0) goto L_0x01a6
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01a6
            android.widget.EdgeEffect r0 = r4.A07
            if (r0 != 0) goto L_0x0177
            android.widget.EdgeEffect r0 = X.AnonymousClass6Ht.A00(r4)
            r4.A07 = r0
        L_0x0177:
            r5 = r8
            android.graphics.Canvas r5 = (android.graphics.Canvas) r5
            boolean r5 = r0.draw(r5)
            if (r5 != 0) goto L_0x0184
            r5 = r10
            r10 = 0
            if (r5 == 0) goto L_0x0185
        L_0x0184:
            r10 = 1
        L_0x0185:
            android.widget.EdgeEffect r5 = r4.A07
            boolean r5 = X.AnonymousClass6Ht.A01(r5)
            if (r5 == 0) goto L_0x01a6
            long r5 = r3.A05()
            float r6 = X.C289295dM.A01(r5)
            android.widget.EdgeEffect r5 = r4.A08
            if (r5 != 0) goto L_0x019f
            android.widget.EdgeEffect r5 = X.AnonymousClass6Ht.A00(r4)
            r4.A08 = r5
        L_0x019f:
            float r0 = X.XE2.A00(r0)
            X.XE2.A01(r5, r0, r6)
        L_0x01a6:
            android.widget.EdgeEffect r0 = r4.A06
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 == 0) goto L_0x01cd
            android.widget.EdgeEffect r9 = r4.A06
            if (r9 != 0) goto L_0x01b8
            android.widget.EdgeEffect r9 = X.AnonymousClass6Ht.A00(r4)
            r4.A06 = r9
        L_0x01b8:
            r6 = r8
            android.graphics.Canvas r6 = (android.graphics.Canvas) r6
            r5 = 1132920832(0x43870000, float:270.0)
            int r0 = r6.save()
            r6.rotate(r5)
            r9.draw(r6)
            r6.restoreToCount(r0)
            r9.finish()
        L_0x01cd:
            android.widget.EdgeEffect r0 = r4.A05
            if (r0 == 0) goto L_0x021e
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x021e
            android.widget.EdgeEffect r0 = r4.A05
            if (r0 != 0) goto L_0x01e3
            android.widget.EdgeEffect r0 = X.AnonymousClass6Ht.A00(r4)
            r4.A05 = r0
        L_0x01e3:
            r9 = r8
            android.graphics.Canvas r9 = (android.graphics.Canvas) r9
            r5 = 1119092736(0x42b40000, float:90.0)
            int r6 = r9.save()
            r9.rotate(r5)
            boolean r5 = r0.draw(r9)
            r9.restoreToCount(r6)
            if (r5 != 0) goto L_0x01fc
            r5 = r10
            r10 = 0
            if (r5 == 0) goto L_0x01fd
        L_0x01fc:
            r10 = 1
        L_0x01fd:
            android.widget.EdgeEffect r5 = r4.A05
            boolean r5 = X.AnonymousClass6Ht.A01(r5)
            if (r5 == 0) goto L_0x021e
            long r5 = r3.A05()
            float r6 = X.C289295dM.A02(r5)
            android.widget.EdgeEffect r5 = r4.A06
            if (r5 != 0) goto L_0x0217
            android.widget.EdgeEffect r5 = X.AnonymousClass6Ht.A00(r4)
            r4.A06 = r5
        L_0x0217:
            float r0 = X.XE2.A00(r0)
            X.XE2.A01(r5, r0, r6)
        L_0x021e:
            android.widget.EdgeEffect r0 = r4.A02
            boolean r0 = X.AnonymousClass6Ht.A01(r0)
            if (r0 == 0) goto L_0x0239
            android.widget.EdgeEffect r5 = r4.A02
            if (r5 != 0) goto L_0x0230
            android.widget.EdgeEffect r5 = X.AnonymousClass6Ht.A00(r4)
            r4.A02 = r5
        L_0x0230:
            r0 = r8
            android.graphics.Canvas r0 = (android.graphics.Canvas) r0
            r5.draw(r0)
            r5.finish()
        L_0x0239:
            android.widget.EdgeEffect r0 = r4.A01
            if (r0 == 0) goto L_0x028c
            boolean r0 = r0.isFinished()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x028c
            android.widget.EdgeEffect r0 = r4.A01
            if (r0 != 0) goto L_0x024f
            android.widget.EdgeEffect r0 = X.AnonymousClass6Ht.A00(r4)
            r4.A01 = r0
        L_0x024f:
            r9 = r8
            android.graphics.Canvas r9 = (android.graphics.Canvas) r9
            r5 = 1127481344(0x43340000, float:180.0)
            int r6 = r9.save()
            r9.rotate(r5)
            boolean r5 = r0.draw(r9)
            r9.restoreToCount(r6)
            if (r5 != 0) goto L_0x0266
            if (r10 == 0) goto L_0x0267
        L_0x0266:
            r7 = 1
        L_0x0267:
            android.widget.EdgeEffect r5 = r4.A01
            boolean r5 = X.AnonymousClass6Ht.A01(r5)
            if (r5 == 0) goto L_0x028b
            long r5 = r3.A05()
            float r6 = X.C289295dM.A01(r5)
            android.widget.EdgeEffect r5 = r4.A02
            if (r5 != 0) goto L_0x0281
            android.widget.EdgeEffect r5 = X.AnonymousClass6Ht.A00(r4)
            r4.A02 = r5
        L_0x0281:
            float r3 = X.XE2.A00(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            X.XE2.A01(r5, r3, r0)
        L_0x028b:
            r10 = r7
        L_0x028c:
            if (r10 == 0) goto L_0x0293
            X.0gF r0 = X.C60340gF.A00
            r2.Epw(r0)
        L_0x0293:
            r10 = r14
            if (r16 == 0) goto L_0x0297
            r10 = 0
        L_0x0297:
            if (r17 == 0) goto L_0x029a
            r14 = 0
        L_0x029a:
            X.5Q8 r16 = r18.getLayoutDirection()
            android.graphics.Canvas r8 = (android.graphics.Canvas) r8
            X.5R3 r9 = new X.5R3
            r9.<init>()
            r9.A00 = r8
            long r5 = r18.Bwg()
            X.4cd r8 = r1.A02
            X.5Q8 r7 = r1.A03
            X.5QA r4 = r1.A01
            long r2 = r1.A00
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = r12.A00
            r0 = r18
            r13.EUC(r0)
            r0 = r16
            r13.Ebv(r0)
            r13.ER3(r9)
            r13.ElR(r5)
            r0 = 0
            r12.A00 = r0
            r9.EJt()
            goto L_0x02ef
        L_0x02cc:
            r10 = 0
            goto L_0x013a
        L_0x02cf:
            if (r16 == 0) goto L_0x0352
            android.graphics.RenderNode r6 = r15.A00
            if (r6 != 0) goto L_0x02de
            java.lang.String r0 = "AndroidEdgeEffectOverscrollEffect"
            android.graphics.RenderNode r6 = new android.graphics.RenderNode
            r6.<init>(r0)
            r15.A00 = r6
        L_0x02de:
            int r8 = r11.getWidth()
            int r5 = r11.getHeight()
            int r0 = X.AnonymousClass1GB.A01(r14)
            int r0 = r0 * 2
            int r5 = r5 + r0
            goto L_0x00b2
        L_0x02ef:
            X.5QF r6 = r12.A01     // Catch:{ all -> 0x033f }
            r6.FHv(r10, r14)     // Catch:{ all -> 0x033f }
            r18.AQW()     // Catch:{ all -> 0x0338 }
            float r5 = -r10
            float r10 = -r14
            r6.FHv(r5, r10)     // Catch:{ all -> 0x033f }
            r9.EIm()
            r13.EUC(r8)
            r13.Ebv(r7)
            r13.ER3(r4)
            r13.ElR(r2)
            r12.A00 = r1
            android.graphics.RenderNode r1 = r15.A00
            if (r1 != 0) goto L_0x031a
            java.lang.String r0 = "AndroidEdgeEffectOverscrollEffect"
            android.graphics.RenderNode r1 = new android.graphics.RenderNode
            r1.<init>(r0)
            r15.A00 = r1
        L_0x031a:
            r1.endRecording()
            int r2 = r11.save()
            r11.translate(r5, r10)
            android.graphics.RenderNode r1 = r15.A00
            if (r1 != 0) goto L_0x0331
            java.lang.String r0 = "AndroidEdgeEffectOverscrollEffect"
            android.graphics.RenderNode r1 = new android.graphics.RenderNode
            r1.<init>(r0)
            r15.A00 = r1
        L_0x0331:
            r11.drawRenderNode(r1)
            r11.restoreToCount(r2)
            return
        L_0x0338:
            r11 = move-exception
            float r5 = -r10
            float r0 = -r14
            r6.FHv(r5, r0)     // Catch:{ all -> 0x033f }
            throw r11     // Catch:{ all -> 0x033f }
        L_0x033f:
            r0 = move-exception
            r9.EIm()
            r13.EUC(r8)
            r13.Ebv(r7)
            r13.ER3(r4)
            r13.ElR(r2)
            r12.A00 = r1
            throw r0
        L_0x0352:
            r18.AQW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6JR.AQM(X.5Q4):void");
    }

    public AnonymousClass6JR(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, AnonymousClass6Ht r2, 0sP r3) {
        super(r3);
        this.A02 = androidEdgeEffectOverscrollEffect;
        this.A01 = r2;
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }
}
