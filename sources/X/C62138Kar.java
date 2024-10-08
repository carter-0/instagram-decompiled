package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Kar  reason: case insensitive filesystem */
public final class C62138Kar extends AnonymousClass7AK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C65051LmV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62138Kar(C65051LmV lmV, int i, int i2) {
        super(Integer.valueOf(i2));
        this.A01 = lmV;
        this.A00 = i;
    }

    public final void onClick(View view) {
        String str;
        C65051LmV lmV = this.A01;
        TextView textView = lmV.A03;
        if (textView == null) {
            str = "helperText";
        } else {
            0nA.A0N(textView);
            Activity activity = lmV.A08;
            Resources resources = activity.getResources();
            int i = this.A00;
            Integer valueOf = Integer.valueOf(i);
            String A0v = DbV.A0v(resources, valueOf, R.plurals.user_pay_badges_thanks_sticker_list_supporters_title, i);
            0qQ.A07(A0v);
            C331127Pr A0W = DbS.A0W(lmV.A0B);
            A0W.A03 = 0.7f;
            DbS.A1S(A0W, true);
            A0W.A0d = A0v;
            C331157Pu A002 = A0W.A00();
            LEU A003 = C49195Er0.A00().A00();
            C61227JzL jzL = lmV.A05;
            str = "model";
            if (jzL != null) {
                String str2 = jzL.A03;
                if (str2 == null && (str2 = jzL.A04) == null) {
                    throw AnonymousClass7TE.A0z("Missing media insight id");
                }
                A002.A02(activity, A003.A01(valueOf, AnonymousClass05K.A0N, jzL.A02, str2, "", "", jzL.A04, jzL.A05, false, false));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
