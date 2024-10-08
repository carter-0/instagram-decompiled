package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.common.util.TriState;
import com.facebook.rsys.mediasync.gen.MediaSyncState;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptions;
import com.instagram.arp.api.AvatarEffectsApiController;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments;
import com.instagram.rtc.rsys.models.IgCallModel;
import java.util.List;
import java.util.Map;

public final class POS implements C74475PvV {
    public final /* synthetic */ OTZ A00;

    public final void Czy(C262224Cq r18) {
        boolean z;
        long j;
        C262224Cq r1 = r18;
        0qQ.A0B(r1, 0);
        OTZ otz = this.A00;
        otz.A01 = r1;
        if (otz instanceof C69136NfH) {
            C69136NfH nfH = (C69136NfH) otz;
            if (nfH.A0H) {
                C69136NfH.A01(nfH, nfH.A0E);
                nfH.A00 = null;
                nfH.A04 = false;
            }
        } else if (otz instanceof C69138NfJ) {
            C69138NfJ nfJ = (C69138NfJ) otz;
            nfJ.A0P.A02.clear();
            LEN len = nfJ.A0L;
            len.A08 = r1;
            nfJ.A0O.A01 = r1;
            if (!nfJ.A0B) {
                ONT ont = len.A0A;
                if (ont.A00() instanceof C69146NfV) {
                    if (!182.A06(0Tu.A05, ont.A00, 2342153912572051836L) || len.A0D.A00.A00.getInt("rtc_avatar_effect_compatibility_version", 0) == 2) {
                        z = true;
                        j = 86400000;
                    } else {
                        z = false;
                        j = 0;
                    }
                    C66185MGw.A01(len, r1, len.A00(C359218cI.A0A, j, z, !z), 27);
                }
                C66185MGw.A01(len, r1, len.A00(C359218cI.A0D, 86400000, true, false), 28);
                C66185MGw.A01(len, r1, len.A00(C359218cI.A0F, 86400000, true, false), 29);
                C70753OJz oJz = len.A0C;
                if (oJz.A00()) {
                    C66185MGw.A01(len, r1, len.A00(C359218cI.A0E, 86400000, true, false), 30);
                }
                if (182.A06(0Tu.A05, oJz.A00, 36317113878582051L)) {
                    C66185MGw.A01(len, r1, len.A00(C359218cI.A0G, 86400000, true, false), 31);
                }
                nfJ.A0B = true;
            }
            if (nfJ.A0M.A00.A00.getBoolean("rtc_should_auto_apply_touch_up", false)) {
                C69138NfJ.A0G(nfJ, AnonymousClass05K.A1I, true);
            }
        } else if (otz instanceof C69129NfA) {
            C69129NfA nfA = (C69129NfA) otz;
            05G r2 = nfA.A01;
            N9N n9n = (N9N) r2.getValue();
            boolean z2 = n9n.A04;
            boolean z3 = n9n.A05;
            boolean z4 = n9n.A07;
            r2.FIA(new N9N(n9n.A00, n9n.A01, n9n.A02, n9n.A03, z2, true, z3, z4, n9n.A0A, n9n.A09, n9n.A08));
            nfA.A00 = false;
        } else if (otz instanceof C69127Nf8) {
            C69127Nf8 nf8 = (C69127Nf8) otz;
            nf8.A02 = false;
            nf8.A03 = false;
            C51970G9q.A1S(nf8.A01);
            nf8.A04 = false;
        } else if (otz instanceof C69123Nf4) {
            C69123Nf4 nf4 = (C69123Nf4) otz;
            nf4.A01 = AnonymousClass05K.A0C;
            nf4.A02 = 0Yt.A0E();
            nf4.A00 = null;
        } else if (otz instanceof C69132NfD) {
            14i.A05(((C69132NfD) otz).A08);
        }
    }

    public POS(OTZ otz) {
        this.A00 = otz;
    }

    public final void Czw(RtcCallKey rtcCallKey) {
        OTZ otz = this.A00;
        otz.A00 = rtcCallKey;
        if (otz instanceof C69137NfI) {
            C69137NfI nfI = (C69137NfI) otz;
            nfI.A0D.invoke(new VideoSubscriptions((Map) 0Yt.A0E()));
            if (nfI.A05) {
                OEO oeo = nfI.A07;
                C74561PxA pxA = oeo.A00;
                if (pxA != null) {
                    pxA.AIe("call_ui_shown");
                }
                C74561PxA pxA2 = oeo.A00;
                if (pxA2 != null) {
                    pxA2.AIe("self_first_frame_rendered");
                }
            }
        } else if (otz instanceof C69135NfG) {
            C69135NfG nfG = (C69135NfG) otz;
            if (DbT.A0h().A0N() && nfG.A03 != null) {
                C262224Cq r1 = nfG.A01;
                if (r1 != null) {
                    DbX.A1X(nfG, r1, 34);
                    return;
                }
                throw AnonymousClass7TE.A0z("This should not be called outside of call lifecycle!");
            }
        } else if (otz instanceof C69133NfE) {
            C69133NfE nfE = (C69133NfE) otz;
            if (AnonymousClass1pW.A00 == null) {
                0qQ.A0F("plugin");
                throw AnonymousClass00P.createAndThrow();
            }
            Context context = nfE.A05;
            UserSession userSession = nfE.A06;
            AnonymousClass7TF.A1H(context, userSession);
            C70959OTg oTg = new C70959OTg(context, userSession);
            O9Q o9q = nfE.A09;
            0qQ.A0B(o9q, 0);
            synchronized (oTg.A05) {
                oTg.A00 = o9q;
            }
            nfE.A02 = oTg;
            nfE.A03 = rtcCallKey.A00;
        } else if (otz instanceof C69129NfA) {
            05G r12 = ((C69129NfA) otz).A01;
            N9N n9n = (N9N) r12.getValue();
            Long A0u = C51968G9o.A0u();
            boolean z = n9n.A04;
            boolean z2 = n9n.A06;
            boolean z3 = n9n.A05;
            boolean z4 = n9n.A07;
            r12.FIA(new N9N(n9n.A00, A0u, n9n.A02, n9n.A03, z, z2, z3, z4, n9n.A0A, n9n.A09, n9n.A08));
        } else if (otz instanceof C69115Neu) {
            C69115Neu neu = (C69115Neu) otz;
            C66581MXm.A1T(new N9K(182.A06(0Tu.A05, neu.A00, 36314850430880581L)), neu.A01);
        } else if (otz instanceof C69116Nev) {
            C66581MXm.A1T(new N9L((IgCallModel) null, "unknown", (List) null), ((C69116Nev) otz).A02);
        }
    }

