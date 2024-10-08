package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.instagram.android.R;

/* renamed from: X.NvR  reason: case insensitive filesystem */
public abstract class C69987NvR {
    public static final float A00(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.cluster_item_horizontal_overlap_factor, typedValue, true);
        int i = typedValue.type;
        if (i == 4) {
            return typedValue.getFloat();
        }
        throw new Resources.NotFoundException(002.A11("Resource ID #0x", Integer.toHexString(R.dimen.cluster_item_horizontal_overlap_factor), " type #0x", Integer.toHexString(i), AnonymousClass000.A00(834)));
    }
}
