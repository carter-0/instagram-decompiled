package com.facebook.graphql.error;

import X.2PP;
import X.AnonymousClass7TE;
import X.C66726MbX;
import X.Pxg;
import X.SWS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.json.AutoGenJsonDeserializer;
import com.facebook.common.json.AutoGenJsonSerializer;
import com.facebook.http.protocol.ApiErrorResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableMap;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

@AutoGenJsonDeserializer
@AutoGenJsonSerializer
@JsonDeserialize(using = GraphQLErrorDeserializer.class)
@JsonSerialize(using = GraphQLErrorSerializer.class)
public class GraphQLError extends ApiErrorResult {
    public static final Parcelable.Creator CREATOR = SWS.A00(87);
    @JsonProperty("api_error_code")
    public final int apiErrorCode;
    @JsonProperty("code")
    public final int code;
    @JsonProperty("debug_info")
    public final String debugInfo;
    @JsonProperty("description")
    public final String description;
    @JsonProperty("fb_request_id")
    public final String fbRequestId;
    @JsonProperty("help_center_id")
    public final long helpCenterId;
    @JsonProperty("is_silent")
    public final boolean isSilent;
    @JsonProperty("is_transient")
    public final boolean isTransient;
    @JsonProperty("query_path")
    public final String queryPath;
    @JsonProperty("requires_reauth")
    public final boolean requiresReauth;
    @JsonProperty("sentry_block_user_info")
    public final ImmutableMap<String, String> sentryBlockUserInfo;
    @JsonProperty("severity")
    public final String severity;
    @JsonProperty("summary")
    public final String summary;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GraphQLError)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        GraphQLError graphQLError = (GraphQLError) obj;
        if (!2PP.A00(Integer.valueOf(this.code), Integer.valueOf(graphQLError.code)) || !2PP.A00(Integer.valueOf(this.apiErrorCode), Integer.valueOf(graphQLError.apiErrorCode)) || !2PP.A00(this.summary, graphQLError.summary) || !2PP.A00(this.description, graphQLError.description) || !2PP.A00(Boolean.valueOf(this.isSilent), Boolean.valueOf(graphQLError.isSilent)) || !2PP.A00(Boolean.valueOf(this.isTransient), Boolean.valueOf(graphQLError.isTransient)) || !2PP.A00(this.fbRequestId, graphQLError.fbRequestId) || !2PP.A00(Boolean.valueOf(this.requiresReauth), Boolean.valueOf(graphQLError.requiresReauth)) || !2PP.A00(this.debugInfo, graphQLError.debugInfo) || !2PP.A00(this.queryPath, graphQLError.queryPath) || !2PP.A00(this.sentryBlockUserInfo, graphQLError.sentryBlockUserInfo) || !2PP.A00(this.severity, graphQLError.severity) || !2PP.A00(Long.valueOf(this.helpCenterId), Long.valueOf(graphQLError.helpCenterId))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        C66726MbX mbX = new C66726MbX(GraphQLError.class.getSimpleName());
        mbX.A02(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, this.code);
        mbX.A02("api_error_code", this.apiErrorCode);
        mbX.A01(this.summary, "summary");
        mbX.A01(this.description, DevServerEntity.COLUMN_DESCRIPTION);
        mbX.A04("is_silent", this.isSilent);
        mbX.A04("requires_reauth", this.requiresReauth);
        mbX.A01(this.debugInfo, "debug_info");
        mbX.A01(this.queryPath, "query_path");
        mbX.A01(this.sentryBlockUserInfo, "sentry_block_user_info");
        mbX.A01(this.severity, "severity");
        mbX.A03("help_center_id", this.helpCenterId);
        return mbX.toString();
    }

    public GraphQLError(Parcel parcel) {
        super(parcel);
        this.code = parcel.readInt();
        this.apiErrorCode = parcel.readInt();
        this.summary = parcel.readString();
        this.description = parcel.readString();
        this.isSilent = Pxg.A1U(parcel);
        this.isTransient = Pxg.A1U(parcel);
        this.fbRequestId = parcel.readString();
        this.requiresReauth = Pxg.A1U(parcel);
        this.debugInfo = parcel.readString();
        this.queryPath = parcel.readString();
        ImmutableMap<String, String> copyOf = ImmutableMap.copyOf(AnonymousClass7TE.A1E());
        this.sentryBlockUserInfo = copyOf;
        parcel.readMap(copyOf, ImmutableMap.class.getClassLoader());
        this.severity = parcel.readString();
        this.helpCenterId = parcel.readLong();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.code);
        parcel.writeInt(this.apiErrorCode);
        parcel.writeString(this.summary);
        parcel.writeString(this.description);
        parcel.writeInt(this.isSilent ? 1 : 0);
        parcel.writeInt(this.isTransient ? 1 : 0);
        parcel.writeString(this.fbRequestId);
        parcel.writeInt(this.requiresReauth ? 1 : 0);
        parcel.writeString(this.debugInfo);
        parcel.writeString(this.queryPath);
        parcel.writeMap(this.sentryBlockUserInfo);
        parcel.writeString(this.severity);
        parcel.writeLong(this.helpCenterId);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GraphQLError(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, int r16, long r17, boolean r19, boolean r20, boolean r21) {
        /*
            r10 = this;
            r0 = 0
            X.RDg r3 = X.C8865RDg.GRAPHQL_KERROR_DOMAIN
            r2 = r10
            r7 = r11
            r4 = r12
            r6 = r13
            r5 = r14
            r8 = r15
            r9 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10.code = r15
            r1 = r16
            r10.apiErrorCode = r1
            r10.summary = r11
            r10.description = r12
            r1 = r19
            r10.isSilent = r1
            r10.isTransient = r9
            r10.fbRequestId = r13
            r1 = r21
            r10.requiresReauth = r1
            r10.debugInfo = r14
            r10.queryPath = r0
            r10.sentryBlockUserInfo = r0
            r10.severity = r0
            r0 = r17
            r10.helpCenterId = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.graphql.error.GraphQLError.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, long, boolean, boolean, boolean):void");
    }

    public GraphQLError() {
        this((String) null, (String) null, (String) null, (String) null, -1, -1, -1, false, false, false);
    }
}
