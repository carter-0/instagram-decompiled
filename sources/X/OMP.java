package X;

import android.content.Context;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.VideoUrlImpl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class OMP {
    public final Context A00;
    public final UserSession A01;

    public final N54 A00(1Xj r20) {
        float A0l;
        N2c n2c;
        ArrayList A1C;
        C61037Jvb jvb;
        Integer num;
        Integer num2;
        String A05;
        String A06;
        List<1Xj> Alu;
        1Xj r2 = r20;
        0qQ.A0B(r2, 0);
        String id = r2.getId();
        if (id != null) {
            ImageUrl A1Q = r2.A1Q();
            if (A1Q != null) {
                String A0o = JTP.A0o(A1Q);
                if (!r2.CeS()) {
                    n2c = null;
                } else {
                    String A03 = r2.CEL().A03();
                    C66720MbR mbR = null;
                    if (r2.CeS()) {
                        VideoUrlImpl videoUrlImpl = r2.CEL().A08;
                        if (videoUrlImpl != null) {
                            String str = videoUrlImpl.A06;
                            0qQ.A07(str);
                            mbR = new C66720MbR(Integer.valueOf(videoUrlImpl.A01), str, videoUrlImpl.A00, videoUrlImpl.A02);
                        }
                    } else {
                        ExtendedImageUrl A1n = r2.A1n(this.A00);
                        if (A1n != null) {
                            mbR = new C66720MbR(A1n.A0A, A1n.getHeight(), A1n.getWidth());
                        }
                    }
                    long A1B = r2.A1B();
                    C246623eu A1S = r2.A1S();
                    if (A1S != null) {
                        A0l = ((float) A1S.A01) / ((float) A1S.A00);
                    } else {
                        A0l = r2.A0l();
                    }
                    n2c = new N2c(mbR, A03, A0l, A1B);
                }
                ExtendedImageUrl A1n2 = r2.A1n(this.A00);
                if (A1n2 != null) {
                    A1C = 0sr.A1L(new C66720MbR[]{new C66720MbR(A1n2.A0A, A1n2.getHeight(), A1n2.getWidth())});
                } else {
                    A1C = AnonymousClass7TE.A1C();
                }
                User A2A = r2.A2A(this.A01);
                if (A2A != null) {
                    String id2 = A2A.getId();
                    String username = A2A.getUsername();
                    String A0p = DbU.A0p(A2A);
                    0qQ.A07(A0p);
                    jvb = new C61037Jvb(id2, username, A0p, 0);
                } else {
                    jvb = null;
                }
                if (r2.A5p()) {
                    num = AnonymousClass05K.A00;
                } else if (r2.CeS()) {
                    num = AnonymousClass05K.A01;
                } else if (r2.A5D()) {
                    num = AnonymousClass05K.A0N;
                } else if (r2.A5Y()) {
                    num = AnonymousClass05K.A0C;
                } else {
                    num = AnonymousClass05K.A0Y;
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                if (r2.A5D() && (Alu = r2.A0C.Alu()) != null) {
                    for (1Xj A002 : Alu) {
                        A1C2.add(A00(A002));
                    }
                }
                C67231sQ clipsMetadata = r2.A0C.getClipsMetadata();
                N49 n49 = null;
                if (!(clipsMetadata == null || C291335gz.A05(clipsMetadata).length() == 0)) {
                    if (C291335gz.A00(clipsMetadata) == OriginalAudioSubtype.A06) {
                        ArrayList A07 = C291335gz.A07(clipsMetadata);
                        A05 = C291335gz.A05(clipsMetadata);
                        A06 = 002.A0R("Mix: ", DbT.A0z(" | ", A07, C66329MNm.A00));
                    } else {
                        A05 = C291335gz.A05(clipsMetadata);
                        A06 = C291335gz.A06(clipsMetadata);
                    }
                    n49 = new N49(A05, A06, 2);
                }
                String C9L = r2.C9L();
                if (C9L == null) {
                    C9L = "";
                }
                ProductType A1v = r2.A1v();
                if (A1v != null) {
                    int ordinal = A1v.ordinal();
                    if (ordinal == 13) {
                        num2 = AnonymousClass05K.A01;
                    } else if (ordinal == 1) {
                        num2 = AnonymousClass05K.A00;
                    }
                    r2.A0C.getTitle();
                    r2.A1T();
                    return new N54(n49, jvb, n2c, num, num2, id, A0o, C9L, A1C, A1C2);
                }
                num2 = AnonymousClass05K.A0C;
                r2.A0C.getTitle();
                r2.A1T();
                return new N54(n49, jvb, n2c, num, num2, id, A0o, C9L, A1C, A1C2);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final N51 A01(Integer num, String str) {
        Context context = this.A00;
        return new N51(num, str, AnonymousClass7TE.A16(context, 2131965979), AnonymousClass7TE.A16(context, 2131965978));
    }

    public OMP(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
