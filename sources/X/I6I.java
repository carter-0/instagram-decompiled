package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

public final class I6I {
    public static final I6I A00 = new Object();

    public static final void A00(C55890HpB hpB, C59548JNu jNu, String str, String str2, List list, int i) {
        0qQ.A0B(str, 3);
        LinearLayout linearLayout = hpB.A02;
        LayoutInflater A0D = DbV.A0D(linearLayout);
        int childCount = i - linearLayout.getChildCount();
        if (childCount > 0) {
            list.clear();
            int i2 = 0;
            do {
                View A0A = DbU.A0A(A0D, linearLayout, R.layout.comment_poll_consumption_option_row, false);
                list.add(new C56626I5e(A0A, jNu, str, str2));
                linearLayout.addView(A0A);
                i2++;
            } while (i2 < childCount);
            return;
        }
        int i3 = -childCount;
        for (int i4 = 0; i4 < i3; i4++) {
            linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            list.remove(C51966G9m.A06(list));
        }
    }

    public static final void A01(C55890HpB hpB, I6I i6i, UserSession userSession, C272034jz r14, Integer num, String str, C62320sa r17, 0sP r18, 0sL r19, boolean z, boolean z2, boolean z3) {
        IgTextView igTextView;
        C272034jz r7 = r14;
        C55890HpB hpB2 = hpB;
        if (AnonymousClass7TF.A1V(r14.BxM())) {
            hpB.A04.setVisibility(8);
            hpB.A06.setVisibility(8);
            igTextView = hpB.A05;
        } else {
            hpB.A03.setVisibility(8);
            hpB.A05.setVisibility(8);
            igTextView = hpB.A06;
        }
        UserSession userSession2 = userSession;
        boolean z4 = z2;
        I0O.A00.A00(AnonymousClass7TE.A0S(igTextView), hpB2, userSession2, r7, str, r18, r19, z4);
        igTextView.setVisibility(DbW.A01(z ? 1 : 0));
        C55890HpB hpB3 = hpB2;
        i6i.A04(hpB3, num, r17, z3, z4, AnonymousClass7TF.A1V(r14.BxM()));
        if (DbT.A00(AnonymousClass7TE.A0q(userSession2), AnonymousClass000.A00(2903)) < 3) {
            1Au.A00(userSession2).A0S(3);
            hpB2.A07.setVisibility(8);
        }
    }

    public static final void A02(C55890HpB hpB, UserSession userSession, Integer num, List list, List list2, int[] iArr, boolean z) {
        String str;
        0qQ.A0B(userSession, 0);
        int i = 0;
        for (Object next : list2) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C56626I5e i5e = (C56626I5e) next;
            C272014jx r0 = (C272014jx) 00k.A0O(list, i);
            if (r0 != null) {
                str = r0.getText();
            } else {
                str = null;
            }
            boolean z2 = !z;
            boolean A1V = AnonymousClass7TF.A1V(num);
            int i3 = iArr[i];
            if (num != null) {
                num.intValue();
            }
            TextView textView = i5e.A03;
            textView.setText(str);
            TextView textView2 = i5e.A02;
            textView2.setText(str);
            Context context = i5e.A00;
            DbY.A12(textView, context);
            DbT.A17(context, textView2, 2Yu.A0C(context));
            View view = i5e.A01;
            view.getWidth();
            C56626I5e.A01(i5e, 0, C51968G9o.A04(context));
            view.setEnabled(z2);
            if (A1V) {
                C56626I5e.A02(i5e, i3, false);
                if (!view.isLaidOut() || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new IDB(i5e, i3, 0));
                } else {
                    C56626I5e.A01(i5e, (i3 * view.getWidth()) / 100, C51968G9o.A04(context));
                }
            }
            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
            A0m.A04 = new C54311H7g(hpB, i5e, i);
            A0m.A07 = true;
            A0m.A00();
            i = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r27 == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C55890HpB r17, com.instagram.common.session.UserSession r18, X.C272034jz r19, java.lang.String r20, java.util.List r21, X.C62320sa r22, X.0sP r23, X.0sP r24, X.0sL r25, int r26, boolean r27) {
        /*
            r16 = this;
            r15 = 0
            r6 = r18
            r5 = r21
            X.AnonymousClass7TG.A1R(r6, r5)
            r0 = 7
            r9 = r20
            X.0qQ.A0B(r9, r0)
            r0 = 1
            r7 = r19
            int[] r4 = X.C297825sP.A04(r6, r7, r0)
            int r3 = r5.size()
            r2 = 0
        L_0x001a:
            if (r2 >= r3) goto L_0x002c
            java.lang.Object r1 = X.00k.A0O(r5, r2)
            X.I5e r1 = (X.C56626I5e) r1
            if (r1 == 0) goto L_0x0029
            r0 = r4[r2]
            r1.A04(r0)
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002c:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r26)
            r0 = r23
            r0.invoke(r8)
            r14 = r27
            if (r8 != 0) goto L_0x003c
            r0 = 1
            if (r27 != 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            r13 = r0 ^ 1
            r5 = r16
            r4 = r17
            r10 = r22
            r11 = r24
            r12 = r25
            A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6I.A03(X.HpB, com.instagram.common.session.UserSession, X.4jz, java.lang.String, java.util.List, X.0sa, X.0sP, X.0sP, X.0sL, int, boolean):void");
    }

    public final void A04(C55890HpB hpB, Integer num, C62320sa r7, boolean z, boolean z2, boolean z3) {
        IgTextView igTextView;
        if (z3) {
            hpB.A04.setVisibility(8);
            hpB.A06.setVisibility(8);
            igTextView = hpB.A03;
        } else {
            hpB.A03.setVisibility(8);
            hpB.A05.setVisibility(8);
            igTextView = hpB.A04;
        }
        if (num != null || !z2) {
            igTextView.setVisibility(8);
            return;
        }
        igTextView.setVisibility(0);
        A06(hpB, z3, z);
        C56800ICx.A00(igTextView, 9, r7);
    }

    public final void A06(C55890HpB hpB, boolean z, boolean z2) {
        IgTextView igTextView;
        0qQ.A0B(hpB, 0);
        if (z) {
            hpB.A04.setVisibility(8);
            hpB.A06.setVisibility(8);
            igTextView = hpB.A03;
        } else {
            hpB.A03.setVisibility(8);
            hpB.A05.setVisibility(8);
            igTextView = hpB.A04;
        }
        Context context = igTextView.getContext();
        int i = 2131976667;
        if (z2) {
            i = 2131963388;
        }
        DbT.A18(context, igTextView, i);
    }

    public final void A05(C55890HpB hpB, C62320sa r4, boolean z, boolean z2) {
        IgTextView igTextView;
        if (z2) {
            hpB.A04.setVisibility(8);
            hpB.A06.setVisibility(8);
            igTextView = hpB.A05;
        } else {
            hpB.A03.setVisibility(8);
            hpB.A05.setVisibility(8);
            igTextView = hpB.A06;
        }
        C56800ICx.A00(igTextView, 10, r4);
        igTextView.setVisibility(DbW.A01(z ? 1 : 0));
    }
}
