package com.instagram.realtimeclient.regionhint.graphql;

import X.0qQ;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TG;
import X.C250663lr;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IGRealtimeRegionHintQueryResponseImpl extends C250663lr implements IGRealtimeRegionHintQueryResponse {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = 631560198;

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return IGRealtimeRegionHintQueryResponseImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class XdtIgdMsgRegion extends C250663lr implements IGRealtimeRegionHintQueryResponse.XdtIgdMsgRegion {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 922056036;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return XdtIgdMsgRegion.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getRegion() {
            return A07(ServerW3CShippingAddressConstants.REGION);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, ServerW3CShippingAddressConstants.REGION);
        }

        public XdtIgdMsgRegion(int i) {
            super(i);
        }

        public XdtIgdMsgRegion() {
            super(TYPE_TAG);
        }
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public IGRealtimeRegionHintQueryResponse.XdtIgdMsgRegion getXdtIgdMsgRegion() {
        C250663lr A05 = A05(XdtIgdMsgRegion.class, "xdt_igd_msg_region", XdtIgdMsgRegion.TYPE_TAG);
        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.realtimeclient.regionhint.graphql.IGRealtimeRegionHintQueryResponseImpl.XdtIgdMsgRegion");
        return (XdtIgdMsgRegion) A05;
    }

    public AnonymousClass4Kx modelSelectionSet() {
        int i = XdtIgdMsgRegion.TYPE_TAG;
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), XdtIgdMsgRegion.class, "xdt_igd_msg_region", i);
    }

    public IGRealtimeRegionHintQueryResponseImpl(int i) {
        super(i);
    }

    public IGRealtimeRegionHintQueryResponseImpl() {
        super(TYPE_TAG);
    }
}
