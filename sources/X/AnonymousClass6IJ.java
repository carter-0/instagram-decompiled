package X;

import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.6IJ  reason: invalid class name */
public final class AnonymousClass6IJ implements AnonymousClass5R9 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass5PL A04;
    public SubcomposeSlotReusePolicy A05;
    public final C285045Pl A06 = new C285045Pl(new Object[16]);
    public final AnonymousClass6IM A07 = new AnonymousClass6IM(this);
    public final AnonymousClass6IK A08 = new AnonymousClass6IK(this);
    public final AnonymousClass5R6 A09;
    public final HashMap A0A = new HashMap();
    public final HashMap A0B = new HashMap();
    public final HashMap A0C = new HashMap();
    public final Map A0D = new LinkedHashMap();
    public final AnonymousClass6IN A0E = new AnonymousClass6IN((Set) null, (DefaultConstructorMarker) null, 1);

    public static final void A01(AnonymousClass6IJ r1, int i, int i2) {
        AnonymousClass5R6 r12 = r1.A09;
        r12.A0J = true;
        r12.A0U(i, i2, 1);
        r12.A0J = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007a, code lost:
        if ((!r5.A0E.isEmpty()) != false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AnonymousClass6IJ r16, boolean r17) {
        /*
            r13 = 0
            r14 = r16
            r14.A02 = r13
            java.util.HashMap r0 = r14.A0B
            r0.clear()
            X.5R6 r15 = r14.A09
            java.util.List r0 = r15.A0G()
            int r12 = r0.size()
            int r0 = r14.A03
            if (r0 == r12) goto L_0x0133
            r14.A03 = r12
            androidx.compose.runtime.snapshots.Snapshot r11 = X.AnonymousClass5PH.A02()
            r10 = 0
            if (r11 == 0) goto L_0x0113
            X.0sP r9 = r11.A05()
        L_0x0025:
            androidx.compose.runtime.snapshots.Snapshot r8 = X.AnonymousClass5PH.A03(r11)
            r7 = 0
        L_0x002a:
            if (r7 >= r12) goto L_0x012b
            java.util.List r0 = r15.A0G()     // Catch:{ all -> 0x0126 }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x0126 }
            X.5R6 r1 = (X.AnonymousClass5R6) r1     // Catch:{ all -> 0x0126 }
            java.util.HashMap r0 = r14.A0A     // Catch:{ all -> 0x0126 }
            java.lang.Object r6 = r0.get(r1)     // Catch:{ all -> 0x0126 }
            X.6JA r6 = (X.AnonymousClass6JA) r6     // Catch:{ all -> 0x0126 }
            if (r6 == 0) goto L_0x010f
            X.5Oz r0 = r6.A00     // Catch:{ all -> 0x0126 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0126 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0126 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x010f
            X.5SI r2 = r1.A0U     // Catch:{ all -> 0x0126 }
            X.5SJ r0 = r2.A0J     // Catch:{ all -> 0x0126 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0126 }
            r0.A09 = r1     // Catch:{ all -> 0x0126 }
            X.5ey r0 = r2.A05     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x005c
            r0.A05 = r1     // Catch:{ all -> 0x0126 }
        L_0x005c:
            if (r17 == 0) goto L_0x0102
            X.5Wp r5 = r6.A01     // Catch:{ all -> 0x0126 }
            if (r5 == 0) goto L_0x00ed
            X.5Wn r5 = (X.AnonymousClass5Wn) r5     // Catch:{ all -> 0x0126 }
            java.lang.Object r4 = r5.A0D     // Catch:{ all -> 0x0126 }
            monitor-enter(r4)     // Catch:{ all -> 0x0126 }
            X.5Wq r0 = r5.A08     // Catch:{ all -> 0x0123 }
            int r1 = r0.A00     // Catch:{ all -> 0x0123 }
            r3 = 1
            r16 = 1
            if (r1 > 0) goto L_0x007c
            r16 = 0
            java.util.Set r1 = r5.A0E     // Catch:{ all -> 0x0123 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0123 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00b2
        L_0x007c:
            java.lang.String r2 = "Compose:deactivate"
            r1 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.0fg.A01(r2, r1)     // Catch:{ all -> 0x0123 }
            java.util.Set r1 = r5.A0E     // Catch:{ all -> 0x011b }
            X.5bv r2 = new X.5bv     // Catch:{ all -> 0x011b }
            r2.<init>(r1)     // Catch:{ all -> 0x011b }
            if (r16 == 0) goto L_0x00a9
            X.5Wm r1 = r5.A04     // Catch:{ all -> 0x011b }
            X.5X4 r0 = r0.A01()     // Catch:{ all -> 0x011b }
            X.AnonymousClass5XN.A01(r2, r0)     // Catch:{ all -> 0x0116 }
            r0.A0P(r3)     // Catch:{ all -> 0x011b }
            X.5Wk r1 = (X.C286455Wk) r1     // Catch:{ all -> 0x011b }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x011b }
            X.5R6 r0 = (X.AnonymousClass5R6) r0     // Catch:{ all -> 0x011b }
            X.4co r0 = r0.A0A     // Catch:{ all -> 0x011b }
            if (r0 == 0) goto L_0x00a6
            r0.DC6()     // Catch:{ all -> 0x011b }
        L_0x00a6:
            r2.A02()     // Catch:{ all -> 0x011b }
        L_0x00a9:
            r2.A01()     // Catch:{ all -> 0x011b }
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)     // Catch:{ all -> 0x0123 }
        L_0x00b2:
            X.5Wr r0 = r5.A0C     // Catch:{ all -> 0x0123 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x0123 }
            r0.A08()     // Catch:{ all -> 0x0123 }
            X.5Wr r0 = r5.A0B     // Catch:{ all -> 0x0123 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x0123 }
            r0.A08()     // Catch:{ all -> 0x0123 }
            X.5Wr r0 = r5.A00     // Catch:{ all -> 0x0123 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x0123 }
            r0.A08()     // Catch:{ all -> 0x0123 }
            X.5Ws r0 = r5.A09     // Catch:{ all -> 0x0123 }
            X.5Wu r0 = r0.A00     // Catch:{ all -> 0x0123 }
            r0.A00()     // Catch:{ all -> 0x0123 }
            X.5Ws r0 = r5.A0A     // Catch:{ all -> 0x0123 }
            X.5Wu r0 = r0.A00     // Catch:{ all -> 0x0123 }
            r0.A00()     // Catch:{ all -> 0x0123 }
            X.5Wx r1 = r5.A05     // Catch:{ all -> 0x0123 }
            X.5Wz r0 = r1.A0Z     // Catch:{ all -> 0x0123 }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x0123 }
            r0.clear()     // Catch:{ all -> 0x0123 }
            java.util.List r0 = r1.A0c     // Catch:{ all -> 0x0123 }
            r0.clear()     // Catch:{ all -> 0x0123 }
            X.5Ws r0 = r1.A0E     // Catch:{ all -> 0x0123 }
            X.5Wu r0 = r0.A00     // Catch:{ all -> 0x0123 }
            r0.A00()     // Catch:{ all -> 0x0123 }
            r1.A0I = r10     // Catch:{ all -> 0x0123 }
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
        L_0x00ed:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0126 }
            X.5Or r1 = X.C284885Or.A00     // Catch:{ all -> 0x0126 }
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r1, r0)     // Catch:{ all -> 0x0126 }
            X.0eM r0 = X.C284905Ot.A01     // Catch:{ all -> 0x0126 }
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = new androidx.compose.runtime.ParcelableSnapshotMutableState     // Catch:{ all -> 0x0126 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0126 }
            r6.A00 = r0     // Catch:{ all -> 0x0126 }
            goto L_0x010b
        L_0x0102:
            X.5Oz r1 = r6.A00     // Catch:{ all -> 0x0126 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0126 }
            r1.Epw(r0)     // Catch:{ all -> 0x0126 }
        L_0x010b:
            X.6IE r0 = X.AnonymousClass6ID.A00     // Catch:{ all -> 0x0126 }
            r6.A02 = r0     // Catch:{ all -> 0x0126 }
        L_0x010f:
            int r7 = r7 + 1
            goto L_0x002a
        L_0x0113:
            r9 = r10
            goto L_0x0025
        L_0x0116:
            r1 = move-exception
            r0.A0P(r13)     // Catch:{ all -> 0x011b }
            throw r1     // Catch:{ all -> 0x011b }
        L_0x011b:
            r1 = move-exception
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)     // Catch:{ all -> 0x0123 }
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0126 }
            throw r0     // Catch:{ all -> 0x0126 }
        L_0x0126:
            r0 = move-exception
            X.AnonymousClass5PH.A06(r11, r8, r9)
            throw r0
        L_0x012b:
            X.AnonymousClass5PH.A06(r11, r8, r9)
            java.util.HashMap r0 = r14.A0C
            r0.clear()
        L_0x0133:
            r14.A05()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6IJ.A03(X.6IJ, boolean):void");
    }

    public final void A06(int i) {
        0sP r4;
        this.A03 = 0;
        AnonymousClass5R6 r9 = this.A09;
        int size = (r9.A0G().size() - this.A02) - 1;
        if (i <= size) {
            AnonymousClass6IN r6 = this.A0E;
            r6.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    Object obj = this.A0A.get(r9.A0G().get(i2));
                    0qQ.A0A(obj);
                    r6.A00.add(((AnonymousClass6JA) obj).A02);
                    if (i2 == size) {
                        break;
                    }
                    i2++;
                }
            }
            this.A05.Bwt(r6);
            Snapshot A022 = AnonymousClass5PH.A02();
            if (A022 != null) {
                r4 = A022.A05();
            } else {
                r4 = null;
            }
            Snapshot A032 = AnonymousClass5PH.A03(A022);
            boolean z = false;
            while (size >= i) {
                try {
                    AnonymousClass5R6 r1 = (AnonymousClass5R6) r9.A0G().get(size);
                    HashMap hashMap = this.A0A;
                    Object obj2 = hashMap.get(r1);
                    0qQ.A0A(obj2);
                    AnonymousClass6JA r12 = (AnonymousClass6JA) obj2;
                    Object obj3 = r12.A02;
                    if (r6.contains(obj3)) {
                        this.A03++;
                        if (((Boolean) r12.A00.getValue()).booleanValue()) {
                            AnonymousClass5SI r11 = r1.A0U;
                            AnonymousClass5SJ r0 = r11.A0J;
                            Integer num = AnonymousClass05K.A0C;
                            r0.A09 = num;
                            C290225ey r02 = r11.A05;
                            if (r02 != null) {
                                r02.A05 = num;
                            }
                            r12.A00.Epw(false);
                            z = true;
                        }
                    } else {
                        r9.A0J = true;
                        hashMap.remove(r1);
                        C286495Wp r03 = r12.A01;
                        if (r03 != null) {
                            r03.dispose();
                        }
                        r9.A0T(size, 1);
                        r9.A0J = false;
                    }
                    this.A0C.remove(obj3);
                    size--;
                } catch (Throwable th) {
                    AnonymousClass5PH.A06(A022, A032, r4);
                    throw th;
                }
            }
            AnonymousClass5PH.A06(A022, A032, r4);
            if (z) {
                AnonymousClass5PH.A05();
            }
        }
        A05();
    }

    public final void D7s() {
        A03(this, true);
    }

    public final void Dfm() {
        A03(this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r1 == -1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass5R6 A00(X.AnonymousClass6IJ r10, java.lang.Object r11) {
        /*
            int r0 = r10.A03
            r4 = 0
            if (r0 == 0) goto L_0x009d
            X.5R6 r7 = r10.A09
            java.util.List r0 = r7.A0G()
            int r9 = r0.size()
            int r0 = r10.A02
            int r9 = r9 - r0
            int r0 = r10.A03
            int r6 = r9 - r0
            r5 = 1
            int r9 = r9 - r5
            r1 = r9
        L_0x0019:
            r8 = -1
            if (r1 < r6) goto L_0x0039
            java.util.List r0 = r7.A0G()
            java.lang.Object r0 = r0.get(r1)
            java.util.HashMap r3 = r10.A0A
            java.lang.Object r0 = r3.get(r0)
            X.0qQ.A0A(r0)
            X.6JA r0 = (X.AnonymousClass6JA) r0
            java.lang.Object r0 = r0.A02
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 == 0) goto L_0x005f
            if (r1 != r8) goto L_0x0065
        L_0x0039:
            if (r9 < r6) goto L_0x009d
            java.util.List r0 = r7.A0G()
            java.lang.Object r0 = r0.get(r9)
            java.util.HashMap r3 = r10.A0A
            java.lang.Object r2 = r3.get(r0)
            X.0qQ.A0A(r2)
            X.6JA r2 = (X.AnonymousClass6JA) r2
            java.lang.Object r1 = r2.A02
            X.6IE r0 = X.AnonymousClass6ID.A00
            if (r1 == r0) goto L_0x0062
            androidx.compose.ui.layout.SubcomposeSlotReusePolicy r0 = r10.A05
            boolean r0 = r0.ACG(r11, r1)
            if (r0 != 0) goto L_0x0062
            int r9 = r9 + -1
            goto L_0x0039
        L_0x005f:
            int r1 = r1 + -1
            goto L_0x0019
        L_0x0062:
            r2.A02 = r11
            r1 = r9
        L_0x0065:
            if (r1 == r8) goto L_0x009d
            if (r1 == r6) goto L_0x006c
            A01(r10, r1, r6)
        L_0x006c:
            int r0 = r10.A03
            int r0 = r0 + -1
            r10.A03 = r0
            java.util.List r0 = r7.A0G()
            java.lang.Object r4 = r0.get(r6)
            X.5R6 r4 = (X.AnonymousClass5R6) r4
            java.lang.Object r3 = r3.get(r4)
            X.0qQ.A0A(r3)
            X.6JA r3 = (X.AnonymousClass6JA) r3
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            X.5Or r1 = X.C284885Or.A00
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>"
            X.0qQ.A0C(r1, r0)
            X.0eM r0 = X.C284905Ot.A01
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = new androidx.compose.runtime.ParcelableSnapshotMutableState
            r0.<init>(r1, r2)
            r3.A00 = r0
            r3.A05 = r5
            r3.A04 = r5
        L_0x009d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6IJ.A00(X.6IJ, java.lang.Object):X.5R6");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.lang.Object, X.6JA] */
    public static final void A02(AnonymousClass6IJ r12, AnonymousClass5R6 r13, Object obj, 0sL r15) {
        boolean z;
        0sP r3;
        Throwable th;
        HashMap hashMap = r12.A0A;
        Object obj2 = hashMap.get(r13);
        Object obj3 = obj2;
        if (obj2 == null) {
            0sL r1 = AnonymousClass6J8.A00;
            ? obj4 = new Object();
            obj4.A02 = obj;
            obj4.A03 = r1;
            obj4.A01 = null;
            C284885Or r14 = C284885Or.A00;
            0qQ.A0C(r14, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
            AnonymousClass0eM r0 = C284905Ot.A01;
            obj4.A00 = new ParcelableSnapshotMutableState(r14, true);
            hashMap.put(r13, obj4);
            obj3 = obj4;
        }
        AnonymousClass6JA r5 = (AnonymousClass6JA) obj3;
        C286495Wp r02 = r5.A01;
        if (r02 != null) {
            AnonymousClass5Wn r03 = (AnonymousClass5Wn) r02;
            synchronized (r03.A0D) {
                z = false;
                if (r03.A00.A00.A01 > 0) {
                    z = true;
                }
            }
        } else {
            z = true;
        }
        if (r5.A03 != r15 || z || r5.A04) {
            r5.A03 = r15;
            Snapshot A022 = AnonymousClass5PH.A02();
            if (A022 != null) {
                r3 = A022.A05();
            } else {
                r3 = null;
            }
            Snapshot A032 = AnonymousClass5PH.A03(A022);
            try {
                AnonymousClass5R6 r6 = r12.A09;
                r6.A0J = true;
                0sL r10 = r5.A03;
                C286495Wp r8 = r5.A01;
                AnonymousClass5PL r7 = r12.A04;
                if (r7 != null) {
                    boolean z2 = r5.A05;
                    AnonymousClass5PJ r102 = new AnonymousClass5PJ(-1750409193, true, new C377449Lw(2, r10, r5));
                    if (r8 == null || ((AnonymousClass5Wn) r8).A02) {
                        ViewGroup.LayoutParams layoutParams = AnonymousClass5Py.A00;
                        r8 = new AnonymousClass5Wn(new C286465Wl(r13), r7);
                    }
                    if (!z2) {
                        r8.ESi(r102);
                    } else {
                        AnonymousClass5Wn r16 = (AnonymousClass5Wn) r8;
                        C286565Wx r9 = r16.A05;
                        r9.A06 = 100;
                        r9.A0O = true;
                        if (!(!r16.A02)) {
                            C18086VlG.A01("The composition is disposed");
                        } else {
                            r16.A01 = r102;
                            r16.A06.A0C(r16, r102);
                            if (r9.A0L || r9.A06 != 100) {
                                C18086VlG.A00("Cannot disable reuse from root if it was caused by other groups");
                            } else {
                                r9.A06 = -1;
                                r9.A0O = false;
                            }
                        }
                        th = AnonymousClass00P.createAndThrow();
                    }
                    r5.A01 = r8;
                    r5.A05 = false;
                    r6.A0J = false;
                    AnonymousClass5PH.A06(A022, A032, r3);
                    r5.A04 = false;
                    return;
                }
                th = new IllegalStateException("parent composition reference not set");
                throw th;
            } catch (Throwable th2) {
                AnonymousClass5PH.A06(A022, A032, r3);
                throw th2;
            }
        }
    }

    public final JQZ A04(Object obj, 0sL r8) {
        AnonymousClass5R6 r4;
        AnonymousClass5R6 r5 = this.A09;
        if (r5.A0A == null) {
            return new C56879IGa();
        }
        A05();
        if (!this.A0C.containsKey(obj)) {
            this.A0D.remove(obj);
            HashMap hashMap = this.A0B;
            Object obj2 = hashMap.get(obj);
            AnonymousClass5R6 r42 = obj2;
            if (obj2 == null) {
                AnonymousClass5R6 A002 = A00(this, obj);
                List A0G = r5.A0G();
                if (A002 != null) {
                    A01(this, A0G.indexOf(A002), r5.A0G().size());
                    r4 = A002;
                } else {
                    int size = A0G.size();
                    AnonymousClass5R6 r43 = new AnonymousClass5R6(true, AnonymousClass5R5.A00.addAndGet(1));
                    r5.A0J = true;
                    r5.A0V(r43, size);
                    r5.A0J = false;
                    r4 = r43;
                }
                this.A02++;
                hashMap.put(obj, r4);
                r42 = r4;
            }
            A02(this, (AnonymousClass5R6) r42, obj, r8);
        }
        return new GR9(this, obj);
    }

    public final void A05() {
        int size = this.A09.A0G().size();
        HashMap hashMap = this.A0A;
        if (hashMap.size() == size) {
            int i = this.A03;
            int i2 = this.A02;
            if ((size - i) - i2 >= 0) {
                HashMap hashMap2 = this.A0B;
                if (hashMap2.size() != i2) {
                    throw new IllegalArgumentException(002.A02(i2, hashMap2.size(), "Incorrect state. Precomposed children ", ". Map size "));
                }
                return;
            }
            throw new IllegalArgumentException(002.A0p("Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ", size, i, i2));
        }
        throw new IllegalArgumentException(002.A0n("Inconsistency between the count of nodes tracked by the state (", ") and the children count on the SubcomposeLayout (", "). Are you trying to use the state of the disposed SubcomposeLayout?", hashMap.size(), size));
    }

    public final void Dcz() {
        AnonymousClass5R6 r3 = this.A09;
        r3.A0J = true;
        HashMap hashMap = this.A0A;
        for (AnonymousClass6JA r0 : hashMap.values()) {
            C286495Wp r02 = r0.A01;
            if (r02 != null) {
                r02.dispose();
            }
        }
        r3.A0P();
        r3.A0J = false;
        hashMap.clear();
        this.A0C.clear();
        this.A02 = 0;
        this.A03 = 0;
        this.A0B.clear();
        A05();
    }

    public AnonymousClass6IJ(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy, AnonymousClass5R6 r5) {
        this.A09 = r5;
        this.A05 = subcomposeSlotReusePolicy;
    }
}
