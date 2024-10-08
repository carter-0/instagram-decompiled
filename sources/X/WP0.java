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

public final class WP0 implements C320326sC {
    public final /* synthetic */ C15693Ugy A00;

    public final /* synthetic */ void D3i(User user) {
    }

    public WP0(C15693Ugy ugy) {
        this.A00 = ugy;
    }

    public final void D46(C267324bN r13, int i) {
        C15693Ugy ugy = this.A00;
        HAI hai = ugy.A05;
        List list = HAI.A00(hai.A00, hai).A02;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        UserSession userSession = ugy.A0I;
        C229352nF A002 = C229342nE.A00(userSession);
        String str = ugy.A0K;
        C298845u8 r1 = C276114sa.A00;
        C18621VvE vvE = ugy.A09;
        C16672Uz8 uz8 = C16672Uz8.CLIPS;
        C298855u9 A003 = r1.A00(vvE.A02(uz8));
        A003.A00 = C18621VvE.A00(ugy.A09, uz8).A04.A03.A07;
        A002.A03(A003.A00(), C294895nD.DEFAULT, str, arrayList, true, true);
        FragmentActivity fragmentActivity = ugy.A0G;
        C270634h3 r12 = new C270634h3(ClipsViewerSource.LOCATION, userSession);
        r12.A1B = C18231Vnv.A01(ugy.A02);
        1Xj r0 = r13.A02;
        r0.getClass();
        r12.A1C = r0.getId();
        r12.A1F = str;
        r12.A1c = false;
        C250563lf.A0Y(fragmentActivity, r12.A00(), userSession);
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r8, int i) {
        WW4 ww4 = this.A00.A06;
        1Xj r3 = r8.A02;
        r3.getClass();
        return ww4.DQs(motionEvent, view, new C296995qz((i - 1) % 3, i / 3), r3);
    }
}
