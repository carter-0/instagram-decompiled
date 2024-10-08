package X;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.6Pg  reason: invalid class name and case insensitive filesystem */
public final class C307216Pg {
    public ViewGroup A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public ViewGroup A05;
    public ViewGroup A06;
    public IgTextView A07;
    public final C252063oV A08;
    public final MediaFrameLayout A09;
    public final RoundedCornerFrameLayout A0A;
    public final UserSession A0B;

    public C307216Pg(ViewStub viewStub, UserSession userSession, MediaFrameLayout mediaFrameLayout, RoundedCornerFrameLayout roundedCornerFrameLayout) {
        0qQ.A0B(mediaFrameLayout, 3);
        0qQ.A0B(viewStub, 4);
        this.A0B = userSession;
        this.A0A = roundedCornerFrameLayout;
        this.A09 = mediaFrameLayout;
        C252063oV A012 = 2b1.A01(viewStub, false, false);
        this.A08 = A012;
        A012.EeU(new C307226Ph(this));
    }
}
