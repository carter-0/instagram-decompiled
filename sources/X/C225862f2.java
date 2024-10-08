package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.StringWriter;

/* renamed from: X.2f2  reason: invalid class name and case insensitive filesystem */
public final class C225862f2 implements 1NF {
    public final /* bridge */ /* synthetic */ String END(Object obj) {
        C246913fR r8 = (C246913fR) obj;
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        if (r8.A00 != null) {
            16P.A03(A0A, AnonymousClass000.A00(3729));
            for (C267094ax r3 : r8.A00) {
                if (r3 != null) {
                    A0A.A0c();
                    A0A.A0Q("creation_time", r3.A00);
                    String str = r3.A03;
                    if (str != null) {
                        A0A.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                    }
                    String str2 = r3.A02;
                    if (str2 != null) {
                        A0A.A0R(AnonymousClass000.A00(3887), str2);
                    }
                    String str3 = r3.A01;
                    if (str3 != null) {
                        A0A.A0R("radio_type", str3);
                    }
                    A0A.A0Z();
                }
            }
            A0A.A0Y();
        }
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }

    public final /* bridge */ /* synthetic */ Object E1p(String str) {
        return C45114CqX.parseFromJson(16P.A00(str));
    }
}
