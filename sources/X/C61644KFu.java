package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.MediaActionsView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.KFu  reason: case insensitive filesystem */
public final class C61644KFu extends C232222tE {
    public C63602Kzp A00;
    public AnonymousClass0iw A01;
    public UserSession A02;
    public C246923fS A03;
    public final float A04;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.media_thumbnail_preview_item_layout, false);
        MediaFrameLayout mediaFrameLayout = (MediaFrameLayout) AnonymousClass7TF.A0F(A0D, R.id.thumbnail_preview_container);
        mediaFrameLayout.A00 = this.A04;
        return new C60707Jps(A0D, mediaFrameLayout, new AnonymousClass3TS(DbU.A0D(A0D, R.id.audio_icon_view_stub)), new C256003v4(JTR.A0X(A0D, R.id.video_subtitle_view_stub), false), (IgProgressImageView) AnonymousClass7TF.A0G(A0D, R.id.media_image_preview), (MediaActionsView) AnonymousClass7TF.A0G(A0D, R.id.preview_media_actions_view), mediaFrameLayout);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r13, C249703kE r14) {
        String str;
        C64788Li4 li4 = (C64788Li4) r13;
        C60707Jps jps = (C60707Jps) r14;
        boolean A1U = AnonymousClass7TF.A1U(0, li4, jps);
        UserSession userSession = this.A02;
        if (userSession != null) {
            AnonymousClass0iw r2 = this.A01;
            if (r2 != null) {
                C63602Kzp kzp = this.A00;
                if (kzp != null) {
                    if (jps.A00 != null) {
                        jps.BQq().A0S(jps.A02.A01());
                    }
                    jps.A00 = li4.A01;
                    C246923fS r1 = this.A03;
                    if (r1 == null) {
                        r1 = new C246923fS(userSession);
                        this.A03 = r1;
                    }
                    1Xj r5 = li4.A00;
                    IgProgressImageView igProgressImageView = jps.A03;
                    C247843h0.A00(r2, r1.A00(AnonymousClass7TE.A0S(igProgressImageView), r5), igProgressImageView);
                    AnonymousClass4Je.A00(new AnonymousClass4Jd(userSession).A00(r5, ""), jps.BQq(), igProgressImageView, jps.A04, li4.A02);
                    AnonymousClass3TS r3 = jps.A02;
                    C250563lf.A0f(new AnonymousClass9IQ((Integer) null, 6, r5.A6W(userSession)), r3, jps.BQq());
                    jps.BQq().A0R(r3.A01());
                    View view = jps.A01;
                    if (r5.BR7() == 1iA.A0a) {
                        str = "Video";
                    } else {
                        str = "Photo";
                    }
                    view.setContentDescription(0mp.A06("Media Thumbnail %s Cell", new Object[]{str}));
                    LE4 le4 = kzp.A00;
                    AnonymousClass2t9 r12 = le4.A07;
                    String id = r5.getId();
                    if (id != null) {
                        if (r12.A02(id) == 0) {
                            C65324LrN lrN = le4.A00;
                            if (lrN != null) {
                                1Xj r0 = lrN.A02;
                                if (r0 != null && r0.equals(r5)) {
                                    C65324LrN.A03(lrN, "media_mismatch");
                                    C65324LrN.A01(jps, lrN, r5, 0);
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                        LYA.A01(view, li4, jps, le4, 4);
                        view.setOnTouchListener(new C64282LYi(A1U ? 1 : 0, le4, li4));
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final Class modelClass() {
        return C64788Li4.class;
    }

    public C61644KFu(float f) {
        this.A04 = f;
    }
}
