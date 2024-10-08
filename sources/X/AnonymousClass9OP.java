package X;

/* renamed from: X.9OP  reason: invalid class name */
public final class AnonymousClass9OP implements 0sK {
    public final AnonymousClass3j2 A00;

    public final boolean equals(Object obj) {
        AnonymousClass3j2 r2 = this.A00;
        if (!(obj instanceof AnonymousClass9OP) || !0qQ.A0K(r2, ((AnonymousClass9OP) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AnonymousClass3j2 r0 = this.A00;
        AnonymousClass2VL.A00();
        return r0.A00.invoke(obj, obj2, obj3);
    }

    public final String toString() {
        AnonymousClass3j2 r2 = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MemoizedCallback3(callbackHolder=");
        return AnonymousClass7TG.A0n(r2, A1A);
    }

    public /* synthetic */ AnonymousClass9OP(AnonymousClass3j2 r1) {
        this.A00 = r1;
    }
}
