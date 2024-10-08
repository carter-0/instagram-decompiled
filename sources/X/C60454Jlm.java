package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jlm  reason: case insensitive filesystem */
public final class C60454Jlm extends AnonymousClass3B3 {
    public final float A00;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        0qQ.A0B(rect, 0);
        AnonymousClass7TG.A1U(view, recyclerView, r6);
        super.getItemOffsets(rect, view, recyclerView, r6);
        int i = (int) this.A00;
        rect.set(0, i, 0, i);
    }

    public C60454Jlm(float f) {
        this.A00 = f;
    }
}
