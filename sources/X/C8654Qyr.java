package X;

import com.facebook.common.locale.LocaleMember;
import java.util.Locale;

/* renamed from: X.Qyr  reason: case insensitive filesystem */
public final class C8654Qyr extends C368338sS {
    public final int A00;
    public final Object A01;

    public C8654Qyr(C11179SEf sEf, int i) {
        this.A00 = i;
        this.A01 = sEf;
    }

    public final /* bridge */ /* synthetic */ Object A01(Object obj) {
        if (this.A00 != 0) {
            return new LocaleMember((Locale) ((C11179SEf) this.A01).A02.A00.A02(obj));
        }
        return new Locale("", (String) obj);
    }
}
