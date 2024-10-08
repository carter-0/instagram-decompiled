package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

public final class E32 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorInspirationHubTopAudioFragment";
    public H1J A00;
    public H1J A01;
    public H1J A02;
    public H1J A03;
    public ArrayList A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        String str;
        0qQ.A0B(r4, 0);
        r4.Eu4(true);
        Bundle bundle = this.mArguments;
        if (bundle == null || (str = bundle.getString("page_title")) == null) {
            str = AnonymousClass7TF.A0d(DbV.A05(this), 2131957070);
        }
        r4.setTitle(str);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A02(AnonymousClass05K.A0Y);
        DbX.A19(FPI.A00(this, 1), A0K, r4);
    }

    public final String getModuleName() {
        return "creator_inspiration_hub_top_audio_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TF.A0G(view, R.id.creator_inspiration_hub_top_audio_pills);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList arrayList = this.A04;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C48154EZw eZw = C48154EZw.TRENDING;
                if (!0qQ.A0K(next, "trending")) {
                    eZw = C48154EZw.POPULAR;
                    if (!0qQ.A0K(next, "popular_with_your_followers")) {
                        if (0qQ.A0K(next, "trending_with_similar_accounts")) {
                            eZw = C48154EZw.TRENDING_WITH_SIMILAR_ACCOUNTS;
                        } else {
                            eZw = C48154EZw.ORIGINAL_AUDIO;
                            if (!0qQ.A0K(next, "original_audio")) {
                            }
                        }
                    }
                }
                A1C.add(eZw);
            }
        }
        AnonymousClass0eM r2 = this.A05;
        C46785DlD dlD = (C46785DlD) r2.getValue();
        Context requireContext = requireContext();
        Integer num = AnonymousClass05K.A01;
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (str = bundle2.getString(AnonymousClass000.A00(692))) == null) {
            str = "trending";
        }
        dlD.A01(requireContext, recyclerView, num, str, A1C);
        DbZ.A1C(this, new C66929MfO(this, view, (AnonymousClass4D7) null, 3), ((C46785DlD) r2.getValue()).A03);
    }

    public static H1J A01(E32 e32, String str) {
        e32.A06.getValue();
        Bundle A002 = e32.A00(str);
        H1J h1j = new H1J();
        h1j.setArguments(A002);
        return h1j;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public E32() {
        G1d g1d = G1d.A00;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new GW6(new GW6(this, 40), 41));
        this.A05 = DbS.A0I(new GW6(A002, 42), g1d, new C73664Phd(11, A002, (Object) null), DbS.A0z(C46785DlD.class));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0035, code lost:
        if (X.182.A06(X.0Tu.A05, X.DbY.A0R(r5.A06), 36328401052974411L) == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final android.os.Bundle A00(java.lang.String r6) {
        /*
            r5 = this;
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            X.89j r1 = X.C3515689j.CREATORS_INSPIRATION_HUB_AUDIO
            java.lang.String r0 = "music_selection_source"
            r4.putSerializable(r0, r1)
            X.HM8 r1 = X.HM8.CREATOR_INSPIRATION_HUB_AUDIO_TAB
            java.lang.String r0 = "trend_report_entrypoint"
            r4.putSerializable(r0, r1)
            r0 = 692(0x2b4, float:9.7E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putString(r0, r6)
            java.lang.String r0 = "trending"
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x0037
            X.0eM r0 = r5.A06
            X.0lg r3 = X.DbY.A0R(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328401052974411(0x81107d00053d4b, double:3.0375653364060335E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            r0 = 1815(0x717, float:2.543E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putBoolean(r0, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E32.A00(java.lang.String):android.os.Bundle");
    }

    public final void onCreate(Bundle bundle) {
        ArrayList<String> arrayList;
        int A022 = AnonymousClass0fD.A02(-348671386);
        E32.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            arrayList = bundle2.getStringArrayList(AnonymousClass000.A00(519));
        } else {
            arrayList = null;
        }
        this.A04 = arrayList;
        if (arrayList != null) {
            Iterator A1G = AnonymousClass7TE.A1G(arrayList);
            while (A1G.hasNext()) {
                String str = (String) AnonymousClass7TF.A0a(A1G);
                if (0qQ.A0K(str, "trending")) {
                    this.A02 = A01(this, str);
                } else if (0qQ.A0K(str, "popular_with_your_followers")) {
                    this.A01 = A01(this, str);
                } else if (0qQ.A0K(str, "trending_with_similar_accounts")) {
                    this.A03 = A01(this, str);
                } else if (0qQ.A0K(str, "original_audio")) {
                    this.A00 = A01(this, str);
                }
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this, DbY.A0R(this.A06)), "instagram_organic_audio_trending_tab_impression");
                if (A0e.isSampled()) {
                    A0e.AAJ("containermodule", "creator_inspiration_hub_top_audio_fragment");
                    A0e.A9F("container_id", 0L);
                    DbY.A1C(A0e);
                    A0e.AAJ(C66579MXk.A00(406), str);
                    A0e.Cgf();
                }
            }
        }
        AnonymousClass0fD.A09(1164207539, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1863030995);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.creator_inspiration_hub_top_audio_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1362753275, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1046567932);
        super.onResume();
        if (AnonymousClass3HA.A00(requireContext())) {
            C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A06), false, false);
        }
        AnonymousClass0fD.A09(-1514269967, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1945336291);
        E32.super.onStop();
        C317756nm.A04(requireActivity(), AnonymousClass7TE.A0l(this.A06), false);
        AnonymousClass0fD.A09(1499454789, A022);
    }
}
