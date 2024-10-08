package X;

import android.view.View;
import com.google.common.collect.ImmutableList;

public final class Qms extends C11188SEo {
    public final int A00;
    public final int A01;
    public final int A02;
    public final View.OnClickListener A03;
    public final String A04;

    public static void A00(Qmj qmj, ImmutableList.Builder builder) {
        builder.add(new Qms(qmj));
    }

    public Qms(Qmj qmj) {
        super((C9130RQe) qmj);
        this.A04 = qmj.A04;
        this.A02 = qmj.A02;
        this.A00 = qmj.A00;
        this.A03 = qmj.A03;
        this.A01 = qmj.A01;
    }
}
