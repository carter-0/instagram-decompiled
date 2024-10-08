package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.9GD  reason: invalid class name */
public final class AnonymousClass9GD {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final AnonymousClass9GE A03 = new AnonymousClass9GE();
    public final Object A04 = new Object();
    public volatile boolean A05;

    private final void A00() {
        String str;
        if (this.A02) {
            if (!A0D()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception A052 = A05();
            if (A052 != null) {
                str = "failure";
            } else if (A0E()) {
                str = "result ".concat(String.valueOf(String.valueOf(A06())));
            } else if (this.A05) {
                str = "cancellation";
            } else {
                str = "unknown issue";
            }
            throw new IllegalStateException("Complete with: ".concat(str), A052);
        }
    }

    public static final void A01(AnonymousClass9GD r2) {
        synchronized (r2.A04) {
            if (r2.A02) {
                r2.A03.A01(r2);
            }
        }
    }

    public final AnonymousClass9GD A02(C3736296h r4, Executor executor) {
        AnonymousClass9GD r2 = new AnonymousClass9GD();
        this.A03.A00(new AWD(r4, r2, executor));
        A01(this);
        return r2;
    }

    public final AnonymousClass9GD A03(C365558nJ r3) {
        this.A03.A00(new C365568nK(r3, AnonymousClass9GH.A00));
        A01(this);
        return this;
    }

    public final AnonymousClass9GD A04(C3736696l r3, Executor executor) {
        this.A03.A00(new C3737096p(r3, executor));
        A01(this);
        return this;
    }

    public final Exception A05() {
        Exception exc;
        synchronized (this.A04) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object A06() {
        Throwable th;
        Object obj;
        synchronized (this.A04) {
            AnonymousClass3Qk.A09(this.A02, "Task is not yet complete");
            if (!this.A05) {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    th = new RuntimeException(exc);
                }
            } else {
                th = new CancellationException("Task is already canceled.");
            }
            throw th;
        }
        return obj;
    }

    public final void A07() {
        synchronized (this.A04) {
            if (!this.A02) {
                this.A02 = true;
                this.A05 = true;
                this.A03.A01(this);
            }
        }
    }

    public final void A08(C365558nJ r3, Executor executor) {
        this.A03.A00(new C365568nK(r3, executor));
        A01(this);
    }

    public final void A09(C3736596k r2) {
        A0A(r2, AnonymousClass9GH.A00);
    }

    public final void A0A(C3736596k r3, Executor executor) {
        this.A03.A00(new C3737196q(r3, executor));
        A01(this);
    }

    public final void A0B(Exception exc) {
        AnonymousClass3Qk.A03(exc, "Exception must not be null");
        synchronized (this.A04) {
            A00();
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A01(this);
    }

    public final void A0C(Object obj) {
        synchronized (this.A04) {
            A00();
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A01(this);
    }

    public final boolean A0D() {
        boolean z;
        synchronized (this.A04) {
            z = this.A02;
        }
        return z;
    }

    public final boolean A0E() {
        boolean z;
        synchronized (this.A04) {
            z = false;
            if (this.A02 && !this.A05 && this.A00 == null) {
                z = true;
            }
        }
        return z;
    }

    public final boolean A0F(Object obj) {
        synchronized (this.A04) {
            if (this.A02) {
                return false;
            }
            this.A02 = true;
            this.A01 = obj;
            this.A03.A01(this);
            return true;
        }
    }
}
