package X;

/* renamed from: X.4To  reason: invalid class name and case insensitive filesystem */
public final class C265364To implements Comparable {
    public int A00;
    public long A01;
    public Object A02;
    public final AnonymousClass4SA A03;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C265364To r7 = (C265364To) obj;
        Object obj2 = this.A02;
        int i = 0;
        boolean z = false;
        if (obj2 == null) {
            z = true;
        }
        boolean z2 = false;
        if (r7.A02 == null) {
            z2 = true;
        }
        if (z != z2) {
            if (obj2 != null) {
                return -1;
            }
            return 1;
        } else if (obj2 == null || (i = this.A00 - r7.A00) != 0) {
            return i;
        } else {
            long j = this.A01;
            long j2 = r7.A01;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
                return 1;
            }
        }
        return -1;
    }

    public C265364To(AnonymousClass4SA r1) {
        this.A03 = r1;
    }
}
