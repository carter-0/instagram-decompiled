package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import java.util.Iterator;
import java.util.List;

public final class LO4 {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final C66474MTc A04;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.0rk] */
    public final void A01(List list) {
        ? obj = new Object();
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) it.next();
            Context context = this.A01;
            UserSession userSession = this.A02;
            C353638Im r8 = new C353638Im(context, userSession, new AnonymousClass8Zq(), 0);
            DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
            if (downloadedTrack == null || !JTQ.A1Z(downloadedTrack.A02)) {
                C65498LuM luM = new C65498LuM(this, audioOverlayTrack, obj, size);
                new C353638Im(context, userSession, new AnonymousClass8Zq(), 0).A03(audioOverlayTrack, new C65496LuK(luM, this, audioOverlayTrack, obj, size), luM, this.A00, false, true);
            } else if (audioOverlayTrack.A08 == null) {
                r8.A02(context, userSession, new C65495LuJ(this, audioOverlayTrack, obj, size), audioOverlayTrack.A0A, audioOverlayTrack.A0B, audioOverlayTrack.A0E);
            } else {
                this.A03.add(audioOverlayTrack);
                int i = obj.A00 + 1;
                obj.A00 = i;
                A00(this, i, size);
            }
        }
    }

    public static final void A00(LO4 lo4, int i, int i2) {
        if (i == i2) {
            List list = lo4.A03;
            boolean isEmpty = list.isEmpty();
            C66474MTc mTc = lo4.A04;
            if (isEmpty) {
                mTc.DAL();
            } else {
                mTc.DAK(list);
            }
        }
    }

    public LO4(Context context, UserSession userSession, C66474MTc mTc, int i) {
        this.A01 = context;
        this.A02 = userSession;
        this.A00 = i;
        this.A04 = mTc;
    }
}
