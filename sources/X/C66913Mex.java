package X;

/* renamed from: X.Mex  reason: case insensitive filesystem */
public abstract class C66913Mex {
    public final 02m A00;
    public final AnonymousClass65E A01;
    public final 0BQ A02;

    public final void A0A(Integer num) {
        if (A0G()) {
            int intValue = num.intValue();
            short s = 3;
            if (intValue == 0) {
                s = 2;
            } else if (intValue != 1) {
                if (intValue == 2) {
                    s = 4;
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
            this.A00.markerEnd(A06(), s);
        }
    }

    public final void A0D(String str, String str2) {
        0qQ.A0B(str2, 1);
        02m r1 = this.A00;
        r1.markerAnnotate(A00(r1, this), str, str2);
    }

    public final void A0F(String str, String[] strArr) {
        0qQ.A0B(strArr, 1);
        02m r4 = this.A00;
        r4.markerAnnotate(A00(r4, this), str, 03t.A07(",", "", "", (0sP) null, strArr));
    }

    public static void A03(C66913Mex mex, String str) {
        mex.A0D("END_REASON", str);
        mex.A0B(str);
        mex.A07();
    }

    public int A06() {
        if (this instanceof NUZ) {
            return 724775184;
        }
        if (this instanceof NUT) {
            return 724764088;
        }
        if (this instanceof NUU) {
            return 724767180;
        }
        if (this instanceof C67044MhH) {
            return 724765497;
        }
        if (this instanceof NUX) {
            return 724770940;
        }
        if (this instanceof NUW) {
            return 724763804;
        }
        if (this instanceof NUQ) {
            return 724765212;
        }
        if (this instanceof NUP) {
            return 724764110;
        }
        if (this instanceof NUO) {
            return 724774990;
        }
        if (this instanceof NUV) {
            return 724778333;
        }
        if (this instanceof NUR) {
            return 724777237;
        }
        if (this instanceof NUN) {
            return 724776576;
        }
        if (this instanceof NUY) {
            return 724773762;
        }
        if (this instanceof NUM) {
            return 724773613;
        }
        if (this instanceof C68714NUa) {
            return 724769478;
        }
        if (this instanceof NUS) {
            return 724769555;
        }
        if (this instanceof NUL) {
            return 724771454;
        }
        if (this instanceof NUK) {
            return 724771162;
        }
        if (this instanceof NUJ) {
            return 724766754;
        }
        if (this instanceof NUI) {
            return 724766006;
        }
        if (this instanceof NUH) {
            return 724768394;
        }
        if (this instanceof C67042MhF) {
            return 724766923;
        }
        if (this instanceof NUG) {
            return 724764855;
        }
        if (this instanceof C67043MhG) {
            return 724775697;
        }
        return 724774292;
    }

    public final void A07() {
        A0A(AnonymousClass05K.A0C);
    }

    public final void A08() {
        A0A(AnonymousClass05K.A00);
    }

    public final void A09() {
        02m r4 = this.A00;
        int A06 = A06();
        if (!r4.isMarkerOn(A06)) {
            r4.markerStart(A06, false);
            r4.markerAnnotate(A06, "LOGGED_IN_ACCOUNTS", String.valueOf(this.A02.BNv()));
            r4.markerAnnotate(A06, "EB_TEST_VERSION", "V3");
            r4.markerAnnotate(A06, "EB_TEST_VERSION_FROM_SERVER", AnonymousClass65A.A01(this.A01.A00, 36878899905167585L));
        }
    }

    public final void A0B(String str) {
        02m r1 = this.A00;
        r1.markerPoint(A00(r1, this), str);
    }

    public final void A0C(String str, int i) {
        02m r1 = this.A00;
        r1.markerAnnotate(A00(r1, this), str, i);
    }

    public final void A0E(String str, boolean z) {
        String str2;
        02m r2 = this.A00;
        int A002 = A00(r2, this);
        if (z) {
            str2 = "TRUE";
        } else {
            str2 = "FALSE";
        }
        r2.markerAnnotate(A002, str, str2);
    }

    public final boolean A0G() {
        return this.A00.isMarkerOn(A06());
    }

    public C66913Mex(02m r1, AnonymousClass65E r2, 0BQ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static int A00(02m r2, C66913Mex mex) {
        int A06 = mex.A06();
        if (!r2.isMarkerOn(A06)) {
            mex.A09();
        }
        return A06;
    }

    public static 2DR A01(C66913Mex mex, NJT njt, String str) {
        mex.A0B(str);
        return OYI.A00(njt.A0D());
    }

    public static void A02(C66913Mex mex, Number number, String str, String str2) {
        mex.A0D(str, str2);
        if (number != null) {
            mex.A0C("INTERVAL", number.intValue());
        }
    }

    public static void A04(C66913Mex mex, String str, String str2) {
        mex.A0D(str, str2);
        mex.A0A(AnonymousClass05K.A01);
    }
}
