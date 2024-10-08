package com.google.common.collect;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

public final class MapMakerInternalMap$WeakKeyStrongValueSegment extends MapMakerInternalMap.Segment {
    public final ReferenceQueue queueForKeys = new ReferenceQueue();

    public final void A03() {
        do {
        } while (this.queueForKeys.poll() != null);
    }

    public final void A04() {
        A08(this.queueForKeys);
    }

    public MapMakerInternalMap$WeakKeyStrongValueSegment(MapMakerInternalMap mapMakerInternalMap, int i) {
        super(mapMakerInternalMap, i);
    }
}
