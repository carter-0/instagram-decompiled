package X;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Map;

public final class T96 implements FilenameFilter {
    public final /* synthetic */ C11283SJb A00;
    public final /* synthetic */ String A01;

    public T96(C11283SJb sJb, String str) {
        this.A00 = sJb;
        this.A01 = str;
    }

    public final boolean accept(File file, String str) {
        0qQ.A0B(str, 1);
        C11283SJb sJb = this.A00;
        Map map = C11283SJb.A06;
        if (!C66580MXl.A1a(sJb.A02, 1, str) || !str.endsWith(this.A01)) {
            return false;
        }
        return true;
    }
}
