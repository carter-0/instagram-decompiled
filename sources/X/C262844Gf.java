package X;

import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.4Gf  reason: invalid class name and case insensitive filesystem */
public final class C262844Gf implements C230222pE {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C377079Kl(this, 40));
    public final ReelViewerConfig A04;

    public C262844Gf(Fragment fragment, AnonymousClass0iw r4, UserSession userSession, ReelViewerConfig reelViewerConfig) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r4, 4);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A04 = reelViewerConfig;
        this.A01 = r4;
    }

    public final void A00(RectF rectF, C55497Hif hif, AnonymousClass3BQ r15, User user, String str, String str2) {
        User user2 = user;
        1Nr r5 = new 1Nr(user2);
        UserSession userSession = this.A02;
        Reel A0K = 1OP.A05(userSession).A0K(r5, str, 0qQ.A0K(userSession.A06, user2.getId()));
        List singletonList = Collections.singletonList(A0K);
        0qQ.A07(singletonList);
        AnonymousClass32A r52 = (AnonymousClass32A) this.A03.getValue();
        r52.A0C = UUID.randomUUID().toString();
        r52.A05 = new C16154Upf();
        r52.A06 = new C57305IWo(hif);
        r52.A0F = true;
        C57309IWs iWs = new C57309IWs(rectF, hif);
        List A0O = A0K.A0O(userSession);
        0qQ.A07(A0O);
        int size = A0O.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = 0;
                break;
            }
            1Xj r1 = ((C255773uh) A0O.get(i)).A0b;
            if (r1 != null) {
                String str3 = str2;
                if (0qQ.A0K(r1.getId(), str3) || 0qQ.A0K(r1.A2n(), str3)) {
                    break;
                }
            }
            i++;
        }
        r52.A07(A0K, r15, iWs, singletonList, singletonList, i);
    }

    public final /* synthetic */ void DFj(Reel reel, AnonymousClass6UY r2) {
    }

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }
}
