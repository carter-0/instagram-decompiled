package X;

import android.media.MediaCodec;
import com.google.common.collect.Range;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class STK {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Range A05;
    public boolean A06 = true;
    public final FileOutputStream A07;
    public final FileChannel A08;
    public final List A09 = AnonymousClass7TE.A1C();
    public final AtomicBoolean A0A = JTQ.A0k();
    public final C13870Tir A0B;
    public final C10921S0y A0C;

    public STK(C13870Tir tir, C10921S0y s0y, FileOutputStream fileOutputStream) {
        this.A07 = fileOutputStream;
        this.A08 = fileOutputStream.getChannel();
        this.A0C = s0y;
        this.A0B = tir;
        Long A0m = C51971G9r.A0m();
        this.A05 = Range.A00(A0m, A0m);
    }

    private void A01(long j) {
        if (!this.A06) {
            long j2 = this.A00;
            long j3 = this.A01;
            if (j2 + j >= j3) {
                A05(this, A00(this), Math.max(j3 + Math.min(1000000000, Math.max(500000, (long) (((float) j2) * 0.2f))) + j, AnonymousClass7TE.A0R(this.A05.upperBound.A01())));
            }
        }
    }

    public static void A03(STK stk, long j) {
        FileChannel fileChannel = stk.A08;
        fileChannel.position(stk.A02 + 8);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.putLong(j);
        allocate.flip();
        fileChannel.write(allocate);
    }

    public static void A04(STK stk, C11754Sfp sfp) {
        Deque<Buffer> deque = sfp.A03;
        int size = deque.size();
        Deque deque2 = sfp.A02;
        boolean z = false;
        C11366SPh.A02(AnonymousClass7TF.A1S(size, deque2.size()));
        if (!deque2.isEmpty()) {
            if (!stk.A0A.getAndSet(true)) {
                FileChannel fileChannel = stk.A08;
                fileChannel.position(0);
                fileChannel.write(C11411SSj.A00());
                if (stk.A06) {
                    stk.A04 = fileChannel.position();
                    fileChannel.write(S81.A00("free", ByteBuffer.allocate(400000)));
                    stk.A03 = fileChannel.position();
                }
                stk.A02 = fileChannel.position();
                ByteBuffer allocate = ByteBuffer.allocate(16);
                allocate.putInt(1);
                allocate.put("mdat".getBytes(AnonymousClass2RN.A05));
                allocate.putLong(16);
                allocate.flip();
                fileChannel.write(allocate);
                long j = stk.A02 + 16;
                stk.A00 = j;
                if (stk.A06) {
                    j = Long.MAX_VALUE;
                }
                stk.A01 = j;
            }
            long j2 = 0;
            for (Buffer limit : deque) {
                j2 += (long) limit.limit();
            }
            stk.A01(j2);
            Pxe.A1J(stk.A00, sfp.A04);
            G9w.A0x(deque2.size(), sfp.A05);
            do {
                MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) deque2.removeFirst();
                ByteBuffer byteBuffer = (ByteBuffer) deque.removeFirst();
                String str = sfp.A01.A0Y;
                str.getClass();
                if (str.equals("video/avc") || str.equals("video/hevc")) {
                    byteBuffer = RS6.A00(byteBuffer);
                    bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                }
                stk.A01((long) byteBuffer.remaining());
                long j3 = stk.A00;
                stk.A00 = j3 + ((long) stk.A08.write(byteBuffer, j3));
                sfp.A06.add(bufferInfo);
            } while (!deque2.isEmpty());
            if (stk.A00 <= stk.A01) {
                z = true;
            }
            C11366SPh.A02(z);
        }
    }

    public static void A05(STK stk, ByteBuffer byteBuffer, long j) {
        boolean z = true;
        C11366SPh.A02(Pxf.A1R((j > AnonymousClass7TE.A0R(stk.A05.upperBound.A01()) ? 1 : (j == AnonymousClass7TE.A0R(stk.A05.upperBound.A01()) ? 0 : -1))));
        if (j < stk.A01) {
            z = false;
        }
        C11366SPh.A02(z);
        FileChannel fileChannel = stk.A08;
        fileChannel.position(j);
        fileChannel.write(S81.A00("free", byteBuffer.duplicate()));
        long j2 = 8 + j;
        stk.A01 = j2;
        A03(stk, j2 - stk.A02);
        stk.A05 = Range.A00(Long.valueOf(j), Long.valueOf(j + ((long) byteBuffer.remaining())));
    }

    public static void A02(STK stk) {
        ByteBuffer A002 = A00(stk);
        int remaining = A002.remaining();
        long remaining2 = (long) (A002.remaining() + 8);
        long j = stk.A03;
        long j2 = stk.A04;
        if (remaining2 <= j - j2) {
            FileChannel fileChannel = stk.A08;
            fileChannel.position(j2);
            fileChannel.write(A002);
            fileChannel.write(S81.A00("free", ByteBuffer.allocate((int) ((stk.A03 - fileChannel.position()) - 8))));
        } else {
            stk.A06 = false;
            long j3 = stk.A00;
            stk.A01 = j3;
            FileChannel fileChannel2 = stk.A08;
            fileChannel2.position(j3);
            fileChannel2.write(A002);
            long j4 = stk.A01;
            stk.A05 = Range.A00(Long.valueOf(j4), Long.valueOf(j4 + ((long) remaining)));
            fileChannel2.write(S81.A00("free", ByteBuffer.allocate((int) ((stk.A03 - stk.A04) - 8))), stk.A04);
        }
        A03(stk, stk.A00 - stk.A02);
    }

    public static ByteBuffer A00(STK stk) {
        List list;
        long j = Long.MAX_VALUE;
        int i = 0;
        while (true) {
            list = stk.A09;
            if (i >= list.size()) {
                break;
            }
            C11754Sfp sfp = (C11754Sfp) list.get(i);
            if (!sfp.A06.isEmpty()) {
                j = Math.min(((MediaCodec.BufferInfo) sfp.A06.get(0)).presentationTimeUs, j);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            return stk.A0C.A00(list, j, false);
        }
        return ByteBuffer.allocate(0);
    }
}
