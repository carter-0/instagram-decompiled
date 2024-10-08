package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Ar4  reason: case insensitive filesystem */
public final /* synthetic */ class C41268Ar4 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4D6 A02;
    public final /* synthetic */ 1GK A03;
    public final /* synthetic */ LD4 A04;
    public final /* synthetic */ L83 A05;
    public final /* synthetic */ FilterGroupModel A06;
    public final /* synthetic */ DirectShareTarget A07;
    public final /* synthetic */ C381779cJ A08;
    public final /* synthetic */ AnonymousClass3Q2 A09;
    public final /* synthetic */ 1ua A0A;
    public final /* synthetic */ C352218Cl A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    public /* synthetic */ C41268Ar4(Context context, UserSession userSession, AnonymousClass4D6 r4, 1GK r5, LD4 ld4, L83 l83, FilterGroupModel filterGroupModel, DirectShareTarget directShareTarget, C381779cJ r10, AnonymousClass3Q2 r11, 1ua r12, C352218Cl r13, String str, String str2, boolean z, boolean z2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A09 = r11;
        this.A0B = r13;
        this.A06 = filterGroupModel;
        this.A05 = l83;
        this.A04 = ld4;
        this.A08 = r10;
        this.A03 = r5;
        this.A02 = r4;
        this.A0E = z;
        this.A0C = str;
        this.A0A = r12;
        this.A07 = directShareTarget;
        this.A0F = z2;
        this.A0D = str2;
    }

    public final void run() {
        Context context = this.A00;
        UserSession userSession = this.A01;
        AnonymousClass3Q2 r13 = this.A09;
        C352218Cl r12 = this.A0B;
        FilterGroupModel filterGroupModel = this.A06;
        L83 l83 = this.A05;
        LD4 ld4 = this.A04;
        C381779cJ r8 = this.A08;
        1GK r7 = this.A03;
        AnonymousClass4D6 r6 = this.A02;
        boolean z = this.A0E;
        String str = this.A0C;
        1ua r3 = this.A0A;
        DirectShareTarget directShareTarget = this.A07;
        boolean z2 = this.A0F;
        AnonymousClass3Q2 r26 = r13;
        1ua r27 = r3;
        C381779cJ r24 = r8;
        DirectShareTarget directShareTarget2 = directShareTarget;
        FilterGroupModel filterGroupModel2 = filterGroupModel;
        L83 l832 = l83;
        LD4 ld42 = ld4;
        1GK r19 = r7;
        AnonymousClass4D6 r18 = r6;
        UserSession userSession2 = userSession;
        C59797JYq.A04(context, (C53401GnY) null, userSession2, r18, r19, ld42, l832, filterGroupModel2, directShareTarget2, r24, (A6R) null, r26, r27, r12, str, this.A0D, z, z2);
    }
}
