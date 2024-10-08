package com.facebook.graphql.error;

import com.facebook.graphservice.interfaces.Summary;
import com.facebook.tigon.TigonError;
import java.io.IOException;

public class GraphServicesException extends IOException {
    public final GraphQLError mError;
    public String mErrorMsg;
    public final Summary mSummary;
    public final TigonError mTigonError;

    public GraphServicesException(TigonError tigonError, Summary summary) {
        super("GraphServicesError ( empty )");
        this.mTigonError = tigonError;
        this.mSummary = summary;
        this.mError = toGraphQLError();
        this.mErrorMsg = toMessageString();
    }

    private GraphQLError toGraphQLError() {
        String str;
        Summary summary = this.mSummary;
        if (summary == null || (str = summary.summary) == null || str.isEmpty()) {
            return null;
        }
        int i = summary.apiErrorCode;
        int i2 = summary.code;
        String str2 = summary.debugInfo;
        String str3 = summary.fbRequestId;
        return new GraphQLError(str, summary.description, str3, str2, i2, i, 0, summary.isSilent, summary.isTransient, summary.requiresReauth);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0084, code lost:
        if (r3 != null) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String toMessageString() {
        /*
            r4 = this;
            com.facebook.tigon.TigonError r1 = r4.mTigonError
            if (r1 == 0) goto L_0x0051
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "TigonError(error="
            r3.append(r0)
            com.facebook.tigon.iface.TigonErrorCode r0 = r1.category
            X.Pxf.A1O(r3, r0)
            java.lang.String r0 = ", errorDomain="
            r3.append(r0)
            com.facebook.tigon.TigonError r1 = r4.mTigonError
            java.lang.String r0 = r1.errorDomain
            r3.append(r0)
            java.lang.String r0 = ", domainErrorCode="
            r3.append(r0)
            int r0 = r1.domainErrorCode
            r3.append(r0)
            java.lang.String r1 = r1.analyticsDetail
            if (r1 == 0) goto L_0x0043
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0043
            r0 = 1034(0x40a, float:1.449E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "\""
            r3.append(r0)
        L_0x0043:
            java.lang.String r0 = ")"
        L_0x0045:
            r3.append(r0)
        L_0x0048:
            java.lang.String r0 = r3.toString()
            if (r0 != 0) goto L_0x0050
        L_0x004e:
            java.lang.String r0 = "GraphServicesError (empty)"
        L_0x0050:
            return r0
        L_0x0051:
            com.facebook.graphql.error.GraphQLError r2 = r4.mError
            if (r2 == 0) goto L_0x0082
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "[code] "
            r3.append(r0)
            int r0 = r2.code
            r1 = -1
            if (r0 != r1) goto L_0x0065
            int r0 = r2.A00
        L_0x0065:
            r3.append(r0)
            java.lang.String r0 = " [message]: "
            r3.append(r0)
            java.lang.String r0 = r2.description
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = r2.A02
        L_0x0073:
            r3.append(r0)
            java.lang.String r0 = " [extra]: "
            r3.append(r0)
            java.lang.String r0 = r2.debugInfo
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = r2.A01
            goto L_0x0045
        L_0x0082:
            com.facebook.graphservice.interfaces.Summary r3 = r4.mSummary
            if (r3 == 0) goto L_0x004e
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.error.GraphServicesException.toMessageString():java.lang.String");
    }

    public GraphQLError getGraphQLError() {
        return this.mError;
    }

    public String getMessage() {
        return this.mErrorMsg;
    }

    public Summary getSummary() {
        return this.mSummary;
    }

    public TigonError getTigonError() {
        return this.mTigonError;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GraphServicesException(com.facebook.tigon.TigonErrorException r2, com.facebook.graphservice.interfaces.Summary r3) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0007
            r0 = 0
        L_0x0003:
            r1.<init>((com.facebook.tigon.TigonError) r0, (com.facebook.graphservice.interfaces.Summary) r3)
            return
        L_0x0007:
            com.facebook.tigon.TigonError r0 = r2.tigonError
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.error.GraphServicesException.<init>(com.facebook.tigon.TigonErrorException, com.facebook.graphservice.interfaces.Summary):void");
    }
}
