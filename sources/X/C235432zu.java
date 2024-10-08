package X;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$WeakKeyWeakValueSegment;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.2zu  reason: invalid class name and case insensitive filesystem */
public final class C235432zu implements 17p {
    public static final C235432zu A00 = new Object();

    /* JADX WARNING: type inference failed for: r0v4, types: [X.6No, X.6Np] */
    public final /* bridge */ /* synthetic */ AnonymousClass17x AKg(AnonymousClass17x r5, AnonymousClass17x r6, MapMakerInternalMap.Segment segment) {
        C8683R0h r0h;
        MapMakerInternalMap$WeakKeyWeakValueSegment mapMakerInternalMap$WeakKeyWeakValueSegment = (MapMakerInternalMap$WeakKeyWeakValueSegment) segment;
        C306806No r52 = (C306806No) r5;
        C306806No r62 = (C306806No) r6;
        Object obj = r52.get();
        C8683R0h r0h2 = null;
        if (!(obj == null || r52.getValue() == null)) {
            int i = r52.A00;
            ReferenceQueue referenceQueue = mapMakerInternalMap$WeakKeyWeakValueSegment.queueForKeys;
            if (r62 == null) {
                ? r0 = new C306816Np(obj, referenceQueue, i);
                r0.A00 = MapMakerInternalMap.A07;
                r0h = r0;
            } else {
                r0h = new C8683R0h(r62, obj, referenceQueue, i);
            }
            r0h.A00 = r52.A00.AKk(r0h, mapMakerInternalMap$WeakKeyWeakValueSegment.queueForValues);
            r0h2 = r0h;
        }
        return r0h2;
    }

    public final MapMakerInternalMap.Strength CfK() {
        return MapMakerInternalMap.Strength.A01;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.17x, X.6No, X.6Np] */
    public final /* bridge */ /* synthetic */ AnonymousClass17x Cr2(AnonymousClass17x r3, MapMakerInternalMap.Segment segment, Object obj, int i) {
        C306806No r32 = (C306806No) r3;
        ReferenceQueue referenceQueue = ((MapMakerInternalMap$WeakKeyWeakValueSegment) segment).queueForKeys;
        if (r32 != null) {
            return new C8683R0h(r32, obj, referenceQueue, i);
        }
        ? r0 = new C306816Np(obj, referenceQueue, i);
        r0.A00 = MapMakerInternalMap.A07;
        return r0;
    }

    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment CrF(MapMakerInternalMap mapMakerInternalMap, int i) {
        return new MapMakerInternalMap$WeakKeyWeakValueSegment(mapMakerInternalMap, i);
    }

    public final /* bridge */ /* synthetic */ void Epy(AnonymousClass17x r4, MapMakerInternalMap.Segment segment, Object obj) {
        C306806No r42 = (C306806No) r4;
        17s r2 = r42.A00;
        r42.A00 = new 181(r42, obj, ((MapMakerInternalMap$WeakKeyWeakValueSegment) segment).queueForValues);
        r2.clear();
    }

    public final MapMakerInternalMap.Strength FMv() {
        return MapMakerInternalMap.Strength.A01;
    }
}
