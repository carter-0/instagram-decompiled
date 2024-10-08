package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.fragment.pdp.mediagrid.MediaGridArguments;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.WQm  reason: case insensitive filesystem */
public final class C19231WQm implements C252243on, X7v {
    public final Context A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C19676Wde A04;
    public final MediaGridArguments A05;
    public final U90 A06;
    public final Product A07;
    public final boolean A08;
    public final C18778W1d A09;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onPause() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewCreated(View view, Bundle bundle) {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.4DU, X.0iw, java.lang.Object] */
    public C19231WQm(Context context, Fragment fragment, UserSession userSession, MediaGridArguments mediaGridArguments) {
        Fragment fragment2 = fragment;
        MediaGridArguments mediaGridArguments2 = mediaGridArguments;
        C51972G9s.A1C(fragment2, mediaGridArguments2);
        Context context2 = context;
        this.A00 = context2;
        this.A01 = fragment2;
        UserSession userSession2 = userSession;
        this.A02 = userSession2;
        this.A05 = mediaGridArguments2;
        ? obj = new Object();
        this.A03 = obj;
        Product product = mediaGridArguments2.A01;
        String str = mediaGridArguments2.A03;
        String str2 = mediaGridArguments2.A09;
        String str3 = mediaGridArguments2.A0A;
        String str4 = mediaGridArguments2.A0B;
        String str5 = mediaGridArguments2.A0C;
        1E8 A002 = 1E7.A00(userSession2);
        String str6 = mediaGridArguments2.A06;
        String str7 = str5;
        String str8 = str4;
        String str9 = str3;
        String str10 = str2;
        String str11 = str;
        Product product2 = product;
        C18778W1d w1d = new C18778W1d(mediaGridArguments2.A00, obj, userSession2, A002.A02(str6), product2, str11, str10, str9, str8, str7, mediaGridArguments2.A02, mediaGridArguments2.A04, (String) null);
        this.A09 = w1d;
        HashMap hashMap = mediaGridArguments2.A0E;
        this.A06 = new U90(userSession2, w1d, product, str6, hashMap, 0nA.A09(context2));
        this.A04 = new C19676Wde(context2, userSession2, product);
        this.A08 = 182.A06(0Tu.A05, userSession2, 2342156257621837654L);
        this.A07 = product;
    }

    public final void CuK() {
        this.A06.A05(true);
    }

    public final void Czi() {
        this.A06.A06(true);
    }

    public final void Dz2() {
        String str;
        MediaGridArguments mediaGridArguments = this.A05;
        Product product = mediaGridArguments.A01;
        User user = product.A0B;
        String str2 = null;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        } else {
            str = null;
        }
        String str3 = mediaGridArguments.A06;
        if (str3 != null) {
            str2 = C231122qu.A0I(this.A02, str3);
        }
        if (str != null) {
            C249713kF.A00.A0m(this.A01.requireActivity(), V1Z.UNKNOWN, V1W.UNKNOWN, V1Y.UNKNOWN, V1X.UNKNOWN, this.A02, (Long) null, str, mediaGridArguments.A0C, this.A03.getModuleName(), "view_in_cart_cta", (String) null, str2, (String) null, (String) null, mediaGridArguments.A03, product.A0H, str3, mediaGridArguments.A02, (String) null, (HashMap) null, false);
            return;
        }
        C249713kF.A00.A0p(this.A01.requireActivity(), V1Z.UNKNOWN, V1W.UNKNOWN, V1Y.UNKNOWN, V1X.UNKNOWN, this.A02, mediaGridArguments.A0C, this.A03.getModuleName(), "view_in_cart_cta", str2, str3, mediaGridArguments.A02, false);
    }

    public final void onResume() {
        U90 u90 = this.A06;
        C17936ViR viR = u90.A06;
        AnonymousClass7TF.A1O(viR.A03, viR.A01.A08(U90.A01(u90)));
    }
}
