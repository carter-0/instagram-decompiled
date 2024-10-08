package X;

import android.content.Context;
import java.util.regex.Pattern;

/* renamed from: X.Mhj  reason: case insensitive filesystem */
public final class C67068Mhj extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67068Mhj(Context context, int i, int i2, int i3, int i4) {
        super(0);
        this.A00 = i4;
        this.A04 = context;
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            Integer num = AnonymousClass05K.A02;
            Pattern compile = Pattern.compile("(^>>> ?)((.|(\\r\\n)|\\r|\\n)*?\\S(.|(\\r\\n)|\\r|\\n)*?)(^<<<)\\s*?", 8);
            0qQ.A07(compile);
            return new C67071Mhm(C67071Mhm.A06, new C71790Oqr((Context) this.A04, this.A03, this.A02, this.A01), num, compile, true, true);
        }
        Integer num2 = AnonymousClass05K.A1I;
        Pattern compile2 = Pattern.compile("((^> )(.*\\S.*)((\\r\\n)|\\r|\\n)?)(^> ?(.*)((\\r\\n)|\\r|\\n)?)*", 8);
        0qQ.A07(compile2);
        return new C67071Mhm(new C67280MlF(3), new C71790Oqr((Context) this.A04, this.A03, this.A02, this.A01), num2, compile2, true, false);
    }
}
