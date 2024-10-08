package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.7eW  reason: invalid class name and case insensitive filesystem */
public final class C336377eW extends C336937fQ {
    public C336387eX A00;
    public final Context A01;
    public final AnonymousClass0iw A02;

    public C336377eW(Context context, AnonymousClass0iw r9, UserSession userSession, C336397eY r11, C336187eD r12, String str) {
        this.A01 = context;
        this.A02 = r9;
        this.A00 = new C336387eX(context, userSession, r11, this, r12, str);
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(4467341);
        if (view == null) {
            view = LayoutInflater.from(this.A01).inflate(R.layout.row_autocomplete_user, viewGroup, false);
            view.setTag(new A7F(view));
        }
        User user = (User) obj;
        Object tag = view.getTag();
        tag.getClass();
        A7F a7f = (A7F) tag;
        C336387eX r5 = this.A00;
        AnonymousClass0iw r2 = this.A02;
        a7f.A03.setText(user.getUsername());
        GradientSpinnerAvatarView gradientSpinnerAvatarView = a7f.A04;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r2, user.Bh3());
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        a7f.A00.setOnTouchListener(new C64278LYe(r5, user));
        boolean isEmpty = TextUtils.isEmpty(user.getFullName());
        TextView textView = a7f.A02;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(user.getFullName());
            C244273av.A0B(textView, user.isVerified());
        } else {
            textView.setVisibility(8);
            C244273av.A0B(textView, false);
        }
        if (!user.A2G()) {
            View view2 = a7f.A01;
            view2.setVisibility(0);
            AnonymousClass0fU.A00(new C40010ANq(r5, user), view2);
        } else {
            View view3 = a7f.A01;
            view3.setVisibility(8);
            view3.setOnClickListener((View.OnClickListener) null);
        }
        AnonymousClass0fD.A0A(-1857961602, A03);
        return view;
    }
}
