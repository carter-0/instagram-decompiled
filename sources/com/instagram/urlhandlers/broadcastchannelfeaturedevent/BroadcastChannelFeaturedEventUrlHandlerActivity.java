package com.instagram.urlhandlers.broadcastchannelfeaturedevent;

import X.08y;
import X.09i;
import X.0Tu;
import X.0cp;
import X.182;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C71172bH;
import X.DbT;
import X.DbX;
import X.DbZ;
import X.Dba;
import X.E7K;
import X.FFQ;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class BroadcastChannelFeaturedEventUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.broadcastchannelfeaturedevent.BroadcastChannelFeaturedEventUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        Bundle A0A;
        08y r1 = 09i.A0A;
        Intent intent = getIntent();
        if (intent != null && (A0A = DbT.A0A(intent)) != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.base.activity.BaseFragmentActivity, com.instagram.urlhandlers.broadcastchannelfeaturedevent.BroadcastChannelFeaturedEventUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        String str;
        Uri A03;
        int A00 = AnonymousClass0fD.A00(848989512);
        super.onCreate(bundle);
        if (!182.A06(0Tu.A05, getSession(), 36319407394004287L)) {
            finish();
            i = -560093611;
        } else {
            Bundle A0A = DbX.A0A(this);
            if (!(A0A == null || A0A.getString("original_url") == null)) {
                AnonymousClass0wW session = getSession();
                if (session instanceof UserSession) {
                    String string = A0A.getString("original_url");
                    if (!(string == null || string.length() == 0)) {
                        Uri A09 = DbT.A09(string);
                        String queryParameter = A09.getQueryParameter("identifier");
                        List<String> pathSegments = A09.getPathSegments();
                        if (pathSegments.size() >= 2) {
                            str = AnonymousClass7TE.A19(pathSegments, 1);
                        } else {
                            str = null;
                        }
                        if (!((queryParameter == null || queryParameter.length() == 0) && (str == null || str.length() == 0))) {
                            if (C71172bH.A00() != null) {
                                if (queryParameter == null) {
                                    if (str != null) {
                                        queryParameter = str;
                                    } else {
                                        throw AnonymousClass7TE.A0y();
                                    }
                                }
                                Bundle A0a = AnonymousClass7TE.A0a();
                                A0a.putString("ChannelsFeaturedEventListFragment.ARGUMENT_EVENT_IDENTIFIER", queryParameter);
                                E7K e7k = new E7K();
                                e7k.setArguments(A0a);
                                C309516Yo A0B = Dba.A0B(this, getSession());
                                A0B.A0F = true;
                                A0B.A0D(e7k);
                                A0B.A04();
                            } else {
                                String string2 = A0A.getString("original_url");
                                if (!(string2 == null || (A03 = 0cp.A03(string2)) == null)) {
                                    DbZ.A0v(this, A03);
                                }
                            }
                        }
                    }
                } else {
                    FFQ.A01(this, A0A, session);
                }
                i = -410240031;
            }
            finish();
            i = -410240031;
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
