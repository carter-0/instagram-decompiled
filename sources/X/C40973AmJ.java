package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.List;

/* renamed from: X.AmJ  reason: case insensitive filesystem */
public final class C40973AmJ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9Tu A01;

    public C40973AmJ(AnonymousClass9Tu r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void run() {
        AnonymousClass9Tu r4 = this.A01;
        List<SIO> list = (List) r4.A0X.A06(C266714aE.VIDEO).get(-1);
        if (list != null) {
            for (SIO sio : list) {
                MediaEffect mediaEffect = sio.A01;
                if (mediaEffect instanceof C40191AVf) {
                    C40191AVf aVf = (C40191AVf) mediaEffect;
                    C344737sL r1 = aVf.A01;
                    if ((r1 instanceof C382379db) && ((C382379db) r1).A05.contains(Integer.valueOf(this.A00))) {
                        C344737sL BQ9 = r4.A0G.BQ9();
                        if (BQ9 instanceof B3U) {
                            ((B3U) BQ9).A8F(aVf);
                        }
                    }
                }
            }
        }
    }
}
