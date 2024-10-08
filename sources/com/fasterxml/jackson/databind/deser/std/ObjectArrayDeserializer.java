package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.2Ob;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass4iD;
import X.AnonymousClass4iN;
import X.AnonymousClass7TF;
import X.C11287SJg;
import X.C13901TjO;
import X.C268894eF;
import X.C269464fA;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.Pxe;
import X.Pxh;
import X.RDC;
import X.S7X;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.lang.reflect.Array;

@JacksonStdImpl
public class ObjectArrayDeserializer extends ContainerDeserializerBase implements C269784fg {
    public JsonDeserializer A00;
    public final C11287SJg A01;
    public final Class A02;
    public final boolean A03;
    public final Object[] A04;

    public ObjectArrayDeserializer(C268894eF r3, JsonDeserializer jsonDeserializer, C11287SJg sJg) {
        super(r3, (C269764fe) null, (Boolean) null);
        AnonymousClass4iN r32 = (AnonymousClass4iN) r3;
        Class cls = r32.A00.A00;
        this.A02 = cls;
        this.A03 = AnonymousClass7TF.A1W(cls, Object.class);
        this.A00 = jsonDeserializer;
        this.A01 = sJg;
        this.A04 = (Object[]) r32.A01;
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r11) {
        JsonDeserializer jsonDeserializer = this.A00;
        C268894eF r2 = this.A00;
        Boolean A0X = A0X(RDC.ACCEPT_SINGLE_VALUE_AS_ARRAY, tjO, r11, r2.A00);
        JsonDeserializer A0W = Pxh.A0W(tjO, r11, r2, StdDeserializer.A05(tjO, r11, jsonDeserializer));
        C11287SJg sJg = this.A01;
        C11287SJg sJg2 = sJg;
        if (sJg != null) {
            sJg = sJg.A02(tjO);
        }
        C269764fe A0V = A0V(tjO, r11, A0W);
        if (2Ob.A00(A0X, this.A02) && A0V == this.A01 && A0W == jsonDeserializer && sJg == sJg2) {
            return this;
        }
        return new ObjectArrayDeserializer(A0W, A0V, this, sJg, A0X);
    }

    public final Integer A0B() {
        return AnonymousClass05K.A01;
    }

    public final /* bridge */ /* synthetic */ Object A0C(16F r7, C269674fV r8, Object obj) {
        Object[] A06;
        Object A0J;
        Object[] objArr = (Object[]) obj;
        if (!r7.A16()) {
            Object[] A0y = A0y(r7, r8);
            if (A0y == null) {
                return objArr;
            }
            int length = objArr.length;
            int length2 = A0y.length;
            Object[] objArr2 = new Object[(length2 + length)];
            System.arraycopy(objArr, 0, objArr2, 0, length);
            System.arraycopy(A0y, 0, objArr2, length, length2);
            return objArr2;
        }
        S7X A0M = r8.A0M();
        int length3 = objArr.length;
        Object[] A05 = A0M.A05(objArr, length3);
        C11287SJg sJg = this.A01;
        while (true) {
            try {
                16L A1J = r7.A1J();
                if (A1J == 16L.A08) {
                    break;
                }
                if (A1J == 16L.A0G) {
                    if (!this.A03) {
                        A0J = Pxe.A0q(r8, this);
                    }
                } else if (sJg == null) {
                    A0J = this.A00.A0D(r7, r8);
                } else {
                    A0J = this.A00.A0J(r7, r8, sJg);
                }
                if (length3 >= A05.length) {
                    A05 = A0M.A04(A05);
                    length3 = 0;
                }
                int i = length3 + 1;
                try {
                    A05[length3] = A0J;
                    length3 = i;
                } catch (Exception e) {
                    e = e;
                    length3 = i;
                    throw AnonymousClass4iD.A03(A05, e, A0M.A00 + length3);
                }
            } catch (Exception e2) {
                e = e2;
                throw AnonymousClass4iD.A03(A05, e, A0M.A00 + length3);
            }
        }
        if (this.A03) {
            int i2 = A0M.A00 + length3;
            A06 = new Object[i2];
            A0M.A02(A05, i2, length3, A06);
            A0M.A00();
        } else {
            A06 = A0M.A06(A05, length3, this.A02);
        }
        r8.A0b(A0M);
        return A06;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A00;
    }

