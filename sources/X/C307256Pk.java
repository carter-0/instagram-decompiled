package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

/* renamed from: X.6Pk  reason: invalid class name and case insensitive filesystem */
public final class C307256Pk implements C2365734g {
    public final /* synthetic */ C307246Pj A00;

    public C307256Pk(C307246Pj r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C307246Pj r1 = this.A00;
        TextView textView = (TextView) view.requireViewById(R.id.reel_chip_metadata_label_text);
        0qQ.A0B(textView, 0);
        r1.A00 = textView;
        RoundedCornerFrameLayout roundedCornerFrameLayout = (RoundedCornerFrameLayout) view.requireViewById(R.id.reel_metadata_chip_view);
        0qQ.A0B(roundedCornerFrameLayout, 0);
        r1.A01 = roundedCornerFrameLayout;
    }
}
