package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6ST  reason: invalid class name */
public final class AnonymousClass6ST extends Dialog {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass6ST(Context context) {
        this(context, true);
        0qQ.A0B(context, 1);
    }

    public final void A00(String str) {
        View findViewById = findViewById(R.id.message);
        0qQ.A07(findViewById);
        TextView textView = (TextView) findViewById;
        textView.setVisibility(0);
        textView.setText(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6ST(Context context, boolean z) {
        super(context, R.style.IgDialog);
        0qQ.A0B(context, 1);
        setContentView(z ? R.layout.progress_dialog : R.layout.progress_dialog_without_spinner);
        setCancelable(false);
    }
}
