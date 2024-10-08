package com.facebook.ffmpeg;

import X.AnonymousClass7TE;
import X.DbT;
import X.Pxg;
import X.TSP;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.AndroidVideoDecoder;

public class FFMpegMediaFormat {
    public static final TSP ALL_KEYS;
    public final Map mMap = AnonymousClass7TE.A1E();

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC, Splitter:B:32:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00a0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.ffmpeg.FFMpegMediaFormat toFFMpegMediaFormat(android.media.MediaFormat r12) {
        /*
            com.facebook.ffmpeg.FFMpegMediaFormat r9 = new com.facebook.ffmpeg.FFMpegMediaFormat
            r9.<init>()
            X.TSP r0 = ALL_KEYS
            java.util.Iterator r11 = X.AnonymousClass7TF.A0s(r0)
        L_0x000b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00cf
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r11)
            java.lang.String r6 = X.DbT.A13(r0)
            java.lang.Object r5 = r0.getValue()
            boolean r0 = r12.containsKey(r6)
            if (r0 == 0) goto L_0x000b
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r5 != r0) goto L_0x002f
            java.lang.String r0 = r12.getString(r6)     // Catch:{ ClassCastException -> 0x005f }
            r9.setString(r6, r0)     // Catch:{ ClassCastException -> 0x005f }
            goto L_0x000b
        L_0x002f:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 != r0) goto L_0x003b
            int r0 = r12.getInteger(r6)     // Catch:{ ClassCastException -> 0x005f }
            r9.setInteger(r6, r0)     // Catch:{ ClassCastException -> 0x005f }
            goto L_0x000b
        L_0x003b:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r5 != r0) goto L_0x0047
            long r0 = r12.getLong(r6)     // Catch:{ ClassCastException -> 0x005f }
            r9.setLong(r6, r0)     // Catch:{ ClassCastException -> 0x005f }
            goto L_0x000b
        L_0x0047:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r5 != r0) goto L_0x0053
            float r0 = r12.getFloat(r6)     // Catch:{ ClassCastException -> 0x005f }
            r9.setFloat(r6, r0)     // Catch:{ ClassCastException -> 0x005f }
            goto L_0x000b
        L_0x0053:
            java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
            if (r5 != r0) goto L_0x000b
            java.nio.ByteBuffer r0 = r12.getByteBuffer(r6)     // Catch:{ ClassCastException -> 0x005f }
            r9.setByteBuffer(r6, r0)     // Catch:{ ClassCastException -> 0x005f }
            goto L_0x000b
        L_0x005f:
            r10 = move-exception
            r4 = 0
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 != r0) goto L_0x0070
            float r1 = r12.getFloat(r6)     // Catch:{ ClassCastException -> 0x0070 }
            java.lang.Float r3 = java.lang.Float.valueOf(r1)     // Catch:{ ClassCastException -> 0x0070 }
            if (r3 == 0) goto L_0x0071
            goto L_0x008f
        L_0x0070:
            r3 = r4
        L_0x0071:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r5 != r0) goto L_0x00a0
            long r0 = r12.getLong(r6)     // Catch:{ ClassCastException -> 0x007d }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ ClassCastException -> 0x007d }
        L_0x007d:
            if (r4 == 0) goto L_0x00a0
            long r7 = r4.longValue()
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00a0
            int r0 = r4.intValue()
            goto L_0x009b
        L_0x008f:
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 % r0
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0071
            int r0 = r3.intValue()
        L_0x009b:
            r9.setInteger(r6, r0)
            goto L_0x000b
        L_0x00a0:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = r10.getMessage()
            r1.append(r0)
            java.lang.String r0 = " : name="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ",type="
            r1.append(r0)
            X.Pxf.A1O(r1, r5)
            java.lang.String r0 = ",possibleFloatValue="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ",possibleLongValue="
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r4, r0, r1)
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>(r1)
            throw r0
        L_0x00cf:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ffmpeg.FFMpegMediaFormat.toFFMpegMediaFormat(android.media.MediaFormat):com.facebook.ffmpeg.FFMpegMediaFormat");
    }

    public final boolean containsKey(String str) {
        return this.mMap.containsKey(str);
    }

    public final ByteBuffer getByteBuffer(String str) {
        return (ByteBuffer) this.mMap.get(str);
    }

    public final float getFloat(String str) {
        return AnonymousClass7TE.A04(this.mMap.get(str));
    }

    public final int getInteger(String str, int i) {
        try {
            return Pxg.A06(str, this.mMap);
        } catch (ClassCastException | NullPointerException unused) {
            return i;
        }
    }

    public final String getString(String str) {
        return DbT.A11(str, this.mMap);
    }

    public final void setByteBuffer(String str, ByteBuffer byteBuffer) {
        this.mMap.put(str, byteBuffer);
    }

    public final void setFloat(String str, float f) {
        this.mMap.put(str, new Float(f));
    }

    public final void setInteger(String str, int i) {
        this.mMap.put(str, new Integer(i));
    }

    public final void setLong(String str, long j) {
        this.mMap.put(str, new Long(j));
    }

    public final void setString(String str, String str2) {
        this.mMap.put(str, str2);
    }

    public String toString() {
        return this.mMap.toString();
    }

    /* JADX WARNING: type inference failed for: r0v28, types: [X.TSP, java.util.HashMap] */
    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        Class<String> cls = String.class;
        A1E.put("mime", cls);
        A1E.put("language", cls);
        Class<Integer> cls2 = Integer.class;
        A1E.put("sample-rate", cls2);
        A1E.put("channel-count", cls2);
        A1E.put(IgReactMediaPickerNativeModule.WIDTH, cls2);
        A1E.put(IgReactMediaPickerNativeModule.HEIGHT, cls2);
        A1E.put("max-width", cls2);
        A1E.put("max-height", cls2);
        A1E.put("max-input-size", cls2);
        A1E.put(TraceFieldType.Bitrate, cls2);
        A1E.put("color-format", cls2);
        A1E.put("frame-rate", cls2);
        A1E.put("i-frame-interval", cls2);
        A1E.put(AndroidVideoDecoder.MEDIA_FORMAT_KEY_STRIDE, cls2);
        A1E.put(AndroidVideoDecoder.MEDIA_FORMAT_KEY_SLICE_HEIGHT, cls2);
        Class<Long> cls3 = Long.class;
        A1E.put("repeat-previous-frame-after", cls3);
        A1E.put("push-blank-buffers-on-shutdown", cls2);
        A1E.put("durationUs", cls3);
        A1E.put("is-adts", cls2);
        A1E.put("channel-mask", cls2);
        A1E.put("aac-profile", cls2);
        A1E.put("flac-compression-level", cls2);
        A1E.put("is-autoselect", cls2);
        A1E.put("is-default", cls2);
        A1E.put("is-forced-subtitle", cls2);
        A1E.put("rotation", cls2);
        Class<ByteBuffer> cls4 = ByteBuffer.class;
        A1E.put("csd-0", cls4);
        A1E.put("csd-1", cls4);
        ALL_KEYS = new HashMap(A1E);
    }

    public final long getLong(String str, long j) {
        try {
            return getLong(str);
        } catch (ClassCastException | NullPointerException unused) {
            return j;
        }
    }

    public final int getInteger(String str) {
        return Pxg.A06(str, this.mMap);
    }

    public final long getLong(String str) {
        return AnonymousClass7TE.A0R(this.mMap.get(str));
    }
}
