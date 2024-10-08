package X;

import java.util.Map;

public final class Qzt extends AnonymousClass28y implements Map.Entry {
    public final /* synthetic */ R1M A00;
    public final /* synthetic */ Map.Entry A01;

    public Qzt(R1M r1m, Map.Entry entry) {
        this.A00 = r1m;
        this.A01 = entry;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        return this.A01.equals(obj);
    }

    public final Object getKey() {
        return this.A01.getKey();
    }

    public final Object getValue() {
        return this.A01.getValue();
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final Object setValue(Object obj) {
        C8684R0i r0i = ((Qzv) this.A00.A01).A00;
        17k.A0E(Pxi.A1V(r0i.A00, getKey(), obj));
        return this.A01.setValue(obj);
    }

    public Qzt() {
    }
}
