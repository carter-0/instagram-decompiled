package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.SEs  reason: case insensitive filesystem */
public final class C11192SEs {
    public static volatile C11192SEs A03;
    public boolean A00;
    public final C10660Rvu A01;
    public final Set A02 = AnonymousClass7TE.A1F();

    public static C11192SEs A00(Context context) {
        if (A03 == null) {
            synchronized (C11192SEs.class) {
                if (A03 == null) {
                    A03 = new C11192SEs(context.getApplicationContext());
                }
            }
        }
        return A03;
    }

    public C11192SEs(Context context) {
        this.A01 = new C10660Rvu(new C11980Sjv(this), new C12000SkJ(new C11999SkI(context, this)));
    }
}
