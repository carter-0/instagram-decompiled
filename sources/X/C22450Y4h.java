package X;

/* renamed from: X.Y4h  reason: case insensitive filesystem */
public final class C22450Y4h implements C22552Y9f {
    public final Y1H CNe(C21469Xc1 xc1) {
        Xny xny;
        String str;
        System.currentTimeMillis();
        C21469Xc1 xc12 = xc1;
        C21464Xbw xbw = xc12.A04;
        XZW xzw = new XZW(xbw);
        if (xzw.A00 != null) {
            C18584Vub vub = xbw.A05;
            if (vub == null) {
                String[] strArr = xbw.A02.A00;
                int length = strArr.length / 2;
                boolean z = true;
                String str2 = null;
                boolean z2 = false;
                boolean z3 = false;
                int i = -1;
                int i2 = -1;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                int i3 = -1;
                int i4 = -1;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = i5 * 2;
                    String str3 = strArr[i6];
                    String str4 = strArr[i6 + 1];
                    if (str3.equalsIgnoreCase("Cache-Control")) {
                        if (str2 == null) {
                            str2 = str4;
                        }
                        z = false;
                    } else {
                        if (!str3.equalsIgnoreCase("Pragma")) {
                        }
                        z = false;
                    }
                    int i7 = 0;
                    while (i7 < str4.length()) {
                        int i8 = i7;
                        TAH tah = SQZ.A00;
                        while (i8 < str4.length() && "=,;".indexOf(str4.charAt(i8)) == -1) {
                            i8++;
                        }
                        String trim = str4.substring(i7, i8).trim();
                        int length2 = str4.length();
                        if (i8 == length2 || str4.charAt(i8) == ',' || str4.charAt(i8) == ';') {
                            i7 = i8 + 1;
                            str = null;
                        } else {
                            i7 = i8 + 1;
                            while (i7 < length2) {
                                char charAt = str4.charAt(i7);
                                if (charAt != ' ' && charAt != 9) {
                                    break;
                                }
                                i7++;
                            }
                            int i9 = i7;
                            if (i7 >= length2 || str4.charAt(i7) != '\"') {
                                while (i7 < length2 && ",;".indexOf(str4.charAt(i7)) == -1) {
                                    i7++;
                                }
                                str = str4.substring(i9, i7).trim();
                            } else {
                                int i10 = i7 + 1;
                                int i11 = i10;
                                while (i11 < length2 && "\"".indexOf(str4.charAt(i11)) == -1) {
                                    i11++;
                                }
                                str = str4.substring(i10, i11);
                                i7 = i11 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(trim)) {
                            z2 = true;
                        } else if ("no-store".equalsIgnoreCase(trim)) {
                            z3 = true;
                        } else if ("max-age".equalsIgnoreCase(trim)) {
                            i = SQZ.A00(str, -1);
                        } else if ("s-maxage".equalsIgnoreCase(trim)) {
                            i2 = SQZ.A00(str, -1);
                        } else if (C273654mx.A00(891).equalsIgnoreCase(trim)) {
                            z4 = true;
                        } else if ("public".equalsIgnoreCase(trim)) {
                            z5 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                            z6 = true;
                        } else if ("max-stale".equalsIgnoreCase(trim)) {
                            i3 = SQZ.A00(str, Integer.MAX_VALUE);
                        } else if ("min-fresh".equalsIgnoreCase(trim)) {
                            i4 = SQZ.A00(str, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                            z7 = true;
                        } else if ("no-transform".equalsIgnoreCase(trim)) {
                            z8 = true;
                        } else if ("immutable".equalsIgnoreCase(trim)) {
                            z9 = true;
                        }
                    }
                }
                if (!z) {
                    str2 = null;
                }
                vub = new C18584Vub(str2, i, i2, i3, i4, z2, z3, z4, z5, z6, z7, z8, z9);
                xbw.A05 = vub;
            }
            if (vub.A0C) {
                xzw = new XZW((C21464Xbw) null);
            }
        }
        C21464Xbw xbw2 = xzw.A00;
        if (xbw2 == null) {
            xny = new Xny();
            xny.A07 = xbw;
            xny.A06 = XRO.HTTP_1_1;
            xny.A00 = 504;
            xny.A03 = "Unsatisfiable Request (only-if-cached)";
            xny.A0B = SUS.A06;
            xny.A02 = -1;
            xny.A01 = System.currentTimeMillis();
        } else {
            Y1H A00 = xc12.A00(xbw2, xc12.A05, xc12.A06);
            xny = new Xny(A00);
            xny.A08 = null;
            if (A00.A0B != null) {
                Xny xny2 = new Xny(A00);
                xny2.A0B = null;
                A00 = xny2.A00();
            }
            if (A00.A0B != null) {
                throw AnonymousClass7TF.A0W("networkResponse", ".body != null");
            } else if (A00.A09 != null) {
                throw AnonymousClass7TF.A0W("networkResponse", ".networkResponse != null");
            } else if (A00.A08 != null) {
                throw AnonymousClass7TF.A0W("networkResponse", ".cacheResponse != null");
            } else if (A00.A0A == null) {
                xny.A09 = A00;
            } else {
                throw AnonymousClass7TF.A0W("networkResponse", ".priorResponse != null");
            }
        }
        return xny.A00();
    }
}
