package X;

import android.view.Choreographer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/* renamed from: X.ViO  reason: case insensitive filesystem */
public final class C17933ViO {
    public long A00;
    public List A01 = new ArrayList();
    public List A02 = new ArrayList();
    public List A03 = new ArrayList();
    public boolean A04;
    public final long A05;
    public final Choreographer.FrameCallback A06 = new W81(this, 4);
    public final VM5 A07;
    public final List A08;
    public final Queue A09 = new LinkedList();

    public C17933ViO(VM5 vm5, X3G x3g) {
        this.A07 = vm5;
        ArrayList arrayList = new ArrayList();
        this.A08 = arrayList;
        arrayList.add(x3g);
        this.A05 = 100;
    }

    public final void A00() {
        if (!this.A04) {
            this.A04 = true;
            this.A00 = 0;
            Choreographer instance = Choreographer.getInstance();
            Choreographer.FrameCallback frameCallback = this.A06;
            instance.removeFrameCallback(frameCallback);
            Choreographer.getInstance().postFrameCallbackDelayed(frameCallback, this.A05);
        }
    }
}
