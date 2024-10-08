package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.82b  reason: invalid class name and case insensitive filesystem */
public final class C3498482b {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final float A04;
    public final AnonymousClass2Fj A05;
    public final AnonymousClass2Fj A06;
    public final 1Xj A07;
    public final MusicOverlayStickerModel A08;
    public final User A09;
    public final User A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final UserSession A0H;

    public final void A00() {
        UserSession userSession = this.A0H;
        1Av A002 = 1Au.A00(userSession);
        1Av A003 = 1Au.A00(userSession);
        A003.A67.Epx(A003, true, 1Av.A8a[428]);
        this.A06.A0B(Float.valueOf(1.0f));
        this.A05.A0B(true);
        A002.A13("immersive_mentions_reshare_stickiness", true);
        this.A03 = true;
    }

    public final void A01() {
        UserSession userSession = this.A0H;
        1Av A002 = 1Au.A00(userSession);
        1Av A003 = 1Au.A00(userSession);
        A003.A67.Epx(A003, false, 1Av.A8a[428]);
        if (!182.A06(0Tu.A05, userSession, 36322989393849045L)) {
            this.A06.A0B(Float.valueOf(0.7f));
        }
        A002.A13("immersive_mentions_reshare_stickiness", false);
        this.A05.A0B(false);
        this.A03 = true;
    }

    public C3498482b(UserSession userSession, 1Xj r6, String str, boolean z) {
        List A3o;
        this.A0H = userSession;
        this.A07 = r6;
        this.A0B = str;
        this.A02 = z;
        User A2A = r6.A2A(userSession);
        if (A2A != null) {
            this.A0A = A2A;
            this.A09 = r6.A0C.B9t();
            String A30 = r6.A30();
            if (A30 != null) {
                this.A0C = A30;
                this.A04 = r6.A0l();
                this.A0F = r6.CeS();
                boolean z2 = true;
                boolean z3 = false;
                if (!r6.A4u() && ((A3o = r6.A3o(AnonymousClass3WT.MULTI_PRODUCT)) == null || A3o.isEmpty())) {
                    z2 = false;
                }
                this.A0D = z2;
                User A2A2 = r6.A2A(userSession);
                this.A0E = A2A2 != null ? A2A2.A1j() : z3;
                this.A06 = new 2Fk(Float.valueOf(0.7f));
                this.A05 = new 2Fk(Boolean.valueOf(1Au.A00(userSession).A20()));
                this.A0G = 1NM.A03(userSession);
                Integer num = null;
                MusicOverlayStickerModel A032 = C271404in.A03((MusicProduct) null, r6, (Integer) null);
                if (A032 == null || A032.A0t) {
                    this.A08 = null;
                    return;
                }
                A9I a9i = new A9I(A032);
                a9i.A02 = MusicProduct.MENTION_RESHARE;
                a9i.A0K = A032.A0K;
                Integer num2 = A032.A0O;
                if (num2 != null) {
                    int intValue = num2.intValue();
                    num = Integer.valueOf(intValue > 60000 ? 60000 : intValue);
                }
                a9i.A0O = num;
                this.A08 = a9i.A00();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
