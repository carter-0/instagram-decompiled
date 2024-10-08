package X;

import java.io.StringWriter;

/* renamed from: X.2fT  reason: invalid class name and case insensitive filesystem */
public final class C226022fT implements 1NF {
    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass47J parseFromJson = C63452KxH.parseFromJson(16P.A00(str));
        if (parseFromJson == null) {
            return new AnonymousClass47J();
        }
        return parseFromJson;
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        String str;
        AnonymousClass47J r7 = (AnonymousClass47J) obj;
        0qQ.A0B(r7, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        16P.A03(A0A, "pending_story_likes");
        for (LE3 le3 : r7.A00) {
            if (le3 != null) {
                A0A.A0c();
                String str2 = le3.A04;
                if (str2 != null) {
                    A0A.A0R("media_id", str2);
                    String str3 = le3.A01;
                    str = "action";
                    if (str3 != null) {
                        A0A.A0R(str, str3);
                        String str4 = le3.A02;
                        if (str4 != null) {
                            A0A.A0R("container_module", str4);
                            String str5 = le3.A03;
                            if (str5 != null) {
                                A0A.A0R("delivery_class", str5);
                            }
                            A0A.A0P("tray_position", le3.A00);
                            String str6 = le3.A05;
                            if (str6 != null) {
                                A0A.A0R("tray_session_id", str6);
                            }
                            String str7 = le3.A06;
                            if (str7 != null) {
                                A0A.A0R("viewer_session_id", str7);
                            }
                            A0A.A0Z();
                        } else {
                            str = "containerModule";
                        }
                    }
                } else {
                    str = "mediaId";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        A0A.A0Y();
        A0A.A0Z();
        A0A.close();
        String obj2 = stringWriter.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
