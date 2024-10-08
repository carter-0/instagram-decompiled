package X;

import com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController;

public final class KIO extends AnonymousClass0mG {
    public final /* synthetic */ ClipsTimelineEditorDrawerController A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIO(ClipsTimelineEditorDrawerController clipsTimelineEditorDrawerController) {
        super(1000);
        this.A00 = clipsTimelineEditorDrawerController;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (X.JTO.A08(r0) != 1) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.view.View r15) {
        /*
            r14 = this;
            com.instagram.creation.capture.quickcapture.sundial.ClipsTimelineEditorDrawerController r0 = r14.A00
            X.WMw r0 = r0.A0C
            if (r0 == 0) goto L_0x0108
            X.0hq r1 = r0.A0E
            r0 = 2131433135(0x7f0b16af, float:1.8488047E38)
            androidx.fragment.app.Fragment r4 = r1.A0P(r0)
        L_0x000f:
            boolean r0 = r4 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment
            if (r0 == 0) goto L_0x0066
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r4 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r4
            android.view.View r8 = r4.mView
            if (r8 == 0) goto L_0x0066
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r4.A0Z
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "clipsCreationViewModel"
        L_0x001f:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0027:
            java.lang.String r5 = r0.A0L()
            if (r5 == 0) goto L_0x0067
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()
            if (r3 == 0) goto L_0x0066
            boolean r0 = r3.isDestroyed()
            if (r0 != 0) goto L_0x010b
            boolean r0 = r3.isFinishing()
            if (r0 != 0) goto L_0x010b
            X.27r r0 = X.JTQ.A0I(r4)
            r0.A0d()
            X.8ab r2 = X.DbS.A0X(r3)
            r0 = 2131955493(0x7f130f25, float:1.9547515E38)
            r2.A09(r0)
            r1 = 2131955492(0x7f130f24, float:1.9547513E38)
            r0 = 1
            X.DbY.A0w(r3, r2, r5, r1)
            r2.A06()
            r2.A0s(r0)
            android.app.Dialog r0 = r2.A02()
            X.AnonymousClass0fN.A00(r0)
            r4.A03 = r0
        L_0x0066:
            return
        L_0x0067:
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineViewController r2 = r4.A0F
            if (r2 != 0) goto L_0x006e
            java.lang.String r0 = "viewController"
            goto L_0x001f
        L_0x006e:
            r4 = 0
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r7 = r2.A0E
            boolean r0 = r7.A0o()
            if (r0 == 0) goto L_0x0088
            r3 = 2131957315(0x7f131643, float:1.955121E38)
            X.4DH r0 = r2.A09
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x0066
            X.LRJ r0 = X.LRJ.A02
            r0.A01(r1, r3)
            return
        L_0x0088:
            X.8RF r1 = r2.A0G
            X.8RH r0 = r1.A0E()
            boolean r0 = r0 instanceof X.C355718Rb
            if (r0 != 0) goto L_0x0066
            X.8RH r0 = r1.A0E()
            boolean r0 = r0 instanceof X.C355708Ra
            if (r0 != 0) goto L_0x0066
            X.83H r0 = r7.A0L
            X.8J0 r6 = r0.A00
            int r3 = X.JTO.A07(r7)
            r5 = 0
            java.lang.Integer r1 = r7.A0I(r4)
            com.instagram.common.session.UserSession r0 = r2.A0A
            android.content.Context r8 = r8.getContext()
            boolean r0 = X.C52345GOp.A08(r8, r6, r0, r1, r3)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r7.A0r()
            r3 = 1
            r10 = r0 ^ 1
            boolean r0 = r7.A0s()
            r11 = r0 ^ 1
            X.2gB r1 = r7.A0F
            X.831 r0 = X.JTO.A0h(r1)
            if (r0 == 0) goto L_0x00cf
            int r0 = X.JTO.A08(r0)
            r12 = 1
            if (r0 == r3) goto L_0x00d0
        L_0x00cf:
            r12 = 0
        L_0x00d0:
            X.831 r0 = X.JTO.A0h(r1)
            r1 = 0
            if (r0 == 0) goto L_0x00dd
            X.51O r1 = r0.A04(r4)
            X.51N r1 = (X.AnonymousClass51N) r1
        L_0x00dd:
            boolean r0 = r1 instanceof X.AnonymousClass51M
            if (r0 == 0) goto L_0x00ee
            X.51M r1 = (X.AnonymousClass51M) r1
            if (r1 == 0) goto L_0x00ee
            X.51R r0 = r1.A0F
            if (r0 == 0) goto L_0x00ee
            int r0 = r0.A08
            if (r0 != 0) goto L_0x00ee
            r5 = 1
        L_0x00ee:
            r13 = r5 ^ 1
            X.88B r0 = r2.A0I
            X.82i r0 = r0.A00
            if (r0 == 0) goto L_0x0106
            X.8JI r9 = r0.A00
        L_0x00f8:
            boolean r0 = X.C52345GOp.A09(r8, r9, r10, r11, r12, r13)
            if (r0 != 0) goto L_0x0066
            X.8RL r1 = r2.A0F
            X.Ln8 r0 = X.C65087Ln8.A00
            r1.A0F(r0)
            return
        L_0x0106:
            r9 = 0
            goto L_0x00f8
        L_0x0108:
            r4 = 0
            goto L_0x000f
        L_0x010b:
            android.widget.Toast r0 = r4.A05
            if (r0 == 0) goto L_0x0112
            r0.cancel()
        L_0x0112:
            X.27r r0 = X.JTQ.A0I(r4)
            r0.A0e()
            android.content.Context r0 = r4.requireContext()
            android.widget.Toast r0 = X.C64169LRs.A00(r0, r5)
            r4.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KIO.A00(android.view.View):void");
    }
}
