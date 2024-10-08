package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import java.util.Arrays;

/* renamed from: X.HvT  reason: case insensitive filesystem */
public abstract class C56259HvT {
    public static final String A00(Resources resources, C56078HsR hsR) {
        String string;
        0qQ.A0B(hsR, 1);
        Object[] objArr = hsR.A01;
        int length = objArr.length;
        if (length == 0) {
            string = resources.getString(hsR.A00);
        } else {
            string = resources.getString(hsR.A00, Arrays.copyOf(objArr, length));
        }
        0qQ.A0A(string);
        return string;
    }

    public static final String A01(Fragment fragment, C56078HsR hsR) {
        AnonymousClass7TG.A1N(fragment, hsR);
        Resources A05 = DbV.A05(fragment);
        0qQ.A07(A05);
        return A00(A05, hsR);
    }
}
