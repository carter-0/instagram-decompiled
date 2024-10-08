package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.PHq  reason: case insensitive filesystem */
public final class C72736PHq implements MVB {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C56058Hs7 A04;
    public final /* synthetic */ 1pX A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void onDismiss() {
    }

    public final /* synthetic */ void onTextClick(View view) {
    }

    public C72736PHq(Context context, AnonymousClass0iw r2, UserSession userSession, User user, C56058Hs7 hs7, 1pX r6, String str, String str2) {
        this.A04 = hs7;
        this.A06 = str;
        this.A05 = r6;
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = r2;
        this.A03 = user;
        this.A07 = str2;
    }

    public final void onButtonClick(View view) {
        this.A04.A02("upsell_snackbar", this.A06, "comment_deletion_block", "contextual_upsell_tap");
        1pX r4 = this.A05;
        1pX.A00(this.A00, this.A01, this.A02, this.A03, r4, "comment_deletion_toast_upsell", this.A07);
    }

    public final void onShow() {
        this.A04.A01("upsell_snackbar", this.A06, "comment_deletion_block");
        1pX.A01(this.A02, AnonymousClass05K.A01, "toast");
    }
}
