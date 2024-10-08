package X;

import android.view.View;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.ANf  reason: case insensitive filesystem */
public final /* synthetic */ class C39999ANf implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass74j A00;
    public final /* synthetic */ AnonymousClass79E A01;

    public /* synthetic */ C39999ANf(AnonymousClass74j r1, AnonymousClass79E r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        C254793t3 r3;
        AnonymousClass74j r1 = this.A00;
        AnonymousClass79E r4 = this.A01;
        MessagingUser messagingUser = r4.A03;
        if (messagingUser != null && messagingUser.A04) {
            Long l = r4.A0B;
            if (l != null) {
                messagingUser = new MessagingUser((IGAIAgentType) null, l, messagingUser.A03, 1, true);
            }
            ((AnonymousClass7VW) r1.A0A).CqM(messagingUser, "direct_thread_context");
        } else if (r4.A0P && (r3 = r4.A05) != null) {
            r1.A0A.Cpm(r3, r4.A01, r4.A0U);
        }
    }
}
