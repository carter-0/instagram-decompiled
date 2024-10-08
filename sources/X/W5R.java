package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.follow.BlockButton;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;

public final class W5R implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public W5R(DialogInterface.OnDismissListener onDismissListener, 0hq r2, C19200WPg wPg, int i) {
        this.A00 = i;
        this.A03 = wPg;
        if (5 - i != 0) {
            this.A01 = r2;
            this.A02 = onDismissListener;
        } else {
            this.A02 = r2;
            this.A01 = onDismissListener;
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity;
        int i2;
        String str;
        1Xj r5;
        1Xj r52;
        Object obj;
        switch (this.A00) {
            case 0:
                C276544tV r3 = (C276544tV) this.A02;
                C277014uI A09 = r3.A09();
                if (A09 != null) {
                    Dbc.A0t((C307896Rx) this.A03, A09, r3, this.A01);
                    return;
                }
                return;
            case 1:
                C18080Vl9 vl9 = new C18080Vl9((Context) this.A01);
                try {
                    vl9.A01.A0C = ((C18550Vu2) this.A03).A00.A0F(this.A02);
                } catch (IOException e) {
                    StringWriter stringWriter = new StringWriter();
                    e.printStackTrace(new PrintWriter(stringWriter));
                    vl9.A01.A0C = stringWriter.toString();
                }
                AnonymousClass0fN.A00(vl9.A00());
                return;
            case 2:
                W38.A06((Activity) this.A01, (Integer) this.A03);
                X8Y x8y = (X8Y) this.A02;
                if (x8y != null) {
                    x8y.DZN();
                    return;
                }
                return;
            case 3:
                F74.A00(((C19799Wfg) this.A01).A01, ((C17678Vc9) this.A02).A07, AnonymousClass05K.A03);
                V43 v43 = (V43) this.A03;
                XAC xac = v43.A05;
                String obj2 = V1b.SHOW_LOADER.toString();
                C19797Wfe wfe = (C19797Wfe) xac;
                int i3 = wfe.A00;
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < wfe.A03.size()) {
                    if (!((C17678Vc9) wfe.A03.get(i5)).A08.equals(obj2)) {
                        i5++;
                    } else {
                        Object obj3 = v43;
                        while (i4 < wfe.A03.size()) {
                            C17678Vc9 vc9 = (C17678Vc9) wfe.A03.get(i4);
                            if (vc9.A08.equals(obj2)) {
                                C17678Vc9 vc92 = wfe.A01;
                                Object obj4 = obj3;
                                if (vc92 != null) {
                                    obj4 = vc92.A03.DTf(vc9, obj3, 1);
                                }
                                if (i3 != -1 && !((C17678Vc9) wfe.A03.get(i3)).A06) {
                                    wfe.A04.push(Integer.valueOf(i3));
                                }
                                wfe.A00 = i4;
                                wfe.A01 = vc9;
                                Object DTf = vc9.A02.DTf(vc9, obj4, 1);
                                wfe.A02 = DTf;
                                i4 = wfe.A03.size();
                                obj = DTf;
                            } else {
                                obj = obj3;
                            }
                            i4++;
                            obj3 = obj;
                        }
                        return;
                    }
                }
                throw Pxg.A0e("Step '", obj2, "' not in remaining flow steps.");
            case 4:
                C19201WPh wPh = (C19201WPh) this.A03;
                AnonymousClass7TE.A1Z(new MH5(this.A01, wPh, this.A02, (AnonymousClass4D7) null, 27), AnonymousClass07a.A00(wPh.A06));
                return;
            case 5:
                C19200WPg wPg = (C19200WPg) this.A03;
                C255773uh r2 = wPg.A0A;
                if (r2.A0e != C250963mL.MEDIA || (r5 = r2.A0b) == null) {
                    activity = wPg.A01;
                    i2 = 2131971554;
                    str = "reel_media_hard_delete_failed";
                    break;
                } else {
                    new C18070Vkx(wPg.A01, (0hq) this.A02, wPg.A07, r5).A04((DialogInterface.OnDismissListener) this.A01);
                    return;
                }
            case 6:
                C19200WPg wPg2 = (C19200WPg) this.A03;
                C255773uh r22 = wPg2.A0A;
                if (r22.A0e != C250963mL.MEDIA || (r52 = r22.A0b) == null) {
                    activity = wPg2.A01;
                    i2 = 2131971555;
                    str = "reel_media_recover_failed";
                    break;
                } else {
                    new C18070Vkx(wPg2.A01, (0hq) this.A01, wPg2.A07, r52).A04((DialogInterface.OnDismissListener) this.A02);
                    return;
                }
            case 7:
                UserSession userSession = ((C17782Vft) this.A03).A00;
                Product product = (Product) this.A02;
                1NY A0a = AnonymousClass7TG.A0a(userSession);
                A0a.A0A("commerce/reconsideration/dismiss_recently_viewed_product/");
                DbX.A1M(A0a, "product_id", product.A0H);
                1OC A0M = A0a.A0M();
                C15619Ufl.A00(A0M, product, userSession, 19);
                1ES.A03(A0M);
                ((X52) this.A01).Dbi(product);
                C64835Lix A002 = C63446KxB.A00(userSession, false);
                0qQ.A0B(A002, 2);
                A002.A0I(C16679UzF.RECENTLY_VIEWED, product);
                return;
            case 8:
                ((C14781U8r) ((C15333Uai) this.A03).A0A.getValue()).A01((C18043VkR) this.A01, (Product) this.A02, true);
                return;
            case 9:
                BlockButton blockButton = (BlockButton) this.A03;
                User user = (User) this.A02;
                BlockButton.A00((C15395Uby) this.A01, blockButton, user);
                BlockButton.A02(blockButton, user);
                return;
            default:
                Object obj5 = this.A01;
                if (obj5 != null) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(obj5);
                    ((C18756Vzr) this.A03).A03.A01(AnonymousClass05K.A01, (Integer) this.A02, hashSet);
                    return;
                }
                C18756Vzr vzr = (C18756Vzr) this.A03;
                vzr.A03.A01(AnonymousClass05K.A01, (Integer) this.A02, new HashSet(C13990Tnq.A0L(vzr.A02.A06.A00)));
                return;
        }
        C59689JTv.A0F(activity, str, i2);
    }

    public W5R(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj3;
        this.A02 = obj2;
    }
}
