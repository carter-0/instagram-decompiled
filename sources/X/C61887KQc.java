package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.messaging.encryptedbackups.gdrive.flow.GoogleAuthController;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.KQc  reason: case insensitive filesystem */
public abstract class C61887KQc extends NJT {
    public static final String __redex_internal_original_name = "EncryptedBackupsGDriveBaseFragment";
    public C62320sa A00 = new C73904Plf(this, 20);
    public C262224Cq A01;
    public final GoogleAuthController A02;
    public final AnonymousClass0eM A03;

    public void A0K(S5E s5e) {
        A0L(false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = DbY.A0r(AnonymousClass12T.A00, 1705805791);
        GoogleAuthController googleAuthController = this.A02;
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass07V lifecycle = getViewLifecycleOwner().getLifecycle();
        L1F l1f = new L1F(this);
        C262224Cq r4 = this.A01;
        if (r4 == null) {
            0qQ.A0F("viewBoundBackgroundScope");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0B(lifecycle, 2);
        googleAuthController.A01 = l1f;
        C11621SdP sdP = new C11621SdP(requireActivity.activityResultRegistry, new TTN(googleAuthController, 38), r4, googleAuthController.A03);
        lifecycle.A09(sdP);
        googleAuthController.A00 = sdP;
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r6, this, (AnonymousClass4D7) null, 38), AnonymousClass07a.A00(viewLifecycleOwner));
        C71145Oe2.A04((ViewGroup) AnonymousClass7TF.A0G(view, R.id.container), this);
    }

    public void A0F() {
        C67715MtU A0T;
        if (this instanceof KQW) {
            A0T = JTT.A0U((KQW) this);
        } else if (this instanceof KQV) {
            A0T = JTT.A0T((KQV) this);
        } else {
            return;
        }
        A0T.A03.A0B("GDRIVE_RESTORE_ACCOUNT_PICKER_IMPRESSION");
    }

    public void A0G() {
    }

    public void A0H() {
        C67715MtU A0T;
        if (this instanceof KQW) {
            A0T = JTT.A0U((KQW) this);
        } else {
            A0T = JTT.A0T((KQV) this);
        }
        A0T.A03.A0B("GDRIVE_RESTORE_ACCOUNT_PICKER_DISMISS");
    }

    public final void A0I() {
        View view = this.mView;
        if (view != null) {
            view.post(new M45(this));
        }
    }

    public void A0J(C74223PrB prB) {
        C67715MtU A0T;
        if (this instanceof KQW) {
            A0T = JTT.A0U((KQW) this);
        } else {
            A0T = JTT.A0T((KQV) this);
        }
        A0T.A0G(prB);
    }

    public void A0L(boolean z) {
        IgdsBottomButtonLayout igdsBottomButtonLayout;
        if (this instanceof KQW) {
            igdsBottomButtonLayout = ((KQW) this).A00;
        } else {
            igdsBottomButtonLayout = ((KQV) this).A00;
        }
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setPrimaryActionIsLoading(z);
        }
    }

    public final void A0M(boolean z) {
        OJS ojs = new OJS();
        View view = this.mView;
        GoogleAuthController googleAuthController = this.A02;
        C66196MId A1C = JTO.A1C(this, 58);
        C66196MId A1C2 = JTO.A1C(this, 59);
        MIX mix = new MIX(this, 7);
        0qQ.A0B(googleAuthController, 2);
        AnonymousClass7TE.A1Z(new C73563Pfk(view, this, googleAuthController, ojs, (AnonymousClass4D7) null, mix, A1C2, A1C, z), DbY.A0r(AnonymousClass12T.A00, 1705805791));
    }

    public C61887KQc() {
        C73904Plf plf = new C73904Plf(this, 19);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73904Plf(new C73904Plf(this, 21), 22));
        this.A03 = DbS.A0I(new C73904Plf(A002, 23), plf, new C73664Phd(39, A002, (Object) null), DbS.A0z(C67713MtS.class));
        this.A02 = (GoogleAuthController) O5J.A02.getValue();
    }
}
