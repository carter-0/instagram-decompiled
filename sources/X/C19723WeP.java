package X;

import android.graphics.Point;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WeP  reason: case insensitive filesystem */
public abstract class C19723WeP implements C21006X9e {
    public float A00;
    public float A01 = 1.0f;
    public int A02 = 255;
    public int A03 = 16711935;
    public C14261Tsj A04;
    public XAU A05;
    public C18571VuN A06 = C18571VuN.A08;
    public float[] A07;
    public final Point A08 = new Point();
    public final String A09;

    public XCG AML() {
        return null;
    }

    public static PointF A00(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF(pointF.x * 70.0f, pointF.y * 70.0f);
        return new PointF(pointF2.x - pointF3.x, pointF2.y - pointF3.y);
    }

    public final int AbG() {
        if ((this instanceof C16314Usi) || (this instanceof C16312Usg) || (this instanceof C16315Usj)) {
            return 255;
        }
        if (this instanceof C16313Ush) {
            return 229;
        }
        return this.A02;
    }

    public final String AiK() {
        if (this instanceof C16315Usj) {
            return "Eraser";
        }
        return this.A09;
    }

    public final float Aw0() {
        if (this instanceof C16323Ust) {
            return 12.0f;
        }
        return (BTE() * 0.8f) + (BPO() * 0.2f);
    }

    public final float BPO() {
        if (this instanceof C16314Usi) {
            return 40.0f;
        }
        if (this instanceof C16312Usg) {
            return 38.0f;
        }
        if ((this instanceof C16315Usj) || (this instanceof C16313Ush)) {
            return 80.0f;
        }
        if (!(this instanceof C16330Ut0)) {
            return 0.0f;
        }
        C16330Ut0 ut0 = (C16330Ut0) this;
        if (ut0 instanceof C16326Usw) {
            return 120.0f;
        }
        if (ut0 instanceof C16323Ust) {
            return 40.0f;
        }
        if (ut0 instanceof C16322Uss) {
            return 16.0f;
        }
        17k.A07((Object) null, "Must initialize brush size model");
        throw AnonymousClass00P.createAndThrow();
    }

    public final float BTE() {
        if (this instanceof C16314Usi) {
            return 7.0f;
        }
        if (this instanceof C16312Usg) {
            return 3.0f;
        }
        if (this instanceof C16315Usj) {
            return 4.0f;
        }
        if (this instanceof C16313Ush) {
            return 16.0f;
        }
        if (!(this instanceof C16330Ut0)) {
            return 0.0f;
        }
        C16330Ut0 ut0 = (C16330Ut0) this;
        if ((ut0 instanceof C16326Usw) || (ut0 instanceof C16323Ust)) {
            return 8.0f;
        }
        if (ut0 instanceof C16322Uss) {
            return 6.0f;
        }
        17k.A07((Object) null, "Must initialize brush size model");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List C8w(C18735VzF vzF, List list) {
        if (this instanceof C16311Usf) {
            if (!(((C16311Usf) this) instanceof C16322Uss)) {
                return null;
            }
            0qQ.A0B(list, 1);
            PointF pointF = vzF.A04;
            PointF pointF2 = new PointF(pointF.x, pointF.y);
            ArrayList arrayList = new ArrayList();
            if (!list.isEmpty()) {
                int size = list.size();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    PointF pointF3 = (PointF) list.get(i);
                    if (!pointF3.equals(pointF2.x, pointF2.y)) {
                        float f = pointF2.x - pointF3.x;
                        float f2 = pointF2.y - pointF3.y;
                        if (((float) JTR.A00(f, f2)) > 30.0f) {
                            PointF pointF4 = new PointF(f, f2);
                            float A002 = 1.0f / ((float) JTR.A00(pointF2.x - pointF3.x, pointF2.y - pointF3.y));
                            PointF pointF5 = new PointF(pointF4.x * A002, pointF4.y * A002);
                            PointF pointF6 = new PointF(-pointF5.y, pointF5.x);
                            PointF A003 = A00(pointF5, pointF2);
                            PointF pointF7 = new PointF(pointF6.x * 70.0f, pointF6.y * 70.0f);
                            PointF[] pointFArr = {new PointF(A003.x + pointF7.x, A003.y + pointF7.y), A00(pointF6, A00(pointF5, pointF2))};
                            PointF pointF8 = pointFArr[0];
                            PointF pointF9 = pointFArr[1];
                            C18735VzF vzF2 = new C18735VzF(vzF);
                            vzF2.A03 += 100;
                            arrayList.add(vzF2);
                            C18735VzF vzF3 = new C18735VzF(vzF);
                            vzF3.A04 = pointF9;
                            vzF3.A03 += 200;
                            arrayList.add(vzF3);
                            C18735VzF vzF4 = new C18735VzF(vzF);
                            vzF4.A04 = pointF2;
                            vzF4.A03 += 300;
                            arrayList.add(vzF4);
                            C18735VzF vzF5 = new C18735VzF(vzF);
                            vzF5.A04 = pointF8;
                            vzF5.A03 += 400;
                            arrayList.add(vzF5);
                            break;
                        }
                    }
                    size = i;
                }
            }
            return arrayList;
        } else if (this instanceof C16316Usk) {
            return ((C16316Usk) this).A04.C8w(vzF, list);
        } else {
            return C8w(vzF, list);
        }
    }

