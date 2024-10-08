package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Tut  reason: case insensitive filesystem */
public final class C14364Tut {
    public final int A00;
    public final Activity A01;
    public final UserSession A02;
    public final C14367Tuw A03;
    public final C14365Tuu A04;
    public final C14366Tuv A05;

    public C14364Tut(Activity activity, AnonymousClass0iw r3, UserSession userSession, C14363Tus tus, int i) {
        0qQ.A0B(userSession, 2);
        this.A01 = activity;
        this.A02 = userSession;
        this.A00 = i;
        this.A04 = new C14365Tuu(tus);
        this.A05 = new C14366Tuv(r3, userSession);
        this.A03 = new C14367Tuw(activity, tus);
    }

    /* JADX WARNING: type inference failed for: r12v8, types: [com.instagram.igds.components.imagebutton.IgImageButton] */
    /* JADX WARNING: type inference failed for: r0v104, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r24 = this;
            r1 = r24
            X.Tuu r9 = r1.A04
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r9.A00
            r2 = 1
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x031c
            long r7 = r7 - r5
            r3 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x031c
            X.UlO r3 = new X.UlO
            r3.<init>(r2)
        L_0x001d:
            boolean r0 = r3 instanceof X.UlO
            if (r0 == 0) goto L_0x003f
            X.UlO r3 = (X.UlO) r3
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x003e
        L_0x0027:
            X.6ap r2 = new X.6ap
            r2.<init>()
            android.app.Activity r1 = r1.A01
            r0 = 2131964470(0x7f133236, float:1.9565723E38)
            X.DbS.A19(r1, r2, r0)
            r2.A05()
            java.lang.String r0 = "invalid_explore_grid_error"
            r2.A0H = r0
            X.DbY.A1N(r2)
        L_0x003e:
            return
        L_0x003f:
            boolean r0 = r3 instanceof X.UlP
            if (r0 == 0) goto L_0x0396
            X.Tuv r5 = r1.A05
            X.0iw r3 = r5.A00
            r0 = 43
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0xI r4 = X.0xI.A00(r3, r0)
            java.lang.String r3 = X.DbS.A0k()
            java.lang.String r0 = "nav_chain"
            r4.A0C(r0, r3)
            com.instagram.common.session.UserSession r0 = r5.A01
            X.DbU.A1R(r4, r0)
            X.Tuw r8 = r1.A03
            X.Tus r0 = r8.A01
            X.32L r0 = r0.A00
            r23 = r0
            X.TpO r0 = r0.A06
            if (r0 == 0) goto L_0x039c
            com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView r3 = r0.A04
            if (r3 == 0) goto L_0x0027
            X.3pI r9 = r3.A0D
            boolean r0 = r9 instanceof com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager
            if (r0 == 0) goto L_0x0027
            com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager r9 = (com.instagram.common.ui.widget.recyclerview.flow.FlowingGridLayoutManager) r9
            if (r9 == 0) goto L_0x0027
            android.app.Activity r0 = r8.A00
            r22 = r0
            int r6 = r9.A1a()
            int r5 = r6 + 12
        L_0x0083:
            if (r6 >= r5) goto L_0x0027
            X.3kE r4 = r3.A0W(r6)
            if (r4 == 0) goto L_0x0318
            boolean r0 = r4 instanceof X.C52532GWj
            if (r0 == 0) goto L_0x0318
            android.view.View r0 = r4.itemView
            int r0 = r0.getHeight()
            int r6 = r0 * 4
            int r0 = X.C13989Tnp.A0B(r22)
            int r0 = r0 * 3
            int r6 = r6 + r0
            r4 = -1
            if (r6 == r4) goto L_0x0027
            int r5 = r3.getWidth()
            android.graphics.Bitmap$Config r19 = android.graphics.Bitmap.Config.ARGB_8888
            r0 = r19
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r5, r6, r0)
            X.0qQ.A07(r5)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r5)
            r6 = 2131100052(0x7f060194, float:1.7812475E38)
            r0 = r22
            int r0 = r0.getColor(r6)
            r7.drawColor(r0)
            int r12 = r9.A1a()
            if (r12 == r4) goto L_0x0027
            X.Tux r0 = r8.A02
            X.Tus r0 = r0.A00
            X.32L r0 = r0.A00
            X.0eM r0 = r0.A0q
            java.lang.Object r0 = r0.getValue()
            X.GWW r0 = (X.GWW) r0
            X.GWV r0 = r0.A01
            java.util.List r10 = r0.A03
            java.util.Iterator r14 = r10.iterator()
            r11 = 0
            r13 = -1
        L_0x00df:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0315
            int r8 = r11 + 1
            java.lang.Object r0 = r14.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            java.util.Iterator r6 = r0.iterator()
        L_0x00f3:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0312
            r6.next()
            int r13 = r13 + 1
            if (r12 != r13) goto L_0x00f3
        L_0x0100:
            java.util.Iterator r17 = r10.iterator()
            r13 = -1
            r8 = 0
        L_0x0106:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x016f
            int r16 = r8 + 1
            java.lang.Object r0 = r17.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            java.util.Iterator r15 = r0.iterator()
        L_0x011a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x030e
            java.lang.Object r14 = r15.next()
            X.5qt r14 = (X.C296935qt) r14
            int r13 = r13 + 1
            X.3kE r0 = r3.A0W(r13)
            if (r0 == 0) goto L_0x030b
            android.view.View r6 = r0.itemView
        L_0x0130:
            X.5qq r0 = r14.A02
            int r0 = r0.A04
            if (r0 <= r2) goto L_0x0307
            if (r8 != r11) goto L_0x0307
            if (r6 == 0) goto L_0x0307
            int r6 = r6.getTop()
            int r0 = r3.getTop()
            if (r6 >= r0) goto L_0x0307
            r8 = -1
            java.util.Iterator r14 = r10.iterator()
            r10 = 0
        L_0x014a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x016f
            int r13 = r10 + 1
            java.lang.Object r0 = r14.next()
            X.5r0 r0 = (X.C297005r0) r0
            java.util.List r0 = r0.A02
            java.util.Iterator r6 = r0.iterator()
        L_0x015e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0304
            r6.next()
            int r8 = r8 + 1
            int r0 = r11 + 1
            if (r10 == r0) goto L_0x0170
            if (r10 <= r0) goto L_0x015e
        L_0x016f:
            r8 = r12
        L_0x0170:
            android.view.View r0 = r9.A1D(r8)
            if (r0 == 0) goto L_0x0027
            int r0 = r0.getTop()
            float r6 = (float) r0
            r0 = 0
            r18 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r6 * r18
            r7.translate(r0, r6)
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            int r16 = r8 + 12
            r6 = r8
        L_0x018b:
            r0 = r16
            if (r6 >= r0) goto L_0x0366
            X.3kE r9 = r3.A0W(r6)
            if (r9 == 0) goto L_0x02fe
            android.view.View r12 = r9.itemView
            if (r12 == 0) goto L_0x02fe
            r14 = 0
            boolean r0 = r9 instanceof X.C52532GWj
            if (r0 == 0) goto L_0x01a7
            r0 = r9
            X.GWj r0 = (X.C52532GWj) r0
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r0.A00
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x0027
        L_0x01a7:
            boolean r0 = r9 instanceof X.C67362Mme
            if (r0 == 0) goto L_0x01b6
            r0 = r9
            X.Mme r0 = (X.C67362Mme) r0
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r0.A07
            boolean r0 = r0.A0N
            if (r0 != 0) goto L_0x01b6
            goto L_0x0027
        L_0x01b6:
            boolean r0 = r9 instanceof X.C67321Mlv
            if (r0 != 0) goto L_0x0027
            boolean r0 = r9 instanceof X.C20976X7p
            if (r0 == 0) goto L_0x01c8
            r0 = r9
            X.X7p r0 = (X.C20976X7p) r0
            com.instagram.igds.components.imagebutton.IgImageButton r0 = r0.BGE()
            r0.setVisibility(r14)
        L_0x01c8:
            int r0 = r12.getLeft()
            float r0 = (float) r0
            r21 = r0
            int r0 = r12.getTop()
            float r10 = (float) r0
            if (r6 != r8) goto L_0x01d8
            r18 = r10
        L_0x01d8:
            boolean r0 = r9 instanceof X.C14906UEl
            if (r0 == 0) goto L_0x01e0
            X.UEl r9 = (X.C14906UEl) r9
            com.instagram.igds.components.imagebutton.IgImageButton r12 = r9.A0G
        L_0x01e0:
            int r9 = r12.getBottom()
            int r0 = r3.getHeight()
            if (r9 > r0) goto L_0x01f4
            int r9 = r12.getTop()
            int r0 = r3.getTop()
            if (r9 >= r0) goto L_0x0208
        L_0x01f4:
            int r13 = r12.getWidth()
            int r11 = r12.getHeight()
            r9 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r9)
            X.C13988Tno.A11(r12, r11, r9, r0)
            r12.layout(r14, r14, r13, r11)
        L_0x0208:
            int r11 = r12.getWidth()
            int r9 = r12.getHeight()
            r0 = r19
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r11, r9, r0)
            X.0qQ.A07(r11)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r11)
            r12.draw(r0)
            r0 = r23
            X.0eM r0 = r0.A0q
            r20 = r0
            java.lang.Object r0 = r20.getValue()
            X.GWW r0 = (X.GWW) r0
            X.GWV r0 = r0.A01
            java.util.List r0 = r0.A02
            java.lang.Object r12 = r0.get(r6)
            X.5qt r12 = (X.C296935qt) r12
            boolean r0 = r12 instanceof X.C296965qw
            r9 = 0
            if (r0 == 0) goto L_0x0250
            X.5qw r12 = (X.C296965qw) r12
            X.1Xj r0 = r12.BPf()
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r0)
            if (r0 == 0) goto L_0x0250
            java.lang.Boolean r0 = r0.A0K()
            boolean r9 = X.AnonymousClass7TF.A1Y(r0, r2)
        L_0x0250:
            if (r9 == 0) goto L_0x0298
            r9 = 1036831949(0x3dcccccd, float:0.1)
            r0 = 6
            android.graphics.Bitmap r11 = com.instagram.common.ui.blur.BlurUtil.blur(r11, r9, r0)
            r9 = 2131238269(0x7f081d7d, float:1.8092812E38)
            r0 = r22
            android.graphics.drawable.Drawable r15 = r0.getDrawable(r9)
            if (r15 == 0) goto L_0x0298
            int r9 = r11.getWidth()
            int r0 = r15.getIntrinsicWidth()
            int r9 = r9 - r0
            int r14 = r9 / 2
            int r9 = r11.getHeight()
            int r0 = r15.getIntrinsicHeight()
            int r9 = r9 - r0
            int r13 = r9 / 2
            android.graphics.Canvas r12 = new android.graphics.Canvas
            r12.<init>(r11)
            r15.mutate()
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r15.setColorFilter(r4, r0)
            int r9 = r15.getIntrinsicWidth()
            int r9 = r9 + r14
            int r0 = r15.getIntrinsicHeight()
            int r0 = r0 + r13
            r15.setBounds(r14, r13, r9, r0)
            r15.draw(r12)
        L_0x0298:
            r9 = 0
            r0 = r21
            r7.drawBitmap(r11, r0, r10, r9)
            java.lang.Object r0 = r20.getValue()
            X.GWW r0 = (X.GWW) r0
            X.GWV r0 = r0.A01
            java.util.List r0 = r0.A02
            java.lang.Object r9 = r0.get(r6)
            X.5qt r9 = (X.C296935qt) r9
            boolean r0 = r9 instanceof X.C296965qw
            if (r0 == 0) goto L_0x02fe
            X.5qw r9 = (X.C296965qw) r9
            X.1Xj r0 = r9.BPf()
            java.lang.String r11 = r0.A2n()
            if (r11 == 0) goto L_0x02fe
            int r0 = r11.length()
            if (r0 == 0) goto L_0x02fe
            float r10 = r10 - r18
            int r0 = r5.getHeight()
            float r0 = (float) r0
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r12 = X.C51970G9q.A1T(r0)
            java.lang.Object r9 = r20.getValue()
            X.GWW r9 = (X.GWW) r9
            X.GWV r0 = r9.A01
            java.util.List r0 = r0.A02
            java.lang.Object r10 = r0.get(r6)
            X.5qt r10 = (X.C296935qt) r10
            boolean r0 = r10 instanceof X.C296965qw
            if (r0 == 0) goto L_0x0302
            com.instagram.common.session.UserSession r0 = r9.A00
            X.1se r9 = X.1sd.A00(r0)
            X.5qw r10 = (X.C296965qw) r10
            X.1Xj r0 = r10.BPf()
            boolean r0 = r9.A05(r0)
        L_0x02f5:
            if (r12 == 0) goto L_0x02fe
            if (r0 != 0) goto L_0x02fe
            r0 = r17
            r0.add(r11)
        L_0x02fe:
            int r6 = r6 + 1
            goto L_0x018b
        L_0x0302:
            r0 = 0
            goto L_0x02f5
        L_0x0304:
            r10 = r13
            goto L_0x014a
        L_0x0307:
            if (r8 <= r11) goto L_0x011a
            goto L_0x016f
        L_0x030b:
            r6 = 0
            goto L_0x0130
        L_0x030e:
            r8 = r16
            goto L_0x0106
        L_0x0312:
            r11 = r8
            goto L_0x00df
        L_0x0315:
            r11 = -1
            goto L_0x0100
        L_0x0318:
            int r6 = r6 + 1
            goto L_0x0083
        L_0x031c:
            long r3 = java.lang.System.currentTimeMillis()
            r9.A00 = r3
            X.Tus r0 = r9.A01
            X.32L r5 = r0.A00
            X.TpO r3 = r5.A06
            if (r3 == 0) goto L_0x039c
            X.TsA r0 = r3.A0E
            X.Uiv[] r0 = r0.A06
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r4 = 0
            if (r0 != 0) goto L_0x035f
            com.instagram.discovery.recyclerview.ui.DiscoveryRecyclerView r3 = r3.A04
            if (r3 == 0) goto L_0x035f
            X.2Rw r0 = r3.A0A
            if (r0 == 0) goto L_0x035f
            int r0 = r0.getItemCount()
            if (r0 == 0) goto L_0x035f
            int r0 = r3.getChildCount()
            if (r0 == 0) goto L_0x035f
            X.0eM r0 = r5.A0q
            java.lang.Object r0 = r0.getValue()
            X.GWW r0 = (X.GWW) r0
            X.GWV r0 = r0.A01
            java.util.List r0 = r0.A03
            int r0 = r0.size()
            if (r0 <= r2) goto L_0x035f
            X.UlP r3 = X.UlP.A00
            goto L_0x001d
        L_0x035f:
            X.UlO r3 = new X.UlO
            r3.<init>(r4)
            goto L_0x001d
        L_0x0366:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = X.C363878kU.A00(r2)
            X.0qQ.A07(r0)
            com.instagram.common.session.UserSession r8 = r1.A02
            java.lang.String r6 = X.2RR.A03(r8, r0)
            android.app.Activity r7 = r1.A01
            r3 = 0
            java.lang.String r2 = X.2RR.A02(r7, r3)
            r0 = 0
            java.io.File r0 = X.C364678lo.A04(r5, r8, r2, r6, r0)
            java.lang.String r6 = r0.getCanonicalPath()
            java.lang.String r3 = X.2RR.A02(r7, r3)
            X.WTC r2 = new X.WTC
            r0 = r17
            r2.<init>(r5, r1, r6, r0)
            X.LTL.A03(r7, r5, r2, r3, r4)
            return
        L_0x0396:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x039c:
            X.C13988Tno.A0n()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14364Tut.A00():void");
    }
}
