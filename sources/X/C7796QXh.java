package X;

/* renamed from: X.QXh  reason: case insensitive filesystem */
public final class C7796QXh extends C250663lr implements C250673ls {
    public final QTV A0E() {
        return (QTV) getOptionalTreeField(10, "transaction_amount_with_entities", QTV.class, -166677703);
    }

    public final QTW A0F() {
        return (QTW) getOptionalTreeField(11, "transaction_status_and_date", QTW.class, -1456144970);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r2, "receiver_name"), AnonymousClass7TE.A0f(r2, "receiver_profile_image_uri"), AnonymousClass7TE.A0f(r2, "creation_date"), AnonymousClass7TE.A0f(r2, "transaction_amount_formatted"), AnonymousClass7TE.A0f(r2, "transaction_amount_subtitle"), AnonymousClass7TE.A0f(r2, "transaction_payment_type"), AnonymousClass7TE.A0f(r2, "transaction_id"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "show_legacy_receipt_view"), AnonymousClass7TE.A0f(r2, "legacy_receipt_view_uri"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A02(), "transaction_item_images"), C41845B3m.A0C(QTV.class, "transaction_amount_with_entities", -166677703), C41845B3m.A0C(QTW.class, "transaction_status_and_date", -1456144970), C41845B3m.A0C(QTU.class, "open_receipt_action", -441181603)});
    }

    public C7796QXh(int i) {
        super(i);
    }

    public C7796QXh() {
        super(1809617422);
    }
}
