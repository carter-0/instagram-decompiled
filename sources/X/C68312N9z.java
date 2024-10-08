package X;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.instagram.camera.effect.models.CameraAREffect;
import java.util.List;

/* renamed from: X.N9z  reason: case insensitive filesystem */
public final class C68312N9z extends AnonymousClass82G {
    public final int A00;
    public final Object A01;

    public C68312N9z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A04() {
        if (this.A00 != 0) {
            super.A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r6 == X.C69353Njs.A09) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.String r15) {
        /*
            r14 = this;
            int r0 = r14.A00
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r14.A01
            X.AH3 r0 = (X.AH3) r0
            X.O9O r1 = r0.A05
            if (r1 == 0) goto L_0x00b2
            r0 = 0
            r11 = r15
            X.0qQ.A0B(r15, r0)
            X.NfJ r3 = r1.A00
            X.N9P r0 = X.C69138NfJ.A00(r3)
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A05
            if (r0 == 0) goto L_0x00b3
            java.lang.String r0 = r0.A0K
        L_0x001d:
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.C69138NfJ.A0D(r3, r0)
        L_0x0028:
            X.OKv r6 = r3.A0P
            java.util.Set r0 = r3.A0T
            int r0 = r0.size()
            int r5 = r0 + 1
            java.util.Map r1 = r6.A02
            X.Njs r0 = X.C69353Njs.NORMAL_EFFECT
            java.lang.Object r4 = r1.get(r0)
            X.OLD r4 = (X.OLD) r4
            if (r4 == 0) goto L_0x0069
            X.OTM r2 = r4.A02
            X.1FE r0 = r2.A02
            long r0 = r0.now()
            r2.A01 = r0
            X.OWA r1 = r6.A01
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            X.Njs r6 = r4.A01
            java.lang.String r12 = r4.A03
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r9 = r4.A00
            r10 = 0
            X.Njs r0 = X.C69353Njs.AVATAR_EFFECT
            if (r6 == r0) goto L_0x0060
            X.Njs r0 = X.C69353Njs.PRESET_AVATAR_EFFECT
            r13 = 0
            if (r6 != r0) goto L_0x0061
        L_0x0060:
            r13 = 1
        L_0x0061:
            X.PLB r5 = new X.PLB
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.A02(r5)
        L_0x0069:
            X.ONT r0 = r3.A0F
            X.Np9 r0 = r0.A00()
            boolean r0 = r0 instanceof X.C69146NfV
            if (r0 == 0) goto L_0x009e
            X.05G r4 = r3.A0X
            java.lang.Object r0 = r4.getValue()
            X.Nir r2 = X.C69291Nir.ON
            if (r0 != r2) goto L_0x0084
            X.OWA r1 = r3.A0Q
            X.PKf r0 = X.C72791PKf.A00
            r1.A02(r0)
        L_0x0084:
            java.lang.Object r0 = r4.getValue()
            if (r0 == r2) goto L_0x0092
            X.05G r0 = r3.A0Y
            boolean r0 = X.DbX.A1b(r0)
            if (r0 == 0) goto L_0x009e
        L_0x0092:
            X.N9P r0 = X.C69138NfJ.A00(r3)
            java.lang.String r2 = r0.A0C
            java.lang.Integer r1 = r3.A09
            r0 = 0
            X.C69138NfJ.A0E(r3, r0, r1, r2)
        L_0x009e:
            X.ONG r0 = r3.A0R
            long r3 = java.lang.Long.parseLong(r15)
            X.OVd r0 = r0.A00
            X.Odx r2 = r0.A0Z
            r1 = 11
            X.GQ2 r0 = new X.GQ2
            r0.<init>(r3, r1)
            X.C71143Odx.A04(r2, r0)
        L_0x00b2:
            return
        L_0x00b3:
            r0 = 0
            goto L_0x001d
        L_0x00b6:
            java.lang.Object r0 = r14.A01
            X.A7p r0 = (X.C39749A7p) r0
            X.VM0 r0 = r0.A05
            X.Uag r4 = r0.A00
            X.Wim r0 = new X.Wim
            r0.<init>(r4)
            X.C342057ny.A00(r0)
            X.WT1 r3 = r4.A02()
            X.Uy8 r2 = X.C16612Uy8.EFFECT_RENDER_SUCCESS
            r1 = 0
            java.lang.String r0 = ""
            r3.A02(r2, r0, r1)
            android.view.ViewGroup r3 = r4.A00
            if (r3 == 0) goto L_0x00fc
            X.W2i r0 = r4.A0B
            if (r0 != 0) goto L_0x00b2
            X.0eM r0 = r4.A0M
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.A9C r0 = r4.A08
            if (r0 == 0) goto L_0x00f9
            com.instagram.camera.effect.models.CameraAREffect r1 = r0.A01
            if (r1 == 0) goto L_0x00ff
            X.W2i r0 = new X.W2i
            r0.<init>(r3, r1, r2)
            r4.A0B = r0
            X.1Ng r2 = r0.A0A
            java.lang.Class<X.8c9> r1 = X.C359188c9.class
            X.1wn r0 = r0.A0B
            r2.A01(r0, r1)
            return
        L_0x00f9:
            java.lang.String r0 = "renderProvider"
            goto L_0x0101
        L_0x00fc:
            java.lang.String r0 = "instructionView"
            goto L_0x0101
        L_0x00ff:
            java.lang.String r0 = "cameraArEffect"
        L_0x0101:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68312N9z.A06(java.lang.String):void");
    }

    public final void A07(String str) {
        if (this.A00 != 0) {
            super.A07(str);
        } else {
            ((C39749A7p) this.A01).A05.A00.A02().A02(C16612Uy8.EFFECT_RENDER_STARTED, "", (String) null);
        }
    }

    public final void A08(EffectAttribution effectAttribution, EffectManifest effectManifest, EffectServiceHost effectServiceHost, String str) {
        String str2;
        EffectAttribution effectAttribution2 = effectAttribution;
        if (this.A00 != 0) {
            AH3 ah3 = (AH3) this.A01;
            C368668t8 r3 = effectManifest.specifiedCameraFacing;
            C345607tn r2 = ah3.A00;
            if (r2 != null && ((r3 == C368668t8.BACK && ((C345597tm) r2).A00 == 1) || (r3 == C368668t8.FRONT && ((C345597tm) r2).A00 == 0))) {
                r2.EzJ();
            }
            O9O o9o = ah3.A05;
            if (o9o != null) {
                String str3 = str;
                0qQ.A0B(str3, 0);
                C69138NfJ nfJ = o9o.A00;
                CameraAREffect cameraAREffect = C69138NfJ.A00(nfJ).A05;
                if (cameraAREffect != null) {
                    str2 = cameraAREffect.A0K;
                } else {
                    str2 = null;
                }
                if (0qQ.A0K(str2, str3)) {
                    C69138NfJ.A0A(nfJ, N9P.A00(effectAttribution2, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, (C69378NkI) null, C69138NfJ.A00(nfJ), (Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -262145, false, false, false, false, false, false, false, false, false, false, false, false, false));
                    return;
                }
                return;
            }
            return;
        }
        ((C39749A7p) this.A01).A05.A00.A03 = effectAttribution;
    }

    public final void A09(String str) {
        if (this.A00 != 0) {
            super.A09(str);
        } else {
            ((C39749A7p) this.A01).A05.A00.A02().A02(C16612Uy8.EFFECT_RENDER_STOPPED, "", (String) null);
        }
    }

    public final void A0A(String str, Throwable th) {
        String str2;
        if (this.A00 != 0) {
            O9O o9o = ((AH3) this.A01).A05;
            if (o9o != null) {
                th.getMessage();
                0qQ.A0B(str, 0);
                C69138NfJ nfJ = o9o.A00;
                nfJ.A0P.A02.put(C69353Njs.NORMAL_EFFECT, (Object) null);
                C69138NfJ.A0D(nfJ, AnonymousClass05K.A0C);
                if (nfJ.A0F.A00() instanceof C69146NfV) {
                    CameraAREffect cameraAREffect = nfJ.A03;
                    if (cameraAREffect != null) {
                        str2 = cameraAREffect.A0K;
                    } else {
                        str2 = null;
                    }
                    if (0qQ.A0K(str2, str)) {
                        05G r1 = nfJ.A0X;
                        C69291Nir nir = C69291Nir.OFF;
                        0qQ.A0B(r1, 0);
                        r1.FIA(nir);
                        OWA owa = nfJ.A0Q;
                        owa.A02(C72792PKg.A00);
                        Integer num = AnonymousClass05K.A15;
                        C69134NfF.A01(nfJ.A0N.A00, AnonymousClass05K.A02, System.currentTimeMillis());
                        owa.A02(new C72786PKa(num));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0B(str, 0);
        C15331Uag uag = ((C39749A7p) this.A01).A05.A00;
        C342057ny.A00(new C19974Wil(uag));
        uag.A02().A02(C16612Uy8.EFFECT_RENDER_FAILED, "", th.getMessage());
        throw AnonymousClass7TE.A15(str);
    }
}
