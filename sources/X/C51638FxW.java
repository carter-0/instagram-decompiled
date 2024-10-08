package X;

import android.net.Uri;
import java.util.HashMap;

/* renamed from: X.FxW  reason: case insensitive filesystem */
public final class C51638FxW extends HashMap {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51638FxW(C47354Dvo dvo, EQZ eqz) {
        this.A00 = 2;
        this.A01 = eqz;
        this.A02 = dvo;
        put("url", dvo.A00);
        put("contentType", "INVITE_CONTACT");
        put("inviteLocation", eqz.A01.A00);
        put("isContactSynced", String.valueOf(C267044ar.A01(eqz.A00.getContext(), eqz.A03)));
    }

    public C51638FxW(C47995EQe eQe, C47354Dvo dvo, int i) {
        this.A00 = i;
        this.A01 = eQe;
        this.A02 = dvo;
        put("url", dvo.A00);
    }

    public C51638FxW(Uri uri, C18608Vv1 vv1, String str) {
        this.A00 = 0;
        this.A01 = vv1;
        this.A02 = uri;
        put("action", str);
        put("map_uri", uri.toString());
    }

    public C51638FxW(C47354Dvo dvo, C47996EQf eQf) {
        this.A00 = 3;
        this.A01 = eQf;
        this.A02 = dvo;
        put("url", dvo.A00);
    }

    public C51638FxW(C268194cw r2, ELT elt) {
        this.A00 = 1;
        this.A01 = elt;
        this.A02 = r2;
        DbW.A1Q(r2, this);
    }
}
