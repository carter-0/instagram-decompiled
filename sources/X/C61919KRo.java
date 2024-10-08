package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.KRo  reason: case insensitive filesystem */
public final class C61919KRo extends C253103qD {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Resources A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ MVX A03;
    public final /* synthetic */ CharSequence A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61919KRo(Context context, Resources resources, TextView textView, MVX mvx, CharSequence charSequence, String str, int i, boolean z) {
        super("", i, false);
        this.A02 = textView;
        this.A05 = str;
        this.A04 = charSequence;
        this.A01 = resources;
        this.A00 = context;
        this.A06 = z;
        this.A03 = mvx;
    }

    public final void onClick(View view) {
        TextView textView = this.A02;
        String str = this.A05;
        CharSequence charSequence = this.A04;
        Resources resources = this.A01;
        MVX mvx = this.A03;
        C63487Kxr.A00(this.A00, resources, textView, mvx, charSequence, str, !this.A06);
        C62283KdH kdH = ((C62247Kch) mvx).A03;
        C66184MGv.A02(kdH, C318116oQ.A00(kdH), 18);
    }
}
