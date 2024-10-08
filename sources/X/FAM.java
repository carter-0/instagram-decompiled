package X;

import android.content.Context;
import com.instagram.android.R;

public final class FAM {
    public int A00;
    public int A01;
    public String A02;
    public String A03;

    public FAM(String str, String str2, int i, int i2) {
        this.A03 = str;
        this.A02 = str2;
        this.A01 = i;
        this.A00 = i2;
    }

    public static FAM A00(Context context) {
        return new FAM(context.getString(2131963057), context.getString(2131964881), R.drawable.instagram_insights_pano_outline_24, R.drawable.ig_illustrations_illo_user_insights_refresh);
    }
}
