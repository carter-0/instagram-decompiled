package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.307  reason: invalid class name */
public final class AnonymousClass307 extends C235412zs {
    public final void ATF(AnonymousClass30Y r5, C252093oY r6) {
        View view;
        0qQ.A0B(r5, 0);
        0qQ.A0B(r6, 1);
        Object obj = r5.A03;
        0qQ.A06(obj);
        AnonymousClass59J A02 = A02((1Xj) obj);
        if (r6.CEk(r5) != AnonymousClass05K.A0C && (view = (View) this.A00.get(obj)) != null) {
            View findViewById = view.findViewById(R.id.political_context);
            if (findViewById instanceof TextView) {
                A02.A08 = ((TextView) findViewById).getText().toString();
            }
        }
    }
}
