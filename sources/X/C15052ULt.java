package X;

import instagram.features.clips.viewer.util.exitreelsurvey.ExitSurveyClipInfo$Companion;
import kotlinx.serialization.Serializable;

@Serializable
/* renamed from: X.ULt  reason: case insensitive filesystem */
public final class C15052ULt extends AnonymousClass0T0 {
    public static final ExitSurveyClipInfo$Companion Companion = new Object();
    public Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C15052ULt(String str, Long l, String str2, Long l2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str2, 7);
        this.A00 = l;
        this.A03 = str;
        this.A01 = l2;
        this.A06 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A02 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C15052ULt) {
                C15052ULt uLt = (C15052ULt) obj;
                if (!0qQ.A0K(this.A00, uLt.A00) || !0qQ.A0K(this.A03, uLt.A03) || !0qQ.A0K(this.A01, uLt.A01) || this.A06 != uLt.A06 || this.A04 != uLt.A04 || this.A05 != uLt.A05 || !0qQ.A0K(this.A02, uLt.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0C = AnonymousClass7TG.A0C(this.A00) * 31;
        return C41845B3m.A01(this.A02, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A08(this.A03, A0C) + AnonymousClass7TE.A0L(this.A01)) * 31))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExitSurveyClipInfo(dwell=");
        sb.append(this.A00);
        sb.append(", id=");
        sb.append(this.A03);
        sb.append(", videoDuration=");
        sb.append(this.A01);
        sb.append(", isMultiAd=");
        sb.append(this.A06);
        sb.append(", isCarouselAd=");
        sb.append(this.A04);
        sb.append(", isMMC=");
        sb.append(this.A05);
        sb.append(", clipType=");
        return C51975G9x.A0i(this.A02, sb);
    }

    public /* synthetic */ C15052ULt(Long l, Long l2, String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        if (66 != (i & 66)) {
            VJ6.A00(C20547WtS.A01, i, 66);
            throw AnonymousClass00P.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.A00 = null;
        } else {
            this.A00 = l;
        }
        this.A03 = str;
        if ((i & 4) == 0) {
            this.A01 = null;
        } else {
            this.A01 = l2;
        }
        if ((i & 8) == 0) {
            this.A06 = false;
        } else {
            this.A06 = z;
        }
        if ((i & 16) == 0) {
            this.A04 = false;
        } else {
            this.A04 = z2;
        }
        if ((i & 32) == 0) {
            this.A05 = false;
        } else {
            this.A05 = z3;
        }
        this.A02 = str2;
    }
}
