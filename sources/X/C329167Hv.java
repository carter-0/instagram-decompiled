package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7Hv  reason: invalid class name and case insensitive filesystem */
public final class C329167Hv implements TextWatcher {
    public final /* synthetic */ C329067Hl A00;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C329167Hv(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C65261be r6;
        if (!C329067Hl.A2V) {
            C329067Hl.A2V = true;
            C329067Hl r5 = this.A00;
            r5.A02 = null;
            if (C329067Hl.A0t(r5)) {
                if (182.A06(0Tu.A05, r5.A1Z, 36329088247807778L) && C65261be.A00 != null) {
                    0nY.A00().ATE(new NR8());
                }
            }
            if (C329067Hl.A0t(r5)) {
                UserSession userSession = r5.A1Z;
                0Tu r3 = 0Tu.A05;
                if (182.A06(r3, userSession, 36329088247938852L) && (r6 = C65261be.A00) != null) {
                    C254783t2 r52 = r5.A1z;
                    0qQ.A0B(userSession, 0);
                    0qQ.A0B(r52, 1);
                    0nY.A00().ATE(new NSF(userSession, (AnonymousClass1bd) r6, r52));
                }
                if (182.A06(r3, userSession, 36329088248069925L) && C65261be.A00 != null) {
                    0qQ.A0B(userSession, 0);
                    0nY.A00().ATE(new NRG(userSession));
                }
                if (C65261be.A00 != null) {
                    0qQ.A0B(userSession, 0);
                    if (182.A06(r3, userSession, 36329088248135462L) && !C62840wD.A00.getAndSet(true)) {
                        0nY.A00().ATE(new C62430tc());
                    }
                }
            }
        }
    }

    public final void afterTextChanged(Editable editable) {
        UserSession userSession;
        AnonymousClass7H1 r1;
        String obj = editable.toString();
        if (obj != null && !obj.isEmpty()) {
            C329067Hl r5 = this.A00;
            if (r5.A0r != null && r5.A0R != null && (userSession = r5.A1Z) != null && r5.A0W != null && (r1 = r5.A1w) != null && C329067Hl.A12(r5)) {
                C3260875i A0D = ((AnonymousClass7H0) r1).A0D(AnonymousClass7JY.AI);
                2Er r2 = r5.A0W;
                0qQ.A0B(userSession, 1);
                0qQ.A0B(r2, 2);
                boolean z = false;
                if (A0D != null && A0D.A01() == AnonymousClass7OS.AI && obj.length() > 0 && 00l.A0d(obj, A0D.A05(), false) && AnonymousClass78V.A00(userSession, r2)) {
                    z = true;
                }
                AnonymousClass7J9 r12 = r5.A0r;
                C327797Cf r22 = r5.A0R;
                0qQ.A0B(r22, 0);
                List list = r12.A01;
                boolean contains = list.contains(r22);
                if (z) {
                    if (!contains) {
                        list.add(r22);
                    }
                } else if (contains) {
                    list.remove(r22);
                }
            }
        }
    }
}
