package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.android.maps.StaticMapView;
import com.instagram.android.R;
import com.instagram.maps.ui.IgStaticMapView;

public abstract class ORR {
    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.MwQ] */
    public static final C67882MwQ A00(Context context, ViewGroup viewGroup, boolean z) {
        0qQ.A0B(viewGroup, 1);
        View A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.login_activity_map_item, z);
        0qQ.A0B(A09, 1);
        ? r1 = new C249703kE(A09);
        r1.A08 = (IgStaticMapView) AnonymousClass7TF.A0F(A09, R.id.login_activity_map_view);
        r1.A03 = AnonymousClass7TG.A0R(A09, R.id.left_button);
        r1.A04 = AnonymousClass7TG.A0R(A09, R.id.right_button);
        r1.A01 = (LinearLayout) AnonymousClass7TF.A0F(A09, R.id.button_container);
        r1.A02 = AnonymousClass7TG.A0R(A09, R.id.confirm_text);
        r1.A07 = AnonymousClass7TG.A0R(A09, R.id.title_message);
        r1.A06 = AnonymousClass7TG.A0R(A09, R.id.body_message_timestamp);
        r1.A05 = AnonymousClass7TG.A0R(A09, R.id.body_message_device);
        r1.A00 = DbX.A0J(A09, R.id.status_icon);
        return r1;
    }

    public static final void A01(Context context, C70972OTt oTt, C74476PvW pvW, C67882MwQ mwQ, boolean z) {
        ImageView imageView;
        int i;
        C70972OTt oTt2 = oTt;
        C67882MwQ mwQ2 = mwQ;
        AnonymousClass7TF.A1B(mwQ, 1, oTt);
        Context context2 = context;
        if (oTt.A0B) {
            ViewGroup.LayoutParams layoutParams = mwQ.itemView.getLayoutParams();
            0qQ.A0C(layoutParams, C273654mx.A00(9));
            layoutParams.height = DbS.A03(context.getResources(), R.dimen.alt_text_carousel_card_width);
            if (!z) {
                layoutParams.width = DbS.A03(context.getResources(), R.dimen.login_history_map_width);
            }
            mwQ.A03.setVisibility(0);
            imageView = mwQ.A00;
            i = R.drawable.instagram_error_pano_outline_24;
        } else {
            mwQ.A01.setVisibility(8);
            imageView = mwQ.A00;
            i = R.drawable.instagram_location_pano_outline_24;
        }
        DbU.A13(context, imageView, i);
        DbX.A12(context, imageView, 2Yu.A0B(context));
        IgStaticMapView igStaticMapView = mwQ.A08;
        igStaticMapView.setEnabled(true);
        igStaticMapView.A07 = C69419Nl1.TOP_RIGHT;
        StaticMapView.StaticMapOptions staticMapOptions = new StaticMapView.StaticMapOptions("review_suspicious_login_map");
        staticMapOptions.A02((double) oTt.A00, (double) oTt.A01);
        staticMapOptions.A03(11);
        igStaticMapView.setMapOptions(staticMapOptions);
        AnonymousClass0fU.A00(new C71400Ojz(18, (Object) pvW, (Object) oTt2, (Object) mwQ2, (Object) context2), mwQ.A03);
        C71409Ok8.A01(mwQ.A04, 42, oTt, pvW);
        String A06 = 1G0.A06(context, System.currentTimeMillis());
        String A16 = AnonymousClass7TE.A16(context, 2131965575);
        String A0u = DbV.A0u(context, A06, A16, 2131965574);
        0qQ.A07(A0u);
        AnonymousClass7AV.A07(new C69193Ngr(context, oTt, pvW, mwQ, C51968G9o.A04(context)), mwQ.A02, A16, A0u);
        TextView textView = mwQ.A07;
        String str = oTt.A07;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        mwQ.A06.setText(O3F.A00(context, oTt));
        TextView textView2 = mwQ.A05;
        String str2 = oTt.A05;
        if (str2 == null) {
            str2 = "";
        }
        textView2.setText(str2);
    }
}
