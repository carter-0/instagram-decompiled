package com.instagram.urlhandlers.directpromptscamera;

import X.002;
import X.00y;
import X.0kg;
import X.0wb;
import X.1Ln;
import X.1bJ;
import X.2Dm;
import X.AnonymousClass3U9;
import X.AnonymousClass79B;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C66580MXl;
import X.C66583MXo;
import X.C69494Nmc;
import X.C69497Nmf;
import X.C69870NtY;
import X.C70846ONz;
import X.DbS;
import X.DbT;
import X.OQ2;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class DirectPromptsCameraUrlHandlerActivity extends UserSessionUrlHandlerActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.urlhandlers.directpromptscamera.DirectPromptsCameraUrlHandlerActivity, android.app.Activity] */
    public final void A0n(Bundle bundle, Bundle bundle2, UserSession userSession) {
        Integer num;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1O(userSession2, bundle2);
        String A0m = DbS.A0m(bundle2);
        if (A0m != null) {
            Uri A09 = DbT.A09(A0m);
            String queryParameter = A09.getQueryParameter("collection_type");
            if (queryParameter != null) {
                DirectPromptTypes A01 = AnonymousClass79B.A01(queryParameter);
                if (A01 != DirectPromptTypes.UNKNOWN) {
                    2Dm A00 = 1bJ.A00(userSession2);
                    String queryParameter2 = A09.getQueryParameter(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
                    String queryParameter3 = A09.getQueryParameter("subtitle_text");
                    String queryParameter4 = A09.getQueryParameter("collection_id");
                    String queryParameter5 = A09.getQueryParameter("contribution_count");
                    if (queryParameter5 != null) {
                        num = 00y.A0l(queryParameter5);
                    } else {
                        num = null;
                    }
                    if (queryParameter2 != null) {
                        AnonymousClass3U9 A0d = C66580MXl.A0d(A00, queryParameter2);
                        if (!(queryParameter3 == null || queryParameter4 == null || A0d == null || A0d.CVE() || A0d.Axj() || A0d.Car())) {
                            if (A01 == DirectPromptTypes.ROLL_CALL) {
                                C70846ONz oNz = new C70846ONz(DbS.A0O("DirectPromptsCameraUrlHandlerActivity"), userSession2);
                                C69494Nmc nmc = C69494Nmc.XMA;
                                1Ln A03 = 1Ln.A03(oNz.A00);
                                if (DbT.A1Y(A03)) {
                                    A03.A0M(C69497Nmf.ADD_YOURS_TAPPED, "action");
                                    C66583MXo.A11(nmc, A03, queryParameter4, queryParameter2);
                                }
                            } else if (A01 == DirectPromptTypes.ADD_YOURS) {
                                C69870NtY.A00(userSession2, A01);
                            }
                            OQ2.A01(this, OQ2.A00(userSession2, A0d, A01, num, queryParameter4, queryParameter3, false), userSession2, (Integer) null);
                        }
                    }
                } else {
                    0wb.A01(0kg.A06, "DirectPromptsCameraUrlHandlerActivity", 002.A0R("Unsupported prompt type ", queryParameter));
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        finish();
    }
}
