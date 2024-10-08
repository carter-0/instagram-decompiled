package com.instagram.urlhandlers.aradstestlink;

import X.09i;
import X.AnonymousClass0wW;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class ArAdsTestLinkUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = -662436212(0xffffffffd884068c, float:-1.16130923E15)
            int r0 = X.AnonymousClass0fD.A00(r0)
            r8 = r17
            r1 = r18
            super.onCreate(r1)
            android.content.Intent r2 = r8.getIntent()
            X.0qQ.A07(r2)
            r1 = 13
            java.lang.String r1 = X.Pxd.A00(r1)
            android.os.Bundle r2 = r2.getBundleExtra(r1)
            r15 = 0
            if (r2 == 0) goto L_0x00e7
            java.lang.String r1 = "original_url"
            java.lang.String r1 = r2.getString(r1)
            if (r1 == 0) goto L_0x00e7
            android.net.Uri r7 = X.0cp.A03(r1)     // Catch:{ SecurityException -> 0x0075 }
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r6 = "encoded_token"
            java.lang.String r1 = r7.getQueryParameter(r6)
            r4.putString(r6, r1)
            java.lang.String r2 = "effect_id"
            java.lang.String r1 = r7.getQueryParameter(r2)
            r4.putString(r2, r1)
            java.lang.String r5 = "device_position"
            java.lang.String r1 = r7.getQueryParameter(r5)
            r4.putString(r5, r1)
            java.lang.String r3 = "mode"
            java.lang.String r1 = r7.getQueryParameter(r3)
            r4.putString(r3, r1)
            X.08y r1 = X.09i.A0A     // Catch:{  }
            X.0wW r1 = r1.A05(r8)     // Catch:{  }
            com.instagram.common.session.UserSession r11 = X.0Gl.A00(r1)     // Catch:{  }
            java.lang.String r12 = r4.getString(r6)
            if (r12 == 0) goto L_0x00e7
            X.1ZO r2 = X.AnonymousClass1ZO.A03
            if (r2 != 0) goto L_0x007c
            java.lang.String r0 = "instance"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0075:
            r2 = move-exception
            java.lang.String r1 = "ArAdsTestLinkUrlHandler"
            X.0wb.A07(r1, r2)
            goto L_0x00e7
        L_0x007c:
            X.28D r9 = X.28D.A0P
            r1 = 3
            X.0qQ.A0B(r11, r1)
            X.UHT r10 = r2.A01
            if (r10 != 0) goto L_0x0092
            X.Sl3 r1 = new X.Sl3
            r1.<init>(r11)
            X.UHT r10 = new X.UHT
            r10.<init>(r1)
            r2.A01 = r10
        L_0x0092:
            X.VbC r7 = new X.VbC
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.String r1 = r4.getString(r5)
            r7.A00 = r1
            java.lang.String r1 = r4.getString(r3)
            r7.A01 = r1
            X.1ZN r9 = X.C297725sE.A00()
            com.instagram.common.session.UserSession r13 = r7.A05
            androidx.fragment.app.FragmentActivity r1 = r7.A02
            android.content.Context r10 = r1.getApplicationContext()
            X.0qQ.A07(r10)
            X.Uxv r11 = X.C16601Uxv.IG_AR_DYNAMIC_ADS
            X.VM7 r12 = new X.VM7
            r12.<init>()
            java.lang.String r14 = "ar_ads_camera"
            X.WT1 r3 = r9.A02(r10, r11, r12, r13, r14)
            r3.A01()
            X.Uy8 r2 = X.C16612Uy8.AD_QUERY_STARTED
            java.lang.String r1 = ""
            r3.A02(r2, r1, r15)
            java.lang.String r14 = r7.A06
            X.UHT r12 = r7.A04
            X.ObS r13 = new X.ObS
            r13.<init>()
            X.4Cq r1 = r12.A01
            r16 = 9
            X.MGl r11 = new X.MGl
            r11.<init>((java.lang.Object) r12, (java.lang.Object) r13, (java.lang.String) r14, (X.AnonymousClass4D7) r15, (int) r16)
            X.AnonymousClass7TE.A1Z(r11, r1)
            r2 = 1
            X.WGV r1 = new X.WGV
            r1.<init>(r2, r7, r3)
            r13.A04(r1)
        L_0x00e7:
            r8.finish()
            r1 = 1465274605(0x575650ed, float:2.35643062E14)
            X.AnonymousClass0fD.A07(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.aradstestlink.ArAdsTestLinkUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }

    public final AnonymousClass0wW getSession() {
        return 09i.A0A.A05(this);
    }
}
