package X;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.user.model.User;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class NKU extends AnonymousClass32G implements AnonymousClass0iw, C273494mf {
    public static final String __redex_internal_original_name = "StartFRXReportV2BottomSheetFragment";
    public float A00;
    public int A01 = 0;
    public LinearLayout A02;
    public UserSession A03;
    public IgTextView A04;
    public C331157Pu A05;
    public IgdsButton A06;
    public User A07;
    public NL4 A08;
    public C71084Ob7 A09;
    public C16666Uz2 A0A;
    public C14068TpH A0B;
    public C16677UzD A0C;
    public C74488Pvi A0D;
    public NHU A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public HashMap A0J;
    public boolean A0K = false;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public final void A0Z() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final 0lg A0Y() {
        return this.A03;
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final String getModuleName() {
        return this.A0F;
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        NHU nhu = this.A0E;
        if (nhu != null) {
            C331157Pu r1 = this.A05;
            r1.getClass();
            r1.A0M(nhu.A00().A0G.A00);
        }
        C66582MXn.A15(this.A04, i, i2);
        C66582MXn.A15(this.A02, i, i2);
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        Context requireContext;
        String str;
        int A022 = AnonymousClass0fD.A02(-167596311);
        NKU.super.onCreate(bundle);
        if (bundle != null) {
            C66580MXl.A1G(this);
            i = -284643879;
        } else if (this.A05 == null || this.A0D == null) {
            i = 1080839072;
        } else {
            Bundle requireArguments = requireArguments();
            this.A03 = DbX.A0U(this);
            this.A0F = DbU.A0l(requireArguments, "StartFRXReportV2BottomSheetFragment.analytics_module");
            this.A0G = DbU.A0l(requireArguments, "StartFRXReportV2BottomSheetFragment.content_id");
            Serializable serializable = requireArguments.getSerializable("StartFRXReportV2BottomSheetFragment.entry_point");
            serializable.getClass();
            this.A0A = (C16666Uz2) serializable;
            Serializable serializable2 = requireArguments.getSerializable("StartFRXReportV2BottomSheetFragment.location");
            serializable2.getClass();
            this.A0B = (C14068TpH) serializable2;
            Serializable serializable3 = requireArguments.getSerializable("StartFRXReportV2BottomSheetFragment.object_type");
            serializable3.getClass();
            this.A0C = (C16677UzD) serializable3;
            this.A0I = requireArguments.getString("StartFRXReportV2BottomSheetFragment.object");
            this.A0N = requireArguments.getBoolean("StartFRXReportV2BottomSheetFragment.is_interop_thread");
            this.A0L = requireArguments.getBoolean("StartFRXReportV2BottomSheetFragment.is_encrypted_thread");
            this.A0H = requireArguments.getString("StartFRXReportV2BottomSheetFragment.direct_thread_id");
            this.A0M = requireArguments.getBoolean("StartFRXReportV2BottomSheetFragment.is_fullscreen_enabled");
            this.A00 = requireArguments.getFloat("StartFRXReportV2BottomSheetFragment.initial_opening_height_ratio");
            Serializable serializable4 = requireArguments.getSerializable("StartFRXReportBottomSheetFragment.ARG_EXTRAS");
            serializable4.getClass();
            this.A0J = (HashMap) serializable4;
            int i2 = requireArguments.getInt("StartFRXReportBottomSheetFragment.ARG_THEME_OVERRIDE");
            this.A01 = i2;
            if (i2 != 0) {
                requireContext = new ContextThemeWrapper(requireContext(), this.A01);
            } else {
                requireContext = requireContext();
            }
            NL4 nl4 = new NL4(requireContext, this.A03, this, this);
            this.A08 = nl4;
            A0V(nl4);
            C331157Pu r15 = this.A05;
            r15.getClass();
            C74488Pvi pvi = this.A0D;
            pvi.getClass();
            Context requireContext2 = requireContext();
            UserSession userSession = this.A03;
            User user = this.A07;
            String str2 = this.A0G;
            boolean z = this.A0M;
            float f = this.A00;
            HashMap hashMap = this.A0J;
            String str3 = this.A0F;
            C16666Uz2 uz2 = this.A0A;
            C14068TpH tpH = this.A0B;
            C16677UzD uzD = this.A0C;
            String str4 = this.A0I;
            boolean z2 = this.A0N;
            boolean z3 = this.A0L;
            C331157Pu r20 = r15;
            User user2 = user;
            C16666Uz2 uz22 = uz2;
            C14068TpH tpH2 = tpH;
            C16677UzD uzD2 = uzD;
            C74488Pvi pvi2 = pvi;
            String str5 = str2;
            UserSession userSession2 = userSession;
            C70988OVc oVc = new C70988OVc(getRootActivity(), requireContext2, userSession2, r20, user2, uz22, tpH2, uzD2, pvi2, str5, str3, str4, this.A0H, hashMap, f, z, z2, z3);
            C71038Oa2 oa2 = new C71038Oa2(this.A0A, this.A0B, this.A0C, this.A0F);
            Context requireContext3 = requireContext();
            UserSession userSession3 = this.A03;
            ONV A002 = C49238Erh.A00(userSession3, this.A0L);
            C49530ExC A003 = ORV.A00(this.A03, this.A0L);
            String str6 = this.A0F;
            String str7 = this.A0G;
            NHU nhu = this.A0E;
            C71084Ob7 ob7 = new C71084Ob7(requireContext3, userSession3, user, A002, A003, oa2, this, oVc, this.A0A, this.A0B, this.A0C, pvi, nhu, str6, str7, this.A0I, this.A0J);
            this.A09 = ob7;
            C71038Oa2 oa22 = ob7.A00;
            NHU nhu2 = ob7.A0E;
            if (nhu2 != null) {
                str = nhu2.A00().A00();
            } else {
                str = null;
            }
            oa22.A04(AnonymousClass05K.A00, str, false);
            this.A0K = true;
            i = -1600482786;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context requireContext;
        int A022 = AnonymousClass0fD.A02(-1269807505);
        if (this.A01 != 0) {
            requireContext = new ContextThemeWrapper(requireContext(), this.A01);
        } else {
            requireContext = requireContext();
        }
        View A0C2 = DbT.A0C(LayoutInflater.from(requireContext), viewGroup, R.layout.frx_report_fragment);
        AnonymousClass0fD.A09(-1905935920, A022);
        return A0C2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1515522208);
        super.onDestroyView();
        if (this.A0K) {
            C49960FGs.A02(getActivity());
            try {
                this.A09.A00.A01();
            } catch (NullPointerException e) {
                0wb.A07("StartFRXReportV2PresenterImpl", e);
            }
            this.A02 = null;
            this.A06 = null;
            this.A04 = null;
        }
        AnonymousClass0fD.A09(-1005747008, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        1NY A002;
        boolean z;
        String str;
        super.onViewCreated(view, bundle);
        if (this.A09 != null) {
            this.A02 = (LinearLayout) view.findViewById(R.id.frx_report_action_button_wrapper);
            this.A06 = (IgdsButton) view.findViewById(R.id.frx_report_action_button);
            this.A04 = JTO.A0X(view, R.id.frx_footer_view);
            C71084Ob7 ob7 = this.A09;
            Context requireContext = requireContext();
            NHU nhu = ob7.A0E;
            if (nhu != null) {
                OM1 A003 = nhu.A00();
                NKU nku = ob7.A08;
                CharSequence A004 = C71084Ob7.A00(ob7, A003.A0H);
                if (A003.A00() != null) {
                    z = A003.A00().contains("IG_USER_IMPERSONATION".toLowerCase(Locale.US));
                } else {
                    z = false;
                }
                OTO oto = A003.A01;
                C331157Pu r1 = nku.A05;
                r1.getClass();
                r1.A0M(A003.A0G.A00);
                NL4 nl4 = nku.A08;
                C70754OKa oKa = A003.A0F;
                if (oKa != null) {
                    str = oKa.A00;
                } else {
                    str = null;
                }
                0sn r6 = A003.A0D;
                if (r6 == null) {
                    r6 = 0sn.A00;
                }
                C69334NjZ njZ = A003.A08;
                C70662OFj oFj = A003.A07;
                nl4.A03 = str;
                nl4.A02 = A004;
                List list = nl4.A04;
                list.clear();
                if (!r6.isEmpty()) {
                    list.addAll(r6);
                }
                nl4.A01 = njZ;
                nl4.A00 = oFj;
                NL4.A00(nl4);
                if (!(oto == null || nku.A06 == null)) {
                    0S7.A00(nku);
                    0nA.A0X(nku.A04, DbV.A05(nku).getDimensionPixelSize(R.dimen.action_bar_immersive_gradient_height));
                    nku.A06.setText(oto.A01.A00);
                    C71409Ok8.A01(nku.A06, 48, oto, nku);
                    int i = 0;
                    boolean A1W = AnonymousClass7TF.A1W(A003.A08, C69334NjZ.RADIO_BUTTONS);
                    nku.A06.setEnabled(!A1W);
                    LinearLayout linearLayout = nku.A02;
                    if (z && !A1W) {
                        i = 8;
                    }
                    if (linearLayout != null) {
                        linearLayout.setVisibility(i);
                    }
                    C71084Ob7 ob72 = nku.A09;
                    ob72.getClass();
                    ob72.A00.A05(2);
                    ob72.A07.A02(ob72.A06, ob72.A03, ob72.A0F, OTO.A00(oto));
                }
                if (A003.A08 == C69334NjZ.RADIO_BUTTONS) {
                    0sn<OGY> r0 = A003.A0D;
                    if (r0 == null) {
                        r0 = 0sn.A00;
                    }
                    for (OGY ogy : r0) {
                        if (ogy.A04) {
                            ob7.A04(ogy);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            boolean A005 = AnonymousClass3HA.A00(requireContext);
            String str2 = ob7.A0G;
            UserSession userSession = ob7.A05;
            String str3 = ob7.A0H;
            if (str2 == null) {
                String str4 = ob7.A0F;
                C16666Uz2 uz2 = ob7.A0A;
                C14068TpH tpH = ob7.A0B;
                C16677UzD uzD = ob7.A0C;
                A002 = ORS.A00(userSession, uz2, tpH, str3, ob7.A0I);
                A002.A9m("object_type", uzD.toString());
                A002.A9m("object_id", str4);
            } else {
                A002 = ORS.A00(userSession, ob7.A0A, ob7.A0B, str3, ob7.A0I);
                A002.A9m("object", str2);
            }
            A002.A0H(AnonymousClass000.A00(1506), A005);
            1OC A0M2 = A002.A0M();
            A0M2.A00 = new NME(ob7);
            schedule(A0M2);
        }
    }
}
