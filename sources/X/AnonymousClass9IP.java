package X;

/* renamed from: X.9IP  reason: invalid class name */
public final class AnonymousClass9IP extends AnonymousClass0T0 {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public AnonymousClass9IP(C71062aE r2, boolean z) {
        this.A00 = 8;
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = z;
    }

    public final boolean A00() {
        switch (((Number) this.A01).intValue()) {
            case 0:
            case 1:
            case 4:
            case 5:
                return true;
            case 2:
                if (!this.A02) {
                    return true;
                }
                break;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if ((r3 instanceof X.AnonymousClass9IP) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        r3 = (X.AnonymousClass9IP) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r3.A00 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        if (r2.A01 == r3.A01) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003c, code lost:
        if ((r3 instanceof X.AnonymousClass9IP) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003e, code lost:
        r3 = (X.AnonymousClass9IP) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0042, code lost:
        if (r3.A00 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0053, code lost:
        if (r2.A02 == r3.A02) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0061, code lost:
        if ((r3 instanceof X.AnonymousClass9IP) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0063, code lost:
        r3 = (X.AnonymousClass9IP) r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0067, code lost:
        if (r3.A00 != r1) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006d, code lost:
        if (r2.A02 != r3.A02) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0077, code lost:
        if (X.0qQ.A0K(r2.A01, r3.A01) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x000e;
                case 2: goto L_0x0012;
                case 3: goto L_0x0026;
                case 4: goto L_0x002a;
                case 5: goto L_0x002e;
                case 6: goto L_0x0032;
                case 7: goto L_0x0005;
                case 8: goto L_0x0036;
                case 9: goto L_0x0056;
                case 10: goto L_0x005b;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = super.equals(r3)
            return r0
        L_0x000a:
            if (r2 == r3) goto L_0x007b
            r1 = 0
            goto L_0x003a
        L_0x000e:
            if (r2 == r3) goto L_0x007b
            r1 = 1
            goto L_0x0015
        L_0x0012:
            if (r2 == r3) goto L_0x007b
            r1 = 2
        L_0x0015:
            boolean r0 = r3 instanceof X.AnonymousClass9IP
            if (r0 == 0) goto L_0x0079
            X.9IP r3 = (X.AnonymousClass9IP) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0079
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            if (r1 == r0) goto L_0x004f
            goto L_0x0079
        L_0x0026:
            if (r2 == r3) goto L_0x007b
            r1 = 3
            goto L_0x003a
        L_0x002a:
            if (r2 == r3) goto L_0x007b
            r1 = 4
            goto L_0x003a
        L_0x002e:
            if (r2 == r3) goto L_0x007b
            r1 = 5
            goto L_0x003a
        L_0x0032:
            if (r2 == r3) goto L_0x007b
            r1 = 6
            goto L_0x005f
        L_0x0036:
            if (r2 == r3) goto L_0x007b
            r1 = 8
        L_0x003a:
            boolean r0 = r3 instanceof X.AnonymousClass9IP
            if (r0 == 0) goto L_0x0079
            X.9IP r3 = (X.AnonymousClass9IP) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0079
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x0079
        L_0x004f:
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 == r0) goto L_0x007b
            goto L_0x0079
        L_0x0056:
            if (r2 == r3) goto L_0x007b
            r1 = 9
            goto L_0x005f
        L_0x005b:
            if (r2 == r3) goto L_0x007b
            r1 = 10
        L_0x005f:
            boolean r0 = r3 instanceof X.AnonymousClass9IP
            if (r0 == 0) goto L_0x0079
            X.9IP r3 = (X.AnonymousClass9IP) r3
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0079
            boolean r1 = r2.A02
            boolean r0 = r3.A02
            if (r1 != r0) goto L_0x0079
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r3.A01
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007b
        L_0x0079:
            r0 = 0
            return r0
        L_0x007b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IP.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r0 = r0.hashCode() + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0065, code lost:
        r2 = r0 * 31;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r3.A02 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006d, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        return r2 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x003f;
                case 2: goto L_0x001f;
                case 3: goto L_0x005f;
                case 4: goto L_0x005f;
                case 5: goto L_0x005f;
                case 6: goto L_0x000a;
                case 7: goto L_0x0005;
                case 8: goto L_0x005f;
                case 9: goto L_0x000a;
                case 10: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            int r2 = super.hashCode()
            return r2
        L_0x000a:
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x0012
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x0012:
            int r2 = r0 * 31
            java.lang.Object r0 = r3.A01
            if (r0 != 0) goto L_0x001a
            r0 = 0
            goto L_0x006f
        L_0x001a:
            int r0 = r0.hashCode()
            goto L_0x006f
        L_0x001f:
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L_0x002d;
                case 2: goto L_0x0030;
                case 3: goto L_0x0033;
                case 4: goto L_0x0036;
                case 5: goto L_0x0039;
                case 6: goto L_0x003c;
                default: goto L_0x002a;
            }
        L_0x002a:
            java.lang.String r0 = "KEEP_IN_CHAT_UNSEEN"
            goto L_0x004c
        L_0x002d:
            java.lang.String r0 = "KEEP_IN_CHAT_SEEN"
            goto L_0x004c
        L_0x0030:
            java.lang.String r0 = "VIEW_ONCE_UNSEEN"
            goto L_0x004c
        L_0x0033:
            java.lang.String r0 = "VIEW_ONCE_SEEN"
            goto L_0x004c
        L_0x0036:
            java.lang.String r0 = "REPLAYABLE_UNSEEN"
            goto L_0x004c
        L_0x0039:
            java.lang.String r0 = "REPLAYABLE_SEEN"
            goto L_0x004c
        L_0x003c:
            java.lang.String r0 = "REPLAYABLE_EXPIRED"
            goto L_0x004c
        L_0x003f:
            java.lang.Object r0 = r3.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            switch(r1) {
                case 1: goto L_0x0052;
                case 2: goto L_0x0055;
                case 3: goto L_0x005c;
                default: goto L_0x004a;
            }
        L_0x004a:
            java.lang.String r0 = "NOT_READY"
        L_0x004c:
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            goto L_0x0065
        L_0x0052:
            java.lang.String r0 = "READY"
            goto L_0x004c
        L_0x0055:
            r0 = 1039(0x40f, float:1.456E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x004c
        L_0x005c:
            java.lang.String r0 = "DISMISSED"
            goto L_0x004c
        L_0x005f:
            java.lang.Object r0 = r3.A01
            int r0 = r0.hashCode()
        L_0x0065:
            int r2 = r0 * 31
            boolean r1 = r3.A02
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x006f
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x006f:
            int r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9IP.hashCode():int");
    }

    public AnonymousClass9IP(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public AnonymousClass9IP(Integer num, int i, boolean z) {
        this.A00 = i;
        this.A01 = num;
        this.A02 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass9IP(C71062aE r2) {
        this(r2, false);
        this.A00 = 8;
    }

    public AnonymousClass9IP(1Xj r1, int i, boolean z) {
        this.A00 = i;
        this.A01 = r1;
        this.A02 = z;
    }

    public AnonymousClass9IP(C2809254t r2, boolean z) {
        this.A00 = 0;
        this.A01 = r2;
        this.A02 = z;
    }
}
