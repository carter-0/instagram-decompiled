package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: X.2fM  reason: invalid class name */
public final class AnonymousClass2fM implements 1NF {
    public final /* bridge */ /* synthetic */ String END(Object obj) {
        AnonymousClass47H r7 = (AnonymousClass47H) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r7.A00 != null) {
            A0A.A0q("pending_clips_seen_states");
            A0A.A0c();
            for (Map.Entry entry : r7.A00.entrySet()) {
                if (!16P.A04(A0A, entry)) {
                    AnonymousClass2fN r2 = (AnonymousClass2fN) entry.getValue();
                    A0A.A0c();
                    String str = r2.A00;
                    if (str != null) {
                        A0A.A0R(TraceFieldType.RequestID, str);
                    }
                    if (r2.A02 != null) {
                        16P.A03(A0A, "seen_clip_ids");
                        for (String str2 : r2.A02) {
                            if (str2 != null) {
                                A0A.A0t(str2);
                            }
                        }
                        A0A.A0Y();
                    }
                    if (r2.A01 != null) {
                        A0A.A0q("blend_impressions");
                        A0A.A0c();
                        for (Map.Entry entry2 : r2.A01.entrySet()) {
                            if (!16P.A04(A0A, entry2)) {
                                A0A.A0t((String) entry2.getValue());
                            }
                        }
                        A0A.A0Z();
                    }
                    A0A.A0Z();
                }
            }
            A0A.A0Z();
        }
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }

    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        return AnonymousClass5JF.parseFromJson(16P.A00(str));
    }
}
