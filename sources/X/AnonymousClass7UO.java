package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.7UO  reason: invalid class name */
public final class AnonymousClass7UO {
    public int A00;
    public View A01;
    public 2cs A02;
    public CircularImageView A03;
    public C252063oV A04;
    public C330417Mr A05;
    public C330467Mw A06;
    public final AnonymousClass4DH A07;
    public final UserSession A08;
    public final AnonymousClass7UC A09;
    public final AnonymousClass4DU A0A;
    public final C62320sa A0B;
    public final C62320sa A0C;
    public final C62320sa A0D;
    public final C62320sa A0E;

    public AnonymousClass7UO(AnonymousClass4DH r2, UserSession userSession, AnonymousClass7UC r4, AnonymousClass4DU r5, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9) {
        0qQ.A0B(r2, 2);
        0qQ.A0B(r7, 6);
        0qQ.A0B(r8, 7);
        0qQ.A0B(r9, 8);
        this.A08 = userSession;
        this.A07 = r2;
        this.A0A = r5;
        this.A09 = r4;
        this.A0E = r6;
        this.A0B = r7;
        this.A0D = r8;
        this.A0C = r9;
    }

    public static final void A01(AnonymousClass7UO r3) {
        View view = r3.A01;
        if (view != null) {
            0nA.A0T(view, r3.A00);
        }
        C330467Mw r0 = r3.A06;
        if (r0 != null) {
            int i = r3.A00;
            ViewGroup viewGroup = r0.A02;
            Context context = viewGroup.getContext();
            0qQ.A07(context);
            0nA.A0T(viewGroup, i + ((int) 0nA.A04(context, 8)));
        }
    }

    public static final void A00(C252063oV r5, AnonymousClass7UO r6) {
        C330437Mt r0;
        if (!r5.CVM()) {
            View view = r5.getView();
            View requireViewById = view.requireViewById(R.id.direct_thread_new_message_indicator_avatar_view);
            0qQ.A07(requireViewById);
            AnonymousClass0fU.A00(new C330407Mq(requireViewById, r6), requireViewById);
            r6.A01 = requireViewById;
            r6.A03 = (CircularImageView) view.requireViewById(R.id.direct_thread_new_message_indicator_avatar);
            r6.A05 = new C330417Mr(requireViewById);
            2cs A022 = C61340me.A00().A02();
            A022.A09(C71392co.A04(10.0d, 3.0d));
            A022.A0A(new C330427Ms(requireViewById));
            r6.A02 = A022;
            if (182.A06(0Tu.A05, r6.A08, 36329698132836611L) && (r0 = (C330437Mt) r6.A0C.invoke()) != null) {
                r0.A0D.add(new AnonymousClass7BW(r6));
            }
        }
    }
}
