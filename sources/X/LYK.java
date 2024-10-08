package X;

import android.view.View;
import java.util.AbstractCollection;
import java.util.Iterator;

public final class LYK implements View.OnDragListener {
    public final View A00;
    public final LBF A01;

    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02ce, code lost:
        r8 = r6.A07;
        r8.A00 = 10;
        r8.A01.postOnAnimationDelayed(r8, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x046d, code lost:
        if (r6 >= r7) goto L_0x046f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDrag(android.view.View r20, android.view.DragEvent r21) {
        /*
            r19 = this;
            if (r21 == 0) goto L_0x014d
            int r0 = r21.getAction()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x000a:
            r11 = 1
            if (r0 == 0) goto L_0x0083
            int r2 = r0.intValue()
            r4 = r19
            if (r2 != r11) goto L_0x0084
            X.LBF r5 = r4.A01
            r21.getX()
            r21.getY()
            android.view.View r4 = r5.A01
            if (r4 == 0) goto L_0x0044
            android.view.View r3 = r5.A03
            if (r3 == 0) goto L_0x0044
            android.content.res.Resources r2 = X.DbU.A05(r4)
            int r1 = r4.getWidth()
            int r0 = r4.getHeight()
            android.graphics.Bitmap r1 = X.AnonymousClass7TF.A0B(r1, r0)
            android.graphics.Canvas r0 = X.JTO.A0B(r1)
            r4.draw(r0)
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r2, r1)
            r3.setBackground(r0)
        L_0x0044:
            X.LGg r0 = r5.A02
            if (r0 == 0) goto L_0x0083
            X.KMu r4 = r0.A0A
            X.LTY r0 = r4.A01
            X.0eP r1 = r0.A04
            X.0eP r0 = X.LTY.A0C
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 == 0) goto L_0x0079
            X.LTY r3 = r4.A01
            int r2 = X.JTR.A0E(r3)
            X.05G r1 = r4.A0E
            X.KgT r0 = X.C62478KgT.Dragging
            r1.Epw(r0)
            int r0 = X.JTQ.A04(r3, r2)
            if (r0 <= r11) goto L_0x0076
            r3.A0M()
            X.05G r0 = r3.A08
            int r0 = X.JTR.A0J(r0)
            int r0 = r0 - r11
            r4.A0I(r0)
        L_0x0076:
            r4.A0X(r11)
        L_0x0079:
            X.LTY r0 = r4.A01
            int r1 = r0.A00
            r0 = -1
            if (r1 == r0) goto L_0x0083
            r4.A0W(r11)
        L_0x0083:
            return r11
        L_0x0084:
            r1 = 2
            if (r2 != r1) goto L_0x00cd
            X.LBF r6 = r4.A01
            r21.getX()
            float r3 = r21.getY()
            android.view.View r0 = r4.A00
            android.view.View r12 = r6.A03
            if (r12 == 0) goto L_0x0083
            int[] r2 = new int[r1]
            r0.getLocationInWindow(r2)
            android.view.View r9 = r6.A04
            int[] r15 = new int[r1]
            r9.getLocationInWindow(r15)
            android.view.ViewGroup$LayoutParams r4 = r12.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            X.0qQ.A0C(r4, r0)
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r2 = r2[r11]
            r0 = r15[r11]
            int r2 = r2 - r0
            float r0 = (float) r2
            float r3 = r3 + r0
            int r7 = (int) r3
            int r0 = r6.A00
            int r7 = r7 - r0
            java.util.List r3 = r6.A09
            r10 = 0
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r3.iterator()
        L_0x00c3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0150
            A00(r5, r2)
            goto L_0x00c3
        L_0x00cd:
            r0 = 3
            if (r2 == r0) goto L_0x00d3
            r0 = 4
            if (r2 != r0) goto L_0x0083
        L_0x00d3:
            X.LBF r3 = r4.A01
            android.view.View r0 = r3.A03
            r1 = 4
            if (r0 == 0) goto L_0x00dd
            r0.setVisibility(r1)
        L_0x00dd:
            android.view.View r0 = r3.A06
            if (r0 == 0) goto L_0x00e4
            r0.setVisibility(r1)
        L_0x00e4:
            X.M8m r1 = r3.A07
            r6 = 0
            android.view.View r0 = r1.A01
            r0.removeCallbacks(r1)
            X.LGg r5 = r3.A02
            if (r5 == 0) goto L_0x013b
            X.KMu r4 = r5.A0A
            X.LTY r0 = r4.A01
            X.0eP r1 = r0.A04
            X.0eP r0 = X.LTY.A0C
            boolean r0 = X.C51966G9m.A1a(r1, r0)
            if (r0 == 0) goto L_0x013f
            X.05G r1 = r4.A0E
            X.KgT r0 = X.C62478KgT.Idle
            r1.Epw(r0)
            X.LTY r2 = r4.A01
            X.05G r0 = r2.A08
            int r0 = X.JTR.A0J(r0)
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x0121
            java.util.List r0 = r2.A0H(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0121
            r2.A0N(r1)
            r4.A0I(r1)
        L_0x0121:
            r4.A0Q()
            r4.A0X(r6)
        L_0x0127:
            com.instagram.common.session.UserSession r0 = r5.A05
            X.27r r1 = X.27p.A01(r0)
            X.4yP r0 = r1.A0J()
            if (r0 == 0) goto L_0x0138
            java.lang.String r0 = "TIMELINE_TIMED_ELEMENT_VERTICAL_DRAG"
            X.27r.A0C(r1, r0)
        L_0x0138:
            r4.A0F()
        L_0x013b:
            r0 = 0
            r3.A01 = r0
            return r11
        L_0x013f:
            X.LTY r0 = r4.A01
            int r1 = r0.A00
            r0 = -1
            if (r1 == r0) goto L_0x0138
            r4.A0P()
            r4.A0W(r6)
            goto L_0x0127
        L_0x014d:
            r0 = 0
            goto L_0x000a
        L_0x0150:
            java.util.Iterator r13 = r5.iterator()
            r5 = 0
        L_0x0155:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0173
            android.view.View r8 = X.JTO.A0H(r13)
            int[] r0 = new int[r1]
            r8.getLocationInWindow(r0)
            r2 = r0[r11]
            r0 = r15[r11]
            int r2 = r2 - r0
            int r0 = r8.getHeight()
            int r2 = r2 + r0
            int r5 = java.lang.Math.max(r5, r2)
            goto L_0x0155
        L_0x0173:
            java.util.List r2 = r6.A0B
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r2.iterator()
        L_0x017d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0187
            A00(r13, r8)
            goto L_0x017d
        L_0x0187:
            java.util.Iterator r13 = r13.iterator()
        L_0x018b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01a4
            android.view.View r8 = X.JTO.A0H(r13)
            int[] r0 = new int[r1]
            r8.getLocationInWindow(r0)
            r8 = r0[r11]
            r0 = r15[r11]
            int r8 = r8 - r0
            int r5 = java.lang.Math.max(r5, r8)
            goto L_0x018b
        L_0x01a4:
            int r9 = r9.getHeight()
            java.util.List r13 = r6.A08
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r13.iterator()
        L_0x01b2:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01bc
            A00(r14, r8)
            goto L_0x01b2
        L_0x01bc:
            java.util.Iterator r14 = r14.iterator()
        L_0x01c0:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01d9
            android.view.View r8 = X.JTO.A0H(r14)
            int[] r0 = new int[r1]
            r8.getLocationInWindow(r0)
            r8 = r0[r11]
            r0 = r15[r11]
            int r8 = r8 - r0
            int r9 = java.lang.Math.min(r9, r8)
            goto L_0x01c0
        L_0x01d9:
            java.util.List r8 = r6.A0A
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r0 = r8.iterator()
        L_0x01e3:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x01ed
            A00(r14, r0)
            goto L_0x01e3
        L_0x01ed:
            java.util.Iterator r17 = r14.iterator()
        L_0x01f1:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0210
            android.view.View r0 = X.JTO.A0H(r17)
            int[] r14 = new int[r1]
            r0.getLocationInWindow(r14)
            r14 = r14[r11]
            r16 = r15[r11]
            int r14 = r14 - r16
            int r0 = r0.getHeight()
            int r14 = r14 + r0
            int r9 = java.lang.Math.min(r9, r14)
            goto L_0x01f1
        L_0x0210:
            if (r7 >= r5) goto L_0x0255
            X.LGg r9 = r6.A02
            r8 = -1
            if (r9 == 0) goto L_0x0337
            X.KMu r13 = r9.A0A
            X.LTY r0 = r13.A01
            X.0eP r7 = r0.A04
            X.0eP r0 = X.LTY.A0C
            boolean r0 = X.C51966G9m.A1a(r7, r0)
            if (r0 == 0) goto L_0x024c
            java.util.ArrayList r0 = r9.A0C
        L_0x0227:
            java.lang.Object r0 = r0.get(r10)
            X.KMT r0 = (X.KMT) r0
            int[] r7 = new int[r1]
            androidx.recyclerview.widget.RecyclerView r0 = r0.A09
            if (r0 == 0) goto L_0x0236
            r0.getLocationOnScreen(r7)
        L_0x0236:
            r7 = r7[r11]
            if (r7 == r8) goto L_0x0337
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r3.iterator()
        L_0x0242:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x030e
            A00(r8, r3)
            goto L_0x0242
        L_0x024c:
            X.LTY r0 = r13.A01
            int r0 = r0.A00
            if (r0 == r8) goto L_0x0337
            java.util.ArrayList r0 = r9.A0B
            goto L_0x0227
        L_0x0255:
            int r0 = r12.getHeight()
            int r0 = r9 - r0
            if (r7 <= r0) goto L_0x0309
            int r0 = r12.getHeight()
            int r7 = r9 - r0
            r5 = 10
            X.LGg r2 = r6.A02
            r3 = -1
            if (r2 == 0) goto L_0x033a
            X.KMu r14 = r2.A0A
            X.LTY r0 = r14.A01
            X.0eP r9 = r0.A04
            X.0eP r0 = X.LTY.A0C
            boolean r0 = X.C51966G9m.A1a(r9, r0)
            if (r0 == 0) goto L_0x02ae
            java.util.ArrayList r2 = r2.A0C
        L_0x027a:
            int r0 = r2.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)
            X.KMT r0 = (X.KMT) r0
            androidx.recyclerview.widget.RecyclerView r9 = r0.A09
            if (r9 == 0) goto L_0x02ac
            int r2 = r9.getHeight()
        L_0x028e:
            int[] r0 = new int[r1]
            if (r9 == 0) goto L_0x0295
            r9.getLocationOnScreen(r0)
        L_0x0295:
            r9 = r0[r11]
            int r9 = r9 + r2
            if (r9 == r3) goto L_0x033a
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r13.iterator()
        L_0x02a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02b7
            A00(r3, r2)
            goto L_0x02a2
        L_0x02ac:
            r2 = 0
            goto L_0x028e
        L_0x02ae:
            X.LTY r0 = r14.A01
            int r0 = r0.A00
            if (r0 == r3) goto L_0x033a
            java.util.ArrayList r2 = r2.A0B
            goto L_0x027a
        L_0x02b7:
            java.util.Iterator r3 = r3.iterator()
        L_0x02bb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02da
            android.view.View r2 = X.JTO.A0H(r3)
            int[] r0 = new int[r1]
            r2.getLocationInWindow(r0)
            r0 = r0[r11]
            if (r0 >= r9) goto L_0x02bb
        L_0x02ce:
            X.M8m r8 = r6.A07
            r8.A00 = r5
            android.view.View r0 = r8.A01
            r2 = 10
            r0.postOnAnimationDelayed(r8, r2)
            goto L_0x033a
        L_0x02da:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r8.iterator()
        L_0x02e2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ec
            A00(r3, r2)
            goto L_0x02e2
        L_0x02ec:
            java.util.Iterator r8 = r3.iterator()
        L_0x02f0:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x033a
            android.view.View r3 = X.JTO.A0H(r8)
            int[] r0 = new int[r1]
            r3.getLocationInWindow(r0)
            r2 = r0[r11]
            int r0 = r3.getHeight()
            int r2 = r2 + r0
            if (r2 >= r9) goto L_0x02f0
            goto L_0x02ce
        L_0x0309:
            int r0 = r4.topMargin
            int r5 = r7 - r0
            goto L_0x033a
        L_0x030e:
            java.util.Iterator r9 = r8.iterator()
        L_0x0312:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0493
            android.view.View r8 = X.JTO.A0H(r9)
            int[] r0 = new int[r1]
            r8.getLocationInWindow(r0)
            r3 = r0[r11]
            int r0 = r8.getHeight()
            int r3 = r3 + r0
            if (r3 <= r7) goto L_0x0312
        L_0x032a:
            X.M8m r7 = r6.A07
            r0 = -10
            r7.A00 = r0
            android.view.View r0 = r7.A01
            r2 = 10
            r0.postOnAnimationDelayed(r7, r2)
        L_0x0337:
            r7 = r5
            r5 = -10
        L_0x033a:
            r4.topMargin = r7
            r12.setLayoutParams(r4)
            int[] r0 = new int[r1]
            r12.getLocationOnScreen(r0)
            r12.getPivotX()
            r4 = r0[r11]
            float r0 = r12.getPivotY()
            int r0 = (int) r0
            int r4 = r4 + r0
            X.LGg r6 = r6.A02
            if (r6 == 0) goto L_0x054f
            X.KMu r9 = r6.A0A
            X.LTY r0 = r9.A01
            X.0eP r0 = r0.A04
            X.0eP r2 = X.LTY.A0C
            boolean r0 = X.C51966G9m.A1a(r0, r2)
            X.LTY r8 = r9.A01
            if (r0 == 0) goto L_0x04c5
            X.0eP r0 = r8.A04
            if (r5 <= 0) goto L_0x0489
            int r0 = X.C51970G9q.A0B(r0)
            int r7 = r0 + 1
        L_0x036d:
            if (r7 < 0) goto L_0x054f
            java.util.ArrayList r5 = r6.A0C
            int r0 = r5.size()
            if (r7 >= r0) goto L_0x054f
            java.lang.Object r0 = r5.get(r7)
            X.KMT r0 = (X.KMT) r0
            int[] r3 = new int[r1]
            androidx.recyclerview.widget.RecyclerView r0 = r0.A09
            if (r0 == 0) goto L_0x0486
            r0.getLocationOnScreen(r3)
            int r1 = r0.getHeight()
        L_0x038a:
            r0 = r3[r11]
            if (r4 < r0) goto L_0x054f
            int r0 = r0 + r1
            if (r4 > r0) goto L_0x054f
            java.lang.Object r0 = r5.get(r7)
            X.LPJ r0 = (X.LPJ) r0
            r0.A0D()
            X.0eP r0 = r8.A04
            boolean r0 = X.C51966G9m.A1a(r0, r2)
            if (r0 == 0) goto L_0x054f
            X.0eP r0 = r8.A04
            int r6 = X.C51970G9q.A0B(r0)
            int r1 = X.C51969G9p.A0A(r0)
            boolean r0 = r8.A0V(r6, r1)
            if (r0 != 0) goto L_0x03c6
            X.0sn r0 = X.0sn.A00
        L_0x03b4:
            java.util.Iterator r1 = r0.iterator()
        L_0x03b8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x054f
            int r0 = X.AnonymousClass7TG.A0F(r1)
            r9.A0I(r0)
            goto L_0x03b8
        L_0x03c6:
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            X.AnonymousClass7TF.A1M(r5, r6)
            X.AnonymousClass7TF.A1M(r5, r7)
            X.05G r0 = r8.A08
            r18 = r0
            int r0 = X.JTR.A0J(r18)
            if (r7 > r0) goto L_0x04be
            int r0 = X.JTR.A0J(r18)
            if (r7 != r0) goto L_0x03e3
            r8.A0M()
        L_0x03e3:
            X.Jyn r4 = r8.A0G(r6, r1)
            int r0 = r4.A05
            r17 = r0
            int r13 = r4.A02
            boolean r0 = X.LTY.A0D(r8, r7, r0, r13)
            r2 = 0
            if (r0 != 0) goto L_0x0408
            int r0 = X.JTQ.A04(r8, r6)
            if (r0 != r11) goto L_0x046f
            int r1 = r6 + 1
            int r0 = X.JTR.A0J(r18)
        L_0x0400:
            if (r1 >= r0) goto L_0x046b
            X.AnonymousClass7TF.A1M(r5, r1)
            int r1 = r1 + 1
            goto L_0x0400
        L_0x0408:
            X.LTY.A0C(r4, r8, r6, r10, r10)
            int r0 = X.JTQ.A04(r8, r7)
            X.2HY r0 = X.C229632nm.A0C(r10, r0)
            X.2HZ r0 = X.C229632nm.A0A(r0)
            int r14 = r0.A00
            int r3 = r0.A01
            int r2 = r0.A02
            if (r2 <= 0) goto L_0x0425
            if (r14 <= r3) goto L_0x0429
        L_0x0421:
            X.LTY.A00(r4, r8, r7, r11)
            goto L_0x0480
        L_0x0425:
            if (r2 >= 0) goto L_0x0421
            if (r3 > r14) goto L_0x0421
        L_0x0429:
            X.Jyn r1 = r8.A0G(r7, r14)
            int r0 = r1.A05
            r16 = r0
            int r0 = r1.A02
            r15 = r0
            r0 = r16
            if (r0 >= r13) goto L_0x0460
            r0 = r17
            if (r15 <= r0) goto L_0x0460
            int r0 = r1.A05
            r15 = r0
            int r0 = r1.A02
            boolean r0 = X.LTY.A0D(r8, r6, r15, r0)
            if (r0 == 0) goto L_0x0464
            X.LTY.A07(r8)
            r0 = 0
            X.LTY.A08(r8, r0, r5, r7, r14)
            int r0 = X.JTR.A0J(r18)
            int r0 = r0 - r11
            java.util.List r0 = r8.A0H(r0)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0460
            r8.A0M()
        L_0x0460:
            if (r14 == r3) goto L_0x0421
            int r14 = r14 + r2
            goto L_0x0429
        L_0x0464:
            X.LTY.A00(r1, r8, r6, r10)
            X.LTY.A0C(r1, r8, r7, r10, r10)
            goto L_0x0460
        L_0x046b:
            int r1 = r7 + -1
            if (r6 < r7) goto L_0x0470
        L_0x046f:
            r1 = r7
        L_0x0470:
            int r0 = X.JTR.A0J(r18)
            int r0 = r0 - r11
            if (r6 != r0) goto L_0x0478
            r2 = 1
        L_0x0478:
            r0 = r2 ^ 1
            X.LTY.A0C(r4, r8, r6, r0, r0)
            X.LTY.A00(r4, r8, r1, r11)
        L_0x0480:
            java.util.List r0 = X.00k.A0a(r5)
            goto L_0x03b4
        L_0x0486:
            r1 = 0
            goto L_0x038a
        L_0x0489:
            if (r5 >= 0) goto L_0x054f
            int r0 = X.C51970G9q.A0B(r0)
            int r7 = r0 + -1
            goto L_0x036d
        L_0x0493:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r2.iterator()
        L_0x049b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04a5
            A00(r3, r2)
            goto L_0x049b
        L_0x04a5:
            java.util.Iterator r3 = r3.iterator()
        L_0x04a9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0337
            android.view.View r2 = X.JTO.A0H(r3)
            int[] r0 = new int[r1]
            r2.getLocationInWindow(r0)
            r0 = r0[r11]
            if (r0 <= r7) goto L_0x04a9
            goto L_0x032a
        L_0x04be:
            java.lang.String r0 = "Unable to move Timed Element to Row: "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r7)
            throw r0
        L_0x04c5:
            int r0 = r8.A00
            r3 = -1
            if (r0 == r3) goto L_0x054f
            if (r5 <= 0) goto L_0x054a
            int r7 = r0 + 1
        L_0x04ce:
            if (r7 < 0) goto L_0x054f
            java.util.ArrayList r5 = r6.A0B
            int r0 = r5.size()
            if (r7 >= r0) goto L_0x054f
            java.lang.Object r0 = r5.get(r7)
            X.KMT r0 = (X.KMT) r0
            int[] r2 = new int[r1]
            androidx.recyclerview.widget.RecyclerView r0 = r0.A09
            if (r0 == 0) goto L_0x0548
            r0.getLocationOnScreen(r2)
            int r1 = r0.getHeight()
        L_0x04eb:
            r0 = r2[r11]
            if (r4 < r0) goto L_0x054f
            int r0 = r0 + r1
            if (r4 > r0) goto L_0x054f
            java.lang.Object r0 = r5.get(r7)
            X.LPJ r0 = (X.LPJ) r0
            r0.A0D()
            int r6 = r8.A00
            if (r6 == r3) goto L_0x054f
            boolean r0 = r8.A0U(r6)
            if (r0 != 0) goto L_0x0519
            X.0sn r0 = X.0sn.A00
        L_0x0507:
            java.util.Iterator r1 = r0.iterator()
        L_0x050b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x054f
            int r0 = X.AnonymousClass7TG.A0F(r1)
            r9.A0T(r0)
            goto L_0x050b
        L_0x0519:
            java.util.HashSet r5 = X.AnonymousClass7TE.A1F()
            X.AnonymousClass7TF.A1M(r5, r6)
            X.AnonymousClass7TF.A1M(r5, r7)
            X.05G r4 = r8.A07
        L_0x0525:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            java.util.AbstractList r2 = (java.util.AbstractList) r2
            java.lang.Object r1 = X.DbZ.A0g(r2, r6)
            java.lang.Object r0 = X.DbZ.A0g(r2, r7)
            r2.set(r6, r0)
            r2.set(r7, r1)
            boolean r0 = r4.AIY(r3, r2)
            if (r0 == 0) goto L_0x0525
            r8.A0T(r7, r11)
            java.util.List r0 = X.00k.A0a(r5)
            goto L_0x0507
        L_0x0548:
            r1 = 0
            goto L_0x04eb
        L_0x054a:
            if (r5 >= 0) goto L_0x054f
            int r7 = r0 + -1
            goto L_0x04ce
        L_0x054f:
            r12.setVisibility(r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYK.onDrag(android.view.View, android.view.DragEvent):boolean");
    }

    public LYK(View view, LBF lbf) {
        this.A00 = view;
        this.A01 = lbf;
    }

    public static void A00(AbstractCollection abstractCollection, Iterator it) {
        Object next = it.next();
        if (((View) next).getVisibility() == 0) {
            abstractCollection.add(next);
        }
    }
}
