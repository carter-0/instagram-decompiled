package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.ShopManagementAccessState;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton;
import com.instagram.user.follow.FollowButtonBase;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

public final class WAH implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public WAH(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.A00 = i;
        this.A07 = obj8;
        this.A01 = obj;
        this.A05 = obj5;
        this.A08 = obj4;
        this.A02 = obj3;
        this.A04 = obj6;
        this.A06 = obj7;
        this.A03 = obj2;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onClick(View view) {
        Product product;
        C318136oS A002;
        0sL jaL;
        JZA jza;
        int i;
        int A052;
        int i2;
        switch (this.A00) {
            case 0:
                UserSession userSession = (UserSession) this.A02;
                Product product2 = (Product) this.A03;
                Fragment fragment = (Fragment) this.A06;
                C276544tV r2 = (C276544tV) this.A08;
                ((C2355830k) this.A01).A00();
                boolean z = !C323496xa.A00(userSession).A03(product2);
                ((View) this.A04).setSelected(z);
                ((C17852Vh5) this.A05).A00(z);
                C18591Vui A022 = C231132qv.A02(fragment.requireContext(), fragment.requireActivity(), userSession, (AnonymousClass4DU) this.A07, r2.A0I(), r2.A0G(), r2.A0J(), false).A02(1E7.A00(userSession).A02(r2.A0K(49)), product2, AnonymousClass3ZA.A00(product2.A0B));
                A022.A08 = r2.A0K(44);
                A022.A00();
                return;
            case 1:
                A052 = AnonymousClass0fD.A05(-537651189);
                C70712OHh oHh = (C70712OHh) this.A03;
                C277014uI r4 = oHh.A01;
                if (r4 != null) {
                    C307886Rw.A03((C307786Rm) this.A01, (C276544tV) this.A02, AnonymousClass6Tm.A01, r4);
                }
                C307786Rm r11 = (C307786Rm) this.A01;
                AnonymousClass32A r42 = new AnonymousClass32A(C308206Td.A07(r11), (UserSession) this.A08, new AnonymousClass328(C308206Td.A00(r11)));
                C67681MsJ msJ = (C67681MsJ) this.A04;
                C19508Wau wau = new C19508Wau(msJ);
                r42.A05 = new C16165Upq((Activity) C308206Td.A03(r11), (View) msJ.A03, (C230222pE) new C50895Fka(oHh, msJ, r11, (C276544tV) this.A02, (User) this.A07));
                0qQ.A0B(r11, 0);
                r42.A0C = (String) r11.A00(R.id.bloks_reel_tray_session_id);
                List list = (List) this.A06;
                r42.A05((Reel) this.A05, AnonymousClass3BQ.BLOKS, wau, (List) null, list, list);
                i2 = -293133081;
                break;
            case 2:
                int A053 = AnonymousClass0fD.A05(-167040035);
                X1Z x1z = (X1Z) this.A04;
                0qQ.A0A(view);
                ProductGroup productGroup = ((C17461VWo) this.A07).A00;
                if (productGroup != null) {
                    C18043VkR vkR = (C18043VkR) this.A06;
                    C19570Wbu wbu = (C19570Wbu) x1z;
                    switch (wbu.A00) {
                        case 0:
                            C15338Uan uan = ((UAC) wbu.A01).A02.A00;
                            IgdsInlineSearchBox igdsInlineSearchBox = uan.A04;
                            if (igdsInlineSearchBox != null) {
                                igdsInlineSearchBox.A03();
                            }
                            FragmentActivity requireActivity = uan.requireActivity();
                            UserSession A0l = AnonymousClass7TE.A0l(uan.A0N);
                            Product product3 = (Product) productGroup.A00().get(0);
                            List list2 = product3.A0O;
                            if (list2 != null) {
                                new W27(requireActivity, A0l, false);
                                HashMap hashMap = new HashMap();
                                if (list2.isEmpty()) {
                                    throw DbT.A0m();
                                } else if (list2.isEmpty()) {
                                    throw DbT.A0m();
                                } else {
                                    list2.size();
                                    hashMap.size();
                                }
                            }
                            uan.A0M.A02.A00(vkR, product3);
                            DbS.A1D(uan);
                            break;
                        case 1:
                            C14780U8q A0X = C13990Tnq.A0X((C15341Uar) wbu.A01);
                            List A003 = productGroup.A00();
                            0qQ.A07(A003);
                            Product product4 = (Product) 00k.A0I(A003);
                            0qQ.A0A(product4);
                            String str = A0X.A05;
                            if (str == null || 0qQ.A0K(C13989Tnp.A0q(product4), str)) {
                                if (C13989Tnp.A0c(A0X.A01).A05.contains(vkR.A01())) {
                                    A0X.A01(vkR, product4);
                                    break;
                                } else {
                                    A002 = C318116oQ.A00(A0X);
                                    jaL = new C59845JaL(productGroup, vkR, A0X, (AnonymousClass4D7) null, 16);
                                }
                            } else {
                                A002 = C318116oQ.A00(A0X);
                                jaL = new MG5(A0X, (AnonymousClass4D7) null, 9);
                            }
                            AnonymousClass7TE.A1Z(jaL, A002);
                            break;
                        case 2:
                            C15334Uaj uaj = (C15334Uaj) wbu.A01;
                            uaj.requireActivity().setResult(1002);
                            ShopManagementAccessState Bti = AnonymousClass0t1.A01.A01(AnonymousClass7TE.A0l(uaj.A0G)).A03.Bti();
                            if (Bti == null) {
                                Bti = ShopManagementAccessState.A07;
                            }
                            ShopManagementAccessState shopManagementAccessState = ShopManagementAccessState.ADD_HIDE_UNIFIED_INVENTORY;
                            C14770U8g A004 = C15334Uaj.A00(uaj);
                            if (Bti == shopManagementAccessState) {
                                Object A13 = AnonymousClass7TE.A13(productGroup.A00());
                                0qQ.A07(A13);
                                product = (Product) A13;
                            } else if (!A004.A00.contains(vkR.A01())) {
                                boolean z2 = !C13989Tnp.A0c(A004.A01).A05.contains(vkR.A01());
                                List A005 = productGroup.A00();
                                0qQ.A07(A005);
                                product = (Product) 00k.A0I(A005);
                                if (z2) {
                                    C16221Uqk uqk = A004.A04;
                                    0qQ.A0A(product);
                                    uqk.A01(vkR, product);
                                    AnonymousClass7TE.A1Z(new C59845JaL(productGroup, vkR, A004, (AnonymousClass4D7) null, 17), C318116oQ.A00(A004));
                                    break;
                                } else {
                                    0qQ.A0A(product);
                                }
                            }
                            A004.A00((ProductGroup) null, vkR, product);
                            break;
                        default:
                            C15333Uai uai = (C15333Uai) wbu.A01;
                            uai.requireActivity().setResult(1002);
                            Object obj = productGroup.A00().get(0);
                            0qQ.A07(obj);
                            ((C14781U8r) uai.A0A.getValue()).A01(vkR, (Product) obj, false);
                            break;
                    }
                    C53290Glc glc = (C53290Glc) this.A01;
                    if (!(glc == null || (jza = (JZA) this.A02) == null)) {
                        AutoWidthToggleButton autoWidthToggleButton = ((C14823UBc) this.A05).A06;
                        Context context = (Context) this.A03;
                        if (jza.A02) {
                            i = glc.A02;
                        } else {
                            i = glc.A01;
                        }
                        2eQ.A07(autoWidthToggleButton, DbW.A0h(context, ((Product) this.A08).A0J, i));
                    }
                    AnonymousClass0fD.A0C(-1228817004, A053);
                    return;
                }
                IllegalStateException A0y = AnonymousClass7TE.A0y();
                AnonymousClass0fD.A0C(492608633, A053);
                throw A0y;
            default:
                A052 = AnonymousClass0fD.A05(-613678532);
                User user = (User) this.A07;
                if (user.CPV()) {
                    FH6.A02((Activity) this.A01, (UserSession) this.A08, (FollowButtonBase) this.A05, (C243853aD) this.A04, user, ((AnonymousClass0iw) this.A02).getModuleName());
                } else {
                    C267064at r3 = (C267064at) this.A06;
                    UserSession userSession2 = (UserSession) this.A08;
                    0qQ.A0B(userSession2, 0);
                    if (AnonymousClass2f1.A00(userSession2).A0N(user) == FollowStatus.A05) {
                        Activity activity = (Activity) this.A01;
                        if (activity != null) {
                            1pE A012 = 1pE.A01(activity, (AnonymousClass0iw) this.A02, userSession2, C273654mx.A00(3026));
                            A012.A0B = new C291175gg(AnonymousClass7TE.A1I(new PendingRecipient(user)));
                            A012.A06();
                            ((C243853aD) this.A04).D2p(user);
                        }
                    } else {
                        r3.A04((0xF) null, userSession2, (1Xj) null, (AnonymousClass3W1) null, (SearchContext) null, (C243853aD) this.A04, user, (C249763kK) null, (Double) null, (String) null);
                    }
                }
                i2 = -1214963821;
                break;
        }
        AnonymousClass0fD.A0C(i2, A052);
    }
}
