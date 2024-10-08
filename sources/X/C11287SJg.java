package X;

/* renamed from: X.SJg  reason: case insensitive filesystem */
public abstract class C11287SJg {
    public static Object A01(16F r4, C268894eF r5) {
        Class cls = r5.A00;
        16L A10 = r4.A10();
        if (A10 == null) {
            return null;
        }
        int ordinal = A10.ordinal();
        if (ordinal != 7) {
            if (ordinal != 8) {
                if (ordinal != 9) {
                    if (ordinal != 10) {
                        if (ordinal != 11 || !cls.isAssignableFrom(Boolean.class)) {
                            return null;
                        }
                        return Boolean.FALSE;
                    } else if (cls.isAssignableFrom(Boolean.class)) {
                        return Boolean.TRUE;
                    } else {
                        return null;
                    }
                } else if (cls.isAssignableFrom(Double.class)) {
                    return Double.valueOf(r4.A0g());
                } else {
                    return null;
                }
            } else if (cls.isAssignableFrom(Integer.class)) {
                return Integer.valueOf(r4.A0i());
            } else {
                return null;
            }
        } else if (cls.isAssignableFrom(String.class)) {
            return r4.A1P();
        } else {
            return null;
        }
    }

    public final C11287SJg A02(C13901TjO tjO) {
        C8221QkU qkU;
        if (this instanceof C8224QkX) {
            C8225QkY qkY = (C8225QkY) this;
            if (tjO != qkY.A01) {
                return new C8225QkY(tjO, qkY);
            }
            return qkY;
        }
        C8223QkW qkW = (C8223QkW) this;
        if (qkW instanceof C8220QkT) {
            C13901TjO tjO2 = qkW.A01;
            qkU = qkW;
            if (tjO != tjO2) {
                return new C8225QkY(tjO, qkW);
            }
        } else if (qkW instanceof C8222QkV) {
            C8222QkV qkV = (C8222QkV) qkW;
            if (qkV instanceof C8221QkU) {
                C8221QkU qkU2 = (C8221QkU) qkV;
                C13901TjO tjO3 = qkU2.A01;
                qkU = qkU2;
                if (tjO != tjO3) {
                    return new C8221QkU(tjO, qkU2);
                }
            } else {
                C13901TjO tjO4 = qkV.A01;
                qkU = qkV;
                if (tjO != tjO4) {
                    return new C8222QkV(tjO, qkV);
                }
            }
        } else {
            C13901TjO tjO5 = qkW.A01;
            qkU = qkW;
            if (tjO != tjO5) {
                return new C8225QkY(tjO, qkW);
            }
        }
        return qkU;
    }

    public final Object A03(16F r3, C269674fV r4) {
        if (this instanceof C8224QkX) {
            return ((C8224QkX) this).A09(r3, r4);
        }
        C8223QkW qkW = (C8223QkW) this;
        if (!(qkW instanceof C8222QkV) || r3.A19(16L.A0C)) {
            return qkW.A09(r3, r4);
        }
        return qkW.A05(r3, r4);
    }

