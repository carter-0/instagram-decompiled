package X;

import java.util.Collection;
import java.util.Set;

/* renamed from: X.Ahr  reason: case insensitive filesystem */
public final class C40722Ahr implements 1aV {
    public final /* synthetic */ 2Dr A00;

    public C40722Ahr(2Dr r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        Collection collection = (Collection) obj;
        Set set = this.A00.A0J;
        0qQ.A07(set);
        synchronized (set) {
            set.clear();
            0qQ.A0A(collection);
            set.addAll(collection);
        }
    }
}
