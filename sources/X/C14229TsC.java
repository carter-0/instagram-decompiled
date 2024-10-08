package X;

/* renamed from: X.TsC  reason: case insensitive filesystem */
public abstract class C14229TsC {
    public static final boolean A00(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 != null) {
                return true;
            }
        } else if (obj2 == null) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1Xn) || !(obj2 instanceof AnonymousClass1Xn)) {
            return obj == obj2;
        }
        return 0qQ.A0K(((AnonymousClass1Xn) obj).C9L(), ((AnonymousClass1Xn) obj2).C9L());
    }
}
