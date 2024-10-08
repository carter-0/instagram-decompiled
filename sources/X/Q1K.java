package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class Q1K {
    public C266774aK A00;
    public Iterator A01;
    public C266714aE A02;
    public C266794aM A03;
    public final MediaComposition A04;
    public final boolean A05;

    public final float A00(TimeUnit timeUnit, long j) {
        C266774aK r0;
        boolean z = false;
        if (this.A02 != null) {
            z = true;
        }
        C266784aL.A06(z, "No track is selected");
        while (true) {
            C266774aK r02 = this.A00;
            if (r02 == null || j < r02.A01.A03(timeUnit)) {
                return 1.0f;
            }
            if (this.A00.A01.A06(timeUnit, j, this.A05)) {
                return this.A00.A00;
            }
            Iterator it = this.A01;
            if (it == null || !it.hasNext()) {
                r0 = null;
            } else {
                r0 = (C266774aK) this.A01.next();
            }
            this.A00 = r0;
        }
        return 1.0f;
    }

    public final void A01(C266714aE r2, int i) {
        this.A02 = r2;
        C266794aM A042 = this.A04.A04(r2, i);
        this.A03 = A042;
        if (A042 != null) {
            Iterator A16 = Pxg.A16(A042.A07);
            this.A01 = A16;
            if (A16.hasNext()) {
                this.A00 = (C266774aK) this.A01.next();
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0w("Requested Track is not available");
    }

    public Q1K(MediaComposition mediaComposition, boolean z) {
        this.A04 = mediaComposition;
        this.A05 = z;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TimelineSpeedProvider{mMediaComposition=");
        A1A.append(this.A04);
        A1A.append(", mTimelineSpeedIterator=");
        A1A.append(this.A01);
        A1A.append(", mCurrentTimelineSpeed=");
        A1A.append(this.A00);
        A1A.append(", mMediaTrackComposition=");
        A1A.append(this.A03);
        A1A.append(", mSelectedTrackType=");
        return Pxg.A0p(this.A02, A1A);
    }
}
