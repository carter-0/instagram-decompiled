package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UAj  reason: case insensitive filesystem */
public final class C14812UAj extends AnonymousClass3B3 {
    public int A00;
    public Drawable A01;
    public boolean A02 = true;
    public final /* synthetic */ U7v A03;

    public C14812UAj(U7v u7v) {
        this.A03 = u7v;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r10) {
        if (this.A01 != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (A00(childAt, recyclerView)) {
                    int y = ((int) childAt.getY()) + childAt.getHeight();
                    this.A01.setBounds(0, y, width, this.A00 + y);
                    this.A01.draw(canvas);
                }
            }
        }
    }

    private boolean A00(View view, RecyclerView recyclerView) {
        C249703kE A0Z = recyclerView.A0Z(view);
        if (!(A0Z instanceof UEU) || !((UEU) A0Z).A02) {
            return false;
        }
        boolean z = this.A02;
        int indexOfChild = recyclerView.indexOfChild(view);
        if (indexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        C249703kE A0Z2 = recyclerView.A0Z(recyclerView.getChildAt(indexOfChild + 1));
        if (!(A0Z2 instanceof UEU) || !((UEU) A0Z2).A01) {
            return false;
        }
        return true;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r5) {
        if (A00(view, recyclerView)) {
            rect.bottom = this.A00;
        }
    }
}
