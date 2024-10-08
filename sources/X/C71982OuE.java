package X;

import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.OuE  reason: case insensitive filesystem */
public final class C71982OuE implements C232262tL {
    public boolean A00 = false;
    public final int A01;
    public final C16744V4b A02;
    public final Integer A03;
    public final Integer A04;
    public final Object A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C71982OuE ouE = (C71982OuE) obj;
                Object obj2 = this.A05;
                Object obj3 = ouE.A05;
                if (obj2 != null) {
                    return obj3 != null && this.A01 == ouE.A01 && obj2.equals(obj3);
                }
                if (!(obj3 == null && this.A01 == ouE.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this;
    }

    public final int hashCode() {
        int i = this.A01;
        Object obj = this.A05;
        if (obj != null) {
            return AnonymousClass7TE.A0N(obj, i * 31);
        }
        return i;
    }

    public C71982OuE(C16744V4b v4b, Integer num, Integer num2, Object obj) {
        int i;
        Integer num3;
        switch (num.intValue()) {
            case 0:
                i = 2131964297;
                break;
            case 1:
                i = 2131964292;
                break;
            case 2:
                i = 2131964298;
                break;
            case 3:
                i = 2131964303;
                break;
            case 4:
                i = 2131964304;
                break;
            case 5:
                i = 2131964291;
                break;
            case 6:
                i = 2131964286;
                break;
            case 7:
                i = 2131964287;
                break;
            case 8:
                i = 2131964284;
                break;
            case 9:
                i = 2131964296;
                break;
            case 10:
                i = 2131964294;
                break;
            case 11:
                i = 2131964295;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 2131964289;
                break;
            case 13:
                i = 2131964277;
                break;
            case 14:
                i = 2131964293;
                break;
            case 15:
                i = 2131964285;
                break;
            case 16:
                i = 2131964283;
                break;
            case 17:
                i = 2131964481;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = 2131968773;
                break;
            case 19:
                i = 2131960429;
                break;
            case 20:
                i = 2131968774;
                break;
            case 21:
                i = 2131968775;
                break;
            case 22:
                i = 2131968776;
                break;
            case 23:
                i = 2131969774;
                break;
            case 24:
                i = 2131964301;
                break;
            case 25:
                i = 2131964302;
                break;
            case 26:
                i = 2131964300;
                break;
            case 27:
                AnonymousClass9B9.A00();
                i = 2131960273;
                break;
            case 28:
                AnonymousClass9B9.A00();
                i = 2131960283;
                break;
            default:
                AnonymousClass9B9.A00();
                i = 2131960442;
                break;
        }
        this.A01 = i;
        if (num == AnonymousClass05K.A15) {
            num3 = AnonymousClass05K.A00;
        } else if (num == AnonymousClass05K.A0M) {
            num3 = AnonymousClass05K.A0C;
        } else {
            num3 = AnonymousClass05K.A01;
        }
        this.A04 = num3;
        this.A03 = num2;
        this.A02 = v4b;
        this.A05 = obj;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        if (hashCode() != obj.hashCode()) {
            return false;
        }
        return equals(obj);
    }

    public C71982OuE(C16744V4b v4b, Integer num, Integer num2) {
        int i;
        switch (num.intValue()) {
            case 17:
                i = 2131964481;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                i = 2131968773;
                break;
            case 19:
                i = 2131960429;
                break;
            case 20:
                i = 2131968774;
                break;
            case 21:
                i = 2131968775;
                break;
            case 22:
                i = 2131968776;
                break;
            case 23:
                i = 2131969774;
                break;
            case 24:
                i = 2131964301;
                break;
            case 25:
                i = 2131964302;
                break;
            case 26:
                i = 2131964300;
                break;
            default:
                AnonymousClass9B9.A00();
                i = 2131960273;
                break;
        }
        this.A01 = i;
        this.A04 = AnonymousClass05K.A01;
        this.A03 = num2;
        this.A02 = v4b;
        this.A05 = null;
    }
}
