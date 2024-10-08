package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NKm  reason: case insensitive filesystem */
public final class C68493NKm extends MYR implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "DirectClipsCardGalleryFragment";
    public C71662eb A00;
    public C70604ODb A01;
    public C332837Wo A02;
    public AnonymousClass7X4 A03;
    public AnonymousClass7XW A04;
    public AnonymousClass7XP A05;
    public NIE A06;
    public PA3 A07;
    public C254743sy A08;
    public AnonymousClass0eK A09;
    public AnonymousClass9HC A0A;
    public AnonymousClass7L2 A0B;
    public DirectThreadKey A0C;
    public List A0D;
    public final String A0E = "DirectClipsCardGalleryFragment.ITEM_ACTIONS_FRAGMENT_TAG";
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(C73743Pj4.A00);
    public final AnonymousClass0eM A0G = AnonymousClass0eN.A01(new C67570Mq4(this, 40));
    public final AnonymousClass0eM A0H = AnonymousClass0eN.A01(C73744Pj5.A00);
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final C332837Wo A0J = new C72499P8i(this, 1);
    public final AnonymousClass7X4 A0K = new C72515P8y(this);
    public final AnonymousClass7XP A0L = new PA0(this);

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        int A032 = AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_primary_background);
        r5.setTitle("");
        F3V f3v = new F3V(AnonymousClass05K.A00);
        f3v.A01(A032);
        r5.ErJ(f3v.A00());
        Dbc.A0k(r5);
        r5.ARJ(false);
        r5.Ets(false);
    }

    public final String getModuleName() {
        return "direct_clips_card_gallery_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        ViewStub viewStub;
        C333517Zg r2;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.card_gallery_empty_state_view_holder);
        if (findViewById instanceof ViewStub) {
            viewStub = (ViewStub) findViewById;
        } else {
            viewStub = null;
        }
        C71662eb r0 = new C71662eb(viewStub);
        this.A00 = r0;
        r0.A02();
        AnonymousClass7TF.A0G(view, R.id.refreshable_container).setEnabled(false);
        C331307Qj r1 = (C331307Qj) this.A0G.getValue();
        List list = this.A0D;
        if (list == null) {
            0qQ.A0F("messageIds");
            throw AnonymousClass00P.createAndThrow();
        }
        List A002 = r1.A00(C51966G9m.A1G(list, 0));
        AnonymousClass0eK r02 = this.A09;
        if (!(r02 == null || (r2 = (C333517Zg) r02.get()) == null)) {
            this.A01 = new C70604ODb(this, AnonymousClass7TE.A0l(this.A0I), r2);
        }
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            NVY nvy = new NVY(C66580MXl.A0a(it), DbU.A0u(this.A0I));
            JTO.A15(this.A0H).add(nvy);
            JTO.A15(this.A0F).add(nvy);
        }
        A0B(JTO.A15(this.A0H));
    }

    public final void A0C(String str) {
        AnonymousClass0eM r5 = this.A0H;
        List A15 = JTO.A15(r5);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A15) {
            JTR.A1P(((C232262tL) next).getKey(), str, next, A1C);
        }
        AnonymousClass0eM r4 = this.A0F;
        List A152 = JTO.A15(r4);
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next2 : A152) {
            JTR.A1P(((NVY) next2).A00.A0h(), str, next2, A1C2);
        }
        JTO.A15(r5).removeAll(A1C);
        JTO.A15(r4).removeAll(A1C2);
        A0B(JTO.A15(r5));
    }

    public final Collection getDefinitions() {
        AnonymousClass7S7 r3;
        Capabilities capabilities;
        Capabilities capabilities2;
        C333517Zg A0V;
        AnonymousClass0eK r0 = this.A09;
        AnonymousClass7SD r17 = null;
        if (r0 == null || (A0V = C66580MXl.A0V(r0)) == null) {
            r3 = null;
        } else {
            r3 = A0V.C6l();
        }
        AnonymousClass9HD r2 = AnonymousClass9HC.A1b;
        AnonymousClass0eM r4 = this.A0I;
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        if (r3 == null || (capabilities = r3.AlE()) == null) {
            Parcelable.Creator creator = Capabilities.CREATOR;
            capabilities = C376189Gz.A00(0sn.A00);
        }
        this.A0A = r2.A00(A0l, capabilities);
        Context requireContext = requireContext();
        AnonymousClass9HC r02 = this.A0A;
        String str = "experiments";
        if (r02 != null) {
            this.A0B = C250563lf.A06(requireContext, r02);
            FragmentActivity requireActivity = requireActivity();
            UserSession A0l2 = AnonymousClass7TE.A0l(r4);
            DirectThreadKey directThreadKey = this.A0C;
            if (directThreadKey == null) {
                str = "threadKey";
            } else {
                C72518P9b p9b = new C72518P9b(this, 1);
                C72538P9v p9v = new C72538P9v(this);
                AnonymousClass7X4 r13 = this.A0K;
                C332837Wo r12 = this.A0J;
                PA3 pa3 = this.A07;
                if (r3 != null) {
                    r17 = r3.C6Q();
                    capabilities2 = r3.AlE();
                } else {
                    capabilities2 = null;
                }
                OIQ oiq = new OIQ(requireActivity, A0l2, capabilities2, this, this, r12, r13, p9b, p9v, pa3, r17, directThreadKey);
                C72517P9a p9a = new C72517P9a(AnonymousClass7TE.A0l(r4), this.A04, this.A0L);
                UserSession A0l3 = AnonymousClass7TE.A0l(r4);
                Context requireContext2 = requireContext();
                AnonymousClass9HC r1 = this.A0A;
                if (r1 != null) {
                    AnonymousClass7L2 r03 = this.A0B;
                    if (r03 != null) {
                        return AnonymousClass7TE.A1I(new C68581NOd(requireContext2, A0l3, oiq, p9a, r1, r03));
                    }
                    str = "threadTheme";
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new C74184PqQ(this, 49));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-266080801);
        C68493NKm.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        0sn stringArrayList = requireArguments.getStringArrayList("message_ids_list");
        if (stringArrayList == null) {
            stringArrayList = 0sn.A00;
        }
        this.A0D = stringArrayList;
        C254743sy A002 = C67002Mga.A00(requireArguments, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        if (A002 != null) {
            this.A08 = A002;
            this.A0C = C66647MaG.A03(A002);
            AnonymousClass0fD.A09(1895489479, A022);
            return;
        }
        IllegalArgumentException A0p = C66580MXl.A0p();
        AnonymousClass0fD.A09(-1609385546, A022);
        throw A0p;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-136285970);
        super.onResume();
        2Rw r0 = getRecyclerView().A0A;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        }
        AnonymousClass0fD.A09(2008436805, A022);
    }
}
