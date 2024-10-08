package X;

import com.facebook.videolite.instagram.VideoIngestionStep;

/* renamed from: X.Q4n  reason: case insensitive filesystem */
public final class C7337Q4n implements C13821Thq {
    public final AnonymousClass3Q2 A00;
    public final /* synthetic */ VideoIngestionStep A01;

    public final void DaE(float f) {
    }

    public final void onStart() {
    }

    public C7337Q4n(VideoIngestionStep videoIngestionStep, AnonymousClass3Q2 r2) {
        this.A01 = videoIngestionStep;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void D0h(Object obj) {
        Exception exc = (Exception) obj;
        0qQ.A0B(exc, 0);
        VideoIngestionStep videoIngestionStep = this.A01;
        synchronized (videoIngestionStep) {
            videoIngestionStep.A00 = exc;
        }
    }

    public final /* bridge */ /* synthetic */ void DEb(Object obj) {
        Exception exc = (Exception) obj;
        0qQ.A0B(exc, 0);
        VideoIngestionStep videoIngestionStep = this.A01;
        synchronized (videoIngestionStep) {
            videoIngestionStep.A00 = exc;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C10940S1w s1w = (C10940S1w) obj;
        0qQ.A0B(s1w, 0);
        AnonymousClass3Q2 r3 = this.A00;
        r3.A1T.A04 = AnonymousClass7TG.A0I();
        if (s1w.A00 == REA.NON_SEGMENTED_TRANSCODE) {
            String str = ((C11286SJe) AnonymousClass7TF.A0v(s1w.A01.A02).next()).A05;
            r3.A3v = str;
            if (r3.A6C) {
                r3.A2I = DbV.A0q(str);
            }
            r3.A0P();
        }
    }
}
