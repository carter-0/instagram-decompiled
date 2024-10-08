package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.EcF  reason: case insensitive filesystem */
public abstract class C48296EcF {
    public static Fragment A00(Context context) {
        0hq supportFragmentManager;
        List A04;
        FragmentActivity A00 = C334957c9.A00(context, FragmentActivity.class);
        if (A00 == null || (supportFragmentManager = A00.getSupportFragmentManager()) == null || (A04 = supportFragmentManager.A0U.A04()) == null || A04.isEmpty()) {
            return null;
        }
        return (Fragment) A04.get(A04.size() - 1);
    }
}
