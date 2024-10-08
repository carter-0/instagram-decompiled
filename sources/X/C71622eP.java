package X;

import android.content.Context;
import android.content.res.TypedArray;

/* renamed from: X.2eP  reason: invalid class name and case insensitive filesystem */
public abstract class C71622eP {
    public static String A00(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            return context.getString(resourceId);
        }
        return typedArray.getNonResourceString(i);
    }
}
