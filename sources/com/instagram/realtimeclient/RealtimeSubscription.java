package com.instagram.realtimeclient;

import X.002;
import X.0KC;
import X.AnonymousClass000;
import X.AnonymousClass7TF;
import X.C13991Tnr;
import X.JTT;
import X.Pxf;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class RealtimeSubscription {
    public static final String GRAPHQL_MQTT_VERSION = "1";
    public static final String GRAPHQL_SUBSCRIPTIONS_SUBTOPIC = "graphqlsubscriptions";
    public static final String GRAPHQL_SUBSCRIPTION_TOPIC_PREFIX = "1/graphqlsubscriptions";
    public static final String INPUT_DATA = "input_data";
    public static final RealtimeSubscription NO_SUBSCRIPTION = new RealtimeSubscription("", new JSONObject());
    public static final Class TAG = RealtimeSubscription.class;
    public final JSONObject mInputParams;
    public final String mSubscriptionQueryId;

    public String getSubscriptionString(boolean z) {
        return getSubscriptionString(z, false);
    }

    public static RealtimeSubscription fromSubscriptionString(String str) {
        String str2;
        RealtimeSubscription realtimeSubscription = NO_SUBSCRIPTION;
        JSONObject jSONObject = new JSONObject();
        String[] split = str.split("/");
        int length = split.length;
        if (length < 3) {
            return realtimeSubscription;
        }
        String str3 = split[2];
        if (length > 3 && (str2 = split[3]) != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str2);
                if (jSONObject2.optJSONObject(INPUT_DATA) != null) {
                    jSONObject = jSONObject2.getJSONObject(INPUT_DATA);
                }
            } catch (JSONException unused) {
            }
        }
        return new RealtimeSubscription(str3, jSONObject);
    }

    public static RealtimeSubscription getDirectTypingSubscription(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.DIRECT_TYPING_INDICATOR_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getFleetBeaconSubscription(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", str2);
            jSONObject.put("a_test_id", str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.FLEET_BEACON_ID, jSONObject);
    }

    public JSONObject copyOfParameters() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = this.mInputParams.keys();
        while (keys.hasNext()) {
            JTT.A1U(arrayList, keys);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            return new JSONObject(this.mInputParams, Pxf.A1a(arrayList, arrayList.size()));
        } catch (JSONException e) {
            0KC.A05(TAG, "failed to clone properties of parameters.", e);
            return jSONObject;
        }
    }

    public String getSubscriptionQueryId() {
        return this.mSubscriptionQueryId;
    }

    public String subscriptionName() {
        return GraphQLSubscriptionID.idToString(this.mSubscriptionQueryId);
    }

    public RealtimeSubscription(String str, JSONObject jSONObject) {
        this.mSubscriptionQueryId = str;
        this.mInputParams = jSONObject;
    }

    public static RealtimeSubscription getClientConfigUpdateSubscription() {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", A0b);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.CLIENT_CONFIG_UPDATE_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getIgLiveModeratorSubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            C13991Tnr.A1J(A0b, str, jSONObject);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IGLIVE_MODERATOR_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getIgLiveUserPaySubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            C13991Tnr.A1J(A0b, str, jSONObject);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IGLIVE_USER_PAY_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getIgLiveWaveSubscription(String str, String str2) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            C13991Tnr.A1J(A0b, str, jSONObject);
            jSONObject.put("receiver_id", str2);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IGLIVE_WAVE_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getInteractivityActivateQuestionSubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            C13991Tnr.A1J(A0b, str, jSONObject);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IG_INTERACTIVITY_ACTIVATE_QUESTION_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getInteractivityRealtimeQuestionSubmissionsStatusSubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            C13991Tnr.A1J(A0b, str, jSONObject);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IG_INTERACTIVITY_REALTIME_SUBMISSIONS_STATUS_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getInteractivitySubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            C13991Tnr.A1J(A0b, str, jSONObject);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.IG_INTERACTIVITY_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getLiveRealtimeCommentsSubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            C13991Tnr.A1J(A0b, str, jSONObject);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.LIVE_REALTIME_COMMENT_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getMediaFeedbackSubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", A0b);
            jSONObject.put("feedback_id", str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.FEEDBACK_LIKE_SUBSCRIBE_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getVideoCallInCallAlertSubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", A0b);
            jSONObject.put(AnonymousClass000.A00(821), str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.VIDEO_CALL_IN_CALL_ALERT_QUERY_ID, jSONObject);
    }

    public static RealtimeSubscription getVideoCallPrototypePublishSubscription(String str) {
        String A0b = AnonymousClass7TF.A0b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("client_subscription_id", A0b);
            jSONObject.put(AnonymousClass000.A00(821), str);
        } catch (JSONException unused) {
        }
        return new RealtimeSubscription(GraphQLSubscriptionID.VIDEO_CALL_PROTOTYPE_PUBLISH_QUERY_ID, jSONObject);
    }

    public String getSubscriptionString(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(INPUT_DATA, this.mInputParams);
            if (z) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("client_logged", true);
                if (z2) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("deep_ack", true);
                    jSONObject2.put("heartbeat", jSONObject3);
                }
                jSONObject.put(AnonymousClass000.A00(1990), jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return 002.A0u("1/graphqlsubscriptions/", this.mSubscriptionQueryId, "/", jSONObject.toString());
    }
}
