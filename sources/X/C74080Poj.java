package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.user.model.User;

/* renamed from: X.Poj  reason: case insensitive filesystem */
public final class C74080Poj extends 0Yg implements 0sP {
    public static final C74080Poj A00 = new C74080Poj();

    public C74080Poj() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        User A0Q = AnonymousClass7TF.A0Q(C66581MXm.A0Q(obj));
        if (A0Q.BST() == null) {
            DbT.A1Q(0wj.A01, "messaging_user_fbid_null", 20134884);
        }
        MsysPendingRecipient A002 = OXK.A00(A0Q);
        return 1aU.A09(new MessagingUser((IGAIAgentType) null, Long.valueOf(A002.A01), A002.A07, A002.A00, true));
    }
}
