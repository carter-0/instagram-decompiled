package X;

import com.instagram.direct.visual.DirectVisualMessageViewerController;
import java.util.List;

public final class P3I implements C74454Pv9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ OW6 A01;
    public final /* synthetic */ DirectVisualMessageViewerController A02;

    public P3I(OW6 ow6, DirectVisualMessageViewerController directVisualMessageViewerController, int i) {
        this.A01 = ow6;
        this.A00 = i;
        this.A02 = directVisualMessageViewerController;
    }

    public final void DQ2() {
        DirectVisualMessageViewerController directVisualMessageViewerController = this.A02;
        C66819MdB mdB = directVisualMessageViewerController.A0D;
        if (mdB != null) {
            mdB.Ddu();
        }
        C59689JTv.A0F(directVisualMessageViewerController.A0e, "failed_to_load_video_toast", 2131961946);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r2.A0S != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DQX() {
        /*
            r5 = this;
            X.OW6 r0 = r5.A01
            int r4 = r5.A00
            X.N3h r3 = r0.A01(r4)
            if (r3 == 0) goto L_0x0019
            com.instagram.direct.visual.DirectVisualMessageViewerController r2 = r5.A02
            boolean r0 = r2.A0R
            if (r0 == 0) goto L_0x0015
            boolean r1 = r2.A0S
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.instagram.direct.visual.DirectVisualMessageViewerController.A09(r3, r2, r4, r0)
        L_0x0019:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P3I.DQX():void");
    }

    public final void DQk(C68167N3h n3h, C68167N3h n3h2) {
        List list = this.A01.A03;
        int indexOf = list.indexOf(n3h);
        if (indexOf != -1) {
            list.set(indexOf, n3h2);
        }
    }
}
