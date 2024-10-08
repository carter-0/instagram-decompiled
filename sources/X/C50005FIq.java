package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.business.activity.BusinessConversionActivity;

/* renamed from: X.FIq  reason: case insensitive filesystem */
public final class C50005FIq implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ BusinessConversionActivity A01;
    public final /* synthetic */ C51926G7u A02;
    public final /* synthetic */ AnonymousClass4D6 A03;
    public final /* synthetic */ 16V A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C50005FIq(Context context, BusinessConversionActivity businessConversionActivity, C51926G7u g7u, AnonymousClass4D6 r4, 16V r5, String str, boolean z) {
        this.A01 = businessConversionActivity;
        this.A03 = r4;
        this.A00 = context;
        this.A05 = str;
        this.A02 = g7u;
        this.A04 = r5;
        this.A06 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BusinessConversionActivity.A00(this.A00, this.A01, this.A02, this.A03, this.A04, true, this.A06);
    }
}
