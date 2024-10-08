package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WGa  reason: case insensitive filesystem */
public final class C18999WGa implements 0Gx {
    public final List A00 = new ArrayList();
    public final /* synthetic */ C18998WFz A01;

    public final void E3M(File file) {
    }

    public final void E3R(File file) {
    }

    public C18999WGa(C18998WFz wFz) {
        this.A01 = wFz;
    }

    public final void FN8(File file) {
        C18998WFz wFz = this.A01;
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf > 0) {
            String substring = name.substring(lastIndexOf);
            String str = ".cnt";
            String str2 = str;
            if (!str.equals(substring)) {
                str = ".tmp";
                if (!str.equals(substring)) {
                    return;
                }
            }
            String substring2 = name.substring(0, lastIndexOf);
            if (str.equals(".tmp")) {
                int lastIndexOf2 = substring2.lastIndexOf(46);
                if (lastIndexOf2 > 0) {
                    substring2 = substring2.substring(0, lastIndexOf2);
                } else {
                    return;
                }
            }
            String valueOf = String.valueOf(Math.abs(substring2.hashCode() % 100));
            StringBuilder sb = new StringBuilder();
            sb.append(wFz.A02);
            if (new File(Pxg.A0s(File.separator, valueOf, sb)).equals(file.getParentFile()) && str == str2) {
                this.A00.add(new C17847Vh0(substring2, file));
            }
        }
    }
}
