package X;

import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* renamed from: X.TLg  reason: case insensitive filesystem */
public final class C13099TLg implements Comparator {
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        int i = activityTransition.A00;
        int i2 = activityTransition2.A00;
        if (i == i2 && (i = activityTransition.A01) == (i2 = activityTransition2.A01)) {
            return 0;
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }
}
