package X;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.common.dextricks.Constants;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SsI  reason: case insensitive filesystem */
public final class C12369SsI implements C13859Tie {
    public final /* synthetic */ C12371SsK A00;

    public final void A8G(MediaEffect mediaEffect, int i) {
    }

    public final void AAZ(int i) {
    }

    public final void E42(Context context, C7232Q0d q0d, C11354SOn sOn, C9608Rdm rdm, C7334Q4k q4k, int i) {
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
    }

    public final void EEo(int i) {
    }

    public final void EF4(long j) {
    }

    public final void flush() {
    }

    public C12369SsI(C12371SsK ssK) {
        this.A00 = ssK;
    }

    public final void APk(long j) {
        C12371SsK ssK = this.A00;
        Q1A q1a = ssK.A01;
        if (q1a != null) {
            q1a.A00.presentationTimeUs = j;
            ssK.A05.offer(q1a);
            ssK.A01 = null;
        }
    }

    public final void AVT() {
        this.A00.A05.clear();
    }

    public final String B1O() {
        return "VideoTranscoderPassThrough";
    }

    public final void ECi(Q1A q1a) {
        LinkedBlockingQueue linkedBlockingQueue;
        if (q1a.A02 >= 0 && (linkedBlockingQueue = this.A00.A04) != null) {
            linkedBlockingQueue.offer(q1a);
        }
    }

    public final void Evc() {
        Q1A q1a = new Q1A(0, (ByteBuffer) null, new MediaCodec.BufferInfo());
        q1a.EQ8(0, 0, 0, 4);
        this.A00.A05.offer(q1a);
    }

    public final MediaFormat getOutputFormat() {
        try {
            this.A00.A03.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MediaFormat mediaFormat = this.A00.A00;
        mediaFormat.getClass();
        return mediaFormat;
    }

    public final Q1A AOj(long j) {
        C12371SsK ssK = this.A00;
        if (ssK.A08) {
            ssK.A08 = false;
            Q1A q1a = new Q1A(-1, (ByteBuffer) null, new MediaCodec.BufferInfo());
            q1a.A01 = true;
            return q1a;
        }
        if (!ssK.A07) {
            ssK.A07 = true;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
            ArrayList arrayList = ssK.A02;
            if (arrayList == null) {
                arrayList = AnonymousClass7TE.A1C();
                ssK.A02 = arrayList;
            }
            arrayList.add(allocateDirect);
            Q1A q1a2 = new Q1A(0, allocateDirect, new MediaCodec.BufferInfo());
            MediaFormat mediaFormat = ssK.A00;
            mediaFormat.getClass();
            if (C9607Rdl.A00(mediaFormat, q1a2)) {
                return q1a2;
            }
        }
        return (Q1A) ssK.A05.poll(250000, TimeUnit.MICROSECONDS);
    }

    public final int BZa() {
        MediaFormat outputFormat = getOutputFormat();
        String str = "rotation-degrees";
        if (!outputFormat.containsKey(str)) {
            str = "rotation";
            if (!outputFormat.containsKey(str)) {
                return 0;
            }
        }
        return outputFormat.getInteger(str);
    }
}
