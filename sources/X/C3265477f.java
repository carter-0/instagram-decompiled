package X;

import org.webrtc.CameraVideoCapturer;

/* renamed from: X.77f  reason: invalid class name and case insensitive filesystem */
public final class C3265477f extends 1P0 {
    public 1P0 A00;
    public AnonymousClass433 A01;
    public AnonymousClass0eK A02;
    public int A03;

    public final void onFail(C268654dm r9) {
        int i;
        int A032 = AnonymousClass0fD.A03(560285391);
        0qQ.A0B(r9, 0);
        Throwable A012 = r9.A01();
        if (((A012 == null || (A012 instanceof AnonymousClass7BR)) && (!(r9 instanceof C268674do) || ((1XR) ((C268674do) r9).A00).getStatusCode() < 500)) || (i = this.A03) >= 4) {
            this.A00.onFail(r9);
        } else {
            this.A03 = i + 1;
            int A002 = this.A01.A00() * CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
            1OC r2 = (1OC) this.A02.get();
            r2.A00 = this;
            1ES.A04(r2, 805, 3, A002, true, false);
        }
        AnonymousClass0fD.A0A(1764205270, A032);
    }

    public final void onFailInBackground(C268654dm r3) {
        int A032 = AnonymousClass0fD.A03(-1540233378);
        0qQ.A0B(r3, 0);
        this.A00.onFailInBackground(r3);
        AnonymousClass0fD.A0A(-87629064, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(1807903395);
        this.A00.onFinish();
        AnonymousClass0fD.A0A(1368837776, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(138718765);
        this.A00.onStart();
        AnonymousClass0fD.A0A(-1638107670, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1421399941);
        int A033 = AnonymousClass0fD.A03(-572895912);
        0qQ.A0B(obj, 0);
        this.A00.onSuccess(obj);
        AnonymousClass0fD.A0A(771770941, A033);
        AnonymousClass0fD.A0A(-1879786206, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032 = AnonymousClass0fD.A03(-308698948);
        int A033 = AnonymousClass0fD.A03(-1543002152);
        0qQ.A0B(obj, 0);
        this.A00.onSuccessInBackground(obj);
        AnonymousClass0fD.A0A(-61503714, A033);
        AnonymousClass0fD.A0A(383399479, A032);
    }
}
