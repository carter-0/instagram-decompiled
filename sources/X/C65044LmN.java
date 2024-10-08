package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.LinkedHashMap;

/* renamed from: X.LmN  reason: case insensitive filesystem */
public final /* synthetic */ class C65044LmN implements MS5 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ L83 A02;
    public final /* synthetic */ C352218Cl A03;
    public final /* synthetic */ LinkedHashMap A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ C62461KgB[] A07;

    public /* synthetic */ C65044LmN(Context context, UserSession userSession, L83 l83, C352218Cl r4, LinkedHashMap linkedHashMap, C62461KgB[] kgBArr, boolean z, boolean z2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = l83;
        this.A07 = kgBArr;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = linkedHashMap;
    }

    public final LBE AMm(L0O l0o, FilterGroupModel filterGroupModel) {
        Context context = this.A00;
        UserSession userSession = this.A01;
        C352218Cl r6 = this.A03;
        return new LBE(context, userSession, l0o, this.A02, filterGroupModel, r6, this.A04, this.A07, this.A05, this.A06);
    }
}
