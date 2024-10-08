package X;

import com.google.common.collect.ImmutableList;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.ArrayList;

/* renamed from: X.9qE  reason: invalid class name and case insensitive filesystem */
public final class C389799qE extends C252733pa {
    public final C63622L0k A00;

    public static final DirectThreadThemeInfo A00(C382829ea r63, C382829ea r64, String str) {
        String str2;
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        Integer num = AnonymousClass05K.A00;
        Integer num2 = AnonymousClass05K.A01;
        C382829ea r0 = r63;
        String A09 = r0.A09("accessibility_label");
        String A0A = r0.A0A("fallback_color");
        C382829ea r1 = r64;
        String A0A2 = r1.A0A("fallback_color");
        ImmutableList requiredCompactedStringListField = r0.getRequiredCompactedStringListField(4, "gradient_colors");
        ImmutableList requiredCompactedStringListField2 = r1.getRequiredCompactedStringListField(4, "gradient_colors");
        A1C.clear();
        if (requiredCompactedStringListField != null) {
            A1C.addAll(requiredCompactedStringListField);
        }
        A1C2.clear();
        if (requiredCompactedStringListField2 != null) {
            A1C2.addAll(requiredCompactedStringListField2);
        }
        Class<C382819eZ> cls = C382819eZ.class;
        C250663lr optionalTreeField3 = r0.getOptionalTreeField(19, "background_asset", cls, -1313231216);
        String str3 = null;
        if (optionalTreeField3 == null || (optionalTreeField2 = optionalTreeField3.getOptionalTreeField(0, "image(height:1280,width:1280)", C382809eY.class, 1661460164)) == null) {
            str2 = null;
        } else {
            str2 = optionalTreeField2.getOptionalStringField(0, "uri");
        }
        C250663lr optionalTreeField4 = r1.getOptionalTreeField(19, "background_asset", cls, -1313231216);
        if (!(optionalTreeField4 == null || (optionalTreeField = optionalTreeField4.getOptionalTreeField(0, "image(height:1280,width:1280)", C382809eY.class, 1661460164)) == null)) {
            str3 = optionalTreeField.getOptionalStringField(0, "uri");
        }
        ImmutableList requiredCompactedStringListField3 = r0.getRequiredCompactedStringListField(7, "inbound_message_gradient_colors");
        0qQ.A07(requiredCompactedStringListField3);
        String A19 = AnonymousClass7TE.A19(requiredCompactedStringListField3, 0);
        ImmutableList requiredCompactedStringListField4 = r1.getRequiredCompactedStringListField(7, "inbound_message_gradient_colors");
        0qQ.A07(requiredCompactedStringListField4);
        String A192 = AnonymousClass7TE.A19(requiredCompactedStringListField4, 0);
        String optionalStringField = r0.getOptionalStringField(12, "navigation_bar_color");
        String optionalStringField2 = r1.getOptionalStringField(12, "navigation_bar_color");
        String optionalStringField3 = r0.getOptionalStringField(13, "bottom_gradient_color");
        String optionalStringField4 = r1.getOptionalStringField(13, "bottom_gradient_color");
        String optionalStringField5 = r0.getOptionalStringField(14, "composer_input_background_color");
        String optionalStringField6 = r1.getOptionalStringField(14, "composer_input_background_color");
        String optionalStringField7 = r0.getOptionalStringField(15, "message_text_color");
        return new DirectThreadThemeInfo(num2, num, A09, (String) null, (String) null, str3, optionalStringField4, (String) null, (String) null, (String) null, r1.getOptionalStringField(15, "message_text_color"), (String) null, r1.getOptionalStringField(20, "ai_generated_background_uri"), (String) null, (String) null, r1.getOptionalStringField(15, "message_text_color"), (String) null, optionalStringField6, A0A2, A192, optionalStringField2, (String) null, (String) null, r0.getOptionalStringField(20, "ai_generated_background_uri"), (String) null, str2, optionalStringField3, (String) null, (String) null, (String) null, optionalStringField7, (String) null, (String) null, (String) null, r0.getOptionalStringField(15, "message_text_color"), (String) null, optionalStringField5, A0A, A19, optionalStringField, (String) null, str, A1C4, A1C2, A1C3, A1C, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public C389799qE(C63622L0k l0k) {
        super("AiThemes", AnonymousClass43D.A00(1971697375));
        this.A00 = l0k;
    }
}
