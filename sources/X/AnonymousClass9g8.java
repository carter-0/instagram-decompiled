package X;

import android.content.Context;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import kotlin.Deprecated;

/* renamed from: X.9g8  reason: invalid class name */
public final class AnonymousClass9g8 extends C368948ta implements C368958tb {
    public ColorFilter A00;
    public boolean A01;
    public int A02;
    public C367548rA A03;
    public boolean A04 = true;
    public final InstagramFilterFactoryProvider A05 = new Object();
    public final AnonymousClass9g9 A06;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.impl.instagram.InstagramFilterFactoryProvider, java.lang.Object] */
    public AnonymousClass9g8(Context context, boolean z) {
        this.A06 = new AnonymousClass9g9((C366028o4) null, C365998o1.A00(context, z));
    }

    public final synchronized void A00(int i) {
        String str;
        if (i != this.A02) {
            this.A02 = i;
            if (i == 114) {
                str = "GinghamFilter";
            } else if (i == 640) {
                str = "MelbourneFilter";
            } else if (i == 813) {
                str = "LosAngelesFilter";
            } else if (i == 642) {
                str = "RioDeJaneiroFilter";
            } else if (i == 643) {
                str = "OsloFilter";
            } else if (i == 702) {
                str = "DramaticBlackWhiteFilter";
            } else if (i == 703) {
                str = "CinemaRedFilter";
            } else if (i == 709) {
                str = "PastelPinkFilter";
            } else if (i == 710) {
                str = "PastelSkyFilter";
            } else if (i == 810) {
                str = "ParisFilter";
            } else if (i != 811) {
                switch (i) {
                    case 705:
                        str = "CinemaBlueFilter";
                        break;
                    case 706:
                        str = "CrystalClearFilter";
                        break;
                    case 707:
                        str = "VintageFilter";
                        break;
                    default:
                        throw AnonymousClass7TE.A0w(002.A0c("Filter ", " not supported", i));
                }
            } else {
                str = "FastRetouchingFilter";
            }
            ColorFilter colorFilter = new ColorFilter(str, false);
            this.A00 = colorFilter;
            C367548rA r2 = new C367548rA(this.A05, colorFilter);
            this.A03 = r2;
            this.A06.A00(r2, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
        }
    }

    public final synchronized boolean DAo(C368538so r5, long j) {
        boolean DAo;
        0qQ.A0B(r5, 0);
        try {
            DAo = this.A06.DAo(r5, j);
        } catch (RuntimeException e) {
            if (this.A04) {
                this.A04 = false;
                0wb.A07("IgluColorFilterRenderer render exception", e);
            }
        }
        return DAo;
    }

    public final void DpY(C345557ti r2) {
        0qQ.A0B(r2, 0);
        this.A04 = true;
        this.A06.DpY(r2);
    }

    public final void EOi(C13586TdE tdE) {
    }

    public final void ESt(Integer num) {
    }

    @Deprecated(message = "")
    public final boolean EtX() {
        return false;
    }

    public final Integer BHb() {
        return AnonymousClass05K.A00;
    }

    public final void Dpb() {
        this.A06.Dpb();
    }

    public final boolean isEnabled() {
        return this.A01;
    }
}
