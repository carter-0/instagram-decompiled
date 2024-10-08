package com.instagram.save.api;

import X.002;
import X.0Ym;
import X.0Yt;
import X.0jB;
import X.0mp;
import X.0qQ;
import X.0se;
import X.0wb;
import X.1Au;
import X.1Av;
import X.1ES;
import X.1NY;
import X.1OC;
import X.1P0;
import X.1Xj;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass1Xo;
import X.AnonymousClass3WX;
import X.AnonymousClass3ZL;
import X.AnonymousClass4DU;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass93W;
import X.C225892f5;
import X.C231122qu;
import X.C233822wX;
import X.C243373Ym;
import X.C249763kK;
import X.C254513sb;
import X.C254523sc;
import X.C2606846q;
import X.C3724090s;
import X.C45414Cvu;
import X.C46300DUd;
import X.C51965G9l;
import X.C51967G9n;
import X.C51971G9r;
import X.C51972G9s;
import X.C51974G9v;
import X.C54665HMw;
import X.C54995HaS;
import X.C55116HcP;
import X.C61970qY;
import X.DbS;
import X.DbT;
import X.DbX;
import X.G9w;
import X.H1P;
import X.H4U;
import X.I6U;
import X.JPV;
import X.WWW;
import android.app.Activity;
import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class SaveApiUtil {
    public static final 1OC A00(UserSession userSession, C243373Ym r4, Integer num, String str, String str2, Map map) {
        int i;
        AnonymousClass7TF.A1D(userSession, 0, str2);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        String obj = r4.toString();
        0qQ.A0B(obj, 1);
        if (num.intValue() != 0) {
            i = 3905;
        } else {
            i = 695;
        }
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe(AnonymousClass000.A00(i), str, obj);
        0qQ.A07(formatStrLocaleSafe);
        A0a.A0E = formatStrLocaleSafe;
        DbX.A1M(A0a, "module_name", str2);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            C51974G9v.A1C(A0a, A0u);
        }
        return DbT.A0U(A0a, true);
    }

    public static final void A03(Activity activity, Context context, 1OC r14, UserSession userSession, 1Xj r16, AnonymousClass4DU r17, JPV jpv, C243373Ym r19, SearchContext searchContext, C249763kK r21, String str, int i, int i2, int i3) {
        UserSession userSession2 = userSession;
        1Xj r10 = r16;
        C243373Ym r11 = r19;
        C45414Cvu A02 = A02(context, userSession, r11, r10);
        Integer num = AnonymousClass05K.A00;
        r14.A00 = new H4U(1, (Object) null, jpv, userSession2, num, A02, r10, r11);
        1Av A00 = 1Au.A00(userSession);
        AnonymousClass7TF.A1J(A00, A00.A25, 1Av.A8a, 152, true);
        AnonymousClass4DU r15 = r17;
        C254523sc A0c = C51967G9n.A0c(userSession2, r10, r15, r11.toString());
        int i4 = i;
        A0c.A09(i4);
        A0c.A07 = i3;
        A0c.A3A = num;
        A0c.A6u = str;
        SearchContext searchContext2 = searchContext;
        if (searchContext != null) {
            A0c.A6r = searchContext2.A05;
            A0c.A6Y = searchContext2.A03;
            A0c.A6W = searchContext2.A02;
            A0c.A11 = searchContext2;
        }
        C249763kK r162 = r21;
        if (!AnonymousClass3WX.A02(r10, r15)) {
            A0c.A0C(activity, userSession2);
            if (r21 != null) {
                A0c.A6t = r162.getSessionId();
            }
        }
        int i5 = i2;
        C233822wX.A0E(userSession2, A0c, r10, r15, i5);
        if (r11 != C243373Ym.SAVED) {
            num = AnonymousClass05K.A01;
        }
        I6U.A01(activity, userSession2, r10, r15, r162, num, C54665HMw.ALL_MEDIA_AUTO_COLLECTION.A01, i4, i5);
    }

    public static final void A04(Activity activity, Context context, UserSession userSession, 1Xj r19, AnonymousClass4DU r20, JPV jpv, C243373Ym r22, SearchContext searchContext, C249763kK r24, String str, String str2, String str3, int i, int i2, int i3) {
        1Xj r10 = r19;
        0qQ.A0B(r10, 0);
        Activity activity2 = activity;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r11 = r20;
        C243373Ym r13 = r22;
        C51974G9v.A0d(3, r13, r11, activity2, userSession2);
        Context context2 = context;
        0qQ.A0B(context2, 8);
        String id = r10.getId();
        if (id == null) {
            0wb.A03("SaveApiUtil", "Cannot save media where media.id is null");
            return;
        }
        Integer num = AnonymousClass05K.A00;
        String str4 = null;
        String str5 = null;
        if (r10.CcK()) {
            str4 = r10.A2v();
        }
        0Ym r2 = new 0Ym();
        r2.put("radio_type", C61970qY.A09(context2));
        if (!(str4 == null || str4.length() == 0)) {
            r2.put("tracking_token", str4);
        }
        SearchContext searchContext2 = searchContext;
        if (searchContext != null) {
            r2.put("rank_token", searchContext2.A03);
            r2.put("search_session_id", searchContext2.A05);
            r2.put("query_text", searchContext2.A02);
        }
        LinkedHashMap A03 = 0Yt.A03(0se.A0N(r2));
        A03.put("delivery_class", C2606846q.A00(r10.A2L()));
        if (DbT.A0x(r10) != null) {
            A03.put("ranking_info_token", DbT.A0x(r10));
        }
        A03.put("starting_clips_media_id", str2);
        A03.put("starting_clips_ranking_info_token", str3);
        int i4 = i3;
        if (i4 != -1) {
            A03.put(AnonymousClass000.A00(4777), String.valueOf(i4));
        }
        if (C51965G9l.A0t(r10) != null) {
            A03.put("inventory_source", C51965G9l.A0t(r10));
        }
        int i5 = i;
        if (i5 != -1) {
            A03.put("client_position", String.valueOf(i5));
        }
        String A0k = DbS.A0k();
        if (A0k != null) {
            A03.put("nav_chain", A0k);
        }
        if (r10.A5x()) {
            C46300DUd Bmy = r10.A0C.Bmy();
            if (Bmy != null) {
                str5 = Bmy.Bmx();
            }
            A03.put("repost_id", str5);
        }
        C54995HaS.A00(userSession2, r10, r13);
        1OC A00 = A00(userSession2, r13, num, id, r11.getModuleName(), A03);
        A03(activity2, context2, A00, userSession2, r10, r11, jpv, r13, searchContext2, r24, str, i5, i2, i4);
        1ES.A03(A00);
    }

    public static final void A05(Activity activity, Context context, UserSession userSession, 1Xj r18, AnonymousClass4DU r19, C243373Ym r20, int i) {
        A04(activity, context, userSession, r18, r19, (JPV) null, r20, (SearchContext) null, (C249763kK) null, (String) null, (String) null, (String) null, i, 0, -1);
    }

    public static final void A07(Context context, UserSession userSession, C243373Ym r10, AnonymousClass1Xo r11, String str) {
        String str2;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1Q(userSession, context);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        if (r10 == C243373Ym.SAVED) {
            str2 = "map/save_location/";
        } else {
            str2 = "map/unsave_location/";
        }
        A0a.A0E = str2;
        A0a.A9m(AnonymousClass000.A00(3524), r11.BpP());
        DbX.A1M(A0a, "module_name", str);
        1OC A0U = DbT.A0U(A0a, true);
        C45414Cvu A02 = A02(context, userSession2, r10, r11);
        A0U.A00 = new H4U(1, (Object) null, (Object) null, userSession2, AnonymousClass05K.A0C, A02, r11, r10);
        1ES.A03(A0U);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (r1 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A08(com.instagram.common.session.UserSession r17, X.AnonymousClass4DU r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) {
        /*
            r4 = 0
            java.lang.String r0 = "merchant_id"
            r2 = r20
            java.util.HashMap r16 = X.DbY.A0m(r0, r2)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.3Ym r12 = X.C243373Ym.NOT_SAVED
            r3 = r18
            java.lang.String r15 = r3.getModuleName()
            r11 = r17
            r14 = r19
            X.1OC r10 = A00(r11, r12, r13, r14, r15, r16)
            java.lang.String r1 = r12.toString()
            r0 = 3377(0xd31, float:4.732E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            java.lang.String r8 = "_"
            java.lang.String r0 = X.002.A0g(r9, r8, r1)
            X.3sc r7 = X.C51965G9l.A0n(r3, r0)
            r7.A6U = r14
            r7.A5y = r2
            java.lang.String r0 = r7.A5w
            if (r0 == 0) goto L_0x003e
            boolean r1 = r2.equals(r0)
            r0 = 1
            if (r1 == 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A1a = r0
            r6 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            r7.A1o = r5
            r0 = r21
            r7.A6S = r0
            r7.A3A = r13
            r7.A4W = r2
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            X.C233822wX.A0I(r11, r7, r3, r4)
            java.lang.String r0 = "remove_from_collection"
            java.lang.String r0 = X.002.A0g(r9, r8, r0)
            X.3sc r1 = X.C51965G9l.A0n(r3, r0)
            r1.A6U = r14
            r1.A5y = r2
            java.lang.String r0 = r1.A5w
            if (r0 == 0) goto L_0x0072
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0072
            r6 = 1
        L_0x0072:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r1.A1a = r0
            X.HMw r0 = X.C54665HMw.PRODUCT_AUTO_COLLECTION
            java.lang.String r0 = r0.A01
            X.I6U.A05(r1, r13, r0)
            r1.A4W = r2
            r1.A1o = r5
            X.C233822wX.A0I(r11, r1, r3, r4)
            X.1ES.A03(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.save.api.SaveApiUtil.A08(com.instagram.common.session.UserSession, X.4DU, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static final boolean A09(UserSession userSession, 1Xj r2) {
        0qQ.A0B(userSession, 1);
        if (r2 == null || !C225892f5.A00(userSession).A0O(r2)) {
            return false;
        }
        return true;
    }

    public static final void A06(Context context, 1P0 r26, UserSession userSession, 1Xj r28, AnonymousClass4DU r29, AnonymousClass3ZL r30, C243373Ym r31, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String str10;
        AnonymousClass3ZL r2 = r30;
        0Ym r3 = new 0Ym();
        String str11 = str;
        if (str != null) {
            r3.put("merchant_id", str11);
        }
        1Xj r24 = r28;
        if (r28 != null) {
            r3.put("media_id", r24.getId());
        }
        String str12 = str9;
        if (str9 != null) {
            r3.put("marketer_id", str12);
        }
        0Ym A0N = 0se.A0N(r3);
        String BpP = r2.BpP();
        0qQ.A07(BpP);
        Integer num = AnonymousClass05K.A01;
        AnonymousClass4DU r32 = r29;
        UserSession userSession2 = userSession;
        C243373Ym r0 = r31;
        1OC A00 = A00(userSession2, r0, num, BpP, r32.getModuleName(), A0N);
        A00.A00 = new H4U(1, r26, (Object) null, userSession2, num, A02(context, userSession2, r0, r2), r2, r0);
        if (r2 instanceof Product) {
            Product product = (Product) r2;
            String A0s = C51971G9r.A0s(r24);
            0qQ.A0B(product, 3);
            0jB A0k = C51965G9l.A0k();
            A0k.A0A("shopping_session_id", str7);
            String str13 = str8;
            if (str8 != null) {
                A0k.A0A("position", str13);
            }
            String obj = r0.toString();
            String str14 = product.A0H;
            0qQ.A0B(str14, 0);
            C254523sc A04 = C254513sb.A04(new WWW(str14), r32, obj);
            A04.A3A = num;
            String str15 = str4;
            A04.A6S = str15;
            A04.A6T = str5;
            String str16 = str3;
            A04.A75 = str16;
            Boolean valueOf = Boolean.valueOf(product.A04());
            ProductDetailsProductItemDict productDetailsProductItemDict = product.A01;
            UserSession userSession3 = userSession2;
            String str17 = str14;
            String str18 = str11;
            A04.A0H(userSession3, r24, productDetailsProductItemDict.A0C, productDetailsProductItemDict.A0F, valueOf, str17, str18);
            A04.A5K = str2;
            A04.A5u = A0s;
            A04.A7J = C231122qu.A0I(userSession2, A0s);
            A04.A6r = str6;
            A04.A0E(A0k);
            if (r0 == C243373Ym.NOT_SAVED) {
                A04.A1o = true;
            }
            WWW www = new WWW(str14);
            Integer num2 = AnonymousClass05K.A00;
            Integer num3 = num2;
            C233822wX.A0B(userSession2, A04, www, r32, num2);
            if (r0 != C243373Ym.SAVED) {
                num2 = num;
            }
            String str19 = C54665HMw.PRODUCT_AUTO_COLLECTION.A01;
            if (r24 != null && !r24.CcK()) {
                if (num2 == num3) {
                    str10 = "add_to_collection";
                } else {
                    str10 = "remove_from_collection";
                }
                C254523sc A042 = C254513sb.A04(new WWW(str14), r32, str10);
                if (num2 == num) {
                    A042.A1o = true;
                }
                I6U.A05(A042, num2, str19);
                A042.A3A = num;
                A042.A6S = str15;
                A042.A75 = str16;
                Boolean valueOf2 = Boolean.valueOf(product.A04());
                ProductDetailsProductItemDict productDetailsProductItemDict2 = product.A01;
                A042.A0H(userSession3, r24, productDetailsProductItemDict2.A0C, productDetailsProductItemDict2.A0F, valueOf2, str17, str18);
                A042.A0E(A0k);
                C233822wX.A0B(userSession2, A042, new WWW(str14), r32, num3);
            }
        }
        1ES.A03(A00);
    }

    public static final 1OC A01(UserSession userSession, String str, String str2) {
        String A06 = 0mp.A06("feed/collection/%s/clips/", new Object[]{str});
        1NY A0b = AnonymousClass7TG.A0b(userSession);
        A0b.A0E = A06;
        C51972G9s.A18(A0b, userSession, AnonymousClass93W.class);
        A0b.A0A = 002.A0R(A06, str2);
        A0b.A03();
        A0b.A9m("collection_id", str);
        C3724090s.A06(A0b, str2);
        return A0b.A0M();
    }

    public static final C45414Cvu A02(Context context, UserSession userSession, C243373Ym r6, AnonymousClass1Xo r7) {
        AnonymousClass3ZL r72;
        AnonymousClass7TG.A1T(r7, r6, userSession);
        C243373Ym A0L = C225892f5.A00(userSession).A0L(r7.BpO(), r7);
        0qQ.A07(A0L);
        C55116HcP.A00(userSession, A0L, r6, r7);
        Integer BpT = r7.BpT();
        0qQ.A07(BpT);
        0Ym r2 = new 0Ym();
        if (BpT == AnonymousClass05K.A00 && context != null) {
            r2.put("radio_type", C61970qY.A09(context));
        }
        C45414Cvu A0M = C225892f5.A00(userSession).A0M(r6, r7, 0Yt.A03(0se.A0N(r2)));
        if (BpT == AnonymousClass05K.A01 && (r7 instanceof AnonymousClass3ZL) && (r72 = (AnonymousClass3ZL) r7) != null) {
            G9w.A1L(userSession, r72);
        }
        return A0M;
    }

    public static boolean A0A(H1P h1p, AnonymousClass0eM r1) {
        return A09(h1p.A0A(), (1Xj) r1.getValue());
    }
}
