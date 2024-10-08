package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController;

/* renamed from: X.Lpl  reason: case insensitive filesystem */
public final class C65241Lpl implements C363658k8 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65241Lpl(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* synthetic */ void Dcq() {
        switch (this.A00) {
            case 1:
                DirectPrivateStoryRecipientController.A0A((DirectPrivateStoryRecipientController) ((C64698LgT) this.A01).A01, (C61149Jy0) this.A02);
                return;
            case 2:
                L9I l9i = (L9I) this.A01;
                C63901LBh lBh = KYc.A02;
                AnonymousClass818 r3 = l9i.A02;
                lBh.A00(l9i.A01.getContext(), r3, l9i.A03, true);
                C368008rv.A00(r3);
                return;
            default:
                return;
        }
    }

    public final void Dcr() {
        switch (this.A00) {
            case 0:
                K66.A0K((K66) this.A02, (C61149Jy0) this.A01);
                return;
            case 1:
                C299955wH.A00(((DirectPrivateStoryRecipientController) ((C64698LgT) this.A01).A01).A0B).A01(new C295035nS(this));
                return;
            case 2:
                CallerContext callerContext = C62052KYa.A02;
                Object obj = this.A02;
                Object obj2 = this.A01;
                0qQ.A0B(obj2, 1);
                AnonymousClass7TE.A1Z(new C66168MGf(obj2, obj, (AnonymousClass4D7) null, 40), C62052KYa.A04);
                return;
            default:
                UserSession userSession = (UserSession) this.A02;
                Fragment fragment = (Fragment) this.A01;
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    C63427Kwn.A00(activity, fragment.requireContext(), fragment, AnonymousClass818.IG_SELF_REEL_LIKES_SHEET_POST_ACCOUNT_LINK, userSession, (C66461MSp) null);
                    return;
                }
                return;
        }
    }
}
