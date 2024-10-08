package X;

/* renamed from: X.5b7  reason: invalid class name and case insensitive filesystem */
public final class C287965b7 implements AnonymousClass5b8 {
    public final float A00;
    public final float A01;
    public final Object A02;

    public final /* bridge */ /* synthetic */ C3026164i FMw(C287805an r5) {
        C287725af r0;
        float f = this.A00;
        float f2 = this.A01;
        Object obj = this.A02;
        if (obj == null) {
            r0 = null;
        } else {
            r0 = (C287725af) ((C287795am) r5).A01.invoke(obj);
        }
        return new C3026064h(r0, f, f2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C287965b7)) {
            return false;
        }
        C287965b7 r4 = (C287965b7) obj;
        if (r4.A00 == this.A00 && r4.A01 == this.A01 && 0qQ.A0K(r4.A02, this.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.A02;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01);
    }

    public C287965b7(Object obj, float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = obj;
    }

    public C287965b7() {
        this((Object) null, 1.0f, 1500.0f);
    }
}
