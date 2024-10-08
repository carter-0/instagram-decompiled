package X;

import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.Ig2  reason: case insensitive filesystem */
public final class C57761Ig2 implements Runnable {
    public final /* synthetic */ Context A00;

    public C57761Ig2(Context context) {
        this.A00 = context;
    }

    public final void run() {
        1xC r4 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        Context context = this.A00;
        DbS.A19(context, A0a, 2131972264);
        A0a.A02();
        A0a.A07(R.drawable.instagram_circle_check_pano_outline_24);
        A0a.A0J = true;
        A0a.A06();
        A0a.A02 = context.getResources().getDimensionPixelOffset(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        A0a.A0R = true;
        DbY.A1K(r4, A0a);
    }
}
