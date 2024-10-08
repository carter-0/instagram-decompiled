package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.2sX  reason: invalid class name and case insensitive filesystem */
public final class C231862sX extends C231632rz {
    public final Context A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final String getBinderGroupName() {
        return "ZeroRatingSlimBanner";
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

    public C231862sX(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1037871134);
        Context context = this.A00;
        UserSession userSession = this.A01;
        Object tag = view.getTag();
        tag.getClass();
        C49434Eva eva = (C49434Eva) tag;
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(eva, 2);
        String str = AnonymousClass1Qz.A00(userSession).C82().A06;
        TextView textView = eva.A00;
        if (str == null || str.length() <= 0) {
            str = context.getString(2131976988);
            0qQ.A07(str);
        }
        textView.setText(context.getString(2131976991, new Object[]{str}));
        textView.getPaint().setFakeBoldText(true);
        AnonymousClass0fD.A0A(380213719, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-2033438470);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.zero_rating_free_data_banner, viewGroup, false);
        0qQ.A0A(inflate);
        inflate.setTag(new C49434Eva(inflate));
        AnonymousClass0fD.A0A(685145065, A03);
        return inflate;
    }
}
