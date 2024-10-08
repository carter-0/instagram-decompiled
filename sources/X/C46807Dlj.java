package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.Dlj  reason: case insensitive filesystem */
public final class C46807Dlj extends U9W {
    public final /* synthetic */ E2Z A00;

    public final void clearView(RecyclerView recyclerView, C249703kE r11) {
        char A1U = AnonymousClass7TF.A1U(0, recyclerView, r11);
        super.clearView(recyclerView, r11);
        CardView cardView = (CardView) r11.itemView;
        if (cardView != null) {
            AnimatorSet A01 = Dbc.A01();
            Property property = View.ALPHA;
            float[] fArr = new float[2];
            fArr[0] = cardView.getAlpha();
            fArr[A1U] = 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, property, fArr);
            0qQ.A07(ofFloat);
            float cardElevation = cardView.getCardElevation();
            float A02 = (float) AnonymousClass7TF.A02(cardView.getContext(), R.dimen.action_bar_item_spacing_left);
            float[] fArr2 = new float[2];
            fArr2[0] = cardElevation;
            fArr2[A1U] = A02;
            FHO.A00(ofFloat, A01, ValueAnimator.ofFloat(fArr2), cardView, 4);
        }
    }

    public final boolean isLongPressDragEnabled() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0040, code lost:
        if (r2 != r0.intValue()) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onMove(androidx.recyclerview.widget.RecyclerView r9, X.C249703kE r10, X.C249703kE r11) {
        /*
            r8 = this;
            r7 = 1
            X.AnonymousClass7TF.A1B(r10, r7, r11)
            int r3 = r10.getBindingAdapterPosition()
            int r2 = r11.getBindingAdapterPosition()
            X.E2Z r0 = r8.A00
            X.0eM r0 = r0.A06
            java.lang.Object r1 = r0.getValue()
            X.DkM r1 = (X.C46733DkM) r1
            X.05G r6 = r1.A03
            java.lang.Object r0 = r6.getValue()
            X.EzG r0 = (X.C49597EzG) r0
            java.util.List r5 = r0.A01
            java.lang.Object r0 = r6.getValue()
            X.EzG r0 = (X.C49597EzG) r0
            X.EPF r4 = r0.A00
            java.util.Collections.swap(r5, r3, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.0eP r3 = X.AnonymousClass7TF.A0x(r0, r2)
            int r2 = r5.hashCode()
            java.lang.Integer r0 = r1.A00
            if (r0 == 0) goto L_0x0042
            int r0 = r0.intValue()
            r1 = 0
            if (r2 == r0) goto L_0x0043
        L_0x0042:
            r1 = 1
        L_0x0043:
            X.EzG r0 = new X.EzG
            r0.<init>(r4, r5, r3, r1)
            r6.Epw(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46807Dlj.onMove(androidx.recyclerview.widget.RecyclerView, X.3kE, X.3kE):boolean");
    }

    public final void onSelectedChanged(C249703kE r10, int i) {
        CardView cardView;
        if (i == 2) {
            View view = null;
            if (r10 != null) {
                view = r10.itemView;
            }
            if ((view instanceof CardView) && (cardView = (CardView) view) != null) {
                AnimatorSet A01 = Dbc.A01();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cardView, View.ALPHA, new float[]{cardView.getAlpha(), 0.7f});
                0qQ.A07(ofFloat);
                FHO.A00(ofFloat, A01, ValueAnimator.ofFloat(new float[]{cardView.getCardElevation(), (float) AnonymousClass7TF.A02(cardView.getContext(), R.dimen.abc_button_padding_horizontal_material)}), cardView, 4);
            }
        }
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46807Dlj(E2Z e2z) {
        super(3, 0);
        this.A00 = e2z;
    }
}
