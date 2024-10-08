package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.Aby  reason: case insensitive filesystem */
public final class C40427Aby implements C351948Bb {
    public TextView A00;
    public final View A01;
    public final View A02;
    public final AnonymousClass0iw A03;
    public final C381539bv A04;
    public final 0sP A05;
    public final View A06;

    public C40427Aby(View view, View view2, AnonymousClass0iw r4, C381539bv r5, 0sP r6) {
        AnonymousClass7TG.A0w(2, view2, r4, r5);
        this.A02 = view;
        this.A01 = view2;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = AnonymousClass7TF.A0G(view2, R.id.note_reply_camera_avatar_button_container);
    }

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
}
