package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.model.people.PeopleTag;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3aQ  reason: invalid class name and case insensitive filesystem */
public abstract class C243963aQ extends C251263mp {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.3Y5, X.3bE] */
    /* JADX WARNING: type inference failed for: r6v2, types: [X.2TC, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:9:0x0046=Splitter:B:9:0x0046, B:28:0x0098=Splitter:B:28:0x0098, B:47:0x011a=Splitter:B:47:0x011a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C244533bL A0F(X.B0X r21, X.C243243Xz r22, X.2Vz r23, int r24, int r25) {
        /*
            r20 = this;
            r0 = 0
            r8 = r22
            X.0qQ.A0B(r8, r0)
            r3 = 1
            r1 = r23
            X.0qQ.A0B(r1, r3)
            X.2TR r2 = new X.2TR
            r2.<init>()
            int r0 = X.AnonymousClass3Y0.A00
            if (r21 == 0) goto L_0x001d
            java.lang.String r1 = "newPerformanceEvent"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
        L_0x001c:
            throw r0
        L_0x001d:
            X.2V1 r1 = r1.A04
            X.0qQ.A0B(r1, r3)
            X.3bE r4 = new X.3bE
            r4.<init>(r1, r8)
            java.util.Set r3 = X.2SN.A00
            boolean r0 = r3.isEmpty()
            java.lang.String r5 = "render:"
            r9 = r20
            if (r0 == 0) goto L_0x004c
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r12 = r0.isTracing()
            if (r12 == 0) goto L_0x0046
            java.lang.String r0 = r9.A0J()
            java.lang.String r0 = X.002.A0R(r5, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0046:
            X.3bK r5 = r9.A0X(r4)     // Catch:{ all -> 0x0121 }
            goto L_0x0176
        L_0x004c:
            java.util.Iterator r10 = r3.iterator()
            r7 = 0
        L_0x0051:
            boolean r0 = r10.hasNext()
            java.lang.String r13 = "Litho.Resolve.ComponentRendered"
            if (r0 == 0) goto L_0x007b
            java.lang.Object r6 = r10.next()
            r0 = r6
            X.2SM r0 = (X.2SM) r0
            java.lang.String[] r3 = r0.A00
            boolean r0 = X.03t.A0O(r13, r3)
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "*"
            boolean r0 = X.03t.A0O(r0, r3)
            if (r0 == 0) goto L_0x0051
        L_0x0070:
            if (r7 != 0) goto L_0x0077
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x0077:
            r7.add(r6)
            goto L_0x0051
        L_0x007b:
            if (r7 != 0) goto L_0x007f
            X.0sn r7 = X.0sn.A00
        L_0x007f:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x009e
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r12 = r0.isTracing()
            if (r12 == 0) goto L_0x0098
            java.lang.String r0 = r9.A0J()
            java.lang.String r0 = X.002.A0R(r5, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x0098:
            X.3bK r5 = r9.A0X(r4)     // Catch:{ all -> 0x0121 }
            goto L_0x0176
        L_0x009e:
            java.util.Iterator r10 = r7.iterator()
            r3 = 0
        L_0x00a3:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r6 = r10.next()
            boolean r0 = r6 instanceof X.C7850QbY
            if (r0 == 0) goto L_0x00a3
            if (r3 != 0) goto L_0x00b8
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x00b8:
            r3.add(r6)
            goto L_0x00a3
        L_0x00bc:
            if (r3 != 0) goto L_0x00c0
            X.0sn r3 = X.0sn.A00
        L_0x00c0:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.facebook.rendercore.debug.TraceListener<kotlin.Any?>>"
            X.0qQ.A0C(r3, r0)
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            java.lang.String r6 = r9.A0J()
            java.lang.String r0 = "component"
            r15.put(r0, r6)
            java.lang.String r6 = r9.A0J()
            java.lang.String r0 = "name"
            r15.put(r0, r6)
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r10 = r3.iterator()
        L_0x00eb:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r0 = r10.next()
            X.QbY r0 = (X.C7850QbY) r0
            X.S5p r0 = r0.A01(r13)
            r6.add(r0)
            goto L_0x00eb
        L_0x00ff:
            long r16 = java.lang.System.currentTimeMillis()
            long r10 = java.lang.System.nanoTime()
            X.3kJ r0 = com.facebook.litho.ComponentsSystrace.A00
            boolean r12 = r0.isTracing()
            if (r12 == 0) goto L_0x011a
            java.lang.String r0 = r9.A0J()
            java.lang.String r0 = X.002.A0R(r5, r0)
            com.facebook.litho.ComponentsSystrace.A02(r0)
        L_0x011a:
            X.3bK r5 = r9.A0X(r4)     // Catch:{ all -> 0x0121 }
            if (r12 == 0) goto L_0x012b
            goto L_0x0128
        L_0x0121:
            r0 = move-exception
            if (r12 == 0) goto L_0x001c
            com.facebook.litho.ComponentsSystrace.A01()
            throw r0
        L_0x0128:
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x012b:
            long r18 = java.lang.System.nanoTime()
            int r0 = r8.A06
            java.lang.String r14 = java.lang.String.valueOf(r0)
            long r18 = r18 - r10
            X.QbU r12 = new X.QbU
            r12.<init>(r13, r14, r15, r16, r18)
            java.util.Iterator r10 = r3.iterator()
            r9 = 0
        L_0x0141:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0162
            java.lang.Object r8 = r10.next()
            int r3 = r9 + 1
            if (r9 >= 0) goto L_0x0157
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0157:
            X.QbY r8 = (X.C7850QbY) r8
            java.lang.Object r0 = r6.get(r9)
            r8.A02(r12, r0)
            r9 = r3
            goto L_0x0141
        L_0x0162:
            java.util.Iterator r3 = r7.iterator()
        L_0x0166:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x017b
            java.lang.Object r0 = r3.next()
            X.2SM r0 = (X.2SM) r0
            r0.A00(r12)
            goto L_0x0166
        L_0x0176:
            if (r12 == 0) goto L_0x017b
            com.facebook.litho.ComponentsSystrace.A01()
        L_0x017b:
            r0 = 0
            r4.A02 = r0
            X.2WX r0 = r5.A00
            if (r0 == 0) goto L_0x01b2
            X.2TC r6 = new X.2TC
            r6.<init>()
            r0.A01(r6, r1)
        L_0x018a:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x01a1
            X.2WD r0 = r5.A01
            X.2WG r0 = r0.A01
            X.2WH r3 = r0.A02
            X.3d2 r1 = X.C245513d2.A00
            X.0qQ.A08(r1)
            X.3ar r0 = new X.3ar
            r0.<init>(r1, r3)
            r3.A0C(r0)
        L_0x01a1:
            X.2WD r0 = r5.A01
            r2.A0R = r0
            X.3bj r1 = r4.A03
            java.util.List r0 = r4.A04
            X.AnonymousClass3Y0.A0A(r2, r1, r0)
            X.3bL r0 = new X.3bL
            r0.<init>(r6, r2)
            return r0
        L_0x01b2:
            r6 = 0
            goto L_0x018a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C243963aQ.A0F(X.B0X, X.3Xz, X.2Vz, int, int):X.3bL");
    }

    public final Object A0H(Context context) {
        0qQ.A0B(context, 0);
        super.A0H(context);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean A0N() {
        return true;
    }

    public final boolean A0R(C251263mp r5) {
        return this == r5 || (r5 != null && 0qQ.A0K(getClass(), r5.getClass()) && (this.A00 == r5.A00 || C245173cR.A03(this, r5)));
    }

    public final boolean A0T(C251263mp r2, C251263mp r3, 2TB r4, 2TB r5) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 2);
        return super.A0T(r2, r3, r4, r5);
    }

    public final Integer A0G() {
        return AnonymousClass05K.A0N;
    }

    public C244523bK A0X(C244463bE r51) {
        HashMap hashMap;
        2WO r12;
        AnonymousClass2WG r10;
        2WX r2;
        C246993fb r11;
        Float f;
        C244463bE r0 = r51;
        if (this instanceof C244473bF) {
            C244473bF r5 = (C244473bF) this;
            0qQ.A0B(r0, 0);
            2Wd r1 = r5.A03;
            Drawable drawable = null;
            if (r1 != null) {
                f = Float.valueOf((float) 2Wd.A00(r0.Bnf(), r1.A00));
            } else {
                f = null;
            }
            Integer num = r5.A08;
            if (num != null) {
                drawable = C244013aV.A0D(r0, num.intValue());
            }
            CharSequence charSequence = r5.A06;
            Float f2 = r5.A07;
            2WU r7 = r5.A04;
            r12 = new AnonymousClass4FB(r7, charSequence, f, f2);
            r10 = new AnonymousClass2WG(r7, AnonymousClass4FC.A00, new AnonymousClass9MC(40, r5, drawable, f), r0.A01());
            r2 = r5.A02;
        } else if (this instanceof C244443bC) {
            C244443bC r4 = (C244443bC) this;
            0qQ.A0B(r0, 0);
            if (r4.A08) {
                1OO A0J = 1NK.A00().A0J(r4.A05, r4.A04.getModuleName());
                A0J.A0I = true;
                A0J.A01();
            }
            r12 = C244553bN.A00;
            r10 = new AnonymousClass2WG(C244443bC.A0A, C244563bO.A00, new C377439Lv(28, r0, r4), r0.A01());
            r2 = r4.A03;
        } else if (this instanceof C244423bA) {
            C244423bA r3 = (C244423bA) this;
            0qQ.A0B(r0, 0);
            r12 = new 2WO(0, 0);
            r10 = new AnonymousClass2WG(C244423bA.A05, C244483bG.A00, new AnonymousClass9LT(r3, 9), r0.A01());
            r2 = r3.A00;
        } else if (this instanceof C262654Fj) {
            C262654Fj r32 = (C262654Fj) this;
            0qQ.A0B(r0, 0);
            r12 = new C262674Fl(r32.A00);
            r10 = new AnonymousClass2WG(C262654Fj.A03, C262684Fm.A00, new C377439Lv(31, r0, r32), r0.A01());
            r2 = r32.A01;
        } else if (this instanceof AnonymousClass4KH) {
            AnonymousClass4KH r13 = (AnonymousClass4KH) this;
            0qQ.A0B(r0, 0);
            Integer num2 = null;
            2Wd r22 = r13.A02;
            if (r22 != null) {
                num2 = Integer.valueOf(2Wd.A00(r0.Bnf(), r22.A00));
            }
            C251273mq r122 = AnonymousClass4KH.A06;
            CharSequence charSequence2 = r13.A04;
            Boolean bool = r13.A03;
            return new C244523bK(r13.A01, new AnonymousClass2WD(new AnonymousClass54S(r122, bool, charSequence2, (Float) null, (Integer) null, num2), new AnonymousClass2WG(r122, AnonymousClass54T.A00, new C58810Ixv(2, num2, (Object) null, bool, charSequence2, r13.A05, r13.A00, (Object) null), r0.A01())));
        } else if (this instanceof C267214b9) {
            C267214b9 r9 = (C267214b9) this;
            0qQ.A0B(r0, 0);
            UserSession userSession = r9.A01;
            C231502rm A00 = C231492rl.A00(userSession);
            C246613et r52 = r9.A03;
            boolean A002 = C246383eV.A00(r52.A08);
            C246603es r33 = r52.A0A;
            0sP r23 = r33.A0I;
            Context context = r0.A05.A0C;
            0qQ.A07(context);
            C246953fX r123 = (C246953fX) r23.invoke(context);
            2WX r6 = null;
            if (A002) {
                r11 = (C246993fb) r33.A0L.invoke(r9.A05);
            } else {
                r11 = null;
            }
            boolean z = r52.A0T;
            boolean z2 = A00.A0P;
            if (A00.A0F) {
                C247013fd.A09(r123.A02, r52.A0J, r9.A02.getModuleName());
            }
            AnonymousClass9LN A003 = C246973fZ.A00(r0, userSession, r123.A02, r52.A0J, r9.A02.getModuleName());
            C246983fa r53 = C246983fa.A00;
            C267234bE r21 = C267234bE.A00;
            AnonymousClass2WG r19 = new AnonymousClass2WG(new 2WU(C243983aS.A00, new C267244bF(r9), 4, true), r21, new C267254bG(r0, r123, r9, r11, A003, z, z2), r0.A01());
            2WX r34 = r9.A00;
            AnonymousClass9JS r24 = new AnonymousClass9JS(AnonymousClass05K.A0E, C244083ac.A00(C244063aa.MEDIA), 4);
            if (r34 != 2WX.A02) {
                r6 = r34;
            }
            return new C244523bK(new 2WX(r6, r24), r53, r19);
        } else if (this instanceof AnonymousClass4KG) {
            AnonymousClass4KG r35 = (AnonymousClass4KG) this;
            0qQ.A0B(r0, 0);
            r12 = new C277244uj(r35.A00);
            r10 = new AnonymousClass2WG(AnonymousClass4KG.A07, C277254uk.A00, new C377439Lv(42, r0, r35), r0.A01());
            r2 = r35.A03;
        } else {
            C243953aP r72 = (C243953aP) this;
            0qQ.A0B(r0, 0);
            2Wa A004 = C243643Zq.A00(r0, AnonymousClass52I.A00);
            2Wa A005 = C243643Zq.A00(r0, AnonymousClass52J.A00);
            boolean z3 = r72.A0O;
            if (z3) {
                UserSession userSession2 = r72.A08;
                if (C271174i4.A02(userSession2)) {
                    ArrayList A006 = LNS.A00.A00(userSession2, r72.A09);
                    hashMap = new HashMap();
                    Iterator it = A006.iterator();
                    0qQ.A07(it);
                    while (it.hasNext()) {
                        Object next = it.next();
                        0qQ.A07(next);
                        PeopleTag peopleTag = (PeopleTag) next;
                        hashMap.put(peopleTag.A07().getId(), AnonymousClass2f1.A00(userSession2).A0N(peopleTag.A07()));
                    }
                    User user = r72.A0H;
                    String id = user.getId();
                    UserSession userSession3 = r72.A08;
                    C243773a4.A00(r0, new AnonymousClass9N0(r72, hashMap, A004, A005, id, 5), new Object[]{id, userSession3});
                    boolean z4 = r72.A0S;
                    1Xj r49 = r72.A09;
                    0xF r48 = r72.A07;
                    Integer num3 = r72.A0I;
                    SearchContext searchContext = r72.A0A;
                    C243853aD r46 = r72.A0D;
                    C243873aF r45 = r72.A0C;
                    C243893aH r44 = r72.A0F;
                    C243913aJ r43 = r72.A0E;
                    boolean z5 = r72.A0N;
                    boolean z6 = r72.A0U;
                    boolean z7 = r72.A0T;
                    boolean z8 = r72.A0R;
                    C243993aT r192 = r72.A05;
                    boolean booleanValue = ((Boolean) A005.A03).booleanValue();
                    C243923aK r18 = r72.A0B;
                    boolean z9 = r72.A0Q;
                    String str = r72.A0L;
                    C243943aO r132 = r72.A0G;
                    float f3 = r72.A01;
                    int i = r72.A03;
                    C243993aT r133 = r192;
                    0xF r14 = r48;
                    UserSession userSession4 = userSession3;
                    1Xj r16 = r49;
                    SearchContext searchContext2 = searchContext;
                    C243873aF r193 = r45;
                    C243853aD r20 = r46;
                    C243913aJ r212 = r43;
                    C243893aH r222 = r44;
                    r12 = new AnonymousClass52K(r133, r14, userSession4, r16, searchContext2, r18, r193, r20, r212, r222, r132, (FollowStatus) A004.A03, user, num3, r72.A0J, str, r72.A0K, f3, r72.A00, i, r72.A02, z4, z5, z6, z7, z8, booleanValue, z3, z9, r72.A0P);
                    r10 = new AnonymousClass2WG(C243953aP.A0V, AnonymousClass52L.A00, new AnonymousClass9MC(39, r72, A004, A005), r0.A01());
                    r2 = r72.A04;
                }
            }
            hashMap = new HashMap();
            User user2 = r72.A0H;
            String id2 = user2.getId();
            UserSession userSession32 = r72.A08;
            C243773a4.A00(r0, new AnonymousClass9N0(r72, hashMap, A004, A005, id2, 5), new Object[]{id2, userSession32});
            boolean z42 = r72.A0S;
            1Xj r492 = r72.A09;
            0xF r482 = r72.A07;
            Integer num32 = r72.A0I;
            SearchContext searchContext3 = r72.A0A;
            C243853aD r462 = r72.A0D;
            C243873aF r452 = r72.A0C;
            C243893aH r442 = r72.A0F;
            C243913aJ r432 = r72.A0E;
            boolean z52 = r72.A0N;
            boolean z62 = r72.A0U;
            boolean z72 = r72.A0T;
            boolean z82 = r72.A0R;
            C243993aT r1922 = r72.A05;
            boolean booleanValue2 = ((Boolean) A005.A03).booleanValue();
            C243923aK r182 = r72.A0B;
            boolean z92 = r72.A0Q;
            String str2 = r72.A0L;
            C243943aO r1322 = r72.A0G;
            float f32 = r72.A01;
            int i2 = r72.A03;
            C243993aT r1332 = r1922;
            0xF r142 = r482;
            UserSession userSession42 = userSession32;
            1Xj r162 = r492;
            SearchContext searchContext22 = searchContext3;
            C243873aF r1932 = r452;
            C243853aD r202 = r462;
            C243913aJ r2122 = r432;
            C243893aH r2222 = r442;
            r12 = new AnonymousClass52K(r1332, r142, userSession42, r162, searchContext22, r182, r1932, r202, r2122, r2222, r1322, (FollowStatus) A004.A03, user2, num32, r72.A0J, str2, r72.A0K, f32, r72.A00, i2, r72.A02, z42, z52, z62, z72, z82, booleanValue2, z3, z92, r72.A0P);
            r10 = new AnonymousClass2WG(C243953aP.A0V, AnonymousClass52L.A00, new AnonymousClass9MC(39, r72, A004, A005), r0.A01());
            r2 = r72.A04;
        }
        return new C244523bK(r2, r12, r10);
    }

    public final C251263mp A0E() {
        C251263mp A0E = super.A0E();
        0qQ.A07(A0E);
        return A0E;
    }

    public final String A0J() {
        String A00 = AnonymousClass3XB.A00(getClass());
        0qQ.A07(A00);
        return A00;
    }
}
