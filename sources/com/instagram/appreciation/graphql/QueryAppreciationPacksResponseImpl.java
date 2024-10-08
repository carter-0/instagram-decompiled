package com.instagram.appreciation.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C273654mx;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class QueryAppreciationPacksResponseImpl extends C250663lr implements C250673ls {

    public final class Viewer extends C250663lr implements C250673ls {

        public final class User extends C250663lr implements C250673ls {

            public final class ContentAppreciationFundingConfig extends C250663lr implements C250673ls {

                public final class ContentAppreciationConsumableProducts extends C250663lr implements C250673ls {

                    public final class Product extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                            AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r5);
                            AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                            return C41846B3n.A0M(A0I, AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(2689)), AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(3098)), AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(4125)), AnonymousClass7TE.A0f(r5, AnonymousClass000.A00(3092)));
                        }

                        public Product() {
                            super(1438290007);
                        }
                    }

                    public final Product A0E() {
                        return (Product) A02(Product.class, "product", 1438290007);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41847B3o.A0m(C41845B3m.A0I(AnonymousClass4Kz.A00), Product.class, "product", 1438290007);
                    }

                    public ContentAppreciationConsumableProducts() {
                        super(1515473024);
                    }
                }

                public final class FundingTos extends C250663lr implements C250673ls {

                    public final class Linkify extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "link"), "text");
                        }

                        public Linkify() {
                            super(-328179364);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41847B3o.A0i(AnonymousClass4Ks.A02(), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, AnonymousClass000.A00(4121)), Linkify.class, C273654mx.A00(802), -328179364);
                    }

                    public FundingTos() {
                        super(274501959);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41847B3o.A0j(AnonymousClass4Kz.A00, C41845B3m.A0A(AnonymousClass4Ks.A02(), ContentAppreciationConsumableProducts.class, AnonymousClass000.A00(2927), 1515473024), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, AnonymousClass000.A00(3218)), C41845B3m.A0C(FundingTos.class, AnonymousClass000.A00(3173), 274501959), "banner_type");
                }

                public ContentAppreciationFundingConfig() {
                    super(-1773563726);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(ContentAppreciationFundingConfig.class, AnonymousClass000.A00(2928), -1773563726);
            }

            public User() {
                super(-1127772318);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0Y(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -1127772318);
        }

        public Viewer() {
            super(1602000960);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(Viewer.class, "viewer", 1602000960);
    }

    public QueryAppreciationPacksResponseImpl() {
        super(538047011);
    }
}
