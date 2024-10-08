package X;

import android.os.SystemClock;
import android.widget.TextView;
import com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$LIVE;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;

/* renamed from: X.KAt  reason: case insensitive filesystem */
public final class C61514KAt extends C21478XcN {
    public final int A00;
    public final Object A01;

    public C61514KAt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A01() {
        long j;
        long j2;
        long j3;
        C66537MVr mVr;
        C18594Vul vul;
        boolean z;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C62423KfY kfY = (C62423KfY) this.A01;
                mVr = kfY.A0F;
                if (mVr != null) {
                    vul = new C61515KAu(2, mVr, kfY);
                    z = true;
                    C62423KfY.A01();
                    break;
                } else {
                    return;
                }
            case 2:
                C62423KfY kfY2 = (C62423KfY) this.A01;
                if (kfY2.A0O) {
                    kfY2.A0R = true;
                    return;
                } else {
                    11Z.A02(new M8B(kfY2.A0D, kfY2));
                    return;
                }
            case 3:
                C62423KfY kfY3 = (C62423KfY) this.A01;
                DLogTag$LIVE dLogTag$LIVE = DLogTag$LIVE.INSTANCE;
                DLog.d(dLogTag$LIVE, "Completed LiveSwap", new Object[0]);
                C65819M0l m0l = kfY3.A0H;
                if (m0l != null) {
                    kfY3.A0F = m0l;
                    C62423KfY.A06(m0l.A0B, kfY3);
                    m0l.EPE(kfY3.A0M);
                    kfY3.A0P = false;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (AnonymousClass7TF.A1W(kfY3.A0K, AnonymousClass05K.A0N) || kfY3.A0F == null) {
                        kfY3.A0B = null;
                        return;
                    }
                    C62423KfY.A06(BroadcastType.LIVESWAP_RTC_RSYS_INFRA, kfY3);
                    C62423KfY.A0A(kfY3, AnonymousClass05K.A0Y);
                    C18594Vul.A02(kfY3.A0B, kfY3.A0I());
                    kfY3.A0B = null;
                    C22371Y0z y0z = kfY3.A0I;
                    if (y0z != null) {
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        M0X m0x = kfY3.A0a;
                        LiveStreamSessionProbe liveStreamSessionProbe = y0z.A0H.A00;
                        if (liveStreamSessionProbe != null) {
                            j = liveStreamSessionProbe.getAudioPts();
                        } else {
                            j = 0;
                        }
                        C22230Xxl xxl = y0z.A0H;
                        LiveStreamSessionProbe liveStreamSessionProbe2 = xxl.A00;
                        if (liveStreamSessionProbe2 != null) {
                            j2 = liveStreamSessionProbe2.getVideoPts();
                        } else {
                            j2 = 0;
                        }
                        LiveStreamSessionProbe liveStreamSessionProbe3 = xxl.A00;
                        if (liveStreamSessionProbe3 != null) {
                            j3 = liveStreamSessionProbe3.getAudioPtsStreamTime();
                        } else {
                            j3 = 0;
                        }
                        long j4 = elapsedRealtime2 - kfY3.A04;
                        0Aj A0d = C51969G9p.A0d(m0x.A0N, "ig_broadcast_waterfall");
                        DbS.A1H(A0d, "broadcast_liveswap");
                        JTS.A18(A0d, m0x.A0Q);
                        C51969G9p.A1A(A0d, m0x.A0O);
                        M0X.A05(A0d, m0x, (float) m0x.A02);
                        C51965G9l.A1I(A0d, m0x.A0A);
                        Double valueOf = Double.valueOf(0.0d);
                        A0d.A8D("audio_buffer_duration_seconds", valueOf);
                        A0d.A8D("video_buffer_duration_seconds", valueOf);
                        A0d.A8D("last_audio_pts", Double.valueOf((double) (((float) j) / 1000.0f)));
                        A0d.A8D("last_video_pts", Double.valueOf((double) (((float) j2) / 1000.0f)));
                        A0d.A8D("last_audio_pts_streamtime", Double.valueOf((double) (((float) j3) / 1000.0f)));
                        A0d.A8D("call_started_to_socket_writability_latency_seconds", Double.valueOf((double) (((float) j4) / 1000.0f)));
                        A0d.A8D("call_joined_to_socket_writability_latency_seconds", Double.valueOf((double) (((float) (elapsedRealtime2 - elapsedRealtime)) / 1000.0f)));
                        A0d.Cgf();
                        C62423KfY.A01();
                        y0z.ECT((C18594Vul) null, false);
                        kfY3.A05 = y0z.C8j();
                        kfY3.A0I = null;
                    }
                    DLog.d(dLogTag$LIVE, "Complete LiveSwap", new Object[0]);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            case 4:
                try {
                    C62423KfY kfY4 = (C62423KfY) this.A01;
                    C65819M0l A002 = C62423KfY.A00(kfY4);
                    C61514KAt kAt = new C61514KAt(kfY4, 3);
                    C62423KfY.A01();
                    A002.CMe(kAt);
                    kfY4.A04 = SystemClock.elapsedRealtime();
                    return;
                } catch (Exception e) {
                    C62423KfY kfY5 = (C62423KfY) this.A01;
                    C64139LPo.A02(kfY5, e);
                    C62423KfY.A09(kfY5, e, "2p session creation failed");
                    return;
                }
            case 5:
                C62422KfX kfX = (C62422KfX) this.A01;
                mVr = kfX.A07;
                if (mVr != null) {
                    vul = new C61517KAw(kfX, 6);
                    z = true;
                    break;
                } else {
                    return;
                }
            default:
                C62422KfX.A02((C62422KfX) this.A01);
                return;
        }
        mVr.ECT(vul, z);
    }

