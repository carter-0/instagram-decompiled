package X;

import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;

/* renamed from: X.XcN  reason: case insensitive filesystem */
public abstract class C21478XcN {
    public void A01() {
        C21478XcN xcN;
        XPP xpp = (XPP) this;
        if (xpp.A00 != 0) {
            C22371Y0z y0z = (C22371Y0z) xpp.A02;
            int i = y0z.A08;
            float f = 1.0f;
            if (i != 0) {
                f = (((float) y0z.A09) * 1.0f) / ((float) i);
            }
            C22230Xxl xxl = y0z.A0H;
            W3b.A07("initializeLiveStream", new Object[0]);
            LiveStreamingClient liveStreamingClient = xxl.A01;
            if (liveStreamingClient != null) {
                liveStreamingClient.updateAspectRatio(f);
                xxl.A02 = AnonymousClass05K.A0C;
            }
            xcN = (C21478XcN) xpp.A01;
        } else {
            C66537MVr mVr = ((C62422KfX) xpp.A02).A07;
            if (mVr != null) {
                mVr.EyB((C21478XcN) xpp.A01, true);
                return;
            }
            xcN = (C21478XcN) xpp.A01;
            if (xcN == null) {
                return;
            }
        }
        xcN.A01();
    }

    public void A02(Exception exc) {
    }

    public static void A00(C21478XcN xcN) {
        if (xcN != null) {
            11Z.A02(new C22386Y1r(xcN));
        }
    }
}
