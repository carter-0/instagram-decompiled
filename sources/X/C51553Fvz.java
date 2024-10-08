package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.Fvz  reason: case insensitive filesystem */
public final class C51553Fvz implements Runnable {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ XIGIGBoostDestination A03;
    public final /* synthetic */ 1Yh A04;
    public final /* synthetic */ AnonymousClass0iw A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ ImageUrl A07;
    public final /* synthetic */ Integer A08;
    public final /* synthetic */ boolean A09;

    public C51553Fvz(Intent intent, Bundle bundle, FragmentActivity fragmentActivity, XIGIGBoostDestination xIGIGBoostDestination, 1Yh r5, AnonymousClass0iw r6, UserSession userSession, ImageUrl imageUrl, Integer num, boolean z) {
        this.A08 = num;
        this.A06 = userSession;
        this.A02 = fragmentActivity;
        this.A07 = imageUrl;
        this.A05 = r6;
        this.A03 = xIGIGBoostDestination;
        this.A09 = z;
        this.A04 = r5;
        this.A00 = intent;
        this.A01 = bundle;
    }

    public final void run() {
        int i;
        ImageUrl imageUrl;
        Dialog A022;
        Integer num = this.A08;
        Integer num2 = AnonymousClass05K.A01;
        UserSession userSession = this.A06;
        if (num == num2) {
            WGU.A00(userSession).A0H(C16678UzE.SUCCESS_DIALOG, "customize_button_of_success_dialog");
            FragmentActivity fragmentActivity = this.A02;
            C358248ab A0X = DbS.A0X(fragmentActivity);
            A0X.A09(2131970235);
            A0X.A08(2131970233);
            String string = fragmentActivity.getString(2131970231);
            IgdsHeadline igdsHeadline = A0X.A0Z;
            igdsHeadline.setDetailText((CharSequence) string);
            igdsHeadline.setVisibility(0);
            A0X.A09 = true;
            A0X.A0I(new C50024FJj(3, (Object) this.A01, (Object) userSession, (Object) this.A03, (Object) fragmentActivity), 2131970229);
            A0X.A0H((DialogInterface.OnClickListener) null, 2131970371);
            A0X.A0h((Bitmap) null, this.A05, this.A07);
            A022 = A0X.A02();
        } else {
            XIGIGBoostDestination xIGIGBoostDestination = this.A03;
            boolean z = this.A09;
            if (DbT.A0j(userSession).isVerified() || xIGIGBoostDestination == XIGIGBoostDestination.DIRECT_MESSAGE || xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE || !z || !182.A06(0Tu.A05, userSession, 36317427414209668L)) {
                boolean z2 = true;
                if (!this.A00.getBooleanExtra("is_ab_test", false)) {
                    z2 = false;
                }
                C358248ab A0X2 = DbS.A0X(this.A02);
                A0X2.A09(2131970641);
                if (z2) {
                    i = 2131970639;
                } else {
                    i = 2131970638;
                    if (C18803W2r.A03(userSession)) {
                        i = 2131970640;
                    }
                }
                A0X2.A08(i);
                A0X2.A06();
                if (z2) {
                    imageUrl = null;
                } else {
                    imageUrl = this.A07;
                }
                A0X2.A0h((Bitmap) null, this.A05, imageUrl);
                A022 = A0X2.A02();
            } else {
                FragmentActivity fragmentActivity2 = this.A02;
                AnonymousClass0iw r3 = this.A05;
                ImageUrl imageUrl2 = this.A07;
                1vm.A01(userSession).ATL((2Kw) null, FSX.A00, new PandoGraphQLRequest(C41845B3m.A05(), "IGNMEBoostUpsellLogImpressionMutation", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43405Bxh.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, AnonymousClass000.A00(4243), AnonymousClass7TE.A1C()));
                WGU.A00(userSession).A0H(C16678UzE.SUCCESS_DIALOG, "meta_verified_success_dialog");
                C358248ab A0X3 = DbS.A0X(fragmentActivity2);
                A0X3.A09(2131970236);
                A0X3.A08(2131970234);
                String string2 = fragmentActivity2.getString(2131970232);
                IgdsHeadline igdsHeadline2 = A0X3.A0Z;
                igdsHeadline2.setDetailText((CharSequence) string2);
                igdsHeadline2.setVisibility(0);
                A0X3.A09 = true;
                A0X3.A0I(new C50026FJl(fragmentActivity2, r3, userSession, 10), 2131970230);
                A0X3.A0H((DialogInterface.OnClickListener) null, 2131970371);
                A0X3.A0h((Bitmap) null, r3, imageUrl2);
                A022 = A0X3.A02();
            }
        }
        AnonymousClass0fN.A00(A022);
    }
}
