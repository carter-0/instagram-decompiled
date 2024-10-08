package X;

public final class XU4 {
    public boolean A00;
    public boolean A01;
    public String[] A02;
    public String[] A03;

    public final void A00(String... strArr) {
        if (!this.A01) {
            throw AnonymousClass7TE.A0z("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.A02 = (String[]) strArr.clone();
        } else {
            throw AnonymousClass7TE.A0w("At least one cipher suite is required");
        }
    }

    public final void A01(String... strArr) {
        if (!this.A01) {
            throw AnonymousClass7TE.A0z("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.A03 = (String[]) strArr.clone();
        } else {
            throw AnonymousClass7TE.A0w("At least one TLS version is required");
        }
    }

    public final void A02(C22015Xr8... xr8Arr) {
        if (this.A01) {
            int length = xr8Arr.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = xr8Arr[i].A00;
            }
            A00(strArr);
            return;
        }
        throw AnonymousClass7TE.A0z("no cipher suites for cleartext connections");
    }

    public final void A03(C21256XRb... xRbArr) {
        if (this.A01) {
            int length = xRbArr.length;
            String[] strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = xRbArr[i].A00;
            }
            A01(strArr);
            return;
        }
        throw AnonymousClass7TE.A0z("no TLS versions for cleartext connections");
    }
}
