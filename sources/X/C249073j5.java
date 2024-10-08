package X;

/* renamed from: X.3j5  reason: invalid class name and case insensitive filesystem */
public final class C249073j5 implements 0sP {
    public final AnonymousClass3j2 A00;

    public final boolean equals(Object obj) {
        AnonymousClass3j2 r2 = this.A00;
        if (!(obj instanceof C249073j5) || !0qQ.A0K(r2, ((C249073j5) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final Object invoke(Object obj) {
        AnonymousClass3j2 r0 = this.A00;
        AnonymousClass2VL.A00();
        return r0.A00.invoke(obj);
    }

    public final String toString() {
        AnonymousClass3j2 r2 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append("MemoizedCallback1(callbackHolder=");
        sb.append(r2);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ C249073j5(AnonymousClass3j2 r1) {
        this.A00 = r1;
    }
}
