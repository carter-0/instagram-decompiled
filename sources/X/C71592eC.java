package X;

import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;

/* renamed from: X.2eC  reason: invalid class name and case insensitive filesystem */
public final class C71592eC extends C71572e9 implements AnonymousClass2eD {
    public float A00;
    public ColorFilter A01;
    public Matrix A02;
    public Paint A03;
    public Paint A04;
    public Paint A05;
    public Shader A06;
    public AnonymousClass6BC A07;
    public boolean A08;
    public Shader[] A09;
    public Path A0A;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2eC.A07():void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A07() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2eC.A07():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71592eC.A07():void");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.2eC.A0E(android.graphics.RectF):void, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final void A0E(android.graphics.RectF r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: X.2eC.A0E(android.graphics.RectF):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71592eC.A0E(android.graphics.RectF):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: X.2dn[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: X.2dn[]} */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.2dn] */
    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, X.2dn] */
    /* JADX WARNING: type inference failed for: r0v48, types: [X.3JV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v13, types: [X.6AF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v3, types: [java.lang.Object, X.6AD] */
    /* JADX WARNING: type inference failed for: r0v56, types: [X.3JV, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v19, types: [X.6AF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v6, types: [java.lang.Object, X.6AD] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(float r23) {
        /*
            r22 = this;
            r5 = r22
            X.2dy r4 = r5.A04
            X.2dt r11 = r4.A0f
            X.6B0 r10 = r4.A0a
            X.2e5 r3 = r5.A0B
            X.2e6 r2 = r3.A03
            X.2dt r12 = r2.A00()
            android.graphics.Path r9 = r5.A0A
            X.2e2 r1 = r3.A0E
            float r14 = r1.A00
            float r15 = r3.A00
            r13 = r23
            r16 = r15
            android.graphics.Path r0 = X.AnonymousClass3JX.A03(r9, r10, r11, r12, r13, r14, r15, r16)
            r5.A0A = r0
            X.2dn r8 = r4.A0S
            X.6B0 r7 = r4.A0Z
            if (r8 != 0) goto L_0x0073
            if (r7 != 0) goto L_0x0073
        L_0x002a:
            X.6B8 r15 = r4.A0V
            if (r15 == 0) goto L_0x0164
            android.graphics.Paint r0 = r5.A04
            r7 = 1
            if (r0 != 0) goto L_0x003f
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r7)
            r5.A04 = r6
            android.graphics.ColorFilter r0 = r5.A01
            r6.setColorFilter(r0)
        L_0x003f:
            X.6B0 r0 = r15.A05
            if (r0 != 0) goto L_0x00b4
            X.6B0 r0 = r15.A04
            if (r0 != 0) goto L_0x00b4
            X.6B0 r0 = r15.A02
            if (r0 != 0) goto L_0x00b4
            X.6B0 r0 = r15.A03
            if (r0 != 0) goto L_0x00b4
            android.graphics.Shader r7 = r5.A06
            if (r7 != 0) goto L_0x0156
            float r9 = r3.A00
            float r8 = r1.A00
            X.6AD r14 = r2.A05
            if (r14 != 0) goto L_0x0126
            int r10 = r2.A00
            X.6AD r14 = new X.6AD
            r14.<init>()
            X.2dn[] r7 = new X.2dn[r10]
            r14.A01 = r7
            r6 = 0
        L_0x0067:
            if (r6 >= r10) goto L_0x0122
            X.2dn r0 = new X.2dn
            r0.<init>()
            r7[r6] = r0
            int r6 = r6 + 1
            goto L_0x0067
        L_0x0073:
            android.graphics.Paint r0 = r5.A04
            if (r0 != 0) goto L_0x008b
            r0 = 1
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r0)
            r5.A04 = r6
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r6.setStyle(r0)
            android.graphics.Paint r6 = r5.A04
            android.graphics.ColorFilter r0 = r5.A01
            r6.setColorFilter(r0)
        L_0x008b:
            float r6 = r1.A00
            X.2dn r0 = r2.A04
            if (r0 != 0) goto L_0x0098
            X.2dn r0 = new X.2dn
            r0.<init>()
            r2.A04 = r0
        L_0x0098:
            X.2do r10 = X.AnonymousClass3JW.A00(r8, r0, r7, r13, r6)
            X.2dn r10 = (X.2dn) r10
            if (r10 == 0) goto L_0x002a
            android.graphics.Paint r9 = r5.A04
            int r6 = r10.A00
            int r0 = r5.A01
            int r6 = r6 * r0
            int r8 = r6 / 255
            int r7 = r10.A03
            int r6 = r10.A02
            int r0 = r10.A01
            r9.setARGB(r8, r7, r6, r0)
            goto L_0x002a
        L_0x00b4:
            android.graphics.Shader[] r9 = r5.A09
            if (r9 == 0) goto L_0x0164
            float r0 = r4.A04
            float r6 = r23 - r0
            float r10 = r1.A00
            float r6 = r6 * r10
            float r0 = r1.A01
            float r6 = r6 * r0
            int r6 = (int) r6
            int r0 = r9.length
            int r0 = r0 - r7
            int r12 = java.lang.Math.min(r6, r0)
            r0 = r9[r12]
            if (r0 != 0) goto L_0x011f
            float r8 = r3.A00
            X.6AD r14 = r2.A05
            if (r14 != 0) goto L_0x00ef
            int r11 = r2.A00
            X.6AD r14 = new X.6AD
            r14.<init>()
            X.2dn[] r7 = new X.2dn[r11]
            r14.A01 = r7
            r6 = 0
        L_0x00df:
            if (r6 >= r11) goto L_0x00eb
            X.2dn r0 = new X.2dn
            r0.<init>()
            r7[r6] = r0
            int r6 = r6 + 1
            goto L_0x00df
        L_0x00eb:
            r14.A00 = r11
            r2.A05 = r14
        L_0x00ef:
            X.6AF r7 = r2.A07
            if (r7 != 0) goto L_0x0102
            int r6 = r2.A03
            X.6AF r7 = new X.6AF
            r7.<init>()
            float[] r0 = new float[r6]
            r7.A01 = r0
            r7.A00 = r6
            r2.A07 = r7
        L_0x0102:
            X.3JV r0 = r2.A06
            if (r0 != 0) goto L_0x010d
            X.3JV r0 = new X.3JV
            r0.<init>()
            r2.A06 = r0
        L_0x010d:
            r18 = r13
            r19 = r8
            r20 = r8
            r21 = r10
            r16 = r0
            r17 = r7
            android.graphics.Shader r0 = X.AnonymousClass61V.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            r9[r12] = r0
        L_0x011f:
            r7 = r9[r12]
            goto L_0x0156
        L_0x0122:
            r14.A00 = r10
            r2.A05 = r14
        L_0x0126:
            X.6AF r7 = r2.A07
            if (r7 != 0) goto L_0x0139
            int r6 = r2.A03
            X.6AF r7 = new X.6AF
            r7.<init>()
            float[] r0 = new float[r6]
            r7.A01 = r0
            r7.A00 = r6
            r2.A07 = r7
        L_0x0139:
            X.3JV r0 = r2.A06
            if (r0 != 0) goto L_0x0144
            X.3JV r0 = new X.3JV
            r0.<init>()
            r2.A06 = r0
        L_0x0144:
            r18 = r13
            r19 = r9
            r20 = r9
            r21 = r8
            r16 = r0
            r17 = r7
            android.graphics.Shader r7 = X.AnonymousClass61V.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            r5.A06 = r7
        L_0x0156:
            if (r7 == 0) goto L_0x0164
            android.graphics.Paint r6 = r5.A04
            int r0 = r5.A01
            r6.setAlpha(r0)
            android.graphics.Paint r0 = r5.A04
            r0.setShader(r7)
        L_0x0164:
            X.2dn r0 = r4.A0T
            r10 = 0
            if (r0 != 0) goto L_0x0178
            X.6B0 r0 = r4.A0d
            if (r0 != 0) goto L_0x0178
            float r0 = r4.A09
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0178
            X.6B4 r0 = r4.A0l
            if (r0 != 0) goto L_0x0178
        L_0x0177:
            return
        L_0x0178:
            r0 = 0
            r5.A08 = r0
            float r7 = r4.A09
            X.6B4 r6 = r4.A0l
            float r0 = r1.A00
            float r6 = X.AnonymousClass3JU.A00(r6, r7, r13, r0)
            float r0 = r3.A00
            float r6 = r6 * r0
            r5.A00 = r6
            r7 = 1
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0192
            r5.A08 = r7
            return
        L_0x0192:
            android.graphics.Paint r0 = r5.A05
            if (r0 != 0) goto L_0x01c3
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r7)
            r5.A05 = r6
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r0)
            android.graphics.Paint r7 = r5.A05
            android.graphics.Paint$Cap[] r6 = android.graphics.Paint.Cap.values()
            byte r0 = r4.A00
            r0 = r6[r0]
            r7.setStrokeCap(r0)
            android.graphics.Paint r7 = r5.A05
            android.graphics.Paint$Join[] r6 = android.graphics.Paint.Join.values()
            byte r0 = r4.A01
            r0 = r6[r0]
            r7.setStrokeJoin(r0)
            android.graphics.Paint r6 = r5.A05
            android.graphics.ColorFilter r0 = r5.A01
            r6.setColorFilter(r0)
        L_0x01c3:
            android.graphics.Paint r6 = r5.A05
            float r0 = r5.A00
            r6.setStrokeWidth(r0)
            X.2dn r8 = r4.A0T
            X.6B0 r7 = r4.A0d
            float r6 = r1.A00
            X.2dn r0 = r2.A04
            if (r0 != 0) goto L_0x01db
            X.2dn r0 = new X.2dn
            r0.<init>()
            r2.A04 = r0
        L_0x01db:
            X.2do r9 = X.AnonymousClass3JW.A00(r8, r0, r7, r13, r6)
            X.2dn r9 = (X.2dn) r9
            if (r9 == 0) goto L_0x01f5
            android.graphics.Paint r8 = r5.A05
            int r2 = r9.A00
            int r0 = r5.A01
            int r2 = r2 * r0
            int r7 = r2 / 255
            int r6 = r9.A03
            int r2 = r9.A02
            int r0 = r9.A01
            r8.setARGB(r7, r6, r2, r0)
        L_0x01f5:
            float r6 = r4.A05
            X.6B4 r2 = r4.A0i
            float r0 = r1.A00
            float r1 = X.AnonymousClass3JU.A00(r2, r6, r13, r0)
            float r0 = r3.A00
            float r1 = r1 * r0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0177
            android.graphics.Paint r0 = r5.A05
            r0.setStrokeMiter(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71592eC.A09(float):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r3.A08 == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r1 != null) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(android.graphics.Canvas r4) {
        /*
            r3 = this;
            android.graphics.Path r2 = r3.A0A
            if (r2 == 0) goto L_0x002f
            X.2dy r0 = r3.A04
            byte r0 = r0.A03
            if (r0 != 0) goto L_0x0030
            android.graphics.Paint r0 = r3.A04
            if (r0 == 0) goto L_0x0011
            r4.drawPath(r2, r0)
        L_0x0011:
            android.graphics.Paint r1 = r3.A05
            if (r1 == 0) goto L_0x001e
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x001e
        L_0x0019:
            android.graphics.Path r0 = r3.A0A
            r4.drawPath(r0, r1)
        L_0x001e:
            X.6BC r0 = r3.A07
            if (r0 == 0) goto L_0x002f
            android.graphics.Matrix r2 = r3.A02
            if (r2 == 0) goto L_0x002f
            android.graphics.Paint r1 = r3.A03
            if (r1 == 0) goto L_0x002f
            android.graphics.Bitmap r0 = r0.A00
            r4.drawBitmap(r0, r2, r1)
        L_0x002f:
            return
        L_0x0030:
            android.graphics.Paint r1 = r3.A05
            if (r1 == 0) goto L_0x003b
            boolean r0 = r3.A08
            if (r0 != 0) goto L_0x003b
            r4.drawPath(r2, r1)
        L_0x003b:
            android.graphics.Paint r1 = r3.A04
            if (r1 == 0) goto L_0x001e
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71592eC.A0A(android.graphics.Canvas):void");
    }

    public final void ESG(ColorFilter colorFilter) {
        if (this.A01 != colorFilter) {
            this.A01 = colorFilter;
            Paint paint = this.A04;
            if (paint != null) {
                paint.setColorFilter(colorFilter);
            }
            Paint paint2 = this.A05;
            if (paint2 != null) {
                paint2.setColorFilter(colorFilter);
            }
        }
    }
}
