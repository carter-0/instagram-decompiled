package X;

import android.view.View;

/* renamed from: X.IBj  reason: case insensitive filesystem */
public final class C56760IBj implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C56760IBj(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a5, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02e3, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02e6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        X.0qQ.A0F(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r5 = r22
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x02bb;
                case 1: goto L_0x0031;
                case 2: goto L_0x029e;
                case 3: goto L_0x0281;
                case 4: goto L_0x016a;
                case 5: goto L_0x0116;
                case 6: goto L_0x0266;
                case 7: goto L_0x024b;
                case 8: goto L_0x01f6;
                case 9: goto L_0x01d5;
                case 10: goto L_0x01b4;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 1226123920(0x49152a90, float:610985.0)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r5.A03
            X.Gzh r1 = (X.C54112Gzh) r1
            java.lang.Object r7 = r5.A02
            X.1Xj r7 = (X.1Xj) r7
            int r13 = r5.A01
            boolean r0 = r7.CbC()
            if (r0 == 0) goto L_0x002e
            X.3Ym r5 = X.C243373Ym.NOT_SAVED
        L_0x0020:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r6 = r1.A00
            if (r6 != 0) goto L_0x0070
            java.lang.String r6 = "bottomButtons"
        L_0x0026:
            X.0qQ.A0F(r6)
            X.00P r3 = X.AnonymousClass00P.createAndThrow()
            throw r3
        L_0x002e:
            X.3Ym r5 = X.C243373Ym.SAVED
            goto L_0x0020
        L_0x0031:
            r0 = 1380549547(0x524983ab, float:2.16374362E11)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r5.A03
            X.H0W r3 = (X.H0W) r3
            androidx.viewpager2.widget.ViewPager2 r0 = r3.A00
            java.lang.String r6 = "viewPager"
            if (r0 == 0) goto L_0x0026
            int r0 = r0.A00
            int r2 = r5.A01
            if (r0 != r2) goto L_0x0063
            java.lang.Object r1 = r5.A02
            X.6zy r0 = r3.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0063
            X.0eM r0 = r3.A07
            java.lang.Object r1 = r0.getValue()
            X.Gh5 r1 = (X.C53014Gh5) r1
            X.Ibo r0 = X.C57500Ibo.A00
            X.JML[] r0 = new X.JML[]{r0}
            r1.A00(r0)
        L_0x0063:
            androidx.viewpager2.widget.ViewPager2 r1 = r3.A00
            if (r1 == 0) goto L_0x0026
            r0 = 1
            r1.A03(r2, r0)
            r0 = 1807023455(0x6bb4fd5f, float:4.376063E26)
            goto L_0x02e3
        L_0x0070:
            X.3Ym r4 = X.C243373Ym.SAVED
            android.content.Context r3 = r1.requireContext()
            r0 = 2131971374(0x7f134d2e, float:1.9579726E38)
            if (r5 != r4) goto L_0x007e
            r0 = 2131971377(0x7f134d31, float:1.9579732E38)
        L_0x007e:
            java.lang.String r0 = r3.getString(r0)
            r6.setPrimaryActionText(r0)
            X.4DU r8 = r1.A01
            androidx.fragment.app.FragmentActivity r15 = r1.requireActivity()
            X.0eM r0 = r1.A02
            com.instagram.common.session.UserSession r17 = X.AnonymousClass7TE.A0l(r0)
            r10 = 0
            android.content.Context r16 = r1.requireContext()
            r14 = 0
            r18 = r7
            r19 = r8
            r20 = r5
            r21 = r13
            com.instagram.save.api.SaveApiUtil.A05(r15, r16, r17, r18, r19, r20, r21)
            if (r5 != r4) goto L_0x0111
            androidx.fragment.app.FragmentActivity r5 = r1.requireActivity()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            X.3W1 r9 = new X.3W1
            r9.<init>()
            java.lang.String r12 = "single_tap"
            r11 = r10
            X.I56.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1Xy r3 = r7.A0C
            java.util.List r3 = r3.Asj()
            if (r3 == 0) goto L_0x0111
            java.lang.Object r4 = X.00k.A0J(r3)
            X.DTe r4 = (X.C46275DTe) r4
            if (r4 == 0) goto L_0x0111
            X.0lg r3 = X.DbT.A0X(r0)
            r0 = 1
            X.0wc r1 = X.DbT.A0Q(r1, r3, r0)
            java.lang.String r0 = "ig_lumen_recipe_sheet_overflow_button_tap"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r7.A2n()
            if (r0 == 0) goto L_0x0111
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r0)
            if (r1 == 0) goto L_0x0111
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0111
            X.Gju r0 = new X.Gju
            r0.<init>()
            java.util.List r1 = X.G9w.A0m(r3, r0, r4, r1)
            java.lang.String r0 = "ig_lumen_recipe_sheet"
            X.DbS.A1O(r3, r0)
            java.lang.String r0 = "recipe_sheet"
            X.DbS.A1G(r3, r0)
            X.C51972G9s.A14(r3, r7)
            java.lang.String r0 = "recommendation_info"
            r3.AAe(r0, r1)
            r0 = 3911(0xf47, float:5.48E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "button_text_enum"
            r3.AAJ(r0, r1)
            X.DbX.A1L(r3)
        L_0x0111:
            r0 = 556700910(0x212e94ee, float:5.91506E-19)
            goto L_0x01a5
        L_0x0116:
            r0 = 453103188(0x1b01ce54, float:1.0737298E-22)
            int r1 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r5.A03
            X.GCR r0 = (X.GCR) r0
            androidx.fragment.app.FragmentActivity r11 = r0.A00
            X.4DH r13 = r0.A01
            X.4DU r6 = r0.A04
            com.instagram.common.session.UserSession r4 = r0.A03
            X.93U r7 = r0.A06
            java.lang.Object r2 = r5.A02
            X.4bN r2 = (X.C267324bN) r2
            X.Hlh r0 = r0.A09
            java.lang.String r8 = r0.A00
            if (r8 == 0) goto L_0x015f
            int r10 = r5.A01
            r17 = 0
            r16 = 1
            X.1Xj r5 = r2.A02
            if (r5 == 0) goto L_0x0146
            java.lang.String r9 = X.GN9.A00(r5)
            X.C52086GEg.A0k(r4, r5, r6, r7, r8, r9, r10)
        L_0x0146:
            X.28D r14 = X.28D.A1q
            X.Hrt r0 = X.I7J.A04(r14, r2, r4)
            if (r0 == 0) goto L_0x015d
            android.os.Bundle r12 = r0.A00()
        L_0x0152:
            r15 = r4
            X.I3M.A01(r11, r12, r13, r14, r15, r16, r17)
            r0 = 747664192(0x2c907340, float:4.1055215E-12)
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x015d:
            r12 = 0
            goto L_0x0152
        L_0x015f:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            r0 = 400172531(0x17da25f3, float:1.40975E-24)
            X.AnonymousClass0fD.A0C(r0, r1)
            throw r3
        L_0x016a:
            r0 = -643001576(0xffffffffd9ac9318, float:-6.0719284E15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r5.A03
            X.Ght r7 = (X.C53061Ght) r7
            X.JQj r6 = r7.A03
            java.lang.Object r0 = r5.A02
            X.4bN r0 = (X.C267324bN) r0
            X.1Xj r4 = r0.A02
            if (r4 == 0) goto L_0x01a9
            X.Wv8 r0 = r7.A01()
            java.util.List r0 = r0.A00
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x018d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x019b
            X.1Xj r0 = X.C51968G9o.A0n(r1)
            r3.add(r0)
            goto L_0x018d
        L_0x019b:
            X.HlW r1 = r7.A04
            int r0 = r5.A01
            r6.D3l(r4, r1, r3, r0)
            r0 = 1750318952(0x6853bf68, float:3.9998006E24)
        L_0x01a5:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x01a9:
            java.lang.IllegalStateException r3 = X.AnonymousClass7TE.A0y()
            r0 = -1136497276(0xffffffffbc426d84, float:-0.011866931)
            X.AnonymousClass0fD.A0C(r0, r2)
            throw r3
        L_0x01b4:
            r0 = 1826664887(0x6ce0b1b7, float:2.173109E27)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r5.A03
            X.HKe r1 = (X.C54595HKe) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0iw r6 = r1.A00
            com.instagram.common.session.UserSession r3 = r1.A01
            X.1Xj r2 = r1.A05
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            int r0 = r5.A01
            X.C52086GEg.A0d(r6, r3, r2, r1, r0)
            r0 = -1359196388(0xffffffffaefc4f1c, float:-1.1473686E-10)
            goto L_0x02e3
        L_0x01d5:
            r0 = 1310140993(0x4e172a41, float:6.3403219E8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r5.A03
            X.HKd r1 = (X.C54594HKd) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0iw r6 = r1.A00
            com.instagram.common.session.UserSession r3 = r1.A01
            X.1Xj r2 = r1.A05
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            int r0 = r5.A01
            X.C52086GEg.A0d(r6, r3, r2, r1, r0)
            r0 = 1038160832(0x3de113c0, float:0.10990095)
            goto L_0x02e3
        L_0x01f6:
            r0 = -1575484847(0xffffffffa2180251, float:-2.0601068E-18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r5.A03
            X.HKf r7 = (X.C54596HKf) r7
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.0iw r6 = r7.A02
            com.instagram.common.session.UserSession r3 = r7.A03
            X.1Xj r2 = r7.A09
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            int r0 = r5.A01
            X.C52086GEg.A0d(r6, r3, r2, r1, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327082498078882(0x810f4a000638a2, double:3.0367314769807066E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0246
            com.instagram.clips.model.metadata.AudioPageMetadata r2 = r7.A00
            if (r2 == 0) goto L_0x0246
            X.H0K r6 = r7.A0A
            java.lang.String r1 = X.AnonymousClass7TF.A0b()
            r0 = 0
            android.os.Bundle r5 = X.C250563lf.A02(r0, r0, r2, r1)
            X.0qQ.A07(r5)
            X.0eM r0 = r6.A03
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            java.lang.String r0 = "audio_page"
            X.6W8 r0 = X.DbS.A0b(r1, r5, r3, r2, r0)
            X.DbT.A1M(r6, r0)
        L_0x0246:
            r0 = -885846546(0xffffffffcb330dee, float:-1.173451E7)
            goto L_0x02e3
        L_0x024b:
            r0 = 1089229730(0x40ec53a2, float:7.385209)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r5.A03
            X.H0A r2 = (X.H0A) r2
            java.lang.Object r1 = r5.A02
            X.1Xj r1 = (X.1Xj) r1
            int r0 = r5.A01
            X.H0A.A00(r1, r2, r0)
            X.DbZ.A15(r2)
            r0 = -666732027(0xffffffffd8427a05, float:-8.553173E14)
            goto L_0x02e3
        L_0x0266:
            r0 = -666458800(0xffffffffd846a550, float:-8.7365326E14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r5.A03
            X.H0A r2 = (X.H0A) r2
            java.lang.Object r1 = r5.A02
            X.1Xj r1 = (X.1Xj) r1
            int r0 = r5.A01
            X.H0A.A00(r1, r2, r0)
            X.DbZ.A15(r2)
            r0 = 1448804272(0x565affb0, float:6.0197926E13)
            goto L_0x02e3
        L_0x0281:
            r0 = -1446628732(0xffffffffa9c63284, float:-8.8017294E-14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r5.A03
            X.Gdx r0 = (X.C52864Gdx) r0
            X.Htl r6 = r0.A00
            java.lang.Object r3 = r5.A02
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r3 = (com.instagram.api.schemas.OriginalAudioPartMetadataIntf) r3
            com.instagram.api.schemas.OriginalAudioSubtype r2 = com.instagram.api.schemas.OriginalAudioSubtype.A06
            int r1 = r5.A01
            r0 = 1
            r6.A03(r3, r2, r1, r0)
            r0 = -2056953655(0xffffffff856560c9, float:-1.0785305E-35)
            goto L_0x02e3
        L_0x029e:
            r0 = -1885987945(0xffffffff8f961b97, float:-1.4801769E-29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r5.A03
            X.Gi7 r0 = (X.C53074Gi7) r0
            X.Htl r6 = r0.A01
            java.lang.Object r3 = r5.A02
            com.instagram.api.schemas.OriginalAudioPartMetadataIntf r3 = (com.instagram.api.schemas.OriginalAudioPartMetadataIntf) r3
            com.instagram.api.schemas.OriginalAudioSubtype r2 = r0.A00
            int r1 = r5.A01
            r0 = 0
            r6.A03(r3, r2, r1, r0)
            r0 = -689438187(0xffffffffd6e80215, float:-1.2754782E14)
            goto L_0x02e3
        L_0x02bb:
            r0 = 191510812(0xb6a391c, float:4.5109725E-32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r5.A03
            X.H3v r0 = (X.C54226H3v) r0
            java.util.List r1 = r0.A06
            int r0 = r5.A01
            java.lang.Object r3 = r1.get(r0)
            X.32J r3 = (X.AnonymousClass32J) r3
            java.lang.Object r0 = r5.A02
            X.Hqn r0 = (X.C55982Hqn) r0
            java.util.List r0 = r0.A04
            r2 = 9
            X.1Xj r1 = X.DbZ.A0T(r0, r2)
            r0 = 0
            r3.DIH(r0, r1, r2)
            r0 = 240114193(0xe4fda11, float:2.5619715E-30)
        L_0x02e3:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56760IBj.onClick(android.view.View):void");
    }
}
