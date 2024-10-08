package X;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.igds.components.peoplecell.IgdsPeopleCell;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Ukv  reason: case insensitive filesystem */
public final class C15930Ukv extends UZB implements AnonymousClass0iw, XBQ {
    public static final long A0G = JTR.A0N(TimeUnit.HOURS);
    public static final String __redex_internal_original_name = "DirectLiveLocationMapFragment";
    public LinearLayout A00;
    public UHR A01;
    public BottomSheetBehavior A02;
    public BottomSheetBehavior A03;
    public ImmutableMap A04;
    public IgTextView A05;
    public IgdsButton A06;
    public IgdsButton A07;
    public IgdsButton A08;
    public IgdsButton A09;
    public IgdsPeopleCell A0A;
    public final AnonymousClass0eM A0B = UZB.A00(this, 32);
    public final AnonymousClass0eM A0C = UZB.A00(this, 33);
    public final AnonymousClass0eM A0D = UZB.A00(this, 34);
    public final AnonymousClass0eM A0E = UZB.A00(this, 35);
    public final AnonymousClass9HB A0F = new AnonymousClass9HB();

    private final void A02(BottomSheetBehavior bottomSheetBehavior, int i) {
        bottomSheetBehavior.A0N = true;
        bottomSheetBehavior.A0b(true);
        bottomSheetBehavior.A0V((int) 0nA.A00(requireContext(), 308.0f));
        bottomSheetBehavior.A0W(i);
        bottomSheetBehavior.A0a(new UWA(bottomSheetBehavior));
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.center_location_button);
        T6B t6b = this.A01;
        if (t6b != null) {
            if (t6b.A00(__redex_internal_original_name) != null) {
                A0G2.setVisibility(0);
                WB8.A00(A0G2, 32, this);
            }
            WB8.A00(view.requireViewById(R.id.back_button), 33, this);
            ViewStub A0X = JTR.A0X(view, R.id.location_sharers_bottomsheet);
            if (A0X.getParent() != null) {
                View inflate = A0X.inflate();
                View findViewById = inflate.findViewById(R.id.people_cell_bottomsheet);
                BottomSheetBehavior A012 = BottomSheetBehavior.A01(findViewById);
                0qQ.A07(A012);
                ScrollView scrollView = (ScrollView) findViewById.findViewById(R.id.people_cell_list_scroll_view);
                if (scrollView != null) {
                    scrollView.setOnScrollChangeListener(new C18892WBj(scrollView, A012));
                }
                this.A00 = (LinearLayout) findViewById.findViewById(R.id.people_cell_list);
                IgdsButton igdsButton = null;
                if (DbX.A1a(this.A0B.getValue())) {
                    IgdsButton igdsButton2 = (IgdsButton) inflate.findViewById(R.id.share_location_button);
                    if (igdsButton2 != null) {
                        WB8.A00(igdsButton2, 34, this);
                    } else {
                        igdsButton2 = null;
                    }
                    this.A08 = igdsButton2;
                    IgTextView A0X2 = JTO.A0X(inflate, R.id.start_live_sharing_footer_info_text);
                    if (A0X2 != null) {
                        A0X2.setVisibility(0);
                    } else {
                        A0X2 = null;
                    }
                    this.A05 = A0X2;
                }
                IgdsButton igdsButton3 = (IgdsButton) inflate.findViewById(R.id.stop_live_sharing_button);
                if (igdsButton3 != null) {
                    WB8.A00(igdsButton3, 35, this);
                    igdsButton = igdsButton3;
                }
                this.A09 = igdsButton;
                A02(A012, 4);
                this.A02 = A012;
                ViewStub A0X3 = JTR.A0X(view, R.id.single_sharer_bottomsheet);
                if (A0X3.getParent() != null) {
                    View findViewById2 = A0X3.inflate().findViewById(R.id.single_sharer_bottomsheet);
                    BottomSheetBehavior A013 = BottomSheetBehavior.A01(findViewById2);
                    0qQ.A07(A013);
                    this.A0A = (IgdsPeopleCell) findViewById2.findViewById(R.id.single_sharer);
                    this.A07 = (IgdsButton) findViewById2.findViewById(R.id.message_sharer_button);
                    this.A06 = (IgdsButton) findViewById2.findViewById(R.id.get_directions_to_sharer_button);
                    A02(A013, 5);
                    this.A03 = A013;
                }
            }
            UHR uhr = this.A01;
            if (uhr == null) {
                str = "locationSharingPresenter";
            } else {
                uhr.A0A(bundle);
                return;
            }
        } else {
            str = "locationManager";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r4 == -1) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void EEv(X.C18042VkQ r19) {
        /*
            r18 = this;
            r0 = r19
            X.V4A r1 = r0.A00
            java.lang.Object r0 = r0.A01
            java.lang.Object r3 = r1.A00(r0)
            X.0qQ.A07(r3)
            X.Vjv r3 = (X.C18019Vjv) r3
            int r4 = r3.A04
            if (r4 > 0) goto L_0x0017
            r0 = -1
            r11 = 0
            if (r4 != r0) goto L_0x0018
        L_0x0017:
            r11 = 1
        L_0x0018:
            r12 = r18
            com.instagram.igds.components.button.IgdsButton r1 = r12.A08
            r2 = 8
            if (r1 == 0) goto L_0x0028
            r0 = 0
            if (r11 == 0) goto L_0x0025
            r0 = 8
        L_0x0025:
            r1.setVisibility(r0)
        L_0x0028:
            com.instagram.igds.components.button.IgdsButton r1 = r12.A09
            if (r1 == 0) goto L_0x0033
            int r0 = X.C13988Tno.A0E(r11)
            r1.setVisibility(r0)
        L_0x0033:
            com.instagram.common.ui.base.IgTextView r0 = r12.A05
            if (r0 == 0) goto L_0x003d
            if (r11 != 0) goto L_0x003a
            r2 = 0
        L_0x003a:
            r0.setVisibility(r2)
        L_0x003d:
            com.google.common.collect.ImmutableList r5 = r3.A07
            X.0qQ.A07(r5)
            X.VZ8 r1 = r12.A00
            if (r1 == 0) goto L_0x0086
            X.WFU r0 = r1.A01
            r0.A03()
            java.util.Map r0 = r1.A03
            r0.clear()
            X.3kO r3 = X.C66580MXl.A0J(r5)
        L_0x0054:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r2 = r3.next()
            X.Vkf r2 = (X.C18057Vkf) r2
            com.google.common.collect.ImmutableMap r1 = r12.A04
            if (r1 != 0) goto L_0x006e
            java.lang.String r8 = "participants"
        L_0x0066:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x006e:
            java.lang.String r0 = r2.A02
            java.lang.Object r0 = r1.get(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0054
            com.instagram.common.typedurl.ImageUrl r13 = r0.Bh3()
            double r14 = r2.A00
            double r0 = r2.A01
            r16 = r0
            r12.A05(r13, r14, r16)
            goto L_0x0054
        L_0x0086:
            android.widget.LinearLayout r7 = r12.A00
            if (r7 == 0) goto L_0x0136
            r7.removeAllViews()
            r7.invalidate()
            X.3kO r10 = X.C66580MXl.A0J(r5)
            r9 = 0
            r2 = 0
            r6 = 0
        L_0x0097:
            boolean r0 = r10.hasNext()
            java.lang.String r8 = "participants"
            if (r0 == 0) goto L_0x00d5
            java.lang.Object r5 = r10.next()
            X.Vkf r5 = (X.C18057Vkf) r5
            java.lang.String r3 = r5.A02
            X.0eE r1 = X.AnonymousClass0t1.A01
            X.0eM r0 = r12.A04
            com.instagram.user.model.User r0 = X.DbX.A0l(r1, r0)
            java.lang.Long r0 = r0.BST()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x00bf
            r2 = r5
            goto L_0x0097
        L_0x00bf:
            com.google.common.collect.ImmutableMap r0 = r12.A04
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r0.get(r3)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0097
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r0 = r12.A01(r5, r0)
            r7.addView(r0)
            int r6 = r6 + 1
            goto L_0x0097
        L_0x00d5:
            if (r2 == 0) goto L_0x0136
            com.google.common.collect.ImmutableMap r1 = r12.A04
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = r2.A02
            java.lang.Object r0 = r1.get(r0)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            if (r0 == 0) goto L_0x0136
            com.instagram.igds.components.peoplecell.IgdsPeopleCell r5 = r12.A01(r2, r0)
            if (r11 == 0) goto L_0x012a
            android.content.Context r2 = r12.requireContext()
            r1 = 2131959657(0x7f131f69, float:1.955596E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.String r8 = X.DbW.A0h(r2, r0, r1)
            android.content.res.Resources r11 = X.JTR.A0R(r12)
            long r2 = X.JTR.A0L()
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = (long) r4
            long r0 = r10.toSeconds(r0)
            long r2 = r2 + r0
            double r0 = (double) r2
            java.lang.String r2 = X.1G0.A0A(r11, r0)
            if (r8 == 0) goto L_0x012e
            int r0 = r8.length()
            if (r0 == 0) goto L_0x012e
            android.widget.TextView r1 = r5.A06
            r1.setText(r8)
            r1.setVisibility(r9)
            if (r2 == 0) goto L_0x012a
            int r0 = r2.length()
            if (r0 == 0) goto L_0x012a
            r1.setContentDescription(r2)
        L_0x012a:
            r7.addView(r5, r6)
            return
        L_0x012e:
            android.widget.TextView r1 = r5.A06
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x012a
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15930Ukv.EEv(X.VkQ):void");
    }

    private final IgdsPeopleCell A01(C18057Vkf vkf, User user) {
        IgdsPeopleCell igdsPeopleCell = new IgdsPeopleCell(requireContext(), false);
        User user2 = user;
        igdsPeopleCell.A08(user2.getUsername(), false);
        igdsPeopleCell.A04(user2.Bh3(), (View.OnClickListener) null);
        WB4.A00(igdsPeopleCell, vkf, user2, this, 18);
        igdsPeopleCell.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        T6B t6b = this.A01;
        if (t6b != null) {
            Location A002 = t6b.A00(__redex_internal_original_name);
            if (A002 != null && !0qQ.A0K(vkf.A02, String.valueOf(DbX.A0l(AnonymousClass0t1.A01, this.A04).BST()))) {
                Context requireContext = requireContext();
                String A012 = C18792W1y.A01(requireContext, A002.getLatitude(), A002.getLongitude(), vkf.A00, vkf.A01);
                0qQ.A07(A012);
                igdsPeopleCell.A07(DbY.A0c(requireContext, A012, 2131959665));
            }
            return igdsPeopleCell;
        }
        0qQ.A0F("locationManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A06(VZ8 vz8) {
        super.A06(vz8);
        vz8.A02.add(new WIQ(this));
        Number A0r = C66580MXl.A0r(this.A0C);
        Number A0r2 = C66580MXl.A0r(this.A0D);
        if (A0r != null && A0r2 != null) {
            A04(A0r.doubleValue(), A0r2.doubleValue());
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1168436017);
        super.onCreate(bundle);
        AnonymousClass0eM r5 = this.A0E;
        String A0t = DbS.A0t(r5);
        if (A0t != null) {
            AnonymousClass0eM r6 = this.A04;
            AnonymousClass3U9 A0N = 1bJ.A00(AnonymousClass7TE.A0l(r6)).A0N(A0t);
            if (A0N != null) {
                List BRZ = A0N.BRZ();
                ArrayList arrayList = new ArrayList();
                for (Object next : BRZ) {
                    if (((User) next).BST() != null) {
                        arrayList.add(next);
                    }
                }
                ArrayList A0U = 00k.A0U(arrayList);
                A0U.add(DbX.A0l(AnonymousClass0t1.A01, r6));
                ArrayList A0r = AnonymousClass7TG.A0r(A0U);
                Iterator it = A0U.iterator();
                while (it.hasNext()) {
                    User A0k = DbT.A0k(it);
                    AnonymousClass7TF.A1I(String.valueOf(A0k.BST()), A0k, A0r);
                }
                this.A04 = ImmutableMap.copyOf(0Yt.A08(A0r));
            }
        }
        String A0t2 = DbS.A0t(r5);
        if (A0t2 != null) {
            Context requireContext = requireContext();
            AnonymousClass0eM r1 = this.A04;
            UserSession A0l = AnonymousClass7TE.A0l(r1);
            0qQ.A0B(A0l, 2);
            AnonymousClass7AZ r12 = new AnonymousClass7AZ(requireContext, A0l);
            C17421VVa vVa = new C17421VVa(A0l);
            String A0u = DbU.A0u(r1);
            if (TextUtils.isEmpty(A0t2)) {
                throw new IllegalArgumentException("\"groupishId\" must not be null or empty");
            } else if (!TextUtils.isEmpty(A0u)) {
                this.A01 = new UHR(requireContext, this, A0l, (VN1) null, (C15931Ukw) null, vVa, r12, (DirectShareTarget) null, A0t2, __redex_internal_original_name, "igd_live_location_xma", "igd_live_location_xma", A0u, false);
                AnonymousClass0fD.A09(195634172, A022);
            } else {
                throw new IllegalArgumentException("\"userId\" must not be null or empty");
            }
        } else {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-748417726, A022);
            throw A0y;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(874449582);
        0qQ.A0B(layoutInflater, 0);
        this.A0F.A02(viewGroup);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_location_sharing_xma, viewGroup, false);
        AnonymousClass0fD.A09(1766656320, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2053442620);
        super.onDestroyView();
        UHR uhr = this.A01;
        if (uhr == null) {
            0qQ.A0F("locationSharingPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        uhr.A06();
        this.A02 = null;
        this.A00 = null;
        this.A03 = null;
        this.A0A = null;
        this.A08 = null;
        this.A09 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        AnonymousClass0fD.A09(-437872667, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(868614215);
        super.onPause();
        UHR uhr = this.A01;
        if (uhr == null) {
            0qQ.A0F("locationSharingPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        uhr.A08();
        AnonymousClass0fD.A09(759781784, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(9270900);
        super.onResume();
        UHR uhr = this.A01;
        if (uhr == null) {
            0qQ.A0F("locationSharingPresenter");
            throw AnonymousClass00P.createAndThrow();
        }
        uhr.A07();
        AnonymousClass0fD.A09(739733245, A022);
    }
}
