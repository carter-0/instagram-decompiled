package X;

import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.user.model.Product;

/* renamed from: X.Wnn  reason: case insensitive filesystem */
public final class C20248Wnn implements Runnable {
    public final /* synthetic */ UES A00;
    public final /* synthetic */ Product A01;

    public C20248Wnn(UES ues, Product product) {
        this.A00 = ues;
        this.A01 = product;
    }

    public final void run() {
        TextView textView = this.A00.A08;
        String str = this.A01.A0J;
        if (str == null) {
            str = "";
        }
        textView.setText(W2t.A06(textView, str, R.dimen.abc_control_corner_material, textView.getWidth()));
    }
}
