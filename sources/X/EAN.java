package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class EAN extends C231632rz {
    public boolean A00;
    public final UserSession A01;
    public final 0sL A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAN(UserSession userSession, 0sL r2, boolean z) {
        this.A01 = userSession;
        this.A00 = z;
        this.A02 = r2;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int i2;
        int A03 = AnonymousClass0fD.A03(1054539688);
        if (view == null) {
            i2 = 748417925;
        } else {
            if (obj != null) {
                Object tag = view.getTag();
                0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.banner.viewbinder.FeaturedReorderViewBinder.Holder");
                F0N f0n = (F0N) tag;
                AnonymousClass73N r10 = (AnonymousClass73N) obj;
                boolean z = this.A00;
                DbY.A1S(f0n, r10);
                f0n.A03.setImageResource(r10.BEF());
                f0n.A01.setText(r10.getTitle());
                String subtitle = r10.getSubtitle();
                if (subtitle != null) {
                    f0n.A00.setText(002.A0u(" ", "•", " ", subtitle));
                }
                int i3 = 8;
                f0n.A04.setVisibility(DbW.A00(z ? 1 : 0));
                IgImageView igImageView = f0n.A02;
                if (r10.Bvq()) {
                    i3 = 0;
                }
                igImageView.setVisibility(i3);
                FPD.A00(igImageView, 57, r10);
            }
            i2 = -23640820;
        }
        AnonymousClass0fD.A0A(i2, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1781146835);
        if (viewGroup != null) {
            0sL r3 = this.A02;
            View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.profile_featured_reorder_banner_item, DbW.A1X(r3));
            A0A.setTag(new F0N(A0A));
            A0A.setOnTouchListener(new C50113FPd(r3, 3));
            AnonymousClass0fD.A0A(-438168702, A03);
            return A0A;
        }
        IllegalArgumentException A0h = DbU.A0h();
        AnonymousClass0fD.A0A(-1813123667, A03);
        throw A0h;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1H(r1);
    }
}
