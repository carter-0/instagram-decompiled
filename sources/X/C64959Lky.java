package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.Lky  reason: case insensitive filesystem */
public final class C64959Lky implements MXG {
    public static final String __redex_internal_original_name = "ShoppingStickerCreationController";
    public View A00;
    public final ViewStub A01;
    public final UserSession A02;
    public final AnonymousClass8MU A03;
    public final Set A04 = DbS.A0y();
    public final Context A05;

    public C64959Lky(ViewStub viewStub, UserSession userSession, AnonymousClass8MU r4) {
        0qQ.A0B(viewStub, 2);
        this.A02 = userSession;
        this.A01 = viewStub;
        this.A03 = r4;
        this.A05 = viewStub.getContext();
    }

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public final /* synthetic */ void close() {
    }

    public final boolean isScrolledToBottom() {
        return true;
    }

    public final boolean isScrolledToTop() {
        return true;
    }

    public final Set Acf() {
        return this.A04;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E0h() {
        /*
            r5 = this;
            android.view.View r0 = r5.A00
            if (r0 != 0) goto L_0x00b7
            android.view.ViewStub r0 = r5.A01
            android.view.View r1 = r0.inflate()
            java.util.Set r0 = r5.A04
            X.0qQ.A0A(r1)
            r0.add(r1)
            r5.A00 = r1
            X.0qQ.A0A(r1)
            r0 = 2131429534(0x7f0b089e, float:1.8480743E38)
            android.view.View r1 = r1.requireViewById(r0)
            r0 = 15
            X.LY0.A00(r1, r0, r5)
            com.instagram.common.session.UserSession r4 = r5.A02
            r2 = 0
            X.0eE r3 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r3.A01(r4)
            java.util.List r1 = r0.A0U()
            X.8qB r0 = X.C367098qB.STORY_MULTI_PRODUCT_STICKER
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00b8
            android.view.View r1 = r5.A00
            X.0qQ.A0A(r1)
            r0 = 2131436601(0x7f0b2439, float:1.8495077E38)
            android.view.View r2 = X.DbY.A0F(r1, r0)
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r1 = X.DbU.A0G(r2, r0)
            r0 = 2131973834(0x7f1356ca, float:1.9584715E38)
            r1.setText(r0)
            r0 = 16
        L_0x0053:
            X.LY0.A00(r2, r0, r5)
        L_0x0056:
            com.instagram.user.model.User r0 = r3.A01(r4)
            java.util.List r1 = r0.A0U()
            X.8qB r0 = X.C367098qB.STORY_PRODUCT_COLLECTION_STICKER
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0084
            android.view.View r1 = r5.A00
            X.0qQ.A0A(r1)
            r0 = 2131438268(0x7f0b2abc, float:1.8498458E38)
            android.view.View r2 = X.DbY.A0F(r1, r0)
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r1 = X.DbU.A0G(r2, r0)
            r0 = 2131973836(0x7f1356cc, float:1.958472E38)
            r1.setText(r0)
            r0 = 17
            X.LY0.A00(r2, r0, r5)
        L_0x0084:
            com.instagram.user.model.User r0 = r3.A01(r4)
            java.util.List r1 = r0.A0U()
            X.8qB r0 = X.C367098qB.STORY_STOREFRONT_STICKER
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00b7
            android.view.View r1 = r5.A00
            X.0qQ.A0A(r1)
            r0 = 2131441833(0x7f0b38a9, float:1.8505689E38)
            android.view.View r2 = X.DbY.A0F(r1, r0)
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r1 = X.DbU.A0G(r2, r0)
            r0 = 2131973838(0x7f1356ce, float:1.9584723E38)
            r1.setText(r0)
            r1 = 23
            X.WB8 r0 = new X.WB8
            r0.<init>((java.lang.Object) r5, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x00b7:
            return
        L_0x00b8:
            boolean r0 = X.C367088qA.A06(r4, r2)
            if (r0 == 0) goto L_0x0056
            android.view.View r1 = r5.A00
            X.0qQ.A0A(r1)
            r0 = 2131438295(0x7f0b2ad7, float:1.8498513E38)
            android.view.View r2 = X.DbY.A0F(r1, r0)
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.widget.TextView r1 = X.DbU.A0G(r2, r0)
            r0 = 2131973837(0x7f1356cd, float:1.9584721E38)
            r1.setText(r0)
            r0 = 18
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64959Lky.E0h():void");
    }

    public final String getModuleName() {
        return "shopping_sticker_creation";
    }
}
