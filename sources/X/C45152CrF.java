package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: X.CrF  reason: case insensitive filesystem */
public abstract class C45152CrF {
    public static C45420Cw0 parseFromJson(16F r5) {
        0qQ.A0B(r5, 0);
        try {
            C45420Cw0 cw0 = new C45420Cw0();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                HashSet hashSet = null;
                if (TraceFieldType.BroadcastId.equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r5);
                    0qQ.A0B(A0l, 0);
                    cw0.A03 = A0l;
                } else if (C41845B3m.A1B(A17)) {
                    cw0.A00 = C41845B3m.A0a(r5, false);
                } else if ("cobroadcasters".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        hashSet = AnonymousClass7TE.A1F();
                        while (r5.A1J() != 16L.A08) {
                            C41846B3n.A1E(r5, hashSet);
                        }
                    }
                    cw0.A04 = hashSet;
                } else {
                    if ("compound_media_id".equals(A17)) {
                        if (r5.A11() == 16L.A0G) {
                        }
                    } else if ("published_time".equals(A17)) {
                        r5.A0y();
                    } else {
                        if (!"is_periodic".equals(A17)) {
                            if ("broadcast_message".equals(A17)) {
                                if (r5.A11() == 16L.A0G) {
                                }
                            } else if ("display_notification".equals(A17)) {
                                cw0.A06 = r5.A0d();
                            } else if (IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS.equals(A17)) {
                                C278144wL.A00(r5.A1Q());
                            } else if (!"copyright_violation".equals(A17) && !"is_scheduled_live".equals(A17) && !"is_exclusive_live".equals(A17)) {
                                if (AnonymousClass000.A00(3072).equals(A17)) {
                                    String A1Q = r5.A1Q();
                                    0qQ.A0B(A1Q, 0);
                                    C69351Njq njq = (C69351Njq) C69351Njq.A01.get(A1Q);
                                    if (njq == null) {
                                        njq = C69351Njq.HEARTBEAT;
                                    }
                                    cw0.A01 = njq;
                                } else if ("add_to_home_tray".equals(A17)) {
                                    cw0.A05 = r5.A0d();
                                } else if ("question_pk".equals(A17)) {
                                    cw0.A02 = AnonymousClass7TF.A0Z(r5);
                                }
                            }
                        }
                        r5.A0d();
                    }
                    r5.A1P();
                }
                r5.A0z();
            }
            return cw0;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
