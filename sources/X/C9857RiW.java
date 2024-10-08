package X;

import android.app.Dialog;
import android.content.Context;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.RiW  reason: case insensitive filesystem */
public abstract class C9857RiW {
    /* JADX WARNING: type inference failed for: r3v0, types: [X.9WI, android.app.Dialog, java.lang.Object] */
    public static final AnonymousClass9WI A00(Context context, String str, C62320sa r6) {
        ? dialog = new Dialog(context);
        dialog.setContentView(R.layout.cancelable_dialog);
        DbT.A18(dialog.getContext(), (TextView) dialog.findViewById(R.id.negative_button), 2131954722);
        C11495SbI.A00(dialog.findViewById(R.id.negative_button_row), 23, dialog);
        TextView textView = (TextView) dialog.findViewById(R.id.message);
        textView.setVisibility(0);
        textView.setText(str);
        dialog.setOnDismissListener(new SVF(r6, 8));
        return dialog;
    }
}
