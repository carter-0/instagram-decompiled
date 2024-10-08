package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.UAa  reason: case insensitive filesystem */
public final class C14804UAa extends AnonymousClass3B3 {
    public final /* synthetic */ RecyclerView A00;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r6) {
        0qQ.A0B(rect, 0);
        rect.top = this.A00.getResources().getDimensionPixelOffset(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding);
    }

    public C14804UAa(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }
}
