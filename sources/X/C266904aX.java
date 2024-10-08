package X;

/* renamed from: X.4aX  reason: invalid class name and case insensitive filesystem */
public final class C266904aX extends AnonymousClass0T0 implements AnonymousClass3UN {
    public final C266544Zk A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C266904aX) && 0qQ.A0K(this.A00, ((C266904aX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final AnonymousClass3UO C2m() {
        String str = this.A00.A04;
        0qQ.A0B(str, 0);
        AnonymousClass3UO r0 = (AnonymousClass3UO) AnonymousClass3UO.A01.get(str);
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C266904aX(C266544Zk r1) {
        this.A00 = r1;
    }
}
