package X;

/* renamed from: X.Nbu  reason: case insensitive filesystem */
public final class C68967Nbu extends C62812Kmo {
    public final AnonymousClass3Q2 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68967Nbu) && 0qQ.A0K(this.A00, ((C68967Nbu) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C68967Nbu(AnonymousClass3Q2 r1) {
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CameraMedia(pendingMedia=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
