package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.util.ArrayDeque;
import java.util.HashMap;

/* renamed from: X.Ob7  reason: case insensitive filesystem */
public final class C71084Ob7 {
    public C71038Oa2 A00;
    public OGY A01;
    public Integer A02;
    public String A03;
    public final Context A04;
    public final UserSession A05;
    public final User A06;
    public final ONV A07;
    public final NKU A08;
    public final C70988OVc A09;
    public final C16666Uz2 A0A;
    public final C14068TpH A0B;
    public final C16677UzD A0C;
    public final C74488Pvi A0D;
    public final NHU A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final HashMap A0I;
    public final C49530ExC A0J;

    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d3 A[Catch:{ IOException -> 0x010c }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A00(X.C71084Ob7 r8, java.lang.String r9) {
        /*
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311680744948444(0x810148000002dc, double:3.0269913462831357E-306)
            boolean r7 = X.182.A06(r2, r3, r0)
            r0 = 36874630698434612(0x83014800010034, double:3.383003163685303E-306)
            java.lang.String r3 = X.182.A04(r2, r3, r0)
            X.16F r0 = X.16P.A00(r9)     // Catch:{ IOException -> 0x010c }
            X.OAV r0 = X.O3O.parseFromJson(r0)     // Catch:{ IOException -> 0x010c }
            java.util.List r1 = r0.A00     // Catch:{ IOException -> 0x010c }
            if (r1 != 0) goto L_0x0024
            X.0sn r1 = X.0sn.A00     // Catch:{ IOException -> 0x010c }
        L_0x0024:
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x010c }
            if (r0 == 0) goto L_0x0038
            java.lang.Integer r1 = X.AnonymousClass05K.A0S     // Catch:{ IOException -> 0x010c }
        L_0x002c:
            X.TpH r2 = r8.A0B     // Catch:{ IOException -> 0x010c }
            X.TpH r0 = X.C14068TpH.DIRECT_MESSAGES     // Catch:{ IOException -> 0x010c }
            if (r2 == r0) goto L_0x00c8
            X.TpH r0 = X.C14068TpH.NOTIFICATION_MESSAGES_ADMIN_TEXT     // Catch:{ IOException -> 0x010c }
            if (r2 != r0) goto L_0x00cf
            goto L_0x00c8
        L_0x0038:
            java.lang.Object r6 = X.C66582MXn.A0r(r1)     // Catch:{ IOException -> 0x010c }
            r0 = 36
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r0)     // Catch:{ IOException -> 0x010c }
            int r4 = r5.length     // Catch:{ IOException -> 0x010c }
            r2 = 0
        L_0x0044:
            if (r2 >= r4) goto L_0x00c4
            r1 = r5[r2]     // Catch:{ IOException -> 0x010c }
            int r0 = r1.intValue()     // Catch:{ IOException -> 0x010c }
            switch(r0) {
                case 1: goto L_0x0058;
                case 2: goto L_0x005b;
                case 3: goto L_0x005e;
                case 4: goto L_0x0061;
                case 5: goto L_0x0064;
                case 6: goto L_0x0067;
                case 7: goto L_0x006a;
                case 8: goto L_0x006d;
                case 9: goto L_0x0070;
                case 10: goto L_0x0073;
                case 11: goto L_0x0076;
                case 12: goto L_0x0079;
                case 13: goto L_0x007c;
                case 14: goto L_0x007f;
                case 15: goto L_0x0082;
                case 16: goto L_0x0085;
                case 17: goto L_0x0088;
                case 18: goto L_0x008b;
                case 19: goto L_0x008e;
                case 20: goto L_0x0091;
                case 21: goto L_0x0094;
                case 22: goto L_0x0097;
                case 23: goto L_0x009a;
                case 24: goto L_0x009d;
                case 25: goto L_0x00a0;
                case 26: goto L_0x00a3;
                case 27: goto L_0x00a6;
                case 28: goto L_0x00a9;
                case 29: goto L_0x00ac;
                case 30: goto L_0x00af;
                case 31: goto L_0x00b2;
                case 32: goto L_0x00b5;
                case 33: goto L_0x00b8;
                case 34: goto L_0x00bb;
                case 35: goto L_0x00be;
                default: goto L_0x004f;
            }     // Catch:{ IOException -> 0x010c }
        L_0x004f:
            java.lang.String r0 = "ig_nudity_direct_message"
        L_0x0051:
            boolean r0 = r0.equals(r6)     // Catch:{ IOException -> 0x010c }
            if (r0 != 0) goto L_0x002c
            goto L_0x00c1
        L_0x0058:
            java.lang.String r0 = "ig_hate_speech_direct_message"
            goto L_0x0051
        L_0x005b:
            java.lang.String r0 = "ig_violence_direct_message"
            goto L_0x0051
        L_0x005e:
            java.lang.String r0 = "ig_sale_of_illegal_or_regulated_goods_direct_message"
            goto L_0x0051
        L_0x0061:
            java.lang.String r0 = "ig_bullying_or_harassment_direct_message"
            goto L_0x0051
        L_0x0064:
            java.lang.String r0 = "ig_intellectual_property_direct_message"
            goto L_0x0051
        L_0x0067:
            java.lang.String r0 = "ig_self_injury_direct_message"
            goto L_0x0051
        L_0x006a:
            java.lang.String r0 = "ig_its_inappropriate_v1"
            goto L_0x0051
        L_0x006d:
            java.lang.String r0 = "ig_direct_thread"
            goto L_0x0051
        L_0x0070:
            java.lang.String r0 = "ig_report_account"
            goto L_0x0051
        L_0x0073:
            java.lang.String r0 = "ig_bullying_or_harassment_me_direct_message"
            goto L_0x0051
        L_0x0076:
            java.lang.String r0 = "ig_user_impersonation"
            goto L_0x0051
        L_0x0079:
            java.lang.String r0 = "ig_business_notification_messages_irrelevant"
            goto L_0x0051
        L_0x007c:
            java.lang.String r0 = "ig_product_scam_fraud_reportable"
            goto L_0x0051
        L_0x007f:
            java.lang.String r0 = "ig_spam_direct_message"
            goto L_0x0051
        L_0x0082:
            java.lang.String r0 = "ig_hacked_account_direct_messages"
            goto L_0x0051
        L_0x0085:
            java.lang.String r0 = "ig_eating_disorder"
            goto L_0x0051
        L_0x0088:
            java.lang.String r0 = "ig_high_risk_drugs_direct_message"
            goto L_0x0051
        L_0x008b:
            java.lang.String r0 = "ig_other_drugs_direct_message"
            goto L_0x0051
        L_0x008e:
            java.lang.String r0 = "ig_terrorism_direct_message"
            goto L_0x0051
        L_0x0091:
            java.lang.String r0 = "ig_human_trafficking_direct_message"
            goto L_0x0051
        L_0x0094:
            java.lang.String r0 = "ig_violent_or_graphic_content_direct_message"
            goto L_0x0051
        L_0x0097:
            java.lang.String r0 = "ig_organized_crime_direct_message"
            goto L_0x0051
        L_0x009a:
            java.lang.String r0 = "ig_involves_someone_under_18_direct_message"
            goto L_0x0051
        L_0x009d:
            java.lang.String r0 = "ig_nudity_or_adult_material_direct_message"
            goto L_0x0051
        L_0x00a0:
            java.lang.String r0 = "ig_prostitution_direct_message"
            goto L_0x0051
        L_0x00a3:
            java.lang.String r0 = "ig_sexual_exploitation_direct_message"
            goto L_0x0051
        L_0x00a6:
            java.lang.String r0 = "ig_threatening_to_share_nude_images_direct_message"
            goto L_0x0051
        L_0x00a9:
            java.lang.String r0 = "ig_product_scam_fraud_reportable_direct_message"
            goto L_0x0051
        L_0x00ac:
            java.lang.String r0 = "ig_animals_direct_message"
            goto L_0x0051
        L_0x00af:
            java.lang.String r0 = "ig_something_else_direct_message"
            goto L_0x0051
        L_0x00b2:
            java.lang.String r0 = "ig_weapons_direct_message"
            goto L_0x0051
        L_0x00b5:
            java.lang.String r0 = "ig_high_risk_drugs_direct_message_v2"
            goto L_0x0051
        L_0x00b8:
            java.lang.String r0 = "ig_other_drugs_direct_message_v2"
            goto L_0x0051
        L_0x00bb:
            java.lang.String r0 = ""
            goto L_0x0051
        L_0x00be:
            java.lang.String r0 = "unknown"
            goto L_0x0051
        L_0x00c1:
            int r2 = r2 + 1
            goto L_0x0044
        L_0x00c4:
            java.lang.Integer r1 = X.AnonymousClass05K.A0T     // Catch:{ IOException -> 0x010c }
            goto L_0x002c
        L_0x00c8:
            if (r7 == 0) goto L_0x00cf
            int r0 = r1.intValue()     // Catch:{ IOException -> 0x010c }
            goto L_0x0109
        L_0x00cf:
            X.TpH r0 = X.C14068TpH.DIRECT_THREAD     // Catch:{ IOException -> 0x010c }
            if (r2 != r0) goto L_0x010c
            int r0 = r1.intValue()     // Catch:{ IOException -> 0x010c }
            switch(r0) {
                case 0: goto L_0x00db;
                case 1: goto L_0x00db;
                case 2: goto L_0x00db;
                case 3: goto L_0x00db;
                case 4: goto L_0x00db;
                case 5: goto L_0x00db;
                case 6: goto L_0x00db;
                case 7: goto L_0x00da;
                case 8: goto L_0x00da;
                case 9: goto L_0x00da;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00da;
                case 12: goto L_0x00da;
                case 13: goto L_0x00da;
                case 14: goto L_0x00da;
                case 15: goto L_0x00db;
                case 16: goto L_0x00db;
                case 17: goto L_0x00db;
                case 18: goto L_0x00db;
                case 19: goto L_0x00db;
                case 20: goto L_0x00db;
                case 21: goto L_0x00db;
                case 22: goto L_0x00db;
                case 23: goto L_0x00db;
                case 24: goto L_0x00db;
                case 25: goto L_0x00db;
                case 26: goto L_0x00db;
                case 27: goto L_0x00db;
                case 28: goto L_0x00db;
                case 29: goto L_0x00db;
                case 30: goto L_0x00da;
                case 31: goto L_0x00db;
                case 32: goto L_0x00db;
                case 33: goto L_0x00db;
                case 34: goto L_0x00ef;
                default: goto L_0x00da;
            }     // Catch:{ IOException -> 0x010c }
        L_0x00da:
            goto L_0x010c
        L_0x00db:
            android.content.Context r1 = r8.A04     // Catch:{ IOException -> 0x010c }
            r0 = 2131973095(0x7f1353e7, float:1.9583216E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IOException -> 0x010c }
            return r0
        L_0x00e5:
            android.content.Context r1 = r8.A04     // Catch:{ IOException -> 0x010c }
            r0 = 2131973096(0x7f1353e8, float:1.9583218E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IOException -> 0x010c }
            return r0
        L_0x00ef:
            if (r7 == 0) goto L_0x00ff
            android.content.Context r1 = r8.A04     // Catch:{ IOException -> 0x010c }
            r0 = 2131973097(0x7f1353e9, float:1.958322E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IOException -> 0x010c }
            java.lang.CharSequence r0 = r8.A03(r0, r3)     // Catch:{ IOException -> 0x010c }
            return r0
        L_0x00ff:
            android.content.Context r1 = r8.A04     // Catch:{ IOException -> 0x010c }
            r0 = 2131973097(0x7f1353e9, float:1.958322E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IOException -> 0x010c }
            return r0
        L_0x0109:
            switch(r0) {
                case 0: goto L_0x011c;
                case 1: goto L_0x011c;
                case 2: goto L_0x011c;
                case 3: goto L_0x011c;
                case 4: goto L_0x011c;
                case 5: goto L_0x011c;
                case 6: goto L_0x011c;
                case 7: goto L_0x010c;
                case 8: goto L_0x010c;
                case 9: goto L_0x010c;
                case 10: goto L_0x0126;
                case 11: goto L_0x010c;
                case 12: goto L_0x011c;
                case 13: goto L_0x011c;
                case 14: goto L_0x011c;
                case 15: goto L_0x011c;
                case 16: goto L_0x011c;
                case 17: goto L_0x011c;
                case 18: goto L_0x011c;
                case 19: goto L_0x011c;
                case 20: goto L_0x011c;
                case 21: goto L_0x011c;
                case 22: goto L_0x011c;
                case 23: goto L_0x011c;
                case 24: goto L_0x011c;
                case 25: goto L_0x011c;
                case 26: goto L_0x011c;
                case 27: goto L_0x011c;
                case 28: goto L_0x011c;
                case 29: goto L_0x011c;
                case 30: goto L_0x010c;
                case 31: goto L_0x011c;
                case 32: goto L_0x011c;
                case 33: goto L_0x011c;
                case 34: goto L_0x010e;
                default: goto L_0x010c;
            }     // Catch:{ IOException -> 0x010c }
        L_0x010c:
            r0 = 0
            return r0
        L_0x010e:
            android.content.Context r1 = r8.A04     // Catch:{ IOException -> 0x010c }
            r0 = 2131972208(0x7f135070, float:1.9581417E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IOException -> 0x010c }
            java.lang.CharSequence r0 = r8.A03(r0, r3)     // Catch:{ IOException -> 0x010c }
            return r0
        L_0x011c:
            android.content.Context r1 = r8.A04     // Catch:{ IOException -> 0x010c }
            r0 = 2131973095(0x7f1353e7, float:1.9583216E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IOException -> 0x010c }
            return r0
        L_0x0126:
            android.content.Context r1 = r8.A04     // Catch:{ IOException -> 0x010c }
            r0 = 2131973096(0x7f1353e8, float:1.9583218E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ IOException -> 0x010c }
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71084Ob7.A00(X.Ob7, java.lang.String):java.lang.CharSequence");
    }

    public final void A04(OGY ogy) {
        this.A01 = ogy;
        NKU nku = this.A08;
        NL4 nl4 = nku.A08;
        for (OGY ogy2 : nl4.A04) {
            boolean equals = ogy.equals(ogy2);
            if (ogy2.A04 != equals) {
                ogy2.A04 = equals;
            }
        }
        NL4.A00(nl4);
        IgdsButton igdsButton = nku.A06;
        if (igdsButton != null) {
            igdsButton.setEnabled(true);
        }
        C49960FGs.A02(nku.getActivity());
    }

    public C71084Ob7(Context context, UserSession userSession, User user, ONV onv, C49530ExC exC, C71038Oa2 oa2, NKU nku, C70988OVc oVc, C16666Uz2 uz2, C14068TpH tpH, C16677UzD uzD, C74488Pvi pvi, NHU nhu, String str, String str2, String str3, HashMap hashMap) {
        this.A04 = context;
        this.A08 = nku;
        this.A05 = userSession;
        this.A07 = onv;
        this.A0J = exC;
        this.A00 = oa2;
        this.A0H = str;
        this.A0F = str2;
        this.A06 = user;
        this.A0E = nhu;
        this.A0A = uz2;
        this.A0B = tpH;
        this.A0C = uzD;
        this.A0G = str3;
        this.A0D = pvi;
        this.A09 = oVc;
        this.A0I = hashMap;
        if (nhu != null) {
            this.A03 = nhu.A00().A0H;
            this.A02 = nhu.A01();
        }
    }

    public static void A01(Context context, AnonymousClass4D6 r10, C71084Ob7 ob7, C69402Nkg nkg, OGY ogy, Integer num, String str) {
        String str2;
        boolean A002 = AnonymousClass3HA.A00(context);
        NKU nku = ob7.A08;
        C49960FGs.A01(nku.getActivity());
        IgdsButton igdsButton = nku.A06;
        if (igdsButton != null) {
            igdsButton.setLoading(true);
        }
        C74488Pvi pvi = ob7.A0D;
        String str3 = null;
        if (ogy != null) {
            str2 = ogy.A02;
        } else {
            str2 = null;
        }
        pvi.DE2(str2);
        UserSession userSession = ob7.A05;
        String str4 = str;
        str.getClass();
        if (ogy != null) {
            str3 = ogy.A02;
        }
        1OC A012 = ORS.A01(userSession, nkg, num, str4, str3, (String) null, (String) null, ob7.A0I, A002);
        A012.A00 = new NMF(context, r10, ob7, ogy);
        r10.schedule(A012);
    }

    public static void A02(SpannableStringBuilder spannableStringBuilder, ArrayDeque arrayDeque) {
        17k.A0F(!arrayDeque.isEmpty());
        C55699Hlw hlw = (C55699Hlw) arrayDeque.removeFirst();
        spannableStringBuilder.setSpan(hlw.A02, hlw.A01, spannableStringBuilder.length(), hlw.A00);
    }

    public final CharSequence A03(String str, String str2) {
        if (str2.isEmpty()) {
            return str;
        }
        Context context = this.A04;
        context.getResources();
        SpannableStringBuilder A0E2 = C51965G9l.A0E();
        ArrayDeque arrayDeque = new ArrayDeque();
        A0E2.append(str);
        A0E2.append(" ");
        arrayDeque.addFirst(new C55699Hlw(A0E2.length(), 18, new StyleSpan(1)));
        arrayDeque.addFirst(new C55699Hlw(A0E2.length(), 18, C66580MXl.A0E(context.getColor(R.color.blue_8))));
        arrayDeque.addFirst(new C55699Hlw(A0E2.length(), 18, new C46685DjE(str2, this, 8)));
        A0E2.append(context.getString(2131962800));
        A02(A0E2, arrayDeque);
        A02(A0E2, arrayDeque);
        A02(A0E2, arrayDeque);
        return C66580MXl.A0D(A0E2);
    }
}
