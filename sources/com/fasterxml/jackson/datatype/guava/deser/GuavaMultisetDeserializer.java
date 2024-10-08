package com.fasterxml.jackson.datatype.guava.deser;

import X.AnonymousClass3W5;
import X.AnonymousClass3W6;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultiset;

public abstract class GuavaMultisetDeserializer extends GuavaCollectionDeserializer {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.3W6, X.3W5, com.google.common.collect.AbstractMapBasedMultiset] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.3W6, X.3W5, com.google.common.collect.AbstractMapBasedMultiset] */
    public final AnonymousClass3W6 A0z() {
        if (this instanceof TreeMultisetDeserializer) {
            return new TreeMultiset(NaturalOrdering.A00);
        }
        if (this instanceof LinkedHashMultisetDeserializer) {
            ? r1 = new AnonymousClass3W5();
            r1.A01 = r1.A07();
            return r1;
        }
        ? r12 = new AnonymousClass3W5();
        r12.A01 = r12.A07();
        return r12;
    }
}
