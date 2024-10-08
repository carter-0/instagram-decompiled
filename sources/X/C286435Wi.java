package X;

/* renamed from: X.5Wi  reason: invalid class name and case insensitive filesystem */
public final class C286435Wi implements C286445Wj {
    public final int A00;

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
                if (this.A00 != ((C286435Wi) obj).A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final String toString() {
        return 002.A0I("AndroidPointerIcon(type=", ')', this.A00);
    }

    public C286435Wi(int i) {
        this.A00 = i;
    }
}
