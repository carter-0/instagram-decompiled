package X;

import com.instagram.api.schemas.MultiAuthorStoryType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.venue.LocationDict;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* renamed from: X.6YJ  reason: invalid class name */
public final class AnonymousClass6YJ implements 1Ns {
    public AnonymousClass3I7 A00;

    public final User CCd() {
        return null;
    }

    public final void ET4(ImageUrl imageUrl) {
        LocationDict locationDict;
        ImageUrl imageUrl2 = imageUrl;
        0qQ.A0B(imageUrl, 0);
        AnonymousClass3I7 r1 = this.A00;
        0qQ.A0B(r1, 1);
        String str = r1.A05;
        Float f = r1.A03;
        Float f2 = r1.A04;
        LocationDict locationDict2 = r1.A02;
        String str2 = r1.A06;
        String str3 = r1.A07;
        String str4 = r1.A08;
        String str5 = r1.A09;
        MultiAuthorStoryType multiAuthorStoryType = r1.A00;
        if (locationDict2 != null) {
            locationDict = locationDict2.FG5();
        } else {
            locationDict = null;
        }
        this.A00 = new AnonymousClass3I7(multiAuthorStoryType, imageUrl2, locationDict, f, f2, str, str2, str3, str4, str5);
    }

    public final String A00() {
        String obj;
        MultiAuthorStoryType multiAuthorStoryType = this.A00.A00;
        if (multiAuthorStoryType == null || (obj = multiAuthorStoryType.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final C240993Nl Aht() {
        AnonymousClass3I7 r1 = this.A00;
        0qQ.A0B(r1, 0);
        MultiAuthorStoryType multiAuthorStoryType = r1.A00;
        if (multiAuthorStoryType != null) {
            switch (multiAuthorStoryType.ordinal()) {
                case 13:
                    return C240993Nl.LOCATION;
                case 15:
                case 16:
                    return C240993Nl.MENTIONS;
                case 17:
                    return C240993Nl.MULTI_AD;
                case 22:
                    return C240993Nl.PRODUCT;
                case 25:
                case 30:
                    return C240993Nl.STICKER;
                case 27:
                    return C240993Nl.HASHTAG;
            }
        }
        return C240993Nl.NONE;
    }

    public final String Art() {
        return this.A00.A08;
    }

    public final ImageUrl Ary() {
        return this.A00.A01;
    }

    public final Integer BVV() {
        AnonymousClass3I7 r1 = this.A00;
        0qQ.A0B(r1, 0);
        MultiAuthorStoryType multiAuthorStoryType = r1.A00;
        if (multiAuthorStoryType != null) {
            int ordinal = multiAuthorStoryType.ordinal();
            if (ordinal == 13) {
                return AnonymousClass05K.A0C;
            }
            if (ordinal == 27) {
                return AnonymousClass05K.A0N;
            }
            if (ordinal == 22) {
                return AnonymousClass05K.A0j;
            }
            if (ordinal == 17) {
                return AnonymousClass05K.A01;
            }
        }
        return AnonymousClass05K.A00;
    }

    public final Integer CAm() {
        MultiAuthorStoryType multiAuthorStoryType = this.A00.A00;
        if (multiAuthorStoryType != null) {
            switch (multiAuthorStoryType.ordinal()) {
                case 2:
                case 3:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 20:
                    return AnonymousClass05K.A03;
                case 5:
                    return AnonymousClass05K.A02;
                case 6:
                    return AnonymousClass05K.A0u;
                case 13:
                    return AnonymousClass05K.A0C;
                case 15:
                    return AnonymousClass05K.A1F;
                case 16:
                    return AnonymousClass05K.A1I;
                case 17:
                    return AnonymousClass05K.A04;
                case 22:
                    return AnonymousClass05K.A15;
                case 25:
                    return AnonymousClass05K.A0Y;
                case 27:
                    return AnonymousClass05K.A0N;
            }
        }
        return AnonymousClass05K.A00;
    }

    public final String getId() {
        return this.A00.A07;
    }

    public final String getName() {
        return this.A00.A06;
    }

    public final String toString() {
        String str;
        String str2 = this.A00.A06;
        switch (CAm().intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "USER";
                break;
            case 2:
                str = "LOCATION";
                break;
            case 3:
                str = "HASHTAG";
                break;
            case 4:
                str = "STICKER";
                break;
            case 5:
                str = "SYSTEM";
                break;
            case 6:
                str = "ELECTION";
                break;
            case 7:
                str = "PRODUCT";
                break;
            case 8:
                str = "MENTIONS";
                break;
            case 9:
                str = "MENTIONSV2";
                break;
            case 10:
                str = "EFFECTS";
                break;
            case 11:
                str = "RANKED";
                break;
            default:
                str = "MULTI_AD";
                break;
        }
        return 002.A0v("{name: ", str2, " mas type: ", str, '}');
    }
}
