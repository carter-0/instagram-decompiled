package X;

import android.content.Context;
import android.text.Editable;
import android.util.DisplayMetrics;
import java.util.List;
import java.util.regex.Matcher;

/* renamed from: X.MlG  reason: case insensitive filesystem */
public final class C67281MlG implements C74300PsZ {
    public final int A00;
    public final int A01;
    public final Object A02;

    public C67281MlG(Context context, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A02 = context;
    }

    public final List AN4(C70644OEq oEq) {
        Integer num;
        Object nEi;
        int i = this.A00;
        0qQ.A0B(oEq, 0);
        if (i != 0) {
            Editable editable = oEq.A02;
            int i2 = oEq.A01;
            int i3 = oEq.A00;
            int i4 = this.A01;
            DisplayMetrics A0E = AnonymousClass7TF.A0E((Context) this.A02);
            0qQ.A07(A0E);
            nEi = new C68382NEj(editable, A0E, i2, i3, i4);
        } else {
            int i5 = 0;
            Matcher matcher = O41.A00.matcher(oEq.A02.subSequence(oEq.A01, oEq.A00));
            matcher.find();
            String group = matcher.group(1);
            if (group == null || (i5 = Math.min(3, group.length() / 4)) == 0) {
                num = AnonymousClass05K.A00;
            } else {
                num = AnonymousClass05K.A01;
            }
            int i6 = this.A01;
            DisplayMetrics A0E2 = AnonymousClass7TF.A0E((Context) this.A02);
            0qQ.A07(A0E2);
            nEi = new C68381NEi(A0E2, num, i5, i6);
        }
        return AnonymousClass7TE.A1I(nEi);
    }
}
