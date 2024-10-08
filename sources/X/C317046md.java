package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6md  reason: invalid class name and case insensitive filesystem */
public final class C317046md {
    public 1Xj A00;
    public boolean A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final IgSimpleImageView A06;
    public final IgImageView A07;

    public C317046md(C71662eb r4) {
        View requireViewById = r4.A01().requireViewById(R.id.secret_sticker_consumption_container);
        0qQ.A07(requireViewById);
        this.A03 = requireViewById;
        View requireViewById2 = requireViewById.requireViewById(R.id.secret_sticker_drawable_container);
        0qQ.A07(requireViewById2);
        this.A04 = requireViewById2;
        View requireViewById3 = requireViewById2.requireViewById(R.id.secret_sticker_view);
        0qQ.A07(requireViewById3);
        this.A06 = (IgSimpleImageView) requireViewById3;
        View requireViewById4 = requireViewById.requireViewById(R.id.forward_tap_eating_view);
        0qQ.A07(requireViewById4);
        this.A05 = requireViewById4;
        View requireViewById5 = requireViewById.requireViewById(R.id.backward_tap_eating_view);
        0qQ.A07(requireViewById5);
        this.A02 = requireViewById5;
        IgImageView requireViewById6 = requireViewById.requireViewById(R.id.media_cover);
        IgImageView igImageView = requireViewById6;
        igImageView.A0I = new C317056me(igImageView);
        0qQ.A07(requireViewById6);
        this.A07 = igImageView;
    }
}
