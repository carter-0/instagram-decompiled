package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.KPi  reason: case insensitive filesystem */
public final class C61869KPi extends C61347K3p implements AnonymousClass4DR, MV0 {
    public static final String __redex_internal_original_name = "VideoFilterFragment";
    public int A00;
    public int A01;
    public ViewGroup A02;
    public ViewSwitcher A03;
    public C66534MVo A04;
    public C60715Jq4 A05;
    public C378369Pn A06;
    public HashMap A07 = AnonymousClass7TE.A1E();
    public List A08;
    public boolean A09;
    public boolean A0A;
    public View A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;

    public final void DAe(View view, float f, float f2) {
        this.A09 = true;
        View view2 = this.A0B;
        if (view2 == null) {
            view2 = requireActivity().findViewById(R.id.view_drag_overlay);
            this.A0B = view2;
            if (view2 == null) {
                throw AnonymousClass7TE.A0y();
            }
        }
        view2.setVisibility(0);
    }

    public final void DAi() {
    }

    public final void DAj(View view, float f, float f2, boolean z, boolean z2) {
    }

    public final String getModuleName() {
        return "video_filter";
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        0qQ.A0B(bundle, 0);
        super.onSaveInstanceState(bundle);
        if (this.A04 != null) {
            A01(this, false);
        }
        bundle.putInt("VideoFilterFragment.FILTER_ID", this.A00);
        C60715Jq4 jq4 = this.A05;
        if (jq4 != null) {
            i = jq4.getScrollX();
        } else {
            i = 0;
        }
        bundle.putInt("VideoFilterFragment.FILTER_SCROLL_X", i);
        bundle.putBoolean("VideoFilterFragment.FILTERS_REORDERED", this.A09);
        bundle.putSerializable("VideoFilterFragment.FILTER_STRENGTH_MAP", this.A07);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        boolean z;
        AnonymousClass0r6 r3;
        AnonymousClass4D7 r2;
        int i2;
        C60715Jq4 jq4;
        Object value;
        boolean z2;
        boolean z3;
        Integer num;
        View requireViewById;
        int i3;
        MediaEditActionBar BQ1;
        MediaEditActionBar BQ12;
        ViewStub A0F;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        ViewGroup viewGroup = (ViewGroup) view2;
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        C63955LFb lFb = this.A04;
        C378369Pn r0 = null;
        if (lFb != null) {
            r0 = lFb.A03;
        }
        this.A06 = r0;
        this.A03 = (ViewSwitcher) view2.requireViewById(R.id.video_filter_switcher);
        this.A02 = DbU.A0C(view2, R.id.adjust_container);
        boolean A052 = JWN.A05(requireContext());
        if (!A052 || !((C60231Jho) this.A0D.getValue()).A00()) {
            View view3 = this.A00;
            if (!(view3 == null || (A0F = DbS.A0F(view3, R.id.accept_reject_buttons_stub)) == null)) {
                int i4 = R.layout.accept_reject_edit_buttons;
                if (A052) {
                    i4 = R.layout.accept_reject_edit_buttons_v3;
                }
                A0F.setLayoutResource(i4);
                A0F.inflate();
            }
            if (A052) {
                View view4 = this.A00;
                if (view4 != null) {
                    LYD.A02(view4.requireViewById(R.id.button_accept_adjust), 54, this);
                    View view5 = this.A00;
                    if (view5 != null) {
                        requireViewById = view5.requireViewById(R.id.button_cancel_adjust);
                        i3 = 55;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                if (this.A02 != null) {
                    if (182.A06(0Tu.A06, A0A(), 36318754556418478L)) {
                        this.A0A = true;
                        C273524mj r02 = this.A02;
                        if (r02 == null || (BQ1 = r02.BQ1()) == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        LYD.A02(BQ1.requireViewById(R.id.button_accept_adjust), 56, this);
                        C273524mj r03 = this.A02;
                        if (r03 == null || (BQ12 = r03.BQ1()) == null) {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        requireViewById = BQ12.requireViewById(R.id.button_cancel_adjust);
                        i3 = 57;
                    }
                }
                LYD.A02(requireActivity().requireViewById(R.id.button_accept_adjust), 58, this);
                requireViewById = requireActivity().requireViewById(R.id.button_cancel_adjust);
                i3 = 59;
            }
            LYD.A02(requireViewById, i3, this);
        }
        C378379Po r1 = this.A05;
        if (r1 != null) {
            C378369Pn r04 = this.A06;
            if (r04 != null) {
                r1.A06 = r04;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        if (bundle != null || JTT.A0e(this) == null) {
            i = requireArguments().getInt("VideoFilterFragment.FILTER_ID", 0);
        } else {
            AnonymousClass3Q2 A0e = JTT.A0e(this);
            if (A0e != null) {
                i = A0e.A1i.A01;
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        this.A00 = i;
        this.A01 = i;
        UserSession A0A2 = A0A();
        C64933LkY lkY = new C64933LkY(A0A2);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C63805L7l l7l : C63125Krt.A00(A0A2)) {
            0qQ.A0A(l7l);
            A1C.add(new C61713KJe(l7l, lkY));
        }
        this.A08 = A1C;
        int A002 = C63126Kru.A00(A1C, this.A00);
        if (A002 == -1) {
            this.A00 = 0;
            A002 = 0;
            z = true;
        } else {
            z = false;
        }
        AnonymousClass3Q2 A0e2 = JTT.A0e(this);
        if (A0e2 != null) {
            AnonymousClass3QG r12 = A0e2.A1i;
            int i5 = this.A00;
            r12.A01 = i5;
            A00(this, A0e2, i5);
            ViewGroup A0I = DbX.A0I(view2, R.id.filter_picker_frame);
            float f = RecyclerView.A1E;
            C60715Jq4 jq42 = new C60715Jq4(getThemedContext());
            jq42.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            jq42.setClipChildren(false);
            A0I.addView(jq42);
            this.A05 = jq42;
            C63124Krs.A00(A0A());
            C60715Jq4 jq43 = this.A05;
            if (jq43 != null) {
                jq43.setBlurIconCache(C59953JcJ.A00(A0A()));
            }
            C60715Jq4 jq44 = this.A05;
            if (jq44 != null) {
                jq44.A05 = true;
                jq44.A02 = new C64947Lkm(this);
                List list = this.A08;
                if (list == null) {
                    0qQ.A0F("filterList");
                    throw AnonymousClass00P.createAndThrow();
                }
                A0A();
                jq44.A03 = list;
                jq44.A04 = false;
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            C60715Jq4 jq45 = this.A05;
            if (jq45 != null) {
                for (C60060Jeb jeb : jq45.getTileFrames()) {
                    C60070Jez jez = jeb.A05;
                    if (C66568MWw.A00(jez) != -1) {
                        C66568MWw.A03(jeb, jez, A1C2);
                    }
                }
                C59953JcJ.A00(A0A()).A07(requireContext(), A1C2);
                AnonymousClass0eM r13 = this.A0D;
                boolean A003 = ((C60231Jho) r13.getValue()).A00();
                C60231Jho jho = (C60231Jho) r13.getValue();
                if (A003) {
                    05G r32 = jho.A00;
                    do {
                        value = r32.getValue();
                        z2 = jho.A02;
                        z3 = !z2;
                        num = (Integer) ((C61039Jvd) value).A01;
                        0qQ.A0B(num, 0);
                    } while (!r32.AIY(value, new C61039Jvd(num, false, z3, z3, z2, z3)));
                    r3 = ((C60263JiK) this.A0C.getValue()).A01;
                    r2 = null;
                    i2 = 7;
                } else {
                    r3 = jho.A01;
                    r2 = null;
                    i2 = 8;
                }
                DbZ.A1C(this, new MGY(this, r2, i2), r3);
                if (z && (jq4 = this.A05) != null) {
                    jq4.A1I(0);
                }
                C60715Jq4 jq46 = this.A05;
                if (jq46 != null) {
                    jq46.setRestoreSelectedIndex(A002);
                }
                this.A09 = requireArguments().getBoolean("VideoFilterFragment.FILTERS_REORDERED");
                View view6 = this.A00;
                if (view6 != null) {
                    JWN.A04(view6);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public static final void A00(C61869KPi kPi, AnonymousClass3Q2 r4, int i) {
        FilterGroupModel filterGroupModel = kPi.A06;
        if (filterGroupModel != null) {
            FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) filterGroupModel;
            if (filterGroupModelImpl.A04) {
                C63122Krq.A00(filterGroupModelImpl.A02, i, r4.A1i.A00);
                return;
            }
        }
        C378369Pn r0 = kPi.A06;
        if (r0 != null) {
            r0.B5q();
        }
    }

    public final void DAX(View view, boolean z) {
        View view2 = this.A0B;
        if (view2 != null) {
            view2.setVisibility(8);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean onBackPressed() {
        if (this.A04 == null) {
            return false;
        }
        A01(this, false);
        return true;
    }

    public C61869KPi() {
        C58683Ivs ivs = new C58683Ivs(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C66296MMf.A00(C66296MMf.A00(this, 48), 49));
        this.A0D = DbS.A0I(new C58683Ivs(A002, 0), ivs, MMY.A00(A002, (Object) null, 35), DbS.A0z(C60231Jho.class));
        this.A0C = DbS.A0I(C66296MMf.A00(this, 47), new C58683Ivs(this, 1), MMY.A00(this, (Object) null, 34), DbS.A0z(C60263JiK.class));
    }

    public static final void A01(C61869KPi kPi, boolean z) {
        AnonymousClass3QG r0;
        Object value;
        boolean z2;
        Integer num;
        C59888JbD.A00(kPi.A0A());
        AnonymousClass0eM r1 = kPi.A0D;
        if (!((C60231Jho) r1.getValue()).A00()) {
            C60231Jho jho = (C60231Jho) r1.getValue();
            05G r2 = jho.A00;
            do {
                value = r2.getValue();
                z2 = jho.A02;
                num = (Integer) ((C61039Jvd) value).A01;
            } while (!r2.AIY(value, new C61039Jvd(num, JTQ.A1X(num), z2, z2, z2, !z2)));
        }
        C66534MVo mVo = kPi.A04;
        if (mVo != null) {
            mVo.CuZ(z);
            if (z) {
                C64933LkY lkY = (C64933LkY) mVo;
                int A002 = lkY.A00((VideoFilter) null);
                AnonymousClass3Q2 A0e = JTT.A0e(kPi);
                if (!(A0e == null || (r0 = A0e.A1i) == null)) {
                    r0.A00 = A002;
                }
                kPi.A07 = new HashMap(lkY.A03);
            }
            ViewSwitcher viewSwitcher = kPi.A03;
            if (viewSwitcher != null) {
                viewSwitcher.setDisplayedChild(0);
            }
            ViewGroup viewGroup = kPi.A02;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
            }
        }
        kPi.A04 = null;
    }

    public final AnonymousClass0wW getSession() {
        return A0A();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1829989708);
        C61869KPi.super.onCreate(bundle);
        UserSession CCy = ((C267854cK) 0mE.A01(requireContext(), C267854cK.class)).CCy();
        0qQ.A0B(CCy, 0);
        this.A01 = CCy;
        JWB.A00(this, A0A());
        if (bundle != null) {
            requireArguments().putAll(bundle);
            Object obj = requireArguments().get("VideoFilterFragment.FILTER_STRENGTH_MAP");
            0qQ.A0C(obj, "null cannot be cast to non-null type java.util.HashMap<kotlin.Int, kotlin.Int>");
            this.A07 = (HashMap) obj;
        }
        setModuleNameV2("video_filter");
        AnonymousClass0fD.A09(1287944258, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(538167264);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_video_filter, viewGroup, false);
        AnonymousClass0fD.A09(1524968394, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(305276187);
        super.onDestroy();
        AnonymousClass0fD.A09(-431539213, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(64195943);
        ViewGroup viewGroup = (ViewGroup) this.A0B;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        this.A0B = null;
        this.A03 = null;
        this.A02 = null;
        C60715Jq4 jq4 = this.A05;
        if (jq4 != null) {
            jq4.A02 = null;
            jq4.setAdapter((2Rw) null);
        }
        this.A05 = null;
        this.A06 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-2063092902, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1848821673);
        C63515KyQ.A00.A03(this, C61689KHx.class);
        C61869KPi.super.onPause();
        AnonymousClass0fD.A09(315977300, A022);
    }

    public final void onResume() {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-326773504);
        super.onResume();
        C63515KyQ.A00.A02(this, C61689KHx.class);
        C378379Po r2 = this.A05;
        if (r2 != null) {
            C378369Pn r0 = this.A06;
            if (r0 != null) {
                r2.A06 = r0;
                AnonymousClass0fD.A09(1991359856, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -482078381;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1079111725;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }
}
