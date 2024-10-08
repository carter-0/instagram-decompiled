package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7Cd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C327777Cd implements C62320sa {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ C327777Cd(C329067Hl r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        C329307Ij r3 = this.A00.A0b;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = r3.A0S;
        r3.A01 = composerAutoCompleteTextView.getSelectionStart();
        int selectionEnd = composerAutoCompleteTextView.getSelectionEnd();
        r3.A00 = selectionEnd;
        return r3.A0Y.A00.substring(r3.A01, selectionEnd);
    }
}
