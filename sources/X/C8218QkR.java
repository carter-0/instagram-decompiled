package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;

/* renamed from: X.QkR  reason: case insensitive filesystem */
public abstract class C8218QkR extends SuT implements Serializable {
    public static final JsonDeserializer A0B = new FailingDeserializer();
    public C11243SHd A00;
    public String A01;
    public int A02 = -1;
    public C12830T9c A03;
    public final C268894eF A04;
    public final JsonDeserializer A05;
    public final C269434f7 A06;
    public final C269764fe A07;
    public final C11287SJg A08;
    public final C269434f7 A09;
    public final transient C269114eb A0A;

    public static final void A01(16F r2, Exception exc) {
        Iterator it = C269574fL.A00;
        if (!(exc instanceof IOException)) {
            C269574fL.A0F(exc);
            Throwable th = exc;
            while (th.getCause() != null) {
                th = th.getCause();
            }
            throw new AnonymousClass4iD(r2, C269574fL.A09(th), th);
        }
        throw exc;
    }

    public final int A02() {
        C8218QkR qkR;
        if (this instanceof C8169Qia) {
            qkR = ((C8169Qia) this).A00;
        } else if (this instanceof C8168QiZ) {
            qkR = ((C8168QiZ) this).A00;
        } else if (this instanceof C8174Qif) {
            return ((C8174Qif) this).A02;
        } else {
            throw Pxf.A0Y("Internal error: no creator index for property '%s' (of type %s)", new Object[]{this.A06.A02, C66581MXm.A0y(this)});
        }
        return qkR.A02();
    }

