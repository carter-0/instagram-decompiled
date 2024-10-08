package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Space;
import com.instagram.android.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class K86 extends MYR implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "AppreciationGiftingBottomSheetFragment";
    public Space A00;
    public MRT A01;
    public IgdsBottomButtonLayout A02;
    public C331157Pu A03;
    public SpinnerImageView A04;
    public final List A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final C63586KzZ A09;

    public final String getModuleName() {
        return "appreciation_gifting";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        K86.super.onAttach(context);
        getParentFragmentManager().A0r(new C7417QCg(this, 1), true);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = (SpinnerImageView) view.requireViewById(R.id.loading);
        IgdsBottomButtonLayout A0c = DbT.A0c(view, R.id.send_button);
        this.A02 = A0c;
        if (A0c == null) {
            str = "sendButton";
        } else {
            A0c.setPrimaryButtonEnabled(false);
            Space space = (Space) view.requireViewById(R.id.space_terms);
            this.A00 = space;
            if (space == null) {
                str = "termsPlaceHolder";
            } else {
                space.getLayoutParams().height = (int) (0nA.A03(requireContext(), 12.0f) * 1.12f * 2.0f);
                07U r7 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
                MHH mhh = new MHH(r7, this, viewLifecycleOwner, (AnonymousClass4D7) null, 13);
                19B r5 = 19B.A00;
                1Eo.A05(r5, mhh, A002);
                C60301Jiz jiz = (C60301Jiz) this.A08.getValue();
                String A012 = C320236s2.A01(requireArguments(), "arg_gifting_media_id");
                0qQ.A0B(A012, 0);
                if (0qQ.A0K(jiz.A07.getValue(), C64488Lcp.A00)) {
                    LCZ lcz = jiz.A01;
                    lcz.A01.put(541931976, AnonymousClass7TE.A0v());
                    lcz.A00.markerStart(541931976);
                    1Eo.A05(r5, new MGE(jiz, A012, (AnonymousClass4D7) null, 9), C318116oQ.A00(jiz));
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(K86 k86, String str, 0sP r4, boolean z) {
        C331897Sw r0 = C331897Sw.A0A;
        C331897Sw A002 = C331917Sy.A00(k86.requireContext());
        k86.A07.getValue();
        A002.A05(new C65342Lri(k86, r4, z), str);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.2tE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.2tE, X.KFJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.2tE, java.lang.Object] */
    public final Collection getDefinitions() {
        C61632KFi kFi = new C61632KFi(this.A09, this, AnonymousClass7TE.A0l(this.A07));
        ? obj = new Object();
        KFS kfs = new KFS((C63585KzY) this.A06.getValue(), this);
        ? obj2 = new Object();
        obj2.A00 = null;
        return 0sr.A1P(new C232222tE[]{kFi, obj, kfs, obj2, new Object()});
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new MP6(this, 29));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean onBackPressed() {
        C60301Jiz jiz = (C60301Jiz) this.A08.getValue();
        LCZ lcz = jiz.A01;
        JTP.A1R(541931976, lcz.A01, false);
        lcz.A00.markerEnd(541931976, 22);
        LPB lpb = jiz.A00;
        C60776Jr7 A002 = LPB.A00(C62560Khq.Gift, lpb, AnonymousClass05K.A0j);
        C64160LRb lRb = lpb.A02;
        String str = lpb.A01.A03;
        0sm A0E = 0Yt.A0E();
        DbY.A1S(str, A0E);
        0Aj A0e = AnonymousClass7TE.A0e(lRb.A02, "user_click_appreciationgiver_exit");
        if (A0e.isSampled()) {
            C64160LRb.A00(A0e, lRb, str);
            JTU.A0t(lRb.A01, A0e, A002);
            JTT.A1A(A0e, A0E);
        }
        return false;
    }

    public K86() {
        MMI mmi = new MMI(this, 18);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MMI(new MMI(this, 15), 16));
        this.A08 = DbS.A0I(new MMI(A002, 17), mmi, new MMZ(31, (Object) null, (Object) A002), DbS.A0z(C60301Jiz.class));
        ArrayList A0v = DbS.A0v(6);
        int i = 0;
        do {
            A0v.add(new Object());
            i++;
        } while (i < 6);
        this.A05 = A0v;
        this.A09 = new C63586KzZ(this);
        this.A06 = AnonymousClass0eN.A01(new MMI(this, 14));
        this.A07 = C227642jf.A02(this);
    }
}
