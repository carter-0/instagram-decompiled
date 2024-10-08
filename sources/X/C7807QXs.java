package X;

/* renamed from: X.QXs  reason: case insensitive filesystem */
public final class C7807QXs extends C250663lr implements C13931TlZ {
    public final String Bb9() {
        return getOptionalStringField(7, "payout_batch_item_status_text");
    }

    public final C13926TlU Bb7() {
        return (C13926TlU) getOptionalTreeField(8, "payout_batch_item_payout_amount", C7803QXo.class, -1887400421);
    }

    public final RGV Bb8() {
        return (RGV) getOptionalEnumField(6, "payout_batch_item_status", RGV.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final C13928TlW BbC() {
        return (C13928TlW) getOptionalTreeField(10, "payout_detail_view", C7804QXp.class, -890672286);
    }

    public final C13929TlX BbF() {
        return (C13929TlX) getOptionalTreeField(11, "payout_method_view", C7805QXq.class, -1344103629);
    }

    public final C13927TlV BbG() {
        return (C13927TlV) getOptionalTreeField(9, "payout_records_b2c_tax_amount_sum", C7806QXr.class, -1002096339);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TF.A0I(r1), AnonymousClass7TE.A0f(r1, "bank_name"), AnonymousClass7TE.A0f(r1, "bank_account_number"), AnonymousClass7TE.A0f(r1, "paypal_email"), AnonymousClass7TE.A0f(r1, "payment_date"), AnonymousClass7TE.A0f(r1, "payment_id"), AnonymousClass7TE.A0f(r1, "payout_batch_item_status"), AnonymousClass7TE.A0f(r1, "payout_batch_item_status_text"), C41845B3m.A0C(C7803QXo.class, "payout_batch_item_payout_amount", -1887400421), C41845B3m.A0C(C7806QXr.class, "payout_records_b2c_tax_amount_sum", -1002096339), C41845B3m.A0C(C7804QXp.class, "payout_detail_view", -890672286), C41845B3m.A0C(C7805QXq.class, "payout_method_view", -1344103629)});
    }

    public final String Bb1() {
        return A0B("payment_date");
    }

    public final String Bb3() {
        return A0C("payment_id");
    }

    public final String getId() {
        return A07("strong_id__");
    }

    public C7807QXs(int i) {
        super(i);
    }

    public C7807QXs() {
        super(-424439604);
    }
}
