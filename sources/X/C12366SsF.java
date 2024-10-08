package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.List;

/* renamed from: X.SsF  reason: case insensitive filesystem */
public final class C12366SsF implements C13854TiZ {
    public final /* synthetic */ C12372SsL A00;

    public final void E41(MediaFormat mediaFormat, C7334Q4k q4k, List list, int i, boolean z) {
        Q17 A05;
        List list2 = list;
        boolean isEmpty = list.isEmpty();
        C12372SsL ssL = this.A00;
        MediaFormat mediaFormat2 = mediaFormat;
        C7334Q4k q4k2 = q4k;
        if (isEmpty) {
            A05 = C7257Q1f.A01(mediaFormat, ssL.A07.A04, q4k, mediaFormat.getString("mime"));
        } else {
            A05 = ssL.A0A.A05(mediaFormat2, ssL.A07.A04, q4k2, list2, false);
        }
        ssL.A05 = A05;
        A05.A02();
    }

    public final void FJk(int i, Bitmap bitmap) {
    }

    public final void flush() {
    }

    public C12366SsF(C12372SsL ssL) {
        this.A00 = ssL;
    }

    public final long ANv(long j) {
        C12372SsL ssL = this.A00;
        Q1A q1a = ssL.A04;
        long j2 = -1;
        if (q1a != null && q1a.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = q1a.A00;
            long j3 = bufferInfo.presentationTimeUs;
            ssL.A05.A04(q1a, Pxf.A1R((j3 > 0 ? 1 : (j3 == 0 ? 0 : -1))));
            if ((bufferInfo.flags & 4) != 0) {
                ssL.A09 = true;
            } else {
                if (bufferInfo.presentationTimeUs >= 0) {
                    C10849Rz9 rz9 = ssL.A07;
                    rz9.A01++;
                    Q1W q1w = rz9.A0A;
                    q1w.getClass();
                    q1w.A00();
                }
                j2 = j3;
            }
            ssL.A04 = null;
        }
        Q1A A01 = ssL.A05.A01(j);
        if (A01 != null && A01.A02 >= 0) {
            ssL.A04 = A01;
            ssL.A00 = A01.A00.presentationTimeUs;
        }
        return j2;
    }

    public final Q1A AOi(long j) {
        return this.A00.A05.A00(j);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Q1b, java.lang.Object] */
    public final void AVT() {
        ? obj = new Object();
        new C7948Qdp((C7254Q1b) obj, this.A00.A05).A00();
        obj.A01();
    }

    public final long Avc() {
        return this.A00.A00;
    }

    public final String Avd() {
        return this.A00.A05.A01;
    }

    public final String Avf() {
        try {
            return this.A00.A05.A05.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final boolean CdV() {
        return this.A00.A09;
    }

    public final void E5w(Q1A q1a) {
        this.A00.A05.A03(q1a);
    }

    public final boolean EtW() {
        return this.A00.A08;
    }
}
