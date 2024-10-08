package X;

import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import com.instagram.ui.text.TextColorScheme;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.AAe  reason: case insensitive filesystem */
public abstract class C39807AAe {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.802, java.lang.Object] */
    public static AnonymousClass802 parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("alignment".equals(A17)) {
                    obj.A05 = Layout.Alignment.valueOf(r4.A1Q());
                } else if ("text_size_px".equals(A17)) {
                    obj.A00 = (float) r4.A0U();
                } else if ("transform".equals(A17)) {
                    obj.A08 = AnonymousClass9UX.parseFromJson(r4);
                } else {
                    ArrayList arrayList = null;
                    if ("text_color_schemes".equals(A17)) {
                        if (r4.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r4.A1J() != 16L.A08) {
                                TextColorScheme parseFromJson = A1Q.parseFromJson(r4);
                                if (parseFromJson != null) {
                                    arrayList.add(parseFromJson);
                                }
                            }
                        }
                        obj.A0A = arrayList;
                    } else if ("show_background_gradient_button".equals(A17)) {
                        obj.A0E = r4.A0d();
                    } else if ("color_scheme_index".equals(A17)) {
                        obj.A01 = r4.A1D();
                    } else if ("color_scheme_solid_background_index".equals(A17)) {
                        obj.A03 = r4.A1D();
                    } else if ("color_scheme_solid_background_colour".equals(A17)) {
                        obj.A02 = r4.A1D();
                    } else if ("analytics_source".equals(A17)) {
                        obj.A06 = C393699wr.A00(AnonymousClass7TG.A0l(r4));
                    } else if (AnonymousClass000.A00(1746).equals(A17)) {
                        obj.A09 = AnonymousClass7TG.A0l(r4);
                    } else if ("should_overlay_media".equals(A17)) {
                        obj.A0D = r4.A0d();
                    } else if ("show_draw_button".equals(A17)) {
                        obj.A0F = r4.A0d();
                    } else if ("should_enable_free_transform".equals(A17)) {
                        obj.A0C = r4.A0d();
                    } else if ("is_mixed_text_mode".equals(A17)) {
                        obj.A0B = r4.A0d();
                    }
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r4, AnonymousClass802 r5) {
        r4.A0c();
        Layout.Alignment alignment = r5.A05;
        if (alignment != null) {
            r4.A0R("alignment", alignment.name());
        }
        r4.A0O("text_size_px", r5.A00);
        if (r5.A08 != null) {
            r4.A0q("transform");
            AnonymousClass9UX.A00(r4, r5.A08);
        }
        if (r5.A0A != null) {
            16P.A03(r4, "text_color_schemes");
            for (TextColorScheme textColorScheme : r5.A0A) {
                if (textColorScheme != null) {
                    r4.A0c();
                    r4.A0P("text_colors", textColorScheme.A02);
                    if (textColorScheme.A04 != null) {
                        r4.A0q("hint_text_colors");
                        ABL.A00(r4, textColorScheme.A04);
                    }
                    r4.A0P("emphasis_color", textColorScheme.A01);
                    if (textColorScheme.A07 != null) {
                        16P.A03(r4, AnonymousClass000.A00(260));
                        for (Number number : textColorScheme.A07) {
                            if (number != null) {
                                r4.A0g(number.intValue());
                            }
                        }
                        r4.A0Y();
                    }
                    Integer num = textColorScheme.A05;
                    if (num != null) {
                        r4.A0R("background_gradient_enum", ABK.A01(num));
                    }
                    r4.A0O("background_opacity", textColorScheme.A00);
                    GradientDrawable.Orientation orientation = textColorScheme.A03;
                    if (orientation != null) {
                        r4.A0R("orientation", orientation.name());
                    }
                    String str = textColorScheme.A06;
                    if (str != null) {
                        r4.A0R(AnonymousClass000.A00(520), str);
                    }
                    r4.A0Z();
                }
            }
            r4.A0Y();
        }
        r4.A0S("show_background_gradient_button", r5.A0E);
        r4.A0P("color_scheme_index", r5.A01);
        r4.A0P("color_scheme_solid_background_index", r5.A03);
        r4.A0P("color_scheme_solid_background_colour", r5.A02);
        AnonymousClass87I r0 = r5.A06;
        if (r0 != null) {
            r4.A0R("analytics_source", r0.A00);
        }
        String str2 = r5.A09;
        if (str2 != null) {
            r4.A0R(AnonymousClass000.A00(1746), str2);
        }
        r4.A0S("should_overlay_media", r5.A0D);
        r4.A0S("show_draw_button", r5.A0F);
        r4.A0S("should_enable_free_transform", r5.A0C);
        r4.A0S("is_mixed_text_mode", r5.A0B);
        r4.A0Z();
    }
}
