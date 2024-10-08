package com.instagram.realtimeclient.protocol;

import X.0qQ;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class TCompactProtocol {
    public static final TCompactProtocol INSTANCE = new Object();
    public static final byte TYPE_BINARY = 8;
    public static final byte TYPE_I32 = 5;
    public static final byte TYPE_STOP = 0;

    public static final int fromZigZag(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static final int readVarint(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        int i = 0;
        int i2 = 0;
        while (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get() & 255;
            i |= (b & Byte.MAX_VALUE) << i2;
            if ((b >> 7) == 0) {
                break;
            }
            i2 += 7;
        }
        return i;
    }

    public static final String getStringFromByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        return getStringFromByteBuffer(byteBuffer, byteBuffer.remaining());
    }

    public static final String getStringFromByteBuffer(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null) {
            return null;
        }
        byte[] array = byteBuffer.array();
        0qQ.A07(array);
        int position = byteBuffer.position();
        Charset forName = Charset.forName(ReactWebViewManager.HTML_ENCODING);
        0qQ.A07(forName);
        return new String(array, position, i, forName);
    }
}
