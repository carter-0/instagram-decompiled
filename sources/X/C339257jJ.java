package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import java.util.List;

/* renamed from: X.7jJ  reason: invalid class name and case insensitive filesystem */
public final class C339257jJ {
    public LOZ A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A00(0eO.A02, C339277jL.A00);

    public static final Dc2 A00(String str, String str2, String str3) {
        C310336ap r1 = new C310336ap();
        r1.A04();
        r1.A0H = str;
        r1.A0D = str2;
        r1.A0I = str3;
        r1.A01 = 5000;
        r1.A0J = true;
        return r1.A00();
    }

    public static final List A01(Context context, int i, int i2) {
        String string = context.getString(i);
        0qQ.A07(string);
        InfoItem infoItem = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_photo_pano_outline_24), Integer.valueOf(2Yu.A08(context)), string, (String) null);
        String string2 = context.getString(i2);
        0qQ.A07(string2);
        InfoItem infoItem2 = new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_collage_pano_outline_24), Integer.valueOf(2Yu.A08(context)), string2, (String) null);
        String string3 = context.getString(2131974016);
        0qQ.A07(string3);
        return 0sr.A1P(new InfoItem[]{infoItem, infoItem2, new InfoItem(new IconConfig.SimpleIconConfig(R.drawable.instagram_settings_pano_outline_24), Integer.valueOf(2Yu.A08(context)), string3, (String) null)});
    }
}
