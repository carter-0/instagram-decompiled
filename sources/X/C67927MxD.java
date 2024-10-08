package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.MxD  reason: case insensitive filesystem */
public final class C67927MxD extends C249703kE {
    public final TextView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67927MxD(View view) {
        super(view);
        0qQ.A0B(view, 1);
        View findViewById = view.findViewById(R.id.secondary_cta_button);
        TextView textView = (TextView) findViewById;
        2eS.A01(textView);
        0qQ.A07(findViewById);
        this.A00 = textView;
    }
}
