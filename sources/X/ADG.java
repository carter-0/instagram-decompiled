package X;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public final class ADG {
    @Deprecated
    public int A00;
    public PendingIntent A01;
    public IconCompat A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final Bundle A08;
    public final boolean A09;
    public final A7Y[] A0A;
    public final A7Y[] A0B;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ADG(PendingIntent pendingIntent, CharSequence charSequence, int i) {
        this(pendingIntent, AnonymousClass7TE.A0a(), i != 0 ? IconCompat.A01((Resources) null, "", i) : null, charSequence, (A7Y[]) null, (A7Y[]) null, 0, true, true, false, false);
    }

    public ADG(PendingIntent pendingIntent, Bundle bundle, IconCompat iconCompat, CharSequence charSequence, A7Y[] a7yArr, A7Y[] a7yArr2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = true;
        this.A02 = iconCompat;
        if (iconCompat != null) {
            int i2 = iconCompat.A02;
            if ((i2 == -1 ? ((Icon) iconCompat.A06).getType() : i2) == 2) {
                this.A00 = iconCompat.A04();
            }
        }
        this.A03 = AnonymousClass9T8.A00(charSequence);
        this.A01 = pendingIntent;
        this.A08 = bundle == null ? AnonymousClass7TE.A0a() : bundle;
        this.A0A = a7yArr;
        this.A0B = a7yArr2;
        this.A04 = z;
        this.A07 = i;
        this.A06 = z2;
        this.A09 = z3;
        this.A05 = z4;
    }
}
