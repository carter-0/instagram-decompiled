package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.5AE  reason: invalid class name */
public abstract class AnonymousClass5AE implements ListenableFuture {
    public static final AnonymousClass5AI A00;
    public static final boolean A01 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Object A02 = new Object();
    public static final Logger A03;
    public volatile AnonymousClass5AG listeners;
    public volatile Object value;
    public volatile AnonymousClass5AF waiters;

    private void A02(AnonymousClass5AF r6) {
        r6.thread = null;
        while (true) {
            AnonymousClass5AF r3 = this.waiters;
            if (r3 != AnonymousClass5AF.A00) {
                AnonymousClass5AF r2 = null;
                while (r3 != null) {
                    AnonymousClass5AF r1 = r3.next;
                    if (r3.thread != null) {
                        r2 = r3;
                    } else if (r2 != null) {
                        r2.next = r1;
                        if (r2.thread == null) {
                        }
                    } else if (!A00.A03(r3, r1, this)) {
                    }
                    r3 = r1;
                }
                return;
            }
            return;
        }
    }

    public static void A03(AnonymousClass5AE r4) {
        AnonymousClass5AF r1;
        AnonymousClass5AI r2;
        AnonymousClass5AG r12;
        AnonymousClass5AG r3 = null;
        do {
            r1 = r4.waiters;
            r2 = A00;
        } while (!r2.A03(r1, AnonymousClass5AF.A00, r4));
        while (r1 != null) {
            Thread thread = r1.thread;
            if (thread != null) {
                r1.thread = null;
                LockSupport.unpark(thread);
            }
            r1 = r1.next;
        }
        do {
            r12 = r4.listeners;
        } while (!r2.A02(r12, AnonymousClass5AG.A03, r4));
        while (true) {
            AnonymousClass5AG r0 = r12;
            if (r12 == null) {
                break;
            }
            r12 = r12.A00;
            r0.A00 = r3;
            r3 = r0;
        }
        while (true) {
            AnonymousClass5AG r02 = r3;
            if (r3 != null) {
                r3 = r3.A00;
                A04(r02.A01, r02.A02);
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.5AH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.5AH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.5AH} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<X.5AE> r3 = X.AnonymousClass5AE.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r0 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r1, r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            A01 = r0
            java.lang.String r0 = r3.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            A03 = r0
            java.lang.Class<X.5AF> r2 = X.AnonymousClass5AF.class
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r0 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.Class<X.5AG> r1 = X.AnonymousClass5AG.class
            java.lang.String r0 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ all -> 0x0047 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r0 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ all -> 0x0047 }
            X.5AH r4 = new X.5AH     // Catch:{ all -> 0x0047 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0047 }
            r3 = 0
            goto L_0x004d
        L_0x0047:
            r3 = move-exception
            X.QAa r4 = new X.QAa
            r4.<init>()
        L_0x004d:
            A00 = r4
            if (r3 == 0) goto L_0x005a
            java.util.logging.Logger r2 = A03
            java.util.logging.Level r1 = java.util.logging.Level.SEVERE
            java.lang.String r0 = "SafeAtomicHelper is broken!"
            r2.log(r1, r0, r3)
        L_0x005a:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AE.<clinit>():void");
    }

