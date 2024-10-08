package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveItem;
import com.facebookpay.expresscheckout.models.PromoCodeList;
import com.facebookpay.incentives.model.ECPIncentive;
import com.facebookpay.incentives.model.ECPOffsiteOffer;
import com.facebookpay.incentives.model.ECPOnsiteOffer;
import com.facebookpay.incentives.model.FeaturedIncentiveDetails;
import com.facebookpay.incentives.model.IncentiveList;
import com.facebookpay.logging.LoggingContext;
import com.facebookpay.otc.models.OtcInput;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class QDL extends 2YL {
    public C13925TlT A00;
    public ECPIncentive A01;
    public ECPIncentive A02;
    public LoggingContext A03;
    public Integer A04 = AnonymousClass05K.A00;
    public boolean A05;
    public boolean A06 = true;
    public final AnonymousClass2Fj A07;
    public final AnonymousClass2Fj A08;
    public final AnonymousClass2Fj A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2Fj A0B;
    public final AnonymousClass2Fj A0C = JTO.A0K();
    public final AnonymousClass2Fj A0D = JTO.A0K();

    public final Void A04(String str) {
        Object obj;
        ECPIncentive eCPIncentive;
        C7699QTo A0E;
        Iterator it = SRl.A01(this.A09).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            QXS qxs = (QXS) obj;
            if (!0qQ.A0K(qxs.A0E().getOptionalStringField(0, "incentive_id"), str)) {
                if (0qQ.A0K(qxs.A0E().A0D("promo_code"), AnonymousClass7TF.A0k(str))) {
                    break;
                }
            } else {
                break;
            }
        }
        QXS qxs2 = (QXS) obj;
        if (qxs2 == null || (A0E = qxs2.A0E()) == null || (eCPIncentive = C9628Re8.A00(A0E)) == null) {
            Locale locale = Locale.ROOT;
            eCPIncentive = new ECPOffsiteOffer((CurrencyAmount) null, RGS.PROMO_CODE, Pxf.A0n(locale, str), Pxf.A0n(locale, str), (String) null, (String) null, (String) null, false);
        }
        AnonymousClass2Fj r2 = this.A0A;
        List<ECPIncentive> A022 = SRl.A02(r2);
        if (!(A022 instanceof Collection) || !A022.isEmpty()) {
            for (ECPIncentive id : A022) {
                if (0qQ.A0K(id.getId(), str)) {
                    return null;
                }
            }
        }
        this.A01 = eCPIncentive;
        C12411Sto A0g = C51965G9l.A0g();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            Pxh.A11();
            throw AnonymousClass00P.createAndThrow();
        }
        C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_add_incentives_init"), 25), loggingContext, new C58769IxG(14, (Object) null, loggingContext, A02(AnonymousClass7TE.A1I(eCPIncentive)), A01(r2)));
        SRl.A00(eCPIncentive).AC2(eCPIncentive, this, AnonymousClass05K.A01);
        return null;
    }

    public final void A0B(PromoCodeList promoCodeList) {
        ECPOffsiteOffer eCPOffsiteOffer;
        String str;
        IncentiveList incentiveList;
        PromoCodeList promoCodeList2 = promoCodeList;
        0qQ.A0B(promoCodeList2, 0);
        List<String> list = promoCodeList2.A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            A0r.add(AnonymousClass7TF.A0k(AnonymousClass7TE.A18(it)));
        }
        AnonymousClass2Fj r5 = this.A0A;
        SUj A0W = Pxe.A0W(r5);
        if (!(A0W == null || (incentiveList = (IncentiveList) A0W.A01) == null || !AnonymousClass7TE.A1b(incentiveList.A00))) {
            SUj.A0K(r5, new IncentiveList(0sn.A00));
        }
        if (this.A04 == AnonymousClass05K.A0C && A0r.isEmpty() && SUj.A0R(r5)) {
            SUj.A0K(r5, new IncentiveList(0sn.A00));
        }
        Iterator it2 = A0r.iterator();
        while (true) {
            if (it2.hasNext()) {
                String str2 = (String) it2.next();
                ECPIncentive eCPIncentive = this.A01;
                if (eCPIncentive != null) {
                    str = eCPIncentive.getId();
                } else {
                    str = null;
                }
                if (0qQ.A0K(str, str2)) {
                    ECPIncentive eCPIncentive2 = this.A01;
                    if (eCPIncentive2 != null) {
                        A03(eCPIncentive2, this);
                        C12411Sto A0g = C51965G9l.A0g();
                        LoggingContext loggingContext = this.A03;
                        if (loggingContext == null) {
                            break;
                        }
                        A0g.A0g(loggingContext, A02(AnonymousClass7TE.A1I(eCPIncentive2)), A01(r5));
                    }
                    this.A01 = null;
                } else {
                    ECPOffsiteOffer eCPOffsiteOffer2 = new ECPOffsiteOffer((CurrencyAmount) null, RGS.PROMO_CODE, str2, str2, (String) null, (String) null, (String) null, false);
                    A03(eCPOffsiteOffer2, this);
                    C12405Sth.A00.AC2(eCPOffsiteOffer2, this, AnonymousClass05K.A00);
                }
            } else {
                ECPIncentive eCPIncentive3 = this.A02;
                if ((eCPIncentive3 instanceof ECPOffsiteOffer) && (eCPOffsiteOffer = (ECPOffsiteOffer) eCPIncentive3) != null && !A0r.contains(AnonymousClass7TF.A0k(eCPOffsiteOffer.A01))) {
                    C12411Sto A0g2 = C51965G9l.A0g();
                    LoggingContext loggingContext2 = this.A03;
                    if (loggingContext2 != null) {
                        A0g2.A0h(loggingContext2, A02(AnonymousClass7TE.A1I(eCPOffsiteOffer)), A01(r5));
                        this.A02 = null;
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F("loggingContext");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(ECPIncentive eCPIncentive, QDL qdl) {
        AnonymousClass2Fj r2 = qdl.A0A;
        SUj.A0K(r2, new IncentiveList(00k.A0T(eCPIncentive, 00k.A0U(SRl.A02(r2)))));
    }

    public final Void A05(String str) {
        Object obj;
        AnonymousClass2Fj r4 = this.A0A;
        Iterator it = SRl.A02(r4).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((ECPIncentive) obj).getId(), str)) {
                break;
            }
        }
        ECPIncentive eCPIncentive = (ECPIncentive) obj;
        if (eCPIncentive != null) {
            this.A02 = eCPIncentive;
            C12411Sto A0g = C51965G9l.A0g();
            LoggingContext loggingContext = this.A03;
            if (loggingContext == null) {
                Pxh.A11();
                throw AnonymousClass00P.createAndThrow();
            }
            C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_remove_incentives_init"), 113), loggingContext, new C58769IxG(17, (Object) null, loggingContext, A02(AnonymousClass7TE.A1I(eCPIncentive)), A01(r4)));
            SRl.A00(eCPIncentive).EDj(eCPIncentive, this);
        }
        return null;
    }

    public final List A06() {
        ECPOnsiteOffer eCPOnsiteOffer;
        List<ECPIncentive> A022 = SRl.A02(this.A0A);
        ArrayList A0r = AnonymousClass7TG.A0r(A022);
        for (ECPIncentive eCPIncentive : A022) {
            0bb r2 = new 0bb();
            r2.A06(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, eCPIncentive.getTitle());
            r2.A06("offer_id", eCPIncentive.getId());
            if ((eCPIncentive instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive) != null) {
                r2.A06("credential_id", eCPOnsiteOffer.A01);
            }
            A0r.add(r2);
        }
        return A0r;
    }

    public final List A07() {
        ArrayList arrayList;
        String optionalStringField;
        AnonymousClass2Fj r17 = this.A09;
        List<QXS> A012 = SRl.A01(r17);
        if (A012 != null) {
            arrayList = AnonymousClass7TG.A0r(A012);
            for (QXS qxs : A012) {
                C7699QTo A0E = qxs.A0E();
                0qQ.A07(A0E);
                boolean z = C9628Re8.A00(A0E) instanceof ECPOffsiteOffer;
                C7699QTo A0E2 = qxs.A0E();
                if (z) {
                    optionalStringField = A0E2.A0D("promo_code");
                } else {
                    optionalStringField = A0E2.getOptionalStringField(0, "incentive_id");
                }
                0eP A1L = AnonymousClass7TE.A1L("offer_id", optionalStringField);
                0eP A1L2 = AnonymousClass7TE.A1L(DialogModule.KEY_TITLE, qxs.A0E().A0B(DialogModule.KEY_TITLE));
                0eP A1L3 = AnonymousClass7TE.A1L(DevServerEntity.COLUMN_DESCRIPTION, qxs.A0E().getOptionalStringField(5, "subtitle"));
                0eP A1L4 = AnonymousClass7TE.A1L("expiration_date", qxs.A0E().getOptionalStringField(6, "expiration_date_text"));
                String lowerCase = Pxi.A0g(qxs.A0E(), RGS.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "incentive_type", 1).toLowerCase();
                0qQ.A07(lowerCase);
                arrayList.add(Pxh.A0v(A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("incentive_type", lowerCase)));
            }
        } else {
            arrayList = 0sn.A00;
        }
        for (ECPIncentive eCPIncentive : SRl.A02(this.A0A)) {
            List A013 = SRl.A01(r17);
            if (!(A013 instanceof Collection) || !A013.isEmpty()) {
                Iterator it = A013.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    QXS qxs2 = (QXS) it.next();
                    String A0D2 = qxs2.A0E().A0D("promo_code");
                    String id = eCPIncentive.getId();
                    if (!0qQ.A0K(A0D2, id)) {
                        if (0qQ.A0K(qxs2.A0E().getOptionalStringField(0, "incentive_id"), id)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            0eP A1L5 = AnonymousClass7TE.A1L("offer_id", eCPIncentive.getId());
            0eP A1L6 = AnonymousClass7TE.A1L(DialogModule.KEY_TITLE, eCPIncentive.getTitle());
            0eP A1L7 = AnonymousClass7TE.A1L(DevServerEntity.COLUMN_DESCRIPTION, "");
            0eP A1L8 = AnonymousClass7TE.A1L("expiration_date", "");
            String lowerCase2 = DbT.A10(RGS.PROMO_CODE).toLowerCase();
            0qQ.A07(lowerCase2);
            arrayList = 00k.A0T(Pxh.A0v(A1L5, A1L6, A1L7, A1L8, AnonymousClass7TE.A1L("incentive_type", lowerCase2)), arrayList);
        }
        return arrayList;
    }

    public final List A08() {
        ECPOnsiteOffer eCPOnsiteOffer;
        ECPIncentive eCPIncentive = this.A01;
        if (eCPIncentive == null) {
            return 0sn.A00;
        }
        0bb r3 = new 0bb();
        String str = "";
        r3.A06(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, eCPIncentive.getTitle());
        ECPIncentive eCPIncentive2 = this.A01;
        if (eCPIncentive2 != null) {
            str = eCPIncentive2.getId();
        }
        r3.A06("offer_id", str);
        ECPIncentive eCPIncentive3 = this.A01;
        if ((eCPIncentive3 instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive3) != null) {
            r3.A06("credential_id", eCPOnsiteOffer.A01);
        }
        return AnonymousClass7TE.A1I(r3);
    }

    public final List A09() {
        List<ECPIncentive> A022 = SRl.A02(this.A0A);
        ArrayList A0r = AnonymousClass7TG.A0r(A022);
        for (ECPIncentive id : A022) {
            A0r.add(id.getId());
        }
        return A0r;
    }

    public final void A0A(SJK sjk, LoggingContext loggingContext) {
        SEB seb;
        if (this.A04 == AnonymousClass05K.A00) {
            this.A04 = AnonymousClass05K.A01;
            C10254RpE rpE = AnonymousClass2E0.A01().A0A;
            C12411Sto A0g = C51965G9l.A0g();
            List A1I = AnonymousClass7TE.A1I(C298525tb.INCENTIVES);
            String str = sjk.A09;
            boolean A0K = 0qQ.A0K(str, "PRE_WARM");
            OtcInput otcInput = sjk.A04;
            if (otcInput != null) {
                seb = C11300SKk.A01(otcInput);
            } else {
                seb = null;
            }
            A0g.A0T(loggingContext, str, A1I, Pxj.A0x(seb), A0K);
            ImmutableList of = ImmutableList.of("INCENTIVES");
            0qQ.A0B(of, 0);
            sjk.A01 = of;
            AnonymousClass2E0.A00();
            2IV A0R = Pxe.A0R();
            A0R.A09("62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969", "bloks_versioning_id");
            sjk.A00 = A0R;
            AnonymousClass72Y.A01(SSC.A02(AnonymousClass2E0.A06(), C11579Sce.A00, new C11542Sc3(5, sjk, rpE)), new TYA(45, (Object) loggingContext, (Object) sjk)).A09(new C64319LZu(13, TY1.A00(this, 27)));
        }
    }

    public final void A0C(LoggingContext loggingContext, String str) {
        AnonymousClass2Fj r3 = this.A0A;
        if (SUj.A0R(r3)) {
            SUj.A0K(r3, new IncentiveList(0sn.A00));
        }
        List A022 = SRl.A02(r3);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A022) {
            if (next instanceof ECPOffsiteOffer) {
                A1C.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(A1C);
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            A0r.add(((ECPOffsiteOffer) it.next()).A01);
        }
        SUj.A0J(this.A0D, AnonymousClass05K.A01, new PromoCodeList(A0r), (String) null);
        LoggingContext loggingContext2 = loggingContext;
        String str2 = str;
        if (this.A01 != null) {
            C12411Sto A0g = C51965G9l.A0g();
            ECPIncentive eCPIncentive = this.A01;
            if (eCPIncentive != null) {
                A0g.A0S(loggingContext, str, A02(AnonymousClass7TE.A1I(eCPIncentive)), A01(r3));
                this.A01 = null;
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        ECPIncentive eCPIncentive2 = this.A02;
        C11353SOm A012 = AnonymousClass2E0.A01();
        if (eCPIncentive2 != null) {
            C12411Sto sto = A012.A04;
            ECPIncentive eCPIncentive3 = this.A02;
            if (eCPIncentive3 != null) {
                List A023 = A02(AnonymousClass7TE.A1I(eCPIncentive3));
                C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(sto.A00, "client_remove_incentives_fail"), 112), loggingContext, new C73963Pmh(A01(r3), loggingContext2, A023, (Object) null, str2, 3));
                this.A02 = null;
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        A012.A04.A0S(loggingContext, str, 0sn.A00, A01(r3));
    }

    public QDL() {
        AnonymousClass2Fj A0K = JTO.A0K();
        this.A0B = A0K;
        this.A0A = SUj.A00(new IncentiveList(0sn.A00));
        AnonymousClass2Fj A0K2 = JTO.A0K();
        SUj.A0L(A0K2, (Object) null);
        this.A09 = A0K2;
        this.A07 = JTO.A0K();
        this.A08 = SUj.A00(new FeaturedIncentiveDetails((C7X) null, (String) null));
        A0K.A09(new C64319LZu(13, TY1.A00(this, 26)));
    }

    public static IncentiveItem A00(2Fk r3, QDL qdl, List list) {
        return new IncentiveItem(RH6.A0f, list, SRl.A01(r3).size(), qdl.A06);
    }

    public static List A01(2Fk r0) {
        return A02(SRl.A02(r0));
    }

    public static final List A02(List list) {
        ECPOffsiteOffer eCPOffsiteOffer;
        ECPOnsiteOffer eCPOnsiteOffer;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ECPIncentive eCPIncentive = (ECPIncentive) it.next();
            0bb r3 = new 0bb();
            r3.A06("offer_id", eCPIncentive.getId());
            r3.A03("is_auto_applied", Boolean.valueOf(eCPIncentive.CPP()));
            RIV valueOf = RIV.valueOf(DbT.A10(eCPIncentive.BGn()));
            if (valueOf == null) {
                valueOf = RIV.PROMO_CODE;
            }
            r3.A01(valueOf, "incentive_type");
            if ((eCPIncentive instanceof ECPOnsiteOffer) && (eCPOnsiteOffer = (ECPOnsiteOffer) eCPIncentive) != null) {
                r3.A06("credential_id", eCPOnsiteOffer.A01);
            }
            if ((eCPIncentive instanceof ECPOffsiteOffer) && (eCPOffsiteOffer = (ECPOffsiteOffer) eCPIncentive) != null) {
                String str = eCPOffsiteOffer.A02;
                if (str == null) {
                    str = eCPOffsiteOffer.A01;
                }
                r3.A06("offer_id", str);
                r3.A03("is_auto_applied", Boolean.valueOf(eCPOffsiteOffer.A03));
                RIV valueOf2 = RIV.valueOf(DbT.A10(eCPOffsiteOffer.A00));
                if (valueOf2 == null) {
                    valueOf2 = RIV.PROMO_CODE;
                }
                r3.A01(valueOf2, "incentive_type");
                r3.A06("promo_code", eCPOffsiteOffer.A01);
            }
            A0r.add(r3);
        }
        return A0r;
    }
}
