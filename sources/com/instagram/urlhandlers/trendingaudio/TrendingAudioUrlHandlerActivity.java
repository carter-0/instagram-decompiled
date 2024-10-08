package com.instagram.urlhandlers.trendingaudio;

import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.C309516Yo;
import X.C3515689j;
import X.DbS;
import X.DbU;
import X.DbV;
import X.DbX;
import X.Dbb;
import X.FFQ;
import X.H1J;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class TrendingAudioUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.urlhandlers.trendingaudio.TrendingAudioUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        return Dbb.A0M(DbX.A0A(this));
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.instagram.urlhandlers.trendingaudio.TrendingAudioUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, android.app.Activity, com.instagram.base.activity.IgFragmentActivity, androidx.fragment.app.FragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A00 = AnonymousClass0fD.A00(-2083495636);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -770582228;
        } else {
            Bundle A0A = DbX.A0A(this);
            if (A0A == null) {
                finish();
                i = 400275162;
            } else if (DbS.A0m(A0A) == null) {
                finish();
                i = 211402529;
            } else {
                AnonymousClass0wW session = getSession();
                if (session != null) {
                    if (!(session instanceof UserSession)) {
                        FFQ.A01(this, A0A, session);
                    } else {
                        C3515689j r2 = C3515689j.AUDIO_PAGE;
                        Bundle A0a = AnonymousClass7TE.A0a();
                        A0a.putString("referrer_audio_id", (String) null);
                        A0a.putSerializable("music_selection_source", r2);
                        H1J h1j = new H1J();
                        h1j.setArguments(A0a);
                        C309516Yo A0P = DbU.A0P((Bundle) null, h1j, this, session);
                        A0P.A0F = true;
                        DbV.A1O(A0P);
                    }
                }
                i = -528773288;
            }
        }
        AnonymousClass0fD.A07(i, A00);
    }
}
