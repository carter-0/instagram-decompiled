package X;

import com.facebook.litho.ComponentTree;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.7hc  reason: invalid class name and case insensitive filesystem */
public final class C338227hc implements C338237hd {
    public final /* synthetic */ 2We A00;

    public C338227hc(2We r1) {
        this.A00 = r1;
    }

    public final void FN5(int i, int i2, int i3, int i4, int i5) {
        Throwable illegalStateException;
        2We r4 = this.A00;
        r4.A01 = i;
        r4.A02 = i2;
        r4.A0Y.A02 = false;
        2We.A0K(r4);
        int i6 = r4.A04;
        if (i6 != -1) {
            int max = Math.max(i6, i2 - i);
            int i7 = (int) (((float) max) * r4.A0M);
            List list = r4.A0i;
            int min = Math.min(max + i + i7, list.size() - 1);
            for (int max2 = Math.max(0, i - i7); max2 <= min; max2++) {
                C295015nP r2 = (C295015nP) list.get(max2);
                synchronized (r2) {
                    ComponentTree componentTree = r2.A01;
                    if (componentTree != null) {
                        synchronized (componentTree) {
                            2T4 r42 = componentTree.A06;
                            if (r42 != null) {
                                0qQ.A0B(componentTree.A0W, 5);
                                AnonymousClass2VU r0 = r42.A0K;
                                if (r0 != null) {
                                    AnonymousClass0eM r43 = r0.A00;
                                    if (!((Map) r43.getValue()).isEmpty()) {
                                        Iterator it = ((Map) r43.getValue()).keySet().iterator();
                                        if (it.hasNext()) {
                                            if (((Map) r43.getValue()).get(it.next()) != null) {
                                                illegalStateException = new NullPointerException("scopedComponentInfos");
                                            } else {
                                                illegalStateException = new IllegalStateException("Required value was null.");
                                            }
                                            throw illegalStateException;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
