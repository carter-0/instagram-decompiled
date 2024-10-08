package X;

import androidx.compose.runtime.Recomposer;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.5Wn  reason: invalid class name */
public final class AnonymousClass5Wn implements C285025Pj, C286485Wo, C286495Wp {
    public C286515Wr A00;
    public 0sL A01;
    public boolean A02;
    public boolean A03;
    public final C286475Wm A04;
    public final C286565Wx A05;
    public final AnonymousClass5PL A06;
    public final C286555Ww A07;
    public final C286505Wq A08;
    public final AnonymousClass5Ws A09;
    public final AnonymousClass5Ws A0A;
    public final C286515Wr A0B;
    public final C286515Wr A0C;
    public final Object A0D = new Object();
    public final Set A0E;
    public final AtomicReference A0F = new AtomicReference((Object) null);
    public final 0vq A0G;
    public final 0vq A0H;
    public final C286515Wr A0I;

    /* JADX WARNING: type inference failed for: r0v11, types: [X.5Ww, java.lang.Object] */
    public AnonymousClass5Wn(C286475Wm r10, AnonymousClass5PL r11) {
        AnonymousClass5PL r3 = r11;
        this.A06 = r11;
        C286475Wm r2 = r10;
        this.A04 = r10;
        04t r8 = new 04t(new 0vq(6));
        this.A0E = r8;
        C286505Wq r5 = new C286505Wq();
        if (r11.A0D()) {
            r5.A04 = new 0yC(6);
        }
        if (!(r11 instanceof Recomposer) && ((AnonymousClass5Q1) r3).A05) {
            r5.A06 = new HashMap();
        }
        this.A08 = r5;
        this.A0C = new C286515Wr();
        this.A0H = new 0vq(6);
        this.A0G = new 0vq(6);
        this.A0B = new C286515Wr();
        AnonymousClass5Ws r6 = new AnonymousClass5Ws();
        this.A09 = r6;
        AnonymousClass5Ws r7 = new AnonymousClass5Ws();
        this.A0A = r7;
        this.A0I = new C286515Wr();
        this.A00 = new C286515Wr();
        this.A07 = new Object();
        C286565Wx r1 = new C286565Wx(r2, r3, this, r5, r6, r7, r8);
        if (r11 instanceof AnonymousClass5Q1) {
            ((AnonymousClass5Q1) r3).A03.add(r1);
        }
        this.A05 = r1;
        this.A01 = AnonymousClass5X9.A00;
    }

