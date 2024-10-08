package X;

import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CVj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44092CVj {
    public static Map A00(DV5 dv5) {
        String str;
        String str2;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        String str3 = null;
        if (dv5.Aah() != null) {
            ClipsTextAlignment Aah = dv5.Aah();
            if (Aah != null) {
                str2 = Aah.A00;
            } else {
                str2 = null;
            }
            A1H.put("alignment", str2);
        }
        if (dv5.Ap5() != null) {
            List<C248643iK> Ap5 = dv5.Ap5();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C248643iK r0 : Ap5) {
                if (r0 != null) {
                    A1C.add(r0.FHC());
                }
            }
            A1H.put("colors", A1C);
        }
        if (dv5.B1i() != null) {
            C41846B3n.A1Q(dv5.B1i(), A1H);
        }
        if (dv5.B79() != null) {
            A1H.put("font_size", AnonymousClass7TH.A0D(dv5.B79()));
        }
        if (dv5.BCt() != null) {
            C41846B3n.A1O(dv5.BCt(), A1H);
        }
        if (dv5.COk() != null) {
            A1H.put("is_animated", dv5.COk());
        }
        if (dv5.CTZ() != null) {
            A1H.put("is_feels_like_ig", dv5.CTZ());
        }
        if (dv5.BXt() != null) {
            A1H.put("offset_x", AnonymousClass7TH.A0D(dv5.BXt()));
        }
        if (dv5.BXv() != null) {
            A1H.put("offset_y", AnonymousClass7TH.A0D(dv5.BXv()));
        }
        if (dv5.Boh() != null) {
            A1H.put("rotation_degree", AnonymousClass7TH.A0D(dv5.Boh()));
        }
        if (dv5.BpV() != null) {
            A1H.put("scale", AnonymousClass7TH.A0D(dv5.BpV()));
        }
        if (dv5.Byt() != null) {
            C41846B3n.A1R(dv5.Byt(), A1H);
        }
        if (dv5.getText() != null) {
            C41845B3m.A10(dv5.getText(), A1H);
        }
        if (dv5.C56() != null) {
            ClipsTextEmphasisMode C56 = dv5.C56();
            if (C56 != null) {
                str = C56.A00;
            } else {
                str = null;
            }
            A1H.put("text_emphasis_mode", str);
        }
        if (dv5.C5D() != null) {
            ClipsTextFormatType C5D = dv5.C5D();
            if (C5D != null) {
                str3 = C5D.A00;
            }
            A1H.put("text_format_type", str3);
        }
        if (dv5.CGX() != null) {
            C41846B3n.A1N(dv5.CGX(), A1H);
        }
        if (dv5.CHa() != null) {
            A1H.put("z_index", dv5.CHa());
        }
        return 0Yt.A0B(A1H);
    }
}
