package X;

import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import java.util.Collections;
import java.util.List;

/* renamed from: X.And  reason: case insensitive filesystem */
public final class C41055And implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C380589Yt A01;

    public C41055And(C380589Yt r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        C380589Yt r3 = this.A01;
        int i = this.A00;
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        List unmodifiableList = Collections.unmodifiableList(((AnonymousClass876) r3.A07.getValue()).A08);
        0qQ.A07(unmodifiableList);
        AnonymousClass87G r1 = (AnonymousClass87G) 00k.A0O(unmodifiableList, i);
        if (r1 != null) {
            ((ReboundViewPager) r3.A0A.getValue()).A0K(i);
            0sK r32 = r3.A02;
            if (r32 != null) {
                r32.invoke(r1.A0G, r1.getId(), AnonymousClass7TE.A0u());
            }
        }
    }
}
