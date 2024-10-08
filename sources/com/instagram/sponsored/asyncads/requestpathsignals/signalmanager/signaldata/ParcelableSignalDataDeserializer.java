package com.instagram.sponsored.asyncads.requestpathsignals.signalmanager.signaldata;

import X.16F;
import X.AnonymousClass4iS;
import X.C269674fV;
import com.facebook.common.json.FbJsonDeserializer;

public class ParcelableSignalDataDeserializer extends FbJsonDeserializer {
    public ParcelableSignalDataDeserializer() {
        this.A00 = ParcelableSignalData.class;
    }

    public final Object A0D(16F r2, C269674fV r3) {
        return AnonymousClass4iS.parseFromJson(r2);
    }
}
