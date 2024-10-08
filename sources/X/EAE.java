package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.ArrayList;
import java.util.List;

public final class EAE extends C231632rz {
    public final AnonymousClass0iw A00;
    public final C47521E6h A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAE(AnonymousClass0iw r1, C47521E6h e6h) {
        this.A00 = r1;
        this.A01 = e6h;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1271801098);
        int A02 = DbW.A02(1, view, obj);
        EyV eyV = (EyV) obj;
        AnonymousClass0iw r3 = this.A00;
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.user.userlist.adapter.MutualFollowListSeeMoreViewBinder.Holder");
        C49609EzS ezS = (C49609EzS) tag;
        List list = eyV.A02;
        int i2 = eyV.A00;
        int i3 = eyV.A01;
        C47521E6h e6h = this.A01;
        0qQ.A0B(r3, 0);
        DbW.A1N(ezS, 1, e6h);
        if (list.size() >= A02) {
            GradientSpinnerAvatarView gradientSpinnerAvatarView = ezS.A03;
            gradientSpinnerAvatarView.A0G((AnonymousClass9IV) null, r3, DbS.A0g(list, 0).Bh3(), DbS.A0g(list, 1).Bh3());
            gradientSpinnerAvatarView.setGradientColorRes(R.style.MutualFollowRowGradientPatternStyle);
            TextView textView = ezS.A01;
            DbY.A0y(textView.getResources(), textView, Integer.valueOf(i2), 2131966735);
            ArrayList A1C = AnonymousClass7TE.A1C();
            int min = Math.min(list.size(), i3);
            for (int i4 = 0; i4 < min; i4++) {
                A1C.add(DbX.A0u(list, i4));
            }
            ezS.A02.setText(new C239023El(", ").A02(A1C));
            FP4.A01(ezS.A00, 40, e6h);
            AnonymousClass0fD.A0A(57388412, A03);
            return;
        }
        throw AnonymousClass7TE.A0z("Can't bind a follow list with less than 2 users.");
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -961292719);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.mutual_follow_list_row, false);
        A0A.setTag(new C49609EzS(A0A));
        AnonymousClass0fD.A0A(1025302444, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
