package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Oiv  reason: case insensitive filesystem */
public final class C71346Oiv implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C52971GgO A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass4DU A03;

    public C71346Oiv(Context context, C52971GgO ggO, UserSession userSession, AnonymousClass4DU r4) {
        this.A00 = context;
        this.A02 = userSession;
        this.A03 = r4;
        this.A01 = ggO;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1117566155);
        Context context = this.A00;
        UserSession userSession = this.A02;
        View view2 = view;
        0qQ.A0A(view2);
        C52971GgO ggO = this.A01;
        View findViewById = view2.findViewById(R.id.threads_crossposting_toggle_text);
        String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131975318);
        String A0d2 = AnonymousClass7TF.A0d(context.getResources(), 2131975319);
        C355148Ov r2 = new C355148Ov(context, userSession, (Integer) null, false);
        r2.A02(0sr.A1P(new C367618rI[]{new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new PHP(findViewById, ggO, A0d, 0), (Integer) null, A0d, 0, 0, 0, false, false, false, true, false, false, false), new C367618rI((Drawable) null, (Drawable) null, (C15048ULb) null, new PHP(findViewById, ggO, A0d2, 1), (Integer) null, A0d2, 0, 0, 0, false, false, false, true, false, false, false)}));
        r2.showAsDropDown(view2);
        AnonymousClass0fD.A0C(-688152511, A05);
    }
}
