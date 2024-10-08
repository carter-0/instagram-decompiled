package com.instagram.urlhandlers.guides;

import X.00k;
import X.0cp;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbS;
import X.DbT;
import X.DbX;
import X.EZL;
import X.FFQ;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

public final class GuidesExternalUrlHandlerActivity extends BaseFragmentActivity {
    public AnonymousClass0wW A00;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.guides.GuidesExternalUrlHandlerActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String A0m;
        Bundle A0a;
        String str;
        int A002 = AnonymousClass0fD.A00(852757371);
        super.onCreate(bundle);
        Bundle A0A = DbX.A0A(this);
        if (A0A == null || (A0m = DbS.A0m(A0A)) == null || A0m.length() == 0) {
            finish();
            i = -605761182;
        } else {
            AnonymousClass0wW A0W = DbT.A0W(A0A);
            this.A00 = A0W;
            try {
                Uri A03 = 0cp.A03(A0m);
                String scheme = A03.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    List<String> pathSegments = A03.getPathSegments();
                    0qQ.A0A(pathSegments);
                    A0a = AnonymousClass7TE.A0a();
                    str = "guide_id";
                    A0a.putString(str, (String) 00k.A0O(pathSegments, pathSegments.size() - 1));
                } else {
                    if ("instagram".equalsIgnoreCase(scheme)) {
                        String A0v = DbT.A0v(A03);
                        String queryParameter = A03.getQueryParameter(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                        if (!(A0v == null || A0v.length() == 0)) {
                            A0a = AnonymousClass7TE.A0a();
                            str = "guide_id";
                            A0a.putString(str, A0v);
                            A0a.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, queryParameter);
                        }
                    }
                    finish();
                    i = -592694384;
                }
                A0A.putAll(A0a);
                0qQ.A0B(A0W, 0);
                if (!(A0W instanceof UserSession)) {
                    FFQ.A01(this, A0A, A0W);
                    i = 493400521;
                } else {
                    A0A.getString(str);
                    String A0l = DbS.A0l(A0A);
                    if (A0l != null) {
                        try {
                            EZL.valueOf(A0l);
                        } catch (IllegalArgumentException unused) {
                            EZL[] values = EZL.values();
                            int i2 = 0;
                            int length = values.length;
                            while (i2 < length && !values[i2].A00.equals(A0l)) {
                                i2++;
                            }
                        }
                    }
                    DbS.A15();
                    throw AnonymousClass00P.createAndThrow();
                }
            } catch (Exception unused2) {
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
