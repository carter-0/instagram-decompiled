package X;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.destination.productcollection.ProductCollectionFragment;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

/* renamed from: X.Ues  reason: case insensitive filesystem */
public final class C15564Ues extends C231632rz {
    public final ProductCollectionFragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final int getViewTypeCount() {
        return 1;
    }

    private final void A00(TextView textView, String str) {
        if (str == null) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        C253003q3 r2 = new C253003q3(new SpannableStringBuilder(str), this.A02);
        r2.A03(new WXF(this, 2));
        SpannableStringBuilder A002 = r2.A00();
        0qQ.A07(A002);
        textView.setText(A002);
        textView.setMovementMethod(new LinkMovementMethod());
    }

    public C15564Ues(AnonymousClass0iw r1, UserSession userSession, ProductCollectionFragment productCollectionFragment) {
        this.A00 = productCollectionFragment;
        this.A02 = userSession;
        this.A01 = r1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1015184110);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        if (tag != null) {
            VYR vyr = (VYR) tag;
            C16735V3s v3s = (C16735V3s) obj;
            User user = v3s.A00;
            if (user != null) {
                GradientSpinnerAvatarView gradientSpinnerAvatarView = vyr.A03;
                gradientSpinnerAvatarView.setVisibility(0);
                gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this.A01, user.Bh3());
                WBD.A00(gradientSpinnerAvatarView, 57, this, user);
                gradientSpinnerAvatarView.setContentDescription(DbY.A0b(gradientSpinnerAvatarView.getContext(), user, 2131970055));
            } else {
                vyr.A03.setVisibility(8);
            }
            A00(vyr.A02, v3s.A03);
            A00(vyr.A01, v3s.A02);
            A00(vyr.A00, v3s.A01);
            AnonymousClass0fD.A0A(363142538, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-1388470513, A03);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1314822015);
        View A0C = DbT.A0C(DbX.A0F(viewGroup, 1), viewGroup, R.layout.product_feed_metadata_layout);
        0qQ.A0A(A0C);
        A0C.setTag(new VYR(A0C));
        AnonymousClass0fD.A0A(786995163, A03);
        return A0C;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
