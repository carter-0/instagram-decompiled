package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

@JacksonStdImpl
/* renamed from: X.Qkx  reason: case insensitive filesystem */
public class C8244Qkx extends C8217QkQ implements Serializable {
    public static final Object A0H = C269204ek.NON_EMPTY;
    public C268894eF A00;
    public JsonSerializer A01;
    public JsonSerializer A02;
    public SPK A03;
    public final 15y A04;
    public final C268894eF A05;
    public final C268894eF A06;
    public final C269434f7 A07;
    public final C8208QkH A08;
    public final Object A09;
    public final boolean A0A;
    public final Class[] A0B;
    public transient SIF A0C;
    public transient Field A0D;
    public transient Method A0E;
    public transient HashMap A0F;
    public final transient C269114eb A0G;

    public final C8244Qkx A00(SGT sgt) {
        if (this instanceof C8243Qkq) {
            C8243Qkq qkq = (C8243Qkq) this;
            String A002 = sgt.A00(qkq.A04.A03);
            return new C8243Qkq(new 15y(A002), qkq, new C8254Qm3(sgt, qkq.A00));
        } else if (this instanceof C8241Qko) {
            C8241Qko qko = (C8241Qko) this;
            return new C8241Qko(qko.A00.A00(sgt), qko.A01);
        } else if (this instanceof C8240Qkn) {
            C8240Qkn qkn = (C8240Qkn) this;
            return new C8240Qkn(qkn.A00.A00(sgt), qkn.A01);
        } else {
            15y r2 = this.A04;
            String A003 = sgt.A00(r2.A03);
            if (JTQ.A1Y(r2, A003)) {
                return this;
            }
            C269434f7 A004 = C269434f7.A00(A003);
            if (this instanceof C8239Qkm) {
                return new C8244Qkx(A004, this);
            }
            return new C8244Qkx(A004, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r1 != false) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.17Z r7, X.C269504fE r8, java.lang.Object r9) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C8241Qko
            if (r0 == 0) goto L_0x0021
            r2 = r6
            X.Qko r2 = (X.C8241Qko) r2
            java.lang.Class r1 = r8.A07
            if (r1 == 0) goto L_0x001e
            java.lang.Class r0 = r2.A01
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x001e
            X.Qkx r0 = r2.A00
        L_0x0015:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r0.A01
        L_0x0017:
            if (r1 == 0) goto L_0x00a7
            r0 = 0
            r1.A0A(r7, r8, r0)
            return
        L_0x001e:
            X.Qkx r0 = r2.A00
            goto L_0x0044
        L_0x0021:
            boolean r0 = r6 instanceof X.C8240Qkn
            if (r0 == 0) goto L_0x0048
            r5 = r6
            X.Qkn r5 = (X.C8240Qkn) r5
            java.lang.Class r4 = r8.A07
            if (r4 == 0) goto L_0x003d
            java.lang.Class[] r3 = r5.A01
            int r2 = r3.length
            r1 = 0
        L_0x0030:
            if (r1 >= r2) goto L_0x003f
            r0 = r3[r1]
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 != 0) goto L_0x003d
            int r1 = r1 + 1
            goto L_0x0030
        L_0x003d:
            r1 = 1
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            X.Qkx r0 = r5.A00
            if (r1 == 0) goto L_0x0015
        L_0x0044:
            r0.A01(r7, r8, r9)
            return
        L_0x0048:
            boolean r0 = r6 instanceof X.C8242Qkp
            if (r0 == 0) goto L_0x0077
            r3 = r6
            X.Qkp r3 = (X.C8242Qkp) r3
            java.lang.String r0 = r3.A00
            java.lang.Object r2 = r8.A0S(r0)
            if (r2 == 0) goto L_0x0065
            com.fasterxml.jackson.databind.JsonSerializer r1 = X.SuT.A02(r8, r3, r2)
            java.lang.Object r0 = r3.A09
            if (r0 == 0) goto L_0x0068
            boolean r0 = X.SuT.A03(r1, r8, r0, r2)
            if (r0 == 0) goto L_0x0068
        L_0x0065:
            com.fasterxml.jackson.databind.JsonSerializer r1 = r3.A01
            goto L_0x0017
        L_0x0068:
            if (r2 != r9) goto L_0x0071
            boolean r0 = r3.A05(r7, r1, r8)
            if (r0 == 0) goto L_0x0071
            return
        L_0x0071:
            X.SPK r0 = r3.A03
            X.Pxi.A1D(r7, r1, r8, r0, r2)
            return
        L_0x0077:
            java.lang.reflect.Method r0 = r6.A0E
            r3 = 0
            if (r0 != 0) goto L_0x008c
            java.lang.reflect.Field r0 = r6.A0D
            java.lang.Object r2 = r0.get(r9)
        L_0x0082:
            if (r2 != 0) goto L_0x0091
            com.fasterxml.jackson.databind.JsonSerializer r0 = r6.A01
            if (r0 == 0) goto L_0x00a7
            r0.A0A(r7, r8, r3)
            return
        L_0x008c:
            java.lang.Object r2 = r0.invoke(r9, r3)
            goto L_0x0082
        L_0x0091:
            com.fasterxml.jackson.databind.JsonSerializer r1 = X.SuT.A02(r8, r6, r2)
            java.lang.Object r0 = r6.A09
            if (r0 == 0) goto L_0x00ab
            boolean r0 = X.SuT.A03(r1, r8, r0, r2)
            if (r0 == 0) goto L_0x00ab
            com.fasterxml.jackson.databind.JsonSerializer r0 = r6.A01
            if (r0 == 0) goto L_0x00a7
            r0.A0A(r7, r8, r3)
            return
        L_0x00a7:
            r7.A0a()
            return
        L_0x00ab:
            if (r2 != r9) goto L_0x00b4
            boolean r0 = r6.A05(r7, r1, r8)
            if (r0 == 0) goto L_0x00b4
            return
        L_0x00b4:
            X.SPK r0 = r6.A03
            X.Pxi.A1D(r7, r1, r8, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8244Qkx.A01(X.17Z, X.4fE, java.lang.Object):void");
    }

