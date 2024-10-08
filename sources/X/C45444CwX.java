package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.AdditionalCandidatesImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.ImmutablePandoImageInfo;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.SpriteSheetInfoCandidatesImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CwX  reason: case insensitive filesystem */
public class C45444CwX {
    public AdditionalCandidates A00;
    public SpriteSheetInfoCandidates A01;
    public SpriteSheetInfoCandidates A02;
    public List A03;
    public List A04;
    public final ImageInfo A05;

    public final ImageInfo A00() {
        TreeJNI treeJNI;
        AdditionalCandidatesImpl additionalCandidatesImpl;
        SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl;
        TreeUpdaterJNI treeUpdaterJNI;
        TreeUpdaterJNI treeUpdaterJNI2;
        ArrayList arrayList;
        TreeUpdaterJNI treeUpdaterJNI3;
        ImageInfo imageInfo = this.A05;
        if (imageInfo instanceof ImmutablePandoImageInfo) {
            AdditionalCandidates additionalCandidates = this.A00;
            ArrayList arrayList2 = null;
            if (additionalCandidates != null) {
                treeUpdaterJNI = additionalCandidates.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            0eP A1L = AnonymousClass7TE.A1L("additional_candidates", treeUpdaterJNI);
            SpriteSheetInfoCandidates spriteSheetInfoCandidates = this.A01;
            if (spriteSheetInfoCandidates != null) {
                treeUpdaterJNI2 = spriteSheetInfoCandidates.FHC();
            } else {
                treeUpdaterJNI2 = null;
            }
            0eP A1L2 = AnonymousClass7TE.A1L("animated_thumbnail_spritesheet_info_candidates", treeUpdaterJNI2);
            List list = this.A03;
            if (list != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C41847B3o.A1U(arrayList, it);
                }
            } else {
                arrayList = null;
            }
            0eP A1L3 = AnonymousClass7TE.A1L("candidates", arrayList);
            SpriteSheetInfoCandidates spriteSheetInfoCandidates2 = this.A02;
            if (spriteSheetInfoCandidates2 != null) {
                treeUpdaterJNI3 = spriteSheetInfoCandidates2.FHC();
            } else {
                treeUpdaterJNI3 = null;
            }
            0eP A1L4 = AnonymousClass7TE.A1L("scrubber_spritesheet_info_candidates", treeUpdaterJNI3);
            List list2 = this.A04;
            if (list2 != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    C41847B3o.A1U(arrayList2, it2);
                }
            }
            treeJNI = C41847B3o.A0o(imageInfo, new 0eP[]{A1L, A1L2, A1L3, A1L4, AnonymousClass7TE.A1L("spins_underlying_media_candidates", arrayList2)});
        } else {
            AdditionalCandidates additionalCandidates2 = this.A00;
            SpriteSheetInfoCandidatesImpl spriteSheetInfoCandidatesImpl2 = null;
            if (additionalCandidates2 != null) {
                additionalCandidatesImpl = additionalCandidates2.FEZ();
            } else {
                additionalCandidatesImpl = null;
            }
            SpriteSheetInfoCandidates spriteSheetInfoCandidates3 = this.A01;
            if (spriteSheetInfoCandidates3 != null) {
                spriteSheetInfoCandidatesImpl = spriteSheetInfoCandidates3.FEb();
            } else {
                spriteSheetInfoCandidatesImpl = null;
            }
            List list3 = this.A03;
            SpriteSheetInfoCandidates spriteSheetInfoCandidates4 = this.A02;
            if (spriteSheetInfoCandidates4 != null) {
                spriteSheetInfoCandidatesImpl2 = spriteSheetInfoCandidates4.FEb();
            }
            treeJNI = new ImageInfoImpl(additionalCandidatesImpl, spriteSheetInfoCandidatesImpl, spriteSheetInfoCandidatesImpl2, list3, this.A04);
        }
        return (ImageInfo) treeJNI;
    }

    public C45444CwX(ImageInfo imageInfo) {
        this.A05 = imageInfo;
        this.A00 = imageInfo.AZb();
        this.A01 = imageInfo.Abg();
        this.A03 = imageInfo.Al9();
        this.A02 = imageInfo.BqD();
        this.A04 = imageInfo.ByG();
    }
}
