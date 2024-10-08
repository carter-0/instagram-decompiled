package X;

import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.facebook.locationsharing.core.models.Location;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.WMs  reason: case insensitive filesystem */
public final class C19136WMs implements 2IR {
    public final int A00;
    public final Object A01;

    public C19136WMs(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onFailure(Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                List<C250663lr> list = (List) obj2;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (C250663lr r9 : list) {
                        if (r9 != null) {
                            String optionalStringField = r9.getOptionalStringField(0, "strong_id__");
                            C250663lr optionalTreeField = r9.getOptionalTreeField(1, "location", C15114UQd.class, 351336223);
                            if (!(optionalStringField == null || optionalTreeField == null || r9.getOptionalEnumField(2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, C16649Uyl.UNSET_OR_UNRECOGNIZED_ENUM_VALUE) != C16649Uyl.SHARING)) {
                                Executor executor = C17145VJx.A00;
                                arrayList.add(new LiveLocationSharer(new Location(new HashSet(), optionalTreeField.getCoercedDoubleField(0, com.facebook.location.platform.api.Location.LATITUDE), optionalTreeField.getCoercedDoubleField(1, "longitude"), optionalTreeField.getCoercedIntField(2, "accuracy_meters"), AnonymousClass972.MUTABLE_FLAG_MASK, (long) optionalTreeField.getCoercedDoubleField(3, "epoch_time_sec")), optionalStringField, System.currentTimeMillis() + JTR.A0N(TimeUnit.HOURS)));
                            }
                        }
                    }
                    C15094UOn uOn = ((VN3) this.A01).A00;
                    uOn.A01.FMd(new C18981WFi(uOn, 4), uOn.A00, arrayList);
                    return;
                }
                return;
            case 1:
                AnonymousClass7TF.A0D().post(new C20245Wnk((C61363K4f) this.A01, (0eP) obj2));
                return;
            default:
                C256623w5 A002 = C256623w5.A00();
                if (A002 != null) {
                    A002.A01();
                }
                GIY giy = (GIY) this.A01;
                UserSession userSession = giy.A03;
                1Xj r0 = giy.A00;
                if (r0 != null) {
                    1OC A04 = AnonymousClass93V.A04(userSession, r0.A30(), (String) null, (String) null);
                    A04.A00 = new H50(giy, 20);
                    1ES.A05(A04, 1368380687, 2, true, false);
                    return;
                }
                0qQ.A0F("media");
                throw AnonymousClass00P.createAndThrow();
        }
    }
}
