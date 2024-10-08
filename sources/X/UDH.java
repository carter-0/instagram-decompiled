package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UDH extends C249703kE {
    public final Context A00;
    public final IgImageView A01;
    public final C17533VZm A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDH(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view.getContext();
        this.A02 = new C17533VZm(view, R.id.image);
        this.A01 = JTR.A0i(view, R.id.image);
    }
}
