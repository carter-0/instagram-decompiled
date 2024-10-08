package X;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* renamed from: X.54a  reason: invalid class name and case insensitive filesystem */
public final class C2807854a<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator A08 = new AnonymousClass54b();
    public int A00 = 0;
    public int A01 = 0;
    public AnonymousClass54c A02;
    public Y5Z A03;
    public C22466Y5a A04;
    public final AnonymousClass54c A05;
    public final Comparator A06;
    public final boolean A07;

    public C2807854a(boolean z) {
        Comparator comparator = A08;
        this.A06 = comparator;
        this.A07 = false;
        this.A05 = new AnonymousClass54c(false);
    }

    public final void clear() {
        this.A02 = null;
        this.A01 = 0;
        this.A00++;
        AnonymousClass54c r0 = this.A05;
        r0.A04 = r0;
        r0.A02 = r0;
    }

    public final boolean containsKey(Object obj) {
        AnonymousClass54c r1 = null;
        if (obj != null) {
            try {
                r1 = A04(obj, false);
            } catch (ClassCastException unused) {
            }
            if (r1 == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        AnonymousClass54c r1 = null;
        if (obj != null) {
            try {
                r1 = A04(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (r1 != null) {
            return r1.A06;
        }
        return null;
    }

    public final Object remove(Object obj) {
        AnonymousClass54c r1 = null;
        if (obj != null) {
            try {
                r1 = A04(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (r1 != null) {
            A05(r1, true);
        }
        if (r1 != null) {
            return r1.A06;
        }
        return null;
    }

    private void A00(AnonymousClass54c r6) {
        int i;
        int i2;
        AnonymousClass54c r1 = r6.A01;
        AnonymousClass54c r4 = r6.A05;
        AnonymousClass54c r0 = r4.A01;
        AnonymousClass54c r3 = r4.A05;
        r6.A05 = r0;
        if (r0 != null) {
            r0.A03 = r6;
        }
        A02(r6, r4);
        r4.A01 = r6;
        r6.A03 = r4;
        int i3 = 0;
        if (r1 != null) {
            i = r1.A00;
        } else {
            i = 0;
        }
        if (r0 != null) {
            i2 = r0.A00;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        r6.A00 = max;
        if (r3 != null) {
            i3 = r3.A00;
        }
        r4.A00 = Math.max(max, i3) + 1;
    }

    private void A01(AnonymousClass54c r6) {
        int i;
        int i2;
        AnonymousClass54c r4 = r6.A01;
        AnonymousClass54c r1 = r6.A05;
        AnonymousClass54c r3 = r4.A01;
        AnonymousClass54c r0 = r4.A05;
        r6.A01 = r0;
        if (r0 != null) {
            r0.A03 = r6;
        }
        A02(r6, r4);
        r4.A05 = r6;
        r6.A03 = r4;
        int i3 = 0;
        if (r1 != null) {
            i = r1.A00;
        } else {
            i = 0;
        }
        if (r0 != null) {
            i2 = r0.A00;
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2) + 1;
        r6.A00 = max;
        if (r3 != null) {
            i3 = r3.A00;
        }
        r4.A00 = Math.max(max, i3) + 1;
    }

    private void A02(AnonymousClass54c r3, AnonymousClass54c r4) {
        AnonymousClass54c r1 = r3.A03;
        r3.A03 = null;
        if (r4 != null) {
            r4.A03 = r1;
        }
        if (r1 == null) {
            this.A02 = r4;
        } else if (r1.A01 == r3) {
            r1.A01 = r4;
        } else {
            r1.A05 = r4;
        }
    }

    private void A03(AnonymousClass54c r8, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        while (r8 != null) {
            AnonymousClass54c r6 = r8.A01;
            AnonymousClass54c r2 = r8.A05;
            int i5 = 0;
            if (r6 != null) {
                i = r6.A00;
            } else {
                i = 0;
            }
            if (r2 != null) {
                i2 = r2.A00;
            } else {
                i2 = 0;
            }
            int i6 = i - i2;
            if (i6 == -2) {
                AnonymousClass54c r1 = r2.A01;
                AnonymousClass54c r0 = r2.A05;
                if (r0 != null) {
                    i4 = r0.A00;
                } else {
                    i4 = 0;
                }
                if (r1 != null) {
                    i5 = r1.A00;
                }
                int i7 = i5 - i4;
                if (i7 != -1 && (i7 != 0 || z)) {
                    A01(r2);
                }
                A00(r8);
            } else if (i6 == 2) {
                AnonymousClass54c r12 = r6.A01;
                AnonymousClass54c r02 = r6.A05;
                if (r02 != null) {
                    i3 = r02.A00;
                } else {
                    i3 = 0;
                }
                if (r12 != null) {
                    i5 = r12.A00;
                }
                int i8 = i5 - i3;
                if (i8 != 1 && (i8 != 0 || z)) {
                    A00(r6);
                }
                A01(r8);
            } else if (i6 == 0) {
                r8.A00 = i + 1;
            } else {
                r8.A00 = Math.max(i, i2) + 1;
                if (z) {
                    r8 = r8.A03;
                } else {
                    return;
                }
            }
            if (!z) {
                r8 = r8.A03;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass54c A04(java.lang.Object r11, boolean r12) {
        /*
            r10 = this;
            java.util.Comparator r3 = r10.A06
            X.54c r5 = r10.A02
            r4 = 0
            r8 = r11
            if (r5 == 0) goto L_0x002d
            java.util.Comparator r0 = A08
            if (r3 != r0) goto L_0x0025
            r2 = r8
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x000f:
            if (r2 == 0) goto L_0x0026
            java.lang.Object r0 = r5.A07
            int r1 = r2.compareTo(r0)
        L_0x0017:
            if (r1 != 0) goto L_0x001a
            return r5
        L_0x001a:
            if (r1 >= 0) goto L_0x0022
            X.54c r0 = r5.A01
        L_0x001e:
            if (r0 == 0) goto L_0x002e
            r5 = r0
            goto L_0x000f
        L_0x0022:
            X.54c r0 = r5.A05
            goto L_0x001e
        L_0x0025:
            r2 = r4
        L_0x0026:
            java.lang.Object r0 = r5.A07
            int r1 = r3.compare(r11, r0)
            goto L_0x0017
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r12 == 0) goto L_0x0079
            X.54c r6 = r10.A05
            r0 = 1
            if (r5 != 0) goto L_0x005d
            java.util.Comparator r0 = A08
            if (r3 != r0) goto L_0x0051
            boolean r0 = r11 instanceof java.lang.Comparable
            if (r0 != 0) goto L_0x0051
            java.lang.Class r0 = r11.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = " is not Comparable"
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L_0x0051:
            boolean r9 = r10.A07
            X.54c r7 = r6.A04
            X.54c r4 = new X.54c
            r4.<init>(r5, r6, r7, r8, r9)
            r10.A02 = r4
            goto L_0x006d
        L_0x005d:
            boolean r9 = r10.A07
            X.54c r7 = r6.A04
            X.54c r4 = new X.54c
            r4.<init>(r5, r6, r7, r8, r9)
            if (r1 >= 0) goto L_0x007a
            r5.A01 = r4
        L_0x006a:
            r10.A03(r5, r0)
        L_0x006d:
            int r0 = r10.A01
            int r0 = r0 + 1
            r10.A01 = r0
            int r0 = r10.A00
            int r0 = r0 + 1
            r10.A00 = r0
        L_0x0079:
            return r4
        L_0x007a:
            r5.A05 = r4
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2807854a.A04(java.lang.Object, boolean):X.54c");
    }

    public final void A05(AnonymousClass54c r7, boolean z) {
        AnonymousClass54c r4;
        int i;
        if (z) {
            AnonymousClass54c r1 = r7.A04;
            r1.A02 = r7.A02;
            r7.A02.A04 = r1;
        }
        AnonymousClass54c r42 = r7.A01;
        AnonymousClass54c r5 = r7.A05;
        AnonymousClass54c r0 = r7.A03;
        int i2 = 0;
        if (r42 != null) {
            if (r5 != null) {
                if (r42.A00 > r5.A00) {
                    for (AnonymousClass54c r12 = r42.A05; r12 != null; r12 = r12.A05) {
                        r42 = r12;
                    }
                } else {
                    r4 = r5;
                    for (AnonymousClass54c r13 = r5.A01; r13 != null; r13 = r13.A01) {
                        r4 = r13;
                    }
                }
                A05(r4, false);
                AnonymousClass54c r02 = r7.A01;
                if (r02 != null) {
                    i = r02.A00;
                    r4.A01 = r02;
                    r02.A03 = r4;
                    r7.A01 = null;
                } else {
                    i = 0;
                }
                AnonymousClass54c r03 = r7.A05;
                if (r03 != null) {
                    i2 = r03.A00;
                    r4.A05 = r03;
                    r03.A03 = r4;
                    r7.A05 = null;
                }
                r4.A00 = Math.max(i, i2) + 1;
                A02(r7, r4);
                return;
            }
            A02(r7, r42);
            r7.A01 = null;
        } else if (r5 != null) {
            A02(r7, r5);
            r7.A05 = null;
        } else {
            A02(r7, (AnonymousClass54c) null);
        }
        A03(r0, false);
        this.A01--;
        this.A00++;
    }

    public final Set entrySet() {
        Y5Z y5z = this.A03;
        if (y5z != null) {
            return y5z;
        }
        Y5Z y5z2 = new Y5Z(this);
        this.A03 = y5z2;
        return y5z2;
    }

    public final Set keySet() {
        C22466Y5a y5a = this.A04;
        if (y5a != null) {
            return y5a;
        }
        C22466Y5a y5a2 = new C22466Y5a(this);
        this.A04 = y5a2;
        return y5a2;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        } else if (obj2 != null || this.A07) {
            AnonymousClass54c A042 = A04(obj, true);
            Object obj3 = A042.A06;
            A042.A06 = obj2;
            return obj3;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public final int size() {
        return this.A01;
    }

    public C2807854a() {
        Comparator comparator = A08;
        this.A06 = comparator;
        this.A07 = true;
        this.A05 = new AnonymousClass54c(true);
    }
}
