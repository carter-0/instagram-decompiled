package X;

import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.PZu  reason: case insensitive filesystem */
public final class C73276PZu implements Runnable {
    public final /* synthetic */ IgGltfSceneLayoutView A00;
    public final /* synthetic */ Integer A01;

    public C73276PZu(IgGltfSceneLayoutView igGltfSceneLayoutView, Integer num) {
        this.A00 = igGltfSceneLayoutView;
        this.A01 = num;
    }

    public final void run() {
        IgGltfSceneLayoutView igGltfSceneLayoutView = this.A00;
        Integer num = this.A01;
        if (num != igGltfSceneLayoutView.A04) {
            if (AnonymousClass05K.A01 == num) {
                IgGltfSceneLayoutView.A00(igGltfSceneLayoutView, AnonymousClass05K.A0C);
                C72988PRx pRx = igGltfSceneLayoutView.A02;
                if (pRx != null) {
                    Long l = pRx.A00;
                    if (l != null) {
                        long longValue = l.longValue();
                        ORW.A01(pRx.A01, Long.valueOf(C51966G9m.A07(longValue)), "render_time", ORW.A00(pRx.A02), (String) null);
                    }
                    pRx.A00 = null;
                }
            } else if (AnonymousClass05K.A0C == num) {
                IgGltfSceneLayoutView.A00(igGltfSceneLayoutView, AnonymousClass05K.A0N);
            }
        }
        igGltfSceneLayoutView.A04 = num;
        igGltfSceneLayoutView.A03.A03.A08 = num;
    }
}
