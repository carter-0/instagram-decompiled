package X;

import androidx.appcompat.widget.Toolbar;

/* renamed from: X.WhV  reason: case insensitive filesystem */
public final /* synthetic */ class C19900WhV implements Runnable {
    public final /* synthetic */ Toolbar A00;

    public /* synthetic */ C19900WhV(Toolbar toolbar) {
        this.A00 = toolbar;
    }

    public final void run() {
        C18934WDm wDm;
        WDS wds = this.A00.A0G;
        if (wds != null && (wDm = wds.A01) != null) {
            wDm.collapseActionView();
        }
    }
}
