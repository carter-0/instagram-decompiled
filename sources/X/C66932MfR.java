package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.user.model.User;

/* renamed from: X.MfR  reason: case insensitive filesystem */
public final class C66932MfR implements AnonymousClass4DS {
    public final /* synthetic */ C66934MfT A00;
    public final /* synthetic */ boolean A01;

    public final void configureActionBar(2da r7) {
        AnonymousClass3JR A0K;
        int i;
        Integer num;
        Integer num2;
        int i2;
        0qQ.A0B(r7, 0);
        r7.Eu4(!this.A01);
        C66934MfT mfT = this.A00;
        Object invoke = mfT.A09.invoke();
        if (0qQ.A0K(invoke, AnonymousClass496.A00)) {
            i2 = 2131958648;
        } else if (0qQ.A0K(invoke, C67224MkK.A00)) {
            i2 = 2131963793;
        } else {
            UserSession userSession = mfT.A07;
            if (2R8.A00(userSession)) {
                C71425OkQ okQ = new C71425OkQ((Object) mfT, 1);
                2dZ r2 = (2dZ) r7;
                if (r2.A0U.CVM()) {
                    2dZ.A04(r2).setOnLongClickListener(okQ);
                    AnonymousClass7TH.A06(r2.A0Z).setOnLongClickListener(okQ);
                    2dZ.A05(r2).setOnLongClickListener(okQ);
                    AnonymousClass7TH.A06(r2.A0g).setOnLongClickListener(okQ);
                    AnonymousClass7TH.A06(r2.A0f).setOnLongClickListener(okQ);
                    AnonymousClass7TH.A06(r2.A0X).setOnLongClickListener(okQ);
                    AnonymousClass7TH.A06(r2.A0d).setOnLongClickListener(okQ);
                    AnonymousClass7TH.A06(r2.A0b).setOnLongClickListener(okQ);
                    AnonymousClass7TH.A06(r2.A0Y).setOnLongClickListener(okQ);
                    AnonymousClass7TH.A06(r2.A0h).setOnLongClickListener(okQ);
                    r2.C7z().setOnLongClickListener(okQ);
                }
            }
            C67263Mkx mkx = (C67263Mkx) mfT.A0A.invoke();
            if (mkx == null) {
                C66934MfT.A01(r7, mfT);
                C66934MfT.A00(r7, mfT);
                0Tu r22 = 0Tu.A05;
                if (182.A06(r22, userSession, 36325433230504916L)) {
                    boolean A06 = 182.A06(r22, userSession, 36325433230439379L);
                    AnonymousClass3JR A0K2 = DbS.A0K();
                    if (A06) {
                        num = AnonymousClass05K.A1I;
                    } else {
                        num = AnonymousClass05K.A03;
                    }
                    A0K2.A06 = Tt3.A01(num);
                    if (A06) {
                        num2 = AnonymousClass05K.A1I;
                    } else {
                        num2 = AnonymousClass05K.A03;
                    }
                    A0K2.A05 = Tt3.A00(num2);
                    DbX.A19(new C71395Oju(mfT, 45), A0K2, r7);
                }
                User A0j = DbT.A0j(userSession);
                if (A0j.A0J() != 16V.A06 && A0j.A0J() != 16V.A05 && 182.A06(r22, userSession, 36317934219171503L)) {
                    AnonymousClass4DH r0 = mfT.A04;
                    Context context = r0.getContext();
                    if (context != null && r0.getActivity() != null) {
                        View A08 = DbU.A08(LayoutInflater.from(context), R.layout.direct_channel_discovery_action_bar_button);
                        C66935MfU mfU = mfT.A08;
                        View findViewById = A08.findViewById(R.id.channel_discovery_button_badge);
                        C66633Ma2 ma2 = mfU.A02;
                        ma2.A09 = findViewById;
                        ma2.A10();
                        AnonymousClass3JR A0K3 = DbS.A0K();
                        A0K3.A0I = A08;
                        A0K3.A05 = 2131955045;
                        A0K3.A0G = new C71395Oju(mfT, 40);
                        r7.AA4(new AnonymousClass3Jb(A0K3));
                        mfU.A05(A08);
                        return;
                    }
                    return;
                } else if (AnonymousClass9B8.A01(userSession)) {
                    AnonymousClass3JR A0K4 = DbS.A0K();
                    A0K4.A06 = R.drawable.instagram_gen_ai_home_pano_outline_24;
                    A0K4.A05 = 2131952555;
                    A0K4.A0G = new C71395Oju(mfT, 38);
                    View A0P = C51970G9q.A0P(A0K4, r7);
                    C66935MfU mfU2 = mfT.A08;
                    UserSession userSession2 = mfU2.A01;
                    if (!182.A06(r22, userSession2, 36325308676387680L)) {
                        C48802EkQ.A00(mfU2.A00.requireActivity(), A0P, userSession2);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            } else {
                if (mkx.A03) {
                    r7.setTitle(DbY.A0d(DbV.A05(mfT.A04), mkx.A0D.size(), R.plurals.multi_select_count));
                    r7.ErT(mfT.A05);
                } else {
                    C66934MfT.A01(r7, mfT);
                    C66934MfT.A00(r7, mfT);
                }
                if (!mkx.A03 && 182.A06(0Tu.A06, userSession, 36315915582836409L) && C67057MhU.A00(mfT.A04.getContext(), userSession)) {
                    AnonymousClass3JR A0K5 = DbS.A0K();
                    A0K5.A06 = R.drawable.instagram_promote_pano_outline_24;
                    A0K5.A05 = 2131959531;
                    A0K5.A0G = new C71395Oju(mfT, 39);
                    mfT.A08.A04(C51970G9q.A0P(A0K5, r7));
                }
                if (mkx.A03 || DbT.A0j(userSession).A0J() != 16V.A05) {
                    if (mkx.A03) {
                        A0K = DbS.A0K();
                        A0K.A02(AnonymousClass05K.A09);
                        i = 43;
                    } else if (mkx.A0A()) {
                        A0K = DbS.A0K();
                        A0K.A02(AnonymousClass05K.A0A);
                        i = 44;
                    } else {
                        return;
                    }
                    DbX.A19(new C71395Oju(mfT, i), A0K, r7);
                    return;
                }
                AnonymousClass3JR A0K6 = DbS.A0K();
                A0K6.A06 = R.drawable.instagram_more_horizontal_pano_outline_24;
                A0K6.A05 = 2131966173;
                A0K6.A0G = new C71395Oju(mfT, 42);
                View A0P2 = C51970G9q.A0P(A0K6, r7);
                C66633Ma2 ma22 = mfT.A08.A02;
                ((C230882qT) ma22.A2V.getValue()).A00(A0P2, QPTooltipAnchor.INBOX_OPTIONS_MENU_ICON, C66581MXm.A0g(ma22));
                return;
            }
        }
        r7.Eom(i2);
    }

    public C66932MfR(C66934MfT mfT, boolean z) {
        this.A01 = z;
        this.A00 = mfT;
    }
}
