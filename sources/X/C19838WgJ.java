package X;

import android.content.Context;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.WgJ  reason: case insensitive filesystem */
public final class C19838WgJ implements C41823B2e {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final HashMap A03 = new HashMap();

    public final void A8e(C282745Eo r8) {
        HashMap hashMap;
        UserSession userSession = this.A02;
        27p.A01(userSession).A04.A04();
        String str = r8.A05;
        0qQ.A07(str);
        try {
            C365358my A012 = AnonymousClass9S9.A01(this.A01, str, this.A00, 00p.A0i(AnonymousClass7TF.A0j(str), ".pkm", false), true);
            if (182.A06(0Tu.A05, userSession, 36321146853008520L)) {
                hashMap = this.A03;
                if (A012 == null) {
                    throw new NullPointerException("Required value was null.");
                }
            } else if (A012 != null) {
                hashMap = this.A03;
            } else {
                A00((Exception) null, str, r8.A01, r8.A00);
                return;
            }
            hashMap.put(r8, A012);
            27p.A01(userSession).A04.A05();
        } catch (Exception e) {
            A00(e, str, r8.A01, r8.A00);
            throw e;
        }
    }

    private final void A00(Exception exc, String str, int i, int i2) {
        UserSession userSession = this.A02;
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
        return (C365358my) this.A03.get(r2);
    }

    public final void cleanup() {
        HashMap hashMap = this.A03;
        Iterator A0u = C13989Tnp.A0u(hashMap);
        while (A0u.hasNext()) {
            ((C367418qi) A0u.next()).cleanup();
        }
        hashMap.clear();
    }

    public C19838WgJ(Context context, UserSession userSession, int i) {
        AnonymousClass7TG.A1O(userSession, context);
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = i;
    }
}
