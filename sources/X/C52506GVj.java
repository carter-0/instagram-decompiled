package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;

/* renamed from: X.GVj  reason: case insensitive filesystem */
public final class C52506GVj extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ Context A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ AnonymousClass6Q6 A06;
    public final /* synthetic */ IgShowreelNativeAnimationIntf A07;
    public final /* synthetic */ C308776Vo A08;
    public final /* synthetic */ AnonymousClass6UO A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52506GVj(Context context, UserSession userSession, AnonymousClass6Q6 r6, IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf, C308776Vo r8, AnonymousClass6UO r9, int i, int i2, int i3, int i4) {
        super(584, 3, false, false);
        this.A05 = userSession;
        this.A04 = context;
        this.A07 = igShowreelNativeAnimationIntf;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A06 = r6;
        this.A08 = r8;
        this.A09 = r9;
    }

    public final void run() {
        UserSession userSession = this.A05;
        new C52511GVo(this.A04, userSession, this.A06, this.A07, this.A08, this.A09, this.A00, this.A01, this.A02, this.A03).run();
    }
}
