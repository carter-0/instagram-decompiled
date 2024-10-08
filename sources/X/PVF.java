package X;

import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class PVF implements Runnable {
    public final /* synthetic */ C68482NJz A00;

    public PVF(C68482NJz nJz) {
        this.A00 = nJz;
    }

    public final void run() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A00.A0J;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A0E.requestFocus();
        }
    }
}
