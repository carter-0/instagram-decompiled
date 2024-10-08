package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Vam  reason: case insensitive filesystem */
public final class C17594Vam {
    public final Context A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final IgImageView A05;

    public C17594Vam(View view) {
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A03 = JTR.A0i(view, R.id.cover_image);
        this.A02 = DbW.A0B(view, R.id.title);
        this.A01 = DbW.A0B(view, R.id.subtitle);
        this.A04 = JTR.A0i(view, R.id.primary_avatar);
        this.A05 = JTR.A0i(view, R.id.secondary_avatar);
    }
}
