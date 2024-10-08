package X;

import com.instagram.api.schemas.GiphyRequestSurface;

public final class M6U implements Runnable {
    public final /* synthetic */ C61738KKd A00;
    public final /* synthetic */ String A01;

    public M6U(C61738KKd kKd, String str) {
        this.A00 = kKd;
        this.A01 = str;
    }

    public final void run() {
        C61738KKd kKd = this.A00;
        String trim = this.A01.trim();
        kKd.A01 = trim;
        if (!trim.isEmpty()) {
            L6D l6d = kKd.A0E;
            C62564Khu khu = C62564Khu.GIPHY_GIFS;
            boolean z = false;
            if (trim.length() == 0) {
                z = true;
            }
            1OC A002 = C63450KxF.A00((GiphyRequestSurface) l6d.A02.get(), l6d.A00, trim, AnonymousClass7TE.A1I(khu));
            A002.A00 = new KAS(l6d, trim, 0, z);
            1ES.A03(A002);
        }
    }
}
