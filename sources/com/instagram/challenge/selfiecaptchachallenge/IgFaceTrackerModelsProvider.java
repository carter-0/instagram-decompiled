package com.instagram.challenge.selfiecaptchachallenge;

import X.0lg;
import X.0qQ;
import X.AQL;
import X.AnonymousClass84S;
import X.C312126dr;
import X.C39677A4t;
import X.W6D;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.smartcapture.facetracker.FaceTrackerModelsProvider;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class IgFaceTrackerModelsProvider implements FaceTrackerModelsProvider {
    public static final Parcelable.Creator CREATOR = new W6D(68);
    public 0lg A00;

    public final Map BTj(Context context) {
        0qQ.A0B(context, 0);
        0lg r1 = this.A00;
        0qQ.A0B(r1, 1);
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AnonymousClass84S.A00(context, r1).A01(new AQL(countDownLatch, atomicReference), C312126dr.A01);
        try {
            countDownLatch.await();
            C39677A4t a4t = (C39677A4t) atomicReference.get();
            if (a4t != null) {
                Map map = a4t.A01;
                if (map != null) {
                    return map;
                }
                Exception exc = a4t.A00;
                if (exc != null) {
                    throw new Exception("Model load failed.", exc);
                }
                throw new Exception("Model load failed due to an unspecified cause.", (Throwable) null);
            }
            throw new Exception("Model load failed due to an unspecified error.", (Throwable) null);
        } catch (InterruptedException e) {
            throw new Exception("Model load was interrupted.", e);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00.getToken());
    }
}