    public final Object A04(16F r2, C269674fV r3) {
        if (this instanceof C8224QkX) {
            return ((C8224QkX) this).A09(r2, r3);
        }
        return ((C8223QkW) this).A09(r2, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0137, code lost:
        if (r3 != X.16L.A0A) goto L_0x0139;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.16F r11, X.C269674fV r12) {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C8224QkX
            if (r0 == 0) goto L_0x000c
            r0 = r10
            X.QkX r0 = (X.C8224QkX) r0
            java.lang.Object r0 = r0.A09(r11, r12)
            return r0
        L_0x000c:
            r5 = r10
            X.QkW r5 = (X.C8223QkW) r5
            boolean r0 = r5 instanceof X.C8222QkV
            if (r0 == 0) goto L_0x0140
            X.QkV r5 = (X.C8222QkV) r5
            boolean r0 = r5 instanceof X.C8221QkU
            if (r0 == 0) goto L_0x00c8
            X.QkU r5 = (X.C8221QkU) r5
            X.16L r3 = r11.A10()
            X.16L r0 = X.16L.A0D
            r2 = 0
            if (r3 != r0) goto L_0x003b
            X.16L r3 = r11.A1J()
        L_0x0028:
            X.16L r0 = X.16L.A09
            if (r3 != r0) goto L_0x0046
            java.util.Map r1 = r5.A01
            java.util.BitSet r0 = X.C8221QkU.A02
            java.lang.String r0 = X.DbT.A11(r0, r1)
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r5.A0A(r11, r12, r2, r0)
            return r0
        L_0x003b:
            X.16L r0 = X.16L.A0A
            if (r3 == r0) goto L_0x0028
            java.lang.String r0 = "Unexpected input"
            java.lang.Object r0 = r5.A0B(r11, r12, r2, r0)
            return r0
        L_0x0046:
            java.util.Map r7 = r5.A01
            java.util.Set r0 = r7.keySet()
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>(r0)
            X.4bm r2 = new X.4bm
            r2.<init>(r11, r12)
            X.4ez r1 = X.C269354ez.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            X.4f9 r0 = r12.A02
            boolean r9 = r0.A09(r1)
        L_0x005e:
            X.16L r0 = X.16L.A0A
            r8 = 1
            r4 = 0
            if (r3 != r0) goto L_0x00af
            java.lang.String r1 = r11.A0Y()
            if (r9 == 0) goto L_0x006e
            java.lang.String r1 = r1.toLowerCase()
        L_0x006e:
            r2.A13(r11)
            java.util.Map r0 = r5.A00
            java.lang.Number r0 = X.C51966G9m.A14(r1, r0)
            if (r0 == 0) goto L_0x00aa
            int r3 = r0.intValue()
            java.util.Iterator r1 = r6.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r1.next()
            java.util.BitSet r0 = (java.util.BitSet) r0
            boolean r0 = r0.get(r3)
            if (r0 != 0) goto L_0x0081
            r1.remove()
            goto L_0x0081
        L_0x0097:
            int r0 = r6.size()
            if (r0 != r8) goto L_0x00aa
            java.lang.Object r0 = r6.get(r4)
            java.lang.String r0 = X.DbT.A11(r0, r7)
            java.lang.Object r0 = r5.A0A(r11, r12, r2, r0)
            return r0
        L_0x00aa:
            X.16L r3 = r11.A1J()
            goto L_0x005e
        L_0x00af:
            X.4eF r0 = r5.A02
            java.lang.String r1 = X.C269574fL.A04(r0)
            int r0 = r6.size()
            java.lang.Object[] r1 = X.C51968G9o.A1Z(r1, r0)
            java.lang.String r0 = "Cannot deduce unique subtype of %s (%d candidates match)"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.Object r0 = r5.A0B(r11, r12, r2, r0)
            return r0
        L_0x00c8:
            boolean r0 = r11.A0b()
            if (r0 == 0) goto L_0x00e8
            java.lang.Object r1 = r11.A0X()
            if (r1 == 0) goto L_0x00e8
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L_0x00e3
            java.lang.String r1 = (java.lang.String) r1
        L_0x00da:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.A08(r12, r1)
            java.lang.Object r0 = r0.A0D(r11, r12)
            return r0
        L_0x00e3:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L_0x00da
        L_0x00e8:
            X.16L r3 = r11.A10()
            X.16L r0 = X.16L.A0D
            r1 = 0
            if (r3 != r0) goto L_0x0135
            X.16L r3 = r11.A1J()
        L_0x00f5:
            X.4ez r2 = X.C269354ez.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            X.4f9 r0 = r12.A02
            boolean r4 = r0.A09(r2)
        L_0x00fd:
            X.16L r0 = X.16L.A0A
            if (r3 != r0) goto L_0x0139
            java.lang.String r3 = r11.A0Y()
            r11.A1J()
            java.lang.String r2 = r5.A05
            boolean r0 = r3.equals(r2)
            if (r0 != 0) goto L_0x0118
            if (r4 == 0) goto L_0x0123
            boolean r0 = r3.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0123
        L_0x0118:
            java.lang.String r0 = r11.A1Q()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r0 = r5.A0A(r11, r12, r1, r0)
            return r0
        L_0x0123:
            if (r1 != 0) goto L_0x012a
            X.4bm r1 = new X.4bm
            r1.<init>(r11, r12)
        L_0x012a:
            r1.A0q(r3)
            r1.A13(r11)
            X.16L r3 = r11.A1J()
            goto L_0x00fd
        L_0x0135:
            X.16L r0 = X.16L.A0A
            if (r3 == r0) goto L_0x00f5
        L_0x0139:
            java.lang.String r0 = r5.A01
            java.lang.Object r0 = r5.A0B(r11, r12, r1, r0)
            return r0
        L_0x0140:
            java.lang.Object r0 = r5.A09(r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11287SJg.A05(X.16F, X.4fV):java.lang.Object");
    }

    public final Object A06(16F r2, C269674fV r3) {
        if (this instanceof C8224QkX) {
            return ((C8224QkX) this).A09(r2, r3);
        }
        return ((C8223QkW) this).A09(r2, r3);
    }
}
