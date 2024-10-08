package X;

import org.json.JSONObject;

public interface B2P {
    void enqueueEvent(JSONObject jSONObject);

    boolean isAlive();

    void stop();
}
