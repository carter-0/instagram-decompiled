package X;

import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

public final class M44 implements Runnable {
    public final /* synthetic */ C63853L9i A00;

    public M44(C63853L9i l9i) {
        this.A00 = l9i;
    }

    public final void run() {
        C63853L9i l9i = this.A00;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = l9i.A03;
        composerAutoCompleteTextView.clearFocus();
        composerAutoCompleteTextView.postDelayed(new M43(l9i), 60);
    }
}
