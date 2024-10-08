package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

public final /* synthetic */ class M3P implements Runnable {
    public final /* synthetic */ K5H A00;

    public /* synthetic */ M3P(K5H k5h) {
        this.A00 = k5h;
    }

    public final void run() {
        K5H k5h = this.A00;
        SearchEditText searchEditText = k5h.A0J;
        if (searchEditText != null && k5h.A0O) {
            searchEditText.requestFocus();
            0nA.A0Q(k5h.A0J);
        }
    }
}
