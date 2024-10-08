package X;

import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class QDO extends 2YL implements C13907Tl7 {
    public Boolean A00;
    public List A01;
    public 2Fk A02;
    public LoggingData A03;
    public String A04;
    public List A05;
    public final 2Fk A06;
    public final AnonymousClass2gB A07;
    public final AnonymousClass2Fj A08 = JTO.A0K();
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(C13312TUl.A00);

    public final void A03(Bundle bundle) {
        String string;
        List list;
        LoggingData loggingData = null;
        if (bundle != null) {
            loggingData = (LoggingData) bundle.getParcelable("logging_data");
        }
        if (loggingData != null) {
            this.A03 = loggingData;
            if (bundle == null || (string = bundle.getString("parent_view_name")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            this.A04 = string;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("payout_subtypes_to_filter");
            if (stringArrayList != null) {
                list = 00k.A0a(stringArrayList);
            } else {
                list = 0sn.A00;
            }
            this.A05 = list;
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final void onResume(AnonymousClass07Z r3) {
        String str;
        0qQ.A0B(r3, 0);
        if (this.A01 != null) {
            2Fk r0 = this.A02;
            if (r0 != null) {
                str = (String) r0.A02();
            } else {
                str = null;
            }
            A01(this, str, true);
        }
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public final void A02() {
        if (DbX.A1a(this.A00)) {
            this.A00 = null;
            AnonymousClass2E0.A02();
            SQ2.A02(667758647, 0, 2);
        } else if (AnonymousClass7TF.A1Y(this.A00, false)) {
            this.A00 = null;
            AnonymousClass2E0.A02();
            SQ2.A02(667758647, 0, 3);
        }
    }

    public final void A04(2Fk r4) {
        2Fk r1 = this.A02;
        if (r1 != null) {
            this.A07.A0D(r1);
        }
        this.A02 = r4;
        Pxi.A1A(r4, this.A07, TY1.A00(this, 38), 16);
    }

    public QDO() {
        AnonymousClass2gB A0M = Pxh.A0M();
        this.A07 = A0M;
        this.A06 = AnonymousClass72Y.A01(A0M, TXE.A00);
    }

    public static final void A01(QDO qdo, String str, boolean z) {
        QDO qdo2 = qdo;
        String str2 = str;
        if (str == null) {
            List list = qdo2.A05;
            if (list != null) {
                if (list.isEmpty()) {
                    return;
                }
            }
            0qQ.A0F("subtypesToFilter");
            throw AnonymousClass00P.createAndThrow();
        }
        qdo2.A00 = null;
        A00(qdo2, "client_fetch_payouthub_init", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, "BSC_CLIENT_FETCH_NOTIFICATIONS", (String) null, (List) null, (List) null);
        String str3 = qdo2.A04;
        String str4 = "parentViewName";
        if (str3 != null) {
            AnonymousClass2E0.A02();
            String str5 = null;
            SQ2.A03(str2, (String) null, (String) null, (String) null, (String) null, str3, (String) null, (String) null, (String) null, 667758647, 0);
            AnonymousClass2E0.A02();
            SQ2.A00(667758647, 0, "fetch_init", 0Yt.A0E());
            AnonymousClass2gB r3 = qdo2.A07;
            C12414Str str6 = (C12414Str) qdo2.A09.getValue();
            LoggingData loggingData = qdo2.A03;
            if (loggingData == null) {
                str4 = "loggingData";
            } else {
                String str7 = loggingData.A00;
                String str8 = qdo2.A04;
                if (str8 != null) {
                    String A0j = AnonymousClass7TF.A0j(str8);
                    switch (A0j.hashCode()) {
                        case -1749375484:
                            if (A0j.equals("ig_product_settings_subpage")) {
                                str5 = "IG_PRODUCT_SETTINGS_SUBPAGE";
                                break;
                            }
                            break;
                        case -349205283:
                            if (A0j.equals("payouthub_payouts")) {
                                str5 = "PAYOUTS";
                                break;
                            }
                            break;
                        case -133197479:
                            if (A0j.equals("payouthub_earnings")) {
                                str5 = "EARNINGS";
                                break;
                            }
                            break;
                        case 530115961:
                            if (A0j.equals("overview")) {
                                str5 = "OVERVIEW";
                                break;
                            }
                            break;
                        case 550105257:
                            if (A0j.equals("payout_details")) {
                                str5 = "PAYOUT_DETAILS";
                                break;
                            }
                            break;
                        case 664105997:
                            if (A0j.equals("earning_details")) {
                                str5 = "EARNING_DETAILS";
                                break;
                            }
                            break;
                        case 1434631203:
                            if (A0j.equals("settings")) {
                                str5 = "SETTINGS";
                                break;
                            }
                            break;
                        case 1954122069:
                            if (A0j.equals("transactions")) {
                                str5 = "TRANSACTIONS";
                                break;
                            }
                            break;
                    }
                    List list2 = qdo2.A05;
                    if (list2 != null) {
                        SQB.A02(C8282QnO.A00(new C11549ScA(str6, str2, str7, str5, list2), AnonymousClass2E0.A06()), r3, new C11631SdZ(0, qdo2, z));
                        return;
                    }
                    0qQ.A0F("subtypesToFilter");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        }
        0qQ.A0F(str4);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(QDO qdo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2) {
        Object A022;
        String str12;
        2FO A002 = C11426STk.A00();
        LoggingData loggingData = qdo.A03;
        if (loggingData == null) {
            str12 = "loggingData";
        } else {
            HashMap A003 = C9634ReE.A00(loggingData);
            String str13 = qdo.A04;
            if (str13 == null) {
                str12 = "parentViewName";
            } else {
                Pxj.A1L("view_name", str13, str2, A003);
                2Fk r0 = qdo.A02;
                if (!(r0 == null || (A022 = r0.A02()) == null)) {
                    A003.put("financial_entity_id", A022);
                }
                if (str3 != null) {
                    A003.put("notification_identifier", str3);
                }
                if (str4 != null) {
                    A003.put("notification_source", str4);
                }
                if (str5 != null) {
                    A003.put("cta_text", str5);
                }
                if (str6 != null) {
                    A003.put("cta_uri", str6);
                }
                List list3 = list2;
                if (list2 != null) {
                    A003.put("holds_list", list3);
                }
                List list4 = list;
                if (list != null) {
                    A003.put("notification_id_list", list4);
                }
                if (str7 != null) {
                    A003.put("error_message", str7);
                }
                if (str8 != null) {
                    A003.put("error_stacktrace", str8);
                }
                if (str9 != null) {
                    A003.put("exception_class", str9);
                }
                if (str10 != null) {
                    A003.put("endpoint", str10);
                }
                if (str11 != null) {
                    A003.put("cta_title", str11);
                }
                A002.Cgl(str, A003);
                return;
            }
        }
        0qQ.A0F(str12);
        throw AnonymousClass00P.createAndThrow();
    }
}
