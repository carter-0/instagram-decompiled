package go;

import android.content.Context;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.logging.Logger;

public class Seq {
    public static final int NULL_REFNUM = 41;
    public static final GoRefQueue goRefQueue = new GoRefQueue();
    public static Logger log = Logger.getLogger("GoSeq");
    public static final Ref nullRef = new Ref(41, (Object) null);
    public static final RefTracker tracker = new RefTracker();

    public interface GoObject {
        int incRefnum();
    }

    public class GoRefQueue extends ReferenceQueue {
        public final Collection refs = Collections.synchronizedCollection(new HashSet());

        public void track(int i, GoObject goObject) {
            this.refs.add(new GoRef(i, goObject, this));
        }

        public GoRefQueue() {
            Thread thread = new Thread(new Runnable() {
                /* JADX WARNING: Can't wrap try/catch for region: R(2:0|1) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
                /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:1:?, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void run() {
                    /*
                        r2 = this;
                    L_0x0000:
                        go.Seq$GoRefQueue r0 = go.Seq.GoRefQueue.this     // Catch:{ InterruptedException -> 0x0000 }
                        java.lang.ref.Reference r1 = r0.remove()     // Catch:{ InterruptedException -> 0x0000 }
                        go.Seq$GoRef r1 = (go.Seq.GoRef) r1     // Catch:{ InterruptedException -> 0x0000 }
                        go.Seq$GoRefQueue r0 = go.Seq.GoRefQueue.this     // Catch:{ InterruptedException -> 0x0000 }
                        java.util.Collection r0 = r0.refs     // Catch:{ InterruptedException -> 0x0000 }
                        r0.remove(r1)     // Catch:{ InterruptedException -> 0x0000 }
                        int r0 = r1.refnum     // Catch:{ InterruptedException -> 0x0000 }
                        go.Seq.destroyRef(r0)     // Catch:{ InterruptedException -> 0x0000 }
                        r1.clear()     // Catch:{ InterruptedException -> 0x0000 }
                        goto L_0x0000
                    */
                    throw new UnsupportedOperationException("Method not decompiled: go.Seq.GoRefQueue.AnonymousClass1.run():void");
                }
            });
            thread.setDaemon(true);
            thread.setName("GoRefQueue Finalizer Thread");
            thread.start();
        }
    }

    public interface Proxy extends GoObject {
    }

    public final class Ref {
        public final Object obj;
        public int refcnt;
        public final int refnum;

        public static /* synthetic */ int access$110(Ref ref) {
            int i = ref.refcnt;
            ref.refcnt = i - 1;
            return i;
        }

        public void inc() {
            int i = this.refcnt;
            if (i != Integer.MAX_VALUE) {
                this.refcnt = i + 1;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("refnum ");
            sb.append(this.refnum);
            sb.append(" overflow");
            throw new RuntimeException(sb.toString());
        }

        public Ref(int i, Object obj2) {
            if (i >= 0) {
                this.refnum = i;
                this.refcnt = 0;
                this.obj = obj2;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Ref instantiated with a Go refnum ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }

    public final class RefMap {
        public int[] keys = new int[16];
        public int live = 0;
        public int next = 0;
        public Ref[] objs = new Ref[16];

        public static int roundPow2(int i) {
            int i2 = 1;
            while (i2 < i) {
                i2 *= 2;
            }
            return i2;
        }

        private void grow() {
            Ref[] refArr;
            int roundPow2 = roundPow2(this.live) * 2;
            int[] iArr = this.keys;
            if (roundPow2 > iArr.length) {
                iArr = new int[(iArr.length * 2)];
                refArr = new Ref[(this.objs.length * 2)];
            } else {
                refArr = this.objs;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.keys;
                if (i >= iArr2.length) {
                    break;
                }
                Ref ref = this.objs[i];
                if (ref != null) {
                    iArr[i2] = iArr2[i];
                    refArr[i2] = ref;
                    i2++;
                }
                i++;
            }
            for (int i3 = i2; i3 < iArr.length; i3++) {
                iArr[i3] = 0;
                refArr[i3] = null;
            }
            this.keys = iArr;
            this.objs = refArr;
            this.next = i2;
            if (this.live != i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("bad state: live=");
                sb.append(this.live);
                sb.append(", next=");
                sb.append(this.next);
                throw new RuntimeException(sb.toString());
            }
        }

        public Ref get(int i) {
            int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (binarySearch >= 0) {
                return this.objs[binarySearch];
            }
            return null;
        }

        public void put(int i, Ref ref) {
            if (ref != null) {
                int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
                if (binarySearch >= 0) {
                    Ref[] refArr = this.objs;
                    if (refArr[binarySearch] == null) {
                        refArr[binarySearch] = ref;
                        this.live++;
                    }
                    if (refArr[binarySearch] != ref) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("replacing an existing ref (with key ");
                        sb.append(i);
                        sb.append(")");
                        throw new RuntimeException(sb.toString());
                    }
                    return;
                }
                if (this.next >= this.keys.length) {
                    grow();
                    binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
                }
                int i2 = binarySearch ^ -1;
                int i3 = this.next;
                if (i2 < i3) {
                    int[] iArr = this.keys;
                    int i4 = i2 + 1;
                    System.arraycopy(iArr, i2, iArr, i4, i3 - i2);
                    Ref[] refArr2 = this.objs;
                    System.arraycopy(refArr2, i2, refArr2, i4, this.next - i2);
                }
                this.keys[i2] = i;
                this.objs[i2] = ref;
                this.live++;
                this.next++;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("put a null ref (with key ");
            sb2.append(i);
            sb2.append(")");
            throw new RuntimeException(sb2.toString());
        }

        public void remove(int i) {
            int binarySearch = Arrays.binarySearch(this.keys, 0, this.next, i);
            if (binarySearch >= 0) {
                Ref[] refArr = this.objs;
                if (refArr[binarySearch] != null) {
                    refArr[binarySearch] = null;
                    this.live--;
                }
            }
        }
    }

    public final class RefTracker {
        public static final int REF_OFFSET = 42;
        public final RefMap javaObjs = new RefMap();
        public final IdentityHashMap javaRefs = new IdentityHashMap();
        public int next = 42;

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void dec(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                if (r4 > 0) goto L_0x001d
                java.util.logging.Logger r2 = go.Seq.log     // Catch:{ all -> 0x005b }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
                r1.<init>()     // Catch:{ all -> 0x005b }
                java.lang.String r0 = "dec request for Go object "
                r1.append(r0)     // Catch:{ all -> 0x005b }
                r1.append(r4)     // Catch:{ all -> 0x005b }
                java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005b }
                r2.severe(r0)     // Catch:{ all -> 0x005b }
                monitor-exit(r3)
                return
            L_0x001d:
                go.Seq$Ref r0 = go.Seq.nullRef     // Catch:{ all -> 0x005b }
                int r0 = r0.refnum     // Catch:{ all -> 0x005b }
                if (r4 != r0) goto L_0x0025
                monitor-exit(r3)
                return
            L_0x0025:
                go.Seq$RefMap r0 = r3.javaObjs     // Catch:{ all -> 0x005b }
                go.Seq$Ref r2 = r0.get(r4)     // Catch:{ all -> 0x005b }
                if (r2 == 0) goto L_0x0044
                go.Seq.Ref.access$110(r2)     // Catch:{ all -> 0x005b }
                int r0 = r2.refcnt     // Catch:{ all -> 0x005b }
                if (r0 > 0) goto L_0x0042
                go.Seq$RefMap r0 = r3.javaObjs     // Catch:{ all -> 0x005b }
                r0.remove(r4)     // Catch:{ all -> 0x005b }
                java.util.IdentityHashMap r1 = r3.javaRefs     // Catch:{ all -> 0x005b }
                java.lang.Object r0 = r2.obj     // Catch:{ all -> 0x005b }
                r1.remove(r0)     // Catch:{ all -> 0x005b }
            L_0x0042:
                monitor-exit(r3)
                return
            L_0x0044:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x005b }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
                r1.<init>()     // Catch:{ all -> 0x005b }
                java.lang.String r0 = "referenced Java object is not found: refnum="
                r1.append(r0)     // Catch:{ all -> 0x005b }
                r1.append(r4)     // Catch:{ all -> 0x005b }
                java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x005b }
                r2.<init>(r0)     // Catch:{ all -> 0x005b }
                throw r2     // Catch:{ all -> 0x005b }
            L_0x005b:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: go.Seq.RefTracker.dec(int):void");
        }

        public synchronized Ref get(int i) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("ref called with Go refnum ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
            } else if (i == 41) {
                return Seq.nullRef;
            } else {
                Ref ref = this.javaObjs.get(i);
                if (ref != null) {
                    return ref;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown java Ref: ");
                sb2.append(i);
                throw new RuntimeException(sb2.toString());
            }
        }

        public synchronized int inc(Object obj) {
            if (obj == null) {
                return 41;
            }
            if (obj instanceof Proxy) {
                return ((Proxy) obj).incRefnum();
            }
            Integer num = (Integer) this.javaRefs.get(obj);
            if (num == null) {
                int i = this.next;
                if (i != Integer.MAX_VALUE) {
                    this.next = i + 1;
                    num = Integer.valueOf(i);
                    this.javaRefs.put(obj, num);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("createRef overflow for ");
                    sb.append(obj);
                    throw new RuntimeException(sb.toString());
                }
            }
            int intValue = num.intValue();
            Ref ref = this.javaObjs.get(intValue);
            if (ref == null) {
                ref = new Ref(intValue, obj);
                this.javaObjs.put(intValue, ref);
            }
            ref.inc();
            return intValue;
        }

        public synchronized void incRefnum(int i) {
            Ref ref = this.javaObjs.get(i);
            if (ref != null) {
                ref.inc();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("referenced Java object is not found: refnum=");
                sb.append(i);
                throw new RuntimeException(sb.toString());
            }
        }
    }

    public static native void destroyRef(int i);

    public static native void incGoRef(int i, GoObject goObject);

    public static native void init();

    public static native void setContext(Object obj);

    public static void touch() {
    }

    public class GoRef extends PhantomReference {
        public final int refnum;

        public GoRef(int i, GoObject goObject, GoRefQueue goRefQueue) {
            super(goObject, goRefQueue);
            if (i <= 0) {
                this.refnum = i;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("GoRef instantiated with a Java refnum ");
            sb.append(i);
            throw new RuntimeException(sb.toString());
        }
    }

    static {
        init();
        Universe.touch();
    }

    public static void decRef(int i) {
        tracker.dec(i);
    }

    public static Ref getRef(int i) {
        return tracker.get(i);
    }

    public static int incRef(Object obj) {
        return tracker.inc(obj);
    }

    public static void incRefnum(int i) {
        tracker.incRefnum(i);
    }

    public static void trackGoRef(int i, GoObject goObject) {
        if (i <= 0) {
            goRefQueue.track(i, goObject);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("trackGoRef called with Java refnum ");
        sb.append(i);
        throw new RuntimeException(sb.toString());
    }

    public static int incGoObjectRef(GoObject goObject) {
        return goObject.incRefnum();
    }

    public static void setContext(Context context) {
        setContext((Object) context);
    }
}
