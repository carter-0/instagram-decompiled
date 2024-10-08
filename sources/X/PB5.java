package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.concurrent.TimeUnit;

public final class PB5 implements AnonymousClass7D2 {
    public static final long A05 = TimeUnit.SECONDS.toMillis(3);
    public final UserSession A00;
    public final AnonymousClass7XR A01;
    public final C333467Zb A02;
    public final AnonymousClass7DZ A03;
    public final AnonymousClass9HC A04;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        C72574PBf pBf = new C72574PBf(DbU.A0A(layoutInflater, viewGroup, R.layout.direct_gif_message_with_big_heart, false));
        this.A03.A00(pBf);
        return pBf;
    }

    public static final void A00(Context context, PB5 pb5, C72574PBf pBf, GifUrlImpl gifUrlImpl, String str, String str2) {
        AnonymousClass9HC r1 = pb5.A04;
        if (!AnonymousClass7TF.A1Z(r1.A1K)) {
            pBf.A04.post(new C73219PYx(C70049NwR.A00(context, pb5.A00, new GifUrlImpl(str, gifUrlImpl.A03.floatValue(), gifUrlImpl.A02.floatValue()), (Integer) null, str2), pBf));
            return;
        }
        C73401Pby pby = new C73401Pby(context, pb5, pBf, gifUrlImpl, str, str2);
        pBf.A02 = pby;
        pBf.A04.postDelayed(pby, AnonymousClass7TE.A0R(r1.A0I.getValue()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void ADp(X.C328007Db r21, X.AnonymousClass7FW r22) {
        /*
            r20 = this;
            r6 = r22
            r11 = r21
            X.PBf r11 = (X.C72574PBf) r11
            X.7Fv r6 = (X.C328707Fv) r6
            r5 = 0
            boolean r7 = X.AnonymousClass7TF.A1U(r5, r11, r6)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout r4 = r11.A07
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0141
            X.0qQ.A0B(r4, r5)
            r2 = 4597416525137651073(0x3fcd4df8b1572581, double:0.228942)
        L_0x001b:
            X.AnonymousClass7PV.A03(r4, r2)
        L_0x001e:
            com.instagram.model.direct.messageid.DirectMessageIdentifier r3 = r6.A01
            java.lang.String r8 = r3.A00
            r10 = r20
            if (r8 == 0) goto L_0x0031
            X.7XR r1 = r10.A01
            X.7TJ r1 = (X.AnonymousClass7TJ) r1
            boolean r0 = r6.CU2()
            r1.CjC(r8, r0)
        L_0x0031:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r11.A04
            java.lang.Object r0 = r2.getTag()
            if (r8 == 0) goto L_0x0045
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0045
        L_0x003f:
            X.7DZ r0 = r10.A03
            r0.A02(r11, r6)
            return
        L_0x0045:
            r2.setTag(r8)
            r2.A09()
            com.instagram.model.mediasize.GifUrlImpl r12 = r6.A02
            r1 = 8
            if (r12 != 0) goto L_0x0055
            r4.setVisibility(r1)
            goto L_0x003f
        L_0x0055:
            java.lang.String r0 = r12.A09
            int r8 = r0.length()
            if (r8 != 0) goto L_0x0064
            java.lang.String r9 = "GifContentDefinition"
            java.lang.String r8 = "url is empty"
            X.0wb.A03(r9, r8)
        L_0x0064:
            android.content.Context r9 = r2.getContext()
            java.lang.String r13 = r3.A01
            boolean r8 = android.webkit.URLUtil.isContentUrl(r0)
            if (r8 == 0) goto L_0x0103
            X.0qQ.A0A(r9)
            com.instagram.common.session.UserSession r8 = r10.A00
            X.MYd r8 = X.AnonymousClass6FA.A00(r8)
            java.lang.String r18 = r8.A00(r0)
            if (r18 != 0) goto L_0x00fc
            r8.A01(r0)
            X.OKi r8 = r11.A01
            if (r8 == 0) goto L_0x0089
            r8.A00()
        L_0x0089:
            X.O6r r8 = r11.A00
            if (r8 == 0) goto L_0x0092
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.A00
            r8.set(r7)
        L_0x0092:
            r7 = 0
            r11.A01 = r7
            r11.A00 = r7
            X.7XR r7 = r10.A01
            X.7Wn r7 = (X.C332827Wn) r7
            X.P9B r8 = new X.P9B
            r8.<init>(r9, r10, r11, r12, r13)
            X.OKi r0 = r7.CgK(r8, r0)
            r11.A01 = r0
        L_0x00a6:
            java.lang.String r7 = r6.A03
            if (r7 == 0) goto L_0x00ba
            int r0 = r7.length()
            if (r0 == 0) goto L_0x00ba
            r0 = 2131959121(0x7f131d51, float:1.9554873E38)
            java.lang.String r0 = X.DbW.A0h(r9, r7, r0)
            r2.setContentDescription(r0)
        L_0x00ba:
            r4.setVisibility(r5)
            float r0 = X.C69826Nsn.A00(r12)
            r4.A00 = r0
            X.3oV r2 = r11.A06
            boolean r0 = r6.A05
            if (r0 == 0) goto L_0x00ca
            r1 = 0
        L_0x00ca:
            r2.setVisibility(r1)
            X.7FE r0 = r6.A00
            int r0 = X.C3265577g.A00(r0)
            r4.setRadius(r0)
            X.7Zb r1 = r10.A02
            boolean r0 = r6.A06
            boolean r0 = r1.Et8(r3, r0)
            X.3oV r2 = r11.A05
            if (r0 == 0) goto L_0x0130
            android.view.View r0 = r2.getView()
            android.view.View[] r0 = new android.view.View[]{r0}
            X.C294975nL.A07(r0, r5)
            r1.DI4(r3)
            java.lang.Runnable r2 = r11.A08
            r4.removeCallbacks(r2)
            long r0 = A05
            r4.postDelayed(r2, r0)
            goto L_0x003f
        L_0x00fc:
            r14 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            goto L_0x0129
        L_0x0103:
            java.lang.String r8 = "msys://ae-media"
            boolean r7 = X.C66580MXl.A1a(r8, r7, r0)
            if (r7 == 0) goto L_0x011e
            X.0qQ.A0A(r9)
            X.7XR r7 = r10.A01
            X.7X5 r7 = (X.AnonymousClass7X5) r7
            X.P93 r8 = new X.P93
            r8.<init>(r9, r10, r11, r12, r13)
            X.O6r r0 = r7.Cg8(r8, r0)
            r11.A00 = r0
            goto L_0x00a6
        L_0x011e:
            X.0qQ.A0A(r9)
            r14 = r9
            r15 = r10
            r16 = r11
            r17 = r12
            r18 = r0
        L_0x0129:
            r19 = r13
            A00(r14, r15, r16, r17, r18, r19)
            goto L_0x00a6
        L_0x0130:
            int r1 = r2.CFV()
            r0 = 8
            if (r1 == r0) goto L_0x003f
            android.view.View r0 = r2.getView()
            X.AnonymousClass7TE.A1U(r0, r5)
            goto L_0x003f
        L_0x0141:
            com.instagram.model.mediasize.GifUrlImpl r2 = r6.A02
            if (r2 == 0) goto L_0x0166
            java.lang.Float r0 = r2.A03
            float r1 = r0.floatValue()
            java.lang.Float r0 = r2.A02
            float r0 = r0.floatValue()
            float r1 = r1 / r0
            X.0qQ.A0B(r4, r5)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x015d
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x015d:
            double r2 = (double) r1
            r0 = 4604579338215397261(0x3fe6c083126e978d, double:0.711)
            double r2 = r2 * r0
            goto L_0x001b
        L_0x0166:
            X.AnonymousClass7PV.A01(r4)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PB5.ADp(X.7Db, X.7FW):void");
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r4) {
        C72574PBf pBf = (C72574PBf) r4;
        0qQ.A0B(pBf, 0);
        IgImageView igImageView = pBf.A04;
        igImageView.setTag((Object) null);
        Runnable runnable = pBf.A02;
        if (runnable != null) {
            igImageView.removeCallbacks(runnable);
        }
        pBf.A02 = null;
        pBf.A07.removeCallbacks(pBf.A08);
        C70762OKi oKi = pBf.A01;
        if (oKi != null) {
            oKi.A00();
        }
        C70440O6r o6r = pBf.A00;
        if (o6r != null) {
            o6r.A00.set(true);
        }
        pBf.A01 = null;
        pBf.A00 = null;
        this.A03.A01(pBf);
    }

    public PB5(UserSession userSession, AnonymousClass7XR r2, C333467Zb r3, AnonymousClass9HC r4, AnonymousClass7DZ r5) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r5;
        this.A04 = r4;
    }
}
