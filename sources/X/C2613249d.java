package X;

import android.view.View;
import com.facebook.analytics.dsp.point.IgPointContextProvider;
import com.meta.analytics.gnv.vista.core.CoreVistaManager;
import java.util.concurrent.CancellationException;

/* renamed from: X.49d  reason: invalid class name and case insensitive filesystem */
public final class C2613249d implements C2613349e, 0lm {
    public final 0lg A00;
    public final CoreVistaManager A01;
    public final AnonymousClass4CD A02 = new AnonymousClass4CD(this);
    public final C262224Cq A03 = 19E.A03(AnonymousClass12T.A00.CO6(607866630, 3), 19E.A02(new AnonymousClass19G((C262204Co) null)));
    public final IgPointContextProvider A04;
    public final C2613549g A05;

    public final /* bridge */ /* synthetic */ void AAO(C59560JOg jOg, Object obj, Object obj2, String str, boolean z) {
        View view = (View) obj;
        0qQ.A0B(view, 0);
        this.A01.A02(view, jOg, obj2, str);
    }

    public final /* bridge */ /* synthetic */ void EEi(Object obj) {
        View view = (View) obj;
        0qQ.A0B(view, 0);
        CoreVistaManager coreVistaManager = this.A01;
        synchronized (coreVistaManager.A04) {
            CoreVistaManager.A00(view, coreVistaManager);
        }
    }

    public C2613249d(0lg r12) {
        this.A00 = r12;
        IgPointContextProvider igPointContextProvider = new IgPointContextProvider(AnonymousClass3GM.A01);
        this.A04 = igPointContextProvider;
        0Tu r2 = 0Tu.A05;
        C2613549g r4 = new C2613549g((int) 182.A01(r2, r12, 36593121365590992L), (int) 182.A01(r2, r12, 36593121365656529L), 182.A01(r2, r12, 36593121365722066L), 182.A06(r2, r12, 2342154655602770613L), 182.A06(r2, r12, 36311646389535416L));
        this.A05 = r4;
        this.A01 = new CoreVistaManager(igPointContextProvider, r4);
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass1J9.A00().A02(this.A02);
        19E.A05((CancellationException) null, this.A03);
    }
}
