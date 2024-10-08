package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.NonprofitSelectorSurfaceEnum;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.Ll9  reason: case insensitive filesystem */
public final class C64970Ll9 implements MXG, C229132mt, C66441MRv, MVN, C51923G7r, G9d {
    public static final String __redex_internal_original_name = "FundraiserStickerSearchController";
    public View A00;
    public RecyclerView A01 = null;
    public C60431JlO A02;
    public C46434Dew A03;
    public String A04;
    public String A05 = "";
    public JZL A06;
    public Boolean A07 = false;
    public final Activity A08;
    public final Context A09;
    public final ViewStub A0A;
    public final AnonymousClass07Z A0B;
    public final AnonymousClass0iw A0C;
    public final UserSession A0D;
    public final AnonymousClass8MN A0E;
    public final Boolean A0F;
    public final String A0G;
    public final List A0H = AnonymousClass7TE.A1C();
    public final List A0I = AnonymousClass7TE.A1C();
    public final Set A0J = AnonymousClass7TE.A1F();
    public final NonprofitSelectorSurfaceEnum A0K;
    public final C14221Ts1 A0L;
    public final C337287g2 A0M;

    public C64970Ll9(Activity activity, ViewStub viewStub, AnonymousClass07Z r12, NonprofitSelectorSurfaceEnum nonprofitSelectorSurfaceEnum, AnonymousClass0iw r14, UserSession userSession, AnonymousClass8MN r16, Boolean bool, String str) {
        Context context = viewStub.getContext();
        this.A09 = context;
        this.A0B = r12;
        this.A0D = userSession;
        this.A0A = viewStub;
        this.A0E = r16;
        this.A0K = nonprofitSelectorSurfaceEnum;
        this.A0G = str;
        this.A0C = r14;
        context.getColor(R.color.fundraiser_search_background_tint_color);
        this.A0F = bool;
        this.A08 = activity;
        AnonymousClass7g1 r6 = new AnonymousClass7g1();
        this.A0M = r6;
        this.A0L = C14225Ts5.A01(userSession, (AnonymousClass4D6) null, (C337247fx) null, this, r6, AnonymousClass05K.A0C, false);
    }

    public final /* synthetic */ 1OC AMw(C15050ULg uLg, String str) {
        return A1E.A00(uLg, this, str);
    }

    public final /* synthetic */ void Cw3() {
    }

    public final void Cw4() {
    }

    public final void Cw5() {
    }

    public final void Cw7(String str) {
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

    public final /* synthetic */ void Dej(C15050ULg uLg) {
        AnonymousClass9V2.A04(uLg, this);
    }

    public final void Dem(String str) {
    }

    public final /* synthetic */ void Der(C15050ULg uLg, AnonymousClass1XT r2) {
        AnonymousClass9V2.A00(uLg, r2, this);
    }

    public final /* synthetic */ void Dfq() {
    }

    public final void DhN() {
    }

    public final /* synthetic */ void Dnw(boolean z) {
    }

    public final void E0h() {
        if (this.A00 == null) {
            View inflate = this.A0A.inflate();
            this.A00 = inflate;
            this.A0J.add(inflate);
            this.A01 = DbT.A0I(this.A00, R.id.fundraiser_recipient_list);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.A00.getContext());
            this.A01.setLayoutManager(linearLayoutManager);
            AnonymousClass07Z r0 = this.A0B;
            UserSession userSession = this.A0D;
            C46434Dew dew = new C46434Dew(r0, userSession, this);
            this.A03 = dew;
            C60431JlO jlO = new C60431JlO(this.A08, this.A0C, userSession, this, this, dew, this.A0F, this.A0G);
            this.A02 = jlO;
            this.A01.setAdapter(jlO);
            this.A01.A15(new C3251871j(linearLayoutManager, this, C3251771i.A0G));
            View view = this.A00;
            view.getClass();
            this.A06 = new JZL(view.requireViewById(R.id.search_bar_container), userSession, this, this);
        }
        A01(this);
        this.A0I.clear();
        this.A0H.clear();
        this.A0M.clear();
        this.A05 = "";
        C46434Dew dew2 = this.A03;
        dew2.getClass();
        dew2.A02 = true;
        this.A0L.A06(this.A05);
    }

