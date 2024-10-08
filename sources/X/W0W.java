package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public abstract class W0W {
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x008d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x008d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C17399VUa A00(X.0kX r16, java.util.List r17) {
        /*
            if (r17 == 0) goto L_0x0144
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x0144
            int r0 = r17.size()
            X.Vu8[] r4 = new X.C18556Vu8[r0]
            X.VLQ[] r3 = new X.VLQ[r0]
            r15 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r14 = r17.iterator()
        L_0x001a:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r6 = r14.next()
            X.VsN r6 = (X.C18471VsN) r6
            java.lang.String r0 = r6.A02
            java.lang.String r7 = X.W2K.A00(r0)
            java.lang.String r2 = r6.A00
            if (r2 == 0) goto L_0x0133
            if (r7 == 0) goto L_0x0133
            X.VLQ r9 = new X.VLQ
            r9.<init>()
            java.util.List r0 = r6.A03
            if (r0 == 0) goto L_0x00ef
            java.util.Iterator r13 = r0.iterator()
        L_0x003f:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00ef
            java.lang.Object r0 = r13.next()
            X.VUc r0 = (X.VUc) r0
            java.lang.String r10 = r0.A00
            java.lang.String r8 = r0.A01
            java.util.List r2 = r0.A02
            if (r10 == 0) goto L_0x012b
            if (r8 == 0) goto L_0x0123
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = r10.toLowerCase(r0)
            r12 = 0
            int r11 = r8.hashCode()
            r10 = 1
            switch(r11) {
                case 3392903: goto L_0x00db;
                case 104980213: goto L_0x00de;
                case 1509016093: goto L_0x00e1;
                default: goto L_0x0064;
            }
        L_0x0064:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
        L_0x0068:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0079
            X.WGw r10 = new X.WGw
            r10.<init>(r1, r8, r2)
        L_0x0073:
            java.util.List r0 = r9.A00
            r0.add(r10)
            goto L_0x003f
        L_0x0079:
            java.lang.String r0 = "same"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0087
            X.WGv r10 = new X.WGv
            r10.<init>(r1, r2)
            goto L_0x0073
        L_0x0087:
            switch(r11) {
                case 3244: goto L_0x00b2;
                case 3309: goto L_0x00b5;
                case 3464: goto L_0x00b8;
                case 98322: goto L_0x00bb;
                case 98694: goto L_0x00be;
                case 102680: goto L_0x00c1;
                case 107485: goto L_0x00c4;
                case 108954: goto L_0x00c7;
                case 109854: goto L_0x00ca;
                case 110226: goto L_0x00cd;
                default: goto L_0x008a;
            }
        L_0x008a:
            switch(r11) {
                case -567445985: goto L_0x009b;
                case 3365: goto L_0x009e;
                case 109075: goto L_0x00a1;
                case 108392519: goto L_0x00a4;
                default: goto L_0x008d;
            }
        L_0x008d:
            java.lang.String r0 = ","
            java.lang.String r2 = X.002.A0g(r1, r0, r8)
            java.lang.String r0 = "Unknown bucket definition"
            X.V1q r1 = new X.V1q
            r1.<init>(r0, r2)
            throw r1
        L_0x009b:
            java.lang.String r0 = "contains"
            goto L_0x00a6
        L_0x009e:
            java.lang.String r0 = "in"
            goto L_0x00a6
        L_0x00a1:
            java.lang.String r0 = "nin"
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r0 = "regex"
        L_0x00a6:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008d
            X.WGy r10 = new X.WGy
            r10.<init>(r1, r8, r2)
            goto L_0x0073
        L_0x00b2:
            java.lang.String r0 = "eq"
            goto L_0x00cf
        L_0x00b5:
            java.lang.String r0 = "gt"
            goto L_0x00cf
        L_0x00b8:
            java.lang.String r0 = "lt"
            goto L_0x00cf
        L_0x00bb:
            java.lang.String r0 = "ccr"
            goto L_0x00cf
        L_0x00be:
            java.lang.String r0 = "cor"
            goto L_0x00cf
        L_0x00c1:
            java.lang.String r0 = "gte"
            goto L_0x00cf
        L_0x00c4:
            java.lang.String r0 = "lte"
            goto L_0x00cf
        L_0x00c7:
            java.lang.String r0 = "neq"
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r0 = "ocr"
            goto L_0x00cf
        L_0x00cd:
            java.lang.String r0 = "oor"
        L_0x00cf:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008a
            X.WGx r10 = new X.WGx
            r10.<init>(r1, r8, r2)
            goto L_0x0073
        L_0x00db:
            java.lang.String r0 = "null"
            goto L_0x00e3
        L_0x00de:
            java.lang.String r0 = "nnull"
            goto L_0x00e3
        L_0x00e1:
            java.lang.String r0 = "catch_all"
        L_0x00e3:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0064
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            goto L_0x0068
        L_0x00ef:
            r3[r15] = r9
            java.lang.String r1 = r6.A01
            if (r1 == 0) goto L_0x0119
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0119
            java.lang.String r2 = r6.A00
            X.W2K r0 = new X.W2K
            r0.<init>(r7, r1)
            X.Vu8 r1 = new X.Vu8
            r1.<init>((X.W2K) r0, (java.lang.String) r2)
        L_0x0107:
            r4[r15] = r1
            if (r15 <= 0) goto L_0x0110
            java.lang.String r0 = ", "
            r5.append(r0)
        L_0x0110:
            java.lang.String r0 = r6.A00
            r5.append(r0)
            int r15 = r15 + 1
            goto L_0x001a
        L_0x0119:
            java.lang.String r0 = r6.A00
            X.Vu8 r1 = new X.Vu8
            r2 = r16
            r1.<init>((X.0kX) r2, (java.lang.String) r0)
            goto L_0x0107
        L_0x0123:
            java.lang.String r0 = "Missing bucket strategy"
            X.V1q r1 = new X.V1q
            r1.<init>(r0, r10)
            throw r1
        L_0x012b:
            java.lang.String r0 = "Missing bucket name"
            X.V1q r1 = new X.V1q
            r1.<init>(r0)
            throw r1
        L_0x0133:
            java.lang.String r0 = "Bad context identifier"
            X.V1q r1 = new X.V1q
            r1.<init>(r0, r2)
            throw r1
        L_0x013b:
            r5.toString()
            X.VUa r0 = new X.VUa
            r0.<init>(r3, r4)
            return r0
        L_0x0144:
            java.lang.String r0 = "Missing context in config"
            X.V1q r1 = new X.V1q
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W0W.A00(X.0kX, java.util.List):X.VUa");
    }

    public static C17400VUb A01(List list) {
        String str;
        if (list == null || list.size() == 0) {
            throw new Exception("Missing outputs field definition");
        }
        int size = list.size();
        String[] strArr = new String[size];
        HashMap hashMap = new HashMap(size);
        int i = 0;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            VUd vUd = (VUd) it.next();
            String str2 = vUd.A02;
            if (str2 == null || (str = vUd.A01) == null) {
                throw new C16687V1q("Missing output field", vUd.A01);
            }
            strArr[i] = W2K.A00(str2);
            C66581MXm.A1S(str, hashMap, i);
            if (strArr[i] != null) {
                i++;
            } else {
                throw new C16687V1q("Bad output type", vUd.A02);
            }
        }
        return new C17400VUb(hashMap, strArr);
    }

    public static HashMap A02(C17400VUb vUb, List list, W2K[] w2kArr) {
        int intValue;
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C17301VQc vQc = (C17301VQc) it.next();
                int i = vUb.A00;
                W2K[] w2kArr2 = new W2K[i];
                List<C17302VQd> list2 = vQc.A01;
                if (list2 == null) {
                    throw new Exception("Missing table item values");
                } else if (vQc.A00 != null) {
                    for (C17302VQd vQd : list2) {
                        Number A14 = C51966G9m.A14(vQd.A00, vUb.A01);
                        if (A14 == null || (intValue = A14.intValue()) >= i) {
                            throw new C16687V1q("Undeclared output param", vQd.A00);
                        }
                        w2kArr2[intValue] = new W2K(vUb.A02[intValue], vQd.A01);
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        if (w2kArr2[i2] == null) {
                            w2kArr2[i2] = w2kArr[i2];
                        }
                    }
                    hashMap.put(vQc.A00.toLowerCase(Locale.US), w2kArr2);
                } else {
                    throw new Exception("Missing table item bucket");
                }
            }
            return hashMap;
        }
        throw new Exception("Missing table");
    }

    public static W2K[] A03(C17400VUb vUb, List list) {
        int i;
        int intValue;
        if (list == null || list.size() != (i = vUb.A00)) {
            throw new Exception("Missing default value");
        }
        W2K[] w2kArr = new W2K[i];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C17302VQd vQd = (C17302VQd) it.next();
            Number A14 = C51966G9m.A14(vQd.A00, vUb.A01);
            if (A14 == null || (intValue = A14.intValue()) >= i) {
                throw new C16687V1q("Undeclared output param", vQd.A00);
            }
            w2kArr[intValue] = new W2K(vUb.A02[intValue], vQd.A01);
        }
        int i2 = 0;
        while (i2 < i) {
            if (w2kArr[i2] != null) {
                i2++;
            } else {
                throw new Exception("Missing default value");
            }
        }
        return w2kArr;
    }
}
