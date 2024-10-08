package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class P30 implements C41836B2r {
    public final UserSession A00;
    public final C333517Zg A01;
    public final C62036KWs A02;
    public final AnonymousClass0eM A03 = C73899Pla.A00(this, 16);
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(C73755PjG.A00);
    public final AnonymousClass0eM A05 = C73899Pla.A00(this, 17);
    public final 1wn A06;
    public final AnonymousClass0eK A07;
    public final C62320sa A08;

    public final boolean AP3() {
        return false;
    }

    public final void FHw(AnonymousClass7SD r20, List list, boolean z, boolean z2) {
        C254793t3 r0;
        C254763t0 A022;
        String str;
        Long l;
        if (list != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                AnonymousClass7LQ r2 = (AnonymousClass7LQ) next;
                UserSession userSession = this.A00;
                C254703su r02 = r2.A0e;
                0qQ.A07(r02);
                if (C66839MdX.A00(userSession, r02) && (!AnonymousClass79U.A02(r2) || r2.A0N == AnonymousClass05K.A00)) {
                    A1C.add(next);
                }
            }
            if (!A1C.isEmpty() && (r0 = r20.A0P) != null && (A022 = C300965yF.A02(r0)) != null && (str = A022.A00) != null) {
                AnonymousClass7S7 C6l = this.A01.C6l();
                int AdN = C6l.AdN();
                String C6k = C6l.C6k();
                String A002 = AnonymousClass1Q2.A00();
                WeakReference A0v = C51965G9l.A0v(this.A08.invoke());
                C62036KWs kWs = this.A02;
                ArrayList A0p = AnonymousClass7TF.A0p(A1C);
                Iterator it2 = A1C.iterator();
                while (it2.hasNext()) {
                    A0p.add(((AnonymousClass7LQ) it2.next()).A0e);
                }
                OHM ohm = new OHM(this, str, C6k, A002, A0v, A1C, AdN);
                AnonymousClass7TE.A1Z(new MH6((Object) ohm, (Object) kWs, (Object) A0p, str, (AnonymousClass4D7) null, 8), kWs.A01);
                C313756gx A0R = DbZ.A0R(this.A03);
                int size = A1C.size();
                1Ln A0J = DbT.A0J(A0R);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, A0R);
                    Dba.A1D(A0J, "channel_translation_request_sent");
                    A0J.A0p("channel_translation");
                    DbZ.A1L(A0J, "thread_view", AdN);
                    A0J.A0s(str);
                    if (C6k != null) {
                        l = 00y.A0n(10, C6k);
                    } else {
                        l = null;
                    }
                    A0J.A0i(l);
                    A0J.A0v(A0R.A01);
                    A0J.A0w(DbY.A0p("target_locale", A002, AnonymousClass7TE.A1L("message_counts", String.valueOf(size))));
                    A0J.Cgf();
                }
                02m r22 = ((C70552OBa) this.A05.getValue()).A00;
                r22.markerStart(25631742);
                r22.markerPoint(25631742, "Translation_Request_Sent");
            }
        }
    }

    public final void onDestroy() {
        AnonymousClass1Nd.A00(this.A00).A02(this.A06, C71901Osj.class);
    }

    public P30(UserSession userSession, C62036KWs kWs, AnonymousClass0eK r6, C62320sa r7) {
        this.A08 = r7;
        this.A00 = userSession;
        this.A02 = kWs;
        this.A07 = r6;
        this.A01 = (C333517Zg) C66580MXl.A0s(r6);
        C71932OtG A002 = C71932OtG.A00(this, 23);
        this.A06 = A002;
        AnonymousClass1Nd.A00(userSession).A01(A002, C71901Osj.class);
    }

    public final SpannableString BV6(Context context, C332907Wx r5, MessageIdentifier messageIdentifier, Integer num, int i) {
        String A16 = AnonymousClass7TE.A16(context, 2131958748);
        String A162 = AnonymousClass7TE.A16(context, 2131958747);
        SpannableStringBuilder append = DbS.A0C(A16).append(002.A0D(A162, ' '));
        0qQ.A0A(append);
        AnonymousClass7AV.A05(append, new ELP(context, this, r5, i), A162);
        SpannableString valueOf = SpannableString.valueOf(append);
        0qQ.A07(valueOf);
        return valueOf;
    }

    public final void Ds0(MessageIdentifier messageIdentifier, Integer num) {
        Object obj;
        String str;
        boolean A1X = DbW.A1X(num);
        String str2 = messageIdentifier.A01;
        C333517Zg r3 = this.A01;
        AnonymousClass7ZY BSN = r3.BSN();
        Iterator it = BSN.BSC(str2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((AnonymousClass7LQ) obj).A0e.A0h(), str2)) {
                break;
            }
        }
        AnonymousClass7LQ r2 = (AnonymousClass7LQ) obj;
        boolean z = false;
        if (r2 != null) {
            if (num == AnonymousClass05K.A00 || AnonymousClass79U.A02(r2)) {
                BSN.EdR(num, str2, A1X);
            } else {
                AnonymousClass7SD A0Z = C66581MXm.A0Z(r3);
                0qQ.A07(A0Z);
                FHw(A0Z, AnonymousClass7TE.A1I(r2), A1X, A1X);
            }
        }
        C313756gx A0R = DbZ.A0R(this.A03);
        AnonymousClass7S7 C6l = r3.C6l();
        int AdN = C6l.AdN();
        if (num == AnonymousClass05K.A01) {
            z = true;
        }
        String C6C = C6l.C6C();
        String C6k = C6l.C6k();
        1Ln A0J = DbT.A0J(A0R);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A0R);
            if (z) {
                str = "translated_text_enabled";
            } else {
                str = "translated_text_disabled";
            }
            DbV.A1M(A0J, str);
            A0J.A0p("message_options");
            C66582MXn.A1C(A0J, A0R, DbZ.A0b(A0J, "thread_view", C6C, C6k, AdN));
        }
    }
}
