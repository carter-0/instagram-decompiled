package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.locationsharing.core.models.Location;
import com.instagram.bwpclientauthmanager.AuthenticationActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;

public final class NC1 extends C69678Nq0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public NC1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void A00() {
        Context context;
        switch (this.A00) {
            case 0:
                VN1 vn1 = ((C71014OYm) this.A02).A03;
                if (vn1 != null && (context = vn1.A00.getContext()) != null) {
                    DbX.A14(context, AnonymousClass37D.A00);
                    return;
                }
                return;
            case 2:
                C70988OVc oVc = (C70988OVc) this.A01;
                UserSession userSession = oVc.A03;
                C331127Pr A0W = DbS.A0W(userSession);
                DbS.A1S(A0W, oVc.A0I);
                A0W.A03 = oVc.A00;
                C331157Pu A002 = A0W.A00();
                Bundle A09 = DbY.A09(userSession);
                User user = oVc.A05;
                A09.putString("ReportingConstants.ARG_CONTENT_ID", oVc.A0C);
                A09.putBoolean("ReportingConstants.ARG_IS_INTEROP_THREAD", oVc.A0J);
                A09.putString("ReportingConstants.ARG_DIRECT_THREAD_ID", oVc.A0D);
                C71038Oa2 oa2 = oVc.A06;
                A09.putBoolean("ReportingConstants.ARG_IS_ENCRYPTED_THREAD", oVc.A0H);
                A002.A02(oVc.A01, O3H.A00(A09, A002, user, oa2, (C14068TpH) null, (NHU) this.A02));
                return;
            default:
                return;
        }
    }

    public final void A01() {
        Context context;
        switch (this.A00) {
            case 0:
                VN1 vn1 = ((C71014OYm) this.A02).A03;
                if (vn1 != null && (context = vn1.A00.getContext()) != null) {
                    DbX.A14(context, AnonymousClass37D.A00);
                    return;
                }
                return;
            case 1:
                SRE.A01((Activity) this.A01, AnonymousClass05K.A00);
                return;
            default:
                return;
        }
    }

    public final void A02() {
        VN1 vn1;
        Context context;
        if (this.A00 == 0 && (vn1 = ((C71014OYm) this.A02).A03) != null && (context = vn1.A00.getContext()) != null) {
            DbX.A14(context, AnonymousClass37D.A00);
        }
    }

    public final void A03() {
        switch (this.A00) {
            case 0:
                C71014OYm oYm = (C71014OYm) this.A02;
                1Av r3 = oYm.A04.A01;
                AnonymousClass7TF.A1J(r3, r3.A3n, 1Av.A8a, 206, true);
                VN1 vn1 = oYm.A03;
                if (vn1 != null) {
                    vn1.A00.A03();
                }
                UHR uhr = (UHR) this.A01;
                Location A002 = uhr.A02.A00();
                if (A002 != null) {
                    UHS.A04(uhr, A002, "CURRENT_LOCATION_UPDATED");
                    return;
                }
                return;
            case 1:
                Context context = (Context) this.A02;
                Intent A0A = C66580MXl.A0A(context, AuthenticationActivity.class);
                Bundle bundle = new Bundle(0);
                bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "universal_link");
                A0A.putExtra(Pxd.A00(764), bundle);
                0kR.A0B(context, A0A);
                return;
            default:
                return;
        }
    }

    public final void A04(Throwable th) {
        if (1 - this.A00 == 0) {
            SRE.A01((Activity) this.A01, AnonymousClass05K.A01);
        }
    }
}
