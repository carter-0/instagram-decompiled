package X;

import com.facebook.common.locale.LocaleMember;
import java.util.concurrent.ExecutionException;

/* renamed from: X.SEf  reason: case insensitive filesystem */
public final class C11179SEf {
    public final C635813i A00 = new C635913j(new T07(this, 2));
    public final C383889gQ A01 = new C383889gQ(new C367658rM(), new C8654Qyr(this, 1));
    public final C383889gQ A02 = new C383889gQ(new C367658rM(), new C8654Qyr(this, 0));

    public static LocaleMember A00(C11179SEf sEf, String str) {
        try {
            return (LocaleMember) sEf.A01.A00.A02(str);
        } catch (ExecutionException e) {
            SS5.A02(e);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
