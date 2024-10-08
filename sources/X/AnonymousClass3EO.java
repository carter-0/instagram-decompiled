package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

/* renamed from: X.3EO  reason: invalid class name */
public final class AnonymousClass3EO {
    public 0lg A00;
    public HashMap A01;
    public HashMap A02;

    public static AnonymousClass3EO A00(0lg r2) {
        return (AnonymousClass3EO) r2.A01(AnonymousClass3EO.class, new AnonymousClass3EP(r2));
    }

    public final HashSet A02() {
        HashSet hashSet = new HashSet();
        HashMap hashMap = this.A01;
        if (hashMap != null) {
            hashSet.addAll(hashMap.keySet());
        }
        HashMap hashMap2 = this.A02;
        if (hashMap2 != null) {
            hashSet.addAll(hashMap2.keySet());
        }
        return hashSet;
    }

    public final void A03() {
        AnonymousClass9BG A012 = AnonymousClass9BG.A01(this.A00);
        HashSet hashSet = new HashSet();
        for (AccountFamily accountFamily : A012.A02.values()) {
            for (User id : accountFamily.A03) {
                hashSet.add(id.getId());
            }
        }
        Iterator it = this.A01.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!hashSet.contains(((C49537ExJ) ((Map.Entry) it.next()).getValue()).A00.A01.getId())) {
                it.remove();
                z = true;
            }
        }
        if (z) {
            A04(this.A01.values());
        }
    }

    public final void A05(Collection collection) {
        if (collection != null) {
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C49557Exs exs = (C49557Exs) it.next();
                    this.A02.put(exs.A00.getId(), exs);
                }
                LinkedList<C49557Exs> linkedList = new LinkedList<>(this.A02.values());
                StringWriter stringWriter = new StringWriter();
                17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                A0A.A0c();
                16P.A03(A0A, AnonymousClass000.A00(1066));
                for (C49557Exs exs2 : linkedList) {
                    if (exs2 != null) {
                        A0A.A0c();
                        String str = exs2.A01;
                        if (str != null) {
                            A0A.A0R("one_tap_nonce", str);
                        }
                        if (exs2.A00 != null) {
                            A0A.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                            User user = exs2.A00;
                            Parcelable.Creator creator = User.CREATOR;
                            1aC.A08(A0A, user);
                        }
                        A0A.A0S(AnonymousClass000.A00(3447), exs2.A02);
                        A0A.A0Z();
                    }
                }
                A0A.A0Y();
                A0A.A0Z();
                A0A.close();
                String obj = stringWriter.toString();
                0xm A002 = AnonymousClass0xl.A00(C61170le.A00);
                0qQ.A0B(obj, 0);
                0xY AR4 = A002.A00.AR4();
                AR4.E5g("deferred_recovered_account_data", obj);
                AR4.apply();
            } catch (IOException e) {
                0wb.A03("DeferredAccountHelper", 002.A0R("Unable to save deferred accounts. Error: ", e.getMessage()));
            }
        }
    }

    public static void A01(AnonymousClass3EO r4, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C49537ExJ exJ = (C49537ExJ) it.next();
            if (r4.A02.remove(exJ.A00.A01.getId()) != null) {
                r4.A05(r4.A02.values());
            }
            r4.A01.put(exJ.A00.A01.getId(), exJ);
        }
    }

    public final void A04(Collection collection) {
        try {
            A01(this, collection);
            LinkedList<C49537ExJ> linkedList = new LinkedList<>(this.A01.values());
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            16P.A03(A0A, AnonymousClass000.A00(1066));
            for (C49537ExJ exJ : linkedList) {
                if (exJ != null) {
                    A0A.A0c();
                    String str = exJ.A01;
                    if (str != null) {
                        A0A.A0R(AnonymousClass000.A00(1567), str);
                    }
                    String str2 = exJ.A02;
                    if (str2 != null) {
                        A0A.A0R("one_tap_nonce", str2);
                    }
                    if (exJ.A00 != null) {
                        A0A.A0q(AnonymousClass000.A00(4172));
                        AnonymousClass9GU r2 = exJ.A00;
                        A0A.A0c();
                        if (r2.A01 != null) {
                            A0A.A0q(PublicKeyCredentialControllerUtility.JSON_KEY_USER);
                            User user = r2.A01;
                            Parcelable.Creator creator = User.CREATOR;
                            1aC.A08(A0A, user);
                        }
                        A0A.A0Q("link_time", r2.A00);
                        A0A.A0Z();
                    }
                    A0A.A0Z();
                }
            }
            A0A.A0Y();
            A0A.A0Z();
            A0A.close();
            String obj = stringWriter.toString();
            0xm A002 = AnonymousClass0xl.A00(C61170le.A00);
            0qQ.A0B(obj, 0);
            0xY AR4 = A002.A00.AR4();
            AR4.E5g("deferred_account_data", obj);
            AR4.apply();
        } catch (IOException e) {
            0wb.A03("DeferredAccountHelper", 002.A0R("Unable to save deferred accounts. Error: ", e.getMessage()));
        }
    }
}
