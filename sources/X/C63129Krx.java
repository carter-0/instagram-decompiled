package X;

import android.os.Bundle;

/* renamed from: X.Krx  reason: case insensitive filesystem */
public abstract class C63129Krx {
    public static final K5S A00(Integer num, String str, boolean z) {
        K5S k5s = new K5S();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("args_file_path", str);
        A0a.putString("args_entry_point", C63131Krz.A00(num));
        A0a.putBoolean("from_create_btn", z);
        k5s.setArguments(A0a);
        return k5s;
    }
}
