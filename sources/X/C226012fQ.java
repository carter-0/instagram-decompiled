package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import java.io.StringWriter;

/* renamed from: X.2fQ  reason: invalid class name and case insensitive filesystem */
public final class C226012fQ implements 1NF {
    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        0qQ.A0B(str, 0);
        AnonymousClass47I parseFromJson = C45127Cql.parseFromJson(16P.A00(str));
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        AnonymousClass47I r7 = (AnonymousClass47I) obj;
        0qQ.A0B(r7, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r7.A00 != null) {
            16P.A03(A0A, AnonymousClass000.A00(3733));
            for (C45465Cwy cwy : r7.A00) {
                if (cwy != null) {
                    A0A.A0c();
                    cwy.A02();
                    A0A.A0R("upcoming_event_id", cwy.A02());
                    UpcomingEventIDType upcomingEventIDType = cwy.A00;
                    if (upcomingEventIDType != null) {
                        A0A.A0R(AnonymousClass000.A00(1316), upcomingEventIDType.A00);
                        cwy.A01();
                        A0A.A0R(AnonymousClass000.A00(3875), cwy.A01().A00);
                        String str = cwy.A02;
                        if (str != null) {
                            A0A.A0R("media_pk", str);
                        }
                        A0A.A0Z();
                    } else {
                        0qQ.A0F("eventIdType");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
            }
            A0A.A0Y();
        }
        A0A.A0Z();
        A0A.close();
        String obj2 = stringWriter.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
