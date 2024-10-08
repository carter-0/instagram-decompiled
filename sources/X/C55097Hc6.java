package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Hc6  reason: case insensitive filesystem */
public abstract class C55097Hc6 {
    public static final void A00(Context context, C55887Hp8 hp8, String str, String str2) {
        View A08 = DbU.A08(LayoutInflater.from(context), R.layout.reel_tagging_title_subtitle_popup_bubble);
        0qQ.A07(A08);
        AnonymousClass7TG.A0R(A08, R.id.tooltip_bold_text).setText(str);
        TextView A0R = AnonymousClass7TG.A0R(A08, R.id.tooltip_plain_text);
        if (str2 == null || str2.length() == 0) {
            A0R.setVisibility(8);
        } else {
            A0R.setText(str2);
            A0R.setVisibility(0);
        }
        hp8.A02 = C54604HKn.A02;
        hp8.A01 = A08;
    }
}
