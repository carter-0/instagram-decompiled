package X;

import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.SupplementMessagePayload;

/* renamed from: X.NFu  reason: case insensitive filesystem */
public final class C68413NFu extends R4O implements C13662TeT {
    public C68413NFu() {
        super(SupplementMessagePayload.DEFAULT_INSTANCE);
    }

    public final void A06(C68398NFf nFf) {
        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) C66580MXl.A0L(this);
        SupplementMessageContent supplementMessageContent = (SupplementMessageContent) nFf.A02();
        supplementMessageContent.getClass();
        supplementMessagePayload.content_ = supplementMessageContent;
        supplementMessagePayload.bitField0_ |= 4;
    }

    public final void A07(String str) {
        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) C66580MXl.A0L(this);
        str.getClass();
        supplementMessagePayload.bitField0_ |= 1;
        supplementMessagePayload.targetMessageOtid_ = str;
    }

    public final void A08(String str) {
        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) C66580MXl.A0L(this);
        supplementMessagePayload.bitField0_ |= 8;
        supplementMessagePayload.targetMessageWaServerTimeSec_ = str;
    }

    public final void A09(String str) {
        SupplementMessagePayload supplementMessagePayload = (SupplementMessagePayload) C66580MXl.A0L(this);
        str.getClass();
        supplementMessagePayload.bitField0_ |= 2;
        supplementMessagePayload.uniquingKeyForSupplementalData_ = str;
    }
}
