package X;

import java.util.NoSuchElementException;

/* renamed from: X.UHs  reason: case insensitive filesystem */
public abstract class C14974UHs extends C20383WqP {
    public Integer A00 = AnonymousClass05K.A01;
    public Object A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: X.UHq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.UHp} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: X.UHq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.UHq} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r0 == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x002f, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x002f, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x002f, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012f, code lost:
        if (r3.isBeforeFirst() != false) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0131, code lost:
        r3.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0138, code lost:
        if (r3.isAfterLast() != false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0144, code lost:
        if (r3.getInt(r3.getColumnIndexOrThrow("deleted")) == 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014b, code lost:
        if (r3.isAfterLast() != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014d, code lost:
        r2 = r3.getColumnIndexOrThrow("contact_id");
        r1 = java.lang.String.valueOf(r3.getLong(r2));
        r4 = new X.C17916Vi7(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0164, code lost:
        if (r3.isAfterLast() != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0170, code lost:
        if (r3.getInt(r3.getColumnIndexOrThrow("deleted")) == 0) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0172, code lost:
        r3.moveToNext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017a, code lost:
        if (r3.isAfterLast() != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0188, code lost:
        if (java.lang.String.valueOf(r3.getLong(r2)).equals(r1) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018a, code lost:
        r5 = r3.getString(r3.getColumnIndexOrThrow("mimetype"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x019e, code lost:
        if (X.AnonymousClass000.A00(4211).equals(r5) == false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a0, code lost:
        r6 = r3.getString(r3.getColumnIndexOrThrow("data1"));
        r3.getInt(r3.getColumnIndexOrThrow("data2"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01b3, code lost:
        if (r6 == null) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b9, code lost:
        if (r6.isEmpty() != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bb, code lost:
        r5 = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c1, code lost:
        if (r5.contains(r6) != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01c3, code lost:
        r5.add(r6);
        r4.A06.add(new java.lang.Object());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d4, code lost:
        if (r3.moveToNext() != false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e2, code lost:
        if (X.AnonymousClass000.A00(4210).equals(r5) == false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e4, code lost:
        r5 = r3.getString(r3.getColumnIndexOrThrow("data1"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ee, code lost:
        if (r5 == null) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01f4, code lost:
        if (r5.isEmpty() != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        r4.A05.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0206, code lost:
        if (X.AnonymousClass000.A00(1930).equals(r5) == false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0208, code lost:
        r4.A01 = r3.getString(r3.getColumnIndexOrThrow("data1"));
        r4.A02 = r3.getString(r3.getColumnIndexOrThrow("data2"));
        r4.A03 = r3.getString(r3.getColumnIndexOrThrow("data3"));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x025c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean hasNext() {
        /*
            r9 = this;
            java.lang.Integer r0 = r9.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A0N
            r2 = 0
            r7 = 1
            r1 = 2
            if (r0 == r3) goto L_0x0260
            int r0 = r0.intValue()
            if (r0 == r1) goto L_0x025f
            if (r0 == r2) goto L_0x025e
            r9.A00 = r3
            r4 = r9
            boolean r0 = r9 instanceof X.C14971UHp
            if (r0 == 0) goto L_0x0123
            X.UHp r4 = (X.C14971UHp) r4
            X.Vj9 r6 = r4.A04
            boolean r0 = r6.A01()
            if (r0 != 0) goto L_0x003d
            X.Vj9 r0 = r4.A05
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x003d
        L_0x002a:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r4.A00 = r0
        L_0x002e:
            r4 = 0
        L_0x002f:
            r9.A01 = r4
            java.lang.Integer r1 = r9.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x025c
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r9.A00 = r0
            r0 = 1
            return r0
        L_0x003d:
            boolean r0 = r6.A01()
            r1 = 0
            if (r0 == 0) goto L_0x0086
            X.X2M r2 = r4.A02
            boolean r0 = r6.A01
            if (r0 != 0) goto L_0x0054
            java.util.Iterator r0 = r6.A02
            java.lang.Object r0 = r0.next()
            r6.A00 = r0
            r6.A01 = r7
        L_0x0054:
            java.lang.Object r0 = r6.A00
            java.lang.Long r5 = r2.AU3(r0)
            java.lang.Object r2 = r4.A00
            if (r2 == 0) goto L_0x0087
            java.util.Comparator r0 = r4.A06
            int r0 = r0.compare(r5, r2)
            boolean r3 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r0 = "Left iterator keys must be strictly ascending. ("
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.Object r0 = r4.A00
            r2.append(r0)
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r2)
            if (r3 != 0) goto L_0x0087
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0086:
            r5 = r1
        L_0x0087:
            X.Vj9 r3 = r4.A05
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x00d1
            X.X2M r2 = r4.A03
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x009f
            java.util.Iterator r0 = r3.A02
            java.lang.Object r0 = r0.next()
            r3.A00 = r0
            r3.A01 = r7
        L_0x009f:
            java.lang.Object r0 = r3.A00
            java.lang.Long r2 = r2.AU3(r0)
            java.lang.Object r7 = r4.A01
            if (r7 == 0) goto L_0x00d2
            java.util.Comparator r0 = r4.A06
            int r0 = r0.compare(r2, r7)
            boolean r8 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r0 = "Right iterator keys must be strictly ascending. ("
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.Object r0 = r4.A01
            r7.append(r0)
            java.lang.String r0 = " "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r2, r0, r7)
            if (r8 != 0) goto L_0x00d2
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00d1:
            r2 = r1
        L_0x00d2:
            boolean r0 = r6.A01()
            if (r0 != 0) goto L_0x00e9
            boolean r0 = r3.A01()
            if (r0 == 0) goto L_0x00e9
        L_0x00de:
            java.lang.Object r0 = r3.A00()
            X.VQb r4 = new X.VQb
            r4.<init>(r1, r0)
            goto L_0x002f
        L_0x00e9:
            boolean r0 = r6.A01()
            if (r0 == 0) goto L_0x0100
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x0100
            java.lang.Object r0 = r6.A00()
            X.VQb r4 = new X.VQb
            r4.<init>(r0, r1)
            goto L_0x002f
        L_0x0100:
            java.util.Comparator r0 = r4.A06
            int r0 = r0.compare(r5, r2)
            if (r0 <= 0) goto L_0x010b
            r4.A01 = r2
            goto L_0x00de
        L_0x010b:
            if (r0 >= 0) goto L_0x011a
            r4.A00 = r5
            java.lang.Object r0 = r6.A00()
            X.VQb r4 = new X.VQb
            r4.<init>(r0, r1)
            goto L_0x002f
        L_0x011a:
            r4.A01 = r2
            r4.A00 = r5
            java.lang.Object r1 = r6.A00()
            goto L_0x00de
        L_0x0123:
            boolean r0 = r9 instanceof X.C14972UHq
            if (r0 == 0) goto L_0x022d
            X.UHq r4 = (X.C14972UHq) r4
            android.database.Cursor r3 = r4.A00
            boolean r0 = r3.isBeforeFirst()
            if (r0 == 0) goto L_0x0134
        L_0x0131:
            r3.moveToNext()
        L_0x0134:
            boolean r0 = r3.isAfterLast()
            if (r0 != 0) goto L_0x0147
            java.lang.String r0 = "deleted"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            if (r0 == 0) goto L_0x0147
            goto L_0x0131
        L_0x0147:
            boolean r0 = r3.isAfterLast()
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "contact_id"
            int r2 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r2)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            X.Vi7 r4 = new X.Vi7
            r4.<init>(r1)
        L_0x0160:
            boolean r0 = r3.isAfterLast()
            if (r0 != 0) goto L_0x0176
            java.lang.String r0 = "deleted"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            if (r0 == 0) goto L_0x0176
            r3.moveToNext()
            goto L_0x0160
        L_0x0176:
            boolean r0 = r3.isAfterLast()
            if (r0 != 0) goto L_0x002f
            long r5 = r3.getLong(r2)
            java.lang.String r0 = java.lang.String.valueOf(r5)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002f
            java.lang.String r0 = "mimetype"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r5 = r3.getString(r0)
            r0 = 4211(0x1073, float:5.901E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01d8
            java.lang.String r0 = "data1"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r6 = r3.getString(r0)
            java.lang.String r0 = "data2"
            int r0 = r3.getColumnIndexOrThrow(r0)
            r3.getInt(r0)
            if (r6 == 0) goto L_0x01d0
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01d0
            java.util.Set r5 = r4.A07
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L_0x01d0
            r5.add(r6)
            java.util.Set r5 = r4.A06
            X.V5c r0 = new X.V5c
            r0.<init>()
            r5.add(r0)
        L_0x01d0:
            boolean r0 = r3.moveToNext()
            if (r0 != 0) goto L_0x0160
            goto L_0x002f
        L_0x01d8:
            r0 = 4210(0x1072, float:5.9E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01fc
            java.lang.String r0 = "data1"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r5 = r3.getString(r0)
            if (r5 == 0) goto L_0x01d0
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01d0
            java.util.Set r0 = r4.A05
            r0.add(r5)
            goto L_0x01d0
        L_0x01fc:
            r0 = 1930(0x78a, float:2.705E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01d0
            java.lang.String r0 = "data1"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r3.getString(r0)
            r4.A01 = r0
            java.lang.String r0 = "data2"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r3.getString(r0)
            r4.A02 = r0
            java.lang.String r0 = "data3"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r3.getString(r0)
            r4.A03 = r0
            goto L_0x01d0
        L_0x022d:
            X.UHr r4 = (X.C14973UHr) r4
            android.database.Cursor r3 = r4.A02
            boolean r0 = r3.isBeforeFirst()
            if (r0 == 0) goto L_0x023a
            r3.moveToNext()
        L_0x023a:
            boolean r0 = r3.isAfterLast()
            if (r0 == 0) goto L_0x0246
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r4.A00 = r0
            goto L_0x002e
        L_0x0246:
            int r0 = r4.A01
            long r1 = r3.getLong(r0)
            int r0 = r4.A00
            java.lang.String r0 = r3.getString(r0)
            X.VUY r4 = new X.VUY
            r4.<init>(r1, r0)
            r3.moveToNext()
            goto L_0x002f
        L_0x025c:
            r0 = 0
            return r0
        L_0x025e:
            return r7
        L_0x025f:
            return r2
        L_0x0260:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14974UHs.hasNext():boolean");
    }

    public final Object next() {
        if (hasNext()) {
            this.A00 = AnonymousClass05K.A01;
            return this.A01;
        }
        throw new NoSuchElementException();
    }
}
