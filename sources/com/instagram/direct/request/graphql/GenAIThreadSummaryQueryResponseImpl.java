package com.instagram.direct.request.graphql;

import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class GenAIThreadSummaryQueryResponseImpl extends C250663lr implements C250673ls {

    public final class XfbGenaiThreadSummary extends C250663lr implements C250673ls {

        public final class Response extends C250663lr implements C250673ls {

            public final class InlineXFBGenAIThreadSummaryResultGenericError extends C250663lr implements C250673ls {

                public final class Exception extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(AnonymousClass4L8.A00, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                    }

                    public Exception() {
                        super(1950259270);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41847B3o.A0m(AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, DialogModule.KEY_MESSAGE), Exception.class, "exception", 1950259270);
                }

                public InlineXFBGenAIThreadSummaryResultGenericError() {
                    super(2129197418);
                }
            }

            public final class InlineXFBGenAIThreadSummaryResultSuccess extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "summary");
                }

                public InlineXFBGenAIThreadSummaryResultSuccess() {
                    super(1257442347);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0l(C41845B3m.A09(C41845B3m.A08(InlineXFBGenAIThreadSummaryResultSuccess.class, "InlineXFBGenAIThreadSummaryResultSuccess", 1257442347), "XFBGenAIThreadSummaryResultSuccess"), C41845B3m.A08(InlineXFBGenAIThreadSummaryResultGenericError.class, "InlineXFBGenAIThreadSummaryResultGenericError", 2129197418), "XFBGenAIThreadSummaryResultGenericError");
            }

            public Response() {
                super(-1567811636);
            }
        }

        public XfbGenaiThreadSummary() {
            super(323324960);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0m(C41846B3n.A06(), Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, -1567811636);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XfbGenaiThreadSummary.class, "xfb_genai_thread_summary(params:$params)", 323324960);
    }

    public GenAIThreadSummaryQueryResponseImpl() {
        super(335582825);
    }
}
