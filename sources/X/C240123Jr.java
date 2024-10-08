package X;

import android.view.View;
import java.util.List;

/* renamed from: X.3Jr  reason: invalid class name and case insensitive filesystem */
public final class C240123Jr {
    public int A00;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public int A05;
    public int A06 = 0;
    public int A07;
    public int A08;
    public List A09 = null;
    public boolean A0A;
    public boolean A0B = true;

    public final View A00(AnonymousClass3AN r7) {
        List list = this.A09;
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                View view = ((C249703kE) this.A09.get(i)).itemView;
                C249703kE r2 = ((AnonymousClass3MX) view.getLayoutParams()).mViewHolder;
                if (r2.isRemoved() || this.A01 != r2.getLayoutPosition()) {
                    i++;
                } else {
                    A01(view);
                    return view;
                }
            }
            return null;
        }
        View A042 = r7.A04(this.A01);
        this.A01 += this.A03;
        return A042;
    }

    public final void A01(View view) {
        int i;
        int layoutPosition;
        int size = this.A09.size();
        View view2 = null;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                View view3 = ((C249703kE) this.A09.get(i3)).itemView;
                AnonymousClass3MX r0 = (AnonymousClass3MX) view3.getLayoutParams();
                if (view3 != view) {
                    C249703kE r1 = r0.mViewHolder;
                    if (!r1.isRemoved() && (layoutPosition = (r1.getLayoutPosition() - this.A01) * this.A03) >= 0 && layoutPosition < i2) {
                        view2 = view3;
                        if (layoutPosition == 0) {
                            break;
                        }
                        i2 = layoutPosition;
                    }
                }
                i3++;
            } else if (view2 == null) {
                i = -1;
            }
        }
        i = ((AnonymousClass3MX) view2.getLayoutParams()).mViewHolder.getLayoutPosition();
        this.A01 = i;
    }
}
