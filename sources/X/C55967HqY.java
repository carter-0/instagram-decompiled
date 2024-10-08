package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.HqY  reason: case insensitive filesystem */
public final class C55967HqY {
    public final JPN A00;
    public final UserSession A01;
    public final C231672s5 A02;
    public final AnonymousClass4DU A03;

    public C55967HqY(UserSession userSession, C231672s5 r3, JPN jpn, AnonymousClass4DU r5) {
        0qQ.A0B(jpn, 4);
        this.A01 = userSession;
        this.A02 = r3;
        this.A03 = r5;
        this.A00 = jpn;
    }

    public final void A00(C53267GlF glF, IgProgressImageView igProgressImageView, MediaFrameLayout mediaFrameLayout, int i, boolean z) {
        C53267GlF glF2 = glF;
        IgProgressImageView igProgressImageView2 = igProgressImageView;
        AnonymousClass7TF.A1B(igProgressImageView2, 1, glF2);
        C231672s5 r2 = this.A02;
        AnonymousClass4DU r4 = this.A03;
        MediaFrameLayout mediaFrameLayout2 = mediaFrameLayout;
        mediaFrameLayout2.A00 = glF2.A00;
        igProgressImageView2.setPostProcessor(r2);
        igProgressImageView2.setProgressiveImageConfig(new C247833gz());
        igProgressImageView2.A0A(new WXH(igProgressImageView2, 3), R.id.listener_id_for_thumbnail_media_url_tag);
        C247843h0.A00(r4, glF2.A02, igProgressImageView2);
        int i2 = i;
        C51967G9n.A1P(mediaFrameLayout2, (0sL) glF2.A01.A02, i2);
        if (z) {
            if (182.A06(0Tu.A05, this.A01, 36329728197607719L)) {
                AnonymousClass0fU.A00(new IC9(i2, 0, glF2, this, mediaFrameLayout2), mediaFrameLayout2);
                mediaFrameLayout2.setOnTouchListener(new IDZ(i2, 1, mediaFrameLayout2, glF2, this));
                C244083ac.A05(igProgressImageView2, C244063aa.MEDIA_THUMBNAIL);
            }
        }
        AnonymousClass0fU.A00(new C244023aW(this.A01, (String) null, (C62320sa) null, new C59093J6a(i2, 10, (Object) mediaFrameLayout2, (Object) glF2, (Object) this), true), mediaFrameLayout2);
        C244083ac.A05(igProgressImageView2, C244063aa.MEDIA_THUMBNAIL);
    }
}
