package X;

import java.util.Set;

public final class TU3 extends 0Yg implements C62320sa {
    public static final TU3 A00 = new TU3();

    public TU3() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass0eM r6 = STI.A0C;
        return 0Yt.A05(new 0eP[]{AnonymousClass7TE.A1L("cc-number", Pxh.A0z("cc[_\\-\\s]?num|card[_\\-\\s]?no|number[_\\-\\s]?cc|card[_\\-\\s]?num|num.*card|cc[_\\-\\s]?no|credit[_\\-\\s]?num|num.*cartao|numer[_\\-\\s]?karty|n[uú]m[eé]ro.+tarjeta|n[uú]m[eé]ro.+carte|\n^[0123456789xX•]{4}[- ][0123456789xX•]{4}[- ][0123456789xX•]{4}[- ][0123456789xX•]{4}$|^ccpan$|^paymentformpan$|^pan$|^card[_\\-\\s]?pan$", (Set) r6.getValue())), AnonymousClass7TE.A1L("cc-csc", Pxh.A0z("cc[\\-_\\s]?csc|card.*code|payment[\\-_\\s:]?ccv|cv[vnc]|secur.*code|card.*secur|(?=.*cartao)(.*codigo)|vericacao|cod.*segur", (Set) r6.getValue())), AnonymousClass7TE.A1L("cc-exp-month", Pxh.A0z("exp[\\-_\\s]?month|expir.*month|post.*month|card.*month|expm|expmm|mmexp|duedatemonth|ddlexpiremm|ddlccmonth", (Set) r6.getValue())), AnonymousClass7TE.A1L("cc-exp-year", Pxh.A0z("exp.*year|expir.*year|credit.*card.*year|post.*year|card.*year|expy|expyy|myexp|duedateyear|ddlexpireyy|ddlccyear", (Set) r6.getValue())), AnonymousClass7TE.A1L("cc-exp", Pxh.A0z("ccexp|expirydate|expiry|expiration|^expire$|^expiracy$|expiraci[oó]?n|expirare|expirace|vigencia|expir.*date|exp.*date|card.*expir|(card|expir).*(.)\\2 *[/] *(.)\\3\\3?\\3?|mmaa|mmyy|aayy|(?=.*card)(.*date)|valida[dt]e|card.*validity|validdate|duedate|cdate|cardexp.*|vencimento|sonkullanmatarihi|cardmonthyear", (Set) r6.getValue()))});
    }
}
