package com.instagram.comments.mvvm.view.viewpoint;

import X.002;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass5QP;
import X.AnonymousClass5WP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C267794cD;
import X.C333777a7;
import X.C333827aD;
import java.util.List;

public final class CommentRowMerlinModifierElement extends AnonymousClass5QP {
    public final int A00;
    public final C333827aD A01;
    public final C333777a7 A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CommentRowMerlinModifierElement) {
                CommentRowMerlinModifierElement commentRowMerlinModifierElement = (CommentRowMerlinModifierElement) obj;
                if (!0qQ.A0K(this.A01, commentRowMerlinModifierElement.A01) || !0qQ.A0K(this.A02, commentRowMerlinModifierElement.A02) || !0qQ.A0K(this.A03, commentRowMerlinModifierElement.A03) || this.A00 != commentRowMerlinModifierElement.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C267794cD A00() {
        return new AnonymousClass5WP(this.A01, this.A02, this.A03);
    }

    public final /* bridge */ /* synthetic */ void A01(C267794cD r5) {
        AnonymousClass5WP r52 = (AnonymousClass5WP) r5;
        0qQ.A0B(r52, 0);
        C333827aD r2 = this.A01;
        C333777a7 r1 = this.A02;
        List list = this.A03;
        AnonymousClass7TF.A1B(r2, 0, list);
        r52.A00 = r2;
        r52.A01 = r1;
        r52.A04 = list;
        r52.A05.A0H(002.A0R("comment_list_prefix", r2.A00), AnonymousClass05K.A0j, (String) null);
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, (AnonymousClass7TE.A0K(this.A01) + AnonymousClass7TG.A0C(this.A02)) * 31) + this.A00;
    }

    public CommentRowMerlinModifierElement(C333827aD r1, C333777a7 r2, List list, int i) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = list;
        this.A00 = i;
    }
}
