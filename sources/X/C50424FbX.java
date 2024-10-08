package X;

import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.FbX  reason: case insensitive filesystem */
public final class C50424FbX implements C51928G7w {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Fragment A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C49677F1j A04;
    public final /* synthetic */ FC5 A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ String A07;

    public C50424FbX(Context context, Fragment fragment, UserSession userSession, C49677F1j f1j, FC5 fc5, Integer num, String str, int i) {
        this.A00 = i;
        this.A02 = fragment;
        this.A03 = userSession;
        this.A05 = fc5;
        this.A06 = num;
        this.A01 = context;
        this.A04 = f1j;
        this.A07 = str;
    }

    public final void DNf() {
        Dialog dialog = this.A04.A00;
        if (dialog == null) {
            0qQ.A0F("dialog");
            throw AnonymousClass00P.createAndThrow();
        }
        dialog.dismiss();
        Context context = this.A01;
        UserSession userSession = this.A03;
        Dbb.A0k(context, userSession, 2EG.A1x, this.A07);
        C49762F5o.A00(userSession, AnonymousClass05K.A00, AnonymousClass05K.A0Y, this.A06);
    }

    public final void DZL() {
        int i = this.A00;
        Fragment fragment = this.A02;
        UserSession userSession = this.A03;
        if (i == 3) {
            C49761F5n.A01(fragment, userSession, AnonymousClass05K.A0N);
            FC5.A01(userSession);
        } else {
            C49761F5n.A01(fragment, userSession, AnonymousClass05K.A01);
        }
        C49762F5o.A00(userSession, AnonymousClass05K.A01, AnonymousClass05K.A0Y, this.A06);
    }

    public final void Di4() {
        Integer num;
        int i = this.A00;
        if (i == 3) {
            UserSession userSession = this.A03;
            FC5.A01(userSession);
            C309516Yo A0Q = DbU.A0Q(this.A02.requireActivity(), userSession);
            A0Q.A0D(C48883Elj.A00().A00.A00(this.A01, userSession, AnonymousClass05K.A0u));
            A0Q.A04();
        }
        UserSession userSession2 = this.A03;
        if (i == 3) {
            num = AnonymousClass05K.A0N;
        } else {
            num = AnonymousClass05K.A0C;
        }
        C49762F5o.A00(userSession2, num, AnonymousClass05K.A0Y, this.A06);
    }

    public final void onCancel() {
        if (this.A00 == 3) {
            UserSession userSession = this.A03;
            0xa A0q = AnonymousClass7TE.A0q(userSession);
            AnonymousClass7TG.A1L(A0q.AR4(), A0q, "hidden_word_spam_scam_consent", 0);
            if (A0q.getInt("hidden_word_spam_scam_consent", 0) >= 2) {
                C49761F5n.A01(this.A02, userSession, AnonymousClass05K.A0N);
            }
        }
        C49762F5o.A00(this.A03, AnonymousClass05K.A0C, AnonymousClass05K.A0Y, this.A06);
    }
}
