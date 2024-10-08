package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Myj  reason: case insensitive filesystem */
public final class C68017Myj extends C249703kE {
    public final Context A00;
    public final View A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgImageView A04;

    public C68017Myj(View view) {
        super(view);
        this.A01 = view;
        this.A00 = AnonymousClass7TE.A0S(view);
        this.A04 = DbX.A0b(view, R.id.thumbnail);
        this.A03 = DbX.A0Z(view, R.id.title);
        this.A02 = DbX.A0Z(view, R.id.subtitle);
    }
}
