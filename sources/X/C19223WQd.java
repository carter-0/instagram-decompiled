package X;

import com.facebook.locationsharing.core.models.Location;
import com.facebook.locationsharing.core.models.PointOfInterest;
import com.google.common.collect.ImmutableList;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.Product;
import java.util.HashSet;

/* renamed from: X.WQd  reason: case insensitive filesystem */
public final class C19223WQd implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19223WQd(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onEvent(Object obj) {
        int A03;
        int i;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C17893Vhk vhk = (C17893Vhk) this.A02;
                WQP wqp = (WQP) obj2;
                if (wqp.A02.equals(((Product) this.A01).A0H)) {
                    C243373Ym r2 = wqp.A00;
                    C243373Ym r1 = C243373Ym.SAVED;
                    if (r2 == r1 || r2 == C243373Ym.NOT_SAVED) {
                        boolean z = true;
                        boolean A1W = AnonymousClass7TF.A1W(r2, r1);
                        if (wqp.A01 != AnonymousClass05K.A00) {
                            z = false;
                        }
                        vhk.A00(A1W, z);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                A03 = AnonymousClass0fD.A03(418633065);
                WQP wqp2 = (WQP) obj2;
                int A032 = AnonymousClass0fD.A03(-774027338);
                C243373Ym r3 = C243373Ym.SAVED;
                C243373Ym r22 = wqp2.A00;
                if (r3 == r22 || C243373Ym.NOT_SAVED == r22) {
                    C17893Vhk vhk2 = (C17893Vhk) this.A02;
                    boolean z2 = true;
                    boolean A1W2 = AnonymousClass7TF.A1W(r22, r3);
                    if (wqp2.A01 != AnonymousClass05K.A00) {
                        z2 = false;
                    }
                    vhk2.A00(A1W2, z2);
                }
                AnonymousClass0fD.A0A(176022473, A032);
                i = 1656983425;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1290687605);
                C64648Lfa lfa = (C64648Lfa) obj2;
                int A0D = AnonymousClass7TG.A0D(lfa, 1737693470);
                Venue venue = lfa.A00;
                UHR uhr = (UHR) this.A01;
                Double A002 = venue.A00();
                if (A002 != null) {
                    double doubleValue = A002.doubleValue();
                    Double A012 = venue.A01();
                    if (A012 != null) {
                        double doubleValue2 = A012.doubleValue();
                        String address = venue.A00.getAddress();
                        if (address == null) {
                            address = "";
                        }
                        Location location = new Location(new HashSet(), doubleValue, doubleValue2, -1, AnonymousClass972.MUTABLE_FLAG_MASK, -1);
                        Location location2 = location;
                        uhr.A0B(ImmutableList.of(new PointOfInterest(location2, address, venue.A02(), venue.A00.getShortName(), venue.A00.getName())));
                    }
                }
                AnonymousClass0fD.A0A(1856662427, A0D);
                i = 1647181657;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-671215041);
                WQI wqi = (WQI) obj2;
                int A0D2 = AnonymousClass7TG.A0D(wqi, -1820878758);
                C15341Uar uar = (C15341Uar) this.A02;
                Product product = wqi.A00;
                C13990Tnq.A0X(uar).A01(((C16250UrD) ((C16697V2a) this.A01)).A01, product);
                1wn r32 = uar.A01;
                if (r32 != null) {
                    DbX.A0R(uar.A0M).A02(r32, WQI.class);
                }
                AnonymousClass0fD.A0A(-117231618, A0D2);
                i = 363253008;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
