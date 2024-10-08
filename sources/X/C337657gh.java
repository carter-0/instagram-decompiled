package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.litho.ComponentsSystrace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7gh  reason: invalid class name and case insensitive filesystem */
public final class C337657gh {
    public static volatile Looper A0L;
    public int A00;
    public C337587ga A01;
    public C337587ga A02;
    public C337587ga A03;
    public C337707gm A04;
    public C56504Hza A05;
    public List A06;
    public boolean A07;
    public final AnonymousClass2V9 A08 = new Object();
    public final C337687gk A09;
    public final C337717gn A0A;
    public final C337717gn A0B;
    public final AnonymousClass2Ss A0C;
    public final String A0D;
    public final AtomicBoolean A0E;
    public final boolean A0F;
    public final 2V8 A0G = new 2V8();
    public final C337677gj A0H;
    public final C337667gi A0I;
    public final C337557gX A0J;
    public final Map A0K = new HashMap();

    private C39675A4r A00(C337587ga r8, String str, int i) {
        if (r8 != null) {
            if (str.equals(r8.A03)) {
                return new C39675A4r(r8, i);
            }
            List list = r8.A05;
            if (list != null && !list.isEmpty()) {
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C337587ga r1 = (C337587ga) list.get(i3);
                    C39675A4r A002 = A00(r1, str, i + i2);
                    if (A002 != null) {
                        return A002;
                    }
                    i2 += r1.A00;
                }
            }
        }
        return null;
    }

    public static RuntimeException A03(C337587ga r3, C337657gh r4, IndexOutOfBoundsException indexOutOfBoundsException) {
        Integer num;
        String str;
        Integer num2;
        String obj;
        String str2 = null;
        RuntimeException A022 = A02((C337587ga) null, r3, indexOutOfBoundsException);
        if (A022 != indexOutOfBoundsException) {
            return A022;
        }
        synchronized (r4) {
            StringBuilder sb = new StringBuilder();
            sb.append("tag: ");
            sb.append(r4.A0D);
            sb.append(", currentSection.size: ");
            C337587ga r0 = r4.A02;
            if (r0 != null) {
                num = Integer.valueOf(r0.A00);
            } else {
                num = null;
            }
            sb.append(num);
            sb.append(", currentSection.name: ");
            C337587ga r02 = r4.A02;
            if (r02 != null) {
                str = r02.A09;
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", nextSection.size: ");
            C337587ga r03 = r4.A03;
            if (r03 != null) {
                num2 = Integer.valueOf(r03.A00);
            } else {
                num2 = null;
            }
            sb.append(num2);
            sb.append(", nextSection.name: ");
            C337587ga r04 = r4.A03;
            if (r04 != null) {
                str2 = r04.A09;
            }
            sb.append(str2);
            sb.append(", pendingChangeSets.size: ");
            sb.append(r4.A06.size());
            sb.append(", pendingStateUpdates.size: ");
            C337707gm r1 = r4.A04;
            sb.append(r1.A00.size());
            sb.append(", pendingNonLazyStateUpdates.size: ");
            sb.append(r1.A01.size());
            sb.append("\n");
            obj = sb.toString();
        }
        return new RuntimeException(002.A0g("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception for more information. Debug info: ", obj, indexOutOfBoundsException.getMessage()), indexOutOfBoundsException);
    }

    public static synchronized void A05(C294145lv r3, C337657gh r4, String str, boolean z) {
        C337587ga A042;
        synchronized (r4) {
            if (r4.A02 == null && r4.A03 == null) {
                throw new IllegalStateException("State set with no attached Section");
            }
            C337707gm r2 = r4.A04;
            Map map = r2.A00;
            List list = (List) map.get(str);
            if (list == null) {
                list = new ArrayList();
                map.put(str, list);
            }
            list.add(r3);
            if (!z) {
                Map map2 = r2.A01;
                List list2 = (List) map2.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                    map2.put(str, list2);
                }
                list2.add(r3);
                if (r4.A07) {
                    int i = r4.A00 + 1;
                    r4.A00 = i;
                    if (i == 50) {
                        2W6.A00("SectionTree:StateUpdatesFromInsideChangeSetCalculateExceedsThreshold", AnonymousClass05K.A0C, "Large number of state updates detected which indicates an infinite loop leading to unresponsive apps");
                    }
                }
                C337587ga r0 = r4.A03;
                if (r0 == null) {
                    C337587ga r02 = r4.A02;
                    if (r02 != null) {
                        A042 = r02.A04(false);
                    } else {
                        A042 = null;
                    }
                } else {
                    A042 = r0.A04(false);
                }
                r4.A03 = A042;
            }
        }
    }

    private synchronized void A0B(C337587ga r5) {
        List list = r5.A05;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A0B((C337587ga) list.get(i));
            }
        }
    }

    public final void A0H() {
        C337587ga r0;
        synchronized (this) {
            r0 = this.A02;
        }
        if (r0 != null) {
            A09(r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0026, code lost:
        r3 = X.2SN.A01("Section.SetRoot");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        if (r3 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        X.2SN.A06("Section.SetRoot", "-1", new X.C41467AuR(r7, r6), r3.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        A0G(r6, (java.lang.String) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004b, code lost:
        if (r3 != null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004d, code lost:
        X.2SN.A02(r3.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0054, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I(X.C337587ga r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            X.7ga r0 = r6.A02     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x000d
            int r1 = r0.A08     // Catch:{ all -> 0x0055 }
            int r0 = r7.A08     // Catch:{ all -> 0x0055 }
            if (r1 != r0) goto L_0x000d
        L_0x000b:
            monitor-exit(r6)     // Catch:{ all -> 0x0055 }
            goto L_0x0018
        L_0x000d:
            X.7ga r0 = r6.A03     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0019
            int r1 = r0.A08     // Catch:{ all -> 0x0055 }
            int r0 = r7.A08     // Catch:{ all -> 0x0055 }
            if (r1 != r0) goto L_0x0019
            goto L_0x000b
        L_0x0018:
            return
        L_0x0019:
            r5 = 0
            if (r7 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0023
        L_0x001f:
            X.7ga r0 = r7.A04(r5)     // Catch:{ all -> 0x0055 }
        L_0x0023:
            r6.A03 = r0     // Catch:{ all -> 0x0055 }
            monitor-exit(r6)     // Catch:{ all -> 0x0055 }
            java.lang.String r4 = "Section.SetRoot"
            java.lang.Integer r3 = X.2SN.A01(r4)
            if (r3 == 0) goto L_0x003c
            int r2 = r3.intValue()
            java.lang.String r1 = "-1"
            X.AuR r0 = new X.AuR
            r0.<init>(r7, r6)
            X.2SN.A06(r4, r1, r0, r2)
        L_0x003c:
            r0 = 0
            A0G(r6, r0, r5)     // Catch:{ all -> 0x004a }
            if (r3 == 0) goto L_0x0049
            int r0 = r3.intValue()
            X.2SN.A02(r0)
        L_0x0049:
            return
        L_0x004a:
            r1 = move-exception
            if (r3 == 0) goto L_0x0054
            int r0 = r3.intValue()
            X.2SN.A02(r0)
        L_0x0054:
            throw r1
        L_0x0055:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0055 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337657gh.A0I(X.7ga):void");
    }

    public static C39675A4r A01(C337657gh r4, String str) {
        C337587ga r1 = r4.A01;
        if (r1 != null) {
            C39675A4r A002 = r4.A00(r1, str, 0);
            if (A002 != null) {
                return A002;
            }
            throw new RuntimeException(002.A11("Did not find section with key '", str, "'! Currently bound section's global key is '", r4.A01.A03, "'"));
        }
        throw new IllegalStateException("You cannot call requestFocus methods before dataBound() is called!");
    }

    public static RuntimeException A02(C337587ga r5, C337587ga r6, IndexOutOfBoundsException indexOutOfBoundsException) {
        List list;
        String str;
        String str2;
        if (r6 != null) {
            C337557gX r3 = r6.A02;
            if ((r6 instanceof C337767gs) && (list = ((C337767gs) r6).A04) != null) {
                C337827gy r1 = new C337827gy(r3, (List) null, list);
                if (r3.A0E() != null) {
                    str = r3.A0E().A09;
                } else {
                    str = "null";
                }
                String A002 = C9249RVa.A00(r1, str, list);
                if (A002 != null) {
                    if (r5 != null) {
                        str2 = r5.A09;
                    } else {
                        str2 = r6.A09;
                    }
                    RuntimeException runtimeException = new RuntimeException(002.A11("Index out of bounds while applying a new section. This indicates a bad diff was sent to the RecyclerBinder. See https://fblitho.com/docs/sections/best-practices/#avoiding-indexoutofboundsexception for more information. Debug info: ", A002, " in the [", str2, "]."), indexOutOfBoundsException);
                    runtimeException.setStackTrace(new StackTraceElement[0]);
                    return runtimeException;
                }
            }
            List<C337587ga> list2 = r6.A05;
            if (list2 != null) {
                for (C337587ga A022 : list2) {
                    RuntimeException A023 = A02(r6, A022, indexOutOfBoundsException);
                    if (A023 != indexOutOfBoundsException) {
                        return A023;
                    }
                }
            }
        }
        return indexOutOfBoundsException;
    }

    public static void A06(C337907h6 r15, C337587ga r16, C337657gh r17, int i, long j, boolean z, boolean z2) {
        int i2;
        int i3;
        C337587ga r2 = r16;
        int i4 = i;
        if (!(r2 instanceof C337767gs)) {
            C337657gh r13 = r17;
            C337477gP r0 = (C337477gP) r13.A0K.get(r2.A03);
            if (r0 != null) {
                i2 = r0.A01;
                i3 = r0.A03;
            } else {
                i2 = -1;
                i3 = -1;
            }
            C337557gX r1 = r2.A02;
            C337907h6 r11 = r15;
            long j2 = j;
            boolean z3 = z;
            boolean z4 = z2;
            if (r2 instanceof C337577gZ) {
                0sG r5 = ((C337577gZ) r2).A03;
                0qQ.A0B(r1, 0);
                0qQ.A0B(r11, 6);
                if (r5 != null) {
                    r5.invoke(Boolean.valueOf(z3), Boolean.valueOf(z4), Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3), r11, Integer.valueOf(i4));
                }
            }
            List list = r2.A05;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                C337587ga r12 = (C337587ga) list.get(i5);
                A06(r11, r12, r13, i4, j2, z3, z4);
                i4 += r12.A00;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b5 A[Catch:{ all -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x024d A[Catch:{ all -> 0x025e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A07(X.C337667gi r19, X.C337587ga r20, X.C337587ga r21, X.C337557gX r22, java.lang.String r23, java.util.Map r24) {
        /*
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r18 = r0.isTracing()
            r11 = r21
            if (r18 == 0) goto L_0x0015
            java.lang.String r1 = "createChildren:"
            java.lang.String r0 = r11.A09
            java.lang.String r0 = X.002.A0R(r1, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0015:
            java.lang.String r3 = "Section.OnCreateChildren"
            java.lang.Integer r17 = X.2SN.A01(r3)
            r10 = r22
            if (r17 == 0) goto L_0x002d
            int r2 = r17.intValue()
            X.AuS r1 = new X.AuS
            r1.<init>(r11, r10)
            java.lang.String r0 = "-1"
            X.2SN.A06(r3, r0, r1, r2)
        L_0x002d:
            X.7gX r1 = new X.7gX     // Catch:{ all -> 0x025e }
            r1.<init>(r10)     // Catch:{ all -> 0x025e }
            X.7gh r0 = r10.A02     // Catch:{ all -> 0x025e }
            r1.A02 = r0     // Catch:{ all -> 0x025e }
            X.2Sg r0 = r10.A00     // Catch:{ all -> 0x025e }
            r1.A00 = r0     // Catch:{ all -> 0x025e }
            X.7gq r0 = r10.A01     // Catch:{ all -> 0x025e }
            r1.A01 = r0     // Catch:{ all -> 0x025e }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x025e }
            r0.<init>(r11)     // Catch:{ all -> 0x025e }
            r1.A03 = r0     // Catch:{ all -> 0x025e }
            r11.A02 = r1     // Catch:{ all -> 0x025e }
            r3 = r20
            if (r20 == 0) goto L_0x004f
            int r0 = r3.A00     // Catch:{ all -> 0x025e }
            r11.A00 = r0     // Catch:{ all -> 0x025e }
        L_0x004f:
            boolean r0 = r11 instanceof X.C337767gs     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0055
            r4 = 1
            goto L_0x0056
        L_0x0055:
            r4 = 0
        L_0x0056:
            if (r20 == 0) goto L_0x0063
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x025e }
            java.lang.Class r0 = r11.getClass()     // Catch:{ all -> 0x025e }
            r1.equals(r0)     // Catch:{ all -> 0x025e }
        L_0x0063:
            java.lang.String r0 = r11.A03     // Catch:{ all -> 0x025e }
            r9 = r24
            java.lang.Object r2 = r9.get(r0)     // Catch:{ all -> 0x025e }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x025e }
            if (r2 == 0) goto L_0x009d
            int r1 = r2.size()     // Catch:{ all -> 0x025e }
            r0 = 0
            if (r0 >= r1) goto L_0x0081
            r2.get(r0)     // Catch:{ all -> 0x025e }
            java.lang.String r0 = "applyStateUpdate"
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x025e }
            r1.<init>(r0)     // Catch:{ all -> 0x025e }
        L_0x0080:
            throw r1     // Catch:{ all -> 0x025e }
        L_0x0081:
            int r0 = r2.size()     // Catch:{ all -> 0x025e }
            long r1 = (long) r0     // Catch:{ all -> 0x025e }
            java.util.concurrent.atomic.AtomicLong r0 = X.C243133Xn.A09     // Catch:{ all -> 0x025e }
            r0.addAndGet(r1)     // Catch:{ all -> 0x025e }
            boolean r0 = r11.A07     // Catch:{ all -> 0x025e }
            if (r0 != 0) goto L_0x009a
            if (r3 == r11) goto L_0x009d
            if (r20 == 0) goto L_0x009a
            boolean r0 = r3.CSo(r11)     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x009a
            goto L_0x009d
        L_0x009a:
            X.C337587ga.A01(r11)     // Catch:{ all -> 0x025e }
        L_0x009d:
            if (r4 != 0) goto L_0x024f
            r16 = 0
            if (r20 == 0) goto L_0x00a4
            goto L_0x00a7
        L_0x00a4:
            r8 = r16
            goto L_0x00af
        L_0x00a7:
            boolean r0 = r3 instanceof X.C337767gs     // Catch:{ all -> 0x025e }
            if (r0 != 0) goto L_0x00a4
            java.util.HashMap r8 = X.C337587ga.A00(r3)     // Catch:{ all -> 0x025e }
        L_0x00af:
            X.2VJ r7 = r10.A07     // Catch:{ all -> 0x025e }
            r10.A07 = r7     // Catch:{ all -> 0x025e }
            X.7gX r6 = r11.A02     // Catch:{ all -> 0x025e }
            boolean r0 = r11 instanceof X.C337577gZ     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x00dc
            r0 = r11
            X.7gZ r0 = (X.C337577gZ) r0     // Catch:{ all -> 0x025e }
            X.0sP r1 = r0.A01     // Catch:{ all -> 0x025e }
            r0 = 0
            X.0qQ.A0B(r6, r0)     // Catch:{ all -> 0x025e }
            r0 = 1
            X.0qQ.A0B(r1, r0)     // Catch:{ all -> 0x025e }
            java.lang.Object r0 = r1.invoke(r6)     // Catch:{ all -> 0x025e }
            X.7fD r0 = (X.C336807fD) r0     // Catch:{ all -> 0x025e }
            X.7gt r4 = r0.A00     // Catch:{ all -> 0x025e }
            X.0qQ.A07(r4)     // Catch:{ all -> 0x025e }
        L_0x00d1:
            java.util.List r6 = r4.A00     // Catch:{ all -> 0x025e }
        L_0x00d3:
            r11.A05 = r6     // Catch:{ all -> 0x025e }
            int r5 = r6.size()     // Catch:{ all -> 0x025e }
            r4 = 0
            goto L_0x01b3
        L_0x00dc:
            boolean r0 = r11 instanceof X.AnonymousClass9VY     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x01ac
            r0 = r11
            X.9VY r0 = (X.AnonymousClass9VY) r0     // Catch:{ all -> 0x025e }
            X.GFO r2 = r0.A03     // Catch:{ all -> 0x025e }
            r13 = 0
            X.0qQ.A0B(r6, r13)     // Catch:{ all -> 0x025e }
            r5 = 1
            X.0qQ.A0B(r2, r5)     // Catch:{ all -> 0x025e }
            int r1 = r2.A02()     // Catch:{ all -> 0x025e }
            android.content.Context r0 = r6.A0C     // Catch:{ all -> 0x025e }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x025e }
            int r4 = X.C61380mr.A01(r0, r1)     // Catch:{ all -> 0x025e }
            java.util.List r3 = r2.A0J     // Catch:{ all -> 0x025e }
            if (r3 == 0) goto L_0x01ac
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x025e }
            r12.<init>()     // Catch:{ all -> 0x025e }
            java.util.Iterator r15 = r3.iterator()     // Catch:{ all -> 0x025e }
        L_0x0107:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0129
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x025e }
            X.1Xj r14 = (X.1Xj) r14     // Catch:{ all -> 0x025e }
            X.1Xy r0 = r14.A0C     // Catch:{ all -> 0x025e }
            com.instagram.model.mediasize.ImageInfo r1 = r0.Am9()     // Catch:{ all -> 0x025e }
            if (r1 == 0) goto L_0x0107
            java.lang.Integer r0 = r14.A2H()     // Catch:{ all -> 0x025e }
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A05(r1, r0, r4)     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0107
            r12.add(r0)     // Catch:{ all -> 0x025e }
            goto L_0x0107
        L_0x0129:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x015a
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x025e }
            r12.<init>()     // Catch:{ all -> 0x025e }
            java.util.Iterator r14 = r3.iterator()     // Catch:{ all -> 0x025e }
        L_0x0138:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x015a
            java.lang.Object r3 = r14.next()     // Catch:{ all -> 0x025e }
            X.1Xj r3 = (X.1Xj) r3     // Catch:{ all -> 0x025e }
            X.1Xy r0 = r3.A0C     // Catch:{ all -> 0x025e }
            com.instagram.model.mediasize.ImageInfo r1 = r0.BGO()     // Catch:{ all -> 0x025e }
            if (r1 == 0) goto L_0x0138
            java.lang.Integer r0 = r3.A2H()     // Catch:{ all -> 0x025e }
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.1iI.A05(r1, r0, r4)     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0138
            r12.add(r0)     // Catch:{ all -> 0x025e }
            goto L_0x0138
        L_0x015a:
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x025e }
            if (r0 != 0) goto L_0x01ac
            int r1 = r12.size()     // Catch:{ all -> 0x025e }
            int r0 = r2.A03()     // Catch:{ all -> 0x025e }
            if (r1 != r0) goto L_0x01ac
            X.7gt r4 = new X.7gt     // Catch:{ all -> 0x025e }
            r4.<init>()     // Catch:{ all -> 0x025e }
            X.7gs r3 = new X.7gs     // Catch:{ all -> 0x025e }
            r3.<init>()     // Catch:{ all -> 0x025e }
            java.lang.String r0 = "data"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch:{ all -> 0x025e }
            java.util.BitSet r1 = new java.util.BitSet     // Catch:{ all -> 0x025e }
            r1.<init>(r5)     // Catch:{ all -> 0x025e }
            r1.clear()     // Catch:{ all -> 0x025e }
            r3.A04 = r12     // Catch:{ all -> 0x025e }
            r1.set(r13)     // Catch:{ all -> 0x025e }
            r0 = 1463818325(0x57401855, float:2.11210738E14)
            X.2Sg r0 = X.C337597gb.A02(r6, r0)     // Catch:{ all -> 0x025e }
            r3.A02 = r0     // Catch:{ all -> 0x025e }
            r0 = 947264300(0x38761b2c, float:5.8676276E-5)
            X.2Sg r0 = X.C337597gb.A02(r6, r0)     // Catch:{ all -> 0x025e }
            r3.A01 = r0     // Catch:{ all -> 0x025e }
            r0 = 851046848(0x32b9f1c0, float:2.164677E-8)
            X.2Sg r0 = X.C337597gb.A02(r6, r0)     // Catch:{ all -> 0x025e }
            r3.A00 = r0     // Catch:{ all -> 0x025e }
            java.util.List r0 = r4.A00     // Catch:{ all -> 0x025e }
            X.C337607gc.A00(r1, r2, r5)     // Catch:{ all -> 0x025e }
            r0.add(r3)     // Catch:{ all -> 0x025e }
            goto L_0x00d1
        L_0x01ac:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x025e }
            r6.<init>()     // Catch:{ all -> 0x025e }
            goto L_0x00d3
        L_0x01b3:
            if (r4 >= r5) goto L_0x0249
            java.lang.Object r3 = r6.get(r4)     // Catch:{ all -> 0x025e }
            X.7ga r3 = (X.C337587ga) r3     // Catch:{ all -> 0x025e }
            r3.A01 = r11     // Catch:{ all -> 0x025e }
            java.lang.String r1 = r3.A04     // Catch:{ all -> 0x025e }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x025e }
            if (r0 != 0) goto L_0x0238
            java.lang.String r0 = r11.A03     // Catch:{ all -> 0x025e }
            java.lang.String r14 = X.002.A0R(r0, r1)     // Catch:{ all -> 0x025e }
            X.7gX r13 = r11.A02     // Catch:{ all -> 0x025e }
            X.7ga r1 = r13.A0E()     // Catch:{ all -> 0x025e }
            if (r1 == 0) goto L_0x020d
            X.7gX r0 = r1.A02     // Catch:{ all -> 0x025e }
            X.7gY r0 = r0.A04     // Catch:{ all -> 0x025e }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x025e }
            boolean r0 = r0.contains(r14)     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x020d
            java.lang.String r12 = r3.A09     // Catch:{ all -> 0x025e }
            java.util.Map r0 = r1.A06     // Catch:{ all -> 0x025e }
            if (r0 != 0) goto L_0x01ec
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x025e }
            r0.<init>()     // Catch:{ all -> 0x025e }
            r1.A06 = r0     // Catch:{ all -> 0x025e }
        L_0x01ec:
            boolean r0 = r0.containsKey(r12)     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0217
            java.util.Map r0 = r1.A06     // Catch:{ all -> 0x025e }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x025e }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x025e }
            int r2 = r0.intValue()     // Catch:{ all -> 0x025e }
        L_0x01fe:
            java.util.Map r1 = r1.A06     // Catch:{ all -> 0x025e }
            int r0 = r2 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x025e }
            r1.put(r12, r0)     // Catch:{ all -> 0x025e }
            java.lang.String r14 = X.002.A0O(r14, r2)     // Catch:{ all -> 0x025e }
        L_0x020d:
            r3.A03 = r14     // Catch:{ all -> 0x025e }
            X.7gY r0 = r13.A04     // Catch:{ all -> 0x025e }
            java.util.Set r0 = r0.A00     // Catch:{ all -> 0x025e }
            r0.add(r14)     // Catch:{ all -> 0x025e }
            goto L_0x0219
        L_0x0217:
            r2 = 0
            goto L_0x01fe
        L_0x0219:
            if (r8 == 0) goto L_0x021c
            goto L_0x021f
        L_0x021c:
            r0 = r16
            goto L_0x022d
        L_0x021f:
            java.lang.String r0 = r3.A03     // Catch:{ all -> 0x025e }
            java.lang.Object r0 = r8.get(r0)     // Catch:{ all -> 0x025e }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x021c
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x025e }
            X.7ga r0 = (X.C337587ga) r0     // Catch:{ all -> 0x025e }
        L_0x022d:
            r20 = r0
            r21 = r3
            A07(r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x025e }
            int r4 = r4 + 1
            goto L_0x01b3
        L_0x0238:
            java.lang.String r2 = "Your Section "
            java.lang.String r1 = r3.A09     // Catch:{ all -> 0x025e }
            java.lang.String r0 = " has an empty key. Please specify a key."
            java.lang.String r0 = X.002.A0g(r2, r1, r0)     // Catch:{ all -> 0x025e }
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x025e }
            r1.<init>(r0)     // Catch:{ all -> 0x025e }
            goto L_0x0080
        L_0x0249:
            X.2VJ r0 = r10.A07     // Catch:{ all -> 0x025e }
            if (r0 == r7) goto L_0x024f
            r10.A07 = r7     // Catch:{ all -> 0x025e }
        L_0x024f:
            if (r18 == 0) goto L_0x0254
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0254:
            if (r17 == 0) goto L_0x025d
            int r0 = r17.intValue()
            X.2SN.A02(r0)
        L_0x025d:
            return
        L_0x025e:
            r1 = move-exception
            if (r18 == 0) goto L_0x0264
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0264:
            if (r17 == 0) goto L_0x026d
            int r0 = r17.intValue()
            X.2SN.A02(r0)
        L_0x026d:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337657gh.A07(X.7gi, X.7ga, X.7ga, X.7gX, java.lang.String, java.util.Map):void");
    }

    private void A08(C337587ga r5) {
        this.A0G.A01(r5.A02, r5, r5.A03);
        if (!(r5 instanceof C337767gs)) {
            List list = r5.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A08((C337587ga) list.get(i));
            }
        }
    }

    private void A09(C337587ga r5) {
        if (!(r5 instanceof C337767gs)) {
            List list = r5.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A09((C337587ga) list.get(i));
            }
        }
    }

    private void A0A(C337587ga r5) {
        if (!(r5 instanceof C337767gs)) {
            List list = r5.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A0A((C337587ga) list.get(i));
            }
        }
    }

    public static void A0C(C337587ga r3, C337657gh r4) {
        C62320sa r0;
        if ((r3 instanceof C337577gZ) && (r0 = ((C337577gZ) r3).A00) != null) {
            r0.invoke();
        }
        if (!(r3 instanceof C337767gs)) {
            List list = r3.A05;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                A0C((C337587ga) list.get(i), r4);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.7gP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: X.7gP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: X.7gP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: X.7gP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: X.7gP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: X.7gP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: X.7gP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: X.7gP} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        if (r4 == 1) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0D(X.C337587ga r14, X.C337657gh r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            java.util.Map r10 = r15.A0K
            r6 = r14
            java.lang.String r0 = r14.A03
            java.lang.Object r9 = r10.get(r0)
            X.7gP r9 = (X.C337477gP) r9
            int r7 = r14.A00
            r8 = 1
            r3 = r16
            r2 = r17
            r1 = r18
            r0 = r19
            r4 = r20
            if (r9 != 0) goto L_0x00a5
            X.7gP r9 = new X.7gP
            r9.<init>()
            java.lang.String r5 = r14.A03
            r10.put(r5, r9)
        L_0x0024:
            r9.A03 = r2
            r9.A01 = r3
            r9.A00 = r1
            r9.A02 = r0
            r9.A04 = r7
            boolean r5 = r14 instanceof X.C337577gZ
            if (r5 == 0) goto L_0x0050
            r5 = r6
            X.7gZ r5 = (X.C337577gZ) r5
            X.0sI r8 = r5.A02
            if (r8 == 0) goto L_0x0050
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r8.invoke(r9, r10, r11, r12, r13)
        L_0x0050:
            boolean r5 = r14 instanceof X.C337767gs
            if (r5 != 0) goto L_0x00bb
            java.util.List r9 = r14.A05
            int r8 = r9.size()
            r13 = 0
            r7 = 0
        L_0x005c:
            if (r7 >= r8) goto L_0x00bb
            java.lang.Object r14 = r9.get(r7)
            X.7ga r14 = (X.C337587ga) r14
            int r12 = r3 - r13
            int r11 = r2 - r13
            int r10 = r1 - r13
            int r6 = r0 - r13
            int r5 = r14.A00
            r19 = -1
            if (r12 >= r5) goto L_0x00a0
            if (r11 < 0) goto L_0x00a0
            r5 = 0
            int r16 = java.lang.Math.max(r12, r5)
            int r5 = r14.A00
            int r5 = r5 + -1
            int r17 = java.lang.Math.min(r11, r5)
        L_0x0081:
            int r5 = r14.A00
            if (r10 >= r5) goto L_0x009d
            if (r6 < 0) goto L_0x009d
            r5 = 0
            int r18 = java.lang.Math.max(r10, r5)
            int r5 = r14.A00
            int r5 = r5 + -1
            int r19 = java.lang.Math.min(r6, r5)
        L_0x0094:
            int r5 = r14.A00
            int r13 = r13 + r5
            A0D(r14, r15, r16, r17, r18, r19, r20)
            int r7 = r7 + 1
            goto L_0x005c
        L_0x009d:
            r18 = -1
            goto L_0x0094
        L_0x00a0:
            r16 = -1
            r17 = -1
            goto L_0x0081
        L_0x00a5:
            int r5 = r9.A01
            if (r5 != r3) goto L_0x0024
            int r5 = r9.A03
            if (r5 != r2) goto L_0x0024
            int r5 = r9.A00
            if (r5 != r1) goto L_0x0024
            int r5 = r9.A02
            if (r5 != r0) goto L_0x0024
            int r5 = r9.A04
            if (r5 != r7) goto L_0x0024
            if (r4 == r8) goto L_0x0024
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337657gh.A0D(X.7ga, X.7gh, int, int, int, int, int):void");
    }

    private void A0E(C337587ga r17, List list) {
        Integer A012;
        C337587ga r12;
        boolean isTracing = ComponentsSystrace.A00.isTracing();
        if (isTracing) {
            ComponentsSystrace.A02("applyChangeSetToTarget");
        }
        ArrayList arrayList = new ArrayList();
        try {
            A012 = 2SN.A01("Section.ApplyChangeSet");
            if (A012 != null) {
                2SN.A06("Section.ApplyChangeSet", String.valueOf(-1), C41692Ayj.A00, A012.intValue());
            }
            r12 = r17;
            List list2 = list;
            int size = list2.size();
            int i = 0;
            boolean z = false;
            while (true) {
                if (i < size) {
                    C337797gv r8 = (C337797gv) list2.get(i);
                    if (r8.A03.size() > 0) {
                        int size2 = r8.A03.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            C337897h5 r0 = (C337897h5) r8.A03.get(i2);
                            switch (r0.A03) {
                                case -3:
                                    this.A0H.AOZ(r0.A01, r0.A00);
                                    break;
                                case -2:
                                    this.A0H.FLK(r0.A07, r0.A01, r0.A00);
                                    break;
                                case -1:
                                    this.A0H.CNW(r0.A07, r0.A01, r0.A00);
                                    break;
                                case 0:
                                    this.A0H.Coc(r0.A01, r0.A02);
                                    break;
                                case 1:
                                    this.A0H.CNR(r0.A04, r0.A01);
                                    break;
                                case 2:
                                    this.A0H.FJV(r0.A04, r0.A01);
                                    break;
                                case 3:
                                    this.A0H.AOO(r0.A01);
                                    break;
                            }
                            z = true;
                        }
                        this.A0H.A01();
                    }
                    arrayList.addAll(r8.A03);
                    i++;
                } else {
                    if (A012 != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("section", r12.A09);
                        hashMap.put("size", Integer.valueOf(arrayList.size()));
                        2SN.A03(A012.intValue(), hashMap);
                    }
                    this.A0H.Crl(new C337917h7(new C337907h6(arrayList), r12, this, z, isTracing), z);
                    if (isTracing) {
                        ComponentsSystrace.A01();
                        return;
                    }
                    return;
                }
            }
        } catch (Throwable th) {
            if (isTracing) {
                ComponentsSystrace.A01();
            }
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [java.lang.Runnable, X.7d5] */
    /* JADX WARNING: type inference failed for: r0v75, types: [X.9dA, java.lang.Runnable] */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x016c, code lost:
        if (r12 != r7) goto L_0x016e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x028a, code lost:
        if (r5 == false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0373, code lost:
        if (r15 == false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:?, code lost:
        com.facebook.litho.ComponentsSystrace.A01();
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x01ce A[Catch:{ all -> 0x02a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x029b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0G(X.C337657gh r28, java.lang.String r29, int r30) {
        /*
            r9 = r29
            r10 = 0
            r11 = r28
            if (r29 != 0) goto L_0x0009
            java.lang.String r9 = r11.A0D
        L_0x0009:
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r21 = r0.isTracing()
            r4 = r30
            if (r21 == 0) goto L_0x0043
            if (r9 == 0) goto L_0x001e
            java.lang.String r0 = "extra:"
            java.lang.String r0 = X.002.A0R(r0, r9)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x001e:
            monitor-enter(r11)
            X.7ga r0 = r11.A03     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0027
            java.lang.String r2 = r0.A09     // Catch:{ all -> 0x002a }
        L_0x0025:
            monitor-exit(r11)     // Catch:{ all -> 0x002a }
            goto L_0x002d
        L_0x0027:
            java.lang.String r2 = "<null>"
            goto L_0x0025
        L_0x002a:
            r3 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x002a }
            throw r3
        L_0x002d:
            java.lang.String r1 = "_applyNewChangeSet_"
            r0 = -1
            if (r4 == r0) goto L_0x0068
            if (r30 == 0) goto L_0x0065
            r0 = 1
            if (r4 == r0) goto L_0x0062
            r0 = 2
            if (r4 == r0) goto L_0x005f
            java.lang.String r0 = "updateStateAsync"
        L_0x003c:
            java.lang.String r0 = X.002.A0g(r2, r1, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0043:
            java.lang.String r3 = "Section.CalculateChangeSet"
            java.lang.Integer r20 = X.2SN.A01(r3)
            if (r20 == 0) goto L_0x0059
            int r2 = r20.intValue()
            java.lang.String r1 = "-1"
            X.AuT r0 = new X.AuT
            r0.<init>(r11, r4)
            X.2SN.A06(r3, r1, r0, r2)
        L_0x0059:
            boolean r0 = X.C338337hn.A00
            if (r0 == 0) goto L_0x0073
            monitor-enter(r11)
            goto L_0x006b
        L_0x005f:
            java.lang.String r0 = "updateState"
            goto L_0x003c
        L_0x0062:
            java.lang.String r0 = "setRootAsync"
            goto L_0x003c
        L_0x0065:
            java.lang.String r0 = "setRoot"
            goto L_0x003c
        L_0x0068:
            java.lang.String r0 = "none"
            goto L_0x003c
        L_0x006b:
            monitor-exit(r11)     // Catch:{ all -> 0x0070 }
            r11.hashCode()
            goto L_0x0073
        L_0x0070:
            r3 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0070 }
            throw r3
        L_0x0073:
            monitor-enter(r11)     // Catch:{ all -> 0x03b3 }
            X.7ga r0 = r11.A02     // Catch:{ all -> 0x03ac }
            r8 = 1
            if (r0 == 0) goto L_0x0094
            X.7ga r7 = r0.A04(r8)     // Catch:{ all -> 0x03ac }
        L_0x007d:
            X.7ga r0 = r11.A03     // Catch:{ all -> 0x03ac }
            r6 = 0
            if (r0 == 0) goto L_0x0092
            X.7ga r5 = r0.A04(r6)     // Catch:{ all -> 0x03ac }
        L_0x0086:
            X.7gX r4 = r11.A0J     // Catch:{ all -> 0x03ac }
            X.7gm r3 = r11.A04     // Catch:{ all -> 0x03ac }
            X.7gm r2 = X.C337707gm.A00(r3)     // Catch:{ all -> 0x03ac }
            r11.A07 = r8     // Catch:{ all -> 0x03ac }
            monitor-exit(r11)     // Catch:{ all -> 0x03ac }
            goto L_0x0096
        L_0x0092:
            r5 = 0
            goto L_0x0086
        L_0x0094:
            r7 = 0
            goto L_0x007d
        L_0x0096:
            if (r5 == 0) goto L_0x0376
            X.2V9 r0 = r11.A08     // Catch:{ all -> 0x03b3 }
            r0.A00()     // Catch:{ all -> 0x03b3 }
        L_0x009d:
            if (r5 == 0) goto L_0x0376
            if (r21 == 0) goto L_0x00a6
            java.lang.String r0 = "calculateNewChangeSet"
            com.facebook.litho.ComponentsSystrace.A02(r0)     // Catch:{ all -> 0x03b3 }
        L_0x00a6:
            X.0qQ.A0B(r4, r6)     // Catch:{ all -> 0x03b3 }
            X.7gX r1 = new X.7gX     // Catch:{ all -> 0x03b3 }
            r1.<init>(r4)     // Catch:{ all -> 0x03b3 }
            X.7gh r0 = r4.A02     // Catch:{ all -> 0x03b3 }
            r1.A02 = r0     // Catch:{ all -> 0x03b3 }
            X.2Sg r0 = r4.A00     // Catch:{ all -> 0x03b3 }
            r1.A00 = r0     // Catch:{ all -> 0x03b3 }
            X.7gq r0 = new X.7gq     // Catch:{ all -> 0x03b3 }
            r0.<init>()     // Catch:{ all -> 0x03b3 }
            r1.A01 = r0     // Catch:{ all -> 0x03b3 }
            java.util.Map r14 = r2.A00     // Catch:{ all -> 0x03b3 }
            X.7gi r12 = r11.A0I     // Catch:{ all -> 0x03b3 }
            java.lang.String r0 = r11.A0D     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = r5.A04     // Catch:{ all -> 0x03b3 }
            r5.A03 = r13     // Catch:{ all -> 0x03b3 }
            X.3kJ r13 = com.facebook.litho.ComponentsSystrace.A00     // Catch:{ all -> 0x03b3 }
            boolean r15 = r13.isTracing()     // Catch:{ all -> 0x03b3 }
            if (r15 == 0) goto L_0x00d4
            java.lang.String r13 = "createTree"
            com.facebook.litho.ComponentsSystrace.A02(r13)     // Catch:{ all -> 0x03b3 }
        L_0x00d4:
            r22 = r12
            r23 = r7
            r24 = r5
            r25 = r1
            r26 = r0
            r27 = r14
            A07(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0372 }
            if (r15 == 0) goto L_0x00ed
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x03b3 }
            java.lang.String r13 = "ChangeSetState.generateChangeSet"
            com.facebook.litho.ComponentsSystrace.A02(r13)     // Catch:{ all -> 0x03b3 }
        L_0x00ed:
            java.lang.String r27 = ""
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ all -> 0x0372 }
            r19.<init>()     // Catch:{ all -> 0x0372 }
            if (r7 == 0) goto L_0x0123
            java.lang.String r14 = r7.A09     // Catch:{ all -> 0x0372 }
            java.lang.String r13 = r5.A09     // Catch:{ all -> 0x0372 }
            boolean r13 = r14.equals(r13)     // Catch:{ all -> 0x0372 }
            if (r13 != 0) goto L_0x0123
            java.lang.Thread r14 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0372 }
            java.lang.String r29 = r14.getName()     // Catch:{ all -> 0x0372 }
            r24 = r10
            r28 = r27
            r30 = r19
            X.7gv r13 = X.C337787gu.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0372 }
            java.lang.String r29 = r14.getName()     // Catch:{ all -> 0x0372 }
            r23 = r10
            r24 = r5
            X.7gv r0 = X.C337787gu.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0372 }
            X.7gv r14 = X.C337797gv.A00(r13, r0)     // Catch:{ all -> 0x0372 }
            goto L_0x0133
        L_0x0123:
            java.lang.Thread r13 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0372 }
            java.lang.String r29 = r13.getName()     // Catch:{ all -> 0x0372 }
            r28 = r27
            r30 = r19
            X.7gv r14 = X.C337787gu.A00(r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0372 }
        L_0x0133:
            r12 = 0
            if (r7 == 0) goto L_0x013a
            int r0 = r7.A00     // Catch:{ all -> 0x0372 }
            if (r0 < 0) goto L_0x02a7
        L_0x013a:
            int r0 = r5.A00     // Catch:{ all -> 0x0372 }
            if (r0 < 0) goto L_0x02a7
            if (r15 == 0) goto L_0x0143
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x03b3 }
        L_0x0143:
            if (r21 == 0) goto L_0x0148
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x03b3 }
        L_0x0148:
            monitor-enter(r11)     // Catch:{ all -> 0x03b3 }
            r13 = 0
            if (r7 == 0) goto L_0x014d
            r13 = 1
        L_0x014d:
            X.7ga r12 = r11.A02     // Catch:{ all -> 0x02a3 }
            r0 = 0
            if (r12 == 0) goto L_0x0153
            r0 = 1
        L_0x0153:
            if (r13 == 0) goto L_0x015c
            if (r0 == 0) goto L_0x0162
            int r7 = r7.A08     // Catch:{ all -> 0x02a3 }
            int r0 = r12.A08     // Catch:{ all -> 0x02a3 }
            goto L_0x0160
        L_0x015c:
            if (r0 != 0) goto L_0x0162
        L_0x015e:
            r13 = 1
            goto L_0x0163
        L_0x0160:
            if (r7 == r0) goto L_0x015e
        L_0x0162:
            r13 = 0
        L_0x0163:
            X.7ga r0 = r11.A03     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x016e
            int r12 = r5.A08     // Catch:{ all -> 0x02a3 }
            int r7 = r0.A08     // Catch:{ all -> 0x02a3 }
            r0 = 1
            if (r12 == r7) goto L_0x016f
        L_0x016e:
            r0 = 0
        L_0x016f:
            if (r13 == 0) goto L_0x01be
            if (r0 == 0) goto L_0x01be
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0284 }
            java.util.Map r15 = r3.A01     // Catch:{ all -> 0x0284 }
            boolean r0 = r0.equals(r15)     // Catch:{ all -> 0x0284 }
            if (r0 == 0) goto L_0x01be
            r18 = 1
            X.7ga r13 = r11.A02     // Catch:{ all -> 0x02a3 }
            r11.A02 = r5     // Catch:{ all -> 0x02a3 }
            r11.A03 = r10     // Catch:{ all -> 0x02a3 }
            r11.A07 = r6     // Catch:{ all -> 0x02a3 }
            r11.A00 = r6     // Catch:{ all -> 0x02a3 }
            java.util.Map r12 = r2.A00     // Catch:{ all -> 0x02a3 }
            boolean r0 = r12.isEmpty()     // Catch:{ all -> 0x02a3 }
            if (r0 != 0) goto L_0x01b6
            java.util.Set r0 = r12.keySet()     // Catch:{ all -> 0x02a3 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x02a3 }
        L_0x0199:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r7 = r17.next()     // Catch:{ all -> 0x02a3 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x02a3 }
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x02a3 }
            boolean r16 = r0.containsKey(r7)     // Catch:{ all -> 0x02a3 }
            if (r16 == 0) goto L_0x01b6
            X.C337707gm.A01(r0, r12, r7)     // Catch:{ all -> 0x02a3 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x02a3 }
            X.C337707gm.A01(r15, r0, r7)     // Catch:{ all -> 0x02a3 }
            goto L_0x0199
        L_0x01b6:
            java.util.List r0 = r11.A06     // Catch:{ all -> 0x02a3 }
            r0.add(r14)     // Catch:{ all -> 0x02a3 }
            if (r13 == 0) goto L_0x01c5
            goto L_0x01c2
        L_0x01be:
            r18 = 0
            r5 = r10
            goto L_0x01c8
        L_0x01c2:
            r11.A0A(r13)     // Catch:{ all -> 0x02a3 }
        L_0x01c5:
            r11.A0B(r5)     // Catch:{ all -> 0x02a3 }
        L_0x01c8:
            X.7gq r7 = r1.A01     // Catch:{ all -> 0x02a3 }
            X.7gr r0 = r7.A00     // Catch:{ all -> 0x02a3 }
            if (r0 == 0) goto L_0x029b
            java.util.ArrayList r1 = r0.A00     // Catch:{ all -> 0x02a3 }
            r7.A00 = r10     // Catch:{ all -> 0x02a3 }
            monitor-exit(r11)     // Catch:{ all -> 0x02a3 }
            if (r18 == 0) goto L_0x0255
            X.2V8 r0 = r11.A0G     // Catch:{ all -> 0x03b3 }
            r0.A02(r1)     // Catch:{ all -> 0x03b3 }
            if (r5 == 0) goto L_0x01df
            r11.A08(r5)     // Catch:{ all -> 0x03b3 }
        L_0x01df:
            r0.A00()     // Catch:{ all -> 0x03b3 }
            int r7 = r19.size()     // Catch:{ all -> 0x03b3 }
            r5 = 0
        L_0x01e7:
            if (r5 >= r7) goto L_0x01fb
            r0 = r19
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x03b3 }
            X.7ga r0 = (X.C337587ga) r0     // Catch:{ all -> 0x03b3 }
            java.util.Map r1 = r11.A0K     // Catch:{ all -> 0x03b3 }
            java.lang.String r0 = r0.A03     // Catch:{ all -> 0x03b3 }
            r1.remove(r0)     // Catch:{ all -> 0x03b3 }
            int r5 = r5 + 1
            goto L_0x01e7
        L_0x01fb:
            boolean r0 = r11.A0F     // Catch:{ all -> 0x03b3 }
            if (r0 == 0) goto L_0x022d
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00     // Catch:{ all -> 0x03b3 }
            boolean r5 = r0.isTracing()     // Catch:{ all -> 0x03b3 }
            if (r5 == 0) goto L_0x020c
            java.lang.String r0 = "applyChangeSetsToTargetBackgroundAllowed"
            com.facebook.litho.ComponentsSystrace.A02(r0)     // Catch:{ all -> 0x03b3 }
        L_0x020c:
            monitor-enter(r11)     // Catch:{ all -> 0x0289 }
            X.7ga r1 = r11.A02     // Catch:{ all -> 0x0286 }
            java.util.List r0 = r11.A06     // Catch:{ all -> 0x0286 }
            r11.A0E(r1, r0)     // Catch:{ all -> 0x0286 }
            r0.clear()     // Catch:{ all -> 0x0286 }
            monitor-exit(r11)     // Catch:{ all -> 0x0286 }
            boolean r0 = X.AnonymousClass2VL.A01()     // Catch:{ all -> 0x0289 }
            if (r0 != 0) goto L_0x022a
            X.2Ss r1 = r11.A0C     // Catch:{ all -> 0x0289 }
            X.9dA r0 = new X.9dA     // Catch:{ all -> 0x0289 }
            r0.<init>(r11)     // Catch:{ all -> 0x0289 }
            X.2Sr r1 = (X.C70592Sr) r1     // Catch:{ all -> 0x0289 }
            r1.post(r0)     // Catch:{ all -> 0x0289 }
        L_0x022a:
            if (r5 == 0) goto L_0x0255
            goto L_0x0252
        L_0x022d:
            boolean r0 = X.AnonymousClass2VL.A01()     // Catch:{ all -> 0x03b3 }
            if (r0 == 0) goto L_0x0237
            A0F(r11)     // Catch:{ IndexOutOfBoundsException -> 0x028e }
            goto L_0x0255
        L_0x0237:
            X.2Ss r5 = r11.A0C     // Catch:{ all -> 0x03b3 }
            X.7d5 r1 = new X.7d5     // Catch:{ all -> 0x03b3 }
            r1.<init>(r11)     // Catch:{ all -> 0x03b3 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0E     // Catch:{ all -> 0x03b3 }
            boolean r0 = r0.compareAndSet(r8, r6)     // Catch:{ all -> 0x03b3 }
            if (r0 == 0) goto L_0x024c
            X.2Sr r5 = (X.C70592Sr) r5     // Catch:{ all -> 0x03b3 }
            r5.postAtFrontOfQueue(r1)     // Catch:{ all -> 0x03b3 }
            goto L_0x0255
        L_0x024c:
            X.2Sr r5 = (X.C70592Sr) r5     // Catch:{ all -> 0x03b3 }
            r5.post(r1)     // Catch:{ all -> 0x03b3 }
            goto L_0x0255
        L_0x0252:
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x03b3 }
        L_0x0255:
            monitor-enter(r11)     // Catch:{ all -> 0x03b3 }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x0297 }
            r0.clear()     // Catch:{ all -> 0x0297 }
            java.util.Map r0 = r2.A01     // Catch:{ all -> 0x0297 }
            r0.clear()     // Catch:{ all -> 0x0297 }
            X.7ga r0 = r11.A02     // Catch:{ all -> 0x0297 }
            if (r0 == 0) goto L_0x0271
            X.7ga r7 = r0.A04(r8)     // Catch:{ all -> 0x0297 }
        L_0x0268:
            X.7ga r0 = r11.A03     // Catch:{ all -> 0x0297 }
            if (r0 == 0) goto L_0x027c
            X.7ga r5 = r0.A04(r6)     // Catch:{ all -> 0x0297 }
            goto L_0x0273
        L_0x0271:
            r7 = 0
            goto L_0x0268
        L_0x0273:
            if (r5 == 0) goto L_0x027d
            X.7gm r2 = X.C337707gm.A00(r3)     // Catch:{ all -> 0x0297 }
            r11.A07 = r8     // Catch:{ all -> 0x0297 }
            goto L_0x0281
        L_0x027c:
            r5 = 0
        L_0x027d:
            r11.A07 = r6     // Catch:{ all -> 0x0297 }
            r11.A00 = r6     // Catch:{ all -> 0x0297 }
        L_0x0281:
            monitor-exit(r11)     // Catch:{ all -> 0x0297 }
            goto L_0x009d
        L_0x0284:
            r1 = move-exception
            goto L_0x02a2
        L_0x0286:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0286 }
            throw r0     // Catch:{ all -> 0x0289 }
        L_0x0289:
            r0 = move-exception
            if (r5 == 0) goto L_0x03b2
            goto L_0x03af
        L_0x028e:
            r1 = move-exception
            X.7ga r0 = r11.A02     // Catch:{ all -> 0x03b3 }
            java.lang.RuntimeException r0 = A03(r0, r11, r1)     // Catch:{ all -> 0x03b3 }
            goto L_0x03b2
        L_0x0297:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0297 }
            goto L_0x03b2
        L_0x029b:
            java.lang.String r0 = "Trying to use inactive ChangeSetCalculationState!"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x02a3 }
            r1.<init>(r0)     // Catch:{ all -> 0x02a3 }
        L_0x02a2:
            throw r1     // Catch:{ all -> 0x02a3 }
        L_0x02a3:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x02a3 }
            goto L_0x03b2
        L_0x02a7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r2.<init>()     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = "ChangeSet count is below 0! "
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = "Current section: "
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = "null; "
            java.lang.String r3 = "; "
            java.lang.String r4 = ", childrenSize="
            java.lang.String r6 = ", count="
            java.lang.String r8 = " , key="
            if (r7 == 0) goto L_0x02ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r1.<init>()     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r7.A09     // Catch:{ all -> 0x0372 }
            r1.append(r0)     // Catch:{ all -> 0x0372 }
            r1.append(r8)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x0372 }
            r1.append(r0)     // Catch:{ all -> 0x0372 }
            r1.append(r6)     // Catch:{ all -> 0x0372 }
            int r0 = r7.A00     // Catch:{ all -> 0x0372 }
            r1.append(r0)     // Catch:{ all -> 0x0372 }
            r1.append(r4)     // Catch:{ all -> 0x0372 }
            java.util.List r0 = r7.A05     // Catch:{ all -> 0x0372 }
            int r0 = r0.size()     // Catch:{ all -> 0x0372 }
            r1.append(r0)     // Catch:{ all -> 0x0372 }
            r1.append(r3)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0372 }
        L_0x02ef:
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = "Next section: "
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r1.<init>()     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r5.A09     // Catch:{ all -> 0x0372 }
            r1.append(r0)     // Catch:{ all -> 0x0372 }
            r1.append(r8)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r5.A03     // Catch:{ all -> 0x0372 }
            r1.append(r0)     // Catch:{ all -> 0x0372 }
            r1.append(r6)     // Catch:{ all -> 0x0372 }
            int r0 = r5.A00     // Catch:{ all -> 0x0372 }
            r1.append(r0)     // Catch:{ all -> 0x0372 }
            r1.append(r4)     // Catch:{ all -> 0x0372 }
            java.util.List r0 = r5.A05     // Catch:{ all -> 0x0372 }
            int r0 = r0.size()     // Catch:{ all -> 0x0372 }
            r1.append(r0)     // Catch:{ all -> 0x0372 }
            r1.append(r3)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0372 }
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = "Changes: ["
            r2.append(r0)     // Catch:{ all -> 0x0372 }
        L_0x032c:
            int r0 = r14.A00     // Catch:{ all -> 0x0372 }
            if (r12 >= r0) goto L_0x0363
            java.util.List r0 = r14.A03     // Catch:{ all -> 0x0372 }
            java.lang.Object r4 = r0.get(r12)     // Catch:{ all -> 0x0372 }
            X.7h5 r4 = (X.C337897h5) r4     // Catch:{ all -> 0x0372 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0372 }
            r3.<init>()     // Catch:{ all -> 0x0372 }
            int r0 = r4.A03     // Catch:{ all -> 0x0372 }
            r3.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = " "
            r3.append(r1)     // Catch:{ all -> 0x0372 }
            int r0 = r4.A01     // Catch:{ all -> 0x0372 }
            r3.append(r0)     // Catch:{ all -> 0x0372 }
            r3.append(r1)     // Catch:{ all -> 0x0372 }
            int r0 = r4.A02     // Catch:{ all -> 0x0372 }
            r3.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0372 }
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r0 = ", "
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            int r12 = r12 + 1
            goto L_0x032c
        L_0x0363:
            java.lang.String r0 = "]"
            r2.append(r0)     // Catch:{ all -> 0x0372 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0372 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0372 }
            r0.<init>(r1)     // Catch:{ all -> 0x0372 }
            throw r0     // Catch:{ all -> 0x0372 }
        L_0x0372:
            r0 = move-exception
            if (r15 == 0) goto L_0x03b2
            goto L_0x03af
        L_0x0376:
            X.2VJ r2 = r4.A07     // Catch:{ all -> 0x03b3 }
            if (r2 == 0) goto L_0x0386
            java.lang.Class<X.ABf> r0 = X.C39834ABf.class
            X.9Of r1 = new X.9Of     // Catch:{ all -> 0x03b3 }
            r1.<init>(r0)     // Catch:{ all -> 0x03b3 }
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x03b3 }
            r0.get(r1)     // Catch:{ all -> 0x03b3 }
        L_0x0386:
            if (r21 == 0) goto L_0x0390
            com.facebook.litho.ComponentsSystrace.A01()
            if (r9 == 0) goto L_0x0390
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x0390:
            if (r20 == 0) goto L_0x0399
            int r0 = r20.intValue()
            X.2SN.A02(r0)
        L_0x0399:
            java.util.concurrent.atomic.AtomicLong r0 = X.C243133Xn.A0A
            r1 = 1
            r0.addAndGet(r1)
            boolean r0 = X.AnonymousClass2VL.A01()
            if (r0 == 0) goto L_0x03ab
            java.util.concurrent.atomic.AtomicLong r0 = X.C243133Xn.A0B
            r0.addAndGet(r1)
        L_0x03ab:
            return
        L_0x03ac:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x03ac }
            goto L_0x03b2
        L_0x03af:
            com.facebook.litho.ComponentsSystrace.A01()     // Catch:{ all -> 0x03b3 }
        L_0x03b2:
            throw r0     // Catch:{ all -> 0x03b3 }
        L_0x03b3:
            r3 = move-exception
            if (r21 == 0) goto L_0x03be
            com.facebook.litho.ComponentsSystrace.A01()
            if (r9 == 0) goto L_0x03be
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x03be:
            if (r20 == 0) goto L_0x03c7
            int r0 = r20.intValue()
            X.2SN.A02(r0)
        L_0x03c7:
            java.util.concurrent.atomic.AtomicLong r0 = X.C243133Xn.A0A
            r1 = 1
            r0.addAndGet(r1)
            boolean r0 = X.AnonymousClass2VL.A01()
            if (r0 == 0) goto L_0x03d9
            java.util.concurrent.atomic.AtomicLong r0 = X.C243133Xn.A0B
            r0.addAndGet(r1)
        L_0x03d9:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C337657gh.A0G(X.7gh, java.lang.String, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.2V9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.2Ss, android.os.Handler] */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.7gi] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.2Ss, android.os.Handler] */
    public C337657gh(C337557gX r7, C337647gg r8, String str) {
        Looper looper;
        Looper mainLooper = Looper.getMainLooper();
        0qQ.A0B(mainLooper, 1);
        ? handler = new Handler(mainLooper);
        this.A0C = handler;
        ? obj = new Object();
        obj.A00 = new HashSet();
        this.A0I = obj;
        this.A0D = str;
        C337677gj r1 = new C337677gj(obj, r8);
        this.A0H = r1;
        this.A0F = r1.A05.Ez4();
        this.A09 = new C337687gk(r1);
        0qQ.A0B(r7, 0);
        C337557gX r12 = new C337557gX(r7);
        r12.A02 = this;
        r12.A00 = new C337697gl(this);
        this.A0J = r12;
        this.A06 = new ArrayList();
        this.A04 = new C337707gm();
        synchronized (C337657gh.class) {
            if (A0L == null) {
                HandlerThread handlerThread = new HandlerThread("SectionChangeSetThread", 0);
                AnonymousClass0fe.A00(handlerThread);
                handlerThread.start();
                A0L = handlerThread.getLooper();
            }
            looper = A0L;
        }
        0qQ.A0B(looper, 1);
        this.A0B = new C337717gn(this, new Handler(looper));
        this.A0A = new C337717gn(this, handler);
        this.A0E = new AtomicBoolean(false);
    }

    public static void A04() {
        if (!AnonymousClass2VL.A01()) {
            throw new RuntimeException(002.A0g("Focus request not called from Main Thread (Current Thread:", Thread.currentThread().getName(), ")"));
        }
    }

    public static void A0F(C337657gh r3) {
        ArrayList arrayList;
        C337587ga r0;
        AnonymousClass2VL.A00();
        if (!r3.A0F) {
            boolean isTracing = ComponentsSystrace.A00.isTracing();
            if (isTracing) {
                ComponentsSystrace.A02("applyChangeSetsToTargetUIThreadOnly");
            }
            try {
                synchronized (r3) {
                    List list = r3.A06;
                    arrayList = new ArrayList(list);
                    list.clear();
                    r0 = r3.A02;
                }
                r3.A0E(r0, arrayList);
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
            } catch (Throwable th) {
                if (isTracing) {
                    ComponentsSystrace.A01();
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("Cannot use UIThread-only variant when background change sets are enabled.");
        }
    }
}
