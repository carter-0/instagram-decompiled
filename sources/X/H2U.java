package X;

import android.content.Context;
import com.instagram.api.schemas.MidCardOverlayType;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.TrackData;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class H2U extends C247303g7 {
    public final H2F A00;
    public final H2G A01;
    public final H2R A02;

    public H2U() {
        this((H29) null, (H2A) null, (H2B) null, (H2F) null, (H2G) null, (H2R) null, (DefaultConstructorMarker) null, 63);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3g7, X.H2R] */
    public /* synthetic */ H2U(H29 h29, H2A h2a, H2B h2b, H2F h2f, H2G h2g, H2R h2r, DefaultConstructorMarker defaultConstructorMarker, int i) {
        ? r2 = new C247303g7();
        H2F h2f2 = new H2F(r2);
        H2G h2g2 = new H2G(r2);
        this.A02 = r2;
        this.A00 = h2f2;
        this.A01 = h2g2;
    }

    public final JNH A05(Context context, MidCardOverlayType midCardOverlayType, 1Xj r12, String str) {
        JNH jnh;
        JND jnd;
        JNA jna;
        JNC gr4;
        JNB jnb;
        C2606046i r1;
        JN8 jn8;
        MusicInfo BUr;
        TrackData BUk;
        if (midCardOverlayType != null) {
            String str2 = str;
            switch (midCardOverlayType.ordinal()) {
                case 1:
                    C67231sQ A0n = C51966G9m.A0n(r12);
                    if (A0n == null || (BUr = A0n.BUr()) == null || (BUk = BUr.BUk()) == null) {
                        jn8 = C57662IeR.A00;
                    } else {
                        jn8 = new C53584Gqz(BUk.getDisplayArtist(), BUk.getTitle());
                    }
                    jnh = new C57678Ieh(jn8);
                    break;
                case 5:
                    if (str != null) {
                        jna = new C53587Gr2(str);
                    } else {
                        jna = C57664IeT.A00;
                    }
                    jnh = new C57680Iej(jna);
                    break;
                case 6:
                    C67231sQ A0n2 = C51966G9m.A0n(r12);
                    if (A0n2 != null) {
                        MusicInfo BUr2 = A0n2.BUr();
                        if (BUr2 != null) {
                            r1 = new C2605946h(BUr2);
                        } else {
                            OriginalSoundDataIntf BZB = A0n2.BZB();
                            if (BZB != null) {
                                r1 = new C282025Bc(BZB);
                            }
                        }
                        jnb = new C53588Gr3(r1.AdY(), r1.ACv(context), r1.AcV(), r1.Cdd());
                        jnh = new C57681Iek(jnb);
                        break;
                    }
                    jnb = C57665IeU.A00;
                    jnh = new C57681Iek(jnb);
                case 7:
                    jnh = new C57682Iel(H2R.A00(r12));
                    break;
                case 8:
                case 10:
                case 11:
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    User A11 = C51966G9m.A11(r12);
                    if (A11 == null) {
                        gr4 = C57666IeV.A00;
                    } else {
                        String username = A11.getUsername();
                        ImageUrl Bh3 = A11.Bh3();
                        boolean isVerified = A11.isVerified();
                        gr4 = new C53589Gr4(Bh3, H2R.A00(r12), r12.A0C.Bd0(), username, r12.A0v(), r12.A11(), r12.A0r(), isVerified);
                    }
                    jnh = new C57684Ien(midCardOverlayType, gr4);
                    break;
                case 9:
                    if (str == null) {
                        0wb.A01(0kg.A06, "MultiMediaVideoCardUseCase", "follower count not provided by server");
                    }
                    User A112 = C51966G9m.A11(r12);
                    if (A112 != null) {
                        String username2 = A112.getUsername();
                        jnd = new C53590Gr5(A112.Bh3(), H2R.A00(r12), username2, str2, A112.isVerified());
                    } else {
                        jnd = C57667IeW.A00;
                    }
                    jnh = new C57683Iem(jnd);
                    break;
            }
        }
        jnh = new C57679Iei(H2R.A00(r12));
        return jnh;
    }
}
