package X;

/* renamed from: X.5YZ  reason: invalid class name */
public final class AnonymousClass5YZ extends C286845Ya implements C286855Yb {
    public AnonymousClass5RL A00;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.5Yc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.5Pf] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5RL A06() {
        /*
            r3 = this;
            X.5Ph r2 = r3.A01
            X.5RL r1 = r3.A00
            X.5Ph r0 = r1.A00
            if (r2 == r0) goto L_0x0018
            X.5Yc r0 = new X.5Yc
            r0.<init>()
            r3.A02 = r0
            int r0 = r3.size()
            X.5RL r1 = new X.5RL
            r1.<init>(r2, r0)
        L_0x0018:
            r3.A00 = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5YZ.A06():X.5RL");
    }

    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof C267304bL)) {
            return false;
        }
        return super.containsKey(obj);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.AbstractMap, X.5YZ] */
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof C286605Xb)) {
            return false;
        }
        return AnonymousClass5YZ.super.containsValue(obj);
    }

    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof C267304bL)) {
            return null;
        }
        return super.get(obj);
    }

    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof C267304bL)) {
            return obj2;
        }
        return super.getOrDefault(obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof C267304bL)) {
            return null;
        }
        return super.remove(obj);
    }
}