    public void A02(17Z r4, C269504fE r5, Object obj) {
        Object invoke;
        Method method = this.A0E;
        if (method == null) {
            invoke = this.A0D.get(obj);
        } else {
            invoke = method.invoke(obj, (Object[]) null);
        }
        if (invoke != null) {
            JsonSerializer A022 = SuT.A02(r5, this, invoke);
            Object obj2 = this.A09;
            if (obj2 != null && SuT.A03(A022, r5, obj2, invoke)) {
                return;
            }
            if (invoke != obj || !A05(r4, A022, r5)) {
                r4.A0k(this.A04);
                Pxi.A1D(r4, A022, r5, this.A03, invoke);
            }
        } else if (this.A01 != null) {
            r4.A0k(this.A04);
            this.A01.A0A(r4, r5, (Object) null);
        }
    }

    public final void A03(JsonSerializer jsonSerializer) {
        C8244Qkx qkx;
        if (this instanceof C8241Qko) {
            qkx = ((C8241Qko) this).A00;
        } else if (this instanceof C8240Qkn) {
            qkx = ((C8240Qkn) this).A00;
        } else {
            JsonSerializer jsonSerializer2 = this.A01;
            if (jsonSerializer2 == null || jsonSerializer2 == jsonSerializer) {
                this.A01 = jsonSerializer;
                return;
            }
            throw Pxf.A0Y("Cannot override _nullSerializer: had a %s, trying to set to %s", new Object[]{C269574fL.A07(jsonSerializer2), C269574fL.A07(jsonSerializer)});
        }
        qkx.A03(jsonSerializer);
    }

    public void A04(JsonSerializer jsonSerializer) {
        JsonSerializer jsonSerializer2 = this.A02;
        if (jsonSerializer2 == null || jsonSerializer2 == jsonSerializer) {
            this.A02 = jsonSerializer;
            return;
        }
        throw Pxf.A0Y("Cannot override _serializer: had a %s, trying to set to %s", new Object[]{C269574fL.A07(jsonSerializer2), C269574fL.A07(jsonSerializer)});
    }

    public final C269434f7 B8O() {
        return new C269434f7(this.A04.A03, (String) null);
    }

    public final C8208QkH BRS() {
        return this.A08;
    }

    public final C268894eF CAJ() {
        return this.A06;
    }

    public final String getName() {
        return this.A04.A03;
    }

    public final String toString() {
        String str;
        String A0R;
        StringBuilder A14 = Pxe.A14(40);
        A14.append("property '");
        A14.append(this.A04.A03);
        A14.append("' (");
        Method method = this.A0E;
        if (method != null) {
            A14.append("via method ");
            Pxe.A1W(method.getDeclaringClass(), A14);
            A14.append("#");
            str = method.getName();
        } else {
            Field field = this.A0D;
            if (field != null) {
                A14.append("field \"");
                Pxe.A1W(field.getDeclaringClass(), A14);
                A14.append("#");
                str = field.getName();
            } else {
                str = "virtual";
            }
        }
        A14.append(str);
        JsonSerializer jsonSerializer = this.A02;
        if (jsonSerializer == null) {
            A0R = ", no static serializer";
        } else {
            A0R = 002.A0R(", static serializer of type ", C66581MXm.A0y(jsonSerializer));
        }
        return C51975G9x.A0i(A0R, A14);
    }

