package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.LinkedHashMap;

/* renamed from: X.Ar0  reason: case insensitive filesystem */
public final /* synthetic */ class C41264Ar0 implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4D6 A02;
    public final /* synthetic */ 1GK A03;
    public final /* synthetic */ L83 A04;
    public final /* synthetic */ FilterGroupModel A05;
    public final /* synthetic */ AnonymousClass3Q2 A06;
    public final /* synthetic */ C352218Cl A07;
    public final /* synthetic */ String A08;

    public /* synthetic */ C41264Ar0(Context context, UserSession userSession, AnonymousClass4D6 r3, 1GK r4, L83 l83, FilterGroupModel filterGroupModel, AnonymousClass3Q2 r7, C352218Cl r8, String str) {
        this.A06 = r7;
        this.A00 = context;
        this.A01 = userSession;
        this.A07 = r8;
        this.A05 = filterGroupModel;
        this.A04 = l83;
        this.A03 = r4;
        this.A02 = r3;
        this.A08 = str;
    }

    public final void run() {
        AnonymousClass3Q2 r7 = this.A06;
        Context context = this.A00;
        UserSession userSession = this.A01;
        C352218Cl r8 = this.A07;
        FilterGroupModel filterGroupModel = this.A05;
        L83 l83 = this.A04;
        1GK r4 = this.A03;
        AnonymousClass4D6 r3 = this.A02;
        String str = this.A08;
        r7.A5l = true;
        C59797JYq.A06(context, userSession, r3, r4, l83, filterGroupModel, r7, r8, str, (LinkedHashMap) null);
    }
}
