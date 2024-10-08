package X;

import android.media.MediaCodec;
import com.google.common.collect.ImmutableList;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/* renamed from: X.SFn  reason: case insensitive filesystem */
public final class C11213SFn {
    public int A00 = 1;
    public long A01;
    public long A02 = Long.MAX_VALUE;
    public C11754Sfp A03;
    public boolean A04;
    public final C10921S0y A05;
    public final FileOutputStream A06;
    public final FileChannel A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final C13870Tir A09;

    public C11213SFn(C13870Tir tir, C10921S0y s0y, FileOutputStream fileOutputStream) {
        this.A06 = fileOutputStream;
        this.A07 = fileOutputStream.getChannel();
        this.A05 = s0y;
        this.A09 = tir;
    }

    public static void A00(C11213SFn sFn) {
        C11213SFn sFn2;
        long j;
        int i;
        ImmutableList.Builder A0Y = Pxe.A0Y();
        int i2 = 0;
        while (true) {
            sFn2 = sFn;
            List list = sFn2.A08;
            if (i2 >= list.size()) {
                break;
            }
            if (!((C11754Sfp) list.get(i2)).A02.isEmpty()) {
                int i3 = i2 + 1;
                C11754Sfp sfp = (C11754Sfp) list.get(i2);
                Deque deque = sfp.A03;
                int size = deque.size();
                Deque deque2 = sfp.A02;
                C11366SPh.A02(AnonymousClass7TF.A1S(size, deque2.size()));
                ImmutableList.Builder A0Y2 = Pxe.A0Y();
                ImmutableList.Builder A0Y3 = Pxe.A0Y();
                String str = sfp.A01.A0Y;
                str.getClass();
                if (str.equals("video/avc") || str.equals("video/hevc")) {
                    while (!deque.isEmpty()) {
                        ByteBuffer A002 = RS6.A00((ByteBuffer) deque.removeFirst());
                        A0Y2.add(A002);
                        MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) deque2.removeFirst();
                        bufferInfo.set(A002.position(), A002.remaining(), bufferInfo.presentationTimeUs, bufferInfo.flags);
                        A0Y3.add(bufferInfo);
                    }
                } else {
                    A0Y2.addAll(deque);
                    deque.clear();
                    A0Y3.addAll(deque2);
                    deque2.clear();
                }
                ImmutableList build = A0Y3.build();
                if (sFn2.A00 == 1) {
                    j = sFn2.A02;
                } else {
                    j = ((MediaCodec.BufferInfo) build.get(0)).presentationTimeUs;
                }
                ArrayList A032 = C11411SSj.A03(build, sfp.FN2(), 1, j);
                ArrayList A042 = C11411SSj.A04(build, A032, sfp.FN2());
                boolean A1b = DbT.A1b(A042);
                ImmutableList.Builder A0Y4 = Pxe.A0Y();
                int i4 = 0;
                for (int i5 = 0; i5 < build.size(); i5++) {
                    i4 += ((MediaCodec.BufferInfo) build.get(i5)).size;
                    long A0R = AnonymousClass7TE.A0R(A032.get(i5));
                    int i6 = ((MediaCodec.BufferInfo) build.get(i5)).size;
                    int i7 = ((MediaCodec.BufferInfo) build.get(i5)).flags;
                    if (A1b) {
                        i = AnonymousClass7TE.A0M(A042.get(i5));
                    } else {
                        i = 0;
                    }
                    A0Y4.add(new C10652Rvl(A0R, i6, i7, i));
                }
                A0Y.add(new C10722Rx0(A0Y2.build(), A0Y4.build(), i3, i4, A1b));
            }
            i2++;
        }
        ImmutableList build2 = A0Y.build();
        FileChannel fileChannel = sFn2.A07;
        long position = fileChannel.position();
        ImmutableList.Builder A0Y5 = Pxe.A0Y();
        int i8 = 0;
        for (int i9 = 0; i9 < build2.size(); i9++) {
            C10722Rx0 rx0 = (C10722Rx0) build2.get(i9);
            int size2 = rx0.A03.size();
            boolean z = rx0.A04;
            ImmutableList immutableList = C11411SSj.A00;
            int i10 = 3;
            if (z) {
                i10 = 4;
            }
            i8 += 32 + (i10 * size2 * 4) + 12 + 8;
        }
        int i11 = i8 + 24 + 8;
        for (int i12 = 0; i12 < build2.size(); i12++) {
            C10722Rx0 rx02 = (C10722Rx0) build2.get(i12);
            int i13 = rx02.A01;
            ImmutableList immutableList2 = C11411SSj.A00;
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putInt(1);
            allocate.putInt(i13);
            allocate.putLong(position);
            allocate.flip();
            ByteBuffer A003 = S81.A00("tfhd", allocate);
            ImmutableList immutableList3 = rx02.A03;
            boolean z2 = rx02.A04;
            int size3 = immutableList3.size();
            int i14 = 3;
            if (z2) {
                i14 = 4;
            }
            ByteBuffer allocate2 = ByteBuffer.allocate((i14 * size3 * 4) + 12);
            int i15 = 16779009;
            if (z2) {
                i15 = 16781057;
            }
            Pxi.A1O(allocate2, immutableList3, i15);
            allocate2.putInt(i11);
            for (int i16 = 0; i16 < immutableList3.size(); i16++) {
                C10652Rvl rvl = (C10652Rvl) immutableList3.get(i16);
                allocate2.putInt((int) rvl.A03);
                allocate2.putInt(rvl.A02);
                int i17 = 16842752;
                if ((rvl.A01 & 1) != 0) {
                    i17 = 33554432;
                }
                allocate2.putInt(i17);
                if (z2) {
                    allocate2.putInt(rvl.A00);
                }
            }
            allocate2.flip();
            A0Y5.add(S81.A01("traf", ImmutableList.of(A003, S81.A00("trun", allocate2))));
            i11 += rx02.A00;
        }
        ImmutableList build3 = A0Y5.build();
        if (!build3.isEmpty()) {
            int i18 = sFn2.A00;
            ImmutableList immutableList4 = C11411SSj.A00;
            ByteBuffer allocate3 = ByteBuffer.allocate(8);
            allocate3.putInt(0);
            allocate3.putInt(i18);
            allocate3.flip();
            ByteBuffer A004 = S81.A00("mfhd", allocate3);
            ImmutableList.Builder A0Y6 = Pxe.A0Y();
            A0Y6.add(A004);
            A0Y6.addAll(build3);
            fileChannel.write(S81.A01("moof", A0Y6.build()));
            long position2 = fileChannel.position();
            ByteBuffer allocate4 = ByteBuffer.allocate(8);
            allocate4.putInt(8);
            allocate4.put("mdat".getBytes(AnonymousClass2RN.A05));
            allocate4.flip();
            fileChannel.write(allocate4);
            boolean z3 = false;
            long j2 = 0;
            for (int i19 = 0; i19 < build2.size(); i19++) {
                C10722Rx0 rx03 = (C10722Rx0) build2.get(i19);
                for (int i20 = 0; i20 < rx03.A02.size(); i20++) {
                    j2 += (long) fileChannel.write((ByteBuffer) rx03.A02.get(i20));
                }
            }
            long position3 = fileChannel.position();
            fileChannel.position(position2);
            ByteBuffer allocate5 = ByteBuffer.allocate(4);
            long j3 = j2 + 8;
            if (j3 <= 4294967295L) {
                z3 = true;
            }
            C11366SPh.A03(z3, "Only 32-bit long mdat size supported in the fragmented MP4");
            allocate5.putInt((int) j3);
            allocate5.flip();
            fileChannel.write(allocate5);
            fileChannel.position(position3);
            sFn2.A00++;
        }
    }
}
