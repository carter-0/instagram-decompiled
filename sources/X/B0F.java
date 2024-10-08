package X;

public final class B0F extends AnonymousClass134 implements C262114Ce {
    public final String A00;
    public final Throwable A01;

    private final void A00() {
        String str;
        Throwable th = this.A01;
        if (th != null) {
            String str2 = this.A00;
            if (str2 == null || (str = 002.A0R(". ", str2)) == null) {
                str = "";
            }
            throw new IllegalStateException(002.A0R("Module with the Main dispatcher had failed to initialize", str), th);
        }
        throw AnonymousClass7TE.A0z("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public final AnonymousClass134 A0P() {
        return this;
    }

    public final String toString() {
        String str;
        Throwable th = this.A01;
        if (th != null) {
            str = AnonymousClass7TG.A0m(th, ", cause=", AnonymousClass7TE.A1A());
        } else {
            str = "";
        }
        return 002.A0S("Dispatchers.Main[missing", str, ']');
    }

    public B0F(Throwable th, String str) {
        this.A01 = th;
        this.A00 = str;
    }

    public final boolean A0L(C262094Cc r2) {
        A00();
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass4CZ A0M(int i) {
        A00();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void A0O(Runnable runnable, C262094Cc r3) {
        A00();
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass19L CO5(Runnable runnable, C262094Cc r3, long j) {
        A00();
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ void EKQ(1IX r2, long j) {
        A00();
        throw AnonymousClass00P.createAndThrow();
    }
}
