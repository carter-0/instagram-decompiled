package X;

import com.facebook.litho.ComponentTree;
import java.util.Collections;

/* renamed from: X.3XL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3XL implements C62320sa {
    public final /* synthetic */ ComponentTree A00;

    public /* synthetic */ AnonymousClass3XL(ComponentTree componentTree) {
        this.A00 = componentTree;
    }

    public final Object invoke() {
        2T4 r0;
        ComponentTree componentTree = this.A00;
        synchronized (componentTree) {
            r0 = componentTree.A07;
            if (r0 == null && (r0 = componentTree.A06) == null) {
                r0 = null;
            }
        }
        if (r0 != null) {
            return r0.A0Q;
        }
        return Collections.emptyList();
    }
}