    private final void A00() {
        int i;
        0vr r11 = this.A0B.A00;
        long[] jArr = r11.A02;
        long[] jArr2 = jArr;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr2[i2];
                if ((j & ((j ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8 - (((i2 - length) ^ -1) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((j & 255) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj = r11.A04[i5];
                            if (obj instanceof 0vq) {
                                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                0vq r7 = (0vq) obj;
                                Object[] objArr = r7.A03;
                                long[] jArr3 = r7.A02;
                                int length2 = jArr3.length - 2;
                                if (length2 >= 0) {
                                    int i6 = 0;
                                    while (true) {
                                        long j2 = jArr3[i6];
                                        if ((j2 & ((j2 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                            int i7 = 8 - (((i6 - length2) ^ -1) >>> 31);
                                            for (int i8 = 0; i8 < i7; i8++) {
                                                if ((j2 & 255) < 128) {
                                                    int i9 = (i6 << 3) + i8;
                                                    if (!this.A0C.A00.A04(objArr[i9])) {
                                                        r7.A06(i9);
                                                    }
                                                }
                                                j2 >>= 8;
                                            }
                                            if (i7 != 8) {
                                                break;
                                            }
                                        }
                                        if (i6 == length2) {
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                                i = r7.A01;
                            } else {
                                0qQ.A0C(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                i = this.A0C.A00.A04(obj);
                            }
                            if (i == 0) {
                                r11.A06(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        0vq r9 = this.A0G;
        if (r9.A01 != 0) {
            Object[] objArr2 = r9.A03;
            long[] jArr4 = r9.A02;
            int length3 = jArr4.length - 2;
            if (length3 >= 0) {
                int i10 = 0;
                while (true) {
                    long j3 = jArr4[i10];
                    if ((((j3 ^ -1) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                        int i11 = 8 - (((i10 - length3) ^ -1) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((j3 & 255) < 128) {
                                int i13 = (i10 << 3) + i12;
                                if (((C286625Xd) objArr2[i13]).A03 == null) {
                                    r9.A06(i13);
                                }
                            }
                            j3 >>= 8;
                        }
                        if (i11 != 8) {
                            return;
                        }
                    }
                    if (i10 != length3) {
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public static final void A01(AnonymousClass5Wn r5) {
        String str;
        AtomicReference atomicReference = r5.A0F;
        Object obj = AnonymousClass5XM.A00;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                str = "pending composition has not been applied";
            } else if (andSet instanceof Set) {
                r5.A06((Set) andSet, true);
                return;
            } else if (andSet instanceof Object[]) {
                for (Set A062 : (Set[]) andSet) {
                    r5.A06(A062, true);
                }
                return;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("corrupt pendingModifications drain: ");
                sb.append(atomicReference);
                str = sb.toString();
            }
            AnonymousClass5XN.A04(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A02(AnonymousClass5Wn r5) {
        String obj;
        AtomicReference atomicReference = r5.A0F;
        Object andSet = atomicReference.getAndSet((Object) null);
        if (0qQ.A0K(andSet, AnonymousClass5XM.A00)) {
            return;
        }
        if (andSet instanceof Set) {
            r5.A06((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set A062 : (Set[]) andSet) {
                r5.A06(A062, false);
            }
        } else {
            if (andSet == null) {
                obj = "calling recordModificationsOf and applyChanges concurrently is not supported";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("corrupt pendingModifications drain: ");
                sb.append(atomicReference);
                obj = sb.toString();
            }
            AnonymousClass5XN.A04(obj);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    private final void A03(AnonymousClass5Ws r35) {
        AnonymousClass5X4 A012;
        int i;
        AnonymousClass5X7 r0;
        AnonymousClass5X7 r02;
        C288445bv r9 = new C288445bv(this.A0E);
        try {
            C286535Wu r3 = r35.A00;
            if (r3.A02 != 0) {
                0fg.A01("Compose:applyChanges", 1854082573);
                try {
                    C286475Wm r2 = this.A04;
                    A012 = this.A08.A01();
                    int i2 = 0;
                    r3.A01(r2, r9, A012);
                    A012.A0P(true);
                    C268124co r03 = ((AnonymousClass5R6) ((C286455Wk) r2).A01).A0A;
                    if (r03 != null) {
                        r03.DC6();
                    }
                    0fg.A00(1166705813);
                    r9.A02();
                    List list = r9.A06;
                    if (!list.isEmpty()) {
                        0fg.A01("Compose:sideeffects", 1854082573);
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            ((C62320sa) list.get(i3)).invoke();
                        }
                        list.clear();
                        0fg.A00(1166705813);
                    }
                    if (this.A03) {
                        0fg.A01("Compose:unobserve", 1854082573);
                        this.A03 = false;
                        0vr r8 = this.A0C.A00;
                        long[] jArr = r8.A02;
                        long[] jArr2 = jArr;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j = jArr2[i4];
                                if ((((j ^ -1) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                    int i5 = 8 - (((i4 - length) ^ -1) >>> 31);
                                    while (true) {
                                        i = i5;
                                        if (i2 >= i) {
                                            break;
                                        }
                                        if ((j & 255) < 128) {
                                            int i6 = (i4 << 3) + i2;
                                            Object obj = r8.A04[i6];
                                            if (obj instanceof 0vq) {
                                                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                                0vq r13 = (0vq) obj;
                                                Object[] objArr = r13.A03;
                                                long[] jArr3 = r13.A02;
                                                int length2 = jArr3.length - 2;
                                                if (length2 >= 0) {
                                                    int i7 = 0;
                                                    while (true) {
                                                        long j2 = jArr3[i7];
                                                        if ((j2 & ((j2 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                                            int i8 = 8 - (((i7 - length2) ^ -1) >>> 31);
                                                            for (int i9 = 0; i9 < i8; i9++) {
                                                                if ((j2 & 255) < 128) {
                                                                    int i10 = (i7 << 3) + i9;
                                                                    C286625Xd r15 = (C286625Xd) objArr[i10];
                                                                    if (r15.A05 == null || (r02 = r15.A04) == null || r02.A00 == Integer.MIN_VALUE) {
                                                                        r13.A06(i10);
                                                                    }
                                                                }
                                                                j2 >>= 8;
                                                            }
                                                            if (i8 != 8) {
                                                                break;
                                                            }
                                                        }
                                                        if (i7 == length2) {
                                                            break;
                                                        }
                                                        i7++;
                                                    }
                                                }
                                                if (r13.A01 != 0) {
                                                }
                                            } else {
                                                0qQ.A0C(obj, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                                C286625Xd r132 = (C286625Xd) obj;
                                                if (!(r132.A05 == null || (r0 = r132.A04) == null || r0.A00 == Integer.MIN_VALUE)) {
                                                }
                                            }
                                            r8.A06(i6);
                                        }
                                        j >>= 8;
                                        i2++;
                                    }
                                    if (i != 8) {
                                        break;
                                    }
                                }
                                if (i4 == length) {
                                    break;
                                }
                                i4++;
                                i2 = 0;
                            }
                        }
                        A00();
                        0fg.A00(1166705813);
                    }
                } catch (Throwable th) {
                    th = th;
                    0fg.A00(1166705813);
                    throw th;
                }
            }
            if (this.A0A.A00.A02 == 0) {
                r9.A01();
            }
        } catch (Throwable th2) {
            if (this.A0A.A00.A02 == 0) {
                r9.A01();
            }
            throw th2;
        }
    }

    private final void A04(Object obj) {
        Integer num;
        Integer num2;
        Object A032 = this.A0C.A00.A03(obj);
        if (A032 == null) {
            return;
        }
        if (A032 instanceof 0vq) {
            01p r2 = (01p) A032;
            Object[] objArr = r2.A03;
            long[] jArr = r2.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - (((i - length) ^ -1) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                C286625Xd r22 = (C286625Xd) objArr[(i << 3) + i3];
                                C286485Wo r0 = r22.A05;
                                if (r0 != null) {
                                    num2 = r0.CNl(r22, obj);
                                } else {
                                    num2 = AnonymousClass05K.A00;
                                }
                                if (num2 == AnonymousClass05K.A0N) {
                                    this.A0I.A01(obj, r22);
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            C286625Xd r23 = (C286625Xd) A032;
            C286485Wo r02 = r23.A05;
            if (r02 != null) {
                num = r02.CNl(r23, obj);
            } else {
                num = AnonymousClass05K.A00;
            }
            if (num == AnonymousClass05K.A0N) {
                this.A0I.A01(obj, r23);
            }
        }
    }

    private final void A05(Object obj, boolean z) {
        Integer num;
        0vq r0;
        Integer num2;
        0vq r02;
        Object A032 = this.A0C.A00.A03(obj);
        if (A032 == null) {
            return;
        }
        if (A032 instanceof 0vq) {
            01p r2 = (01p) A032;
            Object[] objArr = r2.A03;
            long[] jArr = r2.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                        int i2 = 8 - (((i - length) ^ -1) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                C286625Xd r22 = (C286625Xd) objArr[(i << 3) + i3];
                                if (!this.A0I.A02(obj, r22)) {
                                    C286485Wo r03 = r22.A05;
                                    if (r03 != null) {
                                        num2 = r03.CNl(r22, obj);
                                    } else {
                                        num2 = AnonymousClass05K.A00;
                                    }
                                    if (num2 != AnonymousClass05K.A00) {
                                        if (r22.A03 == null || z) {
                                            r02 = this.A0H;
                                        } else {
                                            r02 = this.A0G;
                                        }
                                        r02.A09(r22);
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            return;
                        }
                    }
                    if (i != length) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            C286625Xd r23 = (C286625Xd) A032;
            if (!this.A0I.A02(obj, r23)) {
                C286485Wo r04 = r23.A05;
                if (r04 != null) {
                    num = r04.CNl(r23, obj);
                } else {
                    num = AnonymousClass05K.A00;
                }
                if (num != AnonymousClass05K.A00) {
                    if (r23.A03 == null || z) {
                        r0 = this.A0H;
                    } else {
                        r0 = this.A0G;
                    }
                    r0.A09(r23);
                }
            }
        }
    }

    private final void A06(Set set, boolean z) {
        int i;
        Set set2 = set;
        boolean z2 = z;
        if (set2 instanceof C285135Pw) {
            01p r0 = ((C285135Pw) set2).A00;
            Object[] objArr = r0.A03;
            long[] jArr = r0.A02;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j = jArr[i2];
                    if ((j & ((j ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                        int i3 = 8 - (((i2 - length) ^ -1) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((j & 255) < 128) {
                                Object obj = objArr[(i2 << 3) + i4];
                                if (obj instanceof C286625Xd) {
                                    C286625Xd r3 = (C286625Xd) obj;
                                    C286485Wo r02 = r3.A05;
                                    if (r02 != null) {
                                        r02.CNl(r3, (Object) null);
                                    }
                                } else {
                                    A05(obj, z2);
                                    Object A032 = this.A0B.A00.A03(obj);
                                    if (A032 != null) {
                                        if (A032 instanceof 0vq) {
                                            01p r1 = (01p) A032;
                                            Object[] objArr2 = r1.A03;
                                            long[] jArr2 = r1.A02;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i5 = 0;
                                                while (true) {
                                                    long j2 = jArr2[i5];
                                                    if ((j2 & ((j2 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                                        int i6 = 8 - (((i5 - length2) ^ -1) >>> 31);
                                                        for (int i7 = 0; i7 < i6; i7++) {
                                                            if ((j2 & 255) < 128) {
                                                                A05(objArr2[(i5 << 3) + i7], z2);
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i6 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i5 == length2) {
                                                        break;
                                                    }
                                                    i5++;
                                                }
                                            }
                                        } else {
                                            A05(A032, z2);
                                        }
                                    }
                                }
                            }
                            j >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            for (Object next : set2) {
                if (next instanceof C286625Xd) {
                    C286625Xd r32 = (C286625Xd) next;
                    C286485Wo r03 = r32.A05;
                    if (r03 != null) {
                        r03.CNl(r32, (Object) null);
                    }
                } else {
                    A05(next, z2);
                    Object A033 = this.A0B.A00.A03(next);
                    if (A033 != null) {
                        if (A033 instanceof 0vq) {
                            01p r12 = (01p) A033;
                            Object[] objArr3 = r12.A03;
                            long[] jArr3 = r12.A02;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j3 = jArr3[i8];
                                    if ((((j3 ^ -1) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                        int i9 = 8 - (((i8 - length3) ^ -1) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j3 & 255) < 128) {
                                                A05(objArr3[(i8 << 3) + i10], z2);
                                            }
                                            j3 >>= 8;
                                        }
                                        if (i9 != 8) {
                                            break;
                                        }
                                    }
                                    if (i8 == length3) {
                                        break;
                                    }
                                    i8++;
                                }
                            }
                        } else {
                            A05(A033, z2);
                        }
                    }
                }
            }
        }
        0vq r5 = this.A0G;
        0vq r13 = this.A0H;
        if (z && r5.A01 != 0) {
            0vr r4 = this.A0C.A00;
            long[] jArr4 = r4.A02;
            long[] jArr5 = jArr4;
            int length4 = jArr4.length - 2;
            if (length4 >= 0) {
                int i11 = 0;
                while (true) {
                    long j4 = jArr5[i11];
                    if ((((j4 ^ -1) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                        int i12 = 8 - (((i11 - length4) ^ -1) >>> 31);
                        int i13 = 0;
                        while (true) {
                            i = i12;
                            if (i13 >= i) {
                                break;
                            }
                            if ((j4 & 255) < 128) {
                                int i14 = (i11 << 3) + i13;
                                Object obj2 = r4.A04[i14];
                                if (obj2 instanceof 0vq) {
                                    0qQ.A0C(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                    0vq r9 = (0vq) obj2;
                                    Object[] objArr4 = r9.A03;
                                    long[] jArr6 = r9.A02;
                                    int length5 = jArr6.length - 2;
                                    if (length5 >= 0) {
                                        int i15 = 0;
                                        while (true) {
                                            long j5 = jArr6[i15];
                                            if ((j5 & ((j5 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                                int i16 = 8 - (((i15 - length5) ^ -1) >>> 31);
                                                for (int i17 = 0; i17 < i16; i17++) {
                                                    if ((j5 & 255) < 128) {
                                                        int i18 = (i15 << 3) + i17;
                                                        Object obj3 = objArr4[i18];
                                                        if (r5.A04(obj3) || r13.A04(obj3)) {
                                                            r9.A06(i18);
                                                        }
                                                    }
                                                    j5 >>= 8;
                                                }
                                                if (i16 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i15 == length5) {
                                                break;
                                            }
                                            i15++;
                                        }
                                    }
                                    if (r9.A01 != 0) {
                                    }
                                } else {
                                    0qQ.A0C(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    if (!r5.A04(obj2) && !r13.A04(obj2)) {
                                    }
                                }
                                r4.A06(i14);
                            }
                            j4 >>= 8;
                            i13++;
                        }
                        if (i != 8) {
                            break;
                        }
                    }
                    if (i11 == length4) {
                        break;
                    }
                    i11++;
                }
            }
            r5.A05();
            A00();
        } else if (r13.A01 != 0) {
            0vr r42 = this.A0C.A00;
            long[] jArr7 = r42.A02;
            long[] jArr8 = jArr7;
            int length6 = jArr7.length - 2;
            if (length6 >= 0) {
                int i19 = 0;
                while (true) {
                    long j6 = jArr8[i19];
                    if ((((j6 ^ -1) << 7) & j6 & -9187201950435737472L) != -9187201950435737472L) {
                        int i20 = 8 - (((i19 - length6) ^ -1) >>> 31);
                        for (int i21 = 0; i21 < i20; i21++) {
                            if ((j6 & 255) < 128) {
                                int i22 = (i19 << 3) + i21;
                                Object obj4 = r42.A04[i22];
                                if (obj4 instanceof 0vq) {
                                    0qQ.A0C(obj4, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                                    0vq r10 = (0vq) obj4;
                                    Object[] objArr5 = r10.A03;
                                    long[] jArr9 = r10.A02;
                                    int length7 = jArr9.length - 2;
                                    if (length7 >= 0) {
                                        int i23 = 0;
                                        while (true) {
                                            long j7 = jArr9[i23];
                                            if ((j7 & ((j7 ^ -1) << 7) & -9187201950435737472L) != -9187201950435737472L) {
                                                int i24 = 8 - (((i23 - length7) ^ -1) >>> 31);
                                                for (int i25 = 0; i25 < i24; i25++) {
                                                    if ((j7 & 255) < 128) {
                                                        int i26 = (i23 << 3) + i25;
                                                        if (r13.A04(objArr5[i26])) {
                                                            r10.A06(i26);
                                                        }
                                                    }
                                                    j7 >>= 8;
                                                }
                                                if (i24 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i23 == length7) {
                                                break;
                                            }
                                            i23++;
                                        }
                                    }
                                    if (r10.A01 != 0) {
                                    }
                                } else {
                                    0qQ.A0C(obj4, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                                    if (!r13.A04(obj4)) {
                                    }
                                }
                                r42.A06(i22);
                            }
                            j6 >>= 8;
                        }
                        if (i20 != 8) {
                            break;
                        }
                    }
                    if (i19 == length6) {
                        break;
                    }
                    i19++;
                }
            }
            A00();
            r13.A05();
        }
    }

    private final boolean A07(C286625Xd r6, Object obj) {
        AnonymousClass5X7 r2;
        C286565Wx r4 = this.A05;
        if (!r4.A0L || (r2 = r6.A04) == null) {
            return false;
        }
        AnonymousClass5X3 r1 = r4.A0B;
        if (!(!r1.A09.A07)) {
            AnonymousClass5XN.A03("Use active SlotWriter to determine anchor location instead");
        } else {
            int i = r2.A00;
            if (i == Integer.MIN_VALUE) {
                C18086VlG.A00("Anchor refers to a group that was removed");
            } else if (i < r1.A01) {
                return false;
            } else {
                List list = r4.A0c;
                int A002 = AnonymousClass5XN.A00(list, i);
                0vq r42 = null;
                if (A002 < 0) {
                    int i2 = -(A002 + 1);
                    if (!(obj instanceof AnonymousClass5TY)) {
                        obj = null;
                    }
                    list.add(i2, new C298655to(r6, obj, i));
                    return true;
                }
                C298655to r3 = (C298655to) list.get(A002);
                if (obj instanceof AnonymousClass5TY) {
                    Object obj2 = r3.A00;
                    if (obj2 == null) {
                        r3.A00 = obj;
                        return true;
                    } else if (obj2 instanceof 0vq) {
                        ((0vq) obj2).A09(obj);
                        return true;
                    } else {
                        0vq r0 = AnonymousClass01q.A00;
                        r42 = new 0vq(2);
                        r42.A03[0vq.A01(r42, obj2)] = obj2;
                        r42.A03[0vq.A01(r42, obj)] = obj;
                    }
                }
                r3.A00 = r42;
                return true;
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A6v() {
        this.A0F.set((Object) null);
        this.A09.A00.A00();
        this.A0A.A00.A00();
        Set set = this.A0E;
        if (!set.isEmpty()) {
            new C288445bv(set).A01();
        }
    }

    public final void ABx() {
        synchronized (this.A0D) {
            try {
                A03(this.A09);
                A02(this);
            } catch (Exception e) {
                A6v();
                throw e;
            } catch (Throwable th) {
                Set set = this.A0E;
                if (!set.isEmpty()) {
                    new C288445bv(set).A01();
                }
                throw th;
            }
        }
    }

    public final void AC3() {
        synchronized (this.A0D) {
            try {
                AnonymousClass5Ws r1 = this.A0A;
                if (r1.A00.A02 != 0) {
                    A03(r1);
                }
            } catch (Exception e) {
                A6v();
                throw e;
            } catch (Throwable th) {
                Set set = this.A0E;
                if (!set.isEmpty()) {
                    new C288445bv(set).A01();
                }
                throw th;
            }
        }
    }

    public final void AGx() {
        synchronized (this.A0D) {
            try {
                this.A05.A0I = null;
                Set set = this.A0E;
                if (!set.isEmpty()) {
                    new C288445bv(set).A01();
                }
            } catch (Exception e) {
                A6v();
                throw e;
            } catch (Throwable th) {
                Set set2 = this.A0E;
                if (!set2.isEmpty()) {
                    new C288445bv(set2).A01();
                }
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d4, code lost:
        r8.A06.A09(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00dd, code lost:
        if (r8.A05.A0L == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e1, code lost:
        return X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e4, code lost:
        return X.AnonymousClass05K.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer CNl(X.C286625Xd r19, java.lang.Object r20) {
        /*
            r18 = this;
            r9 = r19
            int r1 = r9.A01
            r0 = r1 & 2
            if (r0 == 0) goto L_0x000c
            r0 = r1 | 4
            r9.A01 = r0
        L_0x000c:
            X.5X7 r4 = r9.A04
            if (r4 == 0) goto L_0x0039
            int r3 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 0
            if (r3 == r1) goto L_0x0018
            r0 = 1
        L_0x0018:
            if (r0 == 0) goto L_0x0039
            r8 = r18
            X.5Wq r0 = r8.A08
            r2 = 1
            java.util.ArrayList r1 = r0.A05
            int r0 = r0.A00
            int r0 = X.AnonymousClass5X6.A01(r1, r3, r0)
            if (r0 < 0) goto L_0x0044
            java.lang.Object r0 = r1.get(r0)
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0044
        L_0x0033:
            if (r2 != 0) goto L_0x003c
            java.lang.Object r0 = r8.A0D
            monitor-enter(r0)
            monitor-exit(r0)
        L_0x0039:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            return r0
        L_0x003c:
            X.0sL r0 = r9.A06
            if (r0 == 0) goto L_0x0039
            java.lang.Object r6 = r8.A0D
            monitor-enter(r6)
            goto L_0x0046
        L_0x0044:
            r2 = 0
            goto L_0x0033
        L_0x0046:
            r7 = r20
            boolean r0 = r8.A07(r9, r7)     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x0052
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ all -> 0x00e5 }
            monitor-exit(r6)
            return r0
        L_0x0052:
            if (r20 != 0) goto L_0x005e
            X.5Wr r0 = r8.A00     // Catch:{ all -> 0x00e5 }
            X.5tl r1 = X.C298625tl.A00     // Catch:{ all -> 0x00e5 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x00e5 }
            r0.A09(r9, r1)     // Catch:{ all -> 0x00e5 }
            goto L_0x00d3
        L_0x005e:
            boolean r0 = r7 instanceof X.AnonymousClass5TY     // Catch:{ all -> 0x00e5 }
            if (r0 != 0) goto L_0x006c
            X.5Wr r0 = r8.A00     // Catch:{ all -> 0x00e5 }
            X.5tl r1 = X.C298625tl.A00     // Catch:{ all -> 0x00e5 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x00e5 }
            r0.A09(r9, r1)     // Catch:{ all -> 0x00e5 }
            goto L_0x00d3
        L_0x006c:
            X.5Wr r0 = r8.A00     // Catch:{ all -> 0x00e5 }
            X.0vr r0 = r0.A00     // Catch:{ all -> 0x00e5 }
            java.lang.Object r1 = r0.A03(r9)     // Catch:{ all -> 0x00e5 }
            if (r1 == 0) goto L_0x00ce
            boolean r0 = r1 instanceof X.0vq     // Catch:{ all -> 0x00e5 }
            if (r0 == 0) goto L_0x00c9
            X.0vq r1 = (X.0vq) r1     // Catch:{ all -> 0x00e5 }
            java.lang.Object[] r11 = r1.A03     // Catch:{ all -> 0x00e5 }
            long[] r10 = r1.A02     // Catch:{ all -> 0x00e5 }
            int r0 = r10.length     // Catch:{ all -> 0x00e5 }
            int r5 = r0 + -2
            if (r5 < 0) goto L_0x00ce
            r4 = 0
        L_0x0086:
            r16 = r10[r4]     // Catch:{ all -> 0x00e5 }
            r12 = -1
            long r12 = r12 ^ r16
            r0 = 7
            long r12 = r12 << r0
            long r12 = r12 & r16
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c4
            int r0 = r4 - r5
            r0 = r0 ^ -1
            int r0 = r0 >>> 31
            int r3 = 8 - r0
            r2 = 0
        L_0x00a3:
            if (r2 >= r3) goto L_0x00c0
            r0 = 255(0xff, double:1.26E-321)
            long r14 = r16 & r0
            r12 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b9
            int r0 = r4 << 3
            int r0 = r0 + r2
            r1 = r11[r0]     // Catch:{ all -> 0x00e5 }
            X.5tl r0 = X.C298625tl.A00     // Catch:{ all -> 0x00e5 }
            if (r1 != r0) goto L_0x00b9
            goto L_0x00d3
        L_0x00b9:
            r0 = 8
            long r16 = r16 >> r0
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00c0:
            r0 = 8
            if (r3 != r0) goto L_0x00ce
        L_0x00c4:
            if (r4 == r5) goto L_0x00ce
            int r4 = r4 + 1
            goto L_0x0086
        L_0x00c9:
            X.5tl r0 = X.C298625tl.A00     // Catch:{ all -> 0x00e5 }
            if (r1 != r0) goto L_0x00ce
            goto L_0x00d3
        L_0x00ce:
            X.5Wr r0 = r8.A00     // Catch:{ all -> 0x00e5 }
            r0.A01(r9, r7)     // Catch:{ all -> 0x00e5 }
        L_0x00d3:
            monitor-exit(r6)
            X.5PL r0 = r8.A06
            r0.A09(r8)
            X.5Wx r0 = r8.A05
            boolean r0 = r0.A0L
            if (r0 == 0) goto L_0x00e2
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            return r0
        L_0x00e2:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            return r0
        L_0x00e5:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Wn.CNl(X.5Xd, java.lang.Object):java.lang.Integer");
    }

    public final void EAv(Object obj) {
        C286625Xd A0O;
        C286565Wx r1 = this.A05;
        if (r1.A00 <= 0 && (A0O = r1.A0O()) != null) {
            int i = A0O.A01 | 1;
            A0O.A01 = i;
            Object obj2 = obj;
            if ((i & 32) == 0) {
                0vu r4 = A0O.A02;
                if (r4 == null) {
                    r4 = new 0vu(6);
                    A0O.A02 = r4;
                }
                int i2 = A0O.A00;
                int i3 = -1;
                int A012 = 0vu.A01(r4, obj2);
                if (A012 < 0) {
                    A012 ^= -1;
                } else {
                    i3 = r4.A02[A012];
                }
                r4.A04[A012] = obj;
                r4.A02[A012] = i2;
                if (i3 == A0O.A00) {
                    return;
                }
            }
            if (obj2 instanceof AnonymousClass5Ow) {
                ((AnonymousClass5Ow) obj2).A01(1);
            }
            this.A0C.A01(obj2, A0O);
            if (obj2 instanceof AnonymousClass5TY) {
                AnonymousClass5TY r9 = (AnonymousClass5TY) obj2;
                AnonymousClass5TZ AuM = r9.AuM();
                C286515Wr r11 = this.A0B;
                r11.A00(obj2);
                01h r0 = AuM.A03;
                Object[] objArr = r0.A04;
                long[] jArr = r0.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i5 = 8 - (((i4 - length) ^ -1) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j & 255) < 128) {
                                    C284925Ox r12 = (C284925Ox) objArr[(i4 << 3) + i6];
                                    if (r12 instanceof AnonymousClass5Ow) {
                                        ((AnonymousClass5Ow) r12).A01(1);
                                    }
                                    r11.A01(r12, obj2);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
                Object obj3 = AuM.A04;
                0vr r13 = A0O.A03;
                if (r13 == null) {
                    r13 = new 0vr(6);
                    A0O.A03 = r13;
                }
                r13.A09(r9, obj3);
            }
        }
    }

    public final void EAz(Object obj) {
        synchronized (this.A0D) {
            Object obj2 = obj;
            A04(obj2);
            Object A032 = this.A0B.A00.A03(obj2);
            if (A032 != null) {
                if (A032 instanceof 0vq) {
                    0vq r1 = (0vq) A032;
                    Object[] objArr = r1.A03;
                    long[] jArr = r1.A02;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((-1 ^ j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                                int i2 = 8 - (((i - length) ^ -1) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        A04((AnonymousClass5TY) objArr[(i << 3) + i3]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                }
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                } else {
                    A04((AnonymousClass5TY) A032);
                }
            }
        }
    }

    public final void ESi(0sL r2) {
        if (!(!this.A02)) {
            C18086VlG.A01("The composition is disposed");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = r2;
        this.A06.A0C(this, r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if ((!r9.A0E.isEmpty()) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r9 = this;
            java.lang.Object r2 = r9.A0D
            monitor-enter(r2)
            X.5Wx r5 = r9.A05     // Catch:{ all -> 0x00eb }
            boolean r0 = r5.A0L     // Catch:{ all -> 0x00eb }
            r8 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block."
            X.C18086VlG.A01(r0)     // Catch:{ all -> 0x00eb }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x0016:
            boolean r0 = r9.A02     // Catch:{ all -> 0x00eb }
            if (r0 != 0) goto L_0x00e4
            r9.A02 = r8     // Catch:{ all -> 0x00eb }
            X.0sL r0 = X.AnonymousClass5X9.A01     // Catch:{ all -> 0x00eb }
            r9.A01 = r0     // Catch:{ all -> 0x00eb }
            X.5Ws r0 = r5.A0F     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0027
            r9.A03(r0)     // Catch:{ all -> 0x00eb }
        L_0x0027:
            X.5Wq r7 = r9.A08     // Catch:{ all -> 0x00eb }
            int r0 = r7.A00     // Catch:{ all -> 0x00eb }
            r6 = 0
            r1 = 1
            if (r0 > 0) goto L_0x003a
            r1 = 0
            java.util.Set r0 = r9.A0E     // Catch:{ all -> 0x00eb }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00eb }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007a
        L_0x003a:
            java.util.Set r0 = r9.A0E     // Catch:{ all -> 0x00eb }
            X.5bv r4 = new X.5bv     // Catch:{ all -> 0x00eb }
            r4.<init>(r0)     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x0077
            X.5Wm r3 = r9.A04     // Catch:{ all -> 0x00eb }
            X.5X4 r0 = r7.A01()     // Catch:{ all -> 0x00eb }
            X.AnonymousClass5XN.A02(r4, r0)     // Catch:{ all -> 0x004d }
            goto L_0x0053
        L_0x004d:
            r1 = move-exception
            r0.A0P(r6)     // Catch:{ all -> 0x00eb }
            goto L_0x00e3
        L_0x0053:
            r0.A0P(r8)     // Catch:{ all -> 0x00eb }
            r1 = r3
            X.5Wl r1 = (X.C286465Wl) r1     // Catch:{ all -> 0x00eb }
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x00eb }
            r0.clear()     // Catch:{ all -> 0x00eb }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00eb }
            r1.A00 = r0     // Catch:{ all -> 0x00eb }
            X.5R6 r0 = (X.AnonymousClass5R6) r0     // Catch:{ all -> 0x00eb }
            r0.A0P()     // Catch:{ all -> 0x00eb }
            X.5Wk r3 = (X.C286455Wk) r3     // Catch:{ all -> 0x00eb }
            java.lang.Object r0 = r3.A01     // Catch:{ all -> 0x00eb }
            X.5R6 r0 = (X.AnonymousClass5R6) r0     // Catch:{ all -> 0x00eb }
            X.4co r0 = r0.A0A     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x0074
            r0.DC6()     // Catch:{ all -> 0x00eb }
        L_0x0074:
            r4.A02()     // Catch:{ all -> 0x00eb }
        L_0x0077:
            r4.A01()     // Catch:{ all -> 0x00eb }
        L_0x007a:
            java.lang.String r1 = "Compose:Composer.dispose"
            r0 = 1854082573(0x6e830e0d, float:2.0279761E28)
            X.0fg.A01(r1, r0)     // Catch:{ all -> 0x00eb }
            r4 = 0
            X.5PL r6 = r5.A0U     // Catch:{ all -> 0x00dc }
            boolean r0 = r6 instanceof X.AnonymousClass5Q1     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00ae
            X.5Q1 r6 = (X.AnonymousClass5Q1) r6     // Catch:{ all -> 0x00dc }
            java.util.Set r0 = r6.A00     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00a5
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00dc }
        L_0x0093:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x00dc }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x00dc }
            X.5Wq r0 = r5.A0Y     // Catch:{ all -> 0x00dc }
            r1.remove(r0)     // Catch:{ all -> 0x00dc }
            goto L_0x0093
        L_0x00a5:
            java.util.Set r0 = r6.A03     // Catch:{ all -> 0x00dc }
            java.util.Collection r0 = X.0u4.A00(r0)     // Catch:{ all -> 0x00dc }
            r0.remove(r5)     // Catch:{ all -> 0x00dc }
        L_0x00ae:
            X.5Wz r0 = r5.A0Z     // Catch:{ all -> 0x00dc }
            java.util.ArrayList r0 = r0.A00     // Catch:{ all -> 0x00dc }
            r0.clear()     // Catch:{ all -> 0x00dc }
            java.util.List r0 = r5.A0c     // Catch:{ all -> 0x00dc }
            r0.clear()     // Catch:{ all -> 0x00dc }
            X.5Ws r0 = r5.A0E     // Catch:{ all -> 0x00dc }
            X.5Wu r0 = r0.A00     // Catch:{ all -> 0x00dc }
            r0.A00()     // Catch:{ all -> 0x00dc }
            r5.A0I = r4     // Catch:{ all -> 0x00dc }
            X.5Wm r1 = r5.A0T     // Catch:{ all -> 0x00dc }
            X.5Wl r1 = (X.C286465Wl) r1     // Catch:{ all -> 0x00dc }
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x00dc }
            r0.clear()     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r1.A01     // Catch:{ all -> 0x00dc }
            r1.A00 = r0     // Catch:{ all -> 0x00dc }
            X.5R6 r0 = (X.AnonymousClass5R6) r0     // Catch:{ all -> 0x00dc }
            r0.A0P()     // Catch:{ all -> 0x00dc }
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)     // Catch:{ all -> 0x00eb }
            goto L_0x00e4
        L_0x00dc:
            r1 = move-exception
            r0 = 1166705813(0x458a8495, float:4432.5728)
            X.0fg.A00(r0)     // Catch:{ all -> 0x00eb }
        L_0x00e3:
            throw r1     // Catch:{ all -> 0x00eb }
        L_0x00e4:
            monitor-exit(r2)
            X.5PL r0 = r9.A06
            r0.A0B(r9)
            return
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Wn.dispose():void");
    }
}
