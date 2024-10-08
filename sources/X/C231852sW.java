package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sW  reason: invalid class name and case insensitive filesystem */
public final class C231852sW extends C231632rz {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final String getBinderGroupName() {
        return "ZeroRatingNewResBanner";
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C231852sW(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1016161244);
        Context context = this.A00;
        UserSession userSession = this.A01;
        Object tag = view.getTag();
        tag.getClass();
        C10327RqP rqP = (C10327RqP) tag;
        if (rqP.A00 != null) {
            1R7 C82 = AnonymousClass1Qz.A00(userSession).C82();
            TextView textView = rqP.A00;
            String str = C82.A06;
            if (str == null || str.isEmpty()) {
                str = context.getString(2131976988);
            }
            textView.setText(context.getString(2131976991, new Object[]{str}));
            rqP.A00.getPaint().setFakeBoldText(true);
        }
        AnonymousClass0fD.A0A(-1167349107, A03);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.RqP, java.lang.Object] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(84419179);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.zero_rating_free_data_banner, viewGroup, false);
        ? obj = new Object();
        obj.A00 = (TextView) inflate.findViewById(R.id.title);
        inflate.setTag(obj);
        AnonymousClass0fD.A0A(-1979608776, A03);
        return inflate;
    }
}
