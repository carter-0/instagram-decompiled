package X;

import android.media.MediaCodec;
import androidx.media3.common.Metadata;
import androidx.media3.container.Mp4OrientationData;
import com.google.common.collect.Range;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Deque;
import java.util.List;

/* renamed from: X.Sfr  reason: case insensitive filesystem */
public final class C11756Sfr implements C13793ThA {
    public final STK A00;
    public final C10517RtW A01;

    public final void A9N(Metadata.Entry entry) {
        this.A01.A00 = (Mp4OrientationData) entry;
    }

    public final C11754Sfp AAY(SJM sjm) {
        STK stk = this.A00;
        C11754Sfp sfp = new C11754Sfp(sjm);
        List list = stk.A09;
        list.add(sfp);
        C13113TLw.A00(2, list);
        return sfp;
    }

    public final void FO6(MediaCodec.BufferInfo bufferInfo, TZe tZe, ByteBuffer byteBuffer) {
        try {
            STK stk = this.A00;
            C11366SPh.A01(tZe instanceof C11754Sfp);
            ((C11754Sfp) tZe).A00(bufferInfo, byteBuffer);
            int i = 0;
            boolean z = false;
            while (true) {
                List list = stk.A09;
                if (i >= list.size()) {
                    break;
                }
                C11754Sfp sfp = (C11754Sfp) list.get(i);
                if (sfp.A02.size() > 2) {
                    Deque deque = sfp.A02;
                    Object peekFirst = deque.peekFirst();
                    peekFirst.getClass();
                    Object peekLast = deque.peekLast();
                    peekLast.getClass();
                    if (((MediaCodec.BufferInfo) peekLast).presentationTimeUs - ((MediaCodec.BufferInfo) peekFirst).presentationTimeUs > 1000000) {
                        STK.A04(stk, sfp);
                        z = true;
                    }
                }
                i++;
            }
            if (z && stk.A06) {
                STK.A02(stk);
            }
        } catch (IOException e) {
            RK5 rk5 = RK5.$redex_init_class;
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Failed to write sample for presentationTimeUs=");
            A1A.append(bufferInfo.presentationTimeUs);
            A1A.append(", size=");
            throw new Exception(Pxe.A0z(A1A, bufferInfo.size), e);
        }
    }

    public final void close() {
        STK stk;
        try {
            stk = this.A00;
            int i = 0;
            while (true) {
                List list = stk.A09;
                if (i >= list.size()) {
                    break;
                }
                STK.A04(stk, (C11754Sfp) list.get(i));
                i++;
            }
            if (stk.A0A.get()) {
                if (stk.A06) {
                    STK.A02(stk);
                } else {
                    ByteBuffer A002 = STK.A00(stk);
                    int remaining = A002.remaining();
                    long j = stk.A01;
                    long j2 = stk.A00;
                    long j3 = (long) (remaining + 8);
                    boolean z = true;
                    if (j - j2 < j3) {
                        STK.A05(stk, A002, ((Long) stk.A05.upperBound.A01()).longValue() + j3);
                        long j4 = stk.A01;
                        j2 = stk.A00;
                        C11366SPh.A02(Pxf.A1R(((j4 - j2) > j3 ? 1 : ((j4 - j2) == j3 ? 0 : -1))));
                    }
                    FileChannel fileChannel = stk.A08;
                    fileChannel.position(j2);
                    fileChannel.write(A002);
                    long j5 = ((long) remaining) + j2;
                    long longValue = ((Long) stk.A05.upperBound.A01()).longValue() - j5;
                    if (longValue >= 2147483647L) {
                        z = false;
                    }
                    C11366SPh.A02(z);
                    ByteBuffer allocate = ByteBuffer.allocate(8);
                    allocate.putInt((int) longValue);
                    allocate.put("free".getBytes(AnonymousClass2RN.A05));
                    allocate.flip();
                    fileChannel.write(allocate);
                    stk.A01 = j2;
                    STK.A03(stk, j2 - stk.A02);
                    stk.A05 = Range.A00(Long.valueOf(j2), Long.valueOf(j2 + ((long) A002.limit())));
                    fileChannel.truncate(j5);
                }
            }
            stk.A08.close();
            stk.A07.close();
        } catch (IOException e) {
            throw new Exception("Failed to close the muxer", e);
        } catch (Throwable th) {
            stk.A08.close();
            stk.A07.close();
            throw th;
        }
    }

    public C11756Sfr(C10517RtW rtW, STK stk) {
        this.A00 = stk;
        this.A01 = rtW;
    }
}
