package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class J0J extends 0Yg implements 0sP {
    public static final J0J A00 = new J0J();

    public J0J() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        0qQ.A0B(context, 0);
        View A09 = DbU.A09(LayoutInflater.from(context), (ViewGroup) null, R.layout.reel_item_story_unit, false);
        AnonymousClass3N1 r0 = new AnonymousClass3N1(A09);
        A09.setTag(r0);
        return r0.itemView;
    }
}
