package com.instagram.realtimeclient;

import X.C13988Tno;
import com.instagram.realtimeclient.protocol.TCompactProtocol;
import java.nio.ByteBuffer;

public class GraphQLSubscriptionMessage {
    public static final int FIELD_MESSAGE_PAYLOAD = 2;
    public static final int FIELD_MESSAGE_TOPIC = 1;
    public ByteBuffer mMessagePayload;
    public ByteBuffer mMessageTopic;

    public ByteBuffer getMessagePayload() {
        return this.mMessagePayload;
    }

    public String getMessagePayloadAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessagePayload);
    }

    public ByteBuffer getMessageTopic() {
        return this.mMessageTopic;
    }

    public String getMessageTopicAsString() {
        return TCompactProtocol.getStringFromByteBuffer(this.mMessageTopic);
    }

    public GraphQLSubscriptionMessage(byte[] bArr) {
        int readVarint;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i = 0;
        while (wrap.hasRemaining()) {
            byte b = wrap.get() & 255;
            int i2 = b >> 4;
            if (i2 == 0) {
                int readVarint2 = TCompactProtocol.readVarint(wrap);
                i = (-(readVarint2 & 1)) ^ (readVarint2 >> 1);
            } else {
                i += i2;
            }
            byte b2 = b & 15;
            if (b2 != 0) {
                if (i == 1) {
                    if (b2 == 8) {
                        readVarint = TCompactProtocol.readVarint(wrap);
                        this.mMessageTopic = ByteBuffer.wrap(bArr, wrap.position(), readVarint);
                    }
                } else if (i == 2 && b2 == 8) {
                    readVarint = TCompactProtocol.readVarint(wrap);
                    this.mMessagePayload = ByteBuffer.wrap(bArr, wrap.position(), readVarint);
                }
                C13988Tno.A1S(wrap, readVarint);
            } else {
                return;
            }
        }
    }
}
