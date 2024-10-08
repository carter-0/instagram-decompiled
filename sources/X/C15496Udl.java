package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Udl  reason: case insensitive filesystem */
public final class C15496Udl extends C231632rz {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = AnonymousClass0fD.A03(-1793694946);
        if (view == null) {
            i2 = -960723486;
        } else {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.dashboard.ReelDashboardAnonymousViewersBinder.Holder");
            VT9 vt9 = (VT9) tag;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.reels.dashboard.ReelDashboardAnonymousViewers");
            VT8 vt8 = (VT8) obj;
            AnonymousClass7TG.A1N(vt9, vt8);
            vt9.A01.setText(vt8.A01);
            vt9.A00.setText(vt8.A00);
            i2 = -552283653;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1630338037);
        View inflate = DbV.A0D(viewGroup).inflate(R.layout.reel_dashboard_anonymous_viewers, viewGroup, false);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) inflate.findViewById(R.id.anonymous_viewers_image);
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        }
        inflate.setTag(new VT9(DbW.A0B(inflate, R.id.anonymous_viewers_header), DbW.A0B(inflate, R.id.anonymous_viewers_body)));
        AnonymousClass0fD.A0A(-375820995, A04);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
