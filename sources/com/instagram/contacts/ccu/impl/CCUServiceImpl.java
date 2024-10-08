package com.instagram.contacts.ccu.impl;

import X.002;
import X.02m;
import X.09i;
import X.0Tu;
import X.0jh;
import X.0qQ;
import X.0wb;
import X.0xI;
import X.182;
import X.19f;
import X.19i;
import X.AnonymousClass7TF;
import X.C10898Rzy;
import X.C17337VRq;
import X.C17704VcZ;
import X.C17770Vfh;
import X.C17968Vj2;
import X.C18031VkB;
import X.C18038VkM;
import X.C267044ar;
import X.C41396AtI;
import X.DbU;
import X.VB6;
import X.W3O;
import X.WGL;
import X.WGM;
import X.X3Y;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashSet;

public final class CCUServiceImpl extends C10898Rzy {
    public static final VB6 Companion = new Object();

    public boolean onStart(Context context, X3Y x3y) {
        String str;
        String str2;
        String str3;
        String str4;
        Context context2 = context;
        X3Y x3y2 = x3y;
        boolean A1U = AnonymousClass7TF.A1U(0, context2, x3y2);
        try {
            UserSession A05 = 09i.A0A.A05(this);
            if (A05 instanceof UserSession) {
                UserSession userSession = A05;
                "continuous_contact_upload_attempt".getClass();
                0xI A01 = 0xI.A01("continuous_contact_upload_attempt", (String) null);
                19i A012 = 0jh.A04.A01(userSession).A01(19f.A1R);
                if (A012 != null) {
                    A01.A0C("phone_id", A012.A01);
                }
                DbU.A1R(A01, userSession);
                Context applicationContext = context2.getApplicationContext();
                HashSet hashSet = new HashSet();
                HashSet hashSet2 = new HashSet();
                C41396AtI atI = new C41396AtI((Object) context2, 0);
                C18038VkM vkM = new C18038VkM(context2, userSession);
                C17770Vfh vfh = new C17770Vfh(userSession);
                C17337VRq vRq = new C17337VRq(context2, userSession);
                hashSet.add(new WGL(x3y2));
                02m r2 = 02m.A0p;
                0qQ.A07(r2);
                C18031VkB vkB = new C18031VkB(r2);
                C17704VcZ vcZ = new C17704VcZ(applicationContext, vkB, vfh, vkM, vRq, hashSet2, hashSet, atI);
                if (182.A06(0Tu.A05, A05, 36311985687757651L)) {
                    C18038VkM vkM2 = vcZ.A07;
                    UserSession userSession2 = vkM2.A01;
                    if (vkM2.A02.getBoolean(002.A0R(userSession2.A06, "user_remote_setting_migration_completed"), false)) {
                        vcZ.A05.A09(vcZ.A04);
                        return false;
                    }
                    if (C267044ar.A01(vkM2.A00, userSession2)) {
                        str4 = "on";
                    } else {
                        str4 = "off";
                    }
                    vcZ.A05.A08(3, "remote_setting_migration", str4, vcZ.A04);
                    return false;
                }
                boolean A1Q = AnonymousClass7TF.A1Q(vcZ.A0A.checkCallingOrSelfPermission("android.permission.READ_CONTACTS"));
                C18038VkM vkM3 = vcZ.A07;
                boolean A013 = C267044ar.A01(vkM3.A00, vkM3.A01);
                long A00 = vkM3.A00();
                WGM wgm = vcZ.A06;
                if (A013 == A1U) {
                    str = "on";
                } else {
                    str = "off";
                }
                wgm.A04(str, "", vcZ.A04, A00, A1Q);
                wgm.A05("background_job_new_protocol", "start_background_job", (String) null, "");
                C17770Vfh vfh2 = wgm.A00;
                C17968Vj2 A002 = vfh2.A00("mlite_ccu_background_job_funnel");
                0xI r1 = A002.A00;
                r1.A0C("background_event_name", "start_background_job");
                r1.A0C("family_device_id", "");
                A002.A00();
                W3O w3o = vcZ.A05;
                if (w3o.A0D) {
                    str2 = "exit_background_job";
                    str3 = "ccu_is_running";
                } else if (!A1Q) {
                    str2 = "exit_background_job";
                    str3 = "no_os_permission";
                } else if (!A013) {
                    str2 = "exit_background_job";
                    str3 = "no_app_permission";
                } else if (System.currentTimeMillis() - A00 < vcZ.A04) {
                    str2 = "exit_background_job";
                    str3 = "time_interval";
                } else {
                    wgm.A05("background_job_new_protocol", "start_contact_upload", "time_interval", "");
                    C17968Vj2 A003 = vfh2.A00("mlite_ccu_background_job_funnel");
                    0xI r12 = A003.A00;
                    r12.A0C("background_event_name", "start_contact_upload");
                    r12.A0C("family_device_id", "");
                    A003.A00();
                    w3o.A07();
                }
                wgm.A05("background_job_new_protocol", str2, str3, "");
                C17968Vj2 A004 = vfh2.A00("mlite_ccu_background_job_funnel");
                0xI r13 = A004.A00;
                r13.A0C("background_event_name", str3);
                r13.A0C("family_device_id", "");
                A004.A00();
                return false;
            }
            return false;
        } catch (Exception e) {
            0wb.A07("CCUJobService#onStartJob", e);
            x3y2.onFinish();
        } catch (Throwable unused) {
        }
        return false;
    }
}
