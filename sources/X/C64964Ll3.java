package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ll3  reason: case insensitive filesystem */
public final class C64964Ll3 implements MXG {
    public static final String __redex_internal_original_name = "AiStickerCreationController";
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public RecyclerView A08;
    public RecyclerView A09;
    public AnonymousClass2t9 A0A;
    public L69 A0B;
    public IgdsInlineSearchBox A0C;
    public String A0D;
    public boolean A0E;
    public final int A0F;
    public final Activity A0G;
    public final Context A0H;
    public final ViewStub A0I;
    public final 02m A0J;
    public final AnonymousClass2tC A0K;
    public final UserSession A0L;
    public final AnonymousClass8MK A0M;
    public final List A0N;
    public final Set A0O;
    public final C252213ok A0P = new C64871LjX(this, 1);
    public final AnonymousClass3E6 A0Q = AnonymousClass3E4.A01(this, false, true);
    public final L68 A0R;
    public final OKN A0S;
    public final String A0T;

    /* JADX WARNING: type inference failed for: r0v8, types: [X.2tF, java.lang.Object] */
    public C64964Ll3(Activity activity, ViewStub viewStub, UserSession userSession, AnonymousClass8MK r9) {
        0qQ.A0B(viewStub, 1);
        this.A0I = viewStub;
        this.A0L = userSession;
        this.A0G = activity;
        this.A0M = r9;
        Context context = viewStub.getContext();
        this.A0H = context;
        02m r1 = 02m.A0p;
        this.A0J = r1;
        0qQ.A07(context);
        this.A0S = new OKN(context, userSession);
        this.A0F = AnonymousClass7TG.A02(context);
        this.A0T = "ai_sticker_creation";
        this.A0N = AnonymousClass7TE.A1C();
        this.A0O = DbS.A0y();
        AnonymousClass2tC A002 = AnonymousClass2t9.A00(context);
        0qQ.A07(r1);
        A002.A01(new C61651KGb(r1, userSession));
        A002.A01(new Object());
        A002.A01(new KGV(new MJ0(this, 33)));
        A002.A01(new C61667KGr(false));
        this.A0K = A002;
        this.A0R = new L68(context, userSession, new L04(this));
    }

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public static final List A00(C64964Ll3 ll3) {
        List A002 = ll3.A0S.A00(false);
        ArrayList A0r = AnonymousClass7TG.A0r(A002);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            String A18 = AnonymousClass7TE.A18(it);
            if (A18.length() > 0) {
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append(AnonymousClass9VV.A00(A18.charAt(0)));
                String substring = A18.substring(1);
                0qQ.A07(substring);
                A18 = AnonymousClass7TF.A0l(substring, A1A);
            }
            A0r.add(A18);
        }
        return A0r;
    }

    private final void A01() {
        C252553pI r0;
        L69 l69 = this.A0B;
        if (l69 != null) {
            RecyclerView recyclerView = this.A09;
            int i = 0;
            if (!(recyclerView == null || (r0 = recyclerView.A0D) == null)) {
                r0.A1O(0);
            }
            ViewModelListUpdate A0R2 = DbS.A0R();
            for (Object next : 00k.A0d(0jo.A1G(A00(this)), 5)) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    A0R2.A00(new C61160JyC((String) next, new C58727Iwa(this, 26), i));
                    i = i2;
                }
            }
            A0R2.A00(new Jy4(new MJ0(this, 34)));
            l69.A00.A05(A0R2);
        }
    }

    public static final void A02(C64964Ll3 ll3) {
        IgdsInlineSearchBox igdsInlineSearchBox = ll3.A0C;
        if (igdsInlineSearchBox != null) {
            A03(ll3, (String) null, true);
            ll3.A0J.markerStart(31792419);
            L68 l68 = ll3.A0R;
            String searchString = igdsInlineSearchBox.getSearchString();
            0qQ.A0B(searchString, 0);
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            A042.A04("prompt", searchString);
            A042.A04("media_type", "image/png");
            A042.A03(C66579MXk.A00(1094), Double.valueOf(1.0d));
            A042.A04("caller", "ig_stories_ai_stickers");
            A042.A01(C66579MXk.A00(693));
            PandoGraphQLRequest A002 = C71582OnJ.A00(A042, A043, true, true);
            1vn r2 = l68.A02;
            0qQ.A0A(A002);
            C64394LbB.A00(new C64397LbE(l68, 10), A002, r2, l68, 11);
        }
    }

    public final Set Acf() {
        return this.A0O;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final void close() {
        C252553pI r0;
        27r A012 = 27p.A01(this.A0L);
        String str = this.A0D;
        29R r2 = A012.A09;
        1Ln A0N2 = JTO.A0N(r2);
        C279294yP A0J2 = r2.A0J();
        if (DbT.A1Y(A0N2) && A0J2 != null) {
            JTO.A1V(A0N2);
            AnonymousClass283 A082 = Dbc.A08(A0N2, A0J2, r2, "GEN_AI_STICKER_BROWSER_EXIT");
            JTQ.A1A(A0N2);
            A0N2.A0R("sticker_tray_session_id", A082.A0U);
            A0N2.A0R("browse_session_id", str);
            JTT.A1E(A0N2, A082);
            A0N2.Cgf();
        }
        this.A0E = false;
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0C;
        if (igdsInlineSearchBox != null) {
            Context context = this.A0H;
            igdsInlineSearchBox.setSearchRowHeight(Dbb.A01(context));
            igdsInlineSearchBox.A0E.setText("");
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.add_account_icon_circle_radius);
            0nA.A0d(igdsInlineSearchBox, dimensionPixelSize);
            0nA.A0U(igdsInlineSearchBox, dimensionPixelSize);
            igdsInlineSearchBox.setTranslationY(0.0f);
            igdsInlineSearchBox.setTranslationX(0.0f);
            int i = this.A00;
            if (i > 0) {
                0nA.A0V(igdsInlineSearchBox, i);
            }
            int i2 = this.A01;
            if (i2 > 0) {
                0nA.A0f(igdsInlineSearchBox, i2);
            }
        }
        RecyclerView recyclerView = this.A09;
        if (!(recyclerView == null || (r0 = recyclerView.A0D) == null)) {
            r0.A1O(0);
        }
        RecyclerView recyclerView2 = this.A09;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(0);
        }
        View view = this.A07;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.A03;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        int A022 = JTQ.A02(this.A06);
        RecyclerView recyclerView3 = this.A08;
        if (recyclerView3 != null) {
            recyclerView3.setVisibility(A022);
        }
        this.A0N.clear();
        AnonymousClass2t9 A002 = this.A0K.A00();
        this.A0A = A002;
        RecyclerView recyclerView4 = this.A08;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(A002);
        }
        0nA.A0J(this.A0G);
        AnonymousClass3E6 r1 = this.A0Q;
        r1.onStop();
        r1.EEH(this.A0P);
    }

    public final String getModuleName() {
        return this.A0T;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public static final void A03(C64964Ll3 ll3, String str, boolean z) {
        ViewModelListUpdate A0R2 = DbS.A0R();
        if (str == null || !ll3.A0N.isEmpty()) {
            List list = ll3.A0N;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                String str2 = ll3.A0D;
                A0r.add(new C61162JyE(ll3.A0M, (C317966o8) next, str2, i2));
                i = i2;
            }
            A0R2.A01(A0r);
            if (z) {
                ArrayList A0v = DbS.A0v(4);
                int i3 = 0;
                do {
                    A0v.add(new Object());
                    i3++;
                } while (i3 < 4);
                A0R2.A01(A0v);
            } else if (AnonymousClass7TE.A1b(list)) {
                A0R2.A00(new C61178JyU(false));
            }
            if (str != null) {
                C59689JTv.A03(ll3.A0H, str, "ai_sticker_api_error", 0);
            }
        } else {
            ll3.A0J.markerEnd(31792419, 3);
            A0R2.A00(new C64760Lhc(str));
        }
        AnonymousClass2t9 r0 = ll3.A0A;
        if (r0 != null) {
            r0.A05(A0R2);
        }
    }

    public final void E0h() {
        AnonymousClass2t9 r0;
        this.A0D = AnonymousClass7TF.A0b();
        if (this.A05 == null) {
            View inflate = this.A0I.inflate();
            Set set = this.A0O;
            set.clear();
            0qQ.A0A(inflate);
            set.add(inflate);
            View requireViewById = inflate.requireViewById(R.id.back_button);
            this.A02 = requireViewById;
            if (requireViewById != null) {
                LY0.A00(requireViewById, 0, this);
            }
            this.A07 = inflate.requireViewById(R.id.title_label);
            this.A03 = inflate.requireViewById(R.id.body_label);
            this.A04 = inflate.requireViewById(R.id.bottom_section);
            View requireViewById2 = inflate.requireViewById(R.id.create_button);
            this.A06 = requireViewById2;
            if (requireViewById2 != null) {
                LY1.A00(requireViewById2, 69, this);
            }
            IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) inflate.requireViewById(R.id.search_box);
            igdsInlineSearchBox.A03 = true;
            Context context = this.A0H;
            igdsInlineSearchBox.setHints(00k.A0S(A00(this), AnonymousClass7TE.A1I(context.getString(2131952653))));
            Context context2 = igdsInlineSearchBox.getContext();
            igdsInlineSearchBox.setTextColor(context2.getColor(2Yu.A0A(this.A0G)));
            igdsInlineSearchBox.setSearchGlyphColor(AnonymousClass7TE.A09(context2));
            igdsInlineSearchBox.setSearchRowHeight(Dbb.A01(context2));
            igdsInlineSearchBox.A02 = new C65353Lrt(this, 3);
            igdsInlineSearchBox.setEditTextOnClickListener(new LY1(this, 70));
            this.A0C = igdsInlineSearchBox;
            this.A08 = DbT.A0I(inflate, R.id.ai_sticker_list);
            AnonymousClass2t9 A002 = this.A0K.A00();
            this.A0A = A002;
            RecyclerView recyclerView = this.A08;
            if (recyclerView != null) {
                recyclerView.setAdapter(A002);
            }
            RecyclerView recyclerView2 = this.A08;
            if (recyclerView2 != null) {
                GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 2, 1, false);
                gridLayoutManager.A01 = new C60366JkE(this, 3);
                recyclerView2.setLayoutManager(gridLayoutManager);
            }
            UserSession userSession = this.A0L;
            if (182.A06(0Tu.A05, userSession, 36319716628962890L)) {
                this.A09 = DbT.A0I(inflate, R.id.suggested_prompts);
                this.A0B = new L69(context, this, userSession);
                A01();
                RecyclerView recyclerView3 = this.A09;
                if (recyclerView3 != null) {
                    L69 l69 = this.A0B;
                    if (l69 != null) {
                        r0 = l69.A00;
                    } else {
                        r0 = null;
                    }
                    recyclerView3.setAdapter(r0);
                }
                RecyclerView recyclerView4 = this.A09;
                if (recyclerView4 != null) {
                    DbV.A1A(context, recyclerView4);
                }
            }
            this.A05 = inflate;
        }
        A01();
        AnonymousClass3E6 r1 = this.A0Q;
        r1.A9Y(this.A0P);
        r1.DmJ(this.A0G);
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0C;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.A04();
        }
    }
}
