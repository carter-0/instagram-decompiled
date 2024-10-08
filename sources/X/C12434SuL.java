package X;

import android.content.Context;
import com.facebook.iabadscontext.DisclaimerBodyUrlRanges;
import com.facebook.iabadscontext.DisclaimerText;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.SuL  reason: case insensitive filesystem */
public final class C12434SuL implements C13895TjI {
    public final int A00;
    public final int A01;
    public final DisclaimerBodyUrlRanges A02;
    public final String A03;
    public final String A04;

    public final int AtB() {
        return this.A00;
    }

    public final int AtF() {
        return this.A01;
    }

    public final String getDescription() {
        return this.A03;
    }

    public final String getText() {
        return this.A04;
    }

    public C12434SuL(Context context, DisclaimerText disclaimerText) {
        int i;
        String string;
        List list = disclaimerText.A01;
        DisclaimerBodyUrlRanges disclaimerBodyUrlRanges = list != null ? (DisclaimerBodyUrlRanges) 00k.A0J(list) : null;
        this.A02 = disclaimerBodyUrlRanges;
        int i2 = 0;
        if (disclaimerBodyUrlRanges != null) {
            i = disclaimerBodyUrlRanges.A01;
        } else {
            i = 0;
        }
        this.A00 = i;
        this.A01 = i + (disclaimerBodyUrlRanges != null ? disclaimerBodyUrlRanges.A00 : i2);
        String str = disclaimerText.A00;
        String str2 = "";
        this.A04 = str == null ? str2 : str;
        if (!(context == null || (string = context.getString(R.string.f0nameremoved)) == null)) {
            str2 = string;
        }
        this.A03 = str2;
    }
}
