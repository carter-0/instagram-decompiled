package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import org.webrtc.CameraCapturer;

public final class EAR extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C49423EvP A02;

    public EAR(AnonymousClass0iw r2, UserSession userSession, C49423EvP evP) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = evP;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r6, Object obj, Object obj2) {
        C47168Drj drj = (C47168Drj) obj;
        0qQ.A0B(r6, 0);
        if (drj != null && drj.A00 > 0) {
            if (182.A06(0Tu.A05, this.A01, 36329470499569810L)) {
                r6.A7U(0);
            }
        }
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        C47010Dp2 dp2;
        C47168Drj drj;
        String string;
        long j;
        Long A10;
        int A04 = DbX.A04(view, 527761703);
        Object tag = view.getTag();
        if (!(tag instanceof C47010Dp2) || (dp2 = (C47010Dp2) tag) == null) {
            i2 = -518733220;
        } else if (!(obj instanceof C47168Drj) || (drj = (C47168Drj) obj) == null) {
            i2 = 141841995;
        } else {
            view.setVisibility(0);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = dp2.A04;
            Context A0S = AnonymousClass7TE.A0S(view);
            gradientSpinnerAvatarView.setAvatarViewDrawable(A0S.getDrawable(R.drawable.instagram_app_threads_pano_outline_24));
            gradientSpinnerAvatarView.setScaleType(ImageView.ScaleType.CENTER);
            gradientSpinnerAvatarView.setVisibility(0);
            dp2.A00.setVisibility(0);
            IgTextView igTextView = dp2.A02;
            UserSession userSession = this.A01;
            if (182.A06(0Tu.A05, userSession, 36329470499700883L)) {
                int i3 = drj.A00;
                string = DbV.A0v(A0S.getResources(), C253673rC.A04(AnonymousClass7TF.A0A(A0S), Integer.valueOf(i3), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false), R.plurals.unified_feedback_likes_on_threads, i3);
            } else {
                string = A0S.getString(2131975897);
            }
            0qQ.A07(string);
            igTextView.setText(string);
            igTextView.setVisibility(0);
            IgTextView igTextView2 = dp2.A03;
            igTextView2.setText(AnonymousClass7TE.A16(A0S, 2131975898));
            igTextView2.setVisibility(0);
            dp2.A01.setVisibility(8);
            FP7.A00(view, 4, drj, this);
            EZR ezr = EZR.FEED;
            AnonymousClass0iw r0 = this.A00;
            Dba.A0j(4, userSession, r0);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r0, userSession), AnonymousClass000.A00(578));
            if (A0e.isSampled()) {
                A0e.AAJ("feedback_surface", "IG_PRODUCER_PLAYS_AND_LIKES_ROW");
                String str = drj.A01;
                if (str == null || (A10 = AnonymousClass7TE.A10(str)) == null) {
                    j = 0;
                } else {
                    j = A10.longValue();
                }
                A0e.AAJ("nav_chain", DbZ.A0k(ezr, A0e, j));
                A0e.A9F("th_reaction_count", DbS.A0j(drj.A00));
                A0e.Cgf();
            }
            i2 = -374384239;
        }
        AnonymousClass0fD.A0A(i2, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        View view;
        int i2;
        int A04 = DbX.A04(viewGroup, 1643717669);
        if (i == 0) {
            view = DbU.A09(DbV.A0D(viewGroup), viewGroup, R.layout.feedback_from_facebook_likes_list_row, false);
            view.setTag(new C47010Dp2(view));
            2eS.A01(view);
            i2 = -506955658;
        } else {
            view = null;
            i2 = -1681459314;
        }
        AnonymousClass0fD.A0A(i2, A04);
        return view;
    }
}
