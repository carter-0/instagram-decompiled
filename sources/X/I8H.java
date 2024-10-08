package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class I8H implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public I8H(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass325 r9;
        String str;
        J74 j74;
        Context context;
        UserSession userSession;
        AnonymousClass07i r4;
        String str2;
        Object obj;
        int i2;
        Long l;
        DialogInterface dialogInterface2 = dialogInterface;
        switch (this.A00) {
            case 0:
                r9 = (AnonymousClass325) this.A02;
                context = r9.A00.requireContext();
                userSession = r9.A03;
                r4 = r9.A01;
                str = C51966G9m.A1E(this.A01);
                if (str != null) {
                    str2 = "media_options";
                    j74 = new J74(str2, r9, 9);
                    obj = this.A03;
                    i2 = 26;
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            case 1:
                LinkedHashMap A07 = C254423sS.A07((1Xj) this.A03);
                AnonymousClass325 r11 = (AnonymousClass325) this.A02;
                Object obj2 = this.A01;
                Iterator A0s = AnonymousClass7TF.A0s(A07);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    Object key = A1J.getKey();
                    ArrayList<C46292DTv> A1C = AnonymousClass7TE.A1C();
                    Iterator it = ((List) A1J.getValue()).iterator();
                    while (true) {
                        FeaturedProductPermissionStatus featuredProductPermissionStatus = null;
                        if (it.hasNext()) {
                            Object next = it.next();
                            C74546Pwf Bbg = ((C46292DTv) next).Bbg();
                            if (Bbg != null) {
                                featuredProductPermissionStatus = Bbg.BzM();
                            }
                            if (featuredProductPermissionStatus == FeaturedProductPermissionStatus.APPROVED) {
                                A1C.add(next);
                            }
                        } else {
                            for (C46292DTv dTv : A1C) {
                                Context requireContext = r11.A00.requireContext();
                                UserSession userSession2 = r11.A03;
                                AnonymousClass07i r2 = r11.A01;
                                C74546Pwf Bbg2 = dTv.Bbg();
                                if (Bbg2 != null) {
                                    l = Bbg2.BEY();
                                } else {
                                    l = null;
                                }
                                String valueOf = String.valueOf(l);
                                FeaturedProductPermissionStatus featuredProductPermissionStatus2 = FeaturedProductPermissionStatus.CANCELED;
                                C73963Pmh pmh = new C73963Pmh(obj2, r11, key, dTv, "media_options", 19);
                                C58210IoE ioE = new C58210IoE(dTv, r11, key, "media_options", 18);
                                AnonymousClass7TG.A1Q(r2, valueOf);
                                1ES.A00(requireContext, r2, C17059VGh.A00(userSession2, featuredProductPermissionStatus2, valueOf, ioE, pmh));
                            }
                            dialogInterface2.dismiss();
                        }
                    }
                }
                return;
            case 2:
                r9 = (AnonymousClass325) this.A02;
                context = r9.A00.requireContext();
                userSession = r9.A03;
                r4 = r9.A01;
                str = C51966G9m.A1E(this.A01);
                if (str != null) {
                    str2 = "media_options";
                    j74 = new J74(str2, r9, 10);
                    obj = this.A03;
                    i2 = 27;
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            case 3:
                LTM.A07((AnonymousClass0iw) this.A02, (UserSession) this.A03, "share_fundraiser_as_ig_story_click_ok", AnonymousClass000.A00(1554), (String) null, (Map) this.A01);
                return;
            case 4:
                C53081GiF.A01((C293505kq) this.A01, (AnonymousClass3Q2) this.A02, (C53081GiF) this.A03);
                return;
            case 5:
                C55087Hbw.A00((Fragment) this.A01, (UserSession) this.A03, (1Xj) this.A02);
                return;
            default:
                0qQ.A0B(dialogInterface2, 0);
                I4M i4m = (I4M) this.A03;
                if (i4m.A09) {
                    new C52810Gd2(i4m).start();
                }
                C55680Hld hld = i4m.A01;
                if (hld != null) {
                    Integer valueOf2 = Integer.valueOf(((0rk) this.A01).A00);
                    0Aj A0e = AnonymousClass7TE.A0e(hld.A01, "follow_prompt_denied");
                    DbW.A15(A0e, hld.A00);
                    C51974G9v.A0s(A0e, "dialog", (String) ((0rm) this.A02).A00);
                    A0e.A8k("num_facepiles", valueOf2);
                    A0e.Cgf();
                }
                dialogInterface2.dismiss();
                return;
        }
        C73673Phm phm = new C73673Phm(obj, r9, str2, i2);
        0qQ.A0B(r4, 2);
        1NY A0a = AnonymousClass7TG.A0a(userSession);
        C51968G9o.A1K(A0a, "commerce/community/featured_products/permission_remove/", str);
        1OC A0S = DbU.A0S(A0a, C43858CFy.class, D2Z.class);
        A0S.A00 = new C15625Ufr(15, phm, j74, userSession);
        1ES.A00(context, r4, A0S);
    }
}
