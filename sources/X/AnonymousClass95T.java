package X;

/* renamed from: X.95T  reason: invalid class name */
public abstract class AnonymousClass95T implements Comparable {
    public String A00;
    public int A01;
    public final AnonymousClass95T A02;
    public final String A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: X.95T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.95U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: X.95T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.95U} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.95U} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass95T A00(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.AnonymousClass95U
            if (r0 == 0) goto L_0x0011
            r2 = r3
            X.95U r2 = (X.AnonymousClass95U) r2
            boolean r1 = r2.A00
            X.95U r0 = new X.95U
            r0.<init>(r2, r4)
        L_0x000e:
            r0.A00 = r1
            return r0
        L_0x0011:
            r0 = r3
            X.95S r0 = (X.AnonymousClass95S) r0
            boolean r0 = r0 instanceof X.AnonymousClass95U
            if (r0 == 0) goto L_0x001f
            r1 = 0
            X.95U r0 = new X.95U
            r0.<init>(r3, r4)
            goto L_0x000e
        L_0x001f:
            X.95S r0 = new X.95S
            r0.<init>(r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass95T.A00(java.lang.String):X.95T");
    }

    public final String A01() {
        String str = this.A00;
        if (str == null) {
            AnonymousClass95T r2 = this.A02;
            str = this.A03;
            if (!(r2 == null || r2.A01() == null)) {
                str = r2.A01().concat(str);
            }
            this.A00 = str;
        }
        return str;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return A01().compareTo(((AnonymousClass95T) obj).A01());
    }

    public final int hashCode() {
        int i = this.A01;
        if (i == 0) {
            String str = this.A00;
            if (str == null) {
                AnonymousClass95T r0 = this.A02;
                if (r0 != null) {
                    i = r0.hashCode();
                } else {
                    i = 0;
                }
                str = this.A03;
            }
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                i = (i * 31) + str.charAt(i2);
            }
            this.A01 = i;
        }
        return i;
    }

    public AnonymousClass95T(AnonymousClass95T r1, String str) {
        str.getClass();
        this.A02 = r1;
        this.A03 = str;
    }

    public final String toString() {
        return A01();
    }

    public AnonymousClass95T() {
        "/".getClass();
        this.A02 = null;
        this.A03 = "/";
        this.A00 = "/";
    }
}
