package X;

import com.facebook.litho.ComponentTree;
import java.util.List;

/* renamed from: X.7hE  reason: invalid class name and case insensitive filesystem */
public final class C337987hE implements C337997hF {
    public final /* synthetic */ C295015nP A00;
    public final /* synthetic */ C337977hD A01;
    public final /* synthetic */ 2We A02;

    public C337987hE(C295015nP r1, C337977hD r2, 2We r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void DjX(int i, int i2, int i3, boolean z) {
        2We.A0G(this.A01, this.A02);
        C295015nP r2 = this.A00;
        synchronized (r2) {
            ComponentTree componentTree = r2.A01;
            if (componentTree != null) {
                synchronized (componentTree) {
                    List list = componentTree.A0G;
                    if (list != null) {
                        list.remove(this);
                    }
                }
            }
        }
    }
}
