package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.appreciation.analytics.LoggingData;

/* renamed from: X.KqO  reason: case insensitive filesystem */
public abstract class C63033KqO {
    public static final LoggingData A00(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("appreciation_logging_data");
        if (parcelable != null) {
            return (LoggingData) parcelable;
        }
        throw AnonymousClass7TE.A0y();
    }
}
