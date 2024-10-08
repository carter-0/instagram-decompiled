package X;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import org.json.JSONObject;

/* renamed from: X.88D  reason: invalid class name */
public final class AnonymousClass88D {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ AnonymousClass82W A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C3504884v A04;
    public final /* synthetic */ C3497481o A05;
    public final /* synthetic */ ClipsCreationViewModel A06;
    public final /* synthetic */ C3498982i A07;
    public final /* synthetic */ AnonymousClass88B A08;

    public final void A01(2Cn r3, String str) {
        C290815g0 r0;
        0qQ.A0B(r3, 0);
        0qQ.A0B(str, 1);
        if (this.A08.A06.A02() == AnonymousClass88C.DOWNLOADING) {
            C39863ACj.A02.getValue();
            if (0qQ.A0K(C39863ACj.A01, str) && (r0 = C39863ACj.A00) != null) {
                r0.A00 = r3;
            }
        }
    }

    public AnonymousClass88D(ViewGroup viewGroup, FragmentActivity fragmentActivity, AnonymousClass82W r3, UserSession userSession, C3504884v r5, C3497481o r6, ClipsCreationViewModel clipsCreationViewModel, C3498982i r8, AnonymousClass88B r9) {
        this.A06 = clipsCreationViewModel;
        this.A01 = fragmentActivity;
        this.A02 = r3;
        this.A08 = r9;
        this.A04 = r5;
        this.A07 = r8;
        this.A05 = r6;
        this.A00 = viewGroup;
        this.A03 = userSession;
    }

    public final void A00() {
        AnonymousClass831 r1 = (AnonymousClass831) this.A06.A0G.A02();
        if (r1 != null) {
            AnonymousClass88B r0 = this.A08;
            AnonymousClass82W r3 = this.A02;
            if (r0.A03.A02() instanceof C340007kX) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("clipStartTimeMs", r1.A00);
                r3.A00().A09(jSONObject);
            }
        }
    }
}
