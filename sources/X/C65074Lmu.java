package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioRecord;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lmu  reason: case insensitive filesystem */
public final class C65074Lmu implements MXK, C353058Gc, 1DN {
    public M1Y A00;
    public ShutterButton A01;
    public AnonymousClass8JB A02;
    public M1Y A03;
    public final Activity A04;
    public final Context A05;
    public final UserSession A06;
    public final C64144LQg A07;
    public final ClipsCreationViewModel A08;
    public final AnonymousClass861 A09;
    public final C62320sa A0A;
    public final AnonymousClass8RF A0B;
    public final 2Nn A0C;

    public C65074Lmu(Activity activity, Context context, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RF r10, AnonymousClass861 r11, String str, C62320sa r13) {
        0qQ.A0B(userSession, 3);
        this.A04 = activity;
        this.A05 = context;
        this.A06 = userSession;
        this.A09 = r11;
        this.A08 = clipsCreationViewModel;
        this.A0B = r10;
        this.A0A = r13;
        2Nn A002 = 2Nm.A00(context, userSession);
        this.A0C = A002;
        this.A07 = new C64144LQg(this, new C63743L5b(A002, str), (long) JTR.A0H(r13));
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final void AQD(float f) {
    }

    public final boolean CNh() {
        return false;
    }

    public final boolean CQZ() {
        return true;
    }

    public final boolean CQa() {
        return true;
    }

    public final void D0b(String str, String str2) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final void DG2(float f, float f2) {
    }

    public final void Dy5(float f) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onResume() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static final void A00(C65074Lmu lmu, Integer num) {
        M1Y m1y;
        String str;
        String str2;
        lmu.A04.getWindow().clearFlags(128);
        AnonymousClass8JB r0 = lmu.A02;
        if (r0 != null) {
            r0.A02.removeCallbacksAndMessages((Object) null);
        }
        if (lmu.A07.A05) {
            ShutterButton shutterButton = lmu.A01;
            if (shutterButton != null) {
                switch (num.intValue()) {
                    case 0:
                        str2 = "stacked_timeline_voiceover_audio_recorder_error";
                        break;
                    case 1:
                        str2 = "stacked_timeline_voiceover_video_pause";
                        break;
                    case 2:
                        str2 = "stacked_timeline_voiceover_bottomsheet_cancel";
                        break;
                    case 3:
                        str2 = "stacked_timeline_voiceover_bottomsheet_confirm";
                        break;
                    case 4:
                        str2 = "stacked_timeline_voiceover_bottomsheet_dismissed";
                        break;
                    case 5:
                        str2 = "stacked_timeline_voiceover_max_duration";
                        break;
                    default:
                        str2 = "stacked_timeline_voiceover_fragment_on_pause";
                        break;
                }
                shutterButton.DnW(str2);
            }
        } else if (num == AnonymousClass05K.A00) {
            lmu.A09.A01();
            A01(lmu, false);
        } else if (num == AnonymousClass05K.A0C && (m1y = lmu.A03) != null && (str = m1y.A06) != null) {
            lmu.A08.A0h(str);
        }
    }

    public static final void A01(C65074Lmu lmu, boolean z) {
        M1Y m1y;
        String str;
        C64144LQg lQg = lmu.A07;
        if (!lQg.A05 && (m1y = lmu.A00) != null) {
            AnonymousClass8RF r2 = lmu.A0B;
            if (0qQ.A0K(r2.A0E(), KM8.A00)) {
                r2.A0G(KM7.A00);
            }
            ClipsCreationViewModel clipsCreationViewModel = lmu.A08;
            ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
            clipsAudioStore.A0N.Epw((Object) null);
            if (z && m1y.A00 > m1y.A01) {
                M1Y A002 = m1y.A00();
                0qQ.A0C(A002, AnonymousClass000.A00(1630));
                L6K l6k = lQg.A04;
                if (l6k != null) {
                    str = l6k.A01;
                } else {
                    str = null;
                }
                A002.A06 = str;
                A002.A08 = false;
                clipsCreationViewModel.A0Q.A01(C359548d5.VOICEOVER_ADD);
                List list = clipsAudioStore.A0C;
                list.add(A002);
                clipsAudioStore.A0S.Epw(C59798JYr.A00(list, ClipsAudioStore.A00(clipsAudioStore)));
                27r A012 = 27p.A01(lmu.A06);
                0Aj A0e = AnonymousClass7TE.A0e(A012.A01, "ig_camera_clips_voiceover_segment_capture");
                if (A0e.isSampled()) {
                    JTQ.A12(A0e, A012);
                    AnonymousClass283 r22 = A012.A04;
                    JTP.A1I(A0e, r22);
                    AnonymousClass7TE.A1W(A0e, "camera_position", JTR.A0C(r22));
                    JTS.A14(r22.A09, A0e);
                    JTO.A1P(28t.A06, A0e);
                    DbW.A15(A0e, 27x.A09);
                    JTP.A1F(A0e);
                    A0e.AAJ("discovery_session_id", r22.A0O);
                    AnonymousClass7TH.A0V(A0e);
                }
            }
            lmu.A03 = lmu.A00;
            lmu.A00 = null;
            AnonymousClass861 r1 = lmu.A09;
            JTP.A1B(r1.A05, false);
            JTP.A1B(r1.A08, true);
            ShutterButton shutterButton = lmu.A01;
            if (shutterButton != null) {
                shutterButton.setInnerCircleAlpha(1.0f);
            }
            ShutterButton shutterButton2 = lmu.A01;
            if (shutterButton2 != null) {
                C301725zr r12 = shutterButton2.A0h;
                r12.A0B.clear();
                r12.A04 = 0;
                r12.A03 = 0;
                shutterButton2.invalidate();
            }
            ShutterButton shutterButton3 = lmu.A01;
            if (shutterButton3 != null) {
                shutterButton3.A0h.A03 = 0;
                shutterButton3.invalidate();
            }
            ShutterButton shutterButton4 = lmu.A01;
            if (shutterButton4 != null) {
                shutterButton4.setEnabled(true);
            }
            ShutterButton shutterButton5 = lmu.A01;
            if (shutterButton5 != null) {
                shutterButton5.setHandsFreeRecordingEnabled(true);
            }
            AnonymousClass8JB r3 = lmu.A02;
            if (r3 != null) {
                r3.A02.removeCallbacksAndMessages((Object) null);
                r3.A01 = 3;
                r3.A00 = IgNetworkConsentStorage.MAX_ENTRIES;
            }
        }
    }

    public final void A02(Exception exc) {
        A00(this, AnonymousClass05K.A00);
        C59689JTv.A0B(this.A05, "clips_stacked_timeline_voiceover_error");
        AnonymousClass7TG.A1I(0wj.A01, "Stacked Timeline Voiceover Failure", exc, 613297770);
    }

    public final void AJD() {
        A00(this, AnonymousClass05K.A0N);
    }

    public final int B8T() {
        return DbS.A03(this.A05.getResources(), R.dimen.avatar_sticker_max_height);
    }

    public final List Bdz() {
        return AnonymousClass7TE.A1I(C62578KiB.PEEK);
    }

    public final void Cyv() {
        A00(this, AnonymousClass05K.A0Y);
        this.A03 = null;
    }

    public final void DWm(Map map) {
        if (map == null || !map.containsKey("android.permission.RECORD_AUDIO") || map.get("android.permission.RECORD_AUDIO") == C346927vz.DENIED_DONT_ASK_AGAIN) {
            A02(AnonymousClass7TE.A0z("Could not get record audio permission"));
        }
    }

    public final void Dfp() {
        this.A09.A01();
    }

    public final void Dke() {
        ShutterButton shutterButton = this.A01;
        if (shutterButton != null) {
            shutterButton.setHandsFreeRecordingEnabled(false);
        }
    }

    public final void Dmi(String str) {
        ShutterButton shutterButton;
        IllegalStateException illegalStateException;
        AnonymousClass863 A0Z = JTP.A0Z(this.A09);
        if (A0Z != null) {
            int CEG = A0Z.CEG();
            int A0H = JTR.A0H(this.A0A) - CEG;
            M1Y m1y = new M1Y();
            m1y.A01 = CEG;
            m1y.A00 = CEG;
            m1y.A06 = null;
            m1y.A05 = 0;
            m1y.A03 = CEG;
            m1y.A02 = CEG;
            this.A00 = m1y;
            ShutterButton shutterButton2 = this.A01;
            if (shutterButton2 != null) {
                shutterButton2.A08 = (long) A0H;
                C301725zr r0 = shutterButton2.A0h;
                if (r0 != null) {
                    r0.A01 = A0H;
                }
            }
            C64144LQg lQg = this.A07;
            lQg.A01 = (long) A0H;
            try {
                if (!lQg.A05) {
                    lQg.A06 = false;
                    lQg.A04 = new L6K(lQg.A08);
                    try {
                        int minBufferSize = AudioRecord.getMinBufferSize(44100, 16, 2);
                        lQg.A00 = minBufferSize;
                        if (minBufferSize != -2) {
                            AudioRecord audioRecord = new AudioRecord(1, 44100, 16, 2, minBufferSize);
                            lQg.A02 = audioRecord;
                            if (audioRecord.getState() == 0) {
                                illegalStateException = AnonymousClass7TE.A0z(AnonymousClass000.A00(2185));
                            } else {
                                AudioRecord audioRecord2 = lQg.A02;
                                if (audioRecord2 != null) {
                                    audioRecord2.startRecording();
                                }
                                lQg.A05 = true;
                                CountDownTimer countDownTimer = lQg.A03;
                                if (countDownTimer != null) {
                                    countDownTimer.cancel();
                                }
                                long j = lQg.A01;
                                C52810Gd2 gd2 = new C52810Gd2(lQg, j, j);
                                lQg.A03 = gd2;
                                gd2.start();
                                0nY.A00().ATE(new KIU(lQg));
                            }
                        } else {
                            illegalStateException = AnonymousClass7TE.A0z("Could not get min buffer size in audio recording");
                        }
                        throw illegalStateException;
                    } catch (IllegalArgumentException | IllegalStateException e) {
                        lQg.A07.A02(e);
                    }
                }
            } catch (IllegalStateException e2) {
                lQg.A07.A02(e2);
            }
            if (lQg.A05 && (shutterButton = this.A01) != null) {
                shutterButton.A03(AnonymousClass05K.A00);
            }
        }
    }

    public final void Dmk(boolean z) {
        int i;
        M1Y m1y = this.A00;
        if (m1y != null) {
            this.A0B.A0G(KM8.A00);
            L6K l6k = this.A07.A04;
            if (l6k != null) {
                String str = l6k.A01;
                m1y.A06 = str;
                File A0t = AnonymousClass7TE.A0t(str);
                File parentFile = A0t.getParentFile();
                if (parentFile == null || !parentFile.isDirectory()) {
                    i = -1;
                } else {
                    i = parentFile.listFiles().length + (A0t.exists() ^ true ? 1 : 0);
                }
                m1y.A04 = i;
                m1y.A08 = true;
            }
            AnonymousClass861 r2 = this.A09;
            JTP.A1B(r2.A05, true);
            r2.A03();
            JTP.A1B(r2.A08, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r7.equals("stacked_timeline_voiceover_audio_recorder_error") != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DnV(int r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = "stacked_timeline_voiceover_bottomsheet_cancel"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "stacked_timeline_voiceover_fragment_on_pause"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "stacked_timeline_voiceover_audio_recorder_error"
            boolean r0 = r7.equals(r0)
            r4 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r4 = 1
        L_0x001a:
            X.LQg r2 = r5.A07
            r2.A06 = r4     // Catch:{ IllegalStateException -> 0x003a }
            r0 = 0
            r2.A05 = r0     // Catch:{ IllegalStateException -> 0x003a }
            android.media.AudioRecord r0 = r2.A02     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x0028
            r0.stop()     // Catch:{ IllegalStateException -> 0x003a }
        L_0x0028:
            android.media.AudioRecord r0 = r2.A02     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x002f
            r0.release()     // Catch:{ IllegalStateException -> 0x003a }
        L_0x002f:
            r0 = 0
            r2.A02 = r0     // Catch:{ IllegalStateException -> 0x003a }
            android.os.CountDownTimer r0 = r2.A03     // Catch:{ IllegalStateException -> 0x003a }
            if (r0 == 0) goto L_0x0040
            r0.cancel()     // Catch:{ IllegalStateException -> 0x003a }
            goto L_0x0040
        L_0x003a:
            r1 = move-exception
            X.Lmu r0 = r2.A07
            r0.A02(r1)
        L_0x0040:
            r3 = 0
            if (r4 == 0) goto L_0x004c
            X.861 r0 = r5.A09
            r0.A01()
            A01(r5, r3)
        L_0x004b:
            return
        L_0x004c:
            X.M1Y r2 = r5.A00
            if (r2 == 0) goto L_0x004b
            X.861 r1 = r5.A09
            r1.A01()
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r5.A01
            if (r0 == 0) goto L_0x005c
            r0.setEnabled(r3)
        L_0x005c:
            X.863 r0 = X.JTP.A0Z(r1)
            if (r0 == 0) goto L_0x0077
            int r6 = r0.CEG()
        L_0x0066:
            X.0sa r0 = r5.A0A
            int r0 = X.JTR.A0H(r0)
            if (r6 <= r0) goto L_0x006f
            r6 = r0
        L_0x006f:
            r2.A00 = r6
            r2.A02 = r6
            r1.A06(r6)
            return
        L_0x0077:
            int r0 = r2.A01
            int r6 = r6 + r0
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65074Lmu.DnV(int, java.lang.String):void");
    }

    public final void cancel() {
        A00(this, AnonymousClass05K.A0C);
    }

    public final void onPause() {
        A00(this, AnonymousClass05K.A0u);
    }

    public final void CN3(ViewGroup viewGroup) {
        viewGroup.removeAllViews();
        this.A03 = null;
        this.A00 = null;
        Context context = this.A05;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_stacked_timeline_bottom_sheet_voiceover, viewGroup, true);
        0qQ.A0C(inflate, C273654mx.A00(1));
        this.A01 = (ShutterButton) inflate.findViewById(R.id.stacked_timeline_voiceover_shutter_button);
        this.A02 = new AnonymousClass8JB(new C65802Lzu(this), new C65803Lzv(this), 3, IgNetworkConsentStorage.MAX_ENTRIES);
        ShutterButton shutterButton = this.A01;
        if (shutterButton != null) {
            shutterButton.setShutterButtonRecordingStyle(new AnonymousClass9QM(context, 1.0f));
        }
        ShutterButton shutterButton2 = this.A01;
        if (shutterButton2 != null) {
            shutterButton2.setHandsFreeRecordingEnabled(true);
            shutterButton2.setEnabled(true);
        }
        ShutterButton shutterButton3 = this.A01;
        if (shutterButton3 != null) {
            shutterButton3.setOnRecordVideoListener(this);
            shutterButton3.setOnSingleTapCaptureListener(new C65801Lzt(this, 1));
        }
        0nA.A0V(viewGroup, -2);
        0nA.A0V(C3019160o.A01(viewGroup), -2);
    }
}
