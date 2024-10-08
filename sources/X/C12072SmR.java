package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.SmR  reason: case insensitive filesystem */
public final class C12072SmR implements AnonymousClass9DN {
    public static volatile AnonymousClass9DN A02;
    public File A00;
    public final AnonymousClass1BA A01;

    public final File Bnd(String str) {
        File file = this.A00;
        if (file == null) {
            file = this.A01.AXT((1LJ) null, 756778003);
            this.A00 = file;
        }
        return JTO.A0s(file, str);
    }

    public C12072SmR(Context context) {
        this.A01 = AnonymousClass1BA.A00(context);
    }

    public final File CNS(String str) {
        return Bnd(str);
    }

    public final boolean remove(String str) {
        File Bnd = Bnd(str);
        if (!Bnd.exists()) {
            return false;
        }
        return Bnd.delete();
    }

    public C12072SmR() {
    }
}
