package X;

import java.util.List;

public final class PVD implements Runnable {
    public final /* synthetic */ C68488NKh A00;

    public PVD(C68488NKh nKh) {
        this.A00 = nKh;
    }

    public final void run() {
        C68488NKh nKh = this.A00;
        C74544Pwd pwd = nKh.A04;
        if (pwd != null) {
            pwd.CgL();
        } else {
            C68488NKh.A00(nKh, (List) null);
        }
    }
}
