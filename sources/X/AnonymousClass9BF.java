package X;

import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.user.model.User;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9BF  reason: invalid class name */
public final class AnonymousClass9BF implements AnonymousClass0lh {
    public static final long A07 = TimeUnit.HOURS.toMillis(24);
    public boolean A00;
    public final AnonymousClass9BG A01;
    public final AnonymousClass3EO A02;
    public final 0lg A03;
    public final 0BQ A04;
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final AtomicInteger A06;

    public final void onSessionWillEnd() {
        this.A00 = true;
    }

    public static final void A00(AnonymousClass9BF r9) {
        JSONObject jSONObject = new JSONObject();
        try {
            AnonymousClass9BG r0 = r9.A01;
            ConcurrentHashMap concurrentHashMap = r9.A05;
            Map map = r0.A02;
            map.clear();
            map.putAll(concurrentHashMap);
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (entry.getValue() != null) {
                    AccountFamily accountFamily = (AccountFamily) entry.getValue();
                    StringWriter stringWriter = new StringWriter();
                    17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
                    A0A.A0c();
                    String str = accountFamily.A02;
                    if (str != null) {
                        A0A.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
                    }
                    AnonymousClass9BP r02 = accountFamily.A00;
                    if (r02 != null) {
                        A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r02.name().toLowerCase(Locale.US));
                    }
                    if (accountFamily.A01 != null) {
                        A0A.A0q("account");
                        User user = accountFamily.A01;
                        Parcelable.Creator creator = User.CREATOR;
                        1aC.A08(A0A, user);
                    }
                    if (accountFamily.A04 != null) {
                        16P.A03(A0A, "main_accounts");
                        for (User user2 : accountFamily.A04) {
                            if (user2 != null) {
                                Parcelable.Creator creator2 = User.CREATOR;
                                1aC.A08(A0A, user2);
                            }
                        }
                        A0A.A0Y();
                    }
                    if (accountFamily.A03 != null) {
                        16P.A03(A0A, "child_accounts");
                        for (User user3 : accountFamily.A03) {
                            if (user3 != null) {
                                Parcelable.Creator creator3 = User.CREATOR;
                                1aC.A08(A0A, user3);
                            }
                        }
                        A0A.A0Y();
                    }
                    A0A.A0Z();
                    A0A.close();
                    jSONObject.put((String) entry.getKey(), stringWriter.toString());
                }
            }
            C62880wX r3 = C61170le.A00;
            0xm A002 = AnonymousClass0xl.A00(r3);
            String obj = jSONObject.toString();
            0qQ.A0B(obj, 0);
            0xY AR4 = A002.A00.AR4();
            AR4.E5g("account_linking_family_map_data", obj);
            AR4.apply();
            0xm A003 = AnonymousClass0xl.A00(r3);
            long currentTimeMillis = System.currentTimeMillis();
            0xY AR42 = A003.A00.AR4();
            AR42.E5c("account_linking_last_fetch_time", currentTimeMillis);
            AR42.apply();
        } catch (IOException | NullPointerException | JSONException unused) {
            0wb.A03("AccountLinkingDataFetcher", "Error parsing family map to the preference");
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.0Js] */
    public final void A01() {
        if (!this.A00) {
            AtomicInteger atomicInteger = this.A06;
            if (atomicInteger.get() == 0) {
                Set<String> BNz = this.A04.BNz();
                atomicInteger.set(BNz.size());
                for (String str : BNz) {
                    if (!09i.A0A.A0A(new Object(), (0Jv) null, new AnonymousClass9BK(new AnonymousClass9BJ(this, str)), str)) {
                        0wb.A03("AccountLinkingDataFetcher", 002.A0R("Failed to add account family fetching operation. want info for user: ", str));
                    }
                }
            }
        }
    }

    public AnonymousClass9BF(0lg r5) {
        this.A03 = r5;
        AnonymousClass9BG A012 = AnonymousClass9BG.A01(r5);
        0qQ.A07(A012);
        this.A01 = A012;
        this.A04 = AnonymousClass0BO.A00(r5);
        this.A02 = A012.A00;
        this.A06 = new AtomicInteger(0);
        this.A00 = r5.hasEnded();
        1ES.A05(new AnonymousClass9BI(this), 244, 3, true, true);
    }

    public final void A02() {
        AccountFamily accountFamily;
        long currentTimeMillis = System.currentTimeMillis() - AnonymousClass0xl.A00(C61170le.A00).A00.getLong("account_linking_last_fetch_time", 0);
        AnonymousClass9BG r2 = this.A01;
        0BQ r4 = r2.A01;
        int size = r4.BNz().size();
        Map map = r2.A02;
        if (size == map.size()) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (!r4.CO7(str) || ((accountFamily = (AccountFamily) map.get(str)) != null && accountFamily.A00 == AnonymousClass9BP.UNKNOWN)) {
                        break;
                    }
                } else if (currentTimeMillis <= A07) {
                    ConcurrentHashMap concurrentHashMap = this.A05;
                    map.clear();
                    map.putAll(concurrentHashMap);
                    return;
                }
            }
        }
        A01();
    }
}
