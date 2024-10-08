package X;

/* renamed from: X.MBb  reason: case insensitive filesystem */
public final class C66093MBb implements C61910qF {
    public final int A00;
    public final Object A01;

    public C66093MBb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if ((r4 instanceof X.C61910qF) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        r0 = getFunctionDelegate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        if ((r4 instanceof X.C66093MBb) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        if (((X.C66093MBb) r4).A00 == r2) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        if ((r4 instanceof X.C61910qF) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        r0 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0045, code lost:
        return X.AnonymousClass7TG.A1Y(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if ((r4 instanceof X.C66093MBb) == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (((X.C66093MBb) r4).A00 == r2) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0028;
                case 2: goto L_0x000e;
                case 3: goto L_0x000c;
                case 4: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r1 = super.equals(r4)
        L_0x0009:
            return r1
        L_0x000a:
            r2 = 4
            goto L_0x000f
        L_0x000c:
            r2 = 3
            goto L_0x000f
        L_0x000e:
            r2 = 2
        L_0x000f:
            boolean r0 = r4 instanceof X.C66093MBb
            if (r0 == 0) goto L_0x001b
            r0 = r4
            X.MBb r0 = (X.C66093MBb) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 == r2) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r1 = 0
            if (r0 == 0) goto L_0x0009
            boolean r0 = r4 instanceof X.C61910qF
            if (r0 == 0) goto L_0x0009
            X.0eL r0 = r3.getFunctionDelegate()
            goto L_0x0041
        L_0x0028:
            r2 = 1
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            boolean r0 = r4 instanceof X.C66093MBb
            if (r0 == 0) goto L_0x0037
            r0 = r4
            X.MBb r0 = (X.C66093MBb) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 == r2) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r1 = 0
            if (r0 == 0) goto L_0x0009
            boolean r0 = r4 instanceof X.C61910qF
            if (r0 == 0) goto L_0x0009
            java.lang.Object r0 = r3.A01
        L_0x0041:
            boolean r1 = X.AnonymousClass7TG.A1Y(r4, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66093MBb.equals(java.lang.Object):boolean");
    }

    public final AnonymousClass0eL getFunctionDelegate() {
        String str;
        String str2;
        Class cls;
        Object obj;
        int i;
        switch (this.A00) {
            case 0:
            case 1:
                return (AnonymousClass0eL) this.A01;
            case 2:
                obj = this.A01;
                cls = C59753JWq.class;
                i = 1;
                str2 = "onManageDraftButtonClick";
                str = "onManageDraftButtonClick(Lcom/instagram/creation/capture/adapter/model/ManageButtonState;)V";
                break;
            case 3:
                obj = this.A01;
                cls = C13754TgQ.class;
                i = 1;
                str2 = "onProgressChanged";
                str = "onProgressChanged(D)V";
                break;
            case 4:
                obj = this.A01;
                cls = C70987OVb.class;
                i = 2;
                str2 = "sendAvatarPowerUp";
                str = "sendAvatarPowerUp(Ljava/lang/String;Lcom/instagram/direct/avatar/powerups/model/AvatarPowerUp;)V";
                break;
            default:
                return null;
        }
        return new 03J(i, obj, cls, str2, str, 0);
    }

    public final int hashCode() {
        Object obj;
        switch (this.A00) {
            case 0:
            case 1:
                obj = this.A01;
                break;
            case 2:
            case 3:
            case 4:
                obj = getFunctionDelegate();
                break;
            default:
                return super.hashCode();
        }
        return obj.hashCode();
    }
}
