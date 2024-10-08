package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import org.webrtc.CameraCapturer;

/* renamed from: X.70Y  reason: invalid class name */
public abstract class AnonymousClass70Y {
    public static final void A00(Context context, View.OnTouchListener onTouchListener, View view, View view2, TextView textView, TextView textView2, UserSession userSession, Integer num, String str, C62320sa r14, boolean z) {
        textView.setText(str);
        Resources resources = context.getResources();
        0qQ.A07(resources);
        textView2.setText(C253673rC.A04(resources, num, CameraCapturer.OPEN_CAMERA_TIMEOUT, true, false));
        textView2.setTextColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text)));
        textView.setTextColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_primary_text)));
        if (182.A06(0Tu.A05, userSession, 36326824799713272L)) {
            textView2.setTextSize(0, context.getResources().getDimension(R.dimen.account_group_management_row_text_size));
        }
        if (z) {
            AnonymousClass0fU.A00(new AnonymousClass70Z(r14), view);
            if (view2 != null) {
                AnonymousClass0fU.A00(new AN8(r14), view2);
            }
            03v.A0B(view, new AnonymousClass70a(context, textView2, str));
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
        if (onTouchListener != null) {
            view.setOnTouchListener(onTouchListener);
            if (view2 != null) {
                view2.setOnTouchListener(onTouchListener);
            }
        }
    }
}
