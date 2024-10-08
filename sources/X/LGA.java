package X;

import androidx.paging.PageEvent$Insert;
import androidx.paging.PagingConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class LGA {
    public int A00;
    public int A01;
    public int A02;
    public LGK A03;
    public final PagingConfig A04;
    public final List A05;
    public final List A06;
    public final Map A07 = AnonymousClass7TE.A1H();
    public final C249513ju A08;
    public final C249513ju A09;

    public final PageEvent$Insert A00(C62448Kfy kfy, C60347Jjs jjs) {
        int i;
        int i2;
        int i3;
        LP3 A012;
        C62448Kfy kfy2;
        int i4;
        boolean A1U = AnonymousClass7TF.A1U(0, jjs, kfy);
        int ordinal = kfy.ordinal();
        int i5 = 0;
        if (ordinal != 0) {
            if (ordinal == A1U) {
                i5 = -this.A02;
            } else if (ordinal == 2) {
                i5 = (this.A06.size() - this.A02) - 1;
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        List A1I = AnonymousClass7TE.A1I(new LRX(i5, jjs.A04));
        if (ordinal != 0) {
            PageEvent$Insert pageEvent$Insert = PageEvent$Insert.A06;
            boolean z = this.A04.A03;
            if (ordinal != A1U) {
                if (z) {
                    i4 = this.A00;
                } else {
                    i4 = 0;
                }
                A012 = this.A03.A01();
                0qQ.A0B(A012, 2);
                kfy2 = C62448Kfy.APPEND;
                i3 = -1;
            } else {
                if (z) {
                    i3 = this.A01;
                } else {
                    i3 = 0;
                }
                A012 = this.A03.A01();
                0qQ.A0B(A012, 2);
                kfy2 = C62448Kfy.PREPEND;
                i4 = -1;
            }
            return new PageEvent$Insert(A012, (LP3) null, kfy2, A1I, i3, i4);
        }
        PageEvent$Insert pageEvent$Insert2 = PageEvent$Insert.A06;
        if (this.A04.A03) {
            i = this.A01;
            i2 = this.A00;
        } else {
            i = 0;
            i2 = 0;
        }
        return C62955Kp7.A00(this.A03.A01(), (LP3) null, A1I, i, i2);
    }

    public final boolean A02(C62448Kfy kfy, C60347Jjs jjs, int i) {
        Map map;
        C62448Kfy kfy2;
        int i2;
        int i3;
        int A022 = DbW.A02(1, kfy, jjs);
        int ordinal = kfy.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == A022) {
                    if (AnonymousClass7TE.A1b(this.A06)) {
                        if (i == 0) {
                            this.A05.add(jjs);
                            int i4 = jjs.A00;
                            if (i4 == Integer.MIN_VALUE) {
                                if (this.A04.A03) {
                                    i3 = this.A00;
                                } else {
                                    i3 = 0;
                                }
                                i4 = i3 - jjs.A04.size();
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                            }
                            if (i4 == Integer.MIN_VALUE) {
                                i4 = 0;
                            }
                            this.A00 = i4;
                            map = this.A07;
                            kfy2 = C62448Kfy.APPEND;
                        }
                        return false;
                    }
                    throw AnonymousClass7TE.A0z("should've received an init before append");
                }
                return true;
            } else if (AnonymousClass7TE.A1b(this.A06)) {
                if (i == 0) {
                    this.A05.add(0, jjs);
                    this.A02++;
                    int i5 = jjs.A01;
                    if (i5 == Integer.MIN_VALUE) {
                        if (this.A04.A03) {
                            i2 = this.A01;
                        } else {
                            i2 = 0;
                        }
                        i5 = i2 - jjs.A04.size();
                        if (i5 < 0) {
                            i5 = 0;
                        }
                    }
                    if (i5 == Integer.MIN_VALUE) {
                        i5 = 0;
                    }
                    this.A01 = i5;
                    map = this.A07;
                    kfy2 = C62448Kfy.PREPEND;
                }
                return false;
            } else {
                throw AnonymousClass7TE.A0z("should've received an init before prepend");
            }
            map.remove(kfy2);
            return true;
        } else if (!this.A06.isEmpty()) {
            throw AnonymousClass7TE.A0z("cannot receive multiple init calls");
        } else if (i == 0) {
            this.A05.add(jjs);
            this.A02 = 0;
            int i6 = jjs.A00;
            if (i6 == Integer.MIN_VALUE) {
                i6 = 0;
            }
            this.A00 = i6;
            int i7 = jjs.A01;
            if (i7 == Integer.MIN_VALUE) {
                i7 = 0;
            }
            this.A01 = i7;
            return true;
        } else {
            throw AnonymousClass7TE.A0z("init loadId must be the initial value, 0");
        }
    }

    public final C63967LFt A01(C60351Jjz jjz) {
        Integer num;
        int i;
        int i2;
        int size;
        List list = this.A06;
        List A0a = 00k.A0a(list);
        if (jjz != null) {
            PagingConfig pagingConfig = this.A04;
            if (pagingConfig.A03) {
                i2 = this.A01;
            } else {
                i2 = 0;
            }
            int i3 = -this.A02;
            int A0A = C51970G9q.A0A(list) - this.A02;
            int i4 = jjz.A01;
            for (int i5 = i3; i5 < i4; i5++) {
                if (i5 > A0A) {
                    size = pagingConfig.A01;
                } else {
                    size = ((C60347Jjs) list.get(this.A02 + i5)).A04.size();
                }
                i2 += size;
            }
            int i6 = i2 + jjz.A00;
            if (i4 < i3) {
                i6 -= pagingConfig.A01;
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        PagingConfig pagingConfig2 = this.A04;
        if (pagingConfig2.A03) {
            i = this.A01;
        } else {
            i = 0;
        }
        return new C63967LFt(pagingConfig2, num, A0a, i);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.3Eu, X.3ju] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.3Eu, X.3ju] */
    public LGA(PagingConfig pagingConfig) {
        this.A04 = pagingConfig;
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A05 = A1C;
        this.A06 = A1C;
        Integer num = AnonymousClass05K.A01;
        this.A09 = new AnonymousClass3Eu(1, num);
        this.A08 = new AnonymousClass3Eu(1, num);
        LGK lgk = new LGK();
        lgk.A02(C60334Jjd.A00, C62448Kfy.REFRESH);
        this.A03 = lgk;
    }
}
