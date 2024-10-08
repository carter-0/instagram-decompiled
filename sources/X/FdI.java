package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.user.model.User;

public final class FdI implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdI(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.A00 = i;
        this.A03 = obj6;
        this.A06 = obj3;
        this.A05 = obj5;
        this.A02 = obj2;
        this.A04 = obj;
        this.A01 = obj4;
    }

    public static void A00(0Aj r2, FdI fdI, String str) {
        r2.AAJ("event", str);
        r2.A8M((C54669HOa) fdI.A04, "project");
        r2.A8M((EZb) fdI.A05, "screen");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onButtonClick(android.view.View r7) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0021;
                case 1: goto L_0x006f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r6.A01
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.Object r0 = r6.A03
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r2 = r6.A06
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r3 = r6.A02
            com.instagram.save.model.SavedCollection r3 = (com.instagram.save.model.SavedCollection) r3
            java.lang.Object r5 = r6.A04
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r4 = r6.A05
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            X.C56669I6y.A03(r0, r1, r2, r3, r4, r5)
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r1 = r6.A06
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.CLIPS
            java.lang.String r4 = "fail"
            if (r1 != r0) goto L_0x005c
            java.lang.Object r3 = r6.A02
            X.05G r3 = (X.05G) r3
            X.7c0 r2 = X.C334867c0.A00
        L_0x002f:
            r3.Epw(r2)
            java.lang.String r2 = "success"
        L_0x0034:
            java.lang.Object r1 = r6.A03
            X.0wc r1 = (X.0wc) r1
            java.lang.String r0 = "ig_creator_connections_events"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = "click"
            A00(r1, r6, r0)
            java.lang.String r0 = "status"
            r1.AAJ(r0, r2)
            r1.Cgf()
            boolean r0 = r2.equals(r4)
            if (r0 == 0) goto L_0x0020
            r0 = 2530(0x9e2, float:3.545E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x005c:
            com.instagram.model.mediatype.ProductType r0 = com.instagram.model.mediatype.ProductType.FEED
            if (r1 != r0) goto L_0x006d
            java.lang.Object r3 = r6.A02
            X.05G r3 = (X.05G) r3
            java.lang.Object r1 = r6.A01
            r0 = 2
            X.9IK r2 = new X.9IK
            r2.<init>((java.lang.Object) r1, (int) r0)
            goto L_0x002f
        L_0x006d:
            r2 = r4
            goto L_0x0034
        L_0x006f:
            r5 = 0
            X.0qQ.A0B(r7, r5)
            java.lang.Object r1 = r6.A03
            X.0r1 r1 = (X.0r1) r1
            r0 = 1
            r1.A00 = r0
            java.lang.Object r3 = r6.A06
            com.instagram.common.session.UserSession r3 = (com.instagram.common.session.UserSession) r3
            java.lang.Object r4 = r6.A05
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.String r0 = r4.getId()
            java.util.List r2 = X.AnonymousClass7TE.A1I(r0)
            X.FSS r1 = X.FSS.A00
            X.FRw r0 = X.C50164FRw.A00
            X.F5s.A00(r0, r1, r3, r2, r5)
            java.lang.Object r1 = r6.A02
            X.0iw r1 = (X.AnonymousClass0iw) r1
            java.lang.Object r0 = r6.A04
            android.content.Context r0 = (android.content.Context) r0
            X.C49966FGz.A02(r0, r1, r3, r4, r5)
            java.lang.Object r3 = r6.A01
            X.FEU r3 = (X.FEU) r3
            java.lang.String r2 = r4.getId()
            X.0Aj r1 = X.FEU.A00(r3)
            X.EZg r0 = X.C48138EZg.UNDO_TOAST
            X.Dbb.A18(r0, r1)
            java.lang.String r0 = "target_user_id"
            r1.AAJ(r0, r2)
            X.FEU.A01(r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FdI.onButtonClick(android.view.View):void");
    }

    public final void onDismiss() {
        0Aj r6;
        int i;
        Drawable drawable;
        switch (this.A00) {
            case 0:
                r6 = AnonymousClass7TE.A0e((0wc) this.A03, "ig_creator_connections_events");
                A00(r6, this, "dismiss");
                r6.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, RealtimeConstants.SEND_SUCCESS);
                break;
            case 1:
                0r1 r1 = (0r1) this.A03;
                if (r1.A00) {
                    r1.A00 = false;
                    return;
                }
                FEU feu = (FEU) this.A01;
                User user = (User) this.A05;
                String id = user.getId();
                0Aj A0e = AnonymousClass7TE.A0e(feu.A00, "auto_confirm_action");
                A0e.A8M(C48138EZg.UNDO_TOAST, "format");
                A0e.A8M(C48139EZh.DISMISSED, "action");
                A0e.AAJ("target_user_id", id);
                A0e.AAJ("module", feu.A01);
                A0e.Cgf();
                C49966FGz fGz = C49966FGz.A00;
                UserSession userSession = (UserSession) this.A06;
                AnonymousClass0iw r11 = (AnonymousClass0iw) this.A02;
                String id2 = user.getId();
                Context context = (Context) this.A04;
                FEU feu2 = new FEU(r11, userSession);
                if (C49966FGz.A05(userSession)) {
                    int A002 = C49966FGz.A00(userSession, fGz);
                    1AA A022 = 182.A02(userSession, 36609682756212631L);
                    if (A022 != null) {
                        i = (int) A022.BOa(0Tu.A04, 36609682756212631L);
                    } else {
                        i = 0;
                    }
                    if (A002 == i && (drawable = context.getDrawable(R.drawable.ig_illustrations_qp_auto_confirm_follow_refresh)) != null) {
                        F3t f3t = new F3t(context);
                        f3t.A03(drawable);
                        f3t.A05 = AnonymousClass05K.A01;
                        f3t.A06 = AnonymousClass7TE.A16(context, 2131953340);
                        f3t.A04 = AnonymousClass7TE.A16(context, 2131953341);
                        f3t.A02(new C49999FIk(feu2, r11, context, userSession, id2, 2), AnonymousClass7TE.A16(context, 2131953342));
                        String A16 = AnonymousClass7TE.A16(context, 2131953343);
                        C50022FJh fJh = new C50022FJh(id2, (Object) feu2, 6);
                        f3t.A07 = A16;
                        f3t.A00 = fJh;
                        AnonymousClass0fN.A00(f3t.A00());
                        r6 = AnonymousClass7TE.A0e(feu2.A00, "auto_confirm_action");
                        r6.A8M(C48138EZg.SYSTEM_DIALOG, "format");
                        r6.A8M(C48139EZh.IMPRESSION, "action");
                        r6.AAJ("target_user_id", id2);
                        r6.AAJ("module", feu2.A01);
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        r6.Cgf();
    }

    public final void onShow() {
        0Aj r3;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                r3 = AnonymousClass7TE.A0e((0wc) this.A03, "ig_creator_connections_events");
                A00(r3, this, "impression");
                str = RealtimeConstants.SEND_SUCCESS;
                str2 = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS;
                break;
            case 1:
                FEU feu = (FEU) this.A01;
                String A0q = DbS.A0q(this.A05);
                r3 = FEU.A00(feu);
                Dbb.A1A(C48138EZg.UNDO_TOAST, r3);
                r3.AAJ("target_user_id", A0q);
                str = feu.A01;
                str2 = "module";
                break;
            default:
                return;
        }
        r3.AAJ(str2, str);
        r3.Cgf();
    }
}
