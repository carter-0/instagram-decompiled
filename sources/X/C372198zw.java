package X;

import com.facebook.msys.mca.MailboxCallback;
import java.util.HashMap;

/* renamed from: X.8zw  reason: invalid class name and case insensitive filesystem */
public final class C372198zw extends AnonymousClass0T0 {
    public final MailboxCallback A00;
    public final AnonymousClass65S A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final HashMap A05;

    public C372198zw(MailboxCallback mailboxCallback, AnonymousClass65S r3, String str, String str2, String str3, HashMap hashMap) {
        0qQ.A0B(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = hashMap;
        this.A01 = r3;
        this.A00 = mailboxCallback;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C372198zw) {
                C372198zw r5 = (C372198zw) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A04.hashCode()) * 31;
        HashMap hashMap = this.A05;
        int i = 0;
        int hashCode2 = (hashCode + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        AnonymousClass65S r0 = this.A01;
        int hashCode3 = (hashCode2 + (r0 == null ? 0 : r0.hashCode())) * 31;
        MailboxCallback mailboxCallback = this.A00;
        if (mailboxCallback != null) {
            i = mailboxCallback.hashCode();
        }
        return hashCode3 + i;
    }
}
