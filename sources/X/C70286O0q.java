package X;

import android.content.Context;
import com.instagram.friendmap.data.MapText;
import java.util.Arrays;

/* renamed from: X.O0q  reason: case insensitive filesystem */
public abstract class C70286O0q {
    public static final String A00(Context context, MapText mapText) {
        if (mapText instanceof MapText.Res) {
            if (context != null) {
                MapText.Res res = (MapText.Res) mapText;
                int i = res.A00;
                String[] strArr = res.A01;
                String string = context.getString(i, Arrays.copyOf(strArr, strArr.length));
                if (string == null) {
                    return "";
                }
                return string;
            }
            return "";
        } else if (mapText instanceof MapText.Raw) {
            return ((MapText.Raw) mapText).A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
