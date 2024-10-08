package X;

import com.instagram.api.schemas.TextAppTextFragmentType;
import java.io.IOException;

public abstract class V8V {
    public static C15065UNi parseFromJson(16F r9) {
        String str;
        0qQ.A0B(r9, 0);
        try {
            if (r9.A11() != 16L.A0D) {
                r9.A0z();
                return null;
            }
            C15061UNe uNe = null;
            TextAppTextFragmentType textAppTextFragmentType = null;
            C15062UNf uNf = null;
            C47218Dt5 dt5 = null;
            String str2 = null;
            C15064UNh uNh = null;
            while (r9.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r9);
                if (C273654mx.A00(693).equals(A17)) {
                    uNe = V8O.parseFromJson(r9);
                } else if ("fragment_type".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r9.A1P();
                    }
                    textAppTextFragmentType = (TextAppTextFragmentType) TextAppTextFragmentType.A01.get(str);
                    if (textAppTextFragmentType == null) {
                        textAppTextFragmentType = TextAppTextFragmentType.UNRECOGNIZED;
                    }
                } else if ("link_fragment".equals(A17)) {
                    uNf = V8Q.parseFromJson(r9);
                } else if ("mention_fragment".equals(A17)) {
                    dt5 = C48355EdC.parseFromJson(r9);
                } else if ("plaintext".equals(A17)) {
                    if (r9.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r9.A1P();
                    }
                } else if ("tag_fragment".equals(A17)) {
                    uNh = V8T.parseFromJson(r9);
                }
                r9.A0z();
            }
            return new C15065UNi(uNe, uNf, dt5, uNh, textAppTextFragmentType, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
