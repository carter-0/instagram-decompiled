package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

/* renamed from: X.Aoj  reason: case insensitive filesystem */
public final class C41123Aoj implements Runnable {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C334347b7 A01;
    public final /* synthetic */ C62320sa A02;

    public C41123Aoj(FragmentActivity fragmentActivity, C334347b7 r2, C62320sa r3) {
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        if (this.A00 != null) {
            C334347b7 r5 = this.A01;
            int[] iArr = new int[2];
            View view = r5.A01;
            view.getLocationOnScreen(iArr);
            Context context = view.getContext();
            int dimensionPixelSize = iArr[1] - context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            if (dimensionPixelSize > 0) {
                r5.A0B.setDropDownHeight(dimensionPixelSize);
            } else {
                r5.A0B.setDropDownHeight(context.getResources().getDimensionPixelSize(R.dimen.clips_viewer_recommend_clips_height));
            }
        }
        this.A02.invoke();
    }
}
