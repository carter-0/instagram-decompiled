package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

public final class M42 implements Runnable {
    public final /* synthetic */ C63853L9i A00;

    public M42(C63853L9i l9i) {
        this.A00 = l9i;
    }

    public final void run() {
        C63853L9i l9i = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = l9i.A03;
        composerAutoCompleteTextView.requestFocus();
        composerAutoCompleteTextView.postDelayed(new M41(l9i), 60);
    }
}
