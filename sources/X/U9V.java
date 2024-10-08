package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class U9V extends U9W {
    public final 0sL A00;

    public U9V(0sL r3) {
        super(3, 0);
        this.A00 = r3;
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r6, C249703kE r7) {
        AnonymousClass7TF.A1B(r6, 1, r7);
        this.A00.invoke(Integer.valueOf(r6.getBindingAdapterPosition()), Integer.valueOf(r7.getBindingAdapterPosition()));
        return true;
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r6, float f, float f2, int i, boolean z) {
        float f3;
        AnonymousClass7TG.A1O(recyclerView, r6);
        r6.itemView.setTranslationX(f);
        r6.itemView.setTranslationY(f2);
        View view = r6.itemView;
        if (z) {
            f3 = 0nA.A04(AnonymousClass7TE.A0S(recyclerView), 4);
        } else {
            f3 = 0.0f;
        }
        view.setElevation(f3);
    }
}
