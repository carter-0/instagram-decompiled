package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public final class IUL implements AnonymousClass3V3 {
    public Context A00;
    public IgProgressImageView A01;
    public MediaFrameLayout A02;
    public final UserSession A03;
    public final AnonymousClass3W1 A04;

    public final C256043v8 B5X() {
        return null;
    }

    public final AnonymousClass3TS Adf() {
        return null;
    }

    public final AnonymousClass3TN B5Y() {
        return null;
    }

    public final View BG1() {
        return this.A01;
    }

    public final View BQB() {
        return this.A02;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A04;
    }

    public final C247233fz BQv() {
        return null;
    }

    public final C258253yi BRL() {
        return null;
    }

    public final C242423Ua C5r() {
        return this.A02;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        MediaFrameLayout mediaFrameLayout = this.A02;
        if (mediaFrameLayout != null) {
            return mediaFrameLayout.getWidth();
        }
        return 0;
    }

    public final void EEI(int i) {
        IgProgressImageView igProgressImageView = this.A01;
        if (igProgressImageView != null) {
            igProgressImageView.A06(i);
            return;
        }
        throw AnonymousClass7TE.A0z(AnonymousClass000.A00(1450));
    }

    public IUL(UserSession userSession, AnonymousClass3W1 r2) {
        this.A03 = userSession;
        this.A04 = r2;
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        AnonymousClass7TG.A1N(imageUrl, r2);
        IgProgressImageView igProgressImageView = this.A01;
        if (igProgressImageView != null) {
            igProgressImageView.setUrl(imageUrl, r2);
            return;
        }
        throw AnonymousClass7TE.A0z(AnonymousClass000.A00(1450));
    }
}
