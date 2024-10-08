package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.QhA  reason: case insensitive filesystem */
public final class C8118QhA extends QDP implements C13607TdZ {
    public C11345SOd A00;
    public LoggingData A01;
    public SUj A02 = SUj.A02();
    public String A03;
    public String A04;
    public String A05;
    public final AnonymousClass2gB A06 = Pxh.A0M();
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(C13306TUf.A00);

    public static final void A04(C8118QhA qhA, String str, String str2) {
        A05(qhA, str, (String) null, (String) null, str2, (String) null, (String) null, (String) null);
    }

    public final void CNB(QDO qdo) {
        0qQ.A0B(qdo, 0);
        String str = this.A03;
        if (str == null) {
            0qQ.A0F("financialID");
            throw AnonymousClass00P.createAndThrow();
        }
        qdo.A04(new 2Fk(str));
        Pxi.A1A(qdo.A06, this.A06, TY1.A00(this, 28), 14);
        Pxi.A1A(qdo.A08, this.A03, TY1.A00(this, 29), 14);
    }

    public static final void A03(C8118QhA qhA, String str) {
        String str2 = qhA.A05;
        if (str2 == null) {
            0qQ.A0F("payoutRecordID");
            throw AnonymousClass00P.createAndThrow();
        }
        int A012 = DbX.A01(00y.A0m(str2, 10));
        AnonymousClass2E0.A02();
        SQ2.A00(667750821, A012, str, 0Yt.A0E());
    }

