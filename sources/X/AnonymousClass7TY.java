package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.sharetostory.data.MessageShareStickerData;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7TY  reason: invalid class name */
public final class AnonymousClass7TY implements 1wn {
    public final /* synthetic */ AnonymousClass7TI A00;

    public AnonymousClass7TY(AnonymousClass7TI r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        DirectThreadKey directThreadKey;
        int A03 = AnonymousClass0fD.A03(1151080386);
        AnonymousClass7O5 r15 = (AnonymousClass7O5) obj;
        int A032 = AnonymousClass0fD.A03(-1283715849);
        0qQ.A0B(r15, 0);
        AnonymousClass7TI r5 = this.A00;
        C254743sy A033 = AnonymousClass7TI.A03(r5);
        if (A033 != null) {
            directThreadKey = C66647MaG.A04(A033);
        } else {
            directThreadKey = null;
        }
        if (r15.A00 == C69251NiD.A0E && directThreadKey != null) {
            UserSession userSession = r5.A0d;
            C254703su BLN = 2L2.A00(userSession).BLN(directThreadKey);
            if (BLN != null) {
                DirectMessageIdentifier A0V = BLN.A0V();
                C41383At5 at5 = new C41383At5(r5);
                C333517Zg r0 = r5.A08;
                if (r0 == null) {
                    0qQ.A0F("clientInfra");
                    throw AnonymousClass00P.createAndThrow();
                }
                Capabilities AlE = r0.C6l().AlE();
                0qQ.A07(AlE);
                Integer num = AnonymousClass05K.A15;
                0qQ.A0B(userSession, 0);
                MessageShareStickerData A002 = OQZ.A00(userSession, AlE, DirectPromptTypes.UNKNOWN, A0V, num, (String) null, at5);
                if (A002 != null) {
                    OQZ.A01(r5.A0U.requireActivity(), userSession, A002, r5.A0D);
                }
            }
        }
        AnonymousClass0fD.A0A(1884828278, A032);
        AnonymousClass0fD.A0A(1097714806, A03);
    }
}
