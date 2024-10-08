package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.instagram.modal.ModalActivity;

public final class ANM implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass87G A00;
    public final /* synthetic */ AnonymousClass86m A01;

    public ANM(AnonymousClass87G r1, AnonymousClass86m r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        String str;
        int A05 = AnonymousClass0fD.A05(-1621757857);
        AnonymousClass86m r4 = this.A01;
        AnonymousClass87G r3 = this.A00;
        AnonymousClass87I r2 = r3.A04;
        if (r2 == null) {
            r2 = AnonymousClass87I.EMPTY;
        }
        if (r2 == AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT) {
            r4.E1E();
        } else {
            AnonymousClass87I r6 = AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST;
            if (r2 == r6) {
                if (r3.A0O) {
                    str = r3.A0G;
                } else {
                    str = null;
                }
                String id = r3.getId();
                0qQ.A07(id);
                C63398KwJ.A00(r4.A0K, r6, r4.A0P, id, str, r3.A0F);
            } else if (r2 == AnonymousClass87I.QUICK_SNAP_CLOSE_FRIENDS_AUDIENCE) {
                Bundle A0a = AnonymousClass7TE.A0a();
                Activity activity = r4.A0K;
                AnonymousClass6W8 r32 = new AnonymousClass6W8(activity, A0a, r4.A0P, ModalActivity.class, C273654mx.A00(18));
                r32.A07();
                r32.A0C(activity);
            }
        }
        AnonymousClass0fD.A0C(1043847562, A05);
    }
}
