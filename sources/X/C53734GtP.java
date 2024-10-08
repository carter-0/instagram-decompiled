package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GtP  reason: case insensitive filesystem */
public final class C53734GtP extends C251343mx {
    public final N4R A00;
    public final UserSession A01;
    public final float A02;
    public final AnonymousClass4DU A03;

    public final C251263mp A0X(AnonymousClass3Y5 r38) {
        Number number;
        2WX r0;
        2Wd r10;
        double d;
        2WX A0X;
        AnonymousClass9JR A0c;
        double d2;
        int[] iArr;
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        double d3;
        2Wd r102;
        2Wd r9;
        2Wd r8;
        2Wd r3;
        double d4;
        int i2;
        C61050Jvo jvo;
        AnonymousClass3Y5 r35 = r38;
        0qQ.A0B(r35, 0);
        UserSession userSession = this.A01;
        UserSession userSession2 = userSession;
        0Tu r32 = 0Tu.A05;
        Integer A002 = C54983HaG.A00(DbS.A04(r32, userSession, 36605705616299310L));
        Integer num5 = AnonymousClass05K.A0Y;
        if (A002 != num5 || (jvo = (C61050Jvo) 00k.A0J((List) this.A00.A02)) == null) {
            number = null;
        } else {
            number = (Number) jvo.A03;
        }
        2WX r5 = 2WX.A02;
        float f = this.A02;
        long A06 = C51965G9l.A06(f);
        Integer num6 = AnonymousClass05K.A00;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num6, 0, A06);
        Integer num7 = AnonymousClass05K.A0N;
        2WX A0Y = C51971G9r.A0Y(A003, num7, false, 4);
        Integer num8 = AnonymousClass05K.A0C;
        2WX A0Y2 = C51971G9r.A0Y(A0Y, num8, false, 4);
        if (number != null) {
            r0 = C51971G9r.A0Y((2WX) null, num6, C51965G9l.A0Y(number.intValue()), 4);
        } else {
            r0 = r5;
        }
        2WX A004 = A0Y2.A00(r0);
        2Wb A0Q = C51972G9s.A0Q(r35);
        List list = (List) this.A00.A02;
        Iterator it = list.iterator();
        int i3 = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    C61050Jvo jvo2 = (C61050Jvo) next;
                    Number number2 = (Number) jvo2.A02;
                    Number number3 = (Number) jvo2.A03;
                    if (number2 != null) {
                        switch (C54983HaG.A00(DbS.A04(r32, userSession2, 36605705616299310L)).intValue()) {
                            case 0:
                                iArr = new int[2];
                                i2 = number2.intValue();
                                iArr[0] = i2;
                                break;
                            case 1:
                                iArr = new int[2];
                                iArr[0] = number2.intValue();
                                i = -1;
                                break;
                            case 2:
                            case 4:
                                iArr = new int[2];
                                i2 = number2.intValue();
                                iArr[0] = i2;
                                if (number3 != null) {
                                    i2 = number3.intValue();
                                    break;
                                }
                                break;
                            case 3:
                                iArr = new int[2];
                                i = number2.intValue();
                                iArr[0] = i;
                                if (number3 != null) {
                                    i = number3.intValue();
                                    break;
                                }
                                break;
                            case 5:
                                break;
                            default:
                                throw AnonymousClass7TE.A1K();
                        }
                        i = i2 & 16777215;
                        iArr[1] = i;
                        C59721JVf jVf = new C59721JVf(5, (Object) null, (Object) iArr);
                        if (list.size() == 1) {
                            Context A0O = C51966G9m.A0O(A0Q);
                            int A005 = (int) C61380mr.A00(A0O, f);
                            int A012 = C61380mr.A01(A0O, 460);
                            2WX A0z = G9t.A0z((2WX) null, num5, C244413b9.ABSOLUTE);
                            long A0D = C51969G9p.A0D();
                            A0Q.A00(new C53733GtO(jVf, AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0z, num8, 1, A0D), num7, 1, A0D), A005, A012));
                        } else {
                            Context A0O2 = C51966G9m.A0O(A0Q);
                            int A013 = C61380mr.A01(A0O2, 368);
                            2WX A0Y3 = C51971G9r.A0Y((2WX) null, num5, C244413b9.ABSOLUTE, 3);
                            AnonymousClass2V4 A0d = C51970G9q.A0d(A0Q);
                            int i5 = i3 % 5;
                            2Wd A014 = C56586I2q.A01(i5);
                            if (A014 != null) {
                                num = Integer.valueOf(2Wd.A00(A0d, A014.A00));
                            } else {
                                num = null;
                            }
                            if (i5 == 0 || i5 == 1 || i5 == 2) {
                                num2 = null;
                            } else {
                                if (i5 != 3) {
                                    d4 = 0.0d;
                                } else {
                                    d4 = 40.0d;
                                }
                                num2 = Integer.valueOf(2Wd.A00(A0d, C51965G9l.A0e(Double.doubleToRawLongBits(d4)).A00));
                            }
                            2Wd A022 = C56586I2q.A02(i5);
                            if (A022 != null) {
                                num3 = Integer.valueOf(2Wd.A00(A0d, A022.A00));
                            } else {
                                num3 = null;
                            }
                            2Wd A006 = C56586I2q.A00(i5);
                            if (A006 != null) {
                                num4 = Integer.valueOf(2Wd.A00(A0d, A006.A00));
                            } else {
                                num4 = null;
                            }
                            if (i5 == 0) {
                                d3 = 240.0d;
                            } else if (i5 == 1 || i5 != 2) {
                                d3 = 180.0d;
                            } else {
                                d3 = 140.0d;
                            }
                            int A015 = (C61380mr.A01(A0O2, 368) - 2Wd.A00(A0d, Double.doubleToRawLongBits(d3))) / 2;
                            2WX r2 = r5;
                            if (num != null) {
                                r102 = C51965G9l.A0e(((long) (num.intValue() - A015)) | 9221401712017801216L);
                            } else {
                                r102 = null;
                            }
                            if (num3 != null) {
                                r9 = C51965G9l.A0e(((long) (num3.intValue() - A015)) | 9221401712017801216L);
                            } else {
                                r9 = null;
                            }
                            if (num2 != null) {
                                r8 = C51965G9l.A0e(((long) (num2.intValue() - A015)) | 9221401712017801216L);
                            } else {
                                r8 = null;
                            }
                            if (num4 != null) {
                                r3 = C51965G9l.A0e(9221401712017801216L | ((long) (num4.intValue() - A015)));
                            } else {
                                r3 = null;
                            }
                            if (r102 != null) {
                                r2 = AnonymousClass9JR.A00((2WX) null, num8, 1, r102.A00);
                            }
                            if (r9 != null) {
                                AnonymousClass9JR A0c2 = C51965G9l.A0c(num7, 1, r9.A00);
                                if (r2 == r5) {
                                    r2 = null;
                                }
                                r2 = C51965G9l.A0X(r2, A0c2);
                            }
                            if (r8 != null) {
                                AnonymousClass9JR A0c3 = C51965G9l.A0c(num5, 1, r8.A00);
                                if (r2 == r5) {
                                    r2 = null;
                                }
                                r2 = C51965G9l.A0X(r2, A0c3);
                            }
                            if (r3 != null) {
                                AnonymousClass9JR A0c4 = C51965G9l.A0c(AnonymousClass05K.A0j, 1, r3.A00);
                                if (r2 == r5) {
                                    r2 = null;
                                }
                                r2 = C51965G9l.A0X(r2, A0c4);
                            }
                            long doubleToRawLongBits = Double.doubleToRawLongBits(368.0d);
                            AnonymousClass9JR A0c5 = C51965G9l.A0c(num6, 0, doubleToRawLongBits);
                            if (r2 == r5) {
                                r2 = null;
                            }
                            A0Q.A00(new C53687Gse(jVf, A0Y3.A00(C51972G9s.A0T(C51965G9l.A0X(r2, A0c5), 0, doubleToRawLongBits)), A013));
                        }
                    }
                    i3 = i4;
                }
            } else {
                int i6 = 0;
                for (Object next2 : list) {
                    int i7 = i6 + 1;
                    if (i6 >= 0) {
                        C61050Jvo jvo3 = (C61050Jvo) next2;
                        2WX A0Y4 = C51971G9r.A0Y((2WX) null, num5, C244413b9.ABSOLUTE, 3);
                        if (list.size() == 1) {
                            long A0F = C51970G9q.A0F();
                            2WX A007 = AnonymousClass9JR.A00(AnonymousClass9JR.A00((2WX) null, num8, 1, A0F), num7, 1, A0F);
                            long doubleToRawLongBits2 = Double.doubleToRawLongBits(240.0d);
                            A0X = AnonymousClass9JR.A00(A007, num6, 0, doubleToRawLongBits2);
                            A0c = C51965G9l.A0c(AnonymousClass05K.A01, 0, doubleToRawLongBits2);
                        } else {
                            int i8 = i6 % 5;
                            2WX r4 = r5;
                            2Wd A016 = C56586I2q.A01(i8);
                            if (i8 == 0 || i8 == 1 || i8 == 2) {
                                r10 = null;
                            } else {
                                if (i8 != 3) {
                                    d2 = 0.0d;
                                } else {
                                    d2 = 40.0d;
                                }
                                r10 = C51965G9l.A0e(Double.doubleToRawLongBits(d2));
                            }
                            2Wd A023 = C56586I2q.A02(i8);
                            2Wd A008 = C56586I2q.A00(i8);
                            if (A016 != null) {
                                r4 = AnonymousClass9JR.A00((2WX) null, num8, 1, A016.A00);
                            }
                            if (A023 != null) {
                                AnonymousClass9JR A0c6 = C51965G9l.A0c(num7, 1, A023.A00);
                                if (r4 == r5) {
                                    r4 = null;
                                }
                                r4 = C51965G9l.A0X(r4, A0c6);
                            }
                            if (r10 != null) {
                                AnonymousClass9JR A0c7 = C51965G9l.A0c(num5, 1, r10.A00);
                                if (r4 == r5) {
                                    r4 = null;
                                }
                                r4 = C51965G9l.A0X(r4, A0c7);
                            }
                            if (A008 != null) {
                                AnonymousClass9JR A0c8 = C51965G9l.A0c(AnonymousClass05K.A0j, 1, A008.A00);
                                if (r4 == r5) {
                                    r4 = null;
                                }
                                r4 = C51965G9l.A0X(r4, A0c8);
                            }
                            if (i8 == 0) {
                                d = 240.0d;
                            } else if (i8 == 1 || i8 != 2) {
                                d = 180.0d;
                            } else {
                                d = 140.0d;
                            }
                            long doubleToRawLongBits3 = Double.doubleToRawLongBits(d);
                            AnonymousClass9JR A0c9 = C51965G9l.A0c(num6, 0, doubleToRawLongBits3);
                            if (r4 == r5) {
                                r4 = null;
                            }
                            A0X = C51965G9l.A0X(r4, A0c9);
                            A0c = C51965G9l.A0c(AnonymousClass05K.A01, 0, doubleToRawLongBits3);
                        }
                        2WX A009 = A0Y4.A00(C51965G9l.A0X(A0X, A0c));
                        AnonymousClass9JS A0d2 = C51965G9l.A0d(AnonymousClass05K.A1F, J6S.A00(jvo3, this, 26), 4);
                        if (A009 == r5) {
                            A009 = null;
                        }
                        A0Q.A00(new C53650Gs3(jvo3, C51965G9l.A0X(A009, A0d2)));
                        i6 = i7;
                    }
                }
                return C243563Zg.A04(A0Q, r35, A004);
            }
        }
        0sr.A1T();
        throw AnonymousClass00P.createAndThrow();
    }

    public C53734GtP(N4R n4r, UserSession userSession, AnonymousClass4DU r3, float f) {
        C51972G9s.A1B(userSession, r3);
        this.A01 = userSession;
        this.A00 = n4r;
        this.A02 = f;
        this.A03 = r3;
    }
}
