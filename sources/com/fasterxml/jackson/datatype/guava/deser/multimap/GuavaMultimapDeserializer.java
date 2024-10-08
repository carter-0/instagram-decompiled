package com.fasterxml.jackson.datatype.guava.deser.multimap;

import X.16F;
import X.16L;
import X.17k;
import X.AnonymousClass05K;
import X.AnonymousClass4iD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10889Rzp;
import X.C11287SJg;
import X.C12441SuX;
import X.C12837T9j;
import X.C13901TjO;
import X.C257513xW;
import X.C268894eF;
import X.C269464fA;
import X.C269674fV;
import X.C269764fe;
import X.C269784fg;
import X.Qly;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.list.LinkedListMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.set.HashMultimapDeserializer;
import com.fasterxml.jackson.datatype.guava.deser.multimap.set.LinkedHashMultimapDeserializer;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.CompactLinkedHashMap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.LinkedListMultimap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public abstract class GuavaMultimapDeserializer extends StdDeserializer implements C269784fg {
    public static final List A07 = ImmutableList.of("copyOf", "create");
    public final JsonDeserializer A00;
    public final C10889Rzp A01;
    public final C269764fe A02;
    public final C11287SJg A03;
    public final Qly A04;
    public final Method A05;
    public final boolean A06;

    public final /* bridge */ /* synthetic */ Object A0D(16F r6, C269674fV r7) {
        C257513xW r3;
        Object A0q;
        Object A0D;
        Object A0q2;
        Object A0D2;
        Object A0D3;
        if (r7.A0j(C269464fA.ACCEPT_SINGLE_VALUE_AS_ARRAY)) {
            r3 = A0y();
            A00(r6, 16L.A0D);
            while (r6.A1J() != 16L.A09) {
                C10889Rzp rzp = this.A01;
                if (rzp != null) {
                    A0q2 = rzp.A00(r7, r6.A0q());
                } else {
                    A0q2 = r6.A0q();
                }
                r6.A1J();
                if (r6.A10() != 16L.A0C) {
                    if (r6.A11() == 16L.A0G) {
                        A0D3 = null;
                    } else {
                        C11287SJg sJg = this.A03;
                        JsonDeserializer jsonDeserializer = this.A00;
                        if (sJg != null) {
                            A0D3 = jsonDeserializer.A0J(r6, r7, sJg);
                        } else {
                            A0D3 = jsonDeserializer.A0D(r6, r7);
                        }
                    }
                    r3.E5L(A0q2, A0D3);
                } else {
                    while (r6.A1J() != 16L.A08) {
                        if (r6.A11() == 16L.A0G) {
                            A0D2 = null;
                        } else {
                            C11287SJg sJg2 = this.A03;
                            JsonDeserializer jsonDeserializer2 = this.A00;
                            if (sJg2 != null) {
                                A0D2 = jsonDeserializer2.A0J(r6, r7, sJg2);
                            } else {
                                A0D2 = jsonDeserializer2.A0D(r6, r7);
                            }
                        }
                        r3.E5L(A0q2, A0D2);
                    }
                }
            }
            Method method = this.A05;
            if (method != null) {
                try {
                    return method.invoke((Object) null, new Object[]{r3});
                } catch (InvocationTargetException e) {
                    e = e;
                    String A0i = AnonymousClass7TF.A0i(this.A04, AnonymousClass7TF.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new AnonymousClass4iD(r6, A0i, e);
                } catch (IllegalArgumentException e2) {
                    e = e2;
                    String A0i2 = AnonymousClass7TF.A0i(this.A04, AnonymousClass7TF.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new AnonymousClass4iD(r6, A0i2, e);
                } catch (IllegalAccessException e3) {
                    e = e3;
                    String A0i3 = AnonymousClass7TF.A0i(this.A04, AnonymousClass7TF.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new AnonymousClass4iD(r6, A0i3, e);
                }
            }
        } else {
            r3 = A0y();
            A00(r6, 16L.A0D);
            while (r6.A1J() != 16L.A09) {
                C10889Rzp rzp2 = this.A01;
                if (rzp2 != null) {
                    A0q = rzp2.A00(r7, r6.A0q());
                } else {
                    A0q = r6.A0q();
                }
                r6.A1J();
                A00(r6, 16L.A0C);
                while (r6.A1J() != 16L.A08) {
                    if (r6.A11() != 16L.A0G) {
                        C11287SJg sJg3 = this.A03;
                        JsonDeserializer jsonDeserializer3 = this.A00;
                        if (sJg3 != null) {
                            A0D = jsonDeserializer3.A0J(r6, r7, sJg3);
                        } else {
                            A0D = jsonDeserializer3.A0D(r6, r7);
                        }
                    } else if (!this.A06) {
                        A0D = this.A02.BWm(r7);
                    }
                    r3.E5L(A0q, A0D);
                }
            }
            Method method2 = this.A05;
            if (method2 != null) {
                try {
                    return method2.invoke((Object) null, new Object[]{r3});
                } catch (InvocationTargetException e4) {
                    e = e4;
                    String A0i4 = AnonymousClass7TF.A0i(this.A04, AnonymousClass7TF.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new AnonymousClass4iD(r6, A0i4, e);
                } catch (IllegalArgumentException e5) {
                    e = e5;
                    String A0i5 = AnonymousClass7TF.A0i(this.A04, AnonymousClass7TF.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new AnonymousClass4iD(r6, A0i5, e);
                } catch (IllegalAccessException e6) {
                    e = e6;
                    String A0i6 = AnonymousClass7TF.A0i(this.A04, AnonymousClass7TF.A0n("Could not map to "));
                    while (e.getCause() != null) {
                        e = e.getCause();
                    }
                    throw new AnonymousClass4iD(r6, A0i6, e);
                }
            }
        }
        return r3;
    }

    public final Integer A0I() {
        return AnonymousClass05K.A0C;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.3xW, com.google.common.collect.AbstractMapBasedMultimap, java.lang.Object, com.google.common.collect.LinkedHashMultimap] */
    public final C257513xW A0y() {
        if (this instanceof LinkedHashMultimapDeserializer) {
            CompactLinkedHashMap compactLinkedHashMap = new CompactLinkedHashMap(16);
            ? obj = new Object();
            17k.A0E(compactLinkedHashMap.isEmpty());
            obj.A01 = compactLinkedHashMap;
            obj.valueSetCapacity = 2;
            obj.valueSetCapacity = 2;
            LinkedHashMultimap.ValueEntry valueEntry = new LinkedHashMultimap.ValueEntry((LinkedHashMultimap.ValueEntry) null, (Object) null, (Object) null, 0);
            obj.A00 = valueEntry;
            valueEntry.successorInMultimap = valueEntry;
            valueEntry.predecessorInMultimap = valueEntry;
            return obj;
        } else if (this instanceof HashMultimapDeserializer) {
            return new HashMultimap();
        } else {
            if (this instanceof LinkedListMultimapDeserializer) {
                return new LinkedListMultimap();
            }
            return new ArrayListMultimap();
        }
    }

    public final JsonDeserializer ALh(C13901TjO tjO, C269674fV r9) {
        JsonDeserializer A0D;
        C10889Rzp rzp = this.A01;
        if (rzp == null) {
            rzp = r9.A0G(this.A04.A00);
        }
        JsonDeserializer jsonDeserializer = this.A00;
        Qly qly = this.A04;
        C268894eF r0 = qly.A01;
        if (jsonDeserializer == null) {
            A0D = r9.A0B(tjO, r0);
        } else {
            A0D = r9.A0D(tjO, r0, jsonDeserializer);
        }
        C11287SJg sJg = this.A03;
        if (sJg != null) {
            sJg = sJg.A02(tjO);
        }
        Method method = this.A05;
        C269764fe A0V = A0V(tjO, r9, A0D);
        if (this instanceof LinkedHashMultimapDeserializer) {
            return new GuavaMultimapDeserializer(A0D, rzp, A0V, sJg, qly, method);
        }
        if (this instanceof HashMultimapDeserializer) {
            return new GuavaMultimapDeserializer(A0D, rzp, A0V, sJg, qly, method);
        }
        if (this instanceof LinkedListMultimapDeserializer) {
            return new GuavaMultimapDeserializer(A0D, rzp, A0V, sJg, qly, method);
        }
        return new GuavaMultimapDeserializer(A0D, rzp, A0V, sJg, qly, method);
    }

    public GuavaMultimapDeserializer(JsonDeserializer jsonDeserializer, C10889Rzp rzp, C269764fe r4, C11287SJg sJg, Qly qly, Method method) {
        super((C268894eF) qly);
        boolean A1W;
        this.A04 = qly;
        this.A01 = rzp;
        this.A03 = sJg;
        this.A00 = jsonDeserializer;
        this.A05 = method;
        this.A02 = r4;
        if (r4 == null) {
            A1W = false;
        } else {
            A1W = AnonymousClass7TF.A1W(r4, C12441SuX.A02);
        }
        this.A06 = A1W;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Throwable, X.1bF, X.4iD, java.io.IOException] */
    public static void A00(16F r4, 16L r5) {
        if (r4.A11() != r5) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Expecting ");
            A1A.append(r5);
            A1A.append(", found ");
            String A0i = AnonymousClass7TF.A0i(r4.A11(), A1A);
            C12837T9j A1H = r4.A1H();
            ? iOException = new IOException(A0i, (Throwable) null);
            iOException.A00 = A1H;
            iOException.A01 = r4;
            throw iOException;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GuavaMultimapDeserializer(com.fasterxml.jackson.databind.JsonDeserializer r11, X.C10889Rzp r12, X.C11287SJg r13, X.Qly r14) {
        /*
            r10 = this;
            r8 = r14
            java.lang.Class r5 = r14.A00
            java.lang.Class<com.google.common.collect.LinkedListMultimap> r0 = com.google.common.collect.LinkedListMultimap.class
            r6 = 0
            if (r5 == r0) goto L_0x0044
            java.lang.Class<X.4W4> r0 = X.AnonymousClass4W4.class
            if (r5 == r0) goto L_0x0044
            java.lang.Class<X.3xW> r4 = X.C257513xW.class
            if (r5 == r4) goto L_0x0044
            java.util.List r3 = A07
            java.util.Iterator r2 = r3.iterator()
        L_0x0016:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002b
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.Class[] r0 = new java.lang.Class[]{r4}     // Catch:{ NoSuchMethodException -> 0x0016 }
            java.lang.reflect.Method r9 = r5.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0016 }
            if (r9 == 0) goto L_0x0016
            goto L_0x0045
        L_0x002b:
            java.util.Iterator r2 = r3.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = X.AnonymousClass7TE.A18(r2)
            java.lang.Class[] r0 = new java.lang.Class[]{r4}     // Catch:{ NoSuchMethodException -> 0x002f }
            java.lang.reflect.Method r9 = r5.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x002f }
            if (r9 == 0) goto L_0x002f
            goto L_0x0045
        L_0x0044:
            r9 = r6
        L_0x0045:
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.multimap.GuavaMultimapDeserializer.<init>(com.fasterxml.jackson.databind.JsonDeserializer, X.Rzp, X.SJg, X.Qly):void");
    }
}
