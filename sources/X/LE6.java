package X;

import android.content.Context;
import java.util.Arrays;

public final class LE6 {
    public Integer A00;
    public String A01;
    public Object[] A02 = new Object[0];
    public C310346aq A03 = C310346aq.DEFAULT;
    public final C62320sa A04;
    public final int A05;
    public final MVB A06 = new C65358Lry(this, 4);
    public final Integer A07;

    public LE6(Integer num, C62320sa r4, int i) {
        this.A05 = i;
        this.A07 = num;
        this.A04 = r4;
    }

    public final AnonymousClass3GP A00(Context context) {
        C310336ap A0a = DbS.A0a();
        A0a.A0C(this.A03);
        A0a.A06();
        A0a.A0F = AnonymousClass05K.A01;
        String str = this.A01;
        if (str == null) {
            int i = this.A05;
            Object[] objArr = this.A02;
            str = context.getString(i, Arrays.copyOf(objArr, objArr.length));
            0qQ.A07(str);
        }
        A0a.A0D = str;
        Integer num = this.A00;
        if (num != null) {
            int intValue = num.intValue();
            A0a.A02();
            A0a.A07(intValue);
        }
        Integer num2 = this.A07;
        if (num2 != null) {
            DbW.A0q(context, A0a, num2.intValue());
            A0a.A0L = true;
            A0a.A0A(this.A06);
        }
        return new AnonymousClass3GP(A0a.A00());
    }
}
