package X;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public final class AVR implements C13819Thn {
    public final 1B5 A00;
    public final File A01;

    public final boolean Cdx(String str) {
        return false;
    }

    public final long Cf8(String str) {
        return 0;
    }

    public final Collection Aav() {
        String[] list = this.A01.list();
        if (list == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(list);
    }

    public final long[] getItemInformation(String str) {
        File file = new File(this.A01, str);
        return new long[]{0, file.lastModified(), C258893zo.A00(file)};
    }

    public final boolean remove(String str) {
        1B5 r2 = this.A00;
        return r2.A08.A00(new File(this.A01, str));
    }

    public AVR(1B5 r1, File file) {
        this.A00 = r1;
        this.A01 = file;
    }
}
