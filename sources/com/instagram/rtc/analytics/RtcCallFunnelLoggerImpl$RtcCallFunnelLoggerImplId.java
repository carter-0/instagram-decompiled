package com.instagram.rtc.analytics;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.W6F;
import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import com.instagram.model.rtc.RtcCallFunnelSessionId;
import java.util.UUID;

public final class RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId extends RtcCallFunnelSessionId {
    public static final Parcelable.Creator CREATOR = new W6F(11);
    public final ParcelUuid A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId) && 0qQ.A0K(this.A00, ((RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }

    public RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId() {
        this(new ParcelUuid(UUID.randomUUID()));
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("RtcCallFunnelLoggerImplId(id=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public RtcCallFunnelLoggerImpl$RtcCallFunnelLoggerImplId(ParcelUuid parcelUuid) {
        0qQ.A0B(parcelUuid, 1);
        this.A00 = parcelUuid;
    }
}
