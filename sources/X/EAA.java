package X;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public final class EAA extends C231632rz {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAA(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        int A03 = AnonymousClass0fD.A03(-502974889);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SearchSectionDescriptionViewBinder.Holder");
        C49393Euv euv = (C49393Euv) tag;
        C61069Jw7 jw7 = (C61069Jw7) obj;
        UserSession userSession = this.A01;
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass7TG.A1N(euv, jw7);
        IgTextView igTextView = euv.A00;
        DbT.A1H(igTextView);
        igTextView.setHighlightColor(R.color.fds_transparent);
        Object obj3 = jw7.A02;
        String str2 = null;
        if (obj3 != null) {
            str = obj3.toString();
        } else {
            str = null;
        }
        Object obj4 = jw7.A01;
        if (obj4 != null) {
            str2 = obj4.toString();
        }
        if (str == null || str2 == null || fragmentActivity == null || userSession == null) {
            spannableStringBuilder = (CharSequence) jw7.A00;
        } else {
            SpannableStringBuilder A0C = DbS.A0C((CharSequence) jw7.A00);
            AnonymousClass7AV.A05(A0C, new C48051ESu(fragmentActivity, userSession, str, DbV.A02(fragmentActivity), 5), str2);
            spannableStringBuilder = A0C;
        }
        igTextView.setText(spannableStringBuilder);
        AnonymousClass0fD.A0A(-1253100387, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -707001020);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.search_section_description, false);
        A0A.setTag(new C49393Euv(A0A));
        AnonymousClass0fD.A0A(-561839693, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
