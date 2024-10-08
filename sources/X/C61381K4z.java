package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.K4z  reason: case insensitive filesystem */
public final class C61381K4z extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ScheduledContentFragment";
    public C60435JlT A00;
    public LPH A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final String A04 = "scheduled_content_fragment";

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        if (this.dayNightMode == AnonymousClass2k4.NIGHT) {
            Context themedContext = getThemedContext();
            2dZ r0 = (2dZ) r4;
            0qQ.A0B(themedContext, 0);
            r0.A02 = themedContext;
            2dZ.A0H(r0);
        }
        DbX.A1A(new LY1(this, 33), DbV.A0K(), r4);
        r4.Eom(2131973997);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C59722JVg jVg;
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle bundle2 = this.mArguments;
        Object obj = null;
        if (bundle2 != null) {
            obj = bundle2.get(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        }
        if (!(obj instanceof C59722JVg) || (jVg = (C59722JVg) obj) == null) {
            jVg = C59722JVg.HAMBURGER;
        }
        AnonymousClass0eM r2 = this.A02;
        this.A01 = new LPH(jVg, this, AnonymousClass7TE.A0l(r2));
        Context themedContext = getThemedContext();
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass2k4 r12 = this.dayNightMode;
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        LPH lph = this.A01;
        if (lph == null) {
            str = "contentSchedulingLogger";
        } else {
            this.A00 = new C60435JlT(themedContext, requireActivity, r12, lph, this, A0l);
            View requireViewById = view2.requireViewById(R.id.recycler_view);
            RecyclerView recyclerView = (RecyclerView) requireViewById;
            DbY.A16(this, recyclerView);
            0qQ.A07(requireViewById);
            C60435JlT jlT = this.A00;
            if (jlT == null) {
                str = "adapter";
            } else {
                recyclerView.setAdapter(jlT);
                View A0G = AnonymousClass7TF.A0G(view2, R.id.loading_indicator);
                07U r5 = 07U.A05;
                AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                AnonymousClass7TE.A1Z(new JTw((Object) view2, (Object) r5, (Object) A0G, (Object) recyclerView, (Object) this, (Object) viewLifecycleOwner, (AnonymousClass4D7) null, 10), AnonymousClass07a.A00(viewLifecycleOwner));
                C60133JgE jgE = (C60133JgE) this.A03.getValue();
                MG7.A01(jgE, C318116oQ.A00(jgE), 12);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public C61381K4z() {
        C20609Wvq wvq = new C20609Wvq(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20609Wvq(new C20690WxM(this, 49), 0));
        this.A03 = DbS.A0I(new C20609Wvq(A002, 1), wvq, new C41566AwY(40, (Object) null, A002), DbS.A0z(C60133JgE.class));
        this.A02 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-528288799);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.scheduled_content_fragment, false);
        AnonymousClass0fD.A09(1928159348, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(2059000020);
        super.onDestroyView();
        C60435JlT jlT = this.A00;
        if (jlT == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        }
        jlT.A02();
        AnonymousClass0fD.A09(-1707257114, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(748856378);
        super.onResume();
        if (this.dayNightMode == AnonymousClass2k4.NIGHT) {
            C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A02), false, false);
        }
        AnonymousClass0fD.A09(-346215133, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1359568804);
        C61381K4z.super.onStop();
        C317756nm.A04(requireActivity(), AnonymousClass7TE.A0l(this.A02), false);
        AnonymousClass0fD.A09(-1176568379, A022);
    }
}
