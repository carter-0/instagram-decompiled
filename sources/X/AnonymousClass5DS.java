package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.5DS  reason: invalid class name */
public final class AnonymousClass5DS implements View.OnClickListener {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ C376499If A01;

    public AnonymousClass5DS(TextView textView, C376499If r2) {
        this.A00 = textView;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1606981191);
        TextView textView = this.A00;
        if (textView.getSelectionStart() == -1 && textView.getSelectionEnd() == -1) {
            ((C62320sa) ((C376459Ib) this.A01.A01).A00).invoke();
        }
        AnonymousClass0fD.A0C(557232815, A05);
    }
}
