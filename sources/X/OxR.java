package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.google.common.collect.ImmutableList;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final /* synthetic */ class OxR implements AnonymousClass67Q {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass67N A01;
    public final /* synthetic */ C304566Ea A02;
    public final /* synthetic */ 2FW A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ Long A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    public /* synthetic */ OxR(AnonymousClass67N r1, C304566Ea r2, 2FW r3, Integer num, Integer num2, Long l, Long l2, String str, String str2, String str3, String str4, long j, boolean z) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = num;
        this.A05 = num2;
        this.A01 = r1;
        this.A00 = j;
        this.A0C = z;
        this.A07 = l;
        this.A0B = str;
        this.A08 = str2;
        this.A06 = l2;
        this.A09 = str3;
        this.A0A = str4;
    }

    public final void Eyr(AnonymousClass67Z r29) {
        int i;
        Integer valueOf;
        int i2;
        C69422Nl4 nl4;
        Long l;
        C304566Ea r11 = this.A02;
        2FW r13 = this.A03;
        Integer num = this.A04;
        Integer num2 = this.A05;
        AnonymousClass67N r15 = this.A01;
        long j = this.A00;
        boolean z = this.A0C;
        Long l2 = this.A07;
        String str = this.A0B;
        String str2 = this.A08;
        Long l3 = this.A06;
        String str3 = this.A09;
        String str4 = this.A0A;
        C70107NxN nxN = C70107NxN.$redex_init_class;
        int ordinal = r13.ordinal();
        switch (ordinal) {
            case 15:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
                i = 1011;
                break;
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                i = 1007;
                break;
            case 46:
            case 49:
                i = 1005;
                break;
            default:
                valueOf = null;
                break;
        }
        valueOf = Integer.valueOf(i);
        switch (ordinal) {
            case 15:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 46:
            case 49:
                i2 = 7;
                break;
            default:
                i2 = null;
                break;
        }
        if (num != null) {
            switch (num.intValue()) {
                case 0:
                    nl4 = C69422Nl4.A0L;
                    break;
                case 1:
                    nl4 = C69422Nl4.A0M;
                    break;
                case 2:
                    nl4 = C69422Nl4.A0H;
                    break;
                case 3:
                    nl4 = C69422Nl4.A0K;
                    break;
                case 4:
                    nl4 = C69422Nl4.A0J;
                    break;
                case 5:
                    nl4 = C69422Nl4.A0I;
                    break;
                case 6:
                    nl4 = C69422Nl4.A0G;
                    break;
                case 7:
                    nl4 = C69422Nl4.A0F;
                    break;
            }
        }
        nl4 = C69422Nl4.A0W;
        C69423Nl5 nl5 = C69423Nl5.A0d;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (intValue == 0) {
                nl5 = C69423Nl5.A07;
            } else if (intValue == 1) {
                nl5 = C69423Nl5.A0Q;
            } else if (intValue == 2) {
                nl5 = C69423Nl5.A05;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        ImmutableList of = ImmutableList.of(nl5);
        0qQ.A07(of);
        C68113N1b A002 = C70108NxO.A00(nl4, of);
        String A003 = C70109NxP.A00(r11.A03, i2, (Integer) null, valueOf, (Integer) null, l2, (String) null, z);
        if (str2 != null) {
            l = DbV.A0q(str2);
        } else {
            l = null;
        }
        String obj = A002.A00.toString();
        Long l4 = l3;
        C71721Opf opf = new C71721Opf(r29, 15);
        r15.A02(opf, l, l4, A003, str, str3, str4, obj, (List) null, j, z);
    }
}
