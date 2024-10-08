package X;

import android.os.Bundle;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

public final class Sm0 implements CallerContextable {
    public static final CallerContext A06 = CallerContext.A00(Sm0.class);
    public static final String __redex_internal_original_name = "IGAutofillProvider";
    public Bundle A00;
    public C11238SGy A01;
    public UserSession A02;
    public HashMap A03;
    public List A04;
    public boolean A05;

    public static void A00(Sm0 sm0, String str, String str2) {
        HashMap hashMap = sm0.A03;
        if (hashMap.get(str) == null) {
            hashMap.put(str, AnonymousClass7TE.A1C());
        }
        Object obj = hashMap.get(str);
        obj.getClass();
        ((List) obj).add(str2);
    }
}
