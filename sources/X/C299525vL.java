package X;

import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.VideoVersionIntf;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5vL  reason: invalid class name and case insensitive filesystem */
public final class C299525vL {
    public static final /* synthetic */ C299525vL A00 = new Object();

    public final C299515vK A00(UserSession userSession, 1Xj r30, Double d, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        C274354oA C5R;
        C274334o8 BtE;
        Integer Bj2;
        String B9F;
        String A2i;
        GifUrlImpl A1o;
        Integer A2N;
        int A0y;
        int A0x;
        int i2;
        C274354oA C5R2;
        C274334o8 BtE2;
        Integer Bj22;
        VideoVersionIntf videoVersionIntf;
        1Xj r1 = r30;
        0qQ.A0B(r1, 0);
        String str = null;
        if (!r1.A5A()) {
            UserSession userSession2 = userSession;
            boolean z5 = z3;
            if (r1.A50()) {
                List CEY = r1.A0C.CEY();
                if (CEY == null || (videoVersionIntf = (VideoVersionIntf) 00k.A0J(CEY)) == null || videoVersionIntf.CGY() == null || videoVersionIntf.BCu() == null) {
                    A0y = r1.A0y();
                    A0x = r1.A0x();
                } else {
                    Integer CGY = videoVersionIntf.CGY();
                    if (CGY != null) {
                        A0y = CGY.intValue();
                        Integer BCu = videoVersionIntf.BCu();
                        if (BCu != null) {
                            A0x = BCu.intValue();
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                if (z) {
                    String id = r1.getId();
                    if (id != null) {
                        AnonymousClass3WR CEL = r1.CEL();
                        ImageUrl A1Q = r1.A1Q();
                        String Bbe = r1.A0C.Bbe();
                        User A2A = r1.A2A(userSession2);
                        if (A2A != null) {
                            str = A2A.getUsername();
                        }
                        long A17 = r1.A17();
                        return new AnonymousClass6D2(A1Q, CEL, r1.CBd(), id, Bbe, str, r1.BTL(), A0y, A0x, A17);
                    }
                    throw new IllegalStateException("Required value was null.");
                } else if (z2) {
                    String id2 = r1.getId();
                    if (id2 != null) {
                        String AXm = r1.A0C.AXm();
                        AnonymousClass3WR CEL2 = r1.CEL();
                        ImageUrl A1Q2 = r1.A1Q();
                        String Bbe2 = r1.A0C.Bbe();
                        if (!z4 || (C5R2 = r1.A0C.C5R()) == null || (BtE2 = C5R2.BtE()) == null || (Bj22 = BtE2.Bj2()) == null) {
                            i2 = 0;
                        } else {
                            i2 = Bj22.intValue();
                        }
                        User A2A2 = r1.A2A(userSession2);
                        if (A2A2 != null) {
                            str = A2A2.getUsername();
                        }
                        return new AnonymousClass6D3(A1Q2, CEL2, id2, AXm, Bbe2, str, A0y, A0x, i2, z5);
                    }
                    throw new IllegalStateException("Required value was null.");
                } else {
                    String id3 = r1.getId();
                    if (id3 != null) {
                        String AXm2 = r1.A0C.AXm();
                        AnonymousClass3WR CEL3 = r1.CEL();
                        ImageUrl A1Q3 = r1.A1Q();
                        long A172 = r1.A17();
                        return new AnonymousClass9JJ(A1Q3, CEL3, r1.CBd(), id3, AXm2, r1.BTL(), A0y, A0x, A172);
                    }
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                CommentGiphyMediaInfoIntf B9K = r1.A0C.B9K();
                if (!(B9K == null || (B9F = B9K.B9F()) == null || (A2i = r1.A2i()) == null || (A1o = r1.A1o()) == null || (A2N = r1.A2N()) == null)) {
                    int intValue = A2N.intValue();
                    Integer A2O = r1.A2O();
                    if (A2O != null) {
                        int intValue2 = A2O.intValue();
                        if (intValue > 0 && intValue2 > 0) {
                            String id4 = r1.getId();
                            if (id4 != null) {
                                return new C53489GpL(new SimpleImageUrl(A2i), A1o, id4, r1.A0C.AXm(), B9F, intValue2, intValue);
                            }
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                ExtendedImageUrl A002 = C299535vM.A00(userSession2, r1, d);
                if (A002 != null) {
                    String id5 = r1.getId();
                    if (z) {
                        if (id5 != null) {
                            int A0y2 = r1.A0y();
                            int A0x2 = r1.A0x();
                            String AXm3 = r1.A0C.AXm();
                            String Bbe3 = r1.A0C.Bbe();
                            User A2A3 = r1.A2A(userSession2);
                            if (A2A3 != null) {
                                str = A2A3.getUsername();
                            }
                            long A173 = r1.A17();
                            String BTL = r1.BTL();
                            return new AnonymousClass6D4(A002, r1.A1Q(), r1.CBd(), id5, AXm3, Bbe3, str, BTL, A0y2, A0x2, A173);
                        }
                        throw new IllegalStateException("Required value was null.");
                    } else if (z2) {
                        if (id5 != null) {
                            int A0y3 = r1.A0y();
                            int A0x3 = r1.A0x();
                            String AXm4 = r1.A0C.AXm();
                            String Bbe4 = r1.A0C.Bbe();
                            if (!z4 || (C5R = r1.A0C.C5R()) == null || (BtE = C5R.BtE()) == null || (Bj2 = BtE.Bj2()) == null) {
                                i = 0;
                            } else {
                                i = Bj2.intValue();
                            }
                            User A2A4 = r1.A2A(userSession2);
                            if (A2A4 != null) {
                                str = A2A4.getUsername();
                            }
                            long A174 = r1.A17();
                            String BTL2 = r1.BTL();
                            return new AnonymousClass6D5(A002, r1.A1Q(), r1.CBd(), id5, AXm4, Bbe4, str, BTL2, A0y3, A0x3, i, A174, z5);
                        }
                        throw new IllegalStateException("Required value was null.");
                    } else if (id5 != null) {
                        int A0y4 = r1.A0y();
                        int A0x4 = r1.A0x();
                        String AXm5 = r1.A0C.AXm();
                        long A175 = r1.A17();
                        String BTL3 = r1.BTL();
                        return new AnonymousClass9JJ((ImageUrl) A002, r1.A1Q(), r1.CBd(), id5, AXm5, BTL3, A0y4, A0x4, A175);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            }
        }
        return null;
    }
}
