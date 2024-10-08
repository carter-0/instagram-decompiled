package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.83m  reason: invalid class name and case insensitive filesystem */
public final class C3501583m {
    public final /* synthetic */ ClipsCreationViewModel A00;

    public C3501583m(ClipsCreationViewModel clipsCreationViewModel) {
        this.A00 = clipsCreationViewModel;
    }

    public final void A00(C359548d5 r3) {
        ClipsCreationViewModel clipsCreationViewModel = this.A00;
        if (!clipsCreationViewModel.A09) {
            ClipsCreationViewModel.A03(r3, clipsCreationViewModel, false);
            clipsCreationViewModel.A09 = true;
        }
    }

    public final void A01(C359548d5 r3) {
        ClipsCreationViewModel.A03(r3, this.A00, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r16.booleanValue() != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01d8, code lost:
        if ((!X.0qQ.A0K(r4, r0)) != false) goto L_0x01da;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C359548d5 r15, java.lang.Boolean r16) {
        /*
            r14 = this;
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r14.A00
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0049
            X.8Av r0 = r2.A02
            r4 = 0
            if (r0 == 0) goto L_0x021a
            X.8d5 r0 = r0.A00()
        L_0x000f:
            if (r0 == r15) goto L_0x0037
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unlock UndoRedo called for mismatched events: "
            r1.append(r0)
            X.8Av r0 = r2.A02
            if (r0 == 0) goto L_0x0217
            X.8d5 r0 = r0.A00()
        L_0x0023:
            r1.append(r0)
            java.lang.String r0 = " -- "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ClipsCreationViewModel"
            X.0kD.A07(r0, r1, r4)
        L_0x0037:
            r3 = 0
            if (r16 == 0) goto L_0x004a
            boolean r0 = r16.booleanValue()
            if (r0 == 0) goto L_0x01da
        L_0x0040:
            X.8Av r0 = r2.A02
            if (r0 == 0) goto L_0x0047
            r0.A01(r3)
        L_0x0047:
            r2.A09 = r3
        L_0x0049:
            return
        L_0x004a:
            X.8Av r0 = r2.A02
            if (r0 == 0) goto L_0x01da
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r0.A00
            X.5kq r8 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel.A01(r0)
            if (r8 == 0) goto L_0x01da
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r0.A0H
            X.8g5 r1 = r0.A05
            X.0Ud r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x01da
            java.util.ArrayList r1 = r1.A01
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0040
            java.lang.Object r0 = X.00k.A0L(r1)
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x0040
            java.lang.Object r5 = r0.A01
            X.5kq r5 = (X.C293505kq) r5
            if (r5 == 0) goto L_0x0040
            java.util.List r11 = r5.A0v
            int r1 = r11.size()
            java.util.List r10 = r8.A0v
            int r0 = r10.size()
            if (r1 != r0) goto L_0x01da
            int r9 = r11.size()
            r7 = 0
        L_0x0091:
            if (r7 >= r9) goto L_0x00e4
            java.lang.Object r13 = r11.get(r7)
            X.51M r13 = (X.AnonymousClass51M) r13
            java.lang.Object r12 = r10.get(r7)
            X.51M r12 = (X.AnonymousClass51M) r12
            java.lang.String r1 = r13.A0L
            java.lang.String r0 = r12.A0L
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01da
            java.lang.String r1 = r13.A0M
            java.lang.String r0 = r12.A0M
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01da
            float r1 = r13.A00
            float r0 = r12.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01da
            java.lang.String r1 = r13.CE4()
            java.lang.String r0 = r12.CE4()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01da
            int r1 = r13.A09
            int r0 = r12.A09
            if (r1 != r0) goto L_0x01da
            int r1 = r13.A08
            int r0 = r12.A08
            if (r1 != r0) goto L_0x01da
            int r6 = r13.A08
            int r0 = r13.A09
            int r6 = r6 - r0
            int r1 = r12.A08
            int r0 = r12.A09
            int r1 = r1 - r0
            if (r6 != r1) goto L_0x01da
            int r7 = r7 + 1
            goto L_0x0091
        L_0x00e4:
            X.8vh r7 = r5.A0C
            r9 = 0
            if (r7 == 0) goto L_0x0214
            X.8pV r0 = r7.A01
            if (r0 == 0) goto L_0x0214
            X.3QG r0 = r0.A08
            if (r0 == 0) goto L_0x0214
            int r0 = r0.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x00f7:
            X.8vh r6 = r8.A0C
            if (r6 == 0) goto L_0x0211
            X.8pV r0 = r6.A01
            if (r0 == 0) goto L_0x0211
            X.3QG r0 = r0.A08
            if (r0 == 0) goto L_0x0211
            int r0 = r0.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0109:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01da
            if (r7 == 0) goto L_0x020e
            X.8pV r0 = r7.A01
            if (r0 == 0) goto L_0x020e
            X.3QG r0 = r0.A08
            if (r0 == 0) goto L_0x020e
            int r0 = r0.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x011f:
            if (r6 == 0) goto L_0x012f
            X.8pV r0 = r6.A01
            if (r0 == 0) goto L_0x012f
            X.3QG r0 = r0.A08
            if (r0 == 0) goto L_0x012f
            int r0 = r0.A00
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x012f:
            boolean r0 = X.0qQ.A0K(r1, r9)
            if (r0 == 0) goto L_0x01da
            com.instagram.music.common.model.AudioOverlayTrack r9 = r5.A0N
            r5 = 0
            if (r9 == 0) goto L_0x020b
            int r0 = r9.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0140:
            com.instagram.music.common.model.AudioOverlayTrack r8 = r8.A0N
            if (r8 == 0) goto L_0x0208
            int r0 = r8.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x014a:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01da
            if (r9 == 0) goto L_0x0205
            int r0 = r9.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x0158:
            if (r8 == 0) goto L_0x0202
            int r0 = r8.A03
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0160:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01da
            if (r9 == 0) goto L_0x01ff
            int r0 = r9.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x016e:
            if (r8 == 0) goto L_0x01fc
            int r0 = r8.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0176:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01da
            if (r9 == 0) goto L_0x01fa
            java.lang.String r1 = r9.A0A
        L_0x0180:
            if (r8 == 0) goto L_0x01f8
            java.lang.String r0 = r8.A0A
        L_0x0184:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01da
            if (r7 == 0) goto L_0x01f6
            X.8pV r0 = r7.A01
            if (r0 == 0) goto L_0x01f6
            X.8vv r1 = r0.A03
        L_0x0192:
            if (r6 == 0) goto L_0x019a
            X.8pV r0 = r6.A01
            if (r0 == 0) goto L_0x019a
            X.8vv r5 = r0.A03
        L_0x019a:
            boolean r0 = X.0qQ.A0K(r1, r5)
            if (r0 == 0) goto L_0x01da
            r5 = 0
            if (r7 == 0) goto L_0x01f4
            X.8pV r0 = r7.A01
            if (r0 == 0) goto L_0x01f4
            com.instagram.camera.effect.models.CameraAREffect r1 = r0.A00
        L_0x01a9:
            if (r6 == 0) goto L_0x01b1
            X.8pV r0 = r6.A01
            if (r0 == 0) goto L_0x01b1
            com.instagram.camera.effect.models.CameraAREffect r5 = r0.A00
        L_0x01b1:
            boolean r0 = X.0qQ.A0K(r1, r5)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x01da
            r0 = 0
            if (r7 == 0) goto L_0x01c6
            X.8vj r1 = r7.A02
            if (r1 == 0) goto L_0x01c6
            X.8vl r1 = r1.A04
            if (r1 == 0) goto L_0x01c6
            java.util.List r4 = r1.A03
        L_0x01c6:
            if (r6 == 0) goto L_0x01d2
            X.8vj r1 = r6.A02
            if (r1 == 0) goto L_0x01d2
            X.8vl r1 = r1.A04
            if (r1 == 0) goto L_0x01d2
            java.util.List r0 = r1.A03
        L_0x01d2:
            boolean r0 = X.0qQ.A0K(r4, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0040
        L_0x01da:
            X.8Av r0 = r2.A02
            if (r0 == 0) goto L_0x0047
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsCreationDraftViewModel r0 = r0.A00
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = r0.A0H
            X.8g5 r1 = r0.A05
            java.util.ArrayList r0 = r1.A00
            r0.clear()
            X.05G r1 = r1.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.Epw(r0)
            goto L_0x0047
        L_0x01f4:
            r1 = r4
            goto L_0x01a9
        L_0x01f6:
            r1 = r4
            goto L_0x0192
        L_0x01f8:
            r0 = r4
            goto L_0x0184
        L_0x01fa:
            r1 = r4
            goto L_0x0180
        L_0x01fc:
            r0 = r4
            goto L_0x0176
        L_0x01ff:
            r1 = r4
            goto L_0x016e
        L_0x0202:
            r0 = r4
            goto L_0x0160
        L_0x0205:
            r1 = r4
            goto L_0x0158
        L_0x0208:
            r0 = r4
            goto L_0x014a
        L_0x020b:
            r1 = r4
            goto L_0x0140
        L_0x020e:
            r1 = r4
            goto L_0x011f
        L_0x0211:
            r0 = r4
            goto L_0x0109
        L_0x0214:
            r1 = r4
            goto L_0x00f7
        L_0x0217:
            r0 = r4
            goto L_0x0023
        L_0x021a:
            r0 = r4
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3501583m.A02(X.8d5, java.lang.Boolean):void");
    }
}
