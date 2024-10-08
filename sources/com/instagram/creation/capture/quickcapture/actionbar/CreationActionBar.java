package com.instagram.creation.capture.quickcapture.actionbar;

import X.03t;
import X.0nA;
import X.0qQ;
import X.AnonymousClass8PT;
import X.AnonymousClass9I9;
import X.C270354gb;
import X.C62320sa;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreationActionBar extends ConstraintLayout {
    public EphemeralMediaToggleView A00;
    public IgdsMediaButton A01;
    public IgdsMediaButton A02;
    public boolean A03;
    public int A04;
    public int A05;
    public int A06;
    public boolean A07;
    public boolean A08;
    public final List A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreationActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A0E(AnonymousClass9I9 r8, IgdsMediaButton[] igdsMediaButtonArr) {
        List<View> list = this.A09;
        for (View removeView : list) {
            removeView(removeView);
        }
        list.clear();
        list.addAll(03t.A0I(igdsMediaButtonArr));
        this.A04 = r8.A00;
        this.A03 = r8.A04;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IgdsMediaButton igdsMediaButton = (IgdsMediaButton) it.next();
            if (igdsMediaButton.A02 != null) {
                if (igdsMediaButton.getLayoutParams().width == -2) {
                    0nA.A0f(igdsMediaButton, igdsMediaButton.getLayoutParams().width);
                }
                0nA.A0f(igdsMediaButton, 0);
            } else {
                if (igdsMediaButtonArr.length < this.A04 && r8.A02) {
                    0nA.A0f(igdsMediaButton, -2);
                }
                0nA.A0f(igdsMediaButton, 0);
            }
            addView(igdsMediaButton);
        }
        this.A08 = r8.A02;
        int i = r8.A01;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613 || i == 17 || i == 1) {
            this.A05 = i;
            A0F((C62320sa) null);
            return;
        }
        throw new IllegalArgumentException("invalid gravity");
    }

    public static final int A00(View view, C270354gb r18, float f, int i, int i2, boolean z, boolean z2) {
        int i3 = i2;
        int i4 = i;
        if (view == null) {
            return i4;
        }
        if (view.getVisibility() != 0) {
            return i;
        }
        int i5 = 0;
        C270354gb r3 = r18;
        if (i != 0) {
            if (z2) {
                r3.A0E(view.getId(), 1, i4, 2, i3);
            }
            if (z) {
                if (z2) {
                    i3 = 0;
                }
                r3.A0E(i4, 2, view.getId(), 1, i3);
            }
        } else if (z2) {
            r3.A0E(view.getId(), 1, 0, 1, i3);
        }
        r3.A0E(view.getId(), 3, 0, 3, 0);
        r3.A0E(view.getId(), 4, 0, 4, 0);
        float f2 = f;
        int i6 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        int id = view.getId();
        if (i6 != 0) {
            i5 = 2;
        }
        C270354gb.A02(r3, id).A03.A0Y = i5;
        r3.A08(view.getId(), f2);
        return view.getId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r3 >= r0.A04) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0F(X.C62320sa r23) {
        /*
            r22 = this;
            r0 = r22
            boolean r1 = r0.A03
            if (r1 == 0) goto L_0x0023
            java.util.List r3 = r0.A09
            int r2 = r3.size()
            r1 = 3
            if (r2 != r1) goto L_0x0023
            boolean r1 = r0.A07
            if (r1 == 0) goto L_0x0023
            java.lang.Object r2 = X.00k.A0K(r3)
            android.view.View r2 = (android.view.View) r2
            r1 = 8
            r2.setVisibility(r1)
            if (r23 == 0) goto L_0x0023
            r23.invoke()
        L_0x0023:
            java.util.List r2 = r0.A09
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x002e:
            boolean r1 = r4.hasNext()
            r7 = 0
            if (r1 == 0) goto L_0x0046
            java.lang.Object r3 = r4.next()
            r1 = r3
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x002e
            r5.add(r3)
            goto L_0x002e
        L_0x0046:
            int r3 = r5.size()
            boolean r1 = r0.A08
            if (r1 == 0) goto L_0x0053
            int r1 = r0.A04
            r6 = 1
            if (r3 < r1) goto L_0x0054
        L_0x0053:
            r6 = 0
        L_0x0054:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x005d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0074
            java.lang.Object r3 = r4.next()
            r1 = r3
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x005d
            r5.add(r3)
            goto L_0x005d
        L_0x0074:
            java.util.Iterator r5 = r5.iterator()
        L_0x0078:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r4 = r5.next()
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r4
            X.5pm r1 = r4.A02
            r3 = -2
            if (r1 == 0) goto L_0x009b
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            int r1 = r1.width
            if (r1 != r3) goto L_0x00a1
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            int r1 = r1.width
            X.0nA.A0f(r4, r1)
            goto L_0x0078
        L_0x009b:
            if (r6 == 0) goto L_0x00a1
            X.0nA.A0f(r4, r3)
            goto L_0x0078
        L_0x00a1:
            X.0nA.A0f(r4, r7)
            goto L_0x0078
        L_0x00a5:
            X.4gb r5 = new X.4gb
            r5.<init>()
            r5.A0I(r0)
            com.instagram.igds.components.mediabutton.IgdsMediaButton r4 = r0.A01
            r21 = 0
            r6 = 1056964608(0x3f000000, float:0.5)
            r9 = 1
            r8 = r7
            r10 = r9
            int r13 = A00(r4, r5, r6, r7, r8, r9, r10)
            com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView r10 = r0.A00
            r11 = r5
            r12 = r6
            r14 = r7
            r15 = r9
            r16 = r9
            int r13 = A00(r10, r11, r12, r13, r14, r15, r16)
            if (r13 == 0) goto L_0x00ca
            int r14 = r0.A06
        L_0x00ca:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r2.iterator()
        L_0x00d3:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00ea
            java.lang.Object r2 = r3.next()
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x00d3
            r4.add(r2)
            goto L_0x00d3
        L_0x00ea:
            java.util.Iterator r3 = r4.iterator()
        L_0x00ee:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x011b
            java.lang.Object r10 = r3.next()
            android.view.View r10 = (android.view.View) r10
            int r2 = r0.A05
            r1 = 3
            if (r2 == r1) goto L_0x0119
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r1) goto L_0x0119
            r1 = 5
            if (r2 == r1) goto L_0x010e
            r1 = 8388613(0x800005, float:1.175495E-38)
            r12 = 1056964608(0x3f000000, float:0.5)
            if (r2 != r1) goto L_0x0110
        L_0x010e:
            r12 = 1065353216(0x3f800000, float:1.0)
        L_0x0110:
            r15 = r7
            int r13 = A00(r10, r11, r12, r13, r14, r15, r16)
            int r14 = r0.A06
            r7 = 1
            goto L_0x00ee
        L_0x0119:
            r12 = 0
            goto L_0x0110
        L_0x011b:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r15 = r0.A02
            r17 = 1056964608(0x3f000000, float:0.5)
            r16 = r5
            r20 = r7
            r18 = r13
            r19 = r14
            int r6 = A00(r15, r16, r17, r18, r19, r20, r21)
            r7 = 2
            r9 = r7
            r10 = r8
            r5.A0E(r6, r7, r8, r9, r10)
            r5.A0G(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.actionbar.CreationActionBar.A0F(X.0sa):void");
    }

    public final IgdsMediaButton A0D(Integer num) {
        Context context = getContext();
        0qQ.A07(context);
        IgdsMediaButton A002 = AnonymousClass8PT.A00(context, num);
        this.A02 = A002;
        addView(A002);
        A0F((C62320sa) null);
        return A002;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        List<View> list = this.A09;
        if (list.size() == 3 && this.A03) {
            int measuredWidth = getMeasuredWidth();
            IgdsMediaButton igdsMediaButton = this.A01;
            int i5 = 0;
            if (igdsMediaButton != null) {
                i3 = igdsMediaButton.getMeasuredWidth();
            } else {
                i3 = 0;
            }
            int i6 = measuredWidth - i3;
            IgdsMediaButton igdsMediaButton2 = this.A02;
            if (igdsMediaButton2 != null) {
                i4 = igdsMediaButton2.getMeasuredWidth();
            } else {
                i4 = 0;
            }
            int i7 = i6 - i4;
            for (View measuredWidth2 : list) {
                i5 += measuredWidth2.getMeasuredWidth();
            }
            if (i7 < i5) {
                this.A04 = 2;
                this.A07 = true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreationActionBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A04 = 2;
        this.A09 = new ArrayList();
        this.A05 = 17;
        this.A06 = (int) 0nA.A04(context, 6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CreationActionBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CreationActionBar(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
