package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: X.WTn  reason: case insensitive filesystem */
public final class C19305WTn implements 0mK {
    public C17523VZc A00 = null;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass07i A04;
    public final UserSession A05;
    public final 0mM A06;
    public final C17896Vhn A07;
    public final ReelStore A08;
    public final Set A09 = Collections.newSetFromMap(new WeakHashMap());

    public final /* bridge */ /* synthetic */ void onDebouncedValue(Object obj) {
        C17523VZc vZc = (C17523VZc) obj;
        if (this.A02) {
            return;
        }
        if (this.A01) {
            this.A06.A01(vZc);
            return;
        }
        C17523VZc vZc2 = this.A00;
        if (vZc2 == null || vZc2.A00.A00(vZc.A00) >= 500.0d) {
            Context context = this.A03;
            AnonymousClass07i r4 = this.A04;
            UserSession userSession = this.A05;
            C15619Ufl ufl = new C15619Ufl(8, this, vZc);
            1NY A0N = DbU.A0N(userSession);
            A0N.A0A("map/map_region_geohub/");
            A0N.A0R(C15244UXe.class, C18197VnK.class);
            C18682Vwg.A02(A0N, vZc);
            1OC A0K = DbW.A0K(A0N);
            A0K.A00 = ufl;
            1ES.A00(context, r4, A0K);
        }
    }

    public C19305WTn(Context context, AnonymousClass07i r6, UserSession userSession, C17896Vhn vhn) {
        this.A03 = context;
        this.A05 = userSession;
        this.A04 = r6;
        this.A07 = vhn;
        this.A08 = 1OP.A05(userSession);
        this.A06 = new 0mM(AnonymousClass7TF.A0D(), this, 1000);
    }
}
