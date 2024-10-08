package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.HsT  reason: case insensitive filesystem */
public final class C56080HsT {
    public final LinearLayout A00;
    public final boolean A01;

    public C56080HsT(LinearLayout linearLayout, boolean z) {
        0qQ.A0B(linearLayout, 1);
        this.A00 = linearLayout;
        this.A01 = z;
        linearLayout.setVisibility(z ? 8 : 4);
    }

    public final void A01(Context context, C54665HMw hMw, C59611JQf jQf) {
        String string;
        View.OnClickListener A002;
        0qQ.A0B(hMw, 1);
        if (hMw == C54665HMw.ALL_MEDIA_AUTO_COLLECTION) {
            A00(context, C56802ICz.A00(jQf, 68), context.getString(2131975988));
            string = context.getString(2131972535);
            A002 = C56802ICz.A00(jQf, 69);
        } else {
            A00(context, C56802ICz.A00(jQf, 70), context.getString(2131972043));
            string = context.getString(2131966744);
            A002 = ID1.A00(jQf, 0);
        }
        A00(context, A002, string);
    }

    public final void A02(boolean z) {
        LinearLayout linearLayout = this.A00;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            linearLayout.getChildAt(i).setEnabled(z);
        }
    }

    public final void A00(Context context, View.OnClickListener onClickListener, String str) {
        LayoutInflater from = LayoutInflater.from(context);
        LinearLayout linearLayout = this.A00;
        View inflate = from.inflate(R.layout.save_collection_bulk_edit_button, linearLayout, false);
        0qQ.A0C(inflate, C66579MXk.A00(147));
        IgdsButton igdsButton = (IgdsButton) inflate;
        igdsButton.setText(str);
        igdsButton.setEnabled(false);
        AnonymousClass0fU.A00(onClickListener, igdsButton);
        linearLayout.addView(igdsButton);
    }
}
