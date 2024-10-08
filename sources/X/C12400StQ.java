package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.StQ  reason: case insensitive filesystem */
public final class C12400StQ implements C13883Tj6 {
    public final int A00;
    public final Object[] A01;

    public final CharSequence C1h(Context context) {
        0qQ.A0B(context, 0);
        int i = this.A00;
        if (i == 0) {
            return null;
        }
        ArrayList A0v = DbS.A0v(r4);
        for (Object obj : this.A01) {
            if (obj instanceof C13883Tj6) {
                obj = ((C13883Tj6) obj).C1h(context);
            }
            A0v.add(obj);
        }
        Object[] array = A0v.toArray(new Object[0]);
        return context.getString(i, Arrays.copyOf(array, array.length));
    }

    public static C12400StQ A00(Object[] objArr, int i) {
        return new C12400StQ(objArr, i);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12400StQ)) {
            return false;
        }
        C12400StQ stQ = (C12400StQ) obj;
        if (this.A00 != stQ.A00 || !Arrays.equals(this.A01, stQ.A01)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A01);
    }

    public C12400StQ(Object[] objArr, int i) {
        this.A00 = i;
        this.A01 = objArr;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("XMLStringResource(stringRes=");
        A1A.append(this.A00);
        A1A.append(", titleResArgs=");
        return C51975G9x.A0i(Arrays.toString(this.A01), A1A);
    }
}
