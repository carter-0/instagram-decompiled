package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FJp  reason: case insensitive filesystem */
public final class C50030FJp implements DialogInterface.OnDismissListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C50030FJp(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C243853aD r1;
        switch (this.A00) {
            case 0:
                ((X6V) this.A01).Dqw();
                ((C17881VhY) this.A02).A00 = null;
                return;
            case 1:
                if (!((0r1) this.A01).A00) {
                    0wc r3 = (0wc) this.A02;
                    Integer num = AnonymousClass05K.A01;
                    0qQ.A0B(r3, 0);
                    C48798EkM.A00(r3, new C74193PqZ(num, 2));
                    return;
                }
                return;
            case 2:
                ((AnonymousClass07V) this.A01).A0A((AnonymousClass07Y) this.A02);
                C71121OdF.A00 = null;
                return;
            case 3:
                if (!((0r1) this.A01).A00) {
                    FGY.A04((FGY) this.A02, "DISMISSAL");
                    return;
                }
                return;
            case 4:
                C48251EbW ebW = ((ED2) this.A01).A00;
                if (ebW != null) {
                    ebW.A00((DwB) this.A02);
                    return;
                }
                return;
            case 5:
                ((2bv) this.A02).DbJ((AnonymousClass4UC) this.A01);
                return;
            case 6:
                C66461MSp mSp = (C66461MSp) this.A01;
                if (mSp != null) {
                    mSp.afterSelection(false);
                }
                UserSession userSession = (UserSession) this.A02;
                if (182.A06(0Tu.A06, userSession, 36312389414552645L)) {
                    AnonymousClass7TG.A1M(AnonymousClass7TE.A0q(userSession), "upsells_cancel_count_for_link_switcher", AnonymousClass7TE.A0q(userSession).getInt("upsells_cancel_count_for_link_switcher", 0) + 1);
                    return;
                }
                return;
            case 8:
                r1 = (C243853aD) this.A01;
                break;
            default:
                r1 = (C243853aD) this.A01;
                if (r1 == null) {
                    return;
                }
                break;
        }
        r1.DGO((User) this.A02);
    }
}
