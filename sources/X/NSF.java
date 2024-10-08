package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.direct.model.mentions.SendMentionData$MentionData;
import java.util.List;

public final class NSF extends 0ng {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass1bd A01;
    public final /* synthetic */ C254783t2 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSF(UserSession userSession, AnonymousClass1bd r5, C254783t2 r6) {
        super(2005773668, 4, false, false);
        this.A01 = r5;
        this.A00 = userSession;
        this.A02 = r6;
    }

    public final void run() {
        UserSession userSession = this.A00;
        1cE r3 = new 1cE((N49) null, (C70766OKm) null, (C254933tI) null, (SendMentionData$MentionData) null, C66669Mac.A01(userSession, (C70621ODs) null, (Boolean) null, 1cE.class, (String) null, (String) null, (String) null, false, false), (OCA) null, (C69343Nji) null, AnonymousClass6W4.A01(AnonymousClass6W3.A01(this.A02)), (2FW) null, (AnonymousClass3Q2) null, false, (Boolean) null, (Boolean) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, Long.valueOf(AnonymousClass7TG.A0H()), (Long) null, "empty", NetInfoModule.CONNECTION_TYPE_NONE, (String) null, (String) null, (String) null, (List) null, (List) null, false);
        if (AnonymousClass796.A01(userSession, r3).A00()) {
            new OMW(userSession).A00((CommonMediaTransport) null, (DirectForwardingParams) null, r3);
        }
    }
}
