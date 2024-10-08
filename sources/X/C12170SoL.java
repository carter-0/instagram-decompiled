package X;

/* renamed from: X.SoL  reason: case insensitive filesystem */
public final class C12170SoL implements C13712Tfa {
    public final /* synthetic */ T69 A00;
    public final /* synthetic */ String A01;

    public C12170SoL(T69 t69, String str) {
        this.A00 = t69;
        this.A01 = str;
    }

    public final void Ew3(String str, Throwable th) {
        String str2;
        if (1AW.A06(0Tu.A05, 2324153322380013847L)) {
            0lg r5 = this.A00.A01;
            String A0R = 002.A0R("InstallReferrerRegistrar_OXYGEN_SDK_INTERNAL_SOFT_ERROR_", str);
            String str3 = this.A01;
            0qQ.A0B(A0R, 0);
            if (th == null || (str2 = th.getMessage()) == null) {
                str2 = "";
            }
            String A11 = 002.A11(A0R, " : ", "internal soft-error without message", " : ", str2);
            String A0o = Pxg.A0o(r5);
            1Ln A0N = Pxh.A0N(r5, A11);
            if (A0o != null) {
                A0N.A0R("pigeon_session_id", A0o);
            }
            Pxh.A1A(A0N, str3, (String) null);
        }
    }

    public final void Ew0(String str, String str2) {
        throw AnonymousClass00P.createAndThrow();
    }
}
