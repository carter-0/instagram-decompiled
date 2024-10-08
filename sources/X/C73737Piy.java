package X;

import android.os.Environment;
import android.os.StatFs;

/* renamed from: X.Piy  reason: case insensitive filesystem */
public final class C73737Piy extends 0Yg implements C62320sa {
    public static final C73737Piy A00 = new C73737Piy();

    public C73737Piy() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }
}
