package X;

import com.google.common.collect.MapMakerInternalMap;

public final class T0E implements 17p {
    public static final T0E A00 = new Object();

    public final /* bridge */ /* synthetic */ AnonymousClass17x AKg(AnonymousClass17x r4, AnonymousClass17x r5, MapMakerInternalMap.Segment segment) {
        17z r0f;
        R0a r0a = (R0a) r4;
        R0a r0a2 = (R0a) r5;
        Object obj = r0a.A01;
        int i = r0a.A00;
        if (r0a2 == null) {
            r0f = new 17z(obj, i);
            r0f.A00 = null;
        } else {
            r0f = new R0f(r0a2, obj, i);
        }
        r0f.A00 = r0a.A00;
        return r0f;
    }

    public final MapMakerInternalMap.Strength CfK() {
        return MapMakerInternalMap.Strength.A00;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass17x Cr2(AnonymousClass17x r3, MapMakerInternalMap.Segment segment, Object obj, int i) {
        R0a r0a = (R0a) r3;
        if (r0a != null) {
            return new R0f(r0a, obj, i);
        }
        17z r1 = new 17z(obj, i);
        r1.A00 = null;
        return r1;
    }

    public final /* bridge */ /* synthetic */ MapMakerInternalMap.Segment CrF(MapMakerInternalMap mapMakerInternalMap, int i) {
        return new MapMakerInternalMap.Segment(mapMakerInternalMap, i);
    }

    public final /* bridge */ /* synthetic */ void Epy(AnonymousClass17x r1, MapMakerInternalMap.Segment segment, Object obj) {
        ((R0a) r1).A00 = obj;
    }

    public final MapMakerInternalMap.Strength FMv() {
        return MapMakerInternalMap.Strength.A00;
    }
}
