package X;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.WeQ  reason: case insensitive filesystem */
public abstract class C19724WeQ implements XCG {
    public float A00;
    public float A01;
    public int A02;
    public C21006X9e A03;
    public final long A04 = System.currentTimeMillis();

    public void A01(C21006X9e x9e) {
        float f;
        int i;
        this.A03 = x9e;
        float f2 = 0.0f;
        if (x9e != null) {
            f = ((C19723WeP) x9e).A00;
        } else {
            f = 0.0f;
        }
        this.A01 = f;
        if (x9e != null) {
            i = ((C19723WeP) x9e).A03;
        } else {
            i = 0;
        }
        this.A02 = i;
        if (x9e != null) {
            f2 = ((float) x9e.AbG()) / 255.0f;
        }
        this.A00 = f2;
    }

    public final void AJn(C18735VzF vzF) {
        if (this instanceof Usn) {
            Usn usn = (Usn) this;
            XAU xau = usn.A09.A05;
            xau.getClass();
            xau.EXZ(vzF);
            usn.A02();
        } else if (this instanceof C16319Usp) {
            XCG xcg = ((C16319Usp) this).A00;
            if (xcg != null) {
                xcg.AJn(vzF);
            }
        } else if (this instanceof C16320Usq) {
            XCG[] xcgArr = ((C16320Usq) this).A00;
            int i = 0;
            do {
                XCG xcg2 = xcgArr[i];
                0qQ.A0A(xcg2);
                xcg2.AJn(vzF);
                i++;
            } while (i < 3);
        }
    }

    public final void ANT(C18735VzF vzF, List list) {
        XCG xcg;
        if (this instanceof Usn) {
            C21006X9e x9e = this.A03;
            17k.A07(x9e, AnonymousClass000.A00(3614));
            List<C18735VzF> C8w = x9e.C8w(vzF, list);
            if (C8w != null) {
                for (C18735VzF AJn : C8w) {
                    AJn(AJn);
                }
            }
        } else if ((this instanceof C16319Usp) && (xcg = ((C16319Usp) this).A00) != null) {
            xcg.ANT(vzF, list);
        }
    }

    public final void AQf() {
        if (this instanceof Usn) {
            Usn usn = (Usn) this;
            int i = usn.A02;
            Usn.A00(usn, i, usn.A01 - i);
            usn.A02 = usn.A01;
        } else if (this instanceof C16320Usq) {
            XCG[] xcgArr = ((C16320Usq) this).A00;
            int i2 = 0;
            do {
                XCG xcg = xcgArr[i2];
                0qQ.A0A(xcg);
                xcg.AQf();
                i2++;
            } while (i2 < 3);
        } else if (this instanceof C16319Usp) {
            throw new UnsupportedOperationException("Backed brush doesn't support incremental drawing");
        }
    }

    public final void ASW(C18735VzF vzF) {
        if (this instanceof Usn) {
            Usn usn = (Usn) this;
            C16330Ut0 ut0 = usn.A09;
            XAU xau = ut0.A05;
            xau.getClass();
            xau.EXZ(vzF);
            ut0.A05.AIc(vzF.A03);
            usn.A02();
            GLES20.glBindBuffer(34962, usn.A04.A03);
            C18607Vv0 vv0 = usn.A04;
            int i = usn.A02;
            int i2 = usn.A07;
            vv0.A00(i * i2, (usn.A01 - i) * i2);
            GLES20.glBindBuffer(34962, 0);
            C18607Vv0 vv02 = usn.A04;
            ByteBuffer byteBuffer = vv02.A04;
            byteBuffer.getClass();
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            asReadOnlyBuffer.rewind();
            asReadOnlyBuffer.limit(vv02.A00);
            ByteBuffer A13 = Pxg.A13(vv02.A00);
            A13.put(asReadOnlyBuffer);
            A13.rewind();
            C16331Ut1 ut1 = new C16331Ut1(vv02.A01, A13);
            C18607Vv0 vv03 = usn.A04;
            C19726WeS weS = vv03.A02;
            if (weS != null) {
                weS.A01.add(vv03);
            }
            usn.A04 = ut1;
            usn.A05 = null;
        } else if (this instanceof C16319Usp) {
            XCG xcg = ((C16319Usp) this).A00;
            if (xcg != null) {
                xcg.ASW(vzF);
            }
        } else if (this instanceof C16320Usq) {
            XCG[] xcgArr = ((C16320Usq) this).A00;
            int i3 = 0;
            do {
                XCG xcg2 = xcgArr[i3];
                0qQ.A0A(xcg2);
                xcg2.ASW(vzF);
                i3++;
            } while (i3 < 3);
        }
    }

    public final void E3l() {
        if (this instanceof C16319Usp) {
            C16319Usp usp = (C16319Usp) this;
            XCG xcg = usp.A00;
            if (xcg != null) {
                C16316Usk usk = usp.A01;
                if (usk.A02 != null) {
                    xcg.E3l();
                    usk.A02.A02();
                    usk.A02.A03(xcg);
                }
            }
        } else if (this instanceof C16320Usq) {
            XCG[] xcgArr = ((C16320Usq) this).A00;
            int i = 0;
            do {
                XCG xcg2 = xcgArr[i];
                0qQ.A0A(xcg2);
                xcg2.E3l();
                i++;
            } while (i < 3);
        }
    }

    public final void E4D() {
        C19725WeR weR;
        if (this instanceof C16319Usp) {
            C16319Usp usp = (C16319Usp) this;
            XCG xcg = usp.A00;
            if (xcg != null && (weR = usp.A01.A02) != null) {
                xcg.E4D();
                C19725WeR.A01(weR);
                xcg.AQf();
                C19725WeR.A00();
            }
        } else if (this instanceof C16321Usr) {
            C16321Usr usr = (C16321Usr) this;
            C14260Tsi tsi = C16321Usr.A03;
            tsi.getClass();
            tsi.A01(usr.A01, usr.A00);
        } else if (this instanceof C16320Usq) {
            XCG[] xcgArr = ((C16320Usq) this).A00;
            int i = 0;
            do {
                XCG xcg2 = xcgArr[i];
                0qQ.A0A(xcg2);
                xcg2.E4D();
                i++;
            } while (i < 3);
        }
    }

    public final void Exu(C18735VzF vzF) {
        if (this instanceof Usn) {
            Usn usn = (Usn) this;
            XAU xau = usn.A09.A05;
            xau.getClass();
            xau.Ewg(vzF);
            usn.A02();
        } else if (this instanceof C16319Usp) {
            XCG xcg = ((C16319Usp) this).A00;
            if (xcg != null) {
                xcg.Exu(vzF);
            }
        } else if (this instanceof C16320Usq) {
            0qQ.A0B(vzF, 0);
            XCG[] xcgArr = ((C16320Usq) this).A00;
            int i = 0;
            do {
                XCG xcg2 = xcgArr[i];
                0qQ.A0A(xcg2);
                xcg2.Exu(vzF);
                i++;
            } while (i < 3);
        }
    }
}