    public C8244Qkx(C269434f7 r3, C8244Qkx qkx) {
        super((SuT) qkx);
        this.A04 = new 15y(r3.A02);
        this.A07 = qkx.A07;
        this.A0G = qkx.A0G;
        this.A06 = qkx.A06;
        this.A08 = qkx.A08;
        this.A0E = qkx.A0E;
        this.A0D = qkx.A0D;
        this.A02 = qkx.A02;
        this.A01 = qkx.A01;
        HashMap hashMap = qkx.A0F;
        if (hashMap != null) {
            this.A0F = Pxe.A19(hashMap);
        }
        this.A05 = qkx.A05;
        this.A0C = qkx.A0C;
        this.A0A = qkx.A0A;
        this.A09 = qkx.A09;
        this.A0B = qkx.A0B;
        this.A03 = qkx.A03;
        this.A00 = qkx.A00;
    }

    public final boolean A05(17Z r3, JsonSerializer jsonSerializer, C269504fE r5) {
        if (jsonSerializer.A06()) {
            return false;
        }
        C269424f6 r0 = C269424f6.FAIL_ON_SELF_REFERENCES;
        C269294et r1 = r5.A05;
        if (r1.A0D(r0)) {
            if (!(jsonSerializer instanceof BeanSerializerBase)) {
                return false;
            }
            r5.A08(this.A06, "Direct self-reference leading to cycle");
            throw AnonymousClass00P.createAndThrow();
        } else if (!r1.A0D(C269424f6.WRITE_SELF_REFERENCES_AS_NULL)) {
            return false;
        } else {
            if (this.A01 == null) {
                return true;
            }
            if (r3.A0E().A01 != 1) {
                r3.A0k(this.A04);
            }
            this.A01.A0A(r3, r5, (Object) null);
            return true;
        }
    }

    public C8244Qkx(15y r2, C8244Qkx qkx) {
        super((SuT) qkx);
        this.A04 = r2;
        this.A07 = qkx.A07;
        this.A08 = qkx.A08;
        this.A0G = qkx.A0G;
        this.A06 = qkx.A06;
        this.A0E = qkx.A0E;
        this.A0D = qkx.A0D;
        this.A02 = qkx.A02;
        this.A01 = qkx.A01;
        HashMap hashMap = qkx.A0F;
        if (hashMap != null) {
            this.A0F = Pxe.A19(hashMap);
        }
        this.A05 = qkx.A05;
        this.A0C = qkx.A0C;
        this.A0A = qkx.A0A;
        this.A09 = qkx.A09;
        this.A0B = qkx.A0B;
        this.A03 = qkx.A03;
        this.A00 = qkx.A00;
    }

    public C8244Qkx(C268894eF r3, C268894eF r4, JsonSerializer jsonSerializer, C8208QkH qkH, SK8 sk8, SPK spk, C269114eb r9, Object obj, Class[] clsArr, boolean z) {
        super(sk8.A0B());
        C8245Qkz qkz;
        this.A08 = qkH;
        this.A0G = r9;
        160 r0 = 15y.A04;
        this.A04 = new 15y(sk8.A0L());
        this.A07 = sk8.A0D();
        this.A06 = r3;
        this.A02 = jsonSerializer;
        if (jsonSerializer == null) {
            qkz = C8245Qkz.A00;
        } else {
            qkz = null;
        }
        this.A0C = qkz;
        this.A03 = spk;
        this.A05 = r4;
        if (qkH instanceof C8203QkC) {
            this.A0E = null;
            this.A0D = (Field) qkH.A0C();
        } else if (qkH instanceof C8206QkF) {
            this.A0E = (Method) qkH.A0C();
            this.A0D = null;
        } else {
            this.A0E = null;
            this.A0D = null;
        }
        this.A0A = z;
        this.A09 = obj;
        this.A01 = null;
        this.A0B = clsArr;
    }

    public C8244Qkx() {
        super(T9n.A09);
        this.A08 = null;
        this.A0G = null;
        this.A04 = null;
        this.A07 = null;
        this.A0B = null;
        this.A06 = null;
        this.A02 = null;
        this.A0C = null;
        this.A03 = null;
        this.A05 = null;
        this.A0E = null;
        this.A0D = null;
        this.A0A = false;
        this.A09 = null;
        this.A01 = null;
    }
}
