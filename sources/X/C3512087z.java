package X;

import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.87z  reason: invalid class name and case insensitive filesystem */
public final class C3512087z extends 2YL {
    public Drawable A00;
    public C270564gw A01;
    public List A02 = 0sn.A00;
    public final 2Fk A03;
    public final AnonymousClass880 A04;
    public final Map A05 = new LinkedHashMap();
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A00(0eO.A02, new C377119Kp(this, 25));
    public final C249513ju A07;
    public final 05G A08;
    public final UserSession A09;

    public C3512087z(AnonymousClass880 r5, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A09 = userSession;
        this.A04 = r5;
        02z r3 = new 02z(C3511887x.LOADING);
        this.A08 = r3;
        1HR r0 = new 1HR(0);
        this.A07 = r0;
        this.A03 = C226292g8.A00(19B.A00, 0u9.A04(r0));
        AnonymousClass11O.A03(C318116oQ.A00(this), new C61860pz(new AnonymousClass9K3(this, (AnonymousClass4D7) null, 26), r3));
    }

    public final List A00(int i) {
        C279544yo C7S;
        List C5F;
        C270564gw r0 = this.A01;
        if (r0 == null || (C7S = r0.C7S()) == null || (C5F = C7S.C5F()) == null || !(!C5F.isEmpty())) {
            return null;
        }
        ArrayList<C248923io> arrayList = new ArrayList<>();
        for (Object next : C5F) {
            if (((C248923io) next).Byr() < ((float) i)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (C248923io r3 : arrayList) {
            A9H AKY = r3.AKY();
            AKY.A01 = r3.Byr();
            AKY.A00 = Math.min((float) i, r3.B1g());
            arrayList2.add(AKY.A00());
        }
        return arrayList2;
    }
}
