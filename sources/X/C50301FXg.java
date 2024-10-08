package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.FXg  reason: case insensitive filesystem */
public final class C50301FXg implements C252243on {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ BaseFragmentActivity A02;
    public final /* synthetic */ 1Yh A03;
    public final /* synthetic */ AnonymousClass0iw A04;
    public final /* synthetic */ UserSession A05;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
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

    public final /* synthetic */ void onResume() {
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

    public C50301FXg(Bundle bundle, FragmentActivity fragmentActivity, BaseFragmentActivity baseFragmentActivity, 1Yh r4, AnonymousClass0iw r5, UserSession userSession) {
        this.A03 = r4;
        this.A05 = userSession;
        this.A01 = fragmentActivity;
        this.A00 = bundle;
        this.A02 = baseFragmentActivity;
        this.A04 = r5;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        XIGIGBoostDestination xIGIGBoostDestination;
        Integer num;
        boolean z;
        ImageUrl imageUrl;
        int i3;
        int i4 = i2;
        if (i == 17 && i4 == 1797) {
            1Yh r11 = this.A03;
            G7V g7v = r11.A00;
            if (g7v != null) {
                g7v.Do2();
            }
            Boolean bool = null;
            Intent intent2 = intent;
            if (intent != null) {
                xIGIGBoostDestination = (XIGIGBoostDestination) intent2.getParcelableExtra(AnonymousClass000.A00(2993));
            } else {
                xIGIGBoostDestination = null;
            }
            if (intent != null) {
                bool = Boolean.valueOf(intent2.getBooleanExtra("is_ab_test", false));
            }
            UserSession userSession = this.A05;
            if (!DbX.A1a(bool)) {
                0Tu r4 = 0Tu.A05;
                boolean A06 = 182.A06(r4, userSession, 36328078930164659L);
                boolean A062 = 182.A06(r4, userSession, 36328078930230196L);
                if ((xIGIGBoostDestination == XIGIGBoostDestination.DIRECT_MESSAGE && A06) || (xIGIGBoostDestination == XIGIGBoostDestination.WHATSAPP_MESSAGE && A062)) {
                    int A042 = DbS.A04(r4, userSession, 36609553906800504L);
                    Integer[] A002 = AnonymousClass05K.A00(3);
                    int length = A002.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            num = A002[i5];
                            switch (num.intValue()) {
                                case 1:
                                    i3 = 1;
                                    break;
                                case 2:
                                    i3 = 2;
                                    break;
                                default:
                                    i3 = 0;
                                    break;
                            }
                            if (i3 != A042) {
                                i5++;
                            }
                        }
                    }
                }
            }
            num = AnonymousClass05K.A00;
            if (intent != null) {
                z = intent2.getBooleanExtra(AnonymousClass000.A00(1508), false);
            } else {
                z = false;
            }
            if (num == AnonymousClass05K.A0C) {
                C48750EjZ.A00(this.A01, xIGIGBoostDestination, userSession, this.A00.getString("media_id"));
            } else if (!(intent == null || (imageUrl = (ImageUrl) intent2.getParcelableExtra(AnonymousClass000.A00(698))) == null)) {
                new Handler().postDelayed(new C51553Fvz(intent2, this.A00, this.A01, xIGIGBoostDestination, r11, this.A04, userSession, imageUrl, num, z), 500);
            }
        } else if (i4 == -1) {
            return;
        }
        1Yh.A01(this.A03);
        this.A02.unregisterOnActivityResultListener(this);
    }
}
