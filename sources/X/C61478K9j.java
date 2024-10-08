package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.K9j  reason: case insensitive filesystem */
public final class C61478K9j extends C231632rz {
    public final Context A00;
    public final AnonymousClass4DH A01;
    public final UserSession A02;
    public final ReelDashboardFragment A03;

    public final void bindView(int i, View view, Object obj, Object obj2) {
        Object obj3 = obj;
        int A032 = AnonymousClass0fD.A03(-512439740);
        if (!(view == null || view.getTag() == null)) {
            CallerContext callerContext = C59719JVd.A01;
            Context context = this.A00;
            UserSession userSession = this.A02;
            AnonymousClass4DH r5 = this.A01;
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowViewBinder.Holder");
            LEH leh = (LEH) tag;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.fxcal.upsell.storyviewer.FxShareToFbRowModel");
            C63768L6a l6a = (C63768L6a) obj3;
            ReelDashboardFragment reelDashboardFragment = this.A03;
            0qQ.A0B(context, 0);
            C51974G9v.A1P(userSession, r5, leh, l6a);
            0qQ.A0B(reelDashboardFragment, 5);
            C363388je r3 = C363378jd.A08;
            C363378jd A002 = C363388je.A00(userSession);
            CallerContext callerContext2 = C59719JVd.A01;
            C299935wF A003 = A002.A00(callerContext2);
            l6a.A01 = r3.A04(callerContext2, userSession);
            l6a.A00 = C363018iu.A00(userSession);
            if (l6a.A01 || !LSZ.A03(l6a)) {
                LSZ.A00(context, r5, userSession, A003, l6a, leh, reelDashboardFragment);
                String str = leh.A0B;
                if (str == null || !str.equals(l6a.A02.A0j)) {
                    leh.A0B = l6a.A02.A0j;
                    C56827IDy iDy = new C56827IDy(4, userSession, l6a, leh);
                    if (leh.A00 != null) {
                        LinearLayout linearLayout = leh.A01;
                        if (linearLayout != null) {
                            linearLayout.getViewTreeObserver().removeOnGlobalLayoutListener(leh.A00);
                        }
                    }
                    leh.A00 = iDy;
                    LinearLayout linearLayout2 = leh.A01;
                    if (linearLayout2 != null) {
                        linearLayout2.getViewTreeObserver().addOnGlobalLayoutListener(iDy);
                    }
                }
            } else {
                LinearLayout linearLayout3 = leh.A01;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(8);
                }
            }
            0qQ.A0F("container");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass0fD.A0A(-32887213, A032);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        if (r2 != null) {
            r2.A7U(0);
        }
    }

    public C61478K9j(Context context, AnonymousClass4DH r2, UserSession userSession, ReelDashboardFragment reelDashboardFragment) {
        C51974G9v.A1L(context, userSession, reelDashboardFragment);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = reelDashboardFragment;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.LEH, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A032 = AnonymousClass0fD.A03(-1298594701);
        CallerContext callerContext = C59719JVd.A01;
        View inflate = DbT.A0B(this.A00).inflate(R.layout.row_share_to_fb_layout, viewGroup, false);
        ? obj = new Object();
        0qQ.A0C(inflate, C273654mx.A00(1));
        LinearLayout linearLayout = (LinearLayout) inflate;
        0qQ.A0B(linearLayout, 0);
        obj.A01 = linearLayout;
        obj.A06 = DbV.A0T(inflate, R.id.icon, false);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) inflate.requireViewById(R.id.fb_profile_avatar);
        0qQ.A0B(gradientSpinnerAvatarView, 0);
        obj.A0A = gradientSpinnerAvatarView;
        obj.A04 = JTR.A0h(inflate, R.id.title);
        obj.A08 = DbV.A0T(inflate, R.id.subtitle, false);
        obj.A07 = DbV.A0T(inflate, R.id.share_button_group, false);
        obj.A05 = DbV.A0T(inflate, R.id.auto_share_buttons, false);
        IgdsButton A0b = DbU.A0b(inflate, R.id.share_button_evergreen);
        0qQ.A0B(A0b, 0);
        obj.A09 = A0b;
        obj.A02 = JTR.A0h(inflate, R.id.shared_button_evergreen);
        linearLayout.setTag(obj);
        AnonymousClass0fD.A0A(-11400096, A032);
        return inflate;
    }
}
