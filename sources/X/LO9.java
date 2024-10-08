package X;

import android.content.Context;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.UpcomingEvent;
import java.util.Date;

public final class LO9 {
    public TextWatcher A00;
    public final Context A01;
    public final K6D A02;
    public final LBP A03;
    public final UserSession A04;

    public LO9(Context context, UserSession userSession, K6D k6d, LBP lbp) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = lbp;
        this.A02 = k6d;
    }

    public static final void A00(LO9 lo9) {
        0nA.A0N(lo9.A03.A03);
        K6D k6d = lo9.A02;
        C60952JuA juA = k6d.A03;
        String str = "viewState";
        if (juA != null) {
            UpcomingEvent upcomingEvent = juA.A01;
            C62569Khz khz = juA.A00;
            String str2 = juA.A02;
            Date date = juA.A04;
            Date date2 = juA.A03;
            boolean z = juA.A06;
            AnonymousClass7TG.A1O(khz, str2);
            C60952JuA juA2 = new C60952JuA(khz, upcomingEvent, str2, date, date2, false, z);
            k6d.A03 = juA2;
            Date date3 = juA2.A03;
            if (date3 == null) {
                Date date4 = juA2.A04;
                if (date4 != null) {
                    date3 = new Date(date4.getTime() + K6D.A0B);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            OVW ovw = k6d.A00;
            if (ovw == null) {
                str = "datePickerController";
            } else {
                ovw.A01(true, k6d.requireContext().getString(2131952344), date3, (Date) null, (Date) null, true);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01(Date date, Date date2) {
        Context context;
        LBP lbp = this.A03;
        if (date != null) {
            TextView textView = lbp.A0C;
            context = this.A01;
            textView.setText(C14240TsN.A02(context, this.A04, date.getTime()));
            textView.setVisibility(0);
            ImageView imageView = lbp.A08;
            DbU.A13(context, imageView, R.drawable.instagram_x_pano_outline_12);
            LY5.A01(imageView, 21, this);
            imageView.setImportantForAccessibility(1);
            DbU.A12(context, imageView, 2131957603);
            2eS.A01(imageView);
            lbp.A01.setVisibility(0);
        } else {
            ImageView imageView2 = lbp.A08;
            context = this.A01;
            DbU.A13(context, imageView2, R.drawable.instagram_chevron_right_pano_outline_12);
            LY5.A01(imageView2, 22, this);
            imageView2.setImportantForAccessibility(2);
            lbp.A0C.setVisibility(8);
            lbp.A01.setVisibility(8);
        }
        if (date2 != null) {
            TextView textView2 = lbp.A0A;
            textView2.setText(C14240TsN.A02(context, this.A04, date2.getTime()));
            textView2.setVisibility(0);
            ImageView imageView3 = lbp.A06;
            DbU.A13(context, imageView3, R.drawable.instagram_x_pano_outline_12);
            LY5.A01(imageView3, 23, this);
            imageView3.setImportantForAccessibility(1);
            DbU.A12(context, imageView3, 2131957558);
            2eS.A01(imageView3);
            return;
        }
        ImageView imageView4 = lbp.A06;
        DbU.A13(context, imageView4, R.drawable.instagram_chevron_right_pano_outline_12);
        LY5.A01(imageView4, 24, this);
        imageView4.setImportantForAccessibility(2);
        lbp.A0A.setVisibility(8);
    }
}
