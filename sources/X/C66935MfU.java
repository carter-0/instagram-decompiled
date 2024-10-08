package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import java.util.ArrayList;

/* renamed from: X.MfU  reason: case insensitive filesystem */
public final class C66935MfU {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final C66633Ma2 A02;
    public final DdD A03;
    public final AnonymousClass0eM A04 = C73899Pla.A00(this, 46);
    public final AnonymousClass0eM A05 = C73899Pla.A00(this, 47);
    public final C62320sa A06;
    public final C62320sa A07;

    public C66935MfU(AnonymousClass4DH r2, UserSession userSession, C66633Ma2 ma2, C62320sa r5, C62320sa r6) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = ma2;
        this.A06 = r5;
        this.A07 = r6;
        this.A03 = new DdD(r2, userSession);
    }

    public final void A06(View view) {
        0qQ.A0B(view, 0);
        boolean A062 = 182.A06(0Tu.A05, this.A01, 36325433230439379L);
        C71001OVy oVy = (C71001OVy) this.A04.getValue();
        28D r0 = 28D.A03;
        if (A062) {
            oVy.A01(view, r0);
        } else {
            oVy.A02(r0);
        }
    }

    public final void A08(View view) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        C70698OGt oGt = (C70698OGt) this.A05.getValue();
        C70931OSe.A00(oGt.A02, "direct_inbox_options_button_click");
        Context context = view2.getContext();
        ArrayList A15 = DbV.A15(context);
        if (oGt.A03 != null) {
            int i = 2131959535;
            if (0qQ.A0K(oGt.A05.invoke(), AnonymousClass2EX.A00)) {
                i = 2131959534;
            }
            A15.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_edit_list_pano_outline_24), (C15048ULb) null, new PHN(oGt, 6), (Integer) null, AnonymousClass7TE.A16(context, i), 0, 0, 0, false, false, false, true, false, false, false));
        }
        UserSession userSession = oGt.A01;
        0Tu r8 = 0Tu.A05;
        int i2 = 2131959532;
        if (182.A06(r8, userSession, 36326446842525450L)) {
            i2 = 2131959533;
        }
        String A0p = C51967G9n.A0p(context, i2);
        A15.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_toolbox_pano_outline_24), (C15048ULb) null, new PHO(oGt, A0p), (Integer) null, A0p, 0, 0, 0, false, false, false, true, false, false, false));
        if (182.A06(r8, userSession, 36315915582705335L)) {
            A15.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_promote_pano_outline_24), (C15048ULb) null, new PHN(oGt, 5), (Integer) null, AnonymousClass7TE.A16(context, 2131959531), 0, 0, 0, false, false, false, true, false, false, false));
        }
        if (AnonymousClass9B8.A01(userSession)) {
            AnonymousClass9B9.A00();
            A15.add(new C367618rI((Drawable) null, context.getDrawable(R.drawable.instagram_gen_ai_home_pano_outline_24), (C15048ULb) null, new PHN(oGt, 4), (Integer) null, AnonymousClass7TE.A16(context, 2131952555), 0, 0, 0, false, false, false, true, false, false, false));
        }
        C355148Ov A0c = C66581MXm.A0c(context, userSession, (Integer) null, A15, false);
        A0c.getContentView().measure(0, 0);
        view2.measure(0, 0);
        A0c.showAsDropDown(view2, -(A0c.getContentView().getMeasuredWidth() - view2.getMeasuredWidth()), 0);
    }

    public final void A00() {
        C66633Ma2 ma2 = this.A02;
        DbZ.A1R(DbX.A0Q(ma2.A0p()), "click_create_ad_button_on_inbox_surface");
        C48732EjH.A00().A01(ma2.A1J.requireActivity(), ma2.A0p(), "direct_inbox_setting_entrypoint");
    }

    public final void A01() {
        C66633Ma2 ma2 = this.A02;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putBoolean("ChannelDiscoverySuggestionsFragment.ARG_SHOW_INVITES_SECTION", 182.A06(0Tu.A05, ma2.A0p(), 36317934219105966L));
        AnonymousClass4DH r2 = ma2.A1J;
        DbU.A1K(r2, AnonymousClass6W8.A03(r2.requireActivity(), A0a, ma2.A0p(), ModalActivity.class, "direct_inbox_channel_discovery_suggestions"));
        UserSession userSession = this.A01;
        1Av A002 = 1Au.A00(userSession);
        AnonymousClass7TF.A1J(A002, A002.A5d, 1Av.A8a, 226, true);
        C71140Odl A003 = OPT.A00(userSession);
        0Aj A004 = C71140Odl.A00(A003);
        if (A004.isSampled()) {
            C71140Odl.A04(A004, A003);
            C66582MXn.A19(A004, "inbox_directory_sheet_rendered");
            Dba.A1B(A004, "source", "directory_button");
            C66580MXl.A1H(A004, A003.A00);
            A004.Cgf();
        }
    }

    public final void A02() {
        C67263Mkx mkx = (C67263Mkx) this.A07.invoke();
        if (mkx != null) {
            if (182.A06(0Tu.A05, mkx.A0A, 36328431117417817L)) {
                C67263Mkx.A04(mkx);
            }
            C67263Mkx.A07(mkx, true);
        }
        AnonymousClass7TH.A0R(this.A02.A0D);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.OEt, java.lang.Object] */
    public final void A03() {
        String str;
        UserSession userSession = this.A01;
        Context requireContext = this.A00.requireContext();
        ? obj = new Object();
        obj.A03 = userSession;
        obj.A00 = requireContext;
        obj.A02 = new C314826iu(C314816it.THREAD, userSession);
        obj.A01 = new C314836iv(userSession, requireContext);
        UserSession userSession2 = obj.A03;
        if (userSession2 == null) {
            str = "userSession";
        } else {
            0Tu r6 = 0Tu.A05;
            if (182.A06(r6, userSession2, 36318015822239486L) || 182.A06(r6, userSession2, 36322473998493901L)) {
                C314836iv r0 = obj.A01;
                if (r0 == null) {
                    str = "rollingDeprecationUtil";
                } else if (r0.A00()) {
                    Context context = obj.A00;
                    str = "context";
                    if (context != null) {
                        C358248ab A0Y = DbS.A0Y(context);
                        UserSession userSession3 = obj.A03;
                        str = "userSession";
                        if (userSession3 != null) {
                            A0Y.A05 = 182.A04(r6, userSession3, 36885423952036449L);
                            A0Y.A0q(182.A04(r6, userSession3, 36885423951970912L));
                            DbU.A16(context, A0Y, R.drawable.instagram_icons_exceptions_illo_restore_on_refresh_outline_96);
                            C71249OgE.A02(A0Y, obj, 6, 2131976057);
                            C71249OgE.A03(A0Y, obj, 5, 2131954735);
                            Dialog A022 = A0Y.A02();
                            C314826iu r02 = obj.A02;
                            if (r02 == null) {
                                str = "audLogging";
                            } else {
                                r02.A01();
                                AnonymousClass0fN.A00(A022);
                                return;
                            }
                        }
                    }
                }
            }
            this.A02.A11();
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04(View view) {
        DbZ.A1R(AnonymousClass0kN.A02(this.A01), "create_ad_button_on_inbox_surface_impression");
        C66633Ma2 ma2 = this.A02;
        ((C230882qT) ma2.A2V.getValue()).A00(view, QPTooltipAnchor.INBOX_MESSAGE_ADS_ICON, C66581MXm.A0g(ma2));
    }

    public final void A05(View view) {
        FragmentActivity requireActivity = this.A00.requireActivity();
        1Av A002 = 1Au.A00(this.A01);
        if (A002.A01.getInt("channel_inbox_directory_nux_seen_count", 0) < 2 && !AnonymousClass7TG.A1a(A002, A002.A5d, 1Av.A8a, 226)) {
            view.postDelayed(new C51446FuG(requireActivity, view, A002), 1000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(android.view.View r6) {
        /*
            r5 = this;
            X.4DH r4 = r5.A00
            androidx.fragment.app.FragmentActivity r3 = r4.getActivity()
            if (r3 == 0) goto L_0x001a
            com.instagram.common.session.UserSession r1 = r5.A01
            java.lang.Integer r0 = X.C319716r5.A00(r1)
            if (r0 == 0) goto L_0x001a
            X.Fv7 r2 = new X.Fv7
            r2.<init>(r3, r6, r1, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.postDelayed(r2, r0)
        L_0x001a:
            com.instagram.common.session.UserSession r3 = r5.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325308676387680(0x810dad00033360, double:3.035609705000584E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0034
            r0 = 36325308676715362(0x810dad00083362, double:3.035609705207811E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x003b
        L_0x0034:
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.C48802EkQ.A00(r0, r6, r3)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66935MfU.A07(android.view.View):void");
    }
}
