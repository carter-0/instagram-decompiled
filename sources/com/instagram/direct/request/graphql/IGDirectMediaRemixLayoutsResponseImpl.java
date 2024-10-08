package com.instagram.direct.request.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L8;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C250663lr;
import X.C250673ls;
import X.C342787pA;
import X.C69410Nkp;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class IGDirectMediaRemixLayoutsResponseImpl extends C250663lr implements C250673ls {

    public final class IgdMagicRemixLayout extends C250663lr implements C250673ls {

        public final class Response extends C250663lr implements C250673ls {

            public final class BackgroundImages extends C250663lr implements C250673ls {

                public final class PositionData extends C250663lr implements C250673ls {
                    public PositionData() {
                        super(-1996884977);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TH.A09();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, new AnonymousClass4Kp(PositionData.class, "position_data", -1996884977), "sticker_bundle_id");
                }

                public BackgroundImages() {
                    super(-617995249);
                }
            }

            public final class ForegroundImages extends C250663lr implements C250673ls {

                public final class PositionData extends C250663lr implements C250673ls {
                    public PositionData() {
                        super(-531718080);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TH.A09();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0U(AnonymousClass4Kz.A02(), new AnonymousClass4Kp(PositionData.class, "position_data", -531718080), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "sticker_bundle_id"), "decorations");
                }

                public ForegroundImages() {
                    super(-1318871329);
                }
            }

            public final class Stickers extends C250663lr implements C250673ls {

                public final class StickerBundleIds extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TG.A0U(r3, AnonymousClass7TE.A0f(r3, "sticker_name"), AnonymousClass7TE.A0f(r3, "sticker_bundle_id"), "sticker_url");
                    }

                    public StickerBundleIds() {
                        super(-1750171034);
                    }
                }

                public final class PositionData extends C250663lr implements C250673ls {
                    public PositionData() {
                        super(1524157116);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TH.A09();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{new AnonymousClass4Kp(PositionData.class, "position_data", 1524157116), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "sticker_type"), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), StickerBundleIds.class, "sticker_bundle_ids", -1750171034)});
                }

                public Stickers() {
                    super(-777291604);
                }
            }

            public final class Text extends C250663lr implements C250673ls {

                public final class PositionData extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        C342787pA r2 = C342787pA.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r2, "x"), AnonymousClass7TE.A0f(r2, "y"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "z"), AnonymousClass7TE.A0f(r2, "rotation"), AnonymousClass7TE.A0f(r2, IgReactMediaPickerNativeModule.HEIGHT), AnonymousClass7TE.A0f(r2, IgReactMediaPickerNativeModule.WIDTH)});
                    }

                    public PositionData() {
                        super(-359087256);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "font"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "font_size"), new AnonymousClass4Kp(PositionData.class, "position_data", -359087256)});
                }

                public Text() {
                    super(-809030976);
                }
            }

            public final C69410Nkp A0E() {
                return (C69410Nkp) getOptionalEnumField(0, "layout_type", C69410Nkp.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "layout_type"), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), BackgroundImages.class, "background_images", -617995249), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), ForegroundImages.class, "foreground_images", -1318871329), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), Stickers.class, "stickers", -777291604), new AnonymousClass4Kp(AnonymousClass4Ks.A02(), Text.class, "text", -809030976)});
            }

            public Response() {
                super(668897747);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 668897747);
        }

        public IgdMagicRemixLayout() {
            super(-1921261300);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(IgdMagicRemixLayout.class, AnonymousClass000.A00(1444), -1921261300);
    }

    public IGDirectMediaRemixLayoutsResponseImpl() {
        super(1816326084);
    }
}
