package X;

import com.instagram.api.schemas.NoteActivationType;
import com.instagram.api.schemas.NoteCustomThemeImpl;
import java.io.IOException;

/* renamed from: X.54s  reason: invalid class name and case insensitive filesystem */
public abstract class C2809154s {
    public static NoteCustomThemeImpl parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            NoteActivationType noteActivationType = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("activation_type".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    noteActivationType = (NoteActivationType) NoteActivationType.A01.get(str);
                    if (noteActivationType == null) {
                        noteActivationType = NoteActivationType.UNRECOGNIZED;
                    }
                } else if ("background_color_hex".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("custom_emoji".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("stroke_color".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("text_color_hex".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r8.A1P();
                    }
                }
                r8.A0z();
            }
            return new NoteCustomThemeImpl(noteActivationType, str2, str3, str4, str5);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, NoteCustomThemeImpl noteCustomThemeImpl) {
        r2.A0c();
        NoteActivationType noteActivationType = noteCustomThemeImpl.A00;
        if (noteActivationType != null) {
            r2.A0R("activation_type", noteActivationType.A00);
        }
        String str = noteCustomThemeImpl.A01;
        if (str != null) {
            r2.A0R("background_color_hex", str);
        }
        String str2 = noteCustomThemeImpl.A02;
        if (str2 != null) {
            r2.A0R("custom_emoji", str2);
        }
        String str3 = noteCustomThemeImpl.A03;
        if (str3 != null) {
            r2.A0R("stroke_color", str3);
        }
        String str4 = noteCustomThemeImpl.A04;
        if (str4 != null) {
            r2.A0R("text_color_hex", str4);
        }
        r2.A0Z();
    }
}
