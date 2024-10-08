package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.6Hj  reason: invalid class name and case insensitive filesystem */
public final class C305306Hj implements C288865cc, C305316Hk {
    public static final C305326Hl A05 = new C305326Hl();
    public final AnonymousClass6Gj A00;
    public final AnonymousClass6H6 A01;
    public final C305286Hh A02;
    public final AnonymousClass5Q8 A03;
    public final boolean A04;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0027, code lost:
        if (r1 == r0) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.AnonymousClass6H7 r4, X.C305306Hj r5, int r6) {
        /*
            r1 = 5
            r0 = 0
            if (r6 != r1) goto L_0x0005
            r0 = 1
        L_0x0005:
            r2 = 1
            if (r0 != 0) goto L_0x001e
            r0 = 6
            if (r6 == r0) goto L_0x001e
            r0 = 3
            if (r6 == r0) goto L_0x0023
            r0 = 4
            if (r6 == r0) goto L_0x0023
            if (r6 == r2) goto L_0x0045
            r0 = 2
            if (r6 == r0) goto L_0x0045
            java.lang.String r1 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x001e:
            X.6Gj r1 = r5.A00
            X.6Gj r0 = X.AnonymousClass6Gj.Horizontal
            goto L_0x0027
        L_0x0023:
            X.6Gj r1 = r5.A00
            X.6Gj r0 = X.AnonymousClass6Gj.Vertical
        L_0x0027:
            if (r1 != r0) goto L_0x0045
        L_0x0029:
            r3 = 0
            if (r2 != 0) goto L_0x003f
            boolean r0 = A01(r5, r6)
            r2 = 1
            if (r0 == 0) goto L_0x0040
            int r1 = r4.A00
            X.6Hh r0 = r5.A02
            int r0 = r0.getItemCount()
            int r0 = r0 - r2
            if (r1 >= r0) goto L_0x003f
        L_0x003e:
            r3 = 1
        L_0x003f:
            return r3
        L_0x0040:
            int r0 = r4.A01
            if (r0 <= 0) goto L_0x003f
            goto L_0x003e
        L_0x0045:
            r2 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C305306Hj.A00(X.6H7, X.6Hj, int):boolean");
    }

    public static final boolean A01(C305306Hj r3, int i) {
        boolean z = false;
        if (i == 1) {
            z = true;
        }
        if (z) {
            return false;
        }
        if (i != 2) {
            if (i != 5) {
                if (i != 6) {
                    boolean z2 = false;
                    if (i == 3) {
                        z2 = true;
                    }
                    if (z2) {
                        int ordinal = r3.A03.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                throw new RuntimeException();
                            }
                        }
                    } else if (i == 4) {
                        int ordinal2 = r3.A03.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
                    }
                }
                if (!r3.A04) {
                    return true;
                }
                return false;
            }
            return r3.A04;
        }
        return true;
    }

    public final /* synthetic */ boolean AB4(0sP r2) {
        return C287455aA.A00(this, r2);
    }

    public final /* synthetic */ Modifier Ezh(Modifier modifier) {
        return C285235Qj.A00(this, modifier);
    }

    public final AnonymousClass5VK BJr() {
        return C52312GNe.A00;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this;
    }

    public C305306Hj(AnonymousClass6Gj r1, AnonymousClass6H6 r2, C305286Hh r3, AnonymousClass5Q8 r4, boolean z) {
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = z;
        this.A03 = r4;
        this.A00 = r1;
    }

    public final /* synthetic */ Object AW8(Object obj, 0sL r3) {
        return r3.invoke(obj, this);
    }
}
