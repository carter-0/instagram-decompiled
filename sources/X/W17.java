package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;

public final class W17 {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C73914Plp(this, 49));
    public final boolean A02;

    public W17(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = 182.A06(0Tu.A06, userSession, 36315657884732877L);
    }

    public static final void A01(Context context, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, W17 w17, MediaMapPin mediaMapPin) {
        Integer num;
        int intValue;
        LocationPageInformation locationPageInformation = mediaMapPin.A06;
        if (locationPageInformation != null && (num = locationPageInformation.A03) != null && (intValue = num.intValue()) > 0) {
            UserSession userSession = w17.A00;
            A00(spannableStringBuilder, C18792W1y.A00(context, userSession, intValue), " • ");
            StringBuilder sb = new StringBuilder();
            String symbol = C18792W1y.A03(userSession).getSymbol();
            int i = 0;
            do {
                sb.append(symbol);
                i++;
            } while (i < intValue);
            A00(spannableStringBuilder2, sb.toString(), " • ");
        }
    }

    public static final SpannableStringBuilder A00(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str) {
        if (spannableStringBuilder.length() > 0 && charSequence != null) {
            spannableStringBuilder = spannableStringBuilder.append(str).append(charSequence);
        } else if (charSequence != null) {
            spannableStringBuilder = spannableStringBuilder.append(charSequence);
        }
        0qQ.A09(spannableStringBuilder);
        return spannableStringBuilder;
    }

    public static final void A02(TextView textView, C17692VcN vcN, W17 w17, CharSequence charSequence, CharSequence charSequence2) {
        View findViewById;
        if (charSequence.length() > 0) {
            textView.setMaxLines(2);
            textView.setText(charSequence);
            textView.setContentDescription(charSequence2);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
        if (w17.A02 && (findViewById = vcN.A09.getRootView().findViewById(R.id.location_information_wrapper)) != null) {
            findViewById.post(new C20209Wn9(findViewById, vcN));
        }
    }
}
