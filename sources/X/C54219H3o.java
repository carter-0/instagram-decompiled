package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.LithoView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.H3o  reason: case insensitive filesystem */
public final class C54219H3o extends GT9 implements C227252iu {
    public static final String __redex_internal_original_name = "CommentListBottomsheetFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new C58177Inh(this, 5));
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new C58177Inh(this, 7));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C58177Inh(this, 12));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C58177Inh(this, 13));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(C58300Iph.A00);
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C58177Inh(this, 14));

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        IgLinearLayout igLinearLayout = (IgLinearLayout) view2;
        IgFrameLayout igFrameLayout = (IgFrameLayout) AnonymousClass7TE.A0b(igLinearLayout, R.id.list_view_container);
        LithoView A0b = AnonymousClass7TE.A0b(igLinearLayout, R.id.main_list_view);
        LithoView A0b2 = AnonymousClass7TE.A0b(igLinearLayout, R.id.above_composer_views);
        View A0b3 = AnonymousClass7TE.A0b(igLinearLayout, R.id.comment_composer_parent);
        AnonymousClass0eM r1 = this.A00;
        ((C334277b0) r1.getValue()).A00(this, A0b2);
        ((C334277b0) r1.getValue()).A00(this, A0b);
        AnonymousClass0eM r15 = this.A09;
        AnonymousClass4DU A002 = I03.A00(r15);
        AnonymousClass0eM r12 = this.A0A;
        C334297b2 r10 = new C334297b2((C333777a7) A04().A0B.A03.getValue(), AnonymousClass7TE.A0l(r12), A002);
        r10.A00(A0b, AnonymousClass3DZ.A00(this));
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C229402nK r9 = new C229402nK(requireActivity(), I03.A00(r15), AnonymousClass7TE.A0l(r12), 23592978);
        registerLifecycleListener(r9);
        C334317b4 r2 = new C334317b4(new C70802Vt(getThemedContext(), new C334307b3(view2, this)));
        07U r18 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A003 = AnonymousClass07a.A00(viewLifecycleOwner);
        IgFrameLayout igFrameLayout2 = igFrameLayout;
        MGT mgt = new MGT(viewLifecycleOwner, r18, this, r10, igFrameLayout2, A0b, A0b3, r9, r2, (AnonymousClass4D7) null, 0);
        19B r22 = 19B.A00;
        1Eo.A05(r22, mgt, A003);
        C52971GgO A042 = A04();
        UserSession A0l = AnonymousClass7TE.A0l(r12);
        AnonymousClass4DU A004 = I03.A00(r15);
        C58177Inh inh = new C58177Inh(this, 10);
        C58177Inh inh2 = new C58177Inh(this, 11);
        C53335GmL A032 = A03();
        AnonymousClass1L1 r11 = ((I03) r15.getValue()).A01;
        AnonymousClass7TG.A1O(A042, igFrameLayout);
        AnonymousClass7TG.A1S(A0b2, A0l);
        0qQ.A0B(A032, 10);
        0qQ.A0B(r11, 11);
        C52971GgO ggO = A042;
        C334347b7 A07 = C334337b6.A00.A07(A0b3, this, A032, ggO, A0l, igLinearLayout, A004, r11, inh, inh2);
        C334517bQ r112 = new C334517bQ(A0b3.getContext(), A07, igFrameLayout);
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r22, new MHG(r18, r112, viewLifecycleOwner2, igFrameLayout2, (AnonymousClass4D7) null, 36), AnonymousClass07a.A00(viewLifecycleOwner2));
        0sP j6o = new J6O(A07, 31);
        A0b2.setComponent(new C334527bR(A042, (C334067ac) A042.A0V.getValue(), A0l, A004, j6o, A032.A0e));
        A0b2.setVisibility(0);
        AnonymousClass07Z viewLifecycleOwner3 = getViewLifecycleOwner();
        1Eo.A05(r22, new C59700JUh(viewLifecycleOwner3, r18, ggO, A0b2, A0l, A004, j6o, A032, (AnonymousClass4D7) null, 4), AnonymousClass07a.A00(viewLifecycleOwner3));
        super.onViewCreated(view2, bundle);
    }

    public final Context getThemedContext() {
        return (Context) this.A05.getValue();
    }

    public static final boolean A02(View view, C54219H3o h3o) {
        C335417cv r1;
        04k A002 = C586203k.A00(view);
        if (A002 != null && A002.A00.A0I(8)) {
            Object value = h3o.A04().A0V.getValue();
            if ((value instanceof C335417cv) && (r1 = (C335417cv) value) != null && !r1.A0D && !h3o.A03().A0d) {
                DbS.A1D(h3o);
                return true;
            }
        }
        return false;
    }

    public final void EKl() {
        05G r4 = A04().A0S;
        do {
        } while (!r4.AIY(r4.getValue(), new C335547d8((UUID) null, (DefaultConstructorMarker) null, 1)));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1794081164);
        super.onCreate(bundle);
        if (A03().A0d) {
            setDayNightMode(AnonymousClass2k4.NIGHT);
        }
        this.mLifecycleRegistry.A09((C334177an) this.A04.getValue());
        AnonymousClass0fD.A09(556573345, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1914183886);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_comment_list, viewGroup, false);
        AnonymousClass0fD.A09(903267940, A022);
        return inflate;
    }
}
