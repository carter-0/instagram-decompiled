package X;

import android.view.View;

/* renamed from: X.Viy  reason: case insensitive filesystem */
public final class C17964Viy {
    public final int A00;
    public final View A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C17964Viy) && ((C17964Viy) obj).A00 == this.A00;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(Integer.valueOf(this.A00));
    }

    public C17964Viy(View view, int i) {
        this.A00 = i;
        this.A01 = view;
    }
}
