package X;

import android.graphics.Rect;
import com.instagram.ui.listview.StickyHeaderListView;
import java.lang.ref.WeakReference;

/* renamed from: X.3Di  reason: invalid class name and case insensitive filesystem */
public final class C238763Di implements AnonymousClass2eo {
    public final WeakReference A00;

    public final void Ann(Rect rect) {
        0qQ.A0B(rect, 0);
        StickyHeaderListView stickyHeaderListView = (StickyHeaderListView) this.A00.get();
        if (stickyHeaderListView != null) {
            rect.set(stickyHeaderListView.getTopChromeArea());
        } else {
            rect.setEmpty();
        }
    }

    public C238763Di(StickyHeaderListView stickyHeaderListView) {
        this.A00 = new WeakReference(stickyHeaderListView);
    }
}
