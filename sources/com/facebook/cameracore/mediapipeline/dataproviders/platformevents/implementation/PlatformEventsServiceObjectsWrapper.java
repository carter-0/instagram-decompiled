package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass82S;
import X.AnonymousClass82U;
import X.B2P;
import com.facebook.jni.HybridData;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlatformEventsServiceObjectsWrapper implements B2P {
    public boolean _isAlive;
    public final AnonymousClass82U delegate;
    public final AnonymousClass82S input;
    public final HybridData mHybridData;

    private final native void enqueueEventNative(String str);

    private final native HybridData initHybrid();

    public void enqueueEvent(JSONObject jSONObject) {
        0qQ.A0B(jSONObject, 0);
        String obj = jSONObject.toString();
        0qQ.A07(obj);
        enqueueEventNative(obj);
    }

    public final void start() {
        B2P b2p;
        this._isAlive = true;
        AnonymousClass82S r3 = this.input;
        if (r3 != null && (b2p = r3.A00) != null && b2p.isAlive()) {
            while (true) {
                LinkedList linkedList = r3.A01;
                if (!linkedList.isEmpty()) {
                    B2P b2p2 = r3.A00;
                    Object pop = linkedList.pop();
                    pop.getClass();
                    b2p2.enqueueEvent((JSONObject) pop);
                } else {
                    return;
                }
            }
        }
    }

    public void stop() {
        this._isAlive = false;
        this.mHybridData.resetNative();
    }

    public final void didReceiveEngineEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            AnonymousClass82U r0 = this.delegate;
            if (r0 != null) {
                r0.AP6(jSONObject);
            }
        } catch (JSONException e) {
            throw AnonymousClass7TE.A0w(AnonymousClass7TG.A0m(e, "Invalid json events from engine: ", AnonymousClass7TE.A1A()));
        }
    }

    public boolean isAlive() {
        return this._isAlive;
    }

    public PlatformEventsServiceObjectsWrapper(AnonymousClass82U r2, AnonymousClass82S r3) {
        this.delegate = r2;
        this.input = r3;
        if (r3 != null) {
            r3.A00 = this;
        }
        this.mHybridData = initHybrid();
    }
}
