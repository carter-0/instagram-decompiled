package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import java.util.LinkedList;

/* renamed from: X.HJs  reason: case insensitive filesystem */
public final class C54583HJs extends C54010Gxs {
    public final C316246lL A00;
    public final LinkedList A01;
    public final IgTextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54583HJs(View view, UserSession userSession) {
        super(view);
        boolean A1Y = DbW.A1Y(userSession);
        this.A02 = Dba.A0E(view, R.id.title);
        C316246lL r3 = new C316246lL((ViewStub) AnonymousClass7TE.A0b(view, R.id.shuffle_layout), (ViewStub) AnonymousClass7TE.A0b(view, R.id.shuffle_layout), userSession);
        this.A00 = r3;
        LinkedList linkedList = new LinkedList();
        this.A01 = linkedList;
        linkedList.add(new C57457Ib1(AnonymousClass7TE.A0b(view, R.id.top_start_card)));
        linkedList.add(new C57457Ib1(AnonymousClass7TE.A0b(view, R.id.top_end_card)));
        linkedList.add(new C57457Ib1(AnonymousClass7TE.A0b(view, R.id.bottom_start_card)));
        linkedList.add(new C57457Ib1(AnonymousClass7TE.A0b(view, R.id.bottom_end_card)));
        r3.A01();
        TextView textView = r3.A07;
        if (textView != null) {
            DbT.A18(view.getContext(), textView, 2131955340);
        }
        ImageView imageView = r3.A05;
        if (imageView != null) {
            imageView.setImageDrawable(r3.A09);
        }
        View view2 = r3.A02;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
            }
            view2.setLayoutParams(layoutParams);
            if (view2 instanceof LinearLayout) {
                ((LinearLayout) view2).setGravity(A1Y ? 1 : 0);
            }
            view2.setBackgroundResource(R.drawable.clips_viewer_suggested_creators_shuffle_background);
        }
        TextView textView2 = r3.A07;
        if (textView2 != null) {
            DbT.A17(textView2.getContext(), textView2, R.color.design_dark_default_color_on_background);
        }
    }
}
