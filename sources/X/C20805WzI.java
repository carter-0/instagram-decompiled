package X;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WzI  reason: case insensitive filesystem */
public final class C20805WzI extends AnonymousClass40A {
    public final SerialDescriptor A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20805WzI(C255463uA r3) {
        super(r3);
        0qQ.A0B(r3, 1);
        SerialDescriptor descriptor = r3.getDescriptor();
        0qQ.A0B(descriptor, 1);
        this.A00 = new AnonymousClass40D(descriptor);
    }

    public final /* bridge */ /* synthetic */ Object A04(Object obj) {
        0qQ.A0B(obj, 0);
        return obj;
    }

    public final /* bridge */ /* synthetic */ int A00(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        0qQ.A0B(abstractCollection, 0);
        return abstractCollection.size();
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        return new LinkedHashSet();
    }

    public final /* bridge */ /* synthetic */ Object A03(Object obj) {
        Collection collection = (Collection) obj;
        0qQ.A0B(collection, 0);
        if (collection instanceof LinkedHashSet) {
            return collection;
        }
        return new LinkedHashSet(collection);
    }

    public final /* bridge */ /* synthetic */ void A07(Object obj, int i, Object obj2) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        0qQ.A0B(abstractCollection, 0);
        abstractCollection.add(obj2);
    }

    public final SerialDescriptor getDescriptor() {
        return this.A00;
    }
}