    public final void A02(Exception exc) {
        C62423KfY kfY;
        String str;
        switch (this.A00) {
            case 0:
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                TextView textView = ((C14899UEd) this.A01).A04;
                textView.setClickable(true);
                textView.setAlpha(1.0f);
                return;
            case 2:
                C62423KfY kfY2 = (C62423KfY) this.A01;
                C64139LPo.A02(kfY2, exc);
                if (exc instanceof C62683Kkj) {
                    C62683Kkj kkj = (C62683Kkj) exc;
                    LPE.A0B(kkj.A00, kfY2, kkj.A01, exc.getMessage(), exc);
                    return;
                }
                BroadcastFailureType broadcastFailureType = BroadcastFailureType.InitFailure;
                0qQ.A0B("ApiInitBroadcast", 1);
                LPE.A0B(broadcastFailureType, kfY2, "ApiInitBroadcast", (String) null, exc);
                return;
            case 3:
                kfY = (C62423KfY) this.A01;
                C64139LPo.A02(kfY, exc);
                str = "2p session init failed";
                break;
            case 4:
                kfY = (C62423KfY) this.A01;
                C64139LPo.A02(kfY, exc);
                str = "Stopping 1p session failed";
                break;
            case 6:
                C62422KfX kfX = (C62422KfX) this.A01;
                BroadcastFailureType broadcastFailureType2 = BroadcastFailureType.InitFailure;
                String message = exc.getMessage();
                if (message == null) {
                    message = "null_message";
                }
                C62422KfX.A01(broadcastFailureType2, kfX, "initLiveStreamingSession", message);
                if (kfX.A0G) {
                    LRP lrp = kfX.A0J;
                    String obj = exc.toString();
                    String message2 = exc.getMessage();
                    0qQ.A0B(obj, 0);
                    0xF r3 = new 0xF();
                    0xF.A00(r3, obj, "info");
                    0xF.A00(r3, message2, "errorMessage");
                    0xF.A00(r3, "GUEST_JOIN_FAILED", "eventName");
                    0xF.A00(r3, lrp.A02.A06, "multiPartyLiveUserID");
                    0xF.A00(r3, "ANDROID_BROADCASTER", "source");
                    LRP.A00(r3, lrp, "GUEST_JOIN_FAILED", "ERROR", "BROADCASTER");
                    return;
                }
                return;
            default:
                super.A02(exc);
                return;
        }
        C62423KfY.A09(kfY, exc, str);
    }
}
