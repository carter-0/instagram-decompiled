package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public abstract class VBD {
    public static UOC parseFromJson(16F r5) {
        C16609Uy5 uy5;
        0qQ.A0B(r5, 0);
        try {
            UOC uoc = new UOC();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                ArrayList arrayList = null;
                if ("tokens".equals(A17)) {
                    if (r5.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r5.A1J() != 16L.A08) {
                            C15092UOk parseFromJson = C18191Vn5.parseFromJson(r5);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    }
                    0qQ.A0B(arrayList, 0);
                    uoc.A07 = arrayList;
                } else if (TraceFieldType.Duration.equals(A17)) {
                    uoc.A01 = r5.A1D();
                } else if ("karaoke_sticker_display_type".equals(A17)) {
                    String A1Q = r5.A1Q();
                    0qQ.A0B(A1Q, 0);
                    Map map = C16609Uy5.A03;
                    if (map.containsKey(A1Q)) {
                        Object obj = map.get(A1Q);
                        0qQ.A0A(obj);
                        uy5 = (C16609Uy5) obj;
                    } else {
                        uy5 = C16609Uy5.DYNAMIC_REVEAL;
                    }
                    0qQ.A0B(uy5, 0);
                    uoc.A02 = uy5;
                } else if ("color".equals(A17)) {
                    uoc.A00 = r5.A1D();
                } else if ("karaoke_sticker_emphasis_state".equals(A17)) {
                    uoc.A03 = A1S.A00(r5.A1Q());
                } else if ("sticker_id".equals(A17)) {
                    uoc.A06 = AnonymousClass7TG.A0l(r5);
                } else if ("is_clips_v2_media".equals(A17)) {
                    uoc.A08 = r5.A0d();
                } else if ("text_color".equals(A17)) {
                    uoc.A05 = AnonymousClass7TF.A0X(r5);
                } else if ("background_color".equals(A17)) {
                    uoc.A04 = AnonymousClass7TF.A0X(r5);
                }
                r5.A0z();
            }
            return uoc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
