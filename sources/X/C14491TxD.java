package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.TxD  reason: case insensitive filesystem */
public abstract class C14491TxD {
    public static final AnonymousClass2hV A00 = C14494TxG.A00;

    public static final List A00(UserSession userSession, C363288jT r7, String str) {
        List A01;
        char charAt;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r7, 2);
        String str2 = str;
        if (!TextUtils.isEmpty(str) && ((charAt = str.charAt(0)) == '@' || charAt == '#')) {
            str2 = str.substring(1);
        }
        0qQ.A07(str2);
        HashSet hashSet = new HashSet();
        r7.A08((1UV) null, "autocomplete_user_list", str, hashSet);
        C14017ToJ A002 = C14025ToR.A00(userSession);
        synchronized (A002) {
            A01 = A002.A00.A01();
        }
        C336427eb.A00((1UV) null, str2, A01, hashSet);
        List A012 = C67393MnA.A01(hashSet);
        r7.A07(A00, "autocomplete_user_list", (Comparator) null, A012);
        0qQ.A0C(A012, "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.search.common.model.UserSearchEntry>");
        return 0u4.A01(A012);
    }
}
