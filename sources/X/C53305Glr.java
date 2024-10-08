package X;

import com.instagram.music.common.model.MusicDataSource;
import java.util.List;

/* renamed from: X.Glr  reason: case insensitive filesystem */
public final class C53305Glr extends AnonymousClass0T0 {
    public final float A00;
    public final C2606046i A01;
    public final MusicDataSource A02;
    public final Integer A03;
    public final boolean A04;
    public final boolean A05;
    public final String A06;
    public final List A07;

    public C53305Glr(C2606046i r2, MusicDataSource musicDataSource, Integer num, String str, List list, float f, boolean z, boolean z2) {
        0qQ.A0B(list, 3);
        this.A01 = r2;
        this.A06 = str;
        this.A07 = list;
        this.A03 = num;
        this.A02 = musicDataSource;
        this.A05 = z;
        this.A00 = f;
        this.A04 = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53305Glr) {
                C53305Glr glr = (C53305Glr) obj;
                if (!0qQ.A0K(this.A01, glr.A01) || !0qQ.A0K(this.A06, glr.A06) || !0qQ.A0K(this.A07, glr.A07) || !0qQ.A0K(this.A03, glr.A03) || !0qQ.A0K(this.A02, glr.A02) || this.A05 != glr.A05 || Float.compare(this.A00, glr.A00) != 0 || this.A04 != glr.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A07;
        return DbS.A06(this.A04, AnonymousClass7TF.A00(AnonymousClass7TF.A09(this.A05, (((AnonymousClass7TF.A07(list, ((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31), this.A00));
    }
}
