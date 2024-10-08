package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactCommentModerationModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.R8r  reason: case insensitive filesystem */
public final class C8766R8r extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C8766R8r(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static String A00(AnonymousClass3FZ r4, Map map) {
        SQF.A03(map, "email", r4.A05("email"));
        SQF.A03(map, "family-name", r4.A05("family_name"));
        SQF.A03(map, "given-name", r4.A05("given_name"));
        return r4.A05("postal_code");
    }

    public static String A01(AnonymousClass3FZ r4, Map map) {
        SQF.A03(map, "address-level1", r4.A05("address_level1"));
        SQF.A03(map, "address-level2", r4.A05("address_level2"));
        SQF.A03(map, "address-level3", r4.A05("address_level3"));
        SQF.A03(map, "address-line1", r4.A05("address_line1"));
        return r4.A05("address_line2");
    }

    public final void onFail(C268654dm r5) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 2:
                i = AnonymousClass0fD.A03(1081394630);
                C8766R8r.super.onFail(r5);
                i2 = 2035589198;
                break;
            case 3:
                i = AnonymousClass0fD.A03(19881590);
                DbS.A1U(this.A01);
                i2 = -1991777785;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-691163538);
                C13757TgT tgT = (C13757TgT) this.A01;
                if (tgT != null) {
                    tgT.onFailure(r5.A01());
                }
                i2 = -1058728674;
                break;
            case 5:
                i = AnonymousClass0fD.A03(442951253);
                C13757TgT tgT2 = (C13757TgT) this.A01;
                if (tgT2 != null) {
                    tgT2.onFailure(r5.A01());
                }
                i2 = -1782810073;
                break;
            case 6:
                i = AnonymousClass0fD.A03(1939281988);
                C13757TgT tgT3 = (C13757TgT) this.A01;
                if (tgT3 != null) {
                    tgT3.onFailure(r5.A01());
                }
                i2 = -1886077442;
                break;
            case 8:
                i = AnonymousClass0fD.A03(-759467915);
                if (Pxe.A0T((ReactContextBaseJavaModule) this.A01).A00() != null) {
                    C13904TjR tjR = (C13904TjR) this.A02;
                    Object A002 = r5.A00();
                    if (A002 != null) {
                        str = ((AnonymousClass1XT) A002).getErrorMessage();
                    } else {
                        str = "";
                    }
                    Pxi.A1K(IgReactCommentModerationModule.ERROR_SERVER_ERR, tjR, str);
                }
                i2 = 1210771937;
                break;
            case 9:
                i = AnonymousClass0fD.A03(303677070);
                Throwable A012 = r5.A01();
                if (A012 == null) {
                    A012 = new Exception("ZBD HTTP request failed with an unknown error");
                }
                ((C13729Tg0) this.A02).DEm(404, A012);
                i2 = -528528070;
                break;
            default:
                C8766R8r.super.onFail(r5);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        int i3;
        int i4;
        switch (this.A00) {
            case 2:
                i = AnonymousClass0fD.A03(2129262875);
                int A03 = AnonymousClass0fD.A03(1585884892);
                F1D f1d = ((DvS) obj).A00;
                if (f1d == null) {
                    i3 = 1272399114;
                } else {
                    Sm0 sm0 = (Sm0) this.A01;
                    Sm0.A00(sm0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, f1d.A0F);
                    String str = f1d.A0F;
                    if (str != null) {
                        String[] split = str.split(" ");
                        Sm0.A00(sm0, "given-name", split[0]);
                        int length = split.length;
                        if (length > 1) {
                            Sm0.A00(sm0, "family-name", split[length - 1]);
                        }
                    }
                    Sm0.A00(sm0, "email", f1d.A0D);
                    Sm0.A00(sm0, "tel", f1d.A0M);
                    HashMap hashMap = sm0.A03;
                    SI1 si1 = C11238SGy.A02;
                    ((C13545TcH) this.A02).Cx2(si1.A02(hashMap), sm0.A01.A00(hashMap), si1.A01(hashMap), SI1.A00(hashMap));
                    sm0.A05 = true;
                    i3 = -2116366450;
                }
                AnonymousClass0fD.A0A(i3, A03);
                i2 = 2095916166;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1265159260);
                C8768R8t r8t = (C8768R8t) obj;
                int A0D = AnonymousClass7TG.A0D(r8t, -79557184);
                ((0sP) this.A02).invoke(r8t.A00);
                AnonymousClass0fD.A0A(-470394071, A0D);
                i2 = -1834170029;
                break;
            case 4:
                i = AnonymousClass0fD.A03(1059451560);
                int A032 = AnonymousClass0fD.A03(-2096709231);
                Object obj2 = ((AnonymousClass3JC) obj).A01;
                if (obj2 != null) {
                    C7604QNu qNu = (C7604QNu) obj2;
                    if (qNu.A07() != null) {
                        1Av A002 = 1Au.A00((UserSession) this.A02);
                        boolean A06 = qNu.A07().A06("is_payment_autofill_opt_in");
                        int optInt = qNu.A07().A00.optInt("payment_autofill_consecutive_neg_interaction");
                        A002.A1H(A06);
                        A002.A0T(optInt);
                        C13757TgT tgT = (C13757TgT) this.A01;
                        if (tgT != null) {
                            tgT.Dod(Integer.valueOf(optInt));
                        }
                    }
                }
                AnonymousClass0fD.A0A(1474918366, A032);
                i2 = -2001641954;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1209989495);
                int A033 = AnonymousClass0fD.A03(-1326345471);
                Object obj3 = ((AnonymousClass3JC) obj).A01;
                if (obj3 != null) {
                    C7604QNu qNu2 = (C7604QNu) obj3;
                    if (qNu2.A07() != null) {
                        int optInt2 = qNu2.A07().A00.optInt("consecutive_neg_interaction");
                        ((1Av) this.A02).A0U(optInt2);
                        C13757TgT tgT2 = (C13757TgT) this.A01;
                        if (tgT2 != null) {
                            tgT2.Dod(Integer.valueOf(optInt2));
                        }
                    }
                }
                AnonymousClass0fD.A0A(86403517, A033);
                i2 = 552426477;
                break;
            case 6:
                i = AnonymousClass0fD.A03(-1887706230);
                int A034 = AnonymousClass0fD.A03(1717803004);
                Object obj4 = ((AnonymousClass3JC) obj).A01;
                if (obj4 != null) {
                    AnonymousClass3FZ r3 = (AnonymousClass3FZ) obj4;
                    Class<QNh> cls = QNh.class;
                    if (r3.A00(cls, "ig_iab_autofill_update_settings") != null) {
                        int optInt3 = r3.A00(cls, "ig_iab_autofill_update_settings").A00.optInt("count");
                        1Av r4 = (1Av) this.A02;
                        AnonymousClass7TF.A1J(r4, r4.A0N, 1Av.A8a, 164, true);
                        r4.A0U(optInt3);
                        C13757TgT tgT3 = (C13757TgT) this.A01;
                        if (tgT3 != null) {
                            tgT3.Dod(Integer.valueOf(optInt3));
                        }
                    }
                }
                AnonymousClass0fD.A0A(-1756451708, A034);
                i2 = -2012838601;
                break;
            case 7:
                i = AnonymousClass0fD.A03(650254623);
                C8747R7l r7l = (C8747R7l) obj;
                int A035 = AnonymousClass0fD.A03(2030957176);
                C8766R8r.super.onSuccess(r7l);
                ((AtomicReference) this.A02).set(r7l.A00);
                AnonymousClass0fD.A0A(-1161646970, A035);
                i2 = -1324405485;
                break;
            case 8:
                i = AnonymousClass0fD.A03(-1885596324);
                int A036 = AnonymousClass0fD.A03(-359886680);
                if (Pxe.A0T((ReactContextBaseJavaModule) this.A01).A00() != null) {
                    ((C13904TjR) this.A02).resolve((Object) null);
                }
                AnonymousClass0fD.A0A(416676327, A036);
                i2 = 1870230684;
                break;
            case 9:
                i = AnonymousClass0fD.A03(-868001729);
                Q4E q4e = (Q4E) obj;
                int A037 = AnonymousClass0fD.A03(-26762464);
                if (((S1W) this.A01).A00.getBoolean("zero_balance_simulation", false)) {
                    ((C13729Tg0) this.A02).DEm(-1, new Throwable("Deliberately failing the ZBD ping for internal settings zero balance simulation"));
                    i4 = 862203652;
                } else {
                    ((C13729Tg0) this.A02).onSuccess(q4e.A00.A02);
                    i4 = -443708036;
                }
                AnonymousClass0fD.A0A(i4, A037);
                i2 = -302629120;
                break;
            default:
                C8766R8r.super.onSuccess(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        int i3;
        Class cls;
        AnonymousClass3FZ A002;
        AnonymousClass3FZ r5;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        AnonymousClass3FZ A003;
        ArrayList A1C;
        int i4;
        ImmutableList A022;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1398449557);
                AnonymousClass3JC r13 = (AnonymousClass3JC) obj;
                int A0D = AnonymousClass7TG.A0D(r13, 1357506000);
                Object obj2 = r13.A01;
                if (obj2 == null) {
                    0wb.A03("AutofillGraphQLRequest", "Error creating query autofill response");
                    i4 = -227258989;
                } else {
                    AnonymousClass3FZ r3 = (AnonymousClass3FZ) obj2;
                    if (r3 == null || (A022 = r3.A02("ig_iab_autofill_data_multi_entries", QNX.class)) == null) {
                        A1C = AnonymousClass7TE.A1C();
                    } else {
                        A1C = AnonymousClass7TE.A1D(A022);
                    }
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Iterator it = A1C.iterator();
                    while (it.hasNext()) {
                        AnonymousClass3FZ r6 = (AnonymousClass3FZ) it.next();
                        HashMap A1E = AnonymousClass7TE.A1E();
                        SQF.A03(A1E, PublicKeyCredentialControllerUtility.JSON_KEY_ID, r6.A05("ent_id"));
                        SQF.A03(A1E, "given-name", r6.A05("given_name"));
                        SQF.A03(A1E, "family-name", r6.A05("family_name"));
                        SQF.A03(A1E, "address-line1", r6.A05("address_line1"));
                        SQF.A03(A1E, "address-line2", r6.A05("address_line2"));
                        SQF.A03(A1E, "address-level1", r6.A05("address_level1"));
                        SQF.A03(A1E, "address-level2", r6.A05("address_level2"));
                        SQF.A03(A1E, "postal-code", r6.A05("postal_code"));
                        SQF.A03(A1E, "country", r6.A05("country"));
                        SQF.A03(A1E, "email", r6.A05("email"));
                        SQF.A03(A1E, "tel", r6.A05("tel"));
                        A1C2.add(new AutofillData((Map) A1E));
                    }
                    SharedPreferences.Editor edit = 23d.A00().edit();
                    Map<String, ?> all = 23d.A00().getAll();
                    0qQ.A07(all);
                    if (!all.isEmpty()) {
                        edit.clear();
                    }
                    Iterator it2 = A1C2.iterator();
                    while (it2.hasNext()) {
                        AutofillData autofillData = (AutofillData) it2.next();
                        String A11 = DbT.A11(PublicKeyCredentialControllerUtility.JSON_KEY_ID, autofillData.A00);
                        if (A11 != null) {
                            Pxf.A13(edit, A11, autofillData.A01().toString());
                        }
                    }
                    i4 = 283157984;
                }
                AnonymousClass0fD.A0A(i4, A0D);
                i2 = -1926383504;
                break;
            case 1:
                i = AnonymousClass0fD.A03(-301195662);
                AnonymousClass3JC r132 = (AnonymousClass3JC) obj;
                int A0D2 = AnonymousClass7TG.A0D(r132, -1314315118);
                AnonymousClass3FZ r10 = (AnonymousClass3FZ) r132.A01;
                String str10 = null;
                if (!(r10 == null || (A002 = r10.A00(cls, "iab_autofill_data")) == null)) {
                    Class<QNO> cls2 = QNO.class;
                    if (A002.A00(cls2, "data") != null) {
                        SharedPreferences sharedPreferences = 23d.A02;
                        if (sharedPreferences != null) {
                            Pxg.A1C(sharedPreferences);
                            AnonymousClass3FZ A004 = r10.A00((cls = QNT.class), "iab_autofill_data");
                            if (A004 != null) {
                                r5 = A004.A00(cls2, "data");
                            } else {
                                r5 = null;
                            }
                            HashMap A1E2 = AnonymousClass7TE.A1E();
                            if (r5 != null) {
                                str = r5.A05("given_name");
                            } else {
                                str = null;
                            }
                            SQF.A03(A1E2, "given-name", str);
                            if (r5 != null) {
                                str2 = r5.A05("family_name");
                            } else {
                                str2 = null;
                            }
                            SQF.A03(A1E2, "family-name", str2);
                            if (r5 != null) {
                                str3 = r5.A05("address_line1");
                            } else {
                                str3 = null;
                            }
                            SQF.A03(A1E2, "address-line1", str3);
                            if (r5 != null) {
                                str4 = r5.A05("address_line2");
                            } else {
                                str4 = null;
                            }
                            SQF.A03(A1E2, "address-line2", str4);
                            if (r5 != null) {
                                str5 = r5.A05("address_level1");
                            } else {
                                str5 = null;
                            }
                            SQF.A03(A1E2, "address-level1", str5);
                            if (r5 != null) {
                                str6 = r5.A05("address_level2");
                            } else {
                                str6 = null;
                            }
                            SQF.A03(A1E2, "address-level2", str6);
                            if (r5 != null) {
                                str7 = r5.A05("postal_code");
                            } else {
                                str7 = null;
                            }
                            SQF.A03(A1E2, "postal-code", str7);
                            if (r5 != null) {
                                str8 = r5.A05("country");
                            } else {
                                str8 = null;
                            }
                            SQF.A03(A1E2, "country", str8);
                            if (r5 != null) {
                                str9 = r5.A05("email");
                            } else {
                                str9 = null;
                            }
                            SQF.A03(A1E2, "email", str9);
                            if (r5 != null) {
                                str10 = r5.A05("tel");
                            }
                            SQF.A03(A1E2, "tel", str10);
                            AutofillData autofillData2 = new AutofillData((Map) A1E2);
                            Iterator A0t = AnonymousClass7TF.A0t(A1E2);
                            while (true) {
                                if (A0t.hasNext()) {
                                    String A18 = AnonymousClass7TE.A18(A0t);
                                    if (A18 != null && A18.length() != 0) {
                                        23d.A01(autofillData2);
                                    }
                                } else {
                                    Pxg.A1C(23d.A00());
                                }
                            }
                            AnonymousClass3FZ A005 = r10.A00(cls, "iab_autofill_data");
                            if (!(A005 == null || (A003 = A005.A00(QNS.class, "iab_autofill_wallet_data")) == null)) {
                                AnonymousClass3FZ A006 = A003.A00(QNP.class, "crossapp_autofill");
                                HashMap A1E3 = AnonymousClass7TE.A1E();
                                if (A006 != null) {
                                    SQF.A03(A1E3, "address-line2", A01(A006, A1E3));
                                    SQF.A03(A1E3, "postal-code", A00(A006, A1E3));
                                    SQF.A03(A1E3, "tel", A006.A05("tel"));
                                }
                                AnonymousClass3FZ A007 = A003.A00(QNQ.class, "default_wallet");
                                HashMap A1E4 = AnonymousClass7TE.A1E();
                                if (A007 != null) {
                                    SQF.A03(A1E4, "address-line2", A01(A007, A1E4));
                                    SQF.A03(A1E4, "postal-code", A00(A007, A1E4));
                                    SQF.A03(A1E4, "tel", A007.A05("tel"));
                                }
                                AnonymousClass3FZ A008 = A003.A00(QNR.class, "recent_wallet");
                                HashMap A1E5 = AnonymousClass7TE.A1E();
                                if (A008 != null) {
                                    SQF.A03(A1E5, "address-line2", A01(A008, A1E5));
                                    SQF.A03(A1E5, "postal-code", A00(A008, A1E5));
                                    SQF.A03(A1E5, "tel", A008.A05("tel"));
                                }
                                SharedPreferences sharedPreferences2 = 23d.A02;
                                if (sharedPreferences2 != null) {
                                    SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                                    if (!A1E3.isEmpty()) {
                                        Pxf.A13(edit2, "cross_app", new AutofillData((Map) A1E3).A01().toString());
                                    }
                                    if (!A1E4.isEmpty()) {
                                        Pxf.A13(edit2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, new AutofillData((Map) A1E4).A01().toString());
                                    }
                                    if (!A1E5.isEmpty()) {
                                        Pxf.A13(edit2, "recent", new AutofillData((Map) A1E5).A01().toString());
                                    }
                                }
                            }
                            i3 = -413142143;
                            AnonymousClass0fD.A0A(i3, A0D2);
                            i2 = 943173104;
                            break;
                        }
                        0qQ.A0F("walletContactDataStore");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                0wb.A03("AutofillGraphQLRequest", "Error creating query autofill response");
                i3 = -1271308291;
                AnonymousClass0fD.A0A(i3, A0D2);
                i2 = 943173104;
                break;
            default:
                C8766R8r.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
