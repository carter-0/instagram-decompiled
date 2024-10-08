package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.archive.api.IGProfileArchiveHighlightQueryResponseImpl;
import com.instagram.archive.api.IGProfileUnarchiveHighlightQueryResponseImpl;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;

/* renamed from: X.738  reason: invalid class name */
public abstract class AnonymousClass738 {
    public static final 1OC A00(Ki3 ki3, UserSession userSession, String str, String str2, String str3, String str4, List list, Set set, int i, int i2, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(ki3, 1);
        0qQ.A0B(set, 2);
        0qQ.A0B(str, 3);
        JSONArray jSONArray = new JSONArray();
        for (Object put : set) {
            jSONArray.put(put);
        }
        1NY r5 = new 1NY(userSession, -2);
        r5.A04();
        r5.A0A("highlights/create_reel/");
        r5.A9m("creation_id", String.valueOf(System.currentTimeMillis()));
        r5.A9m("source", ki3.name());
        r5.A9m("media_ids", jSONArray.toString());
        r5.A9m(DialogModule.KEY_TITLE, str);
        r5.A0H("should_add_to_main_grid", z);
        Pair A00 = C278474ww.A00(userSession);
        Object obj = A00.first;
        0qQ.A06(obj);
        r5.A0G((String) obj, (String) A00.second);
        A08(r5, str2, str3, list, i, i2);
        if (str4 != null) {
            r5.A9m("suggested_reel_id", str4);
        }
        r5.A0Q(K14.class, LHJ.class);
        r5.A0R = true;
        return r5.A0M();
    }

