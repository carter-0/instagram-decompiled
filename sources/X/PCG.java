package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.direct.model.messaginguser.MessagingUser;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public final class PCG implements C74335PtB {
    public final C46539Dgg A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7L2 A02;

    public final ArrayList AWi(Context context, C61084JwM jwM, C74541Pwa pwa, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, C74552Pwl pwl2, Map map, Set set, Set set2) {
        N8N A002;
        ArrayList A1C = AnonymousClass7TE.A1C();
        C74552Pwl pwl3 = pwl;
        int count = pwl3.getCount();
        for (int i = 0; i < count; i++) {
            if (pwl3.BSR(i) == 0) {
                C74541Pwa pwa2 = pwa;
                N8N A003 = C70100NxG.A00(pwa2, pwl3, i);
                if (i == 0) {
                    A002 = null;
                } else {
                    A002 = C70100NxG.A00(pwa2, pwl3, i - 1);
                }
                boolean A004 = AnonymousClass7F0.A00(A003, A002, C327657Br.A00().A01(OZ6.A00(pwa2, pwl3, i)));
                boolean A0K = 0qQ.A0K(this.A00.A01, pwl3.BSF(i));
                if (A004 || A0K) {
                    long A005 = C74552Pwl.A00(pwl3, i);
                    String A006 = AnonymousClass7F5.A00(context, A005);
                    String BSF = pwl3.BSF(i);
                    Integer A0j = JTP.A0j(A004 ? 1 : 0);
                    AnonymousClass7L2 r6 = this.A02;
                    AnonymousClass7O6 r62 = new AnonymousClass7O6((Drawable) null, new C327637Bp(A005, 0), A0j, BSF, A006, r6.A00, A005, false, r6.A00());
                    OTT.A00(AnonymousClass05K.A0C, MessageFormat.format("timestamp_{0}", new Object[]{BSF}), r62, BSF, A1C);
                }
            }
        }
        return A1C;
    }

    public PCG(C46539Dgg dgg, AnonymousClass9HC r2, AnonymousClass7L2 r3) {
        this.A01 = r2;
        this.A00 = dgg;
        this.A02 = r3;
    }
}
