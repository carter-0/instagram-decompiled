package X;

import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.SSj  reason: case insensitive filesystem */
public abstract class C11411SSj {
    public static final ImmutableList A00 = ImmutableList.of((byte) -66, (byte) 122, (byte) -49, (byte) -53, (byte) -105, (byte) -87, (byte) 66, (byte) -24, (byte) -100, (byte) 113, (byte) -103, (byte) -108, (byte) -111, (byte) -29, (byte) -81, (byte) -84);

    public static ByteBuffer A01(String str, String str2) {
        ByteBuffer allocate = ByteBuffer.allocate(200);
        allocate.putInt(0);
        allocate.putInt(0);
        Charset charset = AnonymousClass2RN.A05;
        allocate.put(str.getBytes(charset));
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.putInt(0);
        allocate.put(str2.getBytes(charset));
        allocate.put((byte) 0);
        allocate.flip();
        return S81.A00("hdlr", allocate);
    }

    public static ArrayList A04(List list, List list2, int i) {
        List list3 = list;
        ArrayList A0m = C51970G9q.A0m(list3);
        if (!list3.isEmpty()) {
            boolean z = false;
            long j = ((MediaCodec.BufferInfo) list3.get(0)).presentationTimeUs;
            long j2 = 0;
            long j3 = 0;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < list3.size()) {
                long j4 = ((MediaCodec.BufferInfo) list3.get(i2)).presentationTimeUs - j;
                long j5 = ((j4 * ((long) i)) / 1000000) - j2;
                if (j5 <= 2147483647L) {
                    z = true;
                }
                if (z) {
                    j2 += Pxg.A0I(list2, i2);
                    AnonymousClass7TF.A1M(A0m, (int) j5);
                    if (j4 < j3) {
                        z2 = true;
                    }
                    i2++;
                    j3 = j4;
                    z = false;
                } else {
                    throw AnonymousClass7TE.A0z(String.valueOf("Only 32-bit offset is allowed"));
                }
            }
            if (!z2) {
                A0m.clear();
            }
        }
        return A0m;
    }

    public static ByteBuffer A00() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Charset charset = AnonymousClass2RN.A05;
        A1C.add(ByteBuffer.wrap("isom".getBytes(charset)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        allocate.flip();
        A1C.add(allocate);
        int i = 0;
        String[] strArr = {"isom", "iso2", "mp41"};
        do {
            A1C.add(ByteBuffer.wrap(strArr[i].getBytes(charset)));
            i++;
        } while (i < 3);
        return S81.A01("ftyp", A1C);
    }

    public static ByteBuffer A02(ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit() + 200);
        allocate.putInt(0);
        allocate.putInt(1);
        allocate.put(byteBuffer);
        allocate.flip();
        return S81.A00("stsd", allocate);
    }

    public static ArrayList A03(List list, int i, int i2, long j) {
        ArrayList A0m = C51970G9q.A0m(list);
        ArrayList A0m2 = C51970G9q.A0m(list);
        if (!list.isEmpty()) {
            long j2 = 0;
            int i3 = 0;
            boolean z = false;
            while (i3 < list.size()) {
                long j3 = ((MediaCodec.BufferInfo) list.get(i3)).presentationTimeUs;
                AnonymousClass7TE.A1Y(A0m, j3);
                if (j3 < j2) {
                    z = true;
                }
                i3++;
                j2 = j3;
            }
            if (z) {
                Collections.sort(A0m);
            }
            int i4 = 1;
            while (i4 < A0m.size()) {
                long A0R = AnonymousClass7TE.A0R(A0m.get(i4));
                long j4 = (long) i;
                long j5 = ((A0R * j4) / 1000000) - ((j * j4) / 1000000);
                if (j5 <= 2147483647L) {
                    AnonymousClass7TE.A1Y(A0m2, j5);
                    i4++;
                    j = A0R;
                } else {
                    throw AnonymousClass7TE.A0w(String.format(Locale.US, "Timestamp delta %d doesn't fit into an int", Pxf.A1W(j5)));
                }
            }
            AnonymousClass7TE.A1Y(A0m2, 0);
            if (A0m2.size() > 2) {
                boolean z2 = true;
                if (i2 != 0) {
                    A0m2.set(A0m2.size() - 1, A0m2.get(A0m2.size() - 2));
                    return A0m2;
                }
                if (AnonymousClass7TE.A0R(SA7.A00(A0m2)) != 0) {
                    z2 = false;
                }
                C11366SPh.A02(z2);
            }
        }
        return A0m2;
    }
}