    public final boolean CLz() {
        if ((this instanceof C16315Usj) || (this instanceof C16326Usw)) {
            return true;
        }
        return false;
    }

    public final void EOY(int i) {
        if (this instanceof C16316Usk) {
            C16316Usk usk = (C16316Usk) this;
            usk.A02 = i;
            usk.A04.EOY(i);
            return;
        }
        this.A02 = i;
    }

    public void EPW(Point point) {
        this.A08.set(point.x, point.y);
    }

    public final void EPj(C18571VuN vuN) {
        if (this instanceof C16316Usk) {
            C16316Usk usk = (C16316Usk) this;
            usk.A06 = vuN;
            usk.A04.EPj(vuN);
        } else if (this instanceof C16312Usg) {
            C16312Usg usg = (C16312Usg) this;
            0qQ.A0B(vuN, 0);
            usg.A06 = vuN;
            C21006X9e[] x9eArr = usg.A00;
            int i = 0;
            do {
                x9eArr[i].EPj(vuN);
                i++;
            } while (i < 3);
        } else {
            this.A06 = vuN;
        }
    }

    public void ESC(int i) {
        this.A03 = i;
    }

    public final void ElQ(float f) {
        float f2;
        C14278TtB ttB;
        C21006X9e x9e;
        if (this instanceof C16316Usk) {
            C16316Usk usk = (C16316Usk) this;
            usk.A00 = f;
            x9e = usk.A04;
        } else if (this instanceof C16312Usg) {
            C16312Usg usg = (C16312Usg) this;
            usg.A00 = f;
            C21006X9e[] x9eArr = usg.A00;
            int i = 0;
            do {
                x9eArr[i].ElQ(f);
                i++;
            } while (i < 3);
            x9eArr[2].ElQ(f);
            x9eArr[1].ElQ(70.0f + f);
            x9e = x9eArr[0];
        } else if (this instanceof C16327Usx) {
            this.A00 = f;
            this.A01 = ((float) Math.sqrt((double) f)) / 2.0f;
            return;
        } else {
            if (this instanceof C16329Usz) {
                C16329Usz usz = (C16329Usz) this;
                usz.A00 = f;
                usz.A01 = ((float) Math.sqrt((double) f)) / 2.0f;
                f2 = ((f - 70.0f) / f) + 1.0f;
                ttB = usz.A00;
            } else if (this instanceof C16328Usy) {
                C16328Usy usy = (C16328Usy) this;
                usy.A00 = f;
                f2 = ((f - 1.5f) / f) + 0.1f;
                ttB = usy.A00;
            } else {
                this.A00 = f;
                return;
            }
            0qQ.A0A(ttB);
            ttB.A00(f2);
            return;
        }
        x9e.ElQ(f);
    }

    public boolean isValid() {
        return AnonymousClass7TF.A1V(this.A04);
    }

    public C19723WeP(String str) {
        this.A09 = str;
    }
}
