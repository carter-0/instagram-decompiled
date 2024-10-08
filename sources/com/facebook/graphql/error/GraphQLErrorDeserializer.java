package com.facebook.graphql.error;

import com.facebook.common.json.FbJsonDeserializer;
import java.util.Map;

public class GraphQLErrorDeserializer extends FbJsonDeserializer {
    public static Map A00;

    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        A00.put(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010f, code lost:
        X.SS5.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r1 != null) goto L_0x0016;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.common.json.FbJsonField A0N(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Class<com.facebook.graphql.error.GraphQLErrorDeserializer> r2 = com.facebook.graphql.error.GraphQLErrorDeserializer.class
            monitor-enter(r2)
            java.util.Map r0 = A00     // Catch:{ all -> 0x0117 }
            if (r0 != 0) goto L_0x000e
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0117 }
            A00 = r0     // Catch:{ all -> 0x0117 }
            goto L_0x0019
        L_0x000e:
            java.lang.Object r1 = r0.get(r4)     // Catch:{ all -> 0x0117 }
            com.facebook.common.json.FbJsonField r1 = (com.facebook.common.json.FbJsonField) r1     // Catch:{ all -> 0x0117 }
            if (r1 == 0) goto L_0x0019
        L_0x0016:
            monitor-exit(r2)     // Catch:{ all -> 0x0117 }
            goto L_0x010a
        L_0x0019:
            int r0 = r4.hashCode()     // Catch:{ Exception -> 0x010e }
            switch(r0) {
                case -2001855728: goto L_0x00f1;
                case -1857640538: goto L_0x00e1;
                case -1840544998: goto L_0x00d0;
                case -1724546052: goto L_0x00c1;
                case -1198128887: goto L_0x00b0;
                case -1090636345: goto L_0x009f;
                case -438288118: goto L_0x008e;
                case -258359883: goto L_0x007d;
                case -168279748: goto L_0x0069;
                case 3059181: goto L_0x0059;
                case 1028291630: goto L_0x0047;
                case 1478300413: goto L_0x0036;
                case 1503300620: goto L_0x0022;
                default: goto L_0x0020;
            }     // Catch:{ Exception -> 0x010e }
        L_0x0020:
            goto L_0x010b
        L_0x0022:
            java.lang.String r0 = "requires_reauth"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "requiresReauth"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x0036:
            java.lang.String r1 = "severity"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r0 = com.facebook.graphql.error.GraphQLError.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x0047:
            java.lang.String r0 = "fb_request_id"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "fbRequestId"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x0059:
            java.lang.String r1 = "code"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r0 = com.facebook.graphql.error.GraphQLError.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x0069:
            java.lang.String r0 = "query_path"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "queryPath"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x007d:
            java.lang.String r0 = "is_transient"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "isTransient"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x008e:
            java.lang.String r0 = "is_silent"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "isSilent"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x009f:
            java.lang.String r0 = "help_center_id"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "helpCenterId"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x00b0:
            java.lang.String r0 = "api_error_code"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "apiErrorCode"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x00c1:
            java.lang.String r1 = "description"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r0 = com.facebook.graphql.error.GraphQLError.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x00d0:
            java.lang.String r0 = "debug_info"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "debugInfo"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x00e1:
            java.lang.String r1 = "summary"
            boolean r0 = r4.equals(r1)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r0 = com.facebook.graphql.error.GraphQLError.class
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r0, r1)     // Catch:{ Exception -> 0x010e }
            goto L_0x0103
        L_0x00f1:
            java.lang.String r0 = "sentry_block_user_info"
            boolean r0 = r4.equals(r0)     // Catch:{ Exception -> 0x010e }
            if (r0 == 0) goto L_0x010b
            java.lang.Class<com.facebook.graphql.error.GraphQLError> r1 = com.facebook.graphql.error.GraphQLError.class
            java.lang.String r0 = "sentryBlockUserInfo"
            com.facebook.common.json.FbJsonField r1 = X.Pxj.A0P(r1, r0)     // Catch:{ Exception -> 0x010e }
        L_0x0103:
            java.util.Map r0 = A00     // Catch:{ all -> 0x0117 }
            r0.put(r4, r1)     // Catch:{ all -> 0x0117 }
            goto L_0x0016
        L_0x010a:
            return r1
        L_0x010b:
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0117 }
            return r0
        L_0x010e:
            r0 = move-exception
            X.SS5.A02(r0)     // Catch:{ all -> 0x0117 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0117 }
            throw r0     // Catch:{ all -> 0x0117 }
        L_0x0117:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0117 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.error.GraphQLErrorDeserializer.A0N(java.lang.String):com.facebook.common.json.FbJsonField");
    }

    public GraphQLErrorDeserializer() {
        this.A00 = GraphQLError.class;
    }
}
