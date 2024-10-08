package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igtv.model.IGTVViewerLoggingToken;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.Collection;

public final class K8M extends MYR implements C249763kK, AnonymousClass4DU, C229132mt, AnonymousClass4DS, MSR {
    public static final LC5 A08 = new LC5(EXG.A0g);
    public static final String __redex_internal_original_name = "IGTVLiveChannelFragment";
    public C63641L1d A00;
    public final AnonymousClass0eM A01 = AnonymousClass1YB.A00(new MMJ(this, 41));
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new MMJ(this, 42));
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new MMJ(this, 44));
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(ML4.A00);

    public final void D1S(MXT mxt, IGTVViewerLoggingToken iGTVViewerLoggingToken, String str, boolean z) {
        MXT mxt2 = mxt;
        0qQ.A0B(mxt2, 0);
        C270194gL Ahy = mxt2.Ahy();
        if (Ahy != null) {
            C63641L1d l1d = this.A00;
            if (l1d == null) {
                0qQ.A0F("channelItemTappedController");
                throw AnonymousClass00P.createAndThrow();
            }
            FragmentActivity requireActivity = requireActivity();
            C61292K1d k1d = ((C60201JhK) this.A03.getValue()).A07;
            0qQ.A07(k1d);
            UserSession userSession = l1d.A00;
            Reel A0G = 1OP.A05(userSession).A0G(Ahy);
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList A012 = k1d.A01(userSession);
            int size = A012.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                C270194gL r6 = (C270194gL) A012.get(i2);
                A1C.add(1OP.A05(userSession).A0G(r6));
                if (0qQ.A0K(Ahy.getId(), r6.getId())) {
                    i = i2;
                }
            }
            F8Q.A01(requireActivity, userSession, A0G, AnonymousClass3BQ.IGTV_DISCOVER, (String) null, (String) null, A1C, i, false, true);
        }
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new C61649KFz(AnonymousClass7TE.A0l(this.A06), this, this, (I9I) this.A04.getValue(), new C57278IVn(requireActivity(), this, EXG.A0g, this), new JJR(this, 39)));
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, X.LZi] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2db.A06(requireActivity(), true);
        RecyclerView recyclerView = getRecyclerView();
        Context A0S = AnonymousClass7TE.A0S(recyclerView);
        C275824s0 r1 = new C275824s0(A0S, 1);
        Drawable drawable = A0S.getDrawable(R.drawable.igtv_home_item_divider);
        if (drawable != null) {
            r1.A01 = drawable;
            recyclerView.A11(r1);
            recyclerView.A11(new C60463Jlv(this, A0S.getResources().getInteger(R.integer.igtv_destination_grid_columns), AnonymousClass7TH.A01(A0S), DbY.A01(A0S)));
            2el r2 = (2el) this.A07.getValue();
            0qQ.A0B(r2, 1);
            r2.A08(recyclerView, AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
            JTQ.A0y(getRecyclerView().A0D, recyclerView, this, C3251771i.A09);
            recyclerView.setClipToPadding(false);
            AnonymousClass0eM r4 = this.A03;
            Dba.A15(getViewLifecycleOwner(), ((C60201JhK) r4.getValue()).A03, MPA.A00(this, 12), 62);
            C60201JhK jhK = (C60201JhK) r4.getValue();
            if (jhK.A02) {
                MG8.A01(jhK, C318116oQ.A00(jhK), 46);
            }
            C63064Kqt.A00(this, new Object());
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void ACw() {
        if (this.loadingState == JXP.LOADED) {
            C60201JhK jhK = (C60201JhK) this.A03.getValue();
            if (jhK.A02) {
                MG8.A01(jhK, C318116oQ.A00(jhK), 46);
            }
        }
    }

    public final String getModuleName() {
        String A002 = A08.A00();
        0qQ.A07(A002);
        return A002;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(MPA.A00(this, 10));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final String getSessionId() {
        return DbS.A0t(this.A01);
    }

    public K8M() {
        MMJ mmj = new MMJ(this, 43);
        AnonymousClass0eM A002 = MMJ.A00(new MMJ(this, 47), 0eO.A02, 48);
        this.A03 = DbS.A0I(new MMJ(A002, 49), mmj, new C58185Inp(42, (Object) null, A002), DbS.A0z(C60201JhK.class));
        0Yh A0z = DbS.A0z(C60115Jfw.class);
        this.A05 = DbS.A0I(new MMJ(this, 45), new MMJ(this, 46), new C58185Inp(41, (Object) null, this), A0z);
    }

    public final void configureActionBar(2da r3) {
        Dbb.A1I(r3);
        r3.setTitle(requireArguments().getString("igtv_channel_title_arg"));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1405085897);
        K8M.super.onCreate(bundle);
        requireArguments();
        this.A00 = new C63641L1d(AnonymousClass7TE.A0l(this.A06), DbS.A0t(this.A01));
        AnonymousClass0fD.A09(-1971088469, A022);
    }
}
