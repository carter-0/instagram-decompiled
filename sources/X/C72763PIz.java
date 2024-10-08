package X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;

/* renamed from: X.PIz  reason: case insensitive filesystem */
public final class C72763PIz implements G6H {
    public final FragmentActivity A00;
    public final UserSession A01;

    public final void CI0(Uri uri, Bundle bundle) {
        0qQ.A0B(uri, 0);
        String queryParameter = uri.getQueryParameter("media_id");
        if (queryParameter != null && queryParameter.length() != 0) {
            Integer A0j = JTP.A0j(0qQ.A0K(uri.getQueryParameter("media_source"), "ig") ? 1 : 0);
            1X9 A002 = AnonymousClass38W.A00();
            FragmentActivity fragmentActivity = this.A00;
            UserSession userSession = this.A01;
            RtcStartCoWatchPlaybackArguments rtcStartCoWatchPlaybackArguments = new RtcStartCoWatchPlaybackArguments(A0j, AnonymousClass05K.A01, AnonymousClass05K.A00, (Integer) null, queryParameter, uri.getQueryParameter("preview_video_id"));
            C72192OyC A012 = C66953Mfm.A01(A002.A00(fragmentActivity, userSession).A06);
            if (A012 != null) {
                C71143Odx.A02(A012.A09.A0Z, C69133NfE.A00(rtcStartCoWatchPlaybackArguments, (String) null), 11);
            }
        }
    }

    public C72763PIz(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
