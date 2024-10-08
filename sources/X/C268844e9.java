package X;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonMerge;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.Serializable;

/* renamed from: X.4e9  reason: invalid class name and case insensitive filesystem */
public final class C268844e9 extends C268854eA implements Serializable {
    public static final Class[] A01;
    public static final Class[] A02;
    public transient C268874eC A00 = new C268874eC(48, 48);

    static {
        Class<JsonView> cls = JsonView.class;
        Class<JsonFormat> cls2 = JsonFormat.class;
        Class<JsonTypeInfo> cls3 = JsonTypeInfo.class;
        Class<JsonUnwrapped> cls4 = JsonUnwrapped.class;
        Class<JsonBackReference> cls5 = JsonBackReference.class;
        Class<JsonManagedReference> cls6 = JsonManagedReference.class;
        A02 = new Class[]{JsonSerialize.class, cls, cls2, cls3, JsonRawValue.class, cls4, cls5, cls6};
        A01 = new Class[]{JsonDeserialize.class, cls, cls2, cls3, cls4, cls5, cls6, JsonMerge.class};
        try {
            C268864eB r0 = C268864eB.$redex_init_class;
        } catch (Throwable unused) {
        }
    }

    public static boolean A00(C268894eF r2, Class cls) {
        Class cls2 = r2.A00;
        if (cls2.isPrimitive()) {
            if (cls2 == C269574fL.A01(cls)) {
                return true;
            }
            return false;
        } else if (!cls.isPrimitive() || cls != C269574fL.A01(cls2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [X.Tg5] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C13733Tg5 A0s(X.C269144ee r7, X.C269064eW r8) {
        /*
            r6 = this;
            java.lang.Class<com.fasterxml.jackson.annotation.JsonTypeInfo> r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.class
            java.lang.annotation.Annotation r5 = r8.A06(r0)
            com.fasterxml.jackson.annotation.JsonTypeInfo r5 = (com.fasterxml.jackson.annotation.JsonTypeInfo) r5
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonTypeResolver> r0 = com.fasterxml.jackson.databind.annotation.JsonTypeResolver.class
            java.lang.annotation.Annotation r1 = r8.A06(r0)
            com.fasterxml.jackson.databind.annotation.JsonTypeResolver r1 = (com.fasterxml.jackson.databind.annotation.JsonTypeResolver) r1
            r0 = 0
            if (r1 == 0) goto L_0x008c
            if (r5 == 0) goto L_0x00af
            java.lang.Class r2 = r1.value()
            boolean r1 = r7.A06()
            java.lang.Object r4 = X.C269574fL.A03(r2, r1)
            X.Tg5 r4 = (X.C13733Tg5) r4
        L_0x0023:
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver> r1 = com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver.class
            java.lang.annotation.Annotation r1 = r8.A06(r1)
            com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver r1 = (com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver) r1
            if (r1 == 0) goto L_0x003b
            java.lang.Class r1 = r1.value()
            boolean r0 = r7.A06()
            java.lang.Object r0 = X.C269574fL.A03(r1, r0)
            X.ThU r0 = (X.C13805ThU) r0
        L_0x003b:
            X.RFD r1 = r5.use()
            r3 = r4
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r3 = (com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder) r3
            if (r1 == 0) goto L_0x00a7
            r3._idType = r1
            r3._customIdResolver = r0
            java.lang.String r2 = r1.A00
            r3._typeProperty = r2
            X.REQ r1 = r5.include()
            X.REQ r0 = X.REQ.EXTERNAL_PROPERTY
            if (r1 != r0) goto L_0x0082
            boolean r0 = r8 instanceof X.C269054eV
            if (r0 == 0) goto L_0x005a
            X.REQ r1 = X.REQ.PROPERTY
        L_0x005a:
            r3._includeAs = r1
            java.lang.String r1 = r5.property()
            if (r1 == 0) goto L_0x0068
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0069
        L_0x0068:
            r1 = r2
        L_0x0069:
            r3._typeProperty = r1
            java.lang.Class r1 = r5.defaultImpl()
            java.lang.Class<X.XVd> r0 = X.C21313XVd.class
            if (r1 == r0) goto L_0x007b
            boolean r0 = r1.isAnnotation()
            if (r0 != 0) goto L_0x007b
            r3._defaultImpl = r1
        L_0x007b:
            boolean r0 = r5.visible()
            r3._typeIdVisible = r0
            return r4
        L_0x0082:
            if (r1 != 0) goto L_0x005a
            java.lang.String r1 = "includeAs cannot be null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x008c:
            if (r5 == 0) goto L_0x00af
            X.RFD r2 = r5.use()
            X.RFD r1 = X.RFD.NONE
            com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder r4 = new com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder
            if (r2 != r1) goto L_0x00a2
            r4.<init>()
            r4._idType = r1
            r4._customIdResolver = r0
            r4._typeProperty = r0
            return r4
        L_0x00a2:
            r4.<init>()
            goto L_0x0023
        L_0x00a7:
            java.lang.String r1 = "idType cannot be null"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00af:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268844e9.A0s(X.4ee, X.4eW):X.Tg5");
    }

    public static boolean A01(Class cls, Class cls2) {
        if (cls.isPrimitive()) {
            if (cls == C269574fL.A01(cls2)) {
                return true;
            }
            return false;
        } else if (!cls2.isPrimitive() || cls2 != C269574fL.A01(cls)) {
            return false;
        } else {
            return true;
        }
    }
}
