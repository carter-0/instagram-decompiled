package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.39y  reason: invalid class name and case insensitive filesystem */
public abstract class C2379639y implements ListenableFuture {
    public static final AnonymousClass3A3 A00;
    public static final boolean A01 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Object A02 = new Object();
    public static final Logger A03;
    public volatile AnonymousClass3A1 listeners;
    public volatile Object value;
    public volatile AnonymousClass3A0 waiters;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.util.concurrent.Future} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.util.concurrent.Future} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(java.util.concurrent.Future r1) {
        /*
            r0 = 0
        L_0x0001:
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException -> 0x0006, all -> 0x0012 }
            goto L_0x0008
        L_0x0006:
            r0 = 1
            goto L_0x0001
        L_0x0008:
            if (r0 == 0) goto L_0x0011
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0011:
            return r1
        L_0x0012:
            r1 = move-exception
            if (r0 == 0) goto L_0x001c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2379639y.A02(java.util.concurrent.Future):java.lang.Object");
    }

    private void A03(AnonymousClass3A0 r6) {
        r6.thread = null;
        while (true) {
            AnonymousClass3A0 r3 = this.waiters;
            if (r3 != AnonymousClass3A0.A00) {
                AnonymousClass3A0 r2 = null;
                while (r3 != null) {
                    AnonymousClass3A0 r1 = r3.next;
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

    public static void A04(C2379639y r5) {
        AnonymousClass3A1 r1;
        AnonymousClass3A1 r4 = null;
        while (true) {
            AnonymousClass3A0 r2 = r5.waiters;
            AnonymousClass3A3 r3 = A00;
            if (r3.A03(r2, AnonymousClass3A0.A00, r5)) {
                while (r2 != null) {
                    Thread thread = r2.thread;
                    if (thread != null) {
                        r2.thread = null;
                        LockSupport.unpark(thread);
                    }
                    r2 = r2.next;
                }
                do {
                    r1 = r5.listeners;
                } while (!r3.A02(r1, AnonymousClass3A1.A03, r5));
                while (true) {
                    AnonymousClass3A1 r0 = r1;
                    if (r1 == null) {
                        break;
                    }
                    r1 = r1.A00;
                    r0.A00 = r4;
                    r4 = r0;
                }
                while (true) {
                    AnonymousClass3A1 r22 = r4;
                    if (r4 != null) {
                        r4 = r4.A00;
                        Runnable runnable = r22.A01;
                        if (runnable instanceof AnonymousClass3A4) {
                            AnonymousClass3A4 r12 = (AnonymousClass3A4) runnable;
                            r5 = r12.A00;
                            if (r5.value == r12 && r3.A04(r5, r12, A00(r12.A01))) {
                                break;
                            }
                        } else {
                            A05(runnable, r22.A02);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.3A2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.3A2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.3A2} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<X.39y> r3 = X.C2379639y.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r0 = "false"
            java.lang.String r0 = java.lang.System.getProperty(r1, r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            A01 = r0
            java.lang.String r0 = r3.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            A03 = r0
            java.lang.Class<X.3A0> r2 = X.AnonymousClass3A0.class
            java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
            java.lang.String r0 = "thread"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r1, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "next"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "waiters"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r2, r0)     // Catch:{ all -> 0x0047 }
            java.lang.Class<X.3A1> r1 = X.AnonymousClass3A1.class
            java.lang.String r0 = "listeners"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ all -> 0x0047 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r0 = "value"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r3, r1, r0)     // Catch:{ all -> 0x0047 }
            X.3A2 r4 = new X.3A2     // Catch:{ all -> 0x0047 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0047 }
            r3 = 0
            goto L_0x004d
        L_0x0047:
            r3 = move-exception
            X.QGA r4 = new X.QGA
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
        throw new UnsupportedOperationException("Method not decompiled: X.C2379639y.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r2 != null) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A00(com.google.common.util.concurrent.ListenableFuture r5) {
        /*
            boolean r0 = r5 instanceof X.C2379639y
            r4 = 0
            if (r0 == 0) goto L_0x001e
            X.39y r5 = (X.C2379639y) r5
            java.lang.Object r3 = r5.value
            boolean r0 = r3 instanceof X.AnonymousClass3DK
            if (r0 == 0) goto L_0x001d
            r1 = r3
            X.3DK r1 = (X.AnonymousClass3DK) r1
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x001d
            java.lang.Throwable r2 = r1.A00
            if (r2 == 0) goto L_0x005e
        L_0x0018:
            X.3DK r3 = new X.3DK
            r3.<init>(r4, r2)
        L_0x001d:
            return r3
        L_0x001e:
            boolean r1 = r5.isCancelled()
            boolean r0 = A01
            r0 = r0 ^ 1
            r0 = r0 & r1
            if (r0 != 0) goto L_0x005e
            java.lang.Object r0 = A02(r5)     // Catch:{ ExecutionException -> 0x004f, CancellationException -> 0x0032, all -> 0x0057 }
            if (r0 != 0) goto L_0x004e
            java.lang.Object r0 = A02     // Catch:{ ExecutionException -> 0x004f, CancellationException -> 0x0032, all -> 0x0057 }
            return r0
        L_0x0032:
            r2 = move-exception
            if (r1 != 0) goto L_0x0018
            X.3DL r0 = X.AnonymousClass3DL.A01
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            goto L_0x0058
        L_0x004e:
            return r0
        L_0x004f:
            r1 = move-exception
            X.3DL r0 = X.AnonymousClass3DL.A01
            java.lang.Throwable r0 = r1.getCause()
            goto L_0x0058
        L_0x0057:
            r0 = move-exception
        L_0x0058:
            X.3DL r3 = new X.3DL
            r3.<init>(r0)
            return r3
        L_0x005e:
            X.3DK r3 = X.AnonymousClass3DK.A02
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2379639y.A00(com.google.common.util.concurrent.ListenableFuture):java.lang.Object");
    }

    public static Object A01(Object obj) {
        if (obj instanceof AnonymousClass3DK) {
            Throwable th = ((AnonymousClass3DK) obj).A00;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof AnonymousClass3DL) {
            throw new ExecutionException(((AnonymousClass3DL) obj).A00);
        } else if (obj == A02) {
            return null;
        } else {
            return obj;
        }
    }

    public final void A07(Object obj) {
        if (obj == null) {
            obj = A02;
        }
        if (A00.A04(this, (Object) null, obj)) {
            A04(this);
        }
    }

    public final void A08(Throwable th) {
        AnonymousClass3DL r0 = AnonymousClass3DL.A01;
        th.getClass();
        if (A00.A04(this, (Object) null, new AnonymousClass3DL(th))) {
            A04(this);
        }
    }

    public final boolean cancel(boolean z) {
        AnonymousClass3DK r3;
        Object obj = this.value;
        boolean z2 = false;
        if (obj == null) {
            z2 = true;
        }
        if (!z2 && !(obj instanceof AnonymousClass3A4)) {
            return false;
        }
        if (A01) {
            AnonymousClass3DK r0 = AnonymousClass3DK.A02;
            r3 = new AnonymousClass3DK(z, new CancellationException(AnonymousClass000.A00(2282)));
        } else if (z) {
            r3 = AnonymousClass3DK.A03;
        } else {
            r3 = AnonymousClass3DK.A02;
        }
        boolean z3 = false;
        C2379639y r2 = this;
        while (true) {
            if (A00.A04(r2, obj, r3)) {
                A04(r2);
                if (!(obj instanceof AnonymousClass3A4)) {
                    break;
                }
                ListenableFuture listenableFuture = ((AnonymousClass3A4) obj).A01;
                if (!(listenableFuture instanceof C2379639y)) {
                    listenableFuture.cancel(z);
                    break;
                }
                r2 = (C2379639y) listenableFuture;
                obj = r2.value;
                boolean z4 = false;
                if (obj == null) {
                    z4 = true;
                }
                if (!z4 && !(obj instanceof AnonymousClass3A4)) {
                    break;
                }
                z3 = true;
            } else {
                obj = r2.value;
                if (!(obj instanceof AnonymousClass3A4)) {
                    return z3;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        if (r2 > 1000) goto L_0x00d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            r17 = this;
            r0 = r18
            r11 = r20
            long r4 = r11.toNanos(r0)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x012f
            r8 = r17
            java.lang.Object r7 = r8.value
            r3 = 0
            if (r7 == 0) goto L_0x0016
            r3 = 1
        L_0x0016:
            boolean r2 = r7 instanceof X.AnonymousClass3A4
            r2 = r2 ^ 1
            r3 = r3 & r2
            if (r3 != 0) goto L_0x012a
            r15 = 0
            int r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x004f
            long r9 = java.lang.System.nanoTime()
            long r9 = r9 + r4
        L_0x0028:
            r13 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0075
            X.3A0 r7 = r8.waiters
            X.3A0 r3 = X.AnonymousClass3A0.A00
            if (r7 == r3) goto L_0x0048
            X.3A0 r6 = new X.3A0
            r6.<init>()
        L_0x0039:
            X.3A3 r2 = A00
            r2.A00(r6, r7)
            boolean r2 = r2.A03(r7, r6, r8)
            if (r2 != 0) goto L_0x0052
            X.3A0 r7 = r8.waiters
            if (r7 != r3) goto L_0x0039
        L_0x0048:
            java.lang.Object r0 = r8.value
            java.lang.Object r0 = A01(r0)
            return r0
        L_0x004f:
            r9 = 0
            goto L_0x0028
        L_0x0052:
            java.util.concurrent.locks.LockSupport.parkNanos(r8, r4)
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x0121
            java.lang.Object r7 = r8.value
            r3 = 0
            if (r7 == 0) goto L_0x0061
            r3 = 1
        L_0x0061:
            boolean r2 = r7 instanceof X.AnonymousClass3A4
            r2 = r2 ^ 1
            r3 = r3 & r2
            if (r3 != 0) goto L_0x012a
            long r2 = java.lang.System.nanoTime()
            long r4 = r9 - r2
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x0052
            r8.A03(r6)
        L_0x0075:
            int r2 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0099
            java.lang.Object r7 = r8.value
            r3 = 0
            if (r7 == 0) goto L_0x007f
            r3 = 1
        L_0x007f:
            boolean r2 = r7 instanceof X.AnonymousClass3A4
            r2 = r2 ^ 1
            r3 = r3 & r2
            if (r3 != 0) goto L_0x012a
            boolean r2 = java.lang.Thread.interrupted()
            if (r2 != 0) goto L_0x0093
            long r2 = java.lang.System.nanoTime()
            long r4 = r9 - r2
            goto L_0x0075
        L_0x0093:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0099:
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
            if (r0 >= 0) goto L_0x00ff
            r0 = 1977(0x7b9, float:2.77E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            long r2 = -r4
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r5 = r11.convert(r2, r0)
            long r11 = r11.toNanos(r5)
            long r2 = r2 - r11
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x00d8
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            r4 = 0
            if (r0 <= 0) goto L_0x00d9
        L_0x00d8:
            r4 = 1
        L_0x00d9:
            int r0 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ed
            java.lang.String r1 = X.002.A0r(r1, r9, r10, r5)
            if (r4 == 0) goto L_0x00e9
            java.lang.String r0 = ","
            java.lang.String r1 = X.002.A0R(r1, r0)
        L_0x00e9:
            java.lang.String r1 = X.002.A0R(r1, r9)
        L_0x00ed:
            if (r4 == 0) goto L_0x00f9
            r0 = 1986(0x7c2, float:2.783E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0e(r1, r0, r2)
        L_0x00f9:
            java.lang.String r0 = "delay)"
            java.lang.String r1 = X.002.A0R(r1, r0)
        L_0x00ff:
            boolean r0 = r8.isDone()
            if (r0 == 0) goto L_0x0115
            r0 = 1982(0x7be, float:2.777E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0115:
            java.lang.String r0 = " for "
            java.lang.String r1 = X.002.A0g(r1, r0, r7)
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>(r1)
            throw r0
        L_0x0121:
            r8.A03(r6)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x012a:
            java.lang.Object r0 = A01(r7)
            return r0
        L_0x012f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2379639y.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final boolean isCancelled() {
        return this.value instanceof AnonymousClass3DK;
    }

    public final boolean isDone() {
        Object obj = this.value;
        boolean z = false;
        if (obj != null) {
            z = true;
        }
        return (!(obj instanceof AnonymousClass3A4)) & z;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.39y, java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r5 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = super.toString()
            r3.append(r0)
            r0 = 1062(0x426, float:1.488E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.append(r0)
            boolean r0 = r5.isCancelled()
            java.lang.String r2 = "]"
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "CANCELLED"
        L_0x001f:
            r3.append(r0)
        L_0x0022:
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
        L_0x002a:
            boolean r0 = r5.isDone()
            if (r0 != 0) goto L_0x00be
            java.lang.Object r1 = r5.value     // Catch:{ RuntimeException -> 0x0081 }
            boolean r0 = r1 instanceof X.AnonymousClass3A4     // Catch:{ RuntimeException -> 0x0081 }
            if (r0 == 0) goto L_0x0057
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0081 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0081 }
            java.lang.String r0 = "setFuture=["
            r4.append(r0)     // Catch:{ RuntimeException -> 0x0081 }
            X.3A4 r1 = (X.AnonymousClass3A4) r1     // Catch:{ RuntimeException -> 0x0081 }
            com.google.common.util.concurrent.ListenableFuture r0 = r1.A01     // Catch:{ RuntimeException -> 0x0081 }
            if (r0 != r5) goto L_0x0050
            r0 = 1884(0x75c, float:2.64E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ RuntimeException -> 0x0081 }
        L_0x004c:
            r4.append(r0)     // Catch:{ RuntimeException -> 0x0081 }
            goto L_0x0055
        L_0x0050:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x0081 }
            goto L_0x004c
        L_0x0055:
            r0 = r2
            goto L_0x0077
        L_0x0057:
            boolean r0 = r5 instanceof java.util.concurrent.ScheduledFuture     // Catch:{ RuntimeException -> 0x0081 }
            if (r0 == 0) goto L_0x007f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0081 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0081 }
            r0 = 3873(0xf21, float:5.427E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ RuntimeException -> 0x0081 }
            r4.append(r0)     // Catch:{ RuntimeException -> 0x0081 }
            r1 = r5
            java.util.concurrent.Delayed r1 = (java.util.concurrent.Delayed) r1     // Catch:{ RuntimeException -> 0x0081 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RuntimeException -> 0x0081 }
            long r0 = r1.getDelay(r0)     // Catch:{ RuntimeException -> 0x0081 }
            r4.append(r0)     // Catch:{ RuntimeException -> 0x0081 }
            java.lang.String r0 = " ms]"
        L_0x0077:
            r4.append(r0)     // Catch:{ RuntimeException -> 0x0081 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0081 }
            goto L_0x009b
        L_0x007f:
            r1 = 0
            goto L_0x009b
        L_0x0081:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 2261(0x8d5, float:3.168E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            java.lang.Class r0 = r4.getClass()
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L_0x009b:
            if (r1 == 0) goto L_0x00b4
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b4
            r0 = 1327(0x52f, float:1.86E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            goto L_0x0022
        L_0x00b4:
            boolean r0 = r5.isDone()
            if (r0 != 0) goto L_0x00be
            java.lang.String r0 = "PENDING"
            goto L_0x001f
        L_0x00be:
            java.lang.Object r1 = A02(r5)     // Catch:{ ExecutionException -> 0x00fe, CancellationException -> 0x00fa, RuntimeException -> 0x00e1 }
            r0 = 1028(0x404, float:1.44E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ ExecutionException -> 0x00fe, CancellationException -> 0x00fa, RuntimeException -> 0x00e1 }
            r3.append(r0)     // Catch:{ ExecutionException -> 0x00fe, CancellationException -> 0x00fa, RuntimeException -> 0x00e1 }
            if (r1 != r5) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ ExecutionException -> 0x00fe, CancellationException -> 0x00fa, RuntimeException -> 0x00e1 }
            goto L_0x00d9
        L_0x00d3:
            r0 = 1884(0x75c, float:2.64E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ ExecutionException -> 0x00fe, CancellationException -> 0x00fa, RuntimeException -> 0x00e1 }
        L_0x00d9:
            r3.append(r0)     // Catch:{ ExecutionException -> 0x00fe, CancellationException -> 0x00fa, RuntimeException -> 0x00e1 }
            r3.append(r2)     // Catch:{ ExecutionException -> 0x00fe, CancellationException -> 0x00fa, RuntimeException -> 0x00e1 }
            goto L_0x0022
        L_0x00e1:
            r1 = move-exception
            r0 = 1040(0x410, float:1.457E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.append(r0)
            java.lang.Class r0 = r1.getClass()
            r3.append(r0)
            r0 = 836(0x344, float:1.171E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x001f
        L_0x00fa:
            java.lang.String r0 = "CANCELLED"
            goto L_0x001f
        L_0x00fe:
            r1 = move-exception
            r0 = 943(0x3af, float:1.321E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r3.append(r0)
            java.lang.Throwable r0 = r1.getCause()
            r3.append(r0)
            r3.append(r2)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2379639y.toString():java.lang.String");
    }

    public static void A05(Runnable runnable, Executor executor) {
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

    public final void A06(ListenableFuture listenableFuture) {
        AnonymousClass3A4 r3;
        AnonymousClass3A3 r2;
        AnonymousClass3DL r0;
        listenableFuture.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (A00.A04(this, (Object) null, A00(listenableFuture))) {
                    A04(this);
                    return;
                }
                return;
            }
            r3 = new AnonymousClass3A4(this, listenableFuture);
            r2 = A00;
            if (r2.A04(this, (Object) null, r3)) {
                try {
                    listenableFuture.addListener(r3, AnonymousClass5G0.A01);
                    return;
                } catch (Throwable unused) {
                    r0 = AnonymousClass3DL.A01;
                }
            } else {
                obj = this.value;
            }
        }
        if (obj instanceof AnonymousClass3DK) {
            listenableFuture.cancel(((AnonymousClass3DK) obj).A01);
            return;
        }
        return;
        r2.A04(this, r3, r0);
    }

    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        AnonymousClass3A1 r3 = this.listeners;
        AnonymousClass3A1 r2 = AnonymousClass3A1.A03;
        if (r3 != r2) {
            AnonymousClass3A1 r1 = new AnonymousClass3A1(runnable, executor);
            do {
                r1.A00 = r3;
                if (!A00.A02(r3, r1, this)) {
                    r3 = this.listeners;
                } else {
                    return;
                }
            } while (r3 != r2);
        }
        A05(runnable, executor);
    }

    public final Object get() {
        boolean z;
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z2 = false;
            if (obj != null) {
                z2 = true;
            }
            if (!z2 || !(!(obj instanceof AnonymousClass3A4))) {
                AnonymousClass3A0 r3 = this.waiters;
                AnonymousClass3A0 r1 = AnonymousClass3A0.A00;
                if (r3 != r1) {
                    AnonymousClass3A0 r2 = new AnonymousClass3A0();
                    while (true) {
                        AnonymousClass3A3 r0 = A00;
                        r0.A00(r2, r3);
                        if (!r0.A03(r3, r2, this)) {
                            r3 = this.waiters;
                            if (r3 == r1) {
                                break;
                            }
                        } else {
                            do {
                                LockSupport.park(this);
                                if (!Thread.interrupted()) {
                                    obj = this.value;
                                    z = false;
                                    if (obj != null) {
                                        z = true;
                                    }
                                } else {
                                    A03(r2);
                                    throw new InterruptedException();
                                }
                            } while (!(z & (!(obj instanceof AnonymousClass3A4))));
                        }
                    }
                    obj = this.value;
                } else {
                    obj = this.value;
                }
            }
            return A01(obj);
        }
        throw new InterruptedException();
    }
}
