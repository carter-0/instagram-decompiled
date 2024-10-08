package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.User;

public final class EA7 extends C231632rz {
    public final UserSession A00;
    public final User A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EA7(UserSession userSession, User user) {
        this.A00 = userSession;
        this.A01 = user;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1732555082);
        if (view != null) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.profile.bindergroup.banner.viewbinder.BannerRowBottomSheetViewBinder.Holder");
            C49639Ezw ezw = (C49639Ezw) tag;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.profile.bindergroup.banner.intf.BannerItemIntf");
            AnonymousClass73N r8 = (AnonymousClass73N) obj;
            AnonymousClass7TF.A1C(ezw, 0, r8);
            ezw.A03.setImageResource(r8.BEF());
            ezw.A02.setText(r8.getTitle());
            IgTextView igTextView = ezw.A01;
            String subtitle = r8.getSubtitle();
            igTextView.setText(subtitle);
            int i2 = 0;
            if (subtitle == null || 00l.A0W(subtitle)) {
                i2 = 8;
            }
            igTextView.setVisibility(i2);
            FPD.A00(ezw.A00, 56, r8);
        }
        AnonymousClass0fD.A0A(678230290, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1680792054);
        if (viewGroup != null) {
            View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.profile_bottomsheet_banner_item, false);
            A0A.setTag(new C49639Ezw(A0A));
            AnonymousClass0fD.A0A(44167828, A03);
            return A0A;
        }
        IllegalArgumentException A0h = DbU.A0h();
        AnonymousClass0fD.A0A(-1921880282, A03);
        throw A0h;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1H(r1);
    }
}
