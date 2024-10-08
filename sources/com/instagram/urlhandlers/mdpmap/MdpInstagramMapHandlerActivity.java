package com.instagram.urlhandlers.mdpmap;

import X.0cp;
import X.0qQ;
import X.0wb;
import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C18681Vwf;
import X.DbS;
import X.DbX;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;

public final class MdpInstagramMapHandlerActivity extends BaseFragmentActivity {
    public UserSession A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.mdpmap.MdpInstagramMapHandlerActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-1589922069);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null) {
            finish();
            i = 1652655427;
        } else {
            UserSession A0U = DbS.A0U(A0A);
            if (A0U == null) {
                finish();
                i = 1277017934;
            } else {
                this.A00 = A0U;
                try {
                    String string = A0A.getString("original_url");
                    if (string != null) {
                        Uri A03 = 0cp.A03(string);
                        0qQ.A0A(A03);
                        C18681Vwf.A00(A03, this, A0U, MapEntryPoint.EXTERNAL_URL, AnonymousClass7TF.A0b());
                        finish();
                        i = 1665546110;
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No URI provided");
                        AnonymousClass0fD.A07(1767933267, A002);
                        throw illegalArgumentException;
                    }
                } catch (IllegalArgumentException e) {
                    0wb.A07("MdpInstagramMapHandlerActivity:InvalidQueryType", e);
                    finish();
                    AnonymousClass0fD.A07(-1724134100, A002);
                    return;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
