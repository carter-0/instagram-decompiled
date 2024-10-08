package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.appreciation.analytics.creator.CreatorLoggingData;

/* renamed from: X.KqR  reason: case insensitive filesystem */
public abstract class C63036KqR {
    public static final CreatorLoggingData A00(Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("appreciation_creator_logging_data");
        if (parcelable != null) {
            return (CreatorLoggingData) parcelable;
        }
        throw AnonymousClass7TE.A0y();
    }
}
