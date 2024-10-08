package X;

import java.util.Set;

public final class TU1 extends 0Yg implements C62320sa {
    public static final TU1 A00 = new TU1();

    public TU1() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass0eM r5 = STI.A0C;
        return 0Yt.A05(AnonymousClass7TH.A0h("ml-cc-csc", Pxh.A0z("cc[\\-_\\s]?csc|card.*code|payment[\\-_\\s:]?ccv|cv[vnc]|secur.*code|card.*secur|(?=.*cartao)(.*codigo)|vericacao|cod.*segur", (Set) r5.getValue()), AnonymousClass7TE.A1L("ml-cc-exp-month", Pxh.A0z("exp[\\-_\\s]?month|expir.*month|post.*month|card.*month|expm|expmm|mmexp|duedatemonth|ddlexpiremm|ddlccmonth", (Set) r5.getValue())), AnonymousClass7TE.A1L("ml-cc-exp-year", Pxh.A0z("exp.*year|expir.*year|credit.*card.*year|post.*year|card.*year|expy|expyy|myexp|duedateyear|ddlexpireyy|ddlccyear", (Set) r5.getValue())), AnonymousClass7TE.A1L("ml-cc-exp", Pxh.A0z("ccexp|expirydate|expiry|expiration|^expire$|^expiracy$|expiraci[oó]?n|expirare|expirace|vigencia|expir.*date|exp.*date|card.*expir|(card|expir).*(.)\\2 *[/] *(.)\\3\\3?\\3?|mmaa|mmyy|aayy|(?=.*card)(.*date)|valida[dt]e|card.*validity|validdate|duedate|cdate|cardexp.*|vencimento|sonkullanmatarihi|cardmonthyear", (Set) r5.getValue()))));
    }
}
