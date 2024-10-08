package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.VZg  reason: case insensitive filesystem */
public final class C17527VZg {
    public final Resources A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;

    public C17527VZg(View view) {
        this.A00 = view.getResources();
        this.A01 = view.requireViewById(R.id.container);
        this.A04 = DbT.A0b(view, R.id.image);
        this.A03 = Dba.A06(view);
        this.A02 = Dba.A05(view);
    }
}
