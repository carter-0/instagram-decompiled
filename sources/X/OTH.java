package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Media;
import com.instagram.direct.armadilloexpress.transportpayload.StaticPhoto;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;
import com.instagram.direct.armadilloexpress.transportpayload.Video;
import com.instagram.direct.armadilloexpress.transportpayload.VideoExtraMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OTH {
    public final UserSession A00;
    public final C66638Ma7 A01;
    public final OO1 A02;

    public OTH(UserSession userSession, C66638Ma7 ma7) {
        0qQ.A0B(ma7, 2);
        this.A00 = userSession;
        this.A01 = ma7;
        this.A02 = C70178NyW.A00(userSession);
    }

    public static final Media A00(CommonMediaTransport commonMediaTransport, OTH oth, 1fi r9, AnonymousClass3Q2 r10) {
        String queryParameter;
        List A0x;
        R30 r30;
        OO1 oo1;
        String A06;
        long j;
        CommonMediaTransport A03;
        if (commonMediaTransport == null) {
            oo1 = oth.A02;
            A06 = r9.A06();
            j = 0;
        } else {
            R4O A0I = Media.DEFAULT_INSTANCE.A0I();
            0qQ.A07(A0I);
            if (r10.A12()) {
                String str = r10.A2M;
                if (str == null || (A03 = C66834MdS.A03(str)) == null) {
                    0KC.A0D("ArmadilloExpressPermanentMediaMessageSender", "Video does not have a preview, skip sending");
                    oo1 = oth.A02;
                    A06 = r9.A06();
                    j = 1;
                } else {
                    C68410NFr nFr = (C68410NFr) Thumbnail.DEFAULT_INSTANCE.A0I();
                    nFr.A08(A03);
                    nFr.A07(r10.A0S);
                    nFr.A06(r10.A0R);
                    C68414NFv nFv = (C68414NFv) Video.DEFAULT_INSTANCE.A0I();
                    nFv.A08(commonMediaTransport);
                    nFv.A07(r10.A0S);
                    nFv.A06(r10.A0R);
                    nFv.A09(nFr);
                    if (r10.A1j.A00 > 0.0d) {
                        C68400NFh nFh = (C68400NFh) VideoExtraMetadata.DEFAULT_INSTANCE.A0I();
                        float f = (float) r10.A1j.A00;
                        VideoExtraMetadata videoExtraMetadata = (VideoExtraMetadata) C66580MXl.A0L(nFh);
                        videoExtraMetadata.bitField0_ |= 1;
                        videoExtraMetadata.uploadMosClientScore_ = f;
                        nFv.A0A(nFh);
                    }
                    C66584MXp.A0I(A0I, nFv).mediaCase_ = 3;
                }
            } else {
                C68409NFq nFq = (C68409NFq) StaticPhoto.DEFAULT_INSTANCE.A0I();
                nFq.A08(commonMediaTransport);
                nFq.A07(r10.A0S);
                nFq.A06(r10.A0R);
                String str2 = r10.A2N;
                if (!(str2 == null || (queryParameter = DbT.A09(str2).getQueryParameter("scan_lengths")) == null || (A0x = DbX.A0x(queryParameter)) == null)) {
                    ArrayList A0r = AnonymousClass7TG.A0r(A0x);
                    Iterator it = A0x.iterator();
                    while (it.hasNext()) {
                        try {
                            AnonymousClass7TF.A1M(A0r, Integer.parseInt(AnonymousClass7TE.A18(it)));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    Iterator it2 = A0r.iterator();
                    while (it2.hasNext()) {
                        int A0F = AnonymousClass7TG.A0F(it2);
                        StaticPhoto staticPhoto = (StaticPhoto) C66580MXl.A0L(nFq);
                        C13965TmS tmS = staticPhoto.scanLengths_;
                        if (!((C13255TRv) tmS).A00) {
                            R30 A05 = R5b.A05(tmS);
                            staticPhoto.scanLengths_ = A05;
                            r30 = A05;
                        } else {
                            r30 = tmS;
                        }
                        r30.A8j(A0F);
                    }
                }
                C66584MXp.A0I(A0I, nFq).mediaCase_ = 1;
            }
            return (Media) A0I.A02();
        }
        oo1.A04(C66582MXn.A10(j), 7200, A06);
        return null;
    }
}
