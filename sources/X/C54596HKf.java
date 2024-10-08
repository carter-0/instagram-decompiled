package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.clips.model.metadata.AudioPageMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.HKf  reason: case insensitive filesystem */
public final class C54596HKf extends C53108Gig {
    public AudioPageMetadata A00;
    public final ViewGroup A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final RoundedCornerImageView A08;
    public final 1Xj A09;
    public final H0K A0A;

    public C54596HKf(View view, AnonymousClass0iw r3, UserSession userSession, 1Xj r5, H0K h0k) {
        super(view);
        this.A02 = r3;
        this.A03 = userSession;
        this.A09 = r5;
        this.A0A = h0k;
        this.A08 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.insight_image);
        this.A07 = DbX.A0Z(view, R.id.insight_title);
        this.A05 = DbX.A0Z(view, R.id.insight_subtitle);
        this.A01 = DbX.A0I(view, R.id.insight_tertiary_text_container);
        this.A04 = DbX.A0Y(view, R.id.insight_tertiary_icon);
        this.A06 = DbX.A0Z(view, R.id.insight_tertiary_text);
    }
}
