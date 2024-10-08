package X;

import com.instagram.reels.viewer.attribution.CyclingFrameLayout;
import java.util.List;

/* renamed from: X.PbF  reason: case insensitive filesystem */
public final /* synthetic */ class C73356PbF implements Runnable {
    public final /* synthetic */ C330447Mu A00;
    public final /* synthetic */ AnonymousClass7LZ A01;
    public final /* synthetic */ CyclingFrameLayout A02;
    public final /* synthetic */ List A03;

    public /* synthetic */ C73356PbF(C330447Mu r1, AnonymousClass7LZ r2, CyclingFrameLayout cyclingFrameLayout, List list) {
        this.A00 = r1;
        this.A02 = cyclingFrameLayout;
        this.A01 = r2;
        this.A03 = list;
    }

    public final void run() {
        C330447Mu r4 = this.A00;
        CyclingFrameLayout cyclingFrameLayout = this.A02;
        AnonymousClass7LZ r1 = this.A01;
        List list = this.A03;
        cyclingFrameLayout.A05 = r1.A0I;
        cyclingFrameLayout.setTimeToShowEachAttributionMs(r1.A0H);
        cyclingFrameLayout.A04 = new PJY(r4, r1);
        AnonymousClass0fU.A00(new C71288Ohk(cyclingFrameLayout), cyclingFrameLayout);
        cyclingFrameLayout.A01 = 0.5f;
        if (list.isEmpty() || list.size() == 1) {
            cyclingFrameLayout.A04();
        } else {
            cyclingFrameLayout.A05(r4.A0Q, list);
        }
    }
}
