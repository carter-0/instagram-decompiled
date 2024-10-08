package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.2we  reason: invalid class name and case insensitive filesystem */
public final class C233892we extends C249383je {
    public final /* synthetic */ AnonymousClass2rI A00;
    public final /* synthetic */ C228472lj A01;
    public final /* synthetic */ boolean A02;

    public C233892we(AnonymousClass2rI r1, C228472lj r2, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = z;
    }

    public final void onScroll(C238133Ar r6, int i, int i2, int i3, int i4, int i5) {
        C233002un r2;
        int A03 = AnonymousClass0fD.A03(1029662683);
        if (i2 > 0) {
            C228472lj r4 = this.A01;
            C233812wV r22 = r4.A0C;
            if (r22 != null) {
                r22.A0C(this.A00.A01((i + i2) - 1));
            }
            if (this.A02 && (r2 = r4.A0A) != null) {
                int A012 = this.A00.A01((i + i2) - 1);
                int i6 = r2.A00;
                if (A012 < i6) {
                    A012 = i6;
                }
                r2.A00 = A012;
            }
        }
        AnonymousClass0fD.A0A(716917729, A03);
    }

    public final void onScrollStateChanged(C238133Ar r15, int i) {
        C233002un r2;
        Integer num;
        C233052us r6;
        int i2;
        int intValue;
        int A03 = AnonymousClass0fD.A03(-780793465);
        if (this.A02 && (r2 = this.A01.A0A) != null && r2.A0L == (num = AnonymousClass05K.A00)) {
            r2.A02 = i;
            if (r2.A0E && i == 0) {
                C54077Gz1 gz1 = r2.A08;
                if (gz1 != null) {
                    UserSession userSession = r2.A0I;
                    AnonymousClass2rI r7 = r2.A07;
                    int i3 = r2.A03;
                    1Xj r1 = r2.A04;
                    String str = "seedMedia";
                    Long l = null;
                    if (r1 != null) {
                        C55644Hl3 A002 = C55044HbF.A00(r1, r7, i3, r2.A00);
                        if (A002.A01 || r2.A06 == AnonymousClass3DY.END_OF_FEED) {
                            C233082uv r5 = r2.A0J;
                            if (!r5.A00(gz1).isEmpty()) {
                                AnonymousClass3W1 r12 = r2.A05;
                                if (r12 == null) {
                                    str = "seedMediaMediaState";
                                } else {
                                    r12.A2O = true;
                                    if (C55043HbE.A00(userSession, gz1)) {
                                        r6 = C233052us.FEED_POST_AD_CLICK_SINGLE_AD;
                                    } else {
                                        r6 = C233052us.FEED_POST_AD_CLICK_MULTI_ADS;
                                    }
                                    Map map = r2.A0D;
                                    Number number = (Number) map.get(r6);
                                    if (number != null) {
                                        i2 = number.intValue();
                                    } else {
                                        i2 = 0;
                                    }
                                    map.put(r6, Integer.valueOf(i2 + 1));
                                    C230282pK r8 = r2.A0K;
                                    int i4 = r2.A03;
                                    if (gz1.A02() == AnonymousClass05K.A01) {
                                        intValue = r2.A01;
                                    } else {
                                        Integer num2 = gz1.A01().A0G;
                                        if (num2 != null) {
                                            intValue = num2.intValue();
                                        }
                                        r8.A0H(gz1, (Integer) r2.A0D.get(r6), l, "cached_iaa", i4);
                                    }
                                    l = Long.valueOf((long) intValue);
                                    r8.A0H(gz1, (Integer) r2.A0D.get(r6), l, "cached_iaa", i4);
                                }
                            }
                            C233072uu r13 = r2.A0A;
                            if (r13 != null) {
                                r13.Dlz(num, r5.A00(gz1));
                            }
                        } else {
                            C230282pK r62 = r2.A0K;
                            1Xj r52 = r2.A04;
                            if (r52 != null) {
                                r62.A09(r52, (C54077Gz1) null, Integer.valueOf(r2.A03), 002.A0R("redelivery: ", A002.A00));
                            }
                        }
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                r2.A0E = false;
                r2.A08 = null;
            }
        }
        AnonymousClass0fD.A0A(375167658, A03);
    }
}
