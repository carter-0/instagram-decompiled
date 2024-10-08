package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class F5C {
    public static final void A00(View view, String str) {
        View A0G = AnonymousClass7TF.A0G(view, R.id.primary_text);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        A0G.setVisibility(8);
        if (str != null) {
            A0R.setText(str);
            A0R.setVisibility(0);
            return;
        }
        A0R.setVisibility(8);
    }
}
