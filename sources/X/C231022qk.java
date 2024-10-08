package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.2qk  reason: invalid class name and case insensitive filesystem */
public final class C231022qk implements C231032ql {
    public boolean A00;
    public final int A01;
    public final Fragment A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C231112qt A05;
    public final C231142qw A06;
    public final C231012qj A07;
    public final C231052qn A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new C377209Ky(this, 29));

    public C231022qk(Fragment fragment, UserSession userSession, 2el r30, AnonymousClass4DU r31, C231012qj r32, String str, String str2, String str3, String str4, int i) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        2el r4 = r30;
        0qQ.A0B(r4, 4);
        AnonymousClass4DU r11 = r31;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        int i2 = i;
        C231052qn r12 = new C231052qn(userSession2, r4, r11, str5, str8, (String) null, str6, (String) null, str7, str8, i2);
        Fragment fragment2 = fragment;
        this.A02 = fragment2;
        this.A03 = userSession2;
        this.A04 = r11;
        this.A08 = r12;
        this.A0C = str5;
        this.A0B = str6;
        this.A07 = r32;
        this.A09 = str7;
        this.A0A = str8;
        this.A01 = i2;
        String str9 = str6;
        this.A06 = C231132qv.A00(fragment2.requireContext(), fragment2.requireActivity(), (RankingInfo) null, userSession2, r11, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, str9, (String) null, (String) null, str5, false, false);
        this.A05 = new C231112qt(r11, userSession2, str5, (String) null, (String) null, str9, (String) null, str7, str8, (String) null, (String) null, (String) null, (String) null, i2);
    }

    public final void EBz(View view, C268374dH r8) {
        String str;
        0qQ.A0B(r8, 1);
        if (!this.A00) {
            this.A00 = true;
            if (r8 instanceof C268364dG) {
                str = ((C268364dG) r8).A02.toString();
            } else {
                str = null;
            }
            C17839Vgs A002 = C17054VGc.A00(this.A03);
            1QP r3 = A002.A01;
            long flowStartForMarker = r3.flowStartForMarker(37371407, "explore_pivots", false);
            A002.A00 = flowStartForMarker;
            if (str == null) {
                str = "";
            }
            r3.flowAnnotate(flowStartForMarker, "pivot_type", str);
        }
        this.A08.A01(view, r8, A00(r8));
    }

    public final void FJ3(View view) {
        C17054VGc.A00(this.A03).A00();
        this.A00 = false;
        this.A08.A00.A04(view);
    }

    private final String A00(C268374dH r2) {
        if (!(r2 instanceof MultiProductComponent)) {
            return VH1.A00(this.A07.A00);
        }
        String A002 = ((MultiProductComponent) r2).A00();
        0qQ.A07(A002);
        return A002;
    }

    public final void A9u(C268374dH r3, int i) {
        this.A08.A03(r3, A00(r3), i);
    }

    public final XC9 BgB() {
        return (C19655WdJ) this.A0D.getValue();
    }

    public final void DzD(C16675UzB uzB, C268374dH r17, int i) {
        String str;
        AnonymousClass4DU r4 = this.A04;
        UserSession userSession = this.A03;
        C268374dH r5 = r17;
        String A002 = A00(r5);
        String str2 = this.A0C;
        W3r.A0D(userSession, r4, r5, A002, (String) null, str2);
        X9B Aif = r5.Aif();
        if (Aif == null || (str = Aif.Awg()) == null) {
            str = r5.getTitle();
        }
        UserSession userSession2 = userSession;
        C18025Vk1 A0J = C249713kF.A00.A0J(this.A02.requireActivity(), userSession2, uzB, str2, r4.getModuleName());
        A0J.A0D = str;
        A0J.A03 = null;
        A0J.A02 = r5.Bg7();
        A0J.A00 = i;
        A0J.A00();
    }

    public final void DzI(C268374dH r16, User user) {
        String A002;
        UserSession userSession = this.A03;
        C17839Vgs A003 = C17054VGc.A00(userSession);
        long j = A003.A00;
        if (j > 0) {
            1QP r6 = A003.A01;
            r6.flowMarkPoint(j, "VISIT_STOREFRONT");
            r6.flowEndSuccess(A003.A00);
            A003.A00 = 0;
        }
        C268374dH r2 = r16;
        if (r2 instanceof C268364dG) {
            A002 = ((C268364dG) r2).A01();
        } else {
            A002 = AnonymousClass000.A00(782);
        }
        0qQ.A0A(A002);
        ArrayList arrayList = new ArrayList();
        for (ProductFeedItem A022 : Collections.unmodifiableList(r2.Bg7().A03)) {
            Product A023 = A022.A02();
            if (A023 != null) {
                arrayList.add(A023.A0H);
            }
        }
        String C2K = r2.C2K();
        User user2 = user;
        String A004 = AnonymousClass3ZA.A00(user2);
        if (A004 != null) {
            W2P A0N = C249713kF.A00.A0N(this.A02.requireActivity(), user2.A03.BsB(), userSession, this.A04, this.A0C, this.A0B, A002, A004, user2.A03.getUsername());
            String str = this.A09;
            String str2 = this.A0A;
            A0N.A04 = str;
            A0N.A0B = str2;
            A0N.A0H = arrayList;
            if (C2K != null) {
                A0N.A0G = C2K;
            }
            A0N.A05();
        }
    }

    public final void DzM(C268374dH r14) {
        AnonymousClass4DU r2 = this.A04;
        UserSession userSession = this.A03;
        String A002 = A00(r14);
        String str = this.A0C;
        W3r.A0D(userSession, r2, r14, A002, (String) null, str);
        C249713kF.A00.A1A(this.A02.requireActivity(), userSession, str, r2.getModuleName(), r14.C2K());
    }

    public final void DzN(C268374dH r20) {
        C249713kF.A00.A16(this.A02.requireActivity(), this.A03, false, (Long) null, this.A04.getModuleName(), r20.C2K(), this.A0C, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false);
    }
}
