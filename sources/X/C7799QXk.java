package X;

/* renamed from: X.QXk  reason: case insensitive filesystem */
public final class C7799QXk extends C250663lr implements C250673ls {
    public final QXE A0E() {
        return (QXE) A04(QXE.class, "credential_response", -652834860);
    }

    public final QXF A0F() {
        return (QXF) getOptionalTreeField(4, "email_response", QXF.class, 1271676528);
    }

    public final QXG A0G() {
        return (QXG) getOptionalTreeField(6, "payer_name_response", QXG.class, 59502682);
    }

    public final QXH A0H() {
        return (QXH) getOptionalTreeField(5, "phone_response", QXH.class, 1293577252);
    }

    public final QRV A0I() {
        return (QRV) getOptionalTreeField(3, "shipping_address_response", QRV.class, -636847671);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "actor_id"), AnonymousClass7TE.A0f(r1, "client_mutation_id"), C41845B3m.A0C(QXE.class, "credential_response", -652834860), C41845B3m.A0C(QRV.class, "shipping_address_response", -636847671), C41845B3m.A0C(QXF.class, "email_response", 1271676528), C41845B3m.A0C(QXH.class, "phone_response", 1293577252), C41845B3m.A0C(QXG.class, "payer_name_response", 59502682)});
    }

    public C7799QXk(int i) {
        super(i);
    }

    public C7799QXk() {
        super(-1782335130);
    }
}
