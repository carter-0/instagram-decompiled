package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;

public final class GAQ extends AnonymousClass2lU implements C252243on {
    public final boolean A0A(String str) {
        0qQ.A0B(str, 0);
        if ("feed_contextual_profile".equals(str) || "feed_contextual_self_profile".equals(str) || A00() || "feed_contextual_ads_chain".equals(str)) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final /* synthetic */ void onConfigurationChanged(Configuration configuration) {
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

    private final boolean A00() {
        String str = this.A05;
        if ("shopping_consumer_bau_ad_click_and_interaction_reminder".equals(str) || "shopping_consumer_bau_ad_click_reminder".equals(str) || "shopping_consumer_bau_ad_like_reminder".equals(str) || "shopping_consumer_bau_ad_save_reminder".equals(str) || "shopping_consumer_bau_ad_caption_expand_reminder".equals(str) || "shopping_consumer_bau_ad_click_percentage_off".equals(str) || "shopping_consumer_bau_ad_click_free_shipping".equals(str)) {
            return true;
        }
        return false;
    }

    public final boolean A09(1sy r3) {
        if (r3 == 1sy.A0I || r3 == 1sy.A02 || r3 == 1sy.A0E) {
            return true;
        }
        return false;
    }

    public final void onCreate() {
        if (!A00() && !"feed_contextual_ads_chain".equals(this.A05)) {
            A08(this.A00, true);
        }
    }
}