    public final void Czx() {
        int i;
        05G r0;
        boolean z;
        OTZ otz = this.A00;
        otz.A01 = null;
        otz.A00 = null;
        if (otz instanceof C69136NfH) {
            C69136NfH nfH = (C69136NfH) otz;
            if (nfH.A0H) {
                nfH.A08.APN();
                C69136NfH.A01(nfH, nfH.A0E);
                nfH.A00 = null;
                OEQ oeq = nfH.A09;
                0QS r1 = oeq.A00;
                if (r1 != null) {
                    oeq.A02.unregisterReceiver(r1);
                }
                oeq.A00 = null;
                return;
            }
            return;
        }
        if (otz instanceof C69137NfI) {
            C69137NfI nfI = (C69137NfI) otz;
            nfI.A01 = 0;
            0sl r3 = 0sl.A00;
            if (!0qQ.A0K(nfI.A04, r3)) {
                nfI.A04 = r3;
                O28.A00(r3, nfI.A01, nfI.A0E);
            }
            i = 0;
            N9E A01 = C69137NfI.A01(nfI, false, false);
            if (!0qQ.A0K(nfI.A02, A01)) {
                nfI.A02 = A01;
                O28.A00(A01, nfI.A01, nfI.A0F);
            }
            C69137NfI.A04(nfI, C69137NfI.A02(nfI));
            r0 = nfI.A0G;
            z = nfI.A03;
        } else if (otz instanceof Nf1) {
            Nf1 nf1 = (Nf1) otz;
            nf1.A01 = false;
            nf1.A00 = 0;
            return;
        } else if (otz instanceof C69135NfG) {
            C69135NfG nfG = (C69135NfG) otz;
            nfG.A00 = C69135NfG.A00(AnonymousClass0t1.A01.A01(nfG.A04));
            nfG.A05.clear();
            nfG.A02 = C69135NfG.A01(nfG);
            N9H A012 = C69135NfG.A01(nfG);
            if (!0qQ.A0K(nfG.A01, A012)) {
                C66581MXm.A1T(A012, nfG.A07);
                nfG.A01 = A012;
                return;
            }
            return;
        } else if (otz instanceof C69121Nf0) {
            C69121Nf0 nf0 = (C69121Nf0) otz;
            C68286N8z n8z = nf0.A01;
            if (!0qQ.A0K(nf0.A00, n8z)) {
                C66581MXm.A1T(n8z, nf0.A02);
                nf0.A00 = n8z;
                return;
            }
            return;
        } else if (otz instanceof C69128Nf9) {
            C69128Nf9 nf9 = (C69128Nf9) otz;
            Integer num = AnonymousClass05K.A00;
            nf9.A02 = num;
            N91 n91 = new N91(num, (String) null, 0);
            nf9.A01 = n91;
            C66581MXm.A1T(n91, nf9.A05);
            nf9.A08.clear();
            return;
        } else if (otz instanceof C69124Nf5) {
            ((C69124Nf5) otz).A03.clear();
            return;
        } else if (otz instanceof C69133NfE) {
            C69133NfE nfE = (C69133NfE) otz;
            05G r32 = nfE.A0F;
            C61070Jw8 jw8 = new C61070Jw8((MediaSyncState) null, (RtcStartCoWatchPlaybackArguments) null, (String) null, 15);
            0qQ.A0B(r32, 0);
            r32.FIA(jw8);
            OH8 oh8 = nfE.A08;
            oh8.A02 = false;
            oh8.A00 = 0;
            Runnable runnable = oh8.A01;
            if (runnable != null) {
                oh8.A03.removeCallbacks(runnable);
            }
            nfE.A00 = null;
            C70959OTg oTg = nfE.A02;
            if (oTg != null) {
                synchronized (oTg.A05) {
                    oTg.A00 = null;
                    oTg.A01 = null;
                }
            }
            nfE.A02 = null;
            nfE.A01 = null;
            nfE.A03 = "";
            return;
        } else if (otz instanceof C69130NfB) {
            C69130NfB nfB = (C69130NfB) otz;
            N98 n98 = new N98(0sn.A00, "");
            if (!0qQ.A0K(nfB.A00, n98)) {
                C66581MXm.A1T(n98, nfB.A02);
                nfB.A00 = n98;
                return;
            }
            return;
        } else if (otz instanceof C69131NfC) {
            C69131NfC nfC = (C69131NfC) otz;
            if (nfC.A05.A00() instanceof C69146NfV) {
                AvatarEffectsApiController avatarEffectsApiController = nfC.A04;
                avatarEffectsApiController.A02();
                1Ng r33 = avatarEffectsApiController.A07;
                r33.A02(avatarEffectsApiController.A09, AnonymousClass27b.class);
                r33.A02(avatarEffectsApiController.A0B, AnonymousClass27T.class);
                r33.A02(avatarEffectsApiController.A0A, AnonymousClass27X.class);
                r33.A02(avatarEffectsApiController.A08, C71895Osd.class);
            }
            nfC.A01 = null;
            C69131NfC.A00(nfC, AnonymousClass05K.A00);
            nfC.A03 = false;
            nfC.A00 = TriState.UNSET;
            return;
        } else if (otz instanceof C69138NfJ) {
            C69138NfJ nfJ = (C69138NfJ) otz;
            nfJ.A0L.A08 = null;
            nfJ.A0O.A01 = null;
            nfJ.A00 = 0.0f;
            Integer num2 = AnonymousClass05K.A0C;
            C69138NfJ.A0C(nfJ, num2);
            C69138NfJ.A05((CameraAREffect) null, nfJ, num2, (String) null, (String) null);
            C69138NfJ.A0F(nfJ, num2, (String) null);
            C69138NfJ.A0G(nfJ, num2, false);
            nfJ.A0B = false;
            nfJ.A02 = null;
            nfJ.A01 = null;
            nfJ.A0A = null;
            05G r12 = nfJ.A0X;
            C69291Nir nir = C69291Nir.UNSET;
            0qQ.A0B(r12, 0);
            r12.FIA(nir);
            05G r13 = nfJ.A0Y;
            0qQ.A0B(r13, 0);
            r13.FIA(false);
            N9P A002 = C69138NfJ.A00(nfJ);
            Integer num3 = AnonymousClass05K.A00;
            C69138NfJ.A0A(nfJ, N9P.A00((EffectAttribution) null, (PickerConfiguration) null, (CameraAREffect) null, (CameraAREffect) null, (CameraAREffect) null, C69378NkI.EFFECT, A002, (Integer) null, (Integer) null, num3, (Integer) null, (String) null, "simple_gradient_background_0", (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0.0f, -1432416257, false, false, false, false, false, false, false, false, false, false, false, false, false));
            nfJ.A07 = null;
            nfJ.A06 = null;
            nfJ.A04 = null;
            nfJ.A0T.clear();
            C69138NfJ.A0D(nfJ, num3);
            return;
        } else if (otz instanceof C69119Ney) {
            C66581MXm.A1T(new C70941OSo(0Yt.A0E()), ((C69119Ney) otz).A03);
            return;
        } else if (otz instanceof C69118Nex) {
            C69118Nex nex = (C69118Nex) otz;
            05G r02 = nex.A02;
            i = 0;
            N96 n96 = new N96((Boolean) null, (String) null, (String) null, 0, 0, 0, 0, 0, false);
            0qQ.A0B(r02, 0);
            r02.FIA(n96);
            r0 = nex.A03;
            z = new N9A((Boolean) null, (String) null, (String) null, 0);
        } else if (otz instanceof C69129NfA) {
            05G r14 = ((C69129NfA) otz).A01;
            N9N n9n = (N9N) r14.getValue();
            boolean z2 = n9n.A04;
            boolean z3 = n9n.A06;
            boolean z4 = n9n.A05;
            boolean z5 = n9n.A07;
            r14.FIA(new N9N(n9n.A00, (Long) null, (Long) null, n9n.A03, z2, z3, z4, z5, true, n9n.A09, n9n.A08));
            return;
        } else if (otz instanceof C69115Neu) {
            r0 = ((C69115Neu) otz).A01;
            i = 0;
            z = new N9K(false);
        } else if (otz instanceof C69127Nf8) {
            C69127Nf8 nf8 = (C69127Nf8) otz;
            nf8.A02 = false;
            nf8.A03 = false;
            C51970G9q.A1S(nf8.A01);
            nf8.A04 = false;
            return;
        } else if (otz instanceof C69116Nev) {
            C66581MXm.A1T(new N9L((IgCallModel) null, "unknown", (List) null), ((C69116Nev) otz).A02);
            return;
        } else if (otz instanceof C69125Nf6) {
            C69125Nf6 nf6 = (C69125Nf6) otz;
            nf6.A01 = false;
            nf6.A00 = 0sn.A00;
            nf6.A02 = false;
            return;
        } else if (otz instanceof C69122Nf3) {
            C69122Nf3 nf3 = (C69122Nf3) otz;
            0sn r15 = 0sn.A00;
            if (!0qQ.A0K(nf3.A00, r15)) {
                nf3.A00 = r15;
            }
            i = 0;
            r0 = nf3.A03;
            z = false;
        } else if (otz instanceof C69123Nf4) {
            C69123Nf4 nf4 = (C69123Nf4) otz;
            nf4.A01 = AnonymousClass05K.A0C;
            nf4.A02 = 0Yt.A0E();
            nf4.A00 = null;
            return;
        } else if (otz instanceof Nf2) {
            ((Nf2) otz).A00.clear();
            return;
        } else if (otz instanceof C69132NfD) {
            C69132NfD nfD = (C69132NfD) otz;
            14i.A06(nfD.A08);
            ((C70811OMg) nfD.A0B.getValue()).A01(true);
            nfD.A03 = false;
            nfD.A01 = false;
            nfD.A04 = false;
            nfD.A05 = false;
            nfD.A07 = false;
            return;
        } else {
            return;
        }
        0qQ.A0B(r0, i);
        r0.FIA(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1049:0x125c, code lost:
        if ((r13 - r1.longValue()) >= (X.182.A01(X.0Tu.A05, r0.A02, 36594972493154293L) + 30000)) goto L_0x125e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:1078:0x12e5, code lost:
        if (r2 != true) goto L_0x12e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0182, code lost:
        if (r7 == X.C69307Nj8.UNAVAILABLE) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0204, code lost:
        if (r3.audioEnabled == false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0207, code lost:
        if (r6 != false) goto L_0x0209;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0209, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x020c, code lost:
        if (r3.videoEnabled != false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x020e, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x020f, code lost:
        r9 = r2.A03;
        r10 = r2.A01;
        r7 = r2.A00;
        X.AnonymousClass7TG.A1T(r8, r9, r10);
        X.0qQ.A0B(r7, 5);
        r6 = new X.N9E(r7, r8, r9, r10, r11, r12, false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0228, code lost:
        if (X.0qQ.A0K(r0.A02, r6) != false) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x022a, code lost:
        r0.A02 = r6;
        X.O28.A00(r6, r0.A01, r0.A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0233, code lost:
        if (r4 == null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0235, code lost:
        r4.add(r3.userId);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0269, code lost:
        if (r4 == null) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x026b, code lost:
        r4 = X.0sl.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x02b9, code lost:
        if (r1.audioEnabled != false) goto L_0x02bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x031b, code lost:
        if (r6 != null) goto L_0x02c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x031f, code lost:
        if (r2 != null) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x03d7, code lost:
        if (r1.state != 1) goto L_0x03d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x03ea, code lost:
        if (r3 != false) goto L_0x03ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x05be, code lost:
        if (r2 != true) goto L_0x05c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0690, code lost:
        if (r7 != null) goto L_0x0604;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0717, code lost:
        if (r1.A06 == true) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        if (r11.size() > (((int) r0.A05) + 1)) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d1, code lost:
        if (r9.screenShareStopSharing != false) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0a0d, code lost:
        if (r5 == null) goto L_0x0970;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e3, code lost:
        if (r7 == null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0a75, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A00, 36310903358226810L) != false) goto L_0x0a77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e7, code lost:
        if (r6 != null) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0b30, code lost:
        if (r1.videoEnabled != true) goto L_0x0b32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:717:0x0b98, code lost:
        if (r9.A01() == false) goto L_0x0b9a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:868:0x0ec0, code lost:
        if (r4.groupRoomType == 11) goto L_0x0ec2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:879:0x0ef2, code lost:
        if (r2 != null) goto L_0x0eb6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:925:0x0fc2, code lost:
        if (r11 != false) goto L_0x0f30;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1232:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1234:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x025b  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x069e  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:515:0x07cd  */
    /* JADX WARNING: Removed duplicated region for block: B:542:0x082e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DCG(X.N4R r29) {
        /*
            r28 = this;
            r0 = r28
            X.OTZ r0 = r0.A00
            com.instagram.model.rtc.RtcCallKey r1 = r0.A00
            if (r1 == 0) goto L_0x133a
            boolean r1 = r0 instanceof X.C69136NfH
            r2 = r29
            if (r1 == 0) goto L_0x018c
            X.NfH r0 = (X.C69136NfH) r0
            boolean r1 = r0.A0H
            if (r1 == 0) goto L_0x1343
            com.instagram.rtc.rsys.models.EngineModel r4 = r0.A00
            java.lang.Object r6 = r2.A00
            com.instagram.rtc.rsys.models.EngineModel r6 = (com.instagram.rtc.rsys.models.EngineModel) r6
            r0.A00 = r6
            r1 = 0
            if (r4 == 0) goto L_0x0085
            com.facebook.rsys.screenshare.gen.ScreenShareModel r3 = r4.screenShareModel
        L_0x0021:
            if (r6 == 0) goto L_0x0083
            com.facebook.rsys.screenshare.gen.ScreenShareModel r2 = r6.screenShareModel
        L_0x0025:
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0039
            if (r4 == 0) goto L_0x0081
            com.instagram.rtc.rsys.models.IgCallModel r2 = r4.callModel
        L_0x002f:
            if (r6 == 0) goto L_0x0033
            com.instagram.rtc.rsys.models.IgCallModel r1 = r6.callModel
        L_0x0033:
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x1343
        L_0x0039:
            X.N9B r1 = r0.A01
            X.Nj8 r7 = r1.A00
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r4 = 0
            r8 = 1
            if (r6 == 0) goto L_0x00e5
            com.facebook.rsys.screenshare.gen.ScreenShareModel r9 = r6.screenShareModel
            if (r9 == 0) goto L_0x00e5
            int r1 = r9.screenShareAvailability
            if (r1 != r8) goto L_0x004d
            java.lang.Integer r3 = X.AnonymousClass05K.A01
        L_0x004d:
            com.instagram.rtc.rsys.models.IgCallModel r10 = r6.callModel
            if (r10 == 0) goto L_0x00c9
            java.util.Map r1 = r10.userCapabilities
            java.util.ArrayList r11 = X.DbV.A15(r1)
            java.util.Iterator r12 = X.AnonymousClass7TF.A0u(r1)
        L_0x005b:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0087
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r12)
            java.lang.Object r2 = r5.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "screen_sharing"
            java.lang.Object r1 = r2.get(r1)
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r8)
            if (r1 != 0) goto L_0x005b
            java.lang.Object r1 = r5.getKey()
            if (r1 == 0) goto L_0x005b
            r11.add(r1)
            goto L_0x005b
        L_0x0081:
            r2 = r1
            goto L_0x002f
        L_0x0083:
            r2 = r1
            goto L_0x0025
        L_0x0085:
            r3 = r1
            goto L_0x0021
        L_0x0087:
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L_0x00c9
            java.util.Map r1 = r10.userCapabilities
            java.util.ArrayList r11 = X.DbV.A15(r1)
            java.util.Iterator r10 = X.AnonymousClass7TF.A0u(r1)
        L_0x0097:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x00bd
            java.util.Map$Entry r5 = X.AnonymousClass7TE.A1J(r10)
            java.lang.Object r2 = r5.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r1 = "screen_sharing"
            java.lang.Object r1 = r2.get(r1)
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r8)
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r5.getKey()
            if (r1 == 0) goto L_0x0097
            r11.add(r1)
            goto L_0x0097
        L_0x00bd:
            int r11 = r11.size()
            long r1 = r0.A05
            int r5 = (int) r1
            int r1 = r5 + 1
            r10 = 1
            if (r11 <= r1) goto L_0x00ca
        L_0x00c9:
            r10 = 0
        L_0x00ca:
            boolean r1 = r9.screenShareIntendedOn
            if (r1 == 0) goto L_0x00d3
            boolean r1 = r9.screenShareStopSharing
            r5 = 1
            if (r1 == 0) goto L_0x00d4
        L_0x00d3:
            r5 = 0
        L_0x00d4:
            boolean r1 = X.C69136NfH.A03(r7)
            if (r1 == 0) goto L_0x015d
            int r1 = r9.screenShareAvailability
            if (r1 != r8) goto L_0x015d
            boolean r1 = r9.screenShareStopSharing
            if (r1 != 0) goto L_0x015d
        L_0x00e2:
            r5 = r7
            if (r7 != 0) goto L_0x00e9
        L_0x00e5:
            X.Nj8 r5 = X.C69307Nj8.UNAVAILABLE
            if (r6 == 0) goto L_0x015a
        L_0x00e9:
            com.facebook.rsys.screenshare.gen.ScreenShareModel r1 = r6.screenShareModel
            if (r1 == 0) goto L_0x015a
            com.facebook.rsys.screenshare.gen.PeerScreenShareStates r1 = r1.peerStates
            if (r1 == 0) goto L_0x015a
            java.util.HashSet r1 = r1.screenSharingPeers
            if (r1 == 0) goto L_0x015a
            java.util.Set r6 = X.00k.A0k(r1)
        L_0x00f9:
            X.N9B r1 = r0.A01
            java.util.Set r1 = r1.A02
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x011e
            boolean r1 = X.C66580MXl.A1b(r6)
            if (r1 == 0) goto L_0x011e
            java.lang.Object r2 = X.00k.A09(r6)
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = X.C69136NfH.A03(r7)
            if (r1 == 0) goto L_0x0154
            java.lang.Integer r1 = X.AnonymousClass05K.A0S
            X.C69136NfH.A02(r0, r1, r2)
        L_0x011a:
            X.Nj8 r5 = X.C69307Nj8.IDLE
            r0.A02 = r2
        L_0x011e:
            boolean r1 = X.C69136NfH.A03(r7)
            if (r1 != 0) goto L_0x0148
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x013f
            X.N9B r1 = r0.A01
            java.util.Set r1 = r1.A02
            boolean r1 = X.C66580MXl.A1b(r1)
            if (r1 == 0) goto L_0x013f
            java.lang.String r2 = r0.A02
            if (r2 == 0) goto L_0x013f
            java.lang.Integer r1 = X.AnonymousClass05K.A0V
            X.C69136NfH.A02(r0, r1, r2)
            r0.A02 = r4
        L_0x013f:
            X.N9B r1 = new X.N9B
            r1.<init>(r5, r3, r6)
            X.C69136NfH.A01(r0, r1)
            return
        L_0x0148:
            boolean r1 = X.C69136NfH.A03(r5)
            if (r1 != 0) goto L_0x013f
            X.Pvh r1 = r0.A08
            r1.APN()
            goto L_0x013f
        L_0x0154:
            java.lang.Integer r1 = X.AnonymousClass05K.A0U
            X.C69136NfH.A02(r0, r1, r2)
            goto L_0x011a
        L_0x015a:
            X.0sl r6 = X.0sl.A00
            goto L_0x00f9
        L_0x015d:
            int r2 = r9.screenShareAvailability
            if (r2 == 0) goto L_0x0164
            r1 = 6
            if (r2 != r1) goto L_0x0188
        L_0x0164:
            if (r10 == 0) goto L_0x0188
            if (r5 == 0) goto L_0x0184
            int r2 = r9.screenShareState
            r1 = 2
            if (r2 != r1) goto L_0x0171
            X.Nj8 r5 = X.C69307Nj8.SHARING
            goto L_0x00e9
        L_0x0171:
            if (r2 != r8) goto L_0x0180
            X.0sa r1 = r0.A03
            if (r1 == 0) goto L_0x017a
            r1.invoke()
        L_0x017a:
            r0.A03 = r4
            X.Nj8 r5 = X.C69307Nj8.PAUSED
            goto L_0x00e9
        L_0x0180:
            X.Nj8 r1 = X.C69307Nj8.UNAVAILABLE
            if (r7 != r1) goto L_0x00e2
        L_0x0184:
            X.Nj8 r5 = X.C69307Nj8.IDLE
            goto L_0x00e9
        L_0x0188:
            X.Nj8 r5 = X.C69307Nj8.UNAVAILABLE
            goto L_0x00e9
        L_0x018c:
            boolean r1 = r0 instanceof X.C69137NfI
            if (r1 == 0) goto L_0x0288
            X.NfI r0 = (X.C69137NfI) r0
            r13 = 0
            com.instagram.rtc.rsys.models.EngineModel r5 = X.OTZ.A0K(r2)
            r4 = 0
            if (r5 == 0) goto L_0x01c8
            com.instagram.rtc.rsys.models.IgCallModel r1 = r5.callModel
            if (r1 == 0) goto L_0x01c8
            java.util.ArrayList r6 = r1.participants
            if (r6 == 0) goto L_0x01c8
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r6)
            java.util.Iterator r3 = r6.iterator()
        L_0x01aa:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x01ba
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r3)
            java.lang.String r1 = r1.userId
            r4.add(r1)
            goto L_0x01aa
        L_0x01ba:
            java.util.Set r4 = X.00k.A0j(r4)
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L_0x026e
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x026e
        L_0x01c8:
            r7 = 0
        L_0x01c9:
            int r1 = r0.A00
            if (r7 == r1) goto L_0x01dd
            r0.A00 = r7
            X.O9W r1 = r0.A0A
            X.OVd r1 = r1.A00
            X.O9M r3 = r1.A0J
            r1 = 1
            if (r7 == r1) goto L_0x01dd
            X.OK3 r1 = r3.A00
            r1.A00()
        L_0x01dd:
            java.lang.Object r1 = r2.A02
            X.N9J r1 = (X.N9J) r1
            boolean r6 = r1.A00()
            X.0eE r2 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r1 = r0.A06
            r2.A01(r1)
            X.N9E r2 = X.C69137NfI.A01(r0, r13, r13)
            if (r5 == 0) goto L_0x0269
            com.instagram.rtc.rsys.models.IgCallModel r1 = r5.callModel
            if (r1 == 0) goto L_0x0269
            com.instagram.rtc.rsys.models.ParticipantModel r3 = r1.selfParticipant
            if (r3 == 0) goto L_0x0269
            java.lang.String r8 = r3.userId
            X.0qQ.A07(r8)
            if (r6 == 0) goto L_0x0206
            boolean r1 = r3.audioEnabled
            r11 = 1
            if (r1 != 0) goto L_0x0209
        L_0x0206:
            r11 = 0
            if (r6 == 0) goto L_0x020e
        L_0x0209:
            boolean r1 = r3.videoEnabled
            r12 = 1
            if (r1 != 0) goto L_0x020f
        L_0x020e:
            r12 = 0
        L_0x020f:
            java.lang.String r9 = r2.A03
            java.lang.String r10 = r2.A01
            com.instagram.common.typedurl.ImageUrl r7 = r2.A00
            X.AnonymousClass7TG.A1T(r8, r9, r10)
            r1 = 5
            X.0qQ.A0B(r7, r1)
            X.N9E r6 = new X.N9E
            r14 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.N9E r1 = r0.A02
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 != 0) goto L_0x0233
            r0.A02 = r6
            X.05G r2 = r0.A0F
            X.4Cq r1 = r0.A01
            X.O28.A00(r6, r1, r2)
        L_0x0233:
            if (r4 == 0) goto L_0x026b
            java.lang.String r1 = r3.userId
            r4.add(r1)
        L_0x023a:
            java.util.Set r1 = r0.A04
            boolean r1 = X.0qQ.A0K(r1, r4)
            if (r1 != 0) goto L_0x024b
            r0.A04 = r4
            X.05G r2 = r0.A0E
            X.4Cq r1 = r0.A01
            X.O28.A00(r4, r1, r2)
        L_0x024b:
            long r6 = r0.A01
            if (r5 == 0) goto L_0x0266
            com.instagram.rtc.rsys.models.IgCallModel r1 = r5.callModel
            if (r1 == 0) goto L_0x0266
            long r2 = r1.numberOfRejoinAttempts
        L_0x0255:
            r0.A01 = r2
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x1343
            X.OWA r1 = r0.A09
            X.PL2 r0 = new X.PL2
            r0.<init>(r2)
            r1.A02(r0)
            return
        L_0x0266:
            r2 = 0
            goto L_0x0255
        L_0x0269:
            if (r4 != 0) goto L_0x023a
        L_0x026b:
            X.0sl r4 = X.0sl.A00
            goto L_0x023a
        L_0x026e:
            java.util.Iterator r6 = r6.iterator()
            r7 = 0
        L_0x0273:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x01c9
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r6)
            int r3 = r1.state
            r1 = 7
            if (r3 != r1) goto L_0x0273
            int r7 = r7 + 1
            if (r7 >= 0) goto L_0x0273
            goto L_0x078d
        L_0x0288:
            boolean r1 = r0 instanceof X.C69117New
            if (r1 == 0) goto L_0x0349
            X.New r0 = (X.C69117New) r0
            r12 = 0
            com.instagram.rtc.rsys.models.EngineModel r2 = X.OTZ.A0K(r2)
            r8 = 0
            if (r2 == 0) goto L_0x02a0
            com.facebook.rsys.moderator.gen.ModeratorSoftMuteModel r6 = r2.moderatorSoftMuteModel
        L_0x0298:
            r4 = 1
            if (r6 == 0) goto L_0x02a2
            boolean r1 = r6.actionCapabilitiesAsParticipant
            if (r1 != 0) goto L_0x02a2
            return
        L_0x02a0:
            r6 = r8
            goto L_0x0298
        L_0x02a2:
            if (r2 == 0) goto L_0x031e
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L_0x031e
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r1.selfParticipant
            if (r1 == 0) goto L_0x031e
            int r3 = r1.state
        L_0x02ae:
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L_0x02bb
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r1.selfParticipant
            if (r1 == 0) goto L_0x02bb
            boolean r1 = r1.audioEnabled
            r2 = 1
            if (r1 == 0) goto L_0x02bc
        L_0x02bb:
            r2 = 0
        L_0x02bc:
            if (r6 == 0) goto L_0x031a
            com.facebook.rsys.moderator.gen.ModeratorActionInfo r1 = r6.actionPending
            if (r1 == 0) goto L_0x031a
            java.lang.String r5 = r1.uuid
        L_0x02c4:
            com.facebook.rsys.moderator.gen.ModeratorActionInfo r1 = r6.actionPending
            if (r1 == 0) goto L_0x02ca
            java.lang.String r8 = r1.issuedByUserId
        L_0x02ca:
            if (r2 != 0) goto L_0x0318
            java.lang.String r1 = r0.A00
            boolean r1 = X.0qQ.A0K(r1, r5)
            if (r1 != 0) goto L_0x0318
        L_0x02d4:
            r1 = 7
            if (r3 != r1) goto L_0x0346
            if (r4 == 0) goto L_0x0346
            if (r8 == 0) goto L_0x0346
            X.Oxw r1 = r0.A02
            android.util.LruCache r2 = r1.A00
            java.lang.Object r1 = r2.get(r8)
            X.JvY r1 = (X.C61034JvY) r1
            if (r1 == 0) goto L_0x0346
            java.lang.String r4 = r1.A04
            java.lang.Object r1 = r1.A03
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r3 = X.JTP.A0o(r1)
            java.util.Map r1 = r2.snapshot()
            X.0qQ.A07(r1)
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r6 = X.AnonymousClass7TF.A0u(r1)
        L_0x0300:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0322
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r6)
            java.lang.Object r1 = r2.getKey()
            boolean r1 = X.0qQ.A0K(r1, r8)
            if (r1 == 0) goto L_0x0300
            X.Dbb.A1V(r2, r7)
            goto L_0x0300
        L_0x0318:
            r4 = 0
            goto L_0x02d4
        L_0x031a:
            r5 = r8
            if (r6 == 0) goto L_0x02ca
            goto L_0x02c4
        L_0x031e:
            r3 = 0
            if (r2 == 0) goto L_0x02bb
            goto L_0x02ae
        L_0x0322:
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r7)
        L_0x0326:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0346
            r2.next()
            java.lang.Integer r7 = X.AnonymousClass05K.A07
            java.lang.String[] r9 = new java.lang.String[]{r4, r3}
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            long r10 = java.lang.System.currentTimeMillis()
            X.N9C r6 = new X.N9C
            r6.<init>(r7, r8, r9, r10, r12)
            X.NfF r1 = r0.A01
            r1.A02(r6)
            goto L_0x0326
        L_0x0346:
            r0.A00 = r5
            return
        L_0x0349:
            boolean r1 = r0 instanceof X.Nf1
            if (r1 == 0) goto L_0x03b7
            X.Nf1 r0 = (X.Nf1) r0
            r14 = 0
            com.instagram.rtc.rsys.models.EngineModel r1 = X.OTZ.A0K(r2)
            r3 = 1
            if (r1 == 0) goto L_0x03b5
            com.instagram.rtc.rsys.models.IgCallModel r2 = r1.callModel
            if (r2 == 0) goto L_0x03b5
            boolean r1 = r2.e2eeMandated
            if (r1 == r3) goto L_0x1343
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r2.selfParticipant
            if (r1 == 0) goto L_0x03b5
            boolean r1 = r1.hasVoiceActivity
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
        L_0x0369:
            boolean r1 = X.AnonymousClass7TF.A1Y(r6, r3)
            if (r1 == 0) goto L_0x03ac
            boolean r1 = r0.A01
            if (r1 != 0) goto L_0x03ac
            X.OWA r9 = r0.A03
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.PJy r1 = new X.PJy
            r1.<init>(r2)
            r9.A02(r1)
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.A00
            long r7 = r1 - r3
            r4 = 33000(0x80e8, double:1.6304E-319)
            int r3 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r3 < 0) goto L_0x03ac
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            X.PJy r3 = new X.PJy
            r3.<init>(r10)
            r9.A02(r3)
            X.NfF r3 = r0.A02
            java.lang.Integer r9 = X.AnonymousClass05K.A0F
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String[] r11 = new java.lang.String[r14]
            X.N9C r8 = new X.N9C
            r8.<init>(r9, r10, r11, r12, r14)
            r3.A02(r8)
            r0.A00 = r1
        L_0x03ac:
            if (r6 == 0) goto L_0x1343
            boolean r1 = r6.booleanValue()
            r0.A01 = r1
            return
        L_0x03b5:
            r6 = 0
            goto L_0x0369
        L_0x03b7:
            boolean r1 = r0 instanceof X.C69121Nf0
            if (r1 == 0) goto L_0x040f
            X.Nf0 r0 = (X.C69121Nf0) r0
            r4 = 0
            boolean r1 = r0.A03
            if (r1 == 0) goto L_0x1343
            java.lang.Object r1 = r2.A02
            X.N9J r1 = (X.N9J) r1
            java.lang.Integer r6 = r1.A01
            java.lang.Object r2 = r2.A00
            com.instagram.rtc.rsys.models.EngineModel r2 = (com.instagram.rtc.rsys.models.EngineModel) r2
            r1 = 0
            if (r2 == 0) goto L_0x03d1
            com.facebook.rsys.rooms.gen.RoomModel r1 = r2.roomModel
        L_0x03d1:
            r5 = 1
            if (r1 == 0) goto L_0x03d9
            int r1 = r1.state
            r3 = 1
            if (r1 == r5) goto L_0x03da
        L_0x03d9:
            r3 = 0
        L_0x03da:
            if (r2 == 0) goto L_0x03ec
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L_0x03ec
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r1.selfParticipant
            if (r1 == 0) goto L_0x03ec
            int r2 = r1.state
            r1 = 7
            if (r2 != r1) goto L_0x03ec
            r2 = 1
            if (r3 == 0) goto L_0x03ed
        L_0x03ec:
            r2 = 0
        L_0x03ed:
            X.N8z r3 = r0.A00
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r6 != r1) goto L_0x040d
            if (r2 == 0) goto L_0x040d
        L_0x03f5:
            boolean r1 = r3.A00
            X.N8z r2 = new X.N8z
            r2.<init>(r5, r1)
            boolean r1 = r3.equals(r2)
            if (r1 != 0) goto L_0x1343
            X.05G r1 = r0.A02
            X.0qQ.A0B(r1, r4)
            r1.FIA(r2)
            r0.A00 = r2
            return
        L_0x040d:
            r5 = 0
            goto L_0x03f5
        L_0x040f:
            boolean r1 = r0 instanceof X.C69128Nf9
            if (r1 == 0) goto L_0x0497
            X.Nf9 r0 = (X.C69128Nf9) r0
            r4 = 0
            com.instagram.rtc.rsys.models.EngineModel r13 = X.OTZ.A0K(r2)
            r9 = 0
            if (r13 == 0) goto L_0x0472
            com.facebook.rsys.livevideo.gen.LiveVideoModel r14 = r13.liveVideoModel
            if (r14 == 0) goto L_0x0473
            int r8 = r14.liveStreamStatus
        L_0x0423:
            r6 = 3
            java.lang.Integer[] r7 = X.AnonymousClass05K.A00(r6)
            int r5 = r7.length
            r3 = 0
        L_0x042a:
            if (r3 >= r5) goto L_0x048c
            r10 = r7[r3]
            int r1 = r10.intValue()
            switch(r1) {
                case 1: goto L_0x046e;
                case 2: goto L_0x0470;
                default: goto L_0x0435;
            }
        L_0x0435:
            r1 = 0
        L_0x0436:
            if (r1 != r8) goto L_0x046b
            r11 = 0
            if (r14 == 0) goto L_0x0468
            java.lang.Long r1 = r14.broadcastId
            if (r1 == 0) goto L_0x0468
            long r7 = r1.longValue()
        L_0x0444:
            if (r13 == 0) goto L_0x0466
            com.instagram.rtc.rsys.models.IgCallModel r1 = r13.callModel
            if (r1 == 0) goto L_0x0466
            java.lang.String r3 = r1.serverInfoData
        L_0x044c:
            X.N91 r1 = new X.N91
            r1.<init>(r10, r3, r7)
            r0.A01 = r1
            java.lang.Integer r1 = r0.A02
            int r5 = r1.intValue()
            r3 = 1
            if (r5 == r4) goto L_0x0475
            if (r5 == r3) goto L_0x0795
            r1 = 2
            if (r5 == r1) goto L_0x07c5
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0466:
            r3 = r9
            goto L_0x044c
        L_0x0468:
            r7 = 0
            goto L_0x0444
        L_0x046b:
            int r3 = r3 + 1
            goto L_0x042a
        L_0x046e:
            r1 = 1
            goto L_0x0436
        L_0x0470:
            r1 = 2
            goto L_0x0436
        L_0x0472:
            r14 = r9
        L_0x0473:
            r8 = 0
            goto L_0x0423
        L_0x0475:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r10 != r1) goto L_0x07c5
            r0.A02 = r1
            java.util.concurrent.ScheduledExecutorService r9 = r0.A09
            X.PWv r5 = new X.PWv
            r5.<init>(r0)
            r7 = 30
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.ScheduledFuture r9 = r9.schedule(r5, r7, r1)
            goto L_0x07c3
        L_0x048c:
            r0 = 5
            java.lang.String r1 = X.C273654mx.A00(r0)
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r1)
            throw r0
        L_0x0497:
            boolean r1 = r0 instanceof X.C69124Nf5
            if (r1 == 0) goto L_0x0598
            X.Nf5 r0 = (X.C69124Nf5) r0
            r13 = 0
            com.instagram.rtc.rsys.models.EngineModel r1 = X.OTZ.A0K(r2)
            if (r1 == 0) goto L_0x1343
            com.facebook.rsys.crypto.gen.CryptoE2eeModel r1 = r1.cryptoE2eeModel
            if (r1 == 0) goto L_0x1343
            java.util.ArrayList r1 = r1.participantIdentities
            X.0qQ.A06(r1)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r1.iterator()
        L_0x04b5:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x04e1
            java.lang.Object r6 = r7.next()
            com.facebook.rsys.crypto.gen.CryptoParticipantIdentity r6 = (com.facebook.rsys.crypto.gen.CryptoParticipantIdentity) r6
            java.lang.String r5 = r6.participantId
            X.0qQ.A06(r5)
            byte[] r3 = r6.publicIdentityKey
            if (r3 == 0) goto L_0x04df
            java.lang.String r2 = ":"
            X.Ppd r1 = X.C74136Ppd.A00
            java.lang.String r4 = X.03t.A08(r2, r1, r3)
        L_0x04d2:
            byte[] r3 = r6.publicIdentityKey
            boolean r2 = r6.isNewIdentityKey
            X.Jvt r1 = new X.Jvt
            r1.<init>((java.lang.String) r5, (java.lang.String) r4, (byte[]) r3, (boolean) r2)
            r8.add(r1)
            goto L_0x04b5
        L_0x04df:
            r4 = 0
            goto L_0x04d2
        L_0x04e1:
            X.N8x r2 = new X.N8x
            r2.<init>(r8)
            X.N8x r1 = r0.A00
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 != 0) goto L_0x04f8
            X.05G r1 = r0.A06
            X.0qQ.A0B(r1, r13)
            r1.FIA(r2)
            r0.A00 = r2
        L_0x04f8:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            X.N8x r1 = r0.A00
            java.util.List r1 = r1.A00
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r5 = r1.iterator()
        L_0x0508:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0525
            java.lang.Object r3 = r5.next()
            r2 = r3
            X.Jvt r2 = (X.C61055Jvt) r2
            java.util.Set r1 = r0.A03
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0508
            boolean r1 = r2.A03
            if (r1 == 0) goto L_0x0508
            r6.add(r3)
            goto L_0x0508
        L_0x0525:
            java.util.Iterator r6 = r6.iterator()
        L_0x0529:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x058c
            java.lang.Object r5 = r6.next()
            X.Jvt r5 = (X.C61055Jvt) r5
            java.util.Set r1 = r0.A03
            r1.add(r5)
            X.0sa r1 = r0.A04
            boolean r1 = X.C51971G9r.A1b(r1)
            if (r1 != 0) goto L_0x0573
            java.lang.String r2 = r5.A01
            X.Oxw r1 = r0.A02
            X.0qQ.A0B(r2, r13)
            android.util.LruCache r1 = r1.A00
            java.lang.Object r1 = r1.get(r2)
            X.JvY r1 = (X.C61034JvY) r1
            if (r1 == 0) goto L_0x0589
            java.lang.String r2 = r1.A04
            if (r2 == 0) goto L_0x0589
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0589
            java.lang.String[] r10 = new java.lang.String[]{r2}
        L_0x0561:
            java.lang.Integer r8 = X.AnonymousClass05K.A0E
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            long r11 = java.lang.System.currentTimeMillis()
            X.N9C r7 = new X.N9C
            r7.<init>(r8, r9, r10, r11, r13)
            X.NfF r1 = r0.A01
            r1.A02(r7)
        L_0x0573:
            java.lang.Object r3 = r5.A00
            byte[] r3 = (byte[]) r3
            if (r3 != 0) goto L_0x057b
            byte[] r3 = new byte[r13]
        L_0x057b:
            int r1 = r3.length
            if (r1 == 0) goto L_0x0529
            java.lang.String r2 = r5.A01
            com.facebook.rsys.crypto.gen.ParticipantIdentityInfo r1 = new com.facebook.rsys.crypto.gen.ParticipantIdentityInfo
            r1.<init>(r2, r3)
            r4.add(r1)
            goto L_0x0529
        L_0x0589:
            java.lang.String[] r10 = new java.lang.String[r13]
            goto L_0x0561
        L_0x058c:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x1343
            X.0sP r0 = r0.A05
            r0.invoke(r4)
            return
        L_0x0598:
            boolean r1 = r0 instanceof X.C69133NfE
            if (r1 == 0) goto L_0x0a1f
            X.NfE r0 = (X.C69133NfE) r0
            r9 = 0
            java.lang.Object r1 = r2.A02
            X.N9J r1 = (X.N9J) r1
            com.instagram.model.rtc.RtcCallKey r10 = r1.A00
            if (r10 == 0) goto L_0x1343
            java.lang.Object r6 = r2.A00
            com.instagram.rtc.rsys.models.EngineModel r6 = (com.instagram.rtc.rsys.models.EngineModel) r6
            r8 = 0
            if (r6 == 0) goto L_0x0773
            com.instagram.rtc.rsys.models.IgCallModel r1 = r6.callModel
            if (r1 == 0) goto L_0x0773
            com.facebook.rsys.mediasync.gen.MediaSyncState r7 = r1.mediaSyncState
        L_0x05b4:
            r5 = 1
            if (r6 == 0) goto L_0x05c0
            com.instagram.rtc.rsys.models.IgCallModel r1 = r6.callModel
            if (r1 == 0) goto L_0x05c0
            boolean r2 = r1.e2eeMandated
            r1 = 1
            if (r2 == r5) goto L_0x05c1
        L_0x05c0:
            r1 = 0
        L_0x05c1:
            r0.A04 = r1
            com.facebook.rsys.mediasync.gen.MediaSyncState r1 = r0.A00
            boolean r1 = X.0qQ.A0K(r1, r7)
            if (r1 != 0) goto L_0x061b
            com.facebook.rsys.mediasync.gen.MediaSyncState r1 = r0.A00
            if (r1 == 0) goto L_0x0770
            int r1 = r1.action
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x05d5:
            if (r7 == 0) goto L_0x076d
            int r1 = r7.action
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L_0x05dd:
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x0690
            if (r7 == 0) goto L_0x0694
            int r1 = r7.action
            if (r1 != 0) goto L_0x0604
            X.O9a r1 = r0.A0D
            X.OVd r1 = r1.A00
            X.O9M r1 = r1.A0J
            X.OK3 r1 = r1.A00
            r1.A00()
            X.OVd r3 = r1.A00
            X.NfJ r2 = r3.A0N
            X.PP0 r1 = X.PP0.A00
            r2.A0K(r1)
            X.NfH r2 = r3.A0a
            X.PPV r1 = X.PPV.A00
            r2.A04(r1)
        L_0x0604:
            com.facebook.rsys.mediasync.gen.MediaSyncContent r1 = r7.content
            if (r1 == 0) goto L_0x0694
            r0.A00 = r7
            X.05G r4 = r0.A0F
            java.lang.String r3 = r10.A00
            r2 = 12
            X.Jw8 r1 = new X.Jw8
            r1.<init>((com.facebook.rsys.mediasync.gen.MediaSyncState) r7, (com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments) r8, (java.lang.String) r3, (int) r2)
            X.0qQ.A0B(r4, r9)
            r4.FIA(r1)
        L_0x061b:
            X.OH8 r7 = r0.A08
            X.O9Z r1 = r0.A0C
            X.OVd r1 = r1.A00
            X.Oaz r1 = r1.A0K
            X.N3Z r1 = r1.A02
            if (r1 == 0) goto L_0x068e
            com.instagram.model.rtc.cowatch.RtcStartCoWatchPlaybackArguments r8 = r1.A02
        L_0x0629:
            r1 = 3
            X.PqM r4 = new X.PqM
            r4.<init>(r0, r1)
            r2 = 0
            if (r6 == 0) goto L_0x0644
            com.instagram.rtc.rsys.models.IgCallModel r0 = r6.callModel
            if (r0 == 0) goto L_0x0644
            java.util.ArrayList r1 = r0.participants
            if (r1 == 0) goto L_0x0644
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0675
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0675
        L_0x0644:
            if (r8 == 0) goto L_0x0672
            int r0 = r7.A00
            if (r2 == r0) goto L_0x0672
            if (r2 <= 0) goto L_0x0672
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x0672
            X.Par r6 = new X.Par
            r6.<init>(r8, r7, r4)
            com.instagram.common.session.UserSession r4 = r7.A04
            X.0Tu r3 = X.0Tu.A05
            r0 = 36591815691993105(0x82001000020011, double:3.20414981480707E-306)
            long r3 = X.JTS.A05(r3, r4, r0)
            r7.A01 = r6
            android.os.Handler r0 = r7.A03
            r0.postDelayed(r6, r3)
            X.OWA r1 = r7.A05
            X.PKN r0 = X.PKN.A00
            r1.A02(r0)
            r7.A02 = r5
        L_0x0672:
            r7.A00 = r2
            return
        L_0x0675:
            java.util.Iterator r3 = r1.iterator()
        L_0x0679:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0644
            com.instagram.rtc.rsys.models.ParticipantModel r0 = X.C66580MXl.A0n(r3)
            int r1 = r0.state
            r0 = 7
            if (r1 != r0) goto L_0x0679
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x0679
            goto L_0x078d
        L_0x068e:
            r8 = 0
            goto L_0x0629
        L_0x0690:
            if (r7 == 0) goto L_0x0694
            goto L_0x0604
        L_0x0694:
            com.facebook.rsys.mediasync.gen.MediaSyncState r1 = r0.A00
            if (r1 == 0) goto L_0x069a
            java.lang.String r8 = r1.contentId
        L_0x069a:
            r0.A00 = r7
            if (r7 == 0) goto L_0x0765
            com.facebook.rsys.mediasync.gen.MediaSyncContent r3 = r7.content
            if (r3 == 0) goto L_0x06c1
            com.facebook.rsys.mediasync.gen.FacebookVideoContent r1 = r3.facebookVideoContent
            if (r1 != 0) goto L_0x06ed
            com.facebook.rsys.mediasync.gen.InstagramContent r1 = r3.instagramContent
            if (r1 != 0) goto L_0x06ed
            com.facebook.rsys.mediasync.gen.Placeholder r1 = r3.placeholder
            if (r1 != 0) goto L_0x06ed
            com.facebook.rsys.mediasync.gen.Fallback r1 = r3.fallback
            if (r1 != 0) goto L_0x06ed
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Nonnull content resolution with null children: "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r3, r1, r2)
            java.lang.String r1 = "RtcCoWatchPlaybackInteractor"
            X.0KC.A0E(r1, r2)
        L_0x06c1:
            java.lang.String r1 = r7.contentId
            boolean r1 = X.0qQ.A0K(r1, r8)
            if (r1 != 0) goto L_0x06df
            X.OTg r10 = r0.A02
            if (r10 == 0) goto L_0x070d
            java.lang.String r8 = r7.contentId
            X.0qQ.A06(r8)
            java.lang.Integer r3 = X.C71149Oe9.A08(r7)
            X.0qQ.A0B(r3, r5)
            java.lang.Object r1 = r10.A05
            monitor-enter(r1)
            r10.A01 = r8     // Catch:{ all -> 0x0a1c }
            goto L_0x06f4
        L_0x06df:
            int r3 = r7.action
            r1 = 2
            X.Oe9 r2 = r0.A0A
            if (r3 == r1) goto L_0x0765
            X.Put r1 = r0.A01
            X.N36 r1 = r2.A0C(r7, r1)
            goto L_0x0713
        L_0x06ed:
            X.Oe9 r1 = r0.A0A
            X.N36 r1 = r1.A0A(r3, r7)
            goto L_0x0713
        L_0x06f4:
            monitor-exit(r1)
            com.instagram.common.session.UserSession r12 = r10.A03
            X.1Xj r2 = X.DbV.A0U(r12, r8)
            if (r2 == 0) goto L_0x071b
            X.OMP r1 = r10.A04
            X.N54 r2 = r1.A00(r2)
        L_0x0703:
            X.Put r2 = (X.C74438Put) r2
            X.Pa7 r1 = new X.Pa7
            r1.<init>(r2, r10, r8)
            X.11Z.A02(r1)
        L_0x070d:
            X.Oe9 r1 = r0.A0A
            X.N36 r1 = r1.A0B(r7)
        L_0x0713:
            if (r1 == 0) goto L_0x0765
            boolean r1 = r1.A06
            if (r1 != r5) goto L_0x0765
            goto L_0x061b
        L_0x071b:
            int r1 = r3.intValue()
            if (r1 == r5) goto L_0x072d
            r11 = 2
            if (r1 == r11) goto L_0x073a
            X.OMP r2 = r10.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.N51 r2 = r2.A01(r1, r8)
            goto L_0x0703
        L_0x072d:
            X.C70959OTg.A00(r10, r8)
            X.1OC r2 = X.C3724090s.A04(r12, r8)
            X.NM2 r1 = new X.NM2
            r1.<init>(r8, r10, r5)
            goto L_0x075f
        L_0x073a:
            X.C70959OTg.A00(r10, r8)
            X.2IS r4 = X.C41845B3m.A04()
            java.lang.String r1 = "content_id"
            r4.A04(r1, r8)
            java.lang.Class<X.N1r> r3 = X.C68128N1r.class
            java.lang.String r1 = "CoWatchMediaSyncContentQuery"
            X.3Fa r2 = new X.3Fa
            r2.<init>(r4, r3, r1, r9)
            X.3Fb r1 = X.C46479Dfi.A01(r12)
            r1.A08(r2)
            X.1OC r2 = r1.A06()
            X.NM2 r1 = new X.NM2
            r1.<init>(r8, r10, r11)
        L_0x075f:
            r2.A00 = r1
            X.1ES.A03(r2)
            goto L_0x070d
        L_0x0765:
            java.lang.String r2 = r0.A03
            r1 = 2
            X.0qQ.A0B(r2, r1)
            goto L_0x061b
        L_0x076d:
            r1 = r8
            goto L_0x05dd
        L_0x0770:
            r2 = r8
            goto L_0x05d5
        L_0x0773:
            r7 = r8
            goto L_0x05b4
        L_0x0776:
            java.util.Iterator r7 = r2.iterator()
            r2 = 0
        L_0x077b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x07e6
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r7)
            int r1 = r1.state
            if (r1 != r8) goto L_0x077b
            int r2 = r2 + 1
            if (r2 >= 0) goto L_0x077b
        L_0x078d:
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0795:
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            if (r10 != r7) goto L_0x07c5
            X.O9b r1 = r0.A07
            X.OVd r1 = r1.A00
            X.Odx r1 = r1.A0Z
            X.OAP r5 = r1.A08
            if (r5 == 0) goto L_0x07ba
            X.XcN r1 = X.C65819M0l.A0K
            if (r1 == 0) goto L_0x07ba
            X.M0l r5 = r5.A00
            X.M5N r1 = new X.M5N
            r1.<init>(r5)
            X.11Z.A02(r1)
            boolean r1 = r5.A05
            if (r1 == 0) goto L_0x07ba
            X.LRP r1 = r5.A0A
            r1.A02(r7)
        L_0x07ba:
            r0.A02 = r7
            java.util.concurrent.ScheduledFuture r1 = r0.A04
            if (r1 == 0) goto L_0x07c5
            r1.cancel(r3)
        L_0x07c3:
            r0.A04 = r9
        L_0x07c5:
            X.N91 r1 = r0.A01
            long r7 = r1.A00
            int r1 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x0a11
            java.lang.Object r5 = r2.A00
            com.instagram.rtc.rsys.models.EngineModel r5 = (com.instagram.rtc.rsys.models.EngineModel) r5
            r8 = 7
            if (r5 == 0) goto L_0x0823
            com.instagram.rtc.rsys.models.IgCallModel r1 = r5.callModel
            if (r1 == 0) goto L_0x07e6
            java.util.ArrayList r2 = r1.participants
            if (r2 == 0) goto L_0x07e6
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0776
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0776
        L_0x07e6:
            com.instagram.rtc.rsys.models.IgCallModel r1 = r5.callModel
            if (r1 == 0) goto L_0x0823
            java.util.ArrayList r1 = r1.participants
            if (r1 == 0) goto L_0x0823
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r1.iterator()
        L_0x07f6:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x080b
            java.lang.Object r2 = r7.next()
            r1 = r2
            com.instagram.rtc.rsys.models.ParticipantModel r1 = (com.instagram.rtc.rsys.models.ParticipantModel) r1
            int r1 = r1.state
            if (r1 != r8) goto L_0x07f6
            r9.add(r2)
            goto L_0x07f6
        L_0x080b:
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r9)
            java.util.Iterator r2 = r9.iterator()
        L_0x0813:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0825
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r2)
            java.lang.String r1 = r1.rendererId
            r7.add(r1)
            goto L_0x0813
        L_0x0823:
            X.0sn r7 = X.0sn.A00
        L_0x0825:
            java.util.List r1 = r0.A03
            boolean r1 = X.0qQ.A0K(r1, r7)
            r15 = 0
            if (r1 != 0) goto L_0x095a
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r7.iterator()
        L_0x0836:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x084c
            java.lang.Object r2 = r8.next()
            java.util.List r1 = r0.A03
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x0836
            r9.add(r2)
            goto L_0x0836
        L_0x084c:
            java.util.Iterator r14 = r9.iterator()
        L_0x0850:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x08d5
            java.lang.String r8 = X.AnonymousClass7TE.A18(r14)
            X.O9b r1 = r0.A07
            X.0qQ.A0A(r8)
            X.0qQ.A0B(r8, r4)
            X.OVd r1 = r1.A00
            X.Odx r10 = r1.A0Z
            android.content.Context r1 = r10.A0A
            X.Oq3 r9 = new X.Oq3
            r9.<init>(r1)
            X.Vjq r12 = r10.A07
            if (r12 == 0) goto L_0x088e
            X.0eM r1 = r9.A0A
            android.view.View r11 = X.AnonymousClass7TE.A0c(r1)
            com.instagram.common.session.UserSession r1 = r10.A0H
            X.17i r13 = X.17h.A00(r1)
            long r1 = java.lang.Long.parseLong(r8)
            com.instagram.user.model.User r1 = r13.A00(r1)
            java.lang.String r2 = X.DbX.A0r(r1)
            java.lang.String r1 = "co-broadcaster"
            r12.A02(r11, r2, r1)
        L_0x088e:
            r10.A09(r9, r8)
            boolean r1 = r9.A06
            if (r1 == r3) goto L_0x089e
            r9.A06 = r3
            X.MsF r1 = r9.A01
            if (r1 == 0) goto L_0x089e
            r1.setAutoAdjustScalingType(r3)
        L_0x089e:
            java.util.Map r1 = r10.A0R
            r1.put(r8, r9)
            X.1Ng r9 = r0.A00
            X.N91 r1 = r0.A01
            long r1 = r1.A00
            java.lang.String r10 = java.lang.String.valueOf(r1)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r8)
            if (r1 == 0) goto L_0x08d3
            long r1 = r1.longValue()
            com.instagram.common.session.UserSession r8 = r0.A06
            X.17i r8 = X.17h.A00(r8)
            com.instagram.user.model.User r1 = r8.A00(r1)
            if (r1 == 0) goto L_0x08d3
            java.lang.String r8 = r1.getId()
        L_0x08c7:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.KbS r1 = new X.KbS
            r1.<init>(r10, r2, r8)
            r9.A00(r1)
            goto L_0x0850
        L_0x08d3:
            r8 = r15
            goto L_0x08c7
        L_0x08d5:
            java.util.List r1 = r0.A03
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r1.iterator()
        L_0x08df:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x08f3
            java.lang.Object r2 = r3.next()
            boolean r1 = r7.contains(r2)
            if (r1 != 0) goto L_0x08df
            r8.add(r2)
            goto L_0x08df
        L_0x08f3:
            java.util.Iterator r11 = r8.iterator()
        L_0x08f7:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0958
            java.lang.String r10 = X.AnonymousClass7TE.A18(r11)
            X.O9b r1 = r0.A07
            X.0qQ.A0B(r10, r4)
            X.OVd r1 = r1.A00
            X.Odx r1 = r1.A0Z
            java.util.Map r8 = r1.A0R
            java.lang.Object r3 = r8.get(r10)
            X.Oq3 r3 = (X.C71743Oq3) r3
            if (r3 == 0) goto L_0x0927
            X.Vjq r2 = r1.A07
            if (r2 == 0) goto L_0x0921
            X.0eM r1 = r3.A0A
            android.view.View r1 = X.AnonymousClass7TE.A0c(r1)
            r2.A01(r1)
        L_0x0921:
            r3.A01()
            r8.remove(r10)
        L_0x0927:
            X.1Ng r8 = r0.A00
            X.N91 r1 = r0.A01
            long r1 = r1.A00
            java.lang.String r9 = java.lang.String.valueOf(r1)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r10)
            if (r1 == 0) goto L_0x0956
            long r2 = r1.longValue()
            com.instagram.common.session.UserSession r1 = r0.A06
            X.17i r1 = X.17h.A00(r1)
            com.instagram.user.model.User r1 = r1.A00(r2)
            if (r1 == 0) goto L_0x0956
            java.lang.String r3 = r1.getId()
        L_0x094b:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            X.KbS r1 = new X.KbS
            r1.<init>(r9, r2, r3)
            r8.A00(r1)
            goto L_0x08f7
        L_0x0956:
            r3 = r15
            goto L_0x094b
        L_0x0958:
            r0.A03 = r7
        L_0x095a:
            if (r5 == 0) goto L_0x0a0b
            com.instagram.rtc.rsys.models.IgCallModel r1 = r5.callModel
            if (r1 == 0) goto L_0x0a0b
            java.util.ArrayList r2 = r1.participants
            if (r2 == 0) goto L_0x0a0b
        L_0x0964:
            com.instagram.rtc.rsys.models.IgCallModel r1 = r5.callModel
            if (r1 == 0) goto L_0x0970
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r1.selfParticipant
            if (r1 == 0) goto L_0x0970
            java.util.ArrayList r2 = X.00k.A0T(r1, r2)
        L_0x0970:
            java.util.Iterator r9 = r2.iterator()
        L_0x0974:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0a11
            com.instagram.rtc.rsys.models.ParticipantModel r3 = X.C66580MXl.A0n(r9)
            int r2 = r3.state
            r1 = 2
            if (r2 == r1) goto L_0x0a08
            if (r2 == r6) goto L_0x0a05
            r1 = 6
            if (r2 == r1) goto L_0x0a02
            r1 = 7
            if (r2 == r1) goto L_0x09ff
            switch(r2) {
                case 9: goto L_0x09fc;
                case 10: goto L_0x09f9;
                case 11: goto L_0x09f6;
                case 12: goto L_0x09f3;
                case 13: goto L_0x09f0;
                case 14: goto L_0x09ed;
                case 15: goto L_0x09ea;
                case 16: goto L_0x09e7;
                default: goto L_0x098e;
            }
        L_0x098e:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
        L_0x0990:
            java.lang.String r1 = r3.rendererId
            X.0qQ.A07(r1)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r1)
            if (r1 == 0) goto L_0x0974
            long r1 = r1.longValue()
            com.instagram.common.session.UserSession r5 = r0.A06
            X.17i r5 = X.17h.A00(r5)
            com.instagram.user.model.User r1 = r5.A00(r1)
            if (r1 == 0) goto L_0x0974
            java.lang.String r7 = r1.getId()
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            if (r8 == r1) goto L_0x09ca
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            if (r8 == r1) goto L_0x09ca
            X.1Ng r5 = r0.A00
            X.N91 r1 = r0.A01
            long r1 = r1.A00
            java.lang.String r1 = java.lang.String.valueOf(r1)
            X.KbT r3 = new X.KbT
            r3.<init>(r8, r1, r7, r4)
        L_0x09c6:
            r5.A00(r3)
            goto L_0x0974
        L_0x09ca:
            X.1Ng r5 = r0.A00
            X.N91 r1 = r0.A01
            long r1 = r1.A00
            java.lang.String r2 = java.lang.String.valueOf(r1)
            boolean r1 = r3.videoEnabled
            if (r1 == 0) goto L_0x09e4
            boolean r1 = r3.videoStalled
            if (r1 != 0) goto L_0x09e4
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x09de:
            X.KbR r3 = new X.KbR
            r3.<init>(r2, r1, r7)
            goto L_0x09c6
        L_0x09e4:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x09de
        L_0x09e7:
            java.lang.Integer r8 = X.AnonymousClass05K.A04
            goto L_0x0990
        L_0x09ea:
            java.lang.Integer r8 = X.AnonymousClass05K.A03
            goto L_0x0990
        L_0x09ed:
            java.lang.Integer r8 = X.AnonymousClass05K.A02
            goto L_0x0990
        L_0x09f0:
            java.lang.Integer r8 = X.AnonymousClass05K.A0j
            goto L_0x0990
        L_0x09f3:
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            goto L_0x0990
        L_0x09f6:
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            goto L_0x0990
        L_0x09f9:
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            goto L_0x0990
        L_0x09fc:
            java.lang.Integer r8 = X.AnonymousClass05K.A01
            goto L_0x0990
        L_0x09ff:
            java.lang.Integer r8 = X.AnonymousClass05K.A1I
            goto L_0x0990
        L_0x0a02:
            java.lang.Integer r8 = X.AnonymousClass05K.A1F
            goto L_0x0990
        L_0x0a05:
            java.lang.Integer r8 = X.AnonymousClass05K.A15
            goto L_0x0990
        L_0x0a08:
            java.lang.Integer r8 = X.AnonymousClass05K.A0u
            goto L_0x0990
        L_0x0a0b:
            X.0sn r2 = X.0sn.A00
            if (r5 == 0) goto L_0x0970
            goto L_0x0964
        L_0x0a11:
            X.0V2 r1 = r0.A05
            X.N91 r0 = r0.A01
            X.0qQ.A0B(r1, r4)
            r1.FIA(r0)
            return
        L_0x0a1c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0a1f:
            boolean r1 = r0 instanceof X.C69130NfB
            if (r1 != 0) goto L_0x133e
            boolean r1 = r0 instanceof X.C69131NfC
            if (r1 == 0) goto L_0x0ac2
            X.NfC r0 = (X.C69131NfC) r0
            r5 = 0
            com.facebook.common.util.TriState r1 = r0.A00
            boolean r1 = r1.isSet()
            if (r1 != 0) goto L_0x1343
            java.lang.Object r1 = r2.A00
            com.instagram.rtc.rsys.models.EngineModel r1 = (com.instagram.rtc.rsys.models.EngineModel) r1
            if (r1 == 0) goto L_0x1343
            com.instagram.rtc.rsys.models.IgCallModel r1 = r1.callModel
            if (r1 == 0) goto L_0x1343
            boolean r1 = r1.e2eeMandated
            com.facebook.common.util.TriState r2 = com.facebook.common.util.TriState.valueOf(r1)
            r0.A00 = r2
            com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.NO
            if (r2 == r1) goto L_0x0a59
            X.ONT r1 = r0.A05
            com.instagram.common.session.UserSession r4 = r1.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 36310903358226810(0x8100930024017a, double:3.026499723790089E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x1343
        L_0x0a59:
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x1343
            r1 = 1
            r0.A03 = r1
            com.facebook.common.util.TriState r1 = r0.A00
            com.facebook.common.util.TriState r7 = com.facebook.common.util.TriState.NO
            if (r1 == r7) goto L_0x0a77
            X.ONT r6 = r0.A05
            com.instagram.common.session.UserSession r4 = r6.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 36310903358226810(0x8100930024017a, double:3.026499723790089E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0aa1
        L_0x0a77:
            X.ONT r6 = r0.A05
            X.Np9 r1 = r6.A00()
            boolean r1 = r1 instanceof X.C69146NfV
            if (r1 == 0) goto L_0x0aa1
            com.instagram.arp.api.AvatarEffectsApiController r4 = r0.A04
            X.1Ng r3 = r4.A07
            java.lang.Class<X.27b> r2 = X.AnonymousClass27b.class
            X.1wn r1 = r4.A09
            r3.A01(r1, r2)
            java.lang.Class<X.27T> r2 = X.AnonymousClass27T.class
            X.1wn r1 = r4.A0B
            r3.A01(r1, r2)
            java.lang.Class<X.27X> r2 = X.AnonymousClass27X.class
            X.1wn r1 = r4.A0A
            r3.A01(r1, r2)
            java.lang.Class<X.Osd> r2 = X.C71895Osd.class
            X.1wn r1 = r4.A08
            r3.A01(r1, r2)
        L_0x0aa1:
            com.facebook.common.util.TriState r1 = r0.A00
            if (r1 == r7) goto L_0x0ab4
            com.instagram.common.session.UserSession r4 = r6.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 36310903358226810(0x8100930024017a, double:3.026499723790089E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x1343
        L_0x0ab4:
            X.Np9 r1 = r6.A00()
            boolean r1 = r1 instanceof X.C69146NfV
            if (r1 == 0) goto L_0x1343
            com.instagram.arp.api.AvatarEffectsApiController r0 = r0.A04
            r0.A03(r5)
            return
        L_0x0ac2:
            boolean r1 = r0 instanceof X.C69138NfJ
            if (r1 == 0) goto L_0x0c7e
            X.NfJ r0 = (X.C69138NfJ) r0
            r12 = 0
            com.instagram.rtc.rsys.models.EngineModel r5 = X.OTZ.A0K(r2)
            if (r5 == 0) goto L_0x1343
            com.instagram.rtc.rsys.models.IgCallModel r4 = r5.callModel
            if (r4 == 0) goto L_0x1343
            com.instagram.rtc.rsys.models.ParticipantModel r7 = r4.selfParticipant
            X.0qQ.A07(r7)
            java.util.ArrayList r1 = r4.participants
            java.util.ArrayList r8 = X.DbV.A15(r1)
            java.util.Iterator r6 = r1.iterator()
        L_0x0ae2:
            boolean r1 = r6.hasNext()
            r3 = 1
            if (r1 == 0) goto L_0x0af9
            java.lang.Object r3 = r6.next()
            r1 = r3
            com.instagram.rtc.rsys.models.ParticipantModel r1 = (com.instagram.rtc.rsys.models.ParticipantModel) r1
            int r2 = r1.state
            r1 = 7
            if (r2 != r1) goto L_0x0ae2
            r8.add(r3)
            goto L_0x0ae2
        L_0x0af9:
            java.lang.String r1 = r7.userId
            r0.A0A = r1
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            r7 = 10
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r2 = r8.iterator()
        L_0x0b0b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0b1b
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r2)
            java.lang.String r1 = r1.userId
            r9.add(r1)
            goto L_0x0b0b
        L_0x0b1b:
            r6.addAll(r9)
            X.N9P r1 = X.C69138NfJ.A00(r0)
            boolean r2 = r1.A0N
            com.instagram.rtc.rsys.models.IgCallModel r1 = r5.callModel
            if (r1 == 0) goto L_0x0b32
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r1.selfParticipant
            if (r1 == 0) goto L_0x0b32
            boolean r1 = r1.videoEnabled
            r21 = 1
            if (r1 == r3) goto L_0x0b34
        L_0x0b32:
            r21 = 0
        L_0x0b34:
            X.N9P r1 = X.C69138NfJ.A00(r0)
            com.instagram.camera.effect.models.CameraAREffect r14 = r1.A05
            if (r14 == 0) goto L_0x0bab
            if (r2 != 0) goto L_0x0bd3
            if (r21 == 0) goto L_0x0bab
            java.util.Map r2 = r14.A0Z
            java.lang.String r1 = "participant"
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto L_0x0b60
            X.ONG r9 = r0.A0R
            java.lang.String r1 = r14.A0K
            long r1 = X.C66580MXl.A08(r1)
            X.OVd r9 = r9.A00
            X.Odx r11 = r9.A0Z
            r10 = 14
            X.GQ2 r9 = new X.GQ2
            r9.<init>(r1, r10)
            X.C71143Odx.A04(r11, r9)
        L_0x0b60:
            boolean r1 = r14.A0L()
            if (r1 == 0) goto L_0x0bab
            X.ONT r9 = r0.A0F
            com.instagram.common.session.UserSession r11 = r9.A00
            X.0Tu r10 = X.0Tu.A05
            r1 = 36310903358095737(0x81009300220179, double:3.026499723707198E-306)
            boolean r1 = X.182.A06(r10, r11, r1)
            if (r1 == 0) goto L_0x0bab
            r1 = 36310903357964663(0x81009300200177, double:3.0264997236243064E-306)
            boolean r1 = X.182.A06(r10, r11, r1)
            if (r1 == 0) goto L_0x0bab
            X.ONG r13 = r0.A0R
            java.lang.Boolean r15 = X.C69138NfJ.A01(r14, r0)
            X.0sa r1 = r0.A0V
            X.0sa r2 = r0.A0U
            boolean r2 = X.C51971G9r.A1b(r2)
            if (r2 == 0) goto L_0x0b9a
            boolean r2 = r9.A01()
            r20 = 1
            if (r2 != 0) goto L_0x0b9c
        L_0x0b9a:
            r20 = 0
        L_0x0b9c:
            r16 = 0
            r2 = 18
            X.Pm5 r17 = X.C73925Pm5.A01(r0, r2)
            r18 = r1
            r19 = r3
            r13.A01(r14, r15, r16, r17, r18, r19, r20)
        L_0x0bab:
            X.N9P r16 = X.C69138NfJ.A00(r0)
            r15 = 0
            r20 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            r17 = r15
            r18 = r15
            r19 = r15
            X.N9P r1 = X.N9P.A00(r15, (com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (com.instagram.camera.effect.models.CameraAREffect) null, (X.C69378NkI) null, r16, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r17, (java.util.List) null, r18, (java.util.List) null, r19, 0.0f, r20, false, false, false, false, false, false, false, false, false, r21, false, false, false)
            X.C69138NfJ.A0A(r0, r1)
            java.util.Set r9 = r0.A0T
            int r2 = r9.size()
            int r1 = r6.size()
            if (r2 != r1) goto L_0x0beb
            boolean r1 = r9.containsAll(r6)
            if (r1 == 0) goto L_0x0beb
            return
        L_0x0bd3:
            if (r21 != 0) goto L_0x0bab
            java.util.Map r2 = r14.A0Z
            java.lang.String r1 = "participant"
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto L_0x0bab
            X.ONG r1 = r0.A0R
            X.OVd r1 = r1.A00
            X.Odx r2 = r1.A0Z
            X.Ppi r1 = X.C74141Ppi.A00
            X.C71143Odx.A04(r2, r1)
            goto L_0x0bab
        L_0x0beb:
            r9.clear()
            r9.addAll(r6)
            com.facebook.rsys.rooms.gen.RoomModel r1 = r5.roomModel
            boolean r2 = X.AnonymousClass7TF.A1V(r1)
            boolean r1 = r0.A0C
            if (r1 != 0) goto L_0x0bfe
            if (r2 != 0) goto L_0x0bfe
            r3 = 0
        L_0x0bfe:
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r4.selfParticipant
            X.0qQ.A07(r1)
            java.util.LinkedHashMap r4 = X.AnonymousClass7TE.A1H()
            java.lang.String r2 = r1.rendererId
            if (r3 == 0) goto L_0x0c56
            X.0eE r1 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r5 = r0.A0H
            java.lang.Long r1 = X.C66581MXm.A0r(r5, r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x0c17:
            r4.put(r2, r1)
            X.17i r6 = X.17h.A00(r5)
            java.util.Iterator r9 = r8.iterator()
        L_0x0c22:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0c5b
            com.instagram.rtc.rsys.models.ParticipantModel r8 = X.C66580MXl.A0n(r9)
            java.lang.String r1 = r8.userId
            X.0qQ.A07(r1)
            java.lang.Long r1 = X.00y.A0n(r7, r1)
            if (r1 == 0) goto L_0x0c22
            long r1 = r1.longValue()
            com.instagram.user.model.User r1 = r6.A00(r1)
            if (r1 == 0) goto L_0x0c22
            if (r3 == 0) goto L_0x0c51
            java.lang.Long r1 = r1.BST()
            java.lang.String r2 = java.lang.String.valueOf(r1)
        L_0x0c4b:
            java.lang.String r1 = r8.rendererId
            r4.put(r1, r2)
            goto L_0x0c22
        L_0x0c51:
            java.lang.String r2 = r1.getId()
            goto L_0x0c4b
        L_0x0c56:
            com.instagram.common.session.UserSession r5 = r0.A0H
            java.lang.String r1 = r5.A06
            goto L_0x0c17
        L_0x0c5b:
            X.ONG r1 = r0.A0R
            if (r3 == 0) goto L_0x0c7b
            X.0eE r0 = X.AnonymousClass0t1.A01
            java.lang.Long r0 = X.C66581MXm.A0r(r5, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L_0x0c69:
            X.0qQ.A0B(r0, r12)
            X.OVd r1 = r1.A00
            X.Odx r3 = r1.A0Z
            r2 = 49
            X.PmN r1 = new X.PmN
            r1.<init>(r0, r4, r2)
            X.C71143Odx.A04(r3, r1)
            return
        L_0x0c7b:
            java.lang.String r0 = r5.A06
            goto L_0x0c69
        L_0x0c7e:
            boolean r1 = r0 instanceof X.C69119Ney
            if (r1 == 0) goto L_0x0d12
            X.Ney r0 = (X.C69119Ney) r0
            r7 = 0
            com.instagram.rtc.rsys.models.EngineModel r1 = X.OTZ.A0K(r2)
            if (r1 == 0) goto L_0x0c93
            com.instagram.rtc.rsys.models.IgCallModel r1 = r1.callModel
            if (r1 == 0) goto L_0x0c93
            java.util.Map r1 = r1.userCapabilities
            if (r1 != 0) goto L_0x0c97
        L_0x0c93:
            X.0sm r1 = X.0Yt.A0E()
        L_0x0c97:
            java.util.LinkedHashMap r2 = X.C51975G9x.A0o(r1)
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r1)
        L_0x0c9f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0d04
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r4 = r1.getValue()
            java.util.Map r4 = (java.util.Map) r4
            java.lang.String r1 = "ig_cowatch"
            java.lang.Object r1 = r4.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r8 = X.C51972G9s.A1Z(r1)
            java.lang.String r1 = "ig_cowatch_carousel"
            java.lang.Object r1 = r4.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r9 = X.C51972G9s.A1Z(r1)
            java.lang.String r1 = "media_sync"
            java.lang.Object r1 = r4.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r10 = X.C51972G9s.A1Z(r1)
            java.lang.String r1 = "multipeer_effect"
            java.lang.Object r1 = r4.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r11 = X.C51972G9s.A1Z(r1)
            java.lang.String r1 = "screen_sharing"
            java.lang.Object r1 = r4.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r12 = X.C51972G9s.A1Z(r1)
            java.lang.String r1 = "floating_self_view"
            java.lang.Object r1 = r4.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r13 = X.C51972G9s.A1Z(r1)
            X.Gmj r6 = new X.Gmj
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r2.put(r3, r6)
            goto L_0x0c9f
        L_0x0d04:
            X.OSo r1 = new X.OSo
            r1.<init>(r2)
            X.05G r0 = r0.A03
            X.0qQ.A0B(r0, r7)
            r0.FIA(r1)
            return
        L_0x0d12:
            boolean r1 = r0 instanceof X.C69118Nex
            if (r1 == 0) goto L_0x0d8f
            X.Nex r0 = (X.C69118Nex) r0
            r10 = 0
            com.instagram.rtc.rsys.models.EngineModel r1 = X.OTZ.A0K(r2)
            r11 = 0
            if (r1 == 0) goto L_0x1343
            com.facebook.rsys.photobooth.gen.PhotoboothModel r14 = r1.photoboothModel
            if (r14 == 0) goto L_0x1343
            boolean r1 = r14.isStarted
            r17 = r1
            short r13 = r14.totalCaptures
            short r1 = r14.captureIntervalMs
            long r7 = (long) r1
            long r5 = r14.actionTimeMs
            long r3 = r14.localClockOffsetMs
            long r1 = r14.delayMs
            java.lang.String r12 = r14.username
            java.lang.String r9 = r14.actorId
            int r14 = r14.actionType
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            if (r9 == 0) goto L_0x0d55
            X.0eE r15 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r14 = r0.A00
            java.lang.Long r14 = X.C66581MXm.A0r(r14, r15)
            if (r14 == 0) goto L_0x0d4d
            java.lang.String r11 = r14.toString()
        L_0x0d4d:
            boolean r11 = r9.equals(r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
        L_0x0d55:
            r15 = 2
            if (r16 == 0) goto L_0x1343
            int r14 = r16.intValue()
            if (r15 != r14) goto L_0x0d7d
            X.05G r0 = r0.A02
            X.N96 r14 = new X.N96
            r27 = r17
            r25 = r1
            r23 = r3
            r21 = r5
            r19 = r7
            r17 = r9
            r18 = r13
            r15 = r11
            r16 = r12
            r14.<init>(r15, r16, r17, r18, r19, r21, r23, r25, r27)
        L_0x0d76:
            X.0qQ.A0B(r0, r10)
            r0.FIA(r14)
            return
        L_0x0d7d:
            r1 = 1
            if (r1 != r14) goto L_0x1343
            X.05G r0 = r0.A03
            X.N9A r14 = new X.N9A
            r15 = r11
            r16 = r9
            r17 = r12
            r18 = r5
            r14.<init>(r15, r16, r17, r18)
            goto L_0x0d76
        L_0x0d8f:
            boolean r1 = r0 instanceof X.C69129NfA
            if (r1 == 0) goto L_0x0e3b
            X.NfA r0 = (X.C69129NfA) r0
            X.05G r1 = r0.A01
            java.lang.Object r4 = r1.getValue()
            X.N9N r4 = (X.N9N) r4
            java.lang.Object r3 = r2.A02
            X.N9J r3 = (X.N9J) r3
            boolean r13 = r3.A00()
            java.lang.Integer r5 = r3.A02
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            boolean r16 = X.AnonymousClass7TF.A1W(r5, r3)
            java.lang.Object r3 = r2.A00
            com.instagram.rtc.rsys.models.EngineModel r3 = (com.instagram.rtc.rsys.models.EngineModel) r3
            r5 = 1
            if (r3 == 0) goto L_0x0e39
            com.instagram.rtc.rsys.models.IgCallModel r2 = r3.callModel
            if (r2 == 0) goto L_0x0e2c
            boolean r2 = r2.isAudioOnlyCall
            if (r2 != r5) goto L_0x0e2c
        L_0x0dbc:
            r15 = 1
        L_0x0dbd:
            r7 = 0
            if (r3 == 0) goto L_0x0dc9
            com.facebook.rsys.livevideo.gen.LiveVideoModel r2 = r3.liveVideoModel
            if (r2 == 0) goto L_0x0dc9
            java.lang.Long r2 = r2.broadcastId
            if (r2 == 0) goto L_0x0dc9
            r5 = 0
        L_0x0dc9:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r5)
            boolean r14 = r4.A06
            java.lang.Long r10 = r4.A01
            java.lang.Long r11 = r4.A02
            java.lang.String r12 = r4.A03
            boolean r6 = r4.A0A
            boolean r5 = r4.A09
            boolean r2 = r4.A08
            X.N9N r8 = new X.N9N
            r18 = r5
            r19 = r2
            r17 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.FIA(r8)
            if (r3 == 0) goto L_0x0df5
            com.instagram.rtc.rsys.models.IgCallModel r2 = r3.callModel
            if (r2 == 0) goto L_0x0df5
            int r2 = r2.inCallState
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
        L_0x0df5:
            boolean r2 = r0.A00
            if (r2 != 0) goto L_0x1343
            r3 = 7
            if (r7 == 0) goto L_0x1343
            int r2 = r7.intValue()
            if (r2 != r3) goto L_0x1343
            r2 = 1
            r0.A00 = r2
            java.lang.Object r0 = r1.getValue()
            X.N9N r0 = (X.N9N) r0
            java.lang.Long r5 = X.C51968G9o.A0u()
            boolean r7 = r0.A04
            boolean r8 = r0.A06
            boolean r9 = r0.A05
            boolean r10 = r0.A07
            java.lang.Long r4 = r0.A01
            java.lang.String r6 = r0.A03
            boolean r11 = r0.A0A
            java.lang.Boolean r3 = r0.A00
            boolean r12 = r0.A09
            boolean r13 = r0.A08
            X.N9N r2 = new X.N9N
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1.FIA(r2)
            return
        L_0x0e2c:
            com.facebook.rsys.rooms.gen.RoomModel r2 = r3.roomModel
            if (r2 == 0) goto L_0x0e39
            java.lang.Boolean r2 = r2.isAudioOnly
            boolean r2 = X.AnonymousClass7TF.A1Y(r2, r5)
            if (r2 == 0) goto L_0x0e39
            goto L_0x0dbc
        L_0x0e39:
            r15 = 0
            goto L_0x0dbd
        L_0x0e3b:
            boolean r1 = r0 instanceof X.C69127Nf8
            if (r1 == 0) goto L_0x0e69
            X.Nf8 r0 = (X.C69127Nf8) r0
            java.lang.Object r1 = r2.A02
            X.N9J r1 = (X.N9J) r1
            java.lang.Integer r2 = r1.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r3 = 1
            boolean r2 = X.AnonymousClass7TF.A1W(r2, r1)
            boolean r1 = r0.A02
            if (r1 != 0) goto L_0x1343
            if (r2 == 0) goto L_0x1343
            r0.A02 = r3
            X.4Cq r4 = r0.A01
            r1 = 0
            if (r4 == 0) goto L_0x0e66
            r3 = 33
            X.MG3 r2 = new X.MG3
            r2.<init>((java.lang.Object) r0, (X.AnonymousClass4D7) r1, (int) r3)
            X.1Er r1 = X.C51966G9m.A1L(r2, r4)
        L_0x0e66:
            r0.A01 = r1
            return
        L_0x0e69:
            boolean r1 = r0 instanceof X.C69114Net
            if (r1 == 0) goto L_0x0e93
            X.Net r0 = (X.C69114Net) r0
            com.instagram.common.session.UserSession r5 = r0.A01
            X.0Tu r1 = X.0Tu.A05
            r3 = 36314850430880581(0x81042a00010b45, double:3.02899586842992E-306)
            boolean r1 = X.182.A06(r1, r5, r3)
            if (r1 == 0) goto L_0x1343
            java.lang.Object r1 = r2.A00
            com.instagram.rtc.rsys.models.EngineModel r1 = (com.instagram.rtc.rsys.models.EngineModel) r1
            if (r1 == 0) goto L_0x0e91
            com.instagram.rtc.rsys.models.IgCallModel r1 = r1.callModel
            if (r1 == 0) goto L_0x0e91
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r1.selfParticipant
            if (r1 == 0) goto L_0x0e91
            boolean r1 = r1.audioEnabled
        L_0x0e8e:
            r0.A00 = r1
            return
        L_0x0e91:
            r1 = 0
            goto L_0x0e8e
        L_0x0e93:
            boolean r1 = r0 instanceof X.C69125Nf6
            if (r1 == 0) goto L_0x1098
            X.Nf6 r0 = (X.C69125Nf6) r0
            r13 = 0
            com.instagram.rtc.rsys.models.EngineModel r2 = X.OTZ.A0K(r2)
            r4 = 0
            if (r2 == 0) goto L_0x0ef7
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L_0x0ef7
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r1.selfParticipant
        L_0x0ea7:
            r6 = 0
            if (r1 == 0) goto L_0x0ef5
            int r8 = r1.state
        L_0x0eac:
            if (r2 == 0) goto L_0x0ef0
            com.instagram.rtc.rsys.models.IgCallModel r1 = r2.callModel
            if (r1 == 0) goto L_0x0ef0
            java.util.ArrayList r3 = r1.participants
            if (r3 == 0) goto L_0x0ef0
        L_0x0eb6:
            com.facebook.rsys.rooms.gen.RoomModel r4 = r2.roomModel
        L_0x0eb8:
            r5 = 1
            if (r4 == 0) goto L_0x0ec2
            int r2 = r4.groupRoomType
            r1 = 11
            r11 = 0
            if (r2 != r1) goto L_0x0ec3
        L_0x0ec2:
            r11 = 1
        L_0x0ec3:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r3.iterator()
        L_0x0ecb:
            boolean r1 = r10.hasNext()
            r7 = 7
            if (r1 == 0) goto L_0x0ef9
            java.lang.Object r3 = r10.next()
            r2 = r3
            com.instagram.rtc.rsys.models.ParticipantModel r2 = (com.instagram.rtc.rsys.models.ParticipantModel) r2
            int r1 = r2.state
            if (r1 != r7) goto L_0x0ecb
            X.Oxw r1 = r0.A06
            java.lang.String r2 = r2.userId
            X.0qQ.A07(r2)
            android.util.LruCache r1 = r1.A00
            java.lang.Object r1 = r1.get(r2)
            if (r1 == 0) goto L_0x0ecb
            r9.add(r3)
            goto L_0x0ecb
        L_0x0ef0:
            X.0sn r3 = X.0sn.A00
            if (r2 == 0) goto L_0x0eb8
            goto L_0x0eb6
        L_0x0ef5:
            r8 = 0
            goto L_0x0eac
        L_0x0ef7:
            r1 = r4
            goto L_0x0ea7
        L_0x0ef9:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r9.iterator()
        L_0x0f01:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0f1e
            com.instagram.rtc.rsys.models.ParticipantModel r3 = X.C66580MXl.A0n(r9)
            X.Oxw r1 = r0.A06
            java.lang.String r3 = r3.userId
            X.0qQ.A07(r3)
            android.util.LruCache r1 = r1.A00
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L_0x0f01
            r2.add(r1)
            goto L_0x0f01
        L_0x0f1e:
            java.util.List r1 = r0.A00
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0f2a
            if (r8 == r7) goto L_0x0f2a
            r0.A00 = r2
        L_0x0f2a:
            if (r4 == 0) goto L_0x0fc1
            int r1 = r4.joinPermissionSetting
            if (r1 != r5) goto L_0x0fc1
        L_0x0f30:
            r1 = 1
        L_0x0f31:
            r0.A02 = r1
            java.util.List r1 = r0.A00
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0f9e
            boolean r1 = X.AnonymousClass7TE.A1b(r2)
            if (r1 == 0) goto L_0x0f9e
            if (r11 != 0) goto L_0x0f9e
            if (r4 == 0) goto L_0x0f9e
            com.facebook.rsys.callinfo.gen.UserProfile r1 = r4.owner
            com.instagram.common.session.UserSession r11 = r0.A03
            X.0qQ.A0B(r11, r5)
            if (r1 == 0) goto L_0x0fbf
            java.lang.String r10 = r1.userId
        L_0x0f50:
            com.instagram.user.model.User r9 = X.AnonymousClass7TF.A0Q(r11)
            java.lang.Long r1 = r9.BST()
            if (r1 == 0) goto L_0x0fba
            long r7 = r1.longValue()
            r3 = 0
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0fba
            java.lang.Long r1 = r9.BST()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x0f6c:
            boolean r12 = X.0qQ.A0K(r10, r1)
            X.1Av r1 = r0.A04
            X.0xa r10 = r1.A01
            java.lang.String r9 = "call_join_requests_first_joiner_message_display_count"
            int r8 = r10.getInt(r9, r13)
            X.0Tu r7 = X.0Tu.A05
            r3 = 36594942428121069(0x8202e8000107ed, double:3.2061271753247504E-306)
            int r1 = X.DbS.A04(r7, r11, r3)
            if (r12 == 0) goto L_0x0f9e
            if (r8 >= r1) goto L_0x0f9e
            boolean r1 = r0.A01
            if (r1 != 0) goto L_0x0f9e
            r3 = 36313467451344915(0x8102e800000813, double:3.028121266602753E-306)
            boolean r1 = X.182.A06(r7, r11, r3)
            if (r1 == 0) goto L_0x0f9e
            r6 = 1
            r0.A01 = r5
            X.JTS.A1S(r10, r9, r13)
        L_0x0f9e:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r2.iterator()
        L_0x0fa6:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0fc6
            java.lang.Object r3 = r4.next()
            java.util.List r1 = r0.A00
            boolean r1 = r1.contains(r3)
            X.DbV.A1U(r3, r8, r1)
            goto L_0x0fa6
        L_0x0fba:
            java.lang.String r1 = r9.getId()
            goto L_0x0f6c
        L_0x0fbf:
            r10 = 0
            goto L_0x0f50
        L_0x0fc1:
            r1 = 0
            if (r11 == 0) goto L_0x0f31
            goto L_0x0f30
        L_0x0fc6:
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r4 = r8.iterator()
        L_0x0fce:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0fe3
            java.lang.Object r3 = r4.next()
            X.JvY r3 = (X.C61034JvY) r3
            X.Jw4 r1 = new X.Jw4
            r1.<init>((X.C61034JvY) r3, (boolean) r5, (boolean) r6)
            r7.add(r1)
            goto L_0x0fce
        L_0x0fe3:
            java.util.List r1 = r0.A00
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x0fed:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0fff
            java.lang.Object r3 = r4.next()
            boolean r1 = r2.contains(r3)
            X.DbV.A1U(r3, r6, r1)
            goto L_0x0fed
        L_0x0fff:
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r4 = r6.iterator()
        L_0x1007:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x101c
            java.lang.Object r3 = r4.next()
            X.JvY r3 = (X.C61034JvY) r3
            X.Jw4 r1 = new X.Jw4
            r1.<init>((X.C61034JvY) r3)
            r5.add(r1)
            goto L_0x1007
        L_0x101c:
            java.util.ArrayList r3 = X.00k.A0S(r5, r7)
            X.0sa r1 = r0.A07
            boolean r1 = X.C51971G9r.A1b(r1)
            if (r1 != 0) goto L_0x1095
            java.util.Iterator r6 = r3.iterator()
        L_0x102c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x1095
            java.lang.Object r1 = r6.next()
            X.Jw4 r1 = (X.C61066Jw4) r1
            java.lang.Object r5 = r1.A00
            X.JvY r5 = (X.C61034JvY) r5
            boolean r3 = r1.A02
            if (r3 == 0) goto L_0x106b
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x106b
            java.lang.Integer r8 = X.AnonymousClass05K.A0H
            java.lang.String r4 = r5.A04
            java.lang.Object r1 = r5.A03
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r3 = r1.getUrl()
            boolean r1 = r0.A02
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String[] r10 = new java.lang.String[]{r4, r3, r1}
        L_0x105a:
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            long r11 = java.lang.System.currentTimeMillis()
        L_0x1060:
            X.N9C r7 = new X.N9C
            r7.<init>(r8, r9, r10, r11, r13)
            X.NfF r1 = r0.A05
            r1.A02(r7)
            goto L_0x102c
        L_0x106b:
            if (r3 == 0) goto L_0x107e
            java.lang.Integer r8 = X.AnonymousClass05K.A08
            java.lang.String r3 = r5.A04
            java.lang.Object r1 = r5.A03
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r1 = r1.getUrl()
            java.lang.String[] r10 = new java.lang.String[]{r3, r1}
            goto L_0x105a
        L_0x107e:
            java.lang.Integer r8 = X.AnonymousClass05K.A09
            java.lang.String r3 = r5.A04
            java.lang.Object r1 = r5.A03
            com.instagram.common.typedurl.ImageUrl r1 = (com.instagram.common.typedurl.ImageUrl) r1
            java.lang.String r1 = r1.getUrl()
            java.lang.String[] r10 = new java.lang.String[]{r3, r1}
            long r11 = java.lang.System.currentTimeMillis()
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            goto L_0x1060
        L_0x1095:
            r0.A00 = r2
            return
        L_0x1098:
            boolean r1 = r0 instanceof X.C69122Nf3
            if (r1 == 0) goto L_0x10f4
            X.Nf3 r0 = (X.C69122Nf3) r0
            com.instagram.rtc.rsys.models.EngineModel r1 = X.OTZ.A0K(r2)
            if (r1 == 0) goto L_0x1343
            com.instagram.rtc.rsys.models.IgCallModel r2 = r1.callModel
            if (r2 == 0) goto L_0x1343
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r2.selfParticipant
            X.0qQ.A07(r1)
            int r1 = r1.state
            r5 = 7
            if (r1 != r5) goto L_0x1343
            java.util.ArrayList r1 = r2.participants
            java.util.ArrayList r4 = X.DbV.A15(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x10bc:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x10d1
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.instagram.rtc.rsys.models.ParticipantModel r1 = (com.instagram.rtc.rsys.models.ParticipantModel) r1
            int r1 = r1.state
            if (r1 != r5) goto L_0x10bc
            r4.add(r2)
            goto L_0x10bc
        L_0x10d1:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x10d9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x10e9
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r2)
            java.lang.String r1 = r1.userId
            r3.add(r1)
            goto L_0x10d9
        L_0x10e9:
            java.util.List r1 = r0.A00
            boolean r1 = X.0qQ.A0K(r1, r3)
            if (r1 != 0) goto L_0x1343
            r0.A00 = r3
            return
        L_0x10f4:
            boolean r1 = r0 instanceof X.C69123Nf4
            if (r1 == 0) goto L_0x11f5
            X.Nf4 r0 = (X.C69123Nf4) r0
            r8 = 0
            java.lang.Object r1 = r2.A02
            X.N9J r1 = (X.N9J) r1
            boolean r1 = r1.A00()
            if (r1 == 0) goto L_0x1343
            java.lang.Integer r3 = r0.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            if (r3 != r1) goto L_0x1343
            boolean r1 = X.14i.A08()
            if (r1 != 0) goto L_0x1343
            java.lang.Object r5 = r2.A00
            com.instagram.rtc.rsys.models.EngineModel r5 = (com.instagram.rtc.rsys.models.EngineModel) r5
            r2 = 0
            if (r5 == 0) goto L_0x114f
            com.instagram.rtc.rsys.models.IgCallModel r2 = r5.callModel
            com.facebook.rsys.rooms.gen.RoomModel r1 = r5.roomModel
        L_0x111c:
            r6 = 1
            boolean r10 = X.AnonymousClass7TF.A1V(r1)
            X.0sm r1 = X.0Yt.A0E()
            java.util.LinkedHashMap r7 = X.0Yt.A03(r1)
            if (r2 == 0) goto L_0x1170
            java.util.ArrayList r1 = r2.participants
            if (r1 == 0) goto L_0x1170
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r1.iterator()
        L_0x1137:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x1151
            java.lang.Object r3 = r4.next()
            r1 = r3
            com.instagram.rtc.rsys.models.ParticipantModel r1 = (com.instagram.rtc.rsys.models.ParticipantModel) r1
            if (r10 == 0) goto L_0x114b
            int r2 = r1.state
            r1 = 7
            if (r2 != r1) goto L_0x1137
        L_0x114b:
            r9.add(r3)
            goto L_0x1137
        L_0x114f:
            r1 = r2
            goto L_0x111c
        L_0x1151:
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r9)
            java.util.Iterator r3 = r9.iterator()
        L_0x1159:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x1170
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r3)
            java.lang.String r2 = r1.userId
            boolean r1 = r1.videoEnabled
            X.JTP.A1R(r2, r7, r1)
            X.0gF r1 = X.C60340gF.A00
            r4.add(r1)
            goto L_0x1159
        L_0x1170:
            if (r5 == 0) goto L_0x117f
            com.facebook.rsys.photobooth.gen.PhotoboothModel r2 = r5.photoboothModel
            if (r2 == 0) goto L_0x117f
            com.facebook.rsys.photobooth.gen.PhotoboothModel r1 = r0.A00
            if (r1 != 0) goto L_0x117f
            r0.A02 = r7
            r0.A00 = r2
            return
        L_0x117f:
            java.util.Map r5 = r0.A02
            X.0sn r1 = X.0sn.A00
            java.util.ArrayList r4 = X.00k.A0U(r1)
            java.util.Iterator r3 = X.AnonymousClass7TF.A0s(r7)
        L_0x118b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x11b5
            java.util.Map$Entry r2 = X.AnonymousClass7TE.A1J(r3)
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = X.AnonymousClass7TF.A1Y(r1, r6)
            if (r1 != 0) goto L_0x118b
            java.lang.Object r1 = r2.getValue()
            boolean r1 = X.AnonymousClass7TE.A1a(r1)
            if (r1 == 0) goto L_0x118b
            java.lang.Object r1 = r2.getKey()
            r4.add(r1)
            goto L_0x118b
        L_0x11b5:
            java.util.Iterator r6 = r4.iterator()
        L_0x11b9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x11f2
            java.lang.Object r2 = r6.next()
            X.Oxw r1 = r0.A05
            X.0qQ.A0B(r2, r8)
            android.util.LruCache r1 = r1.A00
            java.lang.Object r5 = r1.get(r2)
            X.JvY r5 = (X.C61034JvY) r5
            if (r5 == 0) goto L_0x11b9
            X.6ap r4 = X.DbS.A0a()
            android.content.Context r1 = r0.A04
            android.content.res.Resources r3 = r1.getResources()
            r2 = 2131954534(0x7f130b66, float:1.954557E38)
            java.lang.String r1 = r5.A04
            java.lang.String r1 = X.AnonymousClass7TF.A0e(r3, r1, r2)
            r4.A0D = r1
            int r1 = r0.A03
            r4.A01 = r1
            r4.A00()
            X.Dbb.A1Q(r4)
            goto L_0x11b9
        L_0x11f2:
            r0.A02 = r7
            return
        L_0x11f5:
            boolean r1 = r0 instanceof X.Nf2
            if (r1 == 0) goto L_0x12b6
            X.Nf2 r0 = (X.Nf2) r0
            r21 = 0
            com.instagram.rtc.rsys.models.EngineModel r1 = X.OTZ.A0K(r2)
            if (r1 == 0) goto L_0x1343
            com.instagram.rtc.rsys.models.IgCallModel r1 = r1.callModel
            if (r1 == 0) goto L_0x1343
            com.facebook.rsys.audioevents.gen.AudioEventsModel r1 = r1.audioEventsModel
            if (r1 == 0) goto L_0x1343
            int r2 = r1.latestAudioEvent
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r1 == 0) goto L_0x1343
            int r10 = r1.intValue()
            r1 = 2
            r9 = 3
            r8 = 1
            if (r2 == r8) goto L_0x1220
            if (r2 == r9) goto L_0x1220
            if (r2 != r1) goto L_0x1343
        L_0x1220:
            if (r10 == r8) goto L_0x12b0
            if (r10 == r1) goto L_0x12aa
            if (r10 != r9) goto L_0x1343
            java.lang.Integer r16 = X.AnonymousClass05K.A0K
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x122a:
            X.OWA r7 = r0.A04
            X.PJn r1 = new X.PJn
            r1.<init>(r2)
            r7.A02(r1)
            long r13 = java.lang.System.currentTimeMillis()
            java.util.Map r4 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Number r1 = X.C51966G9m.A14(r3, r4)
            if (r1 == 0) goto L_0x125e
            long r1 = r1.longValue()
            long r11 = r13 - r1
            com.instagram.common.session.UserSession r6 = r0.A02
            X.0Tu r5 = X.0Tu.A05
            r1 = 36594972493154293(0x8202ef000507f5, double:3.2061461885728234E-306)
            long r5 = X.182.A01(r5, r6, r1)
            r1 = 30000(0x7530, double:1.4822E-319)
            long r5 = r5 + r1
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x129f
        L_0x125e:
            if (r10 == r8) goto L_0x12a7
            if (r10 == r9) goto L_0x12a7
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
        L_0x1264:
            X.PJn r1 = new X.PJn
            r1.<init>(r2)
            r7.A02(r1)
            X.NfF r2 = r0.A03
            android.content.Context r5 = r0.A01
            r1 = 2131953297(0x7f130691, float:1.954306E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r5, r1)
            java.lang.String r7 = new java.lang.String
            r7.<init>()
            com.instagram.common.session.UserSession r6 = r0.A02
            X.0Tu r5 = X.0Tu.A05
            r0 = 36594972493154293(0x8202ef000507f5, double:3.2061461885728234E-306)
            long r0 = X.182.A01(r5, r6, r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String[] r18 = new java.lang.String[]{r8, r7, r0}
            long r19 = java.lang.System.currentTimeMillis()
            java.lang.Integer r17 = X.AnonymousClass05K.A00
            X.N9C r15 = new X.N9C
            r15.<init>(r16, r17, r18, r19, r21)
            r2.A02(r15)
        L_0x129f:
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r4.put(r3, r0)
            return
        L_0x12a7:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x1264
        L_0x12aa:
            java.lang.Integer r16 = X.AnonymousClass05K.A0J
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            goto L_0x122a
        L_0x12b0:
            java.lang.Integer r16 = X.AnonymousClass05K.A0I
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x122a
        L_0x12b6:
            boolean r1 = r0 instanceof X.C69132NfD
            if (r1 == 0) goto L_0x1343
            X.NfD r0 = (X.C69132NfD) r0
            com.instagram.rtc.rsys.models.EngineModel r1 = X.OTZ.A0K(r2)
            r5 = 0
            if (r1 == 0) goto L_0x1338
            com.instagram.rtc.rsys.models.IgCallModel r5 = r1.callModel
            com.facebook.rsys.rooms.gen.RoomModel r4 = r1.roomModel
        L_0x12c7:
            r6 = 1
            r3 = 0
            if (r5 == 0) goto L_0x12d9
            java.util.ArrayList r2 = r5.participants
            if (r2 == 0) goto L_0x12d9
            boolean r1 = r2 instanceof java.util.Collection
            if (r1 == 0) goto L_0x1324
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x1324
        L_0x12d9:
            r1 = 0
        L_0x12da:
            r0.A00 = r1
            if (r5 == 0) goto L_0x12e7
            com.instagram.rtc.rsys.models.ParticipantModel r1 = r5.selfParticipant
            if (r1 == 0) goto L_0x12e7
            boolean r2 = r1.videoEnabled
            r1 = 1
            if (r2 == r6) goto L_0x12e8
        L_0x12e7:
            r1 = 0
        L_0x12e8:
            r0.A05 = r1
            if (r4 != 0) goto L_0x12f2
            if (r5 == 0) goto L_0x1322
            com.facebook.djinni.msys.infra.McfReference r1 = r5.dropInModel
            if (r1 == 0) goto L_0x1322
        L_0x12f2:
            r2 = 0
            if (r4 == 0) goto L_0x12fc
            if (r5 == 0) goto L_0x12fc
            boolean r1 = r5.inviteRequestedVideo
            if (r1 != 0) goto L_0x12fc
            r3 = 1
        L_0x12fc:
            boolean r1 = r0.A01
            if (r1 == r2) goto L_0x1305
            r0.A01 = r2
            X.C69132NfD.A00(r0)
        L_0x1305:
            boolean r1 = r0.A03
            if (r1 == r3) goto L_0x1343
            r0.A03 = r3
            boolean r1 = r0.A04
            if (r1 != 0) goto L_0x1343
            if (r3 == 0) goto L_0x1343
            com.facebook.rsys.audio.gen.AudioOutputRoute r2 = com.facebook.rsys.audio.gen.AudioOutputRoute.SPEAKER
            X.0qQ.A08(r2)
            X.O9S r0 = r0.A0A
            X.OVd r0 = r0.A00
            X.Odx r1 = r0.A0Z
            r0 = 10
            X.C71143Odx.A02(r1, r2, r0)
            return
        L_0x1322:
            r2 = 1
            goto L_0x12fc
        L_0x1324:
            java.util.Iterator r2 = r2.iterator()
        L_0x1328:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x12d9
            com.instagram.rtc.rsys.models.ParticipantModel r1 = X.C66580MXl.A0n(r2)
            boolean r1 = r1.videoEnabled
            if (r1 == 0) goto L_0x1328
            r1 = 1
            goto L_0x12da
        L_0x1338:
            r4 = r5
            goto L_0x12c7
        L_0x133a:
            boolean r1 = r0 instanceof X.C69130NfB
            if (r1 == 0) goto L_0x1343
        L_0x133e:
            X.NfB r0 = (X.C69130NfB) r0
            X.C69130NfB.A00(r0)
        L_0x1343:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.POS.DCG(X.N4R):void");
    }
}
