package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraCapturer;

/* renamed from: X.E4s  reason: case insensitive filesystem */
public final class C47488E4s extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS, G77, G9d {
    public static final String __redex_internal_original_name = "ReelViewerSettingsFragment";
    public LinearLayoutManager A00;
    public UserSession A01;
    public IgdsInlineSearchBox A02;
    public E9D A03;
    public C14221Ts1 A04;
    public String A05 = "";
    public final AnonymousClass7g1 A06 = new AnonymousClass7g1();

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final /* synthetic */ void DeT(C15050ULg uLg) {
        AnonymousClass9V2.A03(uLg, this);
    }

    public final void DeW(String str) {
    }

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final String getModuleName() {
        return C273654mx.A00(3250);
    }

    public final boolean onBackPressed() {
        E9D e9d = this.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A0u = AnonymousClass7TF.A0u(e9d.A07);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (AnonymousClass7TE.A1a(A1J.getValue())) {
                DbU.A1V((User) A1J.getKey(), A1C);
            }
        }
        E9D e9d2 = this.A03;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator A0u2 = AnonymousClass7TF.A0u(e9d2.A07);
        while (A0u2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0u2);
            if (!AnonymousClass7TE.A1a(A1J2.getValue())) {
                DbU.A1V((User) A1J2.getKey(), A1C2);
            }
        }
        1YZ r11 = 1YZ.A02;
        if (r11 == null) {
            return false;
        }
        if (!A1C.isEmpty() || !A1C2.isEmpty()) {
            try {
                UserSession userSession = this.A01;
                0qQ.A0B(userSession, 0);
                JSONObject A11 = DbS.A11();
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    A11.put(AnonymousClass7TE.A18(it), "block");
                }
                Iterator it2 = A1C2.iterator();
                while (it2.hasNext()) {
                    A11.put(AnonymousClass7TE.A18(it2), "unblock");
                }
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                A0a.A0A("friendships/set_reel_block_status/");
                A0a.A9m("source", "settings");
                A0a.A0O((15p) null, 1XP.class, 1XY.class, false);
                A0a.AA0("user_block_statuses", A11.toString());
                1OC A0U = DbT.A0U(A0a, true);
                A0U.A00 = new EDG(this, A1C, A1C2);
                schedule(A0U);
                if (A1C.size() != 1) {
                    return false;
                }
                E9D e9d3 = this.A03;
                String str = (String) A1C.get(0);
                Iterator A0u3 = AnonymousClass7TF.A0u(e9d3.A07);
                while (A0u3.hasNext()) {
                    Map.Entry A1J3 = AnonymousClass7TE.A1J(A0u3);
                    if (str.equals(DbS.A0q(A1J3.getKey()))) {
                        User user = (User) A1J3.getKey();
                        if (user == null || user.isRestricted()) {
                            return false;
                        }
                        r11.A00();
                        UserSession userSession2 = this.A01;
                        0qQ.A0B(userSession2, 0);
                        Context context = getContext();
                        if (context == null || !182.A06(0Tu.A06, userSession2, 36321486155359673L)) {
                            return false;
                        }
                        0wc A012 = AnonymousClass0kN.A01(this, userSession2);
                        C310336ap A0a2 = DbS.A0a();
                        A0a2.A0D = context.getString(2131972341, new Object[]{user.getUsername()});
                        A0a2.A0I = context.getString(2131972351);
                        DbW.A0q(context, A0a2, 2131972313);
                        A0a2.A0A(new C57277IVm(5, context, this, A012, userSession2, user));
                        A0a2.A0L = true;
                        A0a2.A01 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
                        DbY.A1N(A0a2);
                        return false;
                    }
                }
                return false;
            } catch (JSONException unused) {
                C59689JTv.A01(getContext(), "updateBlocklist_request_error", 2131972232, 1);
                EyC A002 = C49090EpF.A00(this.A01);
                A002.A01.flowEndFail(A002.A00, "error", (String) null);
                return false;
            }
        } else {
            1Ng A003 = AnonymousClass1Nd.A00(this.A01);
            E9D e9d4 = this.A03;
            ArrayList A1C3 = AnonymousClass7TE.A1C();
            Iterator it3 = e9d4.A05.iterator();
            while (it3.hasNext()) {
                DbY.A1W(A1C3, it3);
            }
            A003.A00(new FWQ(A1C3));
            requireActivity().getFragmentManager().popBackStack();
            EyC A004 = C49090EpF.A00(this.A01);
            A004.A01.flowEndCancel(A004.A00, AnonymousClass000.A00(4169));
            return false;
        }
    }

    public final void onSearchCleared(String str) {
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void DeM(C268654dm r5, String str) {
        if (this.A05.equals(str)) {
            C59689JTv.A01(getContext(), "UserListResponse_request_error", 2131972232, 1);
        }
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r4, String str) {
        C334247ax r42 = (C334247ax) r4;
        if (this.A05.equals(str)) {
            E9D e9d = this.A03;
            e9d.A06.addAll(r42.getItems());
            e9d.A00 = false;
            E9D.A00(e9d);
        }
    }

    public final AnonymousClass0wW getSession() {
        return this.A01;
    }

    public final void onSearchTextChanged(String str) {
        this.A05 = str;
        E9D e9d = this.A03;
        boolean isEmpty = str.isEmpty();
        if (e9d.A01 != isEmpty) {
            e9d.A01 = isEmpty;
            E9D.A00(e9d);
        }
        AnonymousClass9P5 BiX = this.A06.BiX(this.A05);
        Integer num = BiX.A01;
        Integer num2 = AnonymousClass05K.A0C;
        E9D e9d2 = this.A03;
        if (num == num2) {
            List list = BiX.A06;
            list.getClass();
            List list2 = e9d2.A06;
            list2.clear();
            list2.addAll(list);
            e9d2.A00 = false;
            E9D.A00(e9d2);
            return;
        }
        e9d2.A06.clear();
        e9d2.A00 = true;
        E9D.A00(e9d2);
        this.A04.A06(this.A05);
    }

    public final 1OC AMx(String str, String str2) {
        String A062;
        if (str.isEmpty() || DbT.A0j(this.A01).A0N() == AnonymousClass05K.A0C) {
            A062 = 0mp.A06(AnonymousClass000.A00(3160), new Object[]{this.A01.A06});
        } else {
            A062 = "users/search/";
        }
        return FGQ.A04(this.A01, A062, str, "reel_viewer_settings_page", (String) null);
    }

    public final void configureActionBar(2da r5) {
        DbW.A1B(r5, 2131971640);
        if (DbY.A1Y(0Tu.A06, this.A01, 36321486155359673L)) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A0C = 2131960992;
            A0K.A0D = R.style.ActionBarTextButton;
            DbX.A19(new FP2((Object) this, 29), A0K, r5);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1199773572);
        C47488E4s.super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        this.A01 = A0U;
        Integer num = AnonymousClass05K.A0C;
        AnonymousClass7g1 r9 = this.A06;
        0qQ.A0B(r9, 0);
        this.A04 = C14225Ts5.A01(A0U, this, (C337247fx) null, this, r9, num, false);
        E9D e9d = new E9D(requireContext(), this, this);
        this.A03 = e9d;
        e9d.setHasStableIds(true);
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        A0a.A0A(AnonymousClass000.A00(3162));
        C47696EDf.A00(this, DbW.A0L(A0a, C334247ax.class, C334257ay.class, true), 23);
        this.A04.A06(this.A05);
        EyC A002 = C49090EpF.A00(this.A01);
        A002.A00 = A002.A01.flowStartForMarker(18943604, "viewer_settings_fragment", false);
        AnonymousClass0fD.A09(1095946313, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1136429731);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.story_viewer_settings);
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) A0C.requireViewById(R.id.inline_search_box);
        this.A02 = igdsInlineSearchBox;
        igdsInlineSearchBox.A02 = this;
        igdsInlineSearchBox.A0E.setText(this.A05);
        this.A02.A00 = new LYN(this, 10);
        RecyclerView A0K = DbX.A0K(A0C);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.A00 = linearLayoutManager;
        A0K.setLayoutManager(linearLayoutManager);
        A0K.setAdapter(this.A03);
        C46864Dmg.A00(A0K, this, 9);
        AnonymousClass0fD.A09(-1302474560, A022);
        return A0C;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(193335332);
        super.onDestroy();
        this.A04.onDestroy();
        AnonymousClass0fD.A09(-211921828, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1267924042);
        super.onDestroyView();
        this.A04.onDestroyView();
        AnonymousClass0fD.A09(656904286, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-670006630);
        C47488E4s.super.onPause();
        DbS.A1D(this);
        AnonymousClass0fD.A09(227259333, A022);
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
