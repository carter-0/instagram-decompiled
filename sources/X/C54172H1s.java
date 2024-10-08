package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.H1s  reason: case insensitive filesystem */
public final class C54172H1s extends AnonymousClass32G implements C229122ms, AnonymousClass4DU, AbsListView.OnScrollListener {
    public static final String __redex_internal_original_name = "BakeoffAdCardFragment";
    public AnonymousClass2xS A00;
    public C54229H3y A01;
    public AnonymousClass36D A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final C228172ku A04 = new C228172ku();

    public final boolean CKB() {
        return false;
    }

    public final boolean CT5() {
        return false;
    }

    public final boolean CWV() {
        return false;
    }

    public final void CgO() {
    }

    public final String getModuleName() {
        return "ad_card";
    }

    public final boolean isLoading() {
        return false;
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0S7.A00(this);
        this.A04.setOnScrollListener(this);
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return DbT.A0X(this.A03);
    }

    public final boolean CJz() {
        C54229H3y h3y = this.A01;
        if (h3y != null) {
            return AnonymousClass7TE.A1b(h3y.A04.A01);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.30i] */
    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-743415178);
        C54172H1s.super.onCreate(bundle);
        String string = requireArguments().getString(AnonymousClass000.A00(2113));
        AnonymousClass0eM r8 = this.A03;
        1Xj A023 = DbX.A0d(r8).A02(string);
        if (A023 == null) {
            0hq r0 = this.mFragmentManager;
            if (r0 != null) {
                r0.A0c();
            } else {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = 1243591912;
                AnonymousClass0fD.A09(i, A022);
                throw illegalStateException;
            }
        }
        C322186vO r2 = new C322186vO(AnonymousClass7TE.A0l(r8));
        AnonymousClass1L1 A012 = AnonymousClass1L1.A01.A01(requireArguments().getString(AnonymousClass000.A00(58)));
        AnonymousClass2kR r9 = new AnonymousClass2kR(requireContext(), AnonymousClass7TE.A0l(r8), this);
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass32Q r1 = AnonymousClass32Q.A00;
        0qQ.A0B(r1, 9);
        C322186vO r16 = r2;
        this.A01 = new C54229H3y(this, requireActivity, (C229382nI) null, r16, r9, (AnonymousClass32J) null, (AnonymousClass32K) null, (G88) null, r1, this, A012, (0sP) null, 0, false, false, false, false);
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(r8);
        C54229H3y h3y = this.A01;
        String str = "adapter";
        if (h3y != null) {
            this.A00 = new AnonymousClass2xS(requireContext, A0l, this, h3y);
            ? obj = new Object();
            0hq r22 = requireParentFragment().mFragmentManager;
            C54229H3y h3y2 = this.A01;
            if (h3y2 != null) {
                C2362232x r12 = new C2362232x(this, r22, h3y2, r9);
                AnonymousClass2xS r02 = this.A00;
                if (r02 == null) {
                    str = "feedVideoModule";
                } else {
                    r12.A0G = r02;
                    r12.A0N = obj;
                    r12.A0R = A012;
                    AnonymousClass332 A002 = r12.A00();
                    C234042wt r6 = new C234042wt(this, AnonymousClass7TE.A0l(r8), this);
                    this.A02 = new AnonymousClass36D(AnonymousClass7TE.A0l(r8), new C57198ISl(this, 5), false, false);
                    C227622jd r13 = new C227622jd();
                    r13.A0E(A002);
                    r13.A0E(r6);
                    AnonymousClass36D r03 = this.A02;
                    if (r03 == null) {
                        str = "mediaUpdateListener";
                    } else {
                        r13.A0E(r03);
                        A0b(r13);
                        C228172ku r04 = this.A04;
                        0qQ.A0A(A002);
                        r04.A01(A002);
                        C54229H3y h3y3 = this.A01;
                        if (h3y3 != null) {
                            if (A023 != null) {
                                AnonymousClass3W1 BQr = h3y3.BQr(A023);
                                BQr.A0O(1sy.A0J);
                                BQr.A2a = requireArguments().getBoolean(AnonymousClass000.A00(2112));
                                BQr.A28 = false;
                                C54229H3y h3y4 = this.A01;
                                if (h3y4 != null) {
                                    h3y4.A04.A0A(AnonymousClass7TE.A1I(A023));
                                    C54229H3y.A00(h3y4);
                                    C54229H3y h3y5 = this.A01;
                                    if (h3y5 != null) {
                                        A0V(h3y5);
                                        AnonymousClass0fD.A09(-174874164, A022);
                                        return;
                                    }
                                }
                            } else {
                                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                                i = -1029035372;
                                AnonymousClass0fD.A09(i, A022);
                                throw illegalStateException;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-48187469);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_ad_card, viewGroup, false);
        AnonymousClass0fD.A09(1695637843, A022);
        return inflate;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A0D = AnonymousClass7TG.A0D(absListView, 1780582975);
        this.A04.onScroll(absListView, i, i2, i3);
        AnonymousClass0fD.A0A(144028912, A0D);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A0D = AnonymousClass7TG.A0D(absListView, -569950034);
        this.A04.onScrollStateChanged(absListView, i);
        AnonymousClass0fD.A0A(69259155, A0D);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(88970101);
        C54172H1s.super.onStart();
        0S7.A00(this);
        this.A04.setSelectionFromTop(0, 0);
        AnonymousClass0fD.A09(92462875, A022);
    }
}
