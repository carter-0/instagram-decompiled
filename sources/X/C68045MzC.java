package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.MzC  reason: case insensitive filesystem */
public final class C68045MzC extends C249703kE {
    public final C252063oV A00;
    public final AnonymousClass0eM A01;
    public final int A02;
    public final AnonymousClass0xx A03;
    public final UserSession A04;
    public final C252063oV A05;
    public final C71859Os0 A06 = new Object();
    public final RoundedCornerConstraintLayout A07;

    public final void A00(C68192N5h n5h) {
        AnonymousClass0eM r0;
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = this.A07;
        int i = this.A02;
        C66581MXm.A1B(roundedCornerConstraintLayout, i, (int) (((double) i) / 0.75d));
        String str = n5h.A02;
        if (Build.VERSION.SDK_INT < 29 || str == null) {
            r0 = this.A01;
            C66580MXl.A0R(r0).setUrl(n5h.A00, this.A06);
        } else {
            r0 = this.A01;
            IgImageView A0R = C66580MXl.A0R(r0);
            0qQ.A0B(A0R, 0);
            AnonymousClass77D A042 = C3265577g.A04(C71127OdQ.A00(A0R), A0R);
            OZ4 oz4 = OZ4.A00;
            UserSession userSession = this.A04;
            oz4.A01(AnonymousClass7TE.A0S(AnonymousClass7TE.A0c(r0)), C71050OaS.A00(C66580MXl.A0R(r0)), userSession, str, new C74191PqX(37, (Object) A042, (Object) this), this.A03);
        }
        UserSession userSession2 = this.A04;
        Context A0S = AnonymousClass7TE.A0S(AnonymousClass7TE.A0c(r0));
        C252063oV r9 = this.A05;
        IgImageView A0R2 = C66580MXl.A0R(r0);
        View view = this.A00.getView();
        0t0 A012 = AnonymousClass0eN.A01(MYO.A01(this, 49));
        IgImageView A0R3 = C66580MXl.A0R(r0);
        0qQ.A0B(A0R3, 0);
        AnonymousClass759 r3 = new AnonymousClass759(A0S, view, userSession2, A0R2, C3265577g.A04(C71127OdQ.A00(A0R3), A0R3), r9, A012, 128);
        PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = n5h.A01;
        if (privacyMediaOverlayViewModel != null) {
            r3.A04(privacyMediaOverlayViewModel, (C62320sa) null, 1);
        } else {
            r3.A02();
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Os0, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68045MzC(View view, AnonymousClass0xx r3, UserSession userSession, int i) {
        super(view);
        C51972G9s.A1C(userSession, r3);
        this.A04 = userSession;
        this.A02 = i;
        this.A03 = r3;
        this.A07 = (RoundedCornerConstraintLayout) view.findViewById(R.id.card);
        this.A00 = DbU.A0Z(view, R.id.privacy_overlay_image_container_legacy_view_stub);
        this.A01 = AnonymousClass0eN.A01(C73915Plq.A00(this, view, 15));
        this.A05 = DbU.A0Z(view, R.id.privacy_overlay_stub);
    }
}
