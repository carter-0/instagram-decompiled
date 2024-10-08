package X;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.WnT  reason: case insensitive filesystem */
public final class C20229WnT implements Runnable {
    public final /* synthetic */ UZ0 A00;
    public final /* synthetic */ String A01;

    public C20229WnT(UZ0 uz0, String str) {
        this.A00 = uz0;
        this.A01 = str;
    }

    public final void run() {
        View view;
        KeyEvent.Callback callback;
        UZ0 uz0 = this.A00;
        IgLinearLayout igLinearLayout = uz0.A02;
        ViewGroup viewGroup = null;
        if (igLinearLayout != null) {
            view = igLinearLayout.findViewWithTag(this.A01);
        } else {
            view = null;
        }
        NestedScrollView nestedScrollView = uz0.A01;
        if (nestedScrollView != null) {
            callback = AnonymousClass046.A00(nestedScrollView, 0);
        } else {
            callback = null;
        }
        if (callback instanceof ViewGroup) {
            viewGroup = (ViewGroup) callback;
        }
        if (view != null && viewGroup != null) {
            Rect rect = uz0.A04;
            viewGroup.getLocalVisibleRect(rect);
            int i = rect.bottom;
            view.getDrawingRect(rect);
            viewGroup.offsetDescendantRectToMyCoords(view, rect);
            int i2 = rect.bottom;
            NestedScrollView nestedScrollView2 = uz0.A01;
            if (nestedScrollView2 != null) {
                NestedScrollView.A04(nestedScrollView2, 0, i2 - i, false);
            }
        }
    }
}
