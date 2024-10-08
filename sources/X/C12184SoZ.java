package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.SoZ  reason: case insensitive filesystem */
public final class C12184SoZ implements C13560TcZ {
    public final /* synthetic */ List A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ 1IX A02;

    public C12184SoZ(List list, Map map, 1IX r3) {
        this.A01 = map;
        this.A00 = list;
        this.A02 = r3;
    }

    public final void Df6(C11230SGo sGo, C8918RFl rFl, Map map) {
        String str;
        ArrayList arrayList;
        C11230SGo sGo2 = sGo;
        SEJ sej = (SEJ) C51968G9o.A10(C10025RlK.A00, sGo2.A00);
        Map map2 = this.A01;
        String str2 = "";
        if (sej != null) {
            str = sej.A00;
        } else {
            str = str2;
        }
        map2.put("fetch_status_error_code", str);
        if (sej != null) {
            str2 = sej.A01;
        }
        map2.put("fetch_status_error_description", str2);
        Object obj = map2.get("product_price");
        0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
        Map A03 = 0u4.A03(obj);
        Object obj2 = map2.get("price_info");
        0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>>");
        Map A032 = 0u4.A03(obj2);
        if (sGo2.A00 == 0) {
            map2.put("product_status", MessageAvailabilityResponseId$Companion.AVAILABLE);
            for (Object next : this.A00) {
                Map map3 = map;
                if (map3.containsKey(next)) {
                    RRR rrr = (RRR) map3.get(next);
                    if (rrr != null) {
                        A03.put(next, rrr.A03());
                        List<QOw> A07 = rrr.A07();
                        if (A07 != null) {
                            arrayList = AnonymousClass7TG.A0r(A07);
                            for (QOw qOw : A07) {
                                0eP A1L = AnonymousClass7TE.A1L("formattedPrice", qOw.A03);
                                0eP A1L2 = AnonymousClass7TE.A1L("periodCount", Integer.valueOf(qOw.A00));
                                0eP A1L3 = AnonymousClass7TE.A1L("billingPeriod", qOw.A04);
                                0eP A1L4 = AnonymousClass7TE.A1L("billingPeriodValue", Integer.valueOf(qOw.A01));
                                String plainString = new BigDecimal(String.valueOf(((double) qOw.A02) / 1000000.0d)).toPlainString();
                                0qQ.A07(plainString);
                                arrayList.add(Pxh.A0v(A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("price", plainString)));
                            }
                        } else {
                            arrayList = null;
                        }
                        0eP A1L5 = AnonymousClass7TE.A1L("productID", next);
                        0eP A1L6 = AnonymousClass7TE.A1L("externalProductID", rrr.A05());
                        0eP A1L7 = AnonymousClass7TE.A1L("formattedPrice", rrr.A03());
                        String plainString2 = new BigDecimal(String.valueOf(((double) rrr.A01()) / 1000000.0d)).toPlainString();
                        0qQ.A07(plainString2);
                        A032.put(next, 0Yt.A07(new 0eP[]{A1L5, A1L6, A1L7, AnonymousClass7TE.A1L("amount", plainString2), AnonymousClass7TE.A1L("currencyCode", rrr.A04()), AnonymousClass7TE.A1L("offers", arrayList)}));
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        } else {
            map2.put("product_status", AnonymousClass000.A00(1039));
        }
        1IX r1 = this.A02;
        if (r1.isActive()) {
            r1.resumeWith((Object) null);
        }
    }
}
