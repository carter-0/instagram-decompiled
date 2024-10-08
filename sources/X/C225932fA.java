package X;

import com.facebook.proxygen.TraceFieldType;
import java.io.StringWriter;
import java.util.Map;

/* renamed from: X.2fA  reason: invalid class name and case insensitive filesystem */
public final class C225932fA implements 1NF {
    public final /* bridge */ /* synthetic */ String END(Object obj) {
        C254693st r8 = (C254693st) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r8.A00 != null) {
            A0A.A0q(AnonymousClass000.A00(3730));
            A0A.A0c();
            for (Map.Entry entry : r8.A00.entrySet()) {
                if (!16P.A04(A0A, entry)) {
                    C230262pI r5 = (C230262pI) entry.getValue();
                    A0A.A0c();
                    String str = r5.A02;
                    if (str != null) {
                        A0A.A0R(TraceFieldType.RequestID, str);
                    }
                    if (r5.A03 != null) {
                        A0A.A0q(AnonymousClass000.A00(3936));
                        A0A.A0c();
                        for (Map.Entry entry2 : r5.A03.entrySet()) {
                            if (!16P.A04(A0A, entry2)) {
                                C45708D2h.A00(A0A, (C308416Ue) entry2.getValue());
                            }
                        }
                        A0A.A0Z();
                    }
                    if (r5.A05 != null) {
                        A0A.A0q(AnonymousClass000.A00(4013));
                        A0A.A0c();
                        for (Map.Entry entry3 : r5.A05.entrySet()) {
                            if (!16P.A04(A0A, entry3)) {
                                C45708D2h.A00(A0A, (C308416Ue) entry3.getValue());
                            }
                        }
                        A0A.A0Z();
                    }
                    if (r5.A04 != null) {
                        A0A.A0q(AnonymousClass000.A00(3937));
                        A0A.A0c();
                        for (Map.Entry entry4 : r5.A04.entrySet()) {
                            if (!16P.A04(A0A, entry4)) {
                                A0A.A0t((String) entry4.getValue());
                            }
                        }
                        A0A.A0Z();
                    }
                    if (r5.A06 != null) {
                        A0A.A0q(AnonymousClass000.A00(4014));
                        A0A.A0c();
                        for (Map.Entry entry5 : r5.A06.entrySet()) {
                            if (!16P.A04(A0A, entry5)) {
                                A0A.A0t((String) entry5.getValue());
                            }
                        }
                        A0A.A0Z();
                    }
                    if (r5.A07 != null) {
                        16P.A03(A0A, "force_seen_story_ids");
                        for (String str2 : r5.A07) {
                            if (str2 != null) {
                                A0A.A0t(str2);
                            }
                        }
                        A0A.A0Y();
                    }
                    String str3 = r5.A01;
                    if (str3 != null) {
                        A0A.A0R("container_module", str3);
                    }
                    String str4 = r5.A00;
                    if (str4 != null) {
                        A0A.A0R("notification_type", str4);
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
        return C45121Cqf.parseFromJson(16P.A00(str));
    }
}
