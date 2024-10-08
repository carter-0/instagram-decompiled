package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9K0  reason: invalid class name */
public final class AnonymousClass9K0 extends AnonymousClass1Ek implements 0sL {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K0(C314226hr r2, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A02 = 3;
        this.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9K0, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.9K0, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.9K0, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.9K0, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        return new X.AnonymousClass9K0(r2, r1, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        return new X.AnonymousClass9K0(r1, r2, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r5, X.AnonymousClass4D7 r6) {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0028;
                case 2: goto L_0x002e;
                case 3: goto L_0x0039;
                case 4: goto L_0x0010;
                case 5: goto L_0x0016;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A00
            r0 = 6
        L_0x000a:
            X.9K0 r3 = new X.9K0
            r3.<init>(r1, r2, r6, r0)
            return r3
        L_0x0010:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A00
            r0 = 4
            goto L_0x000a
        L_0x0016:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A00
            r0 = 5
            goto L_0x000a
        L_0x001c:
            java.lang.Object r0 = r4.A00
            java.util.List r0 = (java.util.List) r0
            X.9K0 r3 = new X.9K0
            r3.<init>((java.util.List) r0, (X.AnonymousClass4D7) r6)
            r3.A01 = r5
            return r3
        L_0x0028:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A01
            r0 = 1
            goto L_0x0033
        L_0x002e:
            java.lang.Object r2 = r4.A00
            java.lang.Object r1 = r4.A01
            r0 = 2
        L_0x0033:
            X.9K0 r3 = new X.9K0
            r3.<init>(r2, r1, r6, r0)
            return r3
        L_0x0039:
            java.lang.Object r0 = r4.A01
            X.6hr r0 = (X.C314226hr) r0
            X.9K0 r3 = new X.9K0
            r3.<init>((X.C314226hr) r0, (X.AnonymousClass4D7) r6)
            r3.A00 = r5
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9K0.create(java.lang.Object, X.4D7):X.4D7");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9K0) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass58C r5;
        int max;
        Object obj2;
        18q r0;
        switch (this.A02) {
            case 0:
                0eS.A00(obj);
                Object obj3 = this.A01;
                for (0sP invoke : (List) this.A00) {
                    invoke.invoke(obj3);
                }
                break;
            case 3:
                0eS.A00(obj);
                C62868Kni kni = (C62868Kni) this.A00;
                if (kni instanceof C62093KZx) {
                    C314226hr r6 = (C314226hr) this.A01;
                    C61294K1h k1h = ((C62093KZx) kni).A00;
                    C314346i3 r1 = r6.A0J;
                    if (r1 != null) {
                        r1.A00 = new C389469pg(k1h);
                    }
                    r6.A0I.A00 = k1h;
                    C317446nH.A03.set(false);
                    ArrayList arrayList = r6.A0P;
                    arrayList.clear();
                    for (C317876nz r2 : k1h.A00()) {
                        C317966o8 r12 = (C317966o8) 00k.A0O(r2.A0O, 0);
                        if (r12 != null) {
                            r12.A0c = "STORIES_QUICK_REACTION_AVATAR_STICKER_GRID";
                        }
                        arrayList.add(new C317456nI(r2));
                    }
                    C314226hr.A05(r6);
                    break;
                } else if (kni instanceof C62092KZw) {
                    C314226hr r52 = (C314226hr) this.A01;
                    C317446nH.A03.set(false);
                    C314206hp r02 = r52.A0L;
                    r02.A01.flowEndFail(r02.A00, "error", (String) null);
                    C314346i3 r22 = r52.A0J;
                    if (r22 != null) {
                        C389479ph r13 = C389479ph.A00;
                        if (r22.A02) {
                            C314346i3.A00(r22);
                        }
                        r22.A00 = r13;
                        break;
                    }
                } else {
                    throw new RuntimeException();
                }
                break;
            case 4:
                0eS.A00(obj);
                Set<Map.Entry> entrySet = ((AnonymousClass585) this.A01).A03.entrySet();
                AnonymousClass58F r3 = (AnonymousClass58F) this.A00;
                for (Map.Entry value : entrySet) {
                    AnonymousClass58A r4 = (AnonymousClass58A) value.getValue();
                    0qQ.A0B(r3, 0);
                    Set set = r4.A06;
                    0eP r14 = r3.A01;
                    if (set.contains(r14)) {
                        Object obj4 = r14.A01;
                        if (obj4 == AnonymousClass58B.USER_SEE_TAIL_LOAD_SPINNER) {
                            r5 = r4.A03;
                            int i = r5.A00;
                            AnonymousClass588 r15 = r4.A04;
                            int A012 = i + r15.A01();
                            r5.A00 = A012;
                            max = Math.min(A012, r15.A03());
                        } else {
                            boolean z = false;
                            Object obj5 = null;
                            if (obj4 == AnonymousClass58B.TAIL_LOAD_RESPONSE_RECEIVED) {
                                Map map = r3.A00;
                                if (map != null) {
                                    String str = (String) map.get("MEDIA_IDS");
                                    if (str != null) {
                                        obj5 = 00k.A0k(00l.A0R(str, new String[]{","}, 0));
                                    }
                                    Object obj6 = map.get("MAX_ID");
                                    if (!(obj6 == null || obj5 == null)) {
                                        r4.A05.put(obj6, obj5);
                                    }
                                }
                            } else if (obj4 == AnonymousClass58B.USER_SEE_MEDIA) {
                                Map map2 = r3.A00;
                                if (!(map2 == null || (obj2 = map2.get(AnonymousClass000.A00(2356))) == null)) {
                                    Map map3 = r4.A05;
                                    for (Map.Entry entry : map3.entrySet()) {
                                        if (((Set) entry.getValue()).contains(obj2)) {
                                            obj5 = entry.getKey();
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        0u4.A03(map3).remove(obj5);
                                    }
                                }
                            } else if (obj4 == AnonymousClass58B.USER_DID_NAVIGATE && (!r4.A05.isEmpty())) {
                                r5 = r4.A03;
                                int i2 = r5.A00;
                                AnonymousClass588 r16 = r4.A04;
                                int A002 = i2 - r16.A00();
                                r5.A00 = A002;
                                max = Math.max(A002, r16.A04());
                            }
                        }
                        r5.A00 = max;
                    }
                }
                break;
            case 5:
                0eS.A00(obj);
                ((C279824zU) this.A01).A00 = new C279834zV((1CS) this.A00, System.currentTimeMillis(), -1);
                break;
            case 6:
                0eS.A00(obj);
                C3034668x r03 = (C3034668x) this.A01;
                A6S a6s = r03.A0C;
                if (a6s != null) {
                    String str2 = r03.A0A.A05;
                    C306006Kk r04 = (C306006Kk) this.A00;
                    short s = r04.A02;
                    long j = r04.A00;
                    0qQ.A0B(str2, 0);
                    Map map4 = a6s.A01;
                    C72975PRi pRi = (C72975PRi) map4.get(str2);
                    if (pRi != null) {
                        0rq r53 = pRi.A00;
                        if (r53 != null) {
                            C62880wX r42 = C61170le.A00;
                            C638918c.A01(r42);
                            18g.A06(r53, "termination_from_slate", true);
                            18g A013 = C638918c.A01(r42);
                            if (s == 2) {
                                r0 = 18q.A03;
                            } else if (s == 4 || s == 630) {
                                String A0O = 002.A0O("cancel_from_slate: ", s);
                                0qQ.A0B(A0O, 0);
                                r0 = new 18q(A0O, true, true);
                            } else {
                                r0 = 18m.A00(002.A0O("failure_from_slate: ", s));
                            }
                            A013.A0L(r53, r0, Long.valueOf(j));
                        }
                        map4.remove(str2);
                        break;
                    }
                }
                break;
            default:
                0eS.A00(obj);
                return Boolean.valueOf(((2bu) this.A00).AVg((Set) this.A01));
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K0(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9K0(List list, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A02 = 0;
        this.A00 = list;
    }
}
