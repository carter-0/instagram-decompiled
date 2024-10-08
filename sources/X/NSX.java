package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;

public final class NSX extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ List A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NSX(Context context, UserSession userSession, String str, String str2, String str3, String str4, List list, List list2) {
        super(111, 4, false, false);
        this.A06 = list;
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A07 = list2;
        this.A02 = str4;
    }

    public final void run() {
        Drawable bitmapDrawable;
        boolean z;
        C72729PHj pHj;
        ImageUrl imageUrl;
        Bitmap A0H;
        List list = this.A06;
        Bitmap bitmap = null;
        if (list != null) {
            11Z.A05("This operation can't be run on UI thread.");
            if (!(list.isEmpty() || (imageUrl = (ImageUrl) AnonymousClass7TE.A13(list)) == null || (A0H = 1NK.A00().A0H(imageUrl, "directThreadThemes")) == null)) {
                bitmap = 1MF.A05(A0H);
            }
        }
        boolean A0A = 2MD.A01().A0A();
        Context context = this.A00;
        UserSession userSession = this.A01;
        String str = this.A05;
        String str2 = this.A03;
        String str3 = this.A04;
        if (A0A) {
            List list2 = this.A07;
            String str4 = this.A02;
            Object obj = null;
            if (0qQ.A0K(str4, "1545129")) {
                z = false;
            } else if (0qQ.A0K(str4, "1545128")) {
                z = true;
            } else {
                if (bitmap == null) {
                    bitmapDrawable = context.getDrawable(R.drawable.instagram_direct_pano_outline_24);
                } else {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                }
                OIS A002 = OU0.A00(userSession.A06);
                A002.A0G = "direct_error_notification_type";
                A002.A0H = str;
                A002.A0E = str2;
                A002.A03 = PushChannelType.LOCAL;
                Integer num = AnonymousClass05K.A01;
                num.getClass();
                A002.A0A = num;
                A002.A01 = bitmapDrawable;
                A002.A08 = new PHX(userSession, context, str3, 0);
                2MD.A01().A09(new OU0(A002));
                return;
            }
            if (list2 != null) {
                obj = 00k.A0J(list2);
            }
            String str5 = null;
            if (!z || obj == null) {
                pHj = null;
            } else {
                str5 = context.getString(2131962530);
                pHj = new C72729PHj(0, obj, userSession);
            }
            C310336ap A0a = DbS.A0a();
            A0a.A0D = str2;
            A0a.A06();
            if (!(str5 == null || pHj == null)) {
                A0a.A0G = str5;
                A0a.A0A = pHj;
                A0a.A0L = true;
            }
            A0a.A07(R.drawable.instagram_info_pano_outline_24);
            A0a.A02();
            Dbb.A1Q(A0a);
            return;
        }
        if (bitmap == null) {
            bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.instagram_direct_pano_outline_24);
        }
        Intent A022 = AnonymousClass14B.A03.A00().A02(context, 67108864);
        if (str3 != null) {
            A022.setData(DbV.A08(DbW.A07("ig://direct_v2"), PublicKeyCredentialControllerUtility.JSON_KEY_ID, str3));
        }
        AnonymousClass9T8 r3 = new AnonymousClass9T8(context, C3726691w.A02(context, userSession, "direct_v2_generic").A00);
        r3.A0C(str);
        r3.A0B(str2);
        r3.A0D(str2);
        int i = R.drawable.notification_icon;
        int A0H2 = 2Yu.A0H(context, R.attr.defaultNotificationIcon);
        if (A0H2 != 0) {
            i = A0H2;
        }
        r3.A04(i);
        r3.A07(bitmap);
        r3.A0E(true);
        Notification notification = r3.A0A;
        notification.defaults = -1;
        notification.flags |= 1;
        r3.A01 = DbU.A01(context);
        notification.when = System.currentTimeMillis();
        0Sy r2 = new 0Sy();
        r2.A0A(A022);
        r3.A0C = r2.A01(context, 0, 268435456);
        Notification A032 = r3.A03();
        0qQ.A07(A032);
        new 1Fs(context).A00(C284285Lx.A00(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass7QG.A02(userSession.A06, str3, (String) null)), 64278, A032);
    }
}
