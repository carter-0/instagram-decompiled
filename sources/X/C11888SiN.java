package X;

import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: X.SiN  reason: case insensitive filesystem */
public final class C11888SiN implements C13812Thf {
    public Object A00;
    public final C13767Tgf A01;
    public final File A02;

    public final void cancel() {
    }

    public final Class AvH() {
        return this.A01.AvH();
    }

    public final Integer AvP() {
        return AnonymousClass05K.A00;
    }

    public final void CgB(RE3 re3, C13692TfA tfA) {
        try {
            Object E0g = this.A01.E0g(this.A02);
            this.A00 = E0g;
            tfA.D7o(E0g);
        } catch (FileNotFoundException e) {
            Log.isLoggable("FileLoader", 3);
            tfA.DOG(e);
        }
    }

    public final void cleanup() {
        Object obj = this.A00;
        if (obj != null) {
            try {
                this.A01.AI2(obj);
            } catch (IOException unused) {
            }
        }
    }

    public C11888SiN(C13767Tgf tgf, File file) {
        this.A02 = file;
        this.A01 = tgf;
    }
}
