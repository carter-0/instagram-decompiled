package com.instagram.direct.request.graphql;

import X.AnonymousClass000;
import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4LF;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;

public final class ThreadThemeImpl extends C250663lr implements C250673ls {

    public final class ThreadBackgroundAsset extends C250663lr implements C250673ls {

        public final class BackgroundImages extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "url");
            }

            public BackgroundImages() {
                super(-479661724);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(AnonymousClass4Kz.A00), new AnonymousClass4Kp(AnonymousClass4Ks.A00(), BackgroundImages.class, "background_images", -479661724), AnonymousClass000.A00(289));
        }

        public ThreadBackgroundAsset() {
            super(-1908335913);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "composer_input_background_color"), AnonymousClass7TE.A0f(r1, "composer_placeholder_text_color"), AnonymousClass7TE.A0f(r1, "composer_secondary_button_color"), AnonymousClass7TE.A0f(r1, "outbound_message_text_color"), AnonymousClass7TE.A0f(r1, "incoming_message_bubble_color"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00(), "emphasis_colors"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A02(), "gradient_colors"), AnonymousClass7TE.A0f(r1, "emphasized_action_color"), AnonymousClass7TE.A0f(r1, "navigation_bar_color"), AnonymousClass7TE.A0f(r1, "navigation_bar_subtitle_color"), AnonymousClass7TE.A0f(r1, "bottom_gradient_color"), AnonymousClass7TE.A0f(r1, "secondary_text_color"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(AnonymousClass4LF.A00), "should_show_incoming_message_bubble_border"), AnonymousClass7TE.A0f(r1, "solid_composer_background_color"), AnonymousClass7TE.A0f(r1, "thread_background_color"), new AnonymousClass4Kp(ThreadBackgroundAsset.class, "thread_background_asset", -1908335913)});
    }

    public ThreadThemeImpl() {
        super(-158150994);
    }
}
