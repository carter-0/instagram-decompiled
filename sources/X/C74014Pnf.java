package X;

import com.instagram.direct.msys.reverb.ReverbMessage;

/* renamed from: X.Pnf  reason: case insensitive filesystem */
public final class C74014Pnf extends 0Yg implements 0sP {
    public static final C74014Pnf A00 = new C74014Pnf();

    public C74014Pnf() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ReverbMessage reverbMessage = (ReverbMessage) obj;
        0qQ.A0B(reverbMessage, 0);
        String messageId = reverbMessage.getMessageId();
        if (messageId == null) {
            return "";
        }
        return messageId;
    }
}
