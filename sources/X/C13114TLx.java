package X;

import android.util.Pair;
import java.util.Comparator;

/* renamed from: X.TLx  reason: case insensitive filesystem */
public final class C13114TLx implements Comparator {
    public final int A00;
    public final Object A01;

    public C13114TLx(0sL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                float A04 = AnonymousClass7TE.A04(((AnonymousClass34S) obj).A01);
                float A042 = AnonymousClass7TE.A04(((AnonymousClass34S) obj2).A01);
                if (A042 > A04) {
                    return 1;
                }
                if (A04 > A042) {
                    return -1;
                }
                return 0;
            case 1:
                return ((SJY) obj2).A01 - ((SJY) obj).A01;
            case 3:
                Object obj3 = ((Pair) obj).second;
                Object obj4 = ((Pair) obj2).second;
                if (obj3 == obj4) {
                    return 0;
                }
                if (AnonymousClass7TE.A0R(obj3) < AnonymousClass7TE.A0R(obj4)) {
                    return -1;
                }
                return 1;
            default:
                return AnonymousClass7TE.A0M(((0sL) this.A01).invoke(obj, obj2));
        }
    }

    public C13114TLx(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
