package X;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;

/* renamed from: X.JkJ  reason: case insensitive filesystem */
public final class C60368JkJ extends C355538Qj {
    public final /* synthetic */ K5A A00;

    public final boolean onMove(RecyclerView recyclerView, C249703kE r10, C249703kE r11) {
        AnonymousClass7TF.A1B(r10, 1, r11);
        C60389Jki jki = (C60389Jki) this.A00.A01.getValue();
        int bindingAdapterPosition = r10.getBindingAdapterPosition();
        int bindingAdapterPosition2 = r11.getBindingAdapterPosition();
        if (bindingAdapterPosition < bindingAdapterPosition2) {
            int i = bindingAdapterPosition;
            while (i < bindingAdapterPosition2) {
                int i2 = i + 1;
                Collections.swap(jki.A01, i, i2);
                i = i2;
            }
        } else {
            int i3 = bindingAdapterPosition2 + 1;
            if (i3 <= bindingAdapterPosition) {
                int i4 = bindingAdapterPosition;
                while (true) {
                    Collections.swap(jki.A01, i4, i4 - 1);
                    if (i4 == i3) {
                        break;
                    }
                    i4--;
                }
            }
        }
        jki.notifyItemMoved(bindingAdapterPosition, bindingAdapterPosition2);
        return true;
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    public C60368JkJ(K5A k5a) {
        this.A00 = k5a;
    }

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r4) {
        return C355538Qj.makeMovementFlags(15, 0);
    }

    public final void onChildDraw(Canvas canvas, RecyclerView recyclerView, C249703kE r7, float f, float f2, int i, boolean z) {
        AnonymousClass7TG.A1T(canvas, recyclerView, r7);
        super.onChildDraw(canvas, recyclerView, r7, f, f2, i, z);
        if (z) {
            View view = r7.itemView;
            float elevation = view.getElevation();
            float f3 = 20.0f;
            if (20.0f < elevation) {
                f3 = elevation;
            }
            view.setElevation(f3);
        }
    }
}
