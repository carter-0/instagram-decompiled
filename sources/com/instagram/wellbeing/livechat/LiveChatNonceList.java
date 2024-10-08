package com.instagram.wellbeing.livechat;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass409;
import X.AnonymousClass7TG;
import X.C20515Wsv;
import X.C20516Wsw;
import X.C255463uA;
import X.VJ6;
import java.util.ArrayList;
import kotlinx.serialization.Serializable;

@Serializable
public final class LiveChatNonceList extends AnonymousClass0T0 {
    public static final C255463uA[] A01 = {new AnonymousClass409(C20515Wsv.A00)};
    public static final Companion Companion = new Object();
    public final ArrayList A00;

    public final class Companion {
        public final C255463uA serializer() {
            return C20516Wsw.A00;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof LiveChatNonceList) && 0qQ.A0K(this.A00, ((LiveChatNonceList) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LiveChatNonceList(liveChatNonceList=");
        return AnonymousClass7TG.A0n(this.A00, sb);
    }

    public LiveChatNonceList(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public /* synthetic */ LiveChatNonceList(ArrayList arrayList, int i) {
        if (1 != (i & 1)) {
            VJ6.A00(C20516Wsw.A01, i, 1);
            throw AnonymousClass00P.createAndThrow();
        } else {
            this.A00 = arrayList;
        }
    }
}
