package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.E9y  reason: case insensitive filesystem */
public final class C47612E9y extends C231632rz {
    public final Context A00;
    public final C46430Der A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47612E9y(Context context, C46430Der der) {
        this.A00 = context;
        this.A01 = der;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(934573693);
        AnonymousClass7TG.A1O(view, obj);
        0qQ.A0B(obj2, 3);
        Context context = this.A00;
        Object tag = view.getTag();
        if (tag != null) {
            F0Y f0y = (F0Y) tag;
            int A0M = AnonymousClass7TE.A0M(obj2);
            C46539Dgg dgg = (C46539Dgg) obj;
            C46430Der der = this.A01;
            AnonymousClass7TF.A1H(context, f0y);
            AnonymousClass7TF.A1D(dgg, 3, der);
            Resources resources = context.getResources();
            int i2 = R.dimen.abc_button_padding_horizontal_material;
            if (A0M == 0) {
                i2 = R.dimen.account_discovery_bottom_gap;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i2);
            View view2 = f0y.A00;
            0nA.A0c(view2, dimensionPixelSize);
            view2.setBackgroundColor(0);
            LinearLayout linearLayout = f0y.A01;
            0nA.A0Z(linearLayout, AnonymousClass7TE.A0F(linearLayout.getResources()));
            ? r2 = f0y.A04;
            boolean z = dgg.A03;
            int i3 = R.drawable.profile_anonymous_user;
            if (z) {
                i3 = R.drawable.instagram_contacts_pano_outline_24;
            }
            DbU.A13(context, r2, i3);
            r2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
            Resources resources2 = r2.getResources();
            layoutParams.height = DbS.A03(resources2, R.dimen.action_button_settings_height);
            layoutParams.width = DbS.A03(resources2, R.dimen.action_button_settings_height);
            f0y.A02.setText(dgg.A01);
            f0y.A03.setText(dgg.A02);
            IgdsButton igdsButton = f0y.A05;
            igdsButton.setText(02K.A01(context).getString(2131964477));
            FPF.A00(igdsButton, 19, der, dgg);
            AnonymousClass0fD.A0A(709817587, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(766078463, A03);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1553835630);
        View A0A = DbU.A0A(DbT.A0B(this.A00), viewGroup, R.layout.row_invite_contact, false);
        A0A.setTag(new F0Y(A0A));
        A0A.setId(R.id.recommended_user_row_content_identifier);
        AnonymousClass0fD.A0A(778158211, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1H(r1);
    }
}
