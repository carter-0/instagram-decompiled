package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.android.R;

/* renamed from: X.8Yu  reason: invalid class name and case insensitive filesystem */
public enum C357588Yu {
    Helium("fba/effect_graphs/helium.json", 0, 2131956158, R.drawable.instagram_spark_helium_outline_32),
    Giant("fba/effect_graphs/the_giant.json", 1, 2131956157, R.drawable.instagram_spark_giant_outline_32),
    Vocalist("fba/effect_graphs/vocalist.json", 2, 2131956160, R.drawable.instagram_spark_vocalist_outline_32),
    Announcer("fba/effect_graphs/the_announcer.json", 3, 2131956156, R.drawable.instagram_spark_announcer_outline_32);
    
    public MediaEffect A00;
    public C12331Srd A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public final C12331Srd A00(Context context) {
        C12331Srd srd = this.A01;
        if (srd != null) {
            return srd;
        }
        C12331Srd A002 = C394729yb.A00(context, this.A05);
        this.A01 = A002;
        return A002;
    }

    /* access modifiers changed from: public */
    static {
        C357588Yu[] r0;
        A06 = 0oU.A00(r0);
    }

    /* access modifiers changed from: public */
    C357588Yu(String str, int i, int i2, int i3) {
        this.A04 = r2;
        this.A05 = str;
        this.A03 = i2;
        this.A02 = i3;
    }
}
