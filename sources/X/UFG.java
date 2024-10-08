package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

public final class UFG extends V4N {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public String A08;
    public int[] A09;
    public final Matrix A0A;
    public final Matrix A0B;
    public final ArrayList A0C;

    /* JADX WARNING: type inference failed for: r3v3, types: [X.UFF, X.UFH] */
    public UFG(0yf r7, UFG ufg) {
        UFF uff;
        this.A0B = new Matrix();
        this.A0C = new ArrayList();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        Matrix matrix = new Matrix();
        this.A0A = matrix;
        this.A08 = null;
        this.A02 = ufg.A02;
        this.A00 = ufg.A00;
        this.A01 = ufg.A01;
        this.A03 = ufg.A03;
        this.A04 = ufg.A04;
        this.A05 = ufg.A05;
        this.A06 = ufg.A06;
        this.A09 = ufg.A09;
        String str = ufg.A08;
        this.A08 = str;
        this.A07 = ufg.A07;
        if (str != null) {
            r7.put(str, this);
        }
        matrix.set(ufg.A0A);
        ArrayList arrayList = ufg.A0C;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof UFG) {
                this.A0C.add(new UFG(r7, (UFG) obj));
            } else {
                if (obj instanceof UFH) {
                    UFH ufh = (UFH) obj;
                    ? uff2 = new UFF(ufh);
                    uff2.A03 = 0.0f;
                    uff2.A01 = 1.0f;
                    uff2.A00 = 1.0f;
                    uff2.A06 = 0.0f;
                    uff2.A04 = 1.0f;
                    uff2.A05 = 0.0f;
                    uff2.A07 = Paint.Cap.BUTT;
                    uff2.A08 = Paint.Join.MITER;
                    uff2.A02 = 4.0f;
                    uff2.A0B = ufh.A0B;
                    uff2.A0A = ufh.A0A;
                    uff2.A03 = ufh.A03;
                    uff2.A01 = ufh.A01;
                    uff2.A09 = ufh.A09;
                    uff2.A01 = ufh.A01;
                    uff2.A00 = ufh.A00;
                    uff2.A06 = ufh.A06;
                    uff2.A04 = ufh.A04;
                    uff2.A05 = ufh.A05;
                    uff2.A07 = ufh.A07;
                    uff2.A08 = ufh.A08;
                    uff2.A02 = ufh.A02;
                    uff = uff2;
                } else if (obj instanceof UFE) {
                    uff = new UFF((UFF) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.A0C.add(uff);
                String str2 = uff.A02;
                if (str2 != null) {
                    r7.put(str2, uff);
                }
            }
        }
    }

    public static void A00(UFG ufg) {
        Matrix matrix = ufg.A0A;
        matrix.reset();
        matrix.postTranslate(-ufg.A00, -ufg.A01);
        matrix.postScale(ufg.A03, ufg.A04);
        matrix.postRotate(ufg.A02, 0.0f, 0.0f);
        matrix.postTranslate(ufg.A05 + ufg.A00, ufg.A06 + ufg.A01);
    }

    public String getGroupName() {
        return this.A08;
    }

    public Matrix getLocalMatrix() {
        return this.A0A;
    }

    public float getPivotX() {
        return this.A00;
    }

    public float getPivotY() {
        return this.A01;
    }

    public float getRotation() {
        return this.A02;
    }

    public float getScaleX() {
        return this.A03;
    }

    public float getScaleY() {
        return this.A04;
    }

    public float getTranslateX() {
        return this.A05;
    }

    public float getTranslateY() {
        return this.A06;
    }

    public void setPivotX(float f) {
        if (f != this.A00) {
            this.A00 = f;
            A00(this);
        }
    }

    public void setPivotY(float f) {
        if (f != this.A01) {
            this.A01 = f;
            A00(this);
        }
    }

    public void setRotation(float f) {
        if (f != this.A02) {
            this.A02 = f;
            A00(this);
        }
    }

    public void setScaleX(float f) {
        if (f != this.A03) {
            this.A03 = f;
            A00(this);
        }
    }

    public void setScaleY(float f) {
        if (f != this.A04) {
            this.A04 = f;
            A00(this);
        }
    }

    public void setTranslateX(float f) {
        if (f != this.A05) {
            this.A05 = f;
            A00(this);
        }
    }

    public void setTranslateY(float f) {
        if (f != this.A06) {
            this.A06 = f;
            A00(this);
        }
    }

    public UFG() {
        this.A0B = new Matrix();
        this.A0C = new ArrayList();
        this.A02 = 0.0f;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A03 = 1.0f;
        this.A04 = 1.0f;
        this.A05 = 0.0f;
        this.A06 = 0.0f;
        this.A0A = new Matrix();
        this.A08 = null;
    }
}
