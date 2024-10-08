package X;

import android.os.Parcelable;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.model.thread.ChannelsContextLine;
import com.instagram.user.model.User;
import java.io.StringWriter;

/* renamed from: X.5gC  reason: invalid class name and case insensitive filesystem */
public abstract class C290905gC {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14 */
    /* JADX WARNING: type inference failed for: r4v15 */
    /* JADX WARNING: type inference failed for: r4v16 */
    /* JADX WARNING: type inference failed for: r4v17 */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C290915gD parseFromJson(X.16F r5) {
        /*
            r2 = 0
            X.0qQ.A0B(r5, r2)
            X.5gD r1 = new X.5gD     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.<init>()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x018f
        L_0x0016:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 == r0) goto L_0x0190
            java.lang.String r3 = r5.A0q()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r5.A1J()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            java.lang.String r0 = "viewer_id"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r4 = 0
            if (r0 == 0) goto L_0x0040
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 == r0) goto L_0x003a
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
        L_0x003a:
            r1.A08 = r4     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
        L_0x003c:
            r5.A0z()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x0016
        L_0x0040:
            java.lang.String r0 = "thread_id"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x005a
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 == r0) goto L_0x0054
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
        L_0x0054:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A09 = r4     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x005a:
            java.lang.String r0 = "thread_title"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0071
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 == r0) goto L_0x006e
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
        L_0x006e:
            r1.A0A = r4     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x0071:
            java.lang.String r0 = "thread_type"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0088
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 == r0) goto L_0x0085
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
        L_0x0085:
            r1.A07 = r4     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x0088:
            java.lang.String r0 = "thread_subtype"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0097
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A01 = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x0097:
            java.lang.String r0 = "users"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x00c7
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 != r0) goto L_0x00c0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r4.<init>()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
        L_0x00ac:
            X.16L r3 = r5.A1J()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 == r0) goto L_0x00c0
            android.os.Parcelable$Creator r0 = com.instagram.user.model.User.CREATOR     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            com.instagram.user.model.User r0 = X.1aC.A00(r5, r2)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x00ac
            r4.add(r0)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x00ac
        L_0x00c0:
            X.0qQ.A0B(r4, r2)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A0B = r4     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x00c7:
            java.lang.String r0 = "canonical"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x00d7
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A0C = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x00d7:
            java.lang.String r0 = "named"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A0F = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x00e7:
            java.lang.String r0 = "pending"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x00f7
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A0G = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x00f7:
            java.lang.String r0 = "media_viewable"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0107
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A0E = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x0107:
            java.lang.String r0 = "creator_subscriber_thread_data"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0117
            com.instagram.direct.model.thread.CreatorSubscriberThreadInfo r0 = X.C293615l4.parseFromJson(r5)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A04 = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x0117:
            java.lang.String r0 = "creator_broadcast_thread_data"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0127
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r0 = X.C291115gY.parseFromJson(r5)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A03 = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x0127:
            java.lang.String r0 = "discoverable_thread_data"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x0137
            com.instagram.direct.model.thread.DiscoverableThreadInfo r0 = X.C293625l5.parseFromJson(r5)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A05 = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x0137:
            java.lang.String r0 = "context_line"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x014f
            X.16L r3 = r5.A11()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r3 == r0) goto L_0x014b
            java.lang.String r4 = r5.A1P()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
        L_0x014b:
            r1.A06 = r4     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x014f:
            java.lang.String r0 = "is_following_chat_creator"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x015f
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A0D = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x015f:
            java.lang.String r0 = "share_sheet_section"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x016f
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A00 = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x016f:
            java.lang.String r0 = "should_badge_in_invitations"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x017f
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A0H = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x017f:
            java.lang.String r0 = "channels_context_lines_data"
            boolean r0 = r0.equals(r3)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            if (r0 == 0) goto L_0x003c
            com.instagram.direct.model.thread.ChannelsContextLine r0 = X.C291125ga.parseFromJson(r5)     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            r1.A02 = r0     // Catch:{ IOException -> 0x0198, Exception -> 0x0191 }
            goto L_0x003c
        L_0x018f:
            r1 = 0
        L_0x0190:
            return r1
        L_0x0191:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x0198:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290905gC.parseFromJson(X.16F):X.5gD");
    }

    public static String A00(C290915gD r5) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        A0A.A0c();
        String str = r5.A08;
        if (str != null) {
            A0A.A0R("viewer_id", str);
        }
        String str2 = r5.A09;
        if (str2 != null) {
            A0A.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
        }
        String str3 = r5.A0A;
        if (str3 != null) {
            A0A.A0R("thread_title", str3);
        }
        String str4 = r5.A07;
        if (str4 != null) {
            A0A.A0R("thread_type", str4);
        }
        A0A.A0P("thread_subtype", r5.A01);
        16P.A03(A0A, "users");
        for (User user : r5.A0B) {
            if (user != null) {
                Parcelable.Creator creator = User.CREATOR;
                1aC.A08(A0A, user);
            }
        }
        A0A.A0Y();
        A0A.A0S("canonical", r5.A0C);
        A0A.A0S("named", r5.A0F);
        A0A.A0S("pending", r5.A0G);
        A0A.A0S("media_viewable", r5.A0E);
        if (r5.A04 != null) {
            A0A.A0q("creator_subscriber_thread_data");
            C293615l4.A00(A0A, r5.A04);
        }
        if (r5.A03 != null) {
            A0A.A0q("creator_broadcast_thread_data");
            C291115gY.A00(A0A, r5.A03);
        }
        if (r5.A05 != null) {
            A0A.A0q("discoverable_thread_data");
            C293625l5.A00(A0A, r5.A05);
        }
        String str5 = r5.A06;
        if (str5 != null) {
            A0A.A0R("context_line", str5);
        }
        A0A.A0S("is_following_chat_creator", r5.A0D);
        A0A.A0P("share_sheet_section", r5.A00);
        A0A.A0S("should_badge_in_invitations", r5.A0H);
        if (r5.A02 != null) {
            A0A.A0q("channels_context_lines_data");
            ChannelsContextLine channelsContextLine = r5.A02;
            A0A.A0c();
            String str6 = channelsContextLine.A01;
            if (str6 != null) {
                A0A.A0R("primary_channel_context_line_channels_tab", str6);
            }
            String str7 = channelsContextLine.A00;
            if (str7 != null) {
                A0A.A0R("primary_channel_context_line_search", str7);
            }
            String str8 = channelsContextLine.A02;
            if (str8 != null) {
                A0A.A0R("secondary_channel_context_line_search", str8);
            }
            A0A.A0Z();
        }
        A0A.A0Z();
        A0A.close();
        return stringWriter.toString();
    }
}
