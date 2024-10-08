package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

/* renamed from: X.42k  reason: invalid class name and case insensitive filesystem */
public abstract class C2596242k implements C2596342l {
    public final C2596542n mEmptyAnalyticsLogger = new C2596442m(this);
    public volatile String mFallbackHostName = null;
    public volatile String mMqttConnectionConfig = "{}";
    public volatile String mPreferredSandbox = "";
    public volatile String mPreferredTier = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;

    public C10676RwF earlyDataSslSocketFactoryAdapter() {
        return null;
    }

    public abstract C2596542n getAnalyticsLogger();

    public abstract Map getAppSpecificInfo();

    public String getCustomAnalyticsEventNameSuffix() {
        return null;
    }

    public long getEndpointCapabilities() {
        return 0;
    }

    public abstract int getHealthStatsSamplingRate();

    public abstract String getRequestRoutingRegion();

    public String getFallbackHostName() {
        return this.mFallbackHostName;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Td3, java.lang.Object] */
    public C13578Td3 getKeepaliveParams() {
        return new Object();
    }

    public String getMqttConnectionConfig() {
        return this.mMqttConnectionConfig;
    }

    public String getMqttConnectionPreferredSandbox() {
        return this.mPreferredSandbox;
    }

    public String getMqttConnectionPreferredTier() {
        return this.mPreferredTier;
    }

    public void setPreferredTier(String str) {
        if ("sandbox".equals(str) || GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(str)) {
            this.mPreferredTier = str;
            return;
        }
        throw new RuntimeException("Preferred tier must be either 'sandbox' or 'default'");
    }

    public void setMqttConnectionConfig(String str) {
        str.getClass();
        this.mMqttConnectionConfig = str;
    }

    public void setPreferredSandbox(String str) {
        str.getClass();
        this.mPreferredSandbox = str;
    }

    public void setFallbackHostName(String str) {
        this.mFallbackHostName = str;
    }
}
