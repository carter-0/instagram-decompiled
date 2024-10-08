package X;

/* renamed from: X.Rzp  reason: case insensitive filesystem */
public abstract class C10889Rzp {
    /* JADX WARNING: Can't wrap try/catch for region: R(4:74|75|76|77) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:76:0x0131 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C269674fV r9, java.lang.String r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.C8164QiP
            if (r0 == 0) goto L_0x023f
            r3 = r8
            X.QiP r3 = (X.C8164QiP) r3
            boolean r0 = r3 instanceof X.C8190Qjm
            if (r0 != 0) goto L_0x023e
            r5 = 0
            if (r10 == 0) goto L_0x023d
            r4 = 0
            boolean r0 = r3 instanceof X.C8192Qjo     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0022
            r0 = r3
            X.Qjo r0 = (X.C8192Qjo) r0     // Catch:{ Exception -> 0x022a }
            java.lang.reflect.Method r1 = r0.A00     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r0 = new java.lang.Object[]{r10}     // Catch:{ Exception -> 0x022a }
            java.lang.Object r7 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x0022:
            boolean r0 = r3 instanceof X.C8191Qjn     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0035
            r0 = r3
            X.Qjn r0 = (X.C8191Qjn) r0     // Catch:{ Exception -> 0x022a }
            java.lang.reflect.Constructor r1 = r0.A00     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r0 = new java.lang.Object[]{r10}     // Catch:{ Exception -> 0x022a }
            java.lang.Object r7 = r1.newInstance(r0)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x0035:
            boolean r0 = r3 instanceof X.C8193Qjp     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x00cd
            r6 = r3
            X.Qjp r6 = (X.C8193Qjp) r6     // Catch:{ Exception -> 0x022a }
            X.QkF r0 = r6.A01     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0054
            java.lang.Object r7 = r0.A0K(r10)     // Catch:{ Exception -> 0x0046 }
            goto L_0x01e9
        L_0x0046:
            r2 = move-exception
            java.util.Iterator r0 = X.C269574fL.A00     // Catch:{ Exception -> 0x022a }
        L_0x0049:
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0219
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ Exception -> 0x022a }
            goto L_0x0049
        L_0x0054:
            X.4fA r0 = X.C269464fA.READ_ENUMS_USING_TO_STRING     // Catch:{ Exception -> 0x022a }
            boolean r0 = r9.A0j(r0)     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0073
            X.T9m r0 = r6.A00     // Catch:{ Exception -> 0x022a }
            if (r0 != 0) goto L_0x0075
            monitor-enter(r6)     // Catch:{ Exception -> 0x022a }
            X.4f9 r1 = r9.A02     // Catch:{ all -> 0x006f }
            X.T9m r0 = r6.A02     // Catch:{ all -> 0x006f }
            java.lang.Class r0 = r0.A00     // Catch:{ all -> 0x006f }
            X.T9m r0 = X.T9m.A00(r1, r0)     // Catch:{ all -> 0x006f }
            r6.A00 = r0     // Catch:{ all -> 0x006f }
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            goto L_0x0075
        L_0x006f:
            r2 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006f }
            goto L_0x0229
        L_0x0073:
            X.T9m r0 = r6.A02     // Catch:{ Exception -> 0x022a }
        L_0x0075:
            java.util.HashMap r1 = r0.A02     // Catch:{ Exception -> 0x022a }
            java.lang.Object r7 = r1.get(r10)     // Catch:{ Exception -> 0x022a }
            if (r7 != 0) goto L_0x009f
            boolean r0 = r0.A04     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x009f
            java.util.Iterator r7 = X.AnonymousClass7TF.A0s(r1)     // Catch:{ Exception -> 0x022a }
        L_0x0085:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x009e
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r7)     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = X.DbT.A13(r2)     // Catch:{ Exception -> 0x022a }
            boolean r0 = r10.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0085
            java.lang.Object r7 = r2.getValue()     // Catch:{ Exception -> 0x022a }
            goto L_0x009f
        L_0x009e:
            r7 = 0
        L_0x009f:
            if (r7 != 0) goto L_0x01e9
            java.lang.Enum r2 = r6.A03     // Catch:{ Exception -> 0x022a }
            if (r2 == 0) goto L_0x00af
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE     // Catch:{ Exception -> 0x022a }
            boolean r0 = r9.A0j(r0)     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x00af
            goto L_0x01e8
        L_0x00af:
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_AS_NULL     // Catch:{ Exception -> 0x022a }
            boolean r0 = r9.A0j(r0)     // Catch:{ Exception -> 0x022a }
            if (r0 != 0) goto L_0x01e9
            java.lang.Class r2 = r6.A02     // Catch:{ Exception -> 0x022a }
            java.util.Set r0 = r1.keySet()     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = "not one of the values accepted for Enum class: %s"
            r9.A0d(r2, r10, r0, r1)     // Catch:{ Exception -> 0x022a }
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0229
        L_0x00cd:
            int r0 = r3.A00     // Catch:{ Exception -> 0x022a }
            switch(r0) {
                case 1: goto L_0x015d;
                case 2: goto L_0x019b;
                case 3: goto L_0x01b8;
                case 4: goto L_0x0181;
                case 5: goto L_0x0104;
                case 6: goto L_0x010a;
                case 7: goto L_0x0110;
                case 8: goto L_0x011b;
                case 9: goto L_0x013a;
                case 10: goto L_0x00e7;
                case 11: goto L_0x00ed;
                case 12: goto L_0x0142;
                case 13: goto L_0x0148;
                case 14: goto L_0x014e;
                case 15: goto L_0x0125;
                case 16: goto L_0x0155;
                case 17: goto L_0x01d5;
                default: goto L_0x00d2;
            }     // Catch:{ Exception -> 0x022a }
        L_0x00d2:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = "Internal error: unknown key type "
            r1.append(r0)     // Catch:{ Exception -> 0x022a }
            java.lang.Class r0 = r3.A02     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ Exception -> 0x022a }
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x022a }
            goto L_0x0228
        L_0x00e7:
            java.util.Date r7 = r9.A0P(r10)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x00ed:
            java.util.Date r1 = r9.A0P(r10)     // Catch:{ Exception -> 0x022a }
            X.4f9 r0 = r9.A02     // Catch:{ Exception -> 0x022a }
            X.4eS r0 = r0.A01     // Catch:{ Exception -> 0x022a }
            java.util.TimeZone r0 = r0.A0A     // Catch:{ Exception -> 0x022a }
            if (r0 != 0) goto L_0x00fb
            java.util.TimeZone r0 = X.C269024eS.A0B     // Catch:{ Exception -> 0x022a }
        L_0x00fb:
            java.util.Calendar r2 = java.util.Calendar.getInstance(r0)     // Catch:{ Exception -> 0x022a }
            r2.setTime(r1)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e8
        L_0x0104:
            java.lang.Integer r7 = X.Pxf.A0Z(r10)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x010a:
            java.lang.Long r7 = X.DbV.A0q(r10)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x0110:
            double r0 = X.16T.A00(r10)     // Catch:{ Exception -> 0x022a }
            float r2 = (float) r0     // Catch:{ Exception -> 0x022a }
            java.lang.Float r7 = java.lang.Float.valueOf(r2)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x011b:
            double r0 = X.16T.A00(r10)     // Catch:{ Exception -> 0x022a }
            java.lang.Double r7 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x0125:
            X.4f9 r0 = r9.A02     // Catch:{ Exception -> 0x0131 }
            X.4eS r0 = r0.A01     // Catch:{ Exception -> 0x0131 }
            X.4eE r0 = r0.A07     // Catch:{ Exception -> 0x0131 }
            java.lang.Class r7 = r0.A0D(r10)     // Catch:{ Exception -> 0x0131 }
            goto L_0x01e9
        L_0x0131:
            java.lang.Class r2 = r3.A02     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = "unable to parse key as Class"
            goto L_0x0211
        L_0x013a:
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer r0 = r3.A01     // Catch:{ IllegalArgumentException -> 0x0203 }
            java.lang.Object r7 = r0.A10(r9, r10)     // Catch:{ IllegalArgumentException -> 0x0203 }
            goto L_0x01e9
        L_0x0142:
            java.util.UUID r7 = java.util.UUID.fromString(r10)     // Catch:{  }
            goto L_0x01e9
        L_0x0148:
            java.net.URI r7 = java.net.URI.create(r10)     // Catch:{  }
            goto L_0x01e9
        L_0x014e:
            java.net.URL r7 = new java.net.URL     // Catch:{  }
            r7.<init>(r10)     // Catch:{  }
            goto L_0x01e9
        L_0x0155:
            com.fasterxml.jackson.databind.deser.std.FromStringDeserializer r0 = r3.A01     // Catch:{ IllegalArgumentException -> 0x0203 }
            java.lang.Object r7 = r0.A10(r9, r10)     // Catch:{ IllegalArgumentException -> 0x0203 }
            goto L_0x01e9
        L_0x015d:
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x016a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x016a:
            java.lang.String r0 = "false"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x022a }
            if (r0 == 0) goto L_0x0175
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x0175:
            java.lang.Class r2 = r3.A02     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = "value not 'true' or 'false'"
            r9.A0d(r2, r10, r0, r1)     // Catch:{ Exception -> 0x022a }
            goto L_0x0214
        L_0x0181:
            int r1 = r10.length()     // Catch:{ Exception -> 0x022a }
            r0 = 1
            if (r1 != r0) goto L_0x0191
            char r0 = r10.charAt(r4)     // Catch:{ Exception -> 0x022a }
            java.lang.Character r7 = java.lang.Character.valueOf(r0)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x0191:
            java.lang.Class r2 = r3.A02     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = "can only convert 1-character Strings"
            r9.A0d(r2, r10, r0, r1)     // Catch:{ Exception -> 0x022a }
            goto L_0x0214
        L_0x019b:
            int r1 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x022a }
            r0 = -128(0xffffffffffffff80, float:NaN)
            if (r1 < r0) goto L_0x01ad
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L_0x01ad
            byte r0 = (byte) r1     // Catch:{ Exception -> 0x022a }
            java.lang.Byte r7 = java.lang.Byte.valueOf(r0)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x01ad:
            java.lang.Class r2 = r3.A02     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = "overflow, value cannot be represented as 8-bit value"
            r9.A0d(r2, r10, r0, r1)     // Catch:{ Exception -> 0x022a }
            goto L_0x0214
        L_0x01b8:
            int r1 = java.lang.Integer.parseInt(r10)     // Catch:{ Exception -> 0x022a }
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r1 < r0) goto L_0x01ca
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r1 > r0) goto L_0x01ca
            short r0 = (short) r1     // Catch:{ Exception -> 0x022a }
            java.lang.Short r7 = java.lang.Short.valueOf(r0)     // Catch:{ Exception -> 0x022a }
            goto L_0x01e9
        L_0x01ca:
            java.lang.Class r2 = r3.A02     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = "overflow, value cannot be represented as 16-bit value"
            r9.A0d(r2, r10, r0, r1)     // Catch:{ Exception -> 0x022a }
            goto L_0x0214
        L_0x01d5:
            X.4f9 r0 = r9.A02     // Catch:{ IllegalArgumentException -> 0x0203 }
            X.4eS r0 = r0.A01     // Catch:{ IllegalArgumentException -> 0x0203 }
            X.4eN r1 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0203 }
            X.RD3 r0 = new X.RD3     // Catch:{ IllegalArgumentException -> 0x0203 }
            r0.<init>((X.AnonymousClass16A) r5)     // Catch:{ IllegalArgumentException -> 0x0203 }
            r1.A06(r0, r10)     // Catch:{ IllegalArgumentException -> 0x0203 }
            byte[] r7 = r0.A05()     // Catch:{ IllegalArgumentException -> 0x0203 }
            goto L_0x01e9
        L_0x01e8:
            r7 = r2
        L_0x01e9:
            if (r7 == 0) goto L_0x01ec
            return r7
        L_0x01ec:
            java.lang.Class r2 = r3.A02
            java.util.Iterator r0 = X.C269574fL.A00
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L_0x0277
            X.4f9 r1 = r9.A02
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r0 = r1.A0D(r0)
            if (r0 == 0) goto L_0x0277
            return r5
        L_0x0203:
            r0 = move-exception
            java.lang.Class r2 = r3.A02     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = X.C269574fL.A09(r0)     // Catch:{ Exception -> 0x022a }
            java.lang.Object[] r1 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x022a }
            java.lang.String r0 = "problem: %s"
        L_0x0211:
            r9.A0d(r2, r10, r0, r1)     // Catch:{ Exception -> 0x022a }
        L_0x0214:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            goto L_0x0228
        L_0x0219:
            java.lang.String r1 = r2.getMessage()     // Catch:{ Exception -> 0x022a }
            X.C269574fL.A0F(r2)     // Catch:{ Exception -> 0x022a }
            boolean r0 = r2 instanceof java.lang.Error     // Catch:{ Exception -> 0x022a }
            if (r0 != 0) goto L_0x0229
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r1, r2)     // Catch:{ Exception -> 0x022a }
        L_0x0228:
            throw r0     // Catch:{ Exception -> 0x022a }
        L_0x0229:
            throw r2     // Catch:{ Exception -> 0x022a }
        L_0x022a:
            r0 = move-exception
            java.lang.Class r2 = r3.A02
            java.lang.String r1 = X.C66581MXm.A0y(r0)
            java.lang.String r0 = X.C269574fL.A09(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "not a valid representation, problem: (%s) %s"
            goto L_0x027c
        L_0x023d:
            return r5
        L_0x023e:
            return r10
        L_0x023f:
            r4 = r8
            X.QiO r4 = (X.C8163QiO) r4
            if (r10 != 0) goto L_0x0246
            r0 = 0
        L_0x0245:
            return r0
        L_0x0246:
            X.16F r1 = r9.A07
            X.4bm r0 = new X.4bm
            r0.<init>(r1, r9)
            r0.A0t(r10)
            r3 = 0
            X.Qhf r1 = X.Pxi.A0N(r0)     // Catch:{ Exception -> 0x026c }
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r4.A00     // Catch:{ Exception -> 0x026c }
            java.lang.Object r0 = r0.A0D(r1, r9)     // Catch:{ Exception -> 0x026c }
            if (r0 != 0) goto L_0x0245
            java.lang.Class r2 = r4.A01     // Catch:{ Exception -> 0x026c }
            java.lang.String r1 = "not a valid representation"
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x026c }
            r9.A0d(r2, r10, r1, r0)     // Catch:{ Exception -> 0x026c }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x026c }
            throw r0     // Catch:{ Exception -> 0x026c }
        L_0x026c:
            r0 = move-exception
            java.lang.Class r2 = r4.A01
            java.lang.Object[] r1 = X.Pxf.A1Z(r0)
            java.lang.String r0 = "not a valid representation: %s"
            goto L_0x027c
        L_0x0277:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "not a valid representation"
        L_0x027c:
            r9.A0d(r2, r10, r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10889Rzp.A00(X.4fV, java.lang.String):java.lang.Object");
    }
}
