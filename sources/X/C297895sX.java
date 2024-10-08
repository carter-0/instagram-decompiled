package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.5sX  reason: invalid class name and case insensitive filesystem */
public final class C297895sX {
    public C297935sb A00;
    public C297935sb A01;
    public C297935sb A02;
    public C297935sb A03;
    public C297915sZ A04;
    public C297915sZ A05;
    public C297915sZ A06;
    public C297915sZ A07;
    public C297945sc A08;
    public C297945sc A09;
    public C297945sc A0A;
    public C297945sc A0B;

    public static C324126yg A01(Context context, AttributeSet attributeSet, int i, int i2) {
        C297925sa r4 = new C297925sa(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A0Q, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return A02(context, r4, resourceId, resourceId2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: X.5sZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: X.5sZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C324126yg A02(android.content.Context r11, X.C297935sb r12, int r13, int r14) {
        /*
            if (r14 == 0) goto L_0x0009
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r11, r13)
            r13 = r14
            r11 = r0
        L_0x0009:
            int[] r0 = X.C297865sU.A0W
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r13, r0)
            r0 = 0
            int r1 = r6.getInt(r0, r0)     // Catch:{ all -> 0x009c }
            r0 = 3
            int r11 = r6.getInt(r0, r1)     // Catch:{ all -> 0x009c }
            r0 = 4
            int r10 = r6.getInt(r0, r1)     // Catch:{ all -> 0x009c }
            r0 = 2
            int r9 = r6.getInt(r0, r1)     // Catch:{ all -> 0x009c }
            r8 = 1
            int r7 = r6.getInt(r8, r1)     // Catch:{ all -> 0x009c }
            r0 = 5
            X.5sb r1 = A00(r6, r12, r0)     // Catch:{ all -> 0x009c }
            r0 = 8
            X.5sb r5 = A00(r6, r1, r0)     // Catch:{ all -> 0x009c }
            r0 = 9
            X.5sb r4 = A00(r6, r1, r0)     // Catch:{ all -> 0x009c }
            r0 = 7
            X.5sb r3 = A00(r6, r1, r0)     // Catch:{ all -> 0x009c }
            r0 = 6
            X.5sb r2 = A00(r6, r1, r0)     // Catch:{ all -> 0x009c }
            X.6yg r1 = new X.6yg     // Catch:{ all -> 0x009c }
            r1.<init>()     // Catch:{ all -> 0x009c }
            if (r11 == 0) goto L_0x004d
            if (r11 != r8) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            X.5sY r0 = new X.5sY     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
            goto L_0x0058
        L_0x0053:
            X.UWS r0 = new X.UWS     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
        L_0x0058:
            r1.A06 = r0     // Catch:{ all -> 0x009c }
            r1.A02 = r5     // Catch:{ all -> 0x009c }
            if (r10 == 0) goto L_0x0061
            if (r10 != r8) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            X.5sY r0 = new X.5sY     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
            goto L_0x006c
        L_0x0067:
            X.UWS r0 = new X.UWS     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
        L_0x006c:
            r1.A07 = r0     // Catch:{ all -> 0x009c }
            r1.A03 = r4     // Catch:{ all -> 0x009c }
            if (r9 == 0) goto L_0x0075
            if (r9 != r8) goto L_0x0075
            goto L_0x007b
        L_0x0075:
            X.5sY r0 = new X.5sY     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
            goto L_0x0080
        L_0x007b:
            X.UWS r0 = new X.UWS     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
        L_0x0080:
            r1.A05 = r0     // Catch:{ all -> 0x009c }
            r1.A01 = r3     // Catch:{ all -> 0x009c }
            if (r7 == 0) goto L_0x0089
            if (r7 != r8) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            X.5sY r0 = new X.5sY     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
            goto L_0x0094
        L_0x008f:
            X.UWS r0 = new X.UWS     // Catch:{ all -> 0x009c }
            r0.<init>()     // Catch:{ all -> 0x009c }
        L_0x0094:
            r1.A04 = r0     // Catch:{ all -> 0x009c }
            r1.A00 = r2     // Catch:{ all -> 0x009c }
            r6.recycle()
            return r1
        L_0x009c:
            r0 = move-exception
            r6.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297895sX.A02(android.content.Context, X.5sb, int, int):X.6yg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r5.A01.ArV(r6) != r1) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0072, code lost:
        if ((r5.A04 instanceof X.C297905sY) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if (r5.A08.getClass().equals(r1) == false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(android.graphics.RectF r6) {
        /*
            r5 = this;
            X.5sc r0 = r5.A09
            java.lang.Class r0 = r0.getClass()
            java.lang.Class<X.5sc> r1 = X.C297945sc.class
            boolean r0 = r0.equals(r1)
            r4 = 1
            if (r0 == 0) goto L_0x0034
            X.5sc r0 = r5.A0A
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            X.5sc r0 = r5.A0B
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            X.5sc r0 = r5.A08
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.equals(r1)
            r3 = 1
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            X.5sb r0 = r5.A02
            float r1 = r0.ArV(r6)
            X.5sb r0 = r5.A03
            float r0 = r0.ArV(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            X.5sb r0 = r5.A00
            float r0 = r0.ArV(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005a
            X.5sb r0 = r5.A01
            float r0 = r0.ArV(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            X.5sZ r0 = r5.A07
            boolean r0 = r0 instanceof X.C297905sY
            if (r0 == 0) goto L_0x0074
            X.5sZ r0 = r5.A06
            boolean r0 = r0 instanceof X.C297905sY
            if (r0 == 0) goto L_0x0074
            X.5sZ r0 = r5.A05
            boolean r0 = r0 instanceof X.C297905sY
            if (r0 == 0) goto L_0x0074
            X.5sZ r0 = r5.A04
            boolean r1 = r0 instanceof X.C297905sY
            r0 = 1
            if (r1 != 0) goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r3 == 0) goto L_0x007c
            if (r2 == 0) goto L_0x007c
            if (r0 == 0) goto L_0x007c
            return r4
        L_0x007c:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C297895sX.A03(android.graphics.RectF):boolean");
    }

    public C297895sX(C324126yg r2) {
        this.A06 = r2.A06;
        this.A07 = r2.A07;
        this.A05 = r2.A05;
        this.A04 = r2.A04;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A01 = r2.A01;
        this.A00 = r2.A00;
        this.A0B = r2.A0B;
        this.A0A = r2.A0A;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
    }

    public static C297935sb A00(TypedArray typedArray, C297935sb r4, int i) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return r4;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C297925sa((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new C324136yh(peekValue.getFraction(1.0f, 1.0f));
        }
        return r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.5sZ] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.5sZ] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.5sZ] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.5sZ] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.5sc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v9, types: [X.5sc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.5sc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.5sc, java.lang.Object] */
    public C297895sX() {
        this.A06 = new Object();
        this.A07 = new Object();
        this.A05 = new Object();
        this.A04 = new Object();
        this.A02 = new C297925sa(0.0f);
        this.A03 = new C297925sa(0.0f);
        this.A01 = new C297925sa(0.0f);
        this.A00 = new C297925sa(0.0f);
        this.A0B = new Object();
        this.A0A = new Object();
        this.A08 = new Object();
        this.A09 = new Object();
    }
}
