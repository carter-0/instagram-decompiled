package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class FZF implements MTS {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FZF(Activity activity, Bundle bundle, UserSession userSession, int i) {
        this.A00 = i;
        this.A02 = bundle;
        switch (i) {
            case 0:
            case 3:
                this.A03 = userSession;
                this.A01 = activity;
                break;
            default:
                this.A01 = activity;
                this.A03 = userSession;
                break;
        }
    }

    public final void onFailure(Exception exc) {
        Activity activity;
        String str;
        switch (this.A00) {
            case 0:
                str = AnonymousClass000.A00(276);
                activity = (Context) this.A01;
                break;
            case 1:
                0qQ.A0B(exc, 0);
                str = "shareToStory_unknown_error_occurred";
                activity = (Context) this.A01;
                break;
            case 2:
                Activity activity2 = (Activity) this.A01;
                if (!activity2.isDestroyed()) {
                    str = "unknown_error_occured";
                    activity = activity2;
                    break;
                } else {
                    return;
                }
            case 3:
                0wb.A03("ReelProfileShareHelper", "Could not create background media for shareProfileToStory().");
                return;
            default:
                return;
        }
        C59689JTv.A0C(activity, str);
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [android.content.Context, com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x01b6, code lost:
        if (r1 < 250) goto L_0x01b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r1 < 250) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ce, code lost:
        r0 = X.AnonymousClass6W8.A02(r3, r2, r4, r1, X.C273654mx.A00(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02d6, code lost:
        r0.A0C(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02d9, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x01c3 A[Catch:{ IOException -> 0x01dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01ce A[Catch:{ IOException -> 0x01dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x02ad;
                case 1: goto L_0x0284;
                case 2: goto L_0x023a;
                case 3: goto L_0x0217;
                case 4: goto L_0x01f4;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.io.File r4 = X.Dba.A0T(r8)
            java.lang.Object r3 = r7.A01     // Catch:{ IOException -> 0x01dd }
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch:{ IOException -> 0x01dd }
            r0 = 2432(0x980, float:3.408E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x01dd }
            java.lang.Object r2 = r7.A03     // Catch:{ IOException -> 0x01dd }
            com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity r2 = (com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity) r2     // Catch:{ IOException -> 0x01dd }
            java.lang.String r1 = r2.A00     // Catch:{ IOException -> 0x01dd }
            r3.putString(r0, r1)     // Catch:{ IOException -> 0x01dd }
            r0 = 2430(0x97e, float:3.405E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x01dd }
            java.lang.String r1 = r4.getCanonicalPath()     // Catch:{ IOException -> 0x01dd }
            r3.putString(r0, r1)     // Catch:{ IOException -> 0x01dd }
            java.lang.Object r4 = r7.A02     // Catch:{ IOException -> 0x01dd }
            X.0wW r4 = (X.AnonymousClass0wW) r4     // Catch:{ IOException -> 0x01dd }
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4     // Catch:{ IOException -> 0x01dd }
            java.lang.String r0 = r2.A00     // Catch:{ IOException -> 0x01dd }
            if (r0 == 0) goto L_0x02ac
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ NumberFormatException -> 0x02ac }
            if (r0 == 0) goto L_0x01b8
            int r1 = r0.intValue()     // Catch:{ IOException -> 0x01dd }
            r0 = 1500000(0x16e360, float:2.101948E-39)
            if (r1 >= r0) goto L_0x0047
            r5 = 250(0xfa, float:3.5E-43)
            r0 = 0
            if (r1 >= r5) goto L_0x0048
        L_0x0047:
            r0 = 1
        L_0x0048:
            r2.A01 = r0     // Catch:{ IOException -> 0x01dd }
            if (r0 != 0) goto L_0x01b8
            r0 = 1500000(0x16e360, float:2.101948E-39)
            if (r1 >= r0) goto L_0x01b8
            r0 = 1000000(0xf4240, float:1.401298E-39)
            if (r1 < r0) goto L_0x005b
            r5 = 2131230848(0x7f080080, float:1.807776E38)
            goto L_0x01bb
        L_0x005b:
            r0 = 900000(0xdbba0, float:1.261169E-39)
            if (r1 < r0) goto L_0x0065
            r5 = 2131230881(0x7f0800a1, float:1.8077827E38)
            goto L_0x01bb
        L_0x0065:
            r0 = 800000(0xc3500, float:1.121039E-39)
            if (r1 < r0) goto L_0x006f
            r5 = 2131230877(0x7f08009d, float:1.807782E38)
            goto L_0x01bb
        L_0x006f:
            r0 = 700000(0xaae60, float:9.80909E-40)
            if (r1 < r0) goto L_0x0079
            r5 = 2131230872(0x7f080098, float:1.807781E38)
            goto L_0x01bb
        L_0x0079:
            r0 = 600000(0x927c0, float:8.40779E-40)
            if (r1 < r0) goto L_0x0083
            r5 = 2131230868(0x7f080094, float:1.80778E38)
            goto L_0x01bb
        L_0x0083:
            r0 = 500000(0x7a120, float:7.00649E-40)
            if (r1 < r0) goto L_0x008d
            r5 = 2131230864(0x7f080090, float:1.8077793E38)
            goto L_0x01bb
        L_0x008d:
            r0 = 400000(0x61a80, float:5.6052E-40)
            if (r1 < r0) goto L_0x0097
            r5 = 2131230859(0x7f08008b, float:1.8077783E38)
            goto L_0x01bb
        L_0x0097:
            r0 = 300000(0x493e0, float:4.2039E-40)
            if (r1 < r0) goto L_0x00a1
            r5 = 2131230855(0x7f080087, float:1.8077775E38)
            goto L_0x01bb
        L_0x00a1:
            r0 = 200000(0x30d40, float:2.8026E-40)
            if (r1 < r0) goto L_0x00ab
            r5 = 2131230850(0x7f080082, float:1.8077764E38)
            goto L_0x01bb
        L_0x00ab:
            r0 = 100000(0x186a0, float:1.4013E-40)
            if (r1 < r0) goto L_0x00b5
            r5 = 2131230845(0x7f08007d, float:1.8077754E38)
            goto L_0x01bb
        L_0x00b5:
            r0 = 90000(0x15f90, float:1.26117E-40)
            if (r1 < r0) goto L_0x00bf
            r5 = 2131230882(0x7f0800a2, float:1.807783E38)
            goto L_0x01bb
        L_0x00bf:
            r0 = 80000(0x13880, float:1.12104E-40)
            if (r1 < r0) goto L_0x00c9
            r5 = 2131230878(0x7f08009e, float:1.8077821E38)
            goto L_0x01bb
        L_0x00c9:
            r0 = 70000(0x11170, float:9.8091E-41)
            if (r1 < r0) goto L_0x00d3
            r5 = 2131230873(0x7f080099, float:1.8077811E38)
            goto L_0x01bb
        L_0x00d3:
            r0 = 60000(0xea60, float:8.4078E-41)
            if (r1 < r0) goto L_0x00dd
            r5 = 2131230869(0x7f080095, float:1.8077803E38)
            goto L_0x01bb
        L_0x00dd:
            r0 = 50000(0xc350, float:7.0065E-41)
            if (r1 < r0) goto L_0x00e7
            r5 = 2131230865(0x7f080091, float:1.8077795E38)
            goto L_0x01bb
        L_0x00e7:
            r0 = 40000(0x9c40, float:5.6052E-41)
            if (r1 < r0) goto L_0x00f1
            r5 = 2131230860(0x7f08008c, float:1.8077785E38)
            goto L_0x01bb
        L_0x00f1:
            r0 = 30000(0x7530, float:4.2039E-41)
            if (r1 < r0) goto L_0x00fa
            r5 = 2131230856(0x7f080088, float:1.8077777E38)
            goto L_0x01bb
        L_0x00fa:
            r0 = 20000(0x4e20, float:2.8026E-41)
            if (r1 < r0) goto L_0x0103
            r5 = 2131230851(0x7f080083, float:1.8077766E38)
            goto L_0x01bb
        L_0x0103:
            r0 = 10000(0x2710, float:1.4013E-41)
            if (r1 < r0) goto L_0x010c
            r5 = 2131230846(0x7f08007e, float:1.8077756E38)
            goto L_0x01bb
        L_0x010c:
            r0 = 9500(0x251c, float:1.3312E-41)
            if (r1 < r0) goto L_0x0115
            r5 = 2131230883(0x7f0800a3, float:1.8077831E38)
            goto L_0x01bb
        L_0x0115:
            r0 = 9000(0x2328, float:1.2612E-41)
            if (r1 < r0) goto L_0x011e
            r5 = 2131230880(0x7f0800a0, float:1.8077825E38)
            goto L_0x01bb
        L_0x011e:
            r0 = 8500(0x2134, float:1.1911E-41)
            if (r1 < r0) goto L_0x0127
            r5 = 2131230879(0x7f08009f, float:1.8077823E38)
            goto L_0x01bb
        L_0x0127:
            r0 = 8000(0x1f40, float:1.121E-41)
            if (r1 < r0) goto L_0x0130
            r5 = 2131230876(0x7f08009c, float:1.8077817E38)
            goto L_0x01bb
        L_0x0130:
            r0 = 7500(0x1d4c, float:1.051E-41)
            if (r1 < r0) goto L_0x0139
            r5 = 2131230874(0x7f08009a, float:1.8077813E38)
            goto L_0x01bb
        L_0x0139:
            r0 = 7000(0x1b58, float:9.809E-42)
            if (r1 < r0) goto L_0x0141
            r5 = 2131230871(0x7f080097, float:1.8077807E38)
            goto L_0x01bb
        L_0x0141:
            r0 = 6500(0x1964, float:9.108E-42)
            if (r1 < r0) goto L_0x0149
            r5 = 2131230870(0x7f080096, float:1.8077805E38)
            goto L_0x01bb
        L_0x0149:
            r0 = 6000(0x1770, float:8.408E-42)
            if (r1 < r0) goto L_0x0151
            r5 = 2131230867(0x7f080093, float:1.8077799E38)
            goto L_0x01bb
        L_0x0151:
            r0 = 5500(0x157c, float:7.707E-42)
            if (r1 < r0) goto L_0x0159
            r5 = 2131230866(0x7f080092, float:1.8077797E38)
            goto L_0x01bb
        L_0x0159:
            r0 = 5000(0x1388, float:7.006E-42)
            if (r1 < r0) goto L_0x0161
            r5 = 2131230862(0x7f08008e, float:1.8077789E38)
            goto L_0x01bb
        L_0x0161:
            r0 = 4500(0x1194, float:6.306E-42)
            if (r1 < r0) goto L_0x0169
            r5 = 2131230861(0x7f08008d, float:1.8077787E38)
            goto L_0x01bb
        L_0x0169:
            r0 = 4000(0xfa0, float:5.605E-42)
            if (r1 < r0) goto L_0x0171
            r5 = 2131230858(0x7f08008a, float:1.807778E38)
            goto L_0x01bb
        L_0x0171:
            r0 = 3500(0xdac, float:4.905E-42)
            if (r1 < r0) goto L_0x0179
            r5 = 2131230857(0x7f080089, float:1.8077779E38)
            goto L_0x01bb
        L_0x0179:
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r1 < r0) goto L_0x0181
            r5 = 2131230854(0x7f080086, float:1.8077773E38)
            goto L_0x01bb
        L_0x0181:
            r0 = 2500(0x9c4, float:3.503E-42)
            if (r1 < r0) goto L_0x0189
            r5 = 2131230852(0x7f080084, float:1.8077768E38)
            goto L_0x01bb
        L_0x0189:
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 < r0) goto L_0x0191
            r5 = 2131230849(0x7f080081, float:1.8077762E38)
            goto L_0x01bb
        L_0x0191:
            r0 = 1500(0x5dc, float:2.102E-42)
            if (r1 < r0) goto L_0x0199
            r5 = 2131230847(0x7f08007f, float:1.8077758E38)
            goto L_0x01bb
        L_0x0199:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 < r0) goto L_0x01a1
            r5 = 2131230844(0x7f08007c, float:1.8077752E38)
            goto L_0x01bb
        L_0x01a1:
            r0 = 750(0x2ee, float:1.051E-42)
            if (r1 < r0) goto L_0x01a9
            r5 = 2131230875(0x7f08009b, float:1.8077815E38)
            goto L_0x01bb
        L_0x01a9:
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 < r0) goto L_0x01b1
            r5 = 2131230863(0x7f08008f, float:1.807779E38)
            goto L_0x01bb
        L_0x01b1:
            r0 = 250(0xfa, float:3.5E-43)
            r5 = 2131230853(0x7f080085, float:1.807777E38)
            if (r1 >= r0) goto L_0x01bb
        L_0x01b8:
            r5 = 2131238414(0x7f081e0e, float:1.8093106E38)
        L_0x01bb:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r5)     // Catch:{ IOException -> 0x01dd }
            boolean r0 = r1 instanceof X.C262364Dk     // Catch:{ IOException -> 0x01dd }
            if (r0 == 0) goto L_0x01ce
            X.4Dk r1 = (X.C262364Dk) r1     // Catch:{ IOException -> 0x01dd }
            X.FZG r0 = new X.FZG     // Catch:{ IOException -> 0x01dd }
            r0.<init>(r3, r4, r2)     // Catch:{ IOException -> 0x01dd }
            r1.A01(r0)     // Catch:{ IOException -> 0x01dd }
            return
        L_0x01ce:
            if (r1 == 0) goto L_0x02ac
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1     // Catch:{ IOException -> 0x01dd }
            android.graphics.Bitmap r0 = r1.getBitmap()     // Catch:{ IOException -> 0x01dd }
            X.0qQ.A0A(r0)     // Catch:{ IOException -> 0x01dd }
            com.instagram.urlhandlers.followermilestone.IgFollowerShareToStoryUrlHandlerActivity.A00(r0, r3, r4, r2)     // Catch:{ IOException -> 0x01dd }
            return
        L_0x01dd:
            r5 = move-exception
            java.lang.Object r4 = r7.A03
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r3 = "Failed to save media background file"
            X.0wj r2 = X.0wj.A01
            r0 = 817892933(0x30c00e45, float:1.3973894E-9)
            java.lang.String r1 = "IgFollowerShareToStoryUrlHandlerActivity"
            X.0f9 r0 = r2.AEf(r1, r0)
            X.AnonymousClass7TF.A19(r0, r1, r3, r5)
            goto L_0x02a7
        L_0x01f4:
            java.io.File r0 = X.Dba.A0T(r8)
            java.lang.Object r2 = r7.A02
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r1 = r0.getCanonicalPath()
            r0 = 2693(0xa85, float:3.774E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
            java.lang.Object r3 = r7.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r4 = r7.A03
            X.0lg r4 = (X.0lg) r4
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 915(0x393, float:1.282E-42)
            goto L_0x02ce
        L_0x0217:
            java.io.File r0 = X.Dba.A0T(r8)
            java.lang.Object r2 = r7.A02
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r1 = r0.getAbsolutePath()
            r0 = 2470(0x9a6, float:3.461E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
            java.lang.Object r4 = r7.A03
            X.0lg r4 = (X.0lg) r4
            java.lang.Object r3 = r7.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 928(0x3a0, float:1.3E-42)
            goto L_0x02ce
        L_0x023a:
            java.io.File r0 = X.Dba.A0T(r8)
            java.lang.String r6 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x0243 }
            goto L_0x0247
        L_0x0243:
            java.lang.String r6 = r0.getAbsolutePath()
        L_0x0247:
            java.lang.Object r5 = r7.A03
            X.0lg r5 = (X.0lg) r5
            java.lang.Object r3 = r7.A01
            android.app.Activity r3 = (android.app.Activity) r3
            X.0qQ.A0A(r6)
            java.lang.Object r4 = r7.A02
            com.instagram.direct.sharetostory.data.ChannelChallengeStickerData r4 = (com.instagram.direct.sharetostory.data.ChannelChallengeStickerData) r4
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.28D r1 = X.28D.A5J
            r0 = 466(0x1d2, float:6.53E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putSerializable(r0, r1)
            r0 = 2429(0x97d, float:3.404E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r6)
            r0 = 467(0x1d3, float:6.54E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r4)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            r0 = 3214(0xc8e, float:4.504E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A02(r3, r2, r5, r1, r0)
            goto L_0x02d6
        L_0x0284:
            java.io.File r0 = X.Dba.A0T(r8)
            java.lang.String r1 = "ARG_WELCOME_STORY_FILE_PATH"
            java.lang.String r0 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x02a3 }
            X.0eP[] r0 = X.DbW.A1b(r1, r0)     // Catch:{ IOException -> 0x02a3 }
            android.os.Bundle r2 = X.Q21.A00(r0)     // Catch:{ IOException -> 0x02a3 }
            java.lang.Object r4 = r7.A02
            X.0lg r4 = (X.0lg) r4
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            java.lang.Object r3 = r7.A01
            android.app.Activity r3 = (android.app.Activity) r3
            r0 = 687(0x2af, float:9.63E-43)
            goto L_0x02ce
        L_0x02a3:
            java.lang.Object r4 = r7.A01
            android.content.Context r4 = (android.content.Context) r4
        L_0x02a7:
            java.lang.String r0 = "shareToStory_unknown_error_occurred"
            X.C59689JTv.A0C(r4, r0)
        L_0x02ac:
            return
        L_0x02ad:
            java.io.File r0 = X.Dba.A0T(r8)
            java.lang.Object r2 = r7.A02
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r1 = r0.getCanonicalPath()
            r0 = 2153(0x869, float:3.017E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r0, r1)
            java.lang.Object r4 = r7.A03
            X.0lg r4 = (X.0lg) r4
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r1 = com.instagram.modal.TransparentModalActivity.class
            java.lang.Object r3 = r7.A01
            android.app.Activity r3 = (android.app.Activity) r3
            r0 = 916(0x394, float:1.284E-42)
        L_0x02ce:
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.AnonymousClass6W8.A02(r3, r2, r4, r1, r0)
        L_0x02d6:
            r0.A0C(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FZF.onSuccess(java.lang.Object):void");
    }

    public FZF(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }
}
