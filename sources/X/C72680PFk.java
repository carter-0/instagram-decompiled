package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.PFk  reason: case insensitive filesystem */
public final /* synthetic */ class C72680PFk implements C74349PtP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C74516PwB A01;
    public final /* synthetic */ C71153OeR A02;
    public final /* synthetic */ C254743sy A03;

    public /* synthetic */ C72680PFk(C74516PwB pwB, C71153OeR oeR, C254743sy r3, int i) {
        this.A02 = oeR;
        this.A03 = r3;
        this.A01 = pwB;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [X.07Z, X.4DH] */
    public final void DVV(Integer num) {
        C71153OeR oeR = this.A02;
        C254743sy r6 = this.A03;
        C74516PwB pwB = this.A01;
        int i = this.A00;
        int intValue = num.intValue();
        if (intValue == 3) {
            C74516PwB A012 = C71153OeR.A01(oeR, r6);
            if (r6 instanceof DirectThreadKey) {
                AnonymousClass73V.A09(oeR.A0e, oeR.A0k.C5z(C66647MaG.A03(r6)), "unrestrict_in_inbox");
            }
            1YZ r5 = 1YZ.A02;
            if (r5 != null && A012 != null && C66640Ma9.A02(A012)) {
                UserSession userSession = oeR.A0h;
                if (1YZ.A02 != null) {
                    r5.A02(oeR.A0Y, AnonymousClass07i.A00(oeR.A0b), userSession, new C51087FoH(oeR, 0), ((AnonymousClass17B) A012.BkC().get(0)).getId(), oeR.A0c.getModuleName());
                }
            }
        } else if (intValue == 0) {
            oeR.A0k(r6);
        } else if (intValue == 2) {
            C71153OeR.A0E(pwB, oeR, r6, i, true);
        }
    }
}
