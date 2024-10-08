package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.EqV  reason: case insensitive filesystem */
public abstract class C49164EqV {
    public static void A00(AnonymousClass0iw r6, C49606EzP ezP, G9S g9s, boolean z) {
        View view = ezP.A00;
        Context context = view.getContext();
        DbU.A12(context, view, 2131962574);
        2eS.A01(view);
        String Bgx = g9s.Bgx();
        IgImageView igImageView = ezP.A03;
        if (Bgx == null) {
            DbU.A13(context, igImageView, R.drawable.empty_state_follow_avatar);
        } else {
            DbV.A1P(r6, igImageView, g9s.Bgx());
        }
        if (z) {
            int A03 = (DbS.A03(context.getResources(), R.dimen.abc_list_item_height_material) - DbS.A03(context.getResources(), R.dimen.action_button_settings_height)) / 2;
            ViewGroup.MarginLayoutParams A0D = DbS.A0D(igImageView);
            A0D.setMargins(A03, 0, 0, 0);
            A0D.width = (int) DbU.A00(context, R.dimen.action_button_settings_height);
            A0D.height = (int) DbU.A00(context, R.dimen.action_button_settings_height);
            igImageView.setLayoutParams(A0D);
        }
        igImageView.setVisibility(0);
        DbT.A18(context, ezP.A02, 2131963228);
        int BnA = g9s.BnA();
        TextView textView = ezP.A01;
        if (BnA > 0) {
            C49018Enu.A00(textView, Integer.toString(g9s.BnA()));
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        if (z) {
            ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(textView);
            A0D2.setMarginStart(55);
            A0D2.setMargins(0, 0, 0, 33);
            textView.setLayoutParams(A0D2);
        }
    }
}
