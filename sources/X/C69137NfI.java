package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.rtc.rsys.models.ParticipantModel;
import com.instagram.user.model.User;
import java.util.Set;

/* renamed from: X.NfI  reason: case insensitive filesystem */
public final class C69137NfI extends OTZ {
    public int A00;
    public long A01;
    public N9E A02;
    public N9H A03;
    public Set A04;
    public boolean A05;
    public final UserSession A06;
    public final OEO A07;
    public final O9L A08;
    public final OWA A09;
    public final O9W A0A;
    public final AnonymousClass0eM A0B;
    public final C62320sa A0C;
    public final 0sP A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G = 106.A01(A02(this));

    public static final N9H A02(C69137NfI nfI) {
        C69137NfI nfI2 = nfI;
        return new N9H(A01(nfI2, false, !C51971G9r.A1b(nfI2.A0C)), 0Yt.A0E(), 0Yt.A0E(), 0, false, false, false, false, false, false, false, false, false, false, false, false);
    }

    public static final N9H A03(C69137NfI nfI) {
        C69137NfI nfI2 = nfI;
        return new N9H(A01(nfI2, true, !C51971G9r.A1b(nfI2.A0C)), 0Yt.A0E(), 0Yt.A0E(), 0, false, false, false, true, false, false, false, false, false, false, false, false);
    }

    public static final GSY A00(ImageUrl imageUrl, ParticipantModel participantModel, String str) {
        Integer num;
        int i = participantModel.state;
        if (i == 1) {
            num = AnonymousClass05K.A00;
        } else if (i == 2) {
            num = AnonymousClass05K.A01;
        } else if (i == 3) {
            num = AnonymousClass05K.A0C;
        } else if (i == 6) {
            num = AnonymousClass05K.A0N;
        } else if (i != 7) {
            num = AnonymousClass05K.A0j;
        } else {
            num = AnonymousClass05K.A0Y;
        }
        String str2 = participantModel.userId;
        0qQ.A07(str2);
        return new GSY(imageUrl, num, str, str2, 19);
    }

    public static final N9E A01(C69137NfI nfI, boolean z, boolean z2) {
        String id;
        User A012 = AnonymousClass0t1.A01.A01(nfI.A06);
        Long BST = A012.BST();
        if (BST == null || BST.longValue() <= 0) {
            id = A012.getId();
        } else {
            id = String.valueOf(A012.BST());
        }
        return new N9E(A012.Bh3(), id, A012.getUsername(), A012.B8Q(), z, z2, false, false);
    }

    public static final void A04(C69137NfI nfI, N9H n9h) {
        if (!0qQ.A0K(nfI.A03, n9h)) {
            nfI.A03 = n9h;
            O28.A00(n9h, nfI.A01, nfI.A0G);
        }
    }

    public C69137NfI(UserSession userSession, OEO oeo, O9L o9l, O9R o9r, OWA owa, O9W o9w, C62320sa r10, 0sP r11) {
        super(o9r);
        this.A06 = userSession;
        this.A08 = o9l;
        this.A09 = owa;
        this.A07 = oeo;
        this.A0C = r10;
        this.A0D = r11;
        this.A0A = o9w;
        0sl r2 = 0sl.A00;
        this.A0E = 106.A01(r2);
        this.A0F = 106.A01(A01(this, false, !C51971G9r.A1b(this.A0C)));
        this.A0B = AnonymousClass1YB.A00(C73925Pm5.A01(this, 21));
        this.A03 = A02(this);
        this.A04 = r2;
        this.A02 = A01(this, false, !C51971G9r.A1b(this.A0C));
    }
}