    public final String getModuleName() {
        return "fundraiser_sticker_search";
    }

    private void A00() {
        if (!this.A07.booleanValue()) {
            UserSession userSession = this.A0D;
            C60431JlO jlO = this.A02;
            jlO.getClass();
            List list = jlO.A02;
            String str = this.A0G;
            0wc A012 = AnonymousClass0kN.A01(this.A0C, userSession);
            StringBuilder A1A = AnonymousClass7TE.A1A();
            HashMap A1E = AnonymousClass7TE.A1E();
            if (list.size() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A1A.append(AnonymousClass7TE.A18(it));
                    A1A.append(",");
                }
                A1A.deleteCharAt(A1A.length() - 1);
                A1E.put("standalone_fundraiser_ids", A1A.toString());
            }
            0Aj A0e = AnonymousClass7TE.A0e(A012, "ig_cg_view_nonprofit_selector_nullstate");
            A0e.AAJ("source_name", str);
            A0e.A9H("attributes", A1E);
            A0e.Cgf();
            this.A07 = AnonymousClass7TE.A0v();
        }
    }

    public static void A01(C64970Ll9 ll9) {
        C60431JlO jlO = ll9.A02;
        jlO.getClass();
        jlO.A01 = false;
        jlO.A05.clear();
        jlO.A06.clear();
        jlO.A04.clear();
        jlO.A03.clear();
        jlO.A01();
    }

    public final void ACw() {
        C46434Dew dew = this.A03;
        dew.getClass();
        if (dew.CKB()) {
            CgO();
        }
    }

    public final 1OC AMx(String str, String str2) {
        15p r3;
        1NY A0b;
        C46434Dew dew = this.A03;
        dew.getClass();
        dew.A01 = false;
        String str3 = this.A0M.BiX(str).A03;
        boolean isEmpty = TextUtils.isEmpty(str);
        UserSession userSession = this.A0D;
        if (isEmpty) {
            NonprofitSelectorSurfaceEnum nonprofitSelectorSurfaceEnum = this.A0K;
            0qQ.A0B(userSession, 0);
            0qQ.A0B(nonprofitSelectorSurfaceEnum, 1);
            r3 = null;
            A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0A("fundraiser/story_charities_nullstate/");
            A0b.A9m("surface", nonprofitSelectorSurfaceEnum.toString());
        } else {
            0qQ.A0B(userSession, 0);
            r3 = null;
            A0b = AnonymousClass7TG.A0b(userSession);
            A0b.A0A("fundraiser/story_charities_search/");
            A0b.A9m("query", str);
        }
        A0b.A0O(r3, CGY.class, D2B.class, false);
        if (str3 != null) {
            A0b.A9m("max_id", str3);
        }
        return A0b.A0M();
    }

    public final Set Acf() {
        return this.A0J;
    }

    public final Integer Aci() {
        return AnonymousClass05K.A01;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final boolean CJz() {
        C60431JlO jlO = this.A02;
        if (jlO == null || jlO.A00() <= 0) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ boolean Cch() {
        return false;
    }

    public final void CgO() {
        C46434Dew dew = this.A03;
        dew.getClass();
        dew.A02 = true;
        this.A0L.A03(this.A05);
    }

    public final void Cw6(String str) {
        List<Object> list;
        if (!str.equals(this.A05)) {
            this.A05 = str;
            AnonymousClass9P5 BiX = this.A0M.BiX(str);
            if (BiX.A01 != AnonymousClass05K.A0C || (list = BiX.A06) == null) {
                A01(this);
                C46434Dew dew = this.A03;
                dew.getClass();
                dew.A00 = null;
                this.A03.A02 = true;
                this.A0L.A06(this.A05);
                return;
            }
            C46434Dew dew2 = this.A03;
            dew2.getClass();
            dew2.A02 = false;
            this.A03.A00 = BiX.A03;
            boolean isEmpty = TextUtils.isEmpty(this.A05);
            C60431JlO jlO = this.A02;
            jlO.getClass();
            if (isEmpty) {
                String str2 = this.A04;
                jlO.A01 = false;
                List list2 = jlO.A05;
                list2.clear();
                list2.addAll(list);
                jlO.A00 = str2;
                C60431JlO jlO2 = this.A02;
                List list3 = this.A0H;
                jlO2.A01 = false;
                List list4 = jlO2.A03;
                list4.clear();
                list4.addAll(list3);
                C60431JlO jlO3 = this.A02;
                List list5 = this.A0I;
                jlO3.A01 = false;
                List list6 = jlO3.A04;
                list6.clear();
                list6.addAll(list5);
            } else {
                jlO.A01 = true;
                List list7 = jlO.A06;
                list7.clear();
                for (Object A1T : list) {
                    JTR.A1T(A1T, list7);
                }
            }
            this.A02.A01();
            A00();
        }
    }

    public final void DeM(C268654dm r4, String str) {
        LTM.A00(this, this.A0D, JTO.A0u("Fundraiser sticker search recipient fetch failed."), (String) null);
        C46434Dew dew = this.A03;
        dew.getClass();
        dew.A01 = true;
        C59689JTv.A0F(this.A09, "fundraiser_sticker_search_error", 2131962848);
        C60431JlO jlO = this.A02;
        jlO.getClass();
        jlO.notifyDataSetChanged();
    }

    public final void DeW(String str) {
        if (str.equals(this.A05)) {
            C46434Dew dew = this.A03;
            dew.getClass();
            dew.A02 = false;
        }
    }

    public final /* bridge */ /* synthetic */ void Dev(AnonymousClass1XT r6, String str) {
        CGY cgy = (CGY) r6;
        this.A04 = cgy.A01;
        if (!str.equals(this.A05)) {
            return;
        }
        if (!cgy.A05.isEmpty() || !cgy.A07) {
            C46434Dew dew = this.A03;
            dew.getClass();
            dew.A00 = cgy.A00;
            this.A02.getClass();
            boolean isEmpty = TextUtils.isEmpty(str);
            int A002 = this.A02.A00();
            if (!isEmpty) {
                C60431JlO jlO = this.A02;
                List<Object> list = cgy.A05;
                if (A002 == 0) {
                    jlO.A01 = true;
                    List list2 = jlO.A06;
                    list2.clear();
                    for (Object A1T : list) {
                        JTR.A1T(A1T, list2);
                    }
                } else {
                    for (Object A1T2 : list) {
                        JTR.A1T(A1T2, jlO.A06);
                    }
                }
            } else if (A002 == 0) {
                List list3 = this.A0I;
                list3.clear();
                List list4 = this.A0H;
                list4.clear();
                List list5 = cgy.A03;
                if (list5 != null) {
                    list3.addAll(list5);
                }
                List list6 = cgy.A02;
                if (list6 != null) {
                    list4.addAll(list6);
                }
                C60431JlO jlO2 = this.A02;
                jlO2.A01 = false;
                List list7 = jlO2.A03;
                list7.clear();
                list7.addAll(list4);
                C60431JlO jlO3 = this.A02;
                jlO3.A01 = false;
                List list8 = jlO3.A04;
                list8.clear();
                list8.addAll(list3);
                C60431JlO jlO4 = this.A02;
                List list9 = cgy.A05;
                String str2 = this.A04;
                jlO4.A01 = false;
                List list10 = jlO4.A05;
                list10.clear();
                list10.addAll(list9);
                jlO4.A00 = str2;
            } else {
                C60431JlO jlO5 = this.A02;
                jlO5.A05.addAll(cgy.A05);
            }
            this.A02.A01();
            A00();
            return;
        }
        LTM.A00(this, this.A0D, JTO.A0u("Fundraiser sticker search recipient fetch succeeded, but returned empty list of recipients."), (String) null);
        C46434Dew dew2 = this.A03;
        dew2.getClass();
        dew2.A01 = true;
        C59689JTv.A0F(this.A09, "fundraiser_sticker_search_error", 2131962848);
        C60431JlO jlO6 = this.A02;
        jlO6.getClass();
        jlO6.notifyDataSetChanged();
    }

    public final /* synthetic */ boolean Erv() {
        return true;
    }

    public final void close() {
        JZL jzl = this.A06;
        if (jzl != null) {
            jzl.A01();
            jzl.A02();
        }
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }

    public final /* synthetic */ 1GP AMy(C15050ULg uLg, String str) {
        return null;
    }
}
