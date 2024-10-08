package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.model.sharelater.ShareLaterMedia;

public final class E28 extends AnonymousClass4DH implements DialogInterface.OnCancelListener, CallerContextable {
    public static final String __redex_internal_original_name = "FbShareFragment";
    public UserSession A00;
    public ShareLaterMedia A01;
    public boolean A02;

    public final String getModuleName() {
        return AnonymousClass000.A00(3972);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (!this.A02) {
            AnonymousClass1Nd.A00(this.A00).A00(new Lg5((String) null, false, false));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 132) {
            intent.getClass();
            String stringExtra = intent.getStringExtra("page_name");
            if (stringExtra != null) {
                ShareLaterMedia shareLaterMedia = this.A01;
                if (shareLaterMedia != null) {
                    C48153EZv.A05.A06(shareLaterMedia, true);
                }
                this.A02 = true;
                AnonymousClass1Nd.A00(this.A00).A00(new Lg5(stringExtra, true, false));
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1833797910);
        E28.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        this.A01 = (ShareLaterMedia) requireArguments().getParcelable(AnonymousClass000.A00(479));
        UserSession userSession = this.A00;
        if (182.A06(DbS.A0J(userSession, 0), userSession, 36318977894390558L)) {
            0qQ.A0B(this.A00, 0);
            C50215FTv fTv = new C50215FTv(this, 3);
            FragmentActivity requireActivity = requireActivity();
            requireActivity.getSupportFragmentManager().A0v(new C50129FQm(fTv, 3), requireActivity, "page_linking_request");
        }
        AnonymousClass0fD.A09(-449589743, A022);
    }
}
