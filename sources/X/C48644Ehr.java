package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ehr  reason: case insensitive filesystem */
public abstract class C48644Ehr {
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        AnonymousClass0iw A07;
        Object obj;
        AnonymousClass6Tm r1 = r17;
        Object A03 = r1.A03(0);
        0qQ.A0C(A03, C66579MXk.A00(5));
        List list = (List) A03;
        Object A02 = r1.A02();
        String A0p = DbS.A0p(A02);
        String str = (String) A02;
        String A0j = DbW.A0j(r1, A0p);
        C307896Rx r8 = r16;
        UserSession A0W = DbX.A0W(r8);
        FragmentActivity A04 = C308206Td.A04(r8);
        C307786Rm r9 = r8.A03;
        AnonymousClass3BQ valueOf = AnonymousClass3BQ.valueOf(AnonymousClass7TF.A0k(A0j));
        RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        C16165Upq upq = new C16165Upq((Activity) A04, rectF, (C230222pE) new FkY(1));
        AnonymousClass328 A0f = DbV.A0f(DbU.A0H(r8));
        if (r9 == null || (A07 = C308206Td.A07(r9)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        AnonymousClass32A r11 = new AnonymousClass32A(A07, A0W, A0f);
        C19518Wb4 wb4 = new C19518Wb4(rectF, 1);
        r11.A0C = (String) r9.A00(R.id.bloks_reel_tray_session_id);
        r11.A05 = upq;
        r11.A03 = ReelViewerConfig.A00();
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            16F A032 = AnonymousClass15o.A00.A03(AnonymousClass7TE.A18(it));
            0c5 r0 = 0c9.A04;
            0qQ.A0A(A032);
            0c9 A00 = 0c5.A00(A032, A0W);
            if (A00.A11() == null) {
                A00.A1J();
            }
            try {
                AnonymousClass3HX parseFromJson = AnonymousClass3HR.parseFromJson(A00);
                if (parseFromJson != null) {
                    A1C.add(ReelStore.A03(A0W).A0I(parseFromJson, A0W.A06.equals(parseFromJson.A1O)));
                }
            } catch (IOException unused) {
                1Kn.A02("IGBloksActionNavigationOpenStoryViewerImpl", "Unable to parse reel.");
            }
        }
        Iterator it2 = A1C.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            String id = ((Reel) obj).getId();
            0qQ.A07(id);
            if (00l.A0d(id, str, false)) {
                break;
            }
        }
        Reel reel = (Reel) obj;
        if (reel == null) {
            reel = (Reel) A1C.get(0);
        }
        r11.A06(reel, valueOf, wb4, A1C, A1C, 0);
        return null;
    }
}
