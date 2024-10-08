package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.LinkedHashMap;

/* renamed from: X.LmM  reason: case insensitive filesystem */
public final /* synthetic */ class C65043LmM implements MS5 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ L83 A02;
    public final /* synthetic */ C352218Cl A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ C62461KgB[] A06;

    public /* synthetic */ C65043LmM(Context context, UserSession userSession, L83 l83, C352218Cl r4, C62461KgB[] kgBArr, boolean z, boolean z2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = r4;
        this.A02 = l83;
        this.A06 = kgBArr;
        this.A04 = z;
        this.A05 = z2;
    }

    public final LBE AMm(L0O l0o, FilterGroupModel filterGroupModel) {
        return new LBE(this.A00, this.A01, l0o, this.A02, filterGroupModel, this.A03, (LinkedHashMap) null, this.A06, this.A04, this.A05);
    }
}
