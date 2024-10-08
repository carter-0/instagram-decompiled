package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.7Ki  reason: invalid class name and case insensitive filesystem */
public final class C329817Ki {
    public C70762OKi A00;
    public IgProgressImageView A01;
    public final View A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C329807Kh A05;
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(new C377229La(this, 10));
    public final C332827Wn A07;

    public C329817Ki(View view, AnonymousClass0iw r4, UserSession userSession, C332827Wn r6, C329807Kh r7) {
        0qQ.A0B(view, 4);
        this.A04 = userSession;
        this.A03 = r4;
        this.A07 = r6;
        this.A02 = view;
        this.A05 = r7;
    }

    public static final void A00(ImageUrl imageUrl, C329817Ki r5) {
        IgProgressImageView igProgressImageView = r5.A01;
        if (igProgressImageView != null) {
            String url = imageUrl.getUrl();
            0qQ.A07(url);
            0qQ.A0B("content://com.instagram.android.tam-attachment", 1);
            if (!url.startsWith("content://com.instagram.android.tam-attachment")) {
                igProgressImageView.setUrl(r5.A04, imageUrl, r5.A03);
                return;
            }
            AnonymousClass0eM r1 = r5.A06;
            String A002 = ((MYd) r1.getValue()).A00(url);
            if (A002 != null) {
                igProgressImageView.setUrl(new SimpleImageUrl(A002), r5.A03);
            } else if (!((MYd) r1.getValue()).A02(url)) {
                ((MYd) r1.getValue()).A01(url);
                C70762OKi oKi = r5.A00;
                if (oKi != null) {
                    oKi.A00();
                }
                r5.A00 = null;
                r5.A00 = r5.A07.CgK(new C40473Aci(r5, igProgressImageView), url);
            }
        }
    }

    public final void A01(ImageUrl imageUrl, long j) {
        IgProgressImageView igProgressImageView;
        if (imageUrl != null && (igProgressImageView = this.A01) != null) {
            Resources resources = igProgressImageView.getResources();
            0qQ.A07(resources);
            try {
                float dimension = resources.getDimension(R.dimen.abc_action_bar_elevation_material);
                if (Float.valueOf(dimension) != null) {
                    C242553Us r1 = new C242553Us();
                    r1.A06(dimension);
                    C328047Df r3 = new C328047Df();
                    0qQ.A0B(r1, 0);
                    r3.A02(r1, AnonymousClass05K.A00);
                    igProgressImageView.setPostProcessor(new AnonymousClass77D(r3, AnonymousClass77E.A00));
                    igProgressImageView.setVisibility(0);
                    igProgressImageView.setExpiration(j);
                    A00(imageUrl, this);
                }
            } catch (Resources.NotFoundException unused) {
            }
        }
    }
}
