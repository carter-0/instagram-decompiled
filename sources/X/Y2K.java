package X;

import androidx.media3.common.Timeline;
import java.util.Arrays;
import java.util.List;

public final /* synthetic */ class Y2K implements Runnable {
    public final /* synthetic */ C22056Xui A00;
    public final /* synthetic */ XU0 A01;

    public /* synthetic */ Y2K(C22056Xui xui, XU0 xu0) {
        this.A00 = xui;
        this.A01 = xu0;
    }

    public final void run() {
        C22056Xui xui = this.A00;
        XU0 xu0 = this.A01;
        int i = xui.A02 - xu0.A00;
        xui.A02 = i;
        if (i == 0) {
            Timeline timeline = xu0.A01.A06;
            if (!AnonymousClass7TF.A1Q(xui.A0A.A06.A02()) && AnonymousClass7TF.A1Q(timeline.A02())) {
                xui.A01 = -1;
            }
            if (!AnonymousClass7TF.A1Q(timeline.A02())) {
                List asList = Arrays.asList(((C21142XGj) timeline).A05);
                int size = asList.size();
                List list = xui.A0Z;
                C11366SPh.A02(AnonymousClass7TF.A1S(size, list.size()));
                if (0 < asList.size()) {
                    list.get(0);
                    asList.get(0);
                    throw AnonymousClass7TE.A11("timeline");
                }
            }
            C22056Xui.A04(xui, xu0.A01, 1);
        }
    }
}
