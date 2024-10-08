package com.fasterxml.jackson.databind.deser.std;

import X.16F;
import X.16L;
import X.2Ob;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass4iD;
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
import X.RDC;
import X.S7X;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
public final class StringArrayDeserializer extends StdDeserializer implements C269784fg {
    public static final StringArrayDeserializer A04 = new StringArrayDeserializer();
    public static final String[] A05 = new String[0];
    public JsonDeserializer A00;
    public final C269764fe A01;
    public final boolean A02;
    public final Boolean A03;

    public StringArrayDeserializer(JsonDeserializer jsonDeserializer, C269764fe r3, Boolean bool) {
        super(String[].class);
        this.A00 = jsonDeserializer;
        this.A01 = r3;
        this.A03 = bool;
        this.A02 = AnonymousClass7TF.A1W(r3, C12441SuX.A02);
    }

    private final String[] A00(16F r3, C269674fV r4) {
        Object A0l;
        Boolean bool = this.A03;
        if (bool == Boolean.TRUE || (bool == null && r4.A0j(C269464fA.ACCEPT_SINGLE_VALUE_AS_ARRAY))) {
            if (r3.A19(16L.A0G)) {
                A0l = this.A01.BWm(r4);
            } else {
                A0l = A0l(r3, r4);
            }
            return new String[]{(String) A0l};
        } else if (r3.A19(16L.A0J)) {
            return (String[]) A0i(r3, r4);
        } else {
            r4.A0T(r3, this.A00);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final Integer A0B() {
        return AnonymousClass05K.A01;
    }

    public final /* bridge */ /* synthetic */ Object A0C(16F r6, C269674fV r7, Object obj) {
        String[] strArr = (String[]) obj;
        if (!r6.A16()) {
            String[] A002 = A00(r6, r7);
            if (A002 == null) {
                return strArr;
            }
            int length = strArr.length;
            int length2 = A002.length;
            String[] strArr2 = new String[(length2 + length)];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            System.arraycopy(A002, 0, strArr2, length, length2);
            return strArr2;
        } else if (this.A00 != null) {
            return A0y(r6, r7, strArr);
        } else {
            S7X A0M = r7.A0M();
            int length3 = strArr.length;
            Object[] A052 = A0M.A05(strArr, length3);
            while (true) {
                try {
                    String A1O = r6.A1O();
                    if (A1O == null) {
                        16L A10 = r6.A10();
                        if (A10 == 16L.A08) {
                            Object[] A06 = A0M.A06(A052, length3, String.class);
                            r7.A0b(A0M);
                            return A06;
                        } else if (A10 != 16L.A0G) {
                            A1O = A0l(r6, r7);
                        } else if (this.A02) {
                            return A05;
                        } else {
                            A1O = (String) this.A01.BWm(r7);
                        }
                    }
                    if (length3 >= A052.length) {
                        A052 = A0M.A04(A052);
                        length3 = 0;
                    }
                    int i = length3 + 1;
                    try {
                        A052[length3] = A1O;
                        length3 = i;
                    } catch (Exception e) {
                        e = e;
                        length3 = i;
                        throw AnonymousClass4iD.A03(A052, e, A0M.A00 + length3);
                    }
                } catch (Exception e2) {
                    e = e2;
                    throw AnonymousClass4iD.A03(A052, e, A0M.A00 + length3);
                }
            }
        }
    }

    public final Boolean A0G(C269454f9 r2) {
        return Boolean.TRUE;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A00;
    }

    public final Object A0K(C269674fV r2) {
        return A05;
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r7) {
        JsonDeserializer A0D;
        JsonDeserializer jsonDeserializer = this.A00;
        JsonDeserializer A052 = StdDeserializer.A05(tjO, r7, jsonDeserializer);
        C268894eF A0A = r7.A0A(String.class);
        if (A052 == null) {
            A0D = r7.A0B(tjO, A0A);
        } else {
            A0D = r7.A0D(tjO, A0A, A052);
        }
        Boolean A0X = A0X(RDC.ACCEPT_SINGLE_VALUE_AS_ARRAY, tjO, r7, String[].class);
        C269764fe A0V = A0V(tjO, r7, A0D);
        if (A0D != null && C269574fL.A0K(A0D)) {
            A0D = null;
        }
        if (jsonDeserializer == A0D && 2Ob.A00(this.A03, A0X) && this.A01 == A0V) {
            return this;
        }
        return new StringArrayDeserializer(A0D, A0V, A0X);
    }

    public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
        if (!r6.A16()) {
            return A00(r6, r7);
        }
        if (this.A00 != null) {
            return A0y(r6, r7, (String[]) null);
        }
        S7X A0M = r7.A0M();
        Object[] A032 = A0M.A03();
        int i = 0;
        while (true) {
            try {
                String A1O = r6.A1O();
                if (A1O == null) {
                    16L A10 = r6.A10();
                    if (A10 == 16L.A08) {
                        Object[] A06 = A0M.A06(A032, i, String.class);
                        r7.A0b(A0M);
                        return A06;
                    } else if (A10 != 16L.A0G) {
                        A1O = A0l(r6, r7);
                    } else if (!this.A02) {
                        A1O = (String) this.A01.BWm(r7);
                    }
                }
                if (i >= A032.length) {
                    A032 = A0M.A04(A032);
                    i = 0;
                }
                int i2 = i + 1;
                try {
                    A032[i] = A1O;
                    i = i2;
                } catch (Exception e) {
                    e = e;
                    i = i2;
                }
            } catch (Exception e2) {
                e = e2;
                throw AnonymousClass4iD.A03(A032, e, A0M.A00 + i);
            }
        }
    }

    public final Object A0J(16F r2, C269674fV r3, C11287SJg sJg) {
        return sJg.A04(r2, r3);
    }

    public final String[] A0y(16F r7, C269674fV r8, String[] strArr) {
        int length;
        Object[] A052;
        String str;
        S7X A0M = r8.A0M();
        if (strArr == null) {
            A052 = A0M.A03();
            length = 0;
        } else {
            length = strArr.length;
            A052 = A0M.A05(strArr, length);
        }
        JsonDeserializer jsonDeserializer = this.A00;
        while (true) {
            try {
                if (r7.A1O() == null) {
                    16L A10 = r7.A10();
                    if (A10 == 16L.A08) {
                        String[] strArr2 = (String[]) A0M.A06(A052, length, String.class);
                        r8.A0b(A0M);
                        return strArr2;
                    } else if (A10 != 16L.A0G) {
                        str = (String) jsonDeserializer.A0D(r7, r8);
                    } else if (!this.A02) {
                        str = (String) this.A01.BWm(r8);
                    }
                } else {
                    str = (String) jsonDeserializer.A0D(r7, r8);
                }
                if (length >= A052.length) {
                    A052 = A0M.A04(A052);
                    length = 0;
                }
                int i = length + 1;
                try {
                    A052[length] = str;
                    length = i;
                } catch (Exception e) {
                    e = e;
                    length = i;
                }
            } catch (Exception e2) {
                e = e2;
                throw AnonymousClass4iD.A03(String.class, e, length);
            }
        }
    }

    public StringArrayDeserializer() {
        this((JsonDeserializer) null, (C269764fe) null, (Boolean) null);
    }
}
