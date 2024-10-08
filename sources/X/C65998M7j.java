package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.M7j  reason: case insensitive filesystem */
public final class C65998M7j implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C357918a4 A01;

    public C65998M7j(View view, C357918a4 r2) {
        this.A00 = view;
        this.A01 = r2;
    }

    public final void run() {
        View view = this.A00;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        Rect A0W = AnonymousClass7TE.A0W();
        view.getHitRect(A0W);
        int i = -dimensionPixelSize;
        A0W.inset(i, i);
        ViewGroup viewGroup = this.A01.A09;
        if (viewGroup != null) {
            viewGroup.setTouchDelegate(new TouchDelegate(A0W, view));
        }
    }
}
