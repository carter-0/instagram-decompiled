package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Jbl  reason: case insensitive filesystem */
public final class C59922Jbl {
    public int A00;
    public View.OnClickListener A01;
    public String A02;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Jbl, java.lang.Object] */
    public static C59922Jbl A00(Object obj) {
        0qQ.A0B(obj, 0);
        return new Object();
    }

    public static void A01(Resources resources, C59922Jbl jbl, int i) {
        jbl.A02 = resources.getString(i);
        jbl.A00 = R.drawable.instagram_arrow_back_24;
    }

    public static void A02(Resources resources, C59922Jbl jbl, int i) {
        jbl.A02 = resources.getString(i);
    }
}
