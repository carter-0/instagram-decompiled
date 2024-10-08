package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Abz  reason: case insensitive filesystem */
public final class C40428Abz implements C351948Bb {
    public TextView A00;
    public final View A01;
    public final View A02;
    public final AnonymousClass0iw A03;
    public final C39645A3l A04;
    public final C15023UKc A05;
    public final View A06;

    public final void Ejs(boolean z) {
        View[] viewArr = {this.A01, this.A06};
        if (z) {
            C294975nL.A04((C295005nO) null, viewArr, true);
        } else {
            C294975nL.A05(viewArr, true);
        }
    }

    public final void EQQ(boolean z) {
        View[] viewArr = new View[1];
        TextView textView = this.A00;
        if (z) {
            if (textView != null) {
                viewArr[0] = textView;
                C294975nL.A04((C295005nO) null, viewArr, true);
                return;
            }
        } else if (textView != null) {
            viewArr[0] = textView;
            C294975nL.A05(viewArr, true);
            return;
        }
        0qQ.A0F("headerTitle");
        throw AnonymousClass00P.createAndThrow();
    }

    public C40428Abz(View view, View view2, AnonymousClass0iw r4, C39645A3l a3l, C15023UKc uKc) {
        AnonymousClass7TG.A1Q(view2, r4);
        this.A02 = view;
        this.A01 = view2;
        this.A03 = r4;
        this.A05 = uKc;
        this.A04 = a3l;
        this.A06 = AnonymousClass7TF.A0G(view2, R.id.question_camera_reply_avatar_button_container);
    }
}
