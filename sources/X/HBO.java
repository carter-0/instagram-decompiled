package X;

import com.instagram.friendmap.data.FriendMapAudienceListRepository;
import java.util.concurrent.CancellationException;

public final class HBO extends MYL {
    public C262204Co A00;
    public final FriendMapAudienceListRepository A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HBO(FriendMapAudienceListRepository friendMapAudienceListRepository) {
        super(new C53545GqG("", 0sn.A00, true, false, false, false, false, false, false, false));
        this.A01 = friendMapAudienceListRepository;
        C318136oS A002 = C318116oQ.A00(this);
        MG8 mg8 = new MG8(this, (AnonymousClass4D7) null, 21);
        19B r3 = 19B.A00;
        1Eo.A05(r3, new MG8(this, (AnonymousClass4D7) null, 22), C51967G9n.A0M(this, r3, mg8, A002));
    }

    public final void A0S(String str) {
        A0R(new MYK(str, 33));
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A13 = Dbc.A13(str, i2);
            if (z) {
                if (!A13) {
                    break;
                }
                length--;
            } else if (!A13) {
                z = true;
            } else {
                i++;
            }
        }
        if (Dba.A0c(str, length, i).length() == 0) {
            A00(this, "");
            return;
        }
        C262204Co r0 = this.A00;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        this.A00 = C51966G9m.A1L(new MG8(this, (AnonymousClass4D7) null, 24), C318116oQ.A00(this));
    }

    public static final void A00(HBO hbo, String str) {
        AnonymousClass7TE.A1Z(new MFW(hbo, str, (AnonymousClass4D7) null, 43), C318116oQ.A00(hbo));
    }
}
