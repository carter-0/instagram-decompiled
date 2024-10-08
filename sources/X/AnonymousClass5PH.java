package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.5PH  reason: invalid class name */
public abstract class AnonymousClass5PH {
    /* JADX INFO: finally extract failed */
    public static final Object A04(C62320sa r14, 0sP r15) {
        Snapshot snapshot;
        Snapshot snapshot2;
        0sP r10 = r15;
        if (r15 == null) {
            return r14.invoke();
        }
        AnonymousClass5P5 r4 = AnonymousClass5P3.A05;
        Snapshot snapshot3 = (Snapshot) r4.A00();
        AnonymousClass5PD r9 = null;
        if (snapshot3 instanceof AnonymousClass5PF) {
            AnonymousClass5PF r7 = (AnonymousClass5PF) snapshot3;
            boolean z = false;
            if (r7.A02 == Thread.currentThread().getId()) {
                z = true;
            }
            if (z) {
                0sP r2 = r7.A00;
                0sP r1 = r7.A01;
                try {
                    r7.A00 = AnonymousClass5P3.A0C(r15, r2, true);
                    r7.A01 = r1;
                    Object invoke = r14.invoke();
                    r7.A00 = r2;
                    r7.A01 = r1;
                    return invoke;
                } catch (Throwable th) {
                    r7.A00 = r2;
                    r7.A01 = r1;
                    throw th;
                }
            }
        }
        if (snapshot3 == null || (snapshot3 instanceof AnonymousClass5PD)) {
            if (snapshot3 instanceof AnonymousClass5PD) {
                r9 = (AnonymousClass5PD) snapshot3;
            }
            snapshot = new AnonymousClass5PF(r9, r10, (0sP) null, true, false);
        } else {
            snapshot = snapshot3.A03(r15);
        }
        try {
            snapshot2 = (Snapshot) r4.A00();
            r4.A01(snapshot);
            Object invoke2 = r14.invoke();
            r4.A01(snapshot2);
            snapshot.A0H();
            return invoke2;
        } catch (Throwable th2) {
            snapshot.A0H();
            throw th2;
        }
    }

    public static final C285095Pr A01(0sL r2) {
        AnonymousClass5P3.A0A(AnonymousClass5P3.A09);
        synchronized (AnonymousClass5P3.A07) {
            AnonymousClass5P3.A02 = 00k.A0T(r2, AnonymousClass5P3.A02);
        }
        return new C285095Pr(r2);
    }

    public static final Snapshot A02() {
        return (Snapshot) AnonymousClass5P3.A05.A00();
    }

    public static final Snapshot A03(Snapshot snapshot) {
        if (snapshot instanceof AnonymousClass5PF) {
            AnonymousClass5PF r5 = (AnonymousClass5PF) snapshot;
            if (r5.A02 == Thread.currentThread().getId()) {
                r5.A00 = null;
                return snapshot;
            }
        }
        if (snapshot instanceof AnonymousClass5PG) {
            AnonymousClass5PG r52 = (AnonymousClass5PG) snapshot;
            if (r52.A01 == Thread.currentThread().getId()) {
                r52.A00 = null;
                return snapshot;
            }
        }
        Snapshot A01 = AnonymousClass5P3.A01(snapshot, (0sP) null, false);
        AnonymousClass5P5 r0 = AnonymousClass5P3.A05;
        r0.A00();
        r0.A01(A01);
        return A01;
    }

    public static final void A05() {
        boolean z;
        synchronized (AnonymousClass5P3.A07) {
            0vq A0I = ((AnonymousClass5PC) AnonymousClass5P3.A08.get()).A0I();
            z = true;
            if (A0I == null || A0I.A01 == 0) {
                z = false;
            }
        }
        if (z) {
            AnonymousClass5P3.A0A(AnonymousClass5Q0.A00);
        }
    }

    public static final void A06(Snapshot snapshot, Snapshot snapshot2, 0sP r4) {
        if (snapshot != snapshot2) {
            AnonymousClass5P3.A05.A01(snapshot);
            snapshot2.A0H();
        } else if (snapshot instanceof AnonymousClass5PF) {
            ((AnonymousClass5PF) snapshot).A00 = r4;
        } else if (snapshot instanceof AnonymousClass5PG) {
            ((AnonymousClass5PG) snapshot).A00 = r4;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Non-transparent snapshot was reused: ");
            sb.append(snapshot);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final boolean A07() {
        if (AnonymousClass5P3.A05.A00() != null) {
            return true;
        }
        return false;
    }

    public static final AnonymousClass5PD A00(0sP r2, 0sP r3) {
        AnonymousClass5PD r1;
        AnonymousClass5PD A0J;
        Snapshot A00 = AnonymousClass5P3.A00();
        if ((A00 instanceof AnonymousClass5PD) && (r1 = (AnonymousClass5PD) A00) != null && (A0J = r1.A0J(r2, r3)) != null) {
            return A0J;
        }
        throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
    }
}
