package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.zero.cms.ZeroCmsTextView;
import java.util.Arrays;

/* renamed from: X.6vz  reason: invalid class name and case insensitive filesystem */
public final class C322536vz extends C231632rz {
    public final Context A00;
    public final UserSession A01;
    public final Integer A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        return Arrays.hashCode(new Object[]{Boolean.valueOf(C238173Av.A02(userSession, "ig_free_data_banner_tooltip")), Boolean.valueOf(C238173Av.A01(userSession, A002))});
    }

    public C322536vz(Context context, UserSession userSession, Integer num) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = num;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1272577310);
        UserSession userSession = this.A01;
        Object tag = view.getTag();
        17k.A07(tag, "Tag set when creating view cannot be null");
        ORY.A00(userSession, (C2813757h) tag);
        AnonymousClass0fD.A0A(1890372249, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Context context;
        ImageView imageView;
        int i2;
        int A03 = AnonymousClass0fD.A03(871935179);
        Context context2 = this.A00;
        Integer num = this.A02;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context2).inflate(R.layout.zero_rating_video_setting_banner, viewGroup, false);
        C2813757h r2 = new C2813757h(linearLayout);
        int intValue = num.intValue();
        if (intValue == 0) {
            LinearLayout linearLayout2 = r2.A03;
            context = linearLayout2.getContext();
            linearLayout2.setBackgroundDrawable(context.getDrawable(R.drawable.video_setting_banner_background_blue));
            ZeroCmsTextView zeroCmsTextView = r2.A06;
            if (zeroCmsTextView != null) {
                zeroCmsTextView.setTextColor(context.getColor(R.color.design_dark_default_color_on_background));
            }
            TextView textView = r2.A04;
            if (textView != null) {
                textView.setTextColor(context.getColor(R.color.fds_white_alpha60));
            }
            imageView = r2.A02;
            if (imageView != null) {
                i2 = R.color.design_dark_default_color_on_background;
                imageView.setColorFilter(context.getColor(i2));
            }
        } else if (intValue == 2 || intValue == 1) {
            LinearLayout linearLayout3 = r2.A03;
            context = linearLayout3.getContext();
            linearLayout3.setBackgroundDrawable(context.getDrawable(R.drawable.video_setting_banner_background_white));
            ZeroCmsTextView zeroCmsTextView2 = r2.A06;
            if (zeroCmsTextView2 != null) {
                zeroCmsTextView2.setTextColor(context.getColor(R.color.zero_rating_video_settings_drawer_cancel_button_color));
            }
            TextView textView2 = r2.A04;
            if (textView2 != null) {
                textView2.setTextColor(context.getColor(R.color.zero_rating_video_settings_drawer_subtitle_color));
            }
            imageView = r2.A02;
            if (imageView != null) {
                i2 = R.color.baseline_neutral_80;
                imageView.setColorFilter(context.getColor(i2));
            }
        }
        linearLayout.setTag(r2);
        AnonymousClass0fD.A0A(-127120286, A03);
        return linearLayout;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return Arrays.hashCode(new Object[]{Integer.valueOf(i)});
    }
}
