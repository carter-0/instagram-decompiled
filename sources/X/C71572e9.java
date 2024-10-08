package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import java.util.List;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    */
/* renamed from: X.2e9  reason: invalid class name and case insensitive filesystem */
public abstract class C71572e9 {
    public float A00;
    public int A01;
    public Path A02;
    public RectF A03;
    public 2dy A04;
    public C71572e9 A05;
    public C71572e9 A06;
    public List A07;
    public C71572e9[] A08;
    public final Matrix A09;
    public final RectF A0A;
    public final AnonymousClass2e5 A0B;
    public final C71582eB A0C;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2e9.<init>(X.2dy, X.2e5):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public C71572e9(X.2dy r1, X.AnonymousClass2e5 r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2e9.<init>(X.2dy, X.2e5):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71572e9.<init>(X.2dy, X.2e5):void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2e9.A03(X.2dy, X.2e5):X.2e9, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public static X.C71572e9 A03(X.2dy r1, X.AnonymousClass2e5 r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2e9.A03(X.2dy, X.2e5):X.2e9, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71572e9.A03(X.2dy, X.2e5):X.2e9");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2e9.A06():android.graphics.RectF, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.graphics.RectF A06() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2e9.A06():android.graphics.RectF, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71572e9.A06():android.graphics.RectF");
    }

    public final void A08(float f) {
        float f2;
        A04(0.0f, f);
        C71572e9 r1 = this.A06;
        if (r1 != null) {
            if (this instanceof C71602eE) {
                f = (float) this.A01;
            }
            r1.A08(f);
            return;
        }
        C71572e9[] r4 = this.A08;
        if (r4 != null) {
            for (C71572e9 r12 : r4) {
                if (this instanceof C71602eE) {
                    f2 = (float) this.A01;
                } else {
                    f2 = f;
                }
                r12.A08(f2);
            }
        }
    }

    public abstract void A09(float f);

    public abstract void A0A(Canvas canvas);

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2e9.A0D(android.graphics.Matrix, float, float):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A0D(android.graphics.Matrix r1, float r2, float r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2e9.A0D(android.graphics.Matrix, float, float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71572e9.A0D(android.graphics.Matrix, float, float):void");
    }

    public abstract void A0E(RectF rectF);

    private void A04(float f, float f2) {
        2dy r0 = this.A04;
        this.A01 = (int) (((float) ((int) (AnonymousClass3JU.A00(r0.A0j, r0.A06, f, this.A0B.A0E.A00) * 255.0f))) * (f2 / 255.0f));
    }

    private void A05(Canvas canvas, RectF rectF) {
        Canvas canvas2 = canvas;
        canvas2.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.A0B.A01(PorterDuff.Mode.CLEAR));
    }

    public void A07() {
        Path path = this.A0C.A00;
        if (path != null) {
            path.rewind();
        }
        C71572e9 r0 = this.A06;
        if (r0 != null) {
            r0.A07();
        } else {
            C71572e9[] r3 = this.A08;
            if (r3 != null) {
                for (C71572e9 A072 : r3) {
                    A072.A07();
                }
            }
        }
        Path path2 = this.A02;
        if (path2 != null) {
            path2.rewind();
        }
        C71572e9 r02 = this.A05;
        if (r02 != null) {
            r02.A07();
        }
    }

    public final void A0B(Canvas canvas, float f) {
        Paint paint;
        PorterDuff.Mode mode;
        float f2 = this.A00;
        if (f2 != 0.0f) {
            f = Math.max(0.0f, Math.min(f - f2, 1.0f));
        }
        2dy r9 = this.A04;
        if (f >= r9.A04 && f <= r9.A0E) {
            RectF rectF = this.A0A;
            if (!rectF.isEmpty()) {
                AnonymousClass2e5 r8 = this.A0B;
                if (!r8.A06) {
                    if (rectF.right >= 0.0f && rectF.bottom >= 0.0f) {
                        float f3 = rectF.left;
                        RectF rectF2 = r8.A0C;
                        if (f3 > rectF2.width() || rectF.top > rectF2.height()) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int save = canvas.save();
                if (this.A02 == null && this.A05 == null) {
                    Matrix matrix = this.A09;
                    canvas.concat(matrix);
                    A0A(canvas);
                    Matrix matrix2 = r8.A0B;
                    matrix.invert(matrix2);
                    canvas.concat(matrix2);
                    if (this.A07 != null) {
                        for (int i = 0; i < this.A07.size(); i++) {
                            ((C71572e9) this.A07.get(i)).A0B(canvas, f);
                        }
                    }
                } else {
                    RectF rectF3 = this.A03;
                    if (rectF3 == null) {
                        rectF3 = new RectF();
                        this.A03 = rectF3;
                    }
                    rectF3.set(0.0f, 0.0f, rectF.width(), rectF.height());
                    canvas.translate(rectF.left, rectF.top);
                    int saveLayer = canvas.saveLayer(this.A03, (Paint) null);
                    A05(canvas, this.A03);
                    canvas.translate(-rectF.left, -rectF.top);
                    Matrix matrix3 = this.A09;
                    canvas.concat(matrix3);
                    A0A(canvas);
                    Matrix matrix4 = r8.A0B;
                    matrix3.invert(matrix4);
                    canvas.concat(matrix4);
                    if (this.A07 != null) {
                        for (int i2 = 0; i2 < this.A07.size(); i2++) {
                            ((C71572e9) this.A07.get(i2)).A0B(canvas, f);
                        }
                    }
                    Path path = this.A02;
                    if (path != null) {
                        RectF rectF4 = this.A03;
                        float f4 = rectF.left;
                        float f5 = rectF.top;
                        canvas.translate(f4, f5);
                        canvas.saveLayer(rectF4, r8.A01(PorterDuff.Mode.DST_IN));
                        A05(canvas, rectF4);
                        float f6 = -f4;
                        float f7 = -f5;
                        canvas.translate(f6, f7);
                        canvas.concat(matrix3);
                        canvas.drawPath(path, r8.A01((PorterDuff.Mode) null));
                        canvas.restore();
                        canvas.translate(f6, f7);
                    }
                    C71572e9 r5 = this.A05;
                    if (r5 != null) {
                        RectF rectF5 = this.A03;
                        float f8 = rectF.left;
                        float f9 = rectF.top;
                        byte b = r9.A02;
                        if (b == 1) {
                            mode = PorterDuff.Mode.DST_IN;
                        } else if (b == 2) {
                            mode = PorterDuff.Mode.DST_OUT;
                        } else {
                            paint = null;
                            canvas.translate(f8, f9);
                            canvas.saveLayer(rectF5, paint);
                            A05(canvas, rectF5);
                            canvas.translate(-f8, -f9);
                            r5.A0B(canvas, f);
                            canvas.restore();
                        }
                        paint = r8.A01(mode);
                        canvas.translate(f8, f9);
                        canvas.saveLayer(rectF5, paint);
                        A05(canvas, rectF5);
                        canvas.translate(-f8, -f9);
                        r5.A0B(canvas, f);
                        canvas.restore();
                    }
                    canvas.restoreToCount(saveLayer);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public final void A0C(ColorFilter colorFilter) {
        if (this instanceof AnonymousClass2eD) {
            ((AnonymousClass2eD) this).ESG(colorFilter);
        }
        C71572e9 r0 = this.A06;
        if (r0 != null) {
            r0.A0C(colorFilter);
            return;
        }
        C71572e9[] r3 = this.A08;
        if (r3 != null) {
            for (C71572e9 A0C2 : r3) {
                A0C2.A0C(colorFilter);
            }
        }
    }
}
