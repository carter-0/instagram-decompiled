package X;

import android.content.Context;
import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public final class PCF implements C74335PtB {
    public final AnonymousClass9HC A00;
    public final AnonymousClass7L2 A01;

    public final ArrayList AWi(Context context, C61084JwM jwM, C74541Pwa pwa, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, C74552Pwl pwl2, Map map, Set set, Set set2) {
        N8N A002;
        String str;
        IGAIAgentType iGAIAgentType;
        ArrayList A1C = AnonymousClass7TE.A1C();
        OMF omf2 = omf;
        0qQ.A0B(omf2, 0);
        if (omf2.A00.mResultSet.getInteger(0, 17) != 15) {
            C74552Pwl pwl3 = pwl;
            int count = pwl3.getCount();
            for (int i = 0; i < count; i++) {
                if (pwl3.BSR(i) == 0) {
                    boolean A1R = AnonymousClass7TF.A1R(pwl3.Azt(i));
                    C74541Pwa pwa2 = pwa;
                    N8N A003 = C70100NxG.A00(pwa2, pwl3, i);
                    if (i == 0) {
                        A002 = null;
                    } else {
                        A002 = C70100NxG.A00(pwa2, pwl3, i - 1);
                    }
                    if (AnonymousClass7F1.A00(messagingUser, A003, A002, C327657Br.A00().A01(OZ6.A00(pwa2, pwl3, i)), true, AnonymousClass7TF.A1V(pwl3.BmP(i)), pwl3.CTx(i), false, false, A1R, false, false)) {
                        long A004 = C74552Pwl.A00(pwl3, i);
                        User user = (User) map.get(pwl3.BsK(i));
                        if (user != null) {
                            str = AnonymousClass50n.A08(user);
                        } else {
                            str = "";
                        }
                        0qQ.A0A(str);
                        AnonymousClass7L2 r9 = this.A01;
                        int i2 = r9.A00;
                        C327637Bp r14 = new C327637Bp(A004, 0);
                        if (user != null) {
                            iGAIAgentType = user.A03.AaX();
                        } else {
                            iGAIAgentType = null;
                        }
                        int i3 = i2;
                        AnonymousClass7F4 r12 = new AnonymousClass7F4((C376629Is) null, r14, (MessageIdentifier) null, str, (String) null, (String) null, i3, i2, 8388611, A004, A1R, false, AnonymousClass7TF.A1W(iGAIAgentType, IGAIAgentType.A04), r9.A00(), false);
                        String BSF = pwl3.BSF(i);
                        OTT.A00(AnonymousClass05K.A0C, MessageFormat.format("username_{0}", new Object[]{BSF}), r12, BSF, A1C);
                    }
                }
            }
        }
        return A1C;
    }

    public PCF(AnonymousClass9HC r1, AnonymousClass7L2 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
