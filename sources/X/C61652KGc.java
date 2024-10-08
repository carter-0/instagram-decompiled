package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.KGc  reason: case insensitive filesystem */
public final class C61652KGc extends C232232tF {
    public final AnonymousClass0iw A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.ai_sticker_suggested_prompt, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C61160JyC jyC = (C61160JyC) r4;
        AnonymousClass7TG.A1N(jyC, r5);
        ViewGroup.LayoutParams layoutParams = r5.itemView.getLayoutParams();
        int A02 = AnonymousClass7TG.A02(DbS.A07(r5));
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (jyC.A00 != 0) {
                A02 = 0;
            }
            marginLayoutParams.setMarginStart(A02);
        }
        LY0.A00(r5.itemView, 3, jyC);
        AnonymousClass7TG.A0R(r5.itemView, R.id.suggested_prompt).setText(jyC.A01);
    }

    public final Class modelClass() {
        return C61160JyC.class;
    }

    public C61652KGc(AnonymousClass0iw r1, UserSession userSession) {
        this.A01 = userSession;
        this.A00 = r1;
    }
}
