package X;

import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: X.3zO  reason: invalid class name and case insensitive filesystem */
public abstract class C258633zO implements C255463uA {
    public final Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        Object A02 = A02();
        int A00 = A00(A02);
        C2590240b ADI = decoder.ADI(getDescriptor());
        while (true) {
            int ANp = ADI.ANp(getDescriptor());
            if (ANp != -1) {
                A06(A02, ADI, ANp + A00, true);
            } else {
                ADI.AST(getDescriptor());
                return A04(A02);
            }
        }
    }

    public int A00(Object obj) {
        if ((this instanceof AnonymousClass40T) || (this instanceof C258613zM)) {
            AbstractMap abstractMap = (AbstractMap) obj;
            0qQ.A0B(abstractMap, 0);
            return abstractMap.size() * 2;
        } else if ((this instanceof AnonymousClass409) || (this instanceof C2592440y)) {
            AbstractCollection abstractCollection = (AbstractCollection) obj;
            0qQ.A0B(abstractCollection, 0);
            return abstractCollection.size();
        } else {
            C392259uT r2 = (C392259uT) obj;
            0qQ.A0B(r2, 0);
            return r2.A00();
        }
    }

    public int A01(Object obj) {
        if (!(this instanceof AnonymousClass40T)) {
            if (this instanceof AnonymousClass40A) {
                Collection collection = (Collection) obj;
                0qQ.A0B(collection, 0);
                return collection.size();
            } else if (!(this instanceof C258613zM)) {
                if (this instanceof C2592440y) {
                    Object[] objArr = (Object[]) obj;
                    0qQ.A0B(objArr, 0);
                    return objArr.length;
                }
                float[] fArr = (float[]) obj;
                0qQ.A0B(fArr, 0);
                return fArr.length;
            }
        }
        Map map = (Map) obj;
        0qQ.A0B(map, 0);
        return map.size();
    }

    public Object A02() {
        if (this instanceof AnonymousClass40T) {
            return new HashMap();
        }
        if (this instanceof C258613zM) {
            return new LinkedHashMap();
        }
        if ((this instanceof AnonymousClass409) || (this instanceof C2592440y)) {
            return new ArrayList();
        }
        C2592040u r1 = (C2592040u) this;
        return r1.A03(r1.A08());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.util.Collection} */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.B0R, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r0 != false) goto L_0x0063;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A03(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C258613zM
            if (r0 == 0) goto L_0x0014
            java.util.Map r3 = (java.util.Map) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof java.util.LinkedHashMap
            if (r0 != 0) goto L_0x0063
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r3)
            return r1
        L_0x0014:
            boolean r0 = r2 instanceof X.AnonymousClass40T
            if (r0 == 0) goto L_0x0028
            java.util.Map r3 = (java.util.Map) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof java.util.HashMap
            if (r0 != 0) goto L_0x0063
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>(r3)
            return r1
        L_0x0028:
            boolean r0 = r2 instanceof X.C2592440y
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            java.util.List r3 = java.util.Arrays.asList(r3)
            X.0qQ.A07(r3)
        L_0x0039:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            return r1
        L_0x003f:
            boolean r0 = r2 instanceof X.C2591940t
            if (r0 == 0) goto L_0x0059
            float[] r3 = (float[]) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.B0R r1 = new X.B0R
            r1.<init>()
            r1.A01 = r3
            int r0 = r3.length
            r1.A00 = r0
            r0 = 10
            r1.A02(r0)
            return r1
        L_0x0059:
            java.util.Collection r3 = (java.util.Collection) r3
            r0 = 0
            X.0qQ.A0B(r3, r0)
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0039
        L_0x0063:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258633zO.A03(java.lang.Object):java.lang.Object");
    }

    public Object A04(Object obj) {
        if ((this instanceof AnonymousClass40T) || (this instanceof C258613zM) || (this instanceof AnonymousClass409)) {
            0qQ.A0B(obj, 0);
            return obj;
        } else if (this instanceof C2592440y) {
            AbstractCollection abstractCollection = (AbstractCollection) obj;
            0qQ.A0B(abstractCollection, 0);
            C62230ry r1 = ((C2592440y) this).A00;
            0qQ.A0B(r1, 1);
            Object newInstance = Array.newInstance(AnonymousClass2YU.A00(r1), abstractCollection.size());
            0qQ.A0C(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
            Object[] array = abstractCollection.toArray((Object[]) newInstance);
            0qQ.A07(array);
            return array;
        } else {
            C392259uT r3 = (C392259uT) obj;
            0qQ.A0B(r3, 0);
            return r3.A01();
        }
    }

    public final Iterator A05(Object obj) {
        if (!(this instanceof AnonymousClass40T)) {
            if (this instanceof AnonymousClass40A) {
                Collection collection = (Collection) obj;
                0qQ.A0B(collection, 0);
                return collection.iterator();
            } else if (!(this instanceof C258613zM)) {
                if (this instanceof C2592440y) {
                    Object[] objArr = (Object[]) obj;
                    0qQ.A0B(objArr, 0);
                    return new 0sC(objArr);
                }
                throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
            }
        }
        Map map = (Map) obj;
        0qQ.A0B(map, 0);
        return map.entrySet().iterator();
    }

    public void A06(Object obj, C2590240b r9, int i, boolean z) {
        int i2;
        Object AO5;
        if (this instanceof C258623zN) {
            C258623zN r6 = (C258623zN) this;
            Map map = (Map) obj;
            0qQ.A0B(r9, 0);
            0qQ.A0B(map, 2);
            SerialDescriptor descriptor = r6.getDescriptor();
            Object AO52 = r9.AO5((Object) null, r6.A00, descriptor, i);
            if (z) {
                i2 = r9.ANp(descriptor);
                if (i2 != i + 1) {
                    throw new IllegalArgumentException(002.A02(i, i2, "Value must follow key in a map, index for key: ", ", returned index for value: "));
                }
            } else {
                i2 = i + 1;
            }
            if (map.containsKey(AO52)) {
                C255463uA r1 = r6.A01;
                if (!(r1.getDescriptor().BKK() instanceof C255503uE)) {
                    AO5 = r9.AO5(0k2.A0I(AO52, map), r1, descriptor, i2);
                    map.put(AO52, AO5);
                    return;
                }
            }
            AO5 = r9.AO5((Object) null, r6.A01, descriptor, i2);
            map.put(AO52, AO5);
            return;
        }
        AnonymousClass40B r3 = (AnonymousClass40B) this;
        if (r3 instanceof C2591940t) {
            B0R b0r = (B0R) obj;
            0qQ.A0B(r9, 0);
            0qQ.A0B(b0r, 2);
            float ANs = r9.ANs(((C2592040u) r3).A00, i);
            b0r.A02(b0r.A00() + 1);
            float[] fArr = b0r.A01;
            int i3 = b0r.A00;
            b0r.A00 = i3 + 1;
            fArr[i3] = ANs;
            return;
        }
        0qQ.A0B(r9, 0);
        r3.A07(obj, i, r9.AO5((Object) null, r3.A00, r3.getDescriptor(), i));
    }
}
