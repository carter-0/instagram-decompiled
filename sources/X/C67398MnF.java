package X;

import com.instagram.ui.widget.searchedittext.SearchEditText;

/* renamed from: X.MnF  reason: case insensitive filesystem */
public final class C67398MnF implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SearchEditText A02;

    public C67398MnF(SearchEditText searchEditText, int i, int i2) {
        this.A00 = i;
        this.A02 = searchEditText;
        this.A01 = i2;
    }

    public final void run() {
        AnonymousClass61R r1;
        int i = this.A00;
        SearchEditText searchEditText = this.A02;
        if (i == 0) {
            i = this.A01;
            r1 = searchEditText.A06;
            if (r1 != null && !r1.isPlaying()) {
                if (i == -1) {
                    r1.EFK();
                }
                r1.EFJ(i);
            } else {
                return;
            }
        } else {
            r1 = searchEditText.A05;
            if (r1 == null || r1.isPlaying()) {
                return;
            }
            r1.EFJ(i);
        }
        r1.E2p();
    }
}
