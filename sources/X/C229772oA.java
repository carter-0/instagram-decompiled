package X;

import android.content.Context;
import android.widget.PopupWindow;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2oA  reason: invalid class name and case insensitive filesystem */
public final class C229772oA implements PopupWindow.OnDismissListener {
    public boolean A00;
    public boolean A01 = true;
    public final Context A02;
    public final UserSession A03;
    public final AnonymousClass2o1 A04;
    public final ArrayList A05 = new ArrayList();
    public final ArrayList A06 = new ArrayList();
    public final List A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass9L7(this, 45));

    public C229772oA(Context context, UserSession userSession, AnonymousClass2o1 r6, List list) {
        0qQ.A0B(r6, 4);
        this.A02 = context;
        this.A03 = userSession;
        this.A07 = list;
        this.A04 = r6;
    }

    public final void A00(Integer num) {
        0qQ.A0B(num, 0);
        if (num != this.A04.A01 || num == AnonymousClass05K.A15) {
            Iterator it = this.A05.iterator();
            0qQ.A07(it);
            while (it.hasNext()) {
                Object next = it.next();
                0qQ.A07(next);
                ((AnonymousClass2o0) next).A00(num);
            }
        }
    }

    public final void onDismiss() {
    }
}
