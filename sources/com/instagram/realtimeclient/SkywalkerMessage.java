package com.instagram.realtimeclient;

import X.C13988Tno;
import com.instagram.realtimeclient.protocol.TCompactProtocol;
import java.nio.ByteBuffer;

public class SkywalkerMessage {
    public static final int FIELD_MESSAGE_PAYLOAD = 2;
    public static final int FIELD_MESSAGE_TYPE = 1;
    public ByteBuffer mMessagePayload;
    public Integer mMessageType;

    public ByteBuffer getMessagePayload() {
        return this.mMessagePayload;
    }

    public Integer getMessageType() {
        return this.mMessageType;
    }

    public String getPayloadAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessagePayload);
    }

    public SkywalkerMessage(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = 0;
        while (wrap.hasRemaining()) {
            byte b = wrap.get() & 255;
            int i2 = b >> 4;
            if (i2 == 0) {
                int readVarint = TCompactProtocol.readVarint(wrap);
                i = (-(readVarint & 1)) ^ (readVarint >> 1);
            } else {
                i += i2;
            }
            byte b2 = b & 15;
            if (b2 == 0) {
                return;
            }
            if (i == 1) {
                if (b2 == 5) {
                    int readVarint2 = TCompactProtocol.readVarint(wrap);
                    this.mMessageType = Integer.valueOf((-(readVarint2 & 1)) ^ (readVarint2 >> 1));
                }
            } else if (i == 2 && b2 == 8) {
                int readVarint3 = TCompactProtocol.readVarint(wrap);
                this.mMessagePayload = ByteBuffer.wrap(bArr, wrap.position(), readVarint3);
                C13988Tno.A1S(wrap, readVarint3);
            }
        }
    }
}
