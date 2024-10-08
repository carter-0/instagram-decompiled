package X;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.facebook.commonavatarliveediting.api.CdlProviderHolderRegistry;
import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.instagram.rtc.activity.RtcCallActivity;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Oqi  reason: case insensitive filesystem */
public final class C71782Oqi implements C59900bo {
    public final int A00;
    public final Object A01;

    public C71782Oqi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final ArrayList BIF() {
        IntentFilter[] intentFilterArr;
        IntentFilter intentFilter;
        char c;
        String str;
        switch (this.A00) {
            case 0:
                intentFilterArr = new IntentFilter[1];
                str = "DESTROY_CDL_HOLDER";
                break;
            case 1:
                intentFilterArr = new IntentFilter[1];
                str = "DESTROY_ALE_HOLDER";
                break;
            case 2:
                intentFilterArr = new IntentFilter[2];
                intentFilterArr[0] = new IntentFilter("android.intent.action.SCREEN_ON");
                intentFilter = new IntentFilter(AnonymousClass000.A00(1087));
                c = 1;
                break;
            default:
                return AnonymousClass7TE.A1D(Collections.singletonList(new IntentFilter("android.intent.action.SCREEN_ON")));
        }
        intentFilter = new IntentFilter(str);
        c = 0;
        intentFilterArr[c] = intentFilter;
        return 0sr.A1L(intentFilterArr);
    }

    public final void Dbc(Context context, Intent intent, C59880bj r10) {
        switch (this.A00) {
            case 0:
                CommonCdlProviderHolder commonCdlProviderHolder = (CommonCdlProviderHolder) this.A01;
                if (commonCdlProviderHolder.A05.compareAndSet(false, true) && commonCdlProviderHolder.cdlProviderInstance != null) {
                    synchronized (commonCdlProviderHolder) {
                        CdlProviderHolderRegistry cdlProviderHolderRegistry = commonCdlProviderHolder.A00;
                        if (cdlProviderHolderRegistry == null) {
                            0qQ.A0F("cdlProviderHolderRegistry");
                        } else {
                            AnonymousClass0eM r5 = cdlProviderHolderRegistry.A01;
                            Iterator it = ((Set) AnonymousClass7TE.A14(r5)).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (commonCdlProviderHolder.equals(((Reference) next).get())) {
                                        if (next != null) {
                                            ((Set) AnonymousClass7TE.A14(r5)).remove(next);
                                        }
                                    }
                                }
                            }
                            if (((Set) AnonymousClass7TE.A14(r5)).isEmpty()) {
                                WeakReference weakReference = cdlProviderHolderRegistry.A00.A00;
                                if (weakReference == null) {
                                    0qQ.A0F("weakCdlProvider");
                                } else {
                                    weakReference.clear();
                                }
                            }
                            commonCdlProviderHolder.cdlProviderInstance = null;
                        }
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                0QV r1 = commonCdlProviderHolder.A01;
                if (r1 != null) {
                    commonCdlProviderHolder.A02.getApplicationContext().unregisterReceiver(r1);
                }
                commonCdlProviderHolder.A01 = null;
                return;
            case 1:
                ((C19018WGu) this.A01).AOt();
                return;
            case 2:
                0qQ.A0B(intent, 1);
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != -2128145023) {
                        if (hashCode == -1454123155 && action.equals("android.intent.action.SCREEN_ON")) {
                            C70845ONx oNx = ((RtcCallActivity) this.A01).A02;
                            if (oNx != null) {
                                oNx.A03(true);
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (action.equals(AnonymousClass000.A00(1087))) {
                        C70845ONx oNx2 = ((RtcCallActivity) this.A01).A02;
                        if (oNx2 != null) {
                            oNx2.A03(false);
                            return;
                        }
                    } else {
                        return;
                    }
                    0qQ.A0F("presenterBridge");
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            default:
                AnonymousClass7TG.A1N(context, intent);
                if (0qQ.A0K(intent.getAction(), "android.intent.action.SCREEN_ON") && ((KeyguardManager) C66582MXn.A0o(context)).isKeyguardLocked()) {
                    DbS.A1U(this.A01);
                    return;
                }
                return;
        }
    }
}
