package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7el  reason: invalid class name and case insensitive filesystem */
public final class C336527el implements Runnable {
    public final /* synthetic */ C334347b7 A00;
    public final /* synthetic */ C62320sa A01;

    public C336527el(C334347b7 r1, C62320sa r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00.A0B;
        0nA.A0Q(composerAutoCompleteTextView);
        composerAutoCompleteTextView.requestFocus();
        this.A01.invoke();
    }
}
