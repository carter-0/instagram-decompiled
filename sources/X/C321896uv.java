package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import com.instagram.android.R;

/* renamed from: X.6uv  reason: invalid class name and case insensitive filesystem */
public final class C321896uv implements AnonymousClass1qK {
    public final int A00;

    public final AnonymousClass3GP A00(Activity activity, Context context) {
        C310336ap r4 = new C310336ap();
        r4.A02();
        r4.A04 = activity.getDrawable(R.drawable.instagram_direct_pano_outline_24);
        Resources resources = context.getResources();
        int i = this.A00;
        r4.A0D = resources.getQuantityString(R.plurals.rff_message_sent_confirmation, i, new Object[]{Integer.valueOf(i)});
        return new AnonymousClass3GP(r4.A00());
    }

    public C321896uv(int i) {
        this.A00 = i;
    }
}
