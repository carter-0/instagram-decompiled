package X;

import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class SUU {
    public static final XST A01(C21267XRm xRm) {
        0qQ.A0B(xRm, 0);
        return XST.valueOf(DbY.A0k(xRm.name()));
    }

    public final void A0G(LoggingContext loggingContext, SEB seb, String str, String str2, List list, boolean z) {
        LinkedHashMap A0x;
        1Ln A0U;
        0sP r2;
        LoggingContext loggingContext2 = loggingContext;
        0qQ.A0B(loggingContext2, 0);
        int i = 3;
        String str3 = str;
        int hashCode = str3.hashCode();
        List list2 = list;
        boolean z2 = z;
        if (hashCode != -1785516855) {
            if (hashCode != 1996002556) {
                if (hashCode == 2012838315 && str3.equals("DELETE")) {
                    C12411Sto A0g = C51965G9l.A0g();
                    A0x = Pxj.A0x(seb);
                    A0U = C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_remove_fbpayaccountmutation_init"), 110);
                    i = 5;
                }
            } else if (str3.equals("CREATE")) {
                C12411Sto A0g2 = C51965G9l.A0g();
                String str4 = str2;
                if (str2 != null) {
                    LinkedHashMap A0x2 = Pxj.A0x(seb);
                    A0U = C51965G9l.A0U(C51969G9p.A0d(A0g2.A00, "client_add_fbpayaccountmutation_init"), 22);
                    r2 = new C7211Pzd((Object) loggingContext2, (Object) list2, (Object) A0x2, str4, 7, z2);
                    C12411Sto.A03(A0U, loggingContext2, r2);
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TF.A0W(AnonymousClass000.A00(970), str3);
        }
        if (str3.equals("UPDATE")) {
            C12411Sto A0g3 = C51965G9l.A0g();
            A0x = Pxj.A0x(seb);
            A0U = C51965G9l.A0U(C51969G9p.A0d(A0g3.A00, "client_edit_fbpayaccountmutation_init"), 31);
        }
        throw AnonymousClass7TF.A0W(AnonymousClass000.A00(970), str3);
        r2 = new C58766IxD(i, loggingContext2, list2, A0x, z2);
        C12411Sto.A03(A0U, loggingContext2, r2);
    }

    public static final long A00(Map map) {
        Object obj = map.get("component_data_id");
        if (obj != null) {
            return AnonymousClass7TE.A0R(obj);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final String A05(Map map) {
        Object obj = map.get("TARGET_NAME");
        if (obj != null) {
            return (String) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final String A06(Map map) {
        Object obj = map.get("VIEW_NAME");
        if (obj != null) {
            return (String) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static LinkedHashMap A07(SEB seb) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        A0A(seb, linkedHashMap);
        return linkedHashMap;
    }

    public static final Map A09(Map map) {
        Object obj = map.get("extra_data");
        if (obj != null) {
            return (Map) obj;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final void A0A(SEB seb, Map map) {
        if (seb.A01) {
            map.put("is_one_time_checkout", "true");
            String str = seb.A00;
            if (str != null) {
                if (str.equals("NEW_PAYPAL_CHECKOUT")) {
                    str = "paypal_otc";
                } else if (str.equals("PAYPAL_CHECKOUT")) {
                    str = "paypal_ba";
                }
                map.put("one_time_checkout_type", str);
            }
        }
    }

    public static final void A0C(Object obj, String str, Map map) {
        Map map2;
        Object obj2 = map.get("extra_data");
        if (!(obj2 instanceof Map) || (((obj2 instanceof C62650uo) && !(obj2 instanceof AnonymousClass0s2)) || (map2 = (Map) obj2) == null)) {
            map2 = AnonymousClass7TE.A1H();
        }
        map2.put(str, obj);
        map.put("extra_data", map2);
    }

    public static final boolean A0D(Map map) {
        return AnonymousClass7TF.A1V(map.get("component_data_id"));
    }

    public static final boolean A0E(Map map) {
        return AnonymousClass7TF.A1V(map.get("extra_data"));
    }

    public final void A0F(HNF hnf, LoggingContext loggingContext, SEB seb, SUj sUj, String str, String str2, List list, boolean z) {
        LoggingContext loggingContext2 = loggingContext;
        String str3 = str;
        SUj sUj2 = sUj;
        boolean A1b = C51973G9u.A1b(loggingContext2, sUj2, str3);
        if (!SUj.A0U(sUj2)) {
            SEB seb2 = seb;
            String str4 = str2;
            List list2 = list;
            boolean z2 = z;
            A0B(sUj2, new TTW(loggingContext2, seb2, str3, str4, list2, z2), new C58812Ixx(hnf, loggingContext2, list2, seb2, str3, str4, A1b ? 1 : 0, z2));
        }
    }

    public static final String A02(RH6 rh6) {
        int ordinal = rh6.ordinal();
        if (ordinal == 14) {
            return "continue_to_contact";
        }
        if (ordinal == 13) {
            return "continue_to_shippingaddress";
        }
        if (ordinal == 12) {
            return "continue_to_credential";
        }
        throw C51973G9u.A0g(rh6, "Invalid component type: ", AnonymousClass7TE.A1A());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r1.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r1.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        return "phone";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        if (r1.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006d, code lost:
        return "email";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A03(java.lang.String r1) {
        /*
            int r0 = X.JTR.A0F(r1)
            switch(r0) {
                case -2090528606: goto L_0x0064;
                case -2025722585: goto L_0x0061;
                case -2015699207: goto L_0x0055;
                case -1914196587: goto L_0x0052;
                case -1866204256: goto L_0x0046;
                case -1782362100: goto L_0x0043;
                case -1687991221: goto L_0x0040;
                case -1236011159: goto L_0x003d;
                case -761852157: goto L_0x003a;
                case -671563076: goto L_0x0037;
                case -523881439: goto L_0x0033;
                case -513858061: goto L_0x002f;
                case 330394238: goto L_0x002c;
                case 340417616: goto L_0x0029;
                case 467992134: goto L_0x0025;
                case 567396712: goto L_0x0022;
                case 1166557272: goto L_0x001e;
                case 1265961850: goto L_0x001b;
                case 1322332207: goto L_0x0018;
                case 1360260766: goto L_0x0015;
                case 2023755892: goto L_0x0011;
                case 2066463891: goto L_0x000e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Invalid view name"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x000e:
            java.lang.String r0 = "add_name_save"
            goto L_0x0048
        L_0x0011:
            java.lang.String r0 = "remove_phone_confirm"
            goto L_0x0057
        L_0x0015:
            java.lang.String r0 = "add_email_save"
            goto L_0x0067
        L_0x0018:
            java.lang.String r0 = "add_name_inline"
            goto L_0x0048
        L_0x001b:
            java.lang.String r0 = "add_email_inline"
            goto L_0x0067
        L_0x001e:
            java.lang.String r0 = "remove_email_cancel"
            goto L_0x0067
        L_0x0022:
            java.lang.String r0 = "add_phone_inline"
            goto L_0x0057
        L_0x0025:
            java.lang.String r0 = "remove_phone_cancel"
            goto L_0x0057
        L_0x0029:
            java.lang.String r0 = "add_phone"
            goto L_0x0057
        L_0x002c:
            java.lang.String r0 = "add_email"
            goto L_0x0067
        L_0x002f:
            java.lang.String r0 = "remove_phone"
            goto L_0x0057
        L_0x0033:
            java.lang.String r0 = "remove_email"
            goto L_0x0067
        L_0x0037:
            java.lang.String r0 = "edit_name_save"
            goto L_0x0048
        L_0x003a:
            java.lang.String r0 = "edit_phone_save"
            goto L_0x0057
        L_0x003d:
            java.lang.String r0 = "add_name"
            goto L_0x0048
        L_0x0040:
            java.lang.String r0 = "add_contact_info"
            goto L_0x0067
        L_0x0043:
            java.lang.String r0 = "add_phone_save"
            goto L_0x0057
        L_0x0046:
            java.lang.String r0 = "edit_name"
        L_0x0048:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "name"
            return r0
        L_0x0052:
            java.lang.String r0 = "edit_email_save"
            goto L_0x0067
        L_0x0055:
            java.lang.String r0 = "edit_phone"
        L_0x0057:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "phone"
            return r0
        L_0x0061:
            java.lang.String r0 = "edit_email"
            goto L_0x0067
        L_0x0064:
            java.lang.String r0 = "remove_email_confirm"
        L_0x0067:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "email"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUU.A03(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r1.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        return "phone";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r1.equals(r0) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0043, code lost:
        return "email";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A04(java.lang.String r1) {
        /*
            int r0 = X.JTR.A0F(r1)
            switch(r0) {
                case -2025722585: goto L_0x003b;
                case -2024140158: goto L_0x0038;
                case -2015699207: goto L_0x002c;
                case -1866204256: goto L_0x0020;
                case -1236011159: goto L_0x001d;
                case 330394238: goto L_0x001a;
                case 340417616: goto L_0x0017;
                case 567396712: goto L_0x0014;
                case 1265961850: goto L_0x0011;
                case 1322332207: goto L_0x000e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.String r0 = "Invalid view name"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x000e:
            java.lang.String r0 = "add_name_inline"
            goto L_0x0022
        L_0x0011:
            java.lang.String r0 = "add_email_inline"
            goto L_0x003d
        L_0x0014:
            java.lang.String r0 = "add_phone_inline"
            goto L_0x002e
        L_0x0017:
            java.lang.String r0 = "add_phone"
            goto L_0x002e
        L_0x001a:
            java.lang.String r0 = "add_email"
            goto L_0x003d
        L_0x001d:
            java.lang.String r0 = "add_name"
            goto L_0x0022
        L_0x0020:
            java.lang.String r0 = "edit_name"
        L_0x0022:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "name"
            return r0
        L_0x002c:
            java.lang.String r0 = "edit_phone"
        L_0x002e:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "phone"
            return r0
        L_0x0038:
            java.lang.String r0 = "add_contact"
            goto L_0x003d
        L_0x003b:
            java.lang.String r0 = "edit_email"
        L_0x003d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0007
            java.lang.String r0 = "email"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SUU.A04(java.lang.String):java.lang.String");
    }

    public static LinkedHashMap A08(QDH qdh) {
        SEB A03 = qdh.A03();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        A0A(A03, linkedHashMap);
        return linkedHashMap;
    }

    public static final void A0B(SUj sUj, C62320sa r2, 0sP r3) {
        String str;
        if (SUj.A0V(sUj) || (SUj.A0T(sUj) && sUj.A01 != null)) {
            r2.invoke();
        } else if (SUj.A0S(sUj)) {
            Throwable th = sUj.A02;
            if (th != null) {
                str = C11302SKm.A01(th);
            } else {
                str = "";
            }
            r3.invoke(str);
        }
    }
}
