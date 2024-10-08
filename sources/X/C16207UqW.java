package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.UqW  reason: case insensitive filesystem */
public final class C16207UqW extends C15286UZq {
    public static final String __redex_internal_original_name = "ForYouSerpGridFragment";
    public final C20911X4c A00 = new C14495TxH(this, 3);
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C13998To0(this, 2));

    public final String getModuleName() {
        return "serp_top";
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        String str;
        super.onSetUserVisibleHint(z, z2);
        if (z) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A0m);
            if (182.A06(AnonymousClass7TF.A0H(A0l), A0l, 36328340923170038L) && (str = A06().A0F) != null) {
                C67757MuC A07 = A07();
                String A0a = C13988Tno.A0a(this);
                AnonymousClass7TE.A1Z(new MFe((Object) A07, str, A0a, (AnonymousClass4D7) null, 18), C318116oQ.A00(A07));
            }
        }
    }
}
