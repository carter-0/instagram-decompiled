package X;

import android.content.Context;
import android.os.Build;
import android.os.PerformanceHintManager;

/* renamed from: X.TVo  reason: case insensitive filesystem */
public final class C13341TVo extends 0Yg implements C62320sa {
    public static final C13341TVo A00 = new C13341TVo();

    public C13341TVo() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context;
        if (Build.VERSION.SDK_INT < 31 || (context = C60960kU.A00) == null) {
            return null;
        }
        return context.getSystemService(PerformanceHintManager.class);
    }
}
