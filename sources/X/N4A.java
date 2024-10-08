package X;

import java.util.Map;

public final class N4A extends AnonymousClass0T0 {
    public static final N4A A02 = new N4A((C69662Npk) null, 0Yt.A0E());
    public final C69662Npk A00;
    public final Map A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N4A) {
                N4A n4a = (N4A) obj;
                if (!0qQ.A0K(this.A00, n4a.A00) || !0qQ.A0K(this.A01, n4a.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Object A00(Class cls) {
        C69662Npk npk;
        Object obj = this.A01.get(cls);
        if (obj != null) {
            return obj;
        }
        2LV r2 = null;
        try {
            Object obj2 = cls.getDeclaredField("CONVERTER").get((Object) null);
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.facebook.djinni.msys.infra.McfReference.McfTypeConverter<T of com.facebook.rp.platform.statemanagement.rpstate.RpStateKt.getConverter>");
            r2 = (2LV) obj2;
        } catch (NoSuchFieldException unused) {
        }
        if (r2 == null || (npk = this.A00) == null) {
            return null;
        }
        return ((C68372NDp) npk).A00.A00(r2);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TG.A0C(this.A00) * 31);
    }

    public N4A(C69662Npk npk, Map map) {
        this.A00 = npk;
        this.A01 = map;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RpState(rsysAppModel=");
        A1A.append(this.A00);
        A1A.append(", nonRsysStateMap=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }

    public N4A() {
        this((C69662Npk) null, 0Yt.A0E());
    }
}
