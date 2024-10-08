package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

/* renamed from: X.Ar2  reason: case insensitive filesystem */
public final class C41266Ar2 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4D6 A02;
    public final /* synthetic */ 1GK A03;
    public final /* synthetic */ L83 A04;
    public final /* synthetic */ FilterGroupModel A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ C352218Cl A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ boolean A0A;

    public C41266Ar2(Context context, UserSession userSession, AnonymousClass4D6 r3, 1GK r4, L83 l83, FilterGroupModel filterGroupModel, AnonymousClass3Q2 r7, C352218Cl r8, 0sP r9, 0sP r10, boolean z) {
        this.A06 = r7;
        this.A07 = r8;
        this.A09 = r9;
        this.A08 = r10;
        this.A00 = context;
        this.A05 = filterGroupModel;
        this.A0A = z;
        this.A04 = l83;
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void run() {
        AnonymousClass3Q2 r6 = this.A06;
        C352218Cl r7 = this.A07;
        0sP r8 = this.A09;
        0sP r9 = this.A08;
        Context context = this.A00;
        FilterGroupModel filterGroupModel = this.A05;
        boolean z = this.A0A;
        L83 l83 = this.A04;
        C63182Ksp.A00(context, this.A01, this.A02, this.A03, l83, filterGroupModel, r6, r7, r8, r9, z);
    }
}
