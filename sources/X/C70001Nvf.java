package X;

import android.os.Bundle;

/* renamed from: X.Nvf  reason: case insensitive filesystem */
public abstract class C70001Nvf {
    public static final NIF A00(String str, String str2) {
        NIF nif = new NIF();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("key_thread_id", str2);
        A0a.putString("key_entry_point", str);
        nif.setArguments(A0a);
        return nif;
    }
}