    public static Object A01(Object obj) {
        if (obj instanceof PzK) {
            Throwable th = ((PzK) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof C70945OSs) {
            throw new ExecutionException(((C70945OSs) obj).A00);
        } else if (obj == A02) {
            return null;
        } else {
            return obj;
        }
    }

    public String A05() {
        if (this instanceof ScheduledFuture) {
            return 002.A0e(AnonymousClass000.A00(3873), " ms]", ((Delayed) this).getDelay(TimeUnit.MILLISECONDS));
        }
        return null;
    }

    public final boolean A06(Object obj) {
        if (obj == null) {
            obj = A02;
        }
        if (!A00.A04(this, (Object) null, obj)) {
            return false;
        }
        A03(this);
        return true;
    }

    public final boolean A07(Throwable th) {
        if (!A00.A04(this, (Object) null, new C70945OSs(th))) {
            return false;
        }
        A03(this);
        return true;
    }

    public final boolean cancel(boolean z) {
        PzK pzK;
        Object obj = this.value;
        if (obj != null) {
            return false;
        }
        if (A01) {
            PzK pzK2 = PzK.A01;
            pzK = new PzK(new CancellationException(AnonymousClass000.A00(2282)));
        } else if (z) {
            pzK = PzK.A02;
        } else {
            pzK = PzK.A01;
        }
        if (!A00.A04(this, obj, pzK)) {
            return false;
        }
        A03(this);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bb, code lost:
        if (r2 > 1000) goto L_0x00bd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            r17 = this;
            r0 = r18
            r11 = r20
            long r4 = r11.toNanos(r0)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x0114
            r8 = r17
            java.lang.Object r2 = r8.value
            if (r2 != 0) goto L_0x010f
            r15 = 0
            int r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0046
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r4
        L_0x001f:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0063
            X.5AF r7 = r8.waiters
            X.5AF r3 = X.AnonymousClass5AF.A00
            if (r7 == r3) goto L_0x003f
            X.5AF r6 = new X.5AF
            r6.<init>()
        L_0x0030:
            X.5AI r2 = A00
            r2.A00(r6, r7)
            boolean r2 = r2.A03(r7, r6, r8)
            if (r2 != 0) goto L_0x0049
            X.5AF r7 = r8.waiters
            if (r7 != r3) goto L_0x0030
        L_0x003f:
            java.lang.Object r0 = r8.value
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x0046:
            r9 = 0
            goto L_0x001f
        L_0x0049:
            java.util.concurrent.locks.LockSupport.parkNanos(r8, r4)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x0106
            java.lang.Object r2 = r8.value
            if (r2 != 0) goto L_0x010f
            long r2 = java.lang.System.nanoTime()
            long r4 = r9 - r2
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0049
            r8.A02(r6)
        L_0x0063:
            int r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x007e
            java.lang.Object r2 = r8.value
            if (r2 != 0) goto L_0x010f
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x0078
            long r2 = java.lang.System.nanoTime()
            long r4 = r9 - r2
            goto L_0x0063
        L_0x0078:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x007e:
            java.lang.String r7 = r8.toString()
            java.lang.String r3 = r11.toString()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r10 = r3.toLowerCase(r2)
            r2 = 2539(0x9eb, float:3.558E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            java.lang.String r9 = " "
            java.lang.String r1 = X.002.A0r(r2, r9, r10, r0)
            long r2 = r4 + r13
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e4
            r0 = 1977(0x7b9, float:2.77E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            long r2 = -r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r5 = r11.convert(r2, r0)
            long r11 = r11.toNanos(r5)
            long r2 = r2 - r11
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00bd
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L_0x00be
        L_0x00bd:
            r4 = 1
        L_0x00be:
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            java.lang.String r1 = X.002.A0r(r1, r9, r10, r5)
            if (r4 == 0) goto L_0x00ce
            java.lang.String r0 = ","
            java.lang.String r1 = X.002.A0R(r1, r0)
        L_0x00ce:
            java.lang.String r1 = X.002.A0R(r1, r9)
        L_0x00d2:
            if (r4 == 0) goto L_0x00de
            r0 = 1986(0x7c2, float:2.783E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0e(r1, r0, r2)
        L_0x00de:
            java.lang.String r0 = "delay)"
            java.lang.String r1 = X.002.A0R(r1, r0)
        L_0x00e4:
            boolean r0 = r8.isDone()
            if (r0 == 0) goto L_0x00fa
            r0 = 1982(0x7be, float:2.777E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x00fa:
            java.lang.String r0 = " for "
            java.lang.String r1 = X.002.A0g(r1, r0, r7)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0106:
            r8.A02(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x010f:
            java.lang.Object r0 = A01(r2)
            return r0
        L_0x0114:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AE.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof PzK;
    }

    public final boolean isDone() {
        boolean z = false;
        if (this.value != null) {
            z = true;
        }
        return z & true;
    }

    public final String toString() {
        String str;
        Object obj;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(AnonymousClass000.A00(1062));
        if (isCancelled()) {
            str = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    str3 = A05();
                } catch (RuntimeException e) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AnonymousClass000.A00(2261));
                    sb2.append(e.getClass());
                    str3 = sb2.toString();
                }
                if (str3 != null && !str3.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str3);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            boolean z = false;
            while (true) {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (ExecutionException e2) {
                    sb.append(AnonymousClass000.A00(943));
                    sb.append(e2.getCause());
                    sb.append("]");
                } catch (CancellationException unused2) {
                    str = "CANCELLED";
                } catch (RuntimeException e3) {
                    sb.append(AnonymousClass000.A00(1040));
                    sb.append(e3.getClass());
                    str = AnonymousClass000.A00(836);
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            sb.append(AnonymousClass000.A00(1028));
            if (obj == this) {
                str2 = AnonymousClass000.A00(1884);
            } else {
                str2 = String.valueOf(obj);
            }
            sb.append(str2);
            sb.append("]");
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public static void A04(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = A03;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder();
            sb.append(AnonymousClass000.A00(1021));
            sb.append(runnable);
            sb.append(AnonymousClass000.A00(837));
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        AnonymousClass5AG r3 = this.listeners;
        AnonymousClass5AG r2 = AnonymousClass5AG.A03;
        if (r3 != r2) {
            AnonymousClass5AG r1 = new AnonymousClass5AG(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A00.A02(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
        }
        A04(runnable, executor);
    }

    public final Object get() {
        if (!Thread.interrupted()) {
            Object obj = this.value;
            if (obj == null) {
                AnonymousClass5AF r3 = this.waiters;
                AnonymousClass5AF r2 = AnonymousClass5AF.A00;
                if (r3 != r2) {
                    AnonymousClass5AF r1 = new AnonymousClass5AF();
                    while (true) {
                        AnonymousClass5AI r0 = A00;
                        r0.A00(r1, r3);
                        if (!r0.A03(r3, r1, this)) {
                            r3 = this.waiters;
                            if (r3 == r2) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                } else {
                                    A02(r1);
                                    throw new InterruptedException();
                                }
                            } while (obj == null);
                        }
                    }
                } else {
                    obj = this.value;
                }
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
