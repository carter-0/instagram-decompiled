package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;

/* renamed from: X.UbF  reason: case insensitive filesystem */
public final class C15363UbF extends AnonymousClass4DH implements C20985X8b, AnonymousClass4DS, C20917X4i, G9d {
    public static final String __redex_internal_original_name = "FindFriendsSearchFragment";
    public ListView A00;
    public AnonymousClass32A A01;
    public C15475UdQ A02;
    public C14200Trf A03;
    public C14221Ts1 A04;
    public C14437TwL A05;
    public SearchEditText A06;
    public String A07 = "";
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = true;
    public View A0E;
    public 1wn A0F;
    public 1wn A0G;
    public C358448av A0H;
    public C337287g2 A0I;
    public final X4Z A0J = new C14503TxP(this, 2);
    public final C20910X4b A0K = new C14156Tqs(this, 2);
    public final AnonymousClass0eM A0L = C227642jf.A02(this);
    public final 1wn A0M = new WQU(this, 7);
    public final C74428Pui A0N = new C19553Wbd(2);
    public final C74585PxY A0O = new C16202UqR(this, 0);
    public final G6V A0P = new C19707We9(this, 2);

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final 1OC AMx(String str, String str2) {
        String str3 = str;
        0qQ.A0B(str, 0);
        C337287g2 r0 = this.A0I;
        if (r0 == null) {
            0qQ.A0F("cache");
            throw AnonymousClass00P.createAndThrow();
        }
        return FFZ.A03(AnonymousClass7TE.A0l(this.A0L), new C47165Drg(str3, "search_find_friends_page", str2, r0.BiX(str).A04, (String) null, (String) null, 30, false, false, false));
    }

    public final /* synthetic */ void DeG(C15050ULg uLg) {
        AnonymousClass9V2.A02(uLg, this);
    }

    public final void DeH(String str) {
    }

    public final /* synthetic */ void DeJ(C15050ULg uLg, C268654dm r2) {
        AnonymousClass9V2.A01(uLg, r2, this);
    }

    public final void DeM(C268654dm r4, String str) {
        0qQ.A0B(str, 0);
        String str2 = this.A07;
        if (str.equals(str2)) {
            this.A0C = false;
            this.A0A = true;
            A03(this, str2, false);
        }
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

    public final void Euf() {
        this.A0D = true;
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131972810);
    }

