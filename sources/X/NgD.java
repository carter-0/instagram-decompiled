package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class NgD extends C262934Go {
    public final int A00;
    public final Object A01;

    public NgD(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Cv6(float f) {
        if (2 - this.A00 != 0) {
            super.Cv6(f);
            return;
        }
        C71085Ob8 ob8 = (C71085Ob8) this.A01;
        ob8.A04(ob8.A0A, ob8.A01);
        ob8.A0L.setAlpha(1.0f);
    }

    public final void D9d() {
        switch (this.A00) {
            case 0:
                C62320sa r0 = (C62320sa) this.A01;
                if (r0 != null) {
                    r0.invoke();
                    return;
                }
                return;
            case 1:
                OZT ozt = (OZT) this.A01;
                C71091OcD ocD = ozt.A02;
                if (ocD != null) {
                    ocD.A04();
                }
                OZT.A01(ozt);
                return;
            case 2:
                C71085Ob8 ob8 = (C71085Ob8) this.A01;
                ob8.A0D = true;
                C71870OsD osD = ob8.A0S.A00;
                C74501Pvv pvv = osD.A0E;
                if (pvv != null) {
                    pvv.DDO();
                    PopupWindow popupWindow = osD.A0C;
                    if (!(popupWindow == null || popupWindow.getContentView() == null)) {
                        popupWindow.getContentView().setVisibility(0);
                        popupWindow.setTouchable(true);
                        popupWindow.update();
                    }
                }
                C71091OcD ocD2 = ob8.A08;
                String str = null;
                if (ocD2 == null) {
                    0qQ.A0F("reactionsTrayController");
                    throw AnonymousClass00P.createAndThrow();
                }
                ocD2.A04();
                ob8.A04(ob8.A0A, ob8.A00);
                View view = ob8.A0L;
                view.setVisibility(8);
                view.setAlpha(0.0f);
                ViewGroup viewGroup = ob8.A05;
                if (viewGroup != null) {
                    C71085Ob8.A01(viewGroup, ob8, AnonymousClass7TG.A03(ob8.A0I));
                }
                if (ob8.A0B) {
                    ob8.A0B = false;
                    ob8.A02 = -1;
                    List A03 = ocD2.A03();
                    UserSession userSession = ob8.A0Q;
                    int i = ob8.A0H;
                    if (!0qQ.A0K(C71100Oca.A00(userSession, i), A03.get(0)) && pvv != null) {
                        pvv.D9w();
                    }
                    if (i == 29) {
                        ImmutableList immutableList = C254853tA.A03;
                        Collections.replaceAll(A03, "❤", "❤");
                    }
                    try {
                        StringWriter A0v = JTO.A0v();
                        17W A0K = AnonymousClass7TF.A0K(A0v);
                        Iterator A0s = C41845B3m.A0s(A0K, "reactions", A03);
                        while (A0s.hasNext()) {
                            C41846B3n.A18(A0K, A0s);
                        }
                        A0K.A0Y();
                        String A0k = AnonymousClass7TG.A0k(A0K, A0v);
                        1Av A002 = 1Au.A00(userSession);
                        0s0 r1 = A002.A0x;
                        AnonymousClass0YZ[] r7 = 1Av.A8a;
                        DbS.A1a(A002, A0k, r1, r7, 157);
                        DbS.A1a(A002, A03.get(0), A002.A0w, r7, 158);
                    } catch (IOException e) {
                        0wb.A06("DirectReactionSetUtil", "failed to save reaction set", e);
                    }
                    0wc r12 = ob8.A0P;
                    C254743sy r02 = ob8.A0T;
                    if (r02 != null) {
                        str = C67003Mgb.A01(r02);
                    }
                    0qQ.A0B(r12, 0);
                    0Aj A0e = AnonymousClass7TE.A0e(r12, "direct_edit_customize_reactions");
                    A0e.AAe("emojis", A03);
                    if (str != null) {
                        C66580MXl.A1K(A0e, str);
                    }
                    A0e.Cgf();
                    ob8.A0R.setVisibility(8);
                    return;
                }
                return;
            default:
                C67614Mqm mqm = (C67614Mqm) this.A01;
                if (!mqm.A01) {
                    C67614Mqm.A00(C21123XFn.FETCHING_CANCELLED, mqm);
                }
                mqm.A08.A00();
                return;
        }
    }
}
