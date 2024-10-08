package X;

import com.facebook.react.modules.intent.IntentModule;

public final class T6A implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IdVerificationLogger";
    public final 0wc A00;

    public final void A00(RDG rdg, RDI rdi, String str) {
        RDF rdf;
        if (str == null) {
            rdf = RDF.A02;
        } else if (str.equals("idv_reactive")) {
            rdf = RDF.A01;
        } else {
            return;
        }
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ig_idv_client");
        A0e.A8M(rdf.A00, "product");
        A0e.A8M(rdg.A00, "action");
        A0e.A8M(rdi.A00, "screen");
        A0e.AAJ(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, (String) null);
        A0e.Cgf();
    }

    public final String getModuleName() {
        return "id_verification";
    }

    public T6A(0lg r2) {
        this.A00 = AnonymousClass0kN.A01(this, r2);
    }
}
