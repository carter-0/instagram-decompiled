package com.instagram.realtimeclient.regionhint;

import X.0qQ;
import com.instagram.realtimeclient.protocol.TCompactProtocol;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RegionHintMessage {
    public static final Companion Companion = new Object();
    public static final int FIELD_MESSAGE_REGION = 1;
    public String region;

    public RegionHintMessage(byte[] bArr) {
        0qQ.A0B(bArr, 1);
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
            if (i == 1 && b2 == 8) {
                this.region = TCompactProtocol.getStringFromByteBuffer(wrap, TCompactProtocol.readVarint(wrap));
                return;
            }
        }
    }

    public final String getRegion() {
        return this.region;
    }

    public final void setRegion(String str) {
        this.region = str;
    }

    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }
}
