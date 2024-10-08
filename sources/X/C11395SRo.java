package X;

import android.content.Context;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.cert.CertificateException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.SRo  reason: case insensitive filesystem */
public abstract class C11395SRo {
    public static void A03(Context context, C13736Tg8 tg8, String str, String str2, String str3, List list, List list2, Map map) {
        Map map2 = map;
        String A11 = DbT.A11("need_register_trusted_device_key", map2);
        Context context2 = context;
        C13736Tg8 tg82 = tg8;
        String str4 = str2;
        String str5 = str3;
        List list3 = list;
        List list4 = list2;
        if (A11 == null || A11.equalsIgnoreCase("false")) {
            A02(context2, tg82, false, str, "VERIFY_FACTOR", str4, (String) null, (String) null, str5, list3, list4, map2);
            return;
        }
        A04(context2, new C12473Sv5(context2, tg82, str2, str3, list, list2, map), str4, str5, AnonymousClass7TE.A1E());
    }

    public static C11330SNj A00(String str, List list) {
        try {
            return SOC.A00().A06(str, list);
        } catch (NoSuchAlgorithmException e) {
            throw new Exception(e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new Exception(e2);
        } catch (IOException e3) {
            throw new Exception(e3);
        } catch (NoSuchProviderException e4) {
            throw new Exception(e4);
        } catch (IllegalAccessException e5) {
            throw new Exception(e5);
        } catch (InstantiationException e6) {
            throw new Exception(e6);
        } catch (CertificateException e7) {
            throw new Exception(e7);
        } catch (KeyStoreException e8) {
            throw new Exception(e8);
        } catch (NoSuchMethodException e9) {
            throw new Exception(e9);
        } catch (InvocationTargetException e10) {
            throw new Exception(e10);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.RsP, java.lang.Object] */
    public static C11214SFo A01(String str, String str2, String str3, String str4, String str5, String str6, String str7, HashSet hashSet, List list, Map map) {
        HashMap A1E = AnonymousClass7TE.A1E();
        String str8 = str3;
        A1E.put("PAYMENT_TYPE", str3);
        A1E.put("AUTH_METHOD_TYPE", str2);
        boolean startsWith = str4.startsWith("upl");
        String A00 = Py7.A00();
        if (!startsWith) {
            A1E.put(A00, 002.A0R("upl_", str4));
        } else {
            A1E.put(A00, str4);
        }
        SSZ A002 = SOC.A00();
        HashSet A12 = C66580MXl.A12(list);
        ? obj = new Object();
        obj.A00 = map;
        obj.A01 = A12;
        HashSet hashSet2 = hashSet;
        return new C11214SFo(C11095S9w.A00(new C12496SvS(A002, 1), hashSet2), obj, str, str5, str6, str7, (String) null, str8, A1E, hashSet2);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public static void A02(Context context, C13736Tg8 tg8, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, Map map) {
        String str7;
        C11214SFo A01;
        Map map2 = map;
        C11330SNj sNj = null;
        if (map2.get("target_account_id") != null) {
            str7 = Pxf.A0j("target_account_id", map2);
        } else {
            str7 = null;
        }
        C13736Tg8 tg82 = tg8;
        String str8 = str;
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        List list3 = list2;
        if (bool == null || !bool.booleanValue()) {
            Context context2 = context;
            if (str9.equals("EDIT_CARD")) {
                A01 = A01(str9, str8, str10, str13, str7, str11, str12, AnonymousClass7TE.A1F(), list3, map2);
            } else {
                List list4 = list;
                sNj = A00(str8, list4);
                map2.put("public_key", sNj.A07);
                map2.put(Py7.A01(0, 9, 79), C11234SGu.A00(context2));
                map2.put("caps", list4);
                map2.put("app_id", context2.getPackageName());
                map2.put("auth_ticket_type", sNj.A03);
                HashSet A1F = AnonymousClass7TE.A1F();
                A1F.add(sNj);
                try {
                    C11330SNj A04 = SOC.A00().A04();
                    if (A04 != null) {
                        map2.put("assoc_public_key", A04.A07);
                        A1F.add(A04);
                    }
                } catch (KeyStoreException | NoSuchAlgorithmException unused) {
                }
                A01 = A01(str9, str8, str10, str13, str7, str11, str12, A1F, list3, map2);
                if (!str9.equals("ADD_CARD")) {
                    SUj.A0H(SQA.A01(A01), C11652Sdu.A00(new C12472Sv4(context2, tg82, A01, str10, str13, 1), 38));
                    return;
                }
            }
            C7422QCn A03 = SSC.A03(C9618Rdw.A00(context2, new S5Z(sNj, A01), new TPI(0), new TPI(1), new TPI(2)));
            ? obj = new Object();
            SUj.A0H(A03, C11652Sdu.A00(obj, 39));
            T0J t0j = new T0J(tg82, 8);
            AnonymousClass5A3 A06 = AnonymousClass2E0.A06();
            0qQ.A07(A06);
            C255183ti.A04(t0j, obj, A06.A00.A03);
            return;
        }
        HashSet A1F2 = AnonymousClass7TE.A1F();
        List list5 = SOC.A00().A04;
        boolean equalsIgnoreCase = str9.equalsIgnoreCase("GENERATE_AND_SEND_MFT_OTP");
        int size = list5.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C11330SNj sNj2 = (C11330SNj) list5.get(size);
            if (("PIN".equals(sNj2.A03) || equalsIgnoreCase) && sNj2.A01 > System.currentTimeMillis() && sNj2.A04.equalsIgnoreCase("VALID")) {
                A1F2.add(sNj2);
                break;
            }
        }
        C10258RpI rpI = C9125RPx.A00;
        if (rpI == null) {
            rpI = new C10258RpI();
            C9125RPx.A00 = rpI;
        }
        ConcurrentHashMap concurrentHashMap = rpI.A00;
        List A1B = Pxe.A1B(str13, concurrentHashMap);
        if (A1B == null) {
            A1B = new CopyOnWriteArrayList();
            concurrentHashMap.put(str13, new CopyOnWriteArrayList());
        }
        if (!A1B.isEmpty()) {
            A1F2.addAll(A1B);
        }
        try {
            C11330SNj A042 = SOC.A00().A04();
            if (A042 != null) {
                map2.put("assoc_public_key", A042.A07);
                A1F2.add(A042);
            }
        } catch (KeyStoreException | NoSuchAlgorithmException unused2) {
        }
        SUj.A0H(SQA.A01(A01(str9, str8, str10, str13, (String) null, str11, str12, A1F2, list3, map2)), C11652Sdu.A00(new C12470Sv2(tg82, rpI, str13), 38));
    }

    public static void A04(Context context, C13736Tg8 tg8, String str, String str2, Map map) {
        String str3;
        Map map2 = map;
        if (map2.get("target_account_id") != null) {
            str3 = Pxf.A0j("target_account_id", map2);
        } else {
            str3 = null;
        }
        C11330SNj A00 = A00("MFT_TRUSTED_DEVICE", AnonymousClass7TE.A1C());
        map2.put("public_key", A00.A07);
        Context context2 = context;
        map2.put(Py7.A01(0, 9, 79), C11234SGu.A00(context2));
        map2.put("app_id", context2.getPackageName());
        map2.put("auth_ticket_type", A00.A03);
        HashSet A1F = AnonymousClass7TE.A1F();
        A1F.add(A00);
        String str4 = str;
        String str5 = str2;
        C11214SFo A01 = A01("CREATE_AUTH_TICKET_BASED_FACTOR", "MFT_TRUSTED_DEVICE", str4, str5, str3, (String) null, (String) null, A1F, AnonymousClass7TE.A1C(), map2);
        SUj.A0H(SQA.A01(A01), C11652Sdu.A00(new C12472Sv4(context2, tg8, A01, str4, str5, 0), 38));
    }
}
