package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.fbpay.w3c.CardDetails;
import com.instagram.android.R;
import java.util.Locale;

public final class SGO {
    public static final SGO A00 = new Object();

    public final void A00(Context context, View view, CardDetails cardDetails) {
        String str;
        String str2;
        int length;
        0qQ.A0B(cardDetails, 2);
        if (context != null) {
            String str3 = cardDetails.A05;
            ((ImageView) AnonymousClass7TF.A0F(view, R.id.autofill_incomplete_payment_data_entry_card_icon)).setImageResource(C11334SNo.A01(str3).A00());
            StringBuilder A1A = AnonymousClass7TE.A1A();
            String str4 = cardDetails.A0A;
            String str5 = cardDetails.A07;
            if ((str4 == null || str4.length() != 4) && str5 != null && (length = str5.length()) > 4) {
                str4 = C66580MXl.A0z(str5, length - 4);
            }
            if (str3 == null || str3.length() == 0) {
                str = "";
            } else {
                str = C11334SNo.A01(str3).A03;
            }
            A1A.append(str);
            if (!(A1A.length() <= 0 || str4 == null || str4.length() == 0)) {
                A1A.append(" • ");
            }
            String A0l = AnonymousClass7TF.A0l(str4, A1A);
            0qQ.A07(A0l);
            AnonymousClass7TG.A0R(view, R.id.autofill_incomplete_payment_data_entry_card_number).setText(A0l);
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.autofill_incomplete_payment_data_entry_card_expiry_date);
            Integer num = cardDetails.A03;
            Integer num2 = cardDetails.A04;
            if (num == null || num2 == null) {
                str2 = "";
            } else {
                String string = context.getString(R.string.f0nameremoved);
                Locale locale = Pxf.A0G(context).locale;
                0qQ.A09(locale);
                String A12 = Pxe.A12(locale, "%02d", C66581MXm.A1b(num, 1));
                Locale locale2 = Pxf.A0G(context).locale;
                0qQ.A09(locale2);
                str2 = 002.A0j(string, A12, Pxg.A0v("%02d", locale2, AnonymousClass7TF.A1b(num2.intValue() % 100), 1), ' ', '/');
                0qQ.A07(str2);
            }
            if (str2.length() == 0) {
                A0R.setVisibility(8);
            } else {
                A0R.setText(str2);
            }
        }
    }
}
