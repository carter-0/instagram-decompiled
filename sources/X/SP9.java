package X;

import com.facebookpay.logging.LoggingContext;
import com.facebookpay.offsite.models.message.PaymentDetailChangeTypes$Companion;
import com.facebookpay.shippingaddress.model.ShippingAddress;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class SP9 {
    public C10857RzI A00;
    public C10857RzI A01;
    public C10857RzI A02;
    public QDL A03;
    public LoggingContext A04;
    public QDH A05;
    public SUj A06;
    public Set A07;
    public final AnonymousClass2gB A08 = Pxh.A0M();
    public final AnonymousClass2gB A09;
    public final AnonymousClass2Fj A0A;
    public final AnonymousClass2gO A0B;
    public final AnonymousClass2gO A0C;

    public static final void A00(SP9 sp9) {
        SP9 sp92 = sp9;
        C10857RzI rzI = sp92.A01;
        if (rzI == null) {
            C10857RzI rzI2 = sp92.A02;
            if (rzI2 == null) {
                0qQ.A0F("uiState");
                throw AnonymousClass00P.createAndThrow();
            }
            ShippingAddress shippingAddress = rzI2.A01;
            ShippingAddress shippingAddress2 = rzI2.A00;
            List list = rzI2.A0C;
            String str = rzI2.A07;
            Map map = rzI2.A0D;
            List list2 = rzI2.A0B;
            String str2 = rzI2.A06;
            String str3 = rzI2.A09;
            String str4 = rzI2.A04;
            Boolean bool = rzI2.A02;
            String str5 = rzI2.A08;
            String str6 = rzI2.A05;
            String str7 = rzI2.A03;
            LoggingContext loggingContext = rzI2.A0E;
            String str8 = rzI2.A0F;
            List list3 = list2;
            Map map2 = map;
            List list4 = list;
            String str9 = rzI2.A0G;
            String str10 = str2;
            String str11 = str3;
            String str12 = str4;
            ShippingAddress shippingAddress3 = shippingAddress;
            ShippingAddress shippingAddress4 = shippingAddress2;
            Boolean bool2 = bool;
            LoggingContext loggingContext2 = loggingContext;
            rzI = new C10857RzI(loggingContext2, shippingAddress3, shippingAddress4, bool2, rzI2.A0A, str, str8, str9, str10, str11, str12, str5, str6, str7, list4, list3, map2);
        }
        sp92.A01 = rzI;
        if (0qQ.A0K(rzI.A02, true)) {
            sp92.A0A.A0B(true);
        }
        A01(sp92, false);
    }

    public static final void A01(SP9 sp9, boolean z) {
        C10857RzI rzI;
        Long l;
        Long l2;
        String str;
        String str2;
        if ((z || !SUj.A0T(sp9.A06)) && (rzI = sp9.A01) != null) {
            C12411Sto A0g = C51965G9l.A0g();
            LoggingContext loggingContext = sp9.A04;
            if (loggingContext == null) {
                str2 = "loggingContext";
            } else {
                QDL qdl = sp9.A03;
                if (qdl == null) {
                    str2 = "incentiveViewModel";
                } else {
                    List A082 = qdl.A08();
                    String str3 = rzI.A0F;
                    if (str3 != null) {
                        l = AnonymousClass7TE.A10(str3);
                    } else {
                        l = null;
                    }
                    QDH qdh = sp9.A05;
                    if (qdh == null) {
                        str2 = "otcViewModel";
                    } else {
                        SEB A032 = qdh.A03();
                        ShippingAddress shippingAddress = rzI.A01;
                        if (shippingAddress == null || (str = shippingAddress.A04) == null) {
                            l2 = null;
                        } else {
                            l2 = AnonymousClass7TE.A10(str);
                        }
                        String str4 = rzI.A0A;
                        LinkedHashMap A072 = SUU.A07(A032);
                        if (l2 != null) {
                            A072.put("shipping_address_id", String.valueOf(l2.longValue()));
                        }
                        if (str4 != null) {
                            A072.put(PaymentDetailChangeTypes$Companion.SHIPPING_OPTION_ID, str4);
                        }
                        C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_submit_ecpeventhandling_init"), 119), loggingContext, new C73963Pmh(A082, l, loggingContext, A072, "update_checkout", 5));
                        SUj.A0K(sp9.A08, rzI);
                        sp9.A00 = rzI;
                        sp9.A01 = null;
                        return;
                    }
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A02(2Fk r3) {
        AnonymousClass2gO r1 = this.A0C;
        if (r1 != null) {
            this.A08.A0E(r3, r1);
        }
    }

    public final void A03(QDL qdl, LoggingContext loggingContext, QDH qdh, String str, String str2, List list, Set set) {
        List list2 = list;
        this.A07 = set;
        LoggingContext loggingContext2 = loggingContext;
        this.A04 = loggingContext2;
        this.A05 = qdh;
        QDL qdl2 = qdl;
        this.A03 = qdl2;
        if (list == null) {
            list2 = 0sn.A00;
        }
        0sn A032 = SRl.A03(qdl2.A0C);
        if (A032 == null) {
            A032 = 0sn.A00;
        }
        this.A02 = new C10857RzI(loggingContext2, (ShippingAddress) null, (ShippingAddress) null, (Boolean) null, (String) null, (String) null, str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, list2, A032, 0Yt.A0E());
    }

    public final void A04(String str) {
        C10857RzI rzI = this.A02;
        if (rzI != null) {
            String str2 = rzI.A0F;
            String str3 = rzI.A0G;
            LoggingContext loggingContext = this.A04;
            if (loggingContext == null) {
                Pxh.A11();
                throw AnonymousClass00P.createAndThrow();
            }
            List list = rzI.A0C;
            List list2 = rzI.A0B;
            Boolean bool = rzI.A02;
            ShippingAddress shippingAddress = rzI.A01;
            String str4 = rzI.A0A;
            String str5 = rzI.A08;
            String str6 = str5;
            String str7 = rzI.A05;
            this.A02 = new C10857RzI(loggingContext, shippingAddress, (ShippingAddress) null, bool, str4, (String) null, str, str3, (String) null, (String) null, (String) null, str6, str7, (String) null, list, list2, 0Yt.A0E());
            if (str2 == null) {
                A00(this);
            }
        }
    }

    public SP9() {
        AnonymousClass2gB A0M = Pxh.A0M();
        SUj.A0L(A0M, (Object) null);
        this.A09 = A0M;
        this.A0A = JTO.A0K();
        this.A06 = SUj.A08((Object) null);
        this.A0B = C11649Sdr.A00(this, 54);
        this.A0C = C11649Sdr.A00(this, 53);
    }
}
