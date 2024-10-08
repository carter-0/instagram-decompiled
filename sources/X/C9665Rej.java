package X;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.instagram.android.R;

/* renamed from: X.Rej  reason: case insensitive filesystem */
public abstract class C9665Rej {
    public static void A00(Bundle bundle, Toolbar toolbar, String str, boolean z) {
        int i;
        TextView A0d = AnonymousClass7TE.A0d(toolbar, R.id.fbpay_toolbar_title);
        if (A0d != null) {
            AuthScreenStyle authScreenStyle = (AuthScreenStyle) bundle.getParcelable("AUTH_SCREEN_STYLE");
            if (authScreenStyle == null || (i = authScreenStyle.A00) == 0) {
                i = 2131962112;
                if (z) {
                    i = 2131966476;
                }
            } else if (i == -1) {
                A0d.setText("");
                return;
            }
            A0d.setText(i);
            return;
        }
        toolbar.setTitle((CharSequence) str);
    }
}
