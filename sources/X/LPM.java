package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.api.schemas.AudienceListIntf;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.modal.ModalActivity;

public abstract class LPM {
    public static final void A00(Activity activity, AudienceListIntf audienceListIntf, UserSession userSession) {
        String str;
        String str2;
        boolean z = false;
        if (audienceListIntf == null) {
            str2 = null;
            str = null;
        } else if (audienceListIntf.CRG()) {
            A01(activity, C62574Ki7.AUDIENCE_LISTS_LIST, userSession, false, false);
            return;
        } else {
            str = audienceListIntf.BN7();
            str2 = audienceListIntf.getName();
            z = audienceListIntf.CWL();
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("audience_list_id", str);
        if (z) {
            A0a.putString("audience_list_name", str2);
        }
        A0a.putBoolean("is_bottomsheet", false);
        A0a.putBoolean("delete_enabled", false);
        Dbb.A0i(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(552));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.instagram.api.schemas.AudienceListIntf r6, X.AnonymousClass4DH r7, com.instagram.common.session.UserSession r8, int r9, boolean r10) {
        /*
            r5 = 0
            X.0qQ.A0B(r8, r5)
            r1 = 1
            if (r6 == 0) goto L_0x0057
            boolean r0 = r6.CRG()
            if (r0 != r1) goto L_0x004a
            r0 = 350(0x15e, float:4.9E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "not_eligible"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r0 = 183(0xb7, float:2.56E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            X.Ki7 r1 = X.C62574Ki7.AUDIENCE_LISTS_LIST
            java.lang.String r0 = "entry_point"
            android.os.Bundle r4 = X.DbY.A0C(r0, r1, r3, r2)
            r0 = 58548288(0x37d6040, float:7.4460507E-37)
            if (r9 != r0) goto L_0x0036
            r9 = 1000(0x3e8, float:1.401E-42)
        L_0x0036:
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.app.Activity r1 = r7.getRootActivity()
            r0 = 18
        L_0x003e:
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r0 = X.Dba.A0K(r1, r4, r8, r2, r0)
            r0.A0D(r7, r9)
            return
        L_0x004a:
            java.lang.String r3 = r6.BN7()
            java.lang.String r2 = r6.getName()
            boolean r1 = r6.CWL()
            goto L_0x005a
        L_0x0057:
            r2 = 0
            r3 = r2
            r1 = 0
        L_0x005a:
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "audience_list_id"
            r4.putString(r0, r3)
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = "audience_list_name"
            r4.putString(r0, r2)
        L_0x006a:
            java.lang.String r0 = "is_bottomsheet"
            r4.putBoolean(r0, r5)
            java.lang.String r0 = "delete_enabled"
            r4.putBoolean(r0, r10)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.app.Activity r1 = r7.getRootActivity()
            r0 = 552(0x228, float:7.74E-43)
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPM.A02(com.instagram.api.schemas.AudienceListIntf, X.4DH, com.instagram.common.session.UserSession, int, boolean):void");
    }

    public static final void A01(Activity activity, C62574Ki7 ki7, UserSession userSession, boolean z, boolean z2) {
        String str;
        Bundle A0a = AnonymousClass7TE.A0a();
        if (z) {
            str = "eligible_to_see";
        } else {
            str = "not_eligible";
        }
        A0a.putString(AnonymousClass000.A00(350), str);
        A0a.putBoolean(AnonymousClass000.A00(183), z2);
        A0a.putSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, ki7);
        Dbb.A0i(activity, A0a, userSession, ModalActivity.class, C273654mx.A00(18));
    }
}
