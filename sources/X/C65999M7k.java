package X;

import com.instagram.music.search.MusicOverlayResultsListController;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.M7k  reason: case insensitive filesystem */
public final class C65999M7k implements Runnable {
    public final /* synthetic */ C66569MWx A00;
    public final /* synthetic */ MusicOverlayResultsListController A01;

    public C65999M7k(C66569MWx mWx, MusicOverlayResultsListController musicOverlayResultsListController) {
        this.A01 = musicOverlayResultsListController;
        this.A00 = mWx;
    }

    public final void run() {
        C60379JkY jkY = this.A01.A0E;
        List list = jkY.mDiffer.A02;
        0qQ.A07(list);
        C66569MWx mWx = this.A00;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            L25 l25 = (L25) it.next();
            if ((l25 instanceof KV4) && ((KV4) l25).A00(mWx)) {
                break;
            }
            i++;
        }
        jkY.notifyItemChanged(i);
    }
}
