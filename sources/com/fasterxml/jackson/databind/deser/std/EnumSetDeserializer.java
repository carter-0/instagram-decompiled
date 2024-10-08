package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.2Ob;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass4iD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11287SJg;
import X.C12441SuX;
import X.C13901TjO;
import X.C268894eF;
import X.C269454f9;
import X.C269464fA;
import X.C269574fL;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.Pxg;
import X.RDC;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDeserializer extends StdDeserializer implements C269784fg {
    public JsonDeserializer A00;
    public final C268894eF A01;
    public final C269764fe A02;
    public final Boolean A03;
    public final boolean A04;

    public EnumSetDeserializer(C268894eF r4) {
        super(EnumSet.class);
        this.A01 = r4;
        Class cls = r4.A00;
        Iterator it = C269574fL.A00;
        if (Enum.class.isAssignableFrom(cls)) {
            this.A00 = null;
            this.A03 = null;
            this.A02 = null;
            this.A04 = false;
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Type ");
        A1A.append(r4);
        throw Pxg.A0d(" not Java Enum type", A1A);
    }

    public final /* bridge */ /* synthetic */ Object A0C(16F r2, C269674fV r3, Object obj) {
        EnumSet enumSet = (EnumSet) obj;
        if (!r2.A16()) {
            A0z(r2, r3, enumSet);
            return enumSet;
        }
        A0y(r2, r3, enumSet);
        return enumSet;
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r3, C269674fV r4) {
        EnumSet noneOf = EnumSet.noneOf(this.A01.A00);
        if (!r3.A16()) {
            A0z(r3, r4, noneOf);
            return noneOf;
        }
        A0y(r3, r4, noneOf);
        return noneOf;
    }

    public final Boolean A0G(C269454f9 r2) {
        return Boolean.TRUE;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A01;
    }

    public final Object A0K(C269674fV r2) {
        return EnumSet.noneOf(this.A01.A00);
    }

    public final boolean A0M() {
        if (this.A01.A02 != null) {
            return false;
        }
        return true;
    }

    public final void A0z(16F r3, C269674fV r4, EnumSet enumSet) {
        Boolean bool = this.A03;
        if (bool != Boolean.TRUE && (bool != null || !r4.A0j(C269464fA.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            r4.A0T(r3, EnumSet.class);
        } else if (r3.A19(16L.A0G)) {
            r4.A0R(r3, this.A01);
        } else {
            try {
                Enum enumR = (Enum) this.A00.A0D(r3, r4);
                if (enumR != null) {
                    enumSet.add(enumR);
                    return;
                }
                return;
            } catch (Exception e) {
                throw AnonymousClass4iD.A03(enumSet, e, enumSet.size());
            }
        }
        throw AnonymousClass00P.createAndThrow();
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r7) {
        JsonDeserializer A0D;
        Boolean A0X = A0X(RDC.ACCEPT_SINGLE_VALUE_AS_ARRAY, tjO, r7, EnumSet.class);
        JsonDeserializer jsonDeserializer = this.A00;
        C268894eF r0 = this.A01;
        if (jsonDeserializer == null) {
            A0D = r7.A0B(tjO, r0);
        } else {
            A0D = r7.A0D(tjO, r0, jsonDeserializer);
        }
        C269764fe A0V = A0V(tjO, r7, A0D);
        if (2Ob.A00(this.A03, A0X) && jsonDeserializer == A0D && this.A02 == A0D) {
            return this;
        }
        return new EnumSetDeserializer(A0D, A0V, this, A0X);
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A04(r2, r3);
    }

    public final void A0y(16F r3, C269674fV r4, EnumSet enumSet) {
        Enum enumR;
        while (true) {
            try {
                16L A1J = r3.A1J();
                if (A1J != 16L.A08) {
                    if (A1J != 16L.A0G) {
                        enumR = (Enum) this.A00.A0D(r3, r4);
                    } else if (!this.A04) {
                        enumR = (Enum) this.A02.BWm(r4);
                    }
                    if (enumR != null) {
                        enumSet.add(enumR);
                    }
                } else {
                    return;
                }
            } catch (Exception e) {
                throw AnonymousClass4iD.A03(enumSet, e, enumSet.size());
            }
        }
    }

    public EnumSetDeserializer(JsonDeserializer jsonDeserializer, C269764fe r3, EnumSetDeserializer enumSetDeserializer, Boolean bool) {
        super((StdDeserializer) enumSetDeserializer);
        this.A01 = enumSetDeserializer.A01;
        this.A00 = jsonDeserializer;
        this.A02 = r3;
        this.A04 = AnonymousClass7TF.A1W(r3, C12441SuX.A02);
        this.A03 = bool;
    }
}
