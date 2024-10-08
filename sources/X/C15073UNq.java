package X;

/* renamed from: X.UNq  reason: case insensitive filesystem */
public final class C15073UNq extends AnonymousClass0T0 implements C232262tL {
    public final UKX A00;

    public C15073UNq(UKX ukx) {
        0qQ.A0B(ukx, 1);
        this.A00 = ukx;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C15073UNq) && 0qQ.A0K(this.A00, ((C15073UNq) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00.toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        UKX ukx;
        C15073UNq uNq = (C15073UNq) obj;
        UKX ukx2 = this.A00;
        if (uNq != null) {
            ukx = uNq.A00;
        } else {
            ukx = null;
        }
        return 0qQ.A0K(ukx2, ukx);
    }
}
