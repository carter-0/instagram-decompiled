package com.instagram.wellbeing.livechat;

import X.002;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C20515Wsv;
import X.C255463uA;
import X.C41845B3m;
import X.VJ6;
import kotlinx.serialization.Serializable;

@Serializable
public final class LiveChatNonce extends AnonymousClass0T0 {
    public static final Companion Companion = new Object();
    public final String A00;
    public final String A01;
    public final String A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20515Wsv.A00;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LiveChatNonce) {
                LiveChatNonce liveChatNonce = (LiveChatNonce) obj;
                if (!0qQ.A0K(this.A02, liveChatNonce.A02) || !0qQ.A0K(this.A00, liveChatNonce.A00) || !0qQ.A0K(this.A01, liveChatNonce.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A14("LiveChatNonce(userId=", this.A02, ", nonce=", this.A00, ", supportUid=", this.A01, ')');
    }

    public final int hashCode() {
        return ((AnonymousClass7TE.A0O(this.A02) + AnonymousClass7TG.A0E(this.A00)) * 31) + C41845B3m.A00(this.A01);
    }

    public LiveChatNonce(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public /* synthetic */ LiveChatNonce(String str, String str2, String str3, int i) {
        if (7 != (i & 7)) {
            VJ6.A00(C20515Wsv.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
