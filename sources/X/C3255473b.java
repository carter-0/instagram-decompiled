package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.HashMap;

/* renamed from: X.73b  reason: invalid class name and case insensitive filesystem */
public final class C3255473b extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final MessageIdentifier A04;
    public final CharSequence A05;
    public final String A06;
    public final String A07;
    public final HashMap A08;

    public C3255473b(MessageIdentifier messageIdentifier, CharSequence charSequence, String str, String str2, HashMap hashMap, int i, int i2, int i3, int i4) {
        0qQ.A0B(charSequence, 1);
        this.A05 = charSequence;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A04 = messageIdentifier;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3255473b) {
                C3255473b r5 = (C3255473b) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || this.A01 != r5.A01 || this.A02 != r5.A02 || this.A03 != r5.A03 || this.A00 != r5.A00 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.A05.hashCode() * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31) + this.A00) * 31;
        MessageIdentifier messageIdentifier = this.A04;
        int i = 0;
        int hashCode2 = (hashCode + (messageIdentifier == null ? 0 : messageIdentifier.hashCode())) * 31;
        String str = this.A06;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        HashMap hashMap = this.A08;
        if (hashMap != null) {
            i = hashMap.hashCode();
        }
        return hashCode4 + i;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
