package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class WXN implements X4B, X85 {
    public final UserSession A00;
    public final X98 A01;
    public final HashMap A02 = new HashMap();

    public final void A8e(C282745Eo r12) {
        Throwable th;
        Set set;
        C365358my r6;
        HashMap hashMap;
        C17982VjK vjK;
        UserSession userSession = this.A00;
        27p.A01(userSession).A04.A04();
        String str = r12.A05;
        0qQ.A07(str);
        boolean A0i = 00p.A0i(AnonymousClass7TF.A0j(str), ".pkm", false);
        try {
            C14264Tsm tsm = (C14264Tsm) this.A01;
            tsm.A06.add(this);
            C14263Tsl tsl = tsm.A00;
            Map map = tsl.A02;
            if (!map.containsKey(this)) {
                set = new HashSet();
                map.put(this, set);
            } else {
                Object obj = map.get(this);
                if (obj != null) {
                    set = (Set) obj;
                } else {
                    th = AnonymousClass7TE.A0y();
                    throw th;
                }
            }
            synchronized (tsl) {
                try {
                    Map map2 = tsl.A04;
                    if (!map2.containsKey(str)) {
                        r6 = null;
                        C365358my A012 = AnonymousClass9S9.A01(tsl.A00, str, 2, A0i, false);
                        if (A012 != null) {
                            vjK = new C17982VjK(A012, str);
                            AnonymousClass9S9.A05("TextureManager.loadTexture");
                            map2.put(str, vjK);
                        }
                    } else {
                        Object obj2 = map2.get(str);
                        if (obj2 != null) {
                            vjK = (C17982VjK) obj2;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                    if (set.add(vjK)) {
                        vjK.A00++;
                    }
                    r6 = vjK.A01;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (182.A06(0Tu.A05, userSession, 36321146853008520L)) {
                hashMap = this.A02;
                if (r6 == null) {
                    th = new NullPointerException("Required value was null.");
                    throw th;
                }
            } else if (r6 != null) {
                hashMap = this.A02;
            } else {
                A00((Exception) null, str, r12.A01, r12.A00);
                return;
            }
            hashMap.put(r12, r6);
            27p.A01(userSession).A04.A05();
        } catch (Exception e) {
            A00(e, str, r12.A01, r12.A00);
            throw e;
        }
    }

    private final void A00(Exception exc, String str, int i, int i2) {
        UserSession userSession = this.A00;
        27p.A01(userSession).A04.A03();
        boolean A06 = 182.A06(0Tu.A06, userSession, 36324372373319725L);
        0f9 AEf = 0wj.A01.AEf("ImageTextureProvider_null_texture", 817900495);
        AEf.ABQ(DialogModule.KEY_MESSAGE, 002.A0R("path=", str));
        AEf.ABR("emptyPath", AnonymousClass7TF.A1Q(str.length()));
        AEf.ABO(IgReactMediaPickerNativeModule.WIDTH, i);
        AEf.ABO(IgReactMediaPickerNativeModule.HEIGHT, i2);
        AEf.ABR("renderStaticStickersIndividually", A06);
        AEf.ERJ(exc);
        AEf.report();
    }

    public final C365358my C5l(C282745Eo r2, long j, long j2) {
        return (C365358my) this.A02.get(r2);
    }

    public final void cleanup() {
        HashMap hashMap = this.A02;
        Iterator A0u = C13989Tnp.A0u(hashMap);
        while (A0u.hasNext()) {
            ((C367418qi) A0u.next()).cleanup();
        }
        hashMap.clear();
    }

    public WXN(UserSession userSession, X98 x98) {
        AnonymousClass7TG.A1O(userSession, x98);
        this.A00 = userSession;
        this.A01 = x98;
    }

    public final void AHH(X98 x98) {
        cleanup();
    }
}
