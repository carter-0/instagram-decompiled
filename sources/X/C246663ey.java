package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.3ey  reason: invalid class name and case insensitive filesystem */
public final class C246663ey implements AnonymousClass3V3 {
    public Context A00;
    public AnonymousClass3TS A01;
    public C247233fz A02;
    public AnonymousClass3V4 A03;
    public C258253yi A04;
    public AnonymousClass3Ux A05;
    public IgProgressImageView A06;
    public C258243yh A07;
    public MediaActionsView A08;
    public MediaFrameLayout A09;
    public final AnonymousClass3VF A0A = new AnonymousClass3VF((AnonymousClass3VC) null, (AnonymousClass3V9) null, (AnonymousClass3V9) null, (AnonymousClass3V9) null, (AnonymousClass3VD) null, (AnonymousClass3VE) null);
    public final String A0B;
    public final boolean A0C;
    public final UserSession A0D;
    public final AnonymousClass3W1 A0E;

    public final C256043v8 B5X() {
        return null;
    }

    public final void Epi(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r2, 1);
        A00().setUrl(imageUrl, r2);
    }

    public final IgProgressImageView A00() {
        IgProgressImageView igProgressImageView = this.A06;
        if (igProgressImageView != null) {
            return igProgressImageView;
        }
        throw new IllegalStateException(AnonymousClass000.A00(1450));
    }

    public final MediaFrameLayout A01() {
        MediaFrameLayout mediaFrameLayout = this.A09;
        if (mediaFrameLayout != null) {
            return mediaFrameLayout;
        }
        throw new IllegalStateException("layout view should not be null");
    }

    public final AnonymousClass3TS Adf() {
        return this.A01;
    }

    public final AnonymousClass3TN B5Y() {
        return this.A08;
    }

    public final View BG1() {
        return this.A06;
    }

    public final View BQB() {
        return this.A09;
    }

    public final AnonymousClass3W1 BQq() {
        return this.A0E;
    }

    public final C247233fz BQv() {
        return this.A02;
    }

    public final C258253yi BRL() {
        return this.A04;
    }

    public final C242423Ua C5r() {
        return this.A09;
    }

    public final /* synthetic */ int C5s() {
        return -1;
    }

    public final int CEc() {
        MediaFrameLayout mediaFrameLayout = this.A09;
        if (mediaFrameLayout != null) {
            return mediaFrameLayout.getWidth();
        }
        return 0;
    }

    public C246663ey(UserSession userSession, AnonymousClass3W1 r9, String str, boolean z) {
        this.A0B = str;
        this.A0D = userSession;
        this.A0E = r9;
        this.A0C = z;
    }

    public final void EEI(int i) {
        A00().A06(i);
    }
}
