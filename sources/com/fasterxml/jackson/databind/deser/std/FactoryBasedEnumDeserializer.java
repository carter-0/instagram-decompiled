package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.AnonymousClass05K;
import X.AnonymousClass7TF;
import X.C11287SJg;
import X.C13901TjO;
import X.C268894eF;
import X.C269454f9;
import X.C269674fV;
import X.C269784fg;
import X.C8206QkF;
import X.C8218QkR;
import X.SK6;
import X.SOB;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class FactoryBasedEnumDeserializer extends StdDeserializer implements C269784fg {
    public final C268894eF A00;
    public final JsonDeserializer A01;
    public final SK6 A02;
    public final C8206QkF A03;
    public final boolean A04;
    public final C8218QkR[] A05;
    public transient SOB A06;

    public final boolean A0M() {
        return true;
    }

    public FactoryBasedEnumDeserializer(JsonDeserializer jsonDeserializer, FactoryBasedEnumDeserializer factoryBasedEnumDeserializer) {
        super(factoryBasedEnumDeserializer.A00);
        this.A00 = factoryBasedEnumDeserializer.A00;
        this.A03 = factoryBasedEnumDeserializer.A03;
        this.A04 = factoryBasedEnumDeserializer.A04;
        this.A02 = factoryBasedEnumDeserializer.A02;
        this.A05 = factoryBasedEnumDeserializer.A05;
        this.A01 = jsonDeserializer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r7.A0j(X.C269464fA.WRAP_EXCEPTIONS) != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b5, code lost:
        if ((r4 instanceof X.C65181bG) != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0124, code lost:
        if ((r1 instanceof java.io.IOException) != false) goto L_0x0130;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.16F r6, X.C269674fV r7) {
        /*
            r5 = this;
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r5.A01
            r3 = 0
            if (r0 == 0) goto L_0x000b
            java.lang.Object r1 = r0.A0D(r6, r7)
            goto L_0x00dc
        L_0x000b:
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x010a
            X.QkR[] r4 = r5.A05
            if (r4 == 0) goto L_0x00c8
            boolean r0 = r6.A17()
            if (r0 != 0) goto L_0x0039
            X.4eF r0 = r5.A0U(r7)
            java.lang.String r2 = X.C269574fL.A04(r0)
            X.QkF r1 = r5.A03
            X.16L r0 = r6.A10()
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "Input mismatch reading Enum %s: properties-based `@JsonCreator` (%s) expects JSON Object (JsonToken.START_OBJECT), got JsonToken.%s"
            java.lang.String r2 = java.lang.String.format(r0, r1)
            X.16F r1 = r7.A07
            X.Qi2 r0 = new X.Qi2
            r0.<init>(r1, r2)
            throw r0
        L_0x0039:
            X.SOB r0 = r5.A06
            if (r0 != 0) goto L_0x004d
            X.SK6 r2 = r5.A02
            X.4ez r1 = X.C269354ez.ACCEPT_CASE_INSENSITIVE_PROPERTIES
            X.4f9 r0 = r7.A02
            boolean r0 = r0.A09(r1)
            X.SOB r0 = X.SOB.A01(r7, r2, r4, r0)
            r5.A06 = r0
        L_0x004d:
            r6.A1J()
            X.SOB r4 = r5.A06
            int r0 = r4.A00
            X.S7L r2 = new X.S7L
            r2.<init>(r6, r7, r3, r0)
            X.16L r1 = r6.A10()
        L_0x005d:
            X.16L r0 = X.16L.A0A
            if (r1 != r0) goto L_0x00c3
            java.lang.String r0 = r6.A0Y()
            r6.A1J()
            X.QkR r1 = X.SOB.A00(r4, r0)
            boolean r0 = r2.A04(r0)
            if (r0 == 0) goto L_0x0079
            if (r1 != 0) goto L_0x007f
        L_0x0074:
            X.16L r1 = r6.A1J()
            goto L_0x005d
        L_0x0079:
            if (r1 != 0) goto L_0x007f
            r6.A0z()
            goto L_0x0074
        L_0x007f:
            java.lang.Object r0 = r1.A0C(r6, r7)     // Catch:{ Exception -> 0x0087 }
            r2.A03(r1, r0)
            goto L_0x0074
        L_0x0087:
            r4 = move-exception
            java.lang.Class r3 = r5.A0H()
            X.4f7 r0 = r1.A06
            java.lang.String r2 = r0.A02
            java.util.Iterator r0 = X.C269574fL.A00
        L_0x0092:
            java.lang.Throwable r0 = r4.getCause()
            if (r0 == 0) goto L_0x009d
            java.lang.Throwable r4 = r4.getCause()
            goto L_0x0092
        L_0x009d:
            boolean r0 = r4 instanceof java.lang.Error
            if (r0 != 0) goto L_0x00c2
            if (r7 == 0) goto L_0x00ac
            X.4fA r0 = X.C269464fA.WRAP_EXCEPTIONS
            boolean r0 = r7.A0j(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00ad
        L_0x00ac:
            r1 = 1
        L_0x00ad:
            boolean r0 = r4 instanceof java.io.IOException
            if (r0 == 0) goto L_0x00bc
            if (r1 == 0) goto L_0x00c2
            boolean r0 = r4 instanceof X.C65181bG
            if (r0 == 0) goto L_0x00c2
        L_0x00b7:
            X.4iD r0 = X.AnonymousClass4iD.A02(r3, r2, r4)
            throw r0
        L_0x00bc:
            if (r1 != 0) goto L_0x00b7
            X.C269574fL.A0F(r4)
            goto L_0x00b7
        L_0x00c2:
            throw r4
        L_0x00c3:
            java.lang.Object r0 = r4.A02(r7, r2)
            return r0
        L_0x00c8:
            X.16L r0 = r6.A10()
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r0.A03
            if (r0 != 0) goto L_0x00d8
            r6.A0z()
            java.lang.String r1 = ""
            goto L_0x00dc
        L_0x00d8:
            java.lang.String r1 = r6.A1Q()
        L_0x00dc:
            X.QkF r0 = r5.A03     // Catch:{ Exception -> 0x00eb }
            java.lang.Class r2 = r5.A00     // Catch:{ Exception -> 0x00eb }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ Exception -> 0x00eb }
            java.lang.reflect.Method r0 = r0.A01     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r0 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x00eb }
            return r0
        L_0x00eb:
            r1 = move-exception
            java.util.Iterator r0 = X.C269574fL.A00
        L_0x00ee:
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto L_0x00f9
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x00ee
        L_0x00f9:
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 != 0) goto L_0x0130
            boolean r0 = r1 instanceof java.lang.IllegalArgumentException
            if (r0 == 0) goto L_0x0126
            X.4fA r0 = X.C269464fA.READ_UNKNOWN_ENUM_VALUES_AS_NULL
            boolean r0 = r7.A0j(r0)
            if (r0 == 0) goto L_0x0126
            return r3
        L_0x010a:
            r6.A0z()
            X.QkF r0 = r5.A03     // Catch:{ Exception -> 0x0114 }
            java.lang.Object r0 = r0.A0J()     // Catch:{ Exception -> 0x0114 }
            return r0
        L_0x0114:
            r1 = move-exception
            java.util.Iterator r0 = X.C269574fL.A00
        L_0x0117:
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto L_0x0122
            java.lang.Throwable r1 = r1.getCause()
            goto L_0x0117
        L_0x0122:
            boolean r0 = r1 instanceof java.io.IOException
            if (r0 != 0) goto L_0x0130
        L_0x0126:
            java.lang.Class r0 = r5.A00
            r7.A0f(r0, r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0130:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.FactoryBasedEnumDeserializer.A0D(X.16F, X.4fV):java.lang.Object");
    }

    public final Boolean A0G(C269454f9 r2) {
        return Boolean.FALSE;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A1F;
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        if (this.A01 == null) {
            return A0D(r2, r3);
        }
        return sJg.A03(r2, r3);
    }

    public final SK6 A0W() {
        return this.A02;
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r4) {
        C268894eF r1;
        if (this.A01 == null && (r1 = this.A00) != null && this.A05 == null) {
            return new FactoryBasedEnumDeserializer(r4.A0B(tjO, r1), this);
        }
        return this;
    }

    public FactoryBasedEnumDeserializer(C268894eF r4, SK6 sk6, C8206QkF qkF, Class cls, C8218QkR[] qkRArr) {
        super(cls);
        this.A03 = qkF;
        this.A04 = true;
        Class<CharSequence> cls2 = r4.A00;
        this.A00 = (AnonymousClass7TF.A1W(cls2, String.class) || cls2 == CharSequence.class) ? null : r4;
        this.A01 = null;
        this.A02 = sk6;
        this.A05 = qkRArr;
    }

    public FactoryBasedEnumDeserializer(C8206QkF qkF, Class cls) {
        super(cls);
        this.A03 = qkF;
        this.A04 = false;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A05 = null;
    }
}
