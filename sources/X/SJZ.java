package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class SJZ {
    public final C268894eF A00;
    public final C10694RwY[] A01;
    public final C267574bm[] A02;
    public final String[] A03;
    public final Map A04;

    public SJZ(C268894eF r2, Map map, C10694RwY[] rwYArr) {
        this.A00 = r2;
        this.A01 = rwYArr;
        this.A04 = map;
        this.A03 = null;
        this.A02 = null;
    }

    public final void A00(16F r10, C269674fV r11, Object obj, String str) {
        Object obj2 = this.A04.get(str);
        if (obj2 != null) {
            16F r4 = r10;
            String A1P = r10.A1P();
            C269674fV r5 = r11;
            Object obj3 = obj;
            if (obj2 instanceof List) {
                Iterator A1H = C51966G9m.A1H(obj2);
                while (A1H.hasNext()) {
                    int A0F = AnonymousClass7TG.A0F(A1H);
                    if (str.equals(this.A01[A0F].A03)) {
                        if (obj != null) {
                            C267574bm[] r1 = this.A02;
                            if (r1[A0F] != null) {
                                A01(r4, r5, obj3, A1P, A0F);
                                r1[A0F] = null;
                            }
                        }
                        this.A03[A0F] = A1P;
                    }
                }
                return;
            }
            int A0M = AnonymousClass7TE.A0M(obj2);
            if (str.equals(this.A01[A0M].A03)) {
                if (obj != null) {
                    C267574bm[] r12 = this.A02;
                    if (r12[A0M] != null) {
                        A01(r4, r5, obj3, A1P, A0M);
                        r12[A0M] = null;
                        return;
                    }
                }
                this.A03[A0M] = A1P;
            }
        }
    }

    public final void A02(Object obj, 16F r15, C269674fV r16) {
        AnonymousClass4iD r4;
        C268894eF r2;
        String str;
        Object[] objArr;
        String str2;
        C10694RwY[] rwYArr = this.A01;
        int length = rwYArr.length;
        for (int i = 0; i < length; i++) {
            String str3 = this.A03[i];
            C10694RwY rwY = rwYArr[i];
            C267574bm r22 = this.A02[i];
            Object obj2 = obj;
            16F r8 = r15;
            C269674fV r9 = r16;
            if (str3 != null) {
                if (r22 == null) {
                    C8218QkR qkR = rwY.A01;
                    Boolean bool = qkR.A00.A02;
                    if ((bool != null && bool.booleanValue()) || r9.A0j(C269464fA.FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY)) {
                        Class<?> cls = obj.getClass();
                        String str4 = qkR.A06.A02;
                        r4 = new AnonymousClass4iD(r9.A07, String.format("Missing property '%s' for external type id '%s'", new Object[]{str4, rwY.A03}));
                        if (str4 != null) {
                            r4.A08(cls, str4);
                            throw r4;
                        }
                        throw r4;
                    }
                    return;
                }
                A01(r8, r9, obj2, str3, i);
            } else if (r22 != null) {
                if (SPE.A04[((int) r22.A03.A00) & 15].A03) {
                    C8146Qhf A10 = r22.A10(r15);
                    A10.A1J();
                    C8218QkR qkR2 = rwY.A01;
                    Object A012 = C11287SJg.A01(A10, qkR2.A04);
                    if (A012 != null) {
                        qkR2.A0L(obj, A012);
                    }
                }
                C8225QkY qkY = (C8225QkY) rwY.A02;
                C268894eF r1 = qkY.A03;
                if (r1 != null) {
                    Iterator it = C269574fL.A00;
                    Class cls2 = r1.A00;
                    if (cls2 == null || (str3 = qkY.A04.CLy(cls2, (Object) null)) == null) {
                        r2 = this.A00;
                        str = rwY.A01.A06.A02;
                        objArr = new Object[]{rwY.A03};
                        str2 = "Invalid default type id for property '%s': `null` returned by TypeIdResolver";
                    }
                    A01(r8, r9, obj2, str3, i);
                } else {
                    r2 = this.A00;
                    str = rwY.A01.A06.A02;
                    objArr = new Object[]{rwY.A03};
                    str2 = "Missing external type id property '%s' (and no 'defaultImpl' specified)";
                }
                Class cls3 = r2.A00;
                r4 = new AnonymousClass4iD(r9.A07, String.format(str2, objArr));
                if (str != null) {
                    r4.A08(cls3, str);
                }
                throw r4;
            } else {
                continue;
            }
        }
    }

    public final boolean A03(16F r13, C269674fV r14, Object obj, String str) {
        String[] strArr;
        C267574bm[] r1;
        String str2;
        String str3 = str;
        Object obj2 = this.A04.get(str3);
        if (obj2 == null) {
            return false;
        }
        16F r7 = r13;
        C269674fV r8 = r14;
        if (obj2 instanceof List) {
            Iterator A1H = C51966G9m.A1H(obj2);
            C10694RwY[] rwYArr = this.A01;
            int intValue = ((Number) A1H.next()).intValue();
            if (str3.equals(rwYArr[intValue].A03)) {
                String A1P = r13.A1P();
                r13.A0z();
                String[] strArr2 = this.A03;
                strArr2[intValue] = A1P;
                while (A1H.hasNext()) {
                    strArr2[AnonymousClass7TG.A0F(A1H)] = A1P;
                }
            } else {
                C267574bm r2 = new C267574bm(r13, r14);
                r2.A13(r13);
                C267574bm[] r12 = this.A02;
                r12[intValue] = r2;
                while (A1H.hasNext()) {
                    r12[AnonymousClass7TG.A0F(A1H)] = r2;
                }
            }
        } else {
            int A0M = AnonymousClass7TE.A0M(obj2);
            Object obj3 = obj;
            if (str3.equals(this.A01[A0M].A03)) {
                String[] strArr3 = this.A03;
                strArr3[A0M] = r13.A1Q();
                r13.A0z();
                if (obj != null) {
                    C267574bm[] r15 = this.A02;
                    C267574bm r0 = r15[A0M];
                    strArr = strArr3;
                    r1 = r15;
                    str2 = r0;
                }
            } else {
                C267574bm r02 = new C267574bm(r13, r14);
                r02.A13(r13);
                C267574bm[] r16 = this.A02;
                r16[A0M] = r02;
                if (obj != null) {
                    String[] strArr4 = this.A03;
                    String str4 = strArr4[A0M];
                    r1 = r16;
                    strArr = strArr4;
                    str2 = str4;
                }
            }
            if (str2 != null) {
                String str5 = strArr[A0M];
                strArr[A0M] = null;
                A01(r7, r8, obj3, str5, A0M);
                r1[A0M] = null;
            }
        }
        return true;
    }

    public final void A01(16F r4, C269674fV r5, Object obj, String str, int i) {
        if (str == null) {
            AnonymousClass4iD r1 = new AnonymousClass4iD(r5.A07, "Internal error in external Type Id handling: `null` type id passed");
            Iterator it = C269574fL.A00;
            throw r1;
        }
        C8146Qhf A10 = this.A02[i].A10(r4);
        if (A10.A1J() == 16L.A0G) {
            this.A01[i].A01.A0L(obj, (Object) null);
            return;
        }
        C267574bm r0 = new C267574bm(r4, r5);
        r0.A0b();
        r0.A0t(str);
        r0.A13(A10);
        r0.A0Y();
        C8146Qhf A102 = r0.A10(r4);
        A102.A1J();
        this.A01[i].A01.A0K(obj, A102, r5);
    }

    public SJZ(SJZ sjz) {
        this.A00 = sjz.A00;
        C10694RwY[] rwYArr = sjz.A01;
        this.A01 = rwYArr;
        this.A04 = sjz.A04;
        int length = rwYArr.length;
        this.A03 = new String[length];
        this.A02 = new C267574bm[length];
    }
}
