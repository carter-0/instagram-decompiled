package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.46z  reason: invalid class name and case insensitive filesystem */
public final class C2607746z implements C2365734g {
    public final /* synthetic */ C258303yn A00;

    public C2607746z(C258303yn r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        0qQ.A0B(view, 0);
        C258303yn r1 = this.A00;
        r1.A02 = (TextView) view.findViewById(R.id.feed_preview_watch_again_text);
        r1.A00 = (ViewGroup) view.findViewById(R.id.feed_cta_button);
        r1.A01 = (TextView) view.findViewById(R.id.feed_cta_button_text);
    }
}