    public static final 1OC A01(Ki3 ki3, UserSession userSession, String str, String str2, String str3, String str4, List list, Set set, Set set2, int i, int i2) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(ki3, 2);
        Set<Object> set3 = set;
        0qQ.A0B(set3, 3);
        Set<Object> set4 = set2;
        0qQ.A0B(set4, 4);
        JSONArray jSONArray = new JSONArray();
        for (Object put : set3) {
            jSONArray.put(put);
        }
        JSONArray jSONArray2 = new JSONArray();
        for (Object put2 : set4) {
            jSONArray2.put(put2);
        }
        String A06 = 0mp.A06("highlights/%s/edit_reel/", new Object[]{str});
        1NY r8 = new 1NY(userSession, -2);
        r8.A08(AnonymousClass05K.A01);
        r8.A0A(A06);
        r8.A9m("source", ki3.name());
        r8.A9m("added_media_ids", jSONArray.toString());
        r8.A9m("removed_media_ids", jSONArray2.toString());
        if (str2 != null) {
            r8.A9m(DialogModule.KEY_TITLE, str2);
        }
        Pair A00 = C278474ww.A00(userSession);
        Object obj = A00.first;
        0qQ.A06(obj);
        r8.A0G((String) obj, (String) A00.second);
        List list2 = list;
        if (list != null) {
            A08(r8, str3, str4, list2, i, i2);
        }
        r8.A0O((15p) null, K14.class, LHJ.class, false);
        r8.A0R = true;
        return r8.A0M();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r8 != false) goto L_0x001b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1OC A02(X.1P0 r6, com.instagram.common.session.UserSession r7, boolean r8, boolean r9) {
        /*
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r3 = r0.A00()
            X.4Cl r0 = r3.A03
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r2 = r0.BkX()
            if (r9 != 0) goto L_0x0018
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r0 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A07
            if (r2 != r0) goto L_0x001b
        L_0x0018:
            r5 = 1
            if (r8 == 0) goto L_0x0068
        L_0x001b:
            r5 = 0
            if (r8 == 0) goto L_0x0068
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r1 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A05
        L_0x0020:
            X.4Cl r0 = r3.A03
            r0.Ehx(r1)
            r0 = -2
            X.1NY r4 = new X.1NY
            r4.<init>(r7, r0)
            r4.A04()
            r0 = 1918(0x77e, float:2.688E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0A(r0)
            if (r8 == 0) goto L_0x0065
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r0 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A05
        L_0x003b:
            java.lang.String r1 = r0.A00
            r0 = 5172(0x1434, float:7.248E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A9m(r0, r1)
            if (r5 == 0) goto L_0x004f
            java.lang.String r1 = "check_pending_archive"
            java.lang.String r0 = "1"
            r4.A9m(r1, r0)
        L_0x004f:
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r4.A0Q(r1, r0)
            r0 = 1
            r4.A0R = r0
            X.1OC r1 = r4.A0M()
            X.EDK r0 = new X.EDK
            r0.<init>(r2, r6, r3)
            r1.A00 = r0
            return r1
        L_0x0065:
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r0 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A04
            goto L_0x003b
        L_0x0068:
            com.instagram.api.schemas.ReelAutoArchiveSettingStr r1 = com.instagram.api.schemas.ReelAutoArchiveSettingStr.A04
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass738.A02(X.1P0, com.instagram.common.session.UserSession, boolean, boolean):X.1OC");
    }

    public static final 1OC A03(UserSession userSession, Integer num, String str, String str2, boolean z) {
        String str3;
        0qQ.A0B(userSession, 0);
        1Fc r2 = new 1Fc();
        r2.A05("max_id", str);
        r2.A05("include_memories", String.valueOf(z));
        String A01 = r2.A01(002.A0R("v1:", "archive/reel/day_shells_paginated/"));
        0qQ.A07(A01);
        1NY r22 = new 1NY(userSession, -2);
        r22.A08(AnonymousClass05K.A0N);
        r22.A0A("archive/reel/day_shells_paginated/");
        r22.A9m("max_id", str);
        if (z) {
            str3 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str3 = "0";
        }
        r22.A9m("include_memories", str3);
        r22.A9m("reel_id", str2);
        r22.A9m(AnonymousClass000.A00(1895), String.valueOf(1G0.A00()));
        r22.A07 = num;
        r22.A0A = A01;
        r22.A0O((15p) null, C43824CEq.class, D0O.class, false);
        return r22.A0M();
    }

    public static final 1OC A04(UserSession userSession, String str, String str2, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str2, 2);
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A01);
        r2.A0A(0mp.A06("archive/reel/%s/mark_memory_seen/", new Object[]{str}));
        r2.A9m("source", str2);
        r2.A0H("did_dismiss_badge", z);
        r2.A9m(AnonymousClass000.A00(1895), String.valueOf(1G0.A00()));
        r2.A0O((15p) null, 1XP.class, 1XY.class, false);
        return r2.A0M();
    }

    public static final AnonymousClass4Z5 A05(Context context, UserSession userSession, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Integer num2, String str, boolean z) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        String str2 = str;
        0qQ.A0B(str2, 2);
        Integer num3 = num;
        0qQ.A0B(num3, 3);
        String A0g = 002.A0g("highlights/", str2, "/highlights_tray/");
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        String obj2 = UUID.randomUUID().toString();
        0qQ.A07(obj2);
        boolean z2 = false;
        1NY r2 = new 1NY(userSession, -2);
        r2.A08(AnonymousClass05K.A0N);
        r2.A0A(A0g);
        r2.A07 = num3;
        r2.A0A = A0g;
        r2.A0O((15p) null, AnonymousClass3HO.class, AnonymousClass1NR.class, false);
        Pair A00 = C278474ww.A00(userSession);
        Object obj3 = A00.first;
        0qQ.A06(obj3);
        r2.A0G((String) obj3, (String) A00.second);
        if (z) {
            1G2.A00(context, r2, userSession, new 1Cn(context), false);
        }
        r2.A09(num2, "max_highlights_to_fetch_on_pagination");
        if (str2.equals(userSession.A06) && 182.A06(0Tu.A05, userSession, 36322289314179110L)) {
            z2 = true;
        }
        r2.A0H("should_include_my_week_preview", z2);
        r2.A0E("fetch_high_res_cover_image", bool);
        r2.A0E("check_highlights_subtab_gating", bool2);
        r2.A9m("threads_app_version", 0oI.A05(context, "com.instagram.barcelona"));
        r2.A0E("only_fetch_archived_highlights", bool3);
        return new AnonymousClass4Z5(r2.A0M(), num3, AnonymousClass05K.A15, AnonymousClass05K.A0C, obj, obj2, (List) null);
    }

    public static final void A06(Context context, 1P0 r10, UserSession userSession, 1Xj r12, 1sw r13, C270394gf r14) {
        String str;
        1sw r7 = r13;
        if (r13 == 1sw.A04) {
            str = "media/%s/only_me/";
        } else {
            str = "media/%s/undo_only_me/";
        }
        1NY r2 = new 1NY(userSession, -2);
        r2.A04();
        r2.A0A(0mp.A06(str, new Object[]{r12.getId()}));
        r2.A9m("media_id", r12.getId());
        r2.A0Q(1XP.class, 1XY.class);
        r2.A0R = true;
        1OC A0M = r2.A0M();
        AnonymousClass6ST r8 = new AnonymousClass6ST(context, true);
        r8.A00(context.getString(2131965491));
        r8.setOwnerActivity(C61270mF.A00(context));
        A0M.A00 = new ED7(context, userSession, r12, r7, r8, r14);
        if (r10 != null) {
            A0M.A00 = r10;
        }
        1ES.A01().schedule(A0M);
    }

    public static final void A07(Context context, UserSession userSession, 1Xj r11) {
        1Xj r5 = r11;
        String A2n = r11.A2n();
        if (A2n != null) {
            1OC A02 = LSW.A02(userSession, A2n);
            1sw r6 = 1sw.A04;
            AnonymousClass6ST r7 = new AnonymousClass6ST(context, true);
            r7.A00(context.getString(2131965491));
            r7.setOwnerActivity(C61270mF.A00(context));
            A02.A00 = new ED7(context, userSession, r5, r6, r7, (C270394gf) null);
            1ES.A01().schedule(A02);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A09(X3E x3e, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        r2.A04("highlight_id", str);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        1vm.A01(userSession).A01((2Kw) null, new C19037WHo(x3e), new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGProfileArchiveHighlightQuery", r2.getParamsCopy(), r1.getParamsCopy(), IGProfileArchiveHighlightQueryResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_archive_highlight", new ArrayList()));
    }

    public static final void A0A(X3E x3e, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        2IS r2 = new 2IS();
        2IS r1 = new 2IS();
        r2.A04("highlight_id", str);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        1vm.A01(userSession).A01((2Kw) null, new C19038WHp(x3e), new PandoGraphQLRequest(AnonymousClass1vS.A00(), "IGProfileUnarchiveHighlightQuery", r2.getParamsCopy(), r1.getParamsCopy(), IGProfileUnarchiveHighlightQueryResponseImpl.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xdt_unarchive_highlight", new ArrayList()));
    }

    public static final void A08(1NY r19, String str, String str2, List list, int i, int i2) {
        Object[] objArr;
        String str3;
        String A06;
        String str4 = str;
        String str5 = str2;
        if (str != null) {
            if (str2 != null) {
                throw new IllegalArgumentException("Cover media id and cover upload id cannot both be set");
            }
        } else if (str2 == null) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0c();
            if (str != null) {
                A0A.A0R("media_id", str4);
            } else if (str2 != null) {
                A0A.A0R("upload_id", str5);
            } else {
                throw new IllegalStateException("coverUploadId should not be null");
            }
            List list2 = list;
            int i3 = i;
            int i4 = i2;
            if (list != null) {
                if (list2.size() == 4) {
                    float floatValue = ((Number) list2.get(0)).floatValue();
                    float floatValue2 = ((Number) list2.get(1)).floatValue();
                    float floatValue3 = ((Number) list2.get(2)).floatValue();
                    float f = (float) i4;
                    float f2 = (float) i3;
                    float f3 = (floatValue3 * f) - (floatValue * f);
                    float floatValue4 = (((Number) list2.get(3)).floatValue() * f2) - (floatValue2 * f2);
                    if (!(floatValue4 == 0.0f || f3 == 0.0f || Math.abs(floatValue4 - f3) > 5.0f)) {
                        A0A.A0R("crop_rect", 002.A0E(C239023El.A00(',').A02(list2), '[', ']'));
                        A0A.A0Z();
                        A0A.close();
                        r19.A9m("cover", stringWriter.toString());
                    }
                }
            }
            if (list == null) {
                A06 = "Received CropRect was null when we had a passed in cover id";
            } else {
                if (list2.size() != 4) {
                    objArr = new Object[]{Integer.valueOf(list2.size())};
                    str3 = "CropRect size was incorrect. Expected sized 4, got size: %d";
                } else {
                    objArr = new Object[]{list2.get(0), list2.get(1), list2.get(2), list2.get(3), Integer.valueOf(i3), Integer.valueOf(i4)};
                    str3 = "Passed in invalid crop rect: left: %f, right: %f, top: %f, bottom: %f, coverHeight: %d, coverWidth: %d";
                }
                A06 = 0mp.A06(str3, objArr);
            }
            0wb.A03("ArchiveApiUtil", A06);
            RectF A08 = JW0.A08(JW0.A02(new Rect(0, 0, i4, i3)), i4, i3);
            A0A.A0R("crop_rect", 002.A0E(C239023El.A00(',').A02(0sr.A1P(new Float[]{Float.valueOf(A08.left), Float.valueOf(A08.top), Float.valueOf(A08.right), Float.valueOf(A08.bottom)})), '[', ']'));
            A0A.A0Z();
            A0A.close();
            r19.A9m("cover", stringWriter.toString());
        } catch (IOException e) {
            0wb.A06("ArchiveApiUtil", "Unable to add highlights cover image data", e);
        }
    }
}
