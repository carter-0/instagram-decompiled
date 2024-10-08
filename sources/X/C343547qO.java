package X;

import android.graphics.RectF;
import android.os.Bundle;

/* renamed from: X.7qO  reason: invalid class name and case insensitive filesystem */
public abstract class C343547qO {
    public static C343537qN A00;

    public static Bundle A00(RectF rectF, EWD ewd, boolean z) {
        Bundle bundle = new Bundle();
        if (rectF != null) {
            bundle.putParcelable(AnonymousClass000.A00(2379), rectF);
        }
        bundle.putSerializable(AnonymousClass000.A00(2378), ewd);
        bundle.putBoolean(AnonymousClass000.A00(2380), z);
        return bundle;
    }
}
