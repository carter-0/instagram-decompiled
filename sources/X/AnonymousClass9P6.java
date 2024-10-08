package X;

import android.content.Context;
import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.9P6  reason: invalid class name */
public abstract class AnonymousClass9P6 {
    public static final void A00(Context context, AnonymousClass9IR r2, IgdsButton igdsButton) {
        igdsButton.setText(context.getString(r2.A01));
        igdsButton.setLoading(r2.A04);
        AnonymousClass0fU.A00((View.OnClickListener) r2.A02, igdsButton);
        igdsButton.setEnabled(r2.A03);
    }
}
