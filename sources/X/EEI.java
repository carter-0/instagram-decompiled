package X;

public final class EEI extends C252233om {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public EEI(C307896Rx r1, C277014uI r2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
                this.A02 = r2;
                this.A01 = r1;
                break;
            case 1:
                this.A01 = r2;
                this.A02 = r1;
                break;
            case 3:
                this.A02 = r1;
                this.A01 = r2;
                break;
            default:
                this.A01 = r1;
                this.A02 = r2;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        r1 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        r1 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r1 = (X.C307896Rx) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        X.C308206Td.A0L(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x007c;
                case 1: goto L_0x002f;
                case 2: goto L_0x0026;
                case 3: goto L_0x0096;
                case 4: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onActivityResult(r6, r7, r8)
        L_0x0008:
            return
        L_0x0009:
            r0 = -1
            if (r7 != r0) goto L_0x0091
            r0 = 32779(0x800b, float:4.5933E-41)
            if (r6 != r0) goto L_0x0091
            java.lang.Object r3 = r5.A01
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r5.A02
            X.4uI r2 = (X.C277014uI) r2
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.6Tm r0 = new X.6Tm
            r0.<init>(r1)
            X.C299275ur.A00(r3, r0, r2)
            goto L_0x0091
        L_0x0026:
            java.lang.Object r1 = r5.A01
            X.36O r1 = (X.AnonymousClass36O) r1
            r0 = 0
            r1.A08(r8, r6, r7, r0)
            goto L_0x0079
        L_0x002f:
            r0 = -1
            if (r7 != r0) goto L_0x0079
            r0 = 32779(0x800b, float:4.5933E-41)
            if (r6 != r0) goto L_0x0079
            if (r8 == 0) goto L_0x0079
            r0 = 131(0x83, float:1.84E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r0 = r8.getSerializableExtra(r0)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            X.6Tl r4 = X.DbS.A0P()
            if (r0 == 0) goto L_0x006c
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r0)
        L_0x0053:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0069
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r3.put(r1, r0)
            goto L_0x0053
        L_0x0069:
            r4.A01(r3)
        L_0x006c:
            java.lang.Object r2 = r5.A01
            X.4uI r2 = (X.C277014uI) r2
            X.6Tm r1 = r4.A00()
            java.lang.Object r0 = r5.A02
            X.DbS.A1R(r1, r2, r0)
        L_0x0079:
            java.lang.Object r1 = r5.A02
            goto L_0x0093
        L_0x007c:
            r0 = 10
            if (r6 == r0) goto L_0x0084
            r0 = 9
            if (r6 != r0) goto L_0x0091
        L_0x0084:
            java.lang.Object r1 = r5.A02
            X.4uI r1 = (X.C277014uI) r1
            if (r1 == 0) goto L_0x0091
            java.lang.Object r0 = r5.A01
            X.6Rx r0 = (X.C307896Rx) r0
            X.DbS.A1Q(r0, r1)
        L_0x0091:
            java.lang.Object r1 = r5.A01
        L_0x0093:
            X.6Rx r1 = (X.C307896Rx) r1
            goto L_0x00a5
        L_0x0096:
            r0 = 2884(0xb44, float:4.041E-42)
            if (r6 != r0) goto L_0x0008
            java.lang.Object r1 = r5.A02
            X.6Rx r1 = (X.C307896Rx) r1
            java.lang.Object r0 = r5.A01
            X.4uI r0 = (X.C277014uI) r0
            X.C49745F4k.A01(r8, r1, r0, r7)
        L_0x00a5:
            X.C308206Td.A0L(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEI.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onDestroyView() {
        Object obj;
        switch (this.A00) {
            case 1:
            case 2:
            case 3:
                obj = this.A02;
                break;
            case 4:
                obj = this.A01;
                break;
            case 5:
                UDU udu = (UDU) this.A02;
                AnonymousClass6NS r0 = udu.A00;
                if (r0 != null) {
                    r0.A04();
                }
                udu.A01 = null;
                udu.A00 = null;
                ((C229382nI) this.A01).A06(this);
                return;
            default:
                super.onDestroyView();
                return;
        }
        C308206Td.A0L((C307896Rx) obj, this);
    }

    public EEI(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }
}
