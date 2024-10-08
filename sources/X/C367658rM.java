package X;

import com.google.common.base.Strings;
import java.util.concurrent.TimeUnit;

/* renamed from: X.8rM  reason: invalid class name and case insensitive filesystem */
public final class C367658rM {
    public static final C635813i A06 = new C367678rO(new C367668rN());
    public static final AnonymousClass4MQ A07 = new C367688rP();
    public long A00 = -1;
    public long A01 = -1;
    public long A02 = -1;
    public C635813i A03 = A06;
    public AnonymousClass4MQ A04;
    public C367808rb A05;

    public final C367958rq A00() {
        boolean z = false;
        if (this.A02 == -1) {
            z = true;
        }
        17k.A0H(z, "refreshAfterWrite requires a LoadingCache");
        return new C367958rq(new C367698rQ(this, (C368338sS) null));
    }

    public final void A01(long j) {
        long j2 = this.A01;
        boolean z = true;
        boolean z2 = false;
        if (j2 == -1) {
            z2 = true;
        }
        17k.A06(j2, "maximum size was already set to %s", z2);
        if (j < 0) {
            z = false;
        }
        17k.A0G(z, "maximum size must not be negative");
        this.A01 = j;
    }

    public final void A02(long j, TimeUnit timeUnit) {
        long j2 = this.A00;
        boolean z = true;
        boolean z2 = false;
        if (j2 == -1) {
            z2 = true;
        }
        17k.A06(j2, "expireAfterWrite was already set to %s ns", z2);
        if (j < 0) {
            z = false;
        }
        if (z) {
            this.A00 = timeUnit.toNanos(j);
            return;
        }
        throw new IllegalArgumentException(Strings.A00("duration cannot be negative: %s %s", Long.valueOf(j), timeUnit));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.ODJ, java.lang.Object] */
    public final String toString() {
        C66726MbX A002 = C66725MbW.A00(this);
        long j = this.A01;
        if (j != -1) {
            A002.A03("maximumSize", j);
        }
        long j2 = this.A00;
        if (j2 != -1) {
            A002.A01(002.A0A(j2, "ns"), "expireAfterWrite");
        }
        if (this.A05 != null) {
            ? obj = new Object();
            A002.A00.A00 = obj;
            A002.A00 = obj;
            obj.A01 = "removalListener";
        }
        return A002.toString();
    }
}
