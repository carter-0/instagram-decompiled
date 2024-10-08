package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* renamed from: X.73m  reason: invalid class name */
public abstract class AnonymousClass73m {
    public static final Comparator A00 = AnonymousClass73o.A00;
    public static final Comparator A01 = C3256473n.A00;

    public static final String A00(Context context, int i) {
        Integer valueOf = Integer.valueOf(i);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        String quantityString = context.getResources().getQuantityString(R.plurals.direct_activity_indicator_seen_by_count, i, new Object[]{C253673rC.A04(resources, valueOf, IgNetworkConsentStorage.MAX_ENTRIES, true, false)});
        0qQ.A07(quantityString);
        return quantityString;
    }

    public static final List A01(Set set) {
        if (set == null || set.isEmpty()) {
            return 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(set);
        01V.A1D(arrayList, A01);
        return arrayList;
    }
}
