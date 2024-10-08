package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class WP1 implements C320326sC {
    public final /* synthetic */ C15381Ube A00;

    public final /* synthetic */ void D3i(User user) {
    }

    public final void D46(C267324bN r14, int i) {
        String str;
        0qQ.A0B(r14, 0);
        C15381Ube ube = this.A00;
        HAI hai = ube.A08;
        if (hai == null) {
            str = "dataSource";
        } else {
            List list = HAI.A00(hai.A00, hai).A02;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
            AnonymousClass0eM r1 = ube.A0i;
            C229352nF A002 = C229342nE.A00(AnonymousClass7TE.A0l(r1));
            String str2 = ube.A0g;
            C298845u8 r2 = C276114sa.A00;
            C18575VuR vuR = ube.A0I;
            str = "feedRequestController";
            if (vuR != null) {
                C298855u9 A003 = r2.A00(C18459Vs8.A00(vuR).A05());
                C18575VuR vuR2 = ube.A0I;
                if (vuR2 != null) {
                    A003.A00 = C18459Vs8.A00(vuR2).A03.A07;
                    A002.A03(A003.A00(), C294895nD.DEFAULT, str2, arrayList, true, true);
                    UserSession A0l = AnonymousClass7TE.A0l(r1);
                    FragmentActivity requireActivity = ube.requireActivity();
                    C270634h3 r22 = new C270634h3(ClipsViewerSource.HASHTAG, AnonymousClass7TE.A0l(r1));
                    r22.A1B = C15381Ube.A01(ube).A01.getName();
                    1Xj r0 = r14.A02;
                    if (r0 != null) {
                        r22.A1C = r0.getId();
                        r22.A1F = str2;
                        r22.A0n = 002.A0D(C15381Ube.A01(ube).A01.getName(), '#');
                        r22.A0p = "clips_hashtag";
                        C250563lf.A0Y(requireActivity, r22.A00(), A0l);
                        return;
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public WP1(C15381Ube ube) {
        this.A00 = ube;
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r8, int i) {
        AnonymousClass7TG.A1T(r8, view, motionEvent);
        WW4 ww4 = this.A00.A0b;
        1Xj r3 = r8.A02;
        if (r3 != null) {
            return ww4.DQs(motionEvent, view, new C296995qz((i - 1) % 3, i / 3), r3);
        }
        throw AnonymousClass7TE.A0y();
    }
}
