package X;

import android.widget.CompoundButton;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.EQl  reason: case insensitive filesystem */
public final class C48002EQl extends H4J {
    public final CompoundButton A00;
    public final C48253EbY A01;
    public final boolean A02;
    public final boolean A03;
    public final /* synthetic */ ESZ A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48002EQl(CompoundButton compoundButton, 0hq r2, C48253EbY ebY, ESZ esz, boolean z, boolean z2) {
        super(r2);
        this.A04 = esz;
        this.A00 = compoundButton;
        this.A02 = z;
        this.A03 = z2;
        this.A01 = ebY;
    }

    private void A00(boolean z) {
        String str;
        ESZ esz = this.A04;
        C49882FBg fBg = esz.A07;
        String str2 = esz.A08;
        boolean z2 = this.A03;
        C48253EbY ebY = this.A01;
        if (z2) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        fBg.A02(str2, 002.A0g(str, "-", ebY.toString()), "time_range", z);
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(828962329);
        ESZ esz = this.A04;
        C59689JTv.A0C(esz.A04, "reset_time_range_failed");
        boolean z = this.A02;
        CompoundButton compoundButton = this.A00;
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            compoundButton.setChecked(z);
            compoundButton.setOnCheckedChangeListener(esz.A05);
        }
        A00(false);
        AnonymousClass0fD.A0A(2142955562, A032);
    }

    public final void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(1250290171);
        boolean z = this.A03;
        CompoundButton compoundButton = this.A00;
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            compoundButton.setChecked(z);
            compoundButton.setOnCheckedChangeListener(this.A04.A05);
        }
        F3U f3u = this.A04.A06.A00;
        C49398Ev0 ev0 = f3u.A00;
        ev0.getClass();
        f3u.A00(ev0);
        A00(true);
        AnonymousClass0fD.A0A(2135034843, A032);
    }
}
