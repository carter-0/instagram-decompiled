package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class NV5 extends NV8 implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectAddYoursCardGalleryFragment";
    public SpinnerImageView A00;
    public C71931OtF A01;

    public final String getModuleName() {
        return "direct_add_yours_card_gallery_fragment";
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.07Z, X.NKo, X.NV8, X.NV5, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A0I = 2131952436;
        this.A0H = 2131952435;
        this.A01 = R.drawable.instagram_camera_outline_96;
        this.A00 = (SpinnerImageView) view.requireViewById(R.id.spinner);
        Dba.A15(this, A0E().A03, new C74184PqQ(this, 3), 33);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 4929 && i2 == -1) {
            SpinnerImageView spinnerImageView = this.A00;
            if (spinnerImageView == null) {
                0qQ.A0F("spinner");
                throw AnonymousClass00P.createAndThrow();
            } else {
                DbS.A1T(spinnerImageView);
            }
        }
    }

    public final boolean onBackPressed() {
        return A0M();
    }

    public final void onCreate(Bundle bundle) {
        String A0t;
        int A02 = AnonymousClass0fD.A02(270604215);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (A0t = C66580MXl.A0t(bundle2)) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-2014748429, A02);
            throw A0y;
        }
        this.A04 = new ODX(AnonymousClass7TF.A0d(DbV.A05(this), 2131952422), new C73669Phi(A0t, this, 34), true);
        this.A01 = new C71931OtF(AnonymousClass7TE.A0l(this.A0S), A0t, (String) null, MYO.A01(this, 26));
        AnonymousClass0fD.A09(2033810642, A02);
    }

    public final void onPause() {
        int A02 = AnonymousClass0fD.A02(191819431);
        super.onPause();
        C71931OtF otF = this.A01;
        if (otF == null) {
            0qQ.A0F("refreshEventHandler");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass1Nd.A00(otF.A00).A02(otF, 2Kb.class);
        AnonymousClass0fD.A09(553937431, A02);
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(786352315);
        super.onResume();
        C71931OtF otF = this.A01;
        if (otF == null) {
            0qQ.A0F("refreshEventHandler");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass1Nd.A00(otF.A00).A01(otF, 2Kb.class);
        AnonymousClass0fD.A09(-1309909955, A02);
    }
}
