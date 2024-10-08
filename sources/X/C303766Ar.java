package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: X.6Ar  reason: invalid class name and case insensitive filesystem */
public final class C303766Ar {
    /* JADX WARNING: type inference failed for: r3v1, types: [X.2dv, java.lang.Object, X.UK1] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.2dv, java.lang.Object, X.6As] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, X.6At] */
    /* JADX WARNING: type inference failed for: r0v27, types: [X.6WP, java.lang.Object] */
    public final C71532dv A00(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        if ("KEYF".length() == 4) {
            int i = 0;
            while ("KEYF".charAt(i) == ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                i++;
                if (i >= 4) {
                    ? obj = new Object();
                    try {
                        ? obj2 = new Object();
                        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                        int position = byteBuffer.position();
                        obj2.ANd(byteBuffer, byteBuffer.getInt(position) + position);
                        obj2.A00(obj);
                        List list = obj.A01;
                        if (list != null) {
                            AnonymousClass2e2[] r1 = new AnonymousClass2e2[list.size()];
                            obj.A04 = r1;
                            obj.A04 = (AnonymousClass2e2[]) obj.A01.toArray(r1);
                            obj.A01 = null;
                            obj.A00 = 0;
                        }
                        List list2 = obj.A00;
                        if (list2 != null) {
                            AnonymousClass6WP r0 = obj.A01;
                            AnonymousClass6WP r02 = r0;
                            if (r0 == null) {
                                ? obj3 = new Object();
                                obj.A01 = obj3;
                                r02 = obj3;
                            }
                            r02.A00 = list2;
                            obj.A00 = null;
                        }
                        if (obj.A03 == null) {
                            obj.A03 = new byte[]{0};
                        }
                        obj.A00();
                        return obj;
                    } catch (Exception e) {
                        throw new Exception(e);
                    }
                }
            }
        }
        if ("KYF3".length() == 4) {
            int i2 = 0;
            while ("KYF3".charAt(i2) == ((char) byteBuffer.get(byteBuffer.position() + 4 + i2))) {
                i2++;
                if (i2 >= 4) {
                    ? obj4 = new Object();
                    try {
                        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                        int position2 = byteBuffer.position();
                        obj4.ANd(byteBuffer, byteBuffer.getInt(position2) + position2);
                        return obj4;
                    } catch (Exception e2) {
                        throw new Exception(e2);
                    }
                }
            }
        }
        throw new Exception("unrecognized asset format");
    }
}
