package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Ojc  reason: case insensitive filesystem */
public final class C71378Ojc implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ C67058MhZ A02;
    public final /* synthetic */ C67484Moe A03;
    public final /* synthetic */ C74396PuC A04;
    public final /* synthetic */ 2EM A05;
    public final /* synthetic */ AnonymousClass2Ep A06;
    public final /* synthetic */ DirectShareTarget A07;
    public final /* synthetic */ C254743sy A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public C71378Ojc(RectF rectF, C67058MhZ mhZ, C67484Moe moe, C74396PuC puC, 2EM r5, AnonymousClass2Ep r6, DirectShareTarget directShareTarget, C254743sy r8, int i, boolean z, boolean z2) {
        this.A03 = moe;
        this.A00 = i;
        this.A06 = r6;
        this.A08 = r8;
        this.A07 = directShareTarget;
        this.A0A = z;
        this.A01 = rectF;
        this.A02 = mhZ;
        this.A09 = z2;
        this.A05 = r5;
        this.A04 = puC;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1660009153);
        C67484Moe moe = this.A03;
        int i = this.A00;
        AnonymousClass2Ep r7 = this.A06;
        C254743sy r9 = this.A08;
        DirectShareTarget directShareTarget = this.A07;
        boolean z = this.A0A;
        RectF rectF = this.A01;
        C67058MhZ mhZ = this.A02;
        boolean z2 = this.A09;
        moe.A02(rectF, mhZ, this.A04, this.A05, r7, directShareTarget, r9, i, z, z2);
        AnonymousClass0fD.A0C(1315369918, A052);
    }
}
