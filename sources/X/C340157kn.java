package X;

import android.content.Context;
import android.util.SparseArray;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Collections;
import java.util.Map;
import org.webrtc.EglBase14Impl;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.7kn  reason: invalid class name and case insensitive filesystem */
public class C340157kn implements C340167ko {
    public static final Map A01 = Collections.emptyMap();
    public final SparseArray A00 = new SparseArray();

    public C340157kn(C340197kr r4, C340177kp r5, C340177kp r6, C340147km r7, boolean z, boolean z2, boolean z3) {
        A00(C340167ko.A0R, r5);
        A00(C340167ko.A0W, r6);
        A00(C340167ko.A0U, r7);
        A00(C340167ko.A0A, r4);
        A00(C340167ko.A0F, false);
        A00(C340167ko.A0S, Boolean.valueOf(z));
        A00(C340167ko.A0G, Boolean.valueOf(z2));
        A00(C340167ko.A05, Boolean.valueOf(z3));
    }

    public final void A00(C340207ks r3, Object obj) {
        this.A00.put(r3.A00, obj);
    }

    public Object AXG(C340207ks r3) {
        int i;
        SparseArray sparseArray = this.A00;
        int i2 = r3.A00;
        Object obj = sparseArray.get(i2);
        if (obj != null) {
            return obj;
        }
        if (i2 == 0) {
            return Boolean.TRUE;
        }
        if (!(i2 == 3 || i2 == 31 || i2 == 33 || i2 == 43 || i2 == 7 || i2 == 8)) {
            if (i2 == 23) {
                i = 0;
            } else if (i2 != 24) {
                switch (i2) {
                    case 10:
                    case 11:
                    case 13:
                    case 14:
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        return A01;
                    default:
                        switch (i2) {
                            case 16:
                            case 17:
                            case EglBase14Impl.EGLExt_SDK_VERSION:
                                break;
                            default:
                                switch (i2) {
                                    case 26:
                                        break;
                                    case 27:
                                        i = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                                        break;
                                    case 28:
                                        return 30000000L;
                                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                                        i = 16;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 45:
                                            case 46:
                                            case 47:
                                                break;
                                            case 48:
                                                return this;
                                            default:
                                                throw new RuntimeException(002.A0O("Invalid Settings key: ", i2));
                                        }
                                }
                        }
                }
            } else {
                i = -1;
            }
            return Integer.valueOf(i);
        }
        return Boolean.FALSE;
    }

    public final Integer CDq(int i, int i2, int i3) {
        double d;
        if (this instanceof C340187kq) {
            C340187kq r1 = (C340187kq) this;
            C343947r4 r2 = new C343947r4(r1.A01);
            Context context = r1.A00;
            if (!C393069vq.A00(context, r2)) {
                return null;
            }
            if (C393069vq.A00(context, r2)) {
                if (AnonymousClass0Ke.A00(C60960kU.A00) >= 2016) {
                    d = 0.16d;
                } else {
                    d = 0.14d;
                }
                return Integer.valueOf((int) (d * ((double) i) * ((double) (i2 * i3))));
            }
            throw new IllegalStateException("Should not be querying the bitrate if not in the experiment");
        } else if (this instanceof C382459dj) {
            return ((C382459dj) this).A01;
        } else {
            return null;
        }
    }
}
