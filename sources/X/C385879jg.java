package X;

import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.session.UserSession;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.9jg  reason: invalid class name and case insensitive filesystem */
public final class C385879jg extends 2Cn {
    public final /* synthetic */ RemoteMedia A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ A6F A02;
    public final /* synthetic */ C361568gR A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ 0sP A06;

    public final void onFail(Exception exc) {
        String str;
        Exception exc2 = exc;
        0qQ.A0B(exc2, 0);
        UserSession userSession = this.A01;
        C361568gR r4 = this.A03;
        0xG r9 = new 0xG("RemoteMediaDownloadManager");
        String str2 = this.A04;
        RemoteMedia remoteMedia = this.A00;
        boolean z = remoteMedia.A09;
        String CCJ = remoteMedia.A04.CCJ();
        String message = exc2.getMessage();
        if (z) {
            str = MediaStreamTrack.VIDEO_TRACK_KIND;
        } else {
            str = "photo";
        }
        0eP A1L = AnonymousClass7TE.A1L("uri", CCJ);
        if (message == null) {
            message = "";
        }
        AnonymousClass9PQ.A07(r9, userSession, (Long) null, (Long) null, "error_logging", str2, str, (List) null, (List) null, 0Yt.A06(AnonymousClass7TH.A0h("is_network", "network", A1L, AnonymousClass7TE.A1L("error_message", message), AnonymousClass7TE.A1L("error_type", "media_download"))));
        this.A05.invoke(exc2);
        C361568gR.A00(remoteMedia, this.A02, r4, AnonymousClass05K.A0C);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        0qQ.A0B(obj, 0);
        this.A06.invoke(obj);
        C361568gR r3 = this.A03;
        C361568gR.A00(this.A00, this.A02, r3, AnonymousClass05K.A01);
    }

    public C385879jg(RemoteMedia remoteMedia, UserSession userSession, A6F a6f, C361568gR r4, String str, 0sP r6, 0sP r7) {
        this.A06 = r6;
        this.A03 = r4;
        this.A00 = remoteMedia;
        this.A02 = a6f;
        this.A01 = userSession;
        this.A04 = str;
        this.A05 = r7;
    }
}
