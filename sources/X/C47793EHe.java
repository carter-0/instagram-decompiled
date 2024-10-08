package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;
import java.util.LinkedHashSet;

/* renamed from: X.EHe  reason: case insensitive filesystem */
public final class C47793EHe extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C47793EHe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final boolean Dqe(View view) {
        G5D fkA;
        Object value;
        switch (this.A00) {
            case 0:
                AnonymousClass9QZ r2 = (AnonymousClass9QZ) this.A02;
                UserSession userSession = r2.A04;
                27p.A01(userSession);
                AnonymousClass9QZ.A00(r2, (Integer) this.A01);
                1Av A002 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A002, A002.A3p, 1Av.A8a, 20, true);
                return true;
            case 1:
                String str = ((C47176Drr) this.A01).A03;
                C47481E4g e4g = (C47481E4g) this.A02;
                if (str == null) {
                    C47481E4g.A03(e4g);
                    return true;
                }
                AnonymousClass0eM r0 = e4g.A04;
                UserSession A0l = AnonymousClass7TE.A0l(r0);
                FragmentActivity requireActivity = e4g.requireActivity();
                C270634h3 r1 = new C270634h3(ClipsViewerSource.FAN_CLUB, AnonymousClass7TE.A0l(r0));
                r1.A1C = str;
                r1.A1g = true;
                r1.A1c = false;
                DbU.A1M(requireActivity, r1, A0l);
                return true;
            case 2:
                ((C47785EGw) this.A02).A00.Dag((UO1) this.A01);
                return true;
            default:
                0qQ.A0B(view, 0);
                if (!view.isEnabled()) {
                    return false;
                }
                view.performHapticFeedback(3);
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                QuickSnapArchiveViewModel quickSnapArchiveViewModel = ((C47033DpP) this.A02).A0A;
                String str2 = ((C63868L9x) this.A01).A04;
                05G r5 = quickSnapArchiveViewModel.A0G;
                if (((C61082JwK) r5.getValue()).A01) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet((LinkedHashSet) ((C61082JwK) r5.getValue()).A00);
                    if (linkedHashSet.contains(str2)) {
                        linkedHashSet.remove(str2);
                    } else {
                        linkedHashSet.add(str2);
                    }
                    do {
                        value = r5.getValue();
                    } while (!r5.AIY(value, new C61082JwK(linkedHashSet, ((C61082JwK) value).A01)));
                    fkA = AeZ.A00;
                } else {
                    C359098c0.A00(C391559tH.TAP_ON_IMAGE_IN_ARCHIVE, quickSnapArchiveViewModel.A07, str2);
                    fkA = new FkA(str2);
                }
                QuickSnapArchiveViewModel.A01(fkA, quickSnapArchiveViewModel);
                return true;
        }
    }
}
