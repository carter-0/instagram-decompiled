package X;

import android.view.View;
import android.widget.PopupWindow;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8PM  reason: invalid class name */
public final class AnonymousClass8PM extends AnonymousClass3NK {
    public final /* synthetic */ C355048Oj A00;

    public AnonymousClass8PM(C355048Oj r1) {
        this.A00 = r1;
    }

    public final boolean Dqe(View view) {
        C362088hK r5;
        C347027w9 r0;
        List A0A;
        C355048Oj r4 = this.A00;
        AnonymousClass0eM r3 = r4.A13;
        27r A01 = 27p.A01(((A8X) r3.getValue()).A00);
        A01.A0F.A0S((C279294yP) null, (C371088xY) null, C358088aL.A0e, (List) null, 0, 0);
        C352218Cl A03 = r4.A02.A02.A01.A03();
        if (A03 == null || (A0A = A03.A0A()) == null) {
            r5 = null;
        } else {
            r5 = (C362088hK) 00k.A0J(A0A);
        }
        if (r5 != null) {
            r4.A0q.A0E(r5, AnonymousClass05K.A0C);
        } else {
            AnonymousClass8BA r1 = r4.A0q.A00;
            C352218Cl A032 = r1.A14.A01.A03();
            if (A032 != null) {
                C351818An r7 = r1.A1n;
                C351818An.A01(r7, A032);
                UserSession userSession = r7.A09;
                0Tu r52 = 0Tu.A05;
                if (182.A06(r52, userSession, 36319918493409001L)) {
                    C351818An.A02(r7, (String) null);
                } else if (182.A06(r52, userSession, 36319918493081318L)) {
                    C351818An.A00(r7);
                }
            }
            AnonymousClass0eM r53 = r4.A11;
            if (((PopupWindow) r53.getValue()).getContentView() != null) {
                int width = r4.A0N().getWidth() / 2;
                AnonymousClass0eM r72 = r4.A10;
                int i = 0;
                if (((View) r72.getValue()).getLeft() + (((View) r72.getValue()).getWidth() / 2) >= width) {
                    ((PopupWindow) r53.getValue()).getContentView().measure(0, 0);
                    i = (-((PopupWindow) r53.getValue()).getContentView().getMeasuredWidth()) + ((View) r72.getValue()).getWidth();
                }
                ((PopupWindow) r53.getValue()).showAsDropDown((View) r72.getValue(), i, r4.A0F.getResources().getDimensionPixelSize(R.dimen.abc_button_padding_horizontal_material));
                A8X a8x = (A8X) r3.getValue();
                List<C362088hK> A012 = C355048Oj.A01(r4);
                ArrayList arrayList = new ArrayList(0Yv.A1E(A012, 10));
                for (C362088hK r02 : A012) {
                    0qQ.A0B(r02, 0);
                    int ordinal = r02.ordinal();
                    if (ordinal == 0) {
                        r0 = C347027w9.MAGICMOD_BACKDROP;
                    } else if (ordinal == 1) {
                        r0 = C347027w9.MAGICMOD_RESTYLE;
                    } else if (ordinal == 2) {
                        r0 = C347027w9.AI_MAGICMOD_EXPANDER;
                    } else {
                        throw new RuntimeException();
                    }
                    arrayList.add(r0);
                }
                27p.A01(a8x.A00).A21(arrayList);
                return true;
            }
        }
        return true;
    }
}
