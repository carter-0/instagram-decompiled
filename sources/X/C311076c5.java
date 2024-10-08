package X;

import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.6c5  reason: invalid class name and case insensitive filesystem */
public final class C311076c5 implements 17p {
    public static final C311076c5 A00 = new Object();

    /* JADX WARNING: type inference failed for: r1v2, types: [X.R0b, X.6Np] */
    public final /* bridge */ /* synthetic */ AnonymousClass17x AKg(AnonymousClass17x r5, AnonymousClass17x r6, MapMakerInternalMap.Segment segment) {
        R0g r0g;
        MapMakerInternalMap$WeakKeyStrongValueSegment mapMakerInternalMap$WeakKeyStrongValueSegment = (MapMakerInternalMap$WeakKeyStrongValueSegment) segment;
        R0b r0b = (R0b) r5;
        R0b r0b2 = (R0b) r6;
        Object obj = r0b.get();
        if (obj == null) {
            return null;
        }
        int i = r0b.A00;
        ReferenceQueue referenceQueue = mapMakerInternalMap$WeakKeyStrongValueSegment.queueForKeys;
        if (r0b2 == null) {
            ? r1 = new C306816Np(obj, referenceQueue, i);
            r1.A00 = null;
            r0g = r1;
        } else {
            r0g = new R0g(r0b2, obj, referenceQueue, i);
        }
        r0g.A00 = r0b.A00;
        return r0g;
    }

    public final MapMakerInternalMap.Strength CfK() {
        return MapMakerInternalMap.Strength.A01;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.R0b, X.17x, X.6Np] */
    public final /* bridge */ /* synthetic */ AnonymousClass17x Cr2(AnonymousClass17x r3, MapMakerInternalMap.Segment segment, Object obj, int i) {
        R0b r0b = (R0b) r3;
        ReferenceQueue referenceQueue = ((MapMakerInternalMap$WeakKeyStrongValueSegment) segment).queueForKeys;
        if (r0b != null) {
            return new R0g(r0b, obj, referenceQueue, i);
        }
        ? r0 = new C306816Np(obj, referenceQueue, i);
        r0.A00 = null;
        return r0;
    }

    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment CrF(MapMakerInternalMap mapMakerInternalMap, int i) {
        return new MapMakerInternalMap$WeakKeyStrongValueSegment(mapMakerInternalMap, i);
    }

    public final /* bridge */ /* synthetic */ void Epy(AnonymousClass17x r1, MapMakerInternalMap.Segment segment, Object obj) {
        ((R0b) r1).A00 = obj;
    }

    public final MapMakerInternalMap.Strength FMv() {
        return MapMakerInternalMap.Strength.A00;
    }
}
