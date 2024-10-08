package X;

import android.view.View;
import com.instagram.archive.fragment.SelectHighlightsCoverFragment;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager;
import com.instagram.direct.fragment.writewithai.RewriteTextBubbleViewPager;

/* renamed from: X.Oz7  reason: case insensitive filesystem */
public final class C72239Oz7 implements C252293os {
    public final int A00;
    public final Object A01;

    public C72239Oz7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final /* synthetic */ boolean CsC() {
        return false;
    }

    public final void DVx(int i, int i2) {
        0sP r1;
        C52088GEi gEi;
        switch (this.A00) {
            case 0:
                if (i2 == 0 && i == 1) {
                    ((SelectHighlightsCoverFragment) this.A01).mViewPager.A0Q = 1;
                    return;
                }
                return;
            case 4:
                r1 = ((C53955Gwz) this.A01).A03;
                break;
            case 5:
                C67337MmD mmD = (C67337MmD) this.A01;
                if (mmD.A03) {
                    2cs r12 = mmD.A07;
                    if (r12.A0C() && r12.A01 == 1.0d && (gEi = (C52088GEi) 00k.A0O(((C67342MmI) mmD.A0E.getValue()).A01, i)) != null) {
                        AnonymousClass2S0.A01.A04();
                        mmD.A0A.Dnu(gEi, mmD, i);
                        mmD.A09.A00(gEi.A01, (long) i);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                r1 = ((C53976GxK) this.A01).A04;
                break;
            case 7:
                r1 = ((C53988GxW) this.A01).A0D;
                break;
            default:
                return;
        }
        r1.invoke(Integer.valueOf(i));
    }

    public final void DW9(int i, int i2, boolean z) {
        switch (this.A00) {
            case 2:
                C15330Uaf.A00((C15330Uaf) this.A01);
                return;
            case 4:
                ((C53955Gwz) this.A01).A04.invoke(Integer.valueOf(i2), Integer.valueOf(i));
                return;
            default:
                return;
        }
    }

    public final void DhS(AnonymousClass3TF r7, AnonymousClass3TF r8) {
        if (1 - this.A00 == 0) {
            0qQ.A0B(r7, 0);
            if (r7 == AnonymousClass3TF.IDLE) {
                GalleryPreviewMultiselectPager galleryPreviewMultiselectPager = (GalleryPreviewMultiselectPager) this.A01;
                int currentDataIndex = galleryPreviewMultiselectPager.getCurrentDataIndex();
                Integer valueOf = Integer.valueOf(currentDataIndex);
                if (currentDataIndex >= 0) {
                    KI8 ki8 = galleryPreviewMultiselectPager.A03;
                    if (currentDataIndex < ki8.getCount() && valueOf != null) {
                        GalleryPreviewMultiselectPager.A03(galleryPreviewMultiselectPager, currentDataIndex);
                        GalleryItem galleryItem = ((C60974JuW) ki8.A03.get(currentDataIndex)).A0B;
                        MQD mqd = galleryPreviewMultiselectPager.A00;
                        if (mqd != null) {
                            0qQ.A0B(galleryItem, 0);
                            JW7 jw7 = ((C64978LlH) mqd).A00;
                            JW7.A0B(galleryItem, jw7, false, true, false);
                            jw7.A14.A0F.Ejh(galleryItem, true, true);
                        }
                    }
                }
            }
        }
    }

    public final void Dpz(int i, int i2) {
        if (3 - this.A00 == 0) {
            RewriteTextBubbleViewPager rewriteTextBubbleViewPager = (RewriteTextBubbleViewPager) this.A01;
            NR2 nr2 = rewriteTextBubbleViewPager.A03;
            if (i2 >= 0 && i2 < nr2.getCount()) {
                nr2.A00(i2, i);
                rewriteTextBubbleViewPager.A00 = i2;
                C74241PrU prU = rewriteTextBubbleViewPager.A01;
                if (prU != null) {
                    String str = ((C68172N3n) nr2.A03.get(i2)).A02;
                    0qQ.A0B(str, 0);
                    IgEditText igEditText = ((P36) prU).A00.A03;
                    if (igEditText != null) {
                        igEditText.setText(DbS.A0C(str));
                    }
                }
            }
        }
    }

    public final /* synthetic */ void Dwb(int i, float f) {
        if (2 - this.A00 == 0) {
            ((C15330Uaf) this.A01).A05 = false;
        }
    }

    public final void DzE(View view) {
    }

    public final void DhK(AnonymousClass3TF r1, float f, float f2) {
    }
}
