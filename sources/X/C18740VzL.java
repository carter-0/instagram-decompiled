package X;

import android.os.Handler;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.VzL  reason: case insensitive filesystem */
public final class C18740VzL {
    public static final C71392co A0B = C71392co.A02(2.0d);
    public C18002Vje A00;
    public C18002Vje A01;
    public C18014Vjq A02;
    public final ConstraintLayout A03;
    public final 2cs A04;
    public final 2cs A05;
    public final 0mM A06;
    public final C17282VPj A07;
    public final Map A08 = new HashMap();
    public final Map A09 = new HashMap();
    public final Set A0A = new HashSet();

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C18740VzL r23, boolean r24) {
        /*
            r7 = r23
            java.util.Map r0 = r7.A08
            r23 = r0
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x029c
            X.4gb r6 = new X.4gb
            r6.<init>()
            X.VPj r10 = r7.A07
            java.util.Set r9 = r23.keySet()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r0 = java.util.Collections.max(r9)
            int r4 = X.AnonymousClass7TE.A0M(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r9)
            java.util.Collections.sort(r3)
            r5 = 0
            r2 = 0
        L_0x0033:
            X.X82 r1 = r10.A00
            int r0 = r9.size()
            int r0 = r1.Bon(r4, r0)
            if (r2 >= r0) goto L_0x0058
            X.X82 r0 = r10.A00
            java.util.ArrayList r1 = r0.Bop(r3, r9, r2, r4)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0055
            java.lang.Object r0 = r1.get(r5)
            r15.add(r0)
            r8.add(r1)
        L_0x0055:
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0058:
            r23.size()
            java.util.Iterator r16 = r8.iterator()
        L_0x005f:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r13 = r16.next()
            java.util.List r13 = (java.util.List) r13
            r8 = 1
            r4 = 2
            r12 = 3
            r11 = 4
            int r3 = r13.size()
            int[] r2 = new int[r3]
            int r10 = r13.size()
            float[] r1 = new float[r10]
            r9 = 0
        L_0x007c:
            if (r9 >= r3) goto L_0x00c0
            java.lang.Object r14 = r13.get(r9)
            r0 = r23
            java.lang.Object r0 = r0.get(r14)
            r0.getClass()
            X.L2d r0 = (X.C63667L2d) r0
            android.view.View r0 = r0.A00
            int r14 = r0.getId()
            r2[r9] = r14
            r0 = 1065353216(0x3f800000, float:1.0)
            r1[r9] = r0
            if (r9 != 0) goto L_0x00aa
            r6.A0C(r14, r8, r5, r8)
        L_0x009e:
            int r0 = r3 + -1
            if (r9 != r0) goto L_0x00a7
            r0 = r2[r9]
            r6.A0C(r0, r4, r5, r4)
        L_0x00a7:
            int r9 = r9 + 1
            goto L_0x007c
        L_0x00aa:
            int r0 = r9 + -1
            r0 = r2[r0]
            r6.A0C(r14, r8, r0, r4)
            r14 = r2[r9]
            r0 = r2[r5]
            r6.A0C(r14, r12, r0, r12)
            r14 = r2[r9]
            r0 = r2[r5]
            r6.A0C(r14, r11, r0, r11)
            goto L_0x009e
        L_0x00c0:
            r0 = 1
            if (r3 <= r8) goto L_0x005f
            java.lang.String r9 = "must have 2 or more widgets in a chain"
            if (r10 != r3) goto L_0x0135
            r9 = r2[r5]
            X.6rh r9 = X.C270354gb.A02(r6, r9)
            X.6rk r10 = r9.A03
            r9 = r1[r5]
            r10.A04 = r9
            r9 = r2[r5]
            X.6rh r9 = X.C270354gb.A02(r6, r9)
            X.6rk r9 = r9.A03
            r9.A0Y = r4
            r10 = r2[r5]
            r14 = -1
            r12 = r5
            r13 = r8
            r9 = r6
            r11 = r8
            r9.A0E(r10, r11, r12, r13, r14)
            r9 = 1
        L_0x00e8:
            r18 = r2[r9]
            int r10 = r9 + -1
            r20 = r2[r10]
            r21 = r4
            r17 = r6
            r19 = r8
            r22 = r14
            r17.A0E(r18, r19, r20, r21, r22)
            r18 = r2[r10]
            r20 = r2[r9]
            r19 = r4
            r21 = r8
            r17.A0E(r18, r19, r20, r21, r22)
            r10 = r2[r9]
            X.6rh r10 = X.C270354gb.A02(r6, r10)
            X.6rk r11 = r10.A03
            r10 = r1[r9]
            r11.A04 = r10
            int r9 = r9 + 1
            if (r9 < r3) goto L_0x00e8
            int r1 = r3 - r8
            r9 = r2[r1]
            r8 = r6
            r10 = r4
            r11 = r5
            r12 = r4
            r13 = r14
            r8.A0E(r9, r10, r11, r12, r13)
        L_0x0120:
            r8 = r2[r0]
            X.Vje r1 = r7.A00
            int r4 = r1.A01
            if (r4 <= 0) goto L_0x0130
            X.6rh r1 = X.C270354gb.A02(r6, r8)
            X.6rk r1 = r1.A03
            r1.A0Z = r4
        L_0x0130:
            int r0 = r0 + 1
            if (r0 >= r3) goto L_0x005f
            goto L_0x0120
        L_0x0135:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r9)
            throw r0
        L_0x013b:
            r1 = 3
            r2 = 4
            int r4 = r15.size()
            int[] r3 = new int[r4]
            int r12 = r15.size()
            float[] r9 = new float[r12]
            r8 = 0
        L_0x014a:
            if (r8 >= r4) goto L_0x0180
            java.lang.Object r10 = r15.get(r8)
            r0 = r23
            java.lang.Object r0 = r0.get(r10)
            r0.getClass()
            X.L2d r0 = (X.C63667L2d) r0
            android.view.View r0 = r0.A00
            int r10 = r0.getId()
            r3[r8] = r10
            r0 = 1065353216(0x3f800000, float:1.0)
            r9[r8] = r0
            if (r8 != 0) goto L_0x0178
            r6.A0C(r10, r1, r5, r1)
        L_0x016c:
            int r0 = r4 + -1
            if (r8 != r0) goto L_0x0175
            r0 = r3[r8]
            r6.A0C(r0, r2, r5, r2)
        L_0x0175:
            int r8 = r8 + 1
            goto L_0x014a
        L_0x0178:
            int r0 = r8 + -1
            r0 = r3[r0]
            r6.A0C(r10, r1, r0, r2)
            goto L_0x016c
        L_0x0180:
            r8 = 1
            if (r4 <= r8) goto L_0x01e8
            r11 = 2
            java.lang.String r10 = "must have 2 or more widgets in a chain"
            if (r12 != r4) goto L_0x01e2
            r0 = r3[r5]
            X.6rh r0 = X.C270354gb.A02(r6, r0)
            X.6rk r10 = r0.A03
            r0 = r9[r5]
            r10.A06 = r0
            r0 = r3[r5]
            X.6rh r0 = X.C270354gb.A02(r6, r0)
            X.6rk r0 = r0.A03
            r0.A0s = r11
            r0 = r3[r5]
            r6.A0D(r0, r1, r5, r1)
            r10 = 1
        L_0x01a4:
            r12 = r3[r10]
            r11 = 3
            int r1 = r10 + -1
            r0 = r3[r1]
            r6.A0D(r12, r11, r0, r2)
            r11 = r3[r1]
            r1 = r3[r10]
            r0 = 3
            r6.A0D(r11, r2, r1, r0)
            r0 = r3[r10]
            X.6rh r0 = X.C270354gb.A02(r6, r0)
            X.6rk r1 = r0.A03
            r0 = r9[r10]
            r1.A06 = r0
            int r10 = r10 + 1
            if (r10 < r4) goto L_0x01a4
            int r0 = r4 - r8
            r0 = r3[r0]
            r6.A0D(r0, r2, r5, r2)
        L_0x01cd:
            r2 = r3[r8]
            X.Vje r0 = r7.A00
            int r1 = r0.A02
            if (r1 <= 0) goto L_0x01dd
            X.6rh r0 = X.C270354gb.A02(r6, r2)
            X.6rk r0 = r0.A03
            r0.A0p = r1
        L_0x01dd:
            int r8 = r8 + 1
            if (r8 >= r4) goto L_0x01e8
            goto L_0x01cd
        L_0x01e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x01e8:
            if (r24 == 0) goto L_0x01ef
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.A03
            android.transition.TransitionManager.beginDelayedTransition(r0)
        L_0x01ef:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r7.A03
            r6.A0G(r0)
            X.Vjq r4 = r7.A02
            if (r4 == 0) goto L_0x029c
            X.Utx r4 = (X.C16380Utx) r4
            X.C16380Utx.A00(r4)
            X.X5L r8 = r4.A00
            if (r8 == 0) goto L_0x029c
            com.instagram.common.session.UserSession r0 = r4.A03
            java.lang.String r3 = r0.A06
            X.VzL r2 = r4.A04
            java.util.Map r7 = r2.A08
            int r1 = r7.size()
            r6 = 0
            r0 = 1
            if (r1 < r0) goto L_0x0291
            java.util.Map r0 = r4.A05
            java.lang.Object r9 = r0.get(r3)
            X.VPj r13 = r2.A07
            java.util.Set r12 = r7.keySet()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r0 = java.util.Collections.max(r12)
            int r10 = X.AnonymousClass7TE.A0M(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r12)
            java.util.Collections.sort(r3)
            r2 = 0
        L_0x0238:
            X.X82 r1 = r13.A00
            int r0 = r12.size()
            int r0 = r1.Bon(r10, r0)
            if (r2 >= r0) goto L_0x025d
            X.X82 r0 = r13.A00
            java.util.ArrayList r1 = r0.Bop(r3, r12, r2, r10)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x025a
            java.lang.Object r0 = r1.get(r5)
            r11.add(r0)
            r4.add(r1)
        L_0x025a:
            int r2 = r2 + 1
            goto L_0x0238
        L_0x025d:
            java.util.Iterator r3 = X.AnonymousClass7TF.A0u(r7)
            r2 = -1
        L_0x0262:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x027b
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r0 = r1.getValue()
            if (r0 != r9) goto L_0x0262
            java.lang.Object r0 = r1.getKey()
            int r2 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x0262
        L_0x027b:
            r1 = 0
        L_0x027c:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0291
            java.lang.Object r0 = r4.get(r1)
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.C66581MXm.A1W(r2, r0)
            if (r0 == 0) goto L_0x029d
            if (r1 != 0) goto L_0x0291
            r6 = 1
        L_0x0291:
            int r1 = r7.size()
            r0 = 1
            if (r1 > r0) goto L_0x0299
            r0 = 0
        L_0x0299:
            r8.DNB(r6, r0)
        L_0x029c:
            return
        L_0x029d:
            int r1 = r1 + 1
            goto L_0x027c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18740VzL.A00(X.VzL, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.0mK, java.lang.Object] */
    public C18740VzL(Handler handler, ConstraintLayout constraintLayout, C18002Vje vje, C17282VPj vPj) {
        this.A03 = constraintLayout;
        constraintLayout.setOptimizationLevel(0);
        this.A00 = vje;
        this.A07 = vPj;
        vPj.A00 = vje.A03;
        this.A06 = new 0mM(handler, new Object(), 60);
        2cp A002 = C61340me.A00();
        C15164UTp uTp = new C15164UTp(this);
        2cs A022 = A002.A02();
        C71392co r1 = A0B;
        A022.A09(r1);
        A022.A0A(uTp);
        this.A04 = A022;
        2cs A023 = A002.A02();
        A023.A09(r1);
        A023.A0A(uTp);
        this.A05 = A023;
    }
}
