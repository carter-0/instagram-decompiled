package com.instagram.urlhandlers.learnfromothers;

import X.08y;
import X.09i;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.DbX;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;

public final class LearnFromOthersUrlHandlerActivity extends BaseFragmentActivity {
    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.instagram.urlhandlers.learnfromothers.LearnFromOthersUrlHandlerActivity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: type inference failed for: r8v1, types: [X.F1I, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            r0 = 1599082897(0x5f501191, float:1.4992924E19)
            int r4 = X.AnonymousClass0fD.A00(r0)
            r10 = r14
            super.onCreate(r15)
            android.os.Bundle r6 = X.DbX.A0A(r14)
            if (r6 != 0) goto L_0x0015
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
        L_0x0015:
            boolean r0 = X.DbT.A1Z(r14)
            if (r0 != 0) goto L_0x0025
            X.FFQ.A03(r6, r14)
        L_0x001e:
            r0 = 1445152589(0x5623474d, float:4.4881657E13)
            X.AnonymousClass0fD.A07(r0, r4)
            return
        L_0x0025:
            X.0hq r1 = r14.getSupportFragmentManager()
            r0 = 16
            X.C50128FQl.A00(r1, r14, r0)
            java.lang.String r8 = "entry_point"
            java.lang.String r7 = r6.getString(r8)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "professional_onboarding_checklist"
        L_0x0038:
            android.content.Context r1 = r14.getApplicationContext()
            r0 = 2131964883(0x7f1333d3, float:1.956656E38)
            java.lang.String r5 = r1.getString(r0)
            android.content.Context r1 = r14.getApplicationContext()
            r0 = 2131964882(0x7f1333d2, float:1.9566558E38)
            java.lang.String r3 = r1.getString(r0)
            java.lang.String r2 = "onboarding_checklist_render"
            com.instagram.business.fragment.SuggestBusinessFragment r9 = new com.instagram.business.fragment.SuggestBusinessFragment
            r9.<init>()
            android.os.Bundle r1 = X.DbV.A0C(r8, r7)
            java.lang.String r0 = "suggested_business_fetch_entry_point"
            r1.putString(r0, r2)
            java.lang.String r0 = "ARG_TITLE"
            r1.putString(r0, r5)
            java.lang.String r0 = "ARG_SUB_TITLE"
            r1.putString(r0, r3)
            r9.setArguments(r1)
            android.os.Bundle r0 = X.DbY.A08(r9)
            r0.putAll(r6)
            r9.setArguments(r0)
            X.F1I r8 = new X.F1I
            r8.<init>()
            r12 = 0
            r13 = 1
            X.0wW r0 = r14.getSession()
            X.EtT r11 = new X.EtT
            r11.<init>(r0)
            r8.A00(r9, r10, r11, r12, r13)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.learnfromothers.LearnFromOthersUrlHandlerActivity.onCreate(android.os.Bundle):void");
    }
}
