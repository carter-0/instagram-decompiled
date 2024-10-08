package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.activity.MediaCaptureActivity;
import java.util.Iterator;
import java.util.List;

public final class M9N implements Runnable {
    public final /* synthetic */ JX1 A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public M9N(JX1 jx1, AnonymousClass3Q2 r2, List list, boolean z) {
        this.A00 = jx1;
        this.A01 = r2;
        this.A02 = list;
        this.A03 = z;
    }

    public final void run() {
        UserSession userSession;
        C59889JbE kPg;
        JWG jwg;
        JX1 jx1 = this.A00;
        C273514mi r0 = jx1.A0D;
        if (!(r0 == null || (jwg = ((MediaCaptureActivity) r0).A07) == null)) {
            jwg.A08(AnonymousClass05K.A00);
        }
        boolean z = ((JWE) jx1.A0C).A01.A0M;
        if (jx1.A00 != null) {
            1ud r2 = 1ua.A0G;
            UserSession userSession2 = jx1.A09;
            r2.A01(C51966G9m.A0P(userSession2), userSession2).A0H(this.A01, this.A02);
            L0A l0a = jx1.A00;
            if (l0a != null) {
                AnonymousClass8ZV r1 = l0a.A00;
                r1.EBv(new M2M(r1));
            }
            jx1.A00 = null;
        } else if (!z || this.A03) {
            C273594mq r7 = jx1.A0A;
            if (r7 != null) {
                AnonymousClass3Q2 r6 = this.A01;
                List list = this.A02;
                MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) r7;
                String A0F = r6.A0F();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AnonymousClass3Q2 A0m = JTO.A0m(it);
                    0qQ.A0B(A0F, 0);
                    A0m.A2a = A0F;
                }
                mediaCaptureActivity.A0B.A0H(r6, list);
                if (!jx1.A04 || jx1.A03) {
                    userSession = jx1.A09;
                    kPg = new C61867KPg(C62499Kgp.A04, "album_import", false, jx1.A03);
                } else {
                    userSession = jx1.A09;
                    kPg = new KPF();
                }
                C59888JbD.A01(userSession, kPg);
                return;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("mPendingAlbumServiceDelegate is null. showFeedInStoriesCamera=");
            A1A.append(z);
            A1A.append(" hasExistingSessionEdits=");
            A1A.append(this.A03);
            A1A.append(" isStandaloneMode=");
            A1A.append(jx1.A04);
            A1A.append(" subMediaSize=");
            List list2 = this.A02;
            A1A.append(list2.size());
            0kD.A07("GalleryAlbumController_onAlbumSubmediaImported", A1A.toString(), (Throwable) null);
            JX1.A03(jx1, this.A01, list2);
        } else {
            JX1.A03(jx1, this.A01, this.A02);
        }
    }
}
