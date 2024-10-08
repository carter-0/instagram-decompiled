package X;

import com.google.common.collect.Maps$EntryFunction;
import java.util.Collection;

/* renamed from: X.R0p  reason: case insensitive filesystem */
public final class C8685R0p extends R1F<K, Collection<V>> {
    public final /* synthetic */ R0u A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8685R0p(R0u r0u) {
        super(r0u);
        this.A00 = r0u;
    }

    public final boolean remove(Object obj) {
        return AnonymousClass7TF.A1V(this.A00.remove(obj));
    }

    public final boolean removeAll(Collection collection) {
        return this.A00.A00.A08(new T03(Maps$EntryFunction.A00, new T00(collection)));
    }

    public final boolean retainAll(Collection collection) {
        return this.A00.A00.A08(new T03(Maps$EntryFunction.A00, new T02(new T00(collection))));
    }
}
