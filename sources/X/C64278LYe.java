package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.LYe  reason: case insensitive filesystem */
public final class C64278LYe implements View.OnTouchListener {
    public final /* synthetic */ C336387eX A00;
    public final /* synthetic */ User A01;

    public C64278LYe(C336387eX r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        C336387eX r0 = this.A00;
        User user = this.A01;
        C336397eY r02 = r0.A02;
        if (r02 == null) {
            return false;
        }
        K66 k66 = r02.A00;
        C61836KOa kOa = K66.A06(k66).A0I;
        ArrayList A1M = 0sr.A1M(new User[]{user});
        05G r6 = kOa.A05;
        List A16 = JTO.A16(r6);
        A1M.addAll(A16);
        0qQ.A0B(A16, 0);
        ArrayList A0p = AnonymousClass7TF.A0p(A16);
        Iterator it = A16.iterator();
        while (it.hasNext()) {
            DbY.A1W(A0p, it);
        }
        ArrayList A0p2 = AnonymousClass7TF.A0p(A1M);
        Iterator it2 = A1M.iterator();
        while (it2.hasNext()) {
            DbY.A1W(A0p2, it2);
        }
        0qQ.A0B(A0p, 0);
        if (A0p.size() != A0p2.size() || !A0p.containsAll(A0p2) || !A0p2.containsAll(A0p)) {
            r6.Epw(00k.A0a(A1M));
        }
        if (K66.A06(k66).A0I.A00 == null) {
            return false;
        }
        LBG lbg = k66.A06;
        if (lbg != null) {
            lbg.A0A.A0C.clear();
            LBG lbg2 = k66.A06;
            if (lbg2 != null) {
                IgAutoCompleteTextView igAutoCompleteTextView = lbg2.A0A;
                igAutoCompleteTextView.A0C.add(new L4E(k66, user));
                return false;
            }
        }
        0qQ.A0F("viewHolder");
        throw AnonymousClass00P.createAndThrow();
    }
}
