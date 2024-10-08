package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.9WJ  reason: invalid class name */
public final class AnonymousClass9WJ extends Dialog {
    public final ProgressBar A00 = ((ProgressBar) findViewById(R.id.loading_progress_bar));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9WJ(Context context, String str) {
        super(context, R.style.IgDialogDeprecated);
        0qQ.A0B(str, 2);
        setContentView(R.layout.capture_edit_progress_dialog);
        setCancelable(false);
        ((TextView) findViewById(R.id.message)).setText(str);
    }
}
