package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4da  reason: invalid class name and case insensitive filesystem */
public class C268544da extends C249933kc implements Serializable {
    public static final C268854eA A0D;
    public static final C269024eS DEFAULT_BASE;
    public C269454f9 A00;
    public C269294et A01;
    public C269664fU A02;
    public C269494fD A03;
    public C269524fG A04;
    public AnonymousClass4eE A05;
    public C269174eh A06;
    public C269154ef A07;
    public Set A08;
    public final 15p A09;
    public final C269184ei A0A;
    public final ConcurrentHashMap A0B;
    public final C269264eq A0C;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.4eR, java.lang.Object] */
    static {
        C268844e9 r2 = new C268844e9();
        A0D = r2;
        AnonymousClass4eE r8 = AnonymousClass4eE.A0A;
        C268954eL r9 = C268954eL.A06;
        Locale locale = Locale.getDefault();
        DEFAULT_BASE = new C269024eS(C268964eM.A01, r2, (T9E) null, (C269034eT) null, new Object(), C268984eO.A00, (C13733Tg5) null, r8, r9, locale, (TimeZone) null);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.4ef, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, X.4eh] */
    /* JADX WARNING: type inference failed for: r9v0, types: [X.4eT, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v6, types: [X.4fE, X.4fD] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.4fU, X.4fV] */
    public C268544da(15p r20) {
        this.A0B = new ConcurrentHashMap(64, 0.6f, 2);
        15p r2 = r20;
        if (r20 == null) {
            this.A09 = new 15p(this);
        } else {
            this.A09 = r2;
            if (r2.A03 == null) {
                r2.A03 = this;
            }
        }
        this.A07 = new Object();
        C269164eg r18 = new C269164eg();
        this.A05 = AnonymousClass4eE.A0A;
        ? obj = new Object();
        this.A06 = obj;
        C269024eS r5 = DEFAULT_BASE;
        ? obj2 = new Object();
        if (r5.A03 != obj2) {
            r5 = new C269024eS(r5.A00, r5.A01, r5.A02, obj2, r5.A04, r5.A05, r5.A06, r5.A07, r5.A08, r5.A09, r5.A0A);
        }
        C269184ei r4 = new C269184ei();
        this.A0A = r4;
        C269264eq r3 = new C269264eq();
        this.A0C = r3;
        C269184ei r15 = r4;
        C269174eh r16 = obj;
        C269154ef r17 = this.A07;
        C269294et r13 = new C269294et(r5, r15, r16, r17, r18);
        this.A01 = r13;
        C269454f9 r12 = new C269454f9(r5, r3, r15, r16, r17, r18);
        this.A00 = r12;
        C269354ez r52 = C269354ez.SORT_PROPERTIES_ALPHABETICALLY;
        if (r13.A09(r52)) {
            long j = r13.A00;
            long j2 = j & (new C269354ez[]{r52}[0].A00 ^ -1);
            this.A01 = j2 != j ? new C269294et(r13, r13.A04, r13.A02, r13.A03, r13.A00, r13.A01, j2) : r13;
            long j3 = r12.A00;
            long j4 = j3 & (new C269354ez[]{r52}[0].A00 ^ -1);
            this.A00 = j4 != j3 ? new C269454f9(r12, r12.A00, r12.A03, r12.A04, r12.A01, r12.A02, j4) : r12;
        }
        this.A03 = new C269504fE();
        this.A02 = new C269674fV(C269544fI.A00);
        this.A04 = C269694fX.A00;
    }

    public static final void A01(String str, Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("argument \"%s\" is null", new Object[]{str}));
        }
    }

    public JsonDeserializer A07(C269674fV r3, C268894eF r4) {
        ConcurrentHashMap concurrentHashMap = this.A0B;
        JsonDeserializer jsonDeserializer = (JsonDeserializer) concurrentHashMap.get(r4);
        if (jsonDeserializer == null) {
            jsonDeserializer = r3.A0E(r4);
            if (jsonDeserializer == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C273654mx.A00(1213));
                sb.append(r4);
                r3.A08(r4, sb.toString());
                throw AnonymousClass00P.createAndThrow();
            }
            concurrentHashMap.put(r4, jsonDeserializer);
        }
        return jsonDeserializer;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.4fU, X.4fV] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C252503pD A08(java.lang.String r8) {
        /*
            r7 = this;
            X.15p r0 = r7.A09     // Catch:{ 1bF -> 0x0063, IOException -> 0x005d }
            X.16F r5 = r0.A03(r8)     // Catch:{ 1bF -> 0x0063, IOException -> 0x005d }
            java.lang.Class<X.3pD> r1 = X.C252503pD.class
            X.4eE r0 = r7.A05     // Catch:{ all -> 0x0051 }
            X.4eF r6 = r0.A09(r1)     // Catch:{ all -> 0x0051 }
            X.4f9 r4 = r7.A00     // Catch:{ all -> 0x0051 }
            int r1 = r4.A04     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0019
            int r0 = r4.A03     // Catch:{ all -> 0x0051 }
            r5.A0l(r0, r1)     // Catch:{ all -> 0x0051 }
        L_0x0019:
            X.16L r3 = r5.A10()     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0028
            X.16L r3 = r5.A1J()     // Catch:{ all -> 0x0051 }
            if (r3 != 0) goto L_0x0028
            X.Qkl r1 = X.C8238Qkl.A00     // Catch:{ all -> 0x0051 }
            goto L_0x004d
        L_0x0028:
            X.4fU r0 = r7.A02     // Catch:{ all -> 0x0051 }
            r2 = 0
            X.4fU r1 = new X.4fU     // Catch:{ all -> 0x0051 }
            r1.<init>(r5, r4, r0)     // Catch:{ all -> 0x0051 }
            X.16L r0 = X.16L.A0G     // Catch:{ all -> 0x0051 }
            if (r3 != r0) goto L_0x0042
            X.9gL r1 = X.C383839gL.A00     // Catch:{ all -> 0x0051 }
        L_0x0036:
            X.4fA r0 = X.C269464fA.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x0051 }
            boolean r0 = r4.A0D(r0)     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004d
            A00(r5, r6)     // Catch:{ all -> 0x0051 }
            goto L_0x004d
        L_0x0042:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r7.A07(r1, r6)     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.A0k(r5, r6, r0, r2)     // Catch:{ all -> 0x0051 }
            X.3pD r1 = (X.C252503pD) r1     // Catch:{ all -> 0x0051 }
            goto L_0x0036
        L_0x004d:
            r5.close()     // Catch:{ 1bF -> 0x0063, IOException -> 0x005d }
            return r1
        L_0x0051:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r0 = move-exception
            X.C9153RRe.A00(r2, r0)     // Catch:{ 1bF -> 0x0063, IOException -> 0x005d }
        L_0x005c:
            throw r1     // Catch:{ 1bF -> 0x0063, IOException -> 0x005d }
        L_0x005d:
            r0 = move-exception
            X.4iD r0 = X.AnonymousClass4iD.A01(r0)
            throw r0
        L_0x0063:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268544da.A08(java.lang.String):X.3pD");
    }

    public final C269494fD A09(C269294et r5) {
        if (!(this instanceof C268554db)) {
            return this.A03.A0W(r5, this.A04);
        }
        C268554db r0 = (C268554db) this;
        return new C291405h7(r0.A00, r5, r0.A03, r0.A04);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4fU, X.4fV] */
    public Object A0A(16F r6, C269454f9 r7, C268894eF r8) {
        C269454f9 r0 = this.A00;
        int i = r0.A04;
        if (i != 0) {
            r6.A0l(r0.A03, i);
        }
        16L A10 = r6.A10();
        if (A10 == null && (A10 = r6.A1J()) == null) {
            AnonymousClass4iD r1 = new AnonymousClass4iD(r6, "No content to map due to end-of-input");
            C269584fM[] r02 = C269574fL.A01;
            throw r1;
        }
        ? r2 = new C269674fV(r6, r7, this.A02);
        Object obj = null;
        if (A10 == 16L.A0G) {
            obj = A07(r2, r8).BWm(r2);
        } else if (!(A10 == 16L.A08 || A10 == 16L.A09)) {
            obj = r2.A0k(r6, r8, A07(r2, r8), (Object) null);
        }
        r6.A13();
        if (r7.A0D(C269464fA.FAIL_ON_TRAILING_TOKENS)) {
            A00(r6, r8);
        }
        return obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: java.lang.Throwable} */
    /* JADX WARNING: type inference failed for: r7v0, types: [X.4fU, X.4fV] */
    /* JADX WARNING: type inference failed for: r6v4, types: [X.4iD, X.Qi1] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d9, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00db, code lost:
        X.C9153RRe.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00de, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0068, code lost:
        r6 = r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0B(X.16F r12, X.C268894eF r13) {
        /*
            r11 = this;
            X.4f9 r8 = r11.A00     // Catch:{ all -> 0x00d3 }
            X.4fU r0 = r11.A02     // Catch:{ all -> 0x00d3 }
            r2 = 0
            X.4fU r7 = new X.4fU     // Catch:{ all -> 0x00d3 }
            r7.<init>(r12, r8, r0)     // Catch:{ all -> 0x00d3 }
            int r1 = r8.A04     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x0013
            int r0 = r8.A03     // Catch:{ all -> 0x00d3 }
            r12.A0l(r0, r1)     // Catch:{ all -> 0x00d3 }
        L_0x0013:
            X.16L r1 = r12.A10()     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x0029
            X.16L r1 = r12.A1J()     // Catch:{ all -> 0x00d3 }
            if (r1 != 0) goto L_0x0029
            java.lang.String r0 = "No content to map due to end-of-input"
            X.Qi2 r6 = new X.Qi2     // Catch:{ all -> 0x00d3 }
            r6.<init>(r12, r0)     // Catch:{ all -> 0x00d3 }
            X.4fM[] r0 = X.C269574fL.A01     // Catch:{ all -> 0x00d3 }
        L_0x0028:
            throw r6     // Catch:{ all -> 0x00d3 }
        L_0x0029:
            X.16L r0 = X.16L.A0G     // Catch:{ all -> 0x00d3 }
            r10 = 0
            if (r1 != r0) goto L_0x0043
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r11.A07(r7, r13)     // Catch:{ all -> 0x00d3 }
            java.lang.Object r10 = r0.BWm(r7)     // Catch:{ all -> 0x00d3 }
        L_0x0036:
            X.4fA r0 = X.C269464fA.FAIL_ON_TRAILING_TOKENS     // Catch:{ all -> 0x00d3 }
            boolean r0 = r8.A0D(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cf
            A00(r12, r13)     // Catch:{ all -> 0x00d3 }
            goto L_0x00cf
        L_0x0043:
            X.16L r0 = X.16L.A08     // Catch:{ all -> 0x00d3 }
            if (r1 == r0) goto L_0x0036
            X.16L r0 = X.16L.A09     // Catch:{ all -> 0x00d3 }
            if (r1 == r0) goto L_0x0036
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r11.A07(r7, r13)     // Catch:{ all -> 0x00d3 }
            java.lang.Object r10 = r7.A0k(r12, r13, r0, r2)     // Catch:{ all -> 0x00d3 }
            java.util.LinkedHashMap r1 = r7.A01     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x0036
            X.4fA r0 = X.C269464fA.FAIL_ON_UNRESOLVED_OBJECT_IDS     // Catch:{ all -> 0x00d3 }
            boolean r0 = r7.A0j(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0036
            r6 = 0
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x00d3 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x00d3 }
        L_0x0068:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x00d3 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00d3 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x00d3 }
            X.S6M r2 = (X.S6M) r2     // Catch:{ all -> 0x00d3 }
            java.util.LinkedList r0 = r2.A02     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0068
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x0068
            if (r6 != 0) goto L_0x0099
            X.16F r1 = r7.A07     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "Unresolved forward references for: "
            X.Qi1 r6 = new X.Qi1     // Catch:{ all -> 0x00d3 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x00d3 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00d3 }
            r0.<init>()     // Catch:{ all -> 0x00d3 }
            r6.A01 = r0     // Catch:{ all -> 0x00d3 }
            r6.A0A()     // Catch:{ all -> 0x00d3 }
        L_0x0099:
            X.T9Z r0 = r2.A03     // Catch:{ all -> 0x00d3 }
            java.lang.Object r5 = r0.A02     // Catch:{ all -> 0x00d3 }
            java.util.LinkedList r0 = r2.A02     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x00c6
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00d3 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x00d3 }
        L_0x00a9:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x00d3 }
            X.SED r0 = (X.SED) r0     // Catch:{ all -> 0x00d3 }
            java.lang.Class r3 = r0.A01     // Catch:{ all -> 0x00d3 }
            X.Qi1 r0 = r0.A00     // Catch:{ all -> 0x00d3 }
            X.T9j r2 = r0.A00     // Catch:{ all -> 0x00d3 }
            java.util.List r1 = r6.A01     // Catch:{ all -> 0x00d3 }
            X.S1y r0 = new X.S1y     // Catch:{ all -> 0x00d3 }
            r0.<init>(r2, r3, r5)     // Catch:{ all -> 0x00d3 }
            r1.add(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x00a9
        L_0x00c6:
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x00d3 }
            goto L_0x00a9
        L_0x00cb:
            if (r6 != 0) goto L_0x0028
            goto L_0x0036
        L_0x00cf:
            r12.close()
            return r10
        L_0x00d3:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00da }
            throw r1
        L_0x00da:
            r0 = move-exception
            X.C9153RRe.A00(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C268544da.A0B(X.16F, X.4eF):java.lang.Object");
    }

    public final Object A0C(TA4 ta4, String str) {
        A01("content", str);
        return A0D(this.A05.A07((C269754fd) null, AnonymousClass4eE.A09, ta4.A00), str);
    }

    public final Object A0D(C268894eF r2, String str) {
        A01("content", str);
        try {
            return A0B(this.A09.A03(str), r2);
        } catch (C65171bF e) {
            throw e;
        } catch (IOException e2) {
            throw AnonymousClass4iD.A01(e2);
        }
    }

    public final Object A0E(String str, Class cls) {
        A01("content", str);
        return A0D(this.A05.A09(cls), str);
    }

    public final String A0F(Object obj) {
        15p r1 = this.A09;
        AnonymousClass5EB r2 = new AnonymousClass5EB(r1.A0B());
        try {
            17W A0A2 = r1.A0A(r2);
            this.A01.A0C(A0A2);
            A0G(A0A2, obj);
            16I r12 = r2.A00;
            String A062 = r12.A06();
            r12.A07();
            return A062;
        } catch (C65171bF e) {
            throw e;
        } catch (IOException e2) {
            throw AnonymousClass4iD.A01(e2);
        }
    }

    public final void A0G(17Z r4, Object obj) {
        C269294et r1 = this.A01;
        if (!r1.A0D(C269424f6.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            try {
                A09(r1).A0X(r4, obj);
            } catch (Exception e) {
                C269574fL.A0C(r4, e);
                throw AnonymousClass00P.createAndThrow();
            }
        } else {
            Closeable closeable = (Closeable) obj;
            try {
                A09(r1).A0X(r4, obj);
                try {
                    closeable.close();
                } catch (Exception e2) {
                    e = e2;
                    closeable = null;
                }
            } catch (Exception e3) {
                e = e3;
                C269574fL.A0B(r4, closeable, e);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        r4.close();
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.4fU, X.4fV] */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.4i9, java.lang.Object] */
    public final void A0H(AnonymousClass4iG r13) {
        AnonymousClass4i9[] r0;
        String name;
        A01("module", r13);
        for (AnonymousClass4iG A0H : Collections.emptyList()) {
            A0H(A0H);
        }
        if (this.A01.A09(C269354ez.IGNORE_DUPLICATE_MODULE_REGISTRATIONS) && (name = r13.getClass().getName()) != null) {
            Set set = this.A08;
            if (set == null) {
                set = new LinkedHashSet();
                this.A08 = set;
            }
            if (!set.add(name)) {
                return;
            }
        }
        Object obj = new Object();
        C269554fJ r2 = (C269554fJ) this.A02.A04;
        C269594fN r1 = r2.A00;
        C269654fT[] r10 = r1.A03;
        C269594fN r6 = new C269594fN(r1.A00, r1.A01, (C269604fO[]) AnonymousClass4iJ.A00(obj, r1.A02), r10, r1.A04);
        if (r2.A00 != r6) {
            C269574fL.A0E(C269544fI.class, r2, "withConfig");
            r2 = new C269554fJ(r6);
        }
        this.A02 = new C269674fV((C269674fV) this.A02, (C269564fK) r2);
        Object obj2 = new Object();
        C269704fY r4 = (C269704fY) this.A04;
        C269724fa r12 = r4.A00;
        this.A04 = r4.A05(new C269724fa((C269734fb[]) AnonymousClass4iJ.A00(obj2, r12.A01), r12.A00, r12.A02));
        ? obj3 = new Object();
        AnonymousClass4eE r14 = this.A05;
        C268884eD r42 = r14.A01;
        AnonymousClass4i9[] r02 = r14.A03;
        if (r02 == null) {
            r0 = new AnonymousClass4i9[]{obj3};
            r42 = null;
        } else {
            r0 = (AnonymousClass4i9[]) AnonymousClass4iJ.A00(obj3, r02);
        }
        AnonymousClass4eE r15 = new AnonymousClass4eE(r14.A00, r42, r14.A02, r0);
        this.A05 = r15;
        this.A00 = (C269454f9) this.A00.A0B(r15);
        this.A01 = (C269294et) this.A01.A0B(r15);
        Object obj4 = new Object();
        C269704fY r43 = (C269704fY) this.A04;
        C269724fa r16 = r43.A00;
        this.A04 = r43.A05(new C269724fa(r16.A01, r16.A00, (C269744fc[]) AnonymousClass4iJ.A00(obj4, r16.A02)));
    }

    public final void A0I(C269424f6 r11) {
        C269294et r1;
        C269294et r2 = this.A01;
        int i = r2.A04;
        int i2 = i & (r11.A00 ^ -1);
        if (i2 == i) {
            r1 = r2;
        } else {
            r1 = new C269294et(r2, i2, r2.A02, r2.A03, r2.A00, r2.A01, r2.A00);
        }
        this.A01 = r1;
    }

    public final byte[] A0J(Object obj) {
        byte[] bArr;
        try {
            15p r6 = this.A09;
            RD3 rd3 = new RD3(r6.A0B());
            Integer num = AnonymousClass05K.A00;
            16B r0 = new 16B(new 167(true, rd3), r6.A0B(), false);
            r0.A00 = num;
            C267484bd A062 = r6.A06(r0, rd3);
            this.A01.A0C(A062);
            A0G(A062, obj);
            byte[] A052 = rd3.A05();
            rd3.A01();
            AnonymousClass16A r02 = rd3.A03;
            if (!(r02 == null || (bArr = rd3.A01) == null)) {
                r02.A00.set(2, bArr);
                rd3.A01 = null;
            }
            return A052;
        } catch (C65171bF e) {
            throw e;
        } catch (IOException e2) {
            throw AnonymousClass4iD.A01(e2);
        }
    }

    public static final void A00(16F r2, C268894eF r3) {
        Class cls;
        16L A1J = r2.A1J();
        if (A1J != null) {
            if (r3 == null) {
                cls = null;
            } else {
                cls = r3.A00;
            }
            throw new AnonymousClass4iD(r2, String.format(C273654mx.A00(1399), new Object[]{A1J, C269574fL.A06(cls)}));
        }
    }

    public C268544da() {
        this((15p) null);
    }
}
