package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;

@Deprecated(level = C16705V2i.ERROR, message = "This is internal API and may be removed in the future releases")
/* renamed from: X.4Cp  reason: invalid class name and case insensitive filesystem */
public abstract class C262214Cp implements C262204Co {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01;
    public volatile /* synthetic */ Object _parentHandle$volatile;
    public volatile /* synthetic */ Object _state$volatile;

    static {
        Class<C262214Cp> cls = C262214Cp.class;
        Class<Object> cls2 = Object.class;
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state$volatile");
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle$volatile");
    }

    public void A0H() {
    }

    public void A0I(Object obj) {
    }

    public void A0J(Object obj) {
    }

    public void A0M(Throwable th) {
    }

    public boolean A0O() {
        return true;
    }

    public boolean A0S(Throwable th) {
        return false;
    }

    public final AnonymousClass2U7 AnN() {
        return new GTJ(new GTK((AnonymousClass4D7) null, this));
    }

    public final AnonymousClass19L CO3(0sP r3) {
        return CO4(r3, false, true);
    }

    public final Object fold(Object obj, 0sL r3) {
        0qQ.A0B(r3, 2);
        return r3.invoke(obj, this);
    }

    public static final int A00(Object obj, C262214Cp r5) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        19I r0;
        if (obj instanceof 19I) {
            if (!((19I) obj).A00) {
                atomicReferenceFieldUpdater = A01;
                r0 = 19H.A00;
            }
            return 0;
        }
        if (obj instanceof AnonymousClass1RR) {
            atomicReferenceFieldUpdater = A01;
            r0 = ((AnonymousClass1RR) obj).A00;
        }
        return 0;
        if (!1Ev.A00(r5, obj, r0, atomicReferenceFieldUpdater)) {
            return -1;
        }
        r5.A0H();
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00aa, code lost:
        if (r3 == null) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ac, code lost:
        A08(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00af, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b2, code lost:
        if ((r8 instanceof X.19N) == false) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00b4, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00b7, code lost:
        if (r0 == null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b9, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00ba, code lost:
        if (r3 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ca, code lost:
        if (r3.A00.CO4(new X.AnonymousClass474(r9, r3, r4, r7), false, false) == X.19K.A00) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00cc, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00cd, code lost:
        if (r0 == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00d1, code lost:
        return X.19H.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00d2, code lost:
        r3 = A05(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00d6, code lost:
        if (r3 != null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d8, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00da, code lost:
        r0 = r8.BN5();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00de, code lost:
        if (r0 == null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00e0, code lost:
        r3 = A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00e9, code lost:
        return A02(r9, r4, r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object A01(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.AnonymousClass19J
            if (r0 != 0) goto L_0x0007
            X.0zk r0 = X.19H.A02
            return r0
        L_0x0007:
            boolean r0 = r8 instanceof X.19I
            if (r0 != 0) goto L_0x000f
            boolean r0 = r8 instanceof X.AnonymousClass19P
            if (r0 == 0) goto L_0x003e
        L_0x000f:
            boolean r0 = r8 instanceof X.19N
            if (r0 != 0) goto L_0x003e
            boolean r0 = r9 instanceof X.1Hd
            if (r0 != 0) goto L_0x003e
            X.19J r8 = (X.AnonymousClass19J) r8
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = A01
            r1 = r9
            boolean r0 = r9 instanceof X.AnonymousClass19J
            if (r0 == 0) goto L_0x0028
            X.19J r1 = (X.AnonymousClass19J) r1
            X.2DF r0 = new X.2DF
            r0.<init>(r1)
            r1 = r0
        L_0x0028:
            boolean r0 = X.1Ev.A00(r7, r8, r1, r2)
            if (r0 != 0) goto L_0x0032
            r0 = 0
        L_0x002f:
            if (r0 == 0) goto L_0x00ed
            return r9
        L_0x0032:
            r0 = 0
            r7.A0M(r0)
            r7.A0J(r9)
            r7.A07(r9, r8)
            r0 = 1
            goto L_0x002f
        L_0x003e:
            X.19J r8 = (X.AnonymousClass19J) r8
            X.1RV r5 = r7.A06(r8)
            if (r5 == 0) goto L_0x00ed
            boolean r0 = r8 instanceof X.1Rc
            r3 = 0
            if (r0 == 0) goto L_0x0058
            r4 = r8
            X.1Rc r4 = (X.1Rc) r4
        L_0x004e:
            r6 = 0
            if (r4 != 0) goto L_0x0056
            X.1Rc r4 = new X.1Rc
            r4.<init>(r3, r5)
        L_0x0056:
            monitor-enter(r4)
            goto L_0x005a
        L_0x0058:
            r4 = r3
            goto L_0x004e
        L_0x005a:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = X.1Rc.A01     // Catch:{ all -> 0x00ea }
            int r1 = r2.get(r4)     // Catch:{ all -> 0x00ea }
            r0 = 0
            if (r1 == 0) goto L_0x0064
            r0 = 1
        L_0x0064:
            if (r0 == 0) goto L_0x0069
            X.0zk r0 = X.19H.A02     // Catch:{ all -> 0x00ea }
            goto L_0x0079
        L_0x0069:
            r0 = 1
            r2.set(r4, r0)     // Catch:{ all -> 0x00ea }
            if (r4 == r8) goto L_0x007b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01     // Catch:{ all -> 0x00ea }
            boolean r0 = X.1Ev.A00(r7, r8, r4, r0)     // Catch:{ all -> 0x00ea }
            if (r0 != 0) goto L_0x007b
            X.0zk r0 = X.19H.A03     // Catch:{ all -> 0x00ea }
        L_0x0079:
            monitor-exit(r4)
            return r0
        L_0x007b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.1Rc.A03     // Catch:{ all -> 0x00ea }
            java.lang.Object r0 = r1.get(r4)     // Catch:{ all -> 0x00ea }
            r2 = 0
            if (r0 == 0) goto L_0x0085
            r2 = 1
        L_0x0085:
            boolean r0 = r9 instanceof X.1Hd     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x008d
            r0 = r9
            X.1Hd r0 = (X.1Hd) r0     // Catch:{ all -> 0x00ea }
            goto L_0x008e
        L_0x008d:
            r0 = r3
        L_0x008e:
            if (r0 == 0) goto L_0x0095
            java.lang.Throwable r0 = r0.A00     // Catch:{ all -> 0x00ea }
            r4.A00(r0)     // Catch:{ all -> 0x00ea }
        L_0x0095:
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x00ea }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00ea }
            if (r2 != 0) goto L_0x009e
            r6 = 1
        L_0x009e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ all -> 0x00ea }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00ea }
            if (r0 == 0) goto L_0x00a9
            r3 = r1
        L_0x00a9:
            monitor-exit(r4)
            if (r3 == 0) goto L_0x00af
            r7.A08(r3, r5)
        L_0x00af:
            boolean r0 = r8 instanceof X.19N
            r3 = 0
            if (r0 == 0) goto L_0x00da
            r0 = r8
            X.19N r0 = (X.19N) r0
            if (r0 == 0) goto L_0x00da
            r3 = r0
        L_0x00ba:
            if (r3 == 0) goto L_0x00e5
        L_0x00bc:
            X.4Cp r2 = r3.A00
            r1 = 0
            X.474 r0 = new X.474
            r0.<init>(r9, r3, r4, r7)
            X.19L r1 = r2.CO4(r0, r1, r1)
            X.19K r0 = X.19K.A00
            if (r1 == r0) goto L_0x00d2
            r0 = 1
        L_0x00cd:
            if (r0 == 0) goto L_0x00e5
            X.0zk r0 = X.19H.A04
            return r0
        L_0x00d2:
            X.19N r3 = A05(r3)
            if (r3 != 0) goto L_0x00bc
            r0 = 0
            goto L_0x00cd
        L_0x00da:
            X.1RV r0 = r8.BN5()
            if (r0 == 0) goto L_0x00ba
            X.19N r3 = A05(r0)
            goto L_0x00ba
        L_0x00e5:
            java.lang.Object r0 = A02(r9, r4, r7)
            return r0
        L_0x00ea:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00ed:
            X.0zk r0 = X.19H.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262214Cp.A01(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: X.2DF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b0, code lost:
        if (r4 != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        if (r3 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0147, code lost:
        if (r10.A0S(r3) != false) goto L_0x0117;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(java.lang.Object r8, X.1Rc r9, X.C262214Cp r10) {
        /*
            boolean r0 = r8 instanceof X.1Hd
            r5 = 0
            if (r0 == 0) goto L_0x000c
            r0 = r8
            X.1Hd r0 = (X.1Hd) r0
            if (r0 == 0) goto L_0x000c
            java.lang.Throwable r5 = r0.A00
        L_0x000c:
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.1Rc.A03     // Catch:{ all -> 0x0163 }
            java.lang.Object r0 = r2.get(r9)     // Catch:{ all -> 0x0163 }
            r7 = 0
            if (r0 == 0) goto L_0x0017
            r7 = 1
        L_0x0017:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = X.1Rc.A02     // Catch:{ all -> 0x0163 }
            java.lang.Object r3 = r4.get(r9)     // Catch:{ all -> 0x0163 }
            if (r3 != 0) goto L_0x0032
            r0 = 4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0163 }
            r6.<init>(r0)     // Catch:{ all -> 0x0163 }
        L_0x0025:
            java.lang.Object r1 = r2.get(r9)     // Catch:{ all -> 0x0163 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x0163 }
            if (r1 == 0) goto L_0x0048
            r0 = 0
            r6.add(r0, r1)     // Catch:{ all -> 0x0163 }
            goto L_0x0048
        L_0x0032:
            boolean r0 = r3 instanceof java.lang.Throwable     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x0040
            r0 = 4
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0163 }
            r6.<init>(r0)     // Catch:{ all -> 0x0163 }
            r6.add(r3)     // Catch:{ all -> 0x0163 }
            goto L_0x0025
        L_0x0040:
            boolean r0 = r3 instanceof java.util.ArrayList     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x014c
            r6 = r3
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0163 }
            goto L_0x0025
        L_0x0048:
            if (r5 == 0) goto L_0x0053
            boolean r0 = r5.equals(r1)     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x0053
            r6.add(r5)     // Catch:{ all -> 0x0163 }
        L_0x0053:
            X.0zk r0 = X.19H.A05     // Catch:{ all -> 0x0163 }
            r4.set(r9, r0)     // Catch:{ all -> 0x0163 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0163 }
            r4 = 0
            if (r0 == 0) goto L_0x0073
            java.lang.Object r1 = r2.get(r9)     // Catch:{ all -> 0x0163 }
            r0 = 0
            if (r1 == 0) goto L_0x0067
            r0 = 1
        L_0x0067:
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = r10.A0F()     // Catch:{ all -> 0x0163 }
            X.3lV r3 = new X.3lV     // Catch:{ all -> 0x0163 }
            r3.<init>(r0, r4, r10)     // Catch:{ all -> 0x0163 }
            goto L_0x00b3
        L_0x0073:
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0163 }
        L_0x0077:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00ab
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0163 }
            boolean r0 = r3 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x0163 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0077
        L_0x0087:
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x0163 }
            if (r3 != 0) goto L_0x00b5
            r0 = 0
            java.lang.Object r3 = r6.get(r0)     // Catch:{ all -> 0x0163 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ all -> 0x0163 }
            boolean r0 = r3 instanceof X.AnonymousClass3EF     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00b3
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x0163 }
        L_0x009a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0163 }
            if (r1 == r3) goto L_0x009a
            boolean r0 = r1 instanceof X.AnonymousClass3EF     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x009a
            goto L_0x00ad
        L_0x00ab:
            r3 = r4
            goto L_0x0087
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0163 }
            if (r4 == 0) goto L_0x00b3
        L_0x00b2:
            r3 = r4
        L_0x00b3:
            if (r3 == 0) goto L_0x00e9
        L_0x00b5:
            int r1 = r6.size()     // Catch:{ all -> 0x0163 }
            r0 = 1
            if (r1 <= r0) goto L_0x00e9
            int r1 = r6.size()     // Catch:{ all -> 0x0163 }
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap     // Catch:{ all -> 0x0163 }
            r0.<init>(r1)     // Catch:{ all -> 0x0163 }
            java.util.Set r4 = java.util.Collections.newSetFromMap(r0)     // Catch:{ all -> 0x0163 }
            java.util.Iterator r2 = r6.iterator()     // Catch:{ all -> 0x0163 }
        L_0x00cd:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00e9
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0163 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x0163 }
            if (r1 == r3) goto L_0x00cd
            boolean r0 = r1 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x0163 }
            if (r0 != 0) goto L_0x00cd
            boolean r0 = r4.add(r1)     // Catch:{ all -> 0x0163 }
            if (r0 == 0) goto L_0x00cd
            X.2Og.A01(r3, r1)     // Catch:{ all -> 0x0163 }
            goto L_0x00cd
        L_0x00e9:
            monitor-exit(r9)
            if (r3 == 0) goto L_0x0123
            if (r3 == r5) goto L_0x00f4
            r0 = 0
            X.1Hd r8 = new X.1Hd
            r8.<init>(r0, r3)
        L_0x00f4:
            boolean r0 = r10 instanceof X.AnonymousClass4DB
            if (r0 != 0) goto L_0x014a
            boolean r0 = r10 instanceof X.C252193oi
            if (r0 != 0) goto L_0x014a
            r0 = 0
        L_0x00fd:
            if (r0 != 0) goto L_0x0117
            boolean r2 = r3 instanceof java.util.concurrent.CancellationException
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A00
            java.lang.Object r1 = r0.get(r10)
            X.19M r1 = (X.19M) r1
            if (r1 == 0) goto L_0x0141
            X.19K r0 = X.19K.A00
            if (r1 == r0) goto L_0x0141
            boolean r0 = r1.AH9(r3)
            if (r0 != 0) goto L_0x0117
            if (r2 == 0) goto L_0x0143
        L_0x0117:
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            X.0qQ.A0C(r8, r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = X.1Hd.A01
            r1 = 0
            r0 = 1
            r2.compareAndSet(r8, r1, r0)
        L_0x0123:
            if (r7 != 0) goto L_0x0128
            r10.A0M(r3)
        L_0x0128:
            r10.A0J(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = A01
            r1 = r8
            boolean r0 = r8 instanceof X.AnonymousClass19J
            if (r0 == 0) goto L_0x013a
            X.19J r1 = (X.AnonymousClass19J) r1
            X.2DF r0 = new X.2DF
            r0.<init>(r1)
            r1 = r0
        L_0x013a:
            X.1Ev.A00(r10, r9, r1, r2)
            r10.A07(r8, r9)
            return r8
        L_0x0141:
            if (r2 != 0) goto L_0x0117
        L_0x0143:
            boolean r0 = r10.A0S(r3)
            if (r0 == 0) goto L_0x0123
            goto L_0x0117
        L_0x014a:
            r0 = 1
            goto L_0x00fd
        L_0x014c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0163 }
            r1.<init>()     // Catch:{ all -> 0x0163 }
            java.lang.String r0 = "State is "
            r1.append(r0)     // Catch:{ all -> 0x0163 }
            r1.append(r3)     // Catch:{ all -> 0x0163 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0163 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0163 }
            r0.<init>(r1)     // Catch:{ all -> 0x0163 }
            throw r0     // Catch:{ all -> 0x0163 }
        L_0x0163:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262214Cp.A02(java.lang.Object, X.1Rc, X.4Cp):java.lang.Object");
    }

    public static final String A03(Object obj) {
        if (obj instanceof 1Rc) {
            if (1Rc.A03.get(obj) != null) {
                return "Cancelling";
            }
            if (1Rc.A01.get(obj) != 0) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof AnonymousClass19J) {
            if (!((AnonymousClass19J) obj).isActive()) {
                return "New";
            }
            return "Active";
        } else if (obj instanceof 1Hd) {
            return AnonymousClass000.A00(2135);
        } else {
            return AnonymousClass000.A00(2177);
        }
    }

    private final Throwable A04(Object obj) {
        if (obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new C250473lV(A0F(), (Throwable) null, this);
            }
            return th;
        }
        C262214Cp r5 = (C262214Cp) obj;
        Object A0C = r5.A0C();
        Throwable th2 = null;
        if (A0C instanceof 1Rc) {
            th2 = (Throwable) 1Rc.A03.get(A0C);
        } else if (A0C instanceof 1Hd) {
            th2 = ((1Hd) A0C).A00;
        } else if (A0C instanceof AnonymousClass19J) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot be cancelling child in this state: ");
            sb.append(A0C);
            throw new IllegalStateException(sb.toString());
        }
        if (th2 instanceof CancellationException) {
            Throwable th3 = th2;
            if (th2 != null) {
                return th3;
            }
        }
        return new C250473lV(002.A0R("Parent job is ", A03(A0C)), th2, r5);
    }

    private final void A07(Object obj, AnonymousClass19J r10) {
        1Hd r9;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        AnonymousClass19L r0 = (AnonymousClass19L) atomicReferenceFieldUpdater.get(this);
        if (r0 != null) {
            r0.dispose();
            atomicReferenceFieldUpdater.set(this, 19K.A00);
        }
        Throwable th = null;
        if ((obj instanceof 1Hd) && (r9 = (1Hd) obj) != null) {
            th = r9.A00;
        }
        if (r10 instanceof AnonymousClass19P) {
            try {
                ((AnonymousClass19P) r10).A05(th);
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(r10);
                sb.append(" for ");
                sb.append(this);
                RuntimeException runtimeException = new RuntimeException(sb.toString(), th2);
                if (this instanceof AnonymousClass4D9) {
                    C9878Rir.A00(((AnonymousClass4D9) this).A00, runtimeException);
                    return;
                }
                throw runtimeException;
            }
        } else {
            AnonymousClass1RV BN5 = r10.BN5();
            if (BN5 != null) {
                Object A02 = BN5.A02();
                0qQ.A0C(A02, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                RuntimeException runtimeException2 = null;
                for (19Q r5 = (AnonymousClass19R) A02; !0qQ.A0K(r5, BN5); r5 = r5.A03()) {
                    if (r5 instanceof AnonymousClass19P) {
                        19Q r3 = r5;
                        try {
                            r3.A05(th);
                        } catch (Throwable th3) {
                            if (runtimeException2 != null) {
                                2Og.A01(runtimeException2, th3);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Exception in completion handler ");
                                sb2.append(r3);
                                sb2.append(" for ");
                                sb2.append(this);
                                runtimeException2 = new RuntimeException(sb2.toString(), th3);
                            }
                        }
                    }
                }
                if (runtimeException2 != null) {
                    if (this instanceof AnonymousClass4D9) {
                        C9878Rir.A00(((AnonymousClass4D9) this).A00, runtimeException2);
                        return;
                    }
                    throw runtimeException2;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.19R, java.lang.Object, X.19P] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A09(X.AnonymousClass19P r4) {
        /*
            r3 = this;
            X.1RV r2 = new X.1RV
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass19R.A01
            r0.set(r2, r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = X.AnonymousClass19R.A00
            r1.set(r2, r4)
        L_0x000f:
            java.lang.Object r0 = r4.A02()
            if (r0 != r4) goto L_0x001e
            boolean r0 = X.1Ev.A00(r4, r4, r2, r1)
            if (r0 == 0) goto L_0x000f
            X.AnonymousClass19R.A01(r2, r4)
        L_0x001e:
            X.19R r1 = r4.A03()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01
            X.1Ev.A00(r3, r4, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262214Cp.A09(X.19P):void");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.19R, java.lang.Object, X.19P] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0A(java.lang.Object r5, X.AnonymousClass19P r6, X.AnonymousClass1RV r7) {
        /*
            r4 = this;
            X.1Rd r3 = new X.1Rd
            r3.<init>(r5, r4, r6)
        L_0x0005:
            X.19R r1 = X.AnonymousClass19R.A00(r7)
            if (r1 != 0) goto L_0x001e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = X.AnonymousClass19R.A01
            java.lang.Object r1 = r2.get(r7)
        L_0x0011:
            X.19R r1 = (X.AnonymousClass19R) r1
            boolean r0 = r1.A04()
            if (r0 == 0) goto L_0x001e
            java.lang.Object r1 = r2.get(r1)
            goto L_0x0011
        L_0x001e:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass19R.A01
            r0.set(r6, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.AnonymousClass19R.A00
            r0.set(r6, r7)
            r3.A00 = r7
            boolean r0 = X.1Ev.A00(r1, r7, r3, r0)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r1 = r3.A00(r1)
            r0 = 0
            if (r1 != 0) goto L_0x0038
            r0 = 1
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262214Cp.A0A(java.lang.Object, X.19P, X.1RV):boolean");
    }

    public final Object A0C() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A01;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof 1Et)) {
                return obj;
            }
            ((1Et) obj).A00(this);
        }
    }

    public final String A0F() {
        if (this instanceof AnonymousClass4D9) {
            return 002.A0R(getClass().getSimpleName(), " was cancelled");
        }
        return "Job was cancelled";
    }

    public final void A0L(Throwable th) {
        CancellationException cancellationException;
        if (this instanceof C252673pU) {
            C252673pU r2 = (C252673pU) this;
            if (!(th instanceof CancellationException) || (cancellationException = (CancellationException) th) == null) {
                cancellationException = new C250473lV(r2.A0F(), th, r2);
            }
            r2.A00.AG7(cancellationException);
            r2.A0Q(cancellationException);
            return;
        }
        A0Q(th);
    }

    public final void A0N(C262204Co r3) {
        if (r3 != null) {
            r3.EwR();
            19M ACp = r3.ACp(this);
            A00.set(this, ACp);
            if (!(A0C() instanceof AnonymousClass19J)) {
                ACp.dispose();
            } else {
                return;
            }
        }
        A00.set(this, 19K.A00);
    }

    public boolean A0P() {
        if (this instanceof C241063Ns) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r1 == X.19H.A04) goto L_0x0023;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a7, code lost:
        r1 = r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0Q(java.lang.Object r10) {
        /*
            r9 = this;
            X.0zk r5 = X.19H.A02
            r1 = r5
            boolean r0 = r9.A0P()
            r8 = 1
            if (r0 == 0) goto L_0x0039
        L_0x000a:
            java.lang.Object r3 = r9.A0C()
            boolean r0 = r3 instanceof X.AnonymousClass19J
            if (r0 == 0) goto L_0x001e
            boolean r0 = r3 instanceof X.1Rc
            if (r0 == 0) goto L_0x0024
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1Rc.A01
            int r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0024
        L_0x001e:
            r1 = r5
        L_0x001f:
            X.0zk r0 = X.19H.A04
            if (r1 != r0) goto L_0x0039
        L_0x0023:
            return r8
        L_0x0024:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = X.1Hd.A01
            java.lang.Throwable r2 = r9.A04(r10)
            r1 = 0
            X.1Hd r0 = new X.1Hd
            r0.<init>(r1, r2)
            java.lang.Object r1 = r9.A01(r3, r0)
            X.0zk r0 = X.19H.A03
            if (r1 == r0) goto L_0x000a
            goto L_0x001f
        L_0x0039:
            if (r1 != r5) goto L_0x00a8
            r4 = 0
            r6 = r4
        L_0x003d:
            java.lang.Object r2 = r9.A0C()
            boolean r0 = r2 instanceof X.1Rc
            if (r0 == 0) goto L_0x007e
            monitor-enter(r2)
            r7 = r2
            X.1Rc r7 = (X.1Rc) r7     // Catch:{ all -> 0x00c8 }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.1Rc.A02     // Catch:{ all -> 0x00c8 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x00c8 }
            X.0zk r0 = X.19H.A05     // Catch:{ all -> 0x00c8 }
            if (r1 != r0) goto L_0x0057
            X.0zk r1 = X.19H.A06     // Catch:{ all -> 0x00c8 }
            monitor-exit(r2)
            goto L_0x00a8
        L_0x0057:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = X.1Rc.A03     // Catch:{ all -> 0x00c8 }
            java.lang.Object r1 = r3.get(r7)     // Catch:{ all -> 0x00c8 }
            r0 = 0
            if (r1 == 0) goto L_0x0061
            r0 = 1
        L_0x0061:
            if (r6 != 0) goto L_0x0067
            java.lang.Throwable r6 = r9.A04(r10)     // Catch:{ all -> 0x00c8 }
        L_0x0067:
            r7.A00(r6)     // Catch:{ all -> 0x00c8 }
            java.lang.Object r1 = r3.get(r7)     // Catch:{ all -> 0x00c8 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x00c8 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0075
            r4 = r1
        L_0x0075:
            monitor-exit(r2)
            if (r4 == 0) goto L_0x00a7
            X.1RV r0 = r7.A00
            r9.A08(r4, r0)
            goto L_0x00a7
        L_0x007e:
            boolean r0 = r2 instanceof X.AnonymousClass19J
            if (r0 == 0) goto L_0x00c5
            if (r6 != 0) goto L_0x0088
            java.lang.Throwable r6 = r9.A04(r10)
        L_0x0088:
            r3 = r2
            X.19J r3 = (X.AnonymousClass19J) r3
            boolean r0 = r3.isActive()
            if (r0 == 0) goto L_0x00b4
            X.1RV r2 = r9.A06(r3)
            if (r2 == 0) goto L_0x003d
            X.1Rc r1 = new X.1Rc
            r1.<init>(r6, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = A01
            boolean r0 = X.1Ev.A00(r9, r3, r1, r0)
            if (r0 == 0) goto L_0x003d
            r9.A08(r6, r2)
        L_0x00a7:
            r1 = r5
        L_0x00a8:
            if (r1 == r5) goto L_0x0023
            X.0zk r0 = X.19H.A04
            if (r1 == r0) goto L_0x0023
            X.0zk r0 = X.19H.A06
            if (r1 != r0) goto L_0x00cb
            r8 = 0
            return r8
        L_0x00b4:
            r1 = 0
            X.1Hd r0 = new X.1Hd
            r0.<init>(r1, r6)
            java.lang.Object r1 = r9.A01(r2, r0)
            if (r1 == r5) goto L_0x00cf
            X.0zk r0 = X.19H.A03
            if (r1 == r0) goto L_0x003d
            goto L_0x00a8
        L_0x00c5:
            X.0zk r1 = X.19H.A06
            goto L_0x00a8
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00cb:
            r9.A0I(r1)
            return r8
        L_0x00cf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Cannot happen in "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262214Cp.A0Q(java.lang.Object):boolean");
    }

    public boolean A0R(Throwable th) {
        if ((th instanceof CancellationException) || (A0Q(th) && A0O())) {
            return true;
        }
        return false;
    }

    public final 19M ACp(C262214Cp r3) {
        19M CO4 = CO4(new 19N(r3), true, true);
        0qQ.A0C(CO4, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return CO4;
    }

    public void AG7(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C250473lV(A0F(), (Throwable) null, this);
        }
        A0L(cancellationException);
    }

    public final C262204Co BaT() {
        19M r0 = (19M) A00.get(this);
        if (r0 != null) {
            return r0.BaT();
        }
        return null;
    }

    public final AnonymousClass19L CO4(0sP r8, boolean z, boolean z2) {
        19K r5;
        1Hd r4;
        19K r3;
        boolean A0A;
        Throwable th;
        if (z) {
            if (!(r8 instanceof AnonymousClass19O) || (r5 = (AnonymousClass19P) r8) == null) {
                r5 = new C59472JKw(r8);
            }
        } else if (!(r8 instanceof AnonymousClass19P) || (r5 = (AnonymousClass19P) r8) == null) {
            r5 = new C247593gb(r8);
        }
        r5.A00 = this;
        while (true) {
            Object A0C = A0C();
            if (A0C instanceof 19I) {
                19I r2 = (19I) A0C;
                if (r2.A00) {
                    A0A = 1Ev.A00(this, A0C, r5, A01);
                } else {
                    1Ev.A00(this, r2, new AnonymousClass1RR(new AnonymousClass1RV()), A01);
                }
            } else {
                Throwable th2 = null;
                if (A0C instanceof AnonymousClass19J) {
                    AnonymousClass1RV BN5 = ((AnonymousClass19J) A0C).BN5();
                    if (BN5 == null) {
                        0qQ.A0C(A0C, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        A09((AnonymousClass19P) A0C);
                    } else {
                        r3 = 19K.A00;
                        if (!z || !(A0C instanceof 1Rc)) {
                            A0A = A0A(A0C, r5, BN5);
                        } else {
                            synchronized (A0C) {
                                1Rc r22 = (1Rc) A0C;
                                th = (Throwable) 1Rc.A03.get(r22);
                                if (th != null) {
                                    if (r8 instanceof 19N) {
                                        if (1Rc.A01.get(r22) != 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                if (A0A(A0C, r5, BN5)) {
                                    if (th == null) {
                                        return r5;
                                    }
                                    r3 = r5;
                                }
                            }
                        }
                    }
                } else {
                    if (z2) {
                        if ((A0C instanceof 1Hd) && (r4 = (1Hd) A0C) != null) {
                            th2 = r4.A00;
                        }
                        r8.invoke(th2);
                    }
                    return 19K.A00;
                }
            }
            if (A0A) {
                return r5;
            }
        }
        if (z2) {
            r8.invoke(th);
        }
        return r3;
    }

    public final C634312c getKey() {
        return C262204Co.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(A0G());
        sb.append('{');
        sb.append(A03(A0C()));
        sb.append('}');
        return 002.A0T(sb.toString(), Integer.toHexString(System.identityHashCode(this)), '@');
    }

    public static final 19N A05(AnonymousClass19R r3) {
        while (r3.A04()) {
            AnonymousClass19R A002 = AnonymousClass19R.A00(r3);
            if (A002 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AnonymousClass19R.A01;
                Object obj = atomicReferenceFieldUpdater.get(r3);
                while (true) {
                    A002 = (AnonymousClass19R) obj;
                    if (!A002.A04()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(A002);
                }
            }
            r3 = A002;
        }
        while (true) {
            r3 = r3.A03();
            if (!r3.A04()) {
                if (r3 instanceof 19N) {
                    return (19N) r3;
                }
                if (r3 instanceof AnonymousClass1RV) {
                    return null;
                }
            }
        }
    }

    private final AnonymousClass1RV A06(AnonymousClass19J r3) {
        AnonymousClass1RV BN5 = r3.BN5();
        if (BN5 != null) {
            return BN5;
        }
        if (r3 instanceof 19I) {
            return new AnonymousClass1RV();
        }
        if (r3 instanceof AnonymousClass19P) {
            A09((AnonymousClass19P) r3);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("State should have list: ");
        sb.append(r3);
        throw new IllegalStateException(sb.toString());
    }

    private final void A08(Throwable th, AnonymousClass1RV r8) {
        19K r1;
        A0M(th);
        Object A02 = r8.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        RuntimeException runtimeException = null;
        for (19Q r5 = (AnonymousClass19R) A02; !0qQ.A0K(r5, r8); r5 = r5.A03()) {
            if (r5 instanceof AnonymousClass19O) {
                19Q r3 = r5;
                try {
                    r3.A05(th);
                } catch (Throwable th2) {
                    if (runtimeException != null) {
                        2Og.A01(runtimeException, th2);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(r3);
                        sb.append(" for ");
                        sb.append(this);
                        runtimeException = new RuntimeException(sb.toString(), th2);
                    }
                }
            }
        }
        if (runtimeException != null) {
            if (this instanceof AnonymousClass4D9) {
                C9878Rir.A00(((AnonymousClass4D9) this).A00, runtimeException);
            } else {
                throw runtimeException;
            }
        }
        if (!(this instanceof AnonymousClass4DB) && !(this instanceof C252193oi) && (r1 = (19M) A00.get(this)) != null && r1 != 19K.A00) {
            r1.AH9(th);
        }
    }

    public final Object A0B() {
        Object A0C = A0C();
        if (!(!(A0C instanceof AnonymousClass19J))) {
            throw new IllegalStateException("This job has not completed yet");
        } else if (!(A0C instanceof 1Hd)) {
            return 19H.A00(A0C);
        } else {
            throw ((1Hd) A0C).A00;
        }
    }

    public final Object A0D(Object obj) {
        Object A012;
        1Hd r4;
        do {
            A012 = A01(A0C(), obj);
            if (A012 == 19H.A02) {
                StringBuilder sb = new StringBuilder();
                sb.append("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(obj);
                String obj2 = sb.toString();
                Throwable th = null;
                if ((obj instanceof 1Hd) && (r4 = (1Hd) obj) != null) {
                    th = r4.A00;
                }
                throw new IllegalStateException(obj2, th);
            }
        } while (A012 == 19H.A03);
        return A012;
    }

    public final Object A0E(AnonymousClass4D7 r3) {
        Object A0C;
        do {
            A0C = A0C();
            if (!(A0C instanceof AnonymousClass19J)) {
                if (!(A0C instanceof 1Hd)) {
                    return 19H.A00(A0C);
                }
                throw ((1Hd) A0C).A00;
            }
        } while (A00(A0C, this) < 0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1IW.A04;
        AnonymousClass2QA r1 = new AnonymousClass2QA(1Ey.A02(r3), this);
        r1.A0I();
        AnonymousClass1IV.A01(r1, CO3(new 2QB(r1)));
        return r1.A0E();
    }

    public String A0G() {
        return getClass().getSimpleName();
    }

    public final void A0K(Object obj) {
        Object A012;
        do {
            A012 = A01(A0C(), obj);
            if (A012 == 19H.A02 || A012 == 19H.A04) {
                return;
            }
        } while (A012 == 19H.A03);
        A0I(A012);
    }

    public final CancellationException Al8() {
        CancellationException cancellationException;
        CancellationException cancellationException2;
        Object A0C = A0C();
        if (A0C instanceof 1Rc) {
            Throwable th = (Throwable) 1Rc.A03.get(A0C);
            if (th != null) {
                String A0R = 002.A0R(getClass().getSimpleName(), " is cancelling");
                if ((th instanceof CancellationException) && (cancellationException2 = (CancellationException) th) != null) {
                    return cancellationException2;
                }
                if (A0R == null) {
                    A0R = A0F();
                }
                return new C250473lV(A0R, th, this);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Job is still new or active: ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        } else if (A0C instanceof AnonymousClass19J) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Job is still new or active: ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString());
        } else if (!(A0C instanceof 1Hd)) {
            return new C250473lV(002.A0R(getClass().getSimpleName(), " has completed normally"), (Throwable) null, this);
        } else {
            Throwable th2 = ((1Hd) A0C).A00;
            if (!(th2 instanceof CancellationException) || (cancellationException = (CancellationException) th2) == null) {
                return new C250473lV(A0F(), th2, this);
            }
            return cancellationException;
        }
    }

    public final boolean CQL() {
        return !(A0C() instanceof AnonymousClass19J);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object CfH(X.AnonymousClass4D7 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r1 = r3.A0C()
            boolean r0 = r1 instanceof X.AnonymousClass19J
            if (r0 != 0) goto L_0x0012
            X.4Cc r0 = r4.getContext()
            X.C64871Wv.A02(r0)
        L_0x000f:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0012:
            int r0 = A00(r1, r3)
            if (r0 < 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.1IW.A04
            X.4D7 r2 = X.1Ey.A02(r4)
            r0 = 1
            X.1IW r1 = new X.1IW
            r1.<init>(r0, r2)
            r1.A0I()
            X.3Pu r0 = new X.3Pu
            r0.<init>(r1)
            X.19L r0 = r3.CO3(r0)
            X.AnonymousClass1IV.A01(r1, r0)
            java.lang.Object r1 = r1.A0E()
            X.1Hj r0 = X.1Hj.A02
            if (r1 == r0) goto L_0x003d
            X.0gF r1 = X.C60340gF.A00
        L_0x003d:
            if (r1 != r0) goto L_0x000f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C262214Cp.CfH(X.4D7):java.lang.Object");
    }

    public final boolean EwR() {
        int A002;
        boolean z;
        do {
            A002 = A00(A0C(), this);
            z = false;
            if (A002 == 0) {
                break;
            }
            z = true;
        } while (A002 != 1);
        return z;
    }

    public final C262084Cb get(C634312c r2) {
        return AnonymousClass199.A00(this, r2);
    }

    public final boolean isActive() {
        Object A0C = A0C();
        if (!(A0C instanceof AnonymousClass19J) || !((AnonymousClass19J) A0C).isActive()) {
            return false;
        }
        return true;
    }

    public final boolean isCancelled() {
        Object A0C = A0C();
        if (A0C instanceof 1Hd) {
            return true;
        }
        if (!(A0C instanceof 1Rc) || 1Rc.A03.get(A0C) == null) {
            return false;
        }
        return true;
    }

    public final C262094Cc minusKey(C634312c r2) {
        return AnonymousClass199.A01(this, r2);
    }

    public final C262094Cc plus(C262094Cc r2) {
        return AnonymousClass199.A02(this, r2);
    }
}
