package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Mkx  reason: case insensitive filesystem */
public final class C67263Mkx {
    public TextView A00;
    public C67496Moq A01;
    public 2Dm A02;
    public boolean A03;
    public View A04;
    public ViewStub A05;
    public TextView A06;
    public TextView A07;
    public final FragmentActivity A08;
    public final AnonymousClass0iw A09;
    public final UserSession A0A;
    public final C67492Mom A0B;
    public final C67264Mky A0C;
    public final HashMap A0D = AnonymousClass7TE.A1E();
    public final HashSet A0E = AnonymousClass7TE.A1F();
    public final HashSet A0F = AnonymousClass7TE.A1F();
    public final C67521MpG A0G;
    public final C358248ab A0H;

    public static final void A02(C67263Mkx mkx) {
        C67263Mkx mkx2 = mkx;
        FragmentActivity fragmentActivity = mkx2.A08;
        UserSession userSession = mkx2.A0A;
        if (!C71118OdC.A03(fragmentActivity, fragmentActivity, mkx2.A09, userSession, mkx2.A0C.A00(), -1, false)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            HashMap hashMap = mkx2.A0D;
            Set<C254743sy> keySet = hashMap.keySet();
            0qQ.A07(keySet);
            boolean z = false;
            boolean z2 = false;
            for (C254743sy r1 : keySet) {
                if (r1 instanceof DirectThreadKey) {
                    2Dm r0 = mkx2.A02;
                    if (r0 == null) {
                        0qQ.A0F("threadStore");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AnonymousClass3U9 A022 = C66647MaG.A02(r0, r1);
                    if (A022 != null && A022.Ca9()) {
                        if (A022.C6a() == 29) {
                            A1C.add(A022);
                            z = true;
                            z2 = true;
                        } else {
                            z = true;
                        }
                    }
                }
            }
            if (DbT.A1b(A1C)) {
                C313756gx A002 = C313746gw.A00(userSession);
                ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    AnonymousClass7TF.A1M(A0r, ((2Er) it.next()).AdN());
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                Iterator it2 = A1C.iterator();
                while (it2.hasNext()) {
                    String C6C = ((2Eq) it2.next()).C6C();
                    if (C6C != null) {
                        A1C2.add(C6C);
                    }
                }
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                Iterator it3 = A1C.iterator();
                while (it3.hasNext()) {
                    String C6k = ((2Eq) it3.next()).C6k();
                    if (C6k != null) {
                        A1C3.add(C6k);
                    }
                }
                1Ln A0J = DbT.A0J(A002);
                if (DbT.A1Y(A0J)) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    A1E.put("ig_thread_ids", 00k.A0P(",", "", "", A1C2, (0sP) null));
                    A1E.put("consistent_thread_fbid", 00k.A0P(",", "", "", A1C3, (0sP) null));
                    DbW.A17(A0J, A002);
                    DbV.A1M(A0J, "bulk_delete_broadcast_chat_dialog_rendered");
                    A0J.A0p("inbox_multiselect_thread_options");
                    A0J.A0q("inbox");
                    A0J.A0o(C313756gx.A06(A0r));
                    A0J.A0w(A1E);
                    A0J.Cgf();
                }
            }
            C358248ab r4 = mkx2.A0H;
            Resources resources = fragmentActivity.getResources();
            int i = R.plurals.multi_select_dialog_delete_chat_title;
            if (z) {
                i = R.plurals.multi_select_dialog_delete_channel_title;
            }
            r4.A05 = DbV.A0v(resources, Integer.valueOf(hashMap.size()), i, hashMap.size());
            int i2 = 2131967729;
            if (z2) {
                i2 = 2131967728;
            }
            r4.A08(i2);
            r4.A0F(new C71183Of1(6, A1C, mkx2));
            r4.A0C(new C71183Of1(7, A1C, mkx2));
            AnonymousClass7TH.A0a(r4, true);
            return;
        }
        A07(mkx2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r5 = this;
            com.instagram.common.session.UserSession r4 = r5.A0A
            com.instagram.api.schemas.BizUserInboxState r3 = X.C66582MXn.A0L(r4)
            java.util.HashMap r0 = r5.A0D
            java.util.Set r0 = r0.entrySet()
            X.0qQ.A07(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r0 = r1.getKey()
            boolean r0 = r0 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x0013
            java.lang.Object r0 = r1.getValue()
            X.Mbz r0 = (X.C66754Mbz) r0
            int r1 = r0.A01
            r0 = 29
            if (r1 != r0) goto L_0x0013
            android.widget.TextView r0 = r5.A00
            X.AnonymousClass7TH.A0R(r0)
        L_0x0036:
            return
        L_0x0037:
            X.Mky r0 = r5.A0C
            X.2EM r1 = r0.A00()
            X.2EU r0 = X.AnonymousClass2EU.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0065
            com.instagram.api.schemas.BizUserInboxState r0 = com.instagram.api.schemas.BizUserInboxState.GENERAL_FOLDER_THROTTLED
            if (r3 != r0) goto L_0x0065
            boolean r0 = X.C66582MXn.A1Q(r4)
            if (r0 == 0) goto L_0x0065
            android.widget.TextView r2 = r5.A00
            if (r2 == 0) goto L_0x005b
            androidx.fragment.app.FragmentActivity r1 = r5.A08
            r0 = 2130970310(0x7f0406c6, float:1.7549327E38)
        L_0x0058:
            X.JTS.A0u(r1, r2, r0)
        L_0x005b:
            android.widget.TextView r1 = r5.A00
            if (r1 == 0) goto L_0x0036
            r0 = 52
            X.C71395Oju.A00(r1, r0, r5)
            return
        L_0x0065:
            android.widget.TextView r2 = r5.A00
            if (r2 == 0) goto L_0x005b
            androidx.fragment.app.FragmentActivity r1 = r5.A08
            r0 = 2130970277(0x7f0406a5, float:1.754926E38)
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67263Mkx.A00():void");
    }

    public static final void A01(C67263Mkx mkx) {
        Boolean bool;
        DirectShareTarget directShareTarget;
        C67521MpG mpG = mkx.A0G;
        HashMap hashMap = mkx.A0D;
        C73910Pll pll = new C73910Pll(mkx, 38);
        0qQ.A0B(hashMap, 0);
        C66754Mbz mbz = (C66754Mbz) hashMap.get(00k.A09(hashMap.keySet()));
        String str = null;
        if (mbz != null) {
            bool = Boolean.valueOf(mbz.A08);
        } else {
            bool = null;
        }
        C66754Mbz mbz2 = (C66754Mbz) hashMap.get(00k.A09(hashMap.keySet()));
        if (!(mbz2 == null || (directShareTarget = mbz2.A03) == null)) {
            str = DbT.A0y(directShareTarget);
        }
        C71097OcX.A02(mpG.A00, new PFB(0, mpG, hashMap, pll), bool, str, hashMap.size());
    }

    public static final void A03(C67263Mkx mkx) {
        int i;
        C67263Mkx mkx2 = mkx;
        C67521MpG mpG = mkx2.A0G;
        HashMap hashMap = mkx2.A0D;
        UserSession userSession = mkx2.A0A;
        AnonymousClass0iw r20 = mkx2.A09;
        2EM A002 = mkx2.A0C.A00();
        C73910Pll pll = new C73910Pll(mkx2, 39);
        0qQ.A0B(hashMap, 0);
        ArrayList A1D = AnonymousClass7TE.A1D(hashMap.values());
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A1D.iterator();
        int i2 = 11;
        int i3 = 13;
        int i4 = 31;
        int i5 = 15;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        while (it.hasNext()) {
            C66754Mbz mbz = (C66754Mbz) it.next();
            if (!mbz.A0F) {
                z2 = true;
            }
            if (mbz.A00 != 1) {
                i2 = 3;
            }
            if (!mbz.A0B) {
                i3 = 8;
            }
            if (!mbz.A0G) {
                i5 = 10;
            }
            int i6 = mbz.A01;
            if (AnonymousClass48O.A04(i6)) {
                z = true;
            }
            if (i6 != 29 || !0qQ.A0K(userSession.A06, mbz.A06)) {
                z4 = false;
            } else {
                if (!mbz.A0E) {
                    i4 = 30;
                }
                z3 = true;
            }
        }
        if (!z) {
            if (2El.A08(userSession)) {
                i = 45;
            } else {
                0Tu r15 = 0Tu.A05;
                if (182.A06(r15, userSession, 36316306424729819L) && A002.equals(AnonymousClass2EU.A00)) {
                    i = 5;
                } else if (182.A06(r15, userSession, 36316306424729819L) && A002.equals(AnonymousClass2EL.A00)) {
                    i = 6;
                }
            }
            AnonymousClass7TF.A1M(A1C, i);
        }
        if (z2) {
            AnonymousClass7TF.A1M(A1C, 4);
        }
        AnonymousClass7TF.A1M(A1C, i2);
        if (!z3) {
            AnonymousClass7TF.A1M(A1C, i3);
        }
        if (z4) {
            AnonymousClass7TF.A1M(A1C, i4);
        }
        if (!z) {
            AnonymousClass7TF.A1M(A1C, i5);
        }
        Context context = mpG.A00;
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A0e(new C71248OgD(0, A002, hashMap, A1C, r20, userSession, pll, mpG), C67484Moe.A08.A00(context, userSession, A1C));
        AnonymousClass7TH.A0a(A0Y, true);
    }

    public static final void A04(C67263Mkx mkx) {
        TextView textView;
        TextView textView2;
        if (mkx.A04 == null) {
            ViewStub viewStub = mkx.A05;
            TextView textView3 = null;
            if (viewStub == null) {
                0qQ.A0F("multiSelectFooterViewStub");
                throw AnonymousClass00P.createAndThrow();
            }
            View inflate = viewStub.inflate();
            mkx.A04 = inflate;
            AnonymousClass7TH.A0R(inflate);
            View view = mkx.A04;
            if (view != null) {
                textView = AnonymousClass7TE.A0d(view, R.id.inbox_footer_button_left);
            } else {
                textView = null;
            }
            mkx.A07 = textView;
            if (textView != null) {
                C71395Oju.A00(textView, 49, mkx);
            }
            View view2 = mkx.A04;
            if (view2 != null) {
                textView2 = AnonymousClass7TE.A0d(view2, R.id.inbox_footer_button_mid);
            } else {
                textView2 = null;
            }
            mkx.A00 = textView2;
            View view3 = mkx.A04;
            if (view3 != null) {
                textView3 = (TextView) view3.findViewById(R.id.inbox_footer_button_right);
            }
            mkx.A06 = textView3;
            if (textView3 != null) {
                C71395Oju.A00(textView3, 50, mkx);
            }
            if (A08(mkx)) {
                TextView textView4 = mkx.A00;
                if (textView4 != null) {
                    C71395Oju.A00(textView4, 51, mkx);
                    return;
                }
                return;
            }
            mkx.A00();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C67263Mkx r10) {
        /*
            boolean r0 = r10.A03
            r8 = 8
            if (r0 == 0) goto L_0x018f
            java.util.HashMap r7 = r10.A0D
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x018f
            java.util.HashSet r0 = r10.A0F
            boolean r0 = r0.isEmpty()
            r6 = 1
            r0 = r0 ^ 1
            r5 = 0
            if (r0 == 0) goto L_0x0152
            java.util.HashSet r0 = r10.A0E
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x0152
            android.widget.TextView r0 = r10.A07
            if (r0 == 0) goto L_0x0029
            r0.setVisibility(r8)
        L_0x0029:
            android.widget.TextView r4 = r10.A06
            if (r4 == 0) goto L_0x0049
            androidx.fragment.app.FragmentActivity r0 = r10.A08
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131820845(0x7f11012d, float:1.9274416E38)
            int r1 = r7.size()
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.DbV.A0v(r3, r0, r2, r1)
            r4.setText(r0)
        L_0x0049:
            boolean r0 = A08(r10)
            if (r0 == 0) goto L_0x00b6
            int r0 = r7.size()
            if (r0 != r6) goto L_0x0064
            com.instagram.common.session.UserSession r1 = r10.A0A
            X.0iw r0 = r10.A09
            X.Mos r2 = new X.Mos
            r2.<init>(r0, r1)
            java.lang.String r1 = "bulk_reply_button_impression"
            r0 = 0
            X.C67498Mos.A00(r2, r1, r0)
        L_0x0064:
            X.Moq r0 = r10.A01
            if (r0 == 0) goto L_0x0095
            java.util.Map r0 = r0.A0D
            boolean r0 = r0.isEmpty()
            if (r0 != r6) goto L_0x0095
            android.widget.TextView r3 = r10.A00
            if (r3 == 0) goto L_0x0084
            androidx.fragment.app.FragmentActivity r2 = r10.A08
            r1 = 2131967718(0x7f133ee6, float:1.957231E38)
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.DbX.A13(r2, r3, r0, r1)
        L_0x0084:
            android.widget.TextView r1 = r10.A00
            if (r1 == 0) goto L_0x008d
            androidx.fragment.app.FragmentActivity r0 = r10.A08
            X.DbY.A12(r1, r0)
        L_0x008d:
            android.view.View r0 = r10.A04
            if (r0 == 0) goto L_0x0094
            r0.setVisibility(r5)
        L_0x0094:
            return
        L_0x0095:
            android.widget.TextView r2 = r10.A00
            if (r2 == 0) goto L_0x00a1
            androidx.fragment.app.FragmentActivity r1 = r10.A08
            r0 = 2131967719(0x7f133ee7, float:1.9572312E38)
            X.DbT.A18(r1, r2, r0)
        L_0x00a1:
            android.widget.TextView r2 = r10.A00
            if (r2 == 0) goto L_0x008d
            androidx.fragment.app.FragmentActivity r1 = r10.A08
            r0 = 2130970278(0x7f0406a6, float:1.7549262E38)
            int r0 = X.2Yu.A0H(r1, r0)
            android.content.res.ColorStateList r0 = X.02K.A02(r1, r0)
            r2.setTextColor(r0)
            goto L_0x008d
        L_0x00b6:
            X.Mky r2 = r10.A0C
            X.2EM r1 = r2.A00()
            X.2EY r0 = X.AnonymousClass2EY.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0149
            X.2EM r1 = r2.A00()
            X.5y7 r0 = X.C300885y7.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0149
            X.2EM r1 = r2.A00()
            X.5y8 r0 = X.C300895y8.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0149
            X.2EM r1 = r2.A00()
            X.2EX r0 = X.AnonymousClass2EX.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0149
            X.2EM r1 = r2.A00()
            X.2Ea r0 = X.C69932Ea.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0149
            android.widget.TextView r4 = r10.A00
            if (r4 == 0) goto L_0x0114
            com.instagram.common.session.UserSession r0 = r10.A0A
            boolean r0 = X.2El.A08(r0)
            if (r0 == 0) goto L_0x0120
            androidx.fragment.app.FragmentActivity r0 = r10.A08
            android.content.res.Resources r2 = r0.getResources()
            r1 = 2131967730(0x7f133ef2, float:1.9572335E38)
            int r0 = r7.size()
            java.lang.String r0 = X.JTS.A0i(r2, r0, r1)
        L_0x0111:
            r4.setText(r0)
        L_0x0114:
            android.widget.TextView r0 = r10.A00
            if (r0 == 0) goto L_0x011b
            r0.setVisibility(r5)
        L_0x011b:
            r10.A00()
            goto L_0x008d
        L_0x0120:
            X.2EM r1 = r2.A00()
            X.2EU r0 = X.AnonymousClass2EU.A00
            boolean r1 = X.0qQ.A0K(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r10.A08
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131820847(0x7f11012f, float:1.927442E38)
            if (r1 == 0) goto L_0x0138
            r2 = 2131820846(0x7f11012e, float:1.9274418E38)
        L_0x0138:
            int r1 = r7.size()
            int r0 = r7.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.DbV.A0v(r3, r0, r2, r1)
            goto L_0x0111
        L_0x0149:
            android.widget.TextView r0 = r10.A00
            if (r0 == 0) goto L_0x008d
            r0.setVisibility(r8)
            goto L_0x008d
        L_0x0152:
            java.util.HashSet r9 = r10.A0E
            boolean r0 = X.DbT.A1b(r9)
            android.widget.TextView r4 = r10.A07
            if (r0 == 0) goto L_0x0183
            if (r4 == 0) goto L_0x017a
            androidx.fragment.app.FragmentActivity r0 = r10.A08
            android.content.res.Resources r3 = r0.getResources()
            r2 = 2131820844(0x7f11012c, float:1.9274414E38)
            int r1 = r9.size()
            int r0 = r9.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = X.DbV.A0v(r3, r0, r2, r1)
        L_0x0177:
            r4.setText(r0)
        L_0x017a:
            android.widget.TextView r0 = r10.A07
            if (r0 == 0) goto L_0x0029
            r0.setVisibility(r5)
            goto L_0x0029
        L_0x0183:
            if (r4 == 0) goto L_0x017a
            androidx.fragment.app.FragmentActivity r1 = r10.A08
            r0 = 2131967725(0x7f133eed, float:1.9572324E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0177
        L_0x018f:
            android.view.View r0 = r10.A04
            if (r0 == 0) goto L_0x0094
            r0.setVisibility(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67263Mkx.A05(X.Mkx):void");
    }

    public static final void A07(C67263Mkx mkx, boolean z) {
        mkx.A03 = z;
        mkx.A0D.clear();
        mkx.A0E.clear();
        mkx.A0F.clear();
        A05(mkx);
        C67264Mky mky = mkx.A0C;
        boolean z2 = mkx.A03;
        C273624mt r4 = mky.A00;
        C66633Ma2 ma2 = r4.A05;
        if (ma2 != null) {
            C66581MXm.A0V(ma2).C6W().EaT(z2);
        }
        boolean z3 = !mkx.A03;
        C66633Ma2 ma22 = r4.A05;
        if (ma22 != null) {
            if (2El.A07(ma22.A0p())) {
                C66581MXm.A0V(ma22).B6g().setEnabled(z3);
            } else {
                C66633Ma2.A0a(ma22, C66633Ma2.A06(ma22), ma22.A0o(), z3);
            }
        }
        mky.A01();
        C67496Moq moq = mkx.A01;
        if (moq != null) {
            moq.A04.clear();
            moq.A0D.clear();
            moq.A00 = null;
            moq.A03 = "";
        }
        if (!z) {
            C66633Ma2 ma23 = r4.A05;
            if (ma23 != null) {
                AnonymousClass7TF.A16(ma23.A0D);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final boolean A08(C67263Mkx mkx) {
        UserSession userSession = mkx.A0A;
        if (!182.A06(0Tu.A06, userSession, 36316306424729819L)) {
            return false;
        }
        if (182.A06(0Tu.A05, userSession, 36313166804223795L)) {
            return 2Ek.A00(DbT.A0j(userSession));
        }
        return true;
    }

    public final void A09(View view) {
        TextView textView;
        TextView textView2;
        if (182.A06(0Tu.A05, this.A0A, 36328431117417817L)) {
            this.A05 = DbS.A0F(view, R.id.direct_inbox_multi_select_footer_stub);
            return;
        }
        View findViewById = view.findViewById(R.id.direct_inbox_multi_select_footer);
        if (findViewById != null) {
            this.A04 = findViewById;
        } else {
            View A0V = JTR.A0V(view, R.id.direct_inbox_multi_select_footer_stub);
            this.A04 = A0V;
            AnonymousClass7TH.A0R(A0V);
        }
        View view2 = this.A04;
        TextView textView3 = null;
        if (view2 != null) {
            textView = AnonymousClass7TE.A0d(view2, R.id.inbox_footer_button_left);
        } else {
            textView = null;
        }
        this.A07 = textView;
        if (textView != null) {
            C71395Oju.A00(textView, 53, this);
        }
        View view3 = this.A04;
        if (view3 != null) {
            textView2 = AnonymousClass7TE.A0d(view3, R.id.inbox_footer_button_mid);
        } else {
            textView2 = null;
        }
        this.A00 = textView2;
        View view4 = this.A04;
        if (view4 != null) {
            textView3 = (TextView) view4.findViewById(R.id.inbox_footer_button_right);
        }
        this.A06 = textView3;
        if (textView3 != null) {
            C71395Oju.A00(textView3, 54, this);
        }
        if (A08(this)) {
            TextView textView4 = this.A00;
            if (textView4 != null) {
                C71395Oju.A00(textView4, 51, this);
                return;
            }
            return;
        }
        A00();
    }

    public final boolean A0A() {
        2EM A002 = this.A0C.A00();
        if ((A002 instanceof 2Ej) || 0qQ.A0K(A002, AnonymousClass2EU.A00) || 0qQ.A0K(A002, AnonymousClass2EL.A00) || 0qQ.A0K(A002, AnonymousClass2EX.A00) || 0qQ.A0K(A002, C69932Ea.A00) || 0qQ.A0K(A002, AnonymousClass2EY.A00) || 0qQ.A0K(A002, C300885y7.A00) || 0qQ.A0K(A002, C300895y8.A00)) {
            return true;
        }
        return false;
    }

    public C67263Mkx(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession, C67492Mom mom, C67521MpG mpG, C67264Mky mky, C358248ab r8) {
        this.A08 = fragmentActivity;
        this.A0C = mky;
        this.A0G = mpG;
        this.A0B = mom;
        this.A0A = userSession;
        this.A09 = r3;
        this.A0H = r8;
    }

    public static final void A06(C67263Mkx mkx, List list, boolean z) {
        int i;
        if (AnonymousClass7TE.A1b(list)) {
            C313756gx A002 = C313746gw.A00(mkx.A0A);
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass7TF.A1M(A0r, ((2Er) it.next()).AdN());
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String C6C = ((2Eq) it2.next()).C6C();
                if (C6C != null) {
                    A1C.add(C6C);
                }
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String C6k = ((2Eq) it3.next()).C6k();
                if (C6k != null) {
                    A1C2.add(C6k);
                }
            }
            1Ln A0J = DbT.A0J(A002);
            if (DbT.A1Y(A0J)) {
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("ig_thread_ids", 00k.A0P(",", "", "", A1C, (0sP) null));
                A1E.put("consistent_thread_fbid", 00k.A0P(",", "", "", A1C2, (0sP) null));
                DbW.A17(A0J, A002);
                if (z) {
                    i = 3422;
                } else {
                    i = 3423;
                }
                DbV.A1M(A0J, C273654mx.A00(i));
                A0J.A0p("bulk_delete_with_broadcast_chat_dialog");
                A0J.A0q("inbox");
                A0J.A0o(C313756gx.A06(A0r));
                A0J.A0w(A1E);
                A0J.Cgf();
            }
        }
    }
}
