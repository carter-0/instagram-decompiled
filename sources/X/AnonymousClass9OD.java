package X;

/* renamed from: X.9OD  reason: invalid class name */
public final class AnonymousClass9OD implements C62320sa {
    public final AnonymousClass3j2 A00;

    public final boolean equals(Object obj) {
        AnonymousClass3j2 r2 = this.A00;
        if (!(obj instanceof AnonymousClass9OD) || !0qQ.A0K(r2, ((AnonymousClass9OD) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Object invoke() {
        AnonymousClass3j2 r0 = this.A00;
        AnonymousClass2VL.A00();
        return ((C62320sa) r0.A00).invoke();
    }

    public final String toString() {
        AnonymousClass3j2 r2 = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MemoizedCallback0(callbackHolder=");
        return AnonymousClass7TG.A0n(r2, A1A);
    }

    public /* synthetic */ AnonymousClass9OD(AnonymousClass3j2 r1) {
        this.A00 = r1;
    }
}