    public final boolean A0M() {
        if (this.A00 == null && this.A01 == null) {
            return true;
        }
        return false;
    }

    public final Object[] A0y(16F r6, C269674fV r7) {
        Object obj;
        Object[] objArr;
        Boolean bool = this.A02;
        if (bool == Boolean.TRUE || (bool == null && r7.A0j(C269464fA.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (!r6.A19(16L.A0G)) {
                C11287SJg sJg = this.A01;
                JsonDeserializer jsonDeserializer = this.A00;
                if (sJg == null) {
                    obj = jsonDeserializer.A0D(r6, r7);
                } else {
                    obj = jsonDeserializer.A0J(r6, r7, sJg);
                }
            } else if (this.A03) {
                return this.A04;
            } else {
                obj = Pxe.A0q(r7, this);
            }
            if (this.A03) {
                objArr = new Object[1];
            } else {
                objArr = (Object[]) Array.newInstance(this.A02, 1);
            }
            objArr[0] = obj;
            return objArr;
        } else if (!r6.A19(16L.A0J)) {
            r7.A0R(r6, this.A00);
            throw AnonymousClass00P.createAndThrow();
        } else if (this.A02 != Byte.class) {
            return (Object[]) A0i(r6, r7);
        } else {
            byte[] A1S = r6.A1S(r7.A02.A01.A00);
            int length = A1S.length;
            Byte[] bArr = new Byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = Byte.valueOf(A1S[i]);
            }
            return bArr;
        }
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r7, C269674fV r8) {
        Object[] A06;
        Object A0J;
        if (!r7.A16()) {
            return A0y(r7, r8);
        }
        S7X A0M = r8.A0M();
        Object[] A032 = A0M.A03();
        C11287SJg sJg = this.A01;
        int i = 0;
        while (true) {
            try {
                16L A1J = r7.A1J();
                if (A1J == 16L.A08) {
                    break;
                }
                if (A1J == 16L.A0G) {
                    if (!this.A03) {
                        A0J = Pxe.A0q(r8, this);
                    }
                } else if (sJg == null) {
                    A0J = this.A00.A0D(r7, r8);
                } else {
                    A0J = this.A00.A0J(r7, r8, sJg);
                }
                if (i >= A032.length) {
                    A032 = A0M.A04(A032);
                    i = 0;
                }
                int i2 = i + 1;
                try {
                    A032[i] = A0J;
                    i = i2;
                } catch (Exception e) {
                    e = e;
                    i = i2;
                    throw AnonymousClass4iD.A03(A032, e, A0M.A00 + i);
                }
            } catch (Exception e2) {
                e = e2;
                throw AnonymousClass4iD.A03(A032, e, A0M.A00 + i);
            }
        }
        if (this.A03) {
            int i3 = A0M.A00 + i;
            A06 = new Object[i3];
            A0M.A02(A032, i3, i, A06);
            A0M.A00();
        } else {
            A06 = A0M.A06(A032, i, this.A02);
        }
        r8.A0b(A0M);
        return A06;
    }

    public final /* bridge */ /* synthetic */ Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A04(r2, r3);
    }

    public ObjectArrayDeserializer(JsonDeserializer jsonDeserializer, C269764fe r3, ObjectArrayDeserializer objectArrayDeserializer, C11287SJg sJg, Boolean bool) {
        super(r3, (ContainerDeserializerBase) objectArrayDeserializer, bool);
        this.A02 = objectArrayDeserializer.A02;
        this.A03 = objectArrayDeserializer.A03;
        this.A04 = objectArrayDeserializer.A04;
        this.A00 = jsonDeserializer;
        this.A01 = sJg;
    }
}
