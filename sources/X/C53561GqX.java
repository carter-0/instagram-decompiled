package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.GqX  reason: case insensitive filesystem */
public final class C53561GqX extends AnonymousClass0T0 implements YBO {
    public final GifUrlImpl A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53561GqX) {
                C53561GqX gqX = (C53561GqX) obj;
                if (!0qQ.A0K(this.A01, gqX.A01) || !0qQ.A0K(this.A00, gqX.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TE.A0O(this.A01));
    }

    public C53561GqX(GifUrlImpl gifUrlImpl, String str) {
        this.A01 = str;
        this.A00 = gifUrlImpl;
    }
}
