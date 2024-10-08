package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.Ufq  reason: case insensitive filesystem */
public final class C15624Ufq extends 1P0 {
    public final AnonymousClass0eM A00;
    public final boolean A01;
    public final /* synthetic */ C243373Ym A02;
    public final /* synthetic */ C18591Vui A03;
    public final /* synthetic */ C231142qw A04;

    public C15624Ufq(C243373Ym r3, C18591Vui vui, C231142qw r5) {
        this.A02 = r3;
        this.A03 = vui;
        this.A04 = r5;
        this.A01 = AnonymousClass7TF.A1W(r3, C243373Ym.SAVED);
        this.A00 = AnonymousClass0eN.A01(new C20704Wxb(21, r5, this, vui));
    }

    private final void A00(Integer num) {
        1Ng A002 = AnonymousClass1Nd.A00(this.A04.A02);
        C243373Ym r3 = this.A02;
        C18591Vui vui = this.A03;
        String BpP = vui.A0D.BpP();
        0qQ.A07(BpP);
        A002.A00(new WQP(r3, num, BpP, vui.A08));
    }

    public final void onFail(C268654dm r13) {
        int A032 = AnonymousClass0fD.A03(848736163);
        int A033 = AnonymousClass0fD.A03(315323072);
        C231142qw r4 = this.A04;
        I6V.A01(r4.A01, r4.A00.getResources().getString(2131972557), this.A01);
        C231152qx r11 = r4.A04;
        C18591Vui vui = this.A03;
        AnonymousClass3ZL r7 = vui.A0D;
        String BpP = r7.BpP();
        0qQ.A07(BpP);
        String str = vui.A0F;
        boolean z = vui.A0I;
        String str2 = vui.A08;
        0Aj A0e = AnonymousClass7TE.A0e(r11.A01, "instagram_shopping_product_save_client_failure");
        C263944Ny r3 = null;
        if (A0e.isSampled()) {
            C13988Tno.A17(A0e, C231152qx.A02(r11, str2));
            0bb r2 = new 0bb();
            r2.A05("product_id", DbV.A0q(BpP));
            if (str != null) {
                r3 = C263944Ny.A00(str);
            }
            r2.A09(r3);
            r2.A03("is_checkout_enabled", Boolean.valueOf(z));
            A0e.AAK(r2, "product_info");
            A0e.Cgf();
        }
        Integer num = AnonymousClass05K.A01;
        0qQ.A07(r7.BpP());
        A00(num);
        AnonymousClass0fD.A0A(-1883985807, A033);
        AnonymousClass0fD.A0A(-704266627, A032);
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(2002784249, AnonymousClass0fD.A03(2075895252));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        ExtendedImageUrl extendedImageUrl;
        int A032 = AnonymousClass0fD.A03(978962143);
        int A033 = AnonymousClass0fD.A03(-1877511923);
        int A034 = AnonymousClass0fD.A03(664449274);
        C18591Vui vui = this.A03;
        if (vui.A09) {
            ImageInfo imageInfo = vui.A0C;
            if (imageInfo != null) {
                extendedImageUrl = 1iI.A01(this.A04.A01, imageInfo);
            } else {
                extendedImageUrl = null;
            }
            C231142qw r9 = this.A04;
            boolean A1a = C51966G9m.A1a(r9.A03.getModuleName(), "instagram_shopping_save_product_collection");
            int i = 2131969881;
            if (this.A01) {
                i = 2131969823;
            }
            if (vui.A0A) {
                FragmentActivity fragmentActivity = r9.A01;
                MVB mvb = (MVB) this.A00.getValue();
                Integer num = r9.A05;
                C310336ap r4 = new C310336ap();
                r4.A0D = AnonymousClass7TF.A0e(fragmentActivity.getResources(), fragmentActivity.getResources().getString(2131972557), i);
                r4.A0O = true;
                if (extendedImageUrl != null) {
                    r4.A09 = extendedImageUrl;
                    r4.A03();
                }
                if (A1a) {
                    r4.A0L = true;
                    0qQ.A0A(mvb);
                    r4.A0A(mvb);
                    r4.A0G = AnonymousClass7TF.A0d(fragmentActivity.getResources(), 2131952148);
                }
                if (num != null) {
                    r4.A02 = num.intValue();
                }
                I6V.A04(r4);
            }
            C231152qx r13 = r9.A04;
            AnonymousClass3ZL r92 = vui.A0D;
            String BpP = r92.BpP();
            0qQ.A07(BpP);
            String str = vui.A0F;
            boolean z = vui.A0I;
            String str2 = vui.A08;
            0Aj A0e = AnonymousClass7TE.A0e(r13.A01, "instagram_shopping_product_save_client_success");
            C263944Ny r3 = null;
            if (A0e.isSampled()) {
                C13988Tno.A17(A0e, C231152qx.A02(r13, str2));
                0bb r2 = new 0bb();
                r2.A05("product_id", DbV.A0q(BpP));
                if (str != null) {
                    r3 = C263944Ny.A00(str);
                }
                r2.A09(r3);
                r2.A03("is_checkout_enabled", Boolean.valueOf(z));
                A0e.AAK(r2, "product_info");
                A0e.Cgf();
            }
            Integer num2 = AnonymousClass05K.A00;
            0qQ.A07(r92.BpP());
            A00(num2);
        }
        AnonymousClass0fD.A0A(-1065895465, A034);
        AnonymousClass0fD.A0A(-496633943, A033);
        AnonymousClass0fD.A0A(811417144, A032);
    }

    public C15624Ufq() {
    }
}
