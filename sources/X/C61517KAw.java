package X;

import android.graphics.Bitmap;
import android.util.Pair;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.video.common.camera.IgLiveCameraCapturer$CameraCloseRequestedException;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;
import com.instagram.video.live.streaming.common.BroadcastFailureType;

/* renamed from: X.KAw  reason: case insensitive filesystem */
public final class C61517KAw extends C18594Vul {
    public final int A00;
    public final Object A01;

    public static Object A00(C61517KAw kAw, Object obj) {
        0qQ.A0B(obj, 0);
        return kAw.A01;
    }

    public C61517KAw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A03(Exception exc) {
        Exception exc2 = exc;
        switch (this.A00) {
            case 0:
                IgLiveWithGuestFragment igLiveWithGuestFragment = (IgLiveWithGuestFragment) A00(this, exc2);
                String str = "liveWithGuestWaterfall";
                M0W m0w = igLiveWithGuestFragment.A05;
                if (m0w != null) {
                    C340307l3 r0 = igLiveWithGuestFragment.A00;
                    if (r0 == null) {
                        str = "cameraDeviceController";
                    } else {
                        m0w.A02 = JTP.A0j(r0.CPy() ? 1 : 0);
                        return;
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 2:
                C62423KfY kfY = ((C65816M0i) A00(this, exc2)).A0X;
                0qQ.A0B("switchCamera", 1);
                K0L k0l = new K0L("switchCamera", (String) null, exc2);
                M0X m0x = kfY.A0a;
                int i = k0l.errorCode;
                String str2 = k0l.domain;
                if (str2 == null) {
                    str2 = "";
                }
                m0x.A0C(i, str2, k0l.reason, k0l.description, k0l.fullDescription);
                return;
            case 3:
                C62423KfY kfY2 = (C62423KfY) A00(this, exc2);
                C64139LPo.A02(kfY2, exc2);
                C62423KfY.A08(kfY2);
                return;
            case 4:
                0qQ.A0B(exc2, 0);
                C62423KfY kfY3 = (C62423KfY) this.A01;
                String A06 = 0mp.A06(002.A0L("Exception in openCamera(paused=", ')', kfY3.A0O), new Object[0]);
                C64139LPo.A02(kfY3, exc2);
                M0X m0x2 = kfY3.A0a;
                m0x2.A0I("open camera error", exc2);
                if (exc2 instanceof IgLiveCameraCapturer$CameraCloseRequestedException) {
                    String A0l = JTS.A0l(exc2);
                    0qQ.A07(A0l);
                    LiveStreamingError liveStreamingError = new LiveStreamingError("openCamera", A0l, exc2, C9588RdS.A00(exc2), false);
                    int i2 = liveStreamingError.errorCode;
                    String str3 = liveStreamingError.domain;
                    if (str3 == null) {
                        str3 = "";
                    }
                    m0x2.A0D(i2, str3, liveStreamingError.reason, liveStreamingError.description, liveStreamingError.fullDescription);
                    return;
                }
                LPE.A0B(BroadcastFailureType.CameraFailure, kfY3, "openCamera", A06, exc2);
                return;
            case 5:
                C64139LPo.A02((C62423KfY) A00(this, exc2), exc2);
                return;
            case 6:
                ((C62422KfX) A00(this, exc2)).A0K.A0B("endBroadcastSession", "mCurrentStreamingSession.release failed", exc2.toString(), true);
                return;
            case 7:
                0qQ.A0B(exc2, 0);
                C62422KfX kfX = (C62422KfX) this.A01;
                String A062 = 0mp.A06(002.A0L("Exception in openCamera(paused=", ')', kfX.A0F), new Object[0]);
                0wb.A06("IgLiveWithGuestStreamingController", A062, exc2);
                M0W m0w2 = kfX.A0K;
                m0w2.A0C("open camera error", exc2);
                if (exc2 instanceof IgLiveCameraCapturer$CameraCloseRequestedException) {
                    m0w2.A0B("openCamera", A062, exc2.getMessage(), false);
                    return;
                } else {
                    C62422KfX.A01(BroadcastFailureType.CameraFailure, kfX, "openCamera", A062);
                    return;
                }
            case 8:
                C62422KfX kfX2 = (C62422KfX) A00(this, exc2);
                BroadcastFailureType broadcastFailureType = BroadcastFailureType.InitFailure;
                String message = exc2.getMessage();
                if (message == null) {
                    message = "null_message";
                }
                C62422KfX.A01(broadcastFailureType, kfX2, "ApiStartBroadcast", message);
                return;
            default:
                super.A03(exc2);
                return;
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj) {
        switch (this.A00) {
            case 0:
                L9N l9n = (L9N) obj;
                IgLiveWithGuestFragment igLiveWithGuestFragment = (IgLiveWithGuestFragment) A00(this, l9n);
                String str = "liveWithGuestWaterfall";
                M0W m0w = igLiveWithGuestFragment.A05;
                if (m0w != null) {
                    m0w.A08(JTP.A0j(l9n.A04 ? 1 : 0));
                    M0W m0w2 = igLiveWithGuestFragment.A05;
                    if (m0w2 != null) {
                        C340307l3 r0 = igLiveWithGuestFragment.A00;
                        if (r0 == null) {
                            str = "cameraDeviceController";
                        } else {
                            m0w2.A02 = JTP.A0j(r0.CPy() ? 1 : 0);
                            return;
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            case 1:
                2YL r2 = (2YL) A00(this, obj);
                C66169MGg.A01(obj, r2, C318116oQ.A00(r2), 42);
                return;
            case 2:
                L9N l9n2 = (L9N) obj;
                C62423KfY kfY = ((C65816M0i) A00(this, l9n2)).A0X;
                boolean z = l9n2.A04;
                M0X m0x = kfY.A0a;
                m0x.A07 = JTP.A0j(z ? 1 : 0);
                1Au.A00(kfY.A07).A1c(z);
                Integer A0j = JTP.A0j(z);
                m0x.A0f.incrementAndGet();
                LKD.A01(M0X.A02(m0x, AnonymousClass05K.A0L), A0j);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("{'width': ");
                A1A.append(l9n2.A01);
                A1A.append(", 'height': ");
                A1A.append(l9n2.A00);
                A1A.append(", 'front':'");
                A1A.append(z);
                m0x.A0H("switchCamera", AnonymousClass7TF.A0l("'}", A1A));
                C62423KfY.A05(l9n2, kfY);
                return;
            case 3:
                Bitmap bitmap = (Bitmap) obj;
                C62423KfY kfY2 = (C62423KfY) A00(this, bitmap);
                kfY2.A06 = bitmap;
                C62423KfY.A08(kfY2);
                return;
            case 4:
                L9N l9n3 = (L9N) obj;
                C62423KfY kfY3 = (C62423KfY) A00(this, l9n3);
                M0X m0x2 = kfY3.A0a;
                m0x2.A0F("open camera");
                C62423KfY.A05(l9n3, kfY3);
                m0x2.A07 = JTP.A0j(l9n3.A04 ? 1 : 0);
                return;
            case 5:
                Bitmap bitmap2 = (Bitmap) obj;
                ((C62423KfY) A00(this, bitmap2)).A07 = bitmap2;
                return;
            case 6:
                11Z.A02(new M5L((C62422KfX) this.A01));
                return;
            case 7:
                L9N l9n4 = (L9N) obj;
                0qQ.A0B(l9n4, 0);
                int i = l9n4.A01;
                int i2 = l9n4.A00;
                C62422KfX kfX = (C62422KfX) this.A01;
                M0W m0w3 = kfX.A0K;
                m0w3.A0A("open camera", "");
                W1D w1d = kfX.A09;
                w1d.A09.obtainMessage(2, l9n4.A03, l9n4.A02, (Object) null).sendToTarget();
                ((C17992VjU) C63486Kxq.A00(kfX.A07, C313666go.GUEST).A07.getValue()).A01(new Pair(Integer.valueOf(i), Integer.valueOf(i2)), (Pair) null, (Integer) null);
                m0w3.A02 = JTP.A0j(l9n4.A04 ? 1 : 0);
                return;
            default:
                return;
        }
    }
}
