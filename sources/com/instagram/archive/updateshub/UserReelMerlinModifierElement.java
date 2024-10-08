package com.instagram.archive.updateshub;

import X.002;
import X.0qQ;
import X.AnonymousClass5QP;
import X.AnonymousClass5WX;
import X.AnonymousClass7TE;
import X.C267794cD;
import X.C273654mx;
import X.C52906Geg;
import X.C53317Gm3;
import X.C55049HbK;

public final class UserReelMerlinModifierElement extends AnonymousClass5QP {
    public final C53317Gm3 A00;
    public final Integer A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserReelMerlinModifierElement) {
                UserReelMerlinModifierElement userReelMerlinModifierElement = (UserReelMerlinModifierElement) obj;
                if (!0qQ.A0K(this.A00, userReelMerlinModifierElement.A00) || this.A01 != userReelMerlinModifierElement.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new AnonymousClass5WX(this.A00, this.A01);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r5) {
        AnonymousClass5WX r52 = (AnonymousClass5WX) r5;
        0qQ.A0B(r52, 0);
        C53317Gm3 gm3 = this.A00;
        0qQ.A0B(gm3, 0);
        r52.A00 = gm3;
        C52906Geg geg = r52.A02;
        String A002 = C273654mx.A00(3463);
        String str = gm3.A05;
        geg.A0H(002.A0R(A002, str), r52.A03, str);
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + C55049HbK.A00(this.A01);
    }

    public UserReelMerlinModifierElement(C53317Gm3 gm3, Integer num) {
        this.A00 = gm3;
        this.A01 = num;
    }
}
