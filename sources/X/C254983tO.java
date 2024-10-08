package X;

import com.instagram.api.schemas.REPETITION_UI_TYPE;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.3tO  reason: invalid class name and case insensitive filesystem */
public abstract class C254983tO {
    public static C53430GoN parseFromJson(16F r8) {
        String str;
        0qQ.A0B(r8, 0);
        try {
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            String str2 = null;
            ArrayList arrayList = null;
            REPETITION_UI_TYPE repetition_ui_type = null;
            String str3 = null;
            C275514qT r3 = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("dismiss_icon_resource_name".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("questions".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            C275534qV parseFromJson = C275494qR.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("render_mode".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    repetition_ui_type = (REPETITION_UI_TYPE) REPETITION_UI_TYPE.A01.get(str);
                    if (repetition_ui_type == null) {
                        repetition_ui_type = REPETITION_UI_TYPE.UNRECOGNIZED;
                    }
                } else if ("repetition_target_type".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("undo_button".equals(A0q)) {
                    r3 = C275504qS.parseFromJson(r8);
                }
                r8.A0z();
            }
            return new C53430GoN(r3, repetition_ui_type, str2, str3, arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
