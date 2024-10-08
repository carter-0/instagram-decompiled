package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.Akp  reason: case insensitive filesystem */
public final /* synthetic */ class C40881Akp implements Runnable {
    public final /* synthetic */ C329307Ij A00;

    public /* synthetic */ C40881Akp(C329307Ij r1) {
        this.A00 = r1;
    }

    public final void run() {
        C329307Ij r0 = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = r0.A0S;
        composerAutoCompleteTextView.setText(r0.A0Y.A00);
        composerAutoCompleteTextView.setSelection(composerAutoCompleteTextView.getText().length());
    }
}
