package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Q9n  reason: case insensitive filesystem */
public abstract class C7376Q9n extends LinearLayout {
    public C7376Q9n(Context context) {
        super(context, (AttributeSet) null, 0, 0);
        setOrientation(1);
        setBackground(C9572RdC.A00(DbU.A00(context, R.dimen.abc_edit_text_inset_top_material), DbU.A00(context, R.dimen.abc_edit_text_inset_top_material), 0.0f, 0.0f, C11408SSf.A01(context, R.attr.sc_popover_background)));
        setOnClickListener(C11491SbE.A00);
    }

    public final void setSubtitleText(String str) {
        0qQ.A0B(str, 0);
        SKW.A02(this, R.id.sc_cancel_action_sheet_subtitle).setText(str);
    }

    public final void setTitleText(String str) {
        0qQ.A0B(str, 0);
        SKW.A02(this, R.id.sc_cancel_action_sheet_title).setText(str);
    }

    public final void A00(Context context) {
        View A00 = SKW.A00(this, R.id.sc_action_sheet_view_pin);
        int A01 = C11408SSf.A01(context, R.attr.sc_popover_handle);
        float A06 = Pxj.A06(context) / 2.0f;
        A00.setBackground(C9572RdC.A00(A06, A06, A06, A06, A01));
    }

    public final void setupCancelButton(String str, View.OnClickListener onClickListener) {
        AnonymousClass7TG.A1N(str, onClickListener);
        TextView A02 = SKW.A02(this, R.id.sc_action_sheet_cancel_button);
        A02.setText(str);
        A02.setOnClickListener(onClickListener);
    }

    public final void setupDestructiveButton(String str, View.OnClickListener onClickListener) {
        AnonymousClass7TG.A1N(str, onClickListener);
        TextView A02 = SKW.A02(this, R.id.sc_action_sheet_destructive_button);
        A02.setText(str);
        A02.setOnClickListener(onClickListener);
    }
}
