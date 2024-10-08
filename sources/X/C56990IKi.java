package X;

import android.graphics.PointF;
import android.graphics.RectF;
import com.instagram.showreelnative.ui.reels.IgShowreelNativeProgressView;

/* renamed from: X.IKi  reason: case insensitive filesystem */
public final class C56990IKi implements JQA {
    public final /* synthetic */ AnonymousClass62E A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C250973mM A02;
    public final /* synthetic */ C309696Zg A03;
    public final /* synthetic */ AnonymousClass6NK A04;
    public final /* synthetic */ IgShowreelNativeProgressView A05;

    public final /* synthetic */ void D2N(C55981Hqm hqm) {
    }

    public final /* synthetic */ void DP1(C55981Hqm hqm) {
    }

    public C56990IKi(AnonymousClass62E r1, C255773uh r2, C250973mM r3, C309696Zg r4, AnonymousClass6NK r5, IgShowreelNativeProgressView igShowreelNativeProgressView) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = igShowreelNativeProgressView;
    }

    public final void D20(C55981Hqm hqm) {
        AnonymousClass62E r4 = this.A00;
        if (r4 != null) {
            C55981Hqm hqm2 = hqm;
            C14526Txm txm = new C14526Txm(hqm2.A03, hqm2.A04);
            PointF pointF = hqm2.A00;
            RectF rectF = hqm2.A01;
            C255773uh r10 = this.A01;
            C255773uh r12 = r10;
            r4.A00(pointF, rectF, hqm2.A02, new C56994IKm(r12, this.A02, this.A03, this.A04, this.A05), txm, r10);
        }
    }
}
