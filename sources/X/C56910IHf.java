package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.IHf  reason: case insensitive filesystem */
public final class C56910IHf implements CallerContextable {
    public static final CallerContext A00 = CallerContext.A00(C56910IHf.class);
    public static final String __redex_internal_original_name = "MediaOptionsOverflowDeleteHandler";

    public static void A00(Context context, DialogInterface.OnClickListener onClickListener, Fragment fragment, 1P0 r18, 1P0 r19, 1P0 r20, 1P0 r21, 1P0 r22, UserSession userSession, 1Xj r24) {
        int i;
        int i2;
        C358248ab A0H;
        1Xj r13 = r24;
        Context context2 = context;
        if (r13.A4Z()) {
            A0H = DbS.A0Y(context);
            A0H.A09(2131975818);
            A0H.A08(2131975819);
            A0H.A05();
        } else {
            Fragment fragment2 = fragment;
            UserSession userSession2 = userSession;
            if (r13.A0C.getBoostedBySponsor() != null) {
                C49946FGa.A04(fragment2.requireActivity(), (DialogInterface.OnClickListener) null, userSession2, context.getString(2131954737), context.getString(2131954738));
                return;
            }
            1P0 r9 = r18;
            if (r13.A0C.BP1() == null || !r13.A0C.BP1().getHasBeenMashedUp()) {
                if (C54977HaA.A00(r13)) {
                    1Av A002 = 1Au.A00(userSession2);
                    0s0 r0 = A002.A34;
                    AnonymousClass0YZ[] r4 = 1Av.A8a;
                    if (!AnonymousClass7TG.A1a(A002, r0, r4, 161) && r13.A1u() != 1sw.A04) {
                        1Av A003 = 1Au.A00(userSession2);
                        AnonymousClass7TF.A1J(A003, A003.A34, r4, 161, true);
                        A0H = DbS.A0Y(context);
                        A0H.A09(2131965927);
                        A0H.A08(2131965928);
                        A0H.A0I(new I8M(context2, AnonymousClass07i.A00(fragment2), r9, userSession2, r13), 2131957568);
                        A0H.A0H(new C50026FJl(20, (Object) context, (Object) userSession2, (Object) r13), 2131965929);
                    }
                }
                if (r13.A5Y()) {
                    C55029Hb0.A00((DialogInterface.OnDismissListener) null, fragment2, userSession2, r13);
                    return;
                } else if (r13.A5G()) {
                    C56659I6o.A01((Activity) context2, (DialogInterface.OnClickListener) null, (DialogInterface.OnDismissListener) null, fragment2, r9, r19, r20, userSession2, r13, (C62320sa) null);
                    return;
                } else {
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    if (r13.A4h()) {
                        i = 2131956487;
                        i2 = 2131957610;
                    } else if (r13.A5g()) {
                        i = 2131956492;
                        i2 = 2131957609;
                    } else if (r13.A6T(userSession2)) {
                        i = 2131956493;
                        i2 = 2131957611;
                    } else if (r13.A0C.BP1() != null && r13.A0C.BP1().getHasBeenMashedUp()) {
                        i = 2131971959;
                        i2 = 2131971958;
                    } else if (!r13.A5U() || !AnonymousClass7TF.A1Y(r13.A0C.BZ8(), true)) {
                        i = 2131957612;
                        i2 = 2131957607;
                    } else {
                        i = 2131957612;
                        A1A.append(context.getString(2131957608));
                        A1A.append("\n\n");
                        i2 = 2131957586;
                    }
                    A1A.append(context.getString(i2));
                    if (!C363388je.A03(C363388je.A00(userSession2).A00(A00)) || !AnonymousClass3YO.A02(r13, true)) {
                        A0H = Dba.A0H(fragment2);
                        A0H.A09(i);
                        A0H.A0q(A1A.toString());
                        A0H.A0K(new I8M(context2, AnonymousClass07i.A00(fragment2), r9, userSession2, r13), 2131957568);
                        A0H.A0r(true);
                        A0H.A0s(true);
                        A0H.A05();
                        if (r13.A5g() && !r13.A4h()) {
                            A0H.A0G(onClickListener, 2131965836);
                        }
                        DbT.A1V(A0H);
                    }
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    A1C.add("FB");
                    C358248ab A0H2 = Dba.A0H(fragment2);
                    A0H2.A09(2131957513);
                    A0H2.A08(2131957512);
                    C50019FJe fJe = new C50019FJe(4, (Object) context2, (Object) fragment, (Object) r21, (Object) userSession2, (Object) r13, (Object) A1C);
                    C358278ae r3 = C358278ae.RED_BOLD;
                    A0H2.A0Q(fJe, r3, 2131957510);
                    A0H2.A0r(true);
                    A0H2.A0s(true);
                    A0H2.A0C(new C50025FJk(24, (Object) userSession2, (Object) r13));
                    A0H2.A0O(new FIh(3, r13, context2, userSession2, fragment2, r22), r3, 2131957511);
                    DbT.A1V(A0H2);
                    C48897Elx.A00(Pxd.A00(207), userSession2, r13);
                    return;
                }
            } else {
                A0H = DbS.A0Y(context);
                A0H.A09(2131956487);
                A0H.A08(2131972377);
                A0H.A0I(new I8M(context, AnonymousClass07i.A00(fragment2), r9, userSession2, r13), 2131957568);
                A0H.A0r(true);
                A0H.A0s(true);
                A0H.A0H((DialogInterface.OnClickListener) null, 2131960995);
                DbT.A1V(A0H);
            }
        }
        A0H.A0r(true);
        A0H.A0s(true);
        DbT.A1V(A0H);
    }

    public static /* synthetic */ void A01(Context context, AnonymousClass07i r5, 1P0 r6, UserSession userSession, 1Xj r8) {
        1NY A0N = DbU.A0N(userSession);
        DbU.A1P(A0N, AnonymousClass000.A00(320), new Object[]{r8.getId(), r8.BR7()});
        A0N.A9m("media_id", r8.getId());
        A0N.A0H("igtv_feed_preview", r8.A5Y());
        A0N.A0R(C61284K0v.class, LGy.class);
        1OC A0U = DbT.A0U(A0N, true);
        if (r6 != null) {
            A0U.A00 = r6;
        }
        1ES.A00(context, r5, A0U);
    }
}
