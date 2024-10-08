package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.6mf  reason: invalid class name and case insensitive filesystem */
public final class C317066mf {
    public final View A00;
    public final IgSimpleImageView A01;

    public C317066mf(C71662eb r3) {
        View requireViewById = r3.A01().requireViewById(R.id.pics_please_sticker_container);
        0qQ.A07(requireViewById);
        this.A00 = requireViewById;
        View requireViewById2 = requireViewById.requireViewById(R.id.pics_please_sticker_view);
        0qQ.A07(requireViewById2);
        this.A01 = (IgSimpleImageView) requireViewById2;
    }
}
