package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.6lK  reason: invalid class name and case insensitive filesystem */
public final class C316236lK {
    public final ViewStub A00;
    public final UserSession A01;
    public final C252063oV A02;
    public final LikeActionView A03;
    public final IgBouncyUfiButtonImageView A04;
    public final C300835xz A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C377079Kl(this, 15));
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new C377079Kl(this, 16));
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new C377079Kl(this, 17));
    public final boolean A09;

    public final void A00() {
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = this.A04;
        AnonymousClass61R A002 = C303756Aq.A00(igBouncyUfiButtonImageView.getContext(), R.raw.instagram_onboarding_nudges_draw_outline_and_pulse_40x40);
        C252063oV r2 = this.A02;
        if (r2 != null) {
            ImageView imageView = (ImageView) r2.getView();
            if (imageView != null) {
                imageView.setImageDrawable(A002);
            }
            View view = r2.getView();
            if (view != null) {
                AnonymousClass0fU.A00(new W9A(this), view);
            }
            View view2 = r2.getView();
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        igBouncyUfiButtonImageView.setVisibility(8);
        if (A002 != null) {
            A002.E2p();
        }
    }

    public C316236lK(ViewStub viewStub, UserSession userSession, C252063oV r5, LikeActionView likeActionView, IgBouncyUfiButtonImageView igBouncyUfiButtonImageView, boolean z) {
        this.A04 = igBouncyUfiButtonImageView;
        this.A03 = likeActionView;
        this.A00 = viewStub;
        this.A09 = z;
        this.A02 = r5;
        this.A01 = userSession;
        C300835xz r1 = new C300835xz();
        this.A05 = r1;
        r1.A01(new WeakReference(igBouncyUfiButtonImageView));
    }
}
