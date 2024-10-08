package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Deprecated;

/* renamed from: X.3UH  reason: invalid class name */
public final class AnonymousClass3UH implements AnonymousClass3O9 {
    public int A00;
    public int A01;
    public C250533lb A02;
    public C270864hR A03;
    public C257593xe A04;
    public 1UQ A05;
    public C270464gm A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public List A0O;
    public List A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public Map A0T;
    public Map A0U;

    @Deprecated(message = "")
    public final boolean A09(String str) {
        List list = this.A0M;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((AnonymousClass3UL) next).A03.getId().equalsIgnoreCase(str)) {
                    if (next != null) {
                        return true;
                    }
                }
            }
        }
        List list2 = this.A0P;
        if (list2 != null) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                AnonymousClass3UI r2 = (AnonymousClass3UI) next2;
                if (r2.A07 == AnonymousClass3UO.SUGGESTED_USER) {
                    AnonymousClass3UL A002 = r2.A00();
                    if (A002 == null) {
                        throw new IllegalStateException("Required value was null.");
                    } else if (str.equalsIgnoreCase(A002.A03.getId())) {
                        if (next2 != null) {
                            return true;
                        }
                    }
                }
            }
        }
        List A042 = A04();
        if (A042 != null) {
            Iterator it3 = A042.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next3 = it3.next();
                String str2 = ((C17674Vc5) next3).A04;
                if (str2 != null && str2.equalsIgnoreCase(str)) {
                    if (next3 != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r0 = r13.A0B;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass3UH(X.AnonymousClass3UG r27) {
        /*
            r26 = this;
            r14 = r26
            r14.<init>()
            java.lang.String r12 = ""
            r13 = r27
            if (r27 == 0) goto L_0x000f
            java.lang.String r0 = r13.A0B
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r0 = r12
        L_0x0010:
            r14.A0F = r0
            r11 = 0
            if (r27 == 0) goto L_0x0061
            java.lang.Integer r0 = r13.A08
            if (r0 == 0) goto L_0x0061
            int r0 = r0.intValue()
        L_0x001d:
            r14.A01 = r0
            r0 = 0
            if (r27 == 0) goto L_0x0026
            java.lang.String r1 = r13.A0L
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r1 = r12
        L_0x0027:
            r14.A0G = r1
            if (r27 == 0) goto L_0x005f
            java.util.List r1 = r13.A0O
            if (r1 == 0) goto L_0x005f
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x0034:
            r14.A0N = r2
            r5 = 10
            if (r2 == 0) goto L_0x0063
            int r1 = X.0Yv.A1E(r2, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r3 = r2.iterator()
        L_0x0047:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0065
            java.lang.Object r2 = r3.next()
            X.3UJ r2 = (X.AnonymousClass3UJ) r2
            X.0qQ.A0B(r2, r11)
            X.3UL r1 = new X.3UL
            r1.<init>(r2)
            r4.add(r1)
            goto L_0x0047
        L_0x005f:
            r2 = r0
            goto L_0x0034
        L_0x0061:
            r0 = 0
            goto L_0x001d
        L_0x0063:
            r1 = r0
            goto L_0x0069
        L_0x0065:
            java.util.ArrayList r1 = X.00k.A0U(r4)
        L_0x0069:
            r14.A0M = r1
            if (r27 == 0) goto L_0x009c
            java.util.List r1 = r13.A0N
            if (r1 == 0) goto L_0x009c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x0076:
            r14.A0O = r2
            if (r2 == 0) goto L_0x009e
            int r1 = X.0Yv.A1E(r2, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            java.util.Iterator r3 = r2.iterator()
        L_0x0087:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r2 = r3.next()
            X.3Or r2 = (X.C241303Or) r2
            X.3UI r1 = new X.3UI
            r1.<init>(r2)
            r4.add(r1)
            goto L_0x0087
        L_0x009c:
            r2 = r0
            goto L_0x0076
        L_0x009e:
            r1 = r0
            goto L_0x00a4
        L_0x00a0:
            java.util.ArrayList r1 = X.00k.A0U(r4)
        L_0x00a4:
            r14.A0P = r1
            if (r27 == 0) goto L_0x0105
            java.util.List r2 = r13.A0P
            if (r2 == 0) goto L_0x0105
            int r1 = X.0Yv.A1E(r2, r5)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r1)
            java.util.Iterator r16 = r2.iterator()
        L_0x00b9:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0106
            java.lang.Object r2 = r16.next()
            X.5tw r2 = (X.C298735tw) r2
            X.5tv r2 = (X.C298725tv) r2
            java.lang.String r1 = r2.A02
            r17 = r1
            com.instagram.model.hashtag.Hashtag r9 = r2.A00
            java.util.List r15 = r2.A06
            java.lang.String r8 = r2.A03
            java.lang.String r7 = r2.A04
            java.lang.String r6 = r2.A05
            java.util.List r5 = r2.A07
            com.instagram.user.model.User r4 = r2.A01
            r18 = 0
            X.1hu r3 = new X.1hu
            r3.<init>(r0)
            r2 = 6
            X.1E9 r1 = new X.1E9
            r1.<init>(r3, r2, r11)
            if (r9 == 0) goto L_0x00ec
            com.instagram.model.hashtag.HashtagImpl r18 = r9.FEY()
        L_0x00ec:
            X.5tv r1 = new X.5tv
            r24 = r15
            r25 = r5
            r20 = r17
            r21 = r8
            r22 = r7
            r23 = r6
            r17 = r1
            r19 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r10.add(r1)
            goto L_0x00b9
        L_0x0105:
            r10 = r0
        L_0x0106:
            r14.A0L = r10
            if (r27 == 0) goto L_0x01d0
            java.lang.Boolean r1 = r13.A03
            if (r1 == 0) goto L_0x01d0
            boolean r1 = r1.booleanValue()
        L_0x0112:
            r14.A0Q = r1
            if (r27 == 0) goto L_0x01cd
            java.lang.Boolean r1 = r13.A04
            if (r1 == 0) goto L_0x01cd
            boolean r1 = r1.booleanValue()
        L_0x011e:
            r14.A0R = r1
            if (r27 == 0) goto L_0x0127
            java.lang.String r1 = r13.A0K
            if (r1 == 0) goto L_0x0127
            r12 = r1
        L_0x0127:
            r14.A0K = r12
            if (r27 == 0) goto L_0x01ca
            java.lang.String r1 = r13.A0J
        L_0x012d:
            r14.A0J = r1
            if (r27 == 0) goto L_0x01c7
            java.lang.String r1 = r13.A0M
        L_0x0133:
            r14.A0A = r1
            if (r27 == 0) goto L_0x01c4
            java.lang.Boolean r1 = r13.A06
            if (r1 == 0) goto L_0x01c4
            boolean r1 = r1.booleanValue()
        L_0x013f:
            r14.A0S = r1
            if (r27 == 0) goto L_0x01c2
            java.lang.String r1 = r13.A0F
        L_0x0145:
            r14.A0E = r1
            if (r27 == 0) goto L_0x01c0
            java.lang.String r1 = r13.A0E
        L_0x014b:
            r14.A0D = r1
            if (r27 == 0) goto L_0x01be
            java.lang.String r1 = r13.A0G
        L_0x0151:
            r14.A0H = r1
            if (r27 == 0) goto L_0x01bc
            java.lang.String r1 = r13.A0C
        L_0x0157:
            r14.A0C = r1
            if (r27 == 0) goto L_0x01ba
            java.lang.String r1 = r13.A0I
        L_0x015d:
            r14.A0I = r1
            if (r27 == 0) goto L_0x01b8
            X.4hR r1 = r13.A01
        L_0x0163:
            r14.A03 = r1
            if (r27 == 0) goto L_0x01b6
            X.3xe r1 = r13.A02
        L_0x0169:
            r14.A04 = r1
            if (r27 == 0) goto L_0x01b4
            java.lang.String r1 = r13.A0A
        L_0x016f:
            r14.A0B = r1
            if (r27 == 0) goto L_0x01b2
            java.lang.Integer r1 = r13.A09
        L_0x0175:
            r14.A08 = r1
            if (r27 == 0) goto L_0x01b0
            java.lang.Integer r1 = r13.A07
        L_0x017b:
            r14.A07 = r1
            if (r27 == 0) goto L_0x01ae
            X.1sS r1 = r13.A00
            if (r1 == 0) goto L_0x01ae
            X.3lb r1 = r1.F8M()
        L_0x0187:
            r14.A02 = r1
            if (r27 == 0) goto L_0x018d
            java.lang.String r0 = r13.A0H
        L_0x018d:
            java.util.Map r1 = X.1UQ.A01
            java.lang.Object r0 = r1.get(r0)
            X.1UQ r0 = (X.1UQ) r0
            r14.A05 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r14.A0U = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r14.A0T = r0
            r0 = -1
            r14.A00 = r0
            if (r27 == 0) goto L_0x01ad
            r14.A05()
        L_0x01ad:
            return
        L_0x01ae:
            r1 = r0
            goto L_0x0187
        L_0x01b0:
            r1 = r0
            goto L_0x017b
        L_0x01b2:
            r1 = r0
            goto L_0x0175
        L_0x01b4:
            r1 = r0
            goto L_0x016f
        L_0x01b6:
            r1 = r0
            goto L_0x0169
        L_0x01b8:
            r1 = r0
            goto L_0x0163
        L_0x01ba:
            r1 = r0
            goto L_0x015d
        L_0x01bc:
            r1 = r0
            goto L_0x0157
        L_0x01be:
            r1 = r0
            goto L_0x0151
        L_0x01c0:
            r1 = r0
            goto L_0x014b
        L_0x01c2:
            r1 = r0
            goto L_0x0145
        L_0x01c4:
            r1 = 0
            goto L_0x013f
        L_0x01c7:
            r1 = r0
            goto L_0x0133
        L_0x01ca:
            r1 = r0
            goto L_0x012d
        L_0x01cd:
            r1 = 0
            goto L_0x011e
        L_0x01d0:
            r1 = 1
            goto L_0x0112
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.<init>(X.3UG):void");
    }

    public final int A00(C17674Vc5 vc5) {
        Number number = (Number) this.A0T.get(vc5);
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final int A01(AnonymousClass3UL r2) {
        Number number = (Number) this.A0U.get(r2);
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    public final AnonymousClass3UI A02(int i) {
        List list = this.A0P;
        if (list == null || i >= list.size() || i < 0) {
            return null;
        }
        return (AnonymousClass3UI) list.get(i);
    }

    public final ArrayList A03() {
        ArrayList arrayList = new ArrayList();
        List<AnonymousClass3UI> list = this.A0P;
        if (list != null) {
            for (AnonymousClass3UI r2 : list) {
                if (r2.A07 == AnonymousClass3UO.SUGGESTED_USER) {
                    AnonymousClass3UL A002 = r2.A00();
                    if (A002 != null) {
                        arrayList.add(A002);
                    }
                } else {
                    0wb.A03("SuggestedUsers", "You should only call `getRecommendedUsersListFromSuggestedItems(...)` if you are certain the suggested items are all of type SUGGESTED_USER. This hairiness should only occur during the migration from the List<RecommendedUser> to the List<SuggestedItem> response.");
                }
            }
        }
        return arrayList;
    }

    public final List A04() {
        List list = this.A0L;
        if (list != null) {
            return C18214Vne.A01(list);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.4gm, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.Object, X.3UI] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05() {
        /*
            r7 = this;
            java.util.List r0 = r7.A0P
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x004e
        L_0x000a:
            java.util.List r0 = r7.A0M
            if (r0 == 0) goto L_0x004e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004e
            java.util.List r1 = r7.A0M
            r4 = 0
            if (r1 == 0) goto L_0x0044
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0028:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r2.next()
            X.3UL r0 = (X.AnonymousClass3UL) r0
            X.3UI r1 = new X.3UI
            r1.<init>()
            X.3UJ r0 = r0.A0F
            r1.A08 = r0
            r1.A01()
            r3.add(r1)
            goto L_0x0028
        L_0x0044:
            r0 = r4
            goto L_0x004a
        L_0x0046:
            java.util.ArrayList r0 = X.00k.A0U(r3)
        L_0x004a:
            r7.A0P = r0
            r7.A0M = r4
        L_0x004e:
            java.util.List r1 = r7.A0P
            r0 = 0
            if (r1 == 0) goto L_0x0082
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r1.iterator()
        L_0x005c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x007e
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.3UI r2 = (X.AnonymousClass3UI) r2
            X.3UO r1 = r2.A07
            X.3UO r0 = X.AnonymousClass3UO.SUGGESTED_USER
            if (r1 != r0) goto L_0x007a
            X.3UL r0 = r2.A00()
            if (r0 == 0) goto L_0x005c
            com.instagram.user.model.User r0 = r0.A03
            if (r0 != 0) goto L_0x007a
            goto L_0x005c
        L_0x007a:
            r5.add(r3)
            goto L_0x005c
        L_0x007e:
            java.util.ArrayList r0 = X.00k.A0U(r5)
        L_0x0082:
            r7.A0P = r0
            X.1UQ r0 = r7.A05
            if (r0 != 0) goto L_0x0093
            java.lang.String r1 = "Parsing SuggestedUsers"
            java.lang.String r0 = "Invalid/missing netego_type string"
            X.0wb.A03(r1, r0)
            X.1UQ r0 = X.1UQ.A0v
            r7.A05 = r0
        L_0x0093:
            java.lang.Integer r0 = r7.A09
            if (r0 != 0) goto L_0x009b
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r7.A09 = r0
        L_0x009b:
            java.util.List r0 = r7.A0P
            r5 = 0
            if (r0 == 0) goto L_0x00ca
            java.util.Iterator r6 = r0.iterator()
            r2 = 0
        L_0x00a5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r4 = r6.next()
            int r3 = r2 + 1
            if (r2 < 0) goto L_0x00ec
            X.3UI r4 = (X.AnonymousClass3UI) r4
            X.3UO r1 = r4.A07
            X.3UO r0 = X.AnonymousClass3UO.SUGGESTED_USER
            if (r1 != r0) goto L_0x00c8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.Map r1 = r7.A0U
            X.3UL r0 = r4.A00()
            r1.put(r0, r2)
        L_0x00c8:
            r2 = r3
            goto L_0x00a5
        L_0x00ca:
            java.util.List r0 = r7.A0M
            if (r0 == 0) goto L_0x00f4
            java.util.Iterator r4 = r0.iterator()
            r1 = 0
        L_0x00d3:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r3 = r4.next()
            int r2 = r1 + 1
            if (r1 < 0) goto L_0x00ec
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.Map r0 = r7.A0U
            r0.put(r3, r1)
            r1 = r2
            goto L_0x00d3
        L_0x00ec:
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f4:
            java.util.List r4 = r7.A04()
            if (r4 == 0) goto L_0x0110
            int r3 = r4.size()
        L_0x00fe:
            if (r5 >= r3) goto L_0x0110
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.util.Map r1 = r7.A0T
            java.lang.Object r0 = r4.get(r5)
            r1.put(r0, r2)
            int r5 = r5 + 1
            goto L_0x00fe
        L_0x0110:
            X.4hR r3 = r7.A03
            if (r3 != 0) goto L_0x011e
            X.3xe r0 = r7.A04
            if (r0 == 0) goto L_0x0138
            X.4g6 r0 = X.Ci1.A00(r0)
            X.4hR r3 = r0.A01
        L_0x011e:
            r7.A03 = r3
            if (r3 == 0) goto L_0x0137
            java.lang.String r2 = r7.A0F
            if (r2 != 0) goto L_0x0128
            java.lang.String r2 = ""
        L_0x0128:
            java.lang.String r1 = r7.A0G
            X.4gm r0 = new X.4gm
            r0.<init>()
            r0.A06 = r2
            r0.A08 = r1
            r0.A02 = r3
            r7.A06 = r0
        L_0x0137:
            return
        L_0x0138:
            r3 = 0
            goto L_0x011e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3UH.A05():void");
    }

    public final void A06(String str) {
        if (str != null && str.length() != 0) {
            List<AnonymousClass3UI> list = this.A0P;
            if (list != null) {
                for (AnonymousClass3UI r2 : list) {
                    if (r2.A07 == AnonymousClass3UO.SUGGESTED_USER) {
                        AnonymousClass3UL A002 = r2.A00();
                        if (A002 == null) {
                            throw new IllegalStateException("Required value was null.");
                        } else if (str.equals(A002.A03.getId())) {
                        }
                    }
                }
                throw new NoSuchElementException(AnonymousClass000.A00(3));
            }
            r2 = null;
            List list2 = this.A0P;
            if (list2 != null) {
                0u4.A00(list2).remove(r2);
            }
        }
    }

    @Deprecated(message = "")
    public final boolean A07() {
        List list = this.A0M;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean A08() {
        List list = this.A0P;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final 1UQ B5J() {
        1UQ r0 = this.A05;
        if (r0 == null) {
            return 1UQ.A0v;
        }
        return r0;
    }

    public final Integer B9V() {
        return this.A07;
    }

    public final C67241sS BJP() {
        return this.A02;
    }

    public final Integer BVp() {
        return null;
    }

    public final String C9L() {
        return this.A0G;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0N;
    }

    public final Integer CEl() {
        return this.A08;
    }

    public final String getId() {
        String str = this.A0F;
        if (str == null) {
            return "";
        }
        return str;
    }

    public AnonymousClass3UH() {
        this((AnonymousClass3UG) null);
    }
}
