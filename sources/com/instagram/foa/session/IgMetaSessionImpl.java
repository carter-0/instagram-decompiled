package com.instagram.foa.session;

import X.0lg;
import X.0qQ;
import X.AnonymousClass7TE;
import X.W6E;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.meta.foa.session.FoaUserSession;

public final class IgMetaSessionImpl implements FoaUserSession {
    public static final Parcelable.Creator CREATOR = new W6E(51);
    public final 0lg A00;

    public IgMetaSessionImpl(0lg r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        0lg r0 = this.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", r0.getToken());
        parcel.writeBundle(A0a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0007: MOVE  (r2v1 com.instagram.common.session.UserSession) = (r2v0 com.instagram.common.session.UserSession)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final java.lang.String getUserId() {
        /*
            r3 = this;
            X.0lg r2 = r3.A00
            boolean r1 = r2 instanceof com.instagram.common.session.UserSession
            r0 = 0
            if (r1 == 0) goto L_0x000d
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            if (r2 == 0) goto L_0x000d
            java.lang.String r0 = r2.A06
        L_0x000d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.foa.session.IgMetaSessionImpl.getUserId():java.lang.String");
    }
}
