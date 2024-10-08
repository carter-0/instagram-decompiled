package X;

import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.70W  reason: invalid class name */
public final class AnonymousClass70W extends C253103qD {
    public final /* synthetic */ AnonymousClass70J A00;
    public final /* synthetic */ User A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass70W(AnonymousClass70J r3, User user, int i) {
        super("", i, false);
        this.A00 = r3;
        this.A01 = user;
    }

    public final void onClick(View view) {
        C50672FgX A02;
        AnonymousClass70J r0 = this.A00;
        if (r0 != null && (A02 = r0.A02()) != null) {
            A02.A06();
        }
    }
}