    public final String getModuleName() {
        return "find_friends";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass0eM r3 = this.A0L;
        1Ng A0R = DbX.A0R(r3);
        Class<WQG> cls = WQG.class;
        1wn r0 = this.A0F;
        if (r0 == null) {
            str = "clearSearchesEventListener";
        } else {
            A0R.A01(r0, cls);
            Class<WQ3> cls2 = WQ3.class;
            1wn r02 = this.A0G;
            if (r02 == null) {
                str = "updatedSearchesEventListener";
            } else {
                A0R.A01(r02, cls2);
                SearchEditText searchEditText = (SearchEditText) view.requireViewById(R.id.search_edit_text);
                this.A06 = searchEditText;
                str = "searchEditText";
                if (searchEditText != null) {
                    searchEditText.setHint(2131972861);
                    SearchEditText searchEditText2 = this.A06;
                    if (searchEditText2 != null) {
                        searchEditText2.A0C = new C19771WfC(this);
                        if (this.A0D) {
                            searchEditText2.requestFocus();
                            SearchEditText searchEditText3 = this.A06;
                            if (searchEditText3 != null) {
                                0nA.A0Q(searchEditText3);
                                this.A0D = false;
                            }
                        }
                        ColorFilter A002 = AnonymousClass37O.A00(JTP.A02(getContext(), requireContext(), R.attr.igds_color_creation_tools_grey_05));
                        SearchEditText searchEditText4 = this.A06;
                        if (searchEditText4 != null) {
                            searchEditText4.setClearButtonColorFilter(A002);
                            SearchEditText searchEditText5 = this.A06;
                            if (searchEditText5 != null) {
                                AnonymousClass7TG.A10(A002, searchEditText5.getCompoundDrawablesRelative()[0]);
                                AnonymousClass4v0 A003 = AnonymousClass4v0.A00(DbT.A0X(r3));
                                SearchEditText searchEditText6 = this.A06;
                                if (searchEditText6 != null) {
                                    searchEditText6.addTextChangedListener(A003);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C15363UbF ubF) {
        String str;
        C358448av r4 = ubF.A0H;
        if (r4 == null) {
            str = "searchLogger";
        } else {
            String str2 = ubF.A07;
            C14200Trf trf = ubF.A03;
            str = "dataSource";
            if (trf != null) {
                String A032 = trf.A03(str2);
                C14200Trf trf2 = ubF.A03;
                if (trf2 != null) {
                    r4.CkP(C67452Mo7.A00(trf2.A01), str2, A032);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C15363UbF ubF) {
        String str;
        View view = ubF.A0E;
        if (view == null) {
            str = "emptyView";
        } else {
            int i = 0;
            int i2 = 8;
            if (ubF.A07.length() == 0) {
                i2 = 0;
            }
            view.setVisibility(i2);
            ListView listView = ubF.A00;
            if (listView == null) {
                str = "listView";
            } else {
                if (ubF.A07.length() <= 0) {
                    i = 8;
                }
                listView.setVisibility(i);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(C15363UbF ubF, CharSequence charSequence, boolean z) {
        int A022;
        String string;
        boolean z2 = ubF.A0A;
        Context requireContext = ubF.requireContext();
        Context context = ubF.getContext();
        if (z2) {
            A022 = JTP.A02(context, requireContext, R.attr.igds_color_creation_tools_blue);
            string = AnonymousClass7TF.A0e(DbV.A05(ubF), charSequence, 2131972817);
        } else {
            A022 = JTP.A02(context, requireContext, R.attr.igds_color_creation_tools_grey_05);
            string = ubF.requireContext().getString(2131972868);
        }
        C15475UdQ udQ = ubF.A02;
        if (udQ != null) {
            0qQ.A0B(string, 0);
            udQ.A03.A00 = z;
            TwD twD = udQ.A02;
            twD.A01 = string;
            twD.A00 = A022;
            udQ.A01 = true;
            C15475UdQ udQ2 = ubF.A02;
            if (udQ2 != null) {
                udQ2.A01();
                udQ2.updateListView();
                return;
            }
        }
        0qQ.A0F("searchAdapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void CLU() {
        SearchEditText searchEditText = this.A06;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.A04();
        }
    }

    public final void CLu(String str) {
        String str2;
        C14200Trf trf = this.A03;
        if (trf == null) {
            str2 = "dataSource";
        } else {
            trf.A04();
            C15475UdQ udQ = this.A02;
            if (udQ == null) {
                str2 = "searchAdapter";
            } else {
                udQ.A01();
                udQ.updateListView();
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void CgR() {
        if (this.A0C && !this.A0A) {
            C14221Ts1 ts1 = this.A04;
            if (ts1 != null) {
                if (!ts1.A04()) {
                    String str = this.A07;
                    if (str.length() > 0) {
                        this.A0B = false;
                        C14221Ts1 ts12 = this.A04;
                        if (ts12 != null) {
                            ts12.A03(str);
                            A03(this, (CharSequence) null, true);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F("queuedTypeAheadManager");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r5, String str) {
        String str2;
        C69148NfX nfX = (C69148NfX) r5;
        AnonymousClass7TF.A1H(str, nfX);
        if (str.equals(this.A07)) {
            String str3 = nfX.A03;
            boolean z = true;
            if (str3 == null || str3.length() == 0) {
                0wb.A03("UserSearchResponse", "Invalid UserSearchResponse format, missing rankToken");
            }
            List list = nfX.A00;
            0qQ.A07(list);
            C14200Trf trf = this.A03;
            if (trf == null) {
                str2 = "dataSource";
            } else {
                trf.A04();
                this.A0A = false;
                if (this.A0B) {
                    ListView listView = this.A00;
                    if (listView == null) {
                        str2 = "listView";
                    } else {
                        listView.setSelection(0);
                    }
                }
                if (!nfX.A04 || !AnonymousClass7TE.A1b(list)) {
                    z = false;
                }
                this.A0C = z;
                C15475UdQ udQ = this.A02;
                str2 = "searchAdapter";
                if (udQ != null) {
                    udQ.A01 = false;
                    udQ.A01();
                    udQ.updateListView();
                    A01(this);
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DwY() {
        AnonymousClass32A r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("reelViewerLauncher");
            throw AnonymousClass00P.createAndThrow();
        }
        AnonymousClass6VJ r1 = r0.A07;
        if (r1 != null) {
            r1.A05(AnonymousClass05K.A00);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0L);
    }

    public static final void A00(C66942Mfb mfb, C66967Mg0 mg0, C15363UbF ubF) {
        OVV A002 = C70326O2e.A00(mfb);
        A002.A07 = mg0.A09;
        A002.A01 = mg0.A05;
        C14486Tx8 A012 = A002.A01();
        C358448av r1 = ubF.A0H;
        if (r1 == null) {
            0qQ.A0F("searchLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        String E4p = ubF.A0K.E4p();
        int i = mg0.A00;
        r1.CkL(A012, AnonymousClass05K.A0N, AnonymousClass05K.A0C, E4p, mg0.A06, i);
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1198950294);
        C15363UbF.super.onCreate(bundle);
        String A0b = AnonymousClass7TF.A0b();
        this.A09 = A0b;
        String str = "searchSessionId";
        if (A0b != null) {
            AnonymousClass0eM r3 = this.A0L;
            this.A05 = new C14437TwL(requireActivity(), this, AnonymousClass7TE.A0l(r3), A0b, 112, false);
            this.A0F = new C19221WQb(this, 35);
            this.A0G = new C19221WQb(this, 36);
            this.A0I = new AnonymousClass7g1();
            DbX.A0R(r3).A01(this.A0M, C2370836g.class);
            String str2 = this.A09;
            if (str2 != null) {
                this.A0H = C358428at.A00(this, AnonymousClass7TE.A0l(r3), str2);
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                C337287g2 r1 = this.A0I;
                str = "cache";
                if (r1 != null) {
                    this.A04 = C14225Ts5.A00(A0l, this, (C337247fx) null, this, r1, AnonymousClass05K.A00, 0, 200, false, false);
                    this.A01 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r3), new AnonymousClass328(this));
                    this.A08 = AnonymousClass7TF.A0b();
                    C337287g2 r6 = this.A0I;
                    if (r6 != null) {
                        C20910X4b x4b = this.A0K;
                        X4Z x4z = this.A0J;
                        this.A03 = new C14200Trf(C18405Vr7.A00, x4z, x4b, new C19541WbR(AnonymousClass7TE.A0l(r3)), r6, 3, false);
                        FragmentActivity requireActivity = requireActivity();
                        C14200Trf trf = this.A03;
                        if (trf == null) {
                            str = "dataSource";
                        } else {
                            r3.getValue();
                            this.A02 = new C15475UdQ(requireActivity, trf, x4z, x4b, new VWN(requireActivity(), (FragmentActivity) null, this, AnonymousClass7TE.A0l(r3), this.A0N, this.A0O, (Integer) null, C273654mx.A00(949), true, true, false), this.A0P);
                            AnonymousClass0fD.A09(-251988675, A022);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.UdQ, android.widget.ListAdapter] */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1058218771);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.find_friends_fragment, viewGroup, false);
        this.A0E = inflate.findViewById(R.id.empty_view);
        ListView listView = (ListView) inflate.requireViewById(16908298);
        ? r0 = this.A02;
        if (r0 == 0) {
            0qQ.A0F("searchAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        listView.setAdapter(r0);
        listView.setOnScrollListener(new C14431TwF(this));
        this.A00 = listView;
        AnonymousClass0fD.A09(-1493059228, A022);
        return inflate;
    }

    public final void onDestroy() {
        String str;
        int A022 = AnonymousClass0fD.A02(-374132717);
        C14221Ts1 ts1 = this.A04;
        if (ts1 == null) {
            str = "queuedTypeAheadManager";
        } else {
            ts1.onDestroy();
            1Ng A0R = DbX.A0R(this.A0L);
            Class<WQG> cls = WQG.class;
            1wn r0 = this.A0F;
            if (r0 == null) {
                str = "clearSearchesEventListener";
            } else {
                A0R.A02(r0, cls);
                Class<WQ3> cls2 = WQ3.class;
                1wn r02 = this.A0G;
                if (r02 == null) {
                    str = "updatedSearchesEventListener";
                } else {
                    A0R.A02(r02, cls2);
                    A0R.A02(this.A0M, C2370836g.class);
                    super.onDestroy();
                    AnonymousClass0fD.A09(1206201189, A022);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-541384782);
        C15363UbF.super.onPause();
        CLU();
        AnonymousClass0fD.A09(-1342503659, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-508563649);
        super.onResume();
        AnonymousClass3K2 A0a = C13989Tnp.A0a(this);
        if (A0a != null && A0a.A0Z()) {
            A0a.A0X(this);
        }
        A02(this);
        AnonymousClass0fD.A09(-1401760749, A022);
    }
}
