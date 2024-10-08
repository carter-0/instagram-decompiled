package X;

import android.graphics.drawable.Drawable;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8BN  reason: invalid class name */
public final class AnonymousClass8BN extends 2YL {
    public final 2Fk A00;
    public final 2Fk A01;
    public final C3501583m A02;
    public final 0V2 A03;
    public final 0V2 A04;

    public AnonymousClass8BN(FragmentActivity fragmentActivity, UserSession userSession) {
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(userSession, 2);
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A04 = A012;
        AnonymousClass8BO r0 = new AnonymousClass8BO(A012);
        19B r2 = 19B.A00;
        this.A01 = C226292g8.A00(r2, r0);
        05D A013 = 10D.A01(num, 0, 0);
        this.A03 = A013;
        this.A00 = C226292g8.A00(r2, new AnonymousClass8BP(A013));
        this.A02 = new 2YN(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class).A0Q;
    }

    public final void A02(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new MHN((Object) drawable, (Object) this, (AnonymousClass4D7) null, 6), A002);
    }

    public final Drawable A00() {
        C391949tw r2;
        C388439np r22;
        AnonymousClass88W r1 = (AnonymousClass88W) this.A00.A02();
        if (r1 != null) {
            r2 = (C391949tw) r1.A01;
        } else {
            r2 = null;
        }
        if (!(r2 instanceof C388439np) || (r22 = (C388439np) r2) == null) {
            return null;
        }
        return r22.A00;
    }

    public final C391959tx A01() {
        AnonymousClass88W r0 = (AnonymousClass88W) this.A01.A02();
        if (r0 != null) {
            return (C391959tx) r0.A01;
        }
        return null;
    }

    public final void A04(C391959tx r3) {
        C3501583m r1;
        C359548d5 r0;
        if (r3 instanceof C388549o0) {
            r1 = this.A02;
            r0 = C359548d5.STICKER_ADD;
        } else if (r3 instanceof C388559o1) {
            r1 = this.A02;
            r0 = C359548d5.STICKER_REMOVE;
        } else if (r3 instanceof C388569o2) {
            r1 = this.A02;
            r0 = C359548d5.STICKER_MOVE;
        } else if (r3 instanceof C388579o3) {
            r1 = this.A02;
            r0 = C359548d5.STICKER_TEXT_ADD;
        } else if (r3 instanceof C388589o4) {
            r1 = this.A02;
            r0 = C359548d5.STICKER_TEXT_REMOVE;
        } else if (r3 instanceof C388599o5) {
            r1 = this.A02;
            r0 = C359548d5.STICKER_TEXT_MOVE;
        } else {
            return;
        }
        r1.A01(r0);
    }

    public final void A03(C391959tx r5) {
        C318136oS A002 = C318116oQ.A00(this);
        AnonymousClass9K3 r2 = new AnonymousClass9K3((Object) this, (Object) r5, (AnonymousClass4D7) null, 44);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }
}
