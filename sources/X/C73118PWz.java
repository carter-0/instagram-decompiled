package X;

import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.PWz  reason: case insensitive filesystem */
public final class C73118PWz implements Runnable {
    public final /* synthetic */ PM8 A00;

    public C73118PWz(PM8 pm8) {
        this.A00 = pm8;
    }

    public final void run() {
        PM8 pm8 = this.A00;
        TextView textView = pm8.A00;
        if (textView == null) {
            textView = AnonymousClass7TE.A0d(pm8.A01, R.id.ar_effect_instruction_text);
            pm8.A00 = textView;
            if (textView == null) {
                return;
            }
        }
        DbS.A1C(textView);
    }
}
