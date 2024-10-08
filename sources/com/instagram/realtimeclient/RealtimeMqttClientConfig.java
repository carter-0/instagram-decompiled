package com.instagram.realtimeclient;

import X.002;
import X.0xI;
import X.1Au;
import X.1Av;
import X.1Ch;
import X.2HM;
import X.AnonymousClass0iw;
import X.C2596242k;
import X.C2596542n;
import X.C60510iO;
import X.C61120lW;
import X.C61930qI;
import X.SRO;
import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.L;
import com.instagram.realtimeclient.clientconfig.RealtimeClientConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class RealtimeMqttClientConfig extends C2596242k {
    public static final Class TAG = RealtimeMqttClientConfig.class;
    public final C2596542n mAnalyticsLogger = new C2596542n() {
        public synchronized void reportEvent(final SRO sro) {
            if (RealtimeMqttClientConfig.this.mRealtimeClientConfig.getMqttAnalyticsLoggingEnabled()) {
                0xI A00 = 0xI.A00(new AnonymousClass0iw() {
                    public String getModuleName() {
                        return sro.A04;
                    }
                }, sro.A05);
                for (Map.Entry entry : sro.A06.entrySet()) {
                    A00.A0C((String) entry.getKey(), (String) entry.getValue());
                }
                A00.A0B("client_nano_time", Long.valueOf(System.nanoTime()));
                C60510iO.A00(RealtimeMqttClientConfig.this.mUserSession).EFq(A00);
            }
        }
    };
    public String mCurrentlyConnectedHost;
    public final RealtimeClientConfig mRealtimeClientConfig;
    public final UserSession mUserSession;

    public int getHealthStatsSamplingRate() {
        return 30;
    }

    public synchronized void setHost(String str, String str2, boolean z) {
        if (str != null) {
            if (!str.equals(this.mCurrentlyConnectedHost)) {
                this.mCurrentlyConnectedHost = str;
                if (z) {
                    this.mPreferredTier = "sandbox";
                    setPreferredSandbox(this.mCurrentlyConnectedHost);
                } else {
                    this.mPreferredTier = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    setMqttConnectionConfig(002.A0g("{\"host_name_v6\":\"", this.mCurrentlyConnectedHost, "\"}"));
                    this.mFallbackHostName = str2;
                }
            }
        }
    }

    private String getEverclearSubscriptions() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inapp_notification_subscribe_comment", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_comment_mention_and_reply", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put(GraphQLSubscriptionID.VIDEO_CALL_PARTICIPANT_ANSWER_STATE_QUERY_NAME, GraphQLSubscriptionID.VIDEO_CALL_PARTICIPANT_ANSWER_STATE_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_story_emoji_reaction", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_prompt_sticker_reply", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            jSONObject.put("inapp_notification_subscribe_fundraiser_cohost_invited", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            if (L.ig_android_reels_together.is_enabled.getAndExpose(this.mUserSession).booleanValue()) {
                jSONObject.put("inapp_notification_subscribe_reels_together", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
            }
            jSONObject.put("inapp_notification_subscribe_watch_receipt", GraphQLSubscriptionID.IG_INAPP_NOTIFICATION_QUERY_ID);
        } catch (JSONException unused) {
        }
        if (jSONObject.length() > 0) {
            return jSONObject.toString();
        }
        return null;
    }

    private String getPubSubMsgTypeBlacklist() {
        return 002.A0R(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, ", typing_type");
    }

    public C2596542n getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    public Map getAppSpecificInfo() {
        Context A06 = this.mUserSession.A03.A06();
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put("app_version", C61120lW.A04(A06));
        hashMap.put("capabilities", "3brTv10=");
        hashMap.put("Accept-Language", C61930qI.A00());
        hashMap.put("User-Agent", 1Ch.A00());
        hashMap.put("ig_mqtt_route", "django");
        if (this.mRealtimeClientConfig.getMqttAnalyticsLoggingEnabled()) {
            hashMap.put("client_session_id", String.valueOf(System.currentTimeMillis()));
        }
        String A0R = 002.A0R(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, ", typing_type");
        if (!TextUtils.isEmpty(A0R)) {
            hashMap.put("pubsub_msg_type_blacklist", A0R);
        }
        String everclearSubscriptions = getEverclearSubscriptions();
        if (!TextUtils.isEmpty(everclearSubscriptions)) {
            hashMap.put("everclear_subscriptions", everclearSubscriptions);
        }
        if (2HM.A00(this.mUserSession).A06()) {
            hashMap.put("presence_msys_consumption_enabled", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        return hashMap;
    }

    public String getRequestRoutingRegion() {
        1Av A00 = 1Au.A00(this.mUserSession);
        return (String) A00.A6r.CDM(A00, 1Av.A8a[178]);
    }

    public RealtimeMqttClientConfig(UserSession userSession, RealtimeClientConfig realtimeClientConfig) {
        this.mUserSession = userSession;
        this.mRealtimeClientConfig = realtimeClientConfig;
    }
}
