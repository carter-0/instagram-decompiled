package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

/* renamed from: X.7Fs  reason: invalid class name and case insensitive filesystem */
public final class C328677Fs extends AnonymousClass7FV implements AnonymousClass7FW {
    public final ImageUrl A00;
    public final DirectMessageIdentifier A01;
    public final String A02;
    public final boolean A03;
    public final AnonymousClass7FT A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C328677Fs(ImageUrl imageUrl, AnonymousClass7FT r3, DirectMessageIdentifier directMessageIdentifier, String str, boolean z) {
        super(r3);
        0qQ.A0B(imageUrl, 1);
        this.A00 = imageUrl;
        this.A01 = directMessageIdentifier;
        this.A02 = str;
        this.A04 = r3;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328677Fs) {
                C328677Fs r5 = (C328677Fs) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A04, r5.A04) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StaticStickerContentViewModel(stickerUrl=");
        sb.append(this.A00);
        sb.append(", messageIdentifier=");
        sb.append(this.A01);
        sb.append(", messageSenderUsername=");
        sb.append(this.A02);
        sb.append(C66579MXk.A00(432));
        sb.append(this.A04);
        sb.append(", isReplyContext=");
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31;
        String str = this.A02;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A03) {
            i = 1231;
        }
        return hashCode3 + i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
