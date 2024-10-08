package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.QgE  reason: case insensitive filesystem */
public final class C8062QgE extends ONB {
    public final Integer A00 = AnonymousClass05K.A0C;
    public final String A01;
    public final String A02;

    public final View A01(Context context, LayoutInflater layoutInflater, View view, ViewGroup viewGroup, int i) {
        String str;
        int i2 = 0;
        AnonymousClass7TF.A1H(context, layoutInflater);
        if (view == null) {
            view = layoutInflater.inflate(R.layout.fbpay_auto_complete_user_action_item, viewGroup, false);
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.auto_complete_user_action);
            View A0G = AnonymousClass7TF.A0G(view, R.id.auto_complete_divider);
            SRn.A02(A0R, RH2.A1G);
            AnonymousClass2E0.A0A();
            Pxf.A1B(A0G, context.getColor(R.color.igds_separator));
        }
        C11496SbJ.A01(view, 7, this);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.auto_complete_user_action);
        DbT.A18(context, A0R2, 2131961182);
        ImageView imageView = (ImageView) AnonymousClass7TF.A0F(view, R.id.auto_complete_icon);
        AnonymousClass0fU.A00(C11494SbH.A00, imageView);
        AnonymousClass2E0.A0A();
        if (AnonymousClass3HA.A00(context)) {
            str = this.A01;
        } else {
            str = this.A02;
        }
        if (str != null) {
            imageView.setVisibility(0);
            new C8287QnT(AnonymousClass2E0.A0G().A00, str, "AttributionLabel").A02(imageView);
        } else {
            imageView.setVisibility(8);
            i2 = context.getResources().getDimensionPixelOffset(R.dimen.action_bar_item_spacing_right);
        }
        A0R2.setPadding(A0R2.getPaddingLeft(), A0R2.getPaddingTop(), A0R2.getPaddingRight(), i2);
        return view;
    }

    public final Integer A02() {
        return this.A00;
    }

    public final boolean A03() {
        return true;
    }

    public C8062QgE(String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
    }
}
