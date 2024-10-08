package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Di2  reason: case insensitive filesystem */
public final class C46622Di2 extends AnonymousClass4DH implements AnonymousClass4DR, C273494mf, AnonymousClass3M5, C240433Kw, AnonymousClass3M6 {
    public static final String __redex_internal_original_name = "IgBloksBottomSheetFragment";
    public View A00;
    public FrameLayout A01;
    public C46583DhP A02 = null;
    public C46645DiQ A03 = null;
    public G8K A04 = null;
    public C273694n2 A05;
    public C229382nI A06;
    public C229382nI A07;
    public IgBloksScreenConfig A08;
    public AnonymousClass6NS A09;
    public AnonymousClass0wW A0A;
    public C71662eb A0B;
    public C331157Pu A0C;
    public AnonymousClass37D A0D = null;
    public Integer A0E;
    public boolean A0F = false;
    public int A0G;
    public int A0H;
    public C277014uI A0I;
    public C71662eb A0J;
    public 2el A0K;

    public final void DTY(C20880X2h x2h, C307786Rm r8, C276544tV r9) {
        C331147Pt r1;
        C331147Pt r5 = null;
        C46615Dhv A002 = C46616Dhw.A00((C20880X2h) null, r8, (C307896Rx) null, r9);
        if (A002 != null) {
            List list = A002.A07;
            if (list == null || list.isEmpty()) {
                r1 = null;
            } else {
                if (list.size() > 1) {
                    1Kn.A02("invalid_screen", "Backing screens for bottom sheets only allow one navbar right button");
                }
                r1 = A00((C276544tV) list.get(0));
            }
            C276544tV r0 = A002.A02;
            if (r0 != null) {
                r5 = A00(r0);
            }
            C331157Pu r2 = this.A0C;
            if (r2 != null) {
                if (r1 != null) {
                    r2.A0K(r1, false);
                } else {
                    r2.A0O(false);
                }
                if (r5 != null) {
                    r2.A0J(r5, false);
                } else {
                    BottomSheetFragment bottomSheetFragment = r2.A03;
                    BottomSheetFragment.A00(bottomSheetFragment).A01();
                    bottomSheetFragment.A0R();
                    bottomSheetFragment.A0R();
                }
                r2.A0M(A002.A06);
            }
        }
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final String BTx() {
        C46645DiQ diQ = this.A03;
        if (this.A08 == null || diQ == null) {
            return "bloks_unknown_class";
        }
        String str = diQ.A09;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "bloks_unknown_class";
    }

    public final void Ddp(int i) {
        11Z.A02(new C46623Di3(this, i));
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
        String str;
        String str2;
        boolean isEmpty;
        IgBloksScreenConfig igBloksScreenConfig = this.A08;
        if (igBloksScreenConfig != null) {
            str2 = igBloksScreenConfig.A0R;
            C46645DiQ diQ = this.A03;
            diQ.getClass();
            str = diQ.A09;
            isEmpty = TextUtils.isEmpty(str2);
        } else {
            str = null;
            str2 = null;
            isEmpty = TextUtils.isEmpty((CharSequence) null);
        }
        if (!isEmpty) {
            return str2;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return "bloks_unknown";
    }

    public final AnonymousClass0wW getSession() {
        return this.A0A;
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0 != null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isScrolledToTop() {
        /*
            r2 = this;
            X.6NS r0 = r2.A09
            if (r0 != 0) goto L_0x0012
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = r2.A08
            if (r0 == 0) goto L_0x001f
            X.DhP r0 = r2.A02
            if (r0 == 0) goto L_0x0021
            X.DhO r0 = r0.A04
            X.6NS r0 = r0.A01
            if (r0 == 0) goto L_0x001f
        L_0x0012:
            X.6Rm r0 = r0.A02()
            if (r0 == 0) goto L_0x001f
            boolean r1 = X.RhN.A00(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            return r0
        L_0x0021:
            java.lang.String r0 = "BloksSurfaceController is null, have you initialized it for Screens?"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46622Di2.isScrolledToTop():boolean");
    }

    public final boolean onBackPressed() {
        C3034368u r2;
        C277014uI r5 = this.A0I;
        if (r5 == null) {
            return false;
        }
        C229382nI r4 = this.A06;
        if (r4 != null) {
            Integer num = this.A0E;
            String str = null;
            if (num != null) {
                r2 = (C3034368u) C46636DiG.A00(this.A0A).A02(num.intValue());
            } else {
                r2 = null;
            }
            AnonymousClass6Tm r1 = AnonymousClass6Tm.A01;
            if (r2 != null) {
                str = r2.A03;
            }
            return Q0A.A01(C307886Rw.A04(r4, r1, r5, str));
        } else if (this.mView == null) {
            return false;
        } else {
            0wb.A03(__redex_internal_original_name, "Bloks fragment has a view but no host");
            return false;
        }
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        if (this.A08 != null) {
            C46583DhP dhP = this.A02;
            if (dhP != null) {
                AnonymousClass6NS r0 = dhP.A04.A01;
                if (r0 != null) {
                    r0.A06();
                }
            } else {
                throw AnonymousClass7TE.A0z("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        }
        AnonymousClass6NS r02 = this.A09;
        if (r02 != null) {
            r02.A06();
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    private C331147Pt A00(C276544tV r11) {
        FPH fph;
        C277014uI A092 = r11.A09();
        if (A092 != null) {
            fph = new FPH(8, (Object) this, (Object) A092, (Object) r11);
        } else {
            fph = null;
        }
        Context requireContext = requireContext();
        String str = "";
        String str2 = str;
        String A0F2 = r11.A0F();
        if (A0F2 != null) {
            str2 = A0F2;
        }
        String str3 = str;
        String A0H2 = r11.A0H();
        if (A0H2 != null) {
            str3 = A0H2;
        }
        String A0J2 = r11.A0J();
        if (A0J2 != null) {
            str = A0J2;
        }
        return FH9.A0B(requireContext, fph, (C307896Rx) null, (C277014uI) null, str2, str3, str, r11.A0R(44, true));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(-161205367);
        C46622Di2.super.onCreate(bundle);
        this.A0A = DbT.A0W(requireArguments());
        2el A0U = DbY.A0U();
        this.A0K = A0U;
        AnonymousClass0wW r5 = this.A0A;
        SparseArray sparseArray = new SparseArray();
        Pair pair = new Pair[]{Pair.create(Integer.valueOf(R.id.bottom_sheet_id), this.A0C)}[0];
        sparseArray.put(AnonymousClass7TE.A0M(pair.first), pair.second);
        this.A06 = C229382nI.A00(sparseArray, this, this, r5, A0U);
        IgBloksScreenConfig A012 = IgBloksScreenConfig.A01(this.mArguments, this.A0A);
        this.A08 = A012;
        if (A012 != null) {
            C229382nI r1 = this.A06;
            if (A012.A0c) {
                r1.A00 = true;
            }
            this.A0I = A012.A09;
            this.A0H = A012.A00;
            this.A0D = DbT.A0i(getActivity());
            if (bundle == null) {
                bundle = this.mArguments;
            }
            this.A03 = C46583DhP.A01(bundle);
            Context requireContext = requireContext();
            C229382nI r8 = this.A06;
            C359618dD A052 = this.A08.A05();
            C46583DhP A002 = C46583DhP.A00(requireContext, new SparseArray(), this.A03, this.A08.A07, r8, A052);
            this.A02 = A002;
            A002.A08(requireContext(), this);
            G8K g8k = this.A02.A00;
            g8k.getClass();
            this.A04 = g8k;
            i = -1435802658;
        } else {
            C229382nI r7 = this.A07;
            if (r7 != null) {
                C229382nI r6 = this.A06;
                int i2 = 0;
                while (true) {
                    SparseArray sparseArray2 = r7.A01;
                    if (i2 >= sparseArray2.size()) {
                        break;
                    }
                    r6.A01.put(sparseArray2.keyAt(i2), sparseArray2.valueAt(i2));
                    i2++;
                }
                if (r7.A00) {
                    this.A06.A00 = true;
                }
            }
            Bundle requireArguments = requireArguments();
            this.A0E = DbV.A0o(requireArguments, "content_key");
            C3034368u r62 = (C3034368u) C46636DiG.A00(this.A0A).A02(this.A0E.intValue());
            if (r62 == null) {
                0wb.A03(__redex_internal_original_name, "Bloks bottom sheet must pass in parse result");
                i = 19585950;
            } else {
                this.A0H = requireArguments.getInt("soft_input_mode");
                HashMap hashMap = null;
                if (requireArguments.containsKey("external_variables_key")) {
                    hashMap = (HashMap) C46636DiG.A00(this.A0A).A02(requireArguments.getInt("external_variables_key"));
                }
                AnonymousClass6NR A003 = AnonymousClass6NS.A00(requireContext(), r62, this.A06);
                if (hashMap == null) {
                    hashMap = AnonymousClass7TE.A1E();
                }
                A003.A01 = hashMap;
                this.A09 = A003.A00();
                requireArguments.getString("module_name");
                if (requireArguments.containsKey("backpress_key")) {
                    this.A0I = (C277014uI) C46636DiG.A00(this.A0A).A02(requireArguments.getInt("backpress_key"));
                }
                i = -891201565;
            }
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1687691054);
        View A0C2 = DbT.A0C(layoutInflater, viewGroup, R.layout.bloks_bottom_sheet_fragment);
        AnonymousClass0fD.A09(-2058221264, A022);
        return A0C2;
    }

    public final void onDestroy() {
        F1F f1f;
        int A022 = AnonymousClass0fD.A02(-1311309452);
        super.onDestroy();
        IgBloksScreenConfig igBloksScreenConfig = this.A08;
        if (!(igBloksScreenConfig == null || (f1f = igBloksScreenConfig.A03) == null)) {
            f1f.A00(0Gl.A01(this.A0A));
        }
        if (requireActivity().isFinishing() || !requireActivity().isChangingConfigurations()) {
            IgBloksScreenConfig igBloksScreenConfig2 = this.A08;
            if (igBloksScreenConfig2 != null) {
                igBloksScreenConfig2.A06();
                C46583DhP dhP = this.A02;
                if (dhP != null) {
                    dhP.A06();
                } else {
                    throw AnonymousClass7TE.A0z("BloksSurfaceController is null, have you initialized it for Screens?");
                }
            } else {
                C46636DiG A002 = C46636DiG.A00(this.A0A);
                Integer num = this.A0E;
                num.getClass();
                A002.A03(num.intValue());
            }
        }
        AnonymousClass6NS r0 = this.A09;
        if (r0 != null) {
            r0.A03();
            this.A09 = null;
        }
        AnonymousClass0fD.A09(1867968740, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(316228893);
        super.onDestroyView();
        if (this.A08 != null) {
            C46583DhP dhP = this.A02;
            if (dhP != null) {
                dhP.A07();
            } else {
                throw AnonymousClass7TE.A0z("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        }
        AnonymousClass6NS r0 = this.A09;
        if (r0 != null) {
            r0.A04();
        }
        FrameLayout frameLayout = this.A01;
        frameLayout.getClass();
        frameLayout.removeAllViews();
        this.A00 = null;
        this.A01 = null;
        this.A05 = null;
        this.A0F = false;
        AnonymousClass0fD.A09(1013085257, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(166143488);
        C46622Di2.super.onPause();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        Window window = rootActivity.getWindow();
        if (window != null) {
            window.setSoftInputMode(this.A0G);
        }
        AnonymousClass0fD.A09(-1384833584, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1931901541);
        super.onResume();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        Window window = rootActivity.getWindow();
        if (window != null) {
            this.A0G = window.getAttributes().softInputMode;
            window.setSoftInputMode(this.A0H | 2);
        }
        AnonymousClass0fD.A09(100906312, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.A08 != null) {
            boolean booleanValue = C46648DiT.A00(this.A0A).booleanValue();
            C46583DhP dhP = this.A02;
            if (dhP != null) {
                C46645DiQ diQ = dhP.A05;
                bundle.putString("__nav_data_type", "legacy_screen");
                if (booleanValue) {
                    bundle.putBoolean("BloksSurfaceProps_isFlattenedBundle", true);
                    bundle.putAll(C46645DiQ.A00(diQ, true));
                    return;
                }
                bundle.putBundle("BloksSurfaceProps", C46645DiQ.A00(diQ, true));
                return;
            }
            throw AnonymousClass7TE.A0z("BloksSurfaceController is null, have you initialized it for Screens?");
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C273694n2 r1;
        super.onViewCreated(view, bundle);
        this.A01 = (FrameLayout) view.requireViewById(R.id.bloks_container);
        this.A0B = DbY.A0T(view, R.id.error_view_stub);
        this.A0J = DbY.A0T(view, R.id.debug_error_view_stub);
        this.A0K.A06(this.A01, AnonymousClass3DZ.A00(this));
        if (this.A08 != null) {
            C46583DhP dhP = this.A02;
            if (dhP != null) {
                Object obj = dhP.A04(requireContext()).first;
                obj.getClass();
                r1 = (C273694n2) obj;
            } else {
                throw AnonymousClass7TE.A0z("BloksSurfaceController is null, have you initialized it for Screens?");
            }
        } else {
            r1 = new C273694n2(requireContext());
        }
        this.A05 = r1;
        if (this.A0F) {
            r1.setVisibility(8);
        }
        this.A01.addView(this.A05);
        AnonymousClass6NS r12 = this.A09;
        if (r12 != null) {
            r12.A07(this.A05);
        }
    }
}
