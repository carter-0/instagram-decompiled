package X;

import android.view.View;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.direct.model.messaginguser.MessagingUser;

/* renamed from: X.7Bm  reason: invalid class name and case insensitive filesystem */
public final class C327617Bm implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7D3 A00;
    public final /* synthetic */ C328557Fg A01;

    public C327617Bm(AnonymousClass7D3 r1, C328557Fg r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-213639785);
        AnonymousClass7D3 r2 = this.A00;
        AnonymousClass7VW r6 = r2.A01;
        if (r6 != null) {
            C328557Fg r7 = this.A01;
            C328547Ff r1 = r7.A01;
            0qQ.A0C(r1, "null cannot be cast to non-null type com.instagram.direct.messagethread.senderavatar.model.SenderAvatarViewModel.Visibility.Visible");
            MessagingUser messagingUser = ((AnonymousClass7G5) r1).A00;
            if (messagingUser.A01 == IGAIAgentType.A06) {
                if (182.A06(0Tu.A05, r2.A00, 36330316608062008L)) {
                    0qQ.A0A(view);
                    r6.Cq2(view, messagingUser);
                } else {
                    r6.CfT(r7.A00, messagingUser);
                }
            } else {
                r6.CqM(messagingUser, "direct_thread_sender_avatar");
            }
        }
        AnonymousClass0fD.A0C(1333675778, A05);
    }
}
