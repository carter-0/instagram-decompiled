package X;

import android.view.View;
import com.instagram.actionbar.ActionButton;

/* renamed from: X.JbT  reason: case insensitive filesystem */
public final class C59904JbT {
    public int A00;
    public View.OnClickListener A01;
    public String A02;

    public static ActionButton A00(View.OnClickListener onClickListener, 2da r1, C59922Jbl jbl) {
        jbl.A01 = onClickListener;
        return r1.ErM(new C59904JbT(jbl));
    }

    public static void A01(View.OnClickListener onClickListener, 2da r1, C59922Jbl jbl) {
        jbl.A01 = onClickListener;
        r1.ErM(new C59904JbT(jbl));
    }

    public C59904JbT(C59922Jbl jbl) {
        this.A02 = jbl.A02;
        this.A00 = jbl.A00;
        this.A01 = jbl.A01;
    }
}
