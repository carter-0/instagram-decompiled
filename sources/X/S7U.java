package X;

import com.fasterxml.jackson.databind.deser.BeanDeserializer;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class S7U {
    public C10435RsC A00;
    public C12829T9a A01;
    public SK6 A02;
    public T9I A03;
    public C8206QkF A04;
    public HashMap A05;
    public HashSet A06;
    public HashSet A07;
    public List A08;
    public boolean A09;
    public final C269454f9 A0A;
    public final C269674fV A0B;
    public final C269134ed A0C;
    public final Map A0D = AnonymousClass7TE.A1H();

    /* JADX WARNING: type inference failed for: r7v1, types: [com.fasterxml.jackson.databind.deser.BeanDeserializerBase, com.fasterxml.jackson.databind.deser.BeanDeserializer] */
    public final BeanDeserializer A00() {
        boolean booleanValue;
        Collection values = this.A0D.values();
        A05(values);
        C269454f9 r7 = this.A0A;
        Map A012 = A01(values);
        C269134ed r10 = this.A0C;
        Boolean A013 = r10.A00().A01(RDC.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        if (A013 == null) {
            booleanValue = r7.A09(C269354ez.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        } else {
            booleanValue = A013.booleanValue();
        }
        TAR tar = new TAR(values, r7.A01.A09, A012, booleanValue);
        Object[] objArr = tar.A03;
        int length = objArr.length;
        int i = 0;
        for (int i2 = 1; i2 < length; i2 += 2) {
            C8218QkR qkR = (C8218QkR) objArr[i2];
            if (qkR != null) {
                qkR.A0H(i);
                i++;
            }
        }
        boolean z = !r7.A09(C269354ez.DEFAULT_VIEW_INCLUSION);
        if (!z) {
            Iterator it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C8218QkR) it.next()).A0P()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        T9I t9i = this.A03;
        if (t9i != null) {
            tar = tar.A03(new C8170Qib(T9n.A08, t9i));
        }
        return new BeanDeserializerBase(this, tar, r10, this.A05, this.A06, this.A07, this.A09, z);
    }

    public final Map A01(Collection collection) {
        C268854eA A012 = this.A0A.A01();
        HashMap hashMap = null;
        if (A012 != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C8218QkR qkR = (C8218QkR) it.next();
                List A0k = A012.A0k(qkR.BRS());
                if (A0k != null && !A0k.isEmpty()) {
                    if (hashMap == null) {
                        hashMap = AnonymousClass7TE.A1E();
                    }
                    hashMap.put(qkR.A06.A02, A0k);
                }
            }
            if (hashMap != null) {
                return hashMap;
            }
        }
        return Collections.emptyMap();
    }

    public final void A02(C8218QkR qkR) {
        Map map = this.A0D;
        String str = qkR.A06.A02;
        Object put = map.put(str, qkR);
        if (put != null && put != qkR) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Duplicate property '");
            A1A.append(str);
            A1A.append("' for ");
            throw C66582MXn.A0j(this.A0C.A05, A1A);
        }
    }

    public final void A03(IllegalArgumentException illegalArgumentException) {
        try {
            this.A0B.A0a(this.A0C, illegalArgumentException.getMessage(), Pxe.A1b());
            throw AnonymousClass00P.createAndThrow();
        } catch (AnonymousClass4iE e) {
            if (e.getCause() == null) {
                e.initCause(illegalArgumentException);
            }
            throw e;
        }
    }

    public final void A04(String str) {
        HashSet hashSet = this.A06;
        if (hashSet == null) {
            hashSet = AnonymousClass7TE.A1F();
            this.A06 = hashSet;
        }
        hashSet.add(str);
    }

    public final void A05(Collection collection) {
        C269454f9 r2 = this.A0A;
        if (r2.A06()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                try {
                    ((C8218QkR) it.next()).A0J(r2);
                } catch (IllegalArgumentException e) {
                    A03(e);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        C12829T9a t9a = this.A01;
        if (t9a != null) {
            t9a.A04.A0D(r2.A08());
        }
        C8206QkF qkF = this.A04;
        if (qkF != null) {
            qkF.A0D(r2.A08());
        }
    }

    public S7U(C269674fV r2, C269134ed r3) {
        this.A0C = r3;
        this.A0B = r2;
        this.A0A = r2.A02;
    }
}
