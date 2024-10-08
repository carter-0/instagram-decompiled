package X;

import com.instagram.android.R;
import com.instagram.wonderwall.model.WallImage;
import com.instagram.wonderwall.model.WallInfo;
import com.instagram.wonderwall.model.WallMenuConfig;
import com.instagram.wonderwall.model.WallPostInfo;
import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.model.WallText;
import com.instagram.wonderwall.repository.WallPostRepository;
import java.util.List;

/* renamed from: X.Hdx  reason: case insensitive filesystem */
public abstract class C55207Hdx {
    public static final WallMenuConfig A00(WallInfo wallInfo, WallPostInfo wallPostInfo, WallPostItem wallPostItem, WallPostRepository wallPostRepository, C59623JQr jQr, C262224Cq r30) {
        HMM hmm;
        HMM hmm2;
        WallPostInfo wallPostInfo2 = wallPostInfo;
        WallPostRepository wallPostRepository2 = wallPostRepository;
        AnonymousClass7TF.A1D(wallPostRepository2, 2, wallPostInfo2);
        WallMenuConfig wallMenuConfig = new WallMenuConfig();
        WallPostItem wallPostItem2 = wallPostItem;
        WallPostInfo BeB = wallPostItem2.BeB();
        int i = 2131976767;
        if (BeB.A09) {
            i = 2131976769;
        }
        WallText.Res A0b = G9w.A0b(i);
        boolean z = wallPostInfo2.A09;
        int i2 = R.drawable.instagram_pin_pano_outline_24;
        if (z) {
            i2 = R.drawable.instagram_unpin_pano_outline_24;
        }
        C55818Hny hny = new C55818Hny(new WallImage.Drawable(i2), A0b, C58687Ivw.A00(wallPostItem2, wallPostRepository2, 6), false, false);
        WallInfo wallInfo2 = wallInfo;
        boolean z2 = wallInfo2.A03;
        if (!z2 || wallPostInfo2.A01()) {
            hny = null;
        }
        C59623JQr jQr2 = jQr;
        C262224Cq r4 = r30;
        C55818Hny hny2 = new C55818Hny(new WallImage.Drawable(R.drawable.instagram_delete_pano_outline_24), G9w.A0b(2131976765), C58699Iw8.A00(r4, jQr2, wallPostRepository2, wallPostItem2, 27), true, false);
        boolean z3 = wallPostInfo2.A0B;
        if (!z3 || wallPostInfo2.A01()) {
            hny2 = null;
        }
        C55818Hny hny3 = new C55818Hny(new WallImage.Drawable(R.drawable.instagram_arrow_cw_pano_outline_24), G9w.A0b(2131972371), new C20704Wxb(48, wallPostRepository2, wallPostItem2, wallInfo2), false, false);
        boolean z4 = BeB.A0B;
        if (!z4 || wallPostInfo2.A00 >= 2 || !((hmm2 = wallPostInfo2.A05) == HMM.UPLOAD_FAILED || hmm2 == HMM.PUBLISH_FAILED_CAN_RETRY)) {
            hny3 = null;
        }
        C55818Hny hny4 = new C55818Hny(new WallImage.Drawable(R.drawable.instagram_delete_pano_outline_24), G9w.A0b(2131960790), new C20704Wxb(49, wallPostRepository2, wallPostItem2, r4), true, false);
        if (!z4 || !((hmm = wallPostInfo2.A05) == HMM.UPLOAD_FAILED || hmm == HMM.PUBLISH_FAILED_CAN_RETRY || hmm == HMM.PUBLISH_FAILED)) {
            hny4 = null;
        }
        C55818Hny hny5 = new C55818Hny(new WallImage.Drawable(R.drawable.instagram_eye_off_pano_outline_24), G9w.A0b(2131976766), C58697Iw6.A00(r4, wallPostItem2, wallPostRepository2, 0), false, false);
        if (!z2 || z3) {
            hny5 = null;
        }
        C55818Hny hny6 = new C55818Hny(new WallImage.Drawable(R.drawable.instagram_block_pano_outline_24), new WallText.Res(2131976764, new String[]{wallPostInfo2.A03.getUsername()}), new C20704Wxb(46, jQr2, r4, wallPostInfo2), true, false);
        if (!z2 || z3) {
            hny6 = null;
        }
        C55818Hny hny7 = new C55818Hny(new WallImage.Drawable(R.drawable.instagram_report_pano_outline_24), G9w.A0b(2131976768), new C20704Wxb(47, jQr2, wallPostItem2, r4), true, false);
        if (!z2 || z3) {
            hny7 = null;
        }
        List A0s = C51967G9n.A0s(new C55818Hny[]{hny, hny2, hny3, hny4, hny5, hny6, hny7});
        List list = wallMenuConfig.A01;
        list.addAll(A0s);
        if (!AnonymousClass7TE.A1b(list)) {
            return null;
        }
        return wallMenuConfig;
    }
}
