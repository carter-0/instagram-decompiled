package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass7TE;
import X.C269674fV;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDeserializer extends CollectionDeserializer {
    public final Collection A0y(16F r4, C269674fV r5, Collection collection) {
        if (collection == null) {
            collection = AnonymousClass7TE.A1C();
        }
        super.A0y(r4, r5, collection);
        if (collection.isEmpty()) {
            return new ArrayBlockingQueue(1, false);
        }
        return new ArrayBlockingQueue(collection.size(), false, collection);
    }
}
