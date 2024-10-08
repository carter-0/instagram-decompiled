package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.WNs  reason: case insensitive filesystem */
public final class C19160WNs implements AnonymousClass28l {
    public final Context A00;
    public final UserSession A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008d, code lost:
        if (r1.getBoolean(r5) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0079, code lost:
        if (r1.getBoolean("has_liked") == false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getContentInBackground(android.content.Context r17) {
        /*
            r16 = this;
            r0 = 0
            r1 = r17
            X.0qQ.A0B(r1, r0)
            r0 = r16
            android.content.Context r3 = r0.A00
            com.instagram.common.session.UserSession r0 = r0.A01
            java.lang.String r1 = r0.A06
            java.lang.String r0 = X.C61120lW.A04(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "MainFeed-%s-%s.json"
            java.lang.String r2 = X.0mp.A06(r0, r1)
            java.io.File r0 = r3.getCacheDir()
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00d9
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = X.0mb.A06(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r13 = "feed_items"
            org.json.JSONArray r12 = r0.getJSONArray(r13)
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            int r10 = r12.length()
            r9 = 0
        L_0x004e:
            if (r9 >= r10) goto L_0x00ce
            java.lang.Object r2 = r12.get(r9)
            r0 = 722(0x2d2, float:1.012E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r2, r0)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r1 = "media_or_ad"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L_0x00c9
            org.json.JSONObject r1 = r2.getJSONObject(r1)
            java.lang.String r8 = "has_liked"
            boolean r0 = r1.has(r8)
            r7 = 1
            if (r0 == 0) goto L_0x007b
            boolean r0 = r1.getBoolean(r8)
            r6 = 1
            if (r0 != 0) goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            r0 = 1405(0x57d, float:1.969E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.has(r5)
            if (r0 == 0) goto L_0x008f
            boolean r0 = r1.getBoolean(r5)
            r4 = 1
            if (r0 != 0) goto L_0x0090
        L_0x008f:
            r4 = 0
        L_0x0090:
            java.lang.String r3 = "is_seen"
            boolean r0 = r1.has(r3)
            if (r0 == 0) goto L_0x00cc
            boolean r0 = r1.getBoolean(r3)
            if (r0 == 0) goto L_0x00cc
        L_0x009e:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r15 = "id"
            java.lang.String r0 = r1.getString(r15)
            r2.put(r15, r0)
            java.lang.String r0 = "user"
            org.json.JSONObject r0 = r1.getJSONObject(r0)
            java.lang.String r1 = X.Dbf.A01()
            java.lang.Object r0 = r0.get(r1)
            r2.put(r1, r0)
            r2.put(r8, r6)
            r2.put(r5, r4)
            r2.put(r3, r7)
            r11.put(r2)
        L_0x00c9:
            int r9 = r9 + 1
            goto L_0x004e
        L_0x00cc:
            r7 = 0
            goto L_0x009e
        L_0x00ce:
            r14.put(r13, r11)
            java.lang.String r0 = r14.toString()
            X.0qQ.A0A(r0)
            return r0
        L_0x00d9:
            java.lang.String r0 = "home feed cache file doesn't exist"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19160WNs.getContentInBackground(android.content.Context):java.lang.String");
    }

    public final String getFilenamePrefix() {
        return "feed_cache";
    }

    public final String getFilenameSuffix() {
        return ".json";
    }

    public final /* synthetic */ boolean getShouldUploadSynchronously_DANGEROUS_DO_NOT_USE_OR_YOU_WILL_GET_FIRED() {
        return false;
    }

    public final String getTag() {
        return "FeedCacheLogCollector";
    }

    public C19160WNs(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
