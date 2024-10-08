package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.NPh  reason: case insensitive filesystem */
public final class C68611NPh extends C232232tF {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.direct_text_message_text_view, viewGroup, false);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.addView(inflate);
        return new C67992MyK(linearLayout, this.A00, this);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r15, C249703kE r16) {
        N5X n5x = (N5X) r15;
        C67992MyK myK = (C67992MyK) r16;
        AnonymousClass7TG.A1N(n5x, myK);
        LinearLayout linearLayout = myK.A01;
        TextView A0B = DbW.A0B(linearLayout, R.id.direct_text_message_text_view);
        AnonymousClass7L2 r8 = n5x.A00;
        C328637Fo r7 = C328637Fo.NONE;
        Drawable drawable = myK.A00;
        AnonymousClass7FB.A06(drawable, (AnonymousClass5FV) null, r7, r8, false, false, false, false, false);
        A0B.setText(n5x.A01);
        Context A0S = AnonymousClass7TE.A0S(linearLayout);
        C66580MXl.A1F(A0B, A0S);
        A0B.setTextColor(AnonymousClass7FB.A01(r8, false));
        int A02 = DbS.A02(A0S, 12);
        int A022 = DbS.A02(A0S, 10);
        A0B.setBackground(drawable);
        A0B.setPadding(A02, A022, A02, A022);
        linearLayout.setGravity(8388613);
        DbY.A0z(linearLayout);
    }

    public final Class modelClass() {
        return N5X.class;
    }

    public C68611NPh(UserSession userSession) {
        this.A00 = userSession;
    }
}
