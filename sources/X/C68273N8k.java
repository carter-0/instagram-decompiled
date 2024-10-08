package X;

import com.instagram.model.direct.DirectSearchResult;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.N8k  reason: case insensitive filesystem */
public final class C68273N8k extends AnonymousClass0T0 implements C74414PuU {
    public final int A00;
    public final long A01;
    public final long A02;
    public final DirectSearchResult A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C68273N8k) {
                C68273N8k n8k = (C68273N8k) obj;
                if (!0qQ.A0K(this.A03, n8k.A03) || this.A00 != n8k.A00 || this.A04 != n8k.A04 || this.A01 != n8k.A01 || this.A02 != n8k.A02 || !0qQ.A0K(this.A06, n8k.A06) || !0qQ.A0K(this.A05, n8k.A05) || !0qQ.A0K(this.A07, n8k.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK4(String str) {
        DirectShareTarget directShareTarget;
        String str2 = this.A06;
        DirectSearchResult directSearchResult = this.A03;
        String str3 = null;
        if ((directSearchResult instanceof DirectShareTarget) && (directShareTarget = (DirectShareTarget) directSearchResult) != null) {
            str3 = directShareTarget.A09();
        }
        if (str == null) {
            str = "";
        }
        return 002.A0g(str2, str3, str);
    }

    public final /* bridge */ /* synthetic */ Object FKf(String str) {
        String str2 = str;
        if (0mp.A0G(str, this.A06)) {
            return this;
        }
        DirectSearchResult directSearchResult = this.A03;
        int i = this.A00;
        return new C68273N8k(directSearchResult, this.A04, str2, this.A05, this.A07, i, this.A01, this.A02);
    }

    public final int hashCode() {
        String str;
        int A0K = (AnonymousClass7TE.A0K(this.A03) + this.A00) * 31;
        int intValue = this.A04.intValue();
        switch (intValue) {
            case 1:
                str = "IG_NON_CONTACT";
                break;
            case 2:
                str = "IG_PEOPLE_NON_CONTACT";
                break;
            case 3:
                str = "IG_BUSINESS_NON_CONTACT";
                break;
            case 4:
                str = "FB_FRIEND";
                break;
            case 5:
                str = "FB_NON_FRIEND";
                break;
            case 6:
                str = "IG_ONLY_GROUP";
                break;
            case 7:
                str = "XAC_GROUP";
                break;
            case 8:
                str = "REEL";
                break;
            case 9:
                str = "UNJOINED_SOCIAL_CHANNEL";
                break;
            case 10:
                str = "JOINED_SOCIAL_CHANNEL";
                break;
            case 11:
                str = "UNJOINED_BROADCAST_CHANNEL";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                str = "JOINED_BROADCAST_CHANNEL";
                break;
            case 13:
                str = "UNJOINED_SUBSCRIBER_SOCIAL_CHANNEL";
                break;
            case 14:
                str = "JOINED_SUBSCRIBER_SOCIAL_CHANNEL";
                break;
            case 15:
                str = "UNJOINED_SUBSCRIBER_BROADCAST_CHANNEL";
                break;
            case 16:
                str = "JOINED_SUBSCRIBER_BROADCAST_CHANNEL";
                break;
            case 17:
                str = "CHANNEL_SUGGESTED_USER";
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                str = "CHANNEL_CATEGORY";
                break;
            case 19:
                str = "AI_AGENT";
                break;
            case 20:
                str = "UGC_AGENT";
                break;
            case 21:
                str = "INVITE_CONTACT";
                break;
            default:
                str = "IG_CONTACT";
                break;
        }
        return ((((AnonymousClass7TF.A01(this.A02, AnonymousClass7TF.A01(this.A01, C51971G9r.A0F(str, intValue, A0K))) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A07);
    }

    public C68273N8k(DirectSearchResult directSearchResult, Integer num, String str, String str2, List list, int i, long j, long j2) {
        AnonymousClass7TG.A1P(directSearchResult, num);
        this.A03 = directSearchResult;
        this.A00 = i;
        this.A04 = num;
        this.A01 = j;
        this.A02 = j2;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = list;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("DirectOmniLoggingItem(result=");
        A1A.append(this.A03);
        A1A.append(", uiSection=");
        A1A.append(this.A00);
        A1A.append(", interopType=");
        Integer num = this.A04;
        if (num != null) {
            str = O19.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", absolutePosition=");
        A1A.append(this.A01);
        A1A.append(", relativePosition=");
        A1A.append(this.A02);
        A1A.append(", query=");
        A1A.append(this.A06);
        A1A.append(", mnetRequestId=");
        A1A.append(this.A05);
        A1A.append(", preselectedIds=");
        return AnonymousClass7TG.A0n(this.A07, A1A);
    }
}