    public final JsonDeserializer A03() {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A03();
        }
        JsonDeserializer jsonDeserializer = this.A05;
        if (jsonDeserializer == A0B) {
            return null;
        }
        return jsonDeserializer;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.Qif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: X.Qie} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: X.Qia} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: X.Qib} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: X.Qic} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: X.Qif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: X.Qif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: X.Qif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: X.Qif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: X.Qif} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: X.Qif} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C8218QkR A04(com.fasterxml.jackson.databind.JsonDeserializer r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C8171Qic
            if (r0 == 0) goto L_0x0016
            r3 = r4
            X.Qic r3 = (X.C8171Qic) r3
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r3.A05
            if (r1 == r5) goto L_0x0094
            X.4fe r0 = r3.A07
            if (r1 != r0) goto L_0x0010
            r0 = r5
        L_0x0010:
            X.Qic r2 = new X.Qic
            r2.<init>(r5, r0, r3)
        L_0x0015:
            return r2
        L_0x0016:
            boolean r0 = r4 instanceof X.C8170Qib
            if (r0 == 0) goto L_0x002c
            r3 = r4
            X.Qib r3 = (X.C8170Qib) r3
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r3.A05
            if (r1 == r5) goto L_0x0094
            X.4fe r0 = r3.A07
            if (r1 != r0) goto L_0x0026
            r0 = r5
        L_0x0026:
            X.Qib r2 = new X.Qib
            r2.<init>(r5, r0, r3)
            return r2
        L_0x002c:
            boolean r0 = r4 instanceof X.C8169Qia
            if (r0 == 0) goto L_0x0042
            r3 = r4
            X.Qia r3 = (X.C8169Qia) r3
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r3.A05
            if (r1 == r5) goto L_0x0094
            X.4fe r0 = r3.A07
            if (r1 != r0) goto L_0x003c
            r0 = r5
        L_0x003c:
            X.Qia r2 = new X.Qia
            r2.<init>(r5, r0, r3)
            return r2
        L_0x0042:
            boolean r0 = r4 instanceof X.C8173Qie
            if (r0 == 0) goto L_0x0058
            r3 = r4
            X.Qie r3 = (X.C8173Qie) r3
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r3.A05
            if (r1 == r5) goto L_0x0094
            X.4fe r0 = r3.A07
            if (r1 != r0) goto L_0x0052
            r0 = r5
        L_0x0052:
            X.Qie r2 = new X.Qie
            r2.<init>(r5, r0, r3)
            return r2
        L_0x0058:
            boolean r0 = r4 instanceof X.C8172Qid
            if (r0 == 0) goto L_0x006e
            r3 = r4
            X.Qid r3 = (X.C8172Qid) r3
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r3.A05
            if (r1 == r5) goto L_0x0094
            X.4fe r0 = r3.A07
            if (r1 != r0) goto L_0x0068
            r0 = r5
        L_0x0068:
            X.Qid r2 = new X.Qid
            r2.<init>(r5, r0, r3)
            return r2
        L_0x006e:
            boolean r0 = r4 instanceof X.C8168QiZ
            if (r0 == 0) goto L_0x0082
            r2 = r4
            X.QiZ r2 = (X.C8168QiZ) r2
            X.QkR r1 = r2.A00
            X.QkR r0 = r1.A04(r5)
            if (r0 == r1) goto L_0x0015
            X.QkR r3 = r2.A0S(r0)
            return r3
        L_0x0082:
            r3 = r4
            X.Qif r3 = (X.C8174Qif) r3
            com.fasterxml.jackson.databind.JsonDeserializer r1 = r3.A05
            if (r1 == r5) goto L_0x0094
            X.4fe r0 = r3.A07
            if (r1 != r0) goto L_0x008e
            r0 = r5
        L_0x008e:
            X.Qif r2 = new X.Qif
            r2.<init>(r5, r3, r0)
            return r2
        L_0x0094:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8218QkR.A04(com.fasterxml.jackson.databind.JsonDeserializer):X.QkR");
    }

    public final C8218QkR A05(C269434f7 r4) {
        if (this instanceof C8171Qic) {
            return new C8171Qic(r4, (C8171Qic) this);
        }
        if (this instanceof C8170Qib) {
            return new C8170Qib(r4, (C8170Qib) this);
        }
        if (this instanceof C8169Qia) {
            return new C8169Qia(r4, (C8169Qia) this);
        }
        if (this instanceof C8173Qie) {
            return new C8173Qie(r4, (C8173Qie) this);
        }
        if (this instanceof C8172Qid) {
            return new C8172Qid(r4, (C8172Qid) this);
        }
        if (!(this instanceof C8168QiZ)) {
            return new C8174Qif(r4, (C8174Qif) this);
        }
        C8168QiZ qiZ = (C8168QiZ) this;
        C8218QkR qkR = qiZ.A00;
        C8218QkR A052 = qkR.A05(r4);
        if (A052 != qkR) {
            return qiZ.A0S(A052);
        }
        return qiZ;
    }

    public final C8218QkR A06(C269764fe r4) {
        if (this instanceof C8171Qic) {
            C8171Qic qic = (C8171Qic) this;
            return new C8171Qic(qic.A05, r4, qic);
        } else if (this instanceof C8170Qib) {
            C8170Qib qib = (C8170Qib) this;
            return new C8170Qib(qib.A05, r4, qib);
        } else if (this instanceof C8169Qia) {
            C8169Qia qia = (C8169Qia) this;
            return new C8169Qia(qia.A05, r4, qia);
        } else if (this instanceof C8173Qie) {
            C8173Qie qie = (C8173Qie) this;
            return new C8173Qie(qie.A05, r4, qie);
        } else if (this instanceof C8172Qid) {
            C8172Qid qid = (C8172Qid) this;
            return new C8172Qid(qid.A05, r4, qid);
        } else if (this instanceof C8168QiZ) {
            C8168QiZ qiZ = (C8168QiZ) this;
            C8218QkR qkR = qiZ.A00;
            C8218QkR A062 = qkR.A06(r4);
            if (A062 != qkR) {
                return qiZ.A0S(A062);
            }
            return qiZ;
        } else {
            C8174Qif qif = (C8174Qif) this;
            return new C8174Qif(qif.A05, qif, r4);
        }
    }

    public final C8218QkR A07(String str) {
        C269434f7 r0;
        C269434f7 r2 = this.A06;
        if (r2 == null) {
            r0 = new C269434f7(str, (String) null);
        } else {
            if (str == null) {
                str = "";
            }
            if (str.equals(r2.A02)) {
                r0 = r2;
            } else {
                r0 = new C269434f7(str, r2.A01);
            }
            if (r0 == r2) {
                return this;
            }
        }
        return A05(r0);
    }

    public final C11243SHd A08() {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A08();
        }
        return this.A00;
    }

    public final C11287SJg A09() {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A09();
        }
        return this.A08;
    }

    public final Class A0A() {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A0A();
        }
        return BRS().A09();
    }

    public final Object A0B() {
        C12834T9g t9g;
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A0B();
        }
        if (!(this instanceof C8174Qif) || (t9g = ((C8174Qif) this).A03) == null) {
            return null;
        }
        return t9g.A01;
    }

    public final Object A0C(16F r3, C269674fV r4) {
        if (!r3.A19(16L.A0G)) {
            C11287SJg sJg = this.A08;
            JsonDeserializer jsonDeserializer = this.A05;
            if (sJg != null) {
                return jsonDeserializer.A0J(r3, r4, sJg);
            }
            Object A0D = jsonDeserializer.A0D(r3, r4);
            if (A0D != null) {
                return A0D;
            }
        }
        return this.A07.BWm(r4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.Qie} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.Qid} */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r3 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00ba, code lost:
        if (r3 == null) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00de, code lost:
        if (r4.A05.A0F() != null) goto L_0x00e0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[Catch:{ Exception -> 0x0106 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:73:0x0100=Splitter:B:73:0x0100, B:24:0x004c=Splitter:B:24:0x004c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0D(X.16F r6, X.C269674fV r7, java.lang.Object r8) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.C8171Qic
            if (r0 == 0) goto L_0x0008
            r5.A0K(r8, r6, r7)
        L_0x0007:
            return r8
        L_0x0008:
            boolean r0 = r5 instanceof X.C8170Qib
            if (r0 == 0) goto L_0x0019
            r1 = r5
            X.Qib r1 = (X.C8170Qib) r1
            X.16L r0 = X.16L.A0G
            boolean r0 = r6.A19(r0)
            if (r0 == 0) goto L_0x005a
            r0 = 0
        L_0x0018:
            return r0
        L_0x0019:
            boolean r0 = r5 instanceof X.C8169Qia
            if (r0 == 0) goto L_0x0022
            r4 = r5
            X.Qia r4 = (X.C8169Qia) r4
            goto L_0x00c7
        L_0x0022:
            boolean r0 = r5 instanceof X.C8173Qie
            if (r0 == 0) goto L_0x0076
            r2 = r5
            X.Qie r2 = (X.C8173Qie) r2
            X.16L r0 = X.16L.A0G
            boolean r0 = r6.A19(r0)
            if (r0 != 0) goto L_0x003d
            X.SJg r1 = r2.A08
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.A05
            if (r1 != 0) goto L_0x0048
            java.lang.Object r3 = r0.A0D(r6, r7)
            if (r3 != 0) goto L_0x004c
        L_0x003d:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0007
            X.4fe r0 = r2.A07
            java.lang.Object r3 = r0.BWm(r7)
            goto L_0x004c
        L_0x0048:
            java.lang.Object r3 = r0.A0J(r6, r7, r1)
        L_0x004c:
            java.lang.reflect.Method r1 = r2.A02     // Catch:{ Exception -> 0x0106 }
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ Exception -> 0x0106 }
            java.lang.Object r0 = r1.invoke(r8, r0)     // Catch:{ Exception -> 0x0106 }
            if (r0 != 0) goto L_0x0018
            goto L_0x00fb
        L_0x005a:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r1.A05
            java.lang.Object r3 = r0.A0D(r6, r7)
            X.T9I r2 = r1.A00
            X.T9X r1 = r2.A00
            X.Taf r0 = r2.A01
            X.S6M r0 = r7.A0I(r1, r0, r3)
            r0.A01(r8)
            X.QkR r0 = r2.A05
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r0.A0F(r8, r3)
            return r0
        L_0x0076:
            boolean r0 = r5 instanceof X.C8166QiX
            if (r0 == 0) goto L_0x0099
            r1 = r5
            X.QiX r1 = (X.C8166QiX) r1
            X.QkH r0 = r1.A00
            java.lang.Object r2 = r0.A0A(r8)
            X.QkR r1 = r1.A00
            if (r2 != 0) goto L_0x0094
            java.lang.Object r0 = r1.A0C(r6, r7)
        L_0x008b:
            if (r0 == r2) goto L_0x0007
            if (r0 == 0) goto L_0x0007
            java.lang.Object r0 = r1.A0F(r8, r0)
            return r0
        L_0x0094:
            java.lang.Object r0 = r1.A0E(r6, r7, r2)
            goto L_0x008b
        L_0x0099:
            boolean r0 = r5 instanceof X.C8167QiY
            if (r0 != 0) goto L_0x0120
            boolean r0 = r5 instanceof X.C8165QiW
            if (r0 != 0) goto L_0x0120
            boolean r0 = r5 instanceof X.C8172Qid
            if (r0 == 0) goto L_0x010f
            r2 = r5
            X.Qid r2 = (X.C8172Qid) r2
            X.16L r0 = X.16L.A0G
            boolean r0 = r6.A19(r0)
            if (r0 != 0) goto L_0x00bc
            X.SJg r1 = r2.A08
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.A05
            if (r1 != 0) goto L_0x00fc
            java.lang.Object r3 = r0.A0D(r6, r7)
            if (r3 != 0) goto L_0x0100
        L_0x00bc:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0007
            X.4fe r0 = r2.A07
            java.lang.Object r3 = r0.BWm(r7)
            goto L_0x0100
        L_0x00c7:
            java.lang.Object r1 = r4.A0C(r6, r7)     // Catch:{ Qi1 -> 0x00d2 }
            X.QkR r0 = r4.A00     // Catch:{ Qi1 -> 0x00d2 }
            java.lang.Object r0 = r0.A0F(r8, r1)     // Catch:{ Qi1 -> 0x00d2 }
            return r0
        L_0x00d2:
            r3 = move-exception
            X.SHd r0 = r4.A00
            if (r0 != 0) goto L_0x00e0
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r4.A05
            X.T9I r1 = r0.A0F()
            r0 = 0
            if (r1 == 0) goto L_0x00e1
        L_0x00e0:
            r0 = 1
        L_0x00e1:
            if (r0 == 0) goto L_0x00f3
            X.S6M r2 = r3.A00
            X.4eF r0 = r4.A04
            java.lang.Class r1 = r0.A00
            X.Qiq r0 = new X.Qiq
            r0.<init>(r3, r4, r1, r8)
            r2.A00(r0)
            r8 = 0
            return r8
        L_0x00f3:
            java.lang.String r1 = "Unresolved forward reference but no identity info"
            X.4iD r0 = new X.4iD
            r0.<init>(r6, r1, r3)
            throw r0
        L_0x00fb:
            return r8
        L_0x00fc:
            java.lang.Object r3 = r0.A0J(r6, r7, r1)
        L_0x0100:
            java.lang.reflect.Field r0 = r2.A02     // Catch:{ Exception -> 0x0106 }
            r0.set(r8, r3)     // Catch:{ Exception -> 0x0106 }
            return r8
        L_0x0106:
            r0 = move-exception
            r2.A0I(r6, r0, r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x010f:
            r0 = r5
            X.Qif r0 = (X.C8174Qif) r0
            X.C8174Qif.A00(r0)
            X.QkR r1 = r0.A00
            java.lang.Object r0 = r0.A0C(r6, r7)
            java.lang.Object r8 = r1.A0F(r8, r0)
            return r8
        L_0x0120:
            java.lang.Object r0 = r5.A0C(r6, r7)
            java.lang.Object r8 = r5.A0F(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8218QkR.A0D(X.16F, X.4fV, java.lang.Object):java.lang.Object");
    }

    public final Object A0E(16F r4, C269674fV r5, Object obj) {
        if (!r4.A19(16L.A0G)) {
            if (this.A08 != null) {
                Pxf.A1H(r5, this.A04, "Cannot merge polymorphic property '%s'", new Object[]{this.A06.A02});
                throw AnonymousClass00P.createAndThrow();
            }
            Object A0C = this.A05.A0C(r4, r5, obj);
            if (A0C != null) {
                return A0C;
            }
        }
        C269764fe r1 = this.A07;
        if (r1 == C12441SuX.A02) {
            return obj;
        }
        return r1.BWm(r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.Qie} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.QiY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: X.QiY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.QiY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.QiY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.QiY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.Qid} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0F(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C8171Qic
            if (r0 == 0) goto L_0x000c
            r6.A0L(r7, r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x000c:
            boolean r0 = r6 instanceof X.C8170Qib
            if (r0 == 0) goto L_0x0020
            r0 = r6
            X.Qib r0 = (X.C8170Qib) r0
            X.T9I r0 = r0.A00
            X.QkR r0 = r0.A05
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "Should not call set() on ObjectIdProperty that has no SettableBeanProperty"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x0020:
            boolean r0 = r6 instanceof X.C8169Qia
            if (r0 == 0) goto L_0x002e
            r0 = r6
            X.Qia r0 = (X.C8169Qia) r0
            X.QkR r0 = r0.A00
        L_0x0029:
            java.lang.Object r7 = r0.A0F(r7, r8)
            return r7
        L_0x002e:
            boolean r0 = r6 instanceof X.C8173Qie
            if (r0 == 0) goto L_0x0043
            r2 = r6
            X.Qie r2 = (X.C8173Qie) r2
            java.lang.reflect.Method r1 = r2.A02     // Catch:{ Exception -> 0x00d5 }
            java.lang.Object[] r0 = new java.lang.Object[]{r8}     // Catch:{ Exception -> 0x00d5 }
            java.lang.Object r0 = r1.invoke(r7, r0)     // Catch:{ Exception -> 0x00d5 }
            if (r0 != 0) goto L_0x0060
            goto L_0x00ce
        L_0x0043:
            boolean r0 = r6 instanceof X.C8172Qid
            if (r0 == 0) goto L_0x004c
            r2 = r6
            X.Qid r2 = (X.C8172Qid) r2
            goto L_0x00cf
        L_0x004c:
            boolean r0 = r6 instanceof X.C8168QiZ
            if (r0 == 0) goto L_0x00c4
            r5 = r6
            X.QiZ r5 = (X.C8168QiZ) r5
            boolean r0 = r5 instanceof X.C8166QiX
            if (r0 == 0) goto L_0x0061
            r0 = r7
            if (r8 == 0) goto L_0x0060
        L_0x005a:
            X.QkR r0 = r5.A00
            java.lang.Object r0 = r0.A0F(r7, r8)
        L_0x0060:
            return r0
        L_0x0061:
            boolean r0 = r5 instanceof X.C8167QiY
            if (r0 == 0) goto L_0x005a
            X.QiY r5 = (X.C8167QiY) r5
            if (r8 == 0) goto L_0x005a
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x00be
            boolean r0 = r8 instanceof java.lang.Object[]
            if (r0 == 0) goto L_0x0084
            r4 = r8
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r3 = r4.length
            r2 = 0
        L_0x0076:
            if (r2 >= r3) goto L_0x005a
            r1 = r4[r2]
            if (r1 == 0) goto L_0x0081
            X.QkR r0 = r5.A00
            r0.A0L(r1, r7)
        L_0x0081:
            int r2 = r2 + 1
            goto L_0x0076
        L_0x0084:
            boolean r0 = r8 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00a1
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x008f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L_0x008f
            X.QkR r0 = r5.A00
            r0.A0L(r1, r7)
            goto L_0x008f
        L_0x00a1:
            boolean r0 = r8 instanceof java.util.Map
            if (r0 == 0) goto L_0x00df
            r0 = r8
            java.util.Map r0 = (java.util.Map) r0
            java.util.Iterator r2 = X.AnonymousClass7TF.A0v(r0)
        L_0x00ac:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r1 = r2.next()
            if (r1 == 0) goto L_0x00ac
            X.QkR r0 = r5.A00
            r0.A0L(r1, r7)
            goto L_0x00ac
        L_0x00be:
            X.QkR r0 = r5.A00
            r0.A0L(r8, r7)
            goto L_0x005a
        L_0x00c4:
            r0 = r6
            X.Qif r0 = (X.C8174Qif) r0
            X.C8174Qif.A00(r0)
            X.QkR r0 = r0.A00
            goto L_0x0029
        L_0x00ce:
            return r7
        L_0x00cf:
            java.lang.reflect.Field r0 = r2.A02     // Catch:{ Exception -> 0x00d5 }
            r0.set(r7, r8)     // Catch:{ Exception -> 0x00d5 }
            return r7
        L_0x00d5:
            r1 = move-exception
            r0 = 0
            r2.A0I(r0, r1, r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00df:
            java.lang.String r4 = "Unsupported container type ("
            java.lang.String r3 = X.C66581MXm.A0y(r8)
            java.lang.String r2 = ") when resolving reference '"
            java.lang.String r1 = r5.A01
            java.lang.String r0 = "'"
            java.lang.String r0 = X.002.A11(r4, r3, r2, r1, r0)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8218QkR.A0F(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String A0G() {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A0G();
        }
        return this.A01;
    }

    public final void A0H(int i) {
        int i2 = i;
        if (this instanceof C8168QiZ) {
            ((C8168QiZ) this).A00.A0H(i);
            return;
        }
        int i3 = this.A02;
        if (i3 == -1) {
            this.A02 = i;
            return;
        }
        throw AnonymousClass7TE.A0z(002.A0y("Property '", this.A06.A02, "' already had index (", "), trying to assign ", i3, i2));
    }

    public final void A0I(16F r4, Exception exc, Object obj) {
        if (exc instanceof IllegalArgumentException) {
            String A072 = C269574fL.A07(obj);
            StringBuilder A16 = Pxe.A16("Problem deserializing property '");
            A16.append(this.A06.A02);
            A16.append("' (expected type: ");
            A16.append(this.A04);
            A16.append("; actual type: ");
            A16.append(A072);
            A16.append(")");
            String A092 = C269574fL.A09(exc);
            if (A092 != null) {
                A16.append(", problem: ");
            } else {
                A092 = " (no error message provided)";
            }
            throw new AnonymousClass4iD(r4, AnonymousClass7TF.A0l(A092, A16), exc);
        }
        A01(r4, exc);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0J(C269454f9 r3) {
        C8218QkR qkR;
        C8206QkF qkF;
        if (this instanceof C8171Qic) {
            qkF = ((C8171Qic) this).A00;
        } else {
            if (this instanceof C8169Qia) {
                qkR = ((C8169Qia) this).A00;
            } else if (this instanceof C8173Qie) {
                qkF = ((C8173Qie) this).A00;
            } else if (this instanceof C8172Qid) {
                C269574fL.A0H(((C8172Qid) this).A02, r3.A08());
                return;
            } else if (this instanceof C8168QiZ) {
                C8168QiZ qiZ = (C8168QiZ) this;
                if (qiZ instanceof C8167QiY) {
                    C8167QiY qiY = (C8167QiY) qiZ;
                    qiY.A00.A0J(r3);
                    qkR = qiY.A00;
                } else {
                    qkR = qiZ.A00;
                }
                qkR.A0J(r3);
                return;
            } else if (this instanceof C8174Qif) {
                qkR = ((C8174Qif) this).A00;
            } else {
                return;
            }
            if (qkR == null) {
                return;
            }
            qkR.A0J(r3);
            return;
        }
        qkF.A0D(r3.A08());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.Qie} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.Qid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.Qid} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        if (r3 == null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fd, code lost:
        if (r3 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0074=Splitter:B:32:0x0074, B:75:0x0139=Splitter:B:75:0x0139} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(java.lang.Object r5, X.16F r6, X.C269674fV r7) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C8171Qic
            if (r0 == 0) goto L_0x0042
            r3 = r4
            X.Qic r3 = (X.C8171Qic) r3
            X.16L r0 = X.16L.A0G
            boolean r0 = r6.A19(r0)
            if (r0 != 0) goto L_0x0150
            X.SJg r0 = r3.A08
            if (r0 == 0) goto L_0x0027
            X.4eF r2 = r3.A04
            X.4f7 r0 = r3.A06
            java.lang.String r0 = r0.A02
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Problem deserializing 'setterless' property (\"%s\"): no way to handle typed deser with setterless yet"
        L_0x001f:
            X.Pxf.A1H(r7, r2, r0, r1)
        L_0x0022:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0027:
            java.lang.reflect.Method r1 = r3.A01     // Catch:{ Exception -> 0x003d }
            r0 = 0
            java.lang.Object r1 = r1.invoke(r5, r0)     // Catch:{ Exception -> 0x003d }
            if (r1 != 0) goto L_0x0145
            X.4eF r2 = r3.A04
            X.4f7 r0 = r3.A06
            java.lang.String r0 = r0.A02
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "Problem deserializing 'setterless' property '%s': get method returned null"
            goto L_0x001f
        L_0x003d:
            r0 = move-exception
            A01(r6, r0)
            goto L_0x0022
        L_0x0042:
            boolean r0 = r4 instanceof X.C8170Qib
            if (r0 != 0) goto L_0x014d
            boolean r0 = r4 instanceof X.C8169Qia
            if (r0 != 0) goto L_0x014d
            boolean r0 = r4 instanceof X.C8173Qie
            if (r0 == 0) goto L_0x007f
            r2 = r4
            X.Qie r2 = (X.C8173Qie) r2
            X.16L r0 = X.16L.A0G
            boolean r0 = r6.A19(r0)
            if (r0 != 0) goto L_0x0065
            X.SJg r1 = r2.A08
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.A05
            if (r1 != 0) goto L_0x0070
            java.lang.Object r3 = r0.A0D(r6, r7)
            if (r3 != 0) goto L_0x0074
        L_0x0065:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0150
            X.4fe r0 = r2.A07
            java.lang.Object r3 = r0.BWm(r7)
            goto L_0x0074
        L_0x0070:
            java.lang.Object r3 = r0.A0J(r6, r7, r1)
        L_0x0074:
            java.lang.reflect.Method r1 = r2.A02     // Catch:{ Exception -> 0x013f }
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ Exception -> 0x013f }
            r1.invoke(r5, r0)     // Catch:{ Exception -> 0x013f }
            goto L_0x014b
        L_0x007f:
            boolean r0 = r4 instanceof X.C8166QiX
            if (r0 == 0) goto L_0x009f
            r1 = r4
            X.QiX r1 = (X.C8166QiX) r1
            X.QkH r0 = r1.A00
            java.lang.Object r2 = r0.A0A(r5)
            X.QkR r1 = r1.A00
            if (r2 != 0) goto L_0x009a
            java.lang.Object r0 = r1.A0C(r6, r7)
        L_0x0094:
            if (r0 == r2) goto L_0x0150
        L_0x0096:
            r1.A0L(r5, r0)
            return
        L_0x009a:
            java.lang.Object r0 = r1.A0E(r6, r7, r2)
            goto L_0x0094
        L_0x009f:
            boolean r0 = r4 instanceof X.C8167QiY
            if (r0 == 0) goto L_0x00b0
            r1 = r4
            X.QiZ r1 = (X.C8168QiZ) r1
            X.QkR r0 = r1.A00
            java.lang.Object r0 = r0.A0C(r6, r7)
            r1.A0F(r5, r0)
            return
        L_0x00b0:
            boolean r0 = r4 instanceof X.C8165QiW
            if (r0 == 0) goto L_0x00e4
            r3 = r4
            X.QiW r3 = (X.C8165QiW) r3
            X.16L r1 = r6.A10()
            X.16L r0 = X.16L.A0G
            if (r1 != r0) goto L_0x00c9
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A05
            java.lang.Object r1 = r0.BWm(r7)
        L_0x00c5:
            r3.A0L(r5, r1)
            return
        L_0x00c9:
            X.SJg r1 = r3.A08
            if (r1 == 0) goto L_0x00d4
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A05
            java.lang.Object r1 = r0.A0J(r6, r7, r1)
            goto L_0x00c5
        L_0x00d4:
            java.lang.reflect.Constructor r1 = r3.A00     // Catch:{ Exception -> 0x0117 }
            java.lang.Object[] r0 = new java.lang.Object[]{r5}     // Catch:{ Exception -> 0x0117 }
            java.lang.Object r1 = r1.newInstance(r0)     // Catch:{ Exception -> 0x0117 }
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A05
            r0.A0C(r6, r7, r1)
            goto L_0x00c5
        L_0x00e4:
            boolean r0 = r4 instanceof X.C8172Qid
            if (r0 == 0) goto L_0x010a
            r2 = r4
            X.Qid r2 = (X.C8172Qid) r2
            X.16L r0 = X.16L.A0G
            boolean r0 = r6.A19(r0)
            if (r0 != 0) goto L_0x00ff
            X.SJg r1 = r2.A08
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r2.A05
            if (r1 != 0) goto L_0x0135
            java.lang.Object r3 = r0.A0D(r6, r7)
            if (r3 != 0) goto L_0x0139
        L_0x00ff:
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0150
            X.4fe r0 = r2.A07
            java.lang.Object r3 = r0.BWm(r7)
            goto L_0x0139
        L_0x010a:
            r0 = r4
            X.Qif r0 = (X.C8174Qif) r0
            X.C8174Qif.A00(r0)
            X.QkR r1 = r0.A00
            java.lang.Object r0 = r0.A0C(r6, r7)
            goto L_0x0096
        L_0x0117:
            r2 = move-exception
            java.lang.reflect.Constructor r0 = r3.A00
            java.lang.Class r0 = r0.getDeclaringClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r2.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Failed to instantiate class %s, problem: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.C269574fL.A0G(r2, r0)
            goto L_0x0022
        L_0x0135:
            java.lang.Object r3 = r0.A0J(r6, r7, r1)
        L_0x0139:
            java.lang.reflect.Field r0 = r2.A02     // Catch:{ Exception -> 0x013f }
            r0.set(r5, r3)     // Catch:{ Exception -> 0x013f }
            goto L_0x014c
        L_0x013f:
            r0 = move-exception
            r2.A0I(r6, r0, r3)
            goto L_0x0022
        L_0x0145:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r3.A05
            r0.A0C(r6, r7, r1)
            return
        L_0x014b:
            return
        L_0x014c:
            return
        L_0x014d:
            r4.A0D(r6, r7, r5)
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8218QkR.A0K(java.lang.Object, X.16F, X.4fV):void");
    }

    public final void A0L(Object obj, Object obj2) {
        C8218QkR qkR;
        if (this instanceof C8171Qic) {
            throw AnonymousClass7TE.A1B(002.A0g("Should never call `set()` on setterless property ('", this.A06.A02, "')"));
        } else if (this instanceof C8170Qib) {
            A0F(obj, obj2);
        } else {
            if (this instanceof C8169Qia) {
                qkR = ((C8169Qia) this).A00;
            } else if (this instanceof C8173Qie) {
                C8173Qie qie = (C8173Qie) this;
                try {
                    qie.A02.invoke(obj, new Object[]{obj2});
                    return;
                } catch (Exception e) {
                    qie.A0I((16F) null, e, obj2);
                    throw AnonymousClass00P.createAndThrow();
                }
            } else if (this instanceof C8172Qid) {
                ((C8172Qid) this).A02.set(obj, obj2);
                return;
            } else if (this instanceof C8168QiZ) {
                C8168QiZ qiZ = (C8168QiZ) this;
                if (qiZ instanceof C8166QiX) {
                    if (obj2 == null) {
                        return;
                    }
                } else if (qiZ instanceof C8167QiY) {
                    qiZ.A0F(obj, obj2);
                    return;
                }
                qkR = qiZ.A00;
            } else {
                C8174Qif qif = (C8174Qif) this;
                C8174Qif.A00(qif);
                qkR = qif.A00;
            }
            qkR.A0L(obj, obj2);
        }
    }

    public final void A0M(Class[] clsArr) {
        C12830T9c t9c;
        if (clsArr == null) {
            t9c = null;
        } else {
            int length = clsArr.length;
            if (length == 0) {
                t9c = C12830T9c.A00;
            } else if (length != 1) {
                t9c = new QmC(clsArr);
            } else {
                t9c = new QmB(clsArr[0]);
            }
        }
        this.A03 = t9c;
    }

    public final boolean A0N() {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A0N();
        }
        JsonDeserializer jsonDeserializer = this.A05;
        if (jsonDeserializer == null || jsonDeserializer == A0B) {
            return false;
        }
        return true;
    }

    public final boolean A0O() {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A0O();
        }
        return AnonymousClass7TF.A1V(this.A08);
    }

    public final boolean A0P() {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A0P();
        }
        return AnonymousClass7TF.A1V(this.A03);
    }

    public final boolean A0Q() {
        C12834T9g t9g;
        Boolean bool;
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A0Q();
        }
        if (!(this instanceof C8174Qif) || (t9g = ((C8174Qif) this).A03) == null || (bool = t9g.A00) == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final boolean A0R(Class cls) {
        if (this instanceof C8168QiZ) {
            return ((C8168QiZ) this).A00.A0R(cls);
        }
        C12830T9c t9c = this.A03;
        if (t9c == null) {
            return true;
        }
        if (t9c instanceof QmB) {
            Class cls2 = ((QmB) t9c).A00;
            if (cls == cls2 || cls2.isAssignableFrom(cls)) {
                return true;
            }
            return false;
        } else if (!(t9c instanceof QmC)) {
            return false;
        } else {
            for (Class cls3 : ((QmC) t9c).A00) {
                if (cls == cls3 || cls3.isAssignableFrom(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final C269434f7 B8O() {
        return this.A06;
    }

    public final C8208QkH BRS() {
        C8218QkR qkR;
        if (this instanceof C8171Qic) {
            return ((C8171Qic) this).A00;
        }
        if (this instanceof C8170Qib) {
            return null;
        }
        if (this instanceof C8169Qia) {
            qkR = ((C8169Qia) this).A00;
        } else if (this instanceof C8173Qie) {
            return ((C8173Qie) this).A00;
        } else {
            if (this instanceof C8172Qid) {
                return ((C8172Qid) this).A00;
            }
            if (!(this instanceof C8168QiZ)) {
                return ((C8174Qif) this).A04;
            }
            qkR = ((C8168QiZ) this).A00;
        }
        return qkR.BRS();
    }

    public final C268894eF CAJ() {
        return this.A04;
    }

    public final String getName() {
        return this.A06.A02;
    }

    public String toString() {
        return 002.A0g("[property '", this.A06.A02, "']");
    }

    public C8218QkR(JsonDeserializer jsonDeserializer, C269764fe r3, C8218QkR qkR) {
        super((SuT) qkR);
        this.A06 = qkR.A06;
        this.A04 = qkR.A04;
        this.A09 = qkR.A09;
        this.A0A = qkR.A0A;
        this.A08 = qkR.A08;
        this.A01 = qkR.A01;
        this.A02 = qkR.A02;
        jsonDeserializer = jsonDeserializer == null ? A0B : jsonDeserializer;
        this.A05 = jsonDeserializer;
        this.A03 = qkR.A03;
        this.A07 = r3 == A0B ? jsonDeserializer : r3;
    }

    public C8218QkR(C268894eF r5, T9n t9n, C269434f7 r7, C11287SJg sJg, C269114eb r9) {
        super(t9n);
        String A002;
        if (r7 == null) {
            r7 = C269434f7.A03;
        } else {
            String str = r7.A02;
            if (!str.isEmpty() && (A002 = 16O.A01.A00(str)) != str) {
                r7 = new C269434f7(A002, r7.A01);
            }
        }
        this.A06 = r7;
        this.A04 = r5;
        this.A09 = null;
        this.A0A = r9;
        this.A03 = null;
        this.A08 = sJg != null ? sJg.A02(this) : sJg;
        JsonDeserializer jsonDeserializer = A0B;
        this.A05 = jsonDeserializer;
        this.A07 = jsonDeserializer;
    }

    public C8218QkR(C268894eF r4, JsonDeserializer jsonDeserializer, T9n t9n, C269434f7 r7) {
        super(t9n);
        String A002;
        if (r7 == null) {
            r7 = C269434f7.A03;
        } else {
            String str = r7.A02;
            if (!str.isEmpty() && (A002 = 16O.A01.A00(str)) != str) {
                r7 = new C269434f7(A002, r7.A01);
            }
        }
        this.A06 = r7;
        this.A04 = r4;
        this.A09 = null;
        this.A0A = null;
        this.A03 = null;
        this.A08 = null;
        this.A05 = jsonDeserializer;
        this.A07 = jsonDeserializer;
    }

    public C8218QkR(C269434f7 r2, C8218QkR qkR) {
        super((SuT) qkR);
        this.A06 = r2;
        this.A04 = qkR.A04;
        this.A09 = qkR.A09;
        this.A0A = qkR.A0A;
        this.A05 = qkR.A05;
        this.A08 = qkR.A08;
        this.A01 = qkR.A01;
        this.A02 = qkR.A02;
        this.A03 = qkR.A03;
        this.A07 = qkR.A07;
    }

    public C8218QkR(C8218QkR qkR) {
        super((SuT) qkR);
        this.A06 = qkR.A06;
        this.A04 = qkR.A04;
        this.A09 = qkR.A09;
        this.A0A = qkR.A0A;
        this.A05 = qkR.A05;
        this.A08 = qkR.A08;
        this.A01 = qkR.A01;
        this.A02 = qkR.A02;
        this.A03 = qkR.A03;
        this.A07 = qkR.A07;
    }
}
