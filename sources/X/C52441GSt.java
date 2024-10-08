package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.GSt  reason: case insensitive filesystem */
public final class C52441GSt implements C74507Pw2 {
    public final C267614bu A00;
    public final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r1 == 0) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CQM(com.instagram.common.session.UserSession r3, com.instagram.user.model.User r4) {
        /*
            r2 = this;
            r0 = 0
            X.0qQ.A0B(r3, r0)
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r3)
            java.lang.String r0 = r0.getFullName()
            if (r0 == 0) goto L_0x0015
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0015:
            r0 = 1
        L_0x0016:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52441GSt.CQM(com.instagram.common.session.UserSession, com.instagram.user.model.User):boolean");
    }

    public final boolean Esw(Context context, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        return C51973G9u.A1Z(1Au.A00(userSession), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    public final int BEI() {
        if (this.A01) {
            return R.drawable.activation_card_name_redesign;
        }
        return R.drawable.activation_card_name;
    }

    public final String Beb() {
        return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
    }

    public final void Czh() {
        this.A00.DTV();
    }

    public C52441GSt(C267614bu r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final int Ait() {
        return 2131952176;
    }

    public final int Apb() {
        return 2131952175;
    }

    public final int Apc() {
        return 2131952178;
    }

    public final int C2e() {
        return 2131952177;
    }

    public final int getTitleRes() {
        return 2131952178;
    }

    public final /* synthetic */ float Aii(UserSession userSession) {
        return 1.0f;
    }
}
