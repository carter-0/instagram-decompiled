package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JpP  reason: case insensitive filesystem */
public final class C60678JpP extends C249703kE {
    public String A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final UserSession A09;
    public final IgImageView A0A;
    public final C61417K6o A0B;

    public C60678JpP(View view, UserSession userSession, C61417K6o k6o) {
        super(view);
        this.A09 = userSession;
        this.A0B = k6o;
        this.A0A = JTO.A0Y(view, R.id.episode_thumbnail);
        this.A05 = AnonymousClass7TE.A0d(view, R.id.episode_duration);
        this.A06 = AnonymousClass7TE.A0d(view, R.id.episode_name);
        this.A04 = AnonymousClass7TE.A0d(view, R.id.creator_name);
        this.A08 = AnonymousClass7TE.A0d(view, R.id.view_count);
        this.A02 = view.findViewById(R.id.separator);
        this.A07 = AnonymousClass7TE.A0d(view, R.id.uploaded_ago);
        this.A03 = (FrameLayout) view.findViewById(R.id.episode_media);
        View findViewById = view.findViewById(R.id.hidden_media_stub);
        0qQ.A0C(findViewById, C273654mx.A00(15));
        this.A01 = 2b1.A00(findViewById).getView();
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A02 = 0.95f;
        A0m.A07 = true;
        C61685KHt.A00(A0m, this, 30);
    }
}
