package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Dek  reason: case insensitive filesystem */
public final class C46423Dek implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C323326xJ A03;
    public final /* synthetic */ List A04;

    public C46423Dek(Context context, View view, UserSession userSession, C323326xJ r4, List list) {
        this.A03 = r4;
        this.A00 = context;
        this.A02 = userSession;
        this.A04 = list;
        this.A01 = view;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1110772396);
        this.A03.BhL().D2d("tap_dropdown_menu", "user_profile_header");
        Context context = this.A00;
        UserSession userSession = this.A02;
        List<C3250670x> list = this.A04;
        View view2 = this.A01;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C3250670x r0 : list) {
            A0r.add(new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new C50485FcX(context, r0), (Integer) null, r0.Air(), 0, 0, 0, false, false, false, true, false, false, false));
        }
        C355148Ov r6 = new C355148Ov(context, userSession, (Integer) null, false);
        r6.A02(A0r);
        r6.getContentView().measure(0, 0);
        r6.showAsDropDown(view2, (-r6.getContentView().getMeasuredWidth()) + context.getResources().getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width), context.getResources().getDimensionPixelOffset(R.dimen.audience_lists_text_in_badge_horizontal_margin_right) * 2);
        AnonymousClass0fD.A0C(1642769814, A05);
    }
}
