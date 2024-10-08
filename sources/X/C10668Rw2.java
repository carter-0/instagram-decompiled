package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.Rw2  reason: case insensitive filesystem */
public final class C10668Rw2 {
    public final int A00;
    public final File A01;
    public final C11194SEu A02;
    public final File A03;

    public C10668Rw2(Context context) {
        0qQ.A0B(context, 1);
        this.A01 = AnonymousClass1BA.A00(context).AXT((1LJ) null, 998546933);
        this.A03 = AnonymousClass1BA.A00(context).AXT((1LJ) null, 964705811);
        C11194SEu A002 = C11194SEu.A00(context);
        this.A02 = A002;
        this.A00 = A002.A02.getInt("native_version_override", A002.A01);
    }
}
