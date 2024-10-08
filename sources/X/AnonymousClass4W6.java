package X;

import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.reels.store.ReelStore;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.4W6  reason: invalid class name */
public final class AnonymousClass4W6 implements Runnable {
    public final /* synthetic */ AnonymousClass3PW A00;
    public final /* synthetic */ AnonymousClass3PT A01;
    public final /* synthetic */ Map A02;

    public AnonymousClass4W6(AnonymousClass3PW r1, AnonymousClass3PT r2, Map map) {
        this.A01 = r2;
        this.A02 = map;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3PT r3 = this.A01;
        Map map = this.A02;
        if (Systrace.A0E(1)) {
            0fS.A01("ReelLoader.loadStoredMedias", -449916886);
        }
        try {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                List list = (List) entry.getValue();
                UserSession userSession = r3.A02;
                Reel A0M = ReelStore.A03(userSession).A0M(str);
                if (A0M != null) {
                    if (!list.isEmpty()) {
                        synchronized (A0M.A1n) {
                            if (A0M.A19.isEmpty()) {
                                A0M.A0X(list);
                                ArrayList arrayList = A0M.A0t;
                                if (arrayList != null) {
                                    Reel.A01(A0M, new HashSet(arrayList));
                                }
                                A0M.A1N = true;
                            }
                        }
                    }
                    if (A0M.A0z(userSession)) {
                        hashMap.put(str, A0M);
                    }
                }
            }
            if (Systrace.A0E(1)) {
                0fS.A00(741090116);
            }
            if (!hashMap.isEmpty()) {
                r3.A03.A01(hashMap);
            }
            HashSet hashSet = new HashSet(r3.A04);
            hashSet.removeAll(hashMap.keySet());
            try {
                if (!hashSet.isEmpty()) {
                    this.A00.A00(AnonymousClass3PT.A00(r3, hashSet));
                }
            } catch (IOException e) {
                0KC.A0G(C49295Ese.A00, "Failed to create a reels media network task", e);
            }
        } catch (Throwable th) {
            if (Systrace.A0E(1)) {
                0fS.A00(1902026462);
            }
            throw th;
        }
    }
}
