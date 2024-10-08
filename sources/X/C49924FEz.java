package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.FEz  reason: case insensitive filesystem */
public final class C49924FEz {
    public final Map A00 = AnonymousClass7TE.A1E();
    public final Map A01 = AnonymousClass7TE.A1E();

    public final void A03(String str, String str2) {
        AnonymousClass7TF.A1H(str, str2);
        Map map = this.A01;
        List list = (List) map.get(str);
        if (list == null) {
            list = new LinkedList();
            map.put(str, list);
        }
        if (list.size() >= 10) {
            list.remove(0);
        }
        list.add(str2);
    }

    public static final void A01(C49924FEz fEz) {
        ArrayList A0e = Dba.A0e(fEz.A00);
        0xm A0e2 = DbS.A0e();
        StringWriter stringWriter = new StringWriter();
        17W A0K = AnonymousClass7TF.A0K(stringWriter);
        16P.A03(A0K, "nonce_list");
        Iterator it = A0e.iterator();
        while (it.hasNext()) {
            C49551Exm exm = (C49551Exm) it.next();
            if (exm != null) {
                A0K.A0c();
                String str = exm.A02;
                if (str != null) {
                    A0K.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                }
                String str2 = exm.A01;
                if (str2 != null) {
                    A0K.A0R("nonce", str2);
                }
                A0K.A0Q("last_updated_at", exm.A00);
                A0K.A0Z();
            }
        }
        A0K.A0Y();
        String A0k = AnonymousClass7TG.A0k(A0K, stringWriter);
        0xY A0d = DbS.A0d(A0e2);
        A0d.E5g("two_fac_trusted_device_nonce_user_map", A0k);
        A0d.apply();
    }

    public C49924FEz() {
        A00(this);
    }

    public static final void A00(C49924FEz fEz) {
        String string = DbV.A0d().getString("two_fac_trusted_device_nonce_user_map", (String) null);
        if (string != null && string.length() != 0) {
            try {
                List<C49551Exm> list = C48980EnI.parseFromJson(16P.A00(string)).A00;
                if (list != null) {
                    for (C49551Exm exm : list) {
                        fEz.A00.put(exm.A02, exm);
                    }
                }
            } catch (IOException e) {
                0wb.A07("Two fac secure nonce manager", e);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.Exm] */
    public final void A02(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        Map map = this.A00;
        long currentTimeMillis = System.currentTimeMillis();
        ? obj = new Object();
        obj.A02 = str;
        obj.A01 = str2;
        obj.A00 = currentTimeMillis;
        map.put(str, obj);
        try {
            A01(this);
        } catch (IOException e) {
            0wb.A07("Two fac secure nonce manager", e);
        }
    }
}
