package X;

/* renamed from: X.Vg0  reason: case insensitive filesystem */
public final class C17788Vg0 {
    public final /* synthetic */ C307786Rm A00;
    public final /* synthetic */ C276544tV A01;

    public C17788Vg0(C307786Rm r1, C276544tV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(Integer num, String str) {
        String str2;
        C307786Rm r4 = this.A00;
        C276544tV r2 = this.A01;
        switch (num.intValue()) {
            case 0:
                str2 = "EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_START";
                break;
            case 1:
                str2 = "EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_END";
                break;
            case 2:
                str2 = "EDITOR_SCREEN_PREVIEW_EFFECT_LOAD_FAILED";
                break;
            case 3:
                str2 = "EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_START";
                break;
            case 4:
                str2 = "EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_END";
                break;
            case 5:
                str2 = "EDITOR_SCREEN_PREVIEW_AVATAR_LOAD_FAILED";
                break;
            case 6:
                str2 = "EDITOR_SCREEN_PREVIEW_NOT_ON_SUPPORTED_NETWORK";
                break;
            case 7:
                str2 = "EDITOR_SCREEN_PREVIEW_RENDERING_TIMEOUT";
                break;
            case 8:
                str2 = "EDITOR_SCREEN_PREVIEW_INITIAL_CHECK_FAILED";
                break;
            case 9:
                str2 = "EDITOR_SCREEN_PREVIEW_NOT_ON_SUPPORTED_NETWORK_INITIAL";
                break;
            default:
                str2 = "EDITOR_SCREEN_PREVIEW_LOW_MEMORY";
                break;
        }
        C277014uI A0A = r2.A0A(44);
        if (A0A != null) {
            AnonymousClass4CZ r0 = AnonymousClass12W.A01;
            AnonymousClass7TE.A1Z(new C73557Pf9(r2, A0A, r4, str2, str, (AnonymousClass4D7) null, 0), 19E.A02(AnonymousClass12y.A00));
        }
    }
}
