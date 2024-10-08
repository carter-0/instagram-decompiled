package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.KLr  reason: case insensitive filesystem */
public final class C61778KLr extends C60517Jmo {
    public final IgTextView A00 = Dba.A0E(this.itemView, R.id.audio_filter_name);
    public final IgImageView A01 = JTR.A0i(this.itemView, R.id.audio_filter_icon);
    public final RoundedCornerFrameLayout A02 = ((RoundedCornerFrameLayout) AnonymousClass7TE.A0b(this.itemView, R.id.audio_filter_background));
    public final SpinnerImageView A03 = ((SpinnerImageView) AnonymousClass7TE.A0b(this.itemView, R.id.audio_filter_spinner));
    public final /* synthetic */ C61773KLm A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61778KLr(View view, C61773KLm kLm) {
        super(view);
        0qQ.A0B(view, 2);
        this.A04 = kLm;
    }
}
