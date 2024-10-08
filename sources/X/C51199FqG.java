package X;

import android.widget.HorizontalScrollView;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;

/* renamed from: X.FqG  reason: case insensitive filesystem */
public final class C51199FqG implements Runnable {
    public final /* synthetic */ C50423FbW A00;

    public C51199FqG(C50423FbW fbW) {
        this.A00 = fbW;
    }

    public final void run() {
        C50423FbW fbW = this.A00;
        SearchWithDeleteEditText searchWithDeleteEditText = fbW.A07;
        boolean hasFocus = searchWithDeleteEditText.hasFocus();
        HorizontalScrollView horizontalScrollView = fbW.A05;
        horizontalScrollView.fullScroll(66);
        horizontalScrollView.clearFocus();
        if (hasFocus) {
            searchWithDeleteEditText.requestFocus();
        }
    }
}
