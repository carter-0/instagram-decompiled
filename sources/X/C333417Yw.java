package X;

/* renamed from: X.7Yw  reason: invalid class name and case insensitive filesystem */
public class C333417Yw implements C254783t2 {
    public final C254773t1 A00;
    public final AnonymousClass9HR A01;

    public C333417Yw(C254773t1 r2, AnonymousClass9HR r3) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.model.direct.threadkey.impl.mixed.DirectMsysMixedThreadTarget");
                C333417Yw r5 = (C333417Yw) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }
}
