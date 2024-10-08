package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7dy  reason: invalid class name and case insensitive filesystem */
public final class C336047dy implements Runnable {
    public final /* synthetic */ C334347b7 A00;
    public final /* synthetic */ C62320sa A01;

    public C336047dy(C334347b7 r1, C62320sa r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        C334347b7 r1 = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = r1.A0B;
        composerAutoCompleteTextView.requestFocus();
        composerAutoCompleteTextView.postDelayed(new C336527el(r1, this.A01), 60);
    }
}
