package com.facebook.smartcapture.ig.logging;

import X.09i;
import X.0lg;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C12277SqZ;
import X.SWZ;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.logging.SmartCaptureLogger;
import com.facebook.smartcapture.logging.SmartCaptureLoggerProvider;

public final class IgSmartCaptureLoggerProvider implements Parcelable, SmartCaptureLoggerProvider {
    public static final Parcelable.Creator CREATOR = SWZ.A01(58);
    public final 0lg A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00.getToken());
    }

    public final SmartCaptureLogger get(Context context) {
        return new C12277SqZ(this.A00);
    }

    public IgSmartCaptureLoggerProvider(Parcel parcel) {
        String readString = parcel.readString();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", readString);
        this.A00 = 09i.A0A.A04(A0a);
    }

    public IgSmartCaptureLoggerProvider(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }
}
