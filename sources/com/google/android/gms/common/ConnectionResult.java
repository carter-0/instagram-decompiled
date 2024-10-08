package com.google.android.gms.common;

import X.002;
import X.AnonymousClass000;
import X.C301145yd;
import X.C376409Hw;
import X.Pxd;
import X.S4O;
import X.SA1;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.webrtc.EglBase14Impl;

public final class ConnectionResult extends AbstractSafeParcelable {
    public static final ConnectionResult A04 = new ConnectionResult(0);
    public static final Parcelable.Creator CREATOR = new C376409Hw(41);
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final String A03;

    public ConnectionResult(int i) {
        this((PendingIntent) null, (String) null, 1, i);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ConnectionResult) {
                ConnectionResult connectionResult = (ConnectionResult) obj;
                if (this.A01 != connectionResult.A01 || !SA1.A01(this.A02, connectionResult.A02) || !SA1.A01(this.A03, connectionResult.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static String A00(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return Pxd.A00(557);
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return AnonymousClass000.A00(983);
            case 8:
                return AnonymousClass000.A00(959);
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return Pxd.A00(468);
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return 002.A0c("UNKNOWN_ERROR_CODE(", ")", i);
                }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A01), this.A02, this.A03});
    }

    public final String toString() {
        S4O s4o = new S4O(this);
        s4o.A00(A00(this.A01), "statusCode");
        s4o.A00(this.A02, "resolution");
        s4o.A00(this.A03, DialogModule.KEY_MESSAGE);
        return s4o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        int A012 = C301145yd.A01(parcel, 20293);
        C301145yd.A05(parcel, i2);
        C301145yd.A07(parcel, 2, this.A01);
        C301145yd.A0A(parcel, this.A02, 3, i, false);
        C301145yd.A0C(parcel, this.A03, 4, false);
        C301145yd.A06(parcel, A012);
    }

    public ConnectionResult(PendingIntent pendingIntent, String str, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = pendingIntent;
        this.A03 = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(pendingIntent, (String) null, 1, i);
    }
}
