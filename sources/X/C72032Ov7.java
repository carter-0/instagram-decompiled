package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ov7  reason: case insensitive filesystem */
public final /* synthetic */ class C72032Ov7 implements AnonymousClass68Z {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C304566Ea A01;
    public final /* synthetic */ List A02;

    public /* synthetic */ C72032Ov7(C304566Ea r1, List list, long j) {
        this.A01 = r1;
        this.A02 = list;
        this.A00 = j;
    }

    public final Object apply(Object obj) {
        List<MsysPendingRecipient> list = this.A02;
        long j = this.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (MsysPendingRecipient msysPendingRecipient : list) {
            0qQ.A0B(msysPendingRecipient, 0);
            A1C.add(1aU.A09(new MessagingUser((IGAIAgentType) null, Long.valueOf(msysPendingRecipient.A01), msysPendingRecipient.A07, msysPendingRecipient.A00, true)));
        }
        return 1aU.A05(new C72118Owd(23), A1C).A0M(new C72025Ouz(j, obj, 1));
    }
}
