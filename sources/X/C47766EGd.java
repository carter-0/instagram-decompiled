package X;

/* renamed from: X.EGd  reason: case insensitive filesystem */
public final class C47766EGd extends AnonymousClass4AA {
    public final String A00;

    public C47766EGd(String str) {
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C47766EGd) && 0qQ.A0K(this.A00, ((C47766EGd) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        AnonymousClass4AA r3 = (AnonymousClass4AA) obj;
        0qQ.A0B(r3, 0);
        return 0qQ.A0K(getKey(), r3.getKey());
    }
}
