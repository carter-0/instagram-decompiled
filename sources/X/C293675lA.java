package X;

import com.instagram.model.keyword.Keyword;
import java.io.StringWriter;

/* renamed from: X.5lA  reason: invalid class name and case insensitive filesystem */
public final class C293675lA implements C363348jZ {
    public final /* bridge */ /* synthetic */ Object AOn(String str) {
        0qQ.A0B(str, 0);
        Keyword parseFromJson = C67385Mn1.parseFromJson(16P.A00(str));
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final /* bridge */ /* synthetic */ String Ah7(Object obj) {
        Keyword keyword = (Keyword) obj;
        0qQ.A0B(keyword, 0);
        return keyword.A04;
    }

    public final /* bridge */ /* synthetic */ String END(Object obj) {
        Keyword keyword = (Keyword) obj;
        0qQ.A0B(keyword, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        C67385Mn1.A00(A0A, keyword);
        A0A.close();
        String obj2 = stringWriter.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
