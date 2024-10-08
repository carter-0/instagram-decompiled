package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.UgP  reason: case insensitive filesystem */
public final class C15659UgP extends C14097Tpp {
    public static final void A00(View view, C307786Rm r7, C276544tV r8) {
        boolean A1U = AnonymousClass7TF.A1U(0, view, r7);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.commerce.cpdp.MiniComponentProductTileNameRenderUnit.Holder");
        Context context = r7.A00;
        CharSequence A0H = r8.A0H();
        int A03 = r8.A03(36, A1U ? 1 : 0);
        AnonymousClass0eM r1 = ((C14850UCe) tag).A01;
        JTQ.A0A(r1).setMaxLines(A03);
        boolean A0R = r8.A0R(35, false);
        TextView A0A = JTQ.A0A(r1);
        if (A0R) {
            A0H = TextUtils.concat(new CharSequence[]{A0H, W2t.A00(context)});
        }
        A0A.setText(A0H);
    }

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        return A0J(context);
    }
}
