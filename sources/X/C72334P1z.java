package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;

/* renamed from: X.P1z  reason: case insensitive filesystem */
public final class C72334P1z implements C74391Pu7 {
    public final /* synthetic */ NKI A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;

    public C72334P1z(NKI nki, DirectThreadThemeInfo directThreadThemeInfo) {
        this.A00 = nki;
        this.A01 = directThreadThemeInfo;
    }

    public final void D0V() {
        NKI nki = this.A00;
        if (nki.A0E) {
            UserSession A0l = AnonymousClass7TE.A0l(nki.A0Q);
            String str = this.A01.A0o;
            String str2 = nki.A0A;
            AnonymousClass7TG.A1N(A0l, str);
            C48823Ekl.A00(nki, A0l, "branded_chat_theme_preview", "click", "cancel_button", str2, AnonymousClass7TF.A0w("theme", str));
        }
        AnonymousClass37D A0i = DbX.A0i(nki);
        if (A0i != null) {
            A0i.A0X();
        }
    }

    public final void DjZ() {
        NKI nki = this.A00;
        if (nki.A0E) {
            UserSession A0l = AnonymousClass7TE.A0l(nki.A0Q);
            String str = this.A01.A0o;
            String str2 = nki.A0A;
            AnonymousClass7TG.A1N(A0l, str);
            C48823Ekl.A00(nki, A0l, "branded_chat_theme_preview", "click", "add_button", str2, AnonymousClass7TF.A0w("theme", str));
        }
        NKI.A06(nki, this.A01, false);
    }
}
