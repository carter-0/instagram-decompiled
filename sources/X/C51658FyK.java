package X;

import android.content.Context;
import com.instagram.profile.fragment.UserDetailFragment;

/* renamed from: X.FyK  reason: case insensitive filesystem */
public final class C51658FyK extends 03J implements 0sJ {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C51658FyK(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            if (r9 == 0) goto L_0x0012
            java.lang.Class<X.Dc7> r3 = X.Dc7.class
            r1 = 4
            java.lang.String r4 = "onAvatarCoinFlipSettingChanged"
            java.lang.String r5 = "onAvatarCoinFlipSettingChanged(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V"
        L_0x000c:
            r6 = 0
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0012:
            java.lang.Class<X.FH1> r3 = X.FH1.class
            r1 = 4
            java.lang.String r4 = "getAllGoogleTokens"
            java.lang.String r5 = "getAllGoogleTokens(Landroid/content/Context;Lcom/instagram/common/session/Session;Ljava/lang/String;Lcom/instagram/common/analytics/intf/AnalyticsModule;)Ljava/util/List;"
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51658FyK.<init>(java.lang.Object, int):void");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        if (this.A00 != 0) {
            Boolean bool = (Boolean) obj;
            String str = (String) obj2;
            String str2 = (String) obj3;
            String str3 = (String) obj4;
            DdZ ddZ = ((UserDetailFragment) this.receiver).A0k;
            if (ddZ != null) {
                ddZ.A04(bool.booleanValue(), str, str2, str3);
            }
            return C60340gF.A00;
        }
        Context context = (Context) obj;
        0lg r4 = (0lg) obj2;
        AnonymousClass0iw r6 = (AnonymousClass0iw) obj4;
        AnonymousClass7TG.A1N(context, r4);
        return FH1.A01(context, r6, r4, (G5M) null, (String) obj3);
    }
}
