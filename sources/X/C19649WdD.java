package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.WdD  reason: case insensitive filesystem */
public final class C19649WdD implements C20983X7y {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final AnonymousClass4DU A03;
    public final VYZ A04;
    public final C17507VYl A05;
    public final Integer A06;
    public final String A07;
    public final String A08;

    public C19649WdD(FragmentActivity fragmentActivity, UserSession userSession, 2el r14, 1Xj r15, AnonymousClass4DU r16, AnonymousClass57K r17, Integer num, String str, String str2, String str3, String str4) {
        C51972G9s.A1C(userSession, r14);
        String str5 = str3;
        0qQ.A0B(str5, 7);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
        AnonymousClass4DU r5 = r16;
        this.A03 = r5;
        String str6 = str;
        this.A07 = str6;
        this.A08 = str5;
        this.A06 = num;
        this.A02 = r15;
        VYZ vyz = new VYZ(userSession, r15, r5, r17, str6, str2, str5, str4);
        this.A04 = vyz;
        this.A05 = new C17507VYl(userSession, r14, vyz, C51971G9r.A0s(r15));
    }

    public final void A8A(User user) {
        0qQ.A0B(user, 0);
        C17507VYl vYl = this.A05;
        C229932oe r6 = vYl.A01;
        String str = vYl.A03;
        String str2 = str;
        if (str == null) {
            str = "";
        }
        String A0i = 002.A0i("continue_shopping_row_impression_", str, "", '_');
        C60340gF r1 = C60340gF.A00;
        if (str2 == null) {
            str2 = "";
        }
        C13989Tnp.A1Q(vYl.A02, AnonymousClass30Y.A00(user, r1, 002.A0i("continue_shopping_row_impression_", str2, "", '_')), r6, A0i);
    }

    public final void D6L(User user) {
        String str;
        0qQ.A0B(user, 0);
        VYZ vyz = this.A04;
        0Aj A0e = AnonymousClass7TE.A0e(vyz.A03, "instagram_shopping_continue_shopping_row_tap");
        if (A0e.isSampled()) {
            C13988Tno.A17(A0e, vyz.A02);
            C13988Tno.A1A(A0e, AnonymousClass3ZA.A00(user));
            A0e.AAE((AnonymousClass0Ah) null, "marketer_id");
            A0e.AAK(vyz.A00, "collections_logging_info");
            A0e.AAK(vyz.A01, "feed_item_info");
            A0e.Cgf();
        }
        C249713kF r3 = C249713kF.A00;
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass4DU r7 = this.A03;
        String str2 = this.A08;
        String str3 = this.A07;
        if (3 - this.A06.intValue() != 0) {
            str = "shopping_product_collection_page";
        } else {
            str = "shopping_more_products";
        }
        String A002 = AnonymousClass3ZA.A00(user);
        0qQ.A0A(A002);
        String A0b = C13988Tno.A0b(user);
        0qQ.A0A(A0b);
        W2P A0N = r3.A0N(fragmentActivity, user.A03.BsB(), userSession, r7, str2, str3, str, A002, A0b);
        A0N.A0L = true;
        1Xj r32 = this.A02;
        A0N.A03 = r32;
        if (r32 != null && r32.BR7() == 1iA.A0a) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(AnonymousClass3YH.A01(r32, (User) null));
            A0N.A0H = arrayList;
        }
        A0N.A05();
    }

    public final void EBX(View view) {
        0qQ.A0B(view, 0);
        C17507VYl vYl = this.A05;
        C229932oe r4 = vYl.A01;
        String str = vYl.A03;
        if (str == null) {
            str = "";
        }
        vYl.A00.A05(view, r4.A00(002.A0i("continue_shopping_row_impression_", str, "", '_')));
    }
}
