package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.FsQ  reason: case insensitive filesystem */
public final class C51332FsQ implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C50302FXh A01;

    public C51332FsQ(Fragment fragment, C50302FXh fXh) {
        this.A00 = fragment;
        this.A01 = fXh;
    }

    public final void run() {
        if (this.A00.isResumed()) {
            C50302FXh fXh = this.A01;
            fXh.A01().A0T();
            C50302FXh.A00(fXh);
            2eQ.A02(fXh.A01().A0Q());
        }
    }
}