    public static final void A06(C8118QhA qhA, short s) {
        String str = qhA.A05;
        if (str == null) {
            0qQ.A0F("payoutRecordID");
            throw AnonymousClass00P.createAndThrow();
        }
        int A0A = AnonymousClass7TG.A0A(00y.A0m(str, 10));
        AnonymousClass2E0.A02();
        SQ2.A02(667750821, A0A, s);
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [X.RwX, X.QgW] */
    public static final void A02(C8118QhA qhA) {
        QVW qvw;
        QVQ qvq;
        C250663lr r10;
        String str;
        QXV qxv;
        C250663lr reinterpretRequired;
        C250663lr A032;
        C250663lr A022;
        QXV qxv2;
        String A0l;
        C250663lr reinterpretRequired2;
        C250663lr A033;
        C250663lr optionalTreeField;
        C250663lr reinterpretRequired3;
        C250663lr optionalTreeField2;
        C250663lr optionalTreeField3;
        C250663lr reinterpretRequired4;
        C250663lr A034;
        C250663lr optionalTreeField4;
        C250663lr reinterpretRequired5;
        C250663lr reinterpretRequired6;
        C250663lr A035;
        C250663lr A023;
        C250663lr reinterpretRequired7;
        ImmutableList requiredCompactedTreeListField;
        String optionalStringField;
        String str2;
        String str3;
        String str4;
        C250663lr optionalTreeField5;
        C250663lr A042;
        C250663lr A024;
        C250663lr optionalTreeField6;
        C250663lr reinterpretRequired8;
        String A09;
        String optionalStringField2;
        C12397Ssl ssl;
        C250663lr A036;
        ImmutableList.Builder builder = ImmutableList.builder();
        C8118QhA qhA2 = qhA;
        C11345SOd sOd = qhA2.A00;
        if (sOd != null) {
            builder.add(sOd);
        }
        if (SUj.A0V(qhA2.A02)) {
            C11422SSy sSy = C11422SSy.A00;
            0qQ.A0A(builder);
            C250663lr r7 = (C250663lr) qhA2.A02.A01;
            C7705QTu qTu = null;
            if (r7 == null || (A036 = r7.A03(C7655QRw.class, "total_summary", 174739642)) == null) {
                qvw = null;
            } else {
                qvw = (QVW) A036.A01(QVW.class, 723759619);
            }
            QDP.A01(qhA2, C11422SSy.A03(qvw, builder));
            C250663lr r72 = (C250663lr) qhA2.A02.A01;
            if (!(r72 == null || (optionalTreeField6 = r72.getOptionalTreeField(3, "user_info", C7657QRy.class, -224519140)) == null || (reinterpretRequired8 = optionalTreeField6.reinterpretRequired(0, C7755QVs.class, -2055568776)) == null || (A09 = reinterpretRequired8.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) == null || A09.length() == 0 || (optionalStringField2 = reinterpretRequired8.getOptionalStringField(1, "image_uri")) == null || optionalStringField2.length() == 0)) {
                int i = 43;
                if (0qQ.A0K(reinterpretRequired8.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "Meta")) {
                    i = 49;
                }
                if (0qQ.A0K(reinterpretRequired8.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "Meta")) {
                    ssl = new C12397Ssl((Integer) null, 14, R.drawable.ring_background, R.dimen.account_recs_header_image_margin);
                } else {
                    ssl = null;
                }
                C8092Qgk A002 = C8092Qgk.A00(i);
                ? rwX = new C10693RwX();
                rwX.A02 = new C12396Ssk(reinterpretRequired8.getOptionalStringField(1, "image_uri"), (String) null, C51966G9m.A1a(reinterpretRequired8.getOptionalStringField(2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME), "Meta"), true);
                rwX.A00 = ssl;
                C8080QgY A025 = SIE.A02(rwX, A002);
                SST.A02(C12401StR.A00(reinterpretRequired8, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 2), A025, RH2.PRIMARY_TEXT);
                A002.A01(SST.A00(C12401StR.A00(reinterpretRequired8, "user_name", 3), A025, RH2.A0G), 1);
                SRP A003 = SRP.A00();
                A003.A01 = C12401StR.A00(reinterpretRequired8, "accessibility_label", 0);
                A002.A02 = new SO0(A003);
                builder.add(new C11345SOd[]{new C8098Qgq(A002), new C11345SOd(new C10783Ry4(4))});
            }
            C250663lr r73 = (C250663lr) qhA2.A02.A01;
            if (r73 == null || (A024 = r73.A02(C7654QRv.class, "status_info", -278207430)) == null) {
                qvq = null;
            } else {
                qvq = (QVQ) A024.A01(QVQ.class, 641502205);
            }
            sSy.A04(qvq, builder, new TTH(qhA2, 2));
            boolean z = false;
            C8094Qgm.A00(builder);
            C250663lr r102 = (C250663lr) qhA2.A02.A01;
            if (!(r102 == null || (A042 = r102.A04(C7656QRx.class, "transaction_info", -131268372)) == null)) {
                qTu = (C7705QTu) A042.reinterpretRequired(0, C7705QTu.class, 710338203);
            }
            if (sSy.A05(qTu, builder)) {
                Boolean bool = qhA2.A00;
                if (bool == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (bool.booleanValue()) {
                    z = true;
                }
            }
            QDP.A01(qhA2, z);
            C250663lr r3 = (C250663lr) qhA2.A02.A01;
            String str5 = null;
            if (!(r3 == null || (reinterpretRequired6 = r3.reinterpretRequired(4, QVZ.class, 1287181796)) == null || (A035 = reinterpretRequired6.A03(QVY.class, "summary_info", 1199340044)) == null || (A023 = A035.A02(QVX.class, "cost_breakdown", -49716190)) == null || (reinterpretRequired7 = A023.reinterpretRequired(0, QRI.class, 1903095879)) == null || (requiredCompactedTreeListField = reinterpretRequired7.getRequiredCompactedTreeListField(0, "breakdown", QRH.class, -1337682235)) == null || requiredCompactedTreeListField.isEmpty() || (optionalStringField = A035.getOptionalStringField(0, "section_title")) == null || optionalStringField.length() == 0)) {
                C8094Qgm.A00(builder);
                C11422SSy.A02(builder, A035.getOptionalStringField(0, "section_title"));
                Iterator it = requiredCompactedTreeListField.iterator();
                while (it.hasNext()) {
                    C250663lr A0V = C41845B3m.A0V(it);
                    C8092Qgk A004 = C8092Qgk.A00(18);
                    C8080QgY A005 = C8080QgY.A00();
                    if (A0V != null) {
                        str2 = A0V.A08("label");
                    } else {
                        str2 = null;
                    }
                    C12401StR A012 = C12401StR.A01(str2);
                    RH2 rh2 = RH2.A0q;
                    A004.A01(SST.A01(A012, A005, rh2), 1);
                    C8080QgY A006 = C8080QgY.A00();
                    if (A0V == null || (optionalTreeField5 = A0V.getOptionalTreeField(0, "amount", QRG.class, 1005747091)) == null) {
                        str3 = null;
                    } else {
                        str3 = optionalTreeField5.getOptionalStringField(0, "formatted_amount");
                    }
                    A004.A06 = SST.A01(C12401StR.A01(str3), A006, rh2);
                    SRP A007 = SRP.A00();
                    if (A0V != null) {
                        str4 = A0V.A09("accessibility_label");
                    } else {
                        str4 = null;
                    }
                    A007.A01 = C12401StR.A01(str4);
                    SO0.A01(A007, A004, builder);
                }
                C11426STk.A04();
            }
            C250663lr r4 = (C250663lr) qhA2.A02.A01;
            String str6 = null;
            if (r4 == null || (reinterpretRequired4 = r4.reinterpretRequired(4, QVZ.class, 1287181796)) == null || (A034 = reinterpretRequired4.A03(QVY.class, "summary_info", 1199340044)) == null || (optionalTreeField4 = A034.getOptionalTreeField(1, "cost_breakdown", QVX.class, -49716190)) == null || (reinterpretRequired5 = optionalTreeField4.reinterpretRequired(1, C7730QUt.class, -391262911)) == null) {
                r10 = null;
            } else {
                r10 = reinterpretRequired5.A03(C7729QUs.class, "payout_amount_row", -1465670426);
            }
            C8092Qgk A008 = C8092Qgk.A00(18);
            C8080QgY A009 = C8080QgY.A00();
            if (r10 != null) {
                str = r10.A08("label");
            } else {
                str = null;
            }
            SST.A02(C12401StR.A01(str), A009, RH2.A0q);
            A009.A03 = false;
            A008.A01(new C8086Qge(A009), 1);
            C8080QgY A0010 = C8080QgY.A00();
            if (!(r10 == null || (optionalTreeField3 = r10.getOptionalTreeField(0, "amount", C7728QUr.class, -1676254049)) == null)) {
                str5 = optionalTreeField3.getOptionalStringField(0, "formatted_amount");
            }
            A008.A06 = SST.A01(C12401StR.A01(str5), A0010, RH2.A0H);
            SRP A0011 = SRP.A00();
            if (r10 != null) {
                str6 = r10.A09("accessibility_label");
            }
            A0011.A01 = C12401StR.A01(str6);
            SO0.A01(A0011, A008, builder);
            C250663lr r8 = (C250663lr) qhA2.A02.A01;
            if (r8 == null || (reinterpretRequired2 = r8.reinterpretRequired(4, QVZ.class, 1287181796)) == null || (A033 = reinterpretRequired2.A03(QVY.class, "summary_info", 1199340044)) == null || (optionalTreeField = A033.getOptionalTreeField(1, "cost_breakdown", QVX.class, -49716190)) == null || (reinterpretRequired3 = optionalTreeField.reinterpretRequired(2, C7650QRr.class, 916810890)) == null || (optionalTreeField2 = reinterpretRequired3.getOptionalTreeField(0, "disclaimer", BTA.class, -1588411184)) == null) {
                qxv = null;
            } else {
                qxv = (QXV) optionalTreeField2.reinterpretRequired(0, QXV.class, -1925217936);
            }
            C11422SSy.A00(qxv, builder, new TTH(qhA2, 0));
            C250663lr r74 = (C250663lr) qhA2.A02.A01;
            if (!(r74 == null || (reinterpretRequired = r74.reinterpretRequired(5, QSD.class, 1537176104)) == null || (A032 = reinterpretRequired.A03(QSC.class, "earnings_support_info", 569823286)) == null || (A022 = A032.A02(BTJ.class, "support_uri", -669724366)) == null || (qxv2 = (QXV) A022.reinterpretRequired(0, QXV.class, -1925217936)) == null || (A0l = C41845B3m.A0l(qxv2, 0)) == null || A0l.length() == 0)) {
                C8094Qgm.A00(builder);
                C11422SSy.A02(builder, A032.getOptionalStringField(0, "section_title"));
                C11422SSy.A00(qxv2, builder, new TTH(qhA2, 1));
            }
        }
        qhA2.A06.A0B(builder.build());
    }

    public static final void A05(C8118QhA qhA, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        2FO A002 = C11426STk.A00();
        LoggingData loggingData = qhA.A01;
        if (loggingData == null) {
            str8 = "loggingData";
        } else {
            HashMap A003 = C9634ReE.A00(loggingData);
            String str9 = qhA.A03;
            if (str9 == null) {
                str8 = "financialID";
            } else {
                A003.put("financial_entity_id", str9);
                String str10 = qhA.A05;
                if (str10 == null) {
                    str8 = "payoutRecordID";
                } else {
                    A003.put("payout_record_id", str10);
                    A003.put("view_name", "earning_details");
                    String str11 = qhA.A04;
                    if (str11 != null) {
                        A003.put("managed_merchant_account_id", str11);
                    }
                    if (str2 != null) {
                        A003.put("target_name", str2);
                    }
                    if (str3 != null) {
                        A003.put("target_url", str3);
                    }
                    if (str4 != null) {
                        A003.put("endpoint", str4);
                    }
                    if (str5 != null) {
                        A003.put("error_message", str5);
                    }
                    if (str6 != null) {
                        A003.put("error_stacktrace", str6);
                    }
                    if (str7 != null) {
                        A003.put("exception_class", str7);
                    }
                    A002.Cgl(str, A003);
                    return;
                }
            }
        }
        0qQ.A0F(str8);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0C(Bundle bundle) {
        String string;
        String str;
        super.A0C(bundle);
        String str2 = null;
        if (bundle != null) {
            str2 = bundle.getString("payout_record_id");
        }
        if (str2 != null) {
            this.A05 = str2;
            if (bundle == null || (string = bundle.getString("financial_entity_id")) == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            this.A03 = string;
            this.A04 = bundle.getString("managed_merchant_account_id");
            LoggingData loggingData = (LoggingData) bundle.getParcelable("logging_data");
            if (loggingData != null) {
                this.A01 = loggingData;
                this.A07.A0B(new S62(C12400StQ.A00(new Object[0], 2131961092), ImmutableList.of(), false));
                this.A00 = null;
                A04(this, "client_fetch_payouthub_init", "BSC_PAYOUT_EARNINGS_DETAIL");
                A03(this, "fetch_init");
                AnonymousClass2gB r2 = this.A06;
                Object value = this.A07.getValue();
                String str3 = this.A05;
                if (str3 == null) {
                    str = "payoutRecordID";
                } else {
                    LoggingData loggingData2 = this.A01;
                    if (loggingData2 == null) {
                        str = "loggingData";
                    } else {
                        String str4 = loggingData2.A00;
                        String str5 = this.A03;
                        if (str5 == null) {
                            str = "financialID";
                        } else {
                            String str6 = this.A04;
                            SQB.A02(C8282QnO.A00(new C11550ScB(value, str4, str5, str6, str3, 0), AnonymousClass2E0.A06()), r2, C11647Sdp.A00(this, 7));
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
