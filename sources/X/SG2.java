package X;

import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.google.android.exoplayer2.drm.DrmInitData;
import org.webrtc.CameraEnumerationAndroid;

public final class SG2 {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public float A03 = -1.0f;
    public float A04 = -1.0f;
    public float A05 = -1.0f;
    public float A06 = -1.0f;
    public float A07 = -1.0f;
    public float A08 = 0.0f;
    public float A09 = 0.0f;
    public float A0A = 0.0f;
    public float A0B = -1.0f;
    public float A0C = -1.0f;
    public int A0D = -1;
    public int A0E;
    public int A0F = 1;
    public int A0G = -1;
    public int A0H = -1;
    public int A0I = -1;
    public int A0J;
    public int A0K = -1;
    public int A0L = 0;
    public int A0M = -1;
    public int A0N = -1;
    public int A0O;
    public int A0P = IgNetworkConsentStorage.MAX_ENTRIES;
    public int A0Q = 200;
    public int A0R;
    public int A0S;
    public int A0T = -1;
    public int A0U = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
    public int A0V = -1;
    public int A0W;
    public int A0X = -1;
    public long A0Y = 0;
    public long A0Z = 0;
    public DrmInitData A0a;
    public C266034Xh A0b;
    public C265994Xd A0c;
    public C11025S6c A0d;
    public String A0e;
    public String A0f = "eng";
    public String A0g;
    public boolean A0h = true;
    public boolean A0i;
    public boolean A0j = false;
    public boolean A0k;
    public byte[] A0l;
    public byte[] A0m;
    public byte[] A0n = null;
    public byte[] A0o;

    public static byte[] A00(SG2 sg2, String str) {
        byte[] bArr = sg2.A0l;
        if (bArr != null) {
            return bArr;
        }
        throw C2609347p.A00(002.A0R("Missing CodecPrivate for codec ", str), (Throwable) null);
    }
}
