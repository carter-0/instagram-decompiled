package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Kpo  reason: case insensitive filesystem */
public abstract class C62998Kpo {
    public static final MTN A00(0sP r4) {
        MTN jwx;
        C63953LEz lEz = new C63953LEz();
        r4.invoke(lEz);
        C66374MPg mPg = lEz.A01;
        if (mPg != null) {
            if (mPg instanceof C62676Kkc) {
                0qQ.A0C(mPg, "null cannot be cast to non-null type com.facebook.wearable.mediastream.events.model.EngagementEvent.Type");
                jwx = new C61085Jww((C62676Kkc) mPg, 0Yt.A03(lEz.A02), lEz.A00);
            } else if (mPg instanceof C69509Nmr) {
                0qQ.A0C(mPg, "null cannot be cast to non-null type com.facebook.wearable.mediastream.events.model.ModelEngagementEvent.Type");
                jwx = new C61087Jwy((C69509Nmr) mPg, 0Yt.A03(lEz.A02), lEz.A00);
            } else {
                0qQ.A0C(mPg, "null cannot be cast to non-null type com.facebook.wearable.mediastream.events.model.LifeCycleEvent.Type");
                jwx = new C61086Jwx((C391639tP) mPg, 0Yt.A03(lEz.A02), lEz.A00);
            }
            return jwx;
        }
        0qQ.A0F(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        throw AnonymousClass00P.createAndThrow();
    }
}
