package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.F1s  reason: case insensitive filesystem */
public final class C49683F1s {
    public final Context A00;

    public final FYL A00(C47326Dut dut) {
        String str;
        String string;
        Context context;
        int i;
        C47326Dut dut2 = dut;
        ImageUrl imageUrl = dut.A01;
        if (dut.A00 == 0) {
            str = dut.A05;
            string = dut.A03;
        } else {
            str = dut.A03;
            string = this.A00.getString(2131961885);
        }
        if (dut.A08 || dut.A07) {
            context = this.A00;
            i = 2131953913;
        } else {
            context = this.A00;
            i = 2131953909;
        }
        return new FYL(imageUrl, dut2, str, string, context.getString(i), dut.A04);
    }

    public C49683F1s(Context context) {
        this.A00 = context;
    }
}
