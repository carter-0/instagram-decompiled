package X;

import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;

public abstract class Hd6 {
    public static final String A00(C53318Gm4 gm4) {
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        String str = gm4.A05;
        if (str != null) {
            A0K.A0R("ad_id", str);
        }
        Integer num = gm4.A03;
        if (num != null) {
            A0K.A0R("rendering_type", Hd7.A00(num));
        }
        Boolean bool = gm4.A00;
        if (bool != null) {
            A0K.A0S("has_audio_in_ad", bool.booleanValue());
        }
        Boolean bool2 = gm4.A01;
        if (bool2 != null) {
            A0K.A0S("has_interactivity_tooltip", bool2.booleanValue());
        }
        List list = gm4.A09;
        if (list != null) {
            Iterator A0s = C41845B3m.A0s(A0K, "image_prefetch_urls", list);
            while (A0s.hasNext()) {
                C41846B3n.A18(A0K, A0s);
            }
            A0K.A0Y();
        }
        List list2 = gm4.A0A;
        if (list2 != null) {
            Iterator A0s2 = C41845B3m.A0s(A0K, "video_prefetch_urls", list2);
            while (A0s2.hasNext()) {
                C41846B3n.A18(A0K, A0s2);
            }
            A0K.A0Y();
        }
        List list3 = gm4.A08;
        if (list3 != null) {
            Iterator A0s3 = C41845B3m.A0s(A0K, "audio_prefetch_urls", list3);
            while (A0s3.hasNext()) {
                C41846B3n.A18(A0K, A0s3);
            }
            A0K.A0Y();
        }
        String str2 = gm4.A07;
        if (str2 != null) {
            A0K.A0R("template_name", str2);
        }
        String str3 = gm4.A06;
        if (str3 != null) {
            A0K.A0R("client_name", str3);
        }
        Integer num2 = gm4.A02;
        if (num2 != null) {
            A0K.A0P("image_prefetch_urls_count", num2.intValue());
        }
        Integer num3 = gm4.A04;
        if (num3 != null) {
            A0K.A0P("video_prefetch_urls_count", num3.intValue());
        }
        A0K.A0Z();
        A0K.close();
        return DbT.A10(stringWriter);
    }
}
