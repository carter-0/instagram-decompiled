package X;

import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.common.dextricks.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SsG  reason: case insensitive filesystem */
public final class C12367SsG implements C13854TiZ {
    public boolean A00;
    public final /* synthetic */ C12371SsK A01;

    public final String Avd() {
        return null;
    }

    public final boolean EtW() {
        return false;
    }

    public final void FJk(int i, Bitmap bitmap) {
    }

    public final void flush() {
    }

    public C12367SsG(C12371SsK ssK) {
        this.A01 = ssK;
    }

    public final long ANv(long j) {
        C12371SsK ssK = this.A01;
        if (ssK.A01 != null) {
            LinkedBlockingQueue linkedBlockingQueue = ssK.A04;
            linkedBlockingQueue.getClass();
            linkedBlockingQueue.offer(ssK.A01);
            ssK.A01 = null;
        }
        Q1A q1a = (Q1A) ssK.A06.poll();
        ssK.A01 = q1a;
        if (q1a != null) {
            MediaCodec.BufferInfo bufferInfo = q1a.A00;
            if (bufferInfo == null || (bufferInfo.flags & 4) == 0) {
                return bufferInfo.presentationTimeUs;
            }
            this.A00 = true;
            LinkedBlockingQueue linkedBlockingQueue2 = ssK.A04;
            linkedBlockingQueue2.getClass();
            linkedBlockingQueue2.offer(ssK.A01);
            ssK.A01 = null;
        }
        return -1;
    }

    public final Q1A AOi(long j) {
        LinkedBlockingQueue linkedBlockingQueue = this.A01.A04;
        linkedBlockingQueue.getClass();
        return (Q1A) linkedBlockingQueue.poll(j, TimeUnit.MICROSECONDS);
    }

    public final void AVT() {
        C12371SsK ssK = this.A01;
        ArrayList arrayList = ssK.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
        LinkedBlockingQueue linkedBlockingQueue = ssK.A04;
        linkedBlockingQueue.getClass();
        linkedBlockingQueue.clear();
        ssK.A06.clear();
        ssK.A04 = null;
    }

    public final long Avc() {
        Q1A q1a = this.A01.A01;
        if (q1a == null) {
            return -1;
        }
        return q1a.A00.presentationTimeUs;
    }

    public final String Avf() {
        return "VideoTranscoderPassThrough";
    }

    public final boolean CdV() {
        return this.A00;
    }

    public final void E41(MediaFormat mediaFormat, C7334Q4k q4k, List list, int i, boolean z) {
        C12371SsK ssK = this.A01;
        ssK.A00 = mediaFormat;
        ssK.A03.countDown();
        int i2 = 0;
        do {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
            ArrayList arrayList = ssK.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass7TE.A1C();
                ssK.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            Q1A q1a = new Q1A(0, allocateDirect, new MediaCodec.BufferInfo());
            LinkedBlockingQueue linkedBlockingQueue = ssK.A04;
            linkedBlockingQueue.getClass();
            linkedBlockingQueue.offer(q1a);
            i2++;
        } while (i2 < 5);
    }

    public final void E5w(Q1A q1a) {
        this.A01.A06.offer(q1a);
    }
}
