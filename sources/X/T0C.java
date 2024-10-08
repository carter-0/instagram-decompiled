package X;

import android.content.SharedPreferences;

public final class T0C implements C367808rb {
    public final /* synthetic */ C10209RoQ A00;

    public final void DdG(C368458se r5) {
        if (r5.A00 != C390639rb.A03) {
            SharedPreferences sharedPreferences = this.A00.A00.getSharedPreferences("act_dns_cache", 0);
            0qQ.A07(sharedPreferences);
            sharedPreferences.edit().remove((String) r5.getKey()).apply();
        }
    }

    public T0C(C10209RoQ roQ) {
        this.A00 = roQ;
    }
}
