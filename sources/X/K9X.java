package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.User;

public final class K9X extends C231632rz {
    public final AnonymousClass0iw A00;
    public final C65634LxB A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        SimpleImageUrl Bh3;
        int i2;
        Object obj3 = obj;
        int A03 = AnonymousClass0fD.A03(1133932270);
        View view2 = view;
        0qQ.A0B(view2, 1);
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.OpalRowViewBinder.Holder");
        C63843L8y l8y = (C63843L8y) tag;
        AnonymousClass0iw r11 = this.A00;
        0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.recipientpicker.OpalRowViewModel");
        C64777Lht lht = (C64777Lht) obj3;
        C65634LxB lxB = this.A01;
        0qQ.A0B(l8y, 0);
        DbZ.A0t(1, r11, lht, lxB);
        View view3 = l8y.A00;
        LY0.A00(view3, 70, lxB);
        Context A0S = AnonymousClass7TE.A0S(view3);
        User A012 = AnonymousClass0t1.A01.A01(lht.A00);
        C267564bl BYD = A012.A03.BYD();
        if (BYD != null) {
            Bh3 = DbS.A0V(BYD.Bh8());
        } else {
            Bh3 = A012.Bh3();
        }
        String username = A012.getUsername();
        C51967G9n.A0v();
        if (BYD != null) {
            i2 = BYD.BrZ();
        } else {
            i2 = 1;
        }
        String A0v = DbV.A0v(A0S.getResources(), C14066TpE.A01(A0S.getResources(), Integer.valueOf(i2), true), R.plurals.opal_post_selection_subtitle, i2);
        0qQ.A07(A0v);
        l8y.A03.setUrl(Bh3, r11);
        l8y.A04.setChecked(lht.A01);
        l8y.A01.setText(username);
        IgTextView igTextView = l8y.A02;
        igTextView.setVisibility(0);
        igTextView.setText(A0v);
        AnonymousClass0fD.A0A(520022158, A03);
    }

    public K9X(AnonymousClass0iw r1, C65634LxB lxB) {
        this.A01 = lxB;
        this.A00 = r1;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1121539643);
        Context context = viewGroup.getContext();
        View A0A = DbU.A0A(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_story, false);
        0qQ.A07(context);
        A0A.setTag(new C63843L8y(A0A));
        AnonymousClass0fD.A0A(-1035432406, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
