package X;

public final class W2K {
    public double A00;
    public long A01;
    public String A02;
    public boolean A03;
    public String A04;

    public static String A00(String str) {
        String str2;
        if (str != null) {
            switch (str.hashCode()) {
                case -1838656495:
                    str2 = "STRING";
                    break;
                case 72655:
                    str2 = "INT";
                    break;
                case 2044650:
                    str2 = "BOOL";
                    break;
                case 66988604:
                    str2 = "FLOAT";
                    break;
            }
            if (!str.equals(str2)) {
                return null;
            }
            return str;
        }
        return null;
    }

    public final long A01() {
        String str = this.A02;
        if (str.equals("INT")) {
            return this.A01;
        }
        if (str.equals("FLOAT")) {
            return (long) this.A00;
        }
        throw new Exception("Invalid value type");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r2 = this;
            java.lang.String r0 = r2.A04
            if (r0 != 0) goto L_0x0011
            java.lang.String r1 = r2.A02
            int r0 = r1.hashCode()
            switch(r0) {
                case 72655: goto L_0x0012;
                case 2044650: goto L_0x0021;
                case 66988604: goto L_0x0030;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "n/a"
        L_0x000f:
            r2.A04 = r0
        L_0x0011:
            return r0
        L_0x0012:
            java.lang.String r0 = "INT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            long r0 = r2.A01
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x000f
        L_0x0021:
            java.lang.String r0 = "BOOL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            boolean r0 = r2.A03
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x000f
        L_0x0030:
            java.lang.String r0 = "FLOAT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            double r0 = r2.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2K.toString():java.lang.String");
    }

    public W2K(int i) {
        this.A02 = "INT";
        this.A01 = (long) i;
    }

    public W2K(String str, String str2) {
        if (str != null) {
            if (str2 != null) {
                switch (str.hashCode()) {
                    case -1838656495:
                        if (str.equals("STRING")) {
                            this.A04 = str2;
                            break;
                        }
                        break;
                    case 72655:
                        if (str.equals("INT")) {
                            try {
                                this.A01 = Long.parseLong(str2);
                                break;
                            } catch (NumberFormatException unused) {
                                throw new C16687V1q("Invalid integer", str2);
                            }
                        }
                        break;
                    case 2044650:
                        if (str.equals("BOOL")) {
                            if (str2.equals("true") || str2.equals("false")) {
                                this.A03 = Boolean.parseBoolean(str2);
                                break;
                            } else {
                                throw new C16687V1q("Invalid boolean", str2);
                            }
                        }
                        break;
                    case 66988604:
                        if (str.equals("FLOAT")) {
                            try {
                                this.A00 = Double.parseDouble(str2);
                                break;
                            } catch (NumberFormatException unused2) {
                                throw new C16687V1q("Invalid float", str2);
                            }
                        }
                        break;
                }
            } else {
                str = "NULL";
            }
            this.A02 = str;
            return;
        }
        throw new Exception("Invalid value type");
    }

    public W2K(String str) {
        this.A02 = "STRING";
        this.A04 = str;
    }

    public W2K(double d) {
        this.A02 = "FLOAT";
        this.A00 = d;
    }
}
