package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.base.IgReactQEModule;
import org.json.JSONObject;

/* renamed from: X.LdB  reason: case insensitive filesystem */
public final class C64509LdB implements C267624bv {
    public final int A00;
    public final Object A01;

    public C64509LdB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008e, code lost:
        r9.A05.CxD();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0093, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00dd, code lost:
        X.AnonymousClass7TE.A1Z(r8, r0);
        r0 = r1.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0155, code lost:
        r10.A0G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0158, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0203, code lost:
        X.AnonymousClass7TE.A1Z(r6, r0);
        r0 = r5.getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x020a, code lost:
        ((X.C314326i1) r0).A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x020f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void CxD() {
        /*
            r14 = this;
            int r0 = r14.A00
            switch(r0) {
                case 1: goto L_0x0094;
                case 2: goto L_0x0066;
                case 3: goto L_0x008a;
                case 4: goto L_0x0006;
                case 5: goto L_0x0005;
                case 6: goto L_0x00fd;
                case 7: goto L_0x0005;
                case 8: goto L_0x00b9;
                case 9: goto L_0x0159;
                case 10: goto L_0x0005;
                case 11: goto L_0x0082;
                case 12: goto L_0x0151;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r9 = r14.A01
            X.Ll8 r9 = (X.C64969Ll8) r9
            androidx.fragment.app.Fragment r6 = r9.A02
            boolean r0 = r6.mDetached
            if (r0 != 0) goto L_0x0005
            r0 = 38
            X.MJ0 r5 = new X.MJ0
            r5.<init>(r9, r0)
            r0 = 35
            X.MJ0 r3 = new X.MJ0
            r3.<init>(r6, r0)
            r11 = 0
            X.0eO r2 = X.0eO.A02
            r1 = 36
            X.MJ0 r0 = new X.MJ0
            r0.<init>(r3, r1)
            X.0eM r4 = X.AnonymousClass0eN.A00(r2, r0)
            java.lang.Class<X.6i1> r0 = X.C314326i1.class
            X.0Yh r3 = X.DbS.A0z(r0)
            r0 = 37
            X.MJ0 r2 = new X.MJ0
            r2.<init>(r4, r0)
            r1 = 5
            X.MJ9 r0 = new X.MJ9
            r0.<init>(r1, r11, r4)
            X.2kA r5 = X.DbS.A0I(r2, r5, r0, r3)
            java.lang.Object r0 = r5.getValue()
            X.6i1 r0 = (X.C314326i1) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r10 = r5.getValue()
            X.07U r8 = X.07U.A05
            X.07Z r7 = r6.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r7)
            r12 = 45
            X.MHG r6 = new X.MHG
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0203
        L_0x0066:
            java.lang.Object r0 = r14.A01
            X.GgO r0 = (X.C52971GgO) r0
            X.05G r3 = r0.A0P
            X.7a5 r0 = r0.A0B
            X.1Xl r0 = r0.A00
            if (r0 == 0) goto L_0x0080
            X.1Xj r2 = r0.BPf()
        L_0x0076:
            r1 = 1
            X.7ch r0 = new X.7ch
            r0.<init>(r2, r1, r1)
            r3.Epw(r0)
            return
        L_0x0080:
            r2 = 0
            goto L_0x0076
        L_0x0082:
            java.lang.Object r0 = r14.A01
            X.M0a r0 = (X.C65808M0a) r0
            X.C65808M0a.A00(r0)
            return
        L_0x008a:
            java.lang.Object r9 = r14.A01
            X.Ll8 r9 = (X.C64969Ll8) r9
        L_0x008e:
            X.8MH r0 = r9.A05
            r0.CxD()
            return
        L_0x0094:
            java.lang.Object r10 = r14.A01
            X.K3M r10 = (X.K3M) r10
            X.0eM r1 = r10.A02
            java.lang.Object r0 = r1.getValue()
            X.6i1 r0 = (X.C314326i1) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0155
            X.07U r9 = X.07U.A05
            X.07Z r11 = r10.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r11)
            r12 = 0
            r13 = 18
            X.MH4 r8 = new X.MH4
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x00dd
        L_0x00b9:
            java.lang.Object r11 = r14.A01
            X.K3N r11 = (X.K3N) r11
            X.0eM r1 = r11.A06
            java.lang.Object r0 = r1.getValue()
            X.6i1 r0 = (X.C314326i1) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00e6
            X.07U r10 = X.07U.A05
            X.07Z r9 = r11.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r9)
            r12 = 0
            r13 = 24
            X.MGh r8 = new X.MGh
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00dd:
            X.AnonymousClass7TE.A1Z(r8, r0)
            java.lang.Object r0 = r1.getValue()
            goto L_0x020a
        L_0x00e6:
            r11.A0G()
            X.0eM r0 = r11.A05
            java.lang.Object r2 = r0.getValue()
            X.JgY r2 = (X.C60153JgY) r2
            X.KUe r1 = X.C61981KUe.A00
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.05G r0 = r2.A02
            r0.Epw(r1)
            return
        L_0x00fd:
            java.lang.Object r10 = r14.A01
            X.K4g r10 = (X.C61364K4g) r10
            r0 = 1
            X.PhW r5 = new X.PhW
            r5.<init>(r10, r0)
            r0 = 48
            X.MMO r2 = new X.MMO
            r2.<init>(r10, r0)
            X.0eO r1 = X.0eO.A02
            r0 = 49
            X.0eM r4 = X.MMO.A00(r2, r1, r0)
            java.lang.Class<X.6i1> r0 = X.C314326i1.class
            X.0Yh r3 = X.DbS.A0z(r0)
            r0 = 0
            X.PhW r2 = new X.PhW
            r2.<init>(r4, r0)
            r11 = 0
            r1 = 23
            X.Phd r0 = new X.Phd
            r0.<init>(r1, r4, r11)
            X.2kA r5 = X.DbS.A0I(r2, r5, r0, r3)
            java.lang.Object r0 = r5.getValue()
            X.6i1 r0 = (X.C314326i1) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r9 = r5.getValue()
            X.07U r8 = X.07U.A05
            X.07Z r7 = r10.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r7)
            r12 = 19
            X.MHF r6 = new X.MHF
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L_0x0203
        L_0x0151:
            java.lang.Object r10 = r14.A01
            X.K4g r10 = (X.C61364K4g) r10
        L_0x0155:
            r10.A0G()
            return
        L_0x0159:
            java.lang.Object r10 = r14.A01
            X.DxF r10 = (X.DxF) r10
            r0 = 30
            X.MJ1 r5 = new X.MJ1
            r5.<init>(r10, r0)
            r0 = 27
            X.MJ1 r3 = new X.MJ1
            r3.<init>(r10, r0)
            X.0eO r2 = X.0eO.A02
            r1 = 28
            X.MJ1 r0 = new X.MJ1
            r0.<init>(r3, r1)
            X.0eM r4 = X.AnonymousClass0eN.A00(r2, r0)
            java.lang.Class<X.6i1> r0 = X.C314326i1.class
            X.0Yh r3 = X.DbS.A0z(r0)
            r0 = 29
            X.MJ1 r2 = new X.MJ1
            r2.<init>(r4, r0)
            r11 = 0
            r1 = 10
            X.MJ8 r0 = new X.MJ8
            r0.<init>(r1, r11, r4)
            X.2kA r5 = X.DbS.A0I(r2, r5, r0, r3)
            r0 = 31
            X.MJ1 r4 = new X.MJ1
            r4.<init>(r10, r0)
            java.lang.Class<com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel> r0 = com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel.class
            X.0Yh r3 = X.DbS.A0z(r0)
            r0 = 26
            X.MJ1 r2 = new X.MJ1
            r2.<init>(r10, r0)
            r1 = 9
            X.MJ8 r0 = new X.MJ8
            r0.<init>(r1, r11, r10)
            X.2kA r1 = X.DbS.A0I(r2, r4, r0, r3)
            java.lang.Object r0 = r1.getValue()
            com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel r0 = (com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel) r0
            com.instagram.reels.prompt.model.PromptStickerModel r4 = r0.A02
            java.lang.Object r0 = r1.getValue()
            com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel r0 = (com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel) r0
            X.6b1 r3 = r0.A03
            boolean r0 = r10.A0I
            if (r0 == 0) goto L_0x01e2
            if (r4 == 0) goto L_0x01e2
            if (r3 == 0) goto L_0x01e2
            X.7Pu r0 = r10.A08
            if (r0 == 0) goto L_0x01cf
            r0.A0L(r11)
        L_0x01cf:
            java.lang.Object r2 = r1.getValue()
            com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel r2 = (com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel) r2
            java.lang.Object r0 = r1.getValue()
            com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel r0 = (com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel) r0
            com.instagram.feed.media.CreativeConfigIntf r1 = r0.A00
            r0 = 1
            r2.A01(r1, r4, r3, r0)
            return
        L_0x01e2:
            java.lang.Object r0 = r5.getValue()
            X.6i1 r0 = (X.C314326i1) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0210
            java.lang.Object r9 = r5.getValue()
            X.07U r8 = X.07U.A05
            X.07Z r7 = r10.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r7)
            r12 = 25
            X.MHL r6 = new X.MHL
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0203:
            X.AnonymousClass7TE.A1Z(r6, r0)
            java.lang.Object r0 = r5.getValue()
        L_0x020a:
            X.6i1 r0 = (X.C314326i1) r0
            r0.A00()
            return
        L_0x0210:
            X.DxF.A00(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64509LdB.CxD():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        X.DbT.A1J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0059, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        r0.Epw(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CxF() {
        /*
            r3 = this;
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x0024;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x003b;
                case 6: goto L_0x004f;
                case 7: goto L_0x0006;
                case 8: goto L_0x005a;
                case 9: goto L_0x0005;
                case 10: goto L_0x0005;
                case 11: goto L_0x0005;
                case 12: goto L_0x0078;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r1 = r3.A01
            X.NJz r1 = (X.C68482NJz) r1
            X.0eM r0 = r1.A0d
            java.lang.Object r0 = r0.getValue()
            X.Gh2 r0 = (X.C53011Gh2) r0
            r0.A00()
            X.OO7 r1 = r1.A0E
            if (r1 == 0) goto L_0x0005
            X.0sn r0 = X.0sn.A00
            r1.A02(r0)
            return
        L_0x001f:
            java.lang.Object r2 = r3.A01
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            goto L_0x0056
        L_0x0024:
            java.lang.Object r2 = r3.A01
            X.K3M r2 = (X.K3M) r2
            r2.A0H()
            X.0eM r0 = r2.A03
            java.lang.Object r0 = r0.getValue()
            X.7cR r0 = (X.C335127cR) r0
            X.05G r1 = r0.A03
            X.K92 r0 = X.K92.A00
            r1.Epw(r0)
            goto L_0x0056
        L_0x003b:
            java.lang.Object r0 = r3.A01
            X.K3R r0 = (X.K3R) r0
            r0.A0H()
            X.Jh5 r1 = X.JTT.A0L(r0)
            X.KJt r2 = X.C61728KJt.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.05G r0 = r1.A03
            goto L_0x0074
        L_0x004f:
            java.lang.Object r2 = r3.A01
            X.K4g r2 = (X.C61364K4g) r2
            r2.A0H()
        L_0x0056:
            X.DbT.A1J(r2)
            return
        L_0x005a:
            java.lang.Object r0 = r3.A01
            X.K3N r0 = (X.K3N) r0
            r0.A0H()
            X.DbX.A1J(r0)
            X.0eM r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.JgY r1 = (X.C60153JgY) r1
            X.KUf r2 = X.C61982KUf.A00
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.05G r0 = r1.A02
        L_0x0074:
            r0.Epw(r2)
            return
        L_0x0078:
            java.lang.Object r1 = r3.A01
            X.K3O r1 = (X.K3O) r1
            r1.A0H()
            r0 = 1
            r1.A06 = r0
            X.DbZ.A17(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64509LdB.CxF():void");
    }

    public final void CxG() {
        switch (this.A00) {
            case 0:
                K4W k4w = (K4W) this.A01;
                C64301LZb lZb = k4w.A01;
                if (lZb != null) {
                    k4w.A06.getValue();
                    JSONObject A11 = DbS.A11();
                    A11.put("avatar", true);
                    A11.put("camera", true);
                    lZb.A03(AnonymousClass7TE.A1L("reset_event", A11));
                }
                C60052JeK jeK = k4w.A02;
                if (jeK != null) {
                    jeK.A00();
                    return;
                }
                return;
            case 9:
                DxF dxF = (DxF) this.A01;
                AnonymousClass27H r1 = 25x.A00(AnonymousClass7TE.A0l(dxF.A0P)).A01.A00;
                if (!0qQ.A0K(r1, C299715vi.A00) || 0qQ.A0K(r1, dxF.A07)) {
                    DbW.A1K(dxF.A08);
                    return;
                }
                return;
            case 10:
                ((C69086NeQ) this.A01).A03.A03(new PLY(true));
                return;
            default:
                return;
        }
    }

    public final void CxR() {
        Object obj;
        05G r0;
        switch (this.A00) {
            case 0:
                K4W k4w = (K4W) this.A01;
                C64301LZb lZb = k4w.A01;
                if (lZb != null) {
                    k4w.A06.getValue();
                    JSONObject A11 = DbS.A11();
                    A11.put(TraceFieldType.AdhocEventName, "reload_avatar");
                    lZb.A03(AnonymousClass7TE.A1L("avatar_fetch_event", A11));
                }
                C60052JeK jeK = k4w.A02;
                if (jeK != null) {
                    jeK.A00();
                    return;
                }
                return;
            case 1:
                K3M k3m = (K3M) this.A01;
                k3m.A0I();
                ((C335127cR) k3m.A03.getValue()).A03.Epw(K92.A00);
                return;
            case 5:
                K3R k3r = (K3R) this.A01;
                k3r.A0I();
                C60186Jh5 A0L = JTT.A0L(k3r);
                obj = C61729KJu.A00;
                0qQ.A0B(obj, 0);
                r0 = A0L.A03;
                break;
            case 6:
                ((C61364K4g) this.A01).A0I();
                return;
            case 7:
                C68482NJz nJz = (C68482NJz) this.A01;
                ((C53011Gh2) nJz.A0d.getValue()).A00();
                OO7 oo7 = nJz.A0E;
                if (oo7 != null) {
                    oo7.A02(0sn.A00);
                }
                07U r3 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = nJz.getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new MHI(viewLifecycleOwner, r3, nJz, (AnonymousClass4D7) null, 1), AnonymousClass07a.A00(viewLifecycleOwner));
                return;
            case 8:
                K3N k3n = (K3N) this.A01;
                k3n.A0I();
                obj = C61983KUg.A00;
                0qQ.A0B(obj, 0);
                r0 = ((C60153JgY) k3n.A05.getValue()).A02;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                K3O k3o = (K3O) this.A01;
                k3o.A0I();
                C62320sa r02 = k3o.A05;
                if (r02 != null) {
                    r02.invoke();
                    return;
                }
                return;
            default:
                return;
        }
        r0.Epw(obj);
    }
}
