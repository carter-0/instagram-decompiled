package X;

import android.content.Context;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class PC5 implements C74407PuN {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final OLP A04;

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        0qQ.A0B(pwl, 0);
        if (pwl.BdW(i) == null || OZ6.A00(pwa, pwl, i) != 2FW.A0k) {
            return false;
        }
        return true;
    }

    public final OTT AWh(Context context, C61084JwM jwM, C74541Pwa pwa, MessagingUser messagingUser, OMF omf, C74552Pwl pwl, Map map, Set set, int i, boolean z) {
        AnonymousClass77A r25;
        OMF omf2 = omf;
        AnonymousClass7TG.A1N(context, omf2);
        MessagingUser messagingUser2 = messagingUser;
        C74552Pwl pwl2 = pwl;
        Map map2 = map;
        Set set2 = set;
        C51974G9v.A0d(2, pwl2, messagingUser2, set2, map2);
        int i2 = i;
        pwl2.BsH(i2);
        OLP olp = this.A04;
        2FW r19 = 2FW.A0k;
        C74541Pwa pwa2 = pwa;
        C328607Fl A002 = olp.A00(pwa2, (C3262275x) null, (C3255473b) null, messagingUser2, omf2, pwl2, r19, set2, i2);
        UserSession userSession = this.A01;
        AnonymousClass7L2 r10 = this.A03;
        AnonymousClass9HC r8 = this.A02;
        AnonymousClass7FE A003 = C70101NxH.A00(pwa2, r8, r10, messagingUser2, pwl2, false, (Boolean) null, AnonymousClass0eN.A01(C73796Pjv.A00), i2);
        boolean A042 = C71095OcV.A04(userSession, omf2, map2);
        boolean A012 = OPx.A01(omf2);
        omf2.A00();
        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("instagram://msys_thread/%s/group_polls/%s", new Object[]{Long.valueOf(pwl2.C6J(i2)), pwl2.BdW(i2)});
        0qQ.A0A(formatStrLocaleSafe);
        AnonymousClass9J6 A0F = C66584MXp.A0F(messagingUser2, formatStrLocaleSafe);
        Context context2 = this.A00;
        List A1I = AnonymousClass7TE.A1I(new AnonymousClass9JN((Integer) null, AnonymousClass7TE.A16(context2, 2131960021), "web_url", formatStrLocaleSafe, (String) null, (String) null));
        DirectMessageIdentifier directMessageIdentifier = new DirectMessageIdentifier((2FW) null, pwl2.BSF(i2), (String) null);
        C254883tD r27 = C254883tD.SINGLE;
        String BdZ = pwl2.BdZ(i2);
        if (BdZ == null) {
            BdZ = "";
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C68140N2g("Dummy Option 1", AnonymousClass7TE.A1I(DbS.A0V("")), 100, 0));
        A1C.add(new C68140N2g("Dummy Option 2", AnonymousClass7TE.A1I(DbS.A0V("")), 50, 0));
        A1C.add(new C68140N2g("Dummy Option 3", AnonymousClass7TE.A1I(DbS.A0V("")), 0, 0));
        Long BdW = pwl2.BdW(i2);
        if (BdW != null) {
            r25 = new AnonymousClass77A((ImageUrl) null, BdZ, (String) null, A1C, BdW.longValue());
        } else {
            r25 = null;
        }
        return new OTT(AnonymousClass05K.A00, C71095OcV.A02(pwl2, i2), new N6K(new AnonymousClass741(A002, new C328667Fr((C376649Iu) null, (C376649Iu) null, (AnonymousClass9J0) null, A0F, (AnonymousClass9J6) null, (AnonymousClass9J6) null, (C61062Jw0) null, (C3259574v) null, C71136Ode.A00(context2, r8, messagingUser2, pwl2, r19, C73795Pju.A00, i2, A042, A012), A003, (AnonymousClass74T) null, (AnonymousClass774) null, (AnonymousClass777) null, (AnonymousClass778) null, r25, (AnonymousClass5FY) null, r27, (AnonymousClass779) null, directMessageIdentifier, (C254793t3) null, (GifUrlImpl) null, (ImageInfo) null, (CharSequence) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, A1I, (List) null, (List) null, 0, 0, 0, false, false, false, false, false, false, false, false, false, false), pwl2.BSF(i2))), (Object) null);
    }

    public PC5(Context context, UserSession userSession, AnonymousClass9HC r4, AnonymousClass7L2 r5) {
        this.A00 = context;
        this.A03 = r5;
        this.A01 = userSession;
        this.A02 = r4;
        this.A04 = C70095NxB.A00(context, userSession, r4, r5);
    }
}
