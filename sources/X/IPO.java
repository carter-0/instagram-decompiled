package X;

import android.view.View;
import com.google.common.collect.MapMakerInternalMap;
import com.instagram.android.R;
import com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView;
import java.util.Map;

public final class IPO implements C250603lj {
    public float A00;
    public final Map A01;
    public final boolean A02;

    private final C267934cU A00(C267324bN r4) {
        View view;
        View view2 = (View) this.A01.get(r4);
        if (view2 != null) {
            view = view2.findViewById(R.id.clips_showreel_bloks_v2_component_id);
        } else {
            view = null;
        }
        if (view instanceof C267934cU) {
            return (C267934cU) view;
        }
        return null;
    }

    private final ServerRenderedSponsoredContentView A01(C267324bN r3) {
        View view = (View) this.A01.get(r3);
        if (view == null) {
            return null;
        }
        ServerRenderedSponsoredContentView serverRenderedSponsoredContentView = (ServerRenderedSponsoredContentView) view.findViewById(R.id.sponsored_clips_showreel_view);
        if (serverRenderedSponsoredContentView == null) {
            return (ServerRenderedSponsoredContentView) view.findViewById(R.id.clips_server_rendered_component_id);
        }
        return serverRenderedSponsoredContentView;
    }

    public IPO(boolean z) {
        this.A02 = z;
        17j r1 = new 17j();
        r1.A04(MapMakerInternalMap.Strength.A01);
        r1.A01();
        this.A01 = r1.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r7.A02 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ATF(X.AnonymousClass30Y r8, X.C252093oY r9) {
        /*
            r7 = this;
            X.AnonymousClass7TG.A1N(r8, r9)
            java.lang.Object r4 = r8.A03
            X.4bN r4 = (X.C267324bN) r4
            X.3OA r0 = r4.A06()
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0047
            float r2 = r9.CFe(r8)
            boolean r0 = X.C51968G9o.A1V(r4)
            if (r0 == 0) goto L_0x0020
            boolean r0 = r7.A02
            r6 = 1
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r6 = 0
        L_0x0021:
            float r5 = r7.A00
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L_0x0032
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x005d
        L_0x0032:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005d
            if (r6 == 0) goto L_0x0048
            X.4cU r0 = r7.A00(r4)
            if (r0 == 0) goto L_0x0045
            r0.DzB()
        L_0x0045:
            r7.A00 = r2
        L_0x0047:
            return
        L_0x0048:
            com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView r1 = r7.A01(r4)
            if (r1 == 0) goto L_0x0045
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r0 = r1.A03
            if (r0 == 0) goto L_0x0055
            r0.DzB()
        L_0x0055:
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r0 = r1.A02
            if (r0 == 0) goto L_0x0045
            r0.DzB()
            goto L_0x0045
        L_0x005d:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0086
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0086
            if (r6 == 0) goto L_0x0071
            X.4cU r0 = r7.A00(r4)
            if (r0 == 0) goto L_0x0045
            r0.Dyz()
            goto L_0x0045
        L_0x0071:
            com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView r1 = r7.A01(r4)
            if (r1 == 0) goto L_0x0045
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r0 = r1.A03
            if (r0 == 0) goto L_0x007e
            r0.Dyz()
        L_0x007e:
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r0 = r1.A02
            if (r0 == 0) goto L_0x0045
            r0.Dyz()
            goto L_0x0045
        L_0x0086:
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0045
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0045
            if (r6 == 0) goto L_0x009a
            X.4cU r0 = r7.A00(r4)
            if (r0 == 0) goto L_0x0045
            r0.Dz8()
            goto L_0x0045
        L_0x009a:
            com.instagram.sponsored.serverrendered.ServerRenderedSponsoredContentView r1 = r7.A01(r4)
            if (r1 == 0) goto L_0x0045
            com.instagram.showreelnative.ui.common.ShowreelNativeMediaView r0 = r1.A03
            if (r0 == 0) goto L_0x00a7
            r0.Dz8()
        L_0x00a7:
            com.instagram.showreel.composition.ui.IgShowreelCompositionView r0 = r1.A02
            if (r0 == 0) goto L_0x0045
            r0.Dz8()
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.IPO.ATF(X.30Y, X.3oY):void");
    }
}
