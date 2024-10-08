package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.igds.components.button.IgdsButton;

public abstract class O30 {
    public static void A00(View view, C70661OFi oFi, boolean z, boolean z2, boolean z3) {
        String str;
        C67960Mxk mxk = (C67960Mxk) DbT.A0o(view);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        IgdsButton igdsButton = mxk.A01;
        igdsButton.setLoading(z3);
        if (z3) {
            str = "";
        } else {
            str = oFi.A02;
        }
        igdsButton.setText(str);
        TextView textView = mxk.A00;
        textView.setText(oFi.A03);
        textView.setTextColor(oFi.A00);
        igdsButton.setEnabled(z);
        if (z) {
            AnonymousClass0fU.A00(oFi.A01, igdsButton);
        }
        textView.setVisibility(DbW.A01(z2 ? 1 : 0));
    }
}
