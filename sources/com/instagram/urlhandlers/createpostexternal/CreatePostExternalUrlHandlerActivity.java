package com.instagram.urlhandlers.createpostexternal;

import X.0Tu;
import X.0qQ;
import X.0wb;
import X.182;
import X.28D;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass36R;
import X.AnonymousClass36U;
import X.AnonymousClass36W;
import X.AnonymousClass3QU;
import X.AnonymousClass3f0;
import X.AnonymousClass7TE;
import X.C50348FZf;
import X.DbT;
import X.DbV;
import X.DbW;
import X.DbX;
import X.EXF;
import X.FFQ;
import X.JWU;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

public final class CreatePostExternalUrlHandlerActivity extends IgFragmentActivity {
    public AnonymousClass0wW A00;

    /* JADX WARNING: type inference failed for: r3v0, types: [android.content.Context, java.lang.Object, com.instagram.urlhandlers.createpostexternal.CreatePostExternalUrlHandlerActivity, com.instagram.base.activity.IgFragmentActivity, android.app.Activity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(-1572622626);
        super.onCreate(bundle);
        Intent intent = getIntent();
        Bundle A0A = DbT.A0A(intent);
        0qQ.A0A(A0A);
        UserSession A0W = DbT.A0W(A0A);
        this.A00 = A0W;
        if (!(A0W instanceof UserSession)) {
            FFQ.A01(this, A0A, A0W);
            i = 1246694084;
        } else {
            if (182.A06(0Tu.A05, A0W, 36324204869595014L)) {
                Intent A08 = DbX.A08(this);
                Uri.Builder A07 = DbW.A07("instagram://share");
                0qQ.A07(A07);
                A07.appendQueryParameter("new_feed_deeplink", "true");
                A08.setData(A07.build());
                DbV.A19(this, A08);
            } else {
                String stringExtra = intent.getStringExtra("entrypoint");
                Bundle bundle2 = null;
                if (AnonymousClass3f0.A04(stringExtra)) {
                    if (stringExtra != null) {
                        try {
                            28D A003 = AnonymousClass3QU.A00(Long.parseLong(stringExtra));
                            if (28D.A5J != A003) {
                                bundle2 = AnonymousClass7TE.A0a();
                                bundle2.putSerializable("cameraEntryPoint", A003);
                            }
                        } catch (NumberFormatException e) {
                            0wb.A07("create_post_external_url_handler", e);
                        }
                    } else {
                        IllegalStateException A0y = AnonymousClass7TE.A0y();
                        AnonymousClass0fD.A07(-1591691607, A002);
                        throw A0y;
                    }
                }
                AnonymousClass36U A004 = AnonymousClass36R.A00(this, A0W, new C50348FZf(this, 11));
                AnonymousClass36W r9 = AnonymousClass36W.FOLLOWERS_SHARE;
                MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(new JWU(r9));
                if (bundle2 != null) {
                    AnonymousClass36U.A03(bundle2, EXF.A09, A004, mediaCaptureConfig, r9, (UpcomingEvent) null, (String) null, (List) null, 0, 10001, true, false);
                } else {
                    A004.Exv(EXF.A09, mediaCaptureConfig, r9);
                }
            }
            finish();
            i = 1962915802;
        }
        AnonymousClass0fD.A07(i, A002);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }
}
