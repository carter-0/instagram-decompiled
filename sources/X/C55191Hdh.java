package X;

import android.content.Context;
import com.instagram.wonderwall.model.WallText;
import java.util.Arrays;

/* renamed from: X.Hdh  reason: case insensitive filesystem */
public abstract /* synthetic */ class C55191Hdh {
    public static String A00(Context context, WallText wallText) {
        0qQ.A0B(context, 1);
        if (wallText instanceof WallText.Res) {
            WallText.Res res = (WallText.Res) wallText;
            int i = res.A00;
            String[] strArr = res.A01;
            String string = context.getString(i, Arrays.copyOf(strArr, strArr.length));
            0qQ.A07(string);
            return string;
        } else if (wallText instanceof WallText.Raw) {
            return ((WallText.Raw) wallText).A00;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
