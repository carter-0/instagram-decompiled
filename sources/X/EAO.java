package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class EAO extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C17256VOj A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        Object obj3 = obj;
        View view2 = view;
        int A04 = DbX.A04(view2, 1572206951);
        0qQ.A0B(obj3, 2);
        UserSession userSession = this.A01;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.reels.dashboard.JoinChatRequestsViewHolder");
        C48246EbR ebR = (C48246EbR) tag;
        C61082JwK jwK = (C61082JwK) obj3;
        C17256VOj vOj = this.A02;
        AnonymousClass0iw r10 = this.A00;
        AnonymousClass7TF.A1H(userSession, ebR);
        AnonymousClass7TG.A0w(2, jwK, vOj, r10);
        User user = (User) jwK.A00;
        IgTextView igTextView = ebR.A02;
        Context context = igTextView.getContext();
        if (DbV.A0i(userSession, user) == FollowStatus.A05) {
            str = context.getString(2131962634);
        } else {
            str = null;
        }
        F03 f03 = ebR.A03;
        C49181Eqm.A00(r10, user.Bh3(), f03, user.getUsername(), user.getFullName(), str, user.isVerified());
        FPG.A00(f03.A00, 44, vOj, user);
        IgSimpleImageView igSimpleImageView = ebR.A01;
        igSimpleImageView.setVisibility(0);
        AnonymousClass0fU.A00(new C71409Ok8(18, (Object) user, (Object) vOj), igSimpleImageView);
        AnonymousClass0fU.A00(new C71409Ok8(19, (Object) user, (Object) vOj), igTextView);
        if (jwK.A01) {
            DbS.A1C(igTextView);
            ebR.A00.setVisibility(0);
        } else {
            DbT.A18(context, igTextView, 2131952258);
            ebR.A00.setVisibility(8);
        }
        AnonymousClass0fD.A0A(-2137395829, A04);
    }

    public EAO(AnonymousClass0iw r1, UserSession userSession, C17256VOj vOj) {
        AnonymousClass7TG.A1P(userSession, r1);
        this.A01 = userSession;
        this.A02 = vOj;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.EbR, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1858312556);
        0qQ.A0B(viewGroup, 1);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.chat_requests_row, false);
        0qQ.A0B(A0A, 1);
        ? obj = new Object();
        obj.A03 = new F03(A0A);
        obj.A01 = (IgSimpleImageView) AnonymousClass7TE.A0b(A0A, R.id.menu_button);
        obj.A02 = Dba.A0E(A0A, R.id.main_button);
        obj.A00 = (IgProgressBar) AnonymousClass7TE.A0b(A0A, R.id.loading_indicator);
        A0A.setTag(obj);
        AnonymousClass0fD.A0A(-1255377707, A03);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1H(r1);
    }
}
