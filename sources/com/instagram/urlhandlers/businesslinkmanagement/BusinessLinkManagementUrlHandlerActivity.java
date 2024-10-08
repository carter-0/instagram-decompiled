package com.instagram.urlhandlers.businesslinkmanagement;

import X.08y;
import X.09i;
import X.0Gl;
import X.0Yt;
import X.0eP;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C276534tU;
import X.C309516Yo;
import X.C359608dC;
import X.C46471DfZ;
import X.C46626Di6;
import X.C46649DiU;
import X.C49672F1e;
import X.C49940FFt;
import X.DbT;
import X.DbX;
import X.Dba;
import X.ESS;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.Collections;
import java.util.HashMap;

public final class BusinessLinkManagementUrlHandlerActivity extends BaseFragmentActivity {
    public static final 0eP A00 = AnonymousClass7TE.A1L(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "deeplink_from_fb");
    public static final 0eP A01 = AnonymousClass7TE.A1L("link_flow_source", "instagram");

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.businesslinkmanagement.BusinessLinkManagementUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        Bundle A0A;
        08y r1 = 09i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A0A = DbT.A0A(intent)) != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.content.Context, com.instagram.urlhandlers.businesslinkmanagement.BusinessLinkManagementUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        HashMap A02 = 0Yt.A02(new 0eP[]{A00, A01});
        C49940FFt fFt = new C49940FFt();
        fFt.A03 = C46626Di6.FULL_SHEET;
        C46471DfZ A03 = fFt.A03();
        C49672F1e f1e = new C49672F1e(getSession());
        IgBloksScreenConfig igBloksScreenConfig = f1e.A00;
        igBloksScreenConfig.A0R = "com.bloks.www.casd_bl.business_link_management";
        igBloksScreenConfig.A0S = "CASD_BUSINESS_LINK_MANAGEMENT";
        f1e.A00(A03);
        C276534tU r3 = new C276534tU(13784);
        r3.A0P(45, "CASD_BUSINESS_LINK_MANAGEMENT");
        C46649DiU diU = new C46649DiU(C359608dC.A01(A02), Collections.emptyMap(), "com.bloks.www.casd_bl.business_link_management");
        r3.A0O();
        diU.A03 = r3;
        diU.A06 = "CASD_BUSINESS_LINK_MANAGEMENT";
        diU.A0F(this, igBloksScreenConfig);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.urlhandlers.businesslinkmanagement.BusinessLinkManagementUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-56009915);
        super.onCreate(bundle);
        if (DbX.A0A(this) != null) {
            C309516Yo A0B = Dba.A0B(this, 0Gl.A00(getSession()));
            A0B.A0D(new ESS());
            A0B.A04();
            i = -670210581;
        } else {
            finish();
            i = -1736406545;
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
