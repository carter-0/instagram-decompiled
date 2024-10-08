package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public final class NLX extends C231632rz {
    public final C18783W1j A00;
    public final AnonymousClass0iw A01;
    public final Integer A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(528772473);
        C68031Myx myx = (C68031Myx) DbT.A0o(view);
        C17966Vj0 vj0 = (C17966Vj0) obj;
        OBE obe = (OBE) obj2;
        int i2 = obe.A00;
        String str = obe.A01;
        C18783W1j w1j = this.A00;
        AnonymousClass0iw r8 = this.A01;
        0qQ.A0B(myx, 0);
        C51973G9u.A0r(1, vj0, w1j, r8);
        User user = vj0.A01;
        0qQ.A07(user);
        View view2 = myx.A01;
        int i3 = 0;
        view2.setPressed(false);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = myx.A06;
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r8, user.Bh3());
        gradientSpinnerAvatarView.setGradientSpinnerVisible(false);
        DbU.A1H(myx.A05, user);
        myx.A04.setText(user.B8Q());
        boolean z = vj0.A00;
        ImageView imageView = myx.A03;
        C294975nL A012 = C294975nL.A01(imageView, 0);
        0qQ.A07(A012);
        if (A012.A0W()) {
            A012.A0G();
            myx.A00.setEnabled(true);
            myx.A02.setEnabled(true);
        }
        JTR.A1B(imageView);
        imageView.setVisibility(8);
        View view3 = myx.A00;
        view3.setEnabled(true);
        View view4 = myx.A02;
        view4.setEnabled(true);
        view2.setActivated(z);
        view4.setVisibility(DbW.A01(vj0.A00 ? 1 : 0));
        if (vj0.A00) {
            i3 = 8;
        }
        view3.setVisibility(i3);
        2eS.A01(view4);
        2eS.A01(view3);
        C71405Ok4.A01(view2, 8, w1j, vj0);
        AnonymousClass0fU.A00(new FOC(w1j, myx, vj0, str, i2, 0), view3);
        AnonymousClass0fU.A00(new FOC(w1j, myx, vj0, str, i2, 1), view4);
        AnonymousClass0fD.A0A(1433930575, A03);
    }

    public NLX(C18783W1j w1j, AnonymousClass0iw r2, Integer num) {
        this.A00 = w1j;
        this.A02 = num;
        this.A01 = r2;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1116179326);
        Integer num = this.A02;
        Context A0C = JTP.A0C(viewGroup, 0);
        View A09 = DbU.A09(LayoutInflater.from(A0C), viewGroup, R.layout.user_list_row_item, false);
        0qQ.A0A(A0C);
        A09.setTag(new C68031Myx(A0C, A09, num));
        AnonymousClass0fD.A0A(-858582923, A03);
        return A09;
    }
}
