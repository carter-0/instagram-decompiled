package X;

import android.os.Environment;
import android.os.StatFs;

public final class TVR extends 0Yg implements C62320sa {
    public static final TVR A00 = new TVR();

    public TVR() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        return new StatFs(Environment.getDataDirectory().getPath());
    }
}
