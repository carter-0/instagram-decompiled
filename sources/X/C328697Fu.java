package X;

import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.7Fu  reason: invalid class name and case insensitive filesystem */
public final class C328697Fu extends AnonymousClass7FV implements AnonymousClass7FW {
    public final float A00;
    public final int A01;
    public final C376649Iu A02;
    public final C61084JwM A03;
    public final AnonymousClass7FT A04;
    public final AnonymousClass7FE A05;
    public final C69606Noo A06;
    public final C69607Nop A07;
    public final C69608Noq A08;
    public final C69609Nor A09;
    public final Hashtag A0A;
    public final Integer A0B;
    public final Integer A0C;
    public final String A0D;
    public final String A0E;
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(new C73909Plk(this, 32));

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C328697Fu) {
                C328697Fu r5 = (C328697Fu) obj;
                if (!0qQ.A0K(this.A0D, r5.A0D) || Float.compare(this.A00, r5.A00) != 0 || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A0E, r5.A0E) || this.A01 != r5.A01 || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A04, r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0D;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C376649Iu r0 = this.A02;
        int hashCode2 = (((hashCode + (r0 == null ? 0 : r0.hashCode())) * 31) + this.A07.hashCode()) * 31;
        Hashtag hashtag = this.A0A;
        int hashCode3 = (hashCode2 + (hashtag == null ? 0 : hashtag.hashCode())) * 31;
        C69606Noo noo = this.A06;
        int hashCode4 = (hashCode3 + (noo == null ? 0 : noo.hashCode())) * 31;
        Integer num = this.A0B;
        int hashCode5 = (((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.A09.hashCode()) * 31;
        C61084JwM jwM = this.A03;
        int hashCode6 = (hashCode5 + (jwM == null ? 0 : jwM.hashCode())) * 31;
        C69608Noq noq = this.A08;
        int hashCode7 = (hashCode6 + (noq == null ? 0 : noq.hashCode())) * 31;
        String str2 = this.A0E;
        int hashCode8 = (((hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.A01) * 31;
        Integer num2 = this.A0C;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((((hashCode8 + i) * 31) + this.A05.hashCode()) * 31) + this.A04.hashCode();
    }

    public C328697Fu(C376649Iu r3, C61084JwM jwM, AnonymousClass7FT r5, AnonymousClass7FE r6, C69606Noo noo, C69607Nop nop, C69608Noq noq, C69609Nor nor, Hashtag hashtag, Integer num, Integer num2, String str, String str2, float f, int i) {
        super(r5);
        this.A0D = str;
        this.A00 = f;
        this.A02 = r3;
        this.A07 = nop;
        this.A0A = hashtag;
        this.A06 = noo;
        this.A0B = num;
        this.A09 = nor;
        this.A03 = jwM;
        this.A08 = noq;
        this.A0E = str2;
        this.A01 = i;
        this.A0C = num2;
        this.A05 = r6;
        this.A04 = r5;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
