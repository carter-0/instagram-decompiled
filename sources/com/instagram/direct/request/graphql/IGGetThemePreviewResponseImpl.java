package com.instagram.direct.request.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C41845B3m;
import X.C41846B3n;
import X.C66579MXk;
import com.google.common.collect.ImmutableList;

public final class IGGetThemePreviewResponseImpl extends C250663lr implements C250673ls {

    public final class XdtThemePreview extends C250663lr implements C250673ls {

        public final class AlternativeThemes extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0X(ThreadThemeImpl.class, AnonymousClass000.A00(1038), -158150994);
            }

            public AlternativeThemes() {
                super(260988390);
            }
        }

        public final ImmutableList A0E() {
            return getRequiredCompactedTreeListField(3, "alternative_themes", AlternativeThemes.class, 260988390);
        }

        public XdtThemePreview() {
            super(1568985831);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41846B3n.A0L(AnonymousClass7TE.A0f(C41845B3m.A0Q(), "theme_id"), C41846B3n.A0C(AnonymousClass4Kz.A00), C41845B3m.A08(ThreadThemeImpl.class, AnonymousClass000.A00(1038), -158150994), C41845B3m.A0A(AnonymousClass4Ks.A02(), AlternativeThemes.class, "alternative_themes", 260988390));
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0Y(XdtThemePreview.class, C66579MXk.A00(412), 1568985831);
    }

    public IGGetThemePreviewResponseImpl() {
        super(-1566123658);
    }
}
