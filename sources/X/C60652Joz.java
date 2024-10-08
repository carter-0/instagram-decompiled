package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

/* renamed from: X.Joz  reason: case insensitive filesystem */
public final class C60652Joz extends C249703kE {
    public final View A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgAutoCompleteTextView A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60652Joz(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A04 = (IgAutoCompleteTextView) AnonymousClass7TE.A0b(view, R.id.caption_text_view);
        this.A01 = (FrameLayout) AnonymousClass7TE.A0b(view, R.id.preview_container);
        this.A03 = JTR.A0i(view, R.id.preview);
        this.A02 = DbW.A0B(view, R.id.preview_text_overlay);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.preview_legibility_gradient);
    }
}
