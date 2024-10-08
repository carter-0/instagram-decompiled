package X;

import com.instagram.api.schemas.XFBFXIGPCEntryPoint;

/* renamed from: X.Ecd  reason: case insensitive filesystem */
public abstract class C48320Ecd {
    public static 1OC A00(C61080JwI jwI, AnonymousClass0wW r4) {
        1NY A0a = AnonymousClass7TG.A0a(r4);
        A0a.A02();
        A0a.A0A("api/v1/fxcal/igpc_trigger_upsell/");
        A0a.A0Q(C47300DuT.class, F4E.class);
        1OC A0T = DbT.A0T(A0a, "upsell_entrypoint", ((XFBFXIGPCEntryPoint) jwI.A00).A00);
        0qQ.A0C(A0T, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.FXCALIGPCUpsellResponse>>");
        return A0T;
    }
}
