package X;

import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class TKS implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Bitmap A01;
    public final /* synthetic */ C376649Iu A02;
    public final /* synthetic */ TL0 A03;
    public final /* synthetic */ boolean A04;

    public TKS(Bitmap bitmap, C376649Iu r2, TL0 tl0, int i, boolean z) {
        this.A03 = tl0;
        this.A01 = bitmap;
        this.A00 = i;
        this.A04 = z;
        this.A02 = r2;
    }

    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A03.A00;
        Bitmap bitmap = this.A01;
        int i = this.A00;
        boolean z = this.A04;
        C376649Iu r2 = this.A02;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((C13761TgX) it.next()).DJH(bitmap, r2, i, z);
        }
    }
}
