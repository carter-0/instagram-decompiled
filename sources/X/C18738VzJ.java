package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.VzJ  reason: case insensitive filesystem */
public final class C18738VzJ {
    public static final List A09 = Arrays.asList(new String[]{"shopping_camera", "shopping_story"});
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final X9C A04;
    public final String A05;
    public final String A06;
    public final Activity A07;
    public final UserSession A08;

    public static void A00(C18738VzJ vzJ, String str) {
        X9C x9c = vzJ.A04;
        1Xj Bxm = x9c.Bxm();
        Product product = x9c.Bz5().A08;
        product.getClass();
        if (!vzJ.A03 && 1Wj.A00 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("product_id", product.A0H);
            hashMap.put("merchant_id", AnonymousClass3ZA.A00(product.A0B));
            boolean z = vzJ.A00;
            String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            String str3 = "0";
            if (z) {
                str3 = str2;
            }
            hashMap.put("checkout_clicked", str3);
            if (!vzJ.A01) {
                str2 = "0";
            }
            hashMap.put("checkout_completed", str2);
            hashMap.put("prior_module", vzJ.A06);
            hashMap.put(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, vzJ.A05);
            if (Bxm != null) {
                hashMap.put("media_id", Bxm.A30());
                User A2A = Bxm.A2A(vzJ.A08);
                if (A2A != null) {
                    hashMap.put("media_owner_id", A2A.getId());
                }
            }
            1Wj r2 = 1Wj.A00;
            r2.getClass();
            r2.A00(vzJ.A07, vzJ.A08, str, hashMap);
            vzJ.A03 = true;
        }
    }

    public C18738VzJ(Activity activity, UserSession userSession, X9C x9c, String str, String str2) {
        this.A07 = activity;
        this.A08 = userSession;
        this.A04 = x9c;
        this.A06 = str;
        this.A05 = str2;
    }
}
