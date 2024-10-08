package X;

import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

public final class TAR implements Iterable, Serializable {
    public int A00;
    public int A01;
    public int A02;
    public Object[] A03;
    public final Locale A04;
    public final Map A05;
    public final Map A06;
    public final boolean A07;
    public final C8218QkR[] A08;

    public static final int A00(C8218QkR qkR, TAR tar) {
        C8218QkR[] qkRArr = tar.A08;
        int length = qkRArr.length;
        for (int i = 0; i < length; i++) {
            if (qkRArr[i] == qkR) {
                return i;
            }
        }
        throw Pxg.A0e("Illegal state: property '", qkR.A06.A02, "' missing from _propsInOrder");
    }

    public final C8218QkR A02(String str) {
        if (str != null) {
            if (this.A07) {
                str = str.toLowerCase(this.A04);
            }
            int hashCode = str.hashCode();
            int i = this.A00;
            int i2 = hashCode & i;
            int i3 = i2 << 1;
            Object[] objArr = this.A03;
            Object obj = objArr[i3];
            if (obj != str && !str.equals(obj)) {
                if (obj != null) {
                    int i4 = i + 1;
                    i3 = ((i2 >> 1) + i4) << 1;
                    Object obj2 = objArr[i3];
                    if (!str.equals(obj2)) {
                        if (obj2 != null) {
                            i3 = (i4 + (i4 >> 1)) << 1;
                            int i5 = this.A02 + i3;
                            while (true) {
                                if (i3 < i5) {
                                    Object obj3 = objArr[i3];
                                    if (obj3 == str || str.equals(obj3)) {
                                        break;
                                    }
                                    i3 += 2;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
                String A11 = DbT.A11(str, this.A06);
                if (A11 == null) {
                    return null;
                }
                int hashCode2 = A11.hashCode();
                int i6 = this.A00;
                int i7 = hashCode2 & i6;
                i3 = i7 << 1;
                objArr = this.A03;
                Object obj4 = objArr[i3];
                if (!A11.equals(obj4)) {
                    if (obj4 == null) {
                        return null;
                    }
                    int i8 = i6 + 1;
                    i3 = ((i7 >> 1) + i8) << 1;
                    Object obj5 = objArr[i3];
                    if (!A11.equals(obj5)) {
                        if (obj5 == null) {
                            return null;
                        }
                        int i9 = (i8 + (i8 >> 1)) << 1;
                        int i10 = this.A02 + i9;
                        while (i3 < i10) {
                            Object obj6 = objArr[i3];
                            if (obj6 != A11 && !A11.equals(obj6)) {
                                i9 = i3 + 2;
                            }
                        }
                        return null;
                    }
                }
            }
            return (C8218QkR) objArr[i3 + 1];
        }
        throw AnonymousClass7TE.A0w("Cannot pass null property name");
    }

    public final TAR A03(C8218QkR qkR) {
        boolean z = this.A07;
        String str = qkR.A06.A02;
        if (z) {
            str = str.toLowerCase(this.A04);
        }
        Object[] objArr = this.A03;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            C8218QkR qkR2 = (C8218QkR) objArr[i];
            if (qkR2 != null && qkR2.A06.A02.equals(str)) {
                return new TAR(qkR, this, i, A00(qkR2, this));
            }
        }
        return new TAR(qkR, this, str, str.hashCode() & this.A00);
    }

    public final Iterator iterator() {
        ArrayList A0v = DbS.A0v(this.A01);
        Object[] objArr = this.A03;
        int length = objArr.length;
        for (int i = 1; i < length; i += 2) {
            Object obj = objArr[i];
            if (obj != null) {
                A0v.add(obj);
            }
        }
        return A0v.iterator();
    }

    public TAR(TAR tar, boolean z) {
        this.A07 = z;
        this.A04 = tar.A04;
        this.A05 = tar.A05;
        this.A06 = tar.A06;
        C8218QkR[] qkRArr = tar.A08;
        C8218QkR[] qkRArr2 = (C8218QkR[]) Arrays.copyOf(qkRArr, qkRArr.length);
        this.A08 = qkRArr2;
        A04(Arrays.asList(qkRArr2));
    }

    public static C8218QkR A01(16F r0, BeanDeserializerBase beanDeserializerBase, String str) {
        r0.A1J();
        return beanDeserializerBase.A0A.A02(str);
    }

    public final void A04(Collection collection) {
        int i;
        int size = collection.size();
        this.A01 = size;
        if (size <= 5) {
            i = 8;
        } else {
            i = 16;
            if (size > 12) {
                i = 32;
                while (i < size + (size >> 2)) {
                    i += i;
                }
            }
        }
        this.A00 = i - 1;
        int i2 = (i >> 1) + i;
        Object[] objArr = new Object[(i2 * 2)];
        Iterator it = collection.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            C8218QkR qkR = (C8218QkR) it.next();
            if (qkR != null) {
                boolean z = this.A07;
                String str = qkR.A06.A02;
                if (z) {
                    str = str.toLowerCase(this.A04);
                }
                int hashCode = str.hashCode() & this.A00;
                int i4 = hashCode << 1;
                if (objArr[i4] != null) {
                    i4 = ((hashCode >> 1) + i) << 1;
                    if (objArr[i4] != null) {
                        i4 = (i2 << 1) + i3;
                        i3 += 2;
                        if (i4 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i4] = str;
                objArr[i4 + 1] = qkR;
            }
        }
        this.A03 = objArr;
        this.A02 = i3;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Properties=[");
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            C8218QkR qkR = (C8218QkR) it.next();
            int i2 = i + 1;
            if (i > 0) {
                Pxe.A1Y(A1A);
            }
            A1A.append(qkR.A06.A02);
            A1A.append('(');
            A1A.append(qkR.A04);
            A1A.append(')');
            i = i2;
        }
        A1A.append(']');
        Map map = this.A05;
        if (!map.isEmpty()) {
            A1A.append("(aliases: ");
            A1A.append(map);
            A1A.append(")");
        }
        return A1A.toString();
    }

    public TAR(Collection collection, Locale locale, Map map, boolean z) {
        HashMap hashMap;
        this.A07 = z;
        this.A08 = (C8218QkR[]) collection.toArray(new C8218QkR[collection.size()]);
        this.A05 = map;
        this.A04 = locale;
        if (map == null || map.isEmpty()) {
            hashMap = Collections.emptyMap();
        } else {
            HashMap A1E = AnonymousClass7TE.A1E();
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                String A13 = DbT.A13(A1J);
                A13 = z ? A13.toLowerCase(locale) : A13;
                Iterator A1H = C51966G9m.A1H(A1J.getValue());
                while (A1H.hasNext()) {
                    String str = ((C269434f7) A1H.next()).A02;
                    if (z) {
                        str = str.toLowerCase(locale);
                    }
                    A1E.put(str, A13);
                }
            }
            hashMap = A1E;
        }
        this.A06 = hashMap;
        A04(collection);
    }

    public TAR(C8218QkR qkR, TAR tar, String str, int i) {
        this.A07 = tar.A07;
        this.A04 = tar.A04;
        this.A00 = tar.A00;
        this.A01 = tar.A01;
        this.A02 = tar.A02;
        this.A05 = tar.A05;
        this.A06 = tar.A06;
        Object[] objArr = tar.A03;
        this.A03 = Arrays.copyOf(objArr, objArr.length);
        C8218QkR[] qkRArr = tar.A08;
        int length = qkRArr.length;
        C8218QkR[] qkRArr2 = (C8218QkR[]) Arrays.copyOf(qkRArr, length + 1);
        this.A08 = qkRArr2;
        qkRArr2[length] = qkR;
        int i2 = this.A00 + 1;
        int i3 = i << 1;
        Object[] objArr2 = this.A03;
        if (objArr2[i3] != null) {
            i3 = ((i >> 1) + i2) << 1;
            if (objArr2[i3] != null) {
                int i4 = this.A02;
                i3 = ((i2 + (i2 >> 1)) << 1) + i4;
                this.A02 = i4 + 2;
                int length2 = objArr2.length;
                if (i3 >= length2) {
                    objArr2 = Arrays.copyOf(objArr2, length2 + 4);
                    this.A03 = objArr2;
                }
            }
        }
        objArr2[i3] = str;
        objArr2[i3 + 1] = qkR;
    }

    public TAR(C8218QkR qkR, TAR tar, int i, int i2) {
        this.A07 = tar.A07;
        this.A04 = tar.A04;
        this.A00 = tar.A00;
        this.A01 = tar.A01;
        this.A02 = tar.A02;
        this.A05 = tar.A05;
        this.A06 = tar.A06;
        Object[] objArr = tar.A03;
        this.A03 = Arrays.copyOf(objArr, objArr.length);
        C8218QkR[] qkRArr = tar.A08;
        C8218QkR[] qkRArr2 = (C8218QkR[]) Arrays.copyOf(qkRArr, qkRArr.length);
        this.A08 = qkRArr2;
        this.A03[i] = qkR;
        qkRArr2[i2] = qkR;
    }
}
