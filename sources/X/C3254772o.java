package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.72o  reason: invalid class name and case insensitive filesystem */
public final class C3254772o {
    public 2Rw A00;
    public boolean A01;
    public boolean A02;
    public int A03 = 1;
    public final ViewGroup A04;
    public final C231402rc A05 = new C53085GiJ(this);
    public final C322876wY A06;

    public C3254772o(ViewGroup viewGroup, C322876wY r3) {
        this.A04 = viewGroup;
        this.A06 = r3;
    }

    public static final void A03(C3254772o r3, int i, int i2) {
        C249703kE r0;
        int i3 = i2 + i;
        while (i < i3) {
            View childAt = r3.A04.getChildAt(i);
            if (childAt == null) {
                r0 = null;
            } else {
                r0 = (C249703kE) childAt.getTag(R.id.adapterlayout_tag_view_holder);
            }
            if (r0 != null) {
                2Rw r1 = r3.A00;
                if (r1 != null) {
                    r1.onBindViewHolder(r0, i);
                    i++;
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public static final void A00(C3254772o r8) {
        2Rw r7 = r8.A00;
        if (r7 == null) {
            r8.A04.removeAllViews();
            return;
        }
        int i = 0;
        while (i < r7.getItemCount()) {
            int itemViewType = r7.getItemViewType(i);
            ViewGroup viewGroup = r8.A04;
            if (i < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i);
                Number number = (Number) childAt.getTag(R.id.adapterlayout_tag_view_type);
                C249703kE r1 = (C249703kE) childAt.getTag(R.id.adapterlayout_tag_view_holder);
                if (number == null || number.intValue() != itemViewType || r1 == null) {
                    A02(r8, itemViewType, i);
                    viewGroup.removeView(childAt);
                } else {
                    r7.onBindViewHolder(r1, i);
                }
            } else {
                A02(r8, itemViewType, i);
            }
            i++;
        }
        ViewGroup viewGroup2 = r8.A04;
        if (i < viewGroup2.getChildCount()) {
            viewGroup2.removeViews(i, viewGroup2.getChildCount() - i);
        }
    }

    public static final void A01(C3254772o r5) {
        2Rw r0 = r5.A00;
        if (r0 != null) {
            int itemCount = r0.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                View childAt = r5.A04.getChildAt(i);
                if (childAt != null) {
                    childAt.setTag(R.id.adapterlayout_tag_view_position, Integer.valueOf(i));
                }
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A02(C3254772o r6, int i, int i2) {
        2Rw r5 = r6.A00;
        if (r5 != null) {
            ViewGroup viewGroup = r6.A04;
            C249703kE onCreateViewHolder = r5.onCreateViewHolder(viewGroup, i);
            onCreateViewHolder.itemView.setTag(R.id.adapterlayout_tag_view_holder, onCreateViewHolder);
            onCreateViewHolder.itemView.setTag(R.id.adapterlayout_tag_view_type, Integer.valueOf(i));
            onCreateViewHolder.itemView.setTag(R.id.adapterlayout_tag_view_position, Integer.valueOf(i2));
            viewGroup.addView(onCreateViewHolder.itemView, i2);
            r5.onBindViewHolder(onCreateViewHolder, i2);
        }
    }

    public static final void A04(C3254772o r2, String str, C62320sa r4) {
        if (r2.A02) {
            r2.A01 = true;
            return;
        }
        C322876wY r1 = r2.A06;
        if (r1 != null) {
            r1.DvZ(r2.A03, str);
        }
        r2.A03++;
        r4.invoke();
        if (r1 != null) {
            0qQ.A0B(((C322866wX) r1).A00.A0M, 0);
            02m.A0p.markerEnd(18290511, 2);
        }
    }
}
