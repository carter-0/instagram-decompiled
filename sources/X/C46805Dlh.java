package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Dlh  reason: case insensitive filesystem */
public final class C46805Dlh extends U9W {
    public final /* synthetic */ E35 A00;

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
            FHO.A00(ofFloat, A01, ValueAnimator.ofFloat(fArr2), cardView, 3);
        }
    }

    public final boolean isLongPressDragEnabled() {
        return false;
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r9, C249703kE r10) {
        0qQ.A0B(recyclerView, 0);
        AnonymousClass7TF.A1B(r9, 1, r10);
        int bindingAdapterPosition = r9.getBindingAdapterPosition();
        int bindingAdapterPosition2 = r10.getBindingAdapterPosition();
        E35 e35 = this.A00;
        List list = e35.A03;
        Object obj = list.get(bindingAdapterPosition2);
        List list2 = e35.A03;
        list2.set(bindingAdapterPosition2, list2.get(bindingAdapterPosition));
        list.set(bindingAdapterPosition, obj);
        2Rw r0 = recyclerView.A0A;
        if (r0 != null) {
            r0.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        }
        return true;
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
                FHO.A00(ofFloat, A01, ValueAnimator.ofFloat(new float[]{cardView.getCardElevation(), (float) AnonymousClass7TF.A02(cardView.getContext(), R.dimen.abc_button_padding_horizontal_material)}), cardView, 3);
            }
        }
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46805Dlh(E35 e35) {
        super(3, 0);
        this.A00 = e35;
    }
}
