package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.common.locale.Country;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.QgQ  reason: case insensitive filesystem */
public final class C8072QgQ extends C8115Qh7 implements C13607TdZ {
    public C11345SOd A00;
    public SUj A01 = SUj.A08((Object) null);
    public SUj A02 = SUj.A08((Object) null);
    public SUj A03 = SUj.A08((Object) null);
    public SUj A04 = SUj.A08((Object) null);
    public SUj A05 = SUj.A08((Object) null);
    public SUj A06 = SUj.A08((Object) null);
    public final AnonymousClass2gB A07 = Pxh.A0M();
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(C13323TUw.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8072QgQ(C319836rJ r3) {
        super(r3);
        0qQ.A0B(r3, 1);
    }

    public static final void A04(C8072QgQ qgQ, String str) {
        qgQ.A00 = null;
        A03(qgQ, "fetch_init");
        A05(qgQ, "client_fetch_payouthub_init", "PAY_FINANCIAL_ENTITY");
        AnonymousClass2gB r4 = qgQ.A07;
        Integer num = AnonymousClass05K.A00;
        SQB.A02(C8282QnO.A00(new C45906DEl((Stw) qgQ.A08.getValue(), num, str), AnonymousClass2E0.A06()), r4, C11647Sdp.A00(qgQ, 16));
    }

    public static final void A05(C8072QgQ qgQ, String str, String str2) {
        A06(qgQ, str, (String) null, (String) null, str2, (String) null, (String) null, (String) null);
    }

    public static final void A07(ImmutableList.Builder builder, int i) {
        C8092Qgk A002 = C8092Qgk.A00(0);
        C8080QgY A003 = C8080QgY.A00();
        SST.A02(C12400StQ.A00(new Object[0], i), A003, RH2.A1E);
        SRP A004 = SRP.A00();
        A004.A05 = true;
        SO0.A00(A004, A003);
        C8086Qge.A01(A002, A003, builder);
    }

    public final void CNB(QDO qdo) {
        0qQ.A0B(qdo, 0);
        qdo.A04(AnonymousClass72Y.A01(this.A03, TXG.A00));
        Pxi.A1A(qdo.A06, this.A07, TY1.A00(this, 48), 21);
        Pxi.A1A(qdo.A08, this.A03, TY1.A00(this, 49), 21);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.RwX, X.QgU] */
    private final void A08(ImmutableList.Builder builder, Integer num, String str, String str2, int i) {
        C8092Qgk A002 = C8092Qgk.A00(11);
        ? rwX = new C10693RwX();
        rwX.A00 = new C12395Ssj(0);
        rwX.A01 = new SST((C13889TjC) null, C12400StQ.A00(new Object[0], 2131973420), RH2.A13);
        rwX.A00 = new LXW(this, str, str2, 0);
        SRP A003 = SRP.A00();
        A003.A02 = AnonymousClass05K.A01;
        SRP.A01(A003, new Object[0], 2131973420);
        A003.A00 = C12400StQ.A00(new Object[0], i);
        A003.A04 = true;
        SO0.A00(A003, rwX);
        if (num != null) {
            rwX.A02 = Integer.valueOf(num.intValue());
        }
        A002.A01(new C8081QgZ(rwX), 1);
        C11345SOd.A02(A002, builder);
    }

    @OnLifecycleEvent(07T.ON_RESUME)
    public final void onResume(AnonymousClass07Z r12) {
        C250663lr A09;
        String A0j;
        Object A022 = this.A06.A02();
        if ((A022 == C8882RDz.SUCCESS || A022 == C8882RDz.ERROR) && (A09 = C8115Qh7.A09(this)) != null && (A0j = Pxh.A0j(A09)) != null) {
            AnonymousClass2E0.A02();
            SQ2.A03(A0j, "on_resume", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 667749724, 0);
            A04(this, A0j);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r6v6, types: [X.TjC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v9, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r13v3, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r6v121, types: [X.RwX, X.QgW] */
    public static final void A02(C8072QgQ qgQ) {
        QXM qxm;
        QSE A0E;
        String A072;
        QSE A0E2;
        String A073;
        ImmutableList requiredCompactedTreeListField;
        QXM qxm2;
        QSE A0E3;
        String A09;
        QSE A0E4;
        String A092;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        C250663lr r14;
        QXM qxm3;
        QSE A0E5;
        String optionalStringField;
        QSE A0E6;
        String optionalStringField2;
        C250663lr optionalTreeField;
        QXM qxm4;
        QSE A0E7;
        String A0A;
        QSE A0E8;
        String A0A2;
        ImmutableList requiredCompactedTreeListField2;
        C13883Tj6 A002;
        C13883Tj6 A003;
        C13889TjC ssm;
        C12397Ssl ssl;
        C12400StQ A004;
        String optionalStringField3;
        ImmutableList.Builder builder = ImmutableList.builder();
        C8072QgQ qgQ2 = qgQ;
        C11345SOd.A02(qgQ2.A0D(), builder);
        C11345SOd sOd = qgQ2.A00;
        if (sOd != null) {
            builder.add(sOd);
        }
        A07(builder, 2131969258);
        C8092Qgk A005 = C8092Qgk.A00(15);
        ? rwX = new C10693RwX();
        rwX.A02 = new C12398Ssm(Pxe.A0m(), 4, 0, 1);
        rwX.A03 = false;
        A005.A04 = new C8082Qga(rwX);
        A005.A01 = 0;
        A005.A00 = 1.0f;
        C8080QgY A006 = C8080QgY.A00();
        C12400StQ A007 = C12400StQ.A00(new Object[0], 2131969261);
        RH2 rh2 = RH2.A1E;
        SST.A02(A007, A006, rh2);
        C12400StQ A008 = C12400StQ.A00(new Object[0], 2131969260);
        RH2 rh22 = RH2.A14;
        A005.A01(SST.A00(A008, A006, rh22), 1);
        A005.A01 = new Object();
        Integer num = AnonymousClass05K.A00;
        SRP srp = new SRP((C13883Tj6) null, (C13883Tj6) null, num, false, false, false);
        SRP.A01(srp, new Object[0], 2131969259);
        SO0.A01(srp, A005, builder);
        SUj sUj = qgQ2.A04;
        if (SUj.A0V(sUj)) {
            C250663lr r11 = (C250663lr) sUj.A01;
            if (!(r11 == null || (requiredCompactedTreeListField2 = r11.getRequiredCompactedTreeListField(0, "payout_info", QV0.class, 500922335)) == null)) {
                C249803kO A0J = C66580MXl.A0J(requiredCompactedTreeListField2);
                while (A0J.hasNext()) {
                    C250663lr A0V = C41845B3m.A0V(A0J);
                    String optionalStringField4 = A0V.getOptionalStringField(1, "bank_name");
                    if ((optionalStringField4 == null || optionalStringField4.length() == 0) && ((optionalStringField3 = A0V.getOptionalStringField(0, "bank_account_number")) == null || optionalStringField3.length() == 0)) {
                        A002 = C12400StQ.A00(new Object[0], 2131969268);
                        A003 = C12401StR.A01(A0V.A09("paypal_email"));
                        ssm = new C12397Ssl((Integer) null, (Integer) null, R.drawable.payment_paypal, 0);
                        String A093 = A0V.A09("paypal_email");
                        if (A093 != null) {
                            A004 = C12400StQ.A00(new Object[]{A093}, 2131969255);
                            ssl = null;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        A002 = C12401StR.A00(A0V, "bank_name", 1);
                        String optionalStringField5 = A0V.getOptionalStringField(0, "bank_account_number");
                        if (optionalStringField5 != null) {
                            A003 = C12400StQ.A00(new Object[]{optionalStringField5}, 2131953609);
                            ssm = new C12398Ssm(Pxe.A0l(), 4, 0, 1);
                            ssl = new C12397Ssl((Integer) null, 14, R.drawable.rounded_icon_background, R.dimen.account_recs_header_image_margin);
                            String optionalStringField6 = A0V.getOptionalStringField(1, "bank_name");
                            if (optionalStringField6 != null) {
                                String optionalStringField7 = A0V.getOptionalStringField(0, "bank_account_number");
                                if (optionalStringField7 != null) {
                                    A004 = C12400StQ.A00(new Object[]{optionalStringField6, optionalStringField7}, 2131969254);
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    C8092Qgk A009 = C8092Qgk.A00(3);
                    ? rwX2 = new C10693RwX();
                    rwX2.A02 = ssm;
                    rwX2.A00 = ssl;
                    C8080QgY A0010 = QDP.A00(rwX2, A009);
                    SST.A02(A002, A0010, RH2.PRIMARY_TEXT);
                    A009.A01(SST.A00(A003, A0010, RH2.A1F), 1);
                    SRP srp2 = new SRP((C13883Tj6) null, (C13883Tj6) null, num, false, false, false);
                    srp2.A01 = A004;
                    srp2.A04 = false;
                    SO0.A01(srp2, A009, builder);
                }
            }
            SUj sUj2 = qgQ2.A02;
            if (!(!SUj.A0V(sUj2) || (qxm4 = (QXM) sUj2.A01) == null || (A0E7 = qxm4.A0E()) == null || (A0A = A0E7.A0A("payout_method_update_uri")) == null || A0A.length() == 0)) {
                QXM qxm5 = (QXM) qgQ2.A02.A01;
                if (qxm5 == null || (A0E8 = qxm5.A0E()) == null || (A0A2 = A0E8.A0A("payout_method_update_uri")) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                qgQ2.A08(builder, Integer.valueOf(R.id.payout_method_update_button), A0A2, "payouthub_setting_payoutmethod_click", 2131969256);
            }
        }
        C8094Qgm.A00(builder);
        A07(builder, 2131975035);
        SUj sUj3 = qgQ2.A06;
        if (SUj.A0V(sUj3)) {
            C250663lr r112 = (C250663lr) sUj3.A01;
            if (!(r112 == null || (optionalTreeField = r112.getOptionalTreeField(0, "tax_form", C7738QVb.class, -27585996)) == null)) {
                C8092Qgk A0011 = C8092Qgk.A00(3);
                ? rwX3 = new C10693RwX();
                rwX3.A02 = new C12398Ssm(6, 4, 0, 1);
                rwX3.A00 = new C12397Ssl((Integer) null, 14, R.drawable.rounded_icon_background, R.dimen.account_recs_header_image_margin);
                C8080QgY A0012 = QDP.A00(rwX3, A0011);
                SST.A02(C12401StR.A00(optionalTreeField, "file_name", 0), A0012, RH2.PRIMARY_TEXT);
                A0011.A01(SST.A00(C12400StQ.A00(new Object[0], 2131974651), A0012, RH2.A1F), 1);
                SRP srp3 = new SRP((C13883Tj6) null, (C13883Tj6) null, num, false, false, false);
                String optionalStringField8 = optionalTreeField.getOptionalStringField(0, "file_name");
                if (optionalStringField8 != null) {
                    SRP.A01(srp3, new Object[]{optionalStringField8}, 2131954318);
                    SO0.A01(srp3, A0011, builder);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            SUj sUj4 = qgQ2.A02;
            if (!(!SUj.A0V(sUj4) || (qxm3 = (QXM) sUj4.A01) == null || (A0E5 = qxm3.A0E()) == null || (optionalStringField = A0E5.getOptionalStringField(4, "update_tax_uri")) == null || optionalStringField.length() == 0)) {
                QXM qxm6 = (QXM) qgQ2.A02.A01;
                if (qxm6 == null || (A0E6 = qxm6.A0E()) == null || (optionalStringField2 = A0E6.getOptionalStringField(4, "update_tax_uri")) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                qgQ2.A08(builder, (Integer) null, optionalStringField2, "payouthub_setting_taxform_click", 2131975034);
            }
        }
        String str11 = null;
        C8094Qgm.A00(builder);
        A07(builder, 2131969242);
        SUj sUj5 = qgQ2.A03;
        if (SUj.A0V(sUj5) && (r14 = (C250663lr) sUj5.A01) != null) {
            Class<C7726QUp> cls = C7726QUp.class;
            C250663lr optionalTreeField2 = r14.getOptionalTreeField(2, "company_address", cls, -76714750);
            if (!(optionalTreeField2 == null || optionalTreeField2.getOptionalStringField(0, "country_code") == null)) {
                C8092Qgk A0013 = C8092Qgk.A00(1);
                C8080QgY A0014 = C8080QgY.A00();
                SST.A02(C12400StQ.A00(new Object[0], 2131969241), A0014, rh22);
                C250663lr optionalTreeField3 = r14.getOptionalTreeField(2, "company_address", cls, -76714750);
                if (optionalTreeField3 != null) {
                    str11 = optionalTreeField3.getOptionalStringField(0, "country_code");
                }
                SST.A03(C12401StR.A01(Country.A00((Country) null, str11).A00.getDisplayCountry()), A0014, rh22);
                C8086Qge.A01(A0013, A0014, builder);
            }
            C8092Qgk A0015 = C8092Qgk.A00(1);
            C8080QgY A0016 = C8080QgY.A00();
            SST.A02(C12400StQ.A00(new Object[0], 2131969240), A0016, rh22);
            SST.A03(C12401StR.A01(Pxi.A0g(r14, C8926RFu.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "company_type", 0)), A0016, rh22);
            C8086Qge.A00(A0015, A0016, 1);
            C8098Qgq qgq = new C8098Qgq(A0015);
            C8092Qgk A0017 = C8092Qgk.A00(1);
            C8080QgY A0018 = C8080QgY.A00();
            SST.A02(C12400StQ.A00(new Object[0], 2131969239), A0018, rh22);
            SST.A03(C12401StR.A00(r14, "company_name", 1), A0018, rh22);
            C8086Qge.A00(A0017, A0018, 1);
            builder.add(new C11345SOd[]{qgq, new C8098Qgq(A0017)});
        }
        C8094Qgm.A00(builder);
        A07(builder, 2131952084);
        SUj sUj6 = qgQ2.A05;
        if (SUj.A0V(sUj6)) {
            QXX qxx = (QXX) sUj6.A01;
            if (qxx != null) {
                C8092Qgk A0019 = C8092Qgk.A00(1);
                C8080QgY A0020 = C8080QgY.A00();
                SST.A02(C12400StQ.A00(new Object[0], 2131969244), A0020, rh22);
                QV2 A0E9 = qxx.A0E();
                if (A0E9 != null) {
                    str = A0E9.getOptionalStringField(0, "first_name");
                } else {
                    str = null;
                }
                QV2 A0E10 = qxx.A0E();
                if (A0E10 != null) {
                    str2 = A0E10.getOptionalStringField(1, "middle_name");
                } else {
                    str2 = null;
                }
                QV2 A0E11 = qxx.A0E();
                if (A0E11 != null) {
                    str3 = A0E11.getOptionalStringField(2, "last_name");
                } else {
                    str3 = null;
                }
                SST.A03(C12401StR.A01(C9646ReQ.A00(" ", str, str2, str3)), A0020, rh22);
                A0019.A01(new C8086Qge(A0020), 1);
                C8098Qgq qgq2 = new C8098Qgq(A0019);
                C8092Qgk A0021 = C8092Qgk.A00(1);
                C8080QgY A0022 = C8080QgY.A00();
                SST.A02(C12400StQ.A00(new Object[0], 2131969237), A0022, rh22);
                QV2 A0E12 = qxx.A0E();
                if (A0E12 != null) {
                    str4 = A0E12.getOptionalStringField(3, "street1");
                } else {
                    str4 = null;
                }
                QV2 A0E13 = qxx.A0E();
                if (A0E13 != null) {
                    str5 = A0E13.getOptionalStringField(4, "street2");
                } else {
                    str5 = null;
                }
                QV2 A0E14 = qxx.A0E();
                if (A0E14 != null) {
                    str6 = A0E14.A0C("address_city");
                } else {
                    str6 = null;
                }
                QV2 A0E15 = qxx.A0E();
                if (A0E15 != null) {
                    str7 = A0E15.getOptionalStringField(6, "address_state");
                } else {
                    str7 = null;
                }
                QV2 A0E16 = qxx.A0E();
                if (A0E16 != null) {
                    str8 = A0E16.getOptionalStringField(7, ServerW3CShippingAddressConstants.POSTAL_CODE);
                } else {
                    str8 = null;
                }
                QV2 A0E17 = qxx.A0E();
                if (A0E17 == null || A0E17.A0D("country_code") == null) {
                    str9 = null;
                } else {
                    QV2 A0E18 = qxx.A0E();
                    if (A0E18 != null) {
                        str10 = A0E18.A0D("country_code");
                    } else {
                        str10 = null;
                    }
                    str9 = Country.A00((Country) null, str10).A00.getDisplayCountry();
                }
                SST.A03(C12401StR.A01(C9646ReQ.A00(", ", str4, str5, str6, str7, str8, str9)), A0022, rh22);
                C8086Qge.A00(A0021, A0022, 1);
                builder.add(new C11345SOd[]{qgq2, new C8098Qgq(A0021)});
            }
            SUj sUj7 = qgQ2.A02;
            if (!(!SUj.A0V(sUj7) || (qxm2 = (QXM) sUj7.A01) == null || (A0E3 = qxm2.A0E()) == null || (A09 = A0E3.A09("owner_info_update_uri")) == null || A09.length() == 0)) {
                QXM qxm7 = (QXM) qgQ2.A02.A01;
                if (qxm7 == null || (A0E4 = qxm7.A0E()) == null || (A092 = A0E4.A09("owner_info_update_uri")) == null) {
                    throw AnonymousClass7TE.A0y();
                }
                qgQ2.A08(builder, (Integer) null, A092, "payouthub_setting_ownerinfo_click", 2131969243);
            }
        }
        C8094Qgm.A00(builder);
        A07(builder, 2131952050);
        SUj sUj8 = qgQ2.A01;
        if (SUj.A0V(sUj8)) {
            C250663lr r8 = (C250663lr) sUj8.A01;
            if (!(r8 == null || (requiredCompactedTreeListField = r8.getRequiredCompactedTreeListField(0, "pay_admin_do_not_use", QR4.class, 109494878)) == null)) {
                C249803kO A0J2 = C66580MXl.A0J(requiredCompactedTreeListField);
                while (A0J2.hasNext()) {
                    C250663lr A0V2 = C41845B3m.A0V(A0J2);
                    C8092Qgk A0023 = C8092Qgk.A00(7);
                    ? rwX4 = new C10693RwX();
                    rwX4.A02 = new C12396Ssk(A0V2.A0A("image_uri"), (String) null, true, true);
                    A0023.A01(SST.A01(C12401StR.A01(A0V2.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)), QDP.A00(rwX4, A0023), rh2), 1);
                    SRP srp4 = new SRP((C13883Tj6) null, (C13883Tj6) null, num, false, false, false);
                    srp4.A01 = C12401StR.A01(A0V2.A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
                    SO0.A01(srp4, A0023, builder);
                }
            }
            SUj sUj9 = qgQ2.A02;
            if (!(!SUj.A0V(sUj9) || (qxm = (QXM) sUj9.A01) == null || (A0E = qxm.A0E()) == null || (A072 = A0E.A07("admin_update_uri")) == null || A072.length() == 0)) {
                QXM qxm8 = (QXM) qgQ2.A02.A01;
                if (qxm8 == null || (A0E2 = qxm8.A0E()) == null || (A073 = A0E2.A07("admin_update_uri")) == null) {
                    throw AnonymousClass7TE.A0y();
                }
                qgQ2.A08(builder, (Integer) null, A073, "payouthub_setting_admin_update_click", 2131969238);
            }
        }
        qgQ2.A07.A0B(builder.build());
    }

    public static final void A03(C8072QgQ qgQ, String str) {
        String optionalStringField;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        C250663lr A09 = C8115Qh7.A09(qgQ);
        if (A09 == null || (optionalStringField = A09.getOptionalStringField(0, "financial_id")) == null) {
            throw AnonymousClass7TE.A0y();
        }
        A1H.put("financial_entity_id", optionalStringField);
        AnonymousClass2E0.A02();
        SQ2.A00(667749724, 0, str, A1H);
    }

    public static final void A06(C8072QgQ qgQ, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String A0j;
        2FO A002 = C11426STk.A00();
        HashMap A003 = C9634ReE.A00(qgQ.A0E());
        C250663lr A09 = C8115Qh7.A09(qgQ);
        if (A09 == null || (A0j = Pxh.A0j(A09)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        A003.put("financial_entity_id", A0j);
        Pxj.A1L("view_name", "settings", str2, A003);
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
    }

    public final void A0C(Bundle bundle) {
        super.A0C(bundle);
        Pxi.A1A(this.A03, this.A07, TY1.A00(this, 47), 21);
        this.A07.A0B(new S62(C12400StQ.A00(new Object[0], 2131973394), ImmutableList.of(), false));
    }
}
