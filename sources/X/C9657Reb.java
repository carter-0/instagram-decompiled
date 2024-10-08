package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Reb  reason: case insensitive filesystem */
public abstract class C9657Reb {
    public static final CharSequence A00(Context context, String str, String str2, boolean z) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        SR9 sr9 = new SR9();
        sr9.A03(str2);
        sr9.A01 = 2131961394;
        SR9.A02(sr9, "[[developer_terms_token]]", A1C);
        QmZ A00 = C9671Rep.A00(context, ImmutableList.copyOf((Collection) A1C), str, z);
        C12468Sv0 sv0 = new C12468Sv0(context, 10);
        0qQ.A0B(sv0, 0);
        return A00.A01(sv0, false);
    }
}
