package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.6mQ  reason: invalid class name and case insensitive filesystem */
public final class C316916mQ {
    public final View A00;
    public final ImageView A01;
    public final IgFrameLayout A02;

    public C316916mQ(ViewStub viewStub, View view) {
        0qQ.A0B(view, 1);
        0qQ.A0B(viewStub, 2);
        this.A00 = view;
        View inflate = viewStub.inflate();
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        this.A02 = igFrameLayout;
        View findViewById = igFrameLayout.findViewById(R.id.product_collection_sticker_view);
        0qQ.A07(findViewById);
        this.A01 = (ImageView) findViewById;
    }
}
