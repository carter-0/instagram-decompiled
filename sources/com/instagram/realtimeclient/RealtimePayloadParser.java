package com.instagram.realtimeclient;

import X.C291065gS;

public class RealtimePayloadParser {
    public static RealtimePayload parse(C291065gS r2) {
        String str = r2.A00;
        if (RealtimeConstants.MQTT_TOPIC_SKYWALKER.equals(str)) {
            return parseSkywalkerMessage(r2);
        }
        if (RealtimeConstants.MQTT_TOPIC_REALTIME_META_SUBSCRIBE.equals(str)) {
            return parseGraphQLSubscriptionMessage(r2);
        }
        return null;
    }

    public static RealtimePayload parseGraphQLSubscriptionMessage(C291065gS r2) {
        GraphQLSubscriptionMessage graphQLSubscriptionMessage = new GraphQLSubscriptionMessage(r2.A01);
        return new RealtimePayload(graphQLSubscriptionMessage.getMessageTopicAsString(), graphQLSubscriptionMessage.getMessagePayloadAsString());
    }

    public static RealtimePayload parseSkywalkerMessage(C291065gS r2) {
        SkywalkerMessage skywalkerMessage = new SkywalkerMessage(r2.A01);
        return new RealtimePayload(Integer.toString(skywalkerMessage.mMessageType.intValue()), skywalkerMessage.getPayloadAsString());
    }
}
