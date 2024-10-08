package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.LinkedHashMap;

public final class LBE {
    public final Context A00;
    public final UserSession A01;
    public final L0O A02;
    public final L83 A03;
    public final MV7 A04 = new C65159LoO(this);
    public final FilterGroupModel A05;
    public final LinkedHashMap A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final C62461KgB[] A0B;

    public LBE(Context context, UserSession userSession, L0O l0o, L83 l83, FilterGroupModel filterGroupModel, C352218Cl r7, LinkedHashMap linkedHashMap, C62461KgB[] kgBArr, boolean z, boolean z2) {
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = filterGroupModel;
        this.A03 = l83;
        this.A0B = kgBArr;
        this.A02 = l0o;
        this.A08 = r7.A13;
        this.A09 = r7.A18;
        this.A07 = z;
        this.A0A = z2;
        this.A06 = linkedHashMap;
    }
}
