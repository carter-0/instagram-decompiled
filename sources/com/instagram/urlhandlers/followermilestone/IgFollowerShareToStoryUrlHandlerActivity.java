package com.instagram.urlhandlers.followermilestone;

import X.08y;
import X.09i;
import X.2RR;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbS;
import X.DbT;
import X.DbX;
import X.FFQ;
import X.FZF;
import X.LTL;
import android.os.Bundle;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;

public final class IgFollowerShareToStoryUrlHandlerActivity extends BaseFragmentActivity {
    public String A00;
    public boolean A01 = true;

    public final void A0j(Bundle bundle) {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity, android.app.Activity] */
    public final AnonymousClass0wW getSession() {
        08y r1 = 09i.A0A;
        Bundle A0A = DbX.A0A(this);
        if (A0A != null) {
            return r1.A04(A0A);
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.content.Context, com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity, android.app.Activity] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(android.graphics.Bitmap r4, android.os.Bundle r5, com.instagram.common.session.UserSession r6, com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity r7) {
        /*
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165225(0x7f070029, float:1.7944661E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r2 = r4.getWidth()
            int r1 = r4.getHeight()
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x0024
            int r1 = r1 - r3
            r0 = 0
            X.0fO.A03(r4)
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r4, r0, r3, r2, r1)
        L_0x0020:
            X.0qQ.A0A(r0)
            goto L_0x0035
        L_0x0024:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131165224(0x7f070028, float:1.794466E38)
            int r1 = r1.getDimensionPixelSize(r0)
            r0 = 1
            android.graphics.Bitmap r0 = X.0fO.A00(r4, r1, r1, r0)
            goto L_0x0020
        L_0x0035:
            java.lang.String r1 = X.AnonymousClass45F.A02(r0)     // Catch:{ IOException -> 0x0051 }
            r0 = 2431(0x97f, float:3.407E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r5.putString(r0, r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 701(0x2bd, float:9.82E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0x(r7, r5, r6, r1, r0)
            r7.finish()
            return
        L_0x0051:
            r4 = move-exception
            java.lang.String r3 = "Failed to save achievement icon to disk"
            X.0wj r2 = X.0wj.A01
            r0 = 817892933(0x30c00e45, float:1.3973894E-9)
            java.lang.String r1 = "IgFollowerShareToStoryUrlHandlerActivity"
            X.0f9 r0 = r2.AEf(r1, r0)
            X.AnonymousClass7TF.A19(r0, r1, r3, r4)
            java.lang.String r0 = "shareToStory_unknown_error_occurred"
            X.C59689JTv.A0C(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity.A00(android.graphics.Bitmap, android.os.Bundle, com.instagram.common.session.UserSession, com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity):void");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.content.Context, com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity, com.instagram.base.activity.BaseFragmentActivity, java.lang.Object, android.app.Activity, com.instagram.base.activity.IgFragmentActivity] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0fD.A00(2049051584);
        super.onCreate(bundle);
        if (bundle != null) {
            i = -1532947863;
        } else {
            Bundle A0A = DbX.A0A(this);
            if (A0A == null) {
                finish();
                i = -936582956;
            } else {
                String A0m = DbS.A0m(A0A);
                if (A0m == null) {
                    finish();
                    i = -1347555745;
                } else {
                    AnonymousClass0wW session = getSession();
                    if (!(session instanceof UserSession)) {
                        FFQ.A01(this, A0A, session);
                    } else {
                        this.A00 = DbT.A09(A0m).getQueryParameter("followers");
                        Bundle A0a = AnonymousClass7TE.A0a();
                        String A012 = 2RR.A01();
                        LTL.A06(this, new FZF(5, (Object) A0a, (Object) this, (Object) session), A012, new int[]{getColor(R.color.igds_sticker_text_vibrant_gradient_purple), AnonymousClass7TF.A03(this, R.attr.igds_color_gradient_lavender), AnonymousClass7TF.A03(this, R.attr.igds_color_gradient_pink)}, new int[]{0, 0, 0, 1}, 0.2f);
                    }
                    i = -1409887793;
                }
            }
        }
        AnonymousClass0fD.A07(i, A002);
    }
}
