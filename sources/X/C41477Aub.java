package X;

/* renamed from: X.Aub  reason: case insensitive filesystem */
public final class C41477Aub implements 0sL {
    public final AnonymousClass3j2 A00;

    public final boolean equals(Object obj) {
        AnonymousClass3j2 r2 = this.A00;
        if (!(obj instanceof C41477Aub) || !0qQ.A0K(r2, ((C41477Aub) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Object invoke(Object obj, Object obj2) {
        AnonymousClass3j2 r0 = this.A00;
        AnonymousClass2VL.A00();
        return r0.A00.invoke(obj, obj2);
    }

    public final String toString() {
        AnonymousClass3j2 r2 = this.A00;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MemoizedCallback2(callbackHolder=");
        return AnonymousClass7TG.A0n(r2, A1A);
    }

    public /* synthetic */ C41477Aub(AnonymousClass3j2 r1) {
        this.A00 = r1;
    }
}
