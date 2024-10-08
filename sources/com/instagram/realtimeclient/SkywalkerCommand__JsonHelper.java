package com.instagram.realtimeclient;

import X.0qQ;
import X.16F;
import X.16L;
import X.16P;
import X.17W;
import X.17Z;
import X.AnonymousClass15o;
import X.AnonymousClass1FD;
import java.io.StringWriter;
import java.util.Map;

public final class SkywalkerCommand__JsonHelper {
    public static SkywalkerCommand parseFromJson(16F r1) {
        return (SkywalkerCommand) 16P.A01(r1, new AnonymousClass1FD() {
            public SkywalkerCommand invoke(16F r2) {
                return SkywalkerCommand__JsonHelper.unsafeParseFromJson(r2);
            }
        });
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean processSingleField(com.instagram.realtimeclient.SkywalkerCommand r6, java.lang.String r7, X.16F r8) {
        /*
            java.lang.String r0 = "sub"
            boolean r0 = r0.equals(r7)
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r8.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0031
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0017:
            X.16L r1 = r8.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0031
            X.16L r1 = r8.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0017
            java.lang.String r0 = r8.A1P()
            if (r0 == 0) goto L_0x0017
            r4.add(r0)
            goto L_0x0017
        L_0x0031:
            r6.mSubscribeTopics = r4
            return r5
        L_0x0034:
            java.lang.String r0 = "unsub"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0066
            X.16L r1 = r8.A11()
            X.16L r0 = X.16L.A0C
            if (r1 != r0) goto L_0x0063
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x0049:
            X.16L r1 = r8.A1J()
            X.16L r0 = X.16L.A08
            if (r1 == r0) goto L_0x0063
            X.16L r1 = r8.A11()
            X.16L r0 = X.16L.A0G
            if (r1 == r0) goto L_0x0049
            java.lang.String r0 = r8.A1P()
            if (r0 == 0) goto L_0x0049
            r4.add(r0)
            goto L_0x0049
        L_0x0063:
            r6.mUnsubscribeTopics = r4
            return r5
        L_0x0066:
            java.lang.String r0 = "pub"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00a4
            X.16L r1 = r8.A11()
            X.16L r0 = X.16L.A0D
            if (r1 != r0) goto L_0x00a1
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
        L_0x007b:
            X.16L r1 = r8.A1J()
            X.16L r0 = X.16L.A09
            if (r1 == r0) goto L_0x00a0
            java.lang.String r2 = r8.A1P()
            r8.A1J()
            X.16L r1 = r8.A11()
            X.16L r0 = X.16L.A0G
            if (r1 != r0) goto L_0x0096
            r3.put(r2, r4)
            goto L_0x007b
        L_0x0096:
            java.lang.String r0 = r8.A1P()
            if (r0 == 0) goto L_0x007b
            r3.put(r2, r0)
            goto L_0x007b
        L_0x00a0:
            r4 = r3
        L_0x00a1:
            r6.mPublishTopicToPayload = r4
            return r5
        L_0x00a4:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.realtimeclient.SkywalkerCommand__JsonHelper.processSingleField(com.instagram.realtimeclient.SkywalkerCommand, java.lang.String, X.16F):boolean");
    }

    public static String serializeToJson(SkywalkerCommand skywalkerCommand) {
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        serializeToJson(A0A, skywalkerCommand, true);
        A0A.close();
        return stringWriter.toString();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.realtimeclient.SkywalkerCommand, java.lang.Object] */
    public static SkywalkerCommand unsafeParseFromJson(16F r3) {
        ? obj = new Object();
        if (r3.A11() != 16L.A0D) {
            r3.A0z();
            return null;
        }
        while (r3.A1J() != 16L.A09) {
            String A0q = r3.A0q();
            r3.A1J();
            processSingleField(obj, A0q, r3);
            r3.A0z();
        }
        return obj;
    }

    public static SkywalkerCommand parseFromJson(String str) {
        return parseFromJson(16P.A00(str));
    }

    public static void serializeToJson(17Z r3, SkywalkerCommand skywalkerCommand, boolean z) {
        if (z) {
            r3.A0c();
        }
        if (skywalkerCommand.mSubscribeTopics != null) {
            16P.A03(r3, "sub");
            for (String str : skywalkerCommand.mSubscribeTopics) {
                if (str != null) {
                    r3.A0t(str);
                }
            }
            r3.A0Y();
        }
        if (skywalkerCommand.mUnsubscribeTopics != null) {
            16P.A03(r3, "unsub");
            for (String str2 : skywalkerCommand.mUnsubscribeTopics) {
                if (str2 != null) {
                    r3.A0t(str2);
                }
            }
            r3.A0Y();
        }
        if (skywalkerCommand.mPublishTopicToPayload != null) {
            0qQ.A0B(r3, 0);
            r3.A0q("pub");
            r3.A0c();
            for (Map.Entry entry : skywalkerCommand.mPublishTopicToPayload.entrySet()) {
                if (!16P.A04(r3, entry)) {
                    r3.A0t((String) entry.getValue());
                }
            }
            r3.A0Z();
        }
        if (z) {
            r3.A0Z();
        }
    }
}
